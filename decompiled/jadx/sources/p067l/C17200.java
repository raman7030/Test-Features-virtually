package p067l;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: l.ܺ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes4.dex */
public final class C17200 extends AbstractC4461 {

    /* JADX INFO: renamed from: ֫ */
    public RectF f51199 = new RectF();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C19884 f51200;

    /* JADX INFO: renamed from: ܽ */
    public float f51201;

    /* JADX INFO: renamed from: ᩳ */
    public float f51202;

    public C17200(C19884 c19884, float f, float f2) {
        this.f51200 = c19884;
        this.f51201 = f;
        this.f51202 = f2;
    }

    @Override // p067l.AbstractC4461
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9367(AbstractC11956 abstractC11956) {
        if (!(abstractC11956 instanceof C7932)) {
            return true;
        }
        AbstractC20674 abstractC20674M40613 = abstractC11956.f18929.m40613(((C7932) abstractC11956).f20806);
        if (abstractC20674M40613 == null) {
            return false;
        }
        C6453 c6453 = (C6453) abstractC20674M40613;
        Path path = new C24577(c6453.f16680).f77810;
        Matrix matrix = c6453.f60375;
        if (matrix != null) {
            path.transform(matrix);
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f51199.union(rectF);
        return false;
    }

    @Override // p067l.AbstractC4461
    /* JADX INFO: renamed from: ֫ */
    public final void mo9366(String str) {
        C19884 c19884 = this.f51200;
        if (c19884.m45166()) {
            Rect rect = new Rect();
            c19884.f60409.f29063.getTextBounds(str, 0, str.length(), rect);
            RectF rectF = new RectF(rect);
            rectF.offset(this.f51201, this.f51202);
            this.f51199.union(rectF);
        }
        this.f51201 = c19884.f60409.f29063.measureText(str) + this.f51201;
    }
}
