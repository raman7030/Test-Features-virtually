package l;

/* JADX INFO: renamed from: l.۬ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13189 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f39448;

    public AbstractC13189(String str) {
        C16990.m39822((Object) str);
        this.f39448 = str;
    }

    public final int hashCode() {
        String str = this.f39448;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = ((AbstractC13189) obj).f39448;
        String str2 = this.f39448;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final String toString() {
        return this.f39448;
    }
}
