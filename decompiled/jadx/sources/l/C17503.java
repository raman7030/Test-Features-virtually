package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17503 extends AbstractC11817 {

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53466 = 0;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public int f53467;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public C18209 f53468;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C9268 f53469;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public C16776 f53470;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C17461 f53471;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f53472;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public C16776 f53473;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f53474;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C2481 f53475;

    public C17503(C20826 c20826) {
        super(c20826);
        this.f53468 = null;
        this.f29348 = EnumC0970.METHOD_DATA;
        this.f35252 = "MethodData";
        this.f29349 = c20826.f35264.f29349;
        this.f53472 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC11817
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18620(DataInputStream dataInputStream, EnumC4662 enumC4662, int i) throws IOException {
        Object[] objArr = 0;
        switch (C11154.f33484[enumC4662.ordinal()]) {
            case 1:
                C2481 c2481 = new C2481(this);
                this.f53475 = c2481;
                c2481.m7966(i, dataInputStream);
                return true;
            case 2:
                if (this.f35266 != null) {
                    this.f35255.mo2245("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "Signature", "method_info");
                }
                C6899 c6899 = new C6899((C20826) this.f35257);
                c6899.m18671(i, dataInputStream);
                this.f35266 = c6899;
                return true;
            case 3:
                C17461 c17461 = new C17461((C20826) this.f35257);
                c17461.m19181(i, dataInputStream);
                this.f53471 = c17461;
                return true;
            case 4:
                int unsignedByte = dataInputStream.readUnsignedByte();
                this.f35255.m45762(new C7583(unsignedByte, objArr == true ? 1 : 0));
                this.f53472 = new ArrayList(unsignedByte);
                for (int i2 = 0; i2 < unsignedByte; i2++) {
                    short unsignedShort = (short) dataInputStream.readUnsignedShort();
                    int unsignedShort2 = dataInputStream.readUnsignedShort();
                    this.f35255.m45778(String.format("()->MethodParameter[%d] = { name[%d]: \"%s\" modifiers[%d]: %s}", Integer.valueOf(i2), Short.valueOf(unsignedShort), this.f35264.m25965(unsignedShort, new C2286(8)), Integer.valueOf(unsignedShort2), EnumC6073.m16951(unsignedShort2, EnumC20185.METHOD)), new Object[0]);
                    ArrayList arrayList = this.f53472;
                    C16797 c16797 = new C16797();
                    c16797.f51561 = unsignedShort2;
                    c16797.f51562 = unsignedShort;
                    arrayList.add(i2, c16797);
                }
                return true;
            case 5:
            case 6:
                boolean z = enumC4662 == EnumC4662.f14815;
                C16776 c16776 = new C16776(this, z);
                c16776.m39509(dataInputStream);
                if (z) {
                    this.f53470 = c16776;
                    return true;
                }
                this.f53473 = c16776;
                return true;
            case 7:
                this.f53469 = C7856.m21046(dataInputStream, this.f35257, false);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m40891() {
        if (this.f53468 == null) {
            C16776 c16776 = this.f53473;
            int iM39510 = c16776 != null ? c16776.m39510() : 0;
            C16776 c16777 = this.f53470;
            this.f53468 = new C18209(iM39510, c16777 != null ? c16777.m39510() : 0);
        }
        if (this.f53468.m42424()) {
            return true;
        }
        ArrayList arrayList = this.f53472;
        return arrayList != null && arrayList.size() > 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m40892() {
        if (m40891()) {
            m24664(1);
            int i = this.f29335 ? 7 : 5;
            ArrayList arrayList = this.f53472;
            int i2 = 0;
            int iMax = Math.max(this.f53468.m42426(), Math.max(arrayList != null ? arrayList.size() : 0, this.f53468.m42425()));
            String[] strArr = new String[iMax];
            if (this.f53472 != null) {
                for (int i3 = 0; i3 < iMax; i3++) {
                    C16797 c16797 = (C16797) this.f53472.get(i3);
                    strArr[i3] = C21639.m48906(EnumC15204.f46594, new StringBuilder(), "{ ");
                    if (this.f29326) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strArr[i3]);
                        int i4 = c16797.f51562;
                        int i5 = c16797.f51561;
                        sb.append(String.format("#%d ", Integer.valueOf(i4)));
                        strArr[i3] = sb.toString();
                        if (!this.f29343 && i4 != 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(strArr[i3]);
                            sb2.append("/* " + ((C20826) this.f35257).f35264.m25965(i4, new C3053(6)) + " */ ");
                            strArr[i3] = sb2.toString();
                        }
                        if (i5 != 0) {
                            strArr[i3] = strArr[i3] + EnumC6073.m16932(i5, EnumC20185.METHOD_PARAMETERS);
                        }
                    } else {
                        int i6 = c16797.f51562;
                        int i7 = c16797.f51561;
                        if (i6 != 0) {
                            strArr[i3] = strArr[i3] + ((C20826) this.f35257).f35264.m25965(c16797.f51562, new C1981(i2)) + " ";
                        } else {
                            strArr[i3] = C9045.m23341(new StringBuilder(), strArr[i3], "#0 ");
                        }
                        if (i7 != 0) {
                            strArr[i3] = strArr[i3] + EnumC6073.m16932(i7, EnumC20185.METHOD_PARAMETERS);
                        }
                    }
                    strArr[i3] = C9045.m23341(new StringBuilder(), strArr[i3], l.d);
                }
            }
            int i8 = 0;
            while (i8 < iMax) {
                ArrayList arrayList2 = (this.f53473 == null || i8 >= this.f53468.m42426()) ? null : this.f53473.get(i8);
                ArrayList arrayList3 = (this.f53470 == null || i8 >= this.f53468.m42425()) ? null : this.f53470.get(i8);
                ArrayList arrayList4 = this.f53472;
                C16797 c16798 = arrayList4 != null ? (C16797) arrayList4.get(i8) : null;
                boolean z = (arrayList2 == null && arrayList3 == null) ? false : true;
                if (c16798 != null || z) {
                    m24658(m24657(i, String.format("%2d: ", Integer.valueOf(i8))));
                    if (c16798 != null) {
                        m24661(3, strArr[i8]);
                    }
                    m40890(arrayList2);
                    m40890(arrayList3);
                    m24667();
                }
                i8++;
            }
            m24653(1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40890(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C6445 c6445 = (C6445) it.next();
                m24667();
                m24654(m24663(3, ""));
                c6445.mo22276(EnumC6172.PARAMETER_ANNOTATION);
                c6445.m24670(m24656() + 3);
                c6445.mo3021();
            }
        }
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo4064(int i, int i2) {
        int i3;
        AbstractC8932 abstractC8932M27434;
        int iIndexOf;
        C6899 c6899 = this.f35266;
        boolean z = (c6899 == null || c6899.f29340) ? false : true;
        boolean z2 = z && c6899.mo24649();
        boolean z3 = this.f53471 != null;
        boolean z4 = this.f53475 != null || m40891() || z3;
        boolean z5 = (z4 || z2) ? false : true;
        if (i > 0) {
            m24667();
        }
        if (this.f29329) {
            int size = !EnumC6073.m16945(this.f35254) ? 1 : 0;
            String str = m24650() + " *  ";
            int i4 = this.f35254;
            EnumC20185 enumC20185 = EnumC20185.METHOD;
            String strConcat = EnumC6073.m16932(i4, enumC20185).concat(m28908());
            C6899 c68910 = this.f35266;
            if (c68910 != null) {
                abstractC8932M27434 = c68910.m18677();
            } else {
                this.f35255.getClass();
                abstractC8932M27434 = new C11049(this.f53474).m27434(this.f35264);
            }
            C10242 c10242 = ((C20826) this.f35257).f35264;
            int i5 = this.f53467;
            C5851 c5851 = C10242.f30878;
            String strM25965 = c10242.m25965(i5, c5851);
            boolean zEquals = strM25965.equals("<init>");
            String string = abstractC8932M27434.toString();
            if (abstractC8932M27434 instanceof C14575) {
                size += ((C14575) abstractC8932M27434).f44615.size();
            }
            if (zEquals) {
                strM25965 = ((C20826) this.f35257).f67419;
                string = string.substring(string.indexOf(MotionUtils.EASING_TYPE_FORMAT_START));
                iIndexOf = 0;
            } else {
                iIndexOf = string.indexOf(40);
            }
            String strReplaceAll = string.substring(0, iIndexOf).concat(strM25965).concat(string.substring(iIndexOf)).replaceAll("/", ".");
            String strM25966 = ((C20826) this.f35257).f35264.m25965(this.f53474, c5851);
            m24665("/**");
            m24662(str + strConcat + strReplaceAll);
            String strConcat2 = str.concat(m24650());
            m24662(strConcat2 + "descriptor: " + strM25966);
            if (this.f35266 != null) {
                StringBuilder sbM19190 = C7166.m19190(strConcat2, "signature:  ");
                sbM19190.append(((C20826) this.f35257).f35264.m25965(this.f35266.m18673(), c5851));
                m24662(sbM19190.toString());
            }
            StringBuilder sbM15339 = C5368.m15339(strConcat2);
            sbM15339.append(String.format("flags: (0x%04x) %s", Integer.valueOf(this.f35254), EnumC6073.m16951(this.f35254, enumC20185)));
            m24662(sbM15339.toString());
            m24662(strConcat2 + String.format("stack: %d, locals: %d, args_size: %d", Integer.valueOf(this.f53475.f7912), Integer.valueOf(this.f53475.f7908), Integer.valueOf(size)));
            m24665(" */");
        }
        mo7967(this.f35265, this.f35259);
        mo7967(this.f35263, this.f35267);
        String strConcat3 = EnumC6073.m16932(this.f35254, EnumC20185.METHOD).concat(m28908()).concat(EnumC15204.f46613.m35967());
        String strM24657 = m24657(Math.max(strConcat3.length() + 1, (m24656() * 2) + EnumC0970.SIGNATURE.m3428().length()), strConcat3);
        int length = strM24657.length() - m24656();
        C6491 c6491M18670 = z ? this.f35266.m18670(new Function() { // from class: l.᩺ܽ֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(this.f74339.f35264.m25968(((Integer) obj).intValue()));
            }
        }) : new C6491("", "");
        boolean z6 = this.f29326;
        String str2 = l.b;
        if (z6) {
            String strConcat4 = strM24657.concat(String.format("#%d:#%d", Integer.valueOf(this.f53467), Integer.valueOf(this.f53474))).concat((String) c6491M18670.f20042);
            if (z5 && this.f53469 == null) {
                strConcat4 = strConcat4.concat(l.b);
            }
            if (!this.f29343) {
                m24658(m24657(this.f29349, strConcat4));
                m24654((this.f53469 != null ? " /* " : " // ").concat(((C20826) this.f35257).f35264.getName(this.f53467) + ":" + ((C20826) this.f35257).f35264.getName(this.f53474)).concat((String) c6491M18670.f20043).concat(this.f53469 != null ? " */ " : " "));
            } else if (this.f53469 != null) {
                m24658(m24657(this.f29349, strConcat4));
            } else {
                m24658(strConcat4);
            }
        } else {
            String strConcat5 = strM24657.concat(((C20826) this.f35257).f35264.getName(this.f53467) + ":").concat(((C20826) this.f35257).f35264.getName(this.f53474)).concat((String) c6491M18670.f20043);
            if (z5 && this.f53469 == null) {
                strConcat5 = strConcat5.concat(l.b);
            }
            m24658(strConcat5);
        }
        C9268 c9268 = this.f53469;
        if (c9268 != null) {
            c9268.m24664(1);
            c9268.f29349 = m24656() - m24669();
            this.f53469.mo22276(EnumC6172.HAS_DEFAULT_VALUE);
            this.f53469.mo3021();
            if (!z4) {
                if (z2) {
                    str2 = ",";
                }
                m24654(str2);
            }
        }
        if (z2) {
            m24667();
            C6899 c68911 = this.f35266;
            c68911.m18680();
            c68911.m18676(length);
            i3 = 1;
            c68911.m24664(1);
            c68911.f29349 = this.f29349 - m24669();
            this.f35266.m18672(!z3);
            this.f35266.mo3021();
        } else {
            i3 = 1;
        }
        if (this.f53471 != null) {
            m24667();
            C17461 c17461 = this.f53471;
            c17461.m40826(length);
            c17461.m24664(i3);
            c17461.f29349 = this.f29349 - m24669();
            this.f53471.mo3021();
        } else {
            m24667();
        }
        C2481 c2481 = this.f53475;
        if (c2481 != null) {
            c2481.f29349 = this.f29349;
            c2481.mo3021();
        } else if (m40891()) {
            m40892();
        }
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4067(int i, int i2) {
        mo4064(i, i2);
    }
}
