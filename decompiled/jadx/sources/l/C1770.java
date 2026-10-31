package l;

/* JADX INFO: renamed from: l.֫ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes2.dex */
public final class C1770 extends C10943 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14469 f6138;

    public C1770(C14469 c14469) {
        this.f6138 = c14469;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1770) {
            return this.f6138.equals(((C1770) obj).f6138);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6138.hashCode();
    }

    @Override // l.C10943
    public final String toString() {
        return "Closed(" + this.f6138 + ')';
    }
}
