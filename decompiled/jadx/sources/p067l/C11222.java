package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11222 extends C16483 {

    /* JADX INFO: renamed from: ֫ */
    public final C23292 f31214;

    /* JADX INFO: renamed from: ۧ */
    public String f31215;

    /* JADX INFO: renamed from: ܽ */
    public final C5857 f31216;

    public C11222(C5857 c5857, C23292 c23292) {
        this.f31216 = c5857;
        this.f31214 = c23292;
    }

    @Override // p067l.C16483
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC19837 mo26003(C18236 c18236) {
        return new C7908(this, c18236);
    }

    @Override // p067l.C16483
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC19837 mo3631() {
        return new InterfaceC19837() { // from class: l.۬ۙۡ
            @Override // p067l.InterfaceC19837
            /* JADX INFO: renamed from: ֫ */
            public final Object mo6575(Object obj) {
                return C11222.m25979(this.f41724, (String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m25979(C11222 c11222, String str) {
        return c11222.f31216.m13140(str, str);
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m25997(C11222 c11222, String str) {
        return c11222.f31216.m13140(str, str);
    }

    @Override // p067l.C16483
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC19837 mo19041(final C18236 c18236) {
        return new InterfaceC19837() { // from class: l.ۙۙۡ
            @Override // p067l.InterfaceC19837
            /* JADX INFO: renamed from: ֫ */
            public final Object mo6575(Object obj) {
                return C11222.m25982(this.f16947, c18236, (InterfaceC7568) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C9210 m25982(C11222 c11222, C18236 c18236, InterfaceC7568 interfaceC7568) {
        InterfaceC7568 c9210;
        C4516 c4516M13144 = c11222.f31216.m13144(interfaceC7568.mo5853());
        if (c4516M13144 == null || (c9210 = c4516M13144.m9547(c18236, interfaceC7568, c11222.f31214)) == null) {
            c9210 = new C9210(c18236, interfaceC7568);
        }
        return (C9210) c9210;
    }

    @Override // p067l.C16483
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC19837 mo26004(final C18236 c18236) {
        return new InterfaceC19837() { // from class: l.ۗۙۡ
            @Override // p067l.InterfaceC19837
            /* JADX INFO: renamed from: ֫ */
            public final Object mo6575(Object obj) {
                return C11222.m25984(this.f12271, c18236, (InterfaceC20309) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C23962 m25984(C11222 c11222, C18236 c18236, InterfaceC20309 interfaceC20309) {
        InterfaceC20309 c23962;
        C4516 c4516M13144 = c11222.f31216.m13144(interfaceC20309.mo10231());
        if (c4516M13144 == null || (c23962 = c4516M13144.m9548(c18236, interfaceC20309, c11222.f31214)) == null) {
            c23962 = new C23962(c18236, interfaceC20309);
        }
        return (C23962) c23962;
    }

    @Override // p067l.C16483
    /* JADX INFO: renamed from: ֫ */
    public final C16974 mo26000(C18236 c18236) {
        return new C16974(c18236);
    }

    @Override // p067l.C16483
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC19837 mo26002(final C18236 c18236) {
        return new InterfaceC19837() { // from class: l.ۤۙۡ
            @Override // p067l.InterfaceC19837
            /* JADX INFO: renamed from: ֫ */
            public final Object mo6575(Object obj) {
                return C11222.m25983(this.f33202, c18236, (InterfaceC21909) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C13234 m25983(C11222 c11222, C18236 c18236, InterfaceC21909 interfaceC21909) {
        if (interfaceC21909.getVisibility() == 2) {
            String type = interfaceC21909.getType();
            type.getClass();
            if (type.equals("Ldalvik/annotation/InnerClass;")) {
                return new C15914(c11222, c18236, interfaceC21909);
            }
            if (type.equals("Ldalvik/annotation/Signature;")) {
                return new C21951(c11222, c18236, interfaceC21909);
            }
        } else if (c11222.f31216.m13142(interfaceC21909.getType())) {
            return new C19268(c11222, c18236, interfaceC21909);
        }
        return new C13234(c18236, interfaceC21909);
    }

    @Override // p067l.C16483
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC19837 mo3632(C18236 c18236) {
        return new C13273(this, c18236);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Set m25981(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return new C24001(arrayList);
    }

    @Override // p067l.C16483
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC19837 mo26001(final C18236 c18236) {
        return new InterfaceC19837() { // from class: l.۫ۙۡ
            @Override // p067l.InterfaceC19837
            /* JADX INFO: renamed from: ֫ */
            public final Object mo6575(Object obj) {
                return new C15283(this.f39333, c18236, (InterfaceC20568) obj);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX INFO: renamed from: ֫ */
    public static void m25987(C11222 c11222, List list, HashMap map, C4516 c4516, int i, int i2, int i3) {
        String strM25991;
        int iM25998;
        int iMo7161;
        int iMo7162;
        String strM25995;
        int iM25999 = m25998(i, i2, list);
        if (iM25999 == -1 || (strM25991 = m25991((InterfaceC23920) list.get(iM25999))) == null || map.containsKey(Integer.valueOf(iM25999)) || (iM25998 = m25998(i, i3, list)) == -1) {
            return;
        }
        InterfaceC23920 interfaceC23920 = (InterfaceC23920) list.get(iM25998);
        if (interfaceC23920.mo6217() == EnumC3167.f5912 && ((InterfaceC22991) ((InterfaceC12777) interfaceC23920).getReference()).getType().equals("[Ljava/lang/Class;")) {
            int iM259910 = m25998(iM25998, ((InterfaceC24846) interfaceC23920).mo9978(), list);
            if (iM259910 == -1) {
                iMo7161 = -1;
            } else {
                InterfaceC23920 interfaceC23921 = (InterfaceC23920) list.get(iM259910);
                if (!(interfaceC23921 instanceof InterfaceC15202) || (iMo7161 = ((InterfaceC15202) interfaceC23921).mo7161()) < -1) {
                    iMo7161 = -1;
                }
            }
            if (iMo7161 == -1) {
                return;
            }
            String[] strArr = new String[iMo7161];
            while (true) {
                iM25998++;
                if (iM25998 >= i) {
                    break;
                }
                InterfaceC23920 interfaceC23922 = (InterfaceC23920) list.get(iM25998);
                if (interfaceC23922.mo6217() == EnumC3167.f6040) {
                    InterfaceC8082 interfaceC8082 = (InterfaceC8082) interfaceC23922;
                    if (interfaceC8082.mo9978() == i3) {
                        int iM259911 = m25998(iM25998, interfaceC8082.mo9979(), list);
                        if (iM259911 == -1) {
                            iMo7162 = -1;
                        } else {
                            InterfaceC23920 interfaceC23923 = (InterfaceC23920) list.get(iM259911);
                            if (!(interfaceC23923 instanceof InterfaceC15202) || (iMo7162 = ((InterfaceC15202) interfaceC23923).mo7161()) < -1) {
                                iMo7162 = -1;
                            }
                        }
                        if (iMo7162 != -1 && iMo7162 < iMo7161 && (strM25995 = m25995(iM25998, interfaceC8082.mo4189(), list)) != null) {
                            strArr[iMo7162] = strM25995;
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder(strM25991);
            sb.append('(');
            for (int i4 = 0; i4 < iMo7161; i4++) {
                String str = strArr[i4];
                if (str == null) {
                    return;
                }
                sb.append(str);
            }
            sb.append(')');
            String strM9552 = c4516.m9552(sb.toString());
            if (strM9552 == null || strM9552.equals(strM25991)) {
                return;
            }
            map.put(Integer.valueOf(i), new C12837(iM25999, strM9552));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25986(C11222 c11222, List list, HashMap map, C4516 c4516, int i, int i2) {
        String strM25991;
        String strM9546;
        int iM25998 = m25998(i, i2, list);
        if (iM25998 == -1 || (strM25991 = m25991((InterfaceC23920) list.get(iM25998))) == null || map.containsKey(Integer.valueOf(iM25998)) || (strM9546 = c4516.m9546(strM25991)) == null || strM9546.equals(strM25991)) {
            return;
        }
        map.put(Integer.valueOf(iM25998), new C12837(i2, strM9546));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25985(C11222 c11222, List list, HashMap map, int i, int i2) {
        String strM25991;
        if (i == -1 || map.containsKey(Integer.valueOf(i)) || (strM25991 = m25991((InterfaceC23920) list.get(i))) == null || strM25991.isEmpty()) {
            return;
        }
        String strM25996 = m25996(strM25991);
        if (C9417.m21911(1, strM25996) != ';') {
            return;
        }
        String strM13140 = c11222.f31216.m13140(strM25996, strM25996);
        if (strM25996.equals(strM13140)) {
            return;
        }
        map.put(Integer.valueOf(i), new C12837(i2, m25999(strM13140)));
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m25996(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.charAt(0) == '[') {
            if (C9417.m21911(1, str) == ';') {
                return str.replace('.', '/');
            }
        } else if (str.indexOf(47) == -1) {
            return "L" + str.replace('.', '/') + C0249l.f1196b;
        }
        return str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m25999(String str) {
        if (str == null) {
            return null;
        }
        return ((str.length() <= 1 || str.charAt(0) != 'L') && C9417.m21911(1, str) != ';') ? str.replace('/', '.') : str.substring(1, str.length() - 1).replace('/', '.');
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m25995(int i, int i2, List list) {
        int iM25998 = m25998(i, i2, list);
        if (iM25998 != -1) {
            InterfaceC23920 interfaceC23920 = (InterfaceC23920) list.get(iM25998);
            if (interfaceC23920.mo6217() == EnumC3167.f6083) {
                return ((InterfaceC22991) ((InterfaceC12777) interfaceC23920).getReference()).getType();
            }
            if (interfaceC23920.mo6217() == EnumC3167.f5849) {
                int i3 = iM25998 - 1;
                while (true) {
                    if (i3 < 0) {
                        i3 = -1;
                        break;
                    }
                    if ((((InterfaceC23920) list.get(i3)).mo6217().f6093 & 8) != 0) {
                        break;
                    }
                    i3--;
                }
                if (i3 != -1) {
                    InterfaceC23920 interfaceC23921 = (InterfaceC23920) list.get(i3);
                    if (interfaceC23921.mo6217() == EnumC3167.f5826) {
                        InterfaceC12933 interfaceC12933 = (InterfaceC12933) interfaceC23921;
                        if (m25994((InterfaceC7568) interfaceC12933.getReference())) {
                            int iM25999 = m25998(i3, interfaceC12933.mo5885(), list);
                            return m25996(iM25999 != -1 ? m25991((InterfaceC23920) list.get(iM25999)) : null);
                        }
                    }
                }
            } else if (interfaceC23920.mo6217() == EnumC3167.f5819) {
                InterfaceC20309 interfaceC20309 = (InterfaceC20309) ((InterfaceC12777) interfaceC23920).getReference();
                if (interfaceC20309.getName().equals("TYPE") && interfaceC20309.getType().equals("Ljava/lang/Class;")) {
                    String strMo10231 = interfaceC20309.mo10231();
                    strMo10231.getClass();
                    switch (strMo10231) {
                        case "Ljava/lang/Integer;":
                            return "I";
                        case "Ljava/lang/Boolean;":
                        case "Ljava/lang/Byte;":
                            return "B";
                        case "Ljava/lang/Double;":
                            return "D";
                        case "Ljava/lang/Character;":
                            return "C";
                        case "Ljava/lang/Float;":
                            return "F";
                        case "Ljava/lang/Long;":
                            return "J";
                        case "Ljava/lang/Void;":
                            return "V";
                        case "Ljava/lang/Short;":
                            return "S";
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m25991(InterfaceC23920 interfaceC23920) {
        if (interfaceC23920.mo6217().f6092 == 0) {
            return ((InterfaceC16954) ((InterfaceC12777) interfaceC23920).getReference()).getString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m25998(int i, int i2, List list) {
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            InterfaceC23920 interfaceC23920 = (InterfaceC23920) list.get(i);
            if ((interfaceC23920.mo6217().f6093 & 16) != 0 && (interfaceC23920 instanceof InterfaceC4059) && ((InterfaceC4059) interfaceC23920).mo4189() == i2) {
                return i;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m25994(InterfaceC7568 interfaceC7568) {
        return interfaceC7568.mo5853().equals("Ljava/lang/Class;") && interfaceC7568.getName().equals("forName") && interfaceC7568.mo5855().equals("Ljava/lang/Class;");
    }
}
