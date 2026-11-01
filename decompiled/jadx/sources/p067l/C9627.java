package p067l;

import android.text.SpannableString;
import android.text.TextUtils;
import java.util.Comparator;

/* JADX INFO: renamed from: l.۟ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63D */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9627 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f26506;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f26506) {
            case 0:
                C23198 c23198 = (C23198) obj;
                C23198 c23199 = (C23198) obj2;
                int iCompare = Integer.compare(c23198.f72882, c23199.f72882);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Integer.compare(c23199.f72881, c23198.f72881);
                return iCompare2 != 0 ? iCompare2 : c23198.f72883.compareTo(c23199.f72883);
            case 1:
                C24288 c24288 = (C24288) obj;
                C24288 c24289 = (C24288) obj2;
                long j = c24288.f76934;
                long j2 = c24289.f76934;
                if (j - j2 == 0) {
                    return c24288.compareTo(c24289);
                }
                return j < j2 ? -1 : 1;
            default:
                SpannableString spannableString = (SpannableString) obj;
                SpannableString spannableString2 = (SpannableString) obj2;
                boolean z = TextUtils.indexOf(spannableString, "android:") == 1;
                if (z == (TextUtils.indexOf(spannableString2, "android:") == 1)) {
                    return spannableString.toString().compareTo(spannableString2.toString());
                }
                return z ? 1 : -1;
        }
    }
}
