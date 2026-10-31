package l;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: l.ܳۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes3.dex */
public final class C14338 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f43232;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f43233;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f43234;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f43235;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f43236;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f43237;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final View f43238;

    public C14338(View view) {
        this.f43238 = view;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34219(PointF pointF) {
        this.f43235 = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        this.f43236 = iRound;
        int i = this.f43234 + 1;
        this.f43234 = i;
        if (i == this.f43233) {
            C21560.m48717(this.f43238, this.f43235, iRound, this.f43237, this.f43232);
            this.f43234 = 0;
            this.f43233 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34218(PointF pointF) {
        this.f43237 = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        this.f43232 = iRound;
        int i = this.f43233 + 1;
        this.f43233 = i;
        if (this.f43234 == i) {
            C21560.m48717(this.f43238, this.f43235, this.f43236, this.f43237, iRound);
            this.f43234 = 0;
            this.f43233 = 0;
        }
    }
}
