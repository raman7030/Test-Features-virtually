package l;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.ۖۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2518 extends SpannableString implements CharSequence, Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f7992;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19287 f7993;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f7994;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        String str = ((C2518) obj).f7994;
        String str2 = this.f7994;
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

    public C2518(String str, String str2, C19287 c19287) {
        super(C3200.m9831(c19287.f60684, "]", C7166.m19190(str2, " [line: ")));
        int length = str2.length() + 1;
        int length2 = length();
        setSpan(new ForegroundColorSpan(C21943.f70284 & (-2130706433)), length, length2, 33);
        setSpan(new RelativeSizeSpan(0.7f), length, length2, 33);
        this.f7994 = str;
        this.f7992 = str2;
        this.f7993 = c19287;
    }
}
