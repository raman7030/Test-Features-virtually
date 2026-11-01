package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5K2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23958 extends AbstractC12342 {
    /* JADX INFO: renamed from: ֫ */
    public final boolean m53079(C7726 c7726) {
        ArrayList arrayList;
        int iIntValue;
        ArrayList<C23089> arrayList2 = new ArrayList();
        for (AbstractC3880 first = c7726.f20257.getFirst(); first != null; first = first.m7669()) {
            if (first.f8417 == EnumC9677.ASSIGN) {
                C23089 c23089 = (C23089) first;
                if (c23089.f45527.f28658 == EnumC3642.LOCAL) {
                    AbstractC10348 abstractC10348 = c23089.f45528;
                    if (abstractC10348.f28658 == EnumC3642.CONSTANT) {
                        Object obj = ((C13761) abstractC10348).f38899;
                        if ((obj instanceof Number) && !(obj instanceof Long) && !(obj instanceof Double) && ((iIntValue = ((Number) obj).intValue()) == 0 || iIntValue == 1)) {
                            arrayList2.add(c23089);
                        }
                    }
                }
            }
        }
        boolean z = false;
        if (arrayList2.size() != 0 && (arrayList = c7726.f20260) != null) {
            z = false;
            for (C23089 c230810 : arrayList2) {
                C19736 c19736 = (C19736) c230810.f45527;
                Iterator it = arrayList.iterator();
                boolean z2 = true;
                while (it.hasNext()) {
                    Iterator it2 = ((C15041) it.next()).f42963.iterator();
                    while (it2.hasNext()) {
                        AbstractC10348[] abstractC10348ArrMo17753 = ((C23089) it2.next()).f45528.mo17753();
                        for (int i = 0; i < abstractC10348ArrMo17753.length; i++) {
                            if (abstractC10348ArrMo17753[i] == c19736) {
                                if (z2) {
                                    z2 = false;
                                } else {
                                    C19736 c19737 = new C19736(-1);
                                    c7726.f20261.add(c19737);
                                    c7726.f20257.m40882(c230810, C19303.m43990(c19737, c230810.f45528.clone()));
                                    abstractC10348ArrMo17753[i] = c19737;
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }
}
