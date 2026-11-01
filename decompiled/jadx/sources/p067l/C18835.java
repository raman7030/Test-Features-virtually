package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZM */
/* JADX INFO: loaded from: classes5.dex */
public final class C18835 extends C19506 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC16152 f56255;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C0977 f56256;

    public C18835(ViewTreeObserverOnPreDrawListenerC16152 viewTreeObserverOnPreDrawListenerC16152, C0977 c0977) {
        this.f56255 = viewTreeObserverOnPreDrawListenerC16152;
        this.f56256 = c0977;
    }

    @Override // p067l.C19506, p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164) {
        ((ArrayList) this.f56256.getOrDefault(this.f56255.f47571, null)).remove(abstractC18164);
        abstractC18164.removeListener(this);
    }
}
