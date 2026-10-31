package l;

import bin.mt.plus.R;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۟۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7489 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f23073 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final HashMap f23075 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f23074 = Pattern.compile("[0-9]+|\\.?[^.0-9]*");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20112(int i) {
        if (i >= 4) {
            i -= 4;
        }
        if (i < 0 || i > 3) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m20122(int i) {
        return i >= 4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20113(int i, boolean z) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException();
        }
        return i + (z ? 4 : 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20120(C16560 c16560, List list) {
        int iM20113;
        Comparator c11723;
        int i;
        AbstractC16891 abstractC16891M39044 = c16560.m39044();
        AbstractC3577 abstractC3577M15171 = abstractC16891M39044 instanceof C5259 ? ((C5259) abstractC16891M39044).m15171() : null;
        String strM20115 = m20115(abstractC16891M39044);
        String strMo6007 = abstractC16891M39044.mo6007();
        String strM39020 = c16560.m39035("local") ? "local:" + c16560.m39020() : c16560.m39020();
        boolean zM39064 = c16560.m39064();
        Integer numM20121 = m20121(strM20115);
        int i2 = -1;
        int i3 = 0;
        if (numM20121 == null) {
            switch (strMo6007) {
                case "net":
                    if (abstractC3577M15171 != null) {
                        HashMap map = abstractC3577M15171.f11355;
                        if (map.containsKey(strM39020)) {
                            iM20113 = ((Integer) map.get(strM39020)).intValue();
                        } else if (!zM39064) {
                            iM20113 = m20113(C19890.f64285, C19890.f64281);
                        } else {
                            iM20113 = m20113(C19890.f64283, C19890.f64284);
                        }
                        break;
                    } else {
                        if (!zM39064) {
                            iM20113 = m20113(C19890.f64285, C19890.f64281);
                        } else {
                            iM20113 = m20113(C19890.f64283, C19890.f64284);
                        }
                        break;
                    }
                    break;
                case "local":
                    HashMap map2 = C19890.f64282;
                    if (map2.containsKey(strM39020)) {
                        iM20113 = ((Integer) map2.get(strM39020)).intValue();
                        break;
                    } else {
                        if (!zM39064) {
                            iM20113 = m20113(C19890.f64285, C19890.f64281);
                        } else {
                            iM20113 = m20113(C19890.f64283, C19890.f64284);
                        }
                        break;
                    }
                    break;
                case "trash":
                    iM20113 = C19890.f64279;
                    break;
                default:
                    if (!zM39064) {
                        iM20113 = m20113(C19890.f64283, C19890.f64284);
                        break;
                    } else {
                        iM20113 = m20113(C19890.f64285, C19890.f64281);
                        break;
                    }
                    break;
            }
        } else {
            iM20113 = numM20121.intValue();
        }
        int iM20112 = m20112(iM20113);
        boolean zM20122 = m20122(iM20113);
        HashMap map3 = new HashMap();
        Collator collator = Collator.getInstance();
        boolean zM12003 = C3962.m12003(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            map3.put(interfaceC17889.getName(), new C10312(collator, interfaceC17889.getName(), zM12003));
        }
        if (iM20112 != 0) {
            if (iM20112 == 1) {
                c11723 = new C12428(map3, zM20122, !c16560.m39035("trash") || c16560.m39058().length() > 1);
            } else if (iM20112 == 2) {
                c11723 = new C23011(map3, zM20122);
            } else {
                if (iM20112 != 3) {
                    throw new IllegalArgumentException(C19370.m44628(iM20112, "method="));
                }
                c11723 = new C13838(map3, zM20122);
            }
        } else if (c16560.m39035("zip")) {
            C10738 c10738 = (C10738) c16560.m39044();
            c11723 = (!c10738.m26936() || c10738.m39741().length() > 1) ? new C11723(map3, zM20122) : new C13133(map3, zM20122);
        } else {
            c11723 = new C11723(map3, zM20122);
        }
        try {
            Collections.sort(list, c11723);
        } catch (IllegalArgumentException e) {
            if (zM12003) {
                throw e;
            }
            map3.clear();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC17889 interfaceC178810 = (InterfaceC17889) it2.next();
                map3.put(interfaceC178810.getName(), new C10312(collator, interfaceC178810.getName(), true));
            }
            Collections.sort(list, c11723);
        }
        if (iM20112 == 1 && c16560.m39035("trash") && c16560.m39058().length() <= 1) {
            C2247 c2247 = new C2247();
            while (i3 < list.size()) {
                int iM7444 = c2247.m7444(((InterfaceC17889) list.get(i3)).getTime());
                if (iM7444 != i2) {
                    switch (iM7444) {
                        case 0:
                            i = R.string.MT_Protector;
                            break;
                        case 1:
                            i = R.string.MT_Protector;
                            break;
                        case 2:
                            i = R.string.MT_Protector;
                            break;
                        case 3:
                            i = R.string.MT_Protector;
                            break;
                        case 4:
                            i = R.string.MT_Protector;
                            break;
                        case 5:
                            i = R.string.MT_Protector;
                            break;
                        case 6:
                            i = R.string.MT_Protector;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    list.add(i3, new C19218(C4925.m14327(i), "", null, -1L, 0L, true));
                    i3++;
                    i2 = iM7444;
                }
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20119(ArrayList arrayList, int i, boolean z) {
        Comparator c11723;
        HashMap map = new HashMap();
        Collator collator = Collator.getInstance();
        boolean zM12003 = C3962.m12003(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            map.put(interfaceC17889.getName(), new C10312(collator, interfaceC17889.getName(), zM12003));
        }
        if (i == 0) {
            c11723 = new C11723(map, z);
        } else if (i == 1) {
            c11723 = new C12428(map, z, true);
        } else if (i == 2) {
            c11723 = new C23011(map, z);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(C19370.m44628(i, "method="));
            }
            c11723 = new C13838(map, z);
        }
        try {
            Collections.sort(arrayList, c11723);
        } catch (IllegalArgumentException e) {
            if (zM12003) {
                throw e;
            }
            map.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                InterfaceC17889 interfaceC178810 = (InterfaceC17889) it2.next();
                map.put(interfaceC178810.getName(), new C10312(collator, interfaceC178810.getName(), true));
            }
            Collections.sort(arrayList, c11723);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20115(AbstractC16891 abstractC16891) {
        switch (abstractC16891.mo6007()) {
            case "payload":
                return m20114("payload", ((C21965) abstractC16891).m49453());
            case "archive":
                return m20114("archive", ((C5168) abstractC16891).m14826());
            case "tar":
                return m20114("tar", ((C9160) abstractC16891).m23569());
            case "zip":
                return m20114("zip", ((C10738) abstractC16891).m26937());
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20114(String str, String str2) {
        StringBuilder sbM19190 = C7166.m19190(str, "\nidentityLength=");
        sbM19190.append(str2.length());
        sbM19190.append("\n");
        sbM19190.append(str2);
        return sbM19190.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Integer m20121(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) f23075.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20117(int i, String str, boolean z) {
        f23075.put(str, Integer.valueOf(m20113(i, z)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20118(String str) {
        if (str != null) {
            f23075.remove(str);
        }
    }
}
