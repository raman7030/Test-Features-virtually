package p067l;

import android.os.Looper;

/* JADX INFO: renamed from: l.᩵ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZ7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20910 {

    /* JADX INFO: renamed from: ֫ */
    public char f65665;

    /* JADX INFO: renamed from: ۧ */
    public C17441 f65666;

    /* JADX INFO: renamed from: ܽ */
    public int f65667;

    /* JADX WARN: Code duplicated, block: B:29:0x005e A[EDGE_INSN: B:29:0x005e->B:30:0x005f BREAK  A[LOOP:0: B:3:0x0006->B:15:0x0026]] */
    /* JADX INFO: renamed from: ֫ */
    public static int m47222(AbstractC5390 abstractC5390, CharSequence charSequence, int i, int i2) {
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
                    if (Looper.myLooper() != Looper.getMainLooper() || !abstractC5390.m11801()) {
                        c = cCharAt;
                        break;
                    }
                    C14146 c14146 = abstractC5390.f12821;
                    C8898 c8898 = c14146.f40252;
                    C23929 c23929 = c14146.f40262;
                    if (!c23929.f75992 || !c8898.m20524()) {
                        c = cCharAt;
                        break;
                    }
                    int iM20544 = c8898.m20544(i, c23929.m26504());
                    C23120 c23120M20506 = c8898.m20506(i);
                    if (c23120M20506 != null && iM20544 == c23120M20506.m51556()) {
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
        return "IndentGuideLine{spacesCount=" + this.f65667 + ", firstNotBlankChar=" + this.f65665 + ", markList=" + this.f65666 + '}';
    }
}
