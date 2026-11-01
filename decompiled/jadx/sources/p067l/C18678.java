package p067l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܿۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes5.dex */
public final class C18678 extends C19506 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f55752 = false;

    /* JADX INFO: renamed from: ۧ */
    public final ViewGroup f55753;

    public C18678(ViewGroup viewGroup) {
        this.f55753 = viewGroup;
    }

    @Override // p067l.C19506, p067l.InterfaceC7949
    public final void onTransitionCancel(AbstractC18164 abstractC18164) {
        C3412.m6043(this.f55753, false);
        this.f55752 = true;
    }

    @Override // p067l.C19506, p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164) {
        if (!this.f55752) {
            C3412.m6043(this.f55753, false);
        }
        abstractC18164.removeListener(this);
    }

    @Override // p067l.C19506, p067l.InterfaceC7949
    public final void onTransitionPause(AbstractC18164 abstractC18164) {
        C3412.m6043(this.f55753, false);
    }

    @Override // p067l.C19506, p067l.InterfaceC7949
    public final void onTransitionResume(AbstractC18164 abstractC18164) {
        C3412.m6043(this.f55753, true);
    }
}
