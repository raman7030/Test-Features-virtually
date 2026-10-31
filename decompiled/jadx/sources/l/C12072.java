package l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7JY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12072 extends AbstractC11367 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9956 f36101;

    public C12072(C9956 c9956) {
        this.f36101 = c9956;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00d6  */
    @Override // l.AbstractC11367
    /* JADX INFO: renamed from: ֫ */
    public final void mo27171(int i, float f, int i2) {
        C9956 c9956 = this.f36101;
        ArrayList arrayList = c9956.f13900;
        Object obj = arrayList.get(i);
        C11233.m27803(obj, "get(...)");
        ImageView imageView = (ImageView) obj;
        float f2 = 1;
        C5722.m16158((int) C20382.m46695(f2, f, (c9956.f30067 - f2) * c9956.m12966(), c9956.m12966()), imageView);
        C11233.m27805(arrayList, "<this>");
        if (i2 >= 0 && i2 < arrayList.size()) {
            Object obj2 = arrayList.get(i2);
            C11233.m27803(obj2, "get(...)");
            ImageView imageView2 = (ImageView) obj2;
            C5722.m16158((int) (((c9956.f30067 - f2) * c9956.m12966() * f) + c9956.m12966()), imageView2);
            Drawable background = imageView.getBackground();
            C11233.m27800((Object) background, "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
            C2900 c2900 = (C2900) background;
            Drawable background2 = imageView2.getBackground();
            C11233.m27800((Object) background2, "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
            C2900 c2901 = (C2900) background2;
            if (c9956.m25110() != c9956.m12965()) {
                Object objEvaluate = c9956.f30063.evaluate(f, Integer.valueOf(c9956.m25110()), Integer.valueOf(c9956.m12965()));
                C11233.m27800(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) objEvaluate).intValue();
                Object objEvaluate2 = c9956.f30063.evaluate(f, Integer.valueOf(c9956.m12965()), Integer.valueOf(c9956.m25110()));
                C11233.m27800(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                c2901.setColor(((Integer) objEvaluate2).intValue());
                if (c9956.f30064) {
                    InterfaceC21950 interfaceC21950M12969 = c9956.m12969();
                    C11233.m27799(interfaceC21950M12969);
                    if (i <= ((C20746) interfaceC21950M12969).m47382()) {
                        c2900.setColor(c9956.m25110());
                    } else {
                        c2900.setColor(iIntValue);
                    }
                } else {
                    c2900.setColor(iIntValue);
                }
            }
        }
        c9956.invalidate();
    }

    @Override // l.AbstractC11367
    /* JADX INFO: renamed from: ֫ */
    public final void mo27170(int i) {
        C9956 c9956 = this.f36101;
        if (i >= c9956.f13900.size()) {
            return;
        }
        Object obj = c9956.f13900.get(i);
        C11233.m27803(obj, "get(...)");
        C5722.m16158((int) c9956.m12966(), (View) obj);
        c9956.mo12962(i);
    }

    @Override // l.AbstractC11367
    /* JADX INFO: renamed from: ֫ */
    public final int mo27169() {
        return this.f36101.f13900.size();
    }
}
