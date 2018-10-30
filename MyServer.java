import java.io.DataInputStream;  
import java.io.DataOutputStream;  
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.net.ServerSocket;  
import java.net.Socket;

public class MyServer {
	int back = 0;
	public void main()
	{
		MyServer myServer = new MyServer();
		myServer.setPort(8002);
	}

	public void setPort(int port)
	{
		try
		{
			ServerSocket server = new ServerSocket(port);
			System.out.println("成功创建服务器，端口：" + port);

			while(true)
			{
				Socket client = server.accept();
				System.out.println("连接客户端：" + client.getRemoteSocketAddress());

				inChatting(client);

				if (back == 1)
				{
					server.close();
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public void inChatting(Socket client)
	{
		try
		{
			System.out.println("Begin")；

			InputStream ins = client.getInputStream();
			DataInputStream dins = new DataInputStream(ins);

			while (true)
			{
				int length = dins.readInt();
				System.out.println("消息长度：" + length);
				byte type = dis.readByte();
				
				if (type == 1)
				{	
					byte[] data = new byte[length-4-1-4];
					dins.readFully(data);
					String msg = new String(data);
					System.out.println("文本：" + msg);
				}
				else if (type == 2)
				{
					int size = dins.readInt();
					byte[] data = new byte[size];
					dins.readFully(data);
					String fileName = new String(data).trim();
					System.out.println("文件名：" + fileName);

					data = new byte[length-4-1-4-size];
					dins.readFully(data);

					FileOutputStream fous = new FileOutputStream(fileName);
					fous.write(data);
					fous.flush();
					fous.close();
					System.out.println("文件保存完成！");
				}
				else
				{
					System.out.println("收到未知数据包："+ type);  
                        client.close();  
                        back = 1;
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

