package p067l;

/* JADX INFO: renamed from: l.ۘܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JAWY */
/* JADX INFO: loaded from: classes2.dex */
public final class C6199 {

    /* JADX INFO: renamed from: ֫ */
    public final int f15614;

    /* JADX INFO: renamed from: ۧ */
    public final Object f15615;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6199)) {
            return false;
        }
        C6199 c6199 = (C6199) obj;
        return this.f15614 == c6199.f15614 && C13045.m29864(this.f15615, c6199.f15615);
    }

    public final int hashCode() {
        int i = this.f15614 * 31;
        Object obj = this.f15615;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f15614 + ", value=" + this.f15615 + ')';
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m14048() {
        return this.f15615;
    }

    public C6199(int i, Object obj) {
        this.f15614 = i;
        this.f15615 = obj;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m14049() {
        return this.f15614;
    }
}
