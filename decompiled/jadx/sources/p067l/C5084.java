package p067l;

import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* JADX INFO: renamed from: l.ۖ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes2.dex */
public class C5084 extends PipedInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public int f11915;

    /* JADX INFO: renamed from: ᩹ */
    public int f11916;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m10811() {
        if (available() != 0) {
            return;
        }
        ((PipedInputStream) this).out = 0;
        byte[] bArr = ((PipedInputStream) this).buffer;
        ((PipedInputStream) this).in = 1;
        bArr[0] = 0;
        read();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b A[Catch: all -> 0x0087, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000a, B:10:0x0016, B:13:0x001b, B:14:0x0020, B:16:0x0024, B:17:0x0027, B:24:0x0032, B:26:0x003a, B:33:0x006f, B:30:0x0046, B:32:0x0064, B:34:0x0072, B:36:0x0077, B:38:0x007b, B:42:0x0081, B:9:0x0012), top: B:48:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0024 A[Catch: all -> 0x0087, LOOP:0: B:14:0x0020->B:16:0x0024, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000a, B:10:0x0016, B:13:0x001b, B:14:0x0020, B:16:0x0024, B:17:0x0027, B:24:0x0032, B:26:0x003a, B:33:0x006f, B:30:0x0046, B:32:0x0064, B:34:0x0072, B:36:0x0077, B:38:0x007b, B:42:0x0081, B:9:0x0012), top: B:48:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0030 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:24:0x0032 A[Catch: all -> 0x0087, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000a, B:10:0x0016, B:13:0x001b, B:14:0x0020, B:16:0x0024, B:17:0x0027, B:24:0x0032, B:26:0x003a, B:33:0x006f, B:30:0x0046, B:32:0x0064, B:34:0x0072, B:36:0x0077, B:38:0x007b, B:42:0x0081, B:9:0x0012), top: B:48:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x003a A[Catch: all -> 0x0087, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000a, B:10:0x0016, B:13:0x001b, B:14:0x0020, B:16:0x0024, B:17:0x0027, B:24:0x0032, B:26:0x003a, B:33:0x006f, B:30:0x0046, B:32:0x0064, B:34:0x0072, B:36:0x0077, B:38:0x007b, B:42:0x0081, B:9:0x0012), top: B:48:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code duplicated, block: B:30:0x0046 A[Catch: all -> 0x0087, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000a, B:10:0x0016, B:13:0x001b, B:14:0x0020, B:16:0x0024, B:17:0x0027, B:24:0x0032, B:26:0x003a, B:33:0x006f, B:30:0x0046, B:32:0x0064, B:34:0x0072, B:36:0x0077, B:38:0x007b, B:42:0x0081, B:9:0x0012), top: B:48:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0064 A[Catch: all -> 0x0087, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000a, B:10:0x0016, B:13:0x001b, B:14:0x0020, B:16:0x0024, B:17:0x0027, B:24:0x0032, B:26:0x003a, B:33:0x006f, B:30:0x0046, B:32:0x0064, B:34:0x0072, B:36:0x0077, B:38:0x007b, B:42:0x0081, B:9:0x0012), top: B:48:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0072 A[Catch: all -> 0x0087, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000a, B:10:0x0016, B:13:0x001b, B:14:0x0020, B:16:0x0024, B:17:0x0027, B:24:0x0032, B:26:0x003a, B:33:0x006f, B:30:0x0046, B:32:0x0064, B:34:0x0072, B:36:0x0077, B:38:0x007b, B:42:0x0081, B:9:0x0012), top: B:48:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x0030, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m10812(int i) {
        int length;
        int i2;
        int i3;
        int length2;
        int length3;
        int i4;
        byte[] bArr;
        int i5;
        int i6;
        int length4 = ((PipedInputStream) this).out;
        int i7 = ((PipedInputStream) this).in;
        if (length4 >= i7) {
            if (i7 >= length4) {
                length = 0;
            } else if (i7 == -1) {
                length = ((PipedInputStream) this).buffer.length;
            }
            if (length < i) {
                byte[] bArr2 = ((PipedInputStream) this).buffer;
                length2 = bArr2.length - length;
                length3 = bArr2.length;
                while (length3 - length2 < i) {
                    length3 *= 2;
                }
                i4 = this.f11916;
                if (length3 > i4) {
                    length3 = i4;
                }
                if (length3 - length2 < i) {
                    return;
                }
                bArr = new byte[length3];
                i5 = ((PipedInputStream) this).out;
                i6 = ((PipedInputStream) this).in;
                if (i5 < i6) {
                    byte[] bArr3 = ((PipedInputStream) this).buffer;
                    System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
                } else if (i6 < i5) {
                    if (i6 == -1) {
                        System.arraycopy(((PipedInputStream) this).buffer, 0, bArr, 0, i6);
                        byte[] bArr4 = ((PipedInputStream) this).buffer;
                        int i8 = ((PipedInputStream) this).out;
                        System.arraycopy(bArr4, i8, bArr, length3 - (bArr4.length - i8), bArr4.length - i8);
                        ((PipedInputStream) this).out = length3 - (((PipedInputStream) this).buffer.length - ((PipedInputStream) this).out);
                    }
                } else if (i6 == i5) {
                    byte[] bArr5 = ((PipedInputStream) this).buffer;
                    System.arraycopy(bArr5, 0, bArr, 0, bArr5.length);
                    ((PipedInputStream) this).in = ((PipedInputStream) this).buffer.length;
                }
                ((PipedInputStream) this).buffer = bArr;
            } else if (((PipedInputStream) this).buffer.length == length && length > (i2 = this.f11915)) {
                i3 = length / 2;
                if (i3 < i2) {
                    i2 = i3;
                }
                ((PipedInputStream) this).buffer = new byte[i2];
            }
        }
        length4 = ((PipedInputStream) this).buffer.length;
        length = length4 - i7;
        if (length < i) {
            byte[] bArr6 = ((PipedInputStream) this).buffer;
            length2 = bArr6.length - length;
            length3 = bArr6.length;
            while (length3 - length2 < i) {
                length3 *= 2;
            }
            i4 = this.f11916;
            if (length3 > i4) {
                length3 = i4;
            }
            if (length3 - length2 < i) {
                return;
            }
            bArr = new byte[length3];
            i5 = ((PipedInputStream) this).out;
            i6 = ((PipedInputStream) this).in;
            if (i5 < i6) {
                byte[] bArr7 = ((PipedInputStream) this).buffer;
                System.arraycopy(bArr7, 0, bArr, 0, bArr7.length);
            } else if (i6 < i5) {
                if (i6 == -1) {
                    System.arraycopy(((PipedInputStream) this).buffer, 0, bArr, 0, i6);
                    byte[] bArr8 = ((PipedInputStream) this).buffer;
                    int i9 = ((PipedInputStream) this).out;
                    System.arraycopy(bArr8, i9, bArr, length3 - (bArr8.length - i9), bArr8.length - i9);
                    ((PipedInputStream) this).out = length3 - (((PipedInputStream) this).buffer.length - ((PipedInputStream) this).out);
                }
            } else if (i6 == i5) {
                byte[] bArr9 = ((PipedInputStream) this).buffer;
                System.arraycopy(bArr9, 0, bArr, 0, bArr9.length);
                ((PipedInputStream) this).in = ((PipedInputStream) this).buffer.length;
            }
            ((PipedInputStream) this).buffer = bArr;
        } else if (((PipedInputStream) this).buffer.length == length) {
            i3 = length / 2;
            if (i3 < i2) {
                i2 = i3;
            }
            ((PipedInputStream) this).buffer = new byte[i2];
        }
    }

    public C5084(int i) {
        ((PipedInputStream) this).buffer = new byte[32768];
        this.f11915 = 32768;
        this.f11916 = i;
    }

    public C5084(PipedOutputStream pipedOutputStream, int i) {
        super(pipedOutputStream);
        this.f11915 = 1024;
        this.f11916 = 1024;
        ((PipedInputStream) this).buffer = new byte[i];
        this.f11915 = i;
    }
}
