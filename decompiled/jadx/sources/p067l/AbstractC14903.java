package p067l;

/* JADX INFO: renamed from: l.۬ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14903 {

    /* JADX INFO: renamed from: ֫ */
    public final String f42512;

    public AbstractC14903(String str) {
        C18515.m42065((Object) str);
        this.f42512 = str;
    }

    public final int hashCode() {
        String str = this.f42512;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = ((AbstractC14903) obj).f42512;
        String str2 = this.f42512;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final String toString() {
        return this.f42512;
    }
}
