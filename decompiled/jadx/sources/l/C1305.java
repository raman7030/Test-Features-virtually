package l;

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
public final class C1305 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final int[] f4676;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f4677;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int[] f4678;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f4679;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final boolean[] f4680;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int[] f4681;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int[] f4682;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int[] f4683;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int f4684;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final int f4685 = m4530(2, 2, 2, 0);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f4686;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f4687;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f4688;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f4689;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f4691;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f4692;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f4693;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f4694;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f4695;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4696;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f4697;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f4698;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f4699;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f4700;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f4701;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f4703;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f4704;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f4705;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f4706;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f4690 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder f4702 = new SpannableStringBuilder();

    static {
        int iM4530 = m4530(0, 0, 0, 0);
        f4684 = iM4530;
        int iM4531 = m4530(0, 0, 0, 3);
        f4681 = new int[]{0, 0, 0, 0, 0, 2, 0};
        f4679 = new int[]{0, 0, 0, 0, 0, 0, 2};
        f4678 = new int[]{3, 3, 3, 3, 3, 3, 1};
        f4680 = new boolean[]{false, false, false, true, true, true, false};
        f4682 = new int[]{iM4530, iM4531, iM4530, iM4530, iM4531, iM4530, iM4530};
        f4676 = new int[]{0, 1, 2, 3, 4, 3, 4};
        f4677 = new int[]{0, 0, 0, 0, 0, 3, 3};
        f4683 = new int[]{iM4530, iM4530, iM4530, iM4530, iM4530, iM4531, iM4531};
    }

    public C1305() {
        m4538();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m4538() {
        m4544();
        this.f4701 = false;
        this.f4687 = false;
        this.f4699 = 4;
        this.f4689 = false;
        this.f4691 = 0;
        this.f4692 = 0;
        this.f4688 = 0;
        this.f4704 = 15;
        this.f4695 = 0;
        this.f4698 = 0;
        this.f4694 = 0;
        int i = f4684;
        this.f4693 = i;
        this.f4697 = f4685;
        this.f4696 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m4544() {
        this.f4690.clear();
        this.f4702.clear();
        this.f4705 = -1;
        this.f4686 = -1;
        this.f4706 = -1;
        this.f4700 = -1;
        this.f4703 = 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m4541() {
        if (this.f4701) {
            return this.f4690.isEmpty() && this.f4702.length() == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m4543() {
        return this.f4701;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4535(boolean z) {
        this.f4687 = z;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m4545() {
        return this.f4687;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4536(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f4701 = true;
        this.f4687 = z;
        this.f4699 = i;
        this.f4689 = z2;
        this.f4691 = i2;
        this.f4692 = i3;
        this.f4688 = i5;
        int i8 = i4 + 1;
        if (this.f4704 != i8) {
            this.f4704 = i8;
            while (true) {
                ArrayList arrayList = this.f4690;
                if (arrayList.size() < this.f4704 && arrayList.size() < 15) {
                    break;
                } else {
                    arrayList.remove(0);
                }
            }
        }
        if (i6 != 0 && this.f4698 != i6) {
            this.f4698 = i6;
            int i9 = i6 - 1;
            int i10 = f4682[i9];
            boolean z3 = f4680[i9];
            int i11 = f4679[i9];
            int i12 = f4678[i9];
            int i13 = f4681[i9];
            this.f4693 = i10;
            this.f4695 = i13;
        }
        if (i7 == 0 || this.f4694 == i7) {
            return;
        }
        this.f4694 = i7;
        int i14 = i7 - 1;
        int i15 = f4677[i14];
        int i16 = f4676[i14];
        m4537(false, false);
        m4534(f4685, f4683[i14]);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4540(int i, int i2) {
        this.f4693 = i;
        this.f4695 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4537(boolean z, boolean z2) {
        int i = this.f4705;
        SpannableStringBuilder spannableStringBuilder = this.f4702;
        if (i != -1) {
            if (!z) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f4705, spannableStringBuilder.length(), 33);
                this.f4705 = -1;
            }
        } else if (z) {
            this.f4705 = spannableStringBuilder.length();
        }
        if (this.f4686 == -1) {
            if (z2) {
                this.f4686 = spannableStringBuilder.length();
            }
        } else {
            if (z2) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f4686, spannableStringBuilder.length(), 33);
            this.f4686 = -1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4534(int i, int i2) {
        int i3 = this.f4706;
        SpannableStringBuilder spannableStringBuilder = this.f4702;
        if (i3 != -1 && this.f4697 != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f4697), this.f4706, spannableStringBuilder.length(), 33);
        }
        if (i != f4685) {
            this.f4706 = spannableStringBuilder.length();
            this.f4697 = i;
        }
        if (this.f4700 != -1 && this.f4696 != i2) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f4696), this.f4700, spannableStringBuilder.length(), 33);
        }
        if (i2 != f4684) {
            this.f4700 = spannableStringBuilder.length();
            this.f4696 = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4533(int i) {
        if (this.f4703 != i) {
            m4532('\n');
        }
        this.f4703 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4531() {
        SpannableStringBuilder spannableStringBuilder = this.f4702;
        int length = spannableStringBuilder.length();
        if (length > 0) {
            spannableStringBuilder.delete(length - 1, length);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4532(char c) {
        SpannableStringBuilder spannableStringBuilder = this.f4702;
        if (c == '\n') {
            SpannableString spannableStringM4542 = m4542();
            ArrayList arrayList = this.f4690;
            arrayList.add(spannableStringM4542);
            spannableStringBuilder.clear();
            if (this.f4705 != -1) {
                this.f4705 = 0;
            }
            if (this.f4686 != -1) {
                this.f4686 = 0;
            }
            if (this.f4706 != -1) {
                this.f4706 = 0;
            }
            if (this.f4700 != -1) {
                this.f4700 = 0;
            }
            while (true) {
                if (arrayList.size() >= this.f4704 || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
                    this.f4703 = arrayList.size();
                    return;
                }
            }
        } else {
            spannableStringBuilder.append(c);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SpannableString m4542() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f4702);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f4705 != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f4705, length, 33);
            }
            if (this.f4686 != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f4686, length, 33);
            }
            if (this.f4706 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f4697), this.f4706, length, 33);
            }
            if (this.f4700 != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f4696), this.f4700, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5539 m4539() {
        Layout.Alignment alignment;
        float f;
        float f2;
        int i;
        if (m4541()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4690;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) m4542());
        int i3 = this.f4695;
        int i4 = 1;
        if (i3 == 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i3 == 1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i3 != 2) {
            if (i3 != 3) {
                throw new IllegalArgumentException("Unexpected justification value: " + this.f4695);
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        if (this.f4689) {
            f = this.f4692 / 99.0f;
            f2 = this.f4691 / 99.0f;
        } else {
            f = this.f4692 / 209.0f;
            f2 = this.f4691 / 74.0f;
        }
        float f3 = (f * 0.9f) + 0.05f;
        float f4 = (f2 * 0.9f) + 0.05f;
        int i5 = this.f4688;
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
        int i8 = this.f4693;
        return new C5539(spannableStringBuilder, alignment2, f4, i4, f3, i, i8 != f4684, i8, this.f4699);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m4530(int i, int i2, int i3, int i4) {
        int i5;
        C22632.m50627(i, 4);
        C22632.m50627(i2, 4);
        C22632.m50627(i3, 4);
        C22632.m50627(i4, 4);
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
