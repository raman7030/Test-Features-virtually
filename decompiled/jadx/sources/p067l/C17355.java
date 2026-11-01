package p067l;

/* JADX INFO: renamed from: l.ܺۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17355 {

    /* JADX INFO: renamed from: ֫ */
    public String f51751;

    /* JADX INFO: renamed from: ۧ */
    public String f51752;

    /* JADX INFO: renamed from: ܽ */
    public boolean f51753;

    public C17355(String str) {
        this.f51752 = str;
    }

    public C17355(String str, String str2) {
        this.f51752 = str;
        this.f51751 = str2;
        this.f51753 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m39356() {
        return this.f51753 ? this.f51751 : this.f51752;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39355(String str) {
        if (this.f51752.equals(str)) {
            this.f51751 = null;
            this.f51753 = false;
            return false;
        }
        this.f51751 = str;
        this.f51753 = true;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m39354() {
        return this.f51752;
    }
}
