package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9316 extends C14851 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22016 f28265;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f28266;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3671 f28267;

    public C9316(C3671 c3671, C22016 c22016) {
        this.f28267 = c3671;
        this.f28265 = c22016;
    }

    @Override // l.C14851
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18380 mo23994(C16696 c16696) {
        return new C5829(this, c16696);
    }

    @Override // l.C14851
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC18380 mo1229() {
        return new InterfaceC18380() { // from class: l.۬ۙۡ
            @Override // l.InterfaceC18380
            /* JADX INFO: renamed from: ֫ */
            public final Object mo4329(Object obj) {
                return C9316.m23970(this.f38681, (String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23970(C9316 c9316, String str) {
        return c9316.f28267.m11180(str, str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m23988(C9316 c9316, String str) {
        return c9316.f28267.m11180(str, str);
    }

    @Override // l.C14851
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC18380 mo17109(final C16696 c16696) {
        return new InterfaceC18380() { // from class: l.ۙۙۡ
            @Override // l.InterfaceC18380
            /* JADX INFO: renamed from: ֫ */
            public final Object mo4329(Object obj) {
                return C9316.m23973(this.f14131, c16696, (InterfaceC5471) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C7199 m23973(C9316 c9316, C16696 c16696, InterfaceC5471 interfaceC5471) {
        InterfaceC5471 c7199;
        C2260 c2260M11184 = c9316.f28267.m11184(interfaceC5471.mo3566());
        if (c2260M11184 == null || (c7199 = c2260M11184.m7465(c16696, interfaceC5471, c9316.f28265)) == null) {
            c7199 = new C7199(c16696, interfaceC5471);
        }
        return (C7199) c7199;
    }

    @Override // l.C14851
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18380 mo23995(final C16696 c16696) {
        return new InterfaceC18380() { // from class: l.ۗۙۡ
            @Override // l.InterfaceC18380
            /* JADX INFO: renamed from: ֫ */
            public final Object mo4329(Object obj) {
                return C9316.m23975(this.f9473, c16696, (InterfaceC18877) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C22721 m23975(C9316 c9316, C16696 c16696, InterfaceC18877 interfaceC18877) {
        InterfaceC18877 c22721;
        C2260 c2260M11184 = c9316.f28267.m11184(interfaceC18877.mo8192());
        if (c2260M11184 == null || (c22721 = c2260M11184.m7466(c16696, interfaceC18877, c9316.f28265)) == null) {
            c22721 = new C22721(c16696, interfaceC18877);
        }
        return (C22721) c22721;
    }

    @Override // l.C14851
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15368 mo23991(C16696 c16696) {
        return new C15368(c16696);
    }

    @Override // l.C14851
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18380 mo23993(final C16696 c16696) {
        return new InterfaceC18380() { // from class: l.ۤۙۡ
            @Override // l.InterfaceC18380
            /* JADX INFO: renamed from: ֫ */
            public final Object mo4329(Object obj) {
                return C9316.m23974(this.f30244, c16696, (InterfaceC20561) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C11433 m23974(C9316 c9316, C16696 c16696, InterfaceC20561 interfaceC20561) {
        if (interfaceC20561.getVisibility() == 2) {
            String type = interfaceC20561.getType();
            type.getClass();
            if (type.equals("Ldalvik/annotation/InnerClass;")) {
                return new C14253(c9316, c16696, interfaceC20561);
            }
            if (type.equals("Ldalvik/annotation/Signature;")) {
                return new C20605(c9316, c16696, interfaceC20561);
            }
        } else if (c9316.f28267.m11182(interfaceC20561.getType())) {
            return new C17782(c9316, c16696, interfaceC20561);
        }
        return new C11433(c16696, interfaceC20561);
    }

    @Override // l.C14851
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC18380 mo1230(C16696 c16696) {
        return new C11474(this, c16696);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Set m23972(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return new C22762(arrayList);
    }

    @Override // l.C14851
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18380 mo23992(final C16696 c16696) {
        return new InterfaceC18380() { // from class: l.۫ۙۡ
            @Override // l.InterfaceC18380
            /* JADX INFO: renamed from: ֫ */
            public final Object mo4329(Object obj) {
                return new C13589(this.f36322, c16696, (InterfaceC19150) obj);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23978(C9316 c9316, List list, HashMap map, C2260 c2260, int i, int i2, int i3) {
        String strM23982;
        int iM23989;
        int iMo4919;
        int iMo49110;
        String strM23986;
        int iM239810 = m23989(i, i2, list);
        if (iM239810 == -1 || (strM23982 = m23982((InterfaceC22677) list.get(iM239810))) == null || map.containsKey(Integer.valueOf(iM239810)) || (iM23989 = m23989(i, i3, list)) == -1) {
            return;
        }
        InterfaceC22677 interfaceC22677 = (InterfaceC22677) list.get(iM23989);
        if (interfaceC22677.mo3975() == EnumC0841.f3138 && ((InterfaceC21699) ((InterfaceC10952) interfaceC22677).getReference()).getType().equals("[Ljava/lang/Class;")) {
            int iM239811 = m23989(iM23989, ((InterfaceC23651) interfaceC22677).mo7930(), list);
            if (iM239811 == -1) {
                iMo4919 = -1;
            } else {
                InterfaceC22677 interfaceC22678 = (InterfaceC22677) list.get(iM239811);
                if (!(interfaceC22678 instanceof InterfaceC13504) || (iMo4919 = ((InterfaceC13504) interfaceC22678).mo4919()) < -1) {
                    iMo4919 = -1;
                }
            }
            if (iMo4919 == -1) {
                return;
            }
            String[] strArr = new String[iMo4919];
            while (true) {
                iM23989++;
                if (iM23989 >= i) {
                    break;
                }
                InterfaceC22677 interfaceC22679 = (InterfaceC22677) list.get(iM23989);
                if (interfaceC22679.mo3975() == EnumC0841.f3266) {
                    InterfaceC6012 interfaceC6012 = (InterfaceC6012) interfaceC22679;
                    if (interfaceC6012.mo7930() == i3) {
                        int iM239812 = m23989(iM23989, interfaceC6012.mo7931(), list);
                        if (iM239812 == -1) {
                            iMo49110 = -1;
                        } else {
                            InterfaceC22677 interfaceC226710 = (InterfaceC22677) list.get(iM239812);
                            if (!(interfaceC226710 instanceof InterfaceC13504) || (iMo49110 = ((InterfaceC13504) interfaceC226710).mo4919()) < -1) {
                                iMo49110 = -1;
                            }
                        }
                        if (iMo49110 != -1 && iMo49110 < iMo4919 && (strM23986 = m23986(iM23989, interfaceC6012.mo1790(), list)) != null) {
                            strArr[iMo49110] = strM23986;
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder(strM23982);
            sb.append('(');
            for (int i4 = 0; i4 < iMo4919; i4++) {
                String str = strArr[i4];
                if (str == null) {
                    return;
                }
                sb.append(str);
            }
            sb.append(')');
            String strM7470 = c2260.m7470(sb.toString());
            if (strM7470 == null || strM7470.equals(strM23982)) {
                return;
            }
            map.put(Integer.valueOf(i), new C11015(iM239810, strM7470));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23977(C9316 c9316, List list, HashMap map, C2260 c2260, int i, int i2) {
        String strM23982;
        String strM7464;
        int iM23989 = m23989(i, i2, list);
        if (iM23989 == -1 || (strM23982 = m23982((InterfaceC22677) list.get(iM23989))) == null || map.containsKey(Integer.valueOf(iM23989)) || (strM7464 = c2260.m7464(strM23982)) == null || strM7464.equals(strM23982)) {
            return;
        }
        map.put(Integer.valueOf(iM23989), new C11015(i2, strM7464));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23976(C9316 c9316, List list, HashMap map, int i, int i2) {
        String strM23982;
        if (i == -1 || map.containsKey(Integer.valueOf(i)) || (strM23982 = m23982((InterfaceC22677) list.get(i))) == null || strM23982.isEmpty()) {
            return;
        }
        String strM23987 = m23987(strM23982);
        if (C7416.m19937(1, strM23987) != ';') {
            return;
        }
        String strM11180 = c9316.f28267.m11180(strM23987, strM23987);
        if (strM23987.equals(strM11180)) {
            return;
        }
        map.put(Integer.valueOf(i), new C11015(i2, m23990(strM11180)));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m23987(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.charAt(0) == '[') {
            if (C7416.m19937(1, str) == ';') {
                return str.replace('.', '/');
            }
        } else if (str.indexOf(47) == -1) {
            return "L" + str.replace('.', '/') + l.b;
        }
        return str;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m23990(String str) {
        if (str == null) {
            return null;
        }
        return ((str.length() <= 1 || str.charAt(0) != 'L') && C7416.m19937(1, str) != ';') ? str.replace('/', '.') : str.substring(1, str.length() - 1).replace('/', '.');
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m23986(int i, int i2, List list) {
        int iM23989 = m23989(i, i2, list);
        if (iM23989 != -1) {
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) list.get(iM23989);
            if (interfaceC22677.mo3975() == EnumC0841.f3309) {
                return ((InterfaceC21699) ((InterfaceC10952) interfaceC22677).getReference()).getType();
            }
            if (interfaceC22677.mo3975() == EnumC0841.f3075) {
                int i3 = iM23989 - 1;
                while (true) {
                    if (i3 < 0) {
                        i3 = -1;
                        break;
                    }
                    if ((((InterfaceC22677) list.get(i3)).mo3975().f3319 & 8) != 0) {
                        break;
                    }
                    i3--;
                }
                if (i3 != -1) {
                    InterfaceC22677 interfaceC22678 = (InterfaceC22677) list.get(i3);
                    if (interfaceC22678.mo3975() == EnumC0841.f3052) {
                        InterfaceC11116 interfaceC11116 = (InterfaceC11116) interfaceC22678;
                        if (m23985((InterfaceC5471) interfaceC11116.getReference())) {
                            int iM239810 = m23989(i3, interfaceC11116.mo3614(), list);
                            return m23987(iM239810 != -1 ? m23982((InterfaceC22677) list.get(iM239810)) : null);
                        }
                    }
                }
            } else if (interfaceC22677.mo3975() == EnumC0841.f3045) {
                InterfaceC18877 interfaceC18877 = (InterfaceC18877) ((InterfaceC10952) interfaceC22677).getReference();
                if (interfaceC18877.getName().equals("TYPE") && interfaceC18877.getType().equals("Ljava/lang/Class;")) {
                    String strMo8192 = interfaceC18877.mo8192();
                    strMo8192.getClass();
                    switch (strMo8192) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m23982(InterfaceC22677 interfaceC22677) {
        if (interfaceC22677.mo3975().f3318 == 0) {
            return ((InterfaceC15347) ((InterfaceC10952) interfaceC22677).getReference()).getString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m23989(int i, int i2, List list) {
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) list.get(i);
            if ((interfaceC22677.mo3975().f3319 & 16) != 0 && (interfaceC22677 instanceof InterfaceC1779) && ((InterfaceC1779) interfaceC22677).mo1790() == i2) {
                return i;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m23985(InterfaceC5471 interfaceC5471) {
        return interfaceC5471.mo3566().equals("Ljava/lang/Class;") && interfaceC5471.getName().equals("forName") && interfaceC5471.mo3568().equals("Ljava/lang/Class;");
    }
}
