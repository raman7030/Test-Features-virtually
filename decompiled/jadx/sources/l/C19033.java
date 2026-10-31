package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ᩴ᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 618F */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19033 implements InterfaceC7961, InterfaceC1702 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59962;

    /* JADX WARN: Code duplicated, block: B:51:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ long m43885(String str) {
        long j;
        long j2;
        long j3;
        int length = str.length();
        if (length == 0) {
            throw new NumberFormatException("empty string");
        }
        long j4 = 16;
        int i = 0;
        long j5 = Long.MIN_VALUE;
        if (j4 < 0) {
            j = C13132.FOREVER_NS < (j4 ^ Long.MIN_VALUE) ? 0L : 1L;
        } else {
            long j6 = (C13132.FOREVER_NS / j4) << 1;
            j = j6 + ((long) ((((-1) - (j6 * j4)) ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE) ? 1 : 0));
        }
        if (str.charAt(0) == '+' && length > 1) {
            i = 1;
        }
        long j7 = 0;
        int i2 = 16;
        while (i < length) {
            int iDigit = Character.digit(str.charAt(i), i2);
            if (iDigit == -1) {
                throw new NumberFormatException(str.toString());
            }
            if (j7 >= 0 && j7 <= j) {
                if (j7 == j) {
                    if (j4 < 0) {
                        if (C13132.FOREVER_NS < (j4 ^ j5)) {
                            j3 = -1;
                        } else {
                            j2 = (-1) - j4;
                        }
                        if (iDigit <= ((int) j3)) {
                        }
                    } else {
                        long j8 = (-1) - (((C13132.FOREVER_NS / j4) << 1) * j4);
                        j2 = j8 - ((j8 ^ j5) >= (j4 ^ j5) ? j4 : 0L);
                    }
                    j3 = j2;
                    if (iDigit <= ((int) j3)) {
                    }
                }
                j7 = (j7 * j4) + ((long) iDigit);
                i++;
                i2 = 16;
                j5 = Long.MIN_VALUE;
            }
            throw new NumberFormatException("Too large for unsigned long: ".concat(str.toString()));
        }
        return j7;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43886(int i, int i2, String str, StringBuilder sb) {
        sb.append(C12085.m29467(i, i2));
        sb.append(str);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        switch (this.f59962) {
            case 2:
                ((InterfaceC0612) obj).mo2515();
                break;
            default:
                ((InterfaceC1131) obj).getClass();
                break;
        }
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ֫ */
    public void mo5714(TextView textView) {
        textView.setText("0");
    }
}
