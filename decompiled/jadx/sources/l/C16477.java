package l;

import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import bin.mt.plus.Features;

/* JADX INFO: renamed from: l.ܽۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4NY */
/* JADX INFO: loaded from: classes4.dex */
public final class C16477 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f50660;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f50661;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f50662;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f50663;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f50664;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f50665;

    public C16477(C17642 c17642) {
        this(c17642.m41289(), c17642.m41283(), c17642.m41281());
    }

    public C16477(int i, String str, String str2) {
        this.f50665 = i;
        this.f50662 = str;
        this.f50660 = str2;
        this.f50663 = -1;
        this.f50661 = -1;
    }

    public C16477(int i, int i2, int i3) {
        this.f50665 = i;
        this.f50662 = Features.m56(i2);
        this.f50660 = Features.m56(i3);
        this.f50663 = i2;
        this.f50661 = i3;
    }

    public C16477(String str, int i, String str2, int i2, int i3) {
        this.f50665 = i;
        this.f50662 = str;
        this.f50660 = str2;
        this.f50663 = i2;
        this.f50661 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16477 m38834(int i) {
        return new C16477(this.f50662, (this.f50665 & 61440) | (i & 4095), this.f50660, this.f50663, this.f50661);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m38842() {
        return this.f50665;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m38837() {
        return this.f50662;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m38833() {
        return this.f50660;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m38840() {
        return this.f50663;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m38838() {
        return this.f50661;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m38843() {
        return this.f50665 & 4095;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m38839() {
        String str = this.f50664;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(10);
        int i = this.f50665;
        if ((61440 & i) != 0) {
            sb.append(C10881.m27176(i));
        }
        sb.append(C10881.m27180(i));
        String string = sb.toString();
        this.f50664 = string;
        return string;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final SpannableString m38841() {
        StringBuilder sb = new StringBuilder(m38839());
        sb.append('(');
        String octalString = Integer.toOctalString(this.f50665 & 4095);
        while (octalString.length() < 3) {
            octalString = "0".concat(octalString);
        }
        sb.append(octalString);
        sb.append(')');
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new ScaleXSpan(0.95f), 0, spannableString.length(), 17);
        return spannableString;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16477 m38835(int i, int i2) {
        return new C16477(this.f50665, i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16477 m38836(String str, String str2) {
        return new C16477(this.f50665, str, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == C16477.class) {
            C16477 c16477 = (C16477) obj;
            if (this.f50665 == c16477.f50665 && C11003.equals(this.f50662, c16477.f50662) && C11003.equals(this.f50660, c16477.f50660)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(Integer.valueOf(this.f50665), this.f50662, this.f50660);
    }
}
