package org.lovr.oculusmobile;

public class MainActivity extends android.app.NativeActivity {
	static {
		System.loadLibrary("vrapi");
		System.loadLibrary("lovr");
	}
}