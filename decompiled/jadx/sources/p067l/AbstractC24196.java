package p067l;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩺ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66M9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24196 {
    /* JADX INFO: renamed from: ֫ */
    public boolean mo8376() {
        return true;
    }

    /* JADX INFO: renamed from: ۖ */
    public boolean mo8377() {
        return this instanceof C15794;
    }

    /* JADX INFO: renamed from: ۘ */
    public boolean mo8378() {
        return this instanceof C24512;
    }

    /* JADX INFO: renamed from: ۜ */
    public File mo19605() {
        return null;
    }

    /* JADX INFO: renamed from: ܳ */
    public boolean m53501() {
        return this instanceof C6149;
    }

    /* JADX INFO: renamed from: ᩳ */
    public abstract String mo8379();

    /* JADX INFO: renamed from: ᩴ */
    public abstract InputStream mo8380();

    /* JADX INFO: renamed from: ᩵ */
    public abstract C13468 mo8381();

    /* JADX INFO: renamed from: ᩻ */
    public abstract String mo8382();

    static {
        new WeakHashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo8375(OutputStream outputStream, boolean z, InterfaceC18588 interfaceC18588) throws IOException {
        InputStream inputStreamMo8380 = mo8380();
        try {
            if (inputStreamMo8380 == null) {
                throw new IOException("Image source returned no stream");
            }
            byte[] bArr = new byte[32768];
            while (true) {
                m53499(interfaceC18588);
                int i = inputStreamMo8380.read(bArr);
                m53499(interfaceC18588);
                if (i < 0) {
                    inputStreamMo8380.close();
                    return;
                } else if (i > 0) {
                    outputStream.write(bArr, 0, i);
                }
            }
        } catch (Throwable th) {
            if (inputStreamMo8380 != null) {
                try {
                    inputStreamMo8380.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53499(InterfaceC18588 interfaceC18588) {
        if (interfaceC18588.mo3924()) {
            throw new InterruptedIOException("Image source request canceled");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public File mo13948() {
        return mo19605();
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC24196 m53498(ActivityC17586 activityC17586, AbstractC15599 abstractC15599, InterfaceC19370 interfaceC19370) {
        AbstractC24196 abstractC24196M44419 = C19560.m44419(activityC17586, abstractC15599, interfaceC19370);
        return C8597.m20012(interfaceC19370) ? new C6149(abstractC24196M44419, abstractC15599, interfaceC19370) : abstractC24196M44419;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53500(C13468 c13468) {
        try {
            if (!c13468.equals(mo8381())) {
                throw new C8103("Image source version changed");
            }
        } catch (IOException e) {
            throw new C8103("Image source is no longer available", e);
        }
    }
}
