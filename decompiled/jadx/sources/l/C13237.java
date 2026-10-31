package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes4.dex */
public final class C13237 implements InterfaceC22410 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11164 f39626;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f39627;

    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long mo32107(int i, int i2) {
        return mo32100();
    }

    public C13237(AbstractC11164 abstractC11164, byte[] bArr) {
        if (abstractC11164.mo21898() != bArr.length || bArr.length == 0) {
            throw new IllegalArgumentException("Invalid literal patch layer");
        }
        this.f39626 = abstractC11164;
        this.f39627 = bArr;
    }

    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo32102(final int i, final byte[] bArr, int i2, final int i3) {
        this.f39626.mo21891(i, i2, new InterfaceC21705() { // from class: l.ۗܽܳ
            @Override // l.InterfaceC21705
            /* JADX INFO: renamed from: ֫ */
            public final void mo4084(int i4, int i5) {
                C13237.m32099(this.f10630, bArr, i3, i, i4, i5);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32099(C13237 c13237, byte[] bArr, int i, int i2, int i3, int i4) {
        bArr[(i + i4) - i2] = c13237.f39627[i3];
    }

    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo32104(final byte[] bArr, final int i, int i2, final long[] jArr) {
        this.f39626.mo21891(i, i2, new InterfaceC21705() { // from class: l.᩶ܽܳ
            @Override // l.InterfaceC21705
            /* JADX INFO: renamed from: ֫ */
            public final void mo4084(int i3, int i4) {
                C13237.m32098(this.f65547, i, bArr, jArr, i3, i4);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32098(C13237 c13237, int i, byte[] bArr, long[] jArr, int i2, int i3) {
        int i4 = i3 - i;
        bArr[i4] = c13237.f39627[i2];
        int i5 = i4 >>> 6;
        jArr[i5] = jArr[i5] | (1 << (i4 & 63));
    }

    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo32101(final int i, int i2, final long[] jArr) {
        this.f39626.mo21891(i, i2, new InterfaceC21705() { // from class: l.ۙܽܳ
            @Override // l.InterfaceC21705
            /* JADX INFO: renamed from: ֫ */
            public final void mo4084(int i3, int i4) {
                int i5 = i4 - i;
                int i6 = i5 >>> 6;
                long[] jArr2 = jArr;
                jArr2[i6] = jArr2[i6] | (1 << (i5 & 63));
            }
        });
    }

    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo32105(int i, int i2) {
        return this.f39626.mo21889(i, i2) != 0;
    }

    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long mo32108() {
        return this.f39626.mo21897() + ((long) this.f39627.length);
    }

    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo32100() {
        return (((long) this.f39626.mo21898()) * 9) + 128;
    }

    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo32106(InterfaceC22410 interfaceC22410) {
        return (interfaceC22410 instanceof C13237) && this.f39626.mo21895(((C13237) interfaceC22410).f39626);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32103(DataOutputStream dataOutputStream, int i, int i2) throws IOException {
        AbstractC11164 abstractC11164 = this.f39626;
        dataOutputStream.writeInt(abstractC11164.mo21889(i, i2));
        for (int i3 = 0; i3 < abstractC11164.mo21898(); i3++) {
            int iMo21899 = abstractC11164.mo21899(i3);
            if (iMo21899 >= i && iMo21899 < i2) {
                dataOutputStream.writeInt(iMo21899 - i);
                dataOutputStream.writeByte(this.f39627[i3]);
            }
        }
    }
}
