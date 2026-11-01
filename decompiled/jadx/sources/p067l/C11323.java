package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۢۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8IZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11323 extends AbstractC7054 {

    /* JADX INFO: renamed from: ۜ֫ */
    public InterfaceC22052 f31528;

    /* JADX INFO: renamed from: ܳ֫ */
    public final C23128 f31529;

    /* JADX INFO: renamed from: ᩷֫ */
    public final C19203 f31530;

    /* JADX INFO: renamed from: ᩻֫ */
    public long f31531;

    @Override // p067l.InterfaceC4114, p067l.InterfaceC19537
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8299() {
        return true;
    }

    public C11323() {
        super(6);
        this.f31529 = new C23128(1, 0);
        this.f31530 = new C19203();
    }

    @Override // p067l.InterfaceC19537
    /* JADX INFO: renamed from: ֫ */
    public final int mo18494(C10307 c10307) {
        return "application/x-camera-motion".equals(c10307.f28528) ? C12832.m29410(4, 0, 0, 0) : C12832.m29410(0, 0, 0, 0);
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC7864
    /* JADX INFO: renamed from: ֫ */
    public final void mo15338(int i, Object obj) {
        if (i == 8) {
            this.f31528 = (InterfaceC22052) obj;
        }
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo15339(long j, boolean z) {
        this.f31531 = Long.MIN_VALUE;
        InterfaceC22052 interfaceC22052 = this.f31528;
        if (interfaceC22052 != null) {
            interfaceC22052.mo26160();
        }
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public final void mo8286(long j, long j2) {
        float[] fArr;
        while (!mo8302() && this.f31531 < 100000 + j) {
            C23128 c23128 = this.f31529;
            c23128.mo7();
            if (m16252(m16267(), c23128, 0) != -4 || c23128.m14573()) {
                return;
            }
            long j3 = c23128.f72706;
            this.f31531 = j3;
            boolean z = j3 < m16268();
            if (this.f31528 != null && !z) {
                c23128.m51580();
                ByteBuffer byteBuffer = c23128.f72704;
                String str = C5792.f14228;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C19203 c19203 = this.f31530;
                    c19203.m43708(iLimit, bArrArray);
                    c19203.m43730(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(c19203.m43736());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f31528.mo26159(this.f31531 - m16257(), fArr);
                }
            }
        }
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ۤ */
    public final void mo15352() {
        InterfaceC22052 interfaceC22052 = this.f31528;
        if (interfaceC22052 != null) {
            interfaceC22052.mo26160();
        }
    }
}
