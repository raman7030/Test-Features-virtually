package l;

/* JADX INFO: renamed from: l.ۤۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10191 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C10191 f30620 = new C10191(null, -1, -1);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f30621;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f30622;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13217 f30623;

    public C10191(C13217 c13217, int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException("address < -1");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("line < -1");
        }
        this.f30623 = c13217;
        this.f30621 = i;
        this.f30622 = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(50);
        C13217 c13217 = this.f30623;
        if (c13217 != null) {
            sb.append(c13217.mo2463());
            sb.append(":");
        }
        int i = this.f30622;
        if (i >= 0) {
            sb.append(i);
        }
        sb.append('@');
        int i2 = this.f30621;
        if (i2 < 0) {
            sb.append("????");
        } else {
            sb.append(C14712.m35006(i2));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        r5 = r5.f30623;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        Object obj2;
        C13217 c13217;
        if (!(obj instanceof C10191)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C10191 c10191 = (C10191) obj;
        return this.f30621 == c10191.f30621 && this.f30622 == c10191.f30622 && ((c13217 = this.f30623) == obj2 || (c13217 != null && c13217.equals(obj2)));
    }

    public final int hashCode() {
        return this.f30623.hashCode() + this.f30621 + this.f30622;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m25589(C10191 c10191) {
        return this.f30622 == c10191.f30622;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m25588() {
        return this.f30622;
    }
}
