package p067l;

import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.ۙܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AST */
/* JADX INFO: loaded from: classes3.dex */
public final class C6832 extends AbstractC5050 {

    /* JADX INFO: renamed from: ۧ */
    public static final C6832 f17756 = new C6832(6);

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ֫ */
    public final int mo10772(Object obj) {
        C23596 c23596 = (C23596) obj;
        return c23596.f75120.hashCode() + ((((c23596.f75119.f76895 + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31) + c23596.f75116) * 31);
    }

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10776(Object obj, Object obj2) {
        C23596 c23596 = (C23596) obj;
        C23596 c23597 = (C23596) obj2;
        if (c23596 == c23597) {
            return true;
        }
        return c23597 != null && c23596.f75119.f76895 == c23597.f75119.f76895 && c23596.f75116 == c23597.f75116 && c23596.f75120.equals(c23597.f75120);
    }
}
