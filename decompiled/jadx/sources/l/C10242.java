package l;

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
public final class C10242 extends AbstractC9701 {

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public static final Hashtable f30877;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public static final C5851 f30878 = new C5851(9);

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static final Hashtable f30879;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public String f30880;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f30881;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f30882;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public AbstractC19898 f30883;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public boolean f30884;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final C20826 f30885;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public int f30886;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public int f30887;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public C20603 f30888;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m25948(C10242 c10242, int i) {
        c10242.getClass();
        EnumC13063 enumC13063 = (EnumC13063) f30877.get(Byte.valueOf((byte) i));
        return enumC13063 == null ? C19370.m44628(i, "BOGUS_SUBTAG:") : enumC13063.f39102;
    }

    static {
        Hashtable hashtable = new Hashtable();
        f30879 = hashtable;
        Hashtable hashtable2 = new Hashtable();
        f30877 = hashtable2;
        EnumC12358 enumC12358 = EnumC12358.CONSTANT_UTF8;
        hashtable.put(Byte.valueOf(enumC12358.m29985()), enumC12358);
        EnumC12358 enumC12359 = EnumC12358.CONSTANT_INTEGER;
        hashtable.put(Byte.valueOf(enumC12359.m29985()), enumC12359);
        EnumC12358 enumC123510 = EnumC12358.CONSTANT_FLOAT;
        hashtable.put(Byte.valueOf(enumC123510.m29985()), enumC123510);
        EnumC12358 enumC123511 = EnumC12358.CONSTANT_LONG;
        hashtable.put(Byte.valueOf(enumC123511.m29985()), enumC123511);
        EnumC12358 enumC123512 = EnumC12358.CONSTANT_DOUBLE;
        hashtable.put(Byte.valueOf(enumC123512.m29985()), enumC123512);
        EnumC12358 enumC123513 = EnumC12358.CONSTANT_CLASS;
        hashtable.put(Byte.valueOf(enumC123513.m29985()), enumC123513);
        EnumC12358 enumC123514 = EnumC12358.CONSTANT_STRING;
        hashtable.put(Byte.valueOf(enumC123514.m29985()), enumC123514);
        EnumC12358 enumC123515 = EnumC12358.CONSTANT_FIELD;
        hashtable.put(Byte.valueOf(enumC123515.m29985()), enumC123515);
        EnumC12358 enumC123516 = EnumC12358.CONSTANT_METHOD;
        hashtable.put(Byte.valueOf(enumC123516.m29985()), enumC123516);
        EnumC12358 enumC123517 = EnumC12358.CONSTANT_INTERFACEMETHOD;
        hashtable.put(Byte.valueOf(enumC123517.m29985()), enumC123517);
        EnumC12358 enumC123518 = EnumC12358.CONSTANT_NAMEANDTYPE;
        hashtable.put(Byte.valueOf(enumC123518.m29985()), enumC123518);
        EnumC12358 enumC123519 = EnumC12358.CONSTANT_METHODHANDLE;
        hashtable.put(Byte.valueOf(enumC123519.m29985()), enumC123519);
        EnumC12358 enumC123520 = EnumC12358.CONSTANT_METHODTYPE;
        hashtable.put(Byte.valueOf(enumC123520.m29985()), enumC123520);
        EnumC12358 enumC123521 = EnumC12358.CONSTANT_DYNAMIC;
        hashtable.put(Byte.valueOf(enumC123521.m29985()), enumC123521);
        EnumC12358 enumC123522 = EnumC12358.CONSTANT_INVOKEDYNAMIC;
        hashtable.put(Byte.valueOf(enumC123522.m29985()), enumC123522);
        EnumC12358 enumC123523 = EnumC12358.CONSTANT_MODULE;
        hashtable.put(Byte.valueOf(enumC123523.m29985()), enumC123523);
        EnumC12358 enumC123524 = EnumC12358.CONSTANT_PACKAGE;
        hashtable.put(Byte.valueOf(enumC123524.m29985()), enumC123524);
        EnumC13063 enumC13063 = EnumC13063.REF_GETFIELD;
        hashtable2.put(Byte.valueOf(enumC13063.m31635()), enumC13063);
        EnumC13063 enumC13064 = EnumC13063.REF_GETSTATIC;
        hashtable2.put(Byte.valueOf(enumC13064.m31635()), enumC13064);
        EnumC13063 enumC13065 = EnumC13063.REF_PUTFIELD;
        hashtable2.put(Byte.valueOf(enumC13065.m31635()), enumC13065);
        EnumC13063 enumC13066 = EnumC13063.REF_PUTSTATIC;
        hashtable2.put(Byte.valueOf(enumC13066.m31635()), enumC13066);
        EnumC13063 enumC13067 = EnumC13063.REF_INVOKEVIRTUAL;
        hashtable2.put(Byte.valueOf(enumC13067.m31635()), enumC13067);
        EnumC13063 enumC13068 = EnumC13063.REF_INVOKESTATIC;
        hashtable2.put(Byte.valueOf(enumC13068.m31635()), enumC13068);
        EnumC13063 enumC13069 = EnumC13063.REF_INVOKESPECIAL;
        hashtable2.put(Byte.valueOf(enumC13069.m31635()), enumC13069);
        EnumC13063 enumC130610 = EnumC13063.REF_NEWINVOKESPECIAL;
        hashtable2.put(Byte.valueOf(enumC130610.m31635()), enumC130610);
        EnumC13063 enumC130611 = EnumC13063.REF_INVOKEINTERFACE;
        hashtable2.put(Byte.valueOf(enumC130611.m31635()), enumC130611);
    }

    public C10242(C20826 c20826) {
        super(c20826.f29325);
        this.f30884 = false;
        this.f30880 = "";
        this.f30886 = 0;
        this.f30881 = 0;
        this.f30887 = 0;
        this.f30885 = c20826;
        this.f30883 = c20826.f35255;
        this.f29348 = EnumC0970.CONSTANT_POOL;
        this.f30882 = new ArrayList(10);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25959(boolean z) {
        this.f30884 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m25957(EnumC12358 enumC12358) {
        return this.f30884 ? C9045.m23341(new StringBuilder(), enumC12358.f37042, " ") : "";
    }

    public final int size() {
        return this.f30882.size();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m25968(int i) {
        if (this.f30888 == null) {
            this.f30888 = new C20603(1, Integer.valueOf(this.f30882.size() - 1));
        }
        return this.f30888.m47146(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25958(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        ArrayList arrayList = new ArrayList(unsignedShort);
        this.f30882 = arrayList;
        arrayList.add(0, null);
        AbstractC19898 abstractC19898 = this.f30883;
        abstractC19898.m45778(C19370.m44628(unsignedShort, "constant_pool_count = "), new Object[0]);
        int i = 1;
        while (i < unsignedShort) {
            byte b = dataInputStream.readByte();
            EnumC12358 enumC12358 = (EnumC12358) f30879.get(Byte.valueOf(b));
            if (enumC12358 == null) {
                throw new ClassFormatError(String.format("Error while reading constant pool for %s: unexpected tag at #%d: %d", abstractC19898.m45772(), Integer.valueOf(i), Byte.valueOf(b)));
            }
            int iM29983 = enumC12358.m29983();
            StringBuilder sbM46682 = C20361.m46682("\tCP entry #", i, " tag[", "]\t=\t", b);
            sbM46682.append(enumC12358);
            abstractC19898.m45778(sbM46682.toString(), new Object[0]);
            switch (enumC12358.ordinal()) {
                case 1:
                    this.f30882.add(i, new C4597(this, enumC12358, dataInputStream.readUTF()));
                    break;
                case 2:
                    this.f30882.add(i, new C22236(this, enumC12358, dataInputStream.readInt()));
                    break;
                case 3:
                    this.f30882.add(i, new C21531(this, enumC12358, dataInputStream.readFloat()));
                    break;
                case 4:
                    this.f30882.add(i, new C20120(this, enumC12358, dataInputStream.readLong()));
                    this.f30882.add(null);
                    break;
                case 5:
                    this.f30882.add(i, new C15179(this, enumC12358, dataInputStream.readDouble()));
                    this.f30882.add(null);
                    break;
                case 6:
                case 7:
                case 13:
                case 16:
                case 17:
                    this.f30882.add(i, new C8125(this, enumC12358, dataInputStream.readUnsignedShort()));
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 14:
                case 15:
                    this.f30882.add(i, new C1069(this, enumC12358, dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort()));
                    break;
                case 12:
                    this.f30882.add(i, new C1069(this, enumC12358, dataInputStream.readUnsignedByte(), dataInputStream.readUnsignedShort()));
                    break;
                default:
                    throw new ClassFormatError(C19370.m44628(b, "invalid constant type: "));
            }
            i += iM29983;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC3186 m25953(int i) {
        if (m25968(i)) {
            return (AbstractC3186) this.f30882.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m25965(int i, Function function) {
        AbstractC3186 abstractC3186;
        return (m25968(i) && (abstractC3186 = (AbstractC3186) this.f30882.get(i)) != null && abstractC3186.f10052 == EnumC12358.CONSTANT_UTF8) ? (String) ((C4597) abstractC3186).f10053 : (String) function.apply(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m25969(int i) {
        AbstractC3186 abstractC3186;
        return (m25968(i) && (abstractC3186 = (AbstractC3186) this.f30882.get(i)) != null && abstractC3186.f10052 == EnumC12358.CONSTANT_MODULE) ? abstractC3186.mo3639() : "#" + Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m25970(int i) {
        AbstractC3186 abstractC3186;
        return (m25968(i) && (abstractC3186 = (AbstractC3186) this.f30882.get(i)) != null && abstractC3186.f10052 == EnumC12358.CONSTANT_PACKAGE) ? abstractC3186.mo3639() : "#" + Integer.valueOf(i);
    }

    public final String getName(int i) {
        String strM25965 = m25965(i, new C22827(5));
        return strM25965 == null ? C18307.m42645(i, "<invalid constant pool index:", ">") : C13573.m32625(strM25965);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m25960(int i) {
        return m25955(i, new C11213(4));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m25967(int i) {
        AbstractC3186 abstractC3186 = (AbstractC3186) this.f30882.get(i);
        if (abstractC3186 != null && (abstractC3186 instanceof C1069)) {
            return ((C1069) abstractC3186).mo3639();
        }
        return abstractC3186.mo3639();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m25962(final int i) {
        AbstractC3186 abstractC3186 = (AbstractC3186) this.f30882.get(i);
        if (abstractC3186 != null && abstractC3186.f10052 == EnumC12358.CONSTANT_NAMEANDTYPE) {
            final EnumC12358[] enumC12358Arr = {EnumC12358.CONSTANT_METHOD, EnumC12358.CONSTANT_INTERFACEMETHOD, EnumC12358.CONSTANT_METHODHANDLE, EnumC12358.CONSTANT_DYNAMIC, EnumC12358.CONSTANT_INVOKEDYNAMIC};
            if (!C5378.stream(this.f30882).filter(new Predicate() { // from class: l.֡ۧ֨
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    AbstractC3186 abstractC3187 = (AbstractC3186) obj;
                    return abstractC3187 != null && abstractC3187.f10052.m29982(enumC12358Arr);
                }
            }).filter(new Predicate() { // from class: l.ۚۧ֨
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((C1069) ((AbstractC3186) obj)).f3918 == i;
                }
            }).findFirst().isPresent()) {
                return abstractC3186.mo3639();
            }
        }
        AbstractC13546 abstractC13546M45770 = this.f30883.m45770();
        Object[] objArr = {Integer.valueOf(i)};
        abstractC13546M45770.getClass();
        String strM32594 = AbstractC13546.m32594("The ConstantPool[{0}] must be a CONSTANT_NameAndType_info structure with a field descriptor", objArr);
        return this.f29326 ? strM32594 : String.format("??? #%d %s", Integer.valueOf(i), strM32594);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m25966(int i, String str) {
        String strM25955 = m25955(i, new C22827(5));
        if (strM25955 == null) {
            return String.format(str, Integer.valueOf(i));
        }
        return strM25955.replace('/', '.');
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m25955(int i, Function function) {
        AbstractC3186 abstractC3186;
        AbstractC3186 abstractC3187 = null;
        if (m25968(i) && (abstractC3186 = (AbstractC3186) this.f30882.get(i)) != null && abstractC3186.f10052 == EnumC12358.CONSTANT_CLASS) {
            abstractC3187 = abstractC3186;
        }
        if (abstractC3187 == null) {
            return (String) function.apply(Integer.valueOf(i));
        }
        return m25956((C8125) abstractC3187);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m25956(C8125 c8125) {
        AbstractC3186 abstractC3186;
        int iIntValue = ((Integer) c8125.f10053).intValue();
        String strM44628 = C19370.m44628(iIntValue, "#");
        if (!m25968(iIntValue) || (abstractC3186 = (AbstractC3186) this.f30882.get(iIntValue)) == null || abstractC3186.f10052 != EnumC12358.CONSTANT_UTF8) {
            return strM44628;
        }
        String str = (String) ((C4597) abstractC3186).f10053;
        return (str == null || !str.startsWith("[")) ? str : C4860.m14172("\"", str, "\"");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m25947(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(47);
        return (iLastIndexOf == str2.length() && str.startsWith(str2)) ? str.substring(iLastIndexOf + 1) : str;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m25964(int i) {
        if (!m25968(i)) {
            return String.format("<invalid constant pool index: %d>", Integer.valueOf(i));
        }
        AbstractC3186 abstractC3186 = (AbstractC3186) this.f30882.get(i);
        return abstractC3186 == null ? "<null>" : abstractC3186.mo3639();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m25961(int i) {
        EnumC12358 enumC12358;
        if (i == 0 || !m25968(i)) {
            return C19370.m44628(i, "#");
        }
        AbstractC3186 abstractC3186 = (AbstractC3186) this.f30882.get(i);
        if (abstractC3186 == null) {
            return C19370.m44628(i, "#");
        }
        if (abstractC3186 instanceof C1069) {
            C1069 c1069 = (C1069) abstractC3186;
            if (((Integer) c1069.f10053).intValue() == this.f30885.f67415 && ((enumC12358 = c1069.f10052) == EnumC12358.CONSTANT_FIELD || enumC12358 == EnumC12358.CONSTANT_METHOD || enumC12358 == EnumC12358.CONSTANT_INTERFACEMETHOD)) {
                i = c1069.f3918;
            }
        }
        return abstractC3186.f10052.f37042 + " " + m25964(i);
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo24649() {
        return this.f29347;
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ᩴ */
    public final void mo18679() {
        if (this.f29336 && !this.f29343) {
            m24665("// " + this.f29348.m3427() + ":");
        }
        int i = 1;
        while (i < this.f30882.size()) {
            AbstractC3186 abstractC3186 = (AbstractC3186) this.f30882.get(i);
            int iMo9801 = 0;
            m24655(this.f30880, Integer.valueOf(i));
            if (abstractC3186 == null) {
                m24665("null;");
            } else {
                iMo9801 = abstractC3186.mo9801();
                abstractC3186.f10050 = Math.max(AbstractC9701.f29320, this.f30887);
                abstractC3186.mo3637(this.f29325, this.f30887);
            }
            i += iMo9801;
        }
        this.f29325.mo1973("");
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ۚ */
    public final void mo18674() {
        if (this.f29336 && !this.f29343) {
            m24665("// " + this.f29348.m3427() + ":");
        }
        int i = 1;
        while (i < this.f30882.size()) {
            AbstractC3186 abstractC3186 = (AbstractC3186) this.f30882.get(i);
            int iMo9801 = 0;
            m24655(this.f30880, Integer.valueOf(i));
            if (abstractC3186 == null) {
                m24665("null;");
            } else {
                iMo9801 = abstractC3186.mo9801();
                abstractC3186.f10050 = Math.max(AbstractC9701.f29320, this.f30887);
                abstractC3186.mo3638(this.f29325, this.f30887);
            }
            i += iMo9801;
        }
        this.f29325.mo1973("");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m25954() {
        int iOrElse = C5378.stream(this.f30882).mapToInt(new ToIntFunction() { // from class: l.ۘۧ֨
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                AbstractC3186 abstractC3186 = (AbstractC3186) obj;
                C10242 c10242 = this.f12452;
                c10242.getClass();
                if (abstractC3186 == null) {
                    return 4;
                }
                return abstractC3186.f10052.m29980(c10242.f29347);
            }
        }).max().orElse(10);
        this.f30881 = this.f30882.size() > 100 ? 4 : 3;
        this.f30887 = iOrElse + 1;
        String strM9831 = C3200.m9831(this.f30881, "d = ", new StringBuilder("const #%-"));
        this.f30880 = strM9831;
        this.f30886 = String.format(strM9831, Integer.valueOf(this.f30882.size())).length();
        int iM24656 = m24656() + this.f30886;
        int i = this.f30887;
        this.f29349 = Math.max(AbstractC9701.f29320, i) + iM24656 + i;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final List m25963() {
        int i = 0;
        return C5378.stream(this.f30882).filter(new C18709(i)).flatMap(new C19415(i)).toList();
    }
}
