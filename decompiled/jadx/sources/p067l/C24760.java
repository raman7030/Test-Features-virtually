package p067l;

/* JADX INFO: renamed from: l.᩻۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24760 {

    /* JADX INFO: renamed from: ֫ */
    public String f78380;

    /* JADX INFO: renamed from: ۧ */
    public String f78381;

    /* JADX INFO: renamed from: ܽ */
    public boolean f78382;

    public C24760(String str) {
        this.f78381 = str;
    }

    public C24760(String str, String str2) {
        this.f78381 = str;
        this.f78380 = str2;
        this.f78382 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m54427() {
        return this.f78382 ? this.f78380 : this.f78381;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m54426(String str) {
        if (this.f78381.equals(str)) {
            this.f78380 = null;
            this.f78382 = false;
            return false;
        }
        this.f78380 = str;
        this.f78382 = true;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m54425() {
        return this.f78381;
    }
}
