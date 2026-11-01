package p067l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.۠۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6RA */
/* JADX INFO: loaded from: classes3.dex */
public final class C10023 implements InterfaceC23987, InterfaceC6670 {

    /* JADX INFO: renamed from: ֡ */
    public boolean f27731;

    /* JADX INFO: renamed from: ֨ */
    public C24158[] f27732;

    /* JADX INFO: renamed from: ۚ */
    public int[] f27739;

    /* JADX INFO: renamed from: ۛ */
    public boolean f27740;

    /* JADX INFO: renamed from: ۜ */
    public int f27741;

    /* JADX INFO: renamed from: ۠ */
    public int f27743;

    /* JADX INFO: renamed from: ۡ */
    public boolean f27744;

    /* JADX INFO: renamed from: ۢ */
    public int[] f27745;

    /* JADX INFO: renamed from: ۤ */
    public boolean f27746;

    /* JADX INFO: renamed from: ۧ */
    public int f27747;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f27748;

    /* JADX INFO: renamed from: ۨ */
    public CharSequence f27749;

    /* JADX INFO: renamed from: ۬ */
    public C13259 f27751;

    /* JADX INFO: renamed from: ܰ */
    public long f27752;

    /* JADX INFO: renamed from: ܶ */
    public int f27754;

    /* JADX INFO: renamed from: ܺ */
    public boolean f27755;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f27757;

    /* JADX INFO: renamed from: ܿ */
    public C3771 f27758;

    /* JADX INFO: renamed from: ᩳ */
    public Runnable f27759;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f27761;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f27762;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f27763;

    /* JADX INFO: renamed from: ᩷ */
    public int f27764;

    /* JADX INFO: renamed from: ᩹ */
    public Map f27766;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f27767;

    /* JADX INFO: renamed from: ܳ */
    public final C7341 f27753 = new C7341(this);

    /* JADX INFO: renamed from: ֫֫ */
    public int f27734 = 2000;

    /* JADX INFO: renamed from: ۟ */
    public boolean f27742 = true;

    /* JADX INFO: renamed from: ᩸ */
    public int f27765 = 1024;

    /* JADX INFO: renamed from: ֫ */
    public int f27733 = 0;

    /* JADX INFO: renamed from: ᩻ */
    public int f27768 = -1;

    /* JADX INFO: renamed from: ۖ */
    public int f27735 = 0;

    /* JADX INFO: renamed from: ۙ */
    public int f27738 = -1;

    /* JADX INFO: renamed from: ۘ */
    public int f27737 = 0;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f27760 = false;

    /* JADX INFO: renamed from: ܽ */
    public boolean f27756 = true;

    /* JADX INFO: renamed from: ۫ */
    public boolean f27750 = false;

    /* JADX INFO: renamed from: ۗ */
    public final C20082 f27736 = new C20082();

    /* JADX INFO: renamed from: ᩶ */
    public final void m23398() {
        this.f27763 = true;
        this.f27754 = 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m23402() {
        return this.f27754;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m23382() {
        return (((long) this.f27738) << 32) | (((long) this.f27735) & 4294967295L);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23356(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) j;
        if (i < -1 || i > this.f27749.length() || i2 < 0 || i2 > this.f27749.length()) {
            throw new IllegalArgumentException("Invalid regex match history");
        }
        this.f27738 = i;
        this.f27735 = i2;
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m23352() {
        if (this.f27763) {
            this.f27754 |= 1;
        }
        return this.f27738;
    }

    /* JADX INFO: renamed from: ۚ */
    public final int m23369() {
        if (this.f27763) {
            int i = this.f27754;
            if ((i & 4) == 0) {
                this.f27754 = i | 2;
            }
        }
        return this.f27735;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m23383(int i) {
        if (this.f27763) {
            this.f27754 |= 4;
        }
        this.f27735 = i;
    }

    public C10023(C13259 c13259, C3771 c3771, CharSequence charSequence) {
        this.f27758 = c3771;
        this.f27751 = c13259;
        this.f27749 = charSequence;
        this.f27745 = new int[Math.max(c3771.f8058, 10) * 2];
        C3771 c3772 = this.f27758;
        this.f27764 = c3772.f8058 * 2;
        this.f27739 = new int[c3772.f8067];
        this.f27732 = new C24158[c3772.f8066];
        m23401();
    }

    @Override // p067l.InterfaceC23987
    public final C13259 pattern() {
        return this.f27751;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫ */
    public final void m23360(C13259 c13259, C3771 c3771) {
        this.f27758 = c3771;
        this.f27751 = c13259;
        this.f27766 = null;
        int iMax = Math.max(c3771.f8058, 10) * 2;
        int[] iArr = new int[iMax];
        this.f27745 = iArr;
        this.f27764 = iMax;
        this.f27739 = new int[this.f27758.f8067];
        int i = 0;
        switch (iMax) {
            case 0:
                break;
            case 1:
                iArr[0] = -1;
                break;
            case 2:
                iArr[0] = -1;
                iArr[1] = -1;
                break;
            case 3:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                break;
            case 4:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                break;
            case 5:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                break;
            case 6:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                break;
            case 7:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                break;
            case 8:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                iArr[7] = -1;
                break;
            default:
                int i2 = 0;
                while (i2 < iMax - 7) {
                    iArr[i2] = -1;
                    iArr[i2 + 1] = -1;
                    iArr[i2 + 2] = -1;
                    iArr[i2 + 3] = -1;
                    iArr[i2 + 4] = -1;
                    iArr[i2 + 5] = -1;
                    iArr[i2 + 6] = -1;
                    iArr[i2 + 7] = -1;
                    i2 += 8;
                }
                while (i2 < iMax) {
                    iArr[i2] = -1;
                    i2++;
                }
                break;
        }
        int[] iArr2 = this.f27739;
        int length = iArr2.length;
        switch (length) {
            case 0:
                break;
            case 1:
                iArr2[0] = -1;
                break;
            case 2:
                iArr2[0] = -1;
                iArr2[1] = -1;
                break;
            case 3:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                break;
            case 4:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                break;
            case 5:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                break;
            case 6:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                iArr2[5] = -1;
                break;
            case 7:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                iArr2[5] = -1;
                iArr2[6] = -1;
                break;
            case 8:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                iArr2[5] = -1;
                iArr2[6] = -1;
                iArr2[7] = -1;
                break;
            default:
                while (i < length - 7) {
                    iArr2[i] = -1;
                    iArr2[i + 1] = -1;
                    iArr2[i + 2] = -1;
                    iArr2[i + 3] = -1;
                    iArr2[i + 4] = -1;
                    iArr2[i + 5] = -1;
                    iArr2[i + 6] = -1;
                    iArr2[i + 7] = -1;
                    i += 8;
                }
                while (i < length) {
                    iArr2[i] = -1;
                    i++;
                }
                break;
        }
        this.f27732 = new C24158[this.f27758.f8066];
        this.f27753.m17020();
        this.f27736.f62172.clear();
    }

    @Override // p067l.InterfaceC23987
    public final CharSequence getText() {
        return this.f27749;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m23401() {
        m23348();
        this.f27741 = 0;
        this.f27757 = this.f27749.length();
    }

    /* JADX INFO: renamed from: ܰ */
    private void m23348() {
        this.f27768 = -1;
        this.f27735 = 0;
        this.f27738 = -1;
        int[] iArr = this.f27745;
        int length = iArr.length;
        switch (length) {
            case 0:
                break;
            case 1:
                iArr[0] = -1;
                break;
            case 2:
                iArr[0] = -1;
                iArr[1] = -1;
                break;
            case 3:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                break;
            case 4:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                break;
            case 5:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                break;
            case 6:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                break;
            case 7:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                break;
            case 8:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                iArr[7] = -1;
                break;
            default:
                int i = 0;
                while (i < length - 7) {
                    iArr[i] = -1;
                    iArr[i + 1] = -1;
                    iArr[i + 2] = -1;
                    iArr[i + 3] = -1;
                    iArr[i + 4] = -1;
                    iArr[i + 5] = -1;
                    iArr[i + 6] = -1;
                    iArr[i + 7] = -1;
                    i += 8;
                }
                while (i < length) {
                    iArr[i] = -1;
                    i++;
                }
                break;
        }
        int[] iArr2 = this.f27739;
        int length2 = iArr2.length;
        switch (length2) {
            case 0:
                break;
            case 1:
                iArr2[0] = -1;
                break;
            case 2:
                iArr2[0] = -1;
                iArr2[1] = -1;
                break;
            case 3:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                break;
            case 4:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                break;
            case 5:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                break;
            case 6:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                iArr2[5] = -1;
                break;
            case 7:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                iArr2[5] = -1;
                iArr2[6] = -1;
                break;
            case 8:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                iArr2[5] = -1;
                iArr2[6] = -1;
                iArr2[7] = -1;
                break;
            default:
                int i2 = 0;
                while (i2 < length2 - 7) {
                    iArr2[i2] = -1;
                    iArr2[i2 + 1] = -1;
                    iArr2[i2 + 2] = -1;
                    iArr2[i2 + 3] = -1;
                    iArr2[i2 + 4] = -1;
                    iArr2[i2 + 5] = -1;
                    iArr2[i2 + 6] = -1;
                    iArr2[i2 + 7] = -1;
                    i2 += 8;
                }
                while (i2 < length2) {
                    iArr2[i2] = -1;
                    i2++;
                }
                break;
        }
        this.f27753.m17020();
        for (C24158 c24158 : this.f27732) {
        }
        this.f27736.f62172.clear();
        this.f27737 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23357(CharSequence charSequence) {
        this.f27749 = charSequence;
        m23401();
    }

    /* JADX INFO: renamed from: ۬ */
    public final int m23381() {
        m23347();
        return this.f27768;
    }

    @Override // p067l.InterfaceC23987
    public final int start(int i) {
        m23347();
        m23350(i);
        return this.f27745[i * 2];
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m23390(String str) {
        return this.f27745[m23353(str) * 2];
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m23386() {
        m23347();
        return this.f27735;
    }

    @Override // p067l.InterfaceC23987
    public final int end(int i) {
        m23347();
        m23350(i);
        return this.f27745[(i * 2) + 1];
    }

    @Override // p067l.InterfaceC23987
    public final String group(int i) {
        int i2;
        m23347();
        m23350(i);
        int[] iArr = this.f27745;
        int i3 = i * 2;
        int i4 = iArr[i3];
        if (i4 == -1 || (i2 = iArr[i3 + 1]) == -1) {
            return null;
        }
        return this.f27749.subSequence(i4, i2).toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m23375(String str) {
        int i;
        int iM23353 = m23353(str);
        int[] iArr = this.f27745;
        int i2 = iM23353 * 2;
        int i3 = iArr[i2];
        if (i3 == -1 || (i = iArr[i2 + 1]) == -1) {
            return null;
        }
        return this.f27749.subSequence(i3, i).toString();
    }

    @Override // p067l.InterfaceC23987
    public final int groupCount() {
        return this.f27758.f8058 - 1;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m23351() {
        return m23363(this.f27741, 1);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m23394() {
        int i = this.f27735;
        if (i == this.f27768) {
            i++;
        }
        int i2 = this.f27741;
        if (i < i2) {
            i = i2;
        }
        if (i > this.f27757) {
            mo23355();
            this.f27731 = false;
            int[] iArr = this.f27745;
            int length = iArr.length;
            switch (length) {
                case 0:
                    break;
                case 1:
                    iArr[0] = -1;
                    break;
                case 2:
                    iArr[0] = -1;
                    iArr[1] = -1;
                    break;
                case 3:
                    iArr[0] = -1;
                    iArr[1] = -1;
                    iArr[2] = -1;
                    break;
                case 4:
                    iArr[0] = -1;
                    iArr[1] = -1;
                    iArr[2] = -1;
                    iArr[3] = -1;
                    break;
                case 5:
                    iArr[0] = -1;
                    iArr[1] = -1;
                    iArr[2] = -1;
                    iArr[3] = -1;
                    iArr[4] = -1;
                    break;
                case 6:
                    iArr[0] = -1;
                    iArr[1] = -1;
                    iArr[2] = -1;
                    iArr[3] = -1;
                    iArr[4] = -1;
                    iArr[5] = -1;
                    break;
                case 7:
                    iArr[0] = -1;
                    iArr[1] = -1;
                    iArr[2] = -1;
                    iArr[3] = -1;
                    iArr[4] = -1;
                    iArr[5] = -1;
                    iArr[6] = -1;
                    break;
                case 8:
                    iArr[0] = -1;
                    iArr[1] = -1;
                    iArr[2] = -1;
                    iArr[3] = -1;
                    iArr[4] = -1;
                    iArr[5] = -1;
                    iArr[6] = -1;
                    iArr[7] = -1;
                    break;
                default:
                    int i3 = 0;
                    while (i3 < length - 7) {
                        iArr[i3] = -1;
                        iArr[i3 + 1] = -1;
                        iArr[i3 + 2] = -1;
                        iArr[i3 + 3] = -1;
                        iArr[i3 + 4] = -1;
                        iArr[i3 + 5] = -1;
                        iArr[i3 + 6] = -1;
                        iArr[i3 + 7] = -1;
                        i3 += 8;
                    }
                    while (i3 < length) {
                        iArr[i3] = -1;
                        i3++;
                    }
                    break;
            }
            this.f27736.f62172.clear();
            return false;
        }
        return m23395(i);
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m23397() {
        return m23363(this.f27741, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23359(StringBuilder sb, String str) {
        m23347();
        int length = sb.length();
        try {
            sb.append(this.f27749, this.f27737, this.f27768);
            C15269.m34742(this, sb, str);
            this.f27737 = this.f27735;
        } catch (C14599 e) {
            sb.setLength(length);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final StringBuilder m23354(StringBuilder sb) {
        CharSequence charSequence = this.f27749;
        sb.append(charSequence, this.f27737, charSequence.length());
        return sb;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m23387(String str) {
        m23348();
        if (m23394()) {
            StringBuilder sb = new StringBuilder();
            do {
                m23359(sb, str);
            } while (m23394());
            m23354(sb);
            return sb.toString();
        }
        return this.f27749.toString();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m23393(String str) {
        if (str == null) {
            throw new NullPointerException("replacement");
        }
        m23348();
        if (!m23394()) {
            return this.f27749.toString();
        }
        StringBuilder sb = new StringBuilder();
        m23359(sb, str);
        m23354(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܶ */
    public final int m23384() {
        return this.f27741;
    }

    /* JADX INFO: renamed from: ۠ */
    public final int m23371() {
        return this.f27757;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m23367() {
        return this.f27760;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m23388(boolean z) {
        this.f27760 = z;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m23373() {
        return this.f27756;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23377(boolean z) {
        this.f27756 = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegexMatcher[pattern=");
        sb.append(this.f27751);
        sb.append(" region=");
        sb.append(this.f27741);
        sb.append(',');
        sb.append(this.f27757);
        sb.append(" lastmatch=");
        if (this.f27768 >= 0 && group(0) != null) {
            sb.append(group(0));
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m23396() {
        return this.f27755;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m23400() {
        return this.f27746;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m23392(int i) {
        this.f27734 = i;
    }

    /* JADX INFO: renamed from: ۗ */
    public final void m23366() {
        this.f27742 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23358(Runnable runnable) {
        this.f27759 = runnable;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Runnable m23391() {
        return this.f27759;
    }

    @Override // p067l.InterfaceC23987
    /* JADX INFO: renamed from: ֫ */
    public final void mo23355() {
        Runnable runnable = this.f27759;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m23399() {
        return this.f27734;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m23365() {
        return this.f27731;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m23385() {
        return this.f27762;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m23372() {
        return this.f27761;
    }

    /* JADX INFO: renamed from: ۙ */
    public final void m23368() {
        this.f27740 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23364(Thread thread) {
        mo23355();
        if (!thread.isInterrupted()) {
            return false;
        }
        this.f27761 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۛ */
    private void m23346() {
        this.f27731 = false;
        int i = this.f27734;
        this.f27747 = i;
        boolean z = this.f27742;
        boolean z2 = z && i <= 0;
        this.f27744 = z2;
        this.f27765 = 1024;
        this.f27748 = false;
        this.f27767 = z;
        if (z2) {
            C21306.m48193("Regex matching timeout: " + this.f27751.pattern());
        }
    }

    /* JADX INFO: renamed from: ۤ */
    public final boolean m23374() {
        int i = this.f27765 - 1;
        this.f27765 = i;
        if (i <= 0) {
            boolean z = m23378() || m23364(Thread.currentThread());
            this.f27765 = z ? 0 : 1024;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m23378() {
        if (!this.f27744 && this.f27767) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (!this.f27748) {
                this.f27752 = jUptimeMillis + ((long) this.f27747);
                this.f27748 = true;
            } else if (jUptimeMillis >= this.f27752) {
                this.f27744 = true;
                C21306.m48193("Regex matching timeout: " + this.f27751.pattern());
            }
        }
        return this.f27744;
    }

    /* JADX INFO: renamed from: ۫ */
    public final void m23380() {
        if (this.f27748) {
            return;
        }
        m23378();
    }

    /* JADX INFO: renamed from: ᩺ */
    private void m23349() {
        this.f27731 = this.f27748 ? m23378() : this.f27744;
        this.f27767 = false;
        this.f27748 = false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m23395(int i) {
        boolean z = false;
        this.f27754 = 0;
        this.f27762 = false;
        this.f27761 = false;
        this.f27755 = false;
        this.f27746 = false;
        if (i < 0) {
            i = 0;
        }
        this.f27768 = i;
        int i2 = this.f27738;
        if (i2 < 0) {
            i2 = i;
        }
        this.f27738 = i2;
        int[] iArr = this.f27745;
        int i3 = this.f27764;
        switch (i3) {
            case 0:
                break;
            case 1:
                iArr[0] = -1;
                break;
            case 2:
                iArr[0] = -1;
                iArr[1] = -1;
                break;
            case 3:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                break;
            case 4:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                break;
            case 5:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                break;
            case 6:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                break;
            case 7:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                break;
            case 8:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                iArr[7] = -1;
                break;
            default:
                int i4 = 0;
                while (i4 < i3 - 7) {
                    iArr[i4] = -1;
                    iArr[i4 + 1] = -1;
                    iArr[i4 + 2] = -1;
                    iArr[i4 + 3] = -1;
                    iArr[i4 + 4] = -1;
                    iArr[i4 + 5] = -1;
                    iArr[i4 + 6] = -1;
                    iArr[i4 + 7] = -1;
                    i4 += 8;
                }
                while (i4 < i3) {
                    iArr[i4] = -1;
                    i4++;
                }
                break;
        }
        this.f27764 = this.f27758.f8058 * 2;
        C7341 c7341 = this.f27753;
        c7341.m17020();
        for (C24158 c24158 : this.f27732) {
        }
        C20082 c20082 = this.f27736;
        c20082.f62172.clear();
        this.f27733 = 0;
        m23346();
        try {
            try {
                mo23355();
                try {
                    if (!this.f27744 && c7341.m17022(i, this.f27749)) {
                        z = true;
                    }
                } catch (C2646 unused) {
                    this.f27762 = true;
                }
                mo23355();
                m23349();
                boolean z2 = (!this.f27731) & z;
                if (!z2) {
                    this.f27768 = -1;
                }
                this.f27738 = this.f27735;
                if (z2 && this.f27750) {
                    Collections.sort(c20082.f62172);
                }
                return z2;
            } catch (CancellationException e) {
                this.f27768 = -1;
                throw e;
            }
        } catch (Throwable th) {
            m23349();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23363(int i, int i2) {
        boolean z = false;
        this.f27754 = 0;
        this.f27762 = false;
        this.f27761 = false;
        this.f27755 = false;
        this.f27746 = false;
        if (i < 0) {
            i = 0;
        }
        this.f27768 = i;
        int i3 = this.f27738;
        if (i3 < 0) {
            i3 = i;
        }
        this.f27738 = i3;
        int[] iArr = this.f27745;
        int i4 = this.f27764;
        switch (i4) {
            case 0:
                break;
            case 1:
                iArr[0] = -1;
                break;
            case 2:
                iArr[0] = -1;
                iArr[1] = -1;
                break;
            case 3:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                break;
            case 4:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                break;
            case 5:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                break;
            case 6:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                break;
            case 7:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                break;
            case 8:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                iArr[7] = -1;
                break;
            default:
                int i5 = 0;
                while (i5 < i4 - 7) {
                    iArr[i5] = -1;
                    iArr[i5 + 1] = -1;
                    iArr[i5 + 2] = -1;
                    iArr[i5 + 3] = -1;
                    iArr[i5 + 4] = -1;
                    iArr[i5 + 5] = -1;
                    iArr[i5 + 6] = -1;
                    iArr[i5 + 7] = -1;
                    i5 += 8;
                }
                while (i5 < i4) {
                    iArr[i5] = -1;
                    i5++;
                }
                break;
        }
        this.f27764 = this.f27758.f8058 * 2;
        C7341 c7341 = this.f27753;
        c7341.m17020();
        for (C24158 c24158 : this.f27732) {
        }
        C20082 c20082 = this.f27736;
        c20082.f62172.clear();
        this.f27733 = i2;
        m23346();
        try {
            try {
                mo23355();
                try {
                    if (!this.f27744 && c7341.m17021(i, this.f27749)) {
                        z = true;
                    }
                } catch (C2646 unused) {
                    this.f27762 = true;
                }
                mo23355();
                m23349();
                boolean z2 = (!this.f27731) & z;
                if (!z2) {
                    this.f27768 = -1;
                }
                this.f27738 = this.f27735;
                if (z2 && this.f27750) {
                    Collections.sort(c20082.f62172);
                }
                return z2;
            } catch (CancellationException e) {
                this.f27768 = -1;
                throw e;
            }
        } catch (Throwable th) {
            m23349();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23362(int i) {
        boolean z;
        this.f27754 = 0;
        this.f27762 = false;
        this.f27761 = false;
        this.f27755 = false;
        this.f27746 = false;
        this.f27768 = i;
        this.f27738 = i;
        C7341 c7341 = this.f27753;
        c7341.m17020();
        for (C24158 c24158 : this.f27732) {
        }
        this.f27733 = 0;
        m23346();
        try {
            try {
                mo23355();
                try {
                    z = !this.f27744 && c7341.m17021(i, this.f27749);
                } catch (C2646 unused) {
                    this.f27762 = true;
                }
                mo23355();
                m23349();
                return z && !this.f27731;
            } catch (CancellationException e) {
                this.f27768 = -1;
                throw e;
            }
        } catch (Throwable th) {
            m23349();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23376(int i, int i2) {
        if (i < 0 || i > this.f27749.length()) {
            throw new IndexOutOfBoundsException("start");
        }
        if (i2 < 0 || i2 > this.f27749.length()) {
            throw new IndexOutOfBoundsException("end");
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("start > end");
        }
        m23348();
        this.f27741 = i;
        this.f27757 = i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m23379(int i) {
        int length = this.f27749.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException("Illegal start index");
        }
        m23348();
        return m23395(i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m23389(int i) {
        if (i < 0 || i > this.f27749.length()) {
            throw new IndexOutOfBoundsException();
        }
        return m23363(i, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m23353(String str) {
        m23347();
        Map mapM30311 = this.f27766;
        if (mapM30311 == null) {
            mapM30311 = this.f27751.m30311();
            this.f27766 = mapM30311;
        }
        Integer num = (Integer) mapM30311.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(C6988.m16053("No group with name <", str, ">"));
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m23350(int i) {
        if (i < 0 || i > groupCount()) {
            throw new IndexOutOfBoundsException(C20778.m46922(i, "No group "));
        }
    }

    /* JADX INFO: renamed from: ۨ */
    private void m23347() {
        if (this.f27768 < 0) {
            throw new IllegalStateException("No match found");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23361(boolean z) {
        this.f27750 = z;
    }

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList m23370() {
        return this.f27736.f62172;
    }
}
