package p067l;

/* JADX INFO: renamed from: l.ۛᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes2.dex */
public final class C8283 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f21933;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f21934;

    public C8283(C10307 c10307, int i) {
        this.f21933 = (c10307.f28542 & 1) != 0;
        this.f21934 = C12832.m29414(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C8283 c8283) {
        return AbstractC8543.m19894().mo19900(this.f21934, c8283.f21934).mo19900(this.f21933, c8283.f21933).mo19896();
    }
}
