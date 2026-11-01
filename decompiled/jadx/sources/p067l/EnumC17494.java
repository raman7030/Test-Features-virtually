package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ܺۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC17494 {
    GZIP("GZIP", new C19507()),
    XZ("XZ", new C18836()),
    BZIP2("BZIP2", new C16153()),
    ZSTD("ZSTD", new C24871()),
    LZ4("LZ4", new C8778()),
    ZLIB("ZLIB", new C22190());


    /* JADX INFO: renamed from: ۫ */
    public static final int f52307 = 65536;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC11461 f52310;

    /* JADX INFO: renamed from: ᩹ */
    public final String f52311;

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m39852() {
        return new byte[4096];
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m39850(AbstractC17043 abstractC17043) {
        try {
            InputStream inputStreamMo29987 = abstractC17043.mo29987();
            try {
                byte[] bArrM39852 = m39852();
                byte[] bArr = C23461.f74712;
                int iM52171 = C23461.m52171(inputStreamMo29987, bArrM39852, bArrM39852.length);
                for (EnumC17494 enumC17494 : values()) {
                    if (enumC17494.m39856(bArrM39852, iM52171)) {
                        if (inputStreamMo29987 != null) {
                            inputStreamMo29987.close();
                        }
                        return true;
                    }
                }
                if (inputStreamMo29987 != null) {
                    inputStreamMo29987.close();
                    return false;
                }
            } catch (Throwable th) {
                if (inputStreamMo29987 != null) {
                    try {
                        inputStreamMo29987.close();
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

    EnumC17494(String str, InterfaceC11461 interfaceC11461) {
        this.f52311 = str;
        this.f52310 = interfaceC11461;
    }

    public String getName() {
        return this.f52311;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m39856(byte[] bArr, int i) {
        return this.f52310.mo20308(bArr, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public long m39853(InterfaceC9866 interfaceC9866) {
        return this.f52310.mo20305(interfaceC9866);
    }

    /* JADX INFO: renamed from: ֫ */
    public InputStream m39854(InputStream inputStream) {
        return this.f52310.mo20306(inputStream);
    }

    /* JADX INFO: renamed from: ۧ */
    public InputStream m39857(InputStream inputStream) {
        if (this == BZIP2) {
            return new C12802(inputStream);
        }
        if (this == GZIP) {
            return new C4755(inputStream);
        }
        if (this == ZLIB) {
            return new C6096(inputStream, new Inflater(), 65536);
        }
        return m39854(inputStream);
    }

    /* JADX INFO: renamed from: ֫ */
    public OutputStream m39855(OutputStream outputStream, int i, long j) {
        return this.f52310.mo20307(outputStream, i, j);
    }
}
