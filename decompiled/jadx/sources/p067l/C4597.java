package p067l;

import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5U9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4597 extends C19506 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ FragmentTransitionSupport f10317;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Object f10318;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ ArrayList f10319;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ ArrayList f10320;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ Object f10321;

    public C4597(FragmentTransitionSupport fragmentTransitionSupport, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f10317 = fragmentTransitionSupport;
        this.f10318 = obj;
        this.f10319 = arrayList;
        this.f10321 = obj2;
        this.f10320 = arrayList2;
    }

    @Override // p067l.C19506, p067l.InterfaceC7949
    public final void onTransitionStart(AbstractC18164 abstractC18164) {
        FragmentTransitionSupport fragmentTransitionSupport = this.f10317;
        Object obj = this.f10318;
        if (obj != null) {
            fragmentTransitionSupport.m38(obj, this.f10319, (ArrayList) null);
        }
        Object obj2 = this.f10321;
        if (obj2 != null) {
            fragmentTransitionSupport.m38(obj2, this.f10320, (ArrayList) null);
        }
    }

    @Override // p067l.C19506, p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164) {
        abstractC18164.removeListener(this);
    }
}
