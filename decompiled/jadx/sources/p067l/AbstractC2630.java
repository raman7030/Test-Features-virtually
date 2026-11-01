package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.֡۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F4CH */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2630 implements Closeable {
    /* JADX INFO: renamed from: ܳ */
    public abstract C15545 mo4013();

    /* JADX INFO: renamed from: ᩳ */
    public abstract long mo4015();

    /* JADX INFO: renamed from: ᩻ */
    public abstract InterfaceC8233 mo4016();

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m4011() {
        return mo4016().mo14212();
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m4014() throws IOException {
        long jMo4015 = mo4015();
        if (jMo4015 > 2147483647L) {
            throw new IOException(C17588.m40051(jMo4015, "Cannot buffer entire body for content length: "));
        }
        InterfaceC8233 interfaceC8233Mo4016 = mo4016();
        try {
            byte[] bArrMo14211 = interfaceC8233Mo4016.mo14211();
            C21407.m48495(interfaceC8233Mo4016);
            if (jMo4015 == -1 || jMo4015 == bArrMo14211.length) {
                return bArrMo14211;
            }
            throw new IOException(C5410.m11876(bArrMo14211.length, ") disagree", C14536.m33191("Content-Length (", ") and stream length (", jMo4015)));
        } catch (Throwable th) {
            C21407.m48495(interfaceC8233Mo4016);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m4012() {
        InterfaceC8233 interfaceC8233Mo4016 = mo4016();
        try {
            C15545 c15545Mo4013 = mo4013();
            return interfaceC8233Mo4016.mo14209(C21407.m48490(interfaceC8233Mo4016, c15545Mo4013 != null ? c15545Mo4013.m35338(C21407.f67539) : C21407.f67539));
        } finally {
            C21407.m48495(interfaceC8233Mo4016);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C21407.m48495(mo4016());
    }

    /* JADX INFO: renamed from: ۖ */
    public static AbstractC2630 m4010() {
        Charset charset = C21407.f67539;
        C14268 c14268 = new C14268();
        c14268.m32782("", 0, 0, charset);
        return new C20737(null, c14268.size(), c14268);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC2630 m4009(C15545 c15545, long j, C14268 c14268) {
        return new C20737(c15545, j, c14268);
    }
}
