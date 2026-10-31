package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.List;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۧ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9YE */
/* JADX INFO: loaded from: classes4.dex */
public final class C11254 extends AbstractC18309 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2081 f33726;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f33727;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f33728;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final DatagramPacket f33729;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f33724 = C11321.m27962(C11254.class.getName());

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean f33725 = true;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final char[] f33723 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11254(DatagramPacket datagramPacket) {
        super(0, 0, datagramPacket.getPort() == C13038.f39044);
        InterfaceC2148 interfaceC2148 = f33724;
        this.f33729 = datagramPacket;
        InetAddress address = datagramPacket.getAddress();
        C2081 c2081 = new C2081(datagramPacket.getData(), datagramPacket.getLength());
        this.f33726 = c2081;
        this.f33728 = System.currentTimeMillis();
        this.f33727 = 1460;
        try {
            try {
                m42655(c2081.m6853());
                m42649(c2081.m6853());
                if (m42659() > 0) {
                    throw new IOException("Received a message with a non standard operation code. Currently unsupported in the specification.");
                }
                int iM6853 = c2081.m6853();
                int iM6854 = c2081.m6853();
                int iM6855 = c2081.m6853();
                int iM6856 = c2081.m6853();
                interfaceC2148.mo7092("DNSIncoming() questions:{} answers:{} authorities:{} additionals:{}", Integer.valueOf(iM6853), Integer.valueOf(iM6854), Integer.valueOf(iM6855), Integer.valueOf(iM6856));
                if (((iM6854 + iM6855 + iM6856) * 11) + (iM6853 * 5) > datagramPacket.getLength()) {
                    throw new IOException("questions:" + iM6853 + " answers:" + iM6854 + " authorities:" + iM6855 + " additionals:" + iM6856);
                }
                if (iM6853 > 0) {
                    for (int i = 0; i < iM6853; i++) {
                        this.f56922.add(m27843());
                    }
                }
                if (iM6854 > 0) {
                    for (int i2 = 0; i2 < iM6854; i2++) {
                        AbstractC22542 abstractC22542M27845 = m27845(address);
                        if (abstractC22542M27845 != null) {
                            this.f56917.add(abstractC22542M27845);
                        }
                    }
                }
                if (iM6855 > 0) {
                    for (int i3 = 0; i3 < iM6855; i3++) {
                        AbstractC22542 abstractC22542M27846 = m27845(address);
                        if (abstractC22542M27846 != null) {
                            this.f56919.add(abstractC22542M27846);
                        }
                    }
                }
                if (iM6856 > 0) {
                    for (int i4 = 0; i4 < iM6856; i4++) {
                        AbstractC22542 abstractC22542M27847 = m27845(address);
                        if (abstractC22542M27847 != null) {
                            this.f56916.add(abstractC22542M27847);
                        }
                    }
                }
                if (this.f33726.available() > 0) {
                    throw new IOException("Received a message with the wrong length.");
                }
                try {
                    this.f33726.close();
                } catch (Exception unused) {
                    interfaceC2148.mo7104("MessageInputStream close error");
                }
            } catch (Throwable th) {
                try {
                    this.f33726.close();
                } catch (Exception unused2) {
                    interfaceC2148.mo7104("MessageInputStream close error");
                }
                throw th;
            }
        } catch (Exception e) {
            interfaceC2148.mo7083("DNSIncoming() dump " + m27849() + "\n exception ", (Throwable) e);
            IOException iOException = new IOException("DNSIncoming corrupted message");
            iOException.initCause(e);
            throw iOException;
        }
    }

    public C11254(int i, int i2, boolean z, DatagramPacket datagramPacket, long j) {
        super(i, i2, z);
        this.f33729 = datagramPacket;
        this.f33726 = new C2081(datagramPacket.getData(), datagramPacket.getLength());
        this.f33728 = j;
    }

    public final C11254 clone() {
        C11254 c11254 = new C11254(m42658(), m42660(), this.f56918, this.f33729, this.f33728);
        c11254.f33727 = this.f33727;
        c11254.f56922.addAll(this.f56922);
        c11254.f56917.addAll(this.f56917);
        c11254.f56919.addAll(this.f56919);
        c11254.f56916.addAll(this.f56916);
        return c11254;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private C19015 m27843() {
        C2081 c2081 = this.f33726;
        String strM6850 = c2081.m6850();
        EnumC11628 enumC11628M28518 = EnumC11628.m28518(c2081.m6853());
        if (enumC11628M28518 == EnumC11628.TYPE_IGNORE) {
            f33724.mo7103(m27849(), "Could not find record type: {}");
        }
        int iM6853 = c2081.m6853();
        EnumC5983 enumC5983M16798 = EnumC5983.m16798(iM6853);
        return C19015.m43857(strM6850, enumC11628M28518, enumC5983M16798, enumC5983M16798.m16801(iM6853));
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0202  */
    /* JADX WARN: Code duplicated, block: B:88:0x0207  */
    /* JADX WARN: Code duplicated, block: B:90:0x020b  */
    /* JADX WARN: Code duplicated, block: B:91:0x020e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0212  */
    /* JADX WARN: Code duplicated, block: B:94:0x0217  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [l.᩹᩷᩵] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC22542 m27845(InetAddress inetAddress) throws IOException {
        byte b;
        char c;
        char c2;
        byte b2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        String str;
        String strM27844;
        String str2;
        String strM27845;
        ?? r10;
        C2081 c2081 = this.f33726;
        String strM6850 = c2081.m6850();
        EnumC11628 enumC11628M28518 = EnumC11628.m28518(c2081.m6853());
        EnumC11628 enumC11628 = EnumC11628.TYPE_IGNORE;
        InterfaceC2148 interfaceC2148 = f33724;
        if (enumC11628M28518 == enumC11628) {
            interfaceC2148.mo7098("Could not find record type. domain: {}\n{}", strM6850, m27849());
        }
        int iM6853 = c2081.m6853();
        EnumC11628 enumC11629 = EnumC11628.TYPE_OPT;
        EnumC5983 enumC5983M16798 = enumC11628M28518 == enumC11629 ? EnumC5983.CLASS_UNKNOWN : EnumC5983.m16798(iM6853);
        int i = 2;
        if (enumC5983M16798 == EnumC5983.CLASS_UNKNOWN && enumC11628M28518 != enumC11629) {
            interfaceC2148.mo7084("Could not find record class. domain: {} type: {}\n{}", strM6850, enumC11628M28518, m27849());
        }
        boolean zM16801 = enumC5983M16798.m16801(iM6853);
        int iM6854 = (c2081.m6853() << 16) | c2081.m6853();
        int iM6855 = c2081.m6853();
        char c3 = 11;
        char c4 = 7;
        Object c5609 = null;
        int i2 = 4;
        switch (C7311.f22444[enumC11628M28518.ordinal()]) {
            case 1:
                byte[] bArr4 = new byte[iM6855];
                c2081.read(bArr4, 0, iM6855);
                c5609 = new C5609(strM6850, EnumC11628.TYPE_A, enumC5983M16798, zM16801, iM6854, bArr4);
                r10 = c5609;
                break;
            case 2:
                byte[] bArr5 = new byte[iM6855];
                c2081.read(bArr5, 0, iM6855);
                if (bArr5[0] == 0 && bArr5[1] == 0 && bArr5[2] == 0 && bArr5[3] == 0 && bArr5[4] == 0 && bArr5[5] == 0 && bArr5[6] == 0 && bArr5[7] == 0 && bArr5[8] == 0 && bArr5[9] == 0 && bArr5[10] == -1 && bArr5[11] == -1) {
                    interfaceC2148.mo7103(strM6850, "AAAA record with IPv4-mapped address for {}");
                } else {
                    c5609 = new C1375(strM6850, EnumC11628.TYPE_AAAA, enumC5983M16798, zM16801, iM6854, bArr5);
                }
                r10 = c5609;
                break;
            case 3:
            case 4:
                String strM6851 = c2081.m6850();
                if (strM6851.length() > 0) {
                    c5609 = new C8431(strM6850, enumC5983M16798, zM16801, iM6854, strM6851);
                } else {
                    interfaceC2148.mo7098("PTR record of class: {}, there was a problem reading the service name of the answer for domain: {}", enumC5983M16798, strM6850);
                }
                r10 = c5609;
                break;
            case 5:
                byte[] bArr6 = new byte[iM6855];
                c2081.read(bArr6, 0, iM6855);
                c5609 = new C21837(strM6850, enumC5983M16798, zM16801, iM6854, bArr6);
                r10 = c5609;
                break;
            case 6:
                c5609 = new C15485(strM6850, enumC5983M16798, zM16801, iM6854, c2081.m6853(), c2081.m6853(), c2081.m6853(), f33725 ? c2081.m6850() : c2081.m6851(c2081.m6852()));
                r10 = c5609;
                break;
            case 7:
                StringBuilder sb = new StringBuilder();
                sb.append(c2081.m6851(iM6855));
                int iIndexOf = sb.indexOf(" ");
                String strTrim = (iIndexOf > 0 ? sb.substring(0, iIndexOf) : sb.toString()).trim();
                String strTrim2 = (iIndexOf > 0 ? sb.substring(iIndexOf + 1) : "").trim();
                C0669 c0669 = new C0669(strM6850, EnumC11628.TYPE_HINFO, enumC5983M16798, zM16801, iM6854);
                c0669.f2581 = strTrim;
                c0669.f2582 = strTrim2;
                r10 = c0669;
                break;
            case 8:
                EnumC22916 enumC22916M51004 = EnumC22916.m51004(m42658(), iM6854);
                int i3 = (16711680 & iM6854) >> 16;
                if (i3 == 0) {
                    this.f33727 = iM6853;
                    int i4 = 3;
                    while (c2081.available() > 0) {
                        if (c2081.available() >= i) {
                            int iM6856 = c2081.m6853();
                            EnumC10217 enumC10217M25644 = EnumC10217.m25644(iM6856);
                            if (c2081.available() >= i) {
                                int iM6857 = c2081.m6853();
                                byte[] bArr7 = new byte[0];
                                if (c2081.available() >= iM6857) {
                                    bArr7 = new byte[iM6857];
                                    c2081.read(bArr7, 0, iM6857);
                                }
                                int i5 = C7311.f22443[enumC10217M25644.ordinal()];
                                if (i5 == 1) {
                                    try {
                                        b = bArr7[0];
                                        try {
                                            b2 = bArr7[1];
                                            try {
                                                bArr2 = new byte[6];
                                                bArr2[0] = bArr7[i];
                                                bArr2[1] = bArr7[i4];
                                                bArr2[i] = bArr7[i2];
                                                bArr2[i4] = bArr7[5];
                                                bArr2[i2] = bArr7[6];
                                                bArr2[5] = bArr7[c4];
                                                try {
                                                    if (bArr7.length > 8) {
                                                        try {
                                                            bArr3 = new byte[6];
                                                            bArr3[0] = bArr7[8];
                                                            bArr3[1] = bArr7[9];
                                                            bArr3[i] = bArr7[10];
                                                            bArr3[i4] = bArr7[c3];
                                                            bArr3[i2] = bArr7[12];
                                                            bArr3[5] = bArr7[13];
                                                        } catch (Exception unused) {
                                                            bArr3 = bArr2;
                                                            bArr = null;
                                                            c = 3;
                                                            c2 = 2;
                                                            interfaceC2148.mo7103(m27844(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                            if (interfaceC2148.mo7086()) {
                                                                Integer numValueOf = Integer.valueOf(b);
                                                                Integer numValueOf2 = Integer.valueOf(b2);
                                                                String strM27846 = m27844(bArr2);
                                                                if (bArr3 != bArr2) {
                                                                    str = " wakeup MAC address: ";
                                                                } else {
                                                                    str = "";
                                                                }
                                                                if (bArr3 != bArr2) {
                                                                    strM27844 = m27844(bArr3);
                                                                } else {
                                                                    strM27844 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    str2 = " password: ";
                                                                } else {
                                                                    str2 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    strM27845 = m27844(bArr);
                                                                } else {
                                                                    strM27845 = "";
                                                                }
                                                                Object[] objArr = new Object[7];
                                                                objArr[0] = numValueOf;
                                                                objArr[1] = numValueOf2;
                                                                objArr[c2] = strM27846;
                                                                objArr[c] = str;
                                                                objArr[4] = strM27844;
                                                                objArr[5] = str2;
                                                                objArr[6] = strM27845;
                                                                interfaceC2148.mo7092("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr);
                                                            }
                                                            i4 = 3;
                                                            i = 2;
                                                            c4 = 7;
                                                            i2 = 4;
                                                            c3 = 11;
                                                        }
                                                    } else {
                                                        bArr3 = bArr2;
                                                    }
                                                    try {
                                                        c = 3;
                                                        if (bArr7.length == 18) {
                                                            try {
                                                                bArr = new byte[i2];
                                                                bArr[0] = bArr7[14];
                                                                bArr[1] = bArr7[15];
                                                                bArr[i] = bArr7[16];
                                                                bArr[3] = bArr7[17];
                                                            } catch (Exception unused2) {
                                                                bArr = null;
                                                                c2 = 2;
                                                                interfaceC2148.mo7103(m27844(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                                if (interfaceC2148.mo7086()) {
                                                                    Integer numValueOf3 = Integer.valueOf(b);
                                                                    Integer numValueOf4 = Integer.valueOf(b2);
                                                                    String strM27847 = m27844(bArr2);
                                                                    if (bArr3 != bArr2) {
                                                                        str = " wakeup MAC address: ";
                                                                    } else {
                                                                        str = "";
                                                                    }
                                                                    if (bArr3 != bArr2) {
                                                                        strM27844 = m27844(bArr3);
                                                                    } else {
                                                                        strM27844 = "";
                                                                    }
                                                                    if (bArr != null) {
                                                                        str2 = " password: ";
                                                                    } else {
                                                                        str2 = "";
                                                                    }
                                                                    if (bArr != null) {
                                                                        strM27845 = m27844(bArr);
                                                                    } else {
                                                                        strM27845 = "";
                                                                    }
                                                                    Object[] objArr2 = new Object[7];
                                                                    objArr2[0] = numValueOf3;
                                                                    objArr2[1] = numValueOf4;
                                                                    objArr2[c2] = strM27847;
                                                                    objArr2[c] = str;
                                                                    objArr2[4] = strM27844;
                                                                    objArr2[5] = str2;
                                                                    objArr2[6] = strM27845;
                                                                    interfaceC2148.mo7092("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr2);
                                                                }
                                                                i4 = 3;
                                                                i = 2;
                                                                c4 = 7;
                                                                i2 = 4;
                                                                c3 = 11;
                                                            }
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        try {
                                                            c2 = 2;
                                                            if (bArr7.length == 22) {
                                                                try {
                                                                    byte[] bArr8 = new byte[8];
                                                                    bArr8[0] = bArr7[14];
                                                                    bArr8[1] = bArr7[15];
                                                                    bArr8[2] = bArr7[16];
                                                                    bArr8[3] = bArr7[17];
                                                                    bArr8[4] = bArr7[18];
                                                                    bArr8[5] = bArr7[19];
                                                                    bArr8[6] = bArr7[20];
                                                                    bArr8[c4] = bArr7[21];
                                                                    bArr = bArr8;
                                                                } catch (Exception unused3) {
                                                                    interfaceC2148.mo7103(m27844(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                                }
                                                            }
                                                        } catch (Exception unused4) {
                                                            c2 = 2;
                                                            interfaceC2148.mo7103(m27844(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                            if (interfaceC2148.mo7086()) {
                                                                Integer numValueOf5 = Integer.valueOf(b);
                                                                Integer numValueOf6 = Integer.valueOf(b2);
                                                                String strM27848 = m27844(bArr2);
                                                                if (bArr3 != bArr2) {
                                                                    str = " wakeup MAC address: ";
                                                                } else {
                                                                    str = "";
                                                                }
                                                                if (bArr3 != bArr2) {
                                                                    strM27844 = m27844(bArr3);
                                                                } else {
                                                                    strM27844 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    str2 = " password: ";
                                                                } else {
                                                                    str2 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    strM27845 = m27844(bArr);
                                                                } else {
                                                                    strM27845 = "";
                                                                }
                                                                Object[] objArr3 = new Object[7];
                                                                objArr3[0] = numValueOf5;
                                                                objArr3[1] = numValueOf6;
                                                                objArr3[c2] = strM27848;
                                                                objArr3[c] = str;
                                                                objArr3[4] = strM27844;
                                                                objArr3[5] = str2;
                                                                objArr3[6] = strM27845;
                                                                interfaceC2148.mo7092("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr3);
                                                            }
                                                            i4 = 3;
                                                            i = 2;
                                                            c4 = 7;
                                                            i2 = 4;
                                                            c3 = 11;
                                                        }
                                                    } catch (Exception unused5) {
                                                        c = 3;
                                                        c2 = 2;
                                                        bArr = null;
                                                        interfaceC2148.mo7103(m27844(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                        if (interfaceC2148.mo7086()) {
                                                            Integer numValueOf7 = Integer.valueOf(b);
                                                            Integer numValueOf8 = Integer.valueOf(b2);
                                                            String strM27849 = m27844(bArr2);
                                                            if (bArr3 != bArr2) {
                                                                str = " wakeup MAC address: ";
                                                            } else {
                                                                str = "";
                                                            }
                                                            if (bArr3 != bArr2) {
                                                                strM27844 = m27844(bArr3);
                                                            } else {
                                                                strM27844 = "";
                                                            }
                                                            if (bArr != null) {
                                                                str2 = " password: ";
                                                            } else {
                                                                str2 = "";
                                                            }
                                                            if (bArr != null) {
                                                                strM27845 = m27844(bArr);
                                                            } else {
                                                                strM27845 = "";
                                                            }
                                                            Object[] objArr4 = new Object[7];
                                                            objArr4[0] = numValueOf7;
                                                            objArr4[1] = numValueOf8;
                                                            objArr4[c2] = strM27849;
                                                            objArr4[c] = str;
                                                            objArr4[4] = strM27844;
                                                            objArr4[5] = str2;
                                                            objArr4[6] = strM27845;
                                                            interfaceC2148.mo7092("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr4);
                                                        }
                                                        i4 = 3;
                                                        i = 2;
                                                        c4 = 7;
                                                        i2 = 4;
                                                        c3 = 11;
                                                    }
                                                } catch (Exception unused6) {
                                                    bArr3 = bArr2;
                                                }
                                            } catch (Exception unused7) {
                                                c = 3;
                                                c2 = 2;
                                                bArr = null;
                                                bArr2 = null;
                                                bArr3 = null;
                                                interfaceC2148.mo7103(m27844(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                if (interfaceC2148.mo7086()) {
                                                    Integer numValueOf9 = Integer.valueOf(b);
                                                    Integer numValueOf10 = Integer.valueOf(b2);
                                                    String strM278410 = m27844(bArr2);
                                                    if (bArr3 != bArr2) {
                                                        str = " wakeup MAC address: ";
                                                    } else {
                                                        str = "";
                                                    }
                                                    if (bArr3 != bArr2) {
                                                        strM27844 = m27844(bArr3);
                                                    } else {
                                                        strM27844 = "";
                                                    }
                                                    if (bArr != null) {
                                                        str2 = " password: ";
                                                    } else {
                                                        str2 = "";
                                                    }
                                                    if (bArr != null) {
                                                        strM27845 = m27844(bArr);
                                                    } else {
                                                        strM27845 = "";
                                                    }
                                                    Object[] objArr5 = new Object[7];
                                                    objArr5[0] = numValueOf9;
                                                    objArr5[1] = numValueOf10;
                                                    objArr5[c2] = strM278410;
                                                    objArr5[c] = str;
                                                    objArr5[4] = strM27844;
                                                    objArr5[5] = str2;
                                                    objArr5[6] = strM27845;
                                                    interfaceC2148.mo7092("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr5);
                                                }
                                                i4 = 3;
                                                i = 2;
                                                c4 = 7;
                                                i2 = 4;
                                                c3 = 11;
                                            }
                                        } catch (Exception unused8) {
                                            c = 3;
                                            c2 = 2;
                                            b2 = 0;
                                            bArr = null;
                                            bArr2 = null;
                                            bArr3 = null;
                                            interfaceC2148.mo7103(m27844(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                            if (interfaceC2148.mo7086()) {
                                                Integer numValueOf11 = Integer.valueOf(b);
                                                Integer numValueOf12 = Integer.valueOf(b2);
                                                String strM278411 = m27844(bArr2);
                                                if (bArr3 != bArr2) {
                                                    str = " wakeup MAC address: ";
                                                } else {
                                                    str = "";
                                                }
                                                if (bArr3 != bArr2) {
                                                    strM27844 = m27844(bArr3);
                                                } else {
                                                    strM27844 = "";
                                                }
                                                if (bArr != null) {
                                                    str2 = " password: ";
                                                } else {
                                                    str2 = "";
                                                }
                                                if (bArr != null) {
                                                    strM27845 = m27844(bArr);
                                                } else {
                                                    strM27845 = "";
                                                }
                                                Object[] objArr6 = new Object[7];
                                                objArr6[0] = numValueOf11;
                                                objArr6[1] = numValueOf12;
                                                objArr6[c2] = strM278411;
                                                objArr6[c] = str;
                                                objArr6[4] = strM27844;
                                                objArr6[5] = str2;
                                                objArr6[6] = strM27845;
                                                interfaceC2148.mo7092("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr6);
                                            }
                                            i4 = 3;
                                            i = 2;
                                            c4 = 7;
                                            i2 = 4;
                                            c3 = 11;
                                        }
                                    } catch (Exception unused9) {
                                        b = 0;
                                    }
                                    if (interfaceC2148.mo7086()) {
                                        Integer numValueOf13 = Integer.valueOf(b);
                                        Integer numValueOf14 = Integer.valueOf(b2);
                                        String strM278412 = m27844(bArr2);
                                        if (bArr3 != bArr2) {
                                            str = " wakeup MAC address: ";
                                        } else {
                                            str = "";
                                        }
                                        if (bArr3 != bArr2) {
                                            strM27844 = m27844(bArr3);
                                        } else {
                                            strM27844 = "";
                                        }
                                        if (bArr != null) {
                                            str2 = " password: ";
                                        } else {
                                            str2 = "";
                                        }
                                        if (bArr != null) {
                                            strM27845 = m27844(bArr);
                                        } else {
                                            strM27845 = "";
                                        }
                                        Object[] objArr7 = new Object[7];
                                        objArr7[0] = numValueOf13;
                                        objArr7[1] = numValueOf14;
                                        objArr7[c2] = strM278412;
                                        objArr7[c] = str;
                                        objArr7[4] = strM27844;
                                        objArr7[5] = str2;
                                        objArr7[6] = strM27845;
                                        interfaceC2148.mo7092("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr7);
                                    }
                                    break;
                                } else if (i5 == i || i5 == i4 || i5 == i2) {
                                    if (interfaceC2148.mo7086()) {
                                        interfaceC2148.mo7082("There was an OPT answer. Option code: {} data: {}", enumC10217M25644, m27844(bArr7));
                                    }
                                } else if (i5 == 5) {
                                    if (iM6856 < 65001 || iM6856 > 65534) {
                                        interfaceC2148.mo7098("There was an OPT answer. Not currently handled. Option code: {} data: {}", Integer.valueOf(iM6856), m27844(bArr7));
                                    } else {
                                        interfaceC2148.mo7082("There was an OPT answer using an experimental/local option code: {} data: {}", Integer.valueOf(iM6856), m27844(bArr7));
                                    }
                                }
                                i4 = 3;
                                i = 2;
                                c4 = 7;
                                i2 = 4;
                                c3 = 11;
                            } else {
                                interfaceC2148.mo7104("There was a problem reading the OPT record. Ignoring.");
                            }
                        } else {
                            interfaceC2148.mo7104("There was a problem reading the OPT record. Ignoring.");
                        }
                    }
                } else {
                    interfaceC2148.mo7098("There was an OPT answer. Wrong version number: {} result code: {}", Integer.valueOf(i3), enumC22916M51004);
                }
                r10 = c5609;
                break;
            default:
                interfaceC2148.mo7100(enumC11628M28518, "DNSIncoming() unknown type: {}");
                c2081.skip(iM6855);
                r10 = c5609;
                break;
        }
        if (r10 != 0) {
            r10.m50538(inetAddress);
        }
        return r10;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m27849() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append(toString());
        sb2.append("\n");
        for (C19015 c19015 : this.f56922) {
            sb2.append("\tquestion:      ");
            sb2.append(c19015);
            sb2.append("\n");
        }
        for (AbstractC22542 abstractC22542 : this.f56917) {
            sb2.append("\tanswer:        ");
            sb2.append(abstractC22542);
            sb2.append("\n");
        }
        for (AbstractC22542 abstractC22543 : this.f56919) {
            sb2.append("\tauthoritative: ");
            sb2.append(abstractC22543);
            sb2.append("\n");
        }
        for (AbstractC22542 abstractC22544 : this.f56916) {
            sb2.append("\tadditional:    ");
            sb2.append(abstractC22544);
            sb2.append("\n");
        }
        sb.append(sb2.toString());
        DatagramPacket datagramPacket = this.f33729;
        int length = datagramPacket.getLength();
        byte[] bArr = new byte[length];
        System.arraycopy(datagramPacket.getData(), 0, bArr, 0, length);
        StringBuilder sb3 = new StringBuilder(OpenAuthTask.SYS_ERR);
        int i = 0;
        while (i < length) {
            int iMin = Math.min(32, length - i);
            if (i < 16) {
                sb3.append(' ');
            }
            if (i < 256) {
                sb3.append(' ');
            }
            if (i < 4096) {
                sb3.append(' ');
            }
            sb3.append(Integer.toHexString(i));
            sb3.append(':');
            int i2 = 0;
            while (i2 < iMin) {
                if (i2 % 8 == 0) {
                    sb3.append(' ');
                }
                int i3 = i + i2;
                sb3.append(Integer.toHexString((bArr[i3] & 240) >> 4));
                sb3.append(Integer.toHexString(bArr[i3] & 15));
                i2++;
            }
            if (i2 < 32) {
                while (i2 < 32) {
                    if (i2 % 8 == 0) {
                        sb3.append(' ');
                    }
                    sb3.append(EnumC0121.f1143);
                    i2++;
                }
            }
            sb3.append(ASN1Dump.TAB);
            for (int i4 = 0; i4 < iMin; i4++) {
                if (i4 % 8 == 0) {
                    sb3.append(' ');
                }
                int i5 = bArr[i + i4] & 255;
                sb3.append((i5 <= 32 || i5 >= 127) ? '.' : (char) i5);
            }
            sb3.append("\n");
            i += 32;
            if (i >= 2048) {
                sb3.append("....\n");
                break;
            }
        }
        sb.append(sb3.toString());
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m42653() ? "dns[query," : "dns[response,");
        DatagramPacket datagramPacket = this.f33729;
        if (datagramPacket.getAddress() != null) {
            sb.append(datagramPacket.getAddress().getHostAddress());
        }
        sb.append(':');
        sb.append(datagramPacket.getPort());
        sb.append(", length=");
        sb.append(datagramPacket.getLength());
        sb.append(", id=0x");
        sb.append(Integer.toHexString(m42660()));
        if (m42658() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(m42658()));
            if ((m42658() & 32768) != 0) {
                sb.append(":r");
            }
            if ((m42658() & 1024) != 0) {
                sb.append(":aa");
            }
            if ((m42658() & 512) != 0) {
                sb.append(":tc");
            }
        }
        List<C19015> list = this.f56922;
        if (list.size() > 0) {
            sb.append(", questions=");
            sb.append(list.size());
        }
        List<AbstractC22542> list2 = this.f56917;
        if (list2.size() > 0) {
            sb.append(", answers=");
            sb.append(list2.size());
        }
        List<AbstractC22542> list3 = this.f56919;
        if (list3.size() > 0) {
            sb.append(", authorities=");
            sb.append(list3.size());
        }
        List<AbstractC22542> list4 = this.f56916;
        if (list4.size() > 0) {
            sb.append(", additionals=");
            sb.append(list4.size());
        }
        if (list.size() > 0) {
            sb.append("\nquestions:");
            for (C19015 c19015 : list) {
                sb.append("\n\t");
                sb.append(c19015);
            }
        }
        if (list2.size() > 0) {
            sb.append("\nanswers:");
            for (AbstractC22542 abstractC22542 : list2) {
                sb.append("\n\t");
                sb.append(abstractC22542);
            }
        }
        if (list3.size() > 0) {
            sb.append("\nauthorities:");
            for (AbstractC22542 abstractC22543 : list3) {
                sb.append("\n\t");
                sb.append(abstractC22543);
            }
        }
        if (list4.size() > 0) {
            sb.append("\nadditionals:");
            for (AbstractC22542 abstractC22544 : list4) {
                sb.append("\n\t");
                sb.append(abstractC22544);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27846(C11254 c11254) {
        if (m42653() && m42657() && c11254.m42653()) {
            this.f56922.addAll(c11254.f56922);
            this.f56917.addAll(c11254.f56917);
            this.f56919.addAll(c11254.f56919);
            this.f56916.addAll(c11254.f56916);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m27847() {
        return (int) (System.currentTimeMillis() - this.f33728);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m27848() {
        return this.f33727;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m27844(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            char[] cArr = f33723;
            sb.append(cArr[i / 16]);
            sb.append(cArr[i % 16]);
        }
        return sb.toString();
    }
}
