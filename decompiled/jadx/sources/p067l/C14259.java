package p067l;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۫ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAIY */
/* JADX INFO: loaded from: classes3.dex */
public final class C14259 {

    /* JADX INFO: renamed from: ֫ */
    public String f40604;

    /* JADX INFO: renamed from: ۧ */
    public String f40605;

    public C14259(String str, String str2) {
        this.f40605 = str;
        this.f40604 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m32768() {
        if (TextUtils.isEmpty(this.f40604)) {
            return this.f40605;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40604);
        sb.append(" (");
        SpannableString spannableString = new SpannableString(C10965.m25286(sb, this.f40605, MotionUtils.EASING_TYPE_FORMAT_END));
        spannableString.setSpan(new ForegroundColorSpan(C23223.f72980), this.f40604.length(), spannableString.length(), 17);
        return spannableString;
    }
}
