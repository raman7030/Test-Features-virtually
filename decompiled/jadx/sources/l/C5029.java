package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: renamed from: l.ۚ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9YH */
/* JADX INFO: loaded from: classes3.dex */
public final class C5029 implements InterfaceC15030 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f15826 = C11321.m27961(C5029.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f15827;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f15828;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ASN1ObjectIdentifier f15829;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15736 f15830;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f15831;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ASN1ObjectIdentifier[] f15832;

    static {
        try {
            new ASN1ObjectIdentifier("1.3.6.1.5.5.2");
        } catch (IllegalArgumentException e) {
            f15826.mo7091("Failed to initialize OID", (Throwable) e);
        }
    }

    public C5029(InterfaceC1023 interfaceC1023, C15736 c15736) {
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = {C15736.f48543};
        this.f15828 = true;
        this.f15830 = c15736;
        this.f15832 = aSN1ObjectIdentifierArr;
        C13722 c13722 = (C13722) interfaceC1023;
        c13722.getClass();
        this.f15831 = c13722.m33017();
    }

    @Override // l.InterfaceC15030
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] mo14526() {
        return this.f15830.mo14526();
    }

    @Override // l.InterfaceC15030
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] mo14525(int i, byte[] bArr) throws C19369 {
        Object c14906;
        byte[] bArrM49450;
        byte[] bArrM14523;
        AbstractC21963 c14907;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (this.f15827) {
            throw new C19369("Already complete");
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f15832;
        C15736 c15736 = this.f15830;
        if (i == 0) {
            c14907 = new C7851(aSN1ObjectIdentifierArr, 0, c15736.mo14525(0, new byte[0]));
        } else {
            byte[] bArr2 = new byte[i];
            if (bArr.length != i) {
                System.arraycopy(bArr, 0, bArr2, 0, i);
                bArr = bArr2;
            }
            try {
                byte b = bArr[0];
                if (b == -95) {
                    c14906 = new C14906(bArr);
                } else if (b == 96) {
                    c14906 = new C7851(bArr);
                } else {
                    throw new C21258("Invalid token type");
                }
                if (c14906 instanceof C7851) {
                    C7851 c7851 = (C7851) c14906;
                    ASN1ObjectIdentifier[] aSN1ObjectIdentifierArrM21034 = c7851.m21034();
                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = aSN1ObjectIdentifierArrM21034[0];
                    c15736.getClass();
                    if (C15736.f48543.equals((ASN1Primitive) aSN1ObjectIdentifier2)) {
                        bArrM49450 = c7851.m49450();
                    } else {
                        int length = aSN1ObjectIdentifierArrM21034.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                aSN1ObjectIdentifier = null;
                                break;
                            }
                            aSN1ObjectIdentifier = aSN1ObjectIdentifierArrM21034[i2];
                            if (C15736.f48543.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                                break;
                            }
                            i2++;
                        }
                        if (aSN1ObjectIdentifier == null) {
                            throw new C3037("Server does advertise any supported mechanism");
                        }
                        bArrM49450 = null;
                    }
                } else if (c14906 instanceof C14906) {
                    C14906 c14908 = (C14906) c14906;
                    if (this.f15828) {
                        ASN1ObjectIdentifier aSN1ObjectIdentifierM35366 = c14908.m35366();
                        c15736.getClass();
                        if (!C15736.f48543.equals((ASN1Primitive) aSN1ObjectIdentifierM35366)) {
                            throw new C3037("Server chose an unsupported mechanism " + c14908.m35366());
                        }
                        this.f15829 = c14908.m35366();
                        if (c14908.m35365() == 3) {
                            this.f15831 = true;
                        }
                        this.f15828 = false;
                    } else if (c14908.m35366() != null && !c14908.m35366().equals((ASN1Primitive) this.f15829)) {
                        throw new C3037("Server switched mechanism");
                    }
                    bArrM49450 = c14908.m49450();
                } else {
                    throw new C3037("Invalid token");
                }
                boolean z = c14906 instanceof C14906;
                if (z && c15736.mo14524()) {
                    C14906 c14909 = (C14906) c14906;
                    if (c14909.m35365() == 1 && c14909.m49450() == null && c14909.m49448() != null) {
                        m14521(c14909.m49448());
                        c14907 = new C14906(null, m14523());
                    } else {
                        if (c14909.m35365() != 0) {
                            throw new C3037("SPNEGO negotiation did not complete");
                        }
                        m14521(c14909.m49448());
                        this.f15827 = true;
                        c14907 = null;
                    }
                } else if (bArrM49450 != null) {
                    byte[] bArrMo14525 = c15736.mo14525(bArrM49450.length, bArrM49450);
                    if (z) {
                        C14906 c149010 = (C14906) c14906;
                        if (c149010.m35365() == 0 && c15736.mo14524()) {
                            m14521(c149010.m49448());
                            bArrM14523 = m14523();
                            this.f15827 = true;
                        } else if (c15736.m37143()) {
                            bArrM14523 = m14523();
                        } else {
                            if (c149010.m35365() == 2) {
                                throw new C3037("SPNEGO mechanism was rejected");
                            }
                            bArrM14523 = null;
                        }
                    } else {
                        bArrM14523 = null;
                    }
                    c14907 = new C14906(bArrMo14525, bArrM14523);
                } else {
                    c14907 = new C7851(aSN1ObjectIdentifierArr, 0, c15736.mo14525(0, new byte[0]));
                }
            } catch (IOException unused) {
                throw new C21258("Invalid token");
            }
        }
        if (c14907 == null) {
            return null;
        }
        return c14907.mo21033();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private byte[] m14523() throws C19369 {
        C15736 c15736 = this.f15830;
        if (!c15736.m37143()) {
            return null;
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f15832;
        byte[] bArrM14522 = m14522(aSN1ObjectIdentifierArr);
        byte[] bArrM37141 = c15736.m37141(bArrM14522);
        InterfaceC2148 interfaceC2148 = f15826;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Out Mech list " + Arrays.toString(aSN1ObjectIdentifierArr));
            interfaceC2148.mo7088("Out Mech list encoded ".concat(C12085.m29468(bArrM14522, 0, bArrM14522.length)));
            interfaceC2148.mo7088("Out Mech list MIC ".concat(C12085.m29468(bArrM37141, 0, 16)));
        }
        return bArrM37141;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14521(byte[] bArr) throws C19369 {
        C15736 c15736 = this.f15830;
        if (bArr != null) {
            c15736.getClass();
        } else if (this.f15831 && !c15736.m37140(this.f15829)) {
            throw new C19369("SPNEGO integrity is required but not available");
        }
        if (!c15736.m37143() || bArr == null) {
            return;
        }
        try {
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f15832;
            byte[] bArrM14522 = m14522(aSN1ObjectIdentifierArr);
            InterfaceC2148 interfaceC2148 = f15826;
            if (interfaceC2148.mo7094()) {
                interfaceC2148.mo7088("In Mech list " + Arrays.toString(aSN1ObjectIdentifierArr));
                interfaceC2148.mo7088("In Mech list encoded ".concat(C12085.m29468(bArrM14522, 0, bArrM14522.length)));
                interfaceC2148.mo7088("In Mech list MIC ".concat(C12085.m29468(bArr, 0, bArr.length)));
            }
            c15736.m37139(bArrM14522, bArr);
        } catch (C19369 e) {
            throw new C19369("Failed to verify mechanismListMIC", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m14522(ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr) throws C19369 {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ASN1OutputStream aSN1OutputStreamCreate = ASN1OutputStream.create(byteArrayOutputStream, ASN1Encoding.DER);
            aSN1OutputStreamCreate.writeObject((ASN1Primitive) new DERSequence(aSN1ObjectIdentifierArr));
            aSN1OutputStreamCreate.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new C19369("Failed to encode mechList", e);
        }
    }

    @Override // l.InterfaceC15030
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo14524() {
        return this.f15827 && this.f15830.mo14524();
    }

    public final String toString() {
        return "SPNEGO[" + this.f15830 + "]";
    }
}
