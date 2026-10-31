package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۜ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7079 extends OutputStream {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final StringBuilder f21772;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f21773;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f21774;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7067(int i);

    public AbstractC7079(int i, InterfaceC17066 interfaceC17066) {
        this.f21772 = new StringBuilder(Math.min(i, 524288));
        this.f21773 = interfaceC17066;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws C16956 {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j != i3) {
            throw new ArithmeticException();
        }
        while (i < i3) {
            if ((this.f21774 & 4095) == 0 && this.f21773.mo1526()) {
                throw new C16956();
            }
            mo7067(bArr[i] & 255);
            this.f21774++;
            i++;
        }
    }

    public String finish() {
        return this.f21772.toString();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws C16956 {
        if (!this.f21773.mo1526()) {
            mo7067(i & 255);
            this.f21774++;
            return;
        }
        throw new C16956();
    }
}
