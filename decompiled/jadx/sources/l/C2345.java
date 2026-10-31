package l;

import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5U9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2345 extends C18032 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FragmentTransitionSupport f7526;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7527;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f7528;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f7529;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7530;

    public C2345(FragmentTransitionSupport fragmentTransitionSupport, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f7526 = fragmentTransitionSupport;
        this.f7527 = obj;
        this.f7528 = arrayList;
        this.f7530 = obj2;
        this.f7529 = arrayList2;
    }

    @Override // l.C18032, l.InterfaceC5872
    public final void onTransitionStart(AbstractC16620 abstractC16620) {
        FragmentTransitionSupport fragmentTransitionSupport = this.f7526;
        Object obj = this.f7527;
        if (obj != null) {
            fragmentTransitionSupport.m38(obj, this.f7528, (ArrayList) null);
        }
        Object obj2 = this.f7530;
        if (obj2 != null) {
            fragmentTransitionSupport.m38(obj2, this.f7529, (ArrayList) null);
        }
    }

    @Override // l.C18032, l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620) {
        abstractC16620.removeListener(this);
    }
}
