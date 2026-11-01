package p067l;

import com.google.android.material.slider.BasicLabelFormatter;

/* JADX INFO: renamed from: l.ܰܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes3.dex */
public final class C15639 {

    /* JADX INFO: renamed from: ֫ */
    public int f44750;

    /* JADX INFO: renamed from: ۧ */
    public boolean f44751;

    /* JADX INFO: renamed from: ܽ */
    public int f44752;

    /* JADX INFO: renamed from: ᩳ */
    public final StringBuilder f44753 = new StringBuilder();

    /* JADX INFO: renamed from: ֫ */
    public final void m35533(int i, CharSequence charSequence) throws C4161 {
        int length = charSequence.length();
        StringBuilder sb = this.f44753;
        if (length > BasicLabelFormatter.MILLION - sb.length()) {
            throw new C4161();
        }
        for (int i2 = 0; i2 <= charSequence.length(); i2++) {
            if (i2 == i) {
                this.f44752 = this.f44750;
            }
            if (i2 == charSequence.length()) {
                return;
            }
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt == '\n' && this.f44751) {
                this.f44751 = false;
            } else {
                boolean z = cCharAt == '\r';
                this.f44751 = z;
                if (z) {
                    cCharAt = '\n';
                }
                if (cCharAt == '\n') {
                    int i3 = this.f44750 + 1;
                    this.f44750 = i3;
                    if (i3 >= 20000) {
                        throw new C4161();
                    }
                }
                sb.append(cCharAt);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m35532() {
        return this.f44752;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m35534() {
        return this.f44753.toString();
    }
}
