package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5ATX */
/* JADX INFO: loaded from: classes2.dex */
public final class C7303 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final C3279 f19115;

    /* JADX INFO: renamed from: ᩹ */
    public final String f19116;

    public /* synthetic */ C7303(String str, int i) {
        this(str);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f19116.compareTo(((C7303) obj).f19116);
    }

    public C7303(String str) {
        this.f19116 = str;
        this.f19115 = new C3279();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16872(ArrayList arrayList, int i) {
        int i2 = i + 1;
        String str = (String) arrayList.get(i);
        C3279 c3279 = this.f19115;
        C7303 c7303 = (C7303) c3279.get(str);
        if (c7303 == null) {
            c7303 = new C7303(str);
            c3279.put(str, c7303);
        }
        if (i2 != arrayList.size()) {
            c7303.m16872(arrayList, i2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m16871() {
        return this.f19116 + this.f19115.m5712();
    }
}
