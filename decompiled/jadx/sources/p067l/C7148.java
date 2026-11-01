package p067l;

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
public final class C7148 implements InterfaceC16653 {

    /* JADX INFO: renamed from: ᩻ */
    public static final InterfaceC4410 f18658 = C13128.m30022(C7148.class);

    /* JADX INFO: renamed from: ֫ */
    public boolean f18659;

    /* JADX INFO: renamed from: ۧ */
    public boolean f18660;

    /* JADX INFO: renamed from: ܳ */
    public ASN1ObjectIdentifier f18661;

    /* JADX INFO: renamed from: ܽ */
    public C17324 f18662;

    /* JADX INFO: renamed from: ܿ */
    public boolean f18663;

    /* JADX INFO: renamed from: ᩳ */
    public ASN1ObjectIdentifier[] f18664;

    static {
        try {
            new ASN1ObjectIdentifier("1.3.6.1.5.5.2");
        } catch (IllegalArgumentException e) {
            f18658.mo9186("Failed to initialize OID", (Throwable) e);
        }
    }

    public C7148(InterfaceC3341 interfaceC3341, C17324 c17324) {
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = {C17324.f51683};
        this.f18660 = true;
        this.f18662 = c17324;
        this.f18664 = aSN1ObjectIdentifierArr;
        C15410 c15410 = (C15410) interfaceC3341;
        c15410.getClass();
        this.f18663 = c15410.m35131();
    }

    @Override // p067l.InterfaceC16653
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo16430() {
        return this.f18662.mo16430();
    }

    @Override // p067l.InterfaceC16653
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo16429(int i, byte[] bArr) throws C20777 {
        Object c16535;
        byte[] bArrM51787;
        byte[] bArrM16427;
        AbstractC23242 c16536;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (this.f18659) {
            throw new C20777("Already complete");
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f18664;
        C17324 c17324 = this.f18662;
        if (i == 0) {
            c16536 = new C9830(aSN1ObjectIdentifierArr, 0, c17324.mo16429(0, new byte[0]));
        } else {
            byte[] bArr2 = new byte[i];
            if (bArr.length != i) {
                System.arraycopy(bArr, 0, bArr2, 0, i);
                bArr = bArr2;
            }
            try {
                byte b = bArr[0];
                if (b == -95) {
                    c16535 = new C16535(bArr);
                } else if (b == 96) {
                    c16535 = new C9830(bArr);
                } else {
                    throw new C22572("Invalid token type");
                }
                if (c16535 instanceof C9830) {
                    C9830 c9830 = (C9830) c16535;
                    ASN1ObjectIdentifier[] aSN1ObjectIdentifierArrM22999 = c9830.m22999();
                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = aSN1ObjectIdentifierArrM22999[0];
                    c17324.getClass();
                    if (C17324.f51683.equals((ASN1Primitive) aSN1ObjectIdentifier2)) {
                        bArrM51787 = c9830.m51787();
                    } else {
                        int length = aSN1ObjectIdentifierArrM22999.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                aSN1ObjectIdentifier = null;
                                break;
                            }
                            aSN1ObjectIdentifier = aSN1ObjectIdentifierArrM22999[i2];
                            if (C17324.f51683.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                                break;
                            }
                            i2++;
                        }
                        if (aSN1ObjectIdentifier == null) {
                            throw new C5255("Server does advertise any supported mechanism");
                        }
                        bArrM51787 = null;
                    }
                } else if (c16535 instanceof C16535) {
                    C16535 c16537 = (C16535) c16535;
                    if (this.f18660) {
                        ASN1ObjectIdentifier aSN1ObjectIdentifierM37518 = c16537.m37518();
                        c17324.getClass();
                        if (!C17324.f51683.equals((ASN1Primitive) aSN1ObjectIdentifierM37518)) {
                            throw new C5255("Server chose an unsupported mechanism " + c16537.m37518());
                        }
                        this.f18661 = c16537.m37518();
                        if (c16537.m37517() == 3) {
                            this.f18663 = true;
                        }
                        this.f18660 = false;
                    } else if (c16537.m37518() != null && !c16537.m37518().equals((ASN1Primitive) this.f18661)) {
                        throw new C5255("Server switched mechanism");
                    }
                    bArrM51787 = c16537.m51787();
                } else {
                    throw new C5255("Invalid token");
                }
                boolean z = c16535 instanceof C16535;
                if (z && c17324.mo16428()) {
                    C16535 c16538 = (C16535) c16535;
                    if (c16538.m37517() == 1 && c16538.m51787() == null && c16538.m51785() != null) {
                        m16425(c16538.m51785());
                        c16536 = new C16535(null, m16427());
                    } else {
                        if (c16538.m37517() != 0) {
                            throw new C5255("SPNEGO negotiation did not complete");
                        }
                        m16425(c16538.m51785());
                        this.f18659 = true;
                        c16536 = null;
                    }
                } else if (bArrM51787 != null) {
                    byte[] bArrMo16429 = c17324.mo16429(bArrM51787.length, bArrM51787);
                    if (z) {
                        C16535 c16539 = (C16535) c16535;
                        if (c16539.m37517() == 0 && c17324.mo16428()) {
                            m16425(c16539.m51785());
                            bArrM16427 = m16427();
                            this.f18659 = true;
                        } else if (c17324.m39312()) {
                            bArrM16427 = m16427();
                        } else {
                            if (c16539.m37517() == 2) {
                                throw new C5255("SPNEGO mechanism was rejected");
                            }
                            bArrM16427 = null;
                        }
                    } else {
                        bArrM16427 = null;
                    }
                    c16536 = new C16535(bArrMo16429, bArrM16427);
                } else {
                    c16536 = new C9830(aSN1ObjectIdentifierArr, 0, c17324.mo16429(0, new byte[0]));
                }
            } catch (IOException unused) {
                throw new C22572("Invalid token");
            }
        }
        if (c16536 == null) {
            return null;
        }
        return c16536.mo22998();
    }

    /* JADX INFO: renamed from: ܽ */
    private byte[] m16427() throws C20777 {
        C17324 c17324 = this.f18662;
        if (!c17324.m39312()) {
            return null;
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f18664;
        byte[] bArrM16426 = m16426(aSN1ObjectIdentifierArr);
        byte[] bArrM39310 = c17324.m39310(bArrM16426);
        InterfaceC4410 interfaceC4410 = f18658;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Out Mech list " + Arrays.toString(aSN1ObjectIdentifierArr));
            interfaceC4410.mo9183("Out Mech list encoded ".concat(C13854.m31530(bArrM16426, 0, bArrM16426.length)));
            interfaceC4410.mo9183("Out Mech list MIC ".concat(C13854.m31530(bArrM39310, 0, 16)));
        }
        return bArrM39310;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16425(byte[] bArr) throws C20777 {
        C17324 c17324 = this.f18662;
        if (bArr != null) {
            c17324.getClass();
        } else if (this.f18663 && !c17324.m39309(this.f18661)) {
            throw new C20777("SPNEGO integrity is required but not available");
        }
        if (!c17324.m39312() || bArr == null) {
            return;
        }
        try {
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f18664;
            byte[] bArrM16426 = m16426(aSN1ObjectIdentifierArr);
            InterfaceC4410 interfaceC4410 = f18658;
            if (interfaceC4410.mo9189()) {
                interfaceC4410.mo9183("In Mech list " + Arrays.toString(aSN1ObjectIdentifierArr));
                interfaceC4410.mo9183("In Mech list encoded ".concat(C13854.m31530(bArrM16426, 0, bArrM16426.length)));
                interfaceC4410.mo9183("In Mech list MIC ".concat(C13854.m31530(bArr, 0, bArr.length)));
            }
            c17324.m39308(bArrM16426, bArr);
        } catch (C20777 e) {
            throw new C20777("Failed to verify mechanismListMIC", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m16426(ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr) throws C20777 {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ASN1OutputStream aSN1OutputStreamCreate = ASN1OutputStream.create(byteArrayOutputStream, ASN1Encoding.DER);
            aSN1OutputStreamCreate.writeObject((ASN1Primitive) new DERSequence(aSN1ObjectIdentifierArr));
            aSN1OutputStreamCreate.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new C20777("Failed to encode mechList", e);
        }
    }

    @Override // p067l.InterfaceC16653
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16428() {
        return this.f18659 && this.f18662.mo16428();
    }

    public final String toString() {
        return "SPNEGO[" + this.f18662 + "]";
    }
}
