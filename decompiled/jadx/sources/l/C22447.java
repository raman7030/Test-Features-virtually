package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.᩹ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes.dex */
public final class C22447 extends C22706 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public char f72705;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f72706 = 1048576;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f72707;

    @Override // l.C22706, java.io.Writer
    public final void write(int i) {
        m50372((char) i);
        super.write(i);
    }

    @Override // l.C22706, java.io.Writer
    public final void write(String str) {
        if (str != null) {
            m50371(0, str.length(), str);
            super.write(str);
        }
    }

    @Override // l.C22706, java.io.Writer
    public final void write(String str, int i, int i2) {
        if (str != null) {
            m50371(i, i + i2, str);
            super.write(str, i, i2);
        }
    }

    @Override // l.C22706, java.io.Writer
    public final void write(char[] cArr) {
        if (cArr != null) {
            for (char c : cArr) {
                m50372(c);
            }
            super.write(cArr);
        }
    }

    @Override // l.C22706, java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        m50372(c);
        super.append(c);
        return this;
    }

    @Override // l.C22706, java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        m50372(c);
        super.append(c);
        return this;
    }

    @Override // l.C22706, java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m50371(0, charSequence.length(), charSequence);
        super.append(charSequence);
        return this;
    }

    @Override // l.C22706, java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m50371(0, charSequence.length(), charSequence);
        super.append(charSequence);
        return this;
    }

    @Override // l.C22706, java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m50371(i, i2, charSequence);
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // l.C22706, java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m50371(i, i2, charSequence);
        super.append(charSequence, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50371(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            m50372(charSequence.charAt(i));
            i++;
        }
    }

    @Override // l.C22706, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            int i3 = i + i2;
            for (int i4 = i; i4 < i3; i4++) {
                m50372(cArr[i4]);
            }
            super.write(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m50372(char c) {
        if (this.f72705 != 0) {
            if (Character.isLowSurrogate(c)) {
                this.f72705 = (char) 0;
                return;
            }
            this.f72705 = (char) 0;
        }
        if (Character.isHighSurrogate(c)) {
            this.f72705 = c;
        }
        int i = this.f72707 + 1;
        this.f72707 = i;
        if (i > this.f72706) {
            throw new C23152();
        }
    }
}
