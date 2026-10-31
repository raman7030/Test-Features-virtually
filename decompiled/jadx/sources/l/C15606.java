package l;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: l.ܺ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes4.dex */
public final class C15606 extends AbstractC2202 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public RectF f48068 = new RectF();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18430 f48069;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f48070;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f48071;

    public C15606(C18430 c18430, float f, float f2) {
        this.f48069 = c18430;
        this.f48070 = f;
        this.f48071 = f2;
    }

    @Override // l.AbstractC2202
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7288(AbstractC10088 abstractC10088) {
        if (!(abstractC10088 instanceof C5854)) {
            return true;
        }
        AbstractC19261 abstractC19261M38398 = abstractC10088.f16090.m38398(((C5854) abstractC10088).f17955);
        if (abstractC19261M38398 == null) {
            return false;
        }
        C4298 c4298 = (C4298) abstractC19261M38398;
        Path path = new C23368(c4298.f13865).f75064;
        Matrix matrix = c4298.f57156;
        if (matrix != null) {
            path.transform(matrix);
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f48068.union(rectF);
        return false;
    }

    @Override // l.AbstractC2202
    /* JADX INFO: renamed from: ֫ */
    public final void mo7287(String str) {
        C18430 c18430 = this.f48069;
        if (c18430.m42893()) {
            Rect rect = new Rect();
            c18430.f57191.f26148.getTextBounds(str, 0, str.length(), rect);
            RectF rectF = new RectF(rect);
            rectF.offset(this.f48070, this.f48071);
            this.f48068.union(rectF);
        }
        this.f48070 = c18430.f57191.f26148.measureText(str) + this.f48070;
    }
}
