package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ܺۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15915 {
    GZIP("GZIP", new C18033()),
    XZ("XZ", new C17327()),
    BZIP2("BZIP2", new C14504()),
    ZSTD("ZSTD", new C23677()),
    LZ4("LZ4", new C6744()),
    ZLIB("ZLIB", new C20856());


    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int f49161 = 65536;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC9567 f49164;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f49165;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m37678() {
        return new byte[4096];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37676(AbstractC15440 abstractC15440) {
        try {
            InputStream inputStreamMo27926 = abstractC15440.mo27926();
            try {
                byte[] bArrM37678 = m37678();
                byte[] bArr = C22194.f71991;
                int iM49844 = C22194.m49844(inputStreamMo27926, bArrM37678, bArrM37678.length);
                for (EnumC15915 enumC15915 : values()) {
                    if (enumC15915.m37682(bArrM37678, iM49844)) {
                        if (inputStreamMo27926 != null) {
                            inputStreamMo27926.close();
                        }
                        return true;
                    }
                }
                if (inputStreamMo27926 != null) {
                    inputStreamMo27926.close();
                    return false;
                }
            } catch (Throwable th) {
                if (inputStreamMo27926 != null) {
                    try {
                        inputStreamMo27926.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
        }
        return false;
    }

    EnumC15915(String str, InterfaceC9567 interfaceC9567) {
        this.f49165 = str;
        this.f49164 = interfaceC9567;
    }

    public String getName() {
        return this.f49165;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m37682(byte[] bArr, int i) {
        return this.f49164.mo18360(bArr, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long m37679(InterfaceC7889 interfaceC7889) {
        return this.f49164.mo18357(interfaceC7889);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InputStream m37680(InputStream inputStream) {
        return this.f49164.mo18358(inputStream);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InputStream m37683(InputStream inputStream) {
        if (this == BZIP2) {
            return new C10978(inputStream);
        }
        if (this == GZIP) {
            return new C2511(inputStream);
        }
        if (this == ZLIB) {
            return new C3922(inputStream, new Inflater(), 65536);
        }
        return m37680(inputStream);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public OutputStream m37681(OutputStream outputStream, int i, long j) {
        return this.f49164.mo18359(outputStream, i, j);
    }
}
