package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.᩵ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZ7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19509 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public char f63049;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15859 f63050;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f63051;

    /* JADX WARN: Code duplicated, block: B:29:0x005e A[EDGE_INSN: B:29:0x005e->B:30:0x005f BREAK  A[LOOP:0: B:3:0x0006->B:15:0x0026]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m44924(AbstractC3179 abstractC3179, CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        char c = 0;
        int i3 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\n' || cCharAt == '\r') {
                break;
            }
            if (cCharAt != '\t') {
                if (cCharAt != ' ') {
                    if (Looper.myLooper() != Looper.getMainLooper() || !abstractC3179.m9757()) {
                        c = cCharAt;
                        break;
                    }
                    C12392 c12392 = abstractC3179.f10021;
                    C6870 c6870 = c12392.f37235;
                    C22686 c22686 = c12392.f37245;
                    if (!c22686.f73267 || !c6870.m18575()) {
                        c = cCharAt;
                        break;
                    }
                    int iM18595 = c6870.m18595(i, c22686.m24492());
                    C21834 c21834M18557 = c6870.m18557(i);
                    if (c21834M18557 != null && iM18595 == c21834M18557.m49205()) {
                        break;
                    }
                    c = cCharAt;
                    break;
                }
                i3++;
            } else {
                i3 = (i2 - (i3 % i2)) + i3;
            }
            i++;
        }
        return (65535 & i3) | (c << 16);
    }

    public final String toString() {
        return "IndentGuideLine{spacesCount=" + this.f63051 + ", firstNotBlankChar=" + this.f63049 + ", markList=" + this.f63050 + '}';
    }
}
