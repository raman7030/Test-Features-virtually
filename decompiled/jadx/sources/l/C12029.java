package l;

/* JADX INFO: renamed from: l.ۨ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C12029 implements Comparable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f35983;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1716 f35984;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f35985;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1716 f35986;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f35987;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f35987.compareTo(((C12029) obj).f35987);
    }

    public C12029(String str, String str2, C1716 c1716) {
        this.f35987 = str;
        this.f35983 = str2;
        this.f35986 = c1716;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m29391() {
        return this.f35987;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m29394() {
        return this.f35983;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1716 m29386() {
        return this.f35986;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29387(String str) {
        this.f35985 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29388(C1716 c1716) {
        this.f35984 = c1716;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m29392() {
        return this.f35985;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m29393() {
        C1716 c1716 = this.f35984;
        if (c1716 == null) {
            c1716 = this.f35986;
        }
        if ((c1716.f5936 & 1) != 0) {
            return c1716.f5939;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long m29390() {
        C1716 c1716 = this.f35984;
        if (c1716 == null) {
            c1716 = this.f35986;
        }
        if ((c1716.f5936 & 8) != 0) {
            return ((long) c1716.f5937) * 1000;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m29389() {
        C1716 c1716 = this.f35984;
        if (c1716 == null) {
            c1716 = this.f35986;
        }
        return c1716.m5764();
    }

    public final String toString() {
        return this.f35983;
    }
}
