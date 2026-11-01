package p067l;

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
public final class C20374 {

    /* JADX INFO: renamed from: ֫ */
    public int f62979;

    /* JADX INFO: renamed from: ۜ */
    public int f62980;

    /* JADX INFO: renamed from: ۧ */
    public int f62981;

    /* JADX INFO: renamed from: ܿ */
    public int f62984;

    /* JADX INFO: renamed from: ᩻ */
    public int f62986;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f62985 = new ArrayList();

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f62982 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public final StringBuilder f62983 = new StringBuilder();

    public C20374(int i, int i2) {
        m45994(i);
        this.f62981 = i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45994(int i) {
        this.f62979 = i;
        this.f62985.clear();
        this.f62982.clear();
        this.f62983.setLength(0);
        this.f62986 = 15;
        this.f62984 = 0;
        this.f62980 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m45995() {
        return this.f62985.isEmpty() && this.f62982.isEmpty() && this.f62983.length() == 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m45997(int i) {
        this.f62979 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m45998(int i) {
        this.f62981 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45993(int i, boolean z) {
        this.f62985.add(new C6292(i, this.f62983.length(), z));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45991() {
        C6292 c6292;
        int i;
        StringBuilder sb = this.f62983;
        int length = sb.length();
        if (length <= 0) {
            return;
        }
        sb.delete(length - 1, length);
        ArrayList arrayList = this.f62985;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || (i = (c6292 = (C6292) arrayList.get(size)).f15901) != length) {
                return;
            } else {
                c6292.f15901 = i - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45992(char c) {
        StringBuilder sb = this.f62983;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m45996() {
        SpannableString spannableStringM45989 = m45989();
        ArrayList arrayList = this.f62982;
        arrayList.add(spannableStringM45989);
        this.f62983.setLength(0);
        this.f62985.clear();
        int iMin = Math.min(this.f62981, this.f62986);
        while (arrayList.size() >= iMin) {
            arrayList.remove(0);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21196 m45990(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f62982;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) m45989());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.f62984 + this.f62980;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        if (i == Integer.MIN_VALUE) {
            if (this.f62979 != 2 || (Math.abs(i4) >= 3 && length >= 0)) {
                i = (this.f62979 != 2 || i4 <= 0) ? 0 : 2;
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
        int i5 = this.f62986;
        if (i5 > 7) {
            i5 -= 17;
        } else if (this.f62979 == 1) {
            i5 -= this.f62981 - 1;
        }
        C23207 c23207 = new C23207();
        c23207.m51726(spannableStringBuilder);
        c23207.m51731(Layout.Alignment.ALIGN_NORMAL);
        c23207.m51722(i5, 1);
        c23207.m51728(f);
        c23207.m51730(i);
        return c23207.m51720();
    }

    /* JADX INFO: renamed from: ᩳ */
    private SpannableString m45989() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f62983);
        int length = spannableStringBuilder.length();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f62985;
            if (i >= arrayList.size()) {
                break;
            }
            C6292 c6292 = (C6292) arrayList.get(i);
            boolean z2 = c6292.f15903;
            int i7 = c6292.f15902;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i6 = C21045.f66037[i7];
                }
                z = z3;
            }
            int i8 = c6292.f15901;
            i++;
            if (i8 != (i < arrayList.size() ? ((C6292) arrayList.get(i)).f15901 : length)) {
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
