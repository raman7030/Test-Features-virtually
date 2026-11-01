package p067l;

import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import bin.p000mt.plus.Features;

/* JADX INFO: renamed from: l.ܽۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4NY */
/* JADX INFO: loaded from: classes4.dex */
public final class C18028 {

    /* JADX INFO: renamed from: ֫ */
    public final String f53837;

    /* JADX INFO: renamed from: ۧ */
    public final int f53838;

    /* JADX INFO: renamed from: ܳ */
    public final String f53839;

    /* JADX INFO: renamed from: ܽ */
    public final int f53840;

    /* JADX INFO: renamed from: ܿ */
    public String f53841;

    /* JADX INFO: renamed from: ᩳ */
    public final int f53842;

    public C18028(C19136 c19136) {
        this(c19136.m43535(), c19136.m43529(), c19136.m43527());
    }

    public C18028(int i, String str, String str2) {
        this.f53842 = i;
        this.f53839 = str;
        this.f53837 = str2;
        this.f53840 = -1;
        this.f53838 = -1;
    }

    public C18028(int i, int i2, int i3) {
        this.f53842 = i;
        this.f53839 = Features.m54(i2);
        this.f53837 = Features.m54(i3);
        this.f53840 = i2;
        this.f53838 = i3;
    }

    public C18028(String str, int i, String str2, int i2, int i3) {
        this.f53842 = i;
        this.f53839 = str;
        this.f53837 = str2;
        this.f53840 = i2;
        this.f53838 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18028 m41060(int i) {
        return new C18028(this.f53839, (this.f53842 & 61440) | (i & 4095), this.f53837, this.f53840, this.f53838);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m41068() {
        return this.f53842;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m41063() {
        return this.f53839;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m41059() {
        return this.f53837;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m41066() {
        return this.f53840;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m41064() {
        return this.f53838;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m41069() {
        return this.f53842 & 4095;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m41065() {
        String str = this.f53841;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(10);
        int i = this.f53842;
        if ((61440 & i) != 0) {
            sb.append(C12710.m29221(i));
        }
        sb.append(C12710.m29225(i));
        String string = sb.toString();
        this.f53841 = string;
        return string;
    }

    /* JADX INFO: renamed from: ܿ */
    public final SpannableString m41067() {
        StringBuilder sb = new StringBuilder(m41065());
        sb.append('(');
        String octalString = Integer.toOctalString(this.f53842 & 4095);
        while (octalString.length() < 3) {
            octalString = "0".concat(octalString);
        }
        sb.append(octalString);
        sb.append(')');
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new ScaleXSpan(0.95f), 0, spannableString.length(), 17);
        return spannableString;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18028 m41061(int i, int i2) {
        return new C18028(this.f53842, i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18028 m41062(String str, String str2) {
        return new C18028(this.f53842, str, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == C18028.class) {
            C18028 c18028 = (C18028) obj;
            if (this.f53842 == c18028.f53842 && C12826.equals(this.f53839, c18028.f53839) && C12826.equals(this.f53837, c18028.f53837)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(Integer.valueOf(this.f53842), this.f53839, this.f53837);
    }
}
