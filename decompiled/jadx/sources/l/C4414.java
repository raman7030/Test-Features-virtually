package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25VK */
/* JADX INFO: loaded from: classes2.dex */
public final class C4414 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13138(C5637 c5637) {
        C13334 c13334;
        ArrayList<C4931> arrayList = c5637.f17418;
        c5637.f17418 = new ArrayList();
        C19937 c19937 = new C19937();
        for (C4931 c4931 : arrayList) {
            C4931 c4931M14372 = c4931.m14372(c19937);
            AbstractC1591 abstractC1591M5439 = c4931.f15561.m5439();
            boolean z = false;
            while (true) {
                c13334 = c4931.f15559;
                if (abstractC1591M5439 == c13334) {
                    break;
                }
                if (C14996.m35532(abstractC1591M5439)) {
                    if (!z) {
                        AbstractC1591 abstractC1591M5441 = abstractC1591M5439.m5441();
                        if (abstractC1591M5441 == null || abstractC1591M5441.f5638 != EnumC7690.LABEL) {
                            abstractC1591M5441 = new C13334();
                            c5637.f17411.m38666(abstractC1591M5439, abstractC1591M5441);
                        }
                        c4931M14372.f15561 = (C13334) abstractC1591M5441;
                        z = true;
                    }
                } else if (z) {
                    AbstractC1591 abstractC1591M5442 = abstractC1591M5439.m5441();
                    if (abstractC1591M5442 == null || abstractC1591M5442.f5638 != EnumC7690.LABEL) {
                        abstractC1591M5442 = new C13334();
                        c5637.f17411.m38666(abstractC1591M5439, abstractC1591M5442);
                    }
                    c4931M14372.f15559 = (C13334) abstractC1591M5442;
                    c5637.f17418.add(c4931M14372);
                    c4931M14372 = c4931.m14372(c19937);
                    z = false;
                }
                abstractC1591M5439 = abstractC1591M5439.m5439();
            }
            if (z) {
                c4931M14372.f15559 = c13334;
                c5637.f17418.add(c4931M14372);
            }
        }
    }
}
