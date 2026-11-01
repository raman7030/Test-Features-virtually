package p067l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.List;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۧ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9YE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13065 extends AbstractC19770 {

    /* JADX INFO: renamed from: ۜ */
    public final C4347 f36726;

    /* JADX INFO: renamed from: ۡ */
    public int f36727;

    /* JADX INFO: renamed from: ۢ */
    public final long f36728;

    /* JADX INFO: renamed from: ᩷ */
    public final DatagramPacket f36729;

    /* JADX INFO: renamed from: ۘ */
    public static InterfaceC4410 f36724 = C13128.m30023(C13065.class.getName());

    /* JADX INFO: renamed from: ܺ */
    public static boolean f36725 = true;

    /* JADX INFO: renamed from: ۖ */
    public static final char[] f36723 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13065(DatagramPacket datagramPacket) {
        super(0, 0, datagramPacket.getPort() == C14760.f42090);
        InterfaceC4410 interfaceC4410 = f36724;
        this.f36729 = datagramPacket;
        InetAddress address = datagramPacket.getAddress();
        C4347 c4347 = new C4347(datagramPacket.getData(), datagramPacket.getLength());
        this.f36726 = c4347;
        this.f36728 = System.currentTimeMillis();
        this.f36727 = 1460;
        try {
            try {
                m44916(c4347.m8979());
                m44910(c4347.m8979());
                if (m44920() > 0) {
                    throw new IOException("Received a message with a non standard operation code. Currently unsupported in the specification.");
                }
                int iM8979 = c4347.m8979();
                int iM89710 = c4347.m8979();
                int iM89711 = c4347.m8979();
                int iM89712 = c4347.m8979();
                interfaceC4410.mo9187("DNSIncoming() questions:{} answers:{} authorities:{} additionals:{}", Integer.valueOf(iM8979), Integer.valueOf(iM89710), Integer.valueOf(iM89711), Integer.valueOf(iM89712));
                if (((iM89710 + iM89711 + iM89712) * 11) + (iM8979 * 5) > datagramPacket.getLength()) {
                    throw new IOException("questions:" + iM8979 + " answers:" + iM89710 + " authorities:" + iM89711 + " additionals:" + iM89712);
                }
                if (iM8979 > 0) {
                    for (int i = 0; i < iM8979; i++) {
                        this.f60140.add(m29905());
                    }
                }
                if (iM89710 > 0) {
                    for (int i2 = 0; i2 < iM89710; i2++) {
                        AbstractC23793 abstractC23793M29907 = m29907(address);
                        if (abstractC23793M29907 != null) {
                            this.f60135.add(abstractC23793M29907);
                        }
                    }
                }
                if (iM89711 > 0) {
                    for (int i3 = 0; i3 < iM89711; i3++) {
                        AbstractC23793 abstractC23793M29908 = m29907(address);
                        if (abstractC23793M29908 != null) {
                            this.f60137.add(abstractC23793M29908);
                        }
                    }
                }
                if (iM89712 > 0) {
                    for (int i4 = 0; i4 < iM89712; i4++) {
                        AbstractC23793 abstractC23793M29909 = m29907(address);
                        if (abstractC23793M29909 != null) {
                            this.f60134.add(abstractC23793M29909);
                        }
                    }
                }
                if (this.f36726.available() > 0) {
                    throw new IOException("Received a message with the wrong length.");
                }
                try {
                    this.f36726.close();
                } catch (Exception unused) {
                    interfaceC4410.mo9199("MessageInputStream close error");
                }
            } catch (Throwable th) {
                try {
                    this.f36726.close();
                } catch (Exception unused2) {
                    interfaceC4410.mo9199("MessageInputStream close error");
                }
                throw th;
            }
        } catch (Exception e) {
            interfaceC4410.mo9178("DNSIncoming() dump " + m29911() + "\n exception ", (Throwable) e);
            IOException iOException = new IOException("DNSIncoming corrupted message");
            iOException.initCause(e);
            throw iOException;
        }
    }

    public C13065(int i, int i2, boolean z, DatagramPacket datagramPacket, long j) {
        super(i, i2, z);
        this.f36729 = datagramPacket;
        this.f36726 = new C4347(datagramPacket.getData(), datagramPacket.getLength());
        this.f36728 = j;
    }

    public final C13065 clone() {
        C13065 c13065 = new C13065(m44919(), m44921(), this.f60136, this.f36729, this.f36728);
        c13065.f36727 = this.f36727;
        c13065.f60140.addAll(this.f60140);
        c13065.f60135.addAll(this.f60135);
        c13065.f60137.addAll(this.f60137);
        c13065.f60134.addAll(this.f60134);
        return c13065;
    }

    /* JADX INFO: renamed from: ֡ */
    private C20441 m29905() {
        C4347 c4347 = this.f36726;
        String strM8976 = c4347.m8976();
        EnumC13420 enumC13420M30564 = EnumC13420.m30564(c4347.m8979());
        if (enumC13420M30564 == EnumC13420.TYPE_IGNORE) {
            f36724.mo9198(m29911(), "Could not find record type: {}");
        }
        int iM8979 = c4347.m8979();
        EnumC8055 enumC8055M18724 = EnumC8055.m18724(iM8979);
        return C20441.m46125(strM8976, enumC13420M30564, enumC8055M18724, enumC8055M18724.m18727(iM8979));
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
    /* JADX INFO: renamed from: ֫ */
    private AbstractC23793 m29907(InetAddress inetAddress) throws IOException {
        byte b;
        char c;
        char c2;
        byte b2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        String str;
        String strM29906;
        String str2;
        String strM29907;
        ?? r10;
        C4347 c4347 = this.f36726;
        String strM8976 = c4347.m8976();
        EnumC13420 enumC13420M30564 = EnumC13420.m30564(c4347.m8979());
        EnumC13420 enumC13420 = EnumC13420.TYPE_IGNORE;
        InterfaceC4410 interfaceC4410 = f36724;
        if (enumC13420M30564 == enumC13420) {
            interfaceC4410.mo9193("Could not find record type. domain: {}\n{}", strM8976, m29911());
        }
        int iM8979 = c4347.m8979();
        EnumC13420 enumC13421 = EnumC13420.TYPE_OPT;
        EnumC8055 enumC8055M18724 = enumC13420M30564 == enumC13421 ? EnumC8055.CLASS_UNKNOWN : EnumC8055.m18724(iM8979);
        int i = 2;
        if (enumC8055M18724 == EnumC8055.CLASS_UNKNOWN && enumC13420M30564 != enumC13421) {
            interfaceC4410.mo9179("Could not find record class. domain: {} type: {}\n{}", strM8976, enumC13420M30564, m29911());
        }
        boolean zM18727 = enumC8055M18724.m18727(iM8979);
        int iM89710 = (c4347.m8979() << 16) | c4347.m8979();
        int iM89711 = c4347.m8979();
        char c3 = 11;
        char c4 = 7;
        Object c7700 = null;
        int i2 = 4;
        switch (C9317.f25335[enumC13420M30564.ordinal()]) {
            case 1:
                byte[] bArr4 = new byte[iM89711];
                c4347.read(bArr4, 0, iM89711);
                c7700 = new C7700(strM8976, EnumC13420.TYPE_A, enumC8055M18724, zM18727, iM89710, bArr4);
                r10 = c7700;
                break;
            case 2:
                byte[] bArr5 = new byte[iM89711];
                c4347.read(bArr5, 0, iM89711);
                if (bArr5[0] == 0 && bArr5[1] == 0 && bArr5[2] == 0 && bArr5[3] == 0 && bArr5[4] == 0 && bArr5[5] == 0 && bArr5[6] == 0 && bArr5[7] == 0 && bArr5[8] == 0 && bArr5[9] == 0 && bArr5[10] == -1 && bArr5[11] == -1) {
                    interfaceC4410.mo9198(strM8976, "AAAA record with IPv4-mapped address for {}");
                } else {
                    c7700 = new C3676(strM8976, EnumC13420.TYPE_AAAA, enumC8055M18724, zM18727, iM89710, bArr5);
                }
                r10 = c7700;
                break;
            case 3:
            case 4:
                String strM8977 = c4347.m8976();
                if (strM8977.length() > 0) {
                    c7700 = new C10382(strM8976, enumC8055M18724, zM18727, iM89710, strM8977);
                } else {
                    interfaceC4410.mo9193("PTR record of class: {}, there was a problem reading the service name of the answer for domain: {}", enumC8055M18724, strM8976);
                }
                r10 = c7700;
                break;
            case 5:
                byte[] bArr6 = new byte[iM89711];
                c4347.read(bArr6, 0, iM89711);
                c7700 = new C23123(strM8976, enumC8055M18724, zM18727, iM89710, bArr6);
                r10 = c7700;
                break;
            case 6:
                c7700 = new C17086(strM8976, enumC8055M18724, zM18727, iM89710, c4347.m8979(), c4347.m8979(), c4347.m8979(), f36725 ? c4347.m8976() : c4347.m8977(c4347.m8978()));
                r10 = c7700;
                break;
            case 7:
                StringBuilder sb = new StringBuilder();
                sb.append(c4347.m8977(iM89711));
                int iIndexOf = sb.indexOf(" ");
                String strTrim = (iIndexOf > 0 ? sb.substring(0, iIndexOf) : sb.toString()).trim();
                String strTrim2 = (iIndexOf > 0 ? sb.substring(iIndexOf + 1) : "").trim();
                C3005 c3005 = new C3005(strM8976, EnumC13420.TYPE_HINFO, enumC8055M18724, zM18727, iM89710);
                c3005.f5354 = strTrim;
                c3005.f5355 = strTrim2;
                r10 = c3005;
                break;
            case 8:
                EnumC24148 enumC24148M53395 = EnumC24148.m53395(m44919(), iM89710);
                int i3 = (16711680 & iM89710) >> 16;
                if (i3 == 0) {
                    this.f36727 = iM8979;
                    int i4 = 3;
                    while (c4347.available() > 0) {
                        if (c4347.available() >= i) {
                            int iM89712 = c4347.m8979();
                            EnumC12079 enumC12079M27666 = EnumC12079.m27666(iM89712);
                            if (c4347.available() >= i) {
                                int iM89713 = c4347.m8979();
                                byte[] bArr7 = new byte[0];
                                if (c4347.available() >= iM89713) {
                                    bArr7 = new byte[iM89713];
                                    c4347.read(bArr7, 0, iM89713);
                                }
                                int i5 = C9317.f25334[enumC12079M27666.ordinal()];
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
                                                            interfaceC4410.mo9198(m29906(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                            if (interfaceC4410.mo9181()) {
                                                                Integer numValueOf = Integer.valueOf(b);
                                                                Integer numValueOf2 = Integer.valueOf(b2);
                                                                String strM29908 = m29906(bArr2);
                                                                if (bArr3 != bArr2) {
                                                                    str = " wakeup MAC address: ";
                                                                } else {
                                                                    str = "";
                                                                }
                                                                if (bArr3 != bArr2) {
                                                                    strM29906 = m29906(bArr3);
                                                                } else {
                                                                    strM29906 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    str2 = " password: ";
                                                                } else {
                                                                    str2 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    strM29907 = m29906(bArr);
                                                                } else {
                                                                    strM29907 = "";
                                                                }
                                                                Object[] objArr = new Object[7];
                                                                objArr[0] = numValueOf;
                                                                objArr[1] = numValueOf2;
                                                                objArr[c2] = strM29908;
                                                                objArr[c] = str;
                                                                objArr[4] = strM29906;
                                                                objArr[5] = str2;
                                                                objArr[6] = strM29907;
                                                                interfaceC4410.mo9187("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr);
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
                                                                interfaceC4410.mo9198(m29906(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                                if (interfaceC4410.mo9181()) {
                                                                    Integer numValueOf3 = Integer.valueOf(b);
                                                                    Integer numValueOf4 = Integer.valueOf(b2);
                                                                    String strM29909 = m29906(bArr2);
                                                                    if (bArr3 != bArr2) {
                                                                        str = " wakeup MAC address: ";
                                                                    } else {
                                                                        str = "";
                                                                    }
                                                                    if (bArr3 != bArr2) {
                                                                        strM29906 = m29906(bArr3);
                                                                    } else {
                                                                        strM29906 = "";
                                                                    }
                                                                    if (bArr != null) {
                                                                        str2 = " password: ";
                                                                    } else {
                                                                        str2 = "";
                                                                    }
                                                                    if (bArr != null) {
                                                                        strM29907 = m29906(bArr);
                                                                    } else {
                                                                        strM29907 = "";
                                                                    }
                                                                    Object[] objArr2 = new Object[7];
                                                                    objArr2[0] = numValueOf3;
                                                                    objArr2[1] = numValueOf4;
                                                                    objArr2[c2] = strM29909;
                                                                    objArr2[c] = str;
                                                                    objArr2[4] = strM29906;
                                                                    objArr2[5] = str2;
                                                                    objArr2[6] = strM29907;
                                                                    interfaceC4410.mo9187("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr2);
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
                                                                    interfaceC4410.mo9198(m29906(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                                }
                                                            }
                                                        } catch (Exception unused4) {
                                                            c2 = 2;
                                                            interfaceC4410.mo9198(m29906(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                            if (interfaceC4410.mo9181()) {
                                                                Integer numValueOf5 = Integer.valueOf(b);
                                                                Integer numValueOf6 = Integer.valueOf(b2);
                                                                String strM299010 = m29906(bArr2);
                                                                if (bArr3 != bArr2) {
                                                                    str = " wakeup MAC address: ";
                                                                } else {
                                                                    str = "";
                                                                }
                                                                if (bArr3 != bArr2) {
                                                                    strM29906 = m29906(bArr3);
                                                                } else {
                                                                    strM29906 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    str2 = " password: ";
                                                                } else {
                                                                    str2 = "";
                                                                }
                                                                if (bArr != null) {
                                                                    strM29907 = m29906(bArr);
                                                                } else {
                                                                    strM29907 = "";
                                                                }
                                                                Object[] objArr3 = new Object[7];
                                                                objArr3[0] = numValueOf5;
                                                                objArr3[1] = numValueOf6;
                                                                objArr3[c2] = strM299010;
                                                                objArr3[c] = str;
                                                                objArr3[4] = strM29906;
                                                                objArr3[5] = str2;
                                                                objArr3[6] = strM29907;
                                                                interfaceC4410.mo9187("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr3);
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
                                                        interfaceC4410.mo9198(m29906(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                        if (interfaceC4410.mo9181()) {
                                                            Integer numValueOf7 = Integer.valueOf(b);
                                                            Integer numValueOf8 = Integer.valueOf(b2);
                                                            String strM299011 = m29906(bArr2);
                                                            if (bArr3 != bArr2) {
                                                                str = " wakeup MAC address: ";
                                                            } else {
                                                                str = "";
                                                            }
                                                            if (bArr3 != bArr2) {
                                                                strM29906 = m29906(bArr3);
                                                            } else {
                                                                strM29906 = "";
                                                            }
                                                            if (bArr != null) {
                                                                str2 = " password: ";
                                                            } else {
                                                                str2 = "";
                                                            }
                                                            if (bArr != null) {
                                                                strM29907 = m29906(bArr);
                                                            } else {
                                                                strM29907 = "";
                                                            }
                                                            Object[] objArr4 = new Object[7];
                                                            objArr4[0] = numValueOf7;
                                                            objArr4[1] = numValueOf8;
                                                            objArr4[c2] = strM299011;
                                                            objArr4[c] = str;
                                                            objArr4[4] = strM29906;
                                                            objArr4[5] = str2;
                                                            objArr4[6] = strM29907;
                                                            interfaceC4410.mo9187("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr4);
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
                                                interfaceC4410.mo9198(m29906(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                                if (interfaceC4410.mo9181()) {
                                                    Integer numValueOf9 = Integer.valueOf(b);
                                                    Integer numValueOf10 = Integer.valueOf(b2);
                                                    String strM299012 = m29906(bArr2);
                                                    if (bArr3 != bArr2) {
                                                        str = " wakeup MAC address: ";
                                                    } else {
                                                        str = "";
                                                    }
                                                    if (bArr3 != bArr2) {
                                                        strM29906 = m29906(bArr3);
                                                    } else {
                                                        strM29906 = "";
                                                    }
                                                    if (bArr != null) {
                                                        str2 = " password: ";
                                                    } else {
                                                        str2 = "";
                                                    }
                                                    if (bArr != null) {
                                                        strM29907 = m29906(bArr);
                                                    } else {
                                                        strM29907 = "";
                                                    }
                                                    Object[] objArr5 = new Object[7];
                                                    objArr5[0] = numValueOf9;
                                                    objArr5[1] = numValueOf10;
                                                    objArr5[c2] = strM299012;
                                                    objArr5[c] = str;
                                                    objArr5[4] = strM29906;
                                                    objArr5[5] = str2;
                                                    objArr5[6] = strM29907;
                                                    interfaceC4410.mo9187("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr5);
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
                                            interfaceC4410.mo9198(m29906(bArr7), "Malformed OPT answer. Option code: Owner data: {}");
                                            if (interfaceC4410.mo9181()) {
                                                Integer numValueOf11 = Integer.valueOf(b);
                                                Integer numValueOf12 = Integer.valueOf(b2);
                                                String strM299013 = m29906(bArr2);
                                                if (bArr3 != bArr2) {
                                                    str = " wakeup MAC address: ";
                                                } else {
                                                    str = "";
                                                }
                                                if (bArr3 != bArr2) {
                                                    strM29906 = m29906(bArr3);
                                                } else {
                                                    strM29906 = "";
                                                }
                                                if (bArr != null) {
                                                    str2 = " password: ";
                                                } else {
                                                    str2 = "";
                                                }
                                                if (bArr != null) {
                                                    strM29907 = m29906(bArr);
                                                } else {
                                                    strM29907 = "";
                                                }
                                                Object[] objArr6 = new Object[7];
                                                objArr6[0] = numValueOf11;
                                                objArr6[1] = numValueOf12;
                                                objArr6[c2] = strM299013;
                                                objArr6[c] = str;
                                                objArr6[4] = strM29906;
                                                objArr6[5] = str2;
                                                objArr6[6] = strM29907;
                                                interfaceC4410.mo9187("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr6);
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
                                    if (interfaceC4410.mo9181()) {
                                        Integer numValueOf13 = Integer.valueOf(b);
                                        Integer numValueOf14 = Integer.valueOf(b2);
                                        String strM299014 = m29906(bArr2);
                                        if (bArr3 != bArr2) {
                                            str = " wakeup MAC address: ";
                                        } else {
                                            str = "";
                                        }
                                        if (bArr3 != bArr2) {
                                            strM29906 = m29906(bArr3);
                                        } else {
                                            strM29906 = "";
                                        }
                                        if (bArr != null) {
                                            str2 = " password: ";
                                        } else {
                                            str2 = "";
                                        }
                                        if (bArr != null) {
                                            strM29907 = m29906(bArr);
                                        } else {
                                            strM29907 = "";
                                        }
                                        Object[] objArr7 = new Object[7];
                                        objArr7[0] = numValueOf13;
                                        objArr7[1] = numValueOf14;
                                        objArr7[c2] = strM299014;
                                        objArr7[c] = str;
                                        objArr7[4] = strM29906;
                                        objArr7[5] = str2;
                                        objArr7[6] = strM29907;
                                        interfaceC4410.mo9187("Unhandled Owner OPT version: {} sequence: {} MAC address: {} {}{} {}{}", objArr7);
                                    }
                                    break;
                                } else if (i5 == i || i5 == i4 || i5 == i2) {
                                    if (interfaceC4410.mo9181()) {
                                        interfaceC4410.mo9177("There was an OPT answer. Option code: {} data: {}", enumC12079M27666, m29906(bArr7));
                                    }
                                } else if (i5 == 5) {
                                    if (iM89712 < 65001 || iM89712 > 65534) {
                                        interfaceC4410.mo9193("There was an OPT answer. Not currently handled. Option code: {} data: {}", Integer.valueOf(iM89712), m29906(bArr7));
                                    } else {
                                        interfaceC4410.mo9177("There was an OPT answer using an experimental/local option code: {} data: {}", Integer.valueOf(iM89712), m29906(bArr7));
                                    }
                                }
                                i4 = 3;
                                i = 2;
                                c4 = 7;
                                i2 = 4;
                                c3 = 11;
                            } else {
                                interfaceC4410.mo9199("There was a problem reading the OPT record. Ignoring.");
                            }
                        } else {
                            interfaceC4410.mo9199("There was a problem reading the OPT record. Ignoring.");
                        }
                    }
                } else {
                    interfaceC4410.mo9193("There was an OPT answer. Wrong version number: {} result code: {}", Integer.valueOf(i3), enumC24148M53395);
                }
                r10 = c7700;
                break;
            default:
                interfaceC4410.mo9195(enumC13420M30564, "DNSIncoming() unknown type: {}");
                c4347.skip(iM89711);
                r10 = c7700;
                break;
        }
        if (r10 != 0) {
            r10.m52880(inetAddress);
        }
        return r10;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final String m29911() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append(toString());
        sb2.append("\n");
        for (C20441 c20441 : this.f60140) {
            sb2.append("\tquestion:      ");
            sb2.append(c20441);
            sb2.append("\n");
        }
        for (AbstractC23793 abstractC23793 : this.f60135) {
            sb2.append("\tanswer:        ");
            sb2.append(abstractC23793);
            sb2.append("\n");
        }
        for (AbstractC23793 abstractC23794 : this.f60137) {
            sb2.append("\tauthoritative: ");
            sb2.append(abstractC23794);
            sb2.append("\n");
        }
        for (AbstractC23793 abstractC23795 : this.f60134) {
            sb2.append("\tadditional:    ");
            sb2.append(abstractC23795);
            sb2.append("\n");
        }
        sb.append(sb2.toString());
        DatagramPacket datagramPacket = this.f36729;
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
                    sb3.append(EnumC2483.f3919);
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
        sb.append(m44914() ? "dns[query," : "dns[response,");
        DatagramPacket datagramPacket = this.f36729;
        if (datagramPacket.getAddress() != null) {
            sb.append(datagramPacket.getAddress().getHostAddress());
        }
        sb.append(':');
        sb.append(datagramPacket.getPort());
        sb.append(", length=");
        sb.append(datagramPacket.getLength());
        sb.append(", id=0x");
        sb.append(Integer.toHexString(m44921()));
        if (m44919() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(m44919()));
            if ((m44919() & 32768) != 0) {
                sb.append(":r");
            }
            if ((m44919() & 1024) != 0) {
                sb.append(":aa");
            }
            if ((m44919() & 512) != 0) {
                sb.append(":tc");
            }
        }
        List<C20441> list = this.f60140;
        if (list.size() > 0) {
            sb.append(", questions=");
            sb.append(list.size());
        }
        List<AbstractC23793> list2 = this.f60135;
        if (list2.size() > 0) {
            sb.append(", answers=");
            sb.append(list2.size());
        }
        List<AbstractC23793> list3 = this.f60137;
        if (list3.size() > 0) {
            sb.append(", authorities=");
            sb.append(list3.size());
        }
        List<AbstractC23793> list4 = this.f60134;
        if (list4.size() > 0) {
            sb.append(", additionals=");
            sb.append(list4.size());
        }
        if (list.size() > 0) {
            sb.append("\nquestions:");
            for (C20441 c20441 : list) {
                sb.append("\n\t");
                sb.append(c20441);
            }
        }
        if (list2.size() > 0) {
            sb.append("\nanswers:");
            for (AbstractC23793 abstractC23793 : list2) {
                sb.append("\n\t");
                sb.append(abstractC23793);
            }
        }
        if (list3.size() > 0) {
            sb.append("\nauthorities:");
            for (AbstractC23793 abstractC23794 : list3) {
                sb.append("\n\t");
                sb.append(abstractC23794);
            }
        }
        if (list4.size() > 0) {
            sb.append("\nadditionals:");
            for (AbstractC23793 abstractC23795 : list4) {
                sb.append("\n\t");
                sb.append(abstractC23795);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29908(C13065 c13065) {
        if (m44914() && m44918() && c13065.m44914()) {
            this.f60140.addAll(c13065.f60140);
            this.f60135.addAll(c13065.f60135);
            this.f60137.addAll(c13065.f60137);
            this.f60134.addAll(c13065.f60134);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m29909() {
        return (int) (System.currentTimeMillis() - this.f36728);
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m29910() {
        return this.f36727;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m29906(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            char[] cArr = f36723;
            sb.append(cArr[i / 16]);
            sb.append(cArr[i % 16]);
        }
        return sb.toString();
    }
}
