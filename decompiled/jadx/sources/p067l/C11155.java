package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes3.dex */
public final class C11155 {

    /* JADX INFO: renamed from: ۧ */
    public C17859 f30959;

    /* JADX INFO: renamed from: ܿ */
    public final List f30961;

    /* JADX INFO: renamed from: ᩳ */
    public int f30962;

    /* JADX INFO: renamed from: ܽ */
    public int f30960 = 0;

    /* JADX INFO: renamed from: ֫ */
    public int f30958 = 0;

    public C11155(ArrayList arrayList) {
        this.f30959 = C17859.m40549("", (C21332) null);
        this.f30962 = 0;
        this.f30961 = arrayList;
        if (arrayList.isEmpty()) {
            return;
        }
        m25716(0, 0);
        C17859 c17859 = (C17859) arrayList.get(0);
        this.f30959 = c17859;
        this.f30962 = c17859.m40550().length();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11155 m25715(C19201 c19201) {
        return new C11155(c19201.m43692());
    }

    /* JADX INFO: renamed from: ܽ */
    public final char m25726() {
        if (this.f30958 < this.f30962) {
            return this.f30959.m40550().charAt(this.f30958);
        }
        return this.f30960 < this.f30961.size() + (-1) ? '\n' : (char) 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m25729() {
        if (this.f30958 >= this.f30962) {
            return this.f30960 < this.f30961.size() + (-1) ? 10 : 0;
        }
        char cCharAt = this.f30959.m40550().charAt(this.f30958);
        if (!Character.isHighSurrogate(cCharAt) || this.f30958 + 1 >= this.f30962) {
            return cCharAt;
        }
        char cCharAt2 = this.f30959.m40550().charAt(this.f30958 + 1);
        return Character.isLowSurrogate(cCharAt2) ? Character.toCodePoint(cCharAt, cCharAt2) : cCharAt;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m25728() {
        int i = this.f30958;
        if (i <= 0) {
            return this.f30960 > 0 ? 10 : 0;
        }
        int i2 = i - 1;
        char cCharAt = this.f30959.m40550().charAt(i2);
        if (Character.isLowSurrogate(cCharAt) && i2 > 0) {
            char cCharAt2 = this.f30959.m40550().charAt(i - 2);
            if (Character.isHighSurrogate(cCharAt2)) {
                return Character.toCodePoint(cCharAt2, cCharAt);
            }
        }
        return cCharAt;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m25721() {
        return this.f30958 < this.f30962 || this.f30960 < this.f30961.size() - 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m25724() {
        C17859 c17859M40549;
        int i = this.f30958 + 1;
        this.f30958 = i;
        if (i > this.f30962) {
            int i2 = this.f30960 + 1;
            this.f30960 = i2;
            List list = this.f30961;
            if (i2 < list.size()) {
                c17859M40549 = (C17859) list.get(this.f30960);
            } else {
                c17859M40549 = C17859.m40549("", (C21332) null);
            }
            this.f30959 = c17859M40549;
            this.f30962 = c17859M40549.m40550().length();
            this.f30958 = 0;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m25727(char c) {
        if (m25726() != c) {
            return false;
        }
        m25724();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m25722(String str) {
        int i = this.f30958;
        if (i < this.f30962 && str.length() + i <= this.f30962) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (this.f30959.m40550().charAt(this.f30958 + i2) == str.charAt(i2)) {
                }
            }
            this.f30958 = str.length() + this.f30958;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m25723(char c) {
        int i = 0;
        while (m25726() == c) {
            i++;
            m25724();
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m25718(InterfaceC9143 interfaceC9143) {
        int i = 0;
        while (((C15177) interfaceC9143).m34618(m25726())) {
            i++;
            m25724();
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m25730() {
        int i = 0;
        while (true) {
            char cM25726 = m25726();
            if (cM25726 != ' ') {
                switch (cM25726) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i;
                }
            }
            i++;
            m25724();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m25717(char c) {
        int i = 0;
        while (true) {
            char cM25726 = m25726();
            if (cM25726 == 0) {
                return -1;
            }
            if (cM25726 == c) {
                return i;
            }
            i++;
            m25724();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final C21884 m25725() {
        return new C21884(this.f30960, this.f30958);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25720(C21884 c21884) {
        int i = c21884.f68821;
        int i2 = c21884.f68820;
        m25716(i, i2);
        int i3 = c21884.f68821;
        this.f30960 = i3;
        this.f30958 = i2;
        C17859 c17859 = (C17859) this.f30961.get(i3);
        this.f30959 = c17859;
        this.f30962 = c17859.m40550().length();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19201 m25719(C21884 c21884, C21884 c21885) {
        int i = c21884.f68821;
        int i2 = c21884.f68820;
        int i3 = c21885.f68821;
        int i4 = c21885.f68820;
        List list = this.f30961;
        if (i != i3) {
            C19201 c19201 = new C19201();
            C17859 c17859 = (C17859) list.get(i);
            c19201.m43691(c17859.m40551(i2, c17859.m40550().length()));
            while (true) {
                i++;
                if (i < i3) {
                    c19201.m43691((C17859) list.get(i));
                } else {
                    c19201.m43691(((C17859) list.get(i3)).m40551(0, i4));
                    return c19201;
                }
            }
        } else {
            C17859 c178510 = (C17859) list.get(i);
            CharSequence charSequenceSubSequence = c178510.m40550().subSequence(i2, i4);
            C21332 c21332M40552 = c178510.m40552();
            C17859 c17859M40549 = C17859.m40549(charSequenceSubSequence, c21332M40552 != null ? c21332M40552.m48339(i2, i4) : null);
            C19201 c19202 = new C19201();
            c19202.m43691(c17859M40549);
            return c19202;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25716(int i, int i2) {
        List list = this.f30961;
        if (i < 0 || i >= list.size()) {
            StringBuilder sbM34408 = C15033.m34408(i, "Line index ", " out of range, number of lines: ");
            sbM34408.append(list.size());
            throw new IllegalArgumentException(sbM34408.toString());
        }
        C17859 c17859 = (C17859) list.get(i);
        if (i2 < 0 || i2 > c17859.m40550().length()) {
            StringBuilder sbM34409 = C15033.m34408(i2, "Index ", " out of range, line length: ");
            sbM34409.append(c17859.m40550().length());
            throw new IllegalArgumentException(sbM34409.toString());
        }
    }
}
