package p067l;

import android.media.MediaFormat;

/* JADX INFO: renamed from: l.ۢۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8TF */
/* JADX INFO: loaded from: classes3.dex */
public final class C11256 implements InterfaceC23865, InterfaceC22052, InterfaceC7864 {

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC23865 f31347;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC23865 f31348;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC22052 f31349;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC22052 f31350;

    @Override // p067l.InterfaceC7864
    /* JADX INFO: renamed from: ֫ */
    public final void mo15338(int i, Object obj) {
        if (i == 7) {
            this.f31347 = (InterfaceC23865) obj;
            return;
        }
        if (i == 8) {
            this.f31349 = (InterfaceC22052) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        C21381 c21381 = (C21381) obj;
        if (c21381 == null) {
            this.f31348 = null;
            this.f31350 = null;
        } else {
            this.f31348 = c21381.m48457();
            this.f31350 = c21381.m48455();
        }
    }

    @Override // p067l.InterfaceC23865
    /* JADX INFO: renamed from: ֫ */
    public final void mo26158(long j, long j2, C10307 c10307, MediaFormat mediaFormat) {
        InterfaceC23865 interfaceC23865 = this.f31348;
        if (interfaceC23865 != null) {
            interfaceC23865.mo26158(j, j2, c10307, mediaFormat);
        }
        InterfaceC23865 interfaceC23866 = this.f31347;
        if (interfaceC23866 != null) {
            interfaceC23866.mo26158(j, j2, c10307, mediaFormat);
        }
    }

    @Override // p067l.InterfaceC22052
    /* JADX INFO: renamed from: ֫ */
    public final void mo26159(long j, float[] fArr) {
        InterfaceC22052 interfaceC22052 = this.f31350;
        if (interfaceC22052 != null) {
            interfaceC22052.mo26159(j, fArr);
        }
        InterfaceC22052 interfaceC22053 = this.f31349;
        if (interfaceC22053 != null) {
            interfaceC22053.mo26159(j, fArr);
        }
    }

    @Override // p067l.InterfaceC22052
    /* JADX INFO: renamed from: ܽ */
    public final void mo26160() {
        InterfaceC22052 interfaceC22052 = this.f31350;
        if (interfaceC22052 != null) {
            interfaceC22052.mo26160();
        }
        InterfaceC22052 interfaceC22053 = this.f31349;
        if (interfaceC22053 != null) {
            interfaceC22053.mo26160();
        }
    }
}
