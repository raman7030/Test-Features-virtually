package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܿ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes5.dex */
public final class C17589 extends AbstractC11240 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final OutputStream f53757;

    public C17589(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f53757 = outputStream;
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ܽ */
    public final void mo35107(int i, int i2) {
        mo35106((i << 3) | i2);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ۧ */
    public final void mo35101(int i, int i2) throws IOException {
        m41116(20);
        m27814(i, 0);
        if (i2 >= 0) {
            m27817(i2);
        } else {
            m27815(i2);
        }
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ᩳ */
    public final void mo35109(int i, int i2) throws IOException {
        m41116(20);
        m27814(i, 0);
        m27817(i2);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35087(int i, int i2) throws IOException {
        m41116(14);
        m27814(i, 5);
        m27813(i2);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ۧ */
    public final void mo35102(int i, long j) throws IOException {
        m41116(20);
        m27814(i, 0);
        m27815(j);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35088(int i, long j) throws IOException {
        m41116(18);
        m27814(i, 1);
        m27816(j);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35093(int i, boolean z) throws IOException {
        m41116(11);
        m27814(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f33706;
        this.f33706 = i2 + 1;
        this.f33705[i2] = b;
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35089(int i, String str) throws IOException {
        mo35107(i, 2);
        mo35096(str);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35090(int i, AbstractC5886 abstractC5886) {
        mo35107(i, 2);
        mo35098(abstractC5886);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35098(AbstractC5886 abstractC5886) {
        mo35106(abstractC5886.size());
        abstractC5886.mo16497(this);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35094(int i, byte[] bArr) throws IOException {
        mo35106(i);
        m41118(bArr, 0, i);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ۧ */
    public final void mo35104(int i, InterfaceC8522 interfaceC8522) {
        mo35107(i, 2);
        mo35099(interfaceC8522);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35092(int i, InterfaceC8522 interfaceC8522, InterfaceC9374 interfaceC9374) {
        mo35107(i, 2);
        mo35106(((AbstractC3770) interfaceC8522).getSerializedSize(interfaceC9374));
        interfaceC9374.mo24200((Object) interfaceC8522, (InterfaceC6633) this.f45089);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ܽ */
    public final void mo35108(int i, InterfaceC8522 interfaceC8522) throws IOException {
        mo35107(1, 3);
        mo35109(2, i);
        mo35104(3, interfaceC8522);
        mo35107(1, 4);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ۧ */
    public final void mo35103(int i, AbstractC5886 abstractC5886) throws IOException {
        mo35107(1, 3);
        mo35109(2, i);
        mo35090(3, abstractC5886);
        mo35107(1, 4);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35099(InterfaceC8522 interfaceC8522) {
        mo35106(interfaceC8522.getSerializedSize());
        interfaceC8522.writeTo(this);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35085(byte b) throws IOException {
        if (this.f33706 == this.f33704) {
            m41117();
        }
        int i = this.f33706;
        this.f33706 = i + 1;
        this.f33705[i] = b;
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ۧ */
    public final void mo35100(int i) throws IOException {
        if (i >= 0) {
            mo35106(i);
        } else {
            mo35105(i);
        }
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ܽ */
    public final void mo35106(int i) {
        m41116(5);
        m27817(i);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35086(int i) throws IOException {
        m41116(4);
        m27813(i);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ۧ */
    public final void mo35105(long j) throws IOException {
        m41116(10);
        m27815(j);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35095(long j) throws IOException {
        m41116(8);
        m27816(j);
    }

    @Override // l.AbstractC14766
    /* JADX INFO: renamed from: ֫ */
    public final void mo35096(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM35083 = AbstractC14766.m35083(length);
            int i = iM35083 + length;
            int i2 = this.f33704;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iM29448 = C12071.m29448(0, length, str, bArr);
                mo35106(iM29448);
                m41118(bArr, 0, iM29448);
                return;
            }
            if (i > i2 - this.f33706) {
                m41117();
            }
            int iM35084 = AbstractC14766.m35083(str.length());
            int i3 = this.f33706;
            byte[] bArr2 = this.f33705;
            try {
                try {
                    if (iM35084 == iM35083) {
                        int i4 = i3 + iM35084;
                        this.f33706 = i4;
                        int iM29449 = C12071.m29448(i4, i2 - i4, str, bArr2);
                        this.f33706 = i3;
                        m27817((iM29449 - i3) - iM35084);
                        this.f33706 = iM29449;
                    } else {
                        int iM29450 = C12071.m29450(str);
                        m27817(iM29450);
                        this.f33706 = C12071.m29448(this.f33706, iM29450, str, bArr2);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new C18295(e);
                }
            } catch (C2899 e2) {
                this.f33706 = i3;
                throw e2;
            }
        } catch (C2899 e3) {
            m35097(str, e3);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m41119() {
        if (this.f33706 > 0) {
            m41117();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41118(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f33706;
        int i4 = this.f33704;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f33705;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f33706 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f33706 = i4;
        m41117();
        if (i7 <= i4) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f33706 = i7;
        } else {
            this.f53757.write(bArr, i6, i7);
        }
    }

    @Override // l.AbstractC0947
    /* JADX INFO: renamed from: ֫ */
    public final void mo3366(int i, int i2, byte[] bArr) throws IOException {
        m41118(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m41116(int i) throws IOException {
        if (this.f33704 - this.f33706 < i) {
            m41117();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m41117() throws IOException {
        this.f53757.write(this.f33705, 0, this.f33706);
        this.f33706 = 0;
    }
}
