package l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* JADX INFO: renamed from: l.ۗ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 859N */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3437 extends AbstractC4848 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f10856;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10857;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f10858;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C13314 f10859;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f10860;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f10861;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract Animator[] mo10505();

    public AbstractC3437(BaseAdapter baseAdapter) {
        super(baseAdapter);
        this.f10861 = true;
        this.f10856 = true;
        this.f10857 = -1;
        this.f10860 = true;
        if (baseAdapter instanceof AbstractC3437) {
            ((AbstractC3437) baseAdapter).f10860 = false;
        }
    }

    @Override // l.AbstractC4848, l.InterfaceC6259
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10503(C10493 c10493) {
        super.mo10503(c10493);
        this.f10859 = new C13314(c10493);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m10506() {
        if (m14113() == null) {
            throw new IllegalStateException("Call setAbsListView() on this AnimationAdapter first!");
        }
        this.f10859.m32298();
        this.f10856 = true;
        this.f10857 = -1;
        this.f10858 = System.currentTimeMillis();
        if (m14111() instanceof AbstractC3437) {
            ((AbstractC3437) m14111()).m10506();
        }
    }

    @Override // l.AbstractC4848, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = this.f10860;
        if (z) {
            if (m14113() == null) {
                throw new IllegalStateException("Call setAbsListView() on this AnimationAdapter first!");
            }
            if (view != null) {
                this.f10859.m32300(view);
            }
        }
        View view2 = super.getView(i, view, viewGroup);
        if (z && this.f10861 && System.currentTimeMillis() - this.f10858 < 500) {
            boolean z2 = this.f10856 && ((i2 = this.f10857) == -1 || i2 == i);
            this.f10856 = z2;
            if (z2) {
                this.f10857 = i;
            }
            Animator[] animatorArrMo10505 = m14111() instanceof AbstractC3437 ? ((AbstractC3437) m14111()).mo10505() : new Animator[0];
            Animator[] animatorArrMo10506 = mo10505();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, view2.getAlpha());
            int length = animatorArrMo10505.length + animatorArrMo10506.length;
            Animator[] animatorArr = new Animator[length + 1];
            int i3 = 0;
            while (i3 < animatorArrMo10505.length) {
                animatorArr[i3] = animatorArrMo10505[i3];
                i3++;
            }
            for (Animator animator : animatorArrMo10506) {
                animatorArr[i3] = animator;
                i3++;
            }
            animatorArr[length] = objectAnimatorOfFloat;
            this.f10859.m32299(i, view2, animatorArr);
        }
        return view2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10504(boolean z) {
        this.f10861 = z;
    }
}
