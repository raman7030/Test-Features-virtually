package p067l;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩶ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6XC */
/* JADX INFO: loaded from: classes5.dex */
public final class C21456 implements InterfaceC20509 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C6703 f67664;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C22601 f67665;

    public C21456(C22601 c22601, C6703 c6703) {
        this.f67665 = c22601;
        this.f67664 = c6703;
    }

    @Override // p067l.InterfaceC20509
    /* JADX INFO: renamed from: ֫ */
    public final long mo46273(OutputStream outputStream) {
        C6703 c6703 = this.f67664;
        C5362 c5362 = new C5362((FilterOutputStream) outputStream);
        try {
            long jM50650 = this.f67665.m50650(c5362);
            if (jM50650 != c5362.f12644) {
                throw C14079.m31938("Local source byte count does not match bytes written.");
            }
            C6703.m15303(c6703, c5362);
            return jM50650;
        } catch (Throwable th) {
            C6703.m15303(c6703, c5362);
            throw th;
        }
    }

    @Override // p067l.InterfaceC20509
    /* JADX INFO: renamed from: ֫ */
    public final void mo46274(long j) {
        this.f67665.m50651(j);
    }
}
