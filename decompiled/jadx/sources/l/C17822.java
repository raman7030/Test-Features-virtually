package l;

/* JADX INFO: renamed from: l.ᩳۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96ZB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17822 extends IllegalArgumentException {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f54465;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC17116 f54466;

    public C17822(int i, EnumC17116 enumC17116) {
        super("Invalid HTTP request headers at line " + i + ": " + enumC17116);
        this.f54465 = i;
        this.f54466 = enumC17116;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41761() {
        return this.f54465;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC17116 m41762() {
        return this.f54466;
    }
}
