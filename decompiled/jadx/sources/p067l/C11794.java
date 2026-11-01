package p067l;

import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۢ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11794 extends C11691 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C11123 f32948;

    public C11794(C11123 c11123) {
        this.f32948 = c11123;
    }

    @Override // p067l.C11691, p067l.InterfaceC22420
    /* JADX INFO: renamed from: ֫ */
    public final void mo26857(View view, String str) {
        C11123 c11123 = this.f32948;
        if (c11123.f30843 == null || !c11123.f30843.mo11428(view, str)) {
            if (str.startsWith("#")) {
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    ViewParent parent = view.getParent();
                    if (parent instanceof ScrollView) {
                        ScrollView scrollView = (ScrollView) parent;
                        int iMo26852 = c11123.f30844.mo26852(-1, String.valueOf(str.substring(1)).toLowerCase().replaceAll("[^\\p{L}\\p{N}]+", "-"));
                        if (iMo26852 >= 0) {
                            scrollView.smoothScrollTo(0, textView.getLayout().getLineTop(textView.getLayout().getLineForOffset(iMo26852)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            super.mo26857(view, str);
        }
    }
}
