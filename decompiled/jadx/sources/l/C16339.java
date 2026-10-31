package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U75B */
/* JADX INFO: loaded from: classes4.dex */
public final class C16339 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4499 f50298;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4499 f50299;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50300;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4499 f50301;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50302;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C4499 f50303;

    public C16339(ArrayList arrayList, ArrayList arrayList2, C4499 c4499, C4499 c44910, C4499 c44911, C4499 c44912, int i, int i2) {
        this.f50302 = C17751.m41576(arrayList);
        this.f50300 = C17751.m41576(arrayList2);
        this.f50298 = C17751.m41571(c4499);
        this.f50299 = C17751.m41571(c44910);
        this.f50301 = c44911 == null ? new C4499(0, i) : C17751.m41571(c44911);
        this.f50303 = c44912 == null ? new C4499(0, i2) : C17751.m41571(c44912);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38482(C16339 c16339) {
        return m38480(this.f50302, c16339.f50302) && m38480(this.f50300, c16339.f50300) && m38481(this.f50298, c16339.f50298) && m38481(this.f50299, c16339.f50299) && m38481(this.f50301, c16339.f50301) && m38481(this.f50303, c16339.f50303);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38480(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() == arrayList2.size()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (m38481((C4499) arrayList.get(i), (C4499) arrayList2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38481(C4499 c4499, C4499 c44910) {
        if (c4499 == null || c44910 == null) {
            return c4499 == c44910;
        }
        return c4499.f14318 == c44910.f14318 && c4499.f14317 == c44910.f14317;
    }
}
