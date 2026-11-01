package p067l;

import android.app.Application;
import android.content.res.Resources;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.֡ۨ */
/* JADX INFO: compiled from: X960 */
/* JADX INFO: loaded from: classes.dex */
public final class C0861 {

    /* JADX INFO: renamed from: ܽܶۖ, reason: not valid java name and contains not printable characters */
    public static boolean f81831;

    /* JADX INFO: renamed from: ܿ */
    public final float[] f4586 = new float[20];

    /* JADX INFO: renamed from: ܽ */
    public final long[] f4585 = new long[20];

    /* JADX INFO: renamed from: ᩳ */
    public float f4587 = 0.0f;

    /* JADX INFO: renamed from: ۧ */
    public int f4584 = 0;

    /* JADX INFO: renamed from: ֫ */
    public int f4583 = 0;

    /* JADX INFO: renamed from: ֫ᩴۗ, reason: not valid java name and contains not printable characters */
    public static long m55612(long j, long j2) {
        return Math.min(j, j2);
    }

    /* JADX INFO: renamed from: ۖ᩷ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m55613(Object obj, Object obj2) {
        return ((Set) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ۙ᩺ܶ, reason: not valid java name and contains not printable characters */
    public static Set m55614(Object obj) {
        return ((InterfaceC17213) obj).mo29500();
    }

    /* JADX INFO: renamed from: ۜܿ᩵, reason: not valid java name and contains not printable characters */
    public static Iterator m55615(Object obj) {
        return ((Set) obj).iterator();
    }

    /* JADX INFO: renamed from: ۟ᩳ۬, reason: not valid java name and contains not printable characters */
    public static Object m55616(Object obj, char c, Object obj2) {
        return ((InterfaceC14688) obj).mo15129(c, obj2);
    }

    /* JADX INFO: renamed from: ۠֫᩶, reason: not valid java name and contains not printable characters */
    public static int m55617(Object obj, int i) {
        return C22553.m50541((Resources.Theme) obj, i);
    }

    /* JADX INFO: renamed from: ۡܺ֡, reason: not valid java name and contains not printable characters */
    public static String m55618(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧۘܺ, reason: not valid java name and contains not printable characters */
    public static Set m55619(Object obj) {
        return ((IdentityHashMap) obj).keySet();
    }

    /* JADX INFO: renamed from: ۫۠ܿ, reason: not valid java name and contains not printable characters */
    public static Application m55620() {
        return C7050.m16232();
    }

    /* JADX INFO: renamed from: ۬ܿܶ, reason: not valid java name and contains not printable characters */
    public static void m55621(Object obj, Object obj2) {
        ((C12412) obj).append((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܳܽ᩶, reason: not valid java name and contains not printable characters */
    public static String m55622(Object obj, int i) {
        return ((String) obj).substring(i);
    }

    /* JADX INFO: renamed from: ܺ֡ۚ, reason: not valid java name and contains not printable characters */
    public static AbstractC17043 m55623(Object obj, Object obj2) {
        return C18524.m42109((String) obj, (String[]) obj2);
    }

    /* JADX INFO: renamed from: ᩴ᩺᩵, reason: not valid java name and contains not printable characters */
    public static void m55624(int i, int i2, Object obj) {
        C17548.m39930(i, i2, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ᩸ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m55625(Object obj) {
        return ((ArrayList) obj).size();
    }

    /* JADX INFO: renamed from: ᩹᩹ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m55626() {
        return false;
    }

    /* JADX INFO: renamed from: ᩺۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m55627(Object obj, int i) {
        ((C20671) obj).m46727(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4243(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        int i = this.f4584;
        long[] jArr = this.f4585;
        if (i != 0 && eventTime - jArr[this.f4583] > 40) {
            this.f4584 = 0;
            this.f4587 = 0.0f;
        }
        int i2 = (this.f4583 + 1) % 20;
        this.f4583 = i2;
        int i3 = this.f4584;
        if (i3 != 20) {
            this.f4584 = i3 + 1;
        }
        this.f4586[i2] = motionEvent.getAxisValue(26);
        jArr[this.f4583] = eventTime;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m4241(int i) {
        if (i != 26) {
            return 0.0f;
        }
        return this.f4587;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4242() {
        long j;
        int i = this.f4584;
        float fSqrt = 0.0f;
        if (i >= 2) {
            int i2 = this.f4583;
            int i3 = ((i2 + 20) - (i - 1)) % 20;
            long[] jArr = this.f4585;
            long j2 = jArr[i2];
            while (true) {
                j = jArr[i3];
                if (j2 - j <= 100) {
                    break;
                }
                this.f4584--;
                i3 = (i3 + 1) % 20;
            }
            int i4 = this.f4584;
            if (i4 >= 2) {
                float[] fArr = this.f4586;
                if (i4 == 2) {
                    int i5 = (i3 + 1) % 20;
                    long j3 = jArr[i5];
                    if (j != j3) {
                        fSqrt = fArr[i5] / (j3 - j);
                    }
                } else {
                    int i6 = 0;
                    int i7 = 0;
                    float fAbs = 0.0f;
                    while (true) {
                        if (i6 >= this.f4584 - 1) {
                            break;
                        }
                        int i8 = i6 + i3;
                        long j4 = jArr[i8 % 20];
                        int i9 = (i8 + 1) % 20;
                        if (jArr[i9] != j4) {
                            i7++;
                            float fSqrt2 = (fAbs < fSqrt ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                            float f = fArr[i9] / (jArr[i9] - j4);
                            fAbs += Math.abs(f) * (f - fSqrt2);
                            if (i7 == 1) {
                                fAbs *= 0.5f;
                            }
                        }
                        i6++;
                        fSqrt = 0.0f;
                    }
                    fSqrt = (fAbs < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                }
            }
        }
        float f2 = fSqrt * 1000;
        this.f4587 = f2;
        if (f2 < (-Math.abs(Float.MAX_VALUE))) {
            this.f4587 = -Math.abs(Float.MAX_VALUE);
        } else if (this.f4587 > Math.abs(Float.MAX_VALUE)) {
            this.f4587 = Math.abs(Float.MAX_VALUE);
        }
    }
}
