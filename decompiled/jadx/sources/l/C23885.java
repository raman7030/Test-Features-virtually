package l;

import java.io.FilterWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.᩻ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4ZE */
/* JADX INFO: loaded from: classes.dex */
public final class C23885 extends FilterWriter {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f77221;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f77222;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f77223;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f77224;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f77225;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f77226;

    public C23885(StringWriter stringWriter, int i, String str) {
        super(stringWriter);
        if (i < 0) {
            throw new IllegalArgumentException("width < 0");
        }
        this.f77223 = i != 0 ? i : Integer.MAX_VALUE;
        int i2 = i >> 1;
        this.f77222 = i2;
        this.f77221 = str.length() == 0 ? null : str;
        this.f77226 = 0;
        this.f77225 = i2 != 0;
        this.f77224 = 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int i) {
        int i2;
        synchronized (((FilterWriter) this).lock) {
            boolean z = true;
            if (this.f77225) {
                if (i == 32) {
                    int i3 = this.f77224 + 1;
                    this.f77224 = i3;
                    int i4 = this.f77222;
                    if (i3 >= i4) {
                        this.f77224 = i4;
                        this.f77225 = false;
                    }
                } else {
                    this.f77225 = false;
                }
            }
            if (this.f77226 == this.f77223 && i != 10) {
                ((FilterWriter) this).out.write(10);
                this.f77226 = 0;
            }
            if (this.f77226 == 0) {
                String str = this.f77221;
                if (str != null) {
                    ((FilterWriter) this).out.write(str);
                }
                if (!this.f77225) {
                    int i5 = 0;
                    while (true) {
                        i2 = this.f77224;
                        if (i5 >= i2) {
                            break;
                        }
                        ((FilterWriter) this).out.write(32);
                        i5++;
                    }
                    this.f77226 = i2;
                }
            }
            ((FilterWriter) this).out.write(i);
            if (i != 10) {
                this.f77226++;
            } else {
                this.f77226 = 0;
                if (this.f77222 == 0) {
                    z = false;
                }
                this.f77225 = z;
                this.f77224 = 0;
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        synchronized (((FilterWriter) this).lock) {
            while (i2 > 0) {
                write(cArr[i]);
                i++;
                i2--;
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(String str, int i, int i2) {
        synchronized (((FilterWriter) this).lock) {
            while (i2 > 0) {
                write(str.charAt(i));
                i++;
                i2--;
            }
        }
    }
}
