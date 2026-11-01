package p067l;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.ۖۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes2.dex */
public final class C4762 extends SpannableString implements CharSequence, Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public final String f10784;

    /* JADX INFO: renamed from: ᩸ */
    public final C20699 f10785;

    /* JADX INFO: renamed from: ᩹ */
    public final String f10786;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        String str = ((C4762) obj).f10786;
        String str2 = this.f10786;
        if (str2.equalsIgnoreCase(str)) {
            return 0;
        }
        if (str2.equalsIgnoreCase("type-info")) {
            return -1;
        }
        if (str.equalsIgnoreCase("type-info")) {
            return 1;
        }
        return str2.compareToIgnoreCase(str);
    }

    public C4762(String str, String str2, C20699 c20699) {
        super(C5410.m11876(c20699.f63914, "]", C9179.m21133(str2, " [line: ")));
        int length = str2.length() + 1;
        int length2 = length();
        setSpan(new ForegroundColorSpan(C23223.f72995 & (-2130706433)), length, length2, 33);
        setSpan(new RelativeSizeSpan(0.7f), length, length2, 33);
        this.f10786 = str;
        this.f10784 = str2;
        this.f10785 = c20699;
    }
}
