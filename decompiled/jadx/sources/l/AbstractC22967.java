package l;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩺ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66M9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22967 {
    /* JADX INFO: renamed from: ֫ */
    public boolean mo6174() {
        return true;
    }

    /* JADX INFO: renamed from: ۖ */
    public boolean mo6175() {
        return this instanceof C14126;
    }

    /* JADX INFO: renamed from: ۘ */
    public boolean mo6176() {
        return this instanceof C23299;
    }

    /* JADX INFO: renamed from: ۜ */
    public File mo17660() {
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean m51109() {
        return this instanceof C3978;
    }

    /* JADX INFO: renamed from: ᩳ */
    public abstract String mo6177();

    /* JADX INFO: renamed from: ᩴ */
    public abstract InputStream mo6178();

    /* JADX INFO: renamed from: ᩵ */
    public abstract C11679 mo6179();

    /* JADX INFO: renamed from: ᩻ */
    public abstract String mo6180();

    static {
        new WeakHashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo6173(OutputStream outputStream, boolean z, InterfaceC17066 interfaceC17066) throws IOException {
        InputStream inputStreamMo6178 = mo6178();
        try {
            if (inputStreamMo6178 == null) {
                throw new IOException("Image source returned no stream");
            }
            byte[] bArr = new byte[32768];
            while (true) {
                m51107(interfaceC17066);
                int i = inputStreamMo6178.read(bArr);
                m51107(interfaceC17066);
                if (i < 0) {
                    inputStreamMo6178.close();
                    return;
                } else if (i > 0) {
                    outputStream.write(bArr, 0, i);
                }
            }
        } catch (Throwable th) {
            if (inputStreamMo6178 != null) {
                try {
                    inputStreamMo6178.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51107(InterfaceC17066 interfaceC17066) {
        if (interfaceC17066.mo1526()) {
            throw new InterruptedIOException("Image source request canceled");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public File mo12024() {
        return mo17660();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC22967 m51106(ActivityC16012 activityC16012, AbstractC13921 abstractC13921, InterfaceC17889 interfaceC17889) {
        AbstractC22967 abstractC22967M42160 = C18089.m42160(activityC16012, abstractC13921, interfaceC17889);
        return C6554.m18062(interfaceC17889) ? new C3978(abstractC22967M42160, abstractC13921, interfaceC17889) : abstractC22967M42160;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51108(C11679 c11679) {
        try {
            if (!c11679.equals(mo6179())) {
                throw new C6034("Image source version changed");
            }
        } catch (IOException e) {
            throw new C6034("Image source is no longer available", e);
        }
    }
}
