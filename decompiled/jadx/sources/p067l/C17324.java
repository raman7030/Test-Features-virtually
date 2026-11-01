package p067l;

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
public final class C17324 implements InterfaceC16653 {

    /* JADX INFO: renamed from: ֨ */
    public static ASN1ObjectIdentifier f51683;

    /* JADX INFO: renamed from: ۠ */
    public static final InterfaceC4410 f51684 = C13128.m30022(C17324.class);

    /* JADX INFO: renamed from: ֡ */
    public byte[] f51685;

    /* JADX INFO: renamed from: ֫ */
    public C20008 f51686;

    /* JADX INFO: renamed from: ۘ */
    public String f51688;

    /* JADX INFO: renamed from: ۜ */
    public Cipher f51690;

    /* JADX INFO: renamed from: ۡ */
    public byte[] f51691;

    /* JADX INFO: renamed from: ܳ */
    public Cipher f51694;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f51697;

    /* JADX INFO: renamed from: ᩳ */
    public int f51698;

    /* JADX INFO: renamed from: ᩴ */
    public InterfaceC20106 f51699;

    /* JADX INFO: renamed from: ᩵ */
    public byte[] f51700;

    /* JADX INFO: renamed from: ᩷ */
    public byte[] f51701;

    /* JADX INFO: renamed from: ᩻ */
    public byte[] f51702;

    /* JADX INFO: renamed from: ۧ */
    public boolean f51693 = false;

    /* JADX INFO: renamed from: ۢ */
    public byte[] f51692 = null;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f51696 = null;

    /* JADX INFO: renamed from: ܺ */
    public final AtomicInteger f51695 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۚ */
    public final AtomicInteger f51689 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۖ */
    public int f51687 = 1;

    static {
        try {
            f51683 = new ASN1ObjectIdentifier("1.3.6.1.4.1.311.2.2.10");
        } catch (IllegalArgumentException e) {
            f51684.mo9186("Failed to parse OID", (Throwable) e);
        }
    }

    public C17324(InterfaceC20106 interfaceC20106, C20008 c20008, boolean z) {
        this.f51699 = interfaceC20106;
        this.f51686 = c20008;
        this.f51698 |= 537395204;
        if (!c20008.mo18056()) {
            this.f51698 |= 1073774608;
        } else if (c20008.mo18054()) {
            this.f51698 |= 1073741824;
        } else {
            this.f51698 |= 2048;
        }
        this.f51697 = z;
        interfaceC20106.mo29602().getClass();
    }

    public final String toString() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder("NtlmContext[auth=");
        sb.append(this.f51686);
        sb.append(",ntlmsspFlags=0x");
        C20458.m46154(this.f51698, 8, ",workstation=null,isEstablished=", sb);
        sb.append(this.f51693);
        sb.append(",state=");
        String strM11876 = C5410.m11876(this.f51687, ",serverChallenge=", sb);
        if (this.f51692 == null) {
            string = C17588.m40053(strM11876, "null");
        } else {
            StringBuilder sbM17248 = C7470.m17248(strM11876);
            byte[] bArr = this.f51692;
            sbM17248.append(C13854.m31530(bArr, 0, bArr.length));
            string = sbM17248.toString();
        }
        String strM40053 = C17588.m40053(string, ",signingKey=");
        if (this.f51696 == null) {
            string2 = C17588.m40053(strM40053, "null");
        } else {
            StringBuilder sbM17249 = C7470.m17248(strM40053);
            byte[] bArr2 = this.f51696;
            sbM17249.append(C13854.m31530(bArr2, 0, bArr2.length));
            string2 = sbM17249.toString();
        }
        return C17588.m40053(string2, "]");
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39309(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f51686.getClass();
        return f51683.equals((ASN1Primitive) aSN1ObjectIdentifier);
    }

    @Override // p067l.InterfaceC16653
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16428() {
        return this.f51693;
    }

    @Override // p067l.InterfaceC16653
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo16430() {
        return this.f51696;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39307(String str) {
        this.f51688 = str;
    }

    @Override // p067l.InterfaceC16653
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo16429(int i, byte[] bArr) {
        int i2 = this.f51687;
        InterfaceC20106 interfaceC20106 = this.f51699;
        InterfaceC4410 interfaceC4410 = f51684;
        if (i2 == 1) {
            C3104 c3104 = new C3104(interfaceC20106, this.f51698, this.f51686.mo18057());
            byte[] bArrM5286 = c3104.m5286();
            this.f51700 = bArrM5286;
            if (interfaceC4410.mo9194()) {
                interfaceC4410.mo9196(c3104.toString());
                interfaceC4410.mo9196(C13854.m31530(bArrM5286, 0, bArrM5286.length));
            }
            this.f51687++;
            return bArrM5286;
        }
        if (i2 != 2) {
            throw new C5255("Invalid state");
        }
        try {
            C9810 c9810 = new C9810(bArr);
            if (interfaceC4410.mo9194()) {
                interfaceC4410.mo9196(c9810.toString());
                interfaceC4410.mo9196(C13854.m31530(bArr, 0, bArr.length));
            }
            this.f51692 = c9810.m22893();
            if (this.f51697) {
                if (((C15410) interfaceC20106.mo29602()).m35131() && (!c9810.m16401(1073741824) || !c9810.m16401(524288))) {
                    throw new C2453("Server does not support extended NTLMv2 key exchange");
                }
                if (!c9810.m16401(536870912)) {
                    throw new C2453("Server does not support 128-bit keys");
                }
            }
            this.f51698 &= c9810.m16400();
            C16515 c16515M39306 = m39306(c9810);
            c16515M39306.m37470(this.f51700, bArr);
            byte[] bArrM37472 = c16515M39306.m37472();
            if (interfaceC4410.mo9194()) {
                interfaceC4410.mo9196(c16515M39306.toString());
                interfaceC4410.mo9196(C13854.m31530(bArr, 0, bArr.length));
            }
            byte[] bArrM37471 = c16515M39306.m37471();
            this.f51696 = bArrM37471;
            if (bArrM37471 != null && (this.f51698 & 524288) != 0) {
                m39311(c16515M39306.m37471());
            }
            this.f51693 = true;
            this.f51687++;
            return bArrM37472;
        } catch (C5255 e) {
            throw e;
        } catch (Exception e2) {
            throw new C5255(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16515 m39306(C9810 c9810) {
        String str = this.f51688;
        C20008 c20008 = this.f51686;
        boolean zMo18054 = c20008.mo18054();
        InterfaceC20106 interfaceC20106 = this.f51699;
        return new C16515(interfaceC20106, c9810, str, zMo18054 ? ((C15410) interfaceC20106.mo29602()).m35097() : c20008.getPassword(), c20008.mo18054() ? null : c20008.mo18057(), c20008.mo18054() ? ((C15410) interfaceC20106.mo29602()).m35125() : c20008.m45375(), this.f51698, c20008.mo18054() || !c20008.mo18056());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39311(byte[] bArr) {
        this.f51691 = m39305("session key to client-to-server signing key magic constant", bArr);
        this.f51685 = m39305("session key to server-to-client signing key magic constant", bArr);
        InterfaceC4410 interfaceC4410 = f51684;
        if (interfaceC4410.mo9181()) {
            byte[] bArr2 = this.f51691;
            interfaceC4410.mo9183("Sign key is ".concat(C13854.m31530(bArr2, 0, bArr2.length)));
            byte[] bArr3 = this.f51685;
            interfaceC4410.mo9183("Verify key is ".concat(C13854.m31530(bArr3, 0, bArr3.length)));
        }
        byte[] bArrM39305 = m39305("session key to client-to-server sealing key magic constant", bArr);
        this.f51702 = bArrM39305;
        this.f51694 = C6478.m14842(bArrM39305);
        if (interfaceC4410.mo9181()) {
            byte[] bArr4 = this.f51702;
            interfaceC4410.mo9183("Seal key is ".concat(C13854.m31530(bArr4, 0, bArr4.length)));
        }
        byte[] bArrM39306 = m39305("session key to server-to-client sealing key magic constant", bArr);
        this.f51701 = bArrM39306;
        this.f51690 = C6478.m14842(bArrM39306);
        if (interfaceC4410.mo9181()) {
            byte[] bArr5 = this.f51701;
            interfaceC4410.mo9183("Server seal key is ".concat(C13854.m31530(bArr5, 0, bArr5.length)));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m39305(String str, byte[] bArr) {
        MessageDigest messageDigestM14843 = C6478.m14843();
        messageDigestM14843.update(bArr);
        messageDigestM14843.update(str.getBytes(StandardCharsets.US_ASCII));
        messageDigestM14843.update((byte) 0);
        return messageDigestM14843.digest();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m39312() {
        return (this.f51686.mo18054() || this.f51691 == null || this.f51685 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m39310(byte[] bArr) {
        byte[] bArr2 = this.f51691;
        if (bArr2 == null) {
            throw new C20777("Signing is not initialized");
        }
        byte[] bArr3 = new byte[4];
        long andIncrement = this.f51695.getAndIncrement();
        C3775.m7366(andIncrement, 0, bArr3);
        MessageDigest messageDigestM14845 = C6478.m14845(bArr2);
        messageDigestM14845.update(bArr3);
        messageDigestM14845.update(bArr);
        byte[] bArrDigest = messageDigestM14845.digest();
        byte[] bArrDoFinal = new byte[8];
        System.arraycopy(bArrDigest, 0, bArrDoFinal, 0, 8);
        InterfaceC4410 interfaceC4410 = f51684;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Digest ".concat(C13854.m31530(bArrDigest, 0, bArrDigest.length)));
            interfaceC4410.mo9183("Truncated ".concat(C13854.m31530(bArrDoFinal, 0, 8)));
        }
        if ((this.f51698 & 1073741824) != 0) {
            try {
                bArrDoFinal = this.f51694.doFinal(bArrDoFinal);
                if (interfaceC4410.mo9181()) {
                    interfaceC4410.mo9183("Encrypted ".concat(C13854.m31530(bArrDoFinal, 0, bArrDoFinal.length)));
                }
            } catch (GeneralSecurityException e) {
                throw new C20777("Failed to encrypt MIC", e);
            }
        }
        byte[] bArr4 = new byte[16];
        C3775.m7366(1L, 0, bArr4);
        System.arraycopy(bArrDoFinal, 0, bArr4, 4, 8);
        C3775.m7366(andIncrement, 12, bArr4);
        return bArr4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39308(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f51685;
        if (bArr3 == null) {
            throw new C20777("Signing is not initialized");
        }
        int iM7365 = C3775.m7365(0, bArr2);
        if (iM7365 != 1) {
            throw new C2453("Invalid signature version");
        }
        MessageDigest messageDigestM14845 = C6478.m14845(bArr3);
        int iM7366 = C3775.m7365(12, bArr2);
        messageDigestM14845.update(bArr2, 12, 4);
        byte[] bArrDigest = messageDigestM14845.digest(bArr);
        byte[] bArrCopyOf = Arrays.copyOf(bArrDigest, 8);
        InterfaceC4410 interfaceC4410 = f51684;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Digest ".concat(C13854.m31530(bArrDigest, 0, bArrDigest.length)));
            interfaceC4410.mo9183("Truncated ".concat(C13854.m31530(bArrCopyOf, 0, bArrCopyOf.length)));
        }
        boolean z = (this.f51698 & 1073741824) != 0;
        if (z) {
            try {
                bArrCopyOf = this.f51690.doFinal(bArrCopyOf);
                if (interfaceC4410.mo9181()) {
                    interfaceC4410.mo9183("Decrypted ".concat(C13854.m31530(bArrCopyOf, 0, bArrCopyOf.length)));
                }
            } catch (GeneralSecurityException e) {
                throw new C20777("Failed to decrypt MIC", e);
            }
        }
        int andIncrement = this.f51689.getAndIncrement();
        if (andIncrement != iM7366) {
            throw new C20777(String.format("Invalid MIC sequence, expect %d have %d", Integer.valueOf(andIncrement), Integer.valueOf(iM7366)));
        }
        byte[] bArr4 = new byte[8];
        System.arraycopy(bArr2, 4, bArr4, 0, 8);
        if (MessageDigest.isEqual(bArrCopyOf, bArr4)) {
            return;
        }
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183(String.format("Seq = %d ver = %d encrypted = %s", Integer.valueOf(iM7366), Integer.valueOf(iM7365), Boolean.valueOf(z)));
            interfaceC4410.mo9183("Expected MIC " + C13854.m31530(bArrCopyOf, 0, bArrCopyOf.length) + " != " + C13854.m31530(bArr4, 0, 8));
        }
        throw new C20777("Invalid MIC");
    }
}
