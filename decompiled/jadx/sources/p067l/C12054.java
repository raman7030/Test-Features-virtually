package p067l;

/* JADX INFO: renamed from: l.ۤۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJN */
/* JADX INFO: loaded from: classes3.dex */
public final class C12054 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C12054 f33582 = new C12054(null, -1, -1);

    /* JADX INFO: renamed from: ֫ */
    public final int f33583;

    /* JADX INFO: renamed from: ۧ */
    public final int f33584;

    /* JADX INFO: renamed from: ܽ */
    public final C14930 f33585;

    public C12054(C14930 c14930, int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException("address < -1");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("line < -1");
        }
        this.f33585 = c14930;
        this.f33583 = i;
        this.f33584 = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(50);
        C14930 c14930 = this.f33585;
        if (c14930 != null) {
            sb.append(c14930.mo4819());
            sb.append(":");
        }
        int i = this.f33584;
        if (i >= 0) {
            sb.append(i);
        }
        sb.append('@');
        int i2 = this.f33583;
        if (i2 < 0) {
            sb.append("????");
        } else {
            sb.append(C16351.m37153(i2));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        r5 = r5.f33585;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        Object obj2;
        C14930 c14930;
        if (!(obj instanceof C12054)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C12054 c12054 = (C12054) obj;
        return this.f33583 == c12054.f33583 && this.f33584 == c12054.f33584 && ((c14930 = this.f33585) == obj2 || (c14930 != null && c14930.equals(obj2)));
    }

    public final int hashCode() {
        return this.f33585.hashCode() + this.f33583 + this.f33584;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m27611(C12054 c12054) {
        return this.f33584 == c12054.f33584;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m27610() {
        return this.f33584;
    }
}
