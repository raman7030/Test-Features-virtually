package p067l;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: l.ܳۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes3.dex */
public final class C15995 {

    /* JADX INFO: renamed from: ֫ */
    public int f46324;

    /* JADX INFO: renamed from: ۧ */
    public int f46325;

    /* JADX INFO: renamed from: ܳ */
    public int f46326;

    /* JADX INFO: renamed from: ܽ */
    public int f46327;

    /* JADX INFO: renamed from: ܿ */
    public int f46328;

    /* JADX INFO: renamed from: ᩳ */
    public int f46329;

    /* JADX INFO: renamed from: ᩻ */
    public final View f46330;

    public C15995(View view) {
        this.f46330 = view;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36352(PointF pointF) {
        this.f46327 = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        this.f46328 = iRound;
        int i = this.f46326 + 1;
        this.f46326 = i;
        if (i == this.f46325) {
            C22859.m51062(this.f46330, this.f46327, iRound, this.f46329, this.f46324);
            this.f46326 = 0;
            this.f46325 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36351(PointF pointF) {
        this.f46329 = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        this.f46324 = iRound;
        int i = this.f46325 + 1;
        this.f46325 = i;
        if (this.f46326 == i) {
            C22859.m51062(this.f46330, this.f46327, this.f46328, this.f46329, iRound);
            this.f46326 = 0;
            this.f46325 = 0;
        }
    }
}
