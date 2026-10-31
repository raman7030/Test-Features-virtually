package l;

/* JADX INFO: renamed from: l.ۤ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 18YS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10489 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31464;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char f31465;

    public C10489(char c, int i) {
        this.f31465 = c;
        this.f31464 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10489)) {
            return false;
        }
        C10489 c10489 = (C10489) obj;
        return this.f31465 == c10489.f31465 && this.f31464 == c10489.f31464;
    }

    public final int hashCode() {
        return C11003.hash(Character.valueOf(this.f31465), Integer.valueOf(this.f31464));
    }
}
