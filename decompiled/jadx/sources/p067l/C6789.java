package p067l;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes2.dex */
public final class C6789 {

    /* JADX INFO: renamed from: ֫ */
    public int f17577;

    /* JADX INFO: renamed from: ۧ */
    public int f17578;

    /* JADX INFO: renamed from: ܽ */
    public int f17579;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C9471 f17580;

    /* JADX INFO: renamed from: ᩳ */
    public final Paint f17581;

    public C6789(C9471 c9471) {
        this.f17580 = c9471;
        Paint paint = new Paint();
        this.f17581 = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setPathEffect(new DashPathEffect(new float[]{C13076.m29939(5.0f), C13076.m29939(2.5f)}, 0.0f));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m15494(C14146 c14146, C14146 c14147, boolean z) {
        C9471 c9471 = this.f17580;
        List list = c9471.f25931;
        int size = 0;
        if (list == null || !C9471.m22012(c9471)) {
            return false;
        }
        C22076 c22076 = c14146.f40275.f12798;
        int iM32472 = ((int) (c14146.m32472() / c14146.f40262.m26496())) + m15493(c14146);
        if (iM32472 >= 0) {
            size = iM32472 >= c22076.size() ? c22076.size() - 1 : iM32472;
        }
        C13533 c13533 = c22076.get(size);
        int iM22018 = C9471.m22018(z, c13533.f38061, c14146.m32500().length(), c14147.m32500().length(), list);
        int iM22019 = C9471.m22018(z, c13533.f38062 + 1, c14146.m32500().length(), c14147.m32500().length(), list);
        int iM11834 = c14147.f40275.m11834(iM22018);
        int iM11835 = iM22018 == iM22019 ? iM11834 : c14147.f40275.m11834(iM22019);
        this.f17577 = size;
        this.f17579 = iM11834;
        this.f17578 = iM11835;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m15493(C14146 c14146) {
        return (int) (((int) Math.ceil((c14146.m32606() / c14146.f40262.m26496()) + 1.0f)) * (this.f17580.f25957 ? 0.4f : 0.33f));
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m15495(C14146 c14146) {
        return m15493(c14146) * c14146.f40262.m26496();
    }
}
