package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.֡۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F4CH */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0275 implements Closeable {
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract C13864 mo1613();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract long mo1615();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC6171 mo1616();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m1611() {
        return mo1616().mo12307();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m1614() throws IOException {
        long jMo1615 = mo1615();
        if (jMo1615 > 2147483647L) {
            throw new IOException(C16014.m37865(jMo1615, "Cannot buffer entire body for content length: "));
        }
        InterfaceC6171 interfaceC6171Mo1616 = mo1616();
        try {
            byte[] bArrMo12306 = interfaceC6171Mo1616.mo12306();
            C20032.m46179(interfaceC6171Mo1616);
            if (jMo1615 == -1 || jMo1615 == bArrMo12306.length) {
                return bArrMo12306;
            }
            throw new IOException(C3200.m9831(bArrMo12306.length, ") disagree", C12803.m31106("Content-Length (", ") and stream length (", jMo1615)));
        } catch (Throwable th) {
            C20032.m46179(interfaceC6171Mo1616);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m1612() {
        InterfaceC6171 interfaceC6171Mo1616 = mo1616();
        try {
            C13864 c13864Mo1613 = mo1613();
            return interfaceC6171Mo1616.mo12304(C20032.m46174(interfaceC6171Mo1616, c13864Mo1613 != null ? c13864Mo1613.m33219(C20032.f64897) : C20032.f64897));
        } finally {
            C20032.m46179(interfaceC6171Mo1616);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C20032.m46179(mo1616());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static AbstractC0275 m1610() {
        Charset charset = C20032.f64897;
        C12521 c12521 = new C12521();
        c12521.m30708("", 0, 0, charset);
        return new C19327(null, c12521.size(), c12521);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC0275 m1609(C13864 c13864, long j, C12521 c12521) {
        return new C19327(c13864, j, c12521);
    }
}
