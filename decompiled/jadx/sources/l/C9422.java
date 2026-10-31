package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۢۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8IZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9422 extends AbstractC4930 {

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC20711 f28581;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C21843 f28582;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C17714 f28583;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public long f28584;

    @Override // l.InterfaceC1837, l.InterfaceC18065
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6101() {
        return true;
    }

    public C9422() {
        super(6);
        this.f28582 = new C21843(1, 0);
        this.f28583 = new C17714();
    }

    @Override // l.InterfaceC18065
    /* JADX INFO: renamed from: ֫ */
    public final int mo16568(C8353 c8353) {
        return "application/x-camera-motion".equals(c8353.f25614) ? C11010.m27348(4, 0, 0, 0) : C11010.m27348(0, 0, 0, 0);
    }

    @Override // l.AbstractC4930, l.InterfaceC5783
    /* JADX INFO: renamed from: ֫ */
    public final void mo13450(int i, Object obj) {
        if (i == 8) {
            this.f28581 = (InterfaceC20711) obj;
        }
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo13451(long j, boolean z) {
        this.f28584 = Long.MIN_VALUE;
        InterfaceC20711 interfaceC20711 = this.f28581;
        if (interfaceC20711 != null) {
            interfaceC20711.mo24150();
        }
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public final void mo6088(long j, long j2) {
        float[] fArr;
        while (!mo6104() && this.f28584 < 100000 + j) {
            C21843 c21843 = this.f28582;
            c21843.mo7();
            if (m14355(m14370(), c21843, 0) != -4 || c21843.m12697()) {
                return;
            }
            long j3 = c21843.f69997;
            this.f28584 = j3;
            boolean z = j3 < m14371();
            if (this.f28581 != null && !z) {
                c21843.m49229();
                ByteBuffer byteBuffer = c21843.f69995;
                String str = C3603.f11424;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C17714 c17714 = this.f28583;
                    c17714.m41462(iLimit, bArrArray);
                    c17714.m41484(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(c17714.m41490());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f28581.mo24149(this.f28584 - m14360(), fArr);
                }
            }
        }
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ۤ */
    public final void mo13464() {
        InterfaceC20711 interfaceC20711 = this.f28581;
        if (interfaceC20711 != null) {
            interfaceC20711.mo24150();
        }
    }
}
