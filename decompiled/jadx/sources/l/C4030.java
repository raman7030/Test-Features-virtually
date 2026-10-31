package l;

/* JADX INFO: renamed from: l.ۘܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JAWY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4030 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f12798;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f12799;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4030)) {
            return false;
        }
        C4030 c4030 = (C4030) obj;
        return this.f12798 == c4030.f12798 && C11233.m27802(this.f12799, c4030.f12799);
    }

    public final int hashCode() {
        int i = this.f12798 * 31;
        Object obj = this.f12799;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f12798 + ", value=" + this.f12799 + ')';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m12127() {
        return this.f12799;
    }

    public C4030(int i, Object obj) {
        this.f12798 = i;
        this.f12799 = obj;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m12128() {
        return this.f12798;
    }
}
