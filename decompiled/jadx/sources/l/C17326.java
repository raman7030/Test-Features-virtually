package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZM */
/* JADX INFO: loaded from: classes5.dex */
public final class C17326 extends C18032 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC14503 f53073;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2727 f53074;

    public C17326(ViewTreeObserverOnPreDrawListenerC14503 viewTreeObserverOnPreDrawListenerC14503, C2727 c2727) {
        this.f53073 = viewTreeObserverOnPreDrawListenerC14503;
        this.f53074 = c2727;
    }

    @Override // l.C18032, l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620) {
        ((ArrayList) this.f53074.getOrDefault(this.f53073.f44470, null)).remove(abstractC16620);
        abstractC16620.removeListener(this);
    }
}
