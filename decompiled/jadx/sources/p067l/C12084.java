package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۤۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38MG */
/* JADX INFO: loaded from: classes4.dex */
public final class C12084 extends AbstractC3089 {

    /* JADX INFO: renamed from: ۖ */
    public int f33673;

    /* JADX INFO: renamed from: ۘ */
    public int f33674;

    /* JADX INFO: renamed from: ۡ */
    public int f33675;

    /* JADX INFO: renamed from: ۢ */
    public int f33676;

    /* JADX INFO: renamed from: ܺ */
    public boolean f33677;

    /* JADX INFO: renamed from: ᩴ */
    public long f33678;

    /* JADX INFO: renamed from: ᩷ */
    public byte[] f33679 = C5792.f14227;

    /* JADX INFO: renamed from: ֫ */
    public final void m27690(int i, int i2) {
        this.f33674 = i;
        this.f33673 = i2;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m27691() {
        this.f33678 = 0L;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final long m27692() {
        return this.f33678;
    }

    @Override // p067l.AbstractC3089
    /* JADX INFO: renamed from: ۧ */
    public final C19854 mo5232(C19854 c19854) throws C20525 {
        if (!C5792.m13010(c19854.f60353)) {
            throw new C20525(c19854);
        }
        this.f33677 = true;
        return (this.f33674 == 0 && this.f33673 == 0) ? C19854.f60350 : c19854;
    }

    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ֫ */
    public final void mo3357(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f33675);
        this.f33678 += (long) (iMin / this.f5590.f60351);
        this.f33675 -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f33675 > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f33676 + i2) - this.f33679.length;
        ByteBuffer byteBufferM5229 = m5229(length);
        int iM12976 = C5792.m12976(length, 0, this.f33676);
        byteBufferM5229.put(this.f33679, 0, iM12976);
        int iM12977 = C5792.m12976(length - iM12976, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM12977);
        byteBufferM5229.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM12977;
        int i4 = this.f33676 - iM12976;
        this.f33676 = i4;
        byte[] bArr = this.f33679;
        System.arraycopy(bArr, iM12976, bArr, 0, i4);
        byteBuffer.get(this.f33679, this.f33676, i3);
        this.f33676 += i3;
        byteBufferM5229.flip();
    }

    @Override // p067l.AbstractC3089, p067l.InterfaceC2418
    /* JADX INFO: renamed from: ᩳ */
    public final ByteBuffer mo3361() {
        int i;
        if (super.mo3358() && (i = this.f33676) > 0) {
            m5229(i).put(this.f33679, 0, this.f33676).flip();
            this.f33676 = 0;
        }
        return super.mo3361();
    }

    @Override // p067l.AbstractC3089, p067l.InterfaceC2418
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo3358() {
        return super.mo3358() && this.f33676 == 0;
    }

    @Override // p067l.AbstractC3089
    /* JADX INFO: renamed from: ᩻ */
    public final void mo5234() {
        if (this.f33677) {
            int i = this.f33676;
            if (i > 0) {
                this.f33678 += (long) (i / this.f5590.f60351);
            }
            this.f33676 = 0;
        }
    }

    @Override // p067l.AbstractC3089
    /* JADX INFO: renamed from: ܳ */
    public final void mo5233() {
        if (this.f33677) {
            this.f33677 = false;
            int i = this.f33673;
            int i2 = this.f5590.f60351;
            this.f33679 = new byte[i * i2];
            this.f33675 = this.f33674 * i2;
        }
        this.f33676 = 0;
    }

    @Override // p067l.AbstractC3089
    /* JADX INFO: renamed from: ۜ */
    public final void mo5231() {
        this.f33679 = C5792.f14227;
    }
}
