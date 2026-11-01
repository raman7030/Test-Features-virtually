package p067l;

import android.graphics.Paint;
import com.umeng.analytics.pro.C0655am;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ܰ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9BC */
/* JADX INFO: loaded from: classes3.dex */
public final class C15517 {

    /* JADX INFO: renamed from: ֫ */
    public static final char[][] f44354 = {new char[]{768, 4351}, new char[]{4864, 5119}, new char[]{5888, 7679}, new char[]{8192, 8447}, new char[]{11264, 11775}, new char[]{12288, 12543}, new char[]{42496, 42751}, new char[]{43008, 44031}, new char[]{63168, 63183}, new char[]{64272, 64287}, new char[]{65024, 65069}};

    /* JADX INFO: renamed from: ۧ */
    public static BitSet f44355;

    /* JADX INFO: renamed from: ܽ */
    public static BitSet f44356;

    /* JADX INFO: renamed from: ۧ */
    public static synchronized void m35314() {
        if (f44355 != null) {
            return;
        }
        Paint paint = new Paint(1);
        paint.setTextSize(C7050.m16235().getDisplayMetrics().scaledDensity * 15.0f);
        float fMeasureText = paint.measureText(C0655am.f2320av) * 1.1f;
        char[] cArr = new char[20];
        CharsetEncoder charsetEncoderNewEncoder = StandardCharsets.UTF_8.newEncoder();
        BitSet bitSet = new BitSet(64302);
        BitSet bitSet2 = new BitSet(64302);
        char[][] cArr2 = f44354;
        for (int i = 0; i < 11; i++) {
            char[] cArr3 = cArr2[i];
            char c = cArr3[1];
            for (char c2 = cArr3[0]; c2 <= c; c2 = (char) (c2 + 1)) {
                if (charsetEncoderNewEncoder.canEncode(c2)) {
                    Arrays.fill(cArr, c2);
                    cArr[0] = 'a';
                    if (paint.measureText(cArr, 0, 20) < fMeasureText) {
                        int i2 = c2 - 768;
                        bitSet.set(i2);
                        if (paint.measureText(cArr, 1, 1) > 0.0f) {
                            bitSet2.set(i2);
                        }
                    }
                }
            }
        }
        f44355 = bitSet;
        f44356 = bitSet2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35312() {
        BitSet bitSet = new BitSet(0);
        f44356 = bitSet;
        f44355 = bitSet;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m35316(int i) {
        if (i < 768 || i > 65069) {
            return false;
        }
        BitSet bitSet = f44355;
        if (bitSet == null) {
            m35314();
            bitSet = f44355;
        }
        return bitSet.get(i - 768);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m35315(int i) {
        if (i < 768 || i > 1023) {
            return false;
        }
        BitSet bitSet = f44355;
        if (bitSet == null) {
            m35314();
            bitSet = f44355;
        }
        return bitSet.get(i - 768);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m35313(int i) {
        if (i < 768 || i > 65069) {
            return false;
        }
        return f44356.get(i - 768);
    }
}
