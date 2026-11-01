package p067l;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.ۤۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C12102 extends AbstractC11588 {

    /* JADX INFO: renamed from: ֫ۧ */
    public static final Hashtable f33838;

    /* JADX INFO: renamed from: ۟֫ */
    public static final C7929 f33839 = new C7929(9);

    /* JADX INFO: renamed from: ۧۧ */
    public static final Hashtable f33840;

    /* JADX INFO: renamed from: ۗ֫ */
    public String f33841;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f33842;

    /* JADX INFO: renamed from: ۛ֫ */
    public ArrayList f33843;

    /* JADX INFO: renamed from: ۤ֫ */
    public AbstractC21279 f33844;

    /* JADX INFO: renamed from: ۨ֫ */
    public boolean f33845;

    /* JADX INFO: renamed from: ۫֫ */
    public final C22161 f33846;

    /* JADX INFO: renamed from: ۬֫ */
    public int f33847;

    /* JADX INFO: renamed from: ܰ֫ */
    public int f33848;

    /* JADX INFO: renamed from: ᩺֫ */
    public C21949 f33849;

    /* JADX INFO: renamed from: ֫ */
    public static String m27970(C12102 c12102, int i) {
        c12102.getClass();
        EnumC14783 enumC14783 = (EnumC14783) f33838.get(Byte.valueOf((byte) i));
        return enumC14783 == null ? C20778.m46922(i, "BOGUS_SUBTAG:") : enumC14783.f42150;
    }

    static {
        Hashtable hashtable = new Hashtable();
        f33840 = hashtable;
        Hashtable hashtable2 = new Hashtable();
        f33838 = hashtable2;
        EnumC14113 enumC14113 = EnumC14113.CONSTANT_UTF8;
        hashtable.put(Byte.valueOf(enumC14113.m32046()), enumC14113);
        EnumC14113 enumC14114 = EnumC14113.CONSTANT_INTEGER;
        hashtable.put(Byte.valueOf(enumC14114.m32046()), enumC14114);
        EnumC14113 enumC14115 = EnumC14113.CONSTANT_FLOAT;
        hashtable.put(Byte.valueOf(enumC14115.m32046()), enumC14115);
        EnumC14113 enumC14116 = EnumC14113.CONSTANT_LONG;
        hashtable.put(Byte.valueOf(enumC14116.m32046()), enumC14116);
        EnumC14113 enumC14117 = EnumC14113.CONSTANT_DOUBLE;
        hashtable.put(Byte.valueOf(enumC14117.m32046()), enumC14117);
        EnumC14113 enumC14118 = EnumC14113.CONSTANT_CLASS;
        hashtable.put(Byte.valueOf(enumC14118.m32046()), enumC14118);
        EnumC14113 enumC14119 = EnumC14113.CONSTANT_STRING;
        hashtable.put(Byte.valueOf(enumC14119.m32046()), enumC14119);
        EnumC14113 enumC141110 = EnumC14113.CONSTANT_FIELD;
        hashtable.put(Byte.valueOf(enumC141110.m32046()), enumC141110);
        EnumC14113 enumC141111 = EnumC14113.CONSTANT_METHOD;
        hashtable.put(Byte.valueOf(enumC141111.m32046()), enumC141111);
        EnumC14113 enumC141112 = EnumC14113.CONSTANT_INTERFACEMETHOD;
        hashtable.put(Byte.valueOf(enumC141112.m32046()), enumC141112);
        EnumC14113 enumC141113 = EnumC14113.CONSTANT_NAMEANDTYPE;
        hashtable.put(Byte.valueOf(enumC141113.m32046()), enumC141113);
        EnumC14113 enumC141114 = EnumC14113.CONSTANT_METHODHANDLE;
        hashtable.put(Byte.valueOf(enumC141114.m32046()), enumC141114);
        EnumC14113 enumC141115 = EnumC14113.CONSTANT_METHODTYPE;
        hashtable.put(Byte.valueOf(enumC141115.m32046()), enumC141115);
        EnumC14113 enumC141116 = EnumC14113.CONSTANT_DYNAMIC;
        hashtable.put(Byte.valueOf(enumC141116.m32046()), enumC141116);
        EnumC14113 enumC141117 = EnumC14113.CONSTANT_INVOKEDYNAMIC;
        hashtable.put(Byte.valueOf(enumC141117.m32046()), enumC141117);
        EnumC14113 enumC141118 = EnumC14113.CONSTANT_MODULE;
        hashtable.put(Byte.valueOf(enumC141118.m32046()), enumC141118);
        EnumC14113 enumC141119 = EnumC14113.CONSTANT_PACKAGE;
        hashtable.put(Byte.valueOf(enumC141119.m32046()), enumC141119);
        EnumC14783 enumC14783 = EnumC14783.REF_GETFIELD;
        hashtable2.put(Byte.valueOf(enumC14783.m33722()), enumC14783);
        EnumC14783 enumC14784 = EnumC14783.REF_GETSTATIC;
        hashtable2.put(Byte.valueOf(enumC14784.m33722()), enumC14784);
        EnumC14783 enumC14785 = EnumC14783.REF_PUTFIELD;
        hashtable2.put(Byte.valueOf(enumC14785.m33722()), enumC14785);
        EnumC14783 enumC14786 = EnumC14783.REF_PUTSTATIC;
        hashtable2.put(Byte.valueOf(enumC14786.m33722()), enumC14786);
        EnumC14783 enumC14787 = EnumC14783.REF_INVOKEVIRTUAL;
        hashtable2.put(Byte.valueOf(enumC14787.m33722()), enumC14787);
        EnumC14783 enumC14788 = EnumC14783.REF_INVOKESTATIC;
        hashtable2.put(Byte.valueOf(enumC14788.m33722()), enumC14788);
        EnumC14783 enumC14789 = EnumC14783.REF_INVOKESPECIAL;
        hashtable2.put(Byte.valueOf(enumC14789.m33722()), enumC14789);
        EnumC14783 enumC147810 = EnumC14783.REF_NEWINVOKESPECIAL;
        hashtable2.put(Byte.valueOf(enumC147810.m33722()), enumC147810);
        EnumC14783 enumC147811 = EnumC14783.REF_INVOKEINTERFACE;
        hashtable2.put(Byte.valueOf(enumC147811.m33722()), enumC147811);
    }

    public C12102(C22161 c22161) {
        super(c22161.f32274);
        this.f33845 = false;
        this.f33841 = "";
        this.f33847 = 0;
        this.f33842 = 0;
        this.f33848 = 0;
        this.f33846 = c22161;
        this.f33844 = c22161.f38257;
        this.f32297 = EnumC3290.CONSTANT_POOL;
        this.f33843 = new ArrayList(10);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27981(boolean z) {
        this.f33845 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m27979(EnumC14113 enumC14113) {
        return this.f33845 ? C10965.m25286(new StringBuilder(), enumC14113.f40058, " ") : "";
    }

    public final int size() {
        return this.f33843.size();
    }

    /* JADX INFO: renamed from: ᩶ */
    public final boolean m27990(int i) {
        if (this.f33849 == null) {
            this.f33849 = new C21949(1, Integer.valueOf(this.f33843.size() - 1));
        }
        return this.f33849.m49472(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27980(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        ArrayList arrayList = new ArrayList(unsignedShort);
        this.f33843 = arrayList;
        arrayList.add(0, null);
        AbstractC21279 abstractC21279 = this.f33844;
        abstractC21279.m48090(C20778.m46922(unsignedShort, "constant_pool_count = "), new Object[0]);
        int i = 1;
        while (i < unsignedShort) {
            byte b = dataInputStream.readByte();
            EnumC14113 enumC14113 = (EnumC14113) f33840.get(Byte.valueOf(b));
            if (enumC14113 == null) {
                throw new ClassFormatError(String.format("Error while reading constant pool for %s: unexpected tag at #%d: %d", abstractC21279.m48084(), Integer.valueOf(i), Byte.valueOf(b)));
            }
            int iM32044 = enumC14113.m32044();
            StringBuilder sbM49005 = C21720.m49005("\tCP entry #", i, " tag[", "]\t=\t", b);
            sbM49005.append(enumC14113);
            abstractC21279.m48090(sbM49005.toString(), new Object[0]);
            switch (enumC14113.ordinal()) {
                case 1:
                    this.f33843.add(i, new C6737(this, enumC14113, dataInputStream.readUTF()));
                    break;
                case 2:
                    this.f33843.add(i, new C23501(this, enumC14113, dataInputStream.readInt()));
                    break;
                case 3:
                    this.f33843.add(i, new C22831(this, enumC14113, dataInputStream.readFloat()));
                    break;
                case 4:
                    this.f33843.add(i, new C21490(this, enumC14113, dataInputStream.readLong()));
                    this.f33843.add(null);
                    break;
                case 5:
                    this.f33843.add(i, new C16794(this, enumC14113, dataInputStream.readDouble()));
                    this.f33843.add(null);
                    break;
                case 6:
                case 7:
                case 13:
                case 16:
                case 17:
                    this.f33843.add(i, new C10090(this, enumC14113, dataInputStream.readUnsignedShort()));
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 14:
                case 15:
                    this.f33843.add(i, new C3384(this, enumC14113, dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort()));
                    break;
                case 12:
                    this.f33843.add(i, new C3384(this, enumC14113, dataInputStream.readUnsignedByte(), dataInputStream.readUnsignedShort()));
                    break;
                default:
                    throw new ClassFormatError(C20778.m46922(b, "invalid constant type: "));
            }
            i += iM32044;
        }
    }

    /* JADX INFO: renamed from: ֨ */
    public final AbstractC5396 m27975(int i) {
        if (m27990(i)) {
            return (AbstractC5396) this.f33843.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m27987(int i, Function function) {
        AbstractC5396 abstractC5396;
        return (m27990(i) && (abstractC5396 = (AbstractC5396) this.f33843.get(i)) != null && abstractC5396.f12856 == EnumC14113.CONSTANT_UTF8) ? (String) ((C6737) abstractC5396).f12857 : (String) function.apply(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ᩸ */
    public final String m27991(int i) {
        AbstractC5396 abstractC5396;
        return (m27990(i) && (abstractC5396 = (AbstractC5396) this.f33843.get(i)) != null && abstractC5396.f12856 == EnumC14113.CONSTANT_MODULE) ? abstractC5396.mo5910() : "#" + Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ᩹ */
    public final String m27992(int i) {
        AbstractC5396 abstractC5396;
        return (m27990(i) && (abstractC5396 = (AbstractC5396) this.f33843.get(i)) != null && abstractC5396.f12856 == EnumC14113.CONSTANT_PACKAGE) ? abstractC5396.mo5910() : "#" + Integer.valueOf(i);
    }

    public final String getName(int i) {
        String strM27987 = m27987(i, new C24063(5));
        return strM27987 == null ? C19768.m44906(i, "<invalid constant pool index:", ">") : C15268.m34737(strM27987);
    }

    /* JADX INFO: renamed from: ۚ */
    public final String m27982(int i) {
        return m27977(i, new C13026(4));
    }

    /* JADX INFO: renamed from: ܶ */
    public final String m27989(int i) {
        AbstractC5396 abstractC5396 = (AbstractC5396) this.f33843.get(i);
        if (abstractC5396 != null && (abstractC5396 instanceof C3384)) {
            return ((C3384) abstractC5396).mo5910();
        }
        return abstractC5396.mo5910();
    }

    /* JADX INFO: renamed from: ۠ */
    public final String m27984(final int i) {
        AbstractC5396 abstractC5396 = (AbstractC5396) this.f33843.get(i);
        if (abstractC5396 != null && abstractC5396.f12856 == EnumC14113.CONSTANT_NAMEANDTYPE) {
            final EnumC14113[] enumC14113Arr = {EnumC14113.CONSTANT_METHOD, EnumC14113.CONSTANT_INTERFACEMETHOD, EnumC14113.CONSTANT_METHODHANDLE, EnumC14113.CONSTANT_DYNAMIC, EnumC14113.CONSTANT_INVOKEDYNAMIC};
            if (!C7480.stream(this.f33843).filter(new Predicate() { // from class: l.֡ۧ֨
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C20697.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo55838negate() {
                    return C20697.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public /* synthetic */ Predicate m4203or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    AbstractC5396 abstractC5397 = (AbstractC5396) obj;
                    return abstractC5397 != null && abstractC5397.f12856.m32043(enumC14113Arr);
                }
            }).filter(new Predicate() { // from class: l.ۚۧ֨
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C20697.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo55838negate() {
                    return C20697.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public /* synthetic */ Predicate m17126or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((C3384) ((AbstractC5396) obj)).f6689 == i;
                }
            }).findFirst().isPresent()) {
                return abstractC5396.mo5910();
            }
        }
        AbstractC15242 abstractC15242M48082 = this.f33844.m48082();
        Object[] objArr = {Integer.valueOf(i)};
        abstractC15242M48082.getClass();
        String strM34697 = AbstractC15242.m34697("The ConstantPool[{0}] must be a CONSTANT_NameAndType_info structure with a field descriptor", objArr);
        return this.f32275 ? strM34697 : String.format("??? #%d %s", Integer.valueOf(i), strM34697);
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m27988(int i, String str) {
        String strM27977 = m27977(i, new C24063(5));
        if (strM27977 == null) {
            return String.format(str, Integer.valueOf(i));
        }
        return strM27977.replace('/', '.');
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m27977(int i, Function function) {
        AbstractC5396 abstractC5396;
        AbstractC5396 abstractC5397 = null;
        if (m27990(i) && (abstractC5396 = (AbstractC5396) this.f33843.get(i)) != null && abstractC5396.f12856 == EnumC14113.CONSTANT_CLASS) {
            abstractC5397 = abstractC5396;
        }
        if (abstractC5397 == null) {
            return (String) function.apply(Integer.valueOf(i));
        }
        return m27978((C10090) abstractC5397);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m27978(C10090 c10090) {
        AbstractC5396 abstractC5396;
        int iIntValue = ((Integer) c10090.f12857).intValue();
        String strM46922 = C20778.m46922(iIntValue, "#");
        if (!m27990(iIntValue) || (abstractC5396 = (AbstractC5396) this.f33843.get(iIntValue)) == null || abstractC5396.f12856 != EnumC14113.CONSTANT_UTF8) {
            return strM46922;
        }
        String str = (String) ((C6737) abstractC5396).f12857;
        return (str == null || !str.startsWith("[")) ? str : C6988.m16053("\"", str, "\"");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m27969(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(47);
        return (iLastIndexOf == str2.length() && str.startsWith(str2)) ? str.substring(iLastIndexOf + 1) : str;
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m27986(int i) {
        if (!m27990(i)) {
            return String.format("<invalid constant pool index: %d>", Integer.valueOf(i));
        }
        AbstractC5396 abstractC5396 = (AbstractC5396) this.f33843.get(i);
        return abstractC5396 == null ? "<null>" : abstractC5396.mo5910();
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m27983(int i) {
        EnumC14113 enumC14113;
        if (i == 0 || !m27990(i)) {
            return C20778.m46922(i, "#");
        }
        AbstractC5396 abstractC5396 = (AbstractC5396) this.f33843.get(i);
        if (abstractC5396 == null) {
            return C20778.m46922(i, "#");
        }
        if (abstractC5396 instanceof C3384) {
            C3384 c3384 = (C3384) abstractC5396;
            if (((Integer) c3384.f12857).intValue() == this.f33846.f70098 && ((enumC14113 = c3384.f12856) == EnumC14113.CONSTANT_FIELD || enumC14113 == EnumC14113.CONSTANT_METHOD || enumC14113 == EnumC14113.CONSTANT_INTERFACEMETHOD)) {
                i = c3384.f6689;
            }
        }
        return abstractC5396.f12856.f40058 + " " + m27986(i);
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo26663() {
        return this.f32296;
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ᩴ */
    public final void mo20628() {
        if (this.f32285 && !this.f32292) {
            m26679("// " + this.f32297.m5730() + ":");
        }
        int i = 1;
        while (i < this.f33843.size()) {
            AbstractC5396 abstractC5396 = (AbstractC5396) this.f33843.get(i);
            int iMo11846 = 0;
            m26669(this.f33841, Integer.valueOf(i));
            if (abstractC5396 == null) {
                m26679("null;");
            } else {
                iMo11846 = abstractC5396.mo11846();
                abstractC5396.f12854 = Math.max(AbstractC11588.f32269, this.f33848);
                abstractC5396.mo5908(this.f32274, this.f33848);
            }
            i += iMo11846;
        }
        this.f32274.mo4349("");
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ۚ */
    public final void mo20623() {
        if (this.f32285 && !this.f32292) {
            m26679("// " + this.f32297.m5730() + ":");
        }
        int i = 1;
        while (i < this.f33843.size()) {
            AbstractC5396 abstractC5396 = (AbstractC5396) this.f33843.get(i);
            int iMo11846 = 0;
            m26669(this.f33841, Integer.valueOf(i));
            if (abstractC5396 == null) {
                m26679("null;");
            } else {
                iMo11846 = abstractC5396.mo11846();
                abstractC5396.f12854 = Math.max(AbstractC11588.f32269, this.f33848);
                abstractC5396.mo5909(this.f32274, this.f33848);
            }
            i += iMo11846;
        }
        this.f32274.mo4349("");
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m27976() {
        int iOrElse = C7480.stream(this.f33843).mapToInt(new ToIntFunction() { // from class: l.ۘۧ֨
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                AbstractC5396 abstractC5396 = (AbstractC5396) obj;
                C12102 c12102 = this.f15260;
                c12102.getClass();
                if (abstractC5396 == null) {
                    return 4;
                }
                return abstractC5396.f12856.m32041(c12102.f32296);
            }
        }).max().orElse(10);
        this.f33842 = this.f33843.size() > 100 ? 4 : 3;
        this.f33848 = iOrElse + 1;
        String strM11876 = C5410.m11876(this.f33842, "d = ", new StringBuilder("const #%-"));
        this.f33841 = strM11876;
        this.f33847 = String.format(strM11876, Integer.valueOf(this.f33843.size())).length();
        int iM26670 = m26670() + this.f33847;
        int i = this.f33848;
        this.f32298 = Math.max(AbstractC11588.f32269, i) + iM26670 + i;
    }

    /* JADX INFO: renamed from: ۠ */
    public final List m27985() {
        int i = 0;
        return C7480.stream(this.f33843).filter(new C20149(i)).flatMap(new C20820(i)).toList();
    }
}
