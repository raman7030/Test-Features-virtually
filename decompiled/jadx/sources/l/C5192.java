package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5ATX */
/* JADX INFO: loaded from: classes2.dex */
public final class C5192 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0958 f16274;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f16275;

    public /* synthetic */ C5192(String str, int i) {
        this(str);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16275.compareTo(((C5192) obj).f16275);
    }

    public C5192(String str) {
        this.f16275 = str;
        this.f16274 = new C0958();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14962(ArrayList arrayList, int i) {
        int i2 = i + 1;
        String str = (String) arrayList.get(i);
        C0958 c0958 = this.f16274;
        C5192 c5192 = (C5192) c0958.get(str);
        if (c5192 == null) {
            c5192 = new C5192(str);
            c0958.put(str, c5192);
        }
        if (i2 != arrayList.size()) {
            c5192.m14962(arrayList, i2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m14961() {
        return this.f16275 + this.f16274.m3393();
    }
}
