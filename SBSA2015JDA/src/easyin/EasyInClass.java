<<<<<<< HEAD
package easyin;

// Simple input from the keyboard for all primitive types.
// Copyright (c) Peter van der Linden,  May 5 1997.
// Feel free to use this in your programs, as long as this
// comment stays intact.
//
// This is not thread safe, not high performance, and doesn't tell EOF.
// It's intended for low-volume easy keyboard input.
// An example of use is:
//     EasyIn easy = new EasyIn();
//     int i = easy.readInt();   // reads an int from System.in

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EasyInClass
{
	static InputStreamReader is = new InputStreamReader(System.in);
	static BufferedReader br = new BufferedReader(is);
	StringTokenizer st;

	// Constructor
	/*
	 * public EasyIn() { st = null; }
	 */

	StringTokenizer getToken() throws IOException
	{
		String s = br.readLine();
		return new StringTokenizer(s);
	}

	public boolean readBoolean()
	{
		try
		{
			st = getToken();
			return new Boolean(st.nextToken()).booleanValue();
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readBoolean");
			return false;
		}
	}

	public byte readByte()
	{
		try
		{
			st = getToken();
			return Byte.parseByte(st.nextToken());
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readByte");
			return 0;
		}
	}

	public short readShort()
	{
		try
		{
			st = getToken();
			return Short.parseShort(st.nextToken());
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readShort");
			return 0;
		}
	}

	public int readInt()
	{
		try
		{
			st = getToken();
			return Integer.parseInt(st.nextToken());
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readInt");
			return 0;
		}
	}

	public long readLong()
	{
		try
		{
			st = getToken();
			return Long.parseLong(st.nextToken());
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readFloat");
			return 0L;
		}
	}

	public float readFloat()
	{
		try
		{
			st = getToken();
			return new Float(st.nextToken()).floatValue();
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readFloat");
			return 0.0F;
		}
	}

	public double readDouble()
	{
		try
		{
			st = getToken();
			return new Double(st.nextToken()).doubleValue();
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readDouble");
			return 0.0;
		}
	}

	public char readChar()
	{
		try
		{
			String s = br.readLine();
			return s.charAt(0);
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readChar");
			return 0;
		}
	}

	public String readString()
	{
		try
		{
			return br.readLine();
		} catch (IOException ioe)
		{
			System.err.println("IO Exception in EasyIn.readString");
			return "";
		}
	}
=======
package easyin;

// Simple input from the keyboard for all primitive types.
// Copyright (c) Peter van der Linden,  May 5 1997.
// Feel free to use this in your programs, as long as this
// comment stays intact.
//
// This is not thread safe, not high performance, and doesn't tell EOF.
// It's intended for low-volume easy keyboard input.
// An example of use is:
//     EasyIn easy = new EasyIn();
//     int i = easy.readInt();   // reads an int from System.in

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EasyInClass
{
	static InputStreamReader is = new InputStreamReader(System.in);
	static BufferedReader br = new BufferedReader(is);
	StringTokenizer st;

	// Constructor
	/*
	 * public EasyIn() { st = null; }
	 */

	StringTokenizer getToken() throws IOException
	{
		String s = br.readLine();
		return new StringTokenizer(s);
	}

	public boolean readBoolean()
	{
		try
		{
			st = getToken();
			return new Boolean(st.nextToken()).booleanValue();
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readBoolean");
			return false;
		}
	}

	public byte readByte()
	{
		try
		{
			st = getToken();
			return Byte.parseByte(st.nextToken());
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readByte");
			return 0;
		}
	}

	public short readShort()
	{
		try
		{
			st = getToken();
			return Short.parseShort(st.nextToken());
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readShort");
			return 0;
		}
	}

	public int readInt()
	{
		try
		{
			st = getToken();
			return Integer.parseInt(st.nextToken());
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readInt");
			return 0;
		}
	}

	public long readLong()
	{
		try
		{
			st = getToken();
			return Long.parseLong(st.nextToken());
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readFloat");
			return 0L;
		}
	}

	public float readFloat()
	{
		try
		{
			st = getToken();
			return new Float(st.nextToken()).floatValue();
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readFloat");
			return 0.0F;
		}
	}

	public double readDouble()
	{
		try
		{
			st = getToken();
			return new Double(st.nextToken()).doubleValue();
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readDouble");
			return 0.0;
		}
	}

	public char readChar()
	{
		try
		{
			String s = br.readLine();
			return s.charAt(0);
		} catch (IOException ioe)
		{
			System.err.println("IOException in EasyIn.readChar");
			return 0;
		}
	}

	public String readString()
	{
		try
		{
			return br.readLine();
		} catch (IOException ioe)
		{
			System.err.println("IO Exception in EasyIn.readString");
			return "";
		}
	}
>>>>>>> a0d16c50b58db7fd4c91f21d228ec42f4562aaec
}