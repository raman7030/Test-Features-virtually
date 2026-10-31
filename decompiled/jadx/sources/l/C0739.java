package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.cb;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Vector;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.֡᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7VX */
/* JADX INFO: loaded from: classes2.dex */
public final class C0739 extends AbstractC19791 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C16261 f2783;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C16261 f2785;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C16261 f2786 = null;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C8087 f2784 = null;

    public C0739() {
        this.f2785 = null;
        this.f2783 = null;
        this.f63924 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f63913 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f63925 = 16384;
        byte[] bArr = C19356.f62660;
        this.f63912 = C19356.m44592("auth-agent@openssh.com", StandardCharsets.UTF_8);
        C16261 c16261 = new C16261();
        this.f2785 = c16261;
        c16261.m38242();
        this.f2783 = new C16261();
        this.f63919 = true;
    }

    @Override // l.AbstractC19791
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void mo2847() {
        try {
            m45487();
        } catch (Exception unused) {
            this.f63909 = true;
            m45490();
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x013e A[SYNTHETIC] */
    @Override // l.AbstractC19791
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2846(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArrMo2691;
        InterfaceC0656 interfaceC0656;
        String strMo4548;
        if (this.f2784 == null) {
            C16261 c16261 = new C16261(this.f63911);
            this.f2786 = c16261;
            this.f2784 = new C8087(c16261);
        }
        this.f2785.m38242();
        C16261 c16262 = this.f2785;
        byte[] bArr2 = c16262.f50016;
        if (bArr2.length < c16262.f50017 + i2) {
            byte[] bArr3 = new byte[c16262.f50018 + i2];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            this.f2785.f50016 = bArr3;
        }
        this.f2785.m38246(i, i2, bArr);
        if (this.f2785.m38250() > this.f2785.m38255()) {
            this.f2785.f50018 -= 4;
            return;
        }
        int iM38233 = this.f2785.m38233();
        try {
            C7381 c7381M45497 = m45497();
            InterfaceC1362 interfaceC1362M46775 = c7381M45497.f22696.m46775();
            InterfaceC18650 interfaceC18650M19878 = c7381M45497.m19878();
            this.f2783.m38242();
            if (iM38233 == 11) {
                this.f2783.m38234((byte) 12);
                Vector vectorMo1739 = interfaceC1362M46775.mo1739();
                synchronized (vectorMo1739) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < vectorMo1739.size(); i4++) {
                        if (((InterfaceC0656) vectorMo1739.elementAt(i4)).mo2690() != null) {
                            i3++;
                        }
                    }
                    this.f2783.m38245(i3);
                    for (int i5 = 0; i5 < vectorMo1739.size(); i5++) {
                        byte[] bArrMo2690 = ((InterfaceC0656) vectorMo1739.elementAt(i5)).mo2690();
                        if (bArrMo2690 != null) {
                            C16261 c16263 = this.f2783;
                            c16263.getClass();
                            c16263.m38252(0, bArrMo2690.length, bArrMo2690);
                            this.f2783.m38256(C19356.f62660);
                        }
                    }
                }
            } else if (iM38233 == 1) {
                this.f2783.m38234((byte) 2);
                this.f2783.m38245(0);
            } else if (iM38233 == 13) {
                byte[] bArrM38257 = this.f2785.m38257();
                byte[] bArrM38258 = this.f2785.m38257();
                int iM38250 = this.f2785.m38250();
                Vector vectorMo17310 = interfaceC1362M46775.mo1739();
                synchronized (vectorMo17310) {
                    int i6 = 0;
                    while (true) {
                        bArrMo2691 = null;
                        if (i6 >= vectorMo17310.size()) {
                            interfaceC0656 = null;
                            break;
                        }
                        interfaceC0656 = (InterfaceC0656) vectorMo17310.elementAt(i6);
                        if (interfaceC0656.mo2690() != null && C19356.m44591(bArrM38257, interfaceC0656.mo2690())) {
                            if (!interfaceC0656.mo2692()) {
                                if (!interfaceC0656.mo2692()) {
                                    break;
                                }
                            } else if (interfaceC18650M19878 != null) {
                                while (interfaceC0656.mo2692() && interfaceC18650M19878.mo4551() && (strMo4548 = interfaceC18650M19878.mo4548()) != null) {
                                    try {
                                        if (interfaceC0656.mo2688(strMo4548.getBytes(StandardCharsets.UTF_8))) {
                                            break;
                                        }
                                    } catch (C12651 unused) {
                                    }
                                }
                                if (!interfaceC0656.mo2692()) {
                                    break;
                                    break;
                                }
                            }
                        }
                        i6++;
                    }
                }
                if (interfaceC0656 != null) {
                    byte[] bArrM38259 = new C16261(bArrM38257).m38257();
                    if (!new String(bArrM38259, 0, bArrM38259.length, StandardCharsets.UTF_8).equals(OpenSSHPublicKeyUtil.RSA)) {
                        bArrMo2691 = interfaceC0656.mo2691(bArrM38258);
                    } else if ((iM38250 & 2) != 0) {
                        bArrMo2691 = interfaceC0656.mo2689("rsa-sha2-256", bArrM38258);
                    } else if ((iM38250 & 4) != 0) {
                        bArrMo2691 = interfaceC0656.mo2689("rsa-sha2-512", bArrM38258);
                    } else {
                        bArrMo2691 = interfaceC0656.mo2689(OpenSSHPublicKeyUtil.RSA, bArrM38258);
                    }
                }
                if (bArrMo2691 == null) {
                    this.f2783.m38234((byte) 30);
                } else {
                    this.f2783.m38234(cb.f77931l);
                    C16261 c16264 = this.f2783;
                    c16264.getClass();
                    c16264.m38252(0, bArrMo2691.length, bArrMo2691);
                }
            } else if (iM38233 == 18) {
                interfaceC1362M46775.mo1743(this.f2785.m38257());
                this.f2783.m38234((byte) 6);
            } else if (iM38233 == 9) {
                this.f2783.m38234((byte) 6);
            } else if (iM38233 == 19) {
                interfaceC1362M46775.mo1742();
                this.f2783.m38234((byte) 6);
            } else if (iM38233 == 17) {
                int iM38255 = this.f2785.m38255();
                byte[] bArr4 = new byte[iM38255];
                C16261 c16265 = this.f2785;
                c16265.getClass();
                c16265.m38236(0, iM38255, bArr4);
                this.f2783.m38234(interfaceC1362M46775.mo1741(bArr4) ? (byte) 6 : (byte) 5);
            } else {
                C16261 c16266 = this.f2785;
                c16266.m38251(c16266.m38255() - 1);
                this.f2783.m38234((byte) 5);
            }
            int iM38256 = this.f2783.m38255();
            byte[] bArr5 = new byte[iM38256];
            C16261 c16267 = this.f2783;
            c16267.getClass();
            c16267.m38236(0, iM38256, bArr5);
            this.f2784.m21457();
            this.f2786.m38234((byte) 94);
            this.f2786.m38245(this.f63918);
            int i7 = iM38256 + 4;
            this.f2786.m38245(i7);
            C16261 c16268 = this.f2786;
            c16268.getClass();
            c16268.m38252(0, iM38256, bArr5);
            try {
                m45497().m19862(this.f2784, this, i7);
            } catch (Exception unused2) {
            }
        } catch (C12651 e) {
            throw new IOException(e.toString(), e);
        }
    }

    @Override // l.AbstractC19791
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo2848() {
        super.mo2848();
        m45495();
    }
}
