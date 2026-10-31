package l;

/* JADX INFO: renamed from: l.᩻۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23560 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f75634;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f75635;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f75636;

    public C23560(String str) {
        this.f75635 = str;
    }

    public C23560(String str, String str2) {
        this.f75635 = str;
        this.f75634 = str2;
        this.f75636 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m52025() {
        return this.f75636 ? this.f75634 : this.f75635;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52024(String str) {
        if (this.f75635.equals(str)) {
            this.f75634 = null;
            this.f75636 = false;
            return false;
        }
        this.f75634 = str;
        this.f75636 = true;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m52023() {
        return this.f75635;
    }
}
