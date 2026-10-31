package l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.۠۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6RA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8054 implements InterfaceC22747, InterfaceC4526 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f24818;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C22927[] f24819;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f24826;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f24827;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f24828;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f24830;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f24831;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int[] f24832;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f24833;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f24834;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f24835;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public CharSequence f24836;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C11459 f24838;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f24839;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f24841;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f24842;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f24844;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1476 f24845;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Runnable f24846;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f24848;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f24849;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f24850;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f24851;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Map f24853;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f24854;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5232 f24840 = new C5232(this);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f24821 = 2000;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f24829 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f24852 = 1024;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f24820 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f24855 = -1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f24822 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f24825 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f24824 = 0;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f24847 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f24843 = true;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f24837 = false;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C18638 f24823 = new C18638();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m21431() {
        this.f24850 = true;
        this.f24841 = 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m21435() {
        return this.f24841;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m21415() {
        return (((long) this.f24825) << 32) | (((long) this.f24822) & 4294967295L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21389(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) j;
        if (i < -1 || i > this.f24836.length() || i2 < 0 || i2 > this.f24836.length()) {
            throw new IllegalArgumentException("Invalid regex match history");
        }
        this.f24825 = i;
        this.f24822 = i2;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m21385() {
        if (this.f24850) {
            this.f24841 |= 1;
        }
        return this.f24825;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m21402() {
        if (this.f24850) {
            int i = this.f24841;
            if ((i & 4) == 0) {
                this.f24841 = i | 2;
            }
        }
        return this.f24822;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m21416(int i) {
        if (this.f24850) {
            this.f24841 |= 4;
        }
        this.f24822 = i;
    }

    public C8054(C11459 c11459, C1476 c1476, CharSequence charSequence) {
        this.f24845 = c1476;
        this.f24838 = c11459;
        this.f24836 = charSequence;
        this.f24832 = new int[Math.max(c1476.f5285, 10) * 2];
        C1476 c1477 = this.f24845;
        this.f24851 = c1477.f5285 * 2;
        this.f24826 = new int[c1477.f5294];
        this.f24819 = new C22927[c1477.f5293];
        m21434();
    }

    @Override // l.InterfaceC22747
    public final C11459 pattern() {
        return this.f24838;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21393(C11459 c11459, C1476 c1476) {
        this.f24845 = c1476;
        this.f24838 = c11459;
        this.f24853 = null;
        int iMax = Math.max(c1476.f5285, 10) * 2;
        int[] iArr = new int[iMax];
        this.f24832 = iArr;
        this.f24851 = iMax;
        this.f24826 = new int[this.f24845.f5294];
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
        int[] iArr2 = this.f24826;
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
        this.f24819 = new C22927[this.f24845.f5293];
        this.f24840.m15110();
        this.f24823.f58949.clear();
    }

    @Override // l.InterfaceC22747
    public final CharSequence getText() {
        return this.f24836;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m21434() {
        m21381();
        this.f24828 = 0;
        this.f24844 = this.f24836.length();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m21381() {
        this.f24855 = -1;
        this.f24822 = 0;
        this.f24825 = -1;
        int[] iArr = this.f24832;
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
        int[] iArr2 = this.f24826;
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
        this.f24840.m15110();
        for (C22927 c22927 : this.f24819) {
        }
        this.f24823.f58949.clear();
        this.f24824 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21390(CharSequence charSequence) {
        this.f24836 = charSequence;
        m21434();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m21414() {
        m21380();
        return this.f24855;
    }

    @Override // l.InterfaceC22747
    public final int start(int i) {
        m21380();
        m21383(i);
        return this.f24832[i * 2];
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m21423(String str) {
        return this.f24832[m21386(str) * 2];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m21419() {
        m21380();
        return this.f24822;
    }

    @Override // l.InterfaceC22747
    public final int end(int i) {
        m21380();
        m21383(i);
        return this.f24832[(i * 2) + 1];
    }

    @Override // l.InterfaceC22747
    public final String group(int i) {
        int i2;
        m21380();
        m21383(i);
        int[] iArr = this.f24832;
        int i3 = i * 2;
        int i4 = iArr[i3];
        if (i4 == -1 || (i2 = iArr[i3 + 1]) == -1) {
            return null;
        }
        return this.f24836.subSequence(i4, i2).toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m21408(String str) {
        int i;
        int iM21386 = m21386(str);
        int[] iArr = this.f24832;
        int i2 = iM21386 * 2;
        int i3 = iArr[i2];
        if (i3 == -1 || (i = iArr[i2 + 1]) == -1) {
            return null;
        }
        return this.f24836.subSequence(i3, i).toString();
    }

    @Override // l.InterfaceC22747
    public final int groupCount() {
        return this.f24845.f5285 - 1;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m21384() {
        return m21396(this.f24828, 1);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m21427() {
        int i = this.f24822;
        if (i == this.f24855) {
            i++;
        }
        int i2 = this.f24828;
        if (i < i2) {
            i = i2;
        }
        if (i > this.f24844) {
            mo21388();
            this.f24818 = false;
            int[] iArr = this.f24832;
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
            this.f24823.f58949.clear();
            return false;
        }
        return m21428(i);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m21430() {
        return m21396(this.f24828, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21392(StringBuilder sb, String str) {
        m21380();
        int length = sb.length();
        try {
            sb.append(this.f24836, this.f24824, this.f24855);
            C13574.m32630(this, sb, str);
            this.f24824 = this.f24822;
        } catch (C12869 e) {
            sb.setLength(length);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final StringBuilder m21387(StringBuilder sb) {
        CharSequence charSequence = this.f24836;
        sb.append(charSequence, this.f24824, charSequence.length());
        return sb;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m21420(String str) {
        m21381();
        if (m21427()) {
            StringBuilder sb = new StringBuilder();
            do {
                m21392(sb, str);
            } while (m21427());
            m21387(sb);
            return sb.toString();
        }
        return this.f24836.toString();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m21426(String str) {
        if (str == null) {
            throw new NullPointerException("replacement");
        }
        m21381();
        if (!m21427()) {
            return this.f24836.toString();
        }
        StringBuilder sb = new StringBuilder();
        m21392(sb, str);
        m21387(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m21417() {
        return this.f24828;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m21404() {
        return this.f24844;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m21400() {
        return this.f24847;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m21421(boolean z) {
        this.f24847 = z;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m21406() {
        return this.f24843;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21410(boolean z) {
        this.f24843 = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegexMatcher[pattern=");
        sb.append(this.f24838);
        sb.append(" region=");
        sb.append(this.f24828);
        sb.append(',');
        sb.append(this.f24844);
        sb.append(" lastmatch=");
        if (this.f24855 >= 0 && group(0) != null) {
            sb.append(group(0));
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m21429() {
        return this.f24842;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m21433() {
        return this.f24833;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m21425(int i) {
        this.f24821 = i;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m21399() {
        this.f24829 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21391(Runnable runnable) {
        this.f24846 = runnable;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Runnable m21424() {
        return this.f24846;
    }

    @Override // l.InterfaceC22747
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21388() {
        Runnable runnable = this.f24846;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m21432() {
        return this.f24821;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m21398() {
        return this.f24818;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m21418() {
        return this.f24849;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m21405() {
        return this.f24848;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21401() {
        this.f24827 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21397(Thread thread) {
        mo21388();
        if (!thread.isInterrupted()) {
            return false;
        }
        this.f24848 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private void m21379() {
        this.f24818 = false;
        int i = this.f24821;
        this.f24834 = i;
        boolean z = this.f24829;
        boolean z2 = z && i <= 0;
        this.f24831 = z2;
        this.f24852 = 1024;
        this.f24835 = false;
        this.f24854 = z;
        if (z2) {
            C19926.m45880("Regex matching timeout: " + this.f24838.pattern());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m21407() {
        int i = this.f24852 - 1;
        this.f24852 = i;
        if (i <= 0) {
            boolean z = m21411() || m21397(Thread.currentThread());
            this.f24852 = z ? 0 : 1024;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m21411() {
        if (!this.f24831 && this.f24854) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (!this.f24835) {
                this.f24839 = jUptimeMillis + ((long) this.f24834);
                this.f24835 = true;
            } else if (jUptimeMillis >= this.f24839) {
                this.f24831 = true;
                C19926.m45880("Regex matching timeout: " + this.f24838.pattern());
            }
        }
        return this.f24831;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m21413() {
        if (this.f24835) {
            return;
        }
        m21411();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m21382() {
        this.f24818 = this.f24835 ? m21411() : this.f24831;
        this.f24854 = false;
        this.f24835 = false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m21428(int i) {
        boolean z = false;
        this.f24841 = 0;
        this.f24849 = false;
        this.f24848 = false;
        this.f24842 = false;
        this.f24833 = false;
        if (i < 0) {
            i = 0;
        }
        this.f24855 = i;
        int i2 = this.f24825;
        if (i2 < 0) {
            i2 = i;
        }
        this.f24825 = i2;
        int[] iArr = this.f24832;
        int i3 = this.f24851;
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
        this.f24851 = this.f24845.f5285 * 2;
        C5232 c5232 = this.f24840;
        c5232.m15110();
        for (C22927 c22927 : this.f24819) {
        }
        C18638 c18638 = this.f24823;
        c18638.f58949.clear();
        this.f24820 = 0;
        m21379();
        try {
            try {
                mo21388();
                try {
                    if (!this.f24831 && c5232.m15112(i, this.f24836)) {
                        z = true;
                    }
                } catch (C0292 unused) {
                    this.f24849 = true;
                }
                mo21388();
                m21382();
                boolean z2 = (!this.f24818) & z;
                if (!z2) {
                    this.f24855 = -1;
                }
                this.f24825 = this.f24822;
                if (z2 && this.f24837) {
                    Collections.sort(c18638.f58949);
                }
                return z2;
            } catch (CancellationException e) {
                this.f24855 = -1;
                throw e;
            }
        } catch (Throwable th) {
            m21382();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21396(int i, int i2) {
        boolean z = false;
        this.f24841 = 0;
        this.f24849 = false;
        this.f24848 = false;
        this.f24842 = false;
        this.f24833 = false;
        if (i < 0) {
            i = 0;
        }
        this.f24855 = i;
        int i3 = this.f24825;
        if (i3 < 0) {
            i3 = i;
        }
        this.f24825 = i3;
        int[] iArr = this.f24832;
        int i4 = this.f24851;
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
        this.f24851 = this.f24845.f5285 * 2;
        C5232 c5232 = this.f24840;
        c5232.m15110();
        for (C22927 c22927 : this.f24819) {
        }
        C18638 c18638 = this.f24823;
        c18638.f58949.clear();
        this.f24820 = i2;
        m21379();
        try {
            try {
                mo21388();
                try {
                    if (!this.f24831 && c5232.m15111(i, this.f24836)) {
                        z = true;
                    }
                } catch (C0292 unused) {
                    this.f24849 = true;
                }
                mo21388();
                m21382();
                boolean z2 = (!this.f24818) & z;
                if (!z2) {
                    this.f24855 = -1;
                }
                this.f24825 = this.f24822;
                if (z2 && this.f24837) {
                    Collections.sort(c18638.f58949);
                }
                return z2;
            } catch (CancellationException e) {
                this.f24855 = -1;
                throw e;
            }
        } catch (Throwable th) {
            m21382();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21395(int i) {
        boolean z;
        this.f24841 = 0;
        this.f24849 = false;
        this.f24848 = false;
        this.f24842 = false;
        this.f24833 = false;
        this.f24855 = i;
        this.f24825 = i;
        C5232 c5232 = this.f24840;
        c5232.m15110();
        for (C22927 c22927 : this.f24819) {
        }
        this.f24820 = 0;
        m21379();
        try {
            try {
                mo21388();
                try {
                    z = !this.f24831 && c5232.m15111(i, this.f24836);
                } catch (C0292 unused) {
                    this.f24849 = true;
                }
                mo21388();
                m21382();
                return z && !this.f24818;
            } catch (CancellationException e) {
                this.f24855 = -1;
                throw e;
            }
        } catch (Throwable th) {
            m21382();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21409(int i, int i2) {
        if (i < 0 || i > this.f24836.length()) {
            throw new IndexOutOfBoundsException("start");
        }
        if (i2 < 0 || i2 > this.f24836.length()) {
            throw new IndexOutOfBoundsException("end");
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("start > end");
        }
        m21381();
        this.f24828 = i;
        this.f24844 = i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m21412(int i) {
        int length = this.f24836.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException("Illegal start index");
        }
        m21381();
        return m21428(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m21422(int i) {
        if (i < 0 || i > this.f24836.length()) {
            throw new IndexOutOfBoundsException();
        }
        return m21396(i, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m21386(String str) {
        m21380();
        Map mapM28267 = this.f24853;
        if (mapM28267 == null) {
            mapM28267 = this.f24838.m28267();
            this.f24853 = mapM28267;
        }
        Integer num = (Integer) mapM28267.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(C4860.m14172("No group with name <", str, ">"));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m21383(int i) {
        if (i < 0 || i > groupCount()) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "No group "));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m21380() {
        if (this.f24855 < 0) {
            throw new IllegalStateException("No match found");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21394(boolean z) {
        this.f24837 = z;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList m21403() {
        return this.f24823.f58949;
    }
}
