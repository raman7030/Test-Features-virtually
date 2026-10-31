package l;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes2.dex */
public final class C4651 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f14750;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f14751;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f14752;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7473 f14753;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Paint f14754;

    public C4651(C7473 c7473) {
        this.f14753 = c7473;
        Paint paint = new Paint();
        this.f14754 = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setPathEffect(new DashPathEffect(new float[]{C11266.m27878(5.0f), C11266.m27878(2.5f)}, 0.0f));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13619(C12392 c12392, C12392 c12393, boolean z) {
        C7473 c7473 = this.f14753;
        List list = c7473.f23019;
        int size = 0;
        if (list == null || !C7473.m20037(c7473)) {
            return false;
        }
        C20736 c20736 = c12392.f37258.f9998;
        int iM30408 = ((int) (c12392.m30408() / c12392.f37245.m24484())) + m13618(c12392);
        if (iM30408 >= 0) {
            size = iM30408 >= c20736.size() ? c20736.size() - 1 : iM30408;
        }
        C11747 c11747 = c20736.get(size);
        int iM20043 = C7473.m20043(z, c11747.f35062, c12392.m30436().length(), c12393.m30436().length(), list);
        int iM20044 = C7473.m20043(z, c11747.f35063 + 1, c12392.m30436().length(), c12393.m30436().length(), list);
        int iM9790 = c12393.f37258.m9790(iM20043);
        int iM9791 = iM20043 == iM20044 ? iM9790 : c12393.f37258.m9790(iM20044);
        this.f14750 = size;
        this.f14752 = iM9790;
        this.f14751 = iM9791;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13618(C12392 c12392) {
        return (int) (((int) Math.ceil((c12392.m30542() / c12392.f37245.m24484()) + 1.0f)) * (this.f14753.f23045 ? 0.4f : 0.33f));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m13620(C12392 c12392) {
        return m13618(c12392) * c12392.f37245.m24484();
    }
}
