package p067l;

/* JADX INFO: renamed from: l.ۡ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAH0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11119 {

    /* JADX INFO: renamed from: ֫ */
    public final String f30838;

    /* JADX INFO: renamed from: ᩳ */
    public static final C11119 f30837 = new C11119("tableDirectory");

    /* JADX INFO: renamed from: ۧ */
    public static final C11119 f30835 = new C11119("name");

    /* JADX INFO: renamed from: ܽ */
    public static final C11119 f30836 = new C11119("OS/2");

    public C11119(String str) {
        this.f30838 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11119 m25650(String str) {
        return new C11119(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11119) {
            return this.f30838.equals(((C11119) obj).f30838);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30838.hashCode();
    }

    public final String toString() {
        return this.f30838;
    }
}
