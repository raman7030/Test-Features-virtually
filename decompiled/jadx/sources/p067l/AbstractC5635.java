package p067l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* JADX INFO: renamed from: l.ۗ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 859N */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5635 extends AbstractC6976 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f13659;

    /* JADX INFO: renamed from: ۙ */
    public int f13660;

    /* JADX INFO: renamed from: ۤ */
    public long f13661;

    /* JADX INFO: renamed from: ۫ */
    public C15022 f13662;

    /* JADX INFO: renamed from: ۬ */
    public boolean f13663;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f13664;

    /* JADX INFO: renamed from: ܽ */
    public abstract Animator[] mo12529();

    public AbstractC5635(BaseAdapter baseAdapter) {
        super(baseAdapter);
        this.f13664 = true;
        this.f13659 = true;
        this.f13660 = -1;
        this.f13663 = true;
        if (baseAdapter instanceof AbstractC5635) {
            ((AbstractC5635) baseAdapter).f13663 = false;
        }
    }

    @Override // p067l.AbstractC6976, p067l.InterfaceC8317
    /* JADX INFO: renamed from: ֫ */
    public final void mo12527(C12341 c12341) {
        super.mo12527(c12341);
        this.f13662 = new C15022(c12341);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m12530() {
        if (m15993() == null) {
            throw new IllegalStateException("Call setAbsListView() on this AnimationAdapter first!");
        }
        this.f13662.m34398();
        this.f13659 = true;
        this.f13660 = -1;
        this.f13661 = System.currentTimeMillis();
        if (m15991() instanceof AbstractC5635) {
            ((AbstractC5635) m15991()).m12530();
        }
    }

    @Override // p067l.AbstractC6976, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = this.f13663;
        if (z) {
            if (m15993() == null) {
                throw new IllegalStateException("Call setAbsListView() on this AnimationAdapter first!");
            }
            if (view != null) {
                this.f13662.m34400(view);
            }
        }
        View view2 = super.getView(i, view, viewGroup);
        if (z && this.f13664 && System.currentTimeMillis() - this.f13661 < 500) {
            boolean z2 = this.f13659 && ((i2 = this.f13660) == -1 || i2 == i);
            this.f13659 = z2;
            if (z2) {
                this.f13660 = i;
            }
            Animator[] animatorArrMo12529 = m15991() instanceof AbstractC5635 ? ((AbstractC5635) m15991()).mo12529() : new Animator[0];
            Animator[] animatorArrMo125210 = mo12529();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, view2.getAlpha());
            int length = animatorArrMo12529.length + animatorArrMo125210.length;
            Animator[] animatorArr = new Animator[length + 1];
            int i3 = 0;
            while (i3 < animatorArrMo12529.length) {
                animatorArr[i3] = animatorArrMo12529[i3];
                i3++;
            }
            for (Animator animator : animatorArrMo125210) {
                animatorArr[i3] = animator;
                i3++;
            }
            animatorArr[length] = objectAnimatorOfFloat;
            this.f13662.m34399(i, view2, animatorArr);
        }
        return view2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12528(boolean z) {
        this.f13664 = z;
    }
}
