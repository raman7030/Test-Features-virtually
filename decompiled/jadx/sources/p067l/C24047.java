package p067l;

/* JADX INFO: renamed from: l.᩺ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final class C24047 {

    /* JADX INFO: renamed from: ֫ */
    public ViewTreeObserverOnPreDrawListenerC10518[] f76377;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C14146 f76378;

    /* JADX INFO: renamed from: ֫ */
    public final void m53294() {
        m53295(0, 0, 0, false);
        m53295(1, 0, 0, false);
        m53295(2, 0, 0, false);
    }

    public C24047(C14146 c14146) {
        this.f76378 = c14146;
        this.f76377 = new ViewTreeObserverOnPreDrawListenerC10518[]{new ViewTreeObserverOnPreDrawListenerC10518(c14146.getContext(), c14146, 0), new ViewTreeObserverOnPreDrawListenerC10518(c14146.getContext(), c14146, 1), new ViewTreeObserverOnPreDrawListenerC10518(c14146.getContext(), c14146, 2)};
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53295(int i, int i2, int i3, boolean z) {
        this.f76377[i].m24252(i2, i3, z);
    }
}
