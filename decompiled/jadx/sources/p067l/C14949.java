package p067l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes4.dex */
public final class C14949 implements InterfaceC23667 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12979 f42690;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f42691;

    @Override // p067l.InterfaceC23667
    /* JADX INFO: renamed from: ۧ */
    public final long mo34205(int i, int i2) {
        return mo34198();
    }

    public C14949(AbstractC12979 abstractC12979, byte[] bArr) {
        if (abstractC12979.mo23868() != bArr.length || bArr.length == 0) {
            throw new IllegalArgumentException("Invalid literal patch layer");
        }
        this.f42690 = abstractC12979;
        this.f42691 = bArr;
    }

    @Override // p067l.InterfaceC23667
    /* JADX INFO: renamed from: ֫ */
    public final void mo34200(final int i, final byte[] bArr, int i2, final int i3) {
        this.f42690.mo23861(i, i2, new InterfaceC22997() { // from class: l.ۗܽܳ
            @Override // p067l.InterfaceC22997
            /* JADX INFO: renamed from: ֫ */
            public final void mo6328(int i4, int i5) {
                C14949.m34197(this.f13438, bArr, i3, i, i4, i5);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m34197(C14949 c14949, byte[] bArr, int i, int i2, int i3, int i4) {
        bArr[(i + i4) - i2] = c14949.f42691[i3];
    }

    @Override // p067l.InterfaceC23667
    /* JADX INFO: renamed from: ֫ */
    public final void mo34202(final byte[] bArr, final int i, int i2, final long[] jArr) {
        this.f42690.mo23861(i, i2, new InterfaceC22997() { // from class: l.᩶ܽܳ
            @Override // p067l.InterfaceC22997
            /* JADX INFO: renamed from: ֫ */
            public final void mo6328(int i3, int i4) {
                C14949.m34196(this.f68222, i, bArr, jArr, i3, i4);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m34196(C14949 c14949, int i, byte[] bArr, long[] jArr, int i2, int i3) {
        int i4 = i3 - i;
        bArr[i4] = c14949.f42691[i2];
        int i5 = i4 >>> 6;
        jArr[i5] = jArr[i5] | (1 << (i4 & 63));
    }

    @Override // p067l.InterfaceC23667
    /* JADX INFO: renamed from: ֫ */
    public final void mo34199(final int i, int i2, final long[] jArr) {
        this.f42690.mo23861(i, i2, new InterfaceC22997() { // from class: l.ۙܽܳ
            @Override // p067l.InterfaceC22997
            /* JADX INFO: renamed from: ֫ */
            public final void mo6328(int i3, int i4) {
                int i5 = i4 - i;
                int i6 = i5 >>> 6;
                long[] jArr2 = jArr;
                jArr2[i6] = jArr2[i6] | (1 << (i5 & 63));
            }
        });
    }

    @Override // p067l.InterfaceC23667
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo34203(int i, int i2) {
        return this.f42690.mo23859(i, i2) != 0;
    }

    @Override // p067l.InterfaceC23667
    /* JADX INFO: renamed from: ܿ */
    public final long mo34206() {
        return this.f42690.mo23867() + ((long) this.f42691.length);
    }

    @Override // p067l.InterfaceC23667
    /* JADX INFO: renamed from: ֫ */
    public final long mo34198() {
        return (((long) this.f42690.mo23868()) * 9) + 128;
    }

    @Override // p067l.InterfaceC23667
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo34204(InterfaceC23667 interfaceC23667) {
        return (interfaceC23667 instanceof C14949) && this.f42690.mo23865(((C14949) interfaceC23667).f42690);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34201(DataOutputStream dataOutputStream, int i, int i2) throws IOException {
        AbstractC12979 abstractC12979 = this.f42690;
        dataOutputStream.writeInt(abstractC12979.mo23859(i, i2));
        for (int i3 = 0; i3 < abstractC12979.mo23868(); i3++) {
            int iMo23869 = abstractC12979.mo23869(i3);
            if (iMo23869 >= i && iMo23869 < i2) {
                dataOutputStream.writeInt(iMo23869 - i);
                dataOutputStream.writeByte(this.f42691[i3]);
            }
        }
    }
}
