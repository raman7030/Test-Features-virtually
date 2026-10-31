package l;

/* JADX INFO: renamed from: l.᩷۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBIO */
/* JADX INFO: loaded from: classes4.dex */
public final class C20870 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f67539;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f67540;

    public C20870(int i) {
        this.f67540 = i;
        this.f67539 = "Attributes incorrectly present on end tag";
    }

    public C20870(int i, String str, Object... objArr) {
        this.f67539 = String.format(str, objArr);
        this.f67540 = i;
    }

    public final String toString() {
        return this.f67540 + ": " + this.f67539;
    }
}
