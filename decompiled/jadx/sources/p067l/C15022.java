package p067l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.widget.GridView;

/* JADX INFO: renamed from: l.۬᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64W8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15022 {

    /* JADX INFO: renamed from: ᩻ */
    public final C12341 f42930;

    /* JADX INFO: renamed from: ᩳ */
    public final SparseArray f42929 = new SparseArray();

    /* JADX INFO: renamed from: ܳ */
    public int f42926 = 50;

    /* JADX INFO: renamed from: ֫ */
    public int f42923 = 10;

    /* JADX INFO: renamed from: ۧ */
    public int f42925 = 200;

    /* JADX INFO: renamed from: ۜ */
    public boolean f42924 = true;

    /* JADX INFO: renamed from: ܽ */
    public long f42927 = -1;

    /* JADX INFO: renamed from: ܿ */
    public int f42928 = -1;

    public C15022(C12341 c12341) {
        this.f42930 = c12341;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34398() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f42929;
            if (i < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i))).end();
                i++;
            } else {
                sparseArray.clear();
                this.f42928 = -1;
                this.f42927 = -1L;
                this.f42924 = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34400(View view) {
        int iHashCode = view.hashCode();
        SparseArray sparseArray = this.f42929;
        Animator animator = (Animator) sparseArray.get(iHashCode);
        if (animator != null) {
            animator.end();
            sparseArray.remove(iHashCode);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34399(int i, View view, Animator[] animatorArr) {
        if (this.f42924) {
            if (this.f42928 == -1) {
                this.f42928 = i;
            }
            if (this.f42927 == -1) {
                this.f42927 = SystemClock.uptimeMillis();
            }
            view.setAlpha(0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorArr);
            C12341 c12341 = this.f42930;
            int iM28419 = c12341.m28419() - c12341.m28418();
            int i2 = this.f42928;
            int i3 = (i - 1) - i2;
            int i4 = iM28419 + 1;
            int iMax = this.f42923;
            if (i4 < i3) {
                if (c12341.m28420() instanceof GridView) {
                    iMax += (i % ((GridView) c12341.m28420()).getNumColumns()) * iMax;
                }
            } else {
                iMax = Math.max(0, (int) ((-SystemClock.uptimeMillis()) + this.f42927 + ((long) this.f42926) + ((long) ((i - i2) * iMax))));
            }
            animatorSet.setStartDelay(iMax);
            animatorSet.setDuration(this.f42925);
            animatorSet.start();
            this.f42929.put(view.hashCode(), animatorSet);
        }
    }
}
