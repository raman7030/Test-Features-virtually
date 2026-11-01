package p067l;

/* JADX INFO: renamed from: l.ᩳۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96ZB */
/* JADX INFO: loaded from: classes4.dex */
public final class C19306 extends IllegalArgumentException {

    /* JADX INFO: renamed from: ᩸ */
    public final int f57661;

    /* JADX INFO: renamed from: ᩹ */
    public final EnumC18635 f57662;

    public C19306(int i, EnumC18635 enumC18635) {
        super("Invalid HTTP request headers at line " + i + ": " + enumC18635);
        this.f57661 = i;
        this.f57662 = enumC18635;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m44007() {
        return this.f57661;
    }

    /* JADX INFO: renamed from: ۧ */
    public final EnumC18635 m44008() {
        return this.f57662;
    }
}
