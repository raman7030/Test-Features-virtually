package p067l;

/* JADX INFO: renamed from: l.᩻ۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes.dex */
public final class C24796 {

    /* JADX INFO: renamed from: ֫ */
    public final int f79246;

    /* JADX INFO: renamed from: ۧ */
    public final C24320 f79247;

    /* JADX INFO: renamed from: ܽ */
    public final C11209 f79248;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC9768 f79249;

    /* JADX INFO: renamed from: ᩳ */
    public final int f79250;

    public C24796(InterfaceC9768 interfaceC9768, C24320 c24320, C11209 c11209) {
        this.f79249 = interfaceC9768;
        this.f79247 = c24320;
        this.f79248 = c11209;
        this.f79246 = interfaceC9768.mo28581();
        int length = interfaceC9768.length();
        this.f79250 = length;
        if (c11209.m25889() != length) {
            throw new IllegalArgumentException("Line background store length differs from text");
        }
    }
}
