package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5RM */
/* JADX INFO: loaded from: classes2.dex */
public final class C4551 extends AbstractC12342 {

    /* JADX INFO: renamed from: ֫ */
    public static C10586 f10207 = new C10586();

    /* JADX INFO: renamed from: ۧ */
    public static C10586 f10208 = new C10586();

    /* JADX INFO: renamed from: ֫ */
    public final boolean m9630(C7726 c7726) {
        boolean z;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = c7726.f20261;
        if (arrayList.size() == 0) {
            z = false;
        } else {
            int[] iArr = new int[C16620.m37690(c7726)];
            C17961 c17961 = c7726.f20257;
            C5892 c5892 = new C5892(iArr);
            for (AbstractC3880 first = c17961.getFirst(); first != null; first = first.m7669()) {
                C16620.m37683(first, c5892, true);
            }
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = c7726.f20260;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ArrayList<C23089> arrayList3 = ((C15041) it.next()).f42963;
                    if (arrayList3 != null) {
                        for (C23089 c23089 : arrayList3) {
                            hashSet2.add((C19736) c23089.f45527);
                            for (AbstractC10348 abstractC10348 : c23089.f45528.mo17753()) {
                                hashSet2.add((C19736) abstractC10348);
                            }
                        }
                    }
                }
            }
            HashMap map = new HashMap();
            Iterator it2 = c7726.f20257.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                AbstractC3880 abstractC3880 = (AbstractC3880) it2.next();
                if (abstractC3880.f8417 == EnumC9677.ASSIGN && abstractC3880.mo7675().f28658 == EnumC3642.LOCAL) {
                    C19736 c19736 = (C19736) abstractC3880.mo7675();
                    if (!hashSet2.contains(c19736) && iArr[c19736.f60034] < 2) {
                        AbstractC10348 abstractC10348Mo7674 = abstractC3880.mo7674();
                        if (m9629(abstractC10348Mo7674)) {
                            arrayList.remove(c19736);
                            map.put(c19736, abstractC10348Mo7674);
                            it2.remove();
                            z2 = true;
                        } else {
                            hashSet.add(abstractC3880);
                        }
                    }
                }
            }
            C21986 c21986 = new C21986(map);
            for (Map.Entry entry : map.entrySet()) {
                AbstractC10348 abstractC10349 = (AbstractC10348) entry.getValue();
                if (abstractC10349.f28658 == EnumC3642.LOCAL) {
                    while (true) {
                        AbstractC10348 abstractC103410 = (AbstractC10348) map.get(abstractC10349);
                        if (abstractC103410 == null) {
                            break;
                        }
                        if (abstractC103410.f28658 != EnumC3642.LOCAL) {
                            abstractC10349 = abstractC103410;
                            break;
                        }
                        abstractC10349 = abstractC103410;
                    }
                    entry.setValue(abstractC10349);
                } else {
                    C16620.m37691(abstractC10349, c21986);
                }
            }
            for (AbstractC3880 first2 = c7726.f20257.getFirst(); first2 != null; first2 = first2.m7669()) {
                C16620.m37692(first2, c21986, false);
            }
            z = z2;
        }
        if (hashSet.size() != 0) {
            C17290 c17290 = new C17290();
            C7865 c7865 = new C7865();
            c7865.addAll(hashSet);
            while (!c7865.isEmpty()) {
                AbstractC3880 abstractC3881 = (AbstractC3880) c7865.poll();
                C19736 c19737 = (C19736) abstractC3881.mo7675();
                AbstractC3880 abstractC3880M7669 = abstractC3881.m7669();
                switch (C11257.f31353[abstractC3880M7669.f8417.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        try {
                            m9626(c19737, abstractC3880M7669);
                            throw null;
                        } catch (C10586 e) {
                            if (e == f10208) {
                                c17290.f51588 = c19737;
                                c17290.f51589 = abstractC3881.mo7674();
                                arrayList.remove(c19737);
                                c7726.f20257.m40883(abstractC3881);
                                C16620.m37692(abstractC3880M7669, c17290, false);
                                AbstractC3880 abstractC3880M7671 = abstractC3880M7669.m7671();
                                if (abstractC3880M7671 != null && hashSet.contains(abstractC3880M7671)) {
                                    c7865.add(abstractC3880M7671);
                                }
                            }
                        }
                        break;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9626(C19736 c19736, AbstractC3880 abstractC3880) throws C10586 {
        int i = C11257.f31351[abstractC3880.f8412.ordinal()];
        C10586 c10586 = f10207;
        if (i == 1 || i == 2) {
            throw c10586;
        }
        if (i == 3) {
            m9627(c19736, abstractC3880.mo7672());
            throw c10586;
        }
        if (i == 4) {
            C23089 c23089 = (C23089) abstractC3880;
            AbstractC10348 abstractC10348 = c23089.f45527;
            AbstractC10348 abstractC10349 = c23089.f45528;
            int i2 = C11257.f31352[abstractC10348.f28658.ordinal()];
            if (i2 == 1) {
                m9627(c19736, abstractC10349);
                throw c10586;
            }
            if (i2 == 2) {
                m9627(c19736, abstractC10348.mo23968());
            } else if (i2 != 3) {
                if (i2 == 4) {
                    m9627(c19736, abstractC10348.mo4921());
                    m9627(c19736, abstractC10348.mo4923());
                    m9627(c19736, abstractC10349);
                    throw c10586;
                }
                throw c10586;
            }
            m9627(c19736, abstractC10349);
            throw c10586;
        }
        throw c10586;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9627(C19736 c19736, AbstractC10348 abstractC10348) throws C10586 {
        int[] iArr = C11257.f31351;
        EnumC3031 enumC3031 = abstractC10348.f28660;
        EnumC3642 enumC3642 = abstractC10348.f28658;
        int i = iArr[enumC3031.ordinal()];
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                for (AbstractC10348 abstractC10349 : abstractC10348.mo17753()) {
                    m9627(c19736, abstractC10349);
                }
            } else if (i == 3) {
                m9627(c19736, abstractC10348.mo23968());
            } else if (i == 4) {
                m9627(c19736, abstractC10348.mo4921());
                m9627(c19736, abstractC10348.mo4923());
            }
        } else if (c19736.f28658 == EnumC3642.LOCAL && abstractC10348 == c19736) {
            throw f10208;
        }
        if (enumC3642 == EnumC3642.INVOKE_STATIC) {
            C9342 c9342 = ((C13031) abstractC10348).f36656;
            if (c9342.m21673().equals("valueOf") && c9342.m21675().startsWith("Ljava/lang/") && c9342.m21677().length == 1 && c9342.m21677()[0].length() == 1) {
                z = true;
            }
        }
        if (!m9628(enumC3642) && !z) {
            throw f10207;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m9628(EnumC3642 enumC3642) {
        int i = C11257.f31352[enumC3642.ordinal()];
        if (i != 1) {
            switch (i) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m9629(AbstractC10348 abstractC10348) {
        int[] iArr = C11257.f31351;
        EnumC3031 enumC3031 = abstractC10348.f28660;
        EnumC3642 enumC3642 = abstractC10348.f28658;
        int i = iArr[enumC3031.ordinal()];
        if (i == 1) {
            return m9628(enumC3642);
        }
        if (i != 2) {
            return i == 3 ? m9628(enumC3642) && m9629(abstractC10348.mo23968()) : i == 4 && m9628(enumC3642) && m9629(abstractC10348.mo4921()) && m9629(abstractC10348.mo4923());
        }
        if (enumC3642 != EnumC3642.INVOKE_STATIC) {
            if (m9628(enumC3642)) {
                for (AbstractC10348 abstractC10349 : abstractC10348.mo17753()) {
                    if (m9629(abstractC10349)) {
                    }
                }
            }
        }
        C9342 c9342 = ((C13031) abstractC10348).f36656;
        if (c9342.m21673().equals("valueOf") && c9342.m21675().startsWith("Ljava/lang/") && c9342.m21677().length == 1 && c9342.m21677()[0].length() == 1) {
            for (AbstractC10348 abstractC103410 : abstractC10348.mo17753()) {
                if (m9629(abstractC103410)) {
                }
            }
        }
    }
}
