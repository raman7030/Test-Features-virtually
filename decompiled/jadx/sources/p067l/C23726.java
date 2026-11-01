package p067l;

/* JADX INFO: renamed from: l.᩹ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78QG */
/* JADX INFO: loaded from: classes2.dex */
public final class C23726 extends C19703 implements Comparable {

    /* JADX INFO: renamed from: ᩺ */
    public long f75503;

    public /* synthetic */ C23726(int i) {
        this();
    }

    public C23726() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C23726 c23726 = (C23726) obj;
        if (m14573() != c23726.m14573()) {
            return m14573() ? 1 : -1;
        }
        long j = this.f72706 - c23726.f72706;
        if (j == 0) {
            j = this.f75503 - c23726.f75503;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
