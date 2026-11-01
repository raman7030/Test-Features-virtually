package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܿ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19085 extends AbstractC13051 {

    /* JADX INFO: renamed from: ۜ */
    public final OutputStream f56951;

    public C19085(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f56951 = outputStream;
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ܽ */
    public final void mo37254(int i, int i2) {
        mo37253((i << 3) | i2);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ۧ */
    public final void mo37248(int i, int i2) throws IOException {
        m43362(20);
        m29876(i, 0);
        if (i2 >= 0) {
            m29879(i2);
        } else {
            m29877(i2);
        }
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ᩳ */
    public final void mo37256(int i, int i2) throws IOException {
        m43362(20);
        m29876(i, 0);
        m29879(i2);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37234(int i, int i2) throws IOException {
        m43362(14);
        m29876(i, 5);
        m29875(i2);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ۧ */
    public final void mo37249(int i, long j) throws IOException {
        m43362(20);
        m29876(i, 0);
        m29877(j);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37235(int i, long j) throws IOException {
        m43362(18);
        m29876(i, 1);
        m29878(j);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37240(int i, boolean z) throws IOException {
        m43362(11);
        m29876(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f36706;
        this.f36706 = i2 + 1;
        this.f36705[i2] = b;
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37236(int i, String str) throws IOException {
        mo37254(i, 2);
        mo37243(str);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37237(int i, AbstractC7962 abstractC7962) {
        mo37254(i, 2);
        mo37245(abstractC7962);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37245(AbstractC7962 abstractC7962) {
        mo37253(abstractC7962.size());
        abstractC7962.mo18423(this);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37241(int i, byte[] bArr) throws IOException {
        mo37253(i);
        m43364(bArr, 0, i);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ۧ */
    public final void mo37251(int i, InterfaceC10467 interfaceC10467) {
        mo37254(i, 2);
        mo37246(interfaceC10467);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37239(int i, InterfaceC10467 interfaceC10467, InterfaceC11277 interfaceC11277) {
        mo37254(i, 2);
        mo37253(((AbstractC5951) interfaceC10467).getSerializedSize(interfaceC11277));
        interfaceC11277.mo26210((Object) interfaceC10467, (InterfaceC8672) this.f48203);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ܽ */
    public final void mo37255(int i, InterfaceC10467 interfaceC10467) throws IOException {
        mo37254(1, 3);
        mo37256(2, i);
        mo37251(3, interfaceC10467);
        mo37254(1, 4);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ۧ */
    public final void mo37250(int i, AbstractC7962 abstractC7962) throws IOException {
        mo37254(1, 3);
        mo37256(2, i);
        mo37237(3, abstractC7962);
        mo37254(1, 4);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37246(InterfaceC10467 interfaceC10467) {
        mo37253(interfaceC10467.getSerializedSize());
        interfaceC10467.writeTo(this);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37232(byte b) throws IOException {
        if (this.f36706 == this.f36704) {
            m43363();
        }
        int i = this.f36706;
        this.f36706 = i + 1;
        this.f36705[i] = b;
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ۧ */
    public final void mo37247(int i) throws IOException {
        if (i >= 0) {
            mo37253(i);
        } else {
            mo37252(i);
        }
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ܽ */
    public final void mo37253(int i) {
        m43362(5);
        m29879(i);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37233(int i) throws IOException {
        m43362(4);
        m29875(i);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ۧ */
    public final void mo37252(long j) throws IOException {
        m43362(10);
        m29877(j);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37242(long j) throws IOException {
        m43362(8);
        m29878(j);
    }

    @Override // p067l.AbstractC16402
    /* JADX INFO: renamed from: ֫ */
    public final void mo37243(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM37230 = AbstractC16402.m37230(length);
            int i = iM37230 + length;
            int i2 = this.f36704;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iM31510 = C13840.m31510(0, length, str, bArr);
                mo37253(iM31510);
                m43364(bArr, 0, iM31510);
                return;
            }
            if (i > i2 - this.f36706) {
                m43363();
            }
            int iM37231 = AbstractC16402.m37230(str.length());
            int i3 = this.f36706;
            byte[] bArr2 = this.f36705;
            try {
                try {
                    if (iM37231 == iM37230) {
                        int i4 = i3 + iM37231;
                        this.f36706 = i4;
                        int iM31511 = C13840.m31510(i4, i2 - i4, str, bArr2);
                        this.f36706 = i3;
                        m29879((iM31511 - i3) - iM37231);
                        this.f36706 = iM31511;
                    } else {
                        int iM31512 = C13840.m31512(str);
                        m29879(iM31512);
                        this.f36706 = C13840.m31510(this.f36706, iM31512, str, bArr2);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new C19756(e);
                }
            } catch (C5123 e2) {
                this.f36706 = i3;
                throw e2;
            }
        } catch (C5123 e3) {
            m37244(str, e3);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m43365() {
        if (this.f36706 > 0) {
            m43363();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43364(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f36706;
        int i4 = this.f36704;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f36705;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f36706 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f36706 = i4;
        m43363();
        if (i7 <= i4) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f36706 = i7;
        } else {
            this.f56951.write(bArr, i6, i7);
        }
    }

    @Override // p067l.AbstractC3268
    /* JADX INFO: renamed from: ֫ */
    public final void mo5685(int i, int i2, byte[] bArr) throws IOException {
        m43364(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۢ */
    private void m43362(int i) throws IOException {
        if (this.f36704 - this.f36706 < i) {
            m43363();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m43363() throws IOException {
        this.f56951.write(this.f36705, 0, this.f36706);
        this.f36706 = 0;
    }
}
