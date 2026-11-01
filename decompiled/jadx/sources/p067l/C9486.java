package p067l;

import bin.p000mt.plus.R;
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
public final class C9486 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f25986 = 0;

    /* JADX INFO: renamed from: ܽ */
    public static final HashMap f25988 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f25987 = Pattern.compile("[0-9]+|\\.?[^.0-9]*");

    /* JADX INFO: renamed from: ֫ */
    public static int m22088(int i) {
        if (i >= 4) {
            i -= 4;
        }
        if (i < 0 || i > 3) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m22098(int i) {
        return i >= 4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m22089(int i, boolean z) {
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
    /* JADX INFO: renamed from: ֫ */
    public static void m22096(C18107 c18107, List list) {
        int iM22089;
        Comparator c13510;
        int i;
        AbstractC18422 abstractC18422M41270 = c18107.m41270();
        AbstractC5769 abstractC5769M17074 = abstractC18422M41270 instanceof C7367 ? ((C7367) abstractC18422M41270).m17074() : null;
        String strM22091 = m22091(abstractC18422M41270);
        String strMo8204 = abstractC18422M41270.mo8204();
        String strM41246 = c18107.m41261("local") ? "local:" + c18107.m41246() : c18107.m41246();
        boolean zM41290 = c18107.m41290();
        Integer numM22097 = m22097(strM22091);
        int i2 = -1;
        int i3 = 0;
        if (numM22097 == null) {
            switch (strMo8204) {
                case "net":
                    if (abstractC5769M17074 != null) {
                        HashMap map = abstractC5769M17074.f14160;
                        if (map.containsKey(strM41246)) {
                            iM22089 = ((Integer) map.get(strM41246)).intValue();
                        } else if (!zM41290) {
                            iM22089 = m22089(C21272.f66921, C21272.f66917);
                        } else {
                            iM22089 = m22089(C21272.f66919, C21272.f66920);
                        }
                        break;
                    } else {
                        if (!zM41290) {
                            iM22089 = m22089(C21272.f66921, C21272.f66917);
                        } else {
                            iM22089 = m22089(C21272.f66919, C21272.f66920);
                        }
                        break;
                    }
                    break;
                case "local":
                    HashMap map2 = C21272.f66918;
                    if (map2.containsKey(strM41246)) {
                        iM22089 = ((Integer) map2.get(strM41246)).intValue();
                        break;
                    } else {
                        if (!zM41290) {
                            iM22089 = m22089(C21272.f66921, C21272.f66917);
                        } else {
                            iM22089 = m22089(C21272.f66919, C21272.f66920);
                        }
                        break;
                    }
                    break;
                case "trash":
                    iM22089 = C21272.f66915;
                    break;
                default:
                    if (!zM41290) {
                        iM22089 = m22089(C21272.f66919, C21272.f66920);
                        break;
                    } else {
                        iM22089 = m22089(C21272.f66921, C21272.f66917);
                        break;
                    }
                    break;
            }
        } else {
            iM22089 = numM22097.intValue();
        }
        int iM22088 = m22088(iM22089);
        boolean zM22098 = m22098(iM22089);
        HashMap map3 = new HashMap();
        Collator collator = Collator.getInstance();
        boolean zM13924 = C6134.m13924(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            map3.put(interfaceC19370.getName(), new C12169(collator, interfaceC19370.getName(), zM13924));
        }
        if (iM22088 != 0) {
            if (iM22088 == 1) {
                c13510 = new C14180(map3, zM22098, !c18107.m41261("trash") || c18107.m41284().length() > 1);
            } else if (iM22088 == 2) {
                c13510 = new C24238(map3, zM22098);
            } else {
                if (iM22088 != 3) {
                    throw new IllegalArgumentException(C20778.m46922(iM22088, "method="));
                }
                c13510 = new C15520(map3, zM22098);
            }
        } else if (c18107.m41261("zip")) {
            C12574 c12574 = (C12574) c18107.m41270();
            c13510 = (!c12574.m28980() || c12574.m41982().length() > 1) ? new C13510(map3, zM22098) : new C14850(map3, zM22098);
        } else {
            c13510 = new C13510(map3, zM22098);
        }
        try {
            Collections.sort(list, c13510);
        } catch (IllegalArgumentException e) {
            if (zM13924) {
                throw e;
            }
            map3.clear();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC19370 interfaceC19371 = (InterfaceC19370) it2.next();
                map3.put(interfaceC19371.getName(), new C12169(collator, interfaceC19371.getName(), true));
            }
            Collections.sort(list, c13510);
        }
        if (iM22088 == 1 && c18107.m41261("trash") && c18107.m41284().length() <= 1) {
            C4504 c4504 = new C4504();
            while (i3 < list.size()) {
                int iM9526 = c4504.m9526(((InterfaceC19370) list.get(i3)).getTime());
                if (iM9526 != i2) {
                    switch (iM9526) {
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
                    list.add(i3, new C20633(C7050.m16224(i), "", null, -1L, 0L, true));
                    i3++;
                    i2 = iM9526;
                }
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22095(ArrayList arrayList, int i, boolean z) {
        Comparator c13510;
        HashMap map = new HashMap();
        Collator collator = Collator.getInstance();
        boolean zM13924 = C6134.m13924(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            map.put(interfaceC19370.getName(), new C12169(collator, interfaceC19370.getName(), zM13924));
        }
        if (i == 0) {
            c13510 = new C13510(map, z);
        } else if (i == 1) {
            c13510 = new C14180(map, z, true);
        } else if (i == 2) {
            c13510 = new C24238(map, z);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(C20778.m46922(i, "method="));
            }
            c13510 = new C15520(map, z);
        }
        try {
            Collections.sort(arrayList, c13510);
        } catch (IllegalArgumentException e) {
            if (zM13924) {
                throw e;
            }
            map.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                InterfaceC19370 interfaceC19371 = (InterfaceC19370) it2.next();
                map.put(interfaceC19371.getName(), new C12169(collator, interfaceC19371.getName(), true));
            }
            Collections.sort(arrayList, c13510);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m22091(AbstractC18422 abstractC18422) {
        switch (abstractC18422.mo8204()) {
            case "payload":
                return m22090("payload", ((C23244) abstractC18422).m51790());
            case "archive":
                return m22090("archive", ((C7280) abstractC18422).m16734());
            case "tar":
                return m22090("tar", ((C11075) abstractC18422).m25520());
            case "zip":
                return m22090("zip", ((C12574) abstractC18422).m28981());
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m22090(String str, String str2) {
        StringBuilder sbM21133 = C9179.m21133(str, "\nidentityLength=");
        sbM21133.append(str2.length());
        sbM21133.append("\n");
        sbM21133.append(str2);
        return sbM21133.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public static Integer m22097(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) f25988.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22093(int i, String str, boolean z) {
        f25988.put(str, Integer.valueOf(m22089(i, z)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22094(String str) {
        if (str != null) {
            f25988.remove(str);
        }
    }
}
