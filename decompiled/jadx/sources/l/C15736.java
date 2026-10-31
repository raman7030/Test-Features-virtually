package l;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.util.Arrays;

/* JADX INFO: renamed from: l.ܺۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09ZP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15736 implements InterfaceC15030 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static ASN1ObjectIdentifier f48543;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f48544 = C11321.m27961(C15736.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f48545;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18560 f48546;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f48548;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Cipher f48550;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f48551;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Cipher f48554;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f48557;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f48558;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC18663 f48559;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public byte[] f48560;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f48561;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f48562;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f48553 = false;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f48552 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f48556 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f48555 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f48549 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f48547 = 1;

    static {
        try {
            f48543 = new ASN1ObjectIdentifier("1.3.6.1.4.1.311.2.2.10");
        } catch (IllegalArgumentException e) {
            f48544.mo7091("Failed to parse OID", (Throwable) e);
        }
    }

    public C15736(InterfaceC18663 interfaceC18663, C18560 c18560, boolean z) {
        this.f48559 = interfaceC18663;
        this.f48546 = c18560;
        this.f48558 |= 537395204;
        if (!c18560.mo16137()) {
            this.f48558 |= 1073774608;
        } else if (c18560.mo16135()) {
            this.f48558 |= 1073741824;
        } else {
            this.f48558 |= 2048;
        }
        this.f48557 = z;
        interfaceC18663.mo27540().getClass();
    }

    public final String toString() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder("NtlmContext[auth=");
        sb.append(this.f48546);
        sb.append(",ntlmsspFlags=0x");
        C19033.m43886(this.f48558, 8, ",workstation=null,isEstablished=", sb);
        sb.append(this.f48553);
        sb.append(",state=");
        String strM9831 = C3200.m9831(this.f48547, ",serverChallenge=", sb);
        if (this.f48552 == null) {
            string = C16014.m37867(strM9831, "null");
        } else {
            StringBuilder sbM15339 = C5368.m15339(strM9831);
            byte[] bArr = this.f48552;
            sbM15339.append(C12085.m29468(bArr, 0, bArr.length));
            string = sbM15339.toString();
        }
        String strM37867 = C16014.m37867(string, ",signingKey=");
        if (this.f48556 == null) {
            string2 = C16014.m37867(strM37867, "null");
        } else {
            StringBuilder sbM153310 = C5368.m15339(strM37867);
            byte[] bArr2 = this.f48556;
            sbM153310.append(C12085.m29468(bArr2, 0, bArr2.length));
            string2 = sbM153310.toString();
        }
        return C16014.m37867(string2, "]");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37140(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f48546.getClass();
        return f48543.equals((ASN1Primitive) aSN1ObjectIdentifier);
    }

    @Override // l.InterfaceC15030
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14524() {
        return this.f48553;
    }

    @Override // l.InterfaceC15030
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo14526() {
        return this.f48556;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37138(String str) {
        this.f48548 = str;
    }

    @Override // l.InterfaceC15030
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo14525(int i, byte[] bArr) {
        int i2 = this.f48547;
        InterfaceC18663 interfaceC18663 = this.f48559;
        InterfaceC2148 interfaceC2148 = f48544;
        if (i2 == 1) {
            C0774 c0774 = new C0774(interfaceC18663, this.f48558, this.f48546.mo16138());
            byte[] bArrM2957 = c0774.m2957();
            this.f48560 = bArrM2957;
            if (interfaceC2148.mo7099()) {
                interfaceC2148.mo7101(c0774.toString());
                interfaceC2148.mo7101(C12085.m29468(bArrM2957, 0, bArrM2957.length));
            }
            this.f48547++;
            return bArrM2957;
        }
        if (i2 != 2) {
            throw new C3037("Invalid state");
        }
        try {
            C7830 c7830 = new C7830(bArr);
            if (interfaceC2148.mo7099()) {
                interfaceC2148.mo7101(c7830.toString());
                interfaceC2148.mo7101(C12085.m29468(bArr, 0, bArr.length));
            }
            this.f48552 = c7830.m20928();
            if (this.f48557) {
                if (((C13722) interfaceC18663.mo27540()).m33017() && (!c7830.m14497(1073741824) || !c7830.m14497(524288))) {
                    throw new C0089("Server does not support extended NTLMv2 key exchange");
                }
                if (!c7830.m14497(536870912)) {
                    throw new C0089("Server does not support 128-bit keys");
                }
            }
            this.f48558 &= c7830.m14496();
            C14885 c14885M37137 = m37137(c7830);
            c14885M37137.m35318(this.f48560, bArr);
            byte[] bArrM35320 = c14885M37137.m35320();
            if (interfaceC2148.mo7099()) {
                interfaceC2148.mo7101(c14885M37137.toString());
                interfaceC2148.mo7101(C12085.m29468(bArr, 0, bArr.length));
            }
            byte[] bArrM35319 = c14885M37137.m35319();
            this.f48556 = bArrM35319;
            if (bArrM35319 != null && (this.f48558 & 524288) != 0) {
                m37142(c14885M37137.m35319());
            }
            this.f48553 = true;
            this.f48547++;
            return bArrM35320;
        } catch (C3037 e) {
            throw e;
        } catch (Exception e2) {
            throw new C3037(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14885 m37137(C7830 c7830) {
        String str = this.f48548;
        C18560 c18560 = this.f48546;
        boolean zMo16135 = c18560.mo16135();
        InterfaceC18663 interfaceC18663 = this.f48559;
        return new C14885(interfaceC18663, c7830, str, zMo16135 ? ((C13722) interfaceC18663.mo27540()).m32983() : c18560.getPassword(), c18560.mo16135() ? null : c18560.mo16138(), c18560.mo16135() ? ((C13722) interfaceC18663.mo27540()).m33011() : c18560.m43097(), this.f48558, c18560.mo16135() || !c18560.mo16137());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37142(byte[] bArr) {
        this.f48551 = m37136("session key to client-to-server signing key magic constant", bArr);
        this.f48545 = m37136("session key to server-to-client signing key magic constant", bArr);
        InterfaceC2148 interfaceC2148 = f48544;
        if (interfaceC2148.mo7086()) {
            byte[] bArr2 = this.f48551;
            interfaceC2148.mo7088("Sign key is ".concat(C12085.m29468(bArr2, 0, bArr2.length)));
            byte[] bArr3 = this.f48545;
            interfaceC2148.mo7088("Verify key is ".concat(C12085.m29468(bArr3, 0, bArr3.length)));
        }
        byte[] bArrM37136 = m37136("session key to client-to-server sealing key magic constant", bArr);
        this.f48562 = bArrM37136;
        this.f48554 = C4324.m12978(bArrM37136);
        if (interfaceC2148.mo7086()) {
            byte[] bArr4 = this.f48562;
            interfaceC2148.mo7088("Seal key is ".concat(C12085.m29468(bArr4, 0, bArr4.length)));
        }
        byte[] bArrM37137 = m37136("session key to server-to-client sealing key magic constant", bArr);
        this.f48561 = bArrM37137;
        this.f48550 = C4324.m12978(bArrM37137);
        if (interfaceC2148.mo7086()) {
            byte[] bArr5 = this.f48561;
            interfaceC2148.mo7088("Server seal key is ".concat(C12085.m29468(bArr5, 0, bArr5.length)));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m37136(String str, byte[] bArr) {
        MessageDigest messageDigestM12979 = C4324.m12979();
        messageDigestM12979.update(bArr);
        messageDigestM12979.update(str.getBytes(StandardCharsets.US_ASCII));
        messageDigestM12979.update((byte) 0);
        return messageDigestM12979.digest();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m37143() {
        return (this.f48546.mo16135() || this.f48551 == null || this.f48545 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m37141(byte[] bArr) {
        byte[] bArr2 = this.f48551;
        if (bArr2 == null) {
            throw new C19369("Signing is not initialized");
        }
        byte[] bArr3 = new byte[4];
        long andIncrement = this.f48555.getAndIncrement();
        C1480.m5124(andIncrement, 0, bArr3);
        MessageDigest messageDigestM12981 = C4324.m12981(bArr2);
        messageDigestM12981.update(bArr3);
        messageDigestM12981.update(bArr);
        byte[] bArrDigest = messageDigestM12981.digest();
        byte[] bArrDoFinal = new byte[8];
        System.arraycopy(bArrDigest, 0, bArrDoFinal, 0, 8);
        InterfaceC2148 interfaceC2148 = f48544;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Digest ".concat(C12085.m29468(bArrDigest, 0, bArrDigest.length)));
            interfaceC2148.mo7088("Truncated ".concat(C12085.m29468(bArrDoFinal, 0, 8)));
        }
        if ((this.f48558 & 1073741824) != 0) {
            try {
                bArrDoFinal = this.f48554.doFinal(bArrDoFinal);
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("Encrypted ".concat(C12085.m29468(bArrDoFinal, 0, bArrDoFinal.length)));
                }
            } catch (GeneralSecurityException e) {
                throw new C19369("Failed to encrypt MIC", e);
            }
        }
        byte[] bArr4 = new byte[16];
        C1480.m5124(1L, 0, bArr4);
        System.arraycopy(bArrDoFinal, 0, bArr4, 4, 8);
        C1480.m5124(andIncrement, 12, bArr4);
        return bArr4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37139(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f48545;
        if (bArr3 == null) {
            throw new C19369("Signing is not initialized");
        }
        int iM5123 = C1480.m5123(0, bArr2);
        if (iM5123 != 1) {
            throw new C0089("Invalid signature version");
        }
        MessageDigest messageDigestM12981 = C4324.m12981(bArr3);
        int iM5124 = C1480.m5123(12, bArr2);
        messageDigestM12981.update(bArr2, 12, 4);
        byte[] bArrDigest = messageDigestM12981.digest(bArr);
        byte[] bArrCopyOf = Arrays.copyOf(bArrDigest, 8);
        InterfaceC2148 interfaceC2148 = f48544;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Digest ".concat(C12085.m29468(bArrDigest, 0, bArrDigest.length)));
            interfaceC2148.mo7088("Truncated ".concat(C12085.m29468(bArrCopyOf, 0, bArrCopyOf.length)));
        }
        boolean z = (this.f48558 & 1073741824) != 0;
        if (z) {
            try {
                bArrCopyOf = this.f48550.doFinal(bArrCopyOf);
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("Decrypted ".concat(C12085.m29468(bArrCopyOf, 0, bArrCopyOf.length)));
                }
            } catch (GeneralSecurityException e) {
                throw new C19369("Failed to decrypt MIC", e);
            }
        }
        int andIncrement = this.f48549.getAndIncrement();
        if (andIncrement != iM5124) {
            throw new C19369(String.format("Invalid MIC sequence, expect %d have %d", Integer.valueOf(andIncrement), Integer.valueOf(iM5124)));
        }
        byte[] bArr4 = new byte[8];
        System.arraycopy(bArr2, 4, bArr4, 0, 8);
        if (MessageDigest.isEqual(bArrCopyOf, bArr4)) {
            return;
        }
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088(String.format("Seq = %d ver = %d encrypted = %s", Integer.valueOf(iM5124), Integer.valueOf(iM5123), Boolean.valueOf(z)));
            interfaceC2148.mo7088("Expected MIC " + C12085.m29468(bArrCopyOf, 0, bArrCopyOf.length) + " != " + C12085.m29468(bArr4, 0, 8));
        }
        throw new C19369("Invalid MIC");
    }
}
