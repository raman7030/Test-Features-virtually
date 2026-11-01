package p067l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۜ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9097 extends OutputStream {

    /* JADX INFO: renamed from: ᩶ */
    public final StringBuilder f24653;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC18588 f24654;

    /* JADX INFO: renamed from: ᩹ */
    public int f24655;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9162(int i);

    public AbstractC9097(int i, InterfaceC18588 interfaceC18588) {
        this.f24653 = new StringBuilder(Math.min(i, 524288));
        this.f24654 = interfaceC18588;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws C18484 {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j != i3) {
            throw new ArithmeticException();
        }
        while (i < i3) {
            if ((this.f24655 & 4095) == 0 && this.f24654.mo3924()) {
                throw new C18484();
            }
            mo9162(bArr[i] & 255);
            this.f24655++;
            i++;
        }
    }

    public String finish() {
        return this.f24653.toString();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws C18484 {
        if (!this.f24654.mo3924()) {
            mo9162(i & 255);
            this.f24655++;
            return;
        }
        throw new C18484();
    }
}
