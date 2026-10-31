package l;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8QH */
/* JADX INFO: loaded from: classes4.dex */
public final class C18945 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f59749;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f59750;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f59751;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f59754;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f59756;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f59755 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f59752 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f59753 = new StringBuilder();

    public C18945(int i, int i2) {
        m43727(i);
        this.f59751 = i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43727(int i) {
        this.f59749 = i;
        this.f59755.clear();
        this.f59752.clear();
        this.f59753.setLength(0);
        this.f59756 = 15;
        this.f59754 = 0;
        this.f59750 = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43728() {
        return this.f59755.isEmpty() && this.f59752.isEmpty() && this.f59753.length() == 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43730(int i) {
        this.f59749 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m43731(int i) {
        this.f59751 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43726(int i, boolean z) {
        this.f59755.add(new C4128(i, this.f59753.length(), z));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43724() {
        C4128 c4128;
        int i;
        StringBuilder sb = this.f59753;
        int length = sb.length();
        if (length <= 0) {
            return;
        }
        sb.delete(length - 1, length);
        ArrayList arrayList = this.f59755;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || (i = (c4128 = (C4128) arrayList.get(size)).f13087) != length) {
                return;
            } else {
                c4128.f13087 = i - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43725(char c) {
        StringBuilder sb = this.f59753;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43729() {
        SpannableString spannableStringM43722 = m43722();
        ArrayList arrayList = this.f59752;
        arrayList.add(spannableStringM43722);
        this.f59753.setLength(0);
        this.f59755.clear();
        int iMin = Math.min(this.f59751, this.f59756);
        while (arrayList.size() >= iMin) {
            arrayList.remove(0);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19811 m43723(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f59752;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) m43722());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.f59754 + this.f59750;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        if (i == Integer.MIN_VALUE) {
            if (this.f59749 != 2 || (Math.abs(i4) >= 3 && length >= 0)) {
                i = (this.f59749 != 2 || i4 <= 0) ? 0 : 2;
            } else {
                i = 1;
            }
        }
        if (i != 1) {
            if (i == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i5 = this.f59756;
        if (i5 > 7) {
            i5 -= 17;
        } else if (this.f59749 == 1) {
            i5 -= this.f59751 - 1;
        }
        C21927 c21927 = new C21927();
        c21927.m49389(spannableStringBuilder);
        c21927.m49394(Layout.Alignment.ALIGN_NORMAL);
        c21927.m49385(i5, 1);
        c21927.m49391(f);
        c21927.m49393(i);
        return c21927.m49383();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private SpannableString m43722() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f59753);
        int length = spannableStringBuilder.length();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f59755;
            if (i >= arrayList.size()) {
                break;
            }
            C4128 c4128 = (C4128) arrayList.get(i);
            boolean z2 = c4128.f13089;
            int i7 = c4128.f13088;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i6 = C19651.f63414[i7];
                }
                z = z3;
            }
            int i8 = c4128.f13087;
            i++;
            if (i8 != (i < arrayList.size() ? ((C4128) arrayList.get(i)).f13087 : length)) {
                if (i2 != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z2) {
                    i2 = i8;
                }
                if (i3 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i3, i8, 33);
                    i3 = -1;
                } else if (i3 == -1 && z) {
                    i3 = i8;
                }
                if (i6 != i5) {
                    if (i5 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, i8, 33);
                    }
                    i5 = i6;
                    i4 = i8;
                }
            }
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
        }
        if (i3 != -1 && i3 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i3, length, 33);
        }
        if (i4 != length && i5 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }
}
