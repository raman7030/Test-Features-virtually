package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
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
public final class C22161 extends AbstractC13599 {

    /* JADX INFO: renamed from: ۨۧ */
    public static final /* synthetic */ int f70085 = 0;

    /* JADX INFO: renamed from: ֡ۧ */
    public C10246 f70086;

    /* JADX INFO: renamed from: ֨ۧ */
    public C14979 f70087;

    /* JADX INFO: renamed from: ۖۧ */
    public C19634 f70088;

    /* JADX INFO: renamed from: ۗۧ */
    public C10937 f70089;

    /* JADX INFO: renamed from: ۘۧ */
    public C9419 f70090;

    /* JADX INFO: renamed from: ۙۧ */
    public C11608 f70091;

    /* JADX INFO: renamed from: ۚۧ */
    public C9419 f70092;

    /* JADX INFO: renamed from: ۛۧ */
    public int f70093;

    /* JADX INFO: renamed from: ۜۧ */
    public C9419 f70094;

    /* JADX INFO: renamed from: ۠ۧ */
    public C12298 f70095;

    /* JADX INFO: renamed from: ۡۧ */
    public InterfaceC22097 f70096;

    /* JADX INFO: renamed from: ۢۧ */
    public C23563 f70097;

    /* JADX INFO: renamed from: ۤۧ */
    public int f70098;

    /* JADX INFO: renamed from: ۫ۧ */
    public int f70099;

    /* JADX INFO: renamed from: ۬ۧ */
    public C13619 f70100;

    /* JADX INFO: renamed from: ܶۧ */
    public C8274 f70101;

    /* JADX INFO: renamed from: ܺۧ */
    public String f70102;

    /* JADX INFO: renamed from: ᩴۧ */
    public C9419 f70103;

    /* JADX INFO: renamed from: ᩵ۧ */
    public int[] f70104;

    /* JADX INFO: renamed from: ᩶ۧ */
    public C25018 f70105;

    /* JADX INFO: renamed from: ᩷ۧ */
    public boolean f70106;

    /* JADX INFO: renamed from: ᩸ۧ */
    public String f70107;

    /* JADX INFO: renamed from: ᩹ۧ */
    public C19654 f70108;

    /* JADX INFO: renamed from: ᩻ۧ */
    public boolean f70109;

    public C22161(AbstractC21279 abstractC21279) {
        super(abstractC21279);
        this.f70109 = false;
        this.f70106 = false;
        this.f70097 = new C23563();
        this.f70102 = "";
        this.f70107 = "";
        this.f70093 = 0;
        this.f70100 = null;
        this.f70096 = null;
        this.f38254 = "ClassData";
        this.f38257 = abstractC21279;
        abstractC21279.m48090("printOptions=".concat(C12949.m29675()), new Object[0]);
        C12102 c12102 = new C12102(this);
        this.f38259 = this;
        this.f38266 = c12102;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49968(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f38257.m48090(C20778.m46922(unsignedShort, "fields=#"), new Object[0]);
        this.f70090 = new C9419(this, C8905.class, unsignedShort);
        for (int i = 0; i < unsignedShort; i++) {
            final C8905 c8905 = new C8905(this);
            c8905.f24131 = -1;
            c8905.f38254 = "FieldData";
            this.f38257.m48090(C20778.m46922(i, "  FieldData: #"), new Object[0]);
            c8905.f38256 = dataInputStream.readUnsignedShort();
            c8905.f24132 = dataInputStream.readUnsignedShort();
            c8905.f24130 = dataInputStream.readUnsignedShort();
            c8905.m30953(dataInputStream);
            c8905.f38257.m48074(new Supplier() { // from class: l.ܳܽ֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    C8905 c8906 = c8905;
                    Integer numValueOf = Integer.valueOf(c8906.f24132);
                    String strM27987 = ((C22161) c8906.f38259).f38266.m27987(c8906.f24132, new C23787(6));
                    Integer numValueOf2 = Integer.valueOf(c8906.f24130);
                    String strM27988 = ((C22161) c8906.f38259).f38266.m27987(c8906.f24130, new C19073(8));
                    Object obj = c8906.f38268;
                    if (obj == null) {
                        obj = "";
                    }
                    return String.format("FieldData: name[%d]=%s type[%d]=%s%s", numValueOf, strM27987, numValueOf2, strM27988, obj);
                }
            });
            this.f70090.m21916((AbstractC11588) c8905);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m49970(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f38257.m48090(C20778.m46922(unsignedShort, "methods=#"), new Object[0]);
        this.f70092 = new C9419(this, C19003.class, unsignedShort);
        for (int i = 0; i < unsignedShort; i++) {
            C19003 c19003 = new C19003(this);
            this.f38257.m48090(C20778.m46922(i, "MethodData: #"), new Object[0]);
            c19003.f38256 = dataInputStream.readUnsignedShort();
            c19003.f56657 = dataInputStream.readUnsignedShort();
            c19003.f56664 = dataInputStream.readUnsignedShort();
            c19003.f38257.m48074(new C15609(c19003, 0));
            c19003.m30953(dataInputStream);
            this.f70092.m21916((AbstractC11588) c19003);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m49969(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f38257.m48090(C20778.m46922(unsignedShort, "interfaces=#"), new Object[0]);
        this.f70104 = new int[unsignedShort];
        for (int i = 0; i < unsignedShort; i++) {
            short s = dataInputStream.readShort();
            this.f38257.m48090(C19768.m44907("  InterfaceCpx[", i, s, "]="), new Object[0]);
            this.f70104[i] = s;
        }
    }

    @Override // p067l.AbstractC13599
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20569(DataInputStream dataInputStream, EnumC6799 enumC6799, int i) throws IOException {
        this.f70093++;
        switch (C24842.f79344[enumC6799.ordinal()]) {
            case 1:
                if (this.f38268 != null) {
                    this.f38257.mo4612("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "Signature", "ClassFile");
                }
                C8925 c8925 = new C8925(this);
                c8925.m20620(i, dataInputStream);
                this.f38268 = c8925;
                return true;
            case 2:
                if (this.f70089 != null) {
                    this.f38257.mo4612("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "SourceFile", "ClassFile");
                }
                C10937 c10937 = new C10937(this, EnumC3290.SOURCE_FILE);
                c10937.m30192(i, dataInputStream);
                this.f70089 = c10937;
                return true;
            case 3:
                if (this.f70088 != null) {
                    this.f38257.mo4612("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "EnclosingMethod", "ClassFile");
                }
                C19634 c19634 = new C19634(this, EnumC3290.ENCLOSING_METHOD);
                c19634.m30192(i, dataInputStream);
                this.f70088 = c19634;
                return true;
            case 4:
                C11608 c11608 = new C11608(this.f32274);
                c11608.f32418 = C19937.m45254(i, 76 - c11608.m26670(), dataInputStream);
                this.f70091 = c11608;
                return true;
            case 5:
                int unsignedShort = dataInputStream.readUnsignedShort();
                if ((unsignedShort * 8) + 2 != i) {
                    if (!this.f32301) {
                        throw new C6526(this.f38257.m48082(), "{0}: Invalid attribute length #{1}", "InnerClasses_attribute", Integer.valueOf(i));
                    }
                    this.f38257.m48082().mo34699("{0}: Invalid attribute length #{1}", "InnerClasses_attribute", Integer.valueOf(i));
                }
                C9419 c9419 = new C9419(this, C10917.class, unsignedShort);
                if (!mo26663()) {
                    boolean z = this.f32292;
                }
                this.f70103 = c9419;
                c9419.f32298 = this.f32298;
                for (int i2 = 0; i2 < unsignedShort; i2++) {
                    C10917 c10917 = new C10917(this, this.f70103);
                    c10917.f30263 = dataInputStream.readUnsignedShort();
                    c10917.f30267 = dataInputStream.readUnsignedShort();
                    c10917.f30262 = dataInputStream.readUnsignedShort();
                    c10917.f30266 = dataInputStream.readUnsignedShort();
                    this.f70103.m21916(c10917);
                }
                return true;
            case 6:
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                C9419 c94110 = new C9419(this, C15198.class, unsignedShort2);
                this.f70094 = c94110;
                c94110.f32298 = this.f32298;
                for (int i3 = 0; i3 < unsignedShort2; i3++) {
                    C15198 c15198 = new C15198(this, this.f70094);
                    c15198.f32297 = EnumC3290.BOOTSTRAP_METHOD;
                    c15198.f43380 = this.f32284 ? 7 : 7 - c15198.m26683();
                    c15198.f43381 = dataInputStream.readUnsignedShort();
                    c15198.f43379 = dataInputStream.readUnsignedShort();
                    c15198.f43382 = new ArrayList(c15198.f43379);
                    for (int i4 = 0; i4 < c15198.f43379; i4++) {
                        c15198.f43382.add(Integer.valueOf(dataInputStream.readUnsignedShort()));
                    }
                    this.f70094.m21916(c15198);
                }
                return true;
            case 7:
                C14979 c14979 = new C14979(this);
                this.f70087 = c14979;
                c14979.m34333(dataInputStream);
                return true;
            case 8:
                C12298 c12298 = new C12298(this, EnumC3290.NEST_HOST);
                c12298.m30192(i, dataInputStream);
                this.f70095 = c12298;
                return true;
            case 9:
                EnumC16818 enumC16818 = EnumC16818.f49605;
                C8274 c8274 = new C8274(this);
                c8274.f24829 = enumC16818;
                c8274.f32297 = EnumC3290.NEST_MEMBERS;
                c8274.m21124(i, dataInputStream);
                this.f70101 = c8274;
                return true;
            case 10:
                C25018 c25018 = new C25018(this);
                c25018.f32297 = EnumC3290.RECORD_DATA;
                c25018.m54926(dataInputStream);
                this.f70105 = c25018;
                return true;
            case 11:
                EnumC16818 enumC16819 = EnumC16818.f49695;
                C19654 c19654 = new C19654(this);
                c19654.f24829 = enumC16819;
                c19654.m21124(i, dataInputStream);
                this.f70108 = c19654;
                return true;
            case 12:
                EnumC16818 enumC168110 = EnumC16818.f49714;
                C10246 c10246 = new C10246(this);
                c10246.f24829 = enumC168110;
                c10246.m21124(i, dataInputStream);
                this.f70086 = c10246;
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49966(DataInputStream dataInputStream, InterfaceC22097 interfaceC22097) throws IOException {
        C23563 c23563 = this.f70097;
        this.f70096 = interfaceC22097;
        try {
            int i = dataInputStream.readInt();
            if (i != -889275714) {
                this.f38257.mo4612("The magic number identifying the class file format is expected to be {0}. The invalid magic number {1} will be ignored.", C24630.m54287(-889275714), C24630.m54287(i));
            }
            c23563.m52370(dataInputStream.readUnsignedShort());
            c23563.m52366(dataInputStream.readUnsignedShort());
            C12102 c12102 = this.f38266;
            c12102.m27980(dataInputStream);
            c12102.m27976();
            this.f38256 = dataInputStream.readUnsignedShort();
            this.f70098 = dataInputStream.readUnsignedShort();
            this.f70099 = dataInputStream.readUnsignedShort();
            AbstractC21279 abstractC21279 = this.f38257;
            Integer numValueOf = Integer.valueOf(this.f38256);
            int i2 = this.f38256;
            abstractC21279.m48090("0x%04X [ %s] this_cpx=%d super_cpx=%d", numValueOf, EnumC8140.m18880(i2, EnumC8140.m18868(i2) ? EnumC21552.CLASS : EnumC21552.MODULE), Integer.valueOf(this.f70098), Integer.valueOf(this.f70099));
            m49969(dataInputStream);
            m49968(dataInputStream);
            m49970(dataInputStream);
            m30953(dataInputStream);
            m49965(this.f70098);
            this.f38257.m48090("\n<< Reading is done >>", new Object[0]);
            if (c23563.m52371()) {
                EnumC8140.m18864(EnumC21552.VALUE_OBJECTS);
            }
        } catch (EOFException unused) {
            this.f38257.mo13866("The end of the file was unexpectedly reached while reading class data", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۚ */
    private void m49965(int i) {
        String strM27982 = this.f38266.m27982(i);
        this.f70102 = strM27982;
        int iLastIndexOf = strM27982.lastIndexOf(47);
        if (iLastIndexOf != -1) {
            this.f70107 = this.f70102.substring(0, iLastIndexOf);
            this.f70102.substring(iLastIndexOf + 1);
        }
        C10937 c10937 = this.f70089;
        if (c10937 != null) {
            c10937.f37063 = c10937.f37057.m27987(c10937.f37054, new C23787(7));
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m49967(int i) {
        C13619 c13619 = this.f70100;
        if (c13619 == null) {
            return null;
        }
        try {
            InterfaceC22097 interfaceC22097 = c13619.f38322;
            List list = c13619.f38323;
            if (list != null) {
                if (i >= 1 && i < list.size()) {
                    return (String) list.get(i - 1);
                }
                return String.format("Line number %d is out of range in \"%s\"", Integer.valueOf(i), interfaceC22097);
            }
            return String.format("\"%s\" not found", interfaceC22097);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return String.format("Line number %d is out of bounds", Integer.valueOf(i));
        }
    }

    @Override // p067l.AbstractC13599
    /* JADX INFO: renamed from: ֫ */
    public final void mo10015(List... listArr) {
        for (List<C8493> list : listArr) {
            if (list != null) {
                for (C8493 c8493 : list) {
                    c8493.m26662();
                    c8493.mo5334();
                    m26681();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m49971() {
        if (!this.f70109 && this.f70106) {
            try {
                mo5334();
            } catch (Exception unused) {
            }
        }
        try {
            this.f38257.m48092().mo4347(this.f70102);
        } catch (IOException unused2) {
        }
        this.f38257.m48086().flush();
    }

    @Override // p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ۧ */
    public final void mo5334() {
        int i;
        char c;
        C10937 c10937;
        String strMo25208;
        String strM53357;
        Date dateFrom;
        byte[] bArrDigest;
        EnumC8749 enumC8749M20216 = EnumC8749.m20216(this.f70102, this.f38256);
        EnumC8749 enumC8749 = EnumC8749.MODULE_INFO;
        boolean z = this.f32286;
        String str = "{";
        C23563 c23563 = this.f70097;
        if (enumC8749M20216 == enumC8749) {
            mo10015(this.f38267, this.f38261);
            if (this.f70087 == null) {
                this.f70087 = new C14979(this);
            }
            m26668(this.f70087.m34335("version ".concat(c23563.m52365())));
            m26681();
            m26676("{");
            if (z) {
                this.f38266.mo5334();
            }
            this.f70106 = true;
            this.f70087.mo5334();
            m26668("} // end of module " + this.f70087.m34334());
            if (this.f70087.m34332() != null) {
                m26668("@" + this.f70087.m34332());
            }
            m26681();
            mo10015(this.f38267, this.f38261);
            mo10015(this.f38265, this.f38269);
            if (!this.f70107.isEmpty()) {
                m26676(C21459.m48622("package ", this.f70107, " version ", c23563.m52365(), C0249l.f1196b));
            }
        } else {
            if (this.f32278) {
                InterfaceC24904 interfaceC24904M48084 = this.f38257.m48084();
                String strM27988 = this.f38266.m27988(this.f70098, "<invalid this_cpx #%d>");
                boolean zM18877 = EnumC8140.m18877(this.f38256);
                m26676("/**");
                if (interfaceC24904M48084 instanceof C18198) {
                    m26676(" *  Classfile " + this.f70096.toAbsolutePath());
                    dateFrom = new Date(this.f70096.toFile().lastModified());
                } else {
                    String string = this.f70096.toString();
                    m26676(" *  Classfile " + string.substring(string.lastIndexOf(47) + 1));
                    dateFrom = C6809.from(C20480.now().atStartOfDay(AbstractC7739.systemDefault()).toInstant());
                }
                DateFormat dateInstance = DateFormat.getDateInstance();
                int size = interfaceC24904M48084.getSize();
                String str2 = AbstractC11588.f32270;
                if (size > 0) {
                    m26680(C6988.m16053(" *  ", str2, "Last modified %s; size %d bytes"), dateInstance.format(dateFrom), Integer.valueOf(size));
                } else {
                    m26680(C6988.m16053(" *  ", str2, "Last modified %s"), dateInstance.format(dateFrom));
                }
                MessageDigest messageDigestMo8320 = interfaceC24904M48084.mo8320();
                if (messageDigestMo8320 != null && (bArrDigest = messageDigestMo8320.digest()) != null) {
                    StringBuilder sb = new StringBuilder();
                    int length = bArrDigest.length;
                    int i2 = 0;
                    while (i2 < length) {
                        sb.append(String.format("%02x", Byte.valueOf(bArrDigest[i2])));
                        i2++;
                        length = length;
                        bArrDigest = bArrDigest;
                    }
                    m26676(" *  " + str2 + messageDigestMo8320.getAlgorithm() + " checksum " + ((Object) sb));
                }
                if (zM18877) {
                    m26668(" *  " + EnumC8140.m18861(this.f38256 & (~EnumC8140.f21473.m18907()) & (~EnumC8140.f21463.m18907()), EnumC21552.CLASS) + "interface " + strM27988);
                } else {
                    m26668(" *  " + EnumC8140.m18861(this.f38256 & (~EnumC8140.f21463.m18907()), EnumC21552.CLASS) + "class " + strM27988);
                }
                C8925 c8925 = this.f38268;
                if (c8925 == null) {
                    if (!zM18877 && this.f70099 != 0) {
                        String strM27989 = this.f38266.m27988(this.f70098, "<invalid super_cpx #%d>");
                        if (!strM27989.equals("java.lang.Object")) {
                            m26668(" extends ".concat(strM27989));
                        }
                    }
                    for (int i3 = 0; i3 < this.f70104.length; i3++) {
                        m26668(i3 == 0 ? !zM18877 ? " implements " : " extends " : ",");
                        m26668(this.f38266.m27988(this.f70104[i3], "<invalid interface_cpx #%d>"));
                    }
                    m26681();
                } else {
                    AbstractC10857 abstractC10857M20626 = c8925.m20626();
                    String strM20627 = this.f38268.m20627();
                    if (abstractC10857M20626 instanceof C19574) {
                        m26668(strM20627);
                    } else if (!abstractC10857M20626.mo25019()) {
                        m26668(" extends " + strM20627);
                    }
                    m26681();
                }
                StringBuilder sbM11879 = C5410.m11879(" *  ", str2, "minor version: ");
                sbM11879.append(c23563.m52368());
                m26676(sbM11879.toString());
                m26676(" *  " + str2 + "major version: " + c23563.m52375());
                StringBuilder sb2 = new StringBuilder(" *  ");
                sb2.append(str2);
                sb2.append(String.format("flags: (0x%04x) %s", Integer.valueOf(this.f38256), EnumC8140.m18880(this.f38256, EnumC21552.CLASS)));
                m26676(sb2.toString());
                StringBuilder sb3 = new StringBuilder(" *  ");
                sb3.append(str2);
                int i4 = 0;
                sb3.append("this_class:  " + this.f38266.m27977(this.f70098, new C4055(i4)));
                m26676(sb3.toString());
                StringBuilder sb4 = new StringBuilder(" *  ");
                sb4.append(str2);
                sb4.append("super_class: " + this.f38266.m27977(this.f70099, new C4055(i4)));
                m26676(sb4.toString());
                String strM25286 = C10965.m25286(new StringBuilder(" *  "), str2, "interfaces: %d, fields: %d, methods: %d, attributes: %d");
                i = 1;
                m26680(strM25286, Integer.valueOf(this.f70104.length), Integer.valueOf(this.f70090.f25709.size()), Integer.valueOf(this.f70092.f25709.size()), Integer.valueOf(this.f70093));
                m26676(" */");
            } else {
                str = "{";
                i = 1;
            }
            if (this.f70107.isEmpty()) {
                c = 0;
            } else {
                Object[] objArr = new Object[i];
                c = 0;
                objArr[0] = this.f70107;
                m26676(String.format("package %s;%n", objArr));
            }
            ArrayList arrayList = this.f38267;
            ArrayList arrayList2 = this.f38261;
            List[] listArr = new List[2];
            listArr[c] = arrayList;
            listArr[i] = arrayList2;
            mo10015(listArr);
            ArrayList arrayList3 = this.f38265;
            ArrayList arrayList4 = this.f38269;
            List[] listArr2 = new List[2];
            listArr2[c] = arrayList3;
            listArr2[i] = arrayList4;
            mo10015(listArr2);
            String strM27969 = this.f38266.m27990(this.f70098) ? C12102.m27969(C15268.m34737(this.f38266.m27982(this.f70098)), this.f70107) : "?? invalid index";
            C8925 c8926 = this.f38268;
            C8537 c8537M20619 = c8926 != null ? c8926.m20619(new C19478(this, 0)) : new C8537("", "");
            boolean zM18878 = EnumC8140.m18877(this.f38256);
            boolean z2 = this.f32292;
            boolean z3 = this.f32275;
            if (zM18878) {
                m26668(EnumC8140.m18861(this.f38256 & (~EnumC8140.f21473.m18907()), EnumC21552.CLASS));
                m26668(z3 ? z2 ? String.format("interface #%d%s", Integer.valueOf(this.f70098), c8537M20619.f22916) : String.format("interface #%d%s /* %s%s */", Integer.valueOf(this.f70098), c8537M20619.f22916, strM27969, c8537M20619.f22917) : C21466.m48631("interface ", strM27969));
            } else {
                m26668(EnumC8140.m18861(this.f38256, EnumC21552.CLASS) + m30957());
                m26668(z3 ? z2 ? String.format("class #%d%s", Integer.valueOf(this.f70098), c8537M20619.f22916) : String.format("class #%d%s /* %s%s */", Integer.valueOf(this.f70098), c8537M20619.f22916, strM27969, c8537M20619.f22917) : String.format("class %s%s", strM27969, c8537M20619.f22917));
                if (this.f70098 >= this.f38266.size() || this.f70098 <= 0) {
                    m26668(z3 ? z2 ? String.format(" extends #%d", Integer.valueOf(this.f70099)) : String.format(" extends #%d /* ?? invalid index */", Integer.valueOf(this.f70099)) : " extends ??");
                } else if (!this.f38266.m27982(this.f70099).equals("java/lang/Object")) {
                    m26668(z3 ? z2 ? String.format(" extends #%d", Integer.valueOf(this.f70099)) : String.format(" extends #%d /* %s */", Integer.valueOf(this.f70099), C12102.m27969(C15268.m34737(this.f38266.m27982(this.f70099)), this.f70107)) : C21466.m48631(" extends ", C12102.m27969(C15268.m34737(this.f38266.m27982(this.f70099)), this.f70107)));
                }
            }
            int[] iArr = this.f70104;
            int length2 = iArr.length;
            if (length2 > 0) {
                String str3 = (String) C23573.stream(iArr).mapToObj(new IntFunction() { // from class: l.ܿۧ֨
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i5) {
                        C22161 c22161 = this.f56180;
                        C12102 c12102 = c22161.f38266;
                        return C12102.m27969(C15268.m34737(c12102.m27982(i5)), c22161.f70107);
                    }
                }).collect(C24205.joining(", "));
                if (z3) {
                    String str4 = (String) C23573.stream(this.f70104).mapToObj(new C16124()).collect(C24205.joining(", "));
                    if (z2) {
                        strM53357 = C24104.m53357(length2 > 1 ? "\n" + m26664() : " ", "implements ", str4);
                    } else {
                        strM53357 = (length2 > 1 ? "\n" + m26664() : " ") + "implements " + str4 + " /* " + str3 + " */";
                    }
                } else {
                    strM53357 = C24104.m53357(length2 > 1 ? "\n" + m26664() : " ", "implements ", str3);
                }
                m26668(strM53357);
            }
            m26680("%sversion %s", length2 > 1 ? "\n" + m26664() : " ", c23563.m52365());
            m26676(str);
            C12102 c12102 = this.f38266;
            int i5 = c12102.f32298;
            if (z) {
                c12102.mo5334();
                this.f32298 = i5;
            }
            if (this.f32285 && !this.f32277) {
                if (!z3) {
                    int i6 = 0;
                    m26679("this_class:  " + this.f38266.m27977(this.f70098, new C4055(i6)) + C0249l.f1196b);
                    m26679("super_class: " + this.f38266.m27977(this.f70099, new C4055(i6)) + C0249l.f1196b);
                } else if (z2) {
                    m26673(String.format("this_class:  #%d;", Integer.valueOf(this.f70098)), Integer.valueOf(i5));
                    m26673(String.format("super_class: #%d;", Integer.valueOf(this.f70099)), Integer.valueOf(i5));
                } else {
                    int i7 = 0;
                    int iM26670 = i5 - m26670();
                    m26672(m26671(iM26670, String.format("this_class:  #%d;", Integer.valueOf(this.f70098))));
                    m26676(" // " + this.f38266.m27977(this.f70098, new C4055(i7)));
                    m26672(m26671(iM26670, String.format("super_class: #%d;", Integer.valueOf(this.f70099))));
                    m26676(" // " + this.f38266.m27977(this.f70099, new C4055(i7)));
                }
                m26681();
            }
            this.f70106 = true;
            if (this.f32283 && (c10937 = this.f70089) != null && (strMo25208 = c10937.mo25208()) != null) {
                this.f70100 = new C13619(strMo25208, this.f70096.getParent());
            }
            List list = C23573.stream(new AbstractC11588[]{this.f38268, this.f70089, this.f70088, this.f70091, this.f70105, this.f70095, this.f70103, this.f70101, this.f70108, this.f70086, this.f70094}).filter(new C12773(this)).toList();
            int i8 = this.f32298;
            C9419 c9419 = this.f70090;
            if (c9419 != null && c9419.f25709.size() > 0) {
                c9419.f32298 = i8;
                c9419.mo5334();
                if (C23573.stream(new C9419[]{this.f70092}).anyMatch(new C18136()) && !list.isEmpty()) {
                    m26681();
                }
            }
            int iM26671 = i8 - m26670();
            this.f32298 = iM26671;
            C9419 c94110 = this.f70092;
            if (c94110 != null && c94110.f25709.size() > 0) {
                c94110.f32298 = iM26671;
                c94110.mo5334();
                if (!list.isEmpty()) {
                    m26681();
                }
            }
            int size2 = list.size();
            boolean z4 = false;
            for (int i9 = 0; i9 < size2; i9++) {
                InterfaceC18983 interfaceC18983 = (InterfaceC18983) list.get(i9);
                if (C23573.stream(new InterfaceC18983[]{interfaceC18983}).anyMatch(new C18136())) {
                    if (AbstractC11588.class.isAssignableFrom(interfaceC18983.getClass())) {
                        ((AbstractC11588) interfaceC18983).f32298 = iM26671;
                    }
                    interfaceC18983.mo5334();
                    z4 = true;
                }
                if (z4 && i9 + 1 < size2) {
                    m26681();
                    z4 = false;
                }
            }
            if (z2) {
                m26676(C0249l.f1198d);
            } else {
                m26676("} // end Class " + this.f70102);
            }
            this.f70109 = true;
        }
        List listM27985 = this.f38266.m27985();
        if (listM27985.isEmpty()) {
            return;
        }
        Iterator it = listM27985.iterator();
        while (it.hasNext()) {
            this.f38257.m48073((IOException) it.next());
        }
        throw new C13902();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m49964(InterfaceC18983 interfaceC18983) {
        return C23573.stream(new InterfaceC18983[]{interfaceC18983}).anyMatch(new C18136());
    }
}
