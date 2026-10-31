package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14934 extends AbstractC0823 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C0117[] f45521;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45522;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C4037 f45523;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f45524;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f45525;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5057 f45526;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C17757 f45527;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m35385(C14934 c14934) {
        int i = c14934.f45522;
        c14934.f45522 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m35387() {
        return this.f45524;
    }

    @Override // l.AbstractC0823
    public final String getName() {
        return this.f45523.getName();
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۧ */
    public final C5057 mo1134() {
        return this.f45526;
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ܿ */
    public final String mo1141() {
        return this.f45525;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17757 m35389() {
        return this.f45527;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m35390() {
        return this.f45522;
    }

    public final List getFields() {
        return C20195.unmodifiableList(Arrays.asList(this.f45521));
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC23338 mo1132() {
        return this.f45523;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m35388() {
        C0117[] c0117Arr = this.f45521;
        return c0117Arr.length == 1 && c0117Arr[0].f1117;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m35386(C14934 c14934) {
        c14934.m3070(c14934.f45523.m12138().m2200());
    }

    public C14934(C4037 c4037, C5057 c5057, C17757 c17757, int i) {
        super(0);
        this.f2993 = c17757;
        this.f45523 = c4037;
        this.f45525 = C21991.m49472(c5057, c17757, c4037.getName());
        this.f45526 = c5057;
        this.f45524 = i;
        this.f45527 = c17757;
        this.f45522 = 0;
    }
}
