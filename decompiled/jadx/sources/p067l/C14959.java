package p067l;

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
public final class C14959 extends AbstractC13599 {

    /* JADX INFO: renamed from: ᩶ۧ */
    public static C21949 f42723 = new C21949(247, 255);

    /* JADX INFO: renamed from: ֡ۧ */
    public int f42724;

    /* JADX INFO: renamed from: ֨ۧ */
    public String f42725;

    /* JADX INFO: renamed from: ۖۧ */
    public int f42726;

    /* JADX INFO: renamed from: ۘۧ */
    public InterfaceC5572 f42727;

    /* JADX INFO: renamed from: ۚۧ */
    public int[] f42728;

    /* JADX INFO: renamed from: ۜۧ */
    public int f42729;

    /* JADX INFO: renamed from: ۠ۧ */
    public String f42730;

    /* JADX INFO: renamed from: ۡۧ */
    public boolean f42731;

    /* JADX INFO: renamed from: ۢۧ */
    public String f42732;

    /* JADX INFO: renamed from: ܶۧ */
    public int f42733;

    /* JADX INFO: renamed from: ܺۧ */
    public int[] f42734;

    /* JADX INFO: renamed from: ᩴۧ */
    public int f42735;

    /* JADX INFO: renamed from: ᩵ۧ */
    public EnumC24233 f42736;

    /* JADX INFO: renamed from: ᩷ۧ */
    public int f42737;

    /* JADX INFO: renamed from: ᩸ۧ */
    public int[] f42738;

    /* JADX INFO: renamed from: ᩹ۧ */
    public int f42739;

    /* JADX INFO: renamed from: ᩻ۧ */
    public final EnumC6799 f42740;

    /* JADX INFO: renamed from: ۧ */
    public static void m34250(C14959 c14959) {
        boolean z = c14959.f32275;
        int[] iArr = c14959.f42734;
        c14959.m26676(c14959.m26677(c14959.m26683(), String.format(c14959.f42732, EnumC16818.f49651.m38127(), Integer.valueOf(c14959.f42737))));
        String str = String.format("%-10s", EnumC16818.f49630.m38127());
        int[] iArr2 = c14959.f42728;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(str, new C8537(Boolean.valueOf(iArr2 != null), iArr2)), new AbstractMap.SimpleEntry(String.format("%-10s", EnumC16818.f49720.m38127()), new C8537(Boolean.valueOf(iArr != null), iArr))};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            C12826.requireNonNull(key);
            Object value = entry.getValue();
            C12826.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(C7470.m17246(key, "duplicate key: "));
            }
        }
        for (Map.Entry entry2 : C21562.unmodifiableMap(map).entrySet()) {
            if (((Boolean) ((C8537) entry2.getValue()).f22916).booleanValue()) {
                int[] iArr3 = (int[]) ((C8537) entry2.getValue()).f22917;
                C8537 c8537M34251 = c14959.m34251(" ", iArr3);
                String str2 = String.format(c14959.f42725, entry2.getKey(), C10965.m25286(new StringBuilder("["), (String) (z ? c8537M34251.f22916 : c8537M34251.f22917), "]"));
                if (!z) {
                    c14959.m26676(c14959.m26677(c14959.m26683() * 2, str2));
                } else if (c14959.f32292) {
                    c14959.m26676(c14959.m26677(c14959.m26683() * 2, str2));
                } else {
                    c14959.m26668(c14959.m26671((((c14959.f38260.m26665() + c14959.f42735) + 27) - (c14959.m26683() * 2)) - 2, c14959.m26677(c14959.m26683(), str2)));
                    c14959.m26676(iArr3.length == 0 ? "" : " //" + ((String) c8537M34251.f22917));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX INFO: renamed from: ֫ */
    public static void m34248(C14959 c14959) {
        boolean z;
        int length;
        String str;
        ?? r8;
        char c;
        int[] iArr = c14959.f42734;
        int[] iArr2 = c14959.f42728;
        int[] iArr3 = c14959.f42738;
        EnumC24233 enumC24233 = c14959.f42736;
        boolean z2 = c14959.f32292;
        boolean z3 = c14959.f32275;
        int i = c14959.f42729;
        String str2 = c14959.f42732;
        String strM38127 = EnumC16818.f49706.m38127();
        int i2 = c14959.f42724;
        int i3 = 0;
        String str3 = String.format(str2, strM38127, Integer.valueOf(i2));
        if (c14959.f42731) {
            c14959.m26678(c14959.f42739);
        }
        if (z2 && z3) {
            c14959.m26679(str3);
            r8 = 0;
            c = 1;
            str = "";
        } else {
            if (z3) {
                length = ((str3.length() + (c14959.f38260.m26665() + c14959.f42735)) - (c14959.m26683() * 2)) - 2;
                z = false;
            } else {
                z = false;
                length = str3.length();
            }
            i3 = length + i;
            if (z3) {
                str = "";
                c14959.m26672(c14959.m26671(i3 - ((c14959.f42739 + 2) * c14959.m26683()), str3));
                c14959.m26676(z2 ? str : " // " + enumC24233.m53550());
            } else {
                str = "";
                c14959.m26672(c14959.m26671(i3 - (c14959.m26683() * c14959.f42739), str3));
                c14959.m26676(z2 ? str : " // " + enumC24233.m53550());
            }
            r8 = z;
            c = 1;
        }
        if (f42723.m49472(Integer.valueOf(i2))) {
            String str4 = c14959.f42732;
            String strM38128 = EnumC16818.f49631.m38127();
            Integer numValueOf = Integer.valueOf(c14959.f42726);
            Object[] objArr = new Object[2];
            objArr[r8] = strM38128;
            objArr[c] = numValueOf;
            c14959.m26676(c14959.m26677(i, String.format(str4, objArr)));
        }
        if (enumC24233 != EnumC24233.EARLY_LARVAL) {
            String strM38129 = EnumC16818.f49630.m38127();
            C8537 c8537 = new C8537(Boolean.valueOf(iArr2 != null), iArr2);
            String strM381210 = EnumC16818.f49720.m38127();
            C8537 c8538 = new C8537(Boolean.valueOf(iArr != null), iArr);
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(strM38129, c8537);
            AbstractMap.SimpleEntry simpleEntry2 = new AbstractMap.SimpleEntry(strM381210, c8538);
            Map.Entry[] entryArr = {simpleEntry, simpleEntry2};
            HashMap map = new HashMap(2);
            int i4 = 0;
            for (int i5 = 2; i4 < i5; i5 = 2) {
                Map.Entry entry = entryArr[i4];
                Object key = entry.getKey();
                C12826.requireNonNull(key);
                Object value = entry.getValue();
                C12826.requireNonNull(value);
                if (map.put(key, value) != null) {
                    throw new IllegalArgumentException(C7470.m17246(key, "duplicate key: "));
                }
                i4++;
            }
            for (Map.Entry entry2 : C21562.unmodifiableMap(map).entrySet()) {
                if (((Boolean) ((C8537) entry2.getValue()).f22916).booleanValue()) {
                    C8537 c8537M34251 = c14959.m34251(" ", (int[]) ((C8537) entry2.getValue()).f22917);
                    String strM25286 = C10965.m25286(new StringBuilder("["), (String) (z3 ? c8537M34251.f22916 : c8537M34251.f22917), "]");
                    if (!z3) {
                        c14959.m26676(c14959.m26677(i, String.format(c14959.f42725, entry2.getKey(), strM25286)));
                    } else if (z2) {
                        c14959.m26676(c14959.m26677(i, String.format(c14959.f42725, entry2.getKey(), strM25286)));
                    } else {
                        c14959.f32274.mo4344(c14959.m26671(i3, c14959.m26677(i, String.format(c14959.f42725, entry2.getKey(), strM25286))));
                        c14959.m26676(" //" + ((String) c8537M34251.f22917));
                    }
                }
            }
            if (c14959.f42731) {
                for (int i6 = 0; i6 < c14959.f42739; i6++) {
                    c14959.m26676(c14959.m26677(z3 ? c14959.f42733 : i, " }"));
                    c14959.m26667(1);
                }
                return;
            }
            return;
        }
        if (iArr3 != null) {
            int length2 = iArr3.length - 1;
            String str5 = length2 >= 0 ? "; " : str;
            Object[] objArr2 = new Object[1];
            objArr2[r8] = EnumC16818.f49602.m38127();
            String str6 = String.format("%-12s", objArr2);
            C8537 c8537M34252 = c14959.m34252(iArr3);
            String strConcat = ((String) C7480.stream((List) c8537M34252.f22916).collect(C24205.joining(", "))).concat(str5);
            String strConcat2 = ((String) C7480.stream((List) c8537M34252.f22917).collect(C24205.joining(", "))).concat(str5);
            String str7 = c14959.f42725;
            String strM25287 = C10965.m25286(new StringBuilder("[ "), z3 ? strConcat : strConcat2, "] {");
            Object[] objArr3 = new Object[2];
            objArr3[r8] = str6;
            objArr3[1] = strM25287;
            String str8 = String.format(str7, objArr3);
            if (!z3) {
                if (length2 <= 0) {
                    c14959.m26676(c14959.m26677(i, str8));
                    return;
                }
                c14959.m26676(c14959.m26677(i, String.format(c14959.f42725, str6, "[ " + ((String) ((List) c8537M34252.f22917).get(0)).concat(","))));
                int i7 = 1;
                while (i7 <= length2) {
                    c14959.m26676(c14959.m26677(i3 - 2, C6988.m16053(" ", (String) ((List) c8537M34252.f22917).get(i7), i7 == length2 ? "; ] {" : ",")));
                    i7++;
                }
                return;
            }
            if (z2) {
                c14959.m26676(c14959.m26677(i, str8));
                return;
            }
            if (length2 <= 0) {
                c14959.m26668(c14959.m26671(i3, c14959.m26677(i, str8)));
                c14959.m26676(iArr3.length == 0 ? str : C21466.m48631(" // ", strConcat2));
                return;
            }
            String strM26671 = c14959.m26671(i3, c14959.m26677(i, String.format(c14959.f42725, str6, "[ " + ((String) ((List) c8537M34252.f22916).get(0)).concat(","))));
            int iIndexOf = strM26671.indexOf(91) - ((c14959.f42739 + 1) * 2);
            c14959.f32274.mo4344(strM26671);
            c14959.m26676(" // " + ((String) ((List) c8537M34252.f22917).get(0)));
            int i8 = 1;
            while (i8 <= length2) {
                String str9 = i8 == length2 ? "; ]  {" : ",";
                String str10 = (String) ((List) c8537M34252.f22916).get(i8);
                String str11 = (String) ((List) c8537M34252.f22917).get(i8);
                c14959.f32274.mo4344(c14959.m26671(i3, c14959.m26677(iIndexOf, str10.concat(str9))));
                c14959.m26676(" // " + str11);
                i8++;
            }
        }
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ᩳ */
    public final void mo6311(int i, int i2) {
        mo6308(i, i2);
    }

    @Override // p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6310() {
        return this.f32296;
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ۧ */
    public final void mo6308(int i, int i2) {
        m26678(1);
        if (i == 0) {
            m26679(this.f42730);
        }
        this.f42727.mo4662(Integer.valueOf(i), Integer.valueOf(i2));
        m26667(1);
    }

    public C14959(C4726 c4726, DataInputStream dataInputStream) {
        super(c4726);
        this.f42731 = false;
        this.f42739 = 0;
        this.f42729 = m26683() * 2;
        this.f42733 = m26683() * 3;
        this.f42732 = "";
        this.f42725 = "";
        this.f42730 = "";
        EnumC6799 enumC6799 = EnumC6799.f17650;
        this.f42740 = enumC6799;
        this.f38254 = enumC6799.m15521();
        this.f32297 = EnumC3290.STACK_MAP;
        this.f42727 = new InterfaceC5572() { // from class: l.ۘܿ֨
            @Override // p067l.InterfaceC5572
            /* JADX INFO: renamed from: ֫ */
            public final void mo4662(Integer num, Integer num2) {
                C14959.m34250(this.f15810);
            }
        };
        EnumC24233 enumC24233 = EnumC24233.FULL_FRAME;
        this.f42736 = enumC24233;
        this.f42724 = enumC24233.m53545();
        this.f42737 = dataInputStream.readUnsignedShort();
        this.f42734 = m34249(dataInputStream.readUnsignedShort(), dataInputStream);
        this.f42728 = m34249(dataInputStream.readUnsignedShort(), dataInputStream);
        this.f38257.m48074(new C20325(this, 0));
    }

    public C14959(boolean z, int i, C4726 c4726, DataInputStream dataInputStream) throws IOException {
        super(c4726);
        this.f42731 = false;
        this.f42739 = 0;
        this.f42729 = m26683() * 2;
        this.f42733 = m26683() * 3;
        this.f42732 = "";
        this.f42725 = "";
        this.f42730 = "";
        EnumC6799 enumC6799 = EnumC6799.f17647;
        this.f42740 = enumC6799;
        this.f38254 = enumC6799.m15521();
        this.f32297 = EnumC3290.STACK_MAP_TABLE;
        int unsignedByte = dataInputStream.readUnsignedByte();
        this.f42724 = unsignedByte;
        EnumC24233 enumC24233M53543 = EnumC24233.m53543(unsignedByte);
        this.f42736 = enumC24233M53543;
        this.f42727 = new InterfaceC5572() { // from class: l.֡ܿ֨
            @Override // p067l.InterfaceC5572
            /* JADX INFO: renamed from: ֫ */
            public final void mo4662(Integer num, Integer num2) {
                C14959.m34248(this.f4995);
            }
        };
        switch (C6913.f18001[enumC24233M53543.ordinal()]) {
            case 1:
                this.f42726 = -1;
                int unsignedShort = dataInputStream.readUnsignedShort();
                int[] iArr = new int[unsignedShort];
                for (int i2 = 0; i2 < unsignedShort; i2++) {
                    iArr[i2] = dataInputStream.readUnsignedShort();
                }
                this.f42738 = iArr;
                this.f38257.m48074(new Supplier() { // from class: l.ۚܿ֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return String.format(" early_larval_frame=%d", Integer.valueOf(this.f19872.f42724));
                    }
                });
                break;
            case 2:
                this.f42726 = unsignedByte;
                this.f38257.m48074(new Supplier() { // from class: l.֨ܿ֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return String.format(" same_frame=%d", Integer.valueOf(this.f7218.f42724));
                    }
                });
                break;
            case 3:
                this.f42726 = dataInputStream.readUnsignedShort();
                this.f38257.m48074(new Supplier() { // from class: l.۠ܿ֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C14959 c14959 = this.f28423;
                        return String.format(" same_frame_extended=%d, offset=%d", Integer.valueOf(c14959.f42724), Integer.valueOf(c14959.f42726));
                    }
                });
                break;
            case 4:
                this.f42726 = unsignedByte - 64;
                this.f42728 = m34249(1, dataInputStream);
                this.f38257.m48074(new Supplier() { // from class: l.ܶܿ֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C14959 c14959 = this.f50204;
                        return String.format(" same_locals_1_stack_item_frame=%d, offset=%d, numstack=%s", Integer.valueOf(c14959.f42724), Integer.valueOf(c14959.f42726), C19937.m45253(c14959.f42728));
                    }
                });
                break;
            case 5:
                this.f42726 = dataInputStream.readUnsignedShort();
                this.f42728 = m34249(1, dataInputStream);
                this.f38257.m48074(new C23007(this, 0));
                break;
            case 6:
            case 7:
            case 8:
                this.f42726 = dataInputStream.readUnsignedShort();
                this.f38257.m48074(new C15609(this, 1));
                break;
            case 9:
                this.f42726 = dataInputStream.readUnsignedShort();
                this.f42734 = m34249(unsignedByte - 251, dataInputStream);
                this.f38257.m48074(new C23677(this, 0));
                break;
            case 10:
                this.f42726 = dataInputStream.readUnsignedShort();
                this.f42734 = m34249(dataInputStream.readUnsignedShort(), dataInputStream);
                this.f42728 = m34249(dataInputStream.readUnsignedShort(), dataInputStream);
                this.f38257.m48074(new Supplier() { // from class: l.᩶ܿ֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C14959 c14959 = this.f68244;
                        return String.format(" full_frame=%d offset=%d numloc=%s  numstack=%s", Integer.valueOf(c14959.f42724), Integer.valueOf(c14959.f42726), C19937.m45253(c14959.f42734), C19937.m45253(c14959.f42728));
                    }
                });
                break;
            default:
                this.f38257.m48074(new C4902());
                break;
        }
        if (i <= 0 && z) {
            this.f42737 = this.f42726;
        } else {
            this.f42737 = i + this.f42726 + 1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8537 m34252(int[] iArr) {
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = new ArrayList(length);
        for (int i : iArr) {
            if (((C4726) this.f38259).f32275) {
                arrayList.add(String.format("#%d", Integer.valueOf(i)));
            }
            arrayList2.add(((C4726) this.f38259).f38266.m27984(i));
        }
        return new C8537(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8537 m34251(String str, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new C8537("", "");
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
            EnumC15515 enumC15515M22083 = C9481.m22083(i3, C18189.m41402of(new InterfaceC15912() { // from class: l.ܺܿ֨
                @Override // p067l.InterfaceC15912
                /* JADX INFO: renamed from: ֫ */
                public final void mo36031(Object[] objArr) {
                    this.f52704.f38257.mo13866("Unknown StackMapTable verification type {0}", objArr);
                }
            }));
            String str2 = i == 0 ? "" : " ";
            int i4 = i2 >> 8;
            int i5 = C6913.f18002[enumC15515M22083.ordinal()];
            if (i5 == 1) {
                if (((C4726) this.f38259).f32275) {
                    sb.append(str2);
                    sb.append("#");
                    sb.append(i4);
                }
                sb2.append(str2);
                sb2.append(((C4726) this.f38259).f38266.m27983(i4));
            } else if (i5 == 2) {
                if (((C4726) this.f38259).f32275) {
                    sb.append(str2);
                    sb.append(i3);
                    sb.append(" ");
                    sb.append(m26682());
                    sb.append(i4);
                }
                sb2.append(str2);
                sb2.append(enumC15515M22083.m35310());
                sb2.append(" ");
                sb2.append(m26682());
                sb2.append(i4);
            } else {
                if (((C4726) this.f38259).f32275) {
                    sb.append(str2);
                    sb.append(i3);
                }
                sb2.append(str2);
                sb2.append(enumC15515M22083.m35310());
            }
            if (((C4726) this.f38259).f32275) {
                sb.append(i == length ? ';' : ',');
            }
            sb2.append(i == length ? ';' : ',');
            if (i == length) {
                sb.append(str);
                sb2.append(str);
            }
            i++;
        }
        return new C8537(sb.toString(), sb2.toString());
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m34254() {
        return this.f42740 == EnumC6799.f17647;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34253(int i, String str, String str2) {
        this.f42732 = str;
        this.f42725 = str2;
        this.f42735 = i;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m34255(String str) {
        this.f42730 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    private int[] m34249(int i, DataInputStream dataInputStream) throws IOException {
        int unsignedShort;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int unsignedByte = dataInputStream.readUnsignedByte();
            int i3 = C6913.f18002[C9481.m22083(unsignedByte, C18189.m41402of(new InterfaceC15912() { // from class: l.᩵ܿ֨
                @Override // p067l.InterfaceC15912
                /* JADX INFO: renamed from: ֫ */
                public final void mo36031(Object[] objArr) {
                    this.f65913.f38257.mo13866("Unknown StackMapTable verification type {0}", objArr);
                }
            })).ordinal()];
            if (i3 == 1) {
                unsignedShort = dataInputStream.readUnsignedShort();
            } else {
                if (i3 == 2) {
                    unsignedShort = dataInputStream.readUnsignedShort();
                    ((C4726) this.f38259).m10016(unsignedShort).f62726 = true;
                }
                iArr[i2] = unsignedByte;
            }
            unsignedByte |= unsignedShort << 8;
            iArr[i2] = unsignedByte;
        }
        return iArr;
    }
}
