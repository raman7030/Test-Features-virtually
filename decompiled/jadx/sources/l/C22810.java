package l;

/* JADX INFO: renamed from: l.᩺ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final class C22810 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC8575[] f73647;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f73648;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50904() {
        m50905(0, 0, 0, false);
        m50905(1, 0, 0, false);
        m50905(2, 0, 0, false);
    }

    public C22810(C12392 c12392) {
        this.f73648 = c12392;
        this.f73647 = new ViewTreeObserverOnPreDrawListenerC8575[]{new ViewTreeObserverOnPreDrawListenerC8575(c12392.getContext(), c12392, 0), new ViewTreeObserverOnPreDrawListenerC8575(c12392.getContext(), c12392, 1), new ViewTreeObserverOnPreDrawListenerC8575(c12392.getContext(), c12392, 2)};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50905(int i, int i2, int i3, boolean z) {
        this.f73647[i].m22283(i2, i3, z);
    }
}
