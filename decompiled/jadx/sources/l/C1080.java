package l;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.֨ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAK8 */
/* JADX INFO: loaded from: classes2.dex */
public class C1080 implements InterfaceC21882 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m3665(long j) {
        int i = 0;
        do {
            i++;
            j >>= 7;
        } while (j != 0);
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m3668(int i) {
        int i2 = i >> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 7;
            i3++;
        }
        return i3 + 1;
    }

    @Override // l.InterfaceC21882
    public void onAnimationCancel() {
    }

    @Override // l.InterfaceC21882
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo3669() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3667(CharSequence charSequence, char[] cArr, int i, int i2) {
        if (charSequence instanceof C17673) {
            ((C17673) charSequence).m41396(cArr, i, i2 + i);
            return;
        }
        int i3 = 0;
        if (i2 >= 10) {
            if (charSequence instanceof String) {
                ((String) charSequence).getChars(i, i2 + i, cArr, 0);
                return;
            }
            if (charSequence instanceof CharBuffer) {
                CharBuffer charBuffer = (CharBuffer) charSequence;
                int iPosition = charBuffer.position();
                charBuffer.position(i + iPosition);
                charBuffer.get(cArr, 0, i2);
                charBuffer.position(iPosition);
                return;
            }
            if (charSequence instanceof InterfaceC18379) {
                ((InterfaceC18379) charSequence.subSequence(i, i2 + i)).m42810();
                return;
            } else if (charSequence instanceof StringBuffer) {
                ((StringBuffer) charSequence).getChars(i, i2 + i, cArr, 0);
                return;
            } else if (charSequence instanceof StringBuilder) {
                ((StringBuilder) charSequence).getChars(i, i2 + i, cArr, 0);
                return;
            }
        }
        int i4 = i2 + i;
        while (i < i4 && i3 < cArr.length) {
            cArr[i3] = charSequence.charAt(i);
            i3++;
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3666(int i) {
        if (i == Integer.MIN_VALUE) {
            return "not-attempted";
        }
        if (i == 0) {
            return "enabled";
        }
        if (i == 1) {
            return "disabled-by-user";
        }
        if (i == -1) {
            return "unsupported-kernel";
        }
        if (i == -2) {
            return "unsupported-tsync";
        }
        if (i <= -200000) {
            return "fatal-tsync-thread-" + ((-i) - 200000);
        }
        if (i > -1000) {
            return C19370.m44628(i, "unknown-");
        }
        StringBuilder sb = new StringBuilder("fatal-errno-");
        sb.append((-i) - 1000);
        return sb.toString();
    }
}
