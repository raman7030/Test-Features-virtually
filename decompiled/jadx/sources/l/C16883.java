package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ܽ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes5.dex */
public final class C16883 extends AbstractC14766 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f51816;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f51817;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f51818;

    public C16883(byte[] bArr, int i) {
        super(0);
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f51817 = bArr;
        this.f51818 = 0;
        this.f51816 = i;
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ܽ */
    public final void mo35107(int i, int i2) throws C18295 {
        mo35106((i << 3) | i2);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ۧ */
    public final void mo35101(int i, int i2) throws C18295 {
        mo35107(i, 0);
        mo35100(i2);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ᩳ */
    public final void mo35109(int i, int i2) throws C18295 {
        mo35107(i, 0);
        mo35106(i2);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35087(int i, int i2) throws C18295 {
        mo35107(i, 5);
        mo35086(i2);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ۧ */
    public final void mo35102(int i, long j) throws C18295 {
        mo35107(i, 0);
        mo35105(j);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35088(int i, long j) throws C18295 {
        mo35107(i, 1);
        mo35095(j);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35093(int i, boolean z) throws C18295 {
        mo35107(i, 0);
        mo35085(z ? (byte) 1 : (byte) 0);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35089(int i, String str) throws C18295 {
        mo35107(i, 2);
        mo35096(str);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35090(int i, AbstractC5886 abstractC5886) throws C18295 {
        mo35107(i, 2);
        mo35098(abstractC5886);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35098(AbstractC5886 abstractC5886) throws C18295 {
        mo35106(abstractC5886.size());
        abstractC5886.mo16497(this);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35094(int i, byte[] bArr) throws C18295 {
        mo35106(i);
        m39693(bArr, 0, i);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ۧ */
    public final void mo35104(int i, InterfaceC8522 interfaceC8522) throws C18295 {
        mo35107(i, 2);
        mo35099(interfaceC8522);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35092(int i, InterfaceC8522 interfaceC8522, InterfaceC9374 interfaceC9374) throws C18295 {
        mo35107(i, 2);
        mo35106(((AbstractC3770) interfaceC8522).getSerializedSize(interfaceC9374));
        interfaceC9374.mo24200((Object) interfaceC8522, (InterfaceC6633) this.f45089);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ܽ */
    public final void mo35108(int i, InterfaceC8522 interfaceC8522) throws C18295 {
        mo35107(1, 3);
        mo35109(2, i);
        mo35104(3, interfaceC8522);
        mo35107(1, 4);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ۧ */
    public final void mo35103(int i, AbstractC5886 abstractC5886) throws C18295 {
        mo35107(1, 3);
        mo35109(2, i);
        mo35090(3, abstractC5886);
        mo35107(1, 4);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35099(InterfaceC8522 interfaceC8522) throws C18295 {
        mo35106(interfaceC8522.getSerializedSize());
        interfaceC8522.writeTo(this);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35085(byte b) throws C18295 {
        try {
            byte[] bArr = this.f51817;
            int i = this.f51818;
            this.f51818 = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C18295(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f51818), Integer.valueOf(this.f51816), 1), e);
        }
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ۧ */
    public final void mo35100(int i) throws C18295 {
        if (i >= 0) {
            mo35106(i);
        } else {
            mo35105(i);
        }
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ܽ */
    public final void mo35106(int i) throws C18295 {
        while (true) {
            int i2 = i & a.g;
            byte[] bArr = this.f51817;
            if (i2 == 0) {
                int i3 = this.f51818;
                this.f51818 = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f51818;
                    this.f51818 = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C18295(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f51818), Integer.valueOf(this.f51816), 1), e);
                }
            }
            throw new C18295(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f51818), Integer.valueOf(this.f51816), 1), e);
        }
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35086(int i) throws C18295 {
        try {
            byte[] bArr = this.f51817;
            int i2 = this.f51818;
            int i3 = i2 + 1;
            this.f51818 = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f51818 = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f51818 = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f51818 = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C18295(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f51818), Integer.valueOf(this.f51816), 1), e);
        }
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ۧ */
    public final void mo35105(long j) throws C18295 {
        boolean z = AbstractC14766.f45087;
        byte[] bArr = this.f51817;
        if (z && mo27812() >= 10) {
            while ((j & (-128)) != 0) {
                int i = this.f51818;
                this.f51818 = i + 1;
                C21244.m48232(bArr, i, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i2 = this.f51818;
            this.f51818 = i2 + 1;
            C21244.m48232(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i3 = this.f51818;
                this.f51818 = i3 + 1;
                bArr[i3] = (byte) ((((int) j) | 128) & 255);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C18295(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f51818), Integer.valueOf(this.f51816), 1), e);
            }
        }
        int i4 = this.f51818;
        this.f51818 = i4 + 1;
        bArr[i4] = (byte) j;
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35095(long j) throws C18295 {
        try {
            byte[] bArr = this.f51817;
            int i = this.f51818;
            int i2 = i + 1;
            this.f51818 = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f51818 = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f51818 = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f51818 = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f51818 = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f51818 = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f51818 = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f51818 = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C18295(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f51818), Integer.valueOf(this.f51816), 1), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39693(byte[] bArr, int i, int i2) throws C18295 {
        try {
            System.arraycopy(bArr, i, this.f51817, this.f51818, i2);
            this.f51818 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C18295(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f51818), Integer.valueOf(this.f51816), Integer.valueOf(i2)), e);
        }
    }

    @Override // l.AbstractC0947
    /* JADX INFO: renamed from: ֫ */
    public final void mo3366(int i, int i2, byte[] bArr) throws C18295 {
        m39693(bArr, i, i2);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35096(String str) throws C18295 {
        int i = this.f51818;
        try {
            int iM35083 = AbstractC14766.m35083(str.length() * 3);
            int iM35084 = AbstractC14766.m35083(str.length());
            byte[] bArr = this.f51817;
            if (iM35084 == iM35083) {
                int i2 = i + iM35084;
                this.f51818 = i2;
                int iM29448 = C12071.m29448(i2, mo27812(), str, bArr);
                this.f51818 = i;
                mo35106((iM29448 - i) - iM35084);
                this.f51818 = iM29448;
                return;
            }
            mo35106(C12071.m29450(str));
            this.f51818 = C12071.m29448(this.f51818, mo27812(), str, bArr);
        } catch (IndexOutOfBoundsException e) {
            throw new C18295(e);
        } catch (C2899 e2) {
            this.f51818 = i;
            m35097(str, e2);
        }
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final int mo27812() {
        return this.f51816 - this.f51818;
    }
}
