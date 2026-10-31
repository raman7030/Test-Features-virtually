package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5U9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15749 implements InterfaceC5872 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f48573;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f48574;

    @Override // l.InterfaceC5872
    public final void onTransitionCancel(AbstractC16620 abstractC16620) {
    }

    @Override // l.InterfaceC5872
    public final void onTransitionPause(AbstractC16620 abstractC16620) {
    }

    @Override // l.InterfaceC5872
    public final void onTransitionResume(AbstractC16620 abstractC16620) {
    }

    public C15749(View view, ArrayList arrayList) {
        this.f48574 = view;
        this.f48573 = arrayList;
    }

    @Override // l.InterfaceC5872
    public final void onTransitionStart(AbstractC16620 abstractC16620) {
        abstractC16620.removeListener(this);
        abstractC16620.addListener(this);
    }

    @Override // l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620) {
        abstractC16620.removeListener(this);
        this.f48574.setVisibility(8);
        ArrayList arrayList = this.f48573;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // l.InterfaceC5872
    public final void onTransitionStart(AbstractC16620 abstractC16620, boolean z) {
        onTransitionStart(abstractC16620);
    }

    @Override // l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620, boolean z) {
        onTransitionEnd(abstractC16620);
    }
}
