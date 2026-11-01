package p067l;

import android.graphics.Paint;

/* JADX INFO: renamed from: l.᩵᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21164 extends AbstractC3728 {

    /* JADX INFO: renamed from: ܿ */
    public C2004 f66488;

    /* JADX INFO: renamed from: ᩻ */
    public C2004 f66491;

    /* JADX INFO: renamed from: ۡ */
    public float f66484 = 0.0f;

    /* JADX INFO: renamed from: ܳ */
    public float f66486 = 1.0f;

    /* JADX INFO: renamed from: ᩳ */
    public float f66489 = 1.0f;

    /* JADX INFO: renamed from: ۘ */
    public float f66482 = 0.0f;

    /* JADX INFO: renamed from: ܺ */
    public float f66487 = 1.0f;

    /* JADX INFO: renamed from: ۖ */
    public float f66481 = 0.0f;

    /* JADX INFO: renamed from: ۜ */
    public Paint.Cap f66483 = Paint.Cap.BUTT;

    /* JADX INFO: renamed from: ᩷ */
    public Paint.Join f66490 = Paint.Join.MITER;

    /* JADX INFO: renamed from: ۢ */
    public float f66485 = 4.0f;

    @Override // p067l.AbstractC7752
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5163() {
        return this.f66488.m54281() || this.f66491.m54281();
    }

    @Override // p067l.AbstractC7752
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5164(int[] iArr) {
        return this.f66491.m54277(iArr) | this.f66488.m54277(iArr);
    }

    public int getStrokeColor() {
        return this.f66491.m54275();
    }

    public void setStrokeColor(int i) {
        this.f66491.m54276(i);
    }

    public float getStrokeWidth() {
        return this.f66484;
    }

    public void setStrokeWidth(float f) {
        this.f66484 = f;
    }

    public float getStrokeAlpha() {
        return this.f66486;
    }

    public void setStrokeAlpha(float f) {
        this.f66486 = f;
    }

    public int getFillColor() {
        return this.f66488.m54275();
    }

    public void setFillColor(int i) {
        this.f66488.m54276(i);
    }

    public float getFillAlpha() {
        return this.f66489;
    }

    public void setFillAlpha(float f) {
        this.f66489 = f;
    }

    public float getTrimPathStart() {
        return this.f66482;
    }

    public void setTrimPathStart(float f) {
        this.f66482 = f;
    }

    public float getTrimPathEnd() {
        return this.f66487;
    }

    public void setTrimPathEnd(float f) {
        this.f66487 = f;
    }

    public float getTrimPathOffset() {
        return this.f66481;
    }

    public void setTrimPathOffset(float f) {
        this.f66481 = f;
    }
}
