package l;

/* JADX INFO: renamed from: l.۫ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C12195 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f36354;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C20370 f36355;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C11490.f34304.info("Invalid key for map field.");
        return -1;
    }

    public C12195(C0117 c0117, Object obj) {
        if (obj instanceof C20370) {
            this.f36355 = (C20370) obj;
        } else {
            this.f36354 = obj;
        }
        ((C0117) c0117.m1147().getFields().get(0)).m1138();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m29666() {
        C20370 c20370 = this.f36355;
        return c20370 != null ? c20370 : this.f36354;
    }
}
