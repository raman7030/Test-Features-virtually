package p067l;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8UR */
/* JADX INFO: loaded from: classes2.dex */
public final class C3609 {

    /* JADX INFO: renamed from: ۗ */
    public static final int[] f7447;

    /* JADX INFO: renamed from: ۙ */
    public static final int[] f7448;

    /* JADX INFO: renamed from: ۛ */
    public static final int[] f7449;

    /* JADX INFO: renamed from: ۤ */
    public static final int[] f7450;

    /* JADX INFO: renamed from: ۨ */
    public static final boolean[] f7451;

    /* JADX INFO: renamed from: ۫ */
    public static final int[] f7452;

    /* JADX INFO: renamed from: ۬ */
    public static final int[] f7453;

    /* JADX INFO: renamed from: ᩶ */
    public static final int[] f7454;

    /* JADX INFO: renamed from: ᩸ */
    public static final int f7455;

    /* JADX INFO: renamed from: ᩹ */
    public static final int f7456 = m6762(2, 2, 2, 0);

    /* JADX INFO: renamed from: ֡ */
    public int f7457;

    /* JADX INFO: renamed from: ֨ */
    public boolean f7458;

    /* JADX INFO: renamed from: ֫ */
    public int f7459;

    /* JADX INFO: renamed from: ۖ */
    public boolean f7460;

    /* JADX INFO: renamed from: ۚ */
    public int f7462;

    /* JADX INFO: renamed from: ۜ */
    public int f7463;

    /* JADX INFO: renamed from: ۠ */
    public int f7464;

    /* JADX INFO: renamed from: ۡ */
    public int f7465;

    /* JADX INFO: renamed from: ۢ */
    public int f7466;

    /* JADX INFO: renamed from: ۧ */
    public int f7467;

    /* JADX INFO: renamed from: ܳ */
    public int f7468;

    /* JADX INFO: renamed from: ܶ */
    public int f7469;

    /* JADX INFO: renamed from: ܺ */
    public int f7470;

    /* JADX INFO: renamed from: ܽ */
    public int f7471;

    /* JADX INFO: renamed from: ܿ */
    public boolean f7472;

    /* JADX INFO: renamed from: ᩴ */
    public int f7474;

    /* JADX INFO: renamed from: ᩵ */
    public int f7475;

    /* JADX INFO: renamed from: ᩷ */
    public int f7476;

    /* JADX INFO: renamed from: ᩻ */
    public int f7477;

    /* JADX INFO: renamed from: ۘ */
    public final ArrayList f7461 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ */
    public final SpannableStringBuilder f7473 = new SpannableStringBuilder();

    static {
        int iM6762 = m6762(0, 0, 0, 0);
        f7455 = iM6762;
        int iM6763 = m6762(0, 0, 0, 3);
        f7452 = new int[]{0, 0, 0, 0, 0, 2, 0};
        f7450 = new int[]{0, 0, 0, 0, 0, 0, 2};
        f7449 = new int[]{3, 3, 3, 3, 3, 3, 1};
        f7451 = new boolean[]{false, false, false, true, true, true, false};
        f7453 = new int[]{iM6762, iM6763, iM6762, iM6762, iM6763, iM6762, iM6762};
        f7447 = new int[]{0, 1, 2, 3, 4, 3, 4};
        f7448 = new int[]{0, 0, 0, 0, 0, 3, 3};
        f7454 = new int[]{iM6762, iM6762, iM6762, iM6762, iM6762, iM6763, iM6763};
    }

    public C3609() {
        m6770();
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m6770() {
        m6776();
        this.f7472 = false;
        this.f7458 = false;
        this.f7470 = 4;
        this.f7460 = false;
        this.f7462 = 0;
        this.f7463 = 0;
        this.f7459 = 0;
        this.f7475 = 15;
        this.f7466 = 0;
        this.f7469 = 0;
        this.f7465 = 0;
        int i = f7455;
        this.f7464 = i;
        this.f7468 = f7456;
        this.f7467 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m6776() {
        this.f7461.clear();
        this.f7473.clear();
        this.f7476 = -1;
        this.f7457 = -1;
        this.f7477 = -1;
        this.f7471 = -1;
        this.f7474 = 0;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m6773() {
        if (this.f7472) {
            return this.f7461.isEmpty() && this.f7473.length() == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m6775() {
        return this.f7472;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6767(boolean z) {
        this.f7458 = z;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m6777() {
        return this.f7458;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6768(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f7472 = true;
        this.f7458 = z;
        this.f7470 = i;
        this.f7460 = z2;
        this.f7462 = i2;
        this.f7463 = i3;
        this.f7459 = i5;
        int i8 = i4 + 1;
        if (this.f7475 != i8) {
            this.f7475 = i8;
            while (true) {
                ArrayList arrayList = this.f7461;
                if (arrayList.size() < this.f7475 && arrayList.size() < 15) {
                    break;
                } else {
                    arrayList.remove(0);
                }
            }
        }
        if (i6 != 0 && this.f7469 != i6) {
            this.f7469 = i6;
            int i9 = i6 - 1;
            int i10 = f7453[i9];
            boolean z3 = f7451[i9];
            int i11 = f7450[i9];
            int i12 = f7449[i9];
            int i13 = f7452[i9];
            this.f7464 = i10;
            this.f7466 = i13;
        }
        if (i7 == 0 || this.f7465 == i7) {
            return;
        }
        this.f7465 = i7;
        int i14 = i7 - 1;
        int i15 = f7448[i14];
        int i16 = f7447[i14];
        m6769(false, false);
        m6766(f7456, f7454[i14]);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6772(int i, int i2) {
        this.f7464 = i;
        this.f7466 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6769(boolean z, boolean z2) {
        int i = this.f7476;
        SpannableStringBuilder spannableStringBuilder = this.f7473;
        if (i != -1) {
            if (!z) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7476, spannableStringBuilder.length(), 33);
                this.f7476 = -1;
            }
        } else if (z) {
            this.f7476 = spannableStringBuilder.length();
        }
        if (this.f7457 == -1) {
            if (z2) {
                this.f7457 = spannableStringBuilder.length();
            }
        } else {
            if (z2) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7457, spannableStringBuilder.length(), 33);
            this.f7457 = -1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6766(int i, int i2) {
        int i3 = this.f7477;
        SpannableStringBuilder spannableStringBuilder = this.f7473;
        if (i3 != -1 && this.f7468 != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7468), this.f7477, spannableStringBuilder.length(), 33);
        }
        if (i != f7456) {
            this.f7477 = spannableStringBuilder.length();
            this.f7468 = i;
        }
        if (this.f7471 != -1 && this.f7467 != i2) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7467), this.f7471, spannableStringBuilder.length(), 33);
        }
        if (i2 != f7455) {
            this.f7471 = spannableStringBuilder.length();
            this.f7467 = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6765(int i) {
        if (this.f7474 != i) {
            m6764('\n');
        }
        this.f7474 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6763() {
        SpannableStringBuilder spannableStringBuilder = this.f7473;
        int length = spannableStringBuilder.length();
        if (length > 0) {
            spannableStringBuilder.delete(length - 1, length);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6764(char c) {
        SpannableStringBuilder spannableStringBuilder = this.f7473;
        if (c == '\n') {
            SpannableString spannableStringM6774 = m6774();
            ArrayList arrayList = this.f7461;
            arrayList.add(spannableStringM6774);
            spannableStringBuilder.clear();
            if (this.f7476 != -1) {
                this.f7476 = 0;
            }
            if (this.f7457 != -1) {
                this.f7457 = 0;
            }
            if (this.f7477 != -1) {
                this.f7477 = 0;
            }
            if (this.f7471 != -1) {
                this.f7471 = 0;
            }
            while (true) {
                if (arrayList.size() >= this.f7475 || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
                    this.f7474 = arrayList.size();
                    return;
                }
            }
        } else {
            spannableStringBuilder.append(c);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final SpannableString m6774() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7473);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f7476 != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7476, length, 33);
            }
            if (this.f7457 != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7457, length, 33);
            }
            if (this.f7477 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7468), this.f7477, length, 33);
            }
            if (this.f7471 != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7467), this.f7471, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C7633 m6771() {
        Layout.Alignment alignment;
        float f;
        float f2;
        int i;
        if (m6773()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f7461;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) m6774());
        int i3 = this.f7466;
        int i4 = 1;
        if (i3 == 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i3 == 1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i3 != 2) {
            if (i3 != 3) {
                throw new IllegalArgumentException("Unexpected justification value: " + this.f7466);
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        if (this.f7460) {
            f = this.f7463 / 99.0f;
            f2 = this.f7462 / 99.0f;
        } else {
            f = this.f7463 / 209.0f;
            f2 = this.f7462 / 74.0f;
        }
        float f3 = (f * 0.9f) + 0.05f;
        float f4 = (f2 * 0.9f) + 0.05f;
        int i5 = this.f7459;
        int i6 = i5 / 3;
        if (i6 == 0) {
            i4 = 0;
        } else if (i6 != 1) {
            i4 = 2;
        }
        int i7 = i5 % 3;
        if (i7 == 0) {
            i = 0;
        } else {
            i = i7 == 1 ? 1 : 2;
        }
        int i8 = this.f7464;
        return new C7633(spannableStringBuilder, alignment2, f4, i4, f3, i, i8 != f7455, i8, this.f7470);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX INFO: renamed from: ֫ */
    public static int m6762(int i, int i2, int i3, int i4) {
        int i5;
        C23877.m52953(i, 4);
        C23877.m52953(i2, 4);
        C23877.m52953(i3, 4);
        C23877.m52953(i4, 4);
        if (i4 == 0 || i4 == 1) {
            i5 = 255;
        } else if (i4 == 2) {
            i5 = 127;
        } else if (i4 != 3) {
            i5 = 255;
        } else {
            i5 = 0;
        }
        return Color.argb(i5, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 <= 1 ? 0 : 255);
    }
}
