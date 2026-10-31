package l;

import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۢ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9917 extends C9809 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9211 f29990;

    public C9917(C9211 c9211) {
        this.f29990 = c9211;
    }

    @Override // l.C9809, l.InterfaceC21098
    /* JADX INFO: renamed from: ֫ */
    public final void mo24842(View view, String str) {
        C9211 c9211 = this.f29990;
        if (c9211.f27897 == null || !c9211.f27897.mo9386(view, str)) {
            if (str.startsWith("#")) {
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    ViewParent parent = view.getParent();
                    if (parent instanceof ScrollView) {
                        ScrollView scrollView = (ScrollView) parent;
                        int iMo24837 = c9211.f27898.mo24837(-1, String.valueOf(str.substring(1)).toLowerCase().replaceAll("[^\\p{L}\\p{N}]+", "-"));
                        if (iMo24837 >= 0) {
                            scrollView.smoothScrollTo(0, textView.getLayout().getLineTop(textView.getLayout().getLineForOffset(iMo24837)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            super.mo24842(view, str);
        }
    }
}
