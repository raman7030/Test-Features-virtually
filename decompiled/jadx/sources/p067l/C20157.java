package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31WU */
/* JADX INFO: loaded from: classes4.dex */
public final class C20157 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public static final C13259 f62395 = C13259.m30304("[0-9]+");

    /* JADX INFO: renamed from: ۙ */
    public final String f62396;

    /* JADX INFO: renamed from: ᩶ */
    public final int f62397;

    /* JADX INFO: renamed from: ᩸ */
    public final String f62398;

    /* JADX INFO: renamed from: ᩹ */
    public final String f62399;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C20157 c20157 = (C20157) obj;
        int iCompareTo = this.f62399.compareTo(c20157.f62399);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.f62397 - c20157.f62397;
        return i != 0 ? i : this.f62396.compareTo(c20157.f62396);
    }

    public C20157(String str) {
        this.f62398 = str;
        C13929 c13929Matcher = f62395.matcher((CharSequence) str);
        if (c13929Matcher.find() && c13929Matcher.end() - c13929Matcher.start() < 10) {
            this.f62399 = str.substring(0, c13929Matcher.start());
            this.f62397 = Integer.parseInt(c13929Matcher.group());
            this.f62396 = str.substring(c13929Matcher.end());
        } else {
            this.f62399 = str;
            this.f62397 = -1;
            this.f62396 = "";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45612(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C20157((String) it.next()));
        }
        Collections.sort(arrayList2);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, ((C20157) arrayList2.get(i)).f62398);
        }
    }
}
