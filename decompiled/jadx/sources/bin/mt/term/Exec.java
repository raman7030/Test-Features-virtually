package bin.mt.term;

/* JADX INFO: loaded from: classes.dex */
public class Exec {
    public static native void close(int i);

    public static native int createSubprocess(String str, String str2, String[] strArr, String[] strArr2, int[] iArr);

    public static native void killAll(int i);

    public static native void setPtyWindowSize(int i, int i2, int i3);

    public static native int waitFor(int i);

    static {
        System.loadLibrary("term");
    }
}
