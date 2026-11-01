package p067l;

/* JADX INFO: renamed from: l.ۢ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 59V3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11684 extends AbstractC14345 {

    /* JADX INFO: renamed from: ֡֫ */
    public int f32588;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f32589;

    /* JADX INFO: renamed from: ᩵֫ */
    public byte[] f32590;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        return 0;
    }

    public C11684(int i, InterfaceC3341 interfaceC3341, byte[] bArr) {
        super(interfaceC3341);
        this.f32590 = bArr;
        this.f32588 = i;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final int m26855() {
        return this.f32589;
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) throws C19258 {
        int iM7363 = C3775.m7363(i, bArr);
        if (iM7363 == 9) {
            return m12495(i, bArr);
        }
        if (iM7363 != 17) {
            throw new C19258("Expected structureSize = 17");
        }
        short s = bArr[i + 2];
        this.f32589 = C3775.m7365(i + 4, bArr);
        C3775.m7365(i + 8, bArr);
        int i2 = i + 16;
        int iM12492 = m12492() + s;
        int i3 = this.f32589;
        int i4 = this.f32588;
        int i5 = i3 + i4;
        byte[] bArr2 = this.f32590;
        if (i5 > bArr2.length) {
            throw new C19258("Buffer to small for read response");
        }
        System.arraycopy(bArr, iM12492, bArr2, i4, i3);
        return Math.max(i2, iM12492 + this.f32589) - i;
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean mo12494() {
        return m12485() != -2147483643 && super.mo12494();
    }
}
