package p067l;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.ܺܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C17558 extends C15556 {

    /* JADX INFO: renamed from: ۡ֫ */
    public final /* synthetic */ ViewOnClickListenerC22924 f52489;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17558(ViewOnClickListenerC22924 viewOnClickListenerC22924, Drawable[] drawableArr) {
        super(drawableArr);
        this.f52489 = viewOnClickListenerC22924;
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ֫ */
    public final void mo35370() {
        super.mo35370();
        this.f52489.m51227(false);
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo35396(String str) {
        return this.f52489.f72126 || !str.endsWith("/type-info");
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo35368(String str, String str2, boolean z) {
        int iM47139;
        if (!z) {
            int iIndexOf = str.indexOf(47);
            ViewOnClickListenerC22924 viewOnClickListenerC22924 = this.f52489;
            if (iIndexOf == -1) {
                iM47139 = viewOnClickListenerC22924.f72135.m47113(-1, str);
            } else {
                iM47139 = viewOnClickListenerC22924.f72135.m47139(str);
            }
            if (iM47139 != -1) {
                SpannableString spannableString = new SpannableString(String.format("%s [%02X]", str2, Integer.valueOf(iM47139)));
                int length = spannableString.length() - 4;
                int length2 = spannableString.length();
                spannableString.setSpan(new ForegroundColorSpan(C23223.f72995 & (-2130706433)), length, length2, 33);
                spannableString.setSpan(new RelativeSizeSpan(0.7f), length, length2, 33);
                return spannableString;
            }
        }
        return str2;
    }
}
