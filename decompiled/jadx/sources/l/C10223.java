package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۤۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38MG */
/* JADX INFO: loaded from: classes4.dex */
public final class C10223 extends AbstractC0759 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f30712;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f30713;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f30714;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f30715;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f30716;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f30717;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f30718 = C3603.f11423;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25668(int i, int i2) {
        this.f30713 = i;
        this.f30712 = i2;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m25669() {
        this.f30717 = 0L;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m25670() {
        return this.f30717;
    }

    @Override // l.AbstractC0759
    /* JADX INFO: renamed from: ۧ */
    public final C18399 mo2903(C18399 c18399) throws C19105 {
        if (!C3603.m11034(c18399.f57133)) {
            throw new C19105(c18399);
        }
        this.f30716 = true;
        return (this.f30713 == 0 && this.f30712 == 0) ? C18399.f57130 : c18399;
    }

    @Override // l.InterfaceC0053
    /* JADX INFO: renamed from: ֫ */
    public final void mo962(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f30714);
        this.f30717 += (long) (iMin / this.f2818.f57131);
        this.f30714 -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f30714 > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f30715 + i2) - this.f30718.length;
        ByteBuffer byteBufferM2900 = m2900(length);
        int iM11000 = C3603.m11000(length, 0, this.f30715);
        byteBufferM2900.put(this.f30718, 0, iM11000);
        int iM11001 = C3603.m11000(length - iM11000, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM11001);
        byteBufferM2900.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM11001;
        int i4 = this.f30715 - iM11000;
        this.f30715 = i4;
        byte[] bArr = this.f30718;
        System.arraycopy(bArr, iM11000, bArr, 0, i4);
        byteBuffer.get(this.f30718, this.f30715, i3);
        this.f30715 += i3;
        byteBufferM2900.flip();
    }

    @Override // l.AbstractC0759, l.InterfaceC0053
    /* JADX INFO: renamed from: ᩳ */
    public final ByteBuffer mo966() {
        int i;
        if (super.mo963() && (i = this.f30715) > 0) {
            m2900(i).put(this.f30718, 0, this.f30715).flip();
            this.f30715 = 0;
        }
        return super.mo966();
    }

    @Override // l.AbstractC0759, l.InterfaceC0053
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo963() {
        return super.mo963() && this.f30715 == 0;
    }

    @Override // l.AbstractC0759
    /* JADX INFO: renamed from: ᩻ */
    public final void mo2905() {
        if (this.f30716) {
            int i = this.f30715;
            if (i > 0) {
                this.f30717 += (long) (i / this.f2818.f57131);
            }
            this.f30715 = 0;
        }
    }

    @Override // l.AbstractC0759
    /* JADX INFO: renamed from: ܳ */
    public final void mo2904() {
        if (this.f30716) {
            this.f30716 = false;
            int i = this.f30712;
            int i2 = this.f2818.f57131;
            this.f30718 = new byte[i * i2];
            this.f30714 = this.f30713 * i2;
        }
        this.f30715 = 0;
    }

    @Override // l.AbstractC0759
    /* JADX INFO: renamed from: ۜ */
    public final void mo2902() {
        this.f30718 = C3603.f11423;
    }
}
