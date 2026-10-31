package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩷ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20826 extends AbstractC11817 {

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f67402 = 0;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public C8289 f67403;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public C13269 f67404;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public C18167 f67405;

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public C9016 f67406;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public C7419 f67407;

    /* JADX INFO: renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public C9722 f67408;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public C7419 f67409;

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public int f67410;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C7419 f67411;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public C10448 f67412;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC20758 f67413;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C22301 f67414;

    /* JADX INFO: renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public int f67415;

    /* JADX INFO: renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public int f67416;

    /* JADX INFO: renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public C11838 f67417;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public C6214 f67418;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public String f67419;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public C7419 f67420;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public int[] f67421;

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public C23832 f67422;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public boolean f67423;

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public String f67424;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public C18188 f67425;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f67426;

    public C20826(AbstractC19898 abstractC19898) {
        super(abstractC19898);
        this.f67426 = false;
        this.f67423 = false;
        this.f67414 = new C22301();
        this.f67419 = "";
        this.f67424 = "";
        this.f67410 = 0;
        this.f67417 = null;
        this.f67413 = null;
        this.f35252 = "ClassData";
        this.f35255 = abstractC19898;
        abstractC19898.m45778("printOptions=".concat(C11133.m27613()), new Object[0]);
        C10242 c10242 = new C10242(this);
        this.f35257 = this;
        this.f35264 = c10242;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47640(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f35255.m45778(C19370.m44628(unsignedShort, "fields=#"), new Object[0]);
        this.f67407 = new C7419(this, C6878.class, unsignedShort);
        for (int i = 0; i < unsignedShort; i++) {
            final C6878 c6878 = new C6878(this);
            c6878.f21254 = -1;
            c6878.f35252 = "FieldData";
            this.f35255.m45778(C19370.m44628(i, "  FieldData: #"), new Object[0]);
            c6878.f35254 = dataInputStream.readUnsignedShort();
            c6878.f21255 = dataInputStream.readUnsignedShort();
            c6878.f21253 = dataInputStream.readUnsignedShort();
            c6878.m28904(dataInputStream);
            c6878.f35255.m45762(new Supplier() { // from class: l.ܳܽ֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    C6878 c6879 = c6878;
                    Integer numValueOf = Integer.valueOf(c6879.f21255);
                    String strM25965 = ((C20826) c6879.f35257).f35264.m25965(c6879.f21255, new C22536(6));
                    Integer numValueOf2 = Integer.valueOf(c6879.f21253);
                    String strM25966 = ((C20826) c6879.f35257).f35264.m25965(c6879.f21253, new C17576(8));
                    Object obj = c6879.f35266;
                    if (obj == null) {
                        obj = "";
                    }
                    return String.format("FieldData: name[%d]=%s type[%d]=%s%s", numValueOf, strM25965, numValueOf2, strM25966, obj);
                }
            });
            this.f67407.m19942((AbstractC9701) c6878);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m47642(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f35255.m45778(C19370.m44628(unsignedShort, "methods=#"), new Object[0]);
        this.f67409 = new C7419(this, C17503.class, unsignedShort);
        for (int i = 0; i < unsignedShort; i++) {
            C17503 c17503 = new C17503(this);
            this.f35255.m45778(C19370.m44628(i, "MethodData: #"), new Object[0]);
            c17503.f35254 = dataInputStream.readUnsignedShort();
            c17503.f53467 = dataInputStream.readUnsignedShort();
            c17503.f53474 = dataInputStream.readUnsignedShort();
            c17503.f35255.m45762(new C13932(c17503, 0));
            c17503.m28904(dataInputStream);
            this.f67409.m19942((AbstractC9701) c17503);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m47641(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f35255.m45778(C19370.m44628(unsignedShort, "interfaces=#"), new Object[0]);
        this.f67421 = new int[unsignedShort];
        for (int i = 0; i < unsignedShort; i++) {
            short s = dataInputStream.readShort();
            this.f35255.m45778(C18307.m42646("  InterfaceCpx[", i, s, "]="), new Object[0]);
            this.f67421[i] = s;
        }
    }

    @Override // l.AbstractC11817
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18620(DataInputStream dataInputStream, EnumC4662 enumC4662, int i) throws IOException {
        this.f67410++;
        switch (C23647.f76598[enumC4662.ordinal()]) {
            case 1:
                if (this.f35266 != null) {
                    this.f35255.mo2245("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "Signature", "ClassFile");
                }
                C6899 c6899 = new C6899(this);
                c6899.m18671(i, dataInputStream);
                this.f35266 = c6899;
                return true;
            case 2:
                if (this.f67406 != null) {
                    this.f35255.mo2245("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "SourceFile", "ClassFile");
                }
                C9016 c9016 = new C9016(this, EnumC0970.SOURCE_FILE);
                c9016.m28148(i, dataInputStream);
                this.f67406 = c9016;
                return true;
            case 3:
                if (this.f67405 != null) {
                    this.f35255.mo2245("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "EnclosingMethod", "ClassFile");
                }
                C18167 c18167 = new C18167(this, EnumC0970.ENCLOSING_METHOD);
                c18167.m28148(i, dataInputStream);
                this.f67405 = c18167;
                return true;
            case 4:
                C9722 c9722 = new C9722(this.f29325);
                c9722.f29468 = C18486.m42978(i, 76 - c9722.m24656(), dataInputStream);
                this.f67408 = c9722;
                return true;
            case 5:
                int unsignedShort = dataInputStream.readUnsignedShort();
                if ((unsignedShort * 8) + 2 != i) {
                    if (!this.f29352) {
                        throw new C4375(this.f35255.m45770(), "{0}: Invalid attribute length #{1}", "InnerClasses_attribute", Integer.valueOf(i));
                    }
                    this.f35255.m45770().mo32596("{0}: Invalid attribute length #{1}", "InnerClasses_attribute", Integer.valueOf(i));
                }
                C7419 c7419 = new C7419(this, C8995.class, unsignedShort);
                if (!mo24649()) {
                    boolean z = this.f29343;
                }
                this.f67420 = c7419;
                c7419.f29349 = this.f29349;
                for (int i2 = 0; i2 < unsignedShort; i2++) {
                    C8995 c8995 = new C8995(this, this.f67420);
                    c8995.f27329 = dataInputStream.readUnsignedShort();
                    c8995.f27333 = dataInputStream.readUnsignedShort();
                    c8995.f27328 = dataInputStream.readUnsignedShort();
                    c8995.f27332 = dataInputStream.readUnsignedShort();
                    this.f67420.m19942(c8995);
                }
                return true;
            case 6:
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                C7419 c74110 = new C7419(this, C13500.class, unsignedShort2);
                this.f67411 = c74110;
                c74110.f29349 = this.f29349;
                for (int i3 = 0; i3 < unsignedShort2; i3++) {
                    C13500 c13500 = new C13500(this, this.f67411);
                    c13500.f29348 = EnumC0970.BOOTSTRAP_METHOD;
                    c13500.f40310 = this.f29335 ? 7 : 7 - c13500.m24669();
                    c13500.f40311 = dataInputStream.readUnsignedShort();
                    c13500.f40309 = dataInputStream.readUnsignedShort();
                    c13500.f40312 = new ArrayList(c13500.f40309);
                    for (int i4 = 0; i4 < c13500.f40309; i4++) {
                        c13500.f40312.add(Integer.valueOf(dataInputStream.readUnsignedShort()));
                    }
                    this.f67411.m19942(c13500);
                }
                return true;
            case 7:
                C13269 c13269 = new C13269(this);
                this.f67404 = c13269;
                c13269.m32234(dataInputStream);
                return true;
            case 8:
                C10448 c10448 = new C10448(this, EnumC0970.NEST_HOST);
                c10448.m28148(i, dataInputStream);
                this.f67412 = c10448;
                return true;
            case 9:
                EnumC15204 enumC15204 = EnumC15204.f46480;
                C6214 c6214 = new C6214(this);
                c6214.f21950 = enumC15204;
                c6214.f29348 = EnumC0970.NEST_MEMBERS;
                c6214.m19181(i, dataInputStream);
                this.f67418 = c6214;
                return true;
            case 10:
                C23832 c23832 = new C23832(this);
                c23832.f29348 = EnumC0970.RECORD_DATA;
                c23832.m52517(dataInputStream);
                this.f67422 = c23832;
                return true;
            case 11:
                EnumC15204 enumC15205 = EnumC15204.f46570;
                C18188 c18188 = new C18188(this);
                c18188.f21950 = enumC15205;
                c18188.m19181(i, dataInputStream);
                this.f67425 = c18188;
                return true;
            case 12:
                EnumC15204 enumC15206 = EnumC15204.f46589;
                C8289 c8289 = new C8289(this);
                c8289.f21950 = enumC15206;
                c8289.m19181(i, dataInputStream);
                this.f67403 = c8289;
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47638(DataInputStream dataInputStream, InterfaceC20758 interfaceC20758) throws IOException {
        C22301 c22301 = this.f67414;
        this.f67413 = interfaceC20758;
        try {
            int i = dataInputStream.readInt();
            if (i != -889275714) {
                this.f35255.mo2245("The magic number identifying the class file format is expected to be {0}. The invalid magic number {1} will be ignored.", C23424.m51889(-889275714), C23424.m51889(i));
            }
            c22301.m50040(dataInputStream.readUnsignedShort());
            c22301.m50036(dataInputStream.readUnsignedShort());
            C10242 c10242 = this.f35264;
            c10242.m25958(dataInputStream);
            c10242.m25954();
            this.f35254 = dataInputStream.readUnsignedShort();
            this.f67415 = dataInputStream.readUnsignedShort();
            this.f67416 = dataInputStream.readUnsignedShort();
            AbstractC19898 abstractC19898 = this.f35255;
            Integer numValueOf = Integer.valueOf(this.f35254);
            int i2 = this.f35254;
            abstractC19898.m45778("0x%04X [ %s] this_cpx=%d super_cpx=%d", numValueOf, EnumC6073.m16951(i2, EnumC6073.m16939(i2) ? EnumC20185.CLASS : EnumC20185.MODULE), Integer.valueOf(this.f67415), Integer.valueOf(this.f67416));
            m47641(dataInputStream);
            m47640(dataInputStream);
            m47642(dataInputStream);
            m28904(dataInputStream);
            m47637(this.f67415);
            this.f35255.m45778("\n<< Reading is done >>", new Object[0]);
            if (c22301.m50041()) {
                EnumC6073.m16935(EnumC20185.VALUE_OBJECTS);
            }
        } catch (EOFException unused) {
            this.f35255.mo11946("The end of the file was unexpectedly reached while reading class data", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m47637(int i) {
        String strM25960 = this.f35264.m25960(i);
        this.f67419 = strM25960;
        int iLastIndexOf = strM25960.lastIndexOf(47);
        if (iLastIndexOf != -1) {
            this.f67424 = this.f67419.substring(0, iLastIndexOf);
            this.f67419.substring(iLastIndexOf + 1);
        }
        C9016 c9016 = this.f67406;
        if (c9016 != null) {
            c9016.f34065 = c9016.f34059.m25965(c9016.f34056, new C22536(7));
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m47639(int i) {
        C11838 c11838 = this.f67417;
        if (c11838 == null) {
            return null;
        }
        try {
            InterfaceC20758 interfaceC20758 = c11838.f35317;
            List list = c11838.f35318;
            if (list != null) {
                if (i >= 1 && i < list.size()) {
                    return (String) list.get(i - 1);
                }
                return String.format("Line number %d is out of range in \"%s\"", Integer.valueOf(i), interfaceC20758);
            }
            return String.format("\"%s\" not found", interfaceC20758);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return String.format("Line number %d is out of bounds", Integer.valueOf(i));
        }
    }

    @Override // l.AbstractC11817
    /* JADX INFO: renamed from: ֫ */
    public final void mo7967(List... listArr) {
        for (List<C6445> list : listArr) {
            if (list != null) {
                for (C6445 c6445 : list) {
                    c6445.m24648();
                    c6445.mo3021();
                    m24667();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m47643() {
        if (!this.f67426 && this.f67423) {
            try {
                mo3021();
            } catch (Exception unused) {
            }
        }
        try {
            this.f35255.m45780().mo1971(this.f67419);
        } catch (IOException unused2) {
        }
        this.f35255.m45774().flush();
    }

    @Override // l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ۧ */
    public final void mo3021() {
        int i;
        char c;
        C9016 c9016;
        String strMo23264;
        String strM50967;
        Date dateFrom;
        byte[] bArrDigest;
        EnumC6714 enumC6714M18268 = EnumC6714.m18268(this.f67419, this.f35254);
        EnumC6714 enumC6714 = EnumC6714.MODULE_INFO;
        boolean z = this.f29337;
        String str = "{";
        C22301 c22301 = this.f67414;
        if (enumC6714M18268 == enumC6714) {
            mo7967(this.f35265, this.f35259);
            if (this.f67404 == null) {
                this.f67404 = new C13269(this);
            }
            m24654(this.f67404.m32236("version ".concat(c22301.m50035())));
            m24667();
            m24662("{");
            if (z) {
                this.f35264.mo3021();
            }
            this.f67423 = true;
            this.f67404.mo3021();
            m24654("} // end of module " + this.f67404.m32235());
            if (this.f67404.m32233() != null) {
                m24654("@" + this.f67404.m32233());
            }
            m24667();
            mo7967(this.f35265, this.f35259);
            mo7967(this.f35263, this.f35267);
            if (!this.f67424.isEmpty()) {
                m24662(C20087.m46306("package ", this.f67424, " version ", c22301.m50035(), l.b));
            }
        } else {
            if (this.f29329) {
                InterfaceC23712 interfaceC23712M45772 = this.f35255.m45772();
                String strM25966 = this.f35264.m25966(this.f67415, "<invalid this_cpx #%d>");
                boolean zM16948 = EnumC6073.m16948(this.f35254);
                m24662("/**");
                if (interfaceC23712M45772 instanceof C16656) {
                    m24662(" *  Classfile " + this.f67413.toAbsolutePath());
                    dateFrom = new Date(this.f67413.toFile().lastModified());
                } else {
                    String string = this.f67413.toString();
                    m24662(" *  Classfile " + string.substring(string.lastIndexOf(47) + 1));
                    dateFrom = C4672.from(C19056.now().atStartOfDay(AbstractC5650.systemDefault()).toInstant());
                }
                DateFormat dateInstance = DateFormat.getDateInstance();
                int size = interfaceC23712M45772.getSize();
                String str2 = AbstractC9701.f29321;
                if (size > 0) {
                    m24666(C4860.m14172(" *  ", str2, "Last modified %s; size %d bytes"), dateInstance.format(dateFrom), Integer.valueOf(size));
                } else {
                    m24666(C4860.m14172(" *  ", str2, "Last modified %s"), dateInstance.format(dateFrom));
                }
                MessageDigest messageDigestMo6122 = interfaceC23712M45772.mo6122();
                if (messageDigestMo6122 != null && (bArrDigest = messageDigestMo6122.digest()) != null) {
                    StringBuilder sb = new StringBuilder();
                    int length = bArrDigest.length;
                    int i2 = 0;
                    while (i2 < length) {
                        sb.append(String.format("%02x", Byte.valueOf(bArrDigest[i2])));
                        i2++;
                        length = length;
                        bArrDigest = bArrDigest;
                    }
                    m24662(" *  " + str2 + messageDigestMo6122.getAlgorithm() + " checksum " + ((Object) sb));
                }
                if (zM16948) {
                    m24654(" *  " + EnumC6073.m16932(this.f35254 & (~EnumC6073.f18617.m16978()) & (~EnumC6073.f18607.m16978()), EnumC20185.CLASS) + "interface " + strM25966);
                } else {
                    m24654(" *  " + EnumC6073.m16932(this.f35254 & (~EnumC6073.f18607.m16978()), EnumC20185.CLASS) + "class " + strM25966);
                }
                C6899 c6899 = this.f35266;
                if (c6899 == null) {
                    if (!zM16948 && this.f67416 != 0) {
                        String strM25967 = this.f35264.m25966(this.f67415, "<invalid super_cpx #%d>");
                        if (!strM25967.equals("java.lang.Object")) {
                            m24654(" extends ".concat(strM25967));
                        }
                    }
                    for (int i3 = 0; i3 < this.f67421.length; i3++) {
                        m24654(i3 == 0 ? !zM16948 ? " implements " : " extends " : ",");
                        m24654(this.f35264.m25966(this.f67421[i3], "<invalid interface_cpx #%d>"));
                    }
                    m24667();
                } else {
                    AbstractC8932 abstractC8932M18677 = c6899.m18677();
                    String strM18678 = this.f35266.m18678();
                    if (abstractC8932M18677 instanceof C18104) {
                        m24654(strM18678);
                    } else if (!abstractC8932M18677.mo23045()) {
                        m24654(" extends " + strM18678);
                    }
                    m24667();
                }
                StringBuilder sbM9834 = C3200.m9834(" *  ", str2, "minor version: ");
                sbM9834.append(c22301.m50038());
                m24662(sbM9834.toString());
                m24662(" *  " + str2 + "major version: " + c22301.m50045());
                StringBuilder sb2 = new StringBuilder(" *  ");
                sb2.append(str2);
                sb2.append(String.format("flags: (0x%04x) %s", Integer.valueOf(this.f35254), EnumC6073.m16951(this.f35254, EnumC20185.CLASS)));
                m24662(sb2.toString());
                StringBuilder sb3 = new StringBuilder(" *  ");
                sb3.append(str2);
                int i4 = 0;
                sb3.append("this_class:  " + this.f35264.m25955(this.f67415, new C1775(i4)));
                m24662(sb3.toString());
                StringBuilder sb4 = new StringBuilder(" *  ");
                sb4.append(str2);
                sb4.append("super_class: " + this.f35264.m25955(this.f67416, new C1775(i4)));
                m24662(sb4.toString());
                String strM23341 = C9045.m23341(new StringBuilder(" *  "), str2, "interfaces: %d, fields: %d, methods: %d, attributes: %d");
                i = 1;
                m24666(strM23341, Integer.valueOf(this.f67421.length), Integer.valueOf(this.f67407.f22796.size()), Integer.valueOf(this.f67409.f22796.size()), Integer.valueOf(this.f67410));
                m24662(" */");
            } else {
                str = "{";
                i = 1;
            }
            if (this.f67424.isEmpty()) {
                c = 0;
            } else {
                Object[] objArr = new Object[i];
                c = 0;
                objArr[0] = this.f67424;
                m24662(String.format("package %s;%n", objArr));
            }
            ArrayList arrayList = this.f35265;
            ArrayList arrayList2 = this.f35259;
            List[] listArr = new List[2];
            listArr[c] = arrayList;
            listArr[i] = arrayList2;
            mo7967(listArr);
            ArrayList arrayList3 = this.f35263;
            ArrayList arrayList4 = this.f35267;
            List[] listArr2 = new List[2];
            listArr2[c] = arrayList3;
            listArr2[i] = arrayList4;
            mo7967(listArr2);
            String strM25947 = this.f35264.m25968(this.f67415) ? C10242.m25947(C13573.m32625(this.f35264.m25960(this.f67415)), this.f67424) : "?? invalid index";
            C6899 c68910 = this.f35266;
            C6491 c6491M18670 = c68910 != null ? c68910.m18670(new C18003(this, 0)) : new C6491("", "");
            boolean zM16949 = EnumC6073.m16948(this.f35254);
            boolean z2 = this.f29343;
            boolean z3 = this.f29326;
            if (zM16949) {
                m24654(EnumC6073.m16932(this.f35254 & (~EnumC6073.f18617.m16978()), EnumC20185.CLASS));
                m24654(z3 ? z2 ? String.format("interface #%d%s", Integer.valueOf(this.f67415), c6491M18670.f20042) : String.format("interface #%d%s /* %s%s */", Integer.valueOf(this.f67415), c6491M18670.f20042, strM25947, c6491M18670.f20043) : C20094.m46315("interface ", strM25947));
            } else {
                m24654(EnumC6073.m16932(this.f35254, EnumC20185.CLASS) + m28908());
                m24654(z3 ? z2 ? String.format("class #%d%s", Integer.valueOf(this.f67415), c6491M18670.f20042) : String.format("class #%d%s /* %s%s */", Integer.valueOf(this.f67415), c6491M18670.f20042, strM25947, c6491M18670.f20043) : String.format("class %s%s", strM25947, c6491M18670.f20043));
                if (this.f67415 >= this.f35264.size() || this.f67415 <= 0) {
                    m24654(z3 ? z2 ? String.format(" extends #%d", Integer.valueOf(this.f67416)) : String.format(" extends #%d /* ?? invalid index */", Integer.valueOf(this.f67416)) : " extends ??");
                } else if (!this.f35264.m25960(this.f67416).equals("java/lang/Object")) {
                    m24654(z3 ? z2 ? String.format(" extends #%d", Integer.valueOf(this.f67416)) : String.format(" extends #%d /* %s */", Integer.valueOf(this.f67416), C10242.m25947(C13573.m32625(this.f35264.m25960(this.f67416)), this.f67424)) : C20094.m46315(" extends ", C10242.m25947(C13573.m32625(this.f35264.m25960(this.f67416)), this.f67424)));
                }
            }
            int[] iArr = this.f67421;
            int length2 = iArr.length;
            if (length2 > 0) {
                String str3 = (String) C22311.stream(iArr).mapToObj(new IntFunction() { // from class: l.ܿۧ֨
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i5) {
                        C20826 c20826 = this.f52999;
                        C10242 c10242 = c20826.f35264;
                        return C10242.m25947(C13573.m32625(c10242.m25960(i5)), c20826.f67424);
                    }
                }).collect(C22976.joining(", "));
                if (z3) {
                    String str4 = (String) C22311.stream(this.f67421).mapToObj(new C14474()).collect(C22976.joining(", "));
                    if (z2) {
                        strM50967 = C22870.m50967(length2 > 1 ? "\n" + m24650() : " ", "implements ", str4);
                    } else {
                        strM50967 = (length2 > 1 ? "\n" + m24650() : " ") + "implements " + str4 + " /* " + str3 + " */";
                    }
                } else {
                    strM50967 = C22870.m50967(length2 > 1 ? "\n" + m24650() : " ", "implements ", str3);
                }
                m24654(strM50967);
            }
            m24666("%sversion %s", length2 > 1 ? "\n" + m24650() : " ", c22301.m50035());
            m24662(str);
            C10242 c10242 = this.f35264;
            int i5 = c10242.f29349;
            if (z) {
                c10242.mo3021();
                this.f29349 = i5;
            }
            if (this.f29336 && !this.f29328) {
                if (!z3) {
                    int i6 = 0;
                    m24665("this_class:  " + this.f35264.m25955(this.f67415, new C1775(i6)) + l.b);
                    m24665("super_class: " + this.f35264.m25955(this.f67416, new C1775(i6)) + l.b);
                } else if (z2) {
                    m24659(String.format("this_class:  #%d;", Integer.valueOf(this.f67415)), Integer.valueOf(i5));
                    m24659(String.format("super_class: #%d;", Integer.valueOf(this.f67416)), Integer.valueOf(i5));
                } else {
                    int i7 = 0;
                    int iM24656 = i5 - m24656();
                    m24658(m24657(iM24656, String.format("this_class:  #%d;", Integer.valueOf(this.f67415))));
                    m24662(" // " + this.f35264.m25955(this.f67415, new C1775(i7)));
                    m24658(m24657(iM24656, String.format("super_class: #%d;", Integer.valueOf(this.f67416))));
                    m24662(" // " + this.f35264.m25955(this.f67416, new C1775(i7)));
                }
                m24667();
            }
            this.f67423 = true;
            if (this.f29334 && (c9016 = this.f67406) != null && (strMo23264 = c9016.mo23264()) != null) {
                this.f67417 = new C11838(strMo23264, this.f67413.getParent());
            }
            List list = C22311.stream(new AbstractC9701[]{this.f35266, this.f67406, this.f67405, this.f67408, this.f67422, this.f67412, this.f67420, this.f67418, this.f67425, this.f67403, this.f67411}).filter(new C10948(this)).toList();
            int i8 = this.f29349;
            C7419 c7419 = this.f67407;
            if (c7419 != null && c7419.f22796.size() > 0) {
                c7419.f29349 = i8;
                c7419.mo3021();
                if (C22311.stream(new C7419[]{this.f67409}).anyMatch(new C16591()) && !list.isEmpty()) {
                    m24667();
                }
            }
            int iM24657 = i8 - m24656();
            this.f29349 = iM24657;
            C7419 c74110 = this.f67409;
            if (c74110 != null && c74110.f22796.size() > 0) {
                c74110.f29349 = iM24657;
                c74110.mo3021();
                if (!list.isEmpty()) {
                    m24667();
                }
            }
            int size2 = list.size();
            boolean z4 = false;
            for (int i9 = 0; i9 < size2; i9++) {
                InterfaceC17482 interfaceC17482 = (InterfaceC17482) list.get(i9);
                if (C22311.stream(new InterfaceC17482[]{interfaceC17482}).anyMatch(new C16591())) {
                    if (AbstractC9701.class.isAssignableFrom(interfaceC17482.getClass())) {
                        ((AbstractC9701) interfaceC17482).f29349 = iM24657;
                    }
                    interfaceC17482.mo3021();
                    z4 = true;
                }
                if (z4 && i9 + 1 < size2) {
                    m24667();
                    z4 = false;
                }
            }
            if (z2) {
                m24662(l.d);
            } else {
                m24662("} // end Class " + this.f67419);
            }
            this.f67426 = true;
        }
        List listM25963 = this.f35264.m25963();
        if (listM25963.isEmpty()) {
            return;
        }
        Iterator it = listM25963.iterator();
        while (it.hasNext()) {
            this.f35255.m45761((IOException) it.next());
        }
        throw new C12136();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47636(InterfaceC17482 interfaceC17482) {
        return C22311.stream(new InterfaceC17482[]{interfaceC17482}).anyMatch(new C16591());
    }
}
