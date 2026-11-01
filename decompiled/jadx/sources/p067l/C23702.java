package p067l;

import java.io.Writer;

/* JADX INFO: renamed from: l.᩹ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes.dex */
public final class C23702 extends C23948 {

    /* JADX INFO: renamed from: ۙ */
    public char f75431;

    /* JADX INFO: renamed from: ᩶ */
    public final int f75432 = 1048576;

    /* JADX INFO: renamed from: ᩹ */
    public int f75433;

    @Override // p067l.C23948, java.io.Writer
    public final void write(int i) {
        m52713((char) i);
        super.write(i);
    }

    @Override // p067l.C23948, java.io.Writer
    public final void write(String str) {
        if (str != null) {
            m52712(0, str.length(), str);
            super.write(str);
        }
    }

    @Override // p067l.C23948, java.io.Writer
    public final void write(String str, int i, int i2) {
        if (str != null) {
            m52712(i, i + i2, str);
            super.write(str, i, i2);
        }
    }

    @Override // p067l.C23948, java.io.Writer
    public final void write(char[] cArr) {
        if (cArr != null) {
            for (char c : cArr) {
                m52713(c);
            }
            super.write(cArr);
        }
    }

    @Override // p067l.C23948, java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        m52713(c);
        super.append(c);
        return this;
    }

    @Override // p067l.C23948, java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        m52713(c);
        super.append(c);
        return this;
    }

    @Override // p067l.C23948, java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m52712(0, charSequence.length(), charSequence);
        super.append(charSequence);
        return this;
    }

    @Override // p067l.C23948, java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m52712(0, charSequence.length(), charSequence);
        super.append(charSequence);
        return this;
    }

    @Override // p067l.C23948, java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m52712(i, i2, charSequence);
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // p067l.C23948, java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m52712(i, i2, charSequence);
        super.append(charSequence, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52712(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            m52713(charSequence.charAt(i));
            i++;
        }
    }

    @Override // p067l.C23948, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            int i3 = i + i2;
            for (int i4 = i; i4 < i3; i4++) {
                m52713(cArr[i4]);
            }
            super.write(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m52713(char c) {
        if (this.f75431 != 0) {
            if (Character.isLowSurrogate(c)) {
                this.f75431 = (char) 0;
                return;
            }
            this.f75431 = (char) 0;
        }
        if (Character.isHighSurrogate(c)) {
            this.f75431 = c;
        }
        int i = this.f75433 + 1;
        this.f75433 = i;
        if (i > this.f75432) {
            throw new C24372();
        }
    }
}
