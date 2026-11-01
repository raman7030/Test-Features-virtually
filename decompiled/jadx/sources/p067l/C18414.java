package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;

/* JADX INFO: renamed from: l.ܽ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes5.dex */
public final class C18414 extends AbstractC16402 {

    /* JADX INFO: renamed from: ܳ */
    public final int f54997;

    /* JADX INFO: renamed from: ܿ */
    public final byte[] f54998;

    /* JADX INFO: renamed from: ᩻ */
    public int f54999;

    public C18414(byte[] bArr, int i) {
        super(0);
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f54998 = bArr;
        this.f54999 = 0;
        this.f54997 = i;
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ܽ */
    public final void mo37254(int i, int i2) throws C19756 {
        mo37253((i << 3) | i2);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ۧ */
    public final void mo37248(int i, int i2) throws C19756 {
        mo37254(i, 0);
        mo37247(i2);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ᩳ */
    public final void mo37256(int i, int i2) throws C19756 {
        mo37254(i, 0);
        mo37253(i2);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37234(int i, int i2) throws C19756 {
        mo37254(i, 5);
        mo37233(i2);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ۧ */
    public final void mo37249(int i, long j) throws C19756 {
        mo37254(i, 0);
        mo37252(j);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37235(int i, long j) throws C19756 {
        mo37254(i, 1);
        mo37242(j);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37240(int i, boolean z) throws C19756 {
        mo37254(i, 0);
        mo37232(z ? (byte) 1 : (byte) 0);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37236(int i, String str) throws C19756 {
        mo37254(i, 2);
        mo37243(str);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37237(int i, AbstractC7962 abstractC7962) throws C19756 {
        mo37254(i, 2);
        mo37245(abstractC7962);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37245(AbstractC7962 abstractC7962) throws C19756 {
        mo37253(abstractC7962.size());
        abstractC7962.mo18423(this);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37241(int i, byte[] bArr) throws C19756 {
        mo37253(i);
        m41934(bArr, 0, i);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ۧ */
    public final void mo37251(int i, InterfaceC10467 interfaceC10467) throws C19756 {
        mo37254(i, 2);
        mo37246(interfaceC10467);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37239(int i, InterfaceC10467 interfaceC10467, InterfaceC11277 interfaceC11277) throws C19756 {
        mo37254(i, 2);
        mo37253(((AbstractC5951) interfaceC10467).getSerializedSize(interfaceC11277));
        interfaceC11277.mo26210((Object) interfaceC10467, (InterfaceC8672) this.f48203);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ܽ */
    public final void mo37255(int i, InterfaceC10467 interfaceC10467) throws C19756 {
        mo37254(1, 3);
        mo37256(2, i);
        mo37251(3, interfaceC10467);
        mo37254(1, 4);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ۧ */
    public final void mo37250(int i, AbstractC7962 abstractC7962) throws C19756 {
        mo37254(1, 3);
        mo37256(2, i);
        mo37237(3, abstractC7962);
        mo37254(1, 4);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37246(InterfaceC10467 interfaceC10467) throws C19756 {
        mo37253(interfaceC10467.getSerializedSize());
        interfaceC10467.writeTo(this);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37232(byte b) throws C19756 {
        try {
            byte[] bArr = this.f54998;
            int i = this.f54999;
            this.f54999 = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C19756(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f54999), Integer.valueOf(this.f54997), 1), e);
        }
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ۧ */
    public final void mo37247(int i) throws C19756 {
        if (i >= 0) {
            mo37253(i);
        } else {
            mo37252(i);
        }
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ܽ */
    public final void mo37253(int i) throws C19756 {
        while (true) {
            int i2 = i & C0184a.f879g;
            byte[] bArr = this.f54998;
            if (i2 == 0) {
                int i3 = this.f54999;
                this.f54999 = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f54999;
                    this.f54999 = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C19756(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f54999), Integer.valueOf(this.f54997), 1), e);
                }
            }
            throw new C19756(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f54999), Integer.valueOf(this.f54997), 1), e);
        }
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37233(int i) throws C19756 {
        try {
            byte[] bArr = this.f54998;
            int i2 = this.f54999;
            int i3 = i2 + 1;
            this.f54999 = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f54999 = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f54999 = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f54999 = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C19756(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f54999), Integer.valueOf(this.f54997), 1), e);
        }
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ۧ */
    public final void mo37252(long j) throws C19756 {
        boolean z = AbstractC16402.f48201;
        byte[] bArr = this.f54998;
        if (z && mo29874() >= 10) {
            while ((j & (-128)) != 0) {
                int i = this.f54999;
                this.f54999 = i + 1;
                C22558.m50563(bArr, i, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i2 = this.f54999;
            this.f54999 = i2 + 1;
            C22558.m50563(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i3 = this.f54999;
                this.f54999 = i3 + 1;
                bArr[i3] = (byte) ((((int) j) | 128) & 255);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C19756(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f54999), Integer.valueOf(this.f54997), 1), e);
            }
        }
        int i4 = this.f54999;
        this.f54999 = i4 + 1;
        bArr[i4] = (byte) j;
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37242(long j) throws C19756 {
        try {
            byte[] bArr = this.f54998;
            int i = this.f54999;
            int i2 = i + 1;
            this.f54999 = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f54999 = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f54999 = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f54999 = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f54999 = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f54999 = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f54999 = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f54999 = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C19756(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f54999), Integer.valueOf(this.f54997), 1), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41934(byte[] bArr, int i, int i2) throws C19756 {
        try {
            System.arraycopy(bArr, i, this.f54998, this.f54999, i2);
            this.f54999 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C19756(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f54999), Integer.valueOf(this.f54997), Integer.valueOf(i2)), e);
        }
    }

    @Override // p067l.AbstractC3268
    /* JADX INFO: renamed from: ֫ */
    public final void mo5685(int i, int i2, byte[] bArr) throws C19756 {
        m41934(bArr, i, i2);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37243(String str) throws C19756 {
        int i = this.f54999;
        try {
            int iM37230 = AbstractC16402.m37230(str.length() * 3);
            int iM37231 = AbstractC16402.m37230(str.length());
            byte[] bArr = this.f54998;
            if (iM37231 == iM37230) {
                int i2 = i + iM37231;
                this.f54999 = i2;
                int iM31510 = C13840.m31510(i2, mo29874(), str, bArr);
                this.f54999 = i;
                mo37253((iM31510 - i) - iM37231);
                this.f54999 = iM31510;
                return;
            }
            mo37253(C13840.m31512(str));
            this.f54999 = C13840.m31510(this.f54999, mo29874(), str, bArr);
        } catch (IndexOutOfBoundsException e) {
            throw new C19756(e);
        } catch (C5123 e2) {
            this.f54999 = i;
            m37244(str, e2);
        }
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final int mo29874() {
        return this.f54997 - this.f54999;
    }
}
