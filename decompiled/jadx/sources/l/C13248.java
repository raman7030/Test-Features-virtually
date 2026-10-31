package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۬ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes4.dex */
public final class C13248 extends AbstractC11817 {

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public static C20603 f39659 = new C20603(247, 255);

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public int f39660;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public String f39661;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public int f39662;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC3371 f39663;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public int[] f39664;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int f39665;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public String f39666;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public boolean f39667;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public String f39668;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public int f39669;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public int[] f39670;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public int f39671;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public EnumC23006 f39672;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f39673;

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public int[] f39674;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public int f39675;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC4662 f39676;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m32151(C13248 c13248) {
        boolean z = c13248.f29326;
        int[] iArr = c13248.f39670;
        c13248.m24662(c13248.m24663(c13248.m24669(), String.format(c13248.f39668, EnumC15204.f46526.m35967(), Integer.valueOf(c13248.f39673))));
        String str = String.format("%-10s", EnumC15204.f46505.m35967());
        int[] iArr2 = c13248.f39664;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(str, new C6491(Boolean.valueOf(iArr2 != null), iArr2)), new AbstractMap.SimpleEntry(String.format("%-10s", EnumC15204.f46595.m35967()), new C6491(Boolean.valueOf(iArr != null), iArr))};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            C11003.requireNonNull(key);
            Object value = entry.getValue();
            C11003.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(C5368.m15337(key, "duplicate key: "));
            }
        }
        for (Map.Entry entry2 : C20195.unmodifiableMap(map).entrySet()) {
            if (((Boolean) ((C6491) entry2.getValue()).f20042).booleanValue()) {
                int[] iArr3 = (int[]) ((C6491) entry2.getValue()).f20043;
                C6491 c6491M32152 = c13248.m32152(" ", iArr3);
                String str2 = String.format(c13248.f39661, entry2.getKey(), C9045.m23341(new StringBuilder("["), (String) (z ? c6491M32152.f20042 : c6491M32152.f20043), "]"));
                if (!z) {
                    c13248.m24662(c13248.m24663(c13248.m24669() * 2, str2));
                } else if (c13248.f29343) {
                    c13248.m24662(c13248.m24663(c13248.m24669() * 2, str2));
                } else {
                    c13248.m24654(c13248.m24657((((c13248.f35258.m24651() + c13248.f39671) + 27) - (c13248.m24669() * 2)) - 2, c13248.m24663(c13248.m24669(), str2)));
                    c13248.m24662(iArr3.length == 0 ? "" : " //" + ((String) c6491M32152.f20043));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32149(C13248 c13248) {
        boolean z;
        int length;
        String str;
        ?? r8;
        char c;
        int[] iArr = c13248.f39670;
        int[] iArr2 = c13248.f39664;
        int[] iArr3 = c13248.f39674;
        EnumC23006 enumC23006 = c13248.f39672;
        boolean z2 = c13248.f29343;
        boolean z3 = c13248.f29326;
        int i = c13248.f39665;
        String str2 = c13248.f39668;
        String strM35967 = EnumC15204.f46581.m35967();
        int i2 = c13248.f39660;
        int i3 = 0;
        String str3 = String.format(str2, strM35967, Integer.valueOf(i2));
        if (c13248.f39667) {
            c13248.m24664(c13248.f39675);
        }
        if (z2 && z3) {
            c13248.m24665(str3);
            r8 = 0;
            c = 1;
            str = "";
        } else {
            if (z3) {
                length = ((str3.length() + (c13248.f35258.m24651() + c13248.f39671)) - (c13248.m24669() * 2)) - 2;
                z = false;
            } else {
                z = false;
                length = str3.length();
            }
            i3 = length + i;
            if (z3) {
                str = "";
                c13248.m24658(c13248.m24657(i3 - ((c13248.f39675 + 2) * c13248.m24669()), str3));
                c13248.m24662(z2 ? str : " // " + enumC23006.m51157());
            } else {
                str = "";
                c13248.m24658(c13248.m24657(i3 - (c13248.m24669() * c13248.f39675), str3));
                c13248.m24662(z2 ? str : " // " + enumC23006.m51157());
            }
            r8 = z;
            c = 1;
        }
        if (f39659.m47146(Integer.valueOf(i2))) {
            String str4 = c13248.f39668;
            String strM35968 = EnumC15204.f46506.m35967();
            Integer numValueOf = Integer.valueOf(c13248.f39662);
            Object[] objArr = new Object[2];
            objArr[r8] = strM35968;
            objArr[c] = numValueOf;
            c13248.m24662(c13248.m24663(i, String.format(str4, objArr)));
        }
        if (enumC23006 != EnumC23006.EARLY_LARVAL) {
            String strM35969 = EnumC15204.f46505.m35967();
            C6491 c6491 = new C6491(Boolean.valueOf(iArr2 != null), iArr2);
            String strM359610 = EnumC15204.f46595.m35967();
            C6491 c6492 = new C6491(Boolean.valueOf(iArr != null), iArr);
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(strM35969, c6491);
            AbstractMap.SimpleEntry simpleEntry2 = new AbstractMap.SimpleEntry(strM359610, c6492);
            Map.Entry[] entryArr = {simpleEntry, simpleEntry2};
            HashMap map = new HashMap(2);
            int i4 = 0;
            for (int i5 = 2; i4 < i5; i5 = 2) {
                Map.Entry entry = entryArr[i4];
                Object key = entry.getKey();
                C11003.requireNonNull(key);
                Object value = entry.getValue();
                C11003.requireNonNull(value);
                if (map.put(key, value) != null) {
                    throw new IllegalArgumentException(C5368.m15337(key, "duplicate key: "));
                }
                i4++;
            }
            for (Map.Entry entry2 : C20195.unmodifiableMap(map).entrySet()) {
                if (((Boolean) ((C6491) entry2.getValue()).f20042).booleanValue()) {
                    C6491 c6491M32152 = c13248.m32152(" ", (int[]) ((C6491) entry2.getValue()).f20043);
                    String strM23341 = C9045.m23341(new StringBuilder("["), (String) (z3 ? c6491M32152.f20042 : c6491M32152.f20043), "]");
                    if (!z3) {
                        c13248.m24662(c13248.m24663(i, String.format(c13248.f39661, entry2.getKey(), strM23341)));
                    } else if (z2) {
                        c13248.m24662(c13248.m24663(i, String.format(c13248.f39661, entry2.getKey(), strM23341)));
                    } else {
                        c13248.f29325.mo1968(c13248.m24657(i3, c13248.m24663(i, String.format(c13248.f39661, entry2.getKey(), strM23341))));
                        c13248.m24662(" //" + ((String) c6491M32152.f20043));
                    }
                }
            }
            if (c13248.f39667) {
                for (int i6 = 0; i6 < c13248.f39675; i6++) {
                    c13248.m24662(c13248.m24663(z3 ? c13248.f39669 : i, " }"));
                    c13248.m24653(1);
                }
                return;
            }
            return;
        }
        if (iArr3 != null) {
            int length2 = iArr3.length - 1;
            String str5 = length2 >= 0 ? "; " : str;
            Object[] objArr2 = new Object[1];
            objArr2[r8] = EnumC15204.f46477.m35967();
            String str6 = String.format("%-12s", objArr2);
            C6491 c6491M32153 = c13248.m32153(iArr3);
            String strConcat = ((String) C5378.stream((List) c6491M32153.f20042).collect(C22976.joining(", "))).concat(str5);
            String strConcat2 = ((String) C5378.stream((List) c6491M32153.f20043).collect(C22976.joining(", "))).concat(str5);
            String str7 = c13248.f39661;
            String strM23342 = C9045.m23341(new StringBuilder("[ "), z3 ? strConcat : strConcat2, "] {");
            Object[] objArr3 = new Object[2];
            objArr3[r8] = str6;
            objArr3[1] = strM23342;
            String str8 = String.format(str7, objArr3);
            if (!z3) {
                if (length2 <= 0) {
                    c13248.m24662(c13248.m24663(i, str8));
                    return;
                }
                c13248.m24662(c13248.m24663(i, String.format(c13248.f39661, str6, "[ " + ((String) ((List) c6491M32153.f20043).get(0)).concat(","))));
                int i7 = 1;
                while (i7 <= length2) {
                    c13248.m24662(c13248.m24663(i3 - 2, C4860.m14172(" ", (String) ((List) c6491M32153.f20043).get(i7), i7 == length2 ? "; ] {" : ",")));
                    i7++;
                }
                return;
            }
            if (z2) {
                c13248.m24662(c13248.m24663(i, str8));
                return;
            }
            if (length2 <= 0) {
                c13248.m24654(c13248.m24657(i3, c13248.m24663(i, str8)));
                c13248.m24662(iArr3.length == 0 ? str : C20094.m46315(" // ", strConcat2));
                return;
            }
            String strM24657 = c13248.m24657(i3, c13248.m24663(i, String.format(c13248.f39661, str6, "[ " + ((String) ((List) c6491M32153.f20042).get(0)).concat(","))));
            int iIndexOf = strM24657.indexOf(91) - ((c13248.f39675 + 1) * 2);
            c13248.f29325.mo1968(strM24657);
            c13248.m24662(" // " + ((String) ((List) c6491M32153.f20043).get(0)));
            int i8 = 1;
            while (i8 <= length2) {
                String str9 = i8 == length2 ? "; ]  {" : ",";
                String str10 = (String) ((List) c6491M32153.f20042).get(i8);
                String str11 = (String) ((List) c6491M32153.f20043).get(i8);
                c13248.f29325.mo1968(c13248.m24657(i3, c13248.m24663(iIndexOf, str10.concat(str9))));
                c13248.m24662(" // " + str11);
                i8++;
            }
        }
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4067(int i, int i2) {
        mo4064(i, i2);
    }

    @Override // l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4066() {
        return this.f29347;
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo4064(int i, int i2) {
        m24664(1);
        if (i == 0) {
            m24665(this.f39666);
        }
        this.f39663.mo2294(Integer.valueOf(i), Integer.valueOf(i2));
        m24653(1);
    }

    public C13248(C2481 c2481, DataInputStream dataInputStream) {
        super(c2481);
        this.f39667 = false;
        this.f39675 = 0;
        this.f39665 = m24669() * 2;
        this.f39669 = m24669() * 3;
        this.f39668 = "";
        this.f39661 = "";
        this.f39666 = "";
        EnumC4662 enumC4662 = EnumC4662.f14820;
        this.f39676 = enumC4662;
        this.f35252 = enumC4662.m13646();
        this.f29348 = EnumC0970.STACK_MAP;
        this.f39663 = new InterfaceC3371() { // from class: l.ۘܿ֨
            @Override // l.InterfaceC3371
            /* JADX INFO: renamed from: ֫ */
            public final void mo2294(Integer num, Integer num2) {
                C13248.m32151(this.f12995);
            }
        };
        EnumC23006 enumC23006 = EnumC23006.FULL_FRAME;
        this.f39672 = enumC23006;
        this.f39660 = enumC23006.m51152();
        this.f39673 = dataInputStream.readUnsignedShort();
        this.f39670 = m32150(dataInputStream.readUnsignedShort(), dataInputStream);
        this.f39664 = m32150(dataInputStream.readUnsignedShort(), dataInputStream);
        this.f35255.m45762(new C18894(this, 0));
    }

    public C13248(boolean z, int i, C2481 c2481, DataInputStream dataInputStream) throws IOException {
        super(c2481);
        this.f39667 = false;
        this.f39675 = 0;
        this.f39665 = m24669() * 2;
        this.f39669 = m24669() * 3;
        this.f39668 = "";
        this.f39661 = "";
        this.f39666 = "";
        EnumC4662 enumC4662 = EnumC4662.f14817;
        this.f39676 = enumC4662;
        this.f35252 = enumC4662.m13646();
        this.f29348 = EnumC0970.STACK_MAP_TABLE;
        int unsignedByte = dataInputStream.readUnsignedByte();
        this.f39660 = unsignedByte;
        EnumC23006 enumC23006M51150 = EnumC23006.m51150(unsignedByte);
        this.f39672 = enumC23006M51150;
        this.f39663 = new InterfaceC3371() { // from class: l.֡ܿ֨
            @Override // l.InterfaceC3371
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo2294(Integer num, Integer num2) {
                C13248.m32149(this.f2221);
            }
        };
        switch (C4782.f15169[enumC23006M51150.ordinal()]) {
            case 1:
                this.f39662 = -1;
                int unsignedShort = dataInputStream.readUnsignedShort();
                int[] iArr = new int[unsignedShort];
                for (int i2 = 0; i2 < unsignedShort; i2++) {
                    iArr[i2] = dataInputStream.readUnsignedShort();
                }
                this.f39674 = iArr;
                this.f35255.m45762(new Supplier() { // from class: l.ۚܿ֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return String.format(" early_larval_frame=%d", Integer.valueOf(this.f17032.f39660));
                    }
                });
                break;
            case 2:
                this.f39662 = unsignedByte;
                this.f35255.m45762(new Supplier() { // from class: l.֨ܿ֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return String.format(" same_frame=%d", Integer.valueOf(this.f4448.f39660));
                    }
                });
                break;
            case 3:
                this.f39662 = dataInputStream.readUnsignedShort();
                this.f35255.m45762(new Supplier() { // from class: l.۠ܿ֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C13248 c13248 = this.f25512;
                        return String.format(" same_frame_extended=%d, offset=%d", Integer.valueOf(c13248.f39660), Integer.valueOf(c13248.f39662));
                    }
                });
                break;
            case 4:
                this.f39662 = unsignedByte - 64;
                this.f39664 = m32150(1, dataInputStream);
                this.f35255.m45762(new Supplier() { // from class: l.ܶܿ֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C13248 c13248 = this.f47077;
                        return String.format(" same_locals_1_stack_item_frame=%d, offset=%d, numstack=%s", Integer.valueOf(c13248.f39660), Integer.valueOf(c13248.f39662), C18486.m42977(c13248.f39664));
                    }
                });
                break;
            case 5:
                this.f39662 = dataInputStream.readUnsignedShort();
                this.f39664 = m32150(1, dataInputStream);
                this.f35255.m45762(new C21716(this, 0));
                break;
            case 6:
            case 7:
            case 8:
                this.f39662 = dataInputStream.readUnsignedShort();
                this.f35255.m45762(new C13932(this, 1));
                break;
            case 9:
                this.f39662 = dataInputStream.readUnsignedShort();
                this.f39670 = m32150(unsignedByte - 251, dataInputStream);
                this.f35255.m45762(new C22421(this, 0));
                break;
            case 10:
                this.f39662 = dataInputStream.readUnsignedShort();
                this.f39670 = m32150(dataInputStream.readUnsignedShort(), dataInputStream);
                this.f39664 = m32150(dataInputStream.readUnsignedShort(), dataInputStream);
                this.f35255.m45762(new Supplier() { // from class: l.᩶ܿ֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C13248 c13248 = this.f65569;
                        return String.format(" full_frame=%d offset=%d numloc=%s  numstack=%s", Integer.valueOf(c13248.f39660), Integer.valueOf(c13248.f39662), C18486.m42977(c13248.f39670), C18486.m42977(c13248.f39664));
                    }
                });
                break;
            default:
                this.f35255.m45762(new C2666());
                break;
        }
        if (i <= 0 && z) {
            this.f39673 = this.f39662;
        } else {
            this.f39673 = i + this.f39662 + 1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6491 m32153(int[] iArr) {
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = new ArrayList(length);
        for (int i : iArr) {
            if (((C2481) this.f35257).f29326) {
                arrayList.add(String.format("#%d", Integer.valueOf(i)));
            }
            arrayList2.add(((C2481) this.f35257).f35264.m25962(i));
        }
        return new C6491(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6491 m32152(String str, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new C6491("", "");
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = iArr.length - 1;
        int i = 0;
        while (i <= length) {
            if (i == 0) {
                sb.append(str);
                sb2.append(str);
            }
            int i2 = iArr[i];
            int i3 = i2 & 255;
            EnumC13833 enumC13833M20107 = C7484.m20107(i3, C16646.of(new InterfaceC14251() { // from class: l.ܺܿ֨
                @Override // l.InterfaceC14251
                /* JADX INFO: renamed from: ֫ */
                public final void mo33899(Object[] objArr) {
                    this.f49541.f35255.mo11946("Unknown StackMapTable verification type {0}", objArr);
                }
            }));
            String str2 = i == 0 ? "" : " ";
            int i4 = i2 >> 8;
            int i5 = C4782.f15170[enumC13833M20107.ordinal()];
            if (i5 == 1) {
                if (((C2481) this.f35257).f29326) {
                    sb.append(str2);
                    sb.append("#");
                    sb.append(i4);
                }
                sb2.append(str2);
                sb2.append(((C2481) this.f35257).f35264.m25961(i4));
            } else if (i5 == 2) {
                if (((C2481) this.f35257).f29326) {
                    sb.append(str2);
                    sb.append(i3);
                    sb.append(" ");
                    sb.append(m24668());
                    sb.append(i4);
                }
                sb2.append(str2);
                sb2.append(enumC13833M20107.m33192());
                sb2.append(" ");
                sb2.append(m24668());
                sb2.append(i4);
            } else {
                if (((C2481) this.f35257).f29326) {
                    sb.append(str2);
                    sb.append(i3);
                }
                sb2.append(str2);
                sb2.append(enumC13833M20107.m33192());
            }
            if (((C2481) this.f35257).f29326) {
                sb.append(i == length ? ';' : ',');
            }
            sb2.append(i == length ? ';' : ',');
            if (i == length) {
                sb.append(str);
                sb2.append(str);
            }
            i++;
        }
        return new C6491(sb.toString(), sb2.toString());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m32155() {
        return this.f39676 == EnumC4662.f14817;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32154(int i, String str, String str2) {
        this.f39668 = str;
        this.f39661 = str2;
        this.f39671 = i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m32156(String str) {
        this.f39666 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int[] m32150(int i, DataInputStream dataInputStream) throws IOException {
        int unsignedShort;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int unsignedByte = dataInputStream.readUnsignedByte();
            int i3 = C4782.f15170[C7484.m20107(unsignedByte, C16646.of(new InterfaceC14251() { // from class: l.᩵ܿ֨
                @Override // l.InterfaceC14251
                /* JADX INFO: renamed from: ֫ */
                public final void mo33899(Object[] objArr) {
                    this.f63295.f35255.mo11946("Unknown StackMapTable verification type {0}", objArr);
                }
            })).ordinal()];
            if (i3 == 1) {
                unsignedShort = dataInputStream.readUnsignedShort();
            } else {
                if (i3 == 2) {
                    unsignedShort = dataInputStream.readUnsignedShort();
                    ((C2481) this.f35257).m7968(unsignedShort).f59497 = true;
                }
                iArr[i2] = unsignedByte;
            }
            unsignedByte |= unsignedShort << 8;
            iArr[i2] = unsignedByte;
        }
        return iArr;
    }
}
