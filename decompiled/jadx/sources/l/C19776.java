package l;

import android.graphics.Paint;

/* JADX INFO: renamed from: l.᩵᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19776 extends AbstractC1430 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23418 f63850;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C23418 f63853;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f63846 = 0.0f;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f63848 = 1.0f;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f63851 = 1.0f;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f63844 = 0.0f;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f63849 = 1.0f;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f63843 = 0.0f;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Paint.Cap f63845 = Paint.Cap.BUTT;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Paint.Join f63852 = Paint.Join.MITER;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f63847 = 4.0f;

    @Override // l.AbstractC5664
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2834() {
        return this.f63850.m51883() || this.f63853.m51883();
    }

    @Override // l.AbstractC5664
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2835(int[] iArr) {
        return this.f63853.m51879(iArr) | this.f63850.m51879(iArr);
    }

    public int getStrokeColor() {
        return this.f63853.m51877();
    }

    public void setStrokeColor(int i) {
        this.f63853.m51878(i);
    }

    public float getStrokeWidth() {
        return this.f63846;
    }

    public void setStrokeWidth(float f) {
        this.f63846 = f;
    }

    public float getStrokeAlpha() {
        return this.f63848;
    }

    public void setStrokeAlpha(float f) {
        this.f63848 = f;
    }

    public int getFillColor() {
        return this.f63850.m51877();
    }

    public void setFillColor(int i) {
        this.f63850.m51878(i);
    }

    public float getFillAlpha() {
        return this.f63851;
    }

    public void setFillAlpha(float f) {
        this.f63851 = f;
    }

    public float getTrimPathStart() {
        return this.f63844;
    }

    public void setTrimPathStart(float f) {
        this.f63844 = f;
    }

    public float getTrimPathEnd() {
        return this.f63849;
    }

    public void setTrimPathEnd(float f) {
        this.f63849 = f;
    }

    public float getTrimPathOffset() {
        return this.f63843;
    }

    public void setTrimPathOffset(float f) {
        this.f63843 = f;
    }
}
