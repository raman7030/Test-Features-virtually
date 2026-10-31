package l;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.ܺܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C15982 extends C13876 {

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21628 f49326;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15982(ViewOnClickListenerC21628 viewOnClickListenerC21628, Drawable[] drawableArr) {
        super(drawableArr);
        this.f49326 = viewOnClickListenerC21628;
    }

    @Override // l.C13876
    /* JADX INFO: renamed from: ֫ */
    public final void mo33251() {
        super.mo33251();
        this.f49326.m48879(false);
    }

    @Override // l.C13876
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo33277(String str) {
        return this.f49326.f69423 || !str.endsWith("/type-info");
    }

    @Override // l.C13876
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo33249(String str, String str2, boolean z) {
        int iM44843;
        if (!z) {
            int iIndexOf = str.indexOf(47);
            ViewOnClickListenerC21628 viewOnClickListenerC21628 = this.f49326;
            if (iIndexOf == -1) {
                iM44843 = viewOnClickListenerC21628.f69432.m44817(-1, str);
            } else {
                iM44843 = viewOnClickListenerC21628.f69432.m44843(str);
            }
            if (iM44843 != -1) {
                SpannableString spannableString = new SpannableString(String.format("%s [%02X]", str2, Integer.valueOf(iM44843)));
                int length = spannableString.length() - 4;
                int length2 = spannableString.length();
                spannableString.setSpan(new ForegroundColorSpan(C21943.f70284 & (-2130706433)), length, length2, 33);
                spannableString.setSpan(new RelativeSizeSpan(0.7f), length, length2, 33);
                return spannableString;
            }
        }
        return str2;
    }
}
