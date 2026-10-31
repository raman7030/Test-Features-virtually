package l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.widget.GridView;

/* JADX INFO: renamed from: l.۬᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64W8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13314 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C10493 f39863;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final SparseArray f39862 = new SparseArray();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f39859 = 50;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f39856 = 10;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f39858 = 200;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f39857 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f39860 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f39861 = -1;

    public C13314(C10493 c10493) {
        this.f39863 = c10493;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32298() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f39862;
            if (i < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i))).end();
                i++;
            } else {
                sparseArray.clear();
                this.f39861 = -1;
                this.f39860 = -1L;
                this.f39857 = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32300(View view) {
        int iHashCode = view.hashCode();
        SparseArray sparseArray = this.f39862;
        Animator animator = (Animator) sparseArray.get(iHashCode);
        if (animator != null) {
            animator.end();
            sparseArray.remove(iHashCode);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32299(int i, View view, Animator[] animatorArr) {
        if (this.f39857) {
            if (this.f39861 == -1) {
                this.f39861 = i;
            }
            if (this.f39860 == -1) {
                this.f39860 = SystemClock.uptimeMillis();
            }
            view.setAlpha(0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorArr);
            C10493 c10493 = this.f39863;
            int iM26386 = c10493.m26386() - c10493.m26385();
            int i2 = this.f39861;
            int i3 = (i - 1) - i2;
            int i4 = iM26386 + 1;
            int iMax = this.f39856;
            if (i4 < i3) {
                if (c10493.m26387() instanceof GridView) {
                    iMax += (i % ((GridView) c10493.m26387()).getNumColumns()) * iMax;
                }
            } else {
                iMax = Math.max(0, (int) ((-SystemClock.uptimeMillis()) + this.f39860 + ((long) this.f39859) + ((long) ((i - i2) * iMax))));
            }
            animatorSet.setStartDelay(iMax);
            animatorSet.setDuration(this.f39858);
            animatorSet.start();
            this.f39862.put(view.hashCode(), animatorSet);
        }
    }
}
