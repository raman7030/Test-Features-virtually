package l;

/* JADX INFO: renamed from: l.ܳ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8EK */
/* JADX INFO: loaded from: classes3.dex */
public final class C14209 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f42875;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f42876;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f42877;

    public C14209(C6449 c6449, String str, String str2, String str3) {
        this.f42875 = c6449.m17809(str);
        this.f42876 = c6449.m17809(str2);
        this.f42877 = c6449.m17809(str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14209.class == obj.getClass()) {
            C14209 c14209 = (C14209) obj;
            if (this.f42875 == c14209.f42875 && this.f42876 == c14209.f42876 && this.f42877 == c14209.f42877) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f42875 * 31) + this.f42876) * 31) + this.f42877;
    }
}
