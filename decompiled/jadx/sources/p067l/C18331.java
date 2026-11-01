package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܽᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18331 implements InterfaceC7603 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ OutputStream f54741;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C16989 f54742;

    public C18331(C16989 c16989, OutputStream outputStream) {
        this.f54742 = c16989;
        this.f54741 = outputStream;
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ֫ */
    public final void mo10979(C14268 c14268, long j) throws IOException {
        C23026.m51409(c14268.f40649, 0L, j);
        while (j > 0) {
            this.f54742.mo22309();
            C20344 c20344 = c14268.f40648;
            int iMin = (int) Math.min(j, c20344.f62828 - c20344.f62831);
            this.f54741.write(c20344.f62827, c20344.f62831, iMin);
            int i = c20344.f62831 + iMin;
            c20344.f62831 = i;
            long j2 = iMin;
            j -= j2;
            c14268.f40649 -= j2;
            if (i == c20344.f62828) {
                c14268.f40648 = c20344.m45922();
                C21015.m47360(c20344);
            }
        }
    }

    @Override // p067l.InterfaceC7603, java.io.Flushable
    public final void flush() throws IOException {
        this.f54741.flush();
    }

    @Override // p067l.InterfaceC7603, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f54741.close();
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo10980() {
        return this.f54742;
    }

    public final String toString() {
        return "sink(" + this.f54741 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
