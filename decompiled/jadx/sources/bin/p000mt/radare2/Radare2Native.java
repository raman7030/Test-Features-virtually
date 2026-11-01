package bin.p000mt.radare2;

/* JADX INFO: loaded from: classes.dex */
public final class Radare2Native {
    public static native String nativeAnalyzeFunctionCfg(String str, long j, boolean z, String str2, int i, int i2, int i3, int i4);

    public static native String nativeAssemble(String str, int i, long j, String str2);

    public static native void nativeCloseElfSearchSession(long j);

    public static native String nativeDisassemble(String str, int i, long j, byte[] bArr, int i2);

    public static native String nativeFindXrefs(String str, String str2, int i, String str3, long j, boolean z, int i2, int i3, long j2, int i4, int i5, int i6, int i7);

    public static native String nativeInspectElfFile(String str);

    public static native String nativeInspectElfSummary(String str);

    public static native String nativeMapAddress(String str, long j, boolean z, boolean z2);

    public static native long nativeOpenElfSearchSession(String str, boolean z);

    public static native String nativeReadElfItems(String str, String str2, String str3, boolean z, int i, int i2, int i3);

    public static native String nativeReadElfSearchSessionItems(long j, String str, String str2, boolean z, int i, int i2, int i3);

    public static native String nativeReadElfSearchSessionStrings(long j, int i, int i2, int i3, long j2);

    public static native String nativeReadElfStrings(String str, int i, int i2, int i3);

    public static native String nativeVersion();
}
