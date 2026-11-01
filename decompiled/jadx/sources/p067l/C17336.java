package p067l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5U9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17336 implements InterfaceC7949 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ArrayList f51713;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ View f51714;

    @Override // p067l.InterfaceC7949
    public final void onTransitionCancel(AbstractC18164 abstractC18164) {
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionPause(AbstractC18164 abstractC18164) {
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionResume(AbstractC18164 abstractC18164) {
    }

    public C17336(View view, ArrayList arrayList) {
        this.f51714 = view;
        this.f51713 = arrayList;
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionStart(AbstractC18164 abstractC18164) {
        abstractC18164.removeListener(this);
        abstractC18164.addListener(this);
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164) {
        abstractC18164.removeListener(this);
        this.f51714.setVisibility(8);
        ArrayList arrayList = this.f51713;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionStart(AbstractC18164 abstractC18164, boolean z) {
        onTransitionStart(abstractC18164);
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164, boolean z) {
        onTransitionEnd(abstractC18164);
    }
}
