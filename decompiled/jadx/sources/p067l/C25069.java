package p067l;

import java.io.FilterWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.᩻ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4ZE */
/* JADX INFO: loaded from: classes.dex */
public final class C25069 extends FilterWriter {

    /* JADX INFO: renamed from: ۗ */
    public final String f79972;

    /* JADX INFO: renamed from: ۙ */
    public final int f79973;

    /* JADX INFO: renamed from: ۬ */
    public final int f79974;

    /* JADX INFO: renamed from: ᩶ */
    public int f79975;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f79976;

    /* JADX INFO: renamed from: ᩹ */
    public int f79977;

    public C25069(StringWriter stringWriter, int i, String str) {
        super(stringWriter);
        if (i < 0) {
            throw new IllegalArgumentException("width < 0");
        }
        this.f79974 = i != 0 ? i : Integer.MAX_VALUE;
        int i2 = i >> 1;
        this.f79973 = i2;
        this.f79972 = str.length() == 0 ? null : str;
        this.f79977 = 0;
        this.f79976 = i2 != 0;
        this.f79975 = 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int i) {
        int i2;
        synchronized (((FilterWriter) this).lock) {
            boolean z = true;
            if (this.f79976) {
                if (i == 32) {
                    int i3 = this.f79975 + 1;
                    this.f79975 = i3;
                    int i4 = this.f79973;
                    if (i3 >= i4) {
                        this.f79975 = i4;
                        this.f79976 = false;
                    }
                } else {
                    this.f79976 = false;
                }
            }
            if (this.f79977 == this.f79974 && i != 10) {
                ((FilterWriter) this).out.write(10);
                this.f79977 = 0;
            }
            if (this.f79977 == 0) {
                String str = this.f79972;
                if (str != null) {
                    ((FilterWriter) this).out.write(str);
                }
                if (!this.f79976) {
                    int i5 = 0;
                    while (true) {
                        i2 = this.f79975;
                        if (i5 >= i2) {
                            break;
                        }
                        ((FilterWriter) this).out.write(32);
                        i5++;
                    }
                    this.f79977 = i2;
                }
            }
            ((FilterWriter) this).out.write(i);
            if (i != 10) {
                this.f79977++;
            } else {
                this.f79977 = 0;
                if (this.f79973 == 0) {
                    z = false;
                }
                this.f79976 = z;
                this.f79975 = 0;
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
