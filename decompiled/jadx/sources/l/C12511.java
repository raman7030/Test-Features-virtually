package l;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۫ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAIY */
/* JADX INFO: loaded from: classes3.dex */
public final class C12511 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f37580;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f37581;

    public C12511(String str, String str2) {
        this.f37581 = str;
        this.f37580 = str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m30693() {
        if (TextUtils.isEmpty(this.f37580)) {
            return this.f37581;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f37580);
        sb.append(" (");
        SpannableString spannableString = new SpannableString(C9045.m23341(sb, this.f37581, MotionUtils.EASING_TYPE_FORMAT_END));
        spannableString.setSpan(new ForegroundColorSpan(C21943.f70269), this.f37580.length(), spannableString.length(), 17);
        return spannableString;
    }
}
