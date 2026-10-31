package l;

import com.google.android.material.slider.BasicLabelFormatter;

/* JADX INFO: renamed from: l.ܰܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes3.dex */
public final class C13963 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f41670;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f41671;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f41672;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f41673 = new StringBuilder();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33413(int i, CharSequence charSequence) throws C1886 {
        int length = charSequence.length();
        StringBuilder sb = this.f41673;
        if (length > BasicLabelFormatter.MILLION - sb.length()) {
            throw new C1886();
        }
        for (int i2 = 0; i2 <= charSequence.length(); i2++) {
            if (i2 == i) {
                this.f41672 = this.f41670;
            }
            if (i2 == charSequence.length()) {
                return;
            }
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt == '\n' && this.f41671) {
                this.f41671 = false;
            } else {
                boolean z = cCharAt == '\r';
                this.f41671 = z;
                if (z) {
                    cCharAt = '\n';
                }
                if (cCharAt == '\n') {
                    int i3 = this.f41670 + 1;
                    this.f41670 = i3;
                    if (i3 >= 20000) {
                        throw new C1886();
                    }
                }
                sb.append(cCharAt);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m33412() {
        return this.f41672;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m33414() {
        return this.f41673.toString();
    }
}
