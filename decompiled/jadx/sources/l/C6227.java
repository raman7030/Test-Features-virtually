package l;

/* JADX INFO: renamed from: l.ۛᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6227 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f19076;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f19077;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10220 f19078;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f19079;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f19080;

    public C6227() {
        throw null;
    }

    public C6227(String str, String str2, String str3, String str4, C10220 c10220) {
        this.f19080 = str;
        this.f19079 = str2;
        this.f19076 = str3;
        this.f19077 = str4;
        this.f19078 = c10220;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6227)) {
            return false;
        }
        C6227 c6227 = (C6227) obj;
        return C11003.equals(this.f19080, c6227.f19080) && C11003.equals(this.f19079, c6227.f19079) && C11003.equals(this.f19076, c6227.f19076) && C11003.equals(this.f19077, c6227.f19077) && C11003.equals(this.f19078, c6227.f19078);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f19078) + C20361.m46680(C20361.m46680(C20361.m46680(C11003.hashCode(this.f19080) * 31, 31, this.f19079), 31, this.f19076), 31, this.f19077);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10220 m17151() {
        return this.f19078;
    }

    public final String toString() {
        return "[" + this.f19079 + "] " + this.f19077;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m17149() {
        return this.f19080 + "/" + this.f19076;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m17150(String str, String str2) {
        return this.f19080.equals(str) && this.f19076.equals(str2);
    }
}
