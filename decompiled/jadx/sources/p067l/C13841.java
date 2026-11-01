package p067l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7JY */
/* JADX INFO: loaded from: classes4.dex */
public final class C13841 extends AbstractC13171 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C11830 f39112;

    public C13841(C11830 c11830) {
        this.f39112 = c11830;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00d6  */
    @Override // p067l.AbstractC13171
    /* JADX INFO: renamed from: ֫ */
    public final void mo29216(int i, float f, int i2) {
        C11830 c11830 = this.f39112;
        ArrayList arrayList = c11830.f16715;
        Object obj = arrayList.get(i);
        C13045.m29865(obj, "get(...)");
        ImageView imageView = (ImageView) obj;
        float f2 = 1;
        C7806.m18077((int) C21740.m49018(f2, f, (c11830.f33024 - f2) * c11830.m14830(), c11830.m14830()), imageView);
        C13045.m29867(arrayList, "<this>");
        if (i2 >= 0 && i2 < arrayList.size()) {
            Object obj2 = arrayList.get(i2);
            C13045.m29865(obj2, "get(...)");
            ImageView imageView2 = (ImageView) obj2;
            C7806.m18077((int) (((c11830.f33024 - f2) * c11830.m14830() * f) + c11830.m14830()), imageView2);
            Drawable background = imageView.getBackground();
            C13045.m29862((Object) background, "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
            C5124 c5124 = (C5124) background;
            Drawable background2 = imageView2.getBackground();
            C13045.m29862((Object) background2, "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
            C5124 c5125 = (C5124) background2;
            if (c11830.m27127() != c11830.m14829()) {
                Object objEvaluate = c11830.f33020.evaluate(f, Integer.valueOf(c11830.m27127()), Integer.valueOf(c11830.m14829()));
                C13045.m29862(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) objEvaluate).intValue();
                Object objEvaluate2 = c11830.f33020.evaluate(f, Integer.valueOf(c11830.m14829()), Integer.valueOf(c11830.m27127()));
                C13045.m29862(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                c5125.setColor(((Integer) objEvaluate2).intValue());
                if (c11830.f33021) {
                    InterfaceC23229 interfaceC23229M14833 = c11830.m14833();
                    C13045.m29861(interfaceC23229M14833);
                    if (i <= ((C22085) interfaceC23229M14833).m49709()) {
                        c5124.setColor(c11830.m27127());
                    } else {
                        c5124.setColor(iIntValue);
                    }
                } else {
                    c5124.setColor(iIntValue);
                }
            }
        }
        c11830.invalidate();
    }

    @Override // p067l.AbstractC13171
    /* JADX INFO: renamed from: ֫ */
    public final void mo29215(int i) {
        C11830 c11830 = this.f39112;
        if (i >= c11830.f16715.size()) {
            return;
        }
        Object obj = c11830.f16715.get(i);
        C13045.m29865(obj, "get(...)");
        C7806.m18077((int) c11830.m14830(), (View) obj);
        c11830.mo14826(i);
    }

    @Override // p067l.AbstractC13171
    /* JADX INFO: renamed from: ֫ */
    public final int mo29214() {
        return this.f39112.f16715.size();
    }
}
