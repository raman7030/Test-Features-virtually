package l;

import android.text.SpannableString;
import android.text.TextUtils;
import java.util.Comparator;

/* JADX INFO: renamed from: l.۟ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63D */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7637 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23593;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f23593) {
            case 0:
                C21916 c21916 = (C21916) obj;
                C21916 c21917 = (C21916) obj2;
                int iCompare = Integer.compare(c21916.f70168, c21917.f70168);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Integer.compare(c21917.f70167, c21916.f70167);
                return iCompare2 != 0 ? iCompare2 : c21916.f70169.compareTo(c21917.f70169);
            case 1:
                C23064 c23064 = (C23064) obj;
                C23064 c23065 = (C23064) obj2;
                long j = c23064.f74189;
                long j2 = c23065.f74189;
                if (j - j2 == 0) {
                    return c23064.compareTo(c23065);
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
