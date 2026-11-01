package p067l;

/* JADX INFO: renamed from: l.۫ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C13958 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public Object f39369;

    /* JADX INFO: renamed from: ᩹ */
    public C21728 f39370;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C13288.f37301.info("Invalid key for map field.");
        return -1;
    }

    public C13958(C2479 c2479, Object obj) {
        if (obj instanceof C21728) {
            this.f39370 = (C21728) obj;
        } else {
            this.f39369 = obj;
        }
        ((C2479) c2479.m3548().getFields().get(0)).m3539();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m31728() {
        C21728 c21728 = this.f39370;
        return c21728 != null ? c21728 : this.f39369;
    }
}
