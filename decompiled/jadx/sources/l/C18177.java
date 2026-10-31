package l;

import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.stateless.b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import moe.shizuku.server.IShizukuApplication;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ᩳܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C18177 implements AutoCloseable {

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final Object f56530;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18883[] f56531;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f56532 = 0;

    /* JADX INFO: renamed from: ᩵۫ۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f56533 = {5386, -26415, -26419, -26409, -26416, -26431, -26425, -26388, -26425, -26427, -26429, -26410, -26421, -26412, -26425, -26494, -26415, -26419, -26409, -26416, -26431, -26425, -26494, -26418, -26425, -26420, -26427, -26410, -26422, 7592, -29557, -29559, -29557, -29568, -29555, -29524, -29567, -29542, -29555, -29557, -29540, -29561, -29542, -29551, 4524, 26802, 26800, 26802, 26809, 26804, 26773, 26808, 26787, 26804, 26802, 26789, 26814, 26787, 26792, 9719, -12312, -12337, -12329, -12352, -12339, -12344, -12347, -12415, -12347, -12344, -12333, -12331, -12328, -12415, -12350, -12343, -12332, -12337, -12342, -12415, -12350, -12338, -12332, -12337, -12331, -12315, -12344, -12333, -12331, -12328, -12415, -12334, -12331, -12333, -12332, -12350, -12331, -12332, -12333, -12348, -12415, -12348, -12327, -12350, -12348, -12348, -12347, -12334, -12415, -12340, -12348, -12340, -12338, -12333, -12328, -12415, -12339, -12344, -12340, -12344, -12331, -12315, -12344, -12333, -12331, -12328, -12415, -12350, -12343, -12332, -12337, -12342, -12334, -12415, -12347, -12338, -12415, -12337, -12338, -12331, -12415, -12340, -12352, -12331, -12350, -12343, -12415, -12347, -12338, -12350, -12332, -12340, -12348, -12337, -12331, -12415, -12339, -12348, -12337, -12346, -12331, -12343, -12312, -12337, -12329, -12352, -12339, -12344, -12347, -12415, -12347, -12344, -12333, -12331, -12328, -12415, -12350, -12343, -12332, -12337, -12342, -12320, -12347, -12341, -12352, -12350, -12348, -12337, -12331, -12415, -12347, -12344, -12333, -12331, -12328, -12415, -12333, -12332, -12337, -12334, -12415, -12352, -12333, -12348, -12415, -12337, -12338, -12331, -12415, -12350, -12352, -12337, -12338, -12337, -12344, -12350, -12352, -12339, -12300, -12337, -12342, -12337, -12338, -12330, -12337, -12415, -12347, -12344, -12333, -12331, -12328, -12415, -12350, -12343, -12332, -12337, -12342, -12415, -12331, -12352, -12346, -12415, -12312, -12337, -12329, -12352, -12339, -12344, -12347, -12415, -12347, -12344, -12333, -12331, -12328, -12415, -12349, -12344, -12331, -12340, -12352, -12335, -12415, -12339, -12348, -12337, -12346, -12331, -12343, 9315, -6017, -6060, -6058, -6064, -6075, -6056, -6073, -6060, -6127, -6061, -6064, -6078, -6060, -6127, -6078, -6050, -6076, -6077, -6062, -6060, -6127, -6051, -6060, -6049, -6058, -6075, -6055, -6017, -6060, -6058, -6064, -6075, -6056, -6073, -6060, -6127, -6059, -6050, -6062, -6076, -6052, -6060, -6049, -6075, -6127, -6051, -6060, -6049, -6058, -6075, -6055, -6024, -6049, -6073, -6064, -6051, -6056, -6059, -6127, -6055, -6060, -6071, -6127, -6062, -6055, -6060, -6062, -6054, -6079, -6050, -6056, -6049, -6075, -6024, -6049, -6073, -6064, -6051, -6056, -6059, -6127, -6062, -6055, -6064, -6049, -6058, -6060, -6059, -6127, -6057, -6051, -6064, -6058, -6044, -6049, -6062, -6055, -6064, -6049, -6058, -6060, -6059, -6127, -6062, -6055, -6060, -6062, -6054, -6079, -6050, -6056, -6049, -6075, -6127, -6056, -6078, -6127, -6049, -6050, -6075, -6127, -6064, -6127, -6062, -6051, -6060, -6064, -6049, -6127, -6029, -6032, -6046, -6028, -6127, -6077, -6050, -6050, -6075, -6045, -6060, -6078, -6075, -6050, -6077, -6060, -6059, -6127, -6059, -6050, -6062, -6076, -6052, -6060, -6049, -6075, -6127, -6052, -6060, -6075, -6064, -6059, -6064, -6075, -6064, -6127, -6060, -6071, -6062, -6060, -6060, -6059, -6078, -6127, -6052, -6060, -6052, -6050, -6077, -6072, -6127, -6051, -6056, -6052, -6056, -6075, 4573, -18635, -18670, -18678, -18659, -18672, -18667, -18664, -18596, -18663, -18684, -18680, -18663, -18670, -18680, -18596, -18672, -18663, -18670, -18661, -18680, -18668, 4106, -11496, -11460, -11482, -11482, -11460, -11461, -11470, -11403, -11466, -11459, -11472, -11466, -11458, -11483, -11462, -11460, -11461, -11487, -11403, -11471, -11472, -11463, -11487, -11468, -11403, -11460, -11471, -11472, -11461, -11487, -11460, -11487, -11476, -11496, -11460, -11482, -11482, -11460, -11461, -11470, -11403, -11466, -11459, -11472, -11466, -11458, -11483, -11462, -11460, -11461, -11487, -11403, -11481, -11472, -11466, -11460, -11483, -11472, -11403, -11460, -11471, -11472, -11461, -11487, -11460, -11487, -11476, 7989, 31506, 31528, 31538, 31549, 31544, 31538, 31601, 31523, 31540, 31521, 31549, 31536, 31538, 31540, 31548, 31540, 31551, 31525, 31601, 31523, 31540, 31538, 31544, 31521, 31540, 31601, 31541, 31540, 31521, 31540, 31551, 31541, 31540, 31551, 31538, 31528, 31512, 31551, 31527, 31536, 31549, 31544, 31541, 31601, 31523, 31540, 31521, 31549, 31536, 31538, 31540, 31548, 31540, 31551, 31525, 31601, 31523, 31540, 31538, 31544, 31521, 31540, 31601, 31525, 31523, 31536, 31527, 31540, 31523, 31522, 31536, 31549, 31493, 31550, 31550, 31601, 31548, 31536, 31551, 31528, 31601, 31523, 31540, 31521, 31549, 31536, 31538, 31540, 31548, 31540, 31551, 31525, 31601, 31523, 31540, 31538, 31544, 31521, 31540, 31522, 949, 32703, 32644, 32644, 32715, 32646, 32650, 32645, 32658, 32715, 32648, 32643, 32654, 32648, 32640, 32667, 32644, 32642, 32645, 32671, 32715, 32655, 32654, 32647, 32671, 32650, 32715, 32654, 32645, 32671, 32665, 32642, 32654, 32664, 8026, -28527, -28490, -28498, -28487, -28492, -28495, -28484, -28424, -28504, -28487, -28500, -28500, -28483, -28502, -28490, -28424, -28500, -28487, -28486, -28492, -28483, -28424, -28501, -28495, -28510, -28483, -28527, -28490, -28498, -28487, -28492, -28495, -28484, -28424, -28504, -28487, -28500, -28500, -28483, -28502, -28490, -28424, -28504, -28487, -28511, -28492, -28489, -28487, -28484, -28424, -28492, -28483, -28490, -28481, -28500, -28496, -28536, -28487, -28500, -28500, -28483, -28502, -28490, -28424, -28502, -28483, -28504, -28492, -28487, -28485, -28483, -28491, -28483, -28490, -28500, -28424, -28491, -28499, -28501, -28500, -28424, -28490, -28489, -28500, -28424, -28486, -28483, -28424, -28483, -28491, -28504, -28500, -28511, 716, -11677, -11708, -11695, -11684, -11691, -11760, -11708, -11710, -11695, -11682, -11709, -11695, -11693, -11708, -11687, -11681, -11682, 4570, -7634, -7601, -7653, -7651, -7666, -7679, -7652, -7666, -7668, -7653, -7674, -7680, -7679, -7601, -7674, -7652, -7601, -7666, -7677, -7651, -7670, -7666, -7669, -7658, -7601, -7666, -7668, -7653, -7674, -7655, -7670, 6554, 7550, 7513, 7489, 7510, 7515, 7518, 7507, 7447, 7519, 7506, 7503, 7447, 7508, 7519, 7506, 7508, 7516, 7495, 7512, 7518, 7513, 7491, 7437, 7447, 1792, 11404, 11447, 11448, 11451, 11445, 11452, 11513, 11437, 11446, 11513, 11450, 11445, 11446, 11434, 11452, 11513, 11441, 11452, 11425, 11513, 11450, 11441, 11452, 11450, 11442, 11433, 11446, 11440, 11447, 11437, 11513, 11435, 11452, 11434, 11446, 11436, 11435, 11450, 11452, 11434, 9234, 20807, 20774, 20853, 20839, 20848, 20835, 20774, 20847, 20853, 20774, 20839, 20842, 20852, 20835, 20839, 20834, 20863, 20774, 20839, 20837, 20850, 20847, 20848, 20835, 59, -16836, -16879, -16884, -16848, -16869, -16873, -16895, -16871, -16879, -16870, -16896, -16812, -16889, -16869, -16895, -16890, -16873, -16879, -16812, -16867, -16889, -16812, -16867, -16870, -16894, -16875, -16872, -16867, -16880, -16875, -16896, -16879, -16880, 1169, -8312, -8283, -8264, -8316, -8273, -8285, -8267, -8275, -8283, -8274, -8268, -8224, -8279, -8269, -8224, -8285, -8276, -8273, -8269, -8283, -8284, -8312, -8283, -8264, -8316, -8273, -8285, -8267, -8275, -8283, -8274, -8268, -8224, -8269, -8273, -8267, -8270, -8285, -8283, -8224, -8279, -8269, -8224, -8279, -8274, -8266, -8287, -8276, -8279, -8284, 
    -8287, -8268, -8283, -8284, 3285, -9970, -9949, -9922, -9982, -9943, -9947, -9933, -9941, -9949, -9944, -9934, -9882, -9937, -9931, -9882, -9947, -9942, -9943, -9931, -9949, -9950, 3786, 22231, 22238, 22238, 22219, 22237, 22220, 22149, 22236, 22233, 22220, 22233, 22235, 22224, 22233, 22230, 22239, 22237, 22236, 22164, 22168, 22229, 22233, 22208, 22225, 22229, 22221, 22229, 22260, 22237, 22230, 22239, 22220, 22224, 22149, 5399, -3516, -3495, -3498, -3513, -3516, -3489, -3496, -3517, -3484, -3495, -3498, -3513, -3516, -3489, -3496, -3517, -3561, -3499, -3502, -3493, -3496, -3495, -3504, -3516, -3561, -3517, -3496, -3561, -3498, -3495, -3496, -3517, -3489, -3502, -3515, -3561, -3501, -3496, -3500, -3518, -3494, -3502, -3495, -3517, -3484, -3495, -3498, -3513, -3516, -3489, -3496, -3517, -3561, -3490, -3516, -3561, -3516, -3517, -3498, -3493, -3502, 3441, 23085, 23072, 23099, 23084, 23082, 23101, 23078, 23099, 23088, 8540, -5467, -5481, -5504, -5485, -5442, -5481, -5480, -5486, -5478, -5485, -5418, -5484, -5485, -5478, -5479, -5480, -5487, -5499, -5418, -5502, -5479, -5418, -5481, -5480, -5479, -5502, -5474, -5485, -5500, -5418, -5486, -5479, -5483, -5501, -5477, -5485, -5480, -5502, -5467, -5481, -5504, -5485, -5442, -5481, -5480, -5486, -5478, -5485, -5418, -5473, -5499, -5418, -5480, -5479, -5502, -5418, -5481, -5483, -5502, -5473, -5504, -5485, 208, -16982, -17000, -17009, -16996, -16995, -16935, -17014, -17002, -17012, -17013, -16998, -16996, -16935, -17003, -16996, -17001, -16994, -17011, -17007, -16935, -16982, -17000, -17009, -16996, -16975, -17000, -17001, -16995, -17003, -16996, -16935, -16997, -16996, -17003, -17002, -17001, -16994, -17014, -16935, -17011, -17002, -16935, -17000, -17001, -17002, -17011, -17007, -16996, -17013, -16935, -16995, -17002, -16998, -17012, -17004, -16996, -17001, -17011, -16982, -17000, -17009, -16996, -16975, -17000, -17001, -16995, -17003, -16996, -16935, -17008, -17014, -16935, -17001, -17002, -17011, -16935, -17000, -16998, -17011, -17008, -17009, -16996, -16982, -17000, -17009, -16996, -16995, -16935, -17014, -17002, -17012, -17013, -16998, -16996, -16935, -17008, -17014, -16935, -17000, -17003, -17013, -16996, -17000, -16995, -17024, -16935, -17002, -17010, -17001, -16996, -16995, -16935, -16997, -17024, -16935, -16995, -17002, -16998, -17012, -17004, -16996, -17001, -17011, -16982, -17000, -17009, -16996, -16975, -17000, -17001, -16995, -17003, -16996, -16935, -17008, -17014, -16935, -17014, -17011, -17000, -17003, -16996, -16935, -16936, -16956, -16935, -16995, -17002, -16998, -17012, -17004, -16996, -17001, -17011, -16935, -17003, -16996, -17001, -16994, -17011, -17007, -16935};

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static C22951 f56534;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f56535;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f56536;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile C7429 f56537;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f56538;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile boolean f56539;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f56540;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f56541;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f56542;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public File f56543;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f56544;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21541 f56545;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f56546;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public long f56547;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f56548;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC18883 f56549;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C11663 f56550;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11122 f56551;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public volatile long f56552;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m42320(Throwable th) throws IOException {
        m42356(th);
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C11663 m42380() {
        C11663 c11663;
        m42365();
        m42349();
        m42364();
        m42396();
        C7429 c7429 = this.f56537;
        C16059 c16059 = new C16059(this.f56540, this.f56547, c7429.f22841, c7429.f22836, c7429.f22840);
        try {
            m42396();
            c11663 = new C11663(this, this.f56547, c7429, c16059);
            this.f56550 = c11663;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c16059.close();
                throw e;
            } catch (IOException e2) {
                C0714.m2815(e, e2);
                throw e;
            }
        }
        return c11663;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m42381(int i, int i2, boolean z, boolean z2) {
        m42375();
        C4607 c4607 = new C4607(i, i2, z, z2);
        C4607.m13516(c4607, this.f56537.m19966());
        this.f56537.f22844 = c4607;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m42382(File file) {
        short s = f56533[1123];
        int i = (s * s) + 10797796;
        int i2 = s + 3286;
        int i3 = (i + i) - (i2 * i2) >= 0 ? 23113 : 7187;
        synchronized (this) {
            m42375();
            C11003.requireNonNull(file, C1047.m3603(f56533, 1124, 9, i3));
            this.f56543 = file;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final synchronized C4607 m42386() {
        m42375();
        return this.f56537.f22844;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final synchronized C20836 m42387() {
        C7429 c7429;
        m42365();
        c7429 = this.f56537;
        return new C20836(c7429.f22841, c7429.f22834, c7429.f22844);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m42389() {
        return !C0714.m2812(this.f56542);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42392(int i, int i2, byte[] bArr) {
        m42369();
        C19631.m45125(i, 0, i2, m42372().f22836, bArr);
        m42369();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m42393() {
        return !C2167.m7162(this.f56536);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized void m42396() {
        m42375();
        if (!m42334((Iterable) C0382.m1841(this.f56546))) {
            C11122 c11122 = this.f56551;
            if (c11122 != null) {
                c11122.m27552();
            }
            this.f56539 = true;
            this.f56542.clear();
            this.f56536.clear();
            this.f56541 = 0L;
            this.f56547++;
            m42346();
            throw new C5519();
        }
        this.f56552 = System.nanoTime() + 250000000;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized C16765 m42397() {
        C16765 c16765;
        m42365();
        C7429 c7429 = this.f56537;
        c16765 = new C16765(this, this.f56547, c7429.f22841, c7429.m19967(0L));
        C0714.m2809(this.f56548, c16765, Boolean.TRUE);
        return c16765;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized C8841 m42398() {
        C7429 c7429;
        InterfaceC18883 interfaceC18883;
        InterfaceC18883 interfaceC18883Mo10088;
        Throwable th;
        C16059 c16059;
        m42365();
        boolean z = this.f56550 != null;
        if (!z) {
            m42396();
        } else if (!m42334((Iterable) C0382.m1841(this.f56546))) {
            throw new C5519();
        }
        c7429 = this.f56537;
        interfaceC18883 = this.f56549;
        interfaceC18883Mo10088 = interfaceC18883.mo10088();
        C16059 c160510 = null;
        try {
            c16059 = new C16059(this.f56540, this.f56547, c7429.f22841, c7429.f22836, c7429.f22840);
            try {
                if (!z) {
                    m42396();
                } else if (!m42334((Iterable) C0382.m1841(this.f56546))) {
                    throw new C5519();
                }
            } catch (IOException | Error | RuntimeException e) {
                th = e;
                c160510 = c16059;
                if (c160510 == null) {
                    C1916.m6306(interfaceC18883Mo10088);
                    throw th;
                }
                try {
                    c160510.close();
                } catch (IOException e2) {
                    C2167.m7154(th, e2);
                }
                try {
                    C1916.m6306(interfaceC18883Mo10088);
                    throw th;
                } catch (IOException e3) {
                    C0714.m2815(th, e3);
                    throw th;
                }
                throw th;
            }
        } catch (IOException | Error | RuntimeException e4) {
            th = e4;
        }
        return new C8841(this, interfaceC18883, interfaceC18883Mo10088, c16059, c7429.f22834, this.f56547);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m42370(long j, long j2) {
        long j3 = 0;
        int i = -1601958817;
        int i2 = C3683.f11629;
        int i3 = AbstractC2021.f6743;
        int iM6981 = (C2105.m6981("֡ۖ") ^ i2) * 37;
        int i4 = ((iM6981 ^ i3) * 22571) ^ (-1001635003);
        int i5 = 1560361640;
        while (true) {
            i = ((((i ^ i3) * (-12917)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2001548766:
                case 773750145:
                    if (j3 < j) {
                        iM6981 = (i3 - C0630.m2566("ۧ᩹")) * (-51);
                        i4 = ((iM6981 ^ i2) * 31625) ^ 1376122692;
                        i5 = -1950293362;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۫ۨ")) * (-117);
                        i4 = ((iM6981 ^ i3) * 2401) ^ 1937219762;
                        i5 = 1805288975;
                    }
                    break;
                case -1888211545:
                case -1339545205:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C2105.m6981("֫ۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 2383) ^ (-1956377396);
                        i5 = 922251401;
                    } else {
                        iM6981 = (C0630.m2566("ᩳ۟") + i3) * 61;
                        i4 = ((iM6981 ^ i2) * 25249) ^ 37537048;
                        i5 = -930598952;
                    }
                    break;
                case -1121888287:
                case 1575578296:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C2105.m6981("֫ۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 2383) ^ (-1956377396);
                        i5 = 922251401;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۚ᩶")) * 43;
                        i4 = ((iM6981 ^ i3) * (-6693)) ^ 1712560190;
                        i5 = 704307485;
                    }
                    break;
                case -1017691023:
                case -612043216:
                    if (j3 >= 0) {
                        iM6981 = C0630.m2566("᩸ۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17093) ^ 1631656037;
                        i5 = 2083926191;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۧ᩹")) * (-51);
                        i4 = ((iM6981 ^ i2) * 31625) ^ 1376122692;
                        i5 = -1950293362;
                    }
                    break;
                case -997863744:
                case -957716418:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C0630.m2566("᩷ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3703) ^ (-1053750905);
                        i5 = -895614475;
                    } else {
                        iM6981 = C0630.m2566("ۡܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8979)) ^ (-300652556);
                        i5 = 1220180256;
                    }
                    break;
                case -861829292:
                case 1894623235:
                    if (C0422.f1886 <= 0) {
                        iM6981 = C0630.m2566("᩷ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3703) ^ (-1053750905);
                        i5 = -895614475;
                    } else {
                        iM6981 = C0630.m2566("ۜ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-10417)) ^ 1606874223;
                        i5 = -343211034;
                    }
                    break;
                case -737258585:
                case 938847507:
                    return C13132.FOREVER_NS;
                case -683434576:
                case 996119238:
                    if (C3019.f9544 >= 0) {
                        iM6981 = C0630.m2566("᩷ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3703) ^ (-1053750905);
                        i5 = -895614475;
                    } else {
                        iM6981 = C0630.m2566("ۛۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 27937) ^ 1863032259;
                        i5 = 2079536939;
                    }
                    break;
                case -274877236:
                case 1466636024:
                    C0798.m2998();
                    C3432.m10477();
                    return 0L;
                case -128990985:
                case 1155445221:
                    j3 = j2 + j;
                    if (C3746.f11829 <= 0) {
                        iM6981 = C2105.m6981("֫ۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 2383) ^ (-1956377396);
                        i5 = 922251401;
                    } else {
                        iM6981 = (C0630.m2566("ۘ֡") + i2) * (-65);
                        i4 = ((iM6981 ^ i3) * (-28605)) ^ 1766653018;
                        i5 = 852787450;
                    }
                    break;
                case 193051544:
                case 362329669:
                    C5695.m16023();
                    iM6981 = C0630.m2566("۟᩶") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-19277)) ^ 1659017807;
                    i5 = -1187523528;
                    break;
                case 288042409:
                case 1041955674:
                    C3663.m11168();
                    if (C4117.f13076 <= 0) {
                        iM6981 = C0630.m2566("᩷֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6223)) ^ (-2032551687);
                        i5 = 1562906129;
                    } else {
                        iM6981 = C0630.m2566("۟᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-19277)) ^ 1659017807;
                        i5 = -1187523528;
                    }
                    break;
                case 489828944:
                case 1274569045:
                    C1504.m5179();
                    if (C21923.f70183 == 0) {
                        iM6981 = C0630.m2566("᩷ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3703) ^ (-1053750905);
                        i5 = -895614475;
                    } else {
                        iM6981 = C0630.m2566("۟᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-19277)) ^ 1659017807;
                        i5 = -1187523528;
                    }
                    break;
                case 504376029:
                case 1268889081:
                    if (C0483.f2088 >= 0) {
                        iM6981 = C0630.m2566("᩷֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6223)) ^ (-2032551687);
                        i5 = 1562906129;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۨۢ")) * (-3);
                        i4 = ((iM6981 ^ i3) * (-12913)) ^ (-31372264);
                        i5 = 243811080;
                    }
                    break;
                case 753078831:
                case 1244852139:
                    if (C1047.m3599() >= 0) {
                        iM6981 = C0630.m2566("᩷ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3703) ^ (-1053750905);
                        i5 = -895614475;
                    } else {
                        iM6981 = C0630.m2566("ۙۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-26295)) ^ 1539196894;
                        i5 = -1710500872;
                    }
                    break;
                case 787753453:
                case 1877023499:
                    if (C1005.f3721) {
                        iM6981 = (C0630.m2566("ۖۤ") + i3) * (-7);
                        i4 = ((iM6981 ^ i2) * 25573) ^ (-42792154);
                        i5 = -443636180;
                    } else {
                        iM6981 = C0630.m2566("۟᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-19277)) ^ 1659017807;
                        i5 = -1187523528;
                    }
                    break;
                case 1120324056:
                case 1616005532:
                    C0714.m2805();
                    if (C0630.m2564()) {
                        iM6981 = C0630.m2566("ܶۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 19661) ^ 985232025;
                        i5 = -1082177830;
                    } else {
                        iM6981 = C0630.m2566("᩷ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3703) ^ (-1053750905);
                        i5 = -895614475;
                    }
                    break;
                case 1438846015:
                case 1778179934:
                    return j3;
                default:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("᩷֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6223)) ^ (-2032551687);
                        i5 = 1562906129;
                    } else {
                        iM6981 = (C0630.m2566("᩷۬") + i2) * (-17);
                        i4 = ((iM6981 ^ i3) * 20797) ^ (-1292093929);
                        i5 = 70207136;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized int m42378(int i, int i2, byte[] bArr, boolean[] zArr) {
        int iM7501;
        short s = f56533[1026];
        int i3 = s + 1;
        int i4 = (i3 * i3) - ((s * 2) + 1) < 0 ? 64442 : 22200;
        String strM28025 = C11340.m28025(f56533, 1027, 7, i4);
        synchronized (this) {
            C11003.requireNonNull(bArr, RunnableC3474.m10633(f56533, 1034, 4, i4));
            C11003.requireNonNull(zArr, C0422.m1955(f56533, 1038, 7, i4));
            if (i < 0 || i2 < 0) {
                StringBuilder sb = new StringBuilder(strM28025);
                C0050.m945(sb, i);
                C1420.m4905(sb, C11340.m28025(f56533, 1045, 16, i4));
                C0050.m945(sb, i2);
                throw new IndexOutOfBoundsException(C0422.m1959(sb));
            }
            C9005.m23245(bArr.length, 0, i2);
            C9005.m23245(zArr.length, 0, i2);
            m42369();
            C7429 c7429M42372 = m42372();
            iM7501 = i >= c7429M42372.m19966() ? 0 : C2272.m7501(i2, c7429M42372.m19966() - i);
            if (iM7501 > 0) {
                C19631.m45125(i, 0, iM7501, c7429M42372.f22836, bArr);
                C13510.m32547(c7429M42372.f22840, i, zArr, iM7501);
            }
            m42369();
        }
        return iM7501;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m42362(InterfaceC18883 interfaceC18883, IdentityHashMap identityHashMap) {
        Boolean bool = null;
        boolean z = false;
        boolean z2 = false;
        InterfaceC18883[] interfaceC18883Arr = null;
        int length = 0;
        int i = 0;
        int i2 = 1144613785;
        int i3 = C3537.f11231;
        int i4 = C1420.f5096;
        int iM6981 = C2105.m6981("ܳᩳ") ^ i4;
        int i5 = ((iM6981 ^ i3) * 16539) ^ (-445908013);
        int i6 = 166887653;
        while (true) {
            i2 = ((((i2 ^ i3) * (-29831)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -1869888732:
                case -1037637919:
                    if (C1916.m6308() >= 0) {
                        iM6981 = C0630.m2566("ۖ֡") ^ i3;
                        i5 = ((iM6981 ^ i4) * 6535) ^ 477659498;
                        i6 = 1990584864;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۡܳ")) * (-103);
                        i5 = ((iM6981 ^ i3) * (-17243)) ^ (-1112009120);
                        i6 = -1933532227;
                    }
                    break;
                case -1730197715:
                case 1472929015:
                    if (C4075.f12947 >= 0) {
                        iM6981 = (i4 - C2105.m6981("ۘۡ")) * 89;
                        i5 = ((iM6981 ^ i3) * 6039) ^ (-1851260098);
                        i6 = 1891609654;
                    } else {
                        iM6981 = C0630.m2566("ܺܰ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-23665)) ^ (-1489425315);
                        i6 = -750649466;
                    }
                    break;
                case -1719058956:
                case -839467751:
                    length = interfaceC18883Arr.length;
                    i = 0;
                    iM6981 = (C2105.m6981("ܰۢ") ^ i3) * (-77);
                    i5 = ((iM6981 ^ i4) * 7917) ^ 660253197;
                    i6 = 347415727;
                    break;
                case -1710742642:
                case 1809832812:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("ۖ֡") ^ i3;
                        i5 = ((iM6981 ^ i4) * 6535) ^ 477659498;
                        i6 = 1990584864;
                    } else {
                        iM6981 = C0630.m2566("ۛ᩺") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-21781)) ^ (-1711859164);
                        i6 = -1322927226;
                    }
                    break;
                case -1491320863:
                case -864656040:
                    C5695.m16023();
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C0630.m2566("ܶۧ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-675)) ^ 772550596;
                        i6 = -1864481632;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۘۡ")) * 89;
                        i5 = ((iM6981 ^ i3) * 6039) ^ (-1851260098);
                        i6 = 1891609654;
                    }
                    break;
                case -1478283548:
                case -511337371:
                    C0422.m1963();
                    return false;
                case -1354132233:
                case 897252079:
                    if (C1504.f5354) {
                        iM6981 = (i4 - C2105.m6981("ۘۡ")) * 89;
                        i5 = ((iM6981 ^ i3) * 6039) ^ (-1851260098);
                        i6 = 1891609654;
                    } else {
                        iM6981 = C2105.m6981("᩶ᩴ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 12383) ^ (-1293458678);
                        i6 = 432599559;
                    }
                    break;
                case -1339556640:
                case 12955660:
                    i++;
                    iM6981 = (C2105.m6981("ܰۢ") ^ i3) * (-77);
                    i5 = ((iM6981 ^ i4) * 7917) ^ 660253197;
                    i6 = 347415727;
                    break;
                case -1334083962:
                case -6191929:
                    if (i < length) {
                        iM6981 = C2105.m6981("ۜ۬") ^ i4;
                        i5 = ((iM6981 ^ i3) * 14819) ^ 1479806988;
                        i6 = -1793446344;
                    } else {
                        z2 = z;
                        iM6981 = (i3 - C0630.m2566("ۨ۬")) * (-35);
                        i5 = ((iM6981 ^ i4) * 32699) ^ 2005638920;
                        i6 = 265976234;
                    }
                    break;
                case -932007693:
                case 236927321:
                    if (C3683.f11629 >= 0) {
                        iM6981 = C0630.m2566("ܶۧ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-675)) ^ 772550596;
                        i6 = -1864481632;
                    } else {
                        iM6981 = (C2105.m6981("ᩴܳ") ^ i4) * q.h;
                        i5 = ((iM6981 ^ i3) * (-19993)) ^ (-290466511);
                        i6 = -2087022351;
                    }
                    break;
                case -787132086:
                case 822284439:
                    interfaceC18883Arr = ((C6018) interfaceC18883).f18478;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("ܶۧ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-675)) ^ 772550596;
                        i6 = -1864481632;
                    } else {
                        iM6981 = (i4 - C0630.m2566("۟ܺ")) * 123;
                        i5 = ((iM6981 ^ i3) * 17773) ^ (-679342408);
                        i6 = 1610289882;
                    }
                    break;
                case -753632955:
                case 660318482:
                    ViewOnClickListenerC1958.m6429();
                    if (C2105.m6982() == 0) {
                        iM6981 = (i4 - C2105.m6981("ۘۡ")) * 89;
                        i5 = ((iM6981 ^ i3) * 6039) ^ (-1851260098);
                        i6 = 1891609654;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۗܰ")) * (-73);
                        i5 = ((iM6981 ^ i4) * 30973) ^ (-508700323);
                        i6 = 1287739482;
                    }
                    break;
                case -704015778:
                case -291935473:
                    C0714.m2809(identityHashMap, interfaceC18883, Boolean.FALSE);
                    z = interfaceC18883 instanceof InterfaceC2655;
                    if (z) {
                        z2 = z;
                        iM6981 = (i3 - C0630.m2566("ۨ۬")) * (-35);
                        i5 = ((iM6981 ^ i4) * 32699) ^ 2005638920;
                        i6 = 265976234;
                    } else {
                        iM6981 = C2105.m6981("֫ۨ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 15679) ^ 320927455;
                        i6 = -1811634912;
                    }
                    break;
                case -690999748:
                case -148539110:
                    if (m42362(interfaceC18883Arr[i], identityHashMap)) {
                        iM6981 = (C2105.m6981("ܳ᩺") + i4) * (-101);
                        i5 = ((iM6981 ^ i3) * (-30765)) ^ (-625673896);
                        i6 = 106115588;
                    } else {
                        iM6981 = C2105.m6981("᩺ܳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-7385)) ^ 881967645;
                        i6 = 1637731155;
                    }
                    break;
                case -674314199:
                case 1283446923:
                    if (interfaceC18883 instanceof C6018) {
                        iM6981 = (i3 - C0630.m2566("ۛ᩻")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM6981 ^ i4) * (-19145)) ^ (-1145095025);
                        i6 = -1555563203;
                    } else {
                        z2 = z;
                        iM6981 = (i3 - C0630.m2566("ۨ۬")) * (-35);
                        i5 = ((iM6981 ^ i4) * 32699) ^ 2005638920;
                        i6 = 265976234;
                    }
                    break;
                case -579023263:
                case 854245681:
                    return C1294.m4369(Boolean.TRUE, bool);
                case -557478201:
                case 2126207613:
                    C4159.m12565();
                    iM6981 = (i4 - C2105.m6981("ۘۡ")) * 89;
                    i5 = ((iM6981 ^ i3) * 6039) ^ (-1851260098);
                    i6 = 1891609654;
                    break;
                case -453491935:
                case 1313075211:
                    bool = (Boolean) identityHashMap.get(interfaceC18883);
                    if (bool == null) {
                        iM6981 = (C0630.m2566("ۘܿ") + i3) * (-97);
                        i5 = ((iM6981 ^ i4) * 11399) ^ 1863634634;
                        i6 = -486069586;
                    } else {
                        iM6981 = (C0630.m2566("ܿۘ") ^ i4) * 29;
                        i5 = ((iM6981 ^ i3) * 6783) ^ 299910077;
                        i6 = -1627248664;
                    }
                    break;
                case 515560534:
                case 1045606450:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("ۖ֡") ^ i3;
                        i5 = ((iM6981 ^ i4) * 6535) ^ 477659498;
                        i6 = 1990584864;
                    } else {
                        iM6981 = C0630.m2566("ܶۧ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-675)) ^ 772550596;
                        i6 = -1864481632;
                    }
                    break;
                case 623689156:
                case 1634665774:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C0630.m2566("ܶۧ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-675)) ^ 772550596;
                        i6 = -1864481632;
                    } else {
                        iM6981 = C2105.m6981("ۛ۠") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-18951)) ^ (-639754568);
                        i6 = -136462163;
                    }
                    break;
                case 644093826:
                case 1117163993:
                    if (C7811.m20844() != 0) {
                        iM6981 = C0630.m2566("ܿۗ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-1521)) ^ (-1049390626);
                        i6 = -821870748;
                    } else {
                        iM6981 = C0630.m2566("ۚۢ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-15301)) ^ 109372744;
                        i6 = 1231458351;
                    }
                    break;
                case 843134806:
                case 1804083009:
                    if (identityHashMap.containsKey(interfaceC18883)) {
                        iM6981 = (C0630.m2566("ܿۘ") ^ i4) * 29;
                        i5 = ((iM6981 ^ i3) * 6783) ^ 299910077;
                        i6 = -1627248664;
                    } else {
                        iM6981 = C2105.m6981("ᩳ᩺") ^ i4;
                        i5 = ((iM6981 ^ i3) * 7135) ^ 1222414966;
                        i6 = -1782577235;
                    }
                    break;
                case 1140791388:
                case 1620859187:
                    if (C0630.f2410 <= 0) {
                        iM6981 = C0630.m2566("ܿۗ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-1521)) ^ (-1049390626);
                        i6 = -821870748;
                    } else {
                        iM6981 = (C0630.m2566("ۘۧ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM6981 ^ i4) * 16129) ^ (-691233801);
                        i6 = 2012700008;
                    }
                    break;
                case 1187507645:
                case 1675936428:
                    z2 = true;
                    iM6981 = (i3 - C0630.m2566("ۨ۬")) * (-35);
                    i5 = ((iM6981 ^ i4) * 32699) ^ 2005638920;
                    i6 = 265976234;
                    break;
                case 1544286404:
                case 2040515922:
                    C2167.m7148(identityHashMap, interfaceC18883, C1420.m4911(z2));
                    return z2;
                default:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("ۖ֡") ^ i3;
                        i5 = ((iM6981 ^ i4) * 6535) ^ 477659498;
                        i6 = 1990584864;
                    } else {
                        iM6981 = C2105.m6981("۟ܽ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 31969) ^ 882792202;
                        i6 = 581239428;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42326(C9047 c9047, InterfaceC18883 interfaceC18883, IdentityHashMap identityHashMap, ArrayList arrayList) {
        ArrayDeque arrayDeque = null;
        C9047 c9048 = null;
        C9047 c9049 = null;
        C21042 c21042 = null;
        InterfaceC18883 interfaceC18884 = null;
        C17513 c17513 = null;
        int i = 1258162522;
        int i2 = C3746.f11829;
        int i3 = C22628.f73083;
        int iM6981 = C2105.m6981("ۖۛ") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-21931)) ^ (-1567551716);
        int i5 = 927387627;
        while (true) {
            i = ((((i ^ i2) * 2789) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2124898165:
                case 1962551031:
                    if (interfaceC18884 instanceof C20130) {
                        iM6981 = C0630.m2566("ۤۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23729)) ^ 373169061;
                        i5 = 1393222378;
                    } else {
                        iM6981 = (C2105.m6981("ܺ۠") + i3) * (-5);
                        i4 = ((iM6981 ^ i2) * 21349) ^ (-2077018919);
                        i5 = -795500604;
                    }
                    break;
                case -1886505311:
                case 70541266:
                    c17513.m40916(c21042.f67897, c21042.f67894, identityHashMap, arrayList);
                    iM6981 = C0630.m2566("ᩳ۠") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-8807)) ^ 1443747246;
                    i5 = -1029137304;
                    break;
                case -1876095028:
                case -803040648:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C2105.m6981("ᩳۘ") ^ i2) * 9;
                        i4 = ((iM6981 ^ i3) * 22031) ^ 451761198;
                        i5 = 2136170208;
                    } else {
                        iM6981 = C0630.m2566("ܿۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17635)) ^ 2049779867;
                        i5 = 1097523303;
                    }
                    break;
                case -1816039977:
                case 1177815068:
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("ۨܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-26725)) ^ 1123831923;
                        i5 = -523015194;
                    } else {
                        iM6981 = C2105.m6981("֨ۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 1817) ^ (-1555527527);
                        i5 = 309632716;
                    }
                    break;
                case -1730669825:
                case 1910136982:
                    C7106.m19120();
                    if (C1294.f4556 < 0) {
                        iM6981 = C2105.m6981("᩷֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 11369) ^ 642648778;
                        i5 = 196736933;
                    } else {
                        iM6981 = C2105.m6981("֨ۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 1817) ^ (-1555527527);
                        i5 = 309632716;
                    }
                    break;
                case -1716067118:
                case -1409119888:
                    if (c9049 != null) {
                        iM6981 = C2105.m6981("۟֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * o.a.g) ^ (-1171791246);
                        i5 = -1663392764;
                    } else {
                        iM6981 = C0630.m2566("ᩳ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8807)) ^ 1443747246;
                        i5 = -1029137304;
                    }
                    break;
                case -1596088226:
                case 1634372166:
                    if (C0422.f1886 > 0) {
                        iM6981 = (i2 - C0630.m2566("ۙۡ")) * (-109);
                        i4 = ((iM6981 ^ i3) * (-4767)) ^ (-627550074);
                        i5 = 211214719;
                    } else {
                        iM6981 = C0630.m2566("ܽ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-22875)) ^ (-1428203694);
                        i5 = 1280199196;
                    }
                    break;
                case -1456604908:
                case 882785845:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C0630.m2566("᩻ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 30479) ^ 911030752;
                        i5 = 1273585418;
                    } else {
                        iM6981 = (C2105.m6981("ۛ۫") ^ i2) * 87;
                        i4 = ((iM6981 ^ i3) * 17585) ^ (-851820625);
                        i5 = 237345924;
                    }
                    break;
                case -1455851445:
                case -50713953:
                    c21042 = c9049.f27427;
                    interfaceC18884 = c21042.f67896;
                    if (interfaceC18884 != interfaceC18883) {
                        iM6981 = (C0630.m2566("֨ۙ") ^ i3) * 127;
                        i4 = ((iM6981 ^ i2) * 28855) ^ (-1064470687);
                        i5 = 984357029;
                    } else {
                        iM6981 = C0630.m2566("ۤۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23729)) ^ 373169061;
                        i5 = 1393222378;
                    }
                    break;
                case -1389289247:
                case -594241042:
                    c9048 = ((C9047) arrayDeque.pop()).f27430;
                    iM6981 = (C0630.m2566("ܽ᩵") + i3) * (-9);
                    i4 = ((iM6981 ^ i2) * (-13459)) ^ 1792401776;
                    i5 = -702664951;
                    break;
                case -1284430441:
                case -682516152:
                    C2167.m7155();
                    break;
                case -1121758720:
                case 572114135:
                    if (!(interfaceC18884 instanceof C6018)) {
                        iM6981 = C0630.m2566("ᩳ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8807)) ^ 1443747246;
                        i5 = -1029137304;
                    } else {
                        iM6981 = C0630.m2566("ۤۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23729)) ^ 373169061;
                        i5 = 1393222378;
                    }
                    break;
                case -1066846281:
                case 666062846:
                    if (c9047 == null) {
                        iM6981 = C2105.m6981("֡֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 773) ^ 254626976;
                        i5 = 234394082;
                    } else {
                        iM6981 = C2105.m6981("ܿۚ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 19953) ^ (-1186142109);
                        i5 = 1060975355;
                    }
                    break;
                case -909719454:
                case -718229424:
                    if (C4117.m12364() != 0) {
                        iM6981 = (i2 - C0630.m2566("ۙۡ")) * (-109);
                        i4 = ((iM6981 ^ i3) * (-4767)) ^ (-627550074);
                        i5 = 211214719;
                    } else {
                        iM6981 = (C2105.m6981("ܳۜ") + i2) * (-17);
                        i4 = ((iM6981 ^ i3) * 32169) ^ (-5777277);
                        i5 = 1814075842;
                    }
                    break;
                case -857350300:
                case 212097020:
                    if (c9048 == null) {
                        iM6981 = (i2 - C2105.m6981("ܽ֡")) * (-45);
                        i4 = ((iM6981 ^ i3) * 10855) ^ (-975825997);
                        i5 = 947715535;
                    } else {
                        c9049 = c9048;
                        iM6981 = C0630.m2566("ᩳۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14379)) ^ 1690825839;
                        i5 = 131609388;
                    }
                    break;
                case -745905220:
                case -203132417:
                    if (!C2167.m7162(arrayDeque)) {
                        c9049 = c9048;
                        iM6981 = C0630.m2566("ᩳۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14379)) ^ 1690825839;
                        i5 = 131609388;
                    } else {
                        iM6981 = C2105.m6981("֡֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 773) ^ 254626976;
                        i5 = 234394082;
                    }
                    break;
                case -631780785:
                case 924353395:
                    if (C3683.f11629 >= 0) {
                        iM6981 = C2105.m6981("֨ۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 1817) ^ (-1555527527);
                        i5 = 309632716;
                    } else {
                        iM6981 = C0630.m2566("ܰᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27877) ^ (-1265542772);
                        i5 = -954958741;
                    }
                    break;
                case -565002399:
                case 2114544214:
                    if (C4075.f12947 < 0) {
                        iM6981 = C2105.m6981("֫ۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 6477) ^ 179666647;
                        i5 = -972792266;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۙۡ")) * (-109);
                        i4 = ((iM6981 ^ i3) * (-4767)) ^ (-627550074);
                        i5 = 211214719;
                    }
                    break;
                case -486711872:
                case 1147326851:
                    C0964.m3413();
                    if (C1128.m3851() <= 0) {
                        iM6981 = C0630.m2566("᩻ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 30479) ^ 911030752;
                        i5 = 1273585418;
                    } else {
                        iM6981 = C2105.m6981("֫ۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 6477) ^ 179666647;
                        i5 = -972792266;
                    }
                    break;
                case -439757636:
                case 870201457:
                    if (C7106.m19120() > 0) {
                        iM6981 = C2105.m6981("֨ۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 1817) ^ (-1555527527);
                        i5 = 309632716;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۟ᩴ")) * (-111);
                        i4 = ((iM6981 ^ i3) * 30085) ^ (-1326238336);
                        i5 = -1084188360;
                    }
                    break;
                case -218659893:
                case 2125584126:
                    if (C2126.m7040()) {
                        iM6981 = C0630.m2566("᩻ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6381)) ^ 1964679524;
                        i5 = -1388815547;
                    } else {
                        iM6981 = C0630.m2566("ܶܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-22345)) ^ (-2129056708);
                        i5 = -182926347;
                    }
                    break;
                case -206341688:
                case -36390105:
                    if (C3663.f11553) {
                        iM6981 = C0630.m2566("᩻ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6381)) ^ 1964679524;
                        i5 = -1388815547;
                    } else {
                        iM6981 = (C2105.m6981("᩸ۘ") ^ i2) * (-85);
                        i4 = ((iM6981 ^ i3) * (-21685)) ^ (-1344900306);
                        i5 = -784121310;
                    }
                    break;
                case -146235322:
                case 1125808571:
                    if (C2167.m7162(arrayDeque)) {
                        iM6981 = C2105.m6981("֡֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 773) ^ 254626976;
                        i5 = 234394082;
                    } else {
                        iM6981 = (C2105.m6981("ۛۘ") ^ i3) * 119;
                        i4 = ((iM6981 ^ i2) * 4535) ^ 111022046;
                        i5 = -797406532;
                    }
                    break;
                case 44372941:
                case 1414397550:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("᩻ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 30479) ^ 911030752;
                        i5 = 1273585418;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩹۟")) * 53;
                        i4 = ((iM6981 ^ i2) * (-30511)) ^ 560025797;
                        i5 = -1904680107;
                    }
                    break;
                case 137684725:
                case 1381160167:
                    if (C11340.f33930 >= 0) {
                        iM6981 = C2105.m6981("᩷֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 11369) ^ 642648778;
                        i5 = 196736933;
                    } else {
                        iM6981 = (C2105.m6981("ᩴ۠") + i3) * 79;
                        i4 = ((iM6981 ^ i2) * (-14531)) ^ (-341130296);
                        i5 = 2019132590;
                    }
                    break;
                case 530338475:
                case 1508154725:
                    arrayDeque = new ArrayDeque();
                    c9048 = c9047;
                    iM6981 = (C0630.m2566("ܽ᩵") + i3) * (-9);
                    i4 = ((iM6981 ^ i2) * (-13459)) ^ 1792401776;
                    i5 = -702664951;
                    break;
                case 547161754:
                case 961521656:
                    C1128.m3851();
                    if (C3911.f12484 >= 0) {
                        iM6981 = C0630.m2566("᩻ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6381)) ^ 1964679524;
                        i5 = -1388815547;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۟ᩴ")) * (-111);
                        i4 = ((iM6981 ^ i3) * 30085) ^ (-1326238336);
                        i5 = -1084188360;
                    }
                    break;
                case 903050865:
                case 1144059612:
                    c17513 = c21042.f67895;
                    if (c17513 != null) {
                        iM6981 = (C2105.m6981("ۨ᩵") ^ i2) * (-127);
                        i4 = ((iM6981 ^ i3) * 3433) ^ (-828443792);
                        i5 = 1987293897;
                    } else {
                        iM6981 = C0630.m2566("ᩳ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8807)) ^ 1443747246;
                        i5 = -1029137304;
                    }
                    break;
                case 941302571:
                case 1713572183:
                    break;
                case 980015163:
                case 1735556013:
                    if (RunnableC1937.m6381(c9049)) {
                        iM6981 = (C2105.m6981("ܶܶ") ^ i3) * (-115);
                        i4 = ((iM6981 ^ i2) * 19187) ^ 2017679460;
                        i5 = 1393865877;
                    } else {
                        iM6981 = C0630.m2566("᩵֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21881) ^ 1194396837;
                        i5 = 10937389;
                    }
                    break;
                case 1201830896:
                case 1667217802:
                    if (C4117.f13076 <= 0) {
                        iM6981 = C0630.m2566("ܽ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-22875)) ^ (-1428203694);
                        i5 = 1280199196;
                    } else {
                        iM6981 = (C0630.m2566("۟֡") ^ i3) * (-81);
                        i4 = ((iM6981 ^ i2) * 12271) ^ (-1991982494);
                        i5 = 583392535;
                    }
                    break;
                case 1236215660:
                case 1835238730:
                    if (C3746.m11369() < 0) {
                        iM6981 = (i2 - C0630.m2566("۟ᩴ")) * (-111);
                        i4 = ((iM6981 ^ i3) * 30085) ^ (-1326238336);
                        i5 = -1084188360;
                    } else {
                        iM6981 = C2105.m6981("֫۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-22203)) ^ (-1301055885);
                        i5 = -802528001;
                    }
                    break;
                case 1270793491:
                case 1719440667:
                    C1504.m5174(arrayDeque, c9049);
                    c9049 = c9049.f27426;
                    iM6981 = C0630.m2566("ᩳۛ") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-14379)) ^ 1690825839;
                    i5 = 131609388;
                    break;
                case 1627537665:
                case 1980359688:
                    if (c9049 != null) {
                        iM6981 = C2105.m6981("ۖ᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-22363)) ^ 549319208;
                        i5 = 28040488;
                    } else {
                        iM6981 = (C2105.m6981("ܶܶ") ^ i3) * (-115);
                        i4 = ((iM6981 ^ i2) * 19187) ^ 2017679460;
                        i5 = 1393865877;
                    }
                    break;
                case 1785639838:
                case 1957519366:
                    if (C2958.f9394 < 0) {
                        iM6981 = C0630.m2566("ܽ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-22875)) ^ (-1428203694);
                        i5 = 1280199196;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۟ᩴ")) * (-111);
                        i4 = ((iM6981 ^ i3) * 30085) ^ (-1326238336);
                        i5 = -1084188360;
                    }
                    break;
                default:
                    C1294.m4372();
                    C3019.m9255();
                    iM6981 = (i2 - C0630.m2566("۟ᩴ")) * (-111);
                    i4 = ((iM6981 ^ i3) * 30085) ^ (-1326238336);
                    i5 = -1084188360;
                    break;
            }
            return;
        }
    }

    static {
        InterfaceC18883[] interfaceC18883Arr = null;
        int i = -231796682;
        int i2 = C2958.f9394;
        int i3 = C3019.f9544;
        int iM6981 = (i3 - C2105.m6981("ܺۗ")) * 7;
        int i4 = ((iM6981 ^ i2) * (-25265)) ^ (-1285389600);
        int i5 = 1382797747;
        while (true) {
            i = ((((i ^ i2) * 69) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2036851996:
                case 1909156992:
                    if (C0714.m2805()) {
                        iM6981 = (C0630.m2566("ۤۛ") + i2) * (-69);
                        i4 = ((iM6981 ^ i3) * (-27811)) ^ (-948701723);
                        i5 = -2060063805;
                    } else {
                        iM6981 = (C0630.m2566("ۤܳ") ^ i2) * 53;
                        i4 = ((iM6981 ^ i3) * 1009) ^ (-329896574);
                        i5 = -388887557;
                    }
                    break;
                case -2025697154:
                case 1751794425:
                    if (C3019.m9255() <= 0) {
                        iM6981 = C2105.m6981("᩶ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13005)) ^ (-412596593);
                        i5 = -424240251;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۫ۛ")) * 53;
                        i4 = ((iM6981 ^ i2) * (-21847)) ^ 1986090974;
                        i5 = -1891763161;
                    }
                    break;
                case -1927307343:
                case -134034442:
                    if (C11340.f33930 >= 0) {
                        iM6981 = C2105.m6981("᩷ۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2809)) ^ (-366959479);
                        i5 = 1669972568;
                    } else {
                        f56535 = new AtomicLong(1L);
                        if (C2520.f8000 >= 0) {
                            iM6981 = (C0630.m2566("ۤܳ") ^ i2) * 53;
                            i4 = ((iM6981 ^ i3) * 1009) ^ (-329896574);
                            i5 = -388887557;
                        } else {
                            iM6981 = C0630.m2566("᩸ۨ") ^ i3;
                            i4 = ((iM6981 ^ i2) * (-17397)) ^ (-97739834);
                            i5 = -1889383566;
                        }
                    }
                    break;
                case -1767365745:
                case 1535224599:
                    if (C0422.f1886 > 0) {
                        iM6981 = C0630.m2566("᩸ۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4985) ^ 524241260;
                        i5 = -843546427;
                    } else {
                        iM6981 = (C0630.m2566("ۤܳ") ^ i2) * 53;
                        i4 = ((iM6981 ^ i3) * 1009) ^ (-329896574);
                        i5 = -388887557;
                    }
                    break;
                case -1598880889:
                case 185870673:
                    if (C0714.f2697 < 0) {
                        iM6981 = (C0630.m2566("ۤܳ") ^ i2) * 53;
                        i4 = ((iM6981 ^ i3) * 1009) ^ (-329896574);
                        i5 = -388887557;
                    } else {
                        iM6981 = C2105.m6981("᩶ۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27893) ^ 866607030;
                        i5 = 1558783066;
                    }
                    break;
                case -1320446330:
                case 470792951:
                    C22628.m50615();
                    throw new RuntimeException();
                case -1115799289:
                case 761981718:
                    if (C21923.m49329()) {
                        iM6981 = C2105.m6981("᩷ۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2809)) ^ (-366959479);
                        i5 = 1669972568;
                    } else {
                        iM6981 = C0630.m2566("ۚ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-7605)) ^ 573240370;
                        i5 = -160526523;
                    }
                    break;
                case -1081818490:
                case 1470047871:
                    f56531 = interfaceC18883Arr;
                    if (C2272.f7362) {
                        iM6981 = C2105.m6981("᩶ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13005)) ^ (-412596593);
                        i5 = -424240251;
                    } else {
                        iM6981 = (C2105.m6981("ܽܺ") + i2) * (-103);
                        i4 = ((iM6981 ^ i3) * (-24949)) ^ (-1563386997);
                        i5 = -1499588894;
                    }
                    break;
                case -1018742825:
                case 1692845040:
                    if (C1711.f5919) {
                        iM6981 = C2105.m6981("᩶ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13005)) ^ (-412596593);
                        i5 = -424240251;
                    } else {
                        iM6981 = (C2105.m6981("ۢۘ") ^ i2) * (-63);
                        i4 = ((iM6981 ^ i3) * 22077) ^ (-326605335);
                        i5 = -580177183;
                    }
                    break;
                case -437084333:
                case 55348887:
                    if (RunnableC1108.f4040) {
                        iM6981 = C2105.m6981("ܳ᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-26055)) ^ 391379456;
                        i5 = 1378202320;
                    } else {
                        iM6981 = C2105.m6981("᩶ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13005)) ^ (-412596593);
                        i5 = -424240251;
                    }
                    break;
                case 685333443:
                case 988490505:
                    C11340.m28031();
                    C3911.m11924();
                    iM6981 = C2105.m6981("᩶ۢ") ^ i3;
                    i4 = ((iM6981 ^ i2) * 27893) ^ 866607030;
                    i5 = 1558783066;
                    break;
                case 949575995:
                case 1003229385:
                    C3683.m11222();
                    if (C2105.f7037 == 0) {
                        iM6981 = C2105.m6981("᩶ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13005)) ^ (-412596593);
                        i5 = -424240251;
                    } else {
                        iM6981 = C2105.m6981("᩶ۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27893) ^ 866607030;
                        i5 = 1558783066;
                    }
                    break;
                case 1656814066:
                case 1764900553:
                    if (!C2126.f7087) {
                        f56530 = new Object();
                        return;
                    }
                    iM6981 = C0630.m2566("᩸ۡ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 4985) ^ 524241260;
                    i5 = -843546427;
                    break;
                default:
                    interfaceC18883Arr = new InterfaceC18883[0];
                    if (C3683.f11629 >= 0) {
                        iM6981 = C2105.m6981("᩶ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13005)) ^ (-412596593);
                        i5 = -424240251;
                    } else {
                        iM6981 = C0630.m2566("֡᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * 463) ^ (-240679724);
                        i5 = 786855645;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m42359(InterfaceC18883[] interfaceC18883Arr, Throwable th) {
        int length = 0;
        int i = 0;
        InterfaceC18883 interfaceC18883 = null;
        IOException e = null;
        int i2 = -1637670789;
        int i3 = C0483.f2088;
        int i4 = C3683.f11629;
        int iM6981 = (C2105.m6981("ܳۙ") ^ i3) * q.h;
        int i5 = ((iM6981 ^ i4) * (-17249)) ^ 1062669194;
        int i6 = -1183885678;
        while (true) {
            i2 = ((((i2 ^ i4) * (-23131)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2079912789:
                case 396713146:
                    length = interfaceC18883Arr.length;
                    i = 0;
                    iM6981 = (i4 - C0630.m2566("ۘۧ")) * (-19);
                    i5 = ((iM6981 ^ i3) * 6877) ^ (-1918915723);
                    i6 = 1708541424;
                    break;
                case -1835810606:
                case -1138059146:
                    if (i < length) {
                        iM6981 = C0630.m2566("᩷ۖ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 30811) ^ (-921736814);
                        i6 = -1617897664;
                    } else {
                        iM6981 = (C0630.m2566("ܶۘ") ^ i3) * (-69);
                        i5 = ((iM6981 ^ i4) * 8389) ^ (-159199926);
                        i6 = -1888917785;
                    }
                    break;
                case -1809599067:
                case 1085323900:
                    interfaceC18883 = interfaceC18883Arr[i];
                    iM6981 = C0630.m2566("֡ۡ") ^ i4;
                    i5 = ((iM6981 ^ i3) * 25837) ^ 268436393;
                    i6 = -2071084592;
                    break;
                case -1334035743:
                case -293760281:
                    C0714.m2815(th, e);
                    iM6981 = (C0630.m2566("۟۬") + i3) * (-35);
                    i5 = ((iM6981 ^ i4) * 26029) ^ (-205746502);
                    i6 = -1727403449;
                    break;
                case -1287812720:
                case 2063366053:
                    if (C2520.f8000 >= 0) {
                        iM6981 = C0630.m2566("ܳۤ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 31705) ^ 428659232;
                        i6 = 982750941;
                    } else {
                        iM6981 = (C2105.m6981("ۡ۬") ^ i4) * (-95);
                        i5 = ((iM6981 ^ i3) * (-1747)) ^ (-1379259357);
                        i6 = 1926334353;
                    }
                    break;
                case -1239551835:
                case 820673297:
                    if (C2272.f7362) {
                        iM6981 = (C2105.m6981("ۡ۬") ^ i4) * (-95);
                        i5 = ((iM6981 ^ i3) * (-1747)) ^ (-1379259357);
                        i6 = 1926334353;
                    } else {
                        iM6981 = C2105.m6981("ۜۨ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 21745) ^ (-240945981);
                        i6 = 112818499;
                    }
                    break;
                case -1142018731:
                case 856323095:
                    C0798.m2998();
                    iM6981 = (C2105.m6981("᩸ۚ") + i3) * 69;
                    i5 = ((iM6981 ^ i4) * (-12087)) ^ 1523020677;
                    i6 = 983167301;
                    break;
                case -1103643761:
                case 451787328:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C2105.m6981("ۡ۬") ^ i4) * (-95);
                        i5 = ((iM6981 ^ i3) * (-1747)) ^ (-1379259357);
                        i6 = 1926334353;
                    } else {
                        iM6981 = (C2105.m6981("᩸ۚ") + i3) * 69;
                        i5 = ((iM6981 ^ i4) * (-12087)) ^ 1523020677;
                        i6 = 983167301;
                    }
                    break;
                case -1094853181:
                case 945053258:
                    if (C22628.m50615() != 0) {
                        iM6981 = C0630.m2566("ܳۤ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 31705) ^ 428659232;
                        i6 = 982750941;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۡۙ")) * 37;
                        i5 = ((iM6981 ^ i4) * (-3633)) ^ 1359616839;
                        i6 = 1178594846;
                    }
                    break;
                case -951205315:
                case 932104624:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C2105.m6981("ᩴ᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * 29179) ^ 1079011110;
                        i6 = 1253258471;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۨۡ")) * (-105);
                        i5 = ((iM6981 ^ i3) * 2439) ^ 1193977789;
                        i6 = 45213513;
                    }
                    break;
                case -546931586:
                case 316239527:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C0630.m2566("۠ۛ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-23091)) ^ 1111788516;
                        i6 = 1203409798;
                    } else {
                        iM6981 = C2105.m6981("ۤۨ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-1803)) ^ (-2086222394);
                        i6 = -583195360;
                    }
                    break;
                case -461782142:
                case 1879749981:
                    try {
                        C7106.m19116(interfaceC18883);
                        iM6981 = (C0630.m2566("۟۬") + i3) * (-35);
                        i5 = ((iM6981 ^ i4) * 26029) ^ (-205746502);
                        i6 = -1727403449;
                    } catch (IOException e2) {
                        e = e2;
                        iM6981 = C2105.m6981("۬᩻") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-29671)) ^ (-1703821313);
                        i6 = 452633093;
                    }
                    break;
                case -441440561:
                case -48835896:
                    C2958.m9034();
                    if (C4117.f13076 > 0) {
                        iM6981 = C2105.m6981("ᩴ᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * 29179) ^ 1079011110;
                        i6 = 1253258471;
                    } else {
                        iM6981 = (C2105.m6981("᩸ۚ") + i3) * 69;
                        i5 = ((iM6981 ^ i4) * (-12087)) ^ 1523020677;
                        i6 = 983167301;
                    }
                    break;
                case -419117449:
                case 2063771540:
                    i++;
                    iM6981 = (i4 - C0630.m2566("ۘۧ")) * (-19);
                    i5 = ((iM6981 ^ i3) * 6877) ^ (-1918915723);
                    i6 = 1708541424;
                    break;
                case -230792414:
                case -48167005:
                    if (C0798.f2919) {
                        iM6981 = C0630.m2566("۠ۛ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-23091)) ^ 1111788516;
                        i6 = 1203409798;
                    } else {
                        iM6981 = C0630.m2566("᩺ۘ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 739) ^ (-1767598271);
                        i6 = 1529307446;
                    }
                    break;
                case 35565479:
                case 542684691:
                    if (C0630.f2410 <= 0) {
                        iM6981 = C0630.m2566("ܳۤ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 31705) ^ 428659232;
                        i6 = 982750941;
                    } else {
                        iM6981 = C2105.m6981("ᩴۗ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 813) ^ (-1132668314);
                        i6 = -101074609;
                    }
                    break;
                case 226312769:
                case 310446702:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C2105.m6981("ۡ۬") ^ i4) * (-95);
                        i5 = ((iM6981 ^ i3) * (-1747)) ^ (-1379259357);
                        i6 = 1926334353;
                    } else {
                        iM6981 = C2105.m6981("᩷ܿ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-19005)) ^ (-771965729);
                        i6 = 409841558;
                    }
                    break;
                case 293975032:
                case 1409815356:
                    break;
                case 316988077:
                case 1680001975:
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C2105.m6981("᩸ۚ") + i3) * 69;
                        i5 = ((iM6981 ^ i4) * (-12087)) ^ 1523020677;
                        i6 = 983167301;
                    } else {
                        iM6981 = C0630.m2566("ۡܿ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-16233)) ^ 1723564841;
                        i6 = -839195430;
                    }
                    break;
                case 389024680:
                case 2042917097:
                    if (C3911.f12484 >= 0) {
                        iM6981 = (C2105.m6981("᩸ۚ") + i3) * 69;
                        i5 = ((iM6981 ^ i4) * (-12087)) ^ 1523020677;
                        i6 = 983167301;
                    } else {
                        iM6981 = C2105.m6981("ۤ᩻") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-2869)) ^ (-1866934423);
                        i6 = -429659305;
                    }
                    break;
                case 1292084451:
                case 1779118733:
                    if (C4159.m12565() >= 0) {
                        iM6981 = (C2105.m6981("᩸ۚ") + i3) * 69;
                        i5 = ((iM6981 ^ i4) * (-12087)) ^ 1523020677;
                        i6 = 983167301;
                    } else {
                        iM6981 = C2105.m6981("۫ۘ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 795) ^ 31083448;
                        i6 = -858570006;
                    }
                    break;
                default:
                    C1128.m3851();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42329(InterfaceC18883 interfaceC18883, IdentityHashMap identityHashMap, ArrayList arrayList, IdentityHashMap identityHashMap2) {
        C3902 c3902 = null;
        C6018 c6018 = null;
        InterfaceC18883[] interfaceC18883Arr = null;
        int length = 0;
        int i = 0;
        int i2 = 1497655027;
        int i3 = C3746.f11829;
        int i4 = C0050.f910;
        int iM2566 = C0630.m2566("ۡܽ") ^ i4;
        int i5 = ((iM2566 ^ i3) * (-23443)) ^ 2119695054;
        int i6 = -1991385918;
        while (true) {
            i2 = ((((i2 ^ i3) * 20875) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2114166761:
                case -1414783830:
                    if (RunnableC1108.f4040) {
                        iM2566 = C2105.m6981("ۗ᩹") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-30453)) ^ 205412733;
                        i6 = 1912896445;
                    } else {
                        iM2566 = C2105.m6981("ᩴۡ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 1473) ^ (-935587356);
                        i6 = 583409420;
                    }
                    break;
                case -1976039861:
                case -354923287:
                    break;
                case -1948216107:
                case -1089065900:
                    if (C0382.f1805) {
                        iM2566 = (C0630.m2566("ۤۚ") + i4) * 53;
                        i5 = ((iM2566 ^ i3) * (-32287)) ^ 1517753677;
                        i6 = 2124954450;
                    } else {
                        iM2566 = C2105.m6981("᩵ۛ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 4789) ^ (-1416779908);
                        i6 = -251445114;
                    }
                    break;
                case -1886389266:
                case 457351477:
                    C1047.m3599();
                    break;
                case -1845636873:
                case -494211423:
                    if (C3245.m9925() != 0) {
                        iM2566 = C2105.m6981("᩵ۛ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 4789) ^ (-1416779908);
                        i6 = -251445114;
                    } else {
                        iM2566 = C0630.m2566("ۖۨ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-10823)) ^ 2005121267;
                        i6 = 1860305552;
                    }
                    break;
                case -1835742012:
                case -961347143:
                    c6018 = (C6018) interfaceC18883;
                    if (C2167.m7148(identityHashMap2, c6018, Boolean.TRUE) != null) {
                        iM2566 = C0630.m2566("᩺ۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 32521) ^ (-960174830);
                        i6 = 1990074526;
                    } else {
                        iM2566 = (C0630.m2566("ۜۖ") + i4) * (-79);
                        i5 = ((iM2566 ^ i3) * (-26847)) ^ (-739750018);
                        i6 = 820777940;
                    }
                    break;
                case -1748382337:
                case 228943563:
                    if (!C1916.f6442) {
                        iM2566 = C2105.m6981("ᩴۡ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 1473) ^ (-935587356);
                        i6 = 583409420;
                    } else {
                        iM2566 = (C2105.m6981("᩹۫") + i3) * (-25);
                        i5 = ((iM2566 ^ i4) * 16003) ^ 1434931702;
                        i6 = -1860610948;
                    }
                    break;
                case -1608774277:
                case -1569117194:
                    if (C3911.f12484 >= 0) {
                        iM2566 = C2105.m6981("᩵ۛ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 4789) ^ (-1416779908);
                        i6 = -251445114;
                    } else {
                        iM2566 = (C2105.m6981("᩹۫") + i3) * (-25);
                        i5 = ((iM2566 ^ i4) * 16003) ^ 1434931702;
                        i6 = -1860610948;
                    }
                    break;
                case -1339598084:
                case 970138831:
                    c3902 = (C3902) interfaceC18883;
                    if (C2167.m7148(identityHashMap, c3902, Boolean.TRUE) == null) {
                        iM2566 = (C0630.m2566("᩻᩶") + i3) * (-127);
                        i5 = ((iM2566 ^ i4) * (-25497)) ^ (-2080785684);
                        i6 = 428835926;
                    } else {
                        iM2566 = C0630.m2566("᩺ۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 32521) ^ (-960174830);
                        i6 = 1990074526;
                    }
                    break;
                case -1260053097:
                case -517997546:
                    C7106.m19117(arrayList, c3902);
                    break;
                case -1059400437:
                case 1325854912:
                    if (interfaceC18883 instanceof C3902) {
                        iM2566 = C0630.m2566("ۛ۫") ^ i4;
                        i5 = ((iM2566 ^ i3) * 21571) ^ (-997309911);
                        i6 = 1283628231;
                    } else {
                        iM2566 = (C2105.m6981("֫֫") ^ i3) * (-31);
                        i5 = ((iM2566 ^ i4) * (-16277)) ^ (-2053590279);
                        i6 = 1117014514;
                    }
                    break;
                case -1042217436:
                case -600017086:
                    m42329(interfaceC18883Arr[i], identityHashMap, arrayList, identityHashMap2);
                    i++;
                    iM2566 = C0630.m2566("ܰ֨") ^ i3;
                    i5 = ((iM2566 ^ i4) * (-16299)) ^ (-337294018);
                    i6 = -1490162765;
                    break;
                case -1040955602:
                case 887129630:
                    if (i < length) {
                        iM2566 = C0630.m2566("ۛܰ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 1447) ^ 735726587;
                        i6 = 1027915994;
                    } else {
                        iM2566 = C0630.m2566("᩺ۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 32521) ^ (-960174830);
                        i6 = 1990074526;
                    }
                    break;
                case -934153016:
                case 138121383:
                    if (C7106.f21815 != 0) {
                        iM2566 = (i3 - C0630.m2566("ۜۡ")) * (-117);
                        i5 = ((iM2566 ^ i4) * 16297) ^ (-2015473874);
                        i6 = 1594494555;
                    } else {
                        iM2566 = (C2105.m6981("ܺۤ") ^ i4) * (-121);
                        i5 = ((iM2566 ^ i3) * (-10115)) ^ (-180908751);
                        i6 = -628432857;
                    }
                    break;
                case -921828073:
                case 1335694420:
                    if (interfaceC18883 instanceof C6018) {
                        iM2566 = (C2105.m6981("ۚᩳ") ^ i3) * (-105);
                        i5 = ((iM2566 ^ i4) * (-16759)) ^ 1044900442;
                        i6 = 1110318496;
                    } else {
                        iM2566 = C0630.m2566("᩺ۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 32521) ^ (-960174830);
                        i6 = 1990074526;
                    }
                    break;
                case -327943601:
                case 941893857:
                    interfaceC18883Arr = c6018.f18478;
                    length = interfaceC18883Arr.length;
                    i = 0;
                    iM2566 = C0630.m2566("ܰ֨") ^ i3;
                    i5 = ((iM2566 ^ i4) * (-16299)) ^ (-337294018);
                    i6 = -1490162765;
                    break;
                case 247517521:
                case 1978146293:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C2105.m6981("ᩴۡ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 1473) ^ (-935587356);
                        i6 = 583409420;
                    } else {
                        iM2566 = (C2105.m6981("ۧ᩶") + i3) * (-121);
                        i5 = ((iM2566 ^ i4) * (-31457)) ^ (-997152767);
                        i6 = 934459878;
                    }
                    break;
                case 350784509:
                case 423842354:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C2105.m6981("ܰ֫") + i4) * 127;
                        i5 = ((iM2566 ^ i3) * (-23861)) ^ (-1261794546);
                        i6 = -640345388;
                    } else {
                        iM2566 = C2105.m6981("ۘܶ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 19767) ^ (-1195437940);
                        i6 = -1168930647;
                    }
                    break;
                case 631578482:
                case 1432903338:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C2105.m6981("᩹۫") + i3) * (-25);
                        i5 = ((iM2566 ^ i4) * 16003) ^ 1434931702;
                        i6 = -1860610948;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ۧ֨")) * 91;
                        i5 = ((iM2566 ^ i3) * (-17387)) ^ 1799910312;
                        i6 = -685767332;
                    }
                    break;
                case 821333927:
                case 1328873722:
                    if (C22628.m50615() != 0) {
                        iM2566 = (i3 - C0630.m2566("ۜۡ")) * (-117);
                        i5 = ((iM2566 ^ i4) * 16297) ^ (-2015473874);
                        i6 = 1594494555;
                    } else {
                        iM2566 = C0630.m2566("᩹ۘ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-29629)) ^ (-1034652955);
                        i6 = -148397203;
                    }
                    break;
                case 1142713604:
                case 2065648739:
                    C1128.m3851();
                    iM2566 = (C2105.m6981("ܰ֫") + i4) * 127;
                    i5 = ((iM2566 ^ i3) * (-23861)) ^ (-1261794546);
                    i6 = -640345388;
                    break;
                case 1190547132:
                case 1502198688:
                    if (C3683.f11629 >= 0) {
                        iM2566 = C2105.m6981("ᩴۡ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 1473) ^ (-935587356);
                        i6 = 583409420;
                    } else {
                        iM2566 = C2105.m6981("۫ۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-9681)) ^ (-891576931);
                        i6 = -416942660;
                    }
                    break;
                case 1380318613:
                case 1701725213:
                    C2167.m7155();
                    if (C0422.f1886 > 0) {
                        iM2566 = C2105.m6981("ᩴۡ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 1473) ^ (-935587356);
                        i6 = 583409420;
                    } else {
                        iM2566 = (C2105.m6981("ܰ֫") + i4) * 127;
                        i5 = ((iM2566 ^ i3) * (-23861)) ^ (-1261794546);
                        i6 = -640345388;
                    }
                    break;
                default:
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C2105.m6981("᩹۫") + i3) * (-25);
                        i5 = ((iM2566 ^ i4) * 16003) ^ 1434931702;
                        i6 = -1860610948;
                    } else {
                        iM2566 = C0630.m2566("۟ܽ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-18001)) ^ 604873201;
                        i6 = 2001032608;
                    }
                    break;
            }
            return;
        }
    }

    public C18177(InterfaceC18883 interfaceC18883, File file) {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        int iM6982;
        int i5;
        int i6;
        InterfaceC18883 interfaceC18884 = interfaceC18883;
        int length = 0;
        C4108 c4108M45129 = null;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 2050153268;
        int i10 = C1773.f6144;
        int i11 = ViewOnClickListenerC1958.f6529;
        short s = f56533[0];
        int i12 = (s * 24848) - ((s * s) + 154355776) > 0 ? 46010 : 39074;
        int iM2567 = C0630.m2566("᩺ۗ") ^ i11;
        int i13 = ((iM2567 ^ i10) * (-14465)) ^ (-468465290);
        int i14 = iM2567 ^ (-1026200073);
        IdentityHashMap identityHashMap = null;
        int i15 = i13;
        C9047 c9047M45107 = null;
        while (true) {
            int i16 = i15;
            while (true) {
                i9 = i14 ^ (i16 & (((i9 ^ i10) * 6231) >> 31));
                switch (i9) {
                    case -2096104349:
                    case 528444431:
                        this.f56548 = new IdentityHashMap();
                        if (ViewOnClickListenerC1958.f6529 > 0) {
                            this.f56545 = new C21541();
                            if (C2105.f7037 == 0) {
                                iM6981 = (C2105.m6981("ᩴۧ") + i10) * 57;
                                i3 = ((iM6981 ^ i11) * (-4119)) ^ 41475274;
                                i4 = 1902210687;
                                i16 = i3;
                                i14 = iM6981 ^ i4;
                            } else {
                                int iM6983 = (C2105.m6981("᩷᩵") ^ i10) * 43;
                                int i17 = ((iM6983 ^ i11) * 21275) ^ 1583486709;
                                i14 = 1739598246 ^ iM6983;
                                interfaceC18884 = interfaceC18883;
                                i16 = i17;
                                identityHashMap = null;
                            }
                        } else {
                            iM2566 = (C2105.m6981("᩹۠") + i10) * (-7);
                            i = ((iM2566 ^ i11) * 14777) ^ 1603276434;
                            i2 = 1984919736;
                            i14 = i2 ^ iM2566;
                            interfaceC18884 = interfaceC18883;
                            i16 = i;
                        }
                        break;
                    case -1762266531:
                    case -732395377:
                        this.f56540 = f56535.getAndIncrement();
                        if (!C2126.f7087) {
                            this.f56542 = new ArrayDeque();
                            if (C4075.m12263() > 0) {
                                this.f56536 = new ArrayDeque();
                                if (!C1504.f5354) {
                                    identityHashMap = new IdentityHashMap();
                                    this.f56546 = identityHashMap;
                                    if (!C1504.f5354) {
                                        iM2566 = C0630.m2566("֡֨") ^ i11;
                                        i = ((iM2566 ^ i10) * (-30749)) ^ 1255790750;
                                        i2 = 1264352287;
                                    }
                                }
                                int iM6984 = (C2105.m6981("᩷᩵") ^ i10) * 43;
                                int i18 = ((iM6984 ^ i11) * 21275) ^ 1583486709;
                                i14 = 1739598246 ^ iM6984;
                                interfaceC18884 = interfaceC18883;
                                i16 = i18;
                                identityHashMap = null;
                            } else {
                                iM2566 = (C2105.m6981("֨۫") + i11) * 61;
                                i = ((iM2566 ^ i10) * 18271) ^ 1602835558;
                                i2 = 1930320900;
                            }
                        } else {
                            iM2566 = (C2105.m6981("᩹۠") + i10) * (-7);
                            i = ((iM2566 ^ i11) * 14777) ^ 1603276434;
                            i2 = 1984919736;
                        }
                        i14 = i2 ^ iM2566;
                        interfaceC18884 = interfaceC18883;
                        i16 = i;
                        break;
                    case -1102986722:
                    case -992340482:
                        C1294.m4372();
                        if (C7811.f24123 < 0) {
                            iM2566 = (C2105.m6981("᩹۠") + i10) * (-7);
                            i = ((iM2566 ^ i11) * 14777) ^ 1603276434;
                            i2 = 1984919736;
                            i14 = i2 ^ iM2566;
                            interfaceC18884 = interfaceC18883;
                            i16 = i;
                        }
                        iM2566 = (C2105.m6981("֨۫") + i11) * 61;
                        i = ((iM2566 ^ i10) * 18271) ^ 1602835558;
                        i2 = 1930320900;
                        i14 = i2 ^ iM2566;
                        interfaceC18884 = interfaceC18883;
                        i16 = i;
                        break;
                    case -822818515:
                    case 1205629869:
                        if (C1504.f5354) {
                            iM6982 = C2105.m6981("֡᩸") ^ i11;
                            i5 = ((iM6982 ^ i10) * (-30387)) ^ 1153008812;
                            i6 = 212929214;
                            i15 = i5;
                            i14 = iM6982 ^ i6;
                        }
                        iM2566 = (C2105.m6981("֨۫") + i11) * 61;
                        i = ((iM2566 ^ i10) * 18271) ^ 1602835558;
                        i2 = 1930320900;
                        i14 = i2 ^ iM2566;
                        interfaceC18884 = interfaceC18883;
                        i16 = i;
                        break;
                    case -546981220:
                    case 1122809089:
                        C11003.requireNonNull(interfaceC18884, C7811.m20837(sArr, i7, i8, i12));
                        length = interfaceC18883.length();
                        if (length >= 0) {
                            iM6981 = C2105.m6981("֡᩷") ^ i10;
                            i3 = ((iM6981 ^ i11) * (-28855)) ^ (-1052763324);
                            i4 = 1234376951;
                        } else {
                            iM6981 = (C0630.m2566("ܺܶ") ^ i10) * (-99);
                            i3 = ((iM6981 ^ i11) * 669) ^ 1427452972;
                            i4 = -1779229124;
                        }
                        i16 = i3;
                        i14 = iM6981 ^ i4;
                        break;
                    case -333991874:
                    case -169686099:
                        C3432.m10477();
                        RunnableC3474.m10630();
                        iM6982 = C2105.m6981("֡᩸") ^ i11;
                        i5 = ((iM6982 ^ i10) * (-30387)) ^ 1153008812;
                        i6 = 212929214;
                        i15 = i5;
                        i14 = iM6982 ^ i6;
                        break;
                    case 428048798:
                    case 1847562898:
                        sArr = f56533;
                        i7 = 1;
                        i8 = 6;
                        if (C7811.f24123 < 0) {
                            iM6981 = C2105.m6981("᩹ۡ") ^ i11;
                            i3 = ((iM6981 ^ i10) * 3493) ^ (-1875405424);
                            i4 = 382479038;
                            i16 = i3;
                            i14 = iM6981 ^ i4;
                        } else {
                            iM2566 = (C2105.m6981("᩹۠") + i10) * (-7);
                            i = ((iM2566 ^ i11) * 14777) ^ 1603276434;
                            i2 = 1984919736;
                            i14 = i2 ^ iM2566;
                            interfaceC18884 = interfaceC18883;
                            i16 = i;
                        }
                        break;
                    case 1334603347:
                    case 2034745822:
                        throw new IllegalArgumentException(C3911.m11919(f56533, 7, 22, i12));
                    case 1412130284:
                    case 2141704982:
                        if (C3432.m10477() <= 0) {
                            iM6982 = C2105.m6981("֡᩸") ^ i11;
                            i5 = ((iM6982 ^ i10) * (-30387)) ^ 1153008812;
                            i6 = 212929214;
                        } else {
                            iM6982 = C0630.m2566("ۘ֡") ^ i10;
                            i5 = ((iM6982 ^ i11) * (-17709)) ^ (-850161397);
                            i6 = -614501486;
                        }
                        i15 = i5;
                        i14 = iM6982 ^ i6;
                        break;
                    case 1485989502:
                    case 1968061932:
                        C3019.m9255();
                        throw new RuntimeException();
                    case 2036003599:
                    case 2053623696:
                        C12100 c12100M32552 = C13510.m32552(length, false);
                        long jM12331 = c4108M45129.m12331();
                        if (!C3663.f11553) {
                            long jM12332 = c4108M45129.m12332();
                            if (C4159.f13567) {
                                this.f56537 = new C7429(c9047M45107, c12100M32552, false, 0L, jM12331, jM12332, 0L, 0L, 0L);
                                this.f56543 = file;
                                return;
                            }
                            iM6982 = C0630.m2566("ۘ֡") ^ i10;
                            i5 = ((iM6982 ^ i11) * (-17709)) ^ (-850161397);
                            i6 = -614501486;
                            i15 = i5;
                            i14 = iM6982 ^ i6;
                        }
                        iM2566 = (C2105.m6981("֨۫") + i11) * 61;
                        i = ((iM2566 ^ i10) * 18271) ^ 1602835558;
                        i2 = 1930320900;
                        i14 = i2 ^ iM2566;
                        interfaceC18884 = interfaceC18883;
                        i16 = i;
                        break;
                    default:
                        this.f56549 = interfaceC18884;
                        C0714.m2809(identityHashMap, interfaceC18884, Boolean.TRUE);
                        c9047M45107 = C19631.m45107(interfaceC18883);
                        c4108M45129 = C19631.m45129(c9047M45107);
                        if (C4616.f14690 > 0) {
                            int iM2568 = (i11 - C0630.m2566("ۡ֨")) * 67;
                            i = ((iM2568 ^ i10) * 19367) ^ (-1595008139);
                            i14 = iM2568 ^ 2138923104;
                            i16 = i;
                        } else {
                            int iM6985 = (C2105.m6981("᩷᩵") ^ i10) * 43;
                            int i19 = ((iM6985 ^ i11) * 21275) ^ 1583486709;
                            i14 = 1739598246 ^ iM6985;
                            interfaceC18884 = interfaceC18883;
                            i16 = i19;
                            identityHashMap = null;
                        }
                        break;
                }
            }
        }
    }

    public C18177(C5477 c5477, C7429 c7429, C21541 c21541) {
        long andIncrement = 0;
        IdentityHashMap identityHashMap = null;
        IdentityHashMap identityHashMap2 = null;
        int i = 641231999;
        int i2 = C3245.f10203;
        int i3 = C0422.f1886;
        int iM2566 = C0630.m2566("ۤ۫") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-10201)) ^ 2141405763;
        int i5 = -1003365520;
        while (true) {
            i = ((((i ^ i3) * (-25947)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2109914794:
                case 1982576917:
                    C11340.m28031();
                    if (C0483.f2088 < 0) {
                        iM2566 = C2105.m6981("ۘ֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * 28239) ^ 950741094;
                        i5 = 826062214;
                    } else {
                        iM2566 = (C2105.m6981("ۚܿ") + i2) * (-119);
                        i4 = ((iM2566 ^ i3) * (-15675)) ^ (-1966286713);
                        i5 = 1089235374;
                    }
                    break;
                case -2104387195:
                case 1441626981:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C2105.m6981("ۚܿ") + i2) * (-119);
                        i4 = ((iM2566 ^ i3) * (-15675)) ^ (-1966286713);
                        i5 = 1089235374;
                    } else {
                        this.f56542 = new ArrayDeque();
                        if (C4117.m12364() != 0) {
                            iM2566 = C2105.m6981("ۜᩳ") ^ i2;
                            i4 = ((iM2566 ^ i3) * 32017) ^ 1362442781;
                            i5 = -1606093271;
                        } else {
                            iM2566 = C2105.m6981("᩵ۧ") ^ i3;
                            i4 = ((iM2566 ^ i2) * 25261) ^ 1988489207;
                            i5 = 840778339;
                        }
                    }
                    break;
                case -2077484692:
                case 1553793453:
                    this.f56546 = identityHashMap;
                    identityHashMap2 = new IdentityHashMap();
                    if (C2105.f7037 != 0) {
                        iM2566 = C0630.m2566("᩺ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 10799) ^ 81047415;
                        i5 = 561299942;
                    } else {
                        iM2566 = (C2105.m6981("᩷ܿ") ^ i2) * 33;
                        i4 = ((iM2566 ^ i3) * (-16185)) ^ (-57106919);
                        i5 = 129588394;
                    }
                    break;
                case -1908156803:
                case 446438664:
                    C22628.m50615();
                    C4117.m12364();
                    throw new RuntimeException();
                case -1513325673:
                case 966577629:
                    if (C7811.m20844() != 0) {
                        iM2566 = (C2105.m6981("ۚܿ") + i2) * (-119);
                        i4 = ((iM2566 ^ i3) * (-15675)) ^ (-1966286713);
                        i5 = 1089235374;
                    } else {
                        iM2566 = (C2105.m6981("ۨܽ") + i2) * 39;
                        i4 = ((iM2566 ^ i3) * (-11849)) ^ 942171411;
                        i5 = 1510093507;
                    }
                    break;
                case -1176656805:
                case -310274792:
                    C1916.m6308();
                    RunnableC1937.m6387();
                    iM2566 = (C2105.m6981("ۨܽ") + i2) * 39;
                    i4 = ((iM2566 ^ i3) * (-11849)) ^ 942171411;
                    i5 = 1510093507;
                    break;
                case -890970148:
                case 1053373397:
                    identityHashMap = new IdentityHashMap();
                    if (C3746.f11829 <= 0) {
                        iM2566 = C2105.m6981("ۜᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 32017) ^ 1362442781;
                        i5 = -1606093271;
                    } else {
                        iM2566 = (C0630.m2566("᩻᩸") + i3) * 57;
                        i4 = ((iM2566 ^ i2) * 22109) ^ 1084625519;
                        i5 = 154308482;
                    }
                    break;
                case -881043482:
                case 1199778636:
                    this.f56540 = andIncrement;
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C2105.m6981("ۚܿ") + i2) * (-119);
                        i4 = ((iM2566 ^ i3) * (-15675)) ^ (-1966286713);
                        i5 = 1089235374;
                    } else {
                        iM2566 = (C0630.m2566("᩸ۡ") ^ i3) * (-35);
                        i4 = ((iM2566 ^ i2) * (-14423)) ^ (-1507385280);
                        i5 = 447090765;
                    }
                    break;
                case -763871320:
                case 1324410697:
                    new C21541();
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C2105.m6981("ۨܽ") + i2) * 39;
                        i4 = ((iM2566 ^ i3) * (-11849)) ^ 942171411;
                        i5 = 1510093507;
                    } else {
                        iM2566 = C2105.m6981("᩹۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3381) ^ 342292120;
                        i5 = 1880687732;
                    }
                    break;
                case -693737612:
                case 1988069226:
                    this.f56548 = identityHashMap2;
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C2105.m6981("ۚܿ") + i2) * (-119);
                        i4 = ((iM2566 ^ i3) * (-15675)) ^ (-1966286713);
                        i5 = 1089235374;
                    } else {
                        iM2566 = C2105.m6981("۬ۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 18469) ^ 576755263;
                        i5 = -896294458;
                    }
                    break;
                case -431464545:
                case 1693735070:
                    andIncrement = f56535.getAndIncrement();
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("᩺ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 10799) ^ 81047415;
                        i5 = 561299942;
                    } else {
                        iM2566 = (C2105.m6981("᩺۟") ^ i2) * (-127);
                        i4 = ((iM2566 ^ i3) * (-31059)) ^ 392142326;
                        i5 = 775170731;
                    }
                    break;
                case 701968206:
                case 865519688:
                    C3663.m11168();
                    if (C3537.f11231 >= 0) {
                        iM2566 = C0630.m2566("᩺ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 10799) ^ 81047415;
                        i5 = 561299942;
                    } else {
                        iM2566 = (C2105.m6981("ۨܽ") + i2) * 39;
                        i4 = ((iM2566 ^ i3) * (-11849)) ^ 942171411;
                        i5 = 1510093507;
                    }
                    break;
                case 720714352:
                case 2129845400:
                    this.f56536 = new ArrayDeque();
                    if (C3019.m9255() <= 0) {
                        iM2566 = C0630.m2566("᩺ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 10799) ^ 81047415;
                        i5 = 561299942;
                    } else {
                        iM2566 = (C2105.m6981("ۛܶ") ^ i2) * (-79);
                        i4 = ((iM2566 ^ i3) * (-31511)) ^ (-1671210053);
                        i5 = 1648976438;
                    }
                    break;
                case 951215481:
                case 1382246298:
                    this.f56549 = c5477;
                    this.f56545 = c21541;
                    this.f56537 = c7429;
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ۘ֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * 28239) ^ 950741094;
                        i5 = 826062214;
                    } else {
                        iM2566 = C2105.m6981("ܳۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 22887) ^ (-2040507765);
                        i5 = 1467274327;
                    }
                    break;
                default:
                    C0714.m2809(identityHashMap, c5477, Boolean.TRUE);
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m42299(int i) {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i2 = 601381946;
        int i3 = C0483.f2088;
        int i4 = C0630.f2410;
        int iM2566 = (C0630.m2566("᩷۬") + i4) * (-37);
        int i5 = ((iM2566 ^ i3) * (-9687)) ^ (-492774151);
        int i6 = -1421127044;
        while (true) {
            i2 = ((((i2 ^ i3) * (-32337)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2097665898:
                case -1081422103:
                    return C11340.m28024(32L, j3);
                case -2090672561:
                case 789282252:
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C0630.m2566("ܶܿ") + i3) * 17;
                        i5 = ((iM2566 ^ i4) * 22493) ^ 1746799569;
                        i6 = 204604600;
                    } else {
                        iM2566 = C2105.m6981("ۜۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 19859) ^ (-1056374964);
                        i6 = 27232367;
                    }
                    break;
                case -2018059921:
                case 1325721957:
                    if (C1916.m6308() >= 0) {
                        iM2566 = (C0630.m2566("ܶܿ") + i3) * 17;
                        i5 = ((iM2566 ^ i4) * 22493) ^ 1746799569;
                        i6 = 204604600;
                    } else {
                        iM2566 = C0630.m2566("᩹ۨ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-3909)) ^ 223266373;
                        i6 = 817471610;
                    }
                    break;
                case -1768212732:
                case 2101962157:
                    if (C2105.f7037 != 0) {
                        iM2566 = C0630.m2566("ܶ۠") ^ i4;
                        i5 = ((iM2566 ^ i3) * 7003) ^ (-1442485962);
                        i6 = -640493725;
                    } else {
                        iM2566 = C0630.m2566("ᩳۛ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-21535)) ^ (-1595408921);
                        i6 = -1876654674;
                    }
                    break;
                case -1559607143:
                case -1261081458:
                    if (i > 1048576) {
                        iM2566 = C2105.m6981("᩶ۢ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 16797) ^ (-728746213);
                        i6 = -499040515;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ᩳ᩸")) * (-19);
                        i5 = ((iM2566 ^ i3) * 22495) ^ 412859236;
                        i6 = -266865095;
                    }
                    break;
                case -1259185914:
                case 2010296662:
                    if (C0798.f2919) {
                        iM2566 = (C0630.m2566("ܶܿ") + i3) * 17;
                        i5 = ((iM2566 ^ i4) * 22493) ^ 1746799569;
                        i6 = 204604600;
                    } else {
                        iM2566 = (C0630.m2566("֫ۗ") + i4) * (-109);
                        i5 = ((iM2566 ^ i3) * (-30931)) ^ (-1003948392);
                        i6 = -188263790;
                    }
                    break;
                case -1257571980:
                case 557321954:
                    j = i;
                    j2 = 16;
                    if (C0422.f1886 <= 0) {
                        iM2566 = C2105.m6981("ۜۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 19859) ^ (-1056374964);
                        i6 = 27232367;
                    } else {
                        iM2566 = C0630.m2566("᩸ۜ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-14573)) ^ 2145429283;
                        i6 = 1808938081;
                    }
                    break;
                case -1078859308:
                case -454628317:
                    if (C5695.m16023() >= 0) {
                        iM2566 = C2105.m6981("ۜۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 19859) ^ (-1056374964);
                        i6 = 27232367;
                    } else {
                        iM2566 = (C2105.m6981("ۗ᩵") + i4) * 61;
                        i5 = ((iM2566 ^ i3) * (-30389)) ^ (-111878255);
                        i6 = -314502536;
                    }
                    break;
                case -974527353:
                case -581300940:
                    C3432.m10477();
                    C0050.m940();
                    iM2566 = C2105.m6981("ۜۖ") ^ i3;
                    i5 = ((iM2566 ^ i4) * 19859) ^ (-1056374964);
                    i6 = 27232367;
                    break;
                case -785112344:
                case 1753061153:
                    if (C1773.m5908() <= 0) {
                        iM2566 = C0630.m2566("ܶ۠") ^ i4;
                        i5 = ((iM2566 ^ i3) * 7003) ^ (-1442485962);
                        i6 = -640493725;
                    } else {
                        iM2566 = C0630.m2566("᩸ܰ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 22871) ^ 1691586169;
                        i6 = -2119076431;
                    }
                    break;
                case -620584625:
                case 511137741:
                    if (C2520.m8026()) {
                        iM2566 = C0630.m2566("ܶ۠") ^ i4;
                        i5 = ((iM2566 ^ i3) * 7003) ^ (-1442485962);
                        i6 = -640493725;
                    } else {
                        iM2566 = C0630.m2566("ۛۜ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-20031)) ^ 1046377303;
                        i6 = -1858646406;
                    }
                    break;
                case -558103274:
                case 396011383:
                    C4159.m12565();
                    return 0L;
                case -275132938:
                case 1790304829:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C2105.m6981("ۜۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 19859) ^ (-1056374964);
                        i6 = 27232367;
                    } else {
                        iM2566 = C0630.m2566("֨۠") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-23345)) ^ 628126810;
                        i6 = -56666169;
                    }
                    break;
                case -63116560:
                case 1459755896:
                    j3 = j * j2;
                    if (C1916.f6442) {
                        iM2566 = (C2105.m6981("᩻ۤ") ^ i4) * (-27);
                        i5 = ((iM2566 ^ i3) * (-22371)) ^ (-1029427657);
                        i6 = -796763646;
                    } else {
                        iM2566 = C0630.m2566("ۡۜ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 1135) ^ 1663659573;
                        i6 = 1002792507;
                    }
                    break;
                case 1029788626:
                case 1934477228:
                    return C13132.FOREVER_NS;
                case 1113322944:
                case 1897973196:
                    if (!C0382.m1848()) {
                        iM2566 = C2105.m6981("ۜۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 19859) ^ (-1056374964);
                        i6 = 27232367;
                    } else {
                        iM2566 = C0630.m2566("ܶ۠") ^ i4;
                        i5 = ((iM2566 ^ i3) * 7003) ^ (-1442485962);
                        i6 = -640493725;
                    }
                    break;
                case 1218007403:
                case 1309983512:
                    if (C0483.m2121()) {
                        iM2566 = (C2105.m6981("ܽܿ") + i4) * (-77);
                        i5 = ((iM2566 ^ i3) * 4703) ^ 1816395885;
                        i6 = -276805824;
                    } else {
                        iM2566 = (C0630.m2566("ܶܿ") + i3) * 17;
                        i5 = ((iM2566 ^ i4) * 22493) ^ 1746799569;
                        i6 = 204604600;
                    }
                    break;
                case 1220445669:
                case 1292090550:
                    if (i > 0) {
                        iM2566 = C2105.m6981("۟ۧ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 7021) ^ 2096522942;
                        i6 = -105219017;
                    } else {
                        iM2566 = C2105.m6981("᩶ۢ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 16797) ^ (-728746213);
                        i6 = -499040515;
                    }
                    break;
                default:
                    if (C4117.f13076 <= 0) {
                        iM2566 = C0630.m2566("ۡۜ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 1135) ^ 1663659573;
                        i6 = 1002792507;
                    } else {
                        iM2566 = (C0630.m2566("ܶ֡") + i3) * (-93);
                        i5 = ((iM2566 ^ i4) * (-19147)) ^ 853920949;
                        i6 = -2018830485;
                    }
                    break;
            }
        }
    }

    public final int length() {
        return this.f56537.m19966();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m42385() {
        return this.f56537.f22841;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m42394() {
        return this.f56537.f22834;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m42395() {
        return this.f56539;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m42360(long j) {
        long j2 = 0;
        long jM3495 = 0;
        int i = 1445276286;
        int i2 = C4616.f14690;
        int i3 = C0630.f2410;
        int iM6981 = (C2105.m6981("֡ۧ") + i2) * 63;
        int i4 = ((iM6981 ^ i3) * (-27433)) ^ 1059334827;
        int i5 = 1290357253;
        while (true) {
            i = ((((i ^ i3) * 5467) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1924713246:
                case -574118986:
                    jM3495 = C1005.m3495(j, j2);
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (C0630.m2566("ۙ۠") + i3) * 63;
                        i4 = ((iM6981 ^ i2) * (-4845)) ^ (-1743697889);
                        i5 = 1669133559;
                    } else {
                        iM6981 = C2105.m6981("ۡ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-19075)) ^ (-708754102);
                        i5 = 1281519347;
                    }
                    break;
                case -1891340405:
                case 789000707:
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C0630.m2566("ۙ۠") + i3) * 63;
                        i4 = ((iM6981 ^ i2) * (-4845)) ^ (-1743697889);
                        i5 = 1669133559;
                    } else {
                        iM6981 = C2105.m6981("ۛ᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * 24217) ^ (-120890771);
                        i5 = -1149266062;
                    }
                    break;
                case -1854092080:
                case 60204174:
                    if (!C2272.f7362) {
                        iM6981 = C2105.m6981("᩺ۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26055) ^ (-1022031769);
                        i5 = -1184858290;
                    } else {
                        iM6981 = (C2105.m6981("ܶۚ") + i3) * 43;
                        i4 = ((iM6981 ^ i2) * 32565) ^ (-1813818770);
                        i5 = 813404009;
                    }
                    break;
                case -1815676491:
                case 1653297120:
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("֡ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14821) ^ 1510413708;
                        i5 = 1189464309;
                    } else {
                        iM6981 = C2105.m6981("ۡ֨") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-4969)) ^ (-1292411708);
                        i5 = 208614367;
                    }
                    break;
                case -1648056654:
                case 465751753:
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("᩺ۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26055) ^ (-1022031769);
                        i5 = -1184858290;
                    } else {
                        iM6981 = C2105.m6981("֨ܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-10029)) ^ (-1738797508);
                        i5 = 1447628534;
                    }
                    break;
                case -1613194716:
                case -896608649:
                    C3663.m11168();
                    iM6981 = (C2105.m6981("ܶۚ") + i3) * 43;
                    i4 = ((iM6981 ^ i2) * 32565) ^ (-1813818770);
                    i5 = 813404009;
                    break;
                case -1465157697:
                case 1792630661:
                    if (jM3495 <= 67108864) {
                        iM6981 = (C2105.m6981("᩵۬") + i2) * 35;
                        i4 = ((iM6981 ^ i3) * (-29285)) ^ 1808472942;
                        i5 = -179182569;
                    } else {
                        iM6981 = (C0630.m2566("۬ܳ") + i3) * 45;
                        i4 = ((iM6981 ^ i2) * 27071) ^ 1566500201;
                        i5 = 1304377012;
                    }
                    break;
                case -1335932008:
                case 1337729022:
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C2105.m6981("ܶۚ") + i3) * 43;
                        i4 = ((iM6981 ^ i2) * 32565) ^ (-1813818770);
                        i5 = 813404009;
                    } else {
                        iM6981 = C2105.m6981("ۜ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-16715)) ^ 1437752660;
                        i5 = 943411133;
                    }
                    break;
                case -1183749006:
                case 430165549:
                    return true;
                case -1128644453:
                case 1616814930:
                    if (C11340.m28031()) {
                        iM6981 = C2105.m6981("᩺ۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26055) ^ (-1022031769);
                        i5 = -1184858290;
                    } else {
                        iM6981 = C2105.m6981("֡᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9265)) ^ 7710490;
                        i5 = -875762836;
                    }
                    break;
                case -1124188675:
                case -468034909:
                    return false;
                case -998162593:
                case 1228966000:
                    j2 = 8272;
                    if (C21923.f70183 != 0) {
                        iM6981 = C2105.m6981("֡ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14821) ^ 1510413708;
                        i5 = 1189464309;
                    } else {
                        iM6981 = (C2105.m6981("᩺ۨ") ^ i2) * (-27);
                        i4 = ((iM6981 ^ i3) * 2027) ^ 133195526;
                        i5 = 1512081150;
                    }
                    break;
                case -686203473:
                case 195390695:
                    C1711.m5736();
                    return false;
                case -661907315:
                case 1457456766:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C2105.m6981("֡ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14821) ^ 1510413708;
                        i5 = 1189464309;
                    } else {
                        iM6981 = (C0630.m2566("ۢۨ") + i2) * 61;
                        i4 = ((iM6981 ^ i3) * 11741) ^ 2091683840;
                        i5 = 369074797;
                    }
                    break;
                case -456974672:
                case 217667387:
                    if (C7106.m19120() <= 0) {
                        iM6981 = C2105.m6981("᩺ۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26055) ^ (-1022031769);
                        i5 = -1184858290;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۟ܽ")) * 89;
                        i4 = ((iM6981 ^ i2) * 5349) ^ (-113290038);
                        i5 = -1018832932;
                    }
                    break;
                case 381406802:
                case 851190820:
                    C4616.m13552();
                    if (!RunnableC3474.m10630()) {
                        iM6981 = C2105.m6981("֡ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14821) ^ 1510413708;
                        i5 = 1189464309;
                    } else {
                        iM6981 = C2105.m6981("᩺ۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26055) ^ (-1022031769);
                        i5 = -1184858290;
                    }
                    break;
                case 836077814:
                case 1148406292:
                    if (C0798.f2919) {
                        iM6981 = (C2105.m6981("ܶۚ") + i3) * 43;
                        i4 = ((iM6981 ^ i2) * 32565) ^ (-1813818770);
                        i5 = 813404009;
                    } else {
                        iM6981 = (C2105.m6981("᩸۬") ^ i2) * 9;
                        i4 = ((iM6981 ^ i3) * 8363) ^ (-798866799);
                        i5 = -1756610119;
                    }
                    break;
                default:
                    if (C3663.f11553) {
                        iM6981 = C2105.m6981("֡ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14821) ^ 1510413708;
                        i5 = 1189464309;
                    } else {
                        iM6981 = C2105.m6981("ۜۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-1003)) ^ (-1378958856);
                        i5 = -2022205558;
                    }
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 34741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static l.C12100 m42314(java.io.DataInput r67, int r68, l.C17307 r69) {
        /*
            Method dump skipped, instruction units count: 3474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18177.m42314(java.io.DataInput, int, l.ܿۧܳ):l.۫֫ܳ");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42337(C9047 c9047, C6018 c6018) {
        int iM2566;
        int i;
        boolean z = false;
        boolean z2 = false;
        int i2 = 1697056273;
        int i3 = ServiceConnectionC3453.f10921;
        int i4 = RunnableC3474.f10992;
        int iM2567 = C0630.m2566("᩻᩸") ^ i3;
        int i5 = ((iM2567 ^ i4) * (-31159)) ^ 129345927;
        int i6 = 1018000258;
        while (true) {
            int i7 = iM2567 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * (-26313)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1824760938:
                    case -1541733634:
                        if (!m42337(c9047.f27426, c6018)) {
                            iM2567 = C2105.m6981("ۚܶ") ^ i4;
                            i5 = ((iM2567 ^ i3) * (-22791)) ^ 976442061;
                            i6 = 1187970475;
                            break;
                        }
                        iM2567 = C0630.m2566("᩵۬") ^ i3;
                        i5 = ((iM2567 ^ i4) * 26011) ^ 1351205785;
                        i6 = 247994019;
                        break;
                    case -1692758328:
                    case -220057278:
                        C1773.m5908();
                        if (C2958.m9034() > 0) {
                            iM2567 = C0630.m2566("᩺ܽ") ^ i3;
                            i5 = ((iM2567 ^ i4) * 21427) ^ (-1770914968);
                            i6 = 707592678;
                            break;
                        }
                        iM2567 = C0630.m2566("ۚۚ") ^ i4;
                        i5 = ((iM2567 ^ i3) * (-25247)) ^ 1524697285;
                        i6 = 95543777;
                        break;
                    case -1647348108:
                    case -816703340:
                        if (C0237.f1507 == 0) {
                            iM2567 = C2105.m6981("᩹᩹") ^ i4;
                            i5 = ((iM2567 ^ i3) * 22739) ^ 919066172;
                            i6 = 841979807;
                            break;
                        }
                        iM2567 = C0630.m2566("ۚۚ") ^ i4;
                        i5 = ((iM2567 ^ i3) * (-25247)) ^ 1524697285;
                        i6 = 95543777;
                        break;
                        break;
                    case -1628765001:
                    case -312095212:
                        return z;
                    case -1590027715:
                    case 1530741659:
                        if (C21923.f70183 == 0) {
                            iM2567 = C2105.m6981("ܰ۠") ^ i3;
                            i5 = ((iM2567 ^ i4) * (-16323)) ^ 2053106713;
                            i6 = 1899521716;
                            break;
                        }
                        iM2567 = (i4 - C2105.m6981("ۤ۬")) * (-41);
                        i5 = ((iM2567 ^ i3) * 4129) ^ 255913801;
                        i6 = -1553313711;
                        break;
                    case -1488120926:
                    case -857854002:
                        if (C0483.f2088 < 0) {
                            iM2567 = C0630.m2566("ܿᩴ") ^ i4;
                            i5 = ((iM2567 ^ i3) * (-4621)) ^ 115589990;
                            i6 = 1747037221;
                            break;
                        }
                        iM2567 = C0630.m2566("ۚۚ") ^ i4;
                        i5 = ((iM2567 ^ i3) * (-25247)) ^ 1524697285;
                        i6 = 95543777;
                        break;
                        break;
                    case -1403380055:
                    case 1405490450:
                        if (C2167.f7158 < 0) {
                            iM2567 = (C0630.m2566("ۘܰ") ^ i3) * 89;
                            i5 = ((iM2567 ^ i4) * (-7249)) ^ (-1373200425);
                            i6 = 1667512228;
                            break;
                        }
                        iM2567 = C2105.m6981("ܺۚ") ^ i3;
                        i5 = ((iM2567 ^ i4) * (-31317)) ^ 1553208749;
                        i6 = 1440761268;
                        break;
                    case -1299142877:
                    case 164338333:
                        if (C22628.f73083 > 0) {
                            iM2567 = C2105.m6981("ܽܺ") ^ i3;
                            i5 = ((iM2567 ^ i4) * 22447) ^ 1682769254;
                            i6 = -1211477642;
                            break;
                        }
                        iM2567 = C2105.m6981("ܺۚ") ^ i3;
                        i5 = ((iM2567 ^ i4) * (-31317)) ^ 1553208749;
                        i6 = 1440761268;
                        break;
                        break;
                    case -1189652956:
                    case 212820022:
                        C2167.m7155();
                        iM2567 = C0630.m2566("ۚۚ") ^ i4;
                        i5 = ((iM2567 ^ i3) * (-25247)) ^ 1524697285;
                        i6 = 95543777;
                        break;
                        break;
                    case -1146364434:
                    case -508137475:
                        return z;
                    case -970856680:
                    case 1640971928:
                        if (c9047.f27427.f67896 != c6018) {
                            iM2567 = (C0630.m2566("ܺۤ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i5 = ((iM2567 ^ i4) * (-26029)) ^ 1223263394;
                            i6 = 76194344;
                            break;
                        }
                        iM2567 = C2105.m6981("ᩴܳ") ^ i4;
                        i5 = ((iM2567 ^ i3) * 7675) ^ (-68445695);
                        i6 = 1152907365;
                        break;
                    case -958805867:
                    case 926503623:
                        if (C11340.f33930 >= 0) {
                            iM2567 = (C2105.m6981("ܶۗ") + i4) * 123;
                            i5 = ((iM2567 ^ i3) * (-1523)) ^ 1905823810;
                            i6 = -780837393;
                            break;
                        }
                        iM2567 = C2105.m6981("ܺۚ") ^ i3;
                        i5 = ((iM2567 ^ i4) * (-31317)) ^ 1553208749;
                        i6 = 1440761268;
                        break;
                        break;
                    case -956556004:
                    case -92129083:
                        if (C2958.f9394 < 0) {
                            iM2567 = (i3 - C0630.m2566("۟ۜ")) * 61;
                            i5 = ((iM2567 ^ i4) * 20187) ^ 741098264;
                            i6 = 490187691;
                            break;
                        }
                        iM2567 = C2105.m6981("ܺۚ") ^ i3;
                        i5 = ((iM2567 ^ i4) * (-31317)) ^ 1553208749;
                        i6 = 1440761268;
                        break;
                        break;
                    case -809429431:
                    case 2028357084:
                        return z;
                    case -799422033:
                    case 1867609000:
                        if (C3019.f9544 < 0) {
                            iM2567 = C0630.m2566("۬֨") ^ i3;
                            i5 = ((iM2567 ^ i4) * 1493) ^ 1970822186;
                            i6 = 743837272;
                            break;
                        }
                        iM2567 = C2105.m6981("ܺۚ") ^ i3;
                        i5 = ((iM2567 ^ i4) * (-31317)) ^ 1553208749;
                        i6 = 1440761268;
                        break;
                        break;
                    case -671647564:
                    case 1683748620:
                        C4159.m12565();
                        return false;
                    case -583366290:
                    case 656731034:
                        if (!m42337(c9047.f27430, c6018)) {
                            iM2567 = C2105.m6981("ۘܿ") ^ i3;
                            i5 = ((iM2567 ^ i4) * (-7231)) ^ 1932679065;
                            i6 = 1914448544;
                            break;
                        }
                        iM2567 = C0630.m2566("᩵۬") ^ i3;
                        i5 = ((iM2567 ^ i4) * 26011) ^ 1351205785;
                        i6 = 247994019;
                        break;
                        break;
                    case -582295723:
                    case 462231125:
                        if (C0630.f2410 <= 0) {
                            iM2567 = C2105.m6981("ܺۚ") ^ i3;
                            i5 = ((iM2567 ^ i4) * (-31317)) ^ 1553208749;
                            i6 = 1440761268;
                            break;
                            break;
                        }
                        iM2567 = C0630.m2566("ۚۚ") ^ i4;
                        i5 = ((iM2567 ^ i3) * (-25247)) ^ 1524697285;
                        i6 = 95543777;
                        break;
                        break;
                    case -499328828:
                    case -98572781:
                        return z2;
                    case -393062154:
                    case 237871075:
                        if (C1047.m3598(c9047)) {
                            iM2566 = (i3 - C0630.m2566("᩺ۚ")) * 77;
                            i5 = ((iM2566 ^ i4) * 24743) ^ (-1866280885);
                            i = 609541384;
                        } else {
                            iM2566 = C0630.m2566("۫᩵") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-26195)) ^ 1454732611;
                            i = -974045255;
                        }
                        i7 = iM2566 ^ i;
                        z2 = true;
                        break;
                    case -254731344:
                    case 42679372:
                        if (C5695.m16023() < 0) {
                            iM2567 = C0630.m2566("ܰ֨") ^ i4;
                            i5 = ((iM2567 ^ i3) * 7193) ^ 812826052;
                            i6 = -1491716919;
                            break;
                        }
                        iM2567 = C2105.m6981("ܺۚ") ^ i3;
                        i5 = ((iM2567 ^ i4) * (-31317)) ^ 1553208749;
                        i6 = 1440761268;
                        break;
                        break;
                    case 94390203:
                    case 1148245369:
                        z = false;
                        if (c9047 != null) {
                            iM2567 = (C0630.m2566("ܶ֡") + i3) * 99;
                            i5 = ((iM2567 ^ i4) * 32327) ^ (-1297220975);
                            i6 = -1441720814;
                            break;
                        }
                        iM2567 = (C2105.m6981("۬ۨ") + i4) * 119;
                        i5 = ((iM2567 ^ i3) * 22691) ^ 1179784264;
                        i6 = 1263371846;
                        break;
                    case 365126874:
                    case 1809232812:
                        if (C22628.m50615() == 0) {
                            iM2567 = C2105.m6981("᩻۬") ^ i4;
                            i5 = ((iM2567 ^ i3) * 3805) ^ 918805406;
                            i6 = 630792965;
                            break;
                        }
                        iM2567 = (i4 - C2105.m6981("ۤ۬")) * (-41);
                        i5 = ((iM2567 ^ i3) * 4129) ^ 255913801;
                        i6 = -1553313711;
                        break;
                        break;
                    case 476839008:
                    case 626921207:
                        return z2;
                    default:
                        if (C0798.m2998() == 0) {
                            iM2567 = C2105.m6981("ۗۤ") ^ i4;
                            i5 = ((iM2567 ^ i3) * (-18033)) ^ (-496683844);
                            i6 = -1389086578;
                            break;
                        }
                        iM2567 = (i4 - C2105.m6981("ۤ۬")) * (-41);
                        i5 = ((iM2567 ^ i3) * 4129) ^ 255913801;
                        i6 = -1553313711;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42330(InterfaceC18883 interfaceC18883, IdentityHashMap identityHashMap, IdentityHashMap identityHashMap2) {
        Boolean bool = null;
        InterfaceC18883[] interfaceC18883Arr = null;
        int length = 0;
        int i = 0;
        int i2 = 447733596;
        int i3 = C3911.f12484;
        int i4 = C1420.f5096;
        int iM2566 = (i3 - C0630.m2566("ܽۤ")) * (-27);
        int i5 = ((iM2566 ^ i4) * (-19873)) ^ 797362187;
        int i6 = 765698770;
        while (true) {
            i2 = ((((i2 ^ i4) * (-1109)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2125582071:
                case -1016756724:
                    m42330(interfaceC18883Arr[i], identityHashMap, identityHashMap2);
                    i++;
                    iM2566 = C0630.m2566("ۧۢ") ^ i4;
                    i5 = ((iM2566 ^ i3) * (-21923)) ^ 1666994542;
                    i6 = 289333833;
                    break;
                case -1954495852:
                case -1098597263:
                    if (C3911.f12484 >= 0) {
                        iM2566 = C0630.m2566("ܶܳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-11803)) ^ 390205293;
                        i6 = -509880968;
                    } else {
                        iM2566 = C0630.m2566("᩵ᩴ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 1931) ^ 273237171;
                        i6 = -1306851239;
                    }
                    break;
                case -1950377099:
                case -132957859:
                    C7811.m20844();
                    AbstractC2021.m6574();
                    iM2566 = (i4 - C0630.m2566("᩹ۖ")) * (-39);
                    i5 = ((iM2566 ^ i3) * 15321) ^ 1309532113;
                    i6 = 515867993;
                    break;
                case -1941920966:
                case -1308342137:
                    if (interfaceC18883 instanceof C3902) {
                        iM2566 = C0630.m2566("۬ᩴ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 93) ^ (-1974658180);
                        i6 = -803370728;
                    } else {
                        iM2566 = C0630.m2566("ܽۡ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-28477)) ^ (-344384694);
                        i6 = -432518650;
                    }
                    break;
                case -1688561032:
                case 867058813:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("ܰ᩻") ^ i3;
                        i5 = ((iM2566 ^ i4) * 13963) ^ 669292422;
                        i6 = 519104003;
                    } else {
                        iM2566 = (C2105.m6981("ᩴܳ") + i3) * 27;
                        i5 = ((iM2566 ^ i4) * 15897) ^ (-358025952);
                        i6 = -1589369389;
                    }
                    break;
                case -1676519021:
                case -1510836522:
                    if (interfaceC18883 instanceof C6018) {
                        iM2566 = C0630.m2566("ܳۗ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-16255)) ^ (-1279334614);
                        i6 = -1773299421;
                    } else {
                        iM2566 = C2105.m6981("ۚ᩺") ^ i4;
                        i5 = ((iM2566 ^ i3) * 2643) ^ (-1124314238);
                        i6 = 1735130774;
                    }
                    break;
                case -1649985750:
                case 1425760467:
                    if (C0964.f3626 != 0) {
                        iM2566 = C0630.m2566("ܿ᩸") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-24479)) ^ (-995506750);
                        i6 = -339999906;
                    } else {
                        iM2566 = (i4 - C0630.m2566("֡᩷")) * (-81);
                        i5 = ((iM2566 ^ i3) * (-13911)) ^ (-634377239);
                        i6 = 1855932390;
                    }
                    break;
                case -1468652589:
                case 1590532489:
                    C1916.m6308();
                    if (!RunnableC1108.m3790()) {
                        iM2566 = (i4 - C0630.m2566("ᩳᩴ")) * (-101);
                        i5 = ((iM2566 ^ i3) * (-11679)) ^ (-1875885305);
                        i6 = 1820456186;
                    } else {
                        iM2566 = C0630.m2566("ܶܳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-11803)) ^ 390205293;
                        i6 = -509880968;
                    }
                    break;
                case -1305929434:
                case -1008355539:
                    C4159.m12565();
                    C2167.m7155();
                    break;
                case -1266308479:
                case 925344236:
                    bool = Boolean.TRUE;
                    if (C0714.m2809(identityHashMap, interfaceC18883, bool) != null) {
                        iM2566 = C2105.m6981("ۚ᩺") ^ i4;
                        i5 = ((iM2566 ^ i3) * 2643) ^ (-1124314238);
                        i6 = 1735130774;
                    } else {
                        iM2566 = (i3 - C0630.m2566("۬᩷")) * (-45);
                        i5 = ((iM2566 ^ i4) * (-27713)) ^ 1612238187;
                        i6 = -667359815;
                    }
                    break;
                case -1085371885:
                case 614583266:
                    break;
                case -980447896:
                case 784645659:
                    C0237.m1481();
                    if (!C0422.m1963()) {
                        iM2566 = C0630.m2566("ܰ᩻") ^ i3;
                        i5 = ((iM2566 ^ i4) * 13963) ^ 669292422;
                        i6 = 519104003;
                    } else {
                        iM2566 = (i4 - C0630.m2566("᩹ۖ")) * (-39);
                        i5 = ((iM2566 ^ i3) * 15321) ^ 1309532113;
                        i6 = 515867993;
                    }
                    break;
                case -477144092:
                case 1000937506:
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("ܶܳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-11803)) ^ 390205293;
                        i6 = -509880968;
                    } else {
                        iM2566 = C0630.m2566("ۨ᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * 16837) ^ (-1254855854);
                        i6 = -572313559;
                    }
                    break;
                case -282887011:
                case 1907712219:
                    if (C4159.f13567) {
                        iM2566 = C2105.m6981("ۢܳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 32755) ^ 1352898200;
                        i6 = 641653465;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ᩳᩴ")) * (-101);
                        i5 = ((iM2566 ^ i3) * (-11679)) ^ (-1875885305);
                        i6 = 1820456186;
                    }
                    break;
                case -83335665:
                case 111598631:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("ܰ᩻") ^ i3;
                        i5 = ((iM2566 ^ i4) * 13963) ^ 669292422;
                        i6 = 519104003;
                    } else {
                        iM2566 = C0630.m2566("᩹ۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 15313) ^ 761193240;
                        i6 = -1393910666;
                    }
                    break;
                case -63352225:
                case 1253236245:
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("ܿ᩸") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-24479)) ^ (-995506750);
                        i6 = -339999906;
                    } else {
                        iM2566 = C2105.m6981("᩶᩷") ^ i4;
                        i5 = ((iM2566 ^ i3) * 18651) ^ (-833397587);
                        i6 = -145997868;
                    }
                    break;
                case 125310416:
                case 570376721:
                    if (C0237.f1507 != 0) {
                        iM2566 = (i4 - C0630.m2566("ᩳᩴ")) * (-101);
                        i5 = ((iM2566 ^ i3) * (-11679)) ^ (-1875885305);
                        i6 = 1820456186;
                    } else {
                        iM2566 = C0630.m2566("ܰ᩻") ^ i3;
                        i5 = ((iM2566 ^ i4) * 13963) ^ 669292422;
                        i6 = 519104003;
                    }
                    break;
                case 182244075:
                case 989914796:
                    if (C3683.m11222()) {
                        iM2566 = (i4 - C0630.m2566("᩹ۖ")) * (-39);
                        i5 = ((iM2566 ^ i3) * 15321) ^ 1309532113;
                        i6 = 515867993;
                    } else {
                        iM2566 = (C2105.m6981("ۖ᩵") + i4) * (-53);
                        i5 = ((iM2566 ^ i3) * 15585) ^ 620398625;
                        i6 = -983468852;
                    }
                    break;
                case 405150068:
                case 1710546396:
                    if (C2520.f8000 >= 0) {
                        iM2566 = C0630.m2566("ܶܳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-11803)) ^ 390205293;
                        i6 = -509880968;
                    } else {
                        iM2566 = (C2105.m6981("᩶ۙ") ^ i3) * 33;
                        i5 = ((iM2566 ^ i4) * 26985) ^ (-1624042624);
                        i6 = 566095974;
                    }
                    break;
                case 521426394:
                case 1391781126:
                    if (i < length) {
                        iM2566 = C2105.m6981("ᩴۨ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-2603)) ^ (-735159716);
                        i6 = 629512941;
                    } else {
                        iM2566 = C2105.m6981("ۚ᩺") ^ i4;
                        i5 = ((iM2566 ^ i3) * 2643) ^ (-1124314238);
                        i6 = 1735130774;
                    }
                    break;
                case 835002397:
                case 1890474290:
                    interfaceC18883Arr = ((C6018) interfaceC18883).f18478;
                    length = interfaceC18883Arr.length;
                    i = 0;
                    iM2566 = C0630.m2566("ۧۢ") ^ i4;
                    i5 = ((iM2566 ^ i3) * (-21923)) ^ 1666994542;
                    i6 = 289333833;
                    break;
                case 922639877:
                case 1130023100:
                    C2167.m7148(identityHashMap2, ((C3902) interfaceC18883).f12475, bool);
                    iM2566 = C0630.m2566("ܽۡ") ^ i4;
                    i5 = ((iM2566 ^ i3) * (-28477)) ^ (-344384694);
                    i6 = -432518650;
                    break;
                default:
                    if (C2167.f7158 >= 0) {
                        iM2566 = C0630.m2566("ܶܳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-11803)) ^ 390205293;
                        i6 = -509880968;
                    } else {
                        iM2566 = C0630.m2566("᩶۠") ^ i3;
                        i5 = ((iM2566 ^ i4) * 21) ^ 973717581;
                        i6 = -1403862230;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42324(C9047 c9047, IdentityHashMap identityHashMap, ArrayList arrayList, IdentityHashMap identityHashMap2) {
        C21042 c21042 = null;
        InterfaceC18883 interfaceC18883 = null;
        int i = 0;
        Long l2 = null;
        long jM28024 = 0;
        int i2 = 218520154;
        int i3 = C3432.f10845;
        int i4 = C2167.f7158;
        int iM2566 = C0630.m2566("᩵ۜ") ^ i4;
        int i5 = ((iM2566 ^ i3) * (-25481)) ^ 739587943;
        int i6 = 1321645034;
        while (true) {
            i2 = ((((i2 ^ i3) * (-669)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2077037029:
                case -100566082:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = (i4 - C0630.m2566("ܶ֨")) * q.h;
                        i5 = ((iM2566 ^ i3) * 6881) ^ (-691676425);
                        i6 = 423235615;
                    } else {
                        iM2566 = C2105.m6981("ܺ᩸") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-26301)) ^ (-958975990);
                        i6 = -810279614;
                    }
                    break;
                case -2070828959:
                case 1817250671:
                    C0714.m2809(identityHashMap, interfaceC18883, C2958.m9026(i));
                    C1916.m6307(arrayList, interfaceC18883);
                    break;
                case -2040656221:
                case 1667943737:
                    C2167.m7148(identityHashMap, interfaceC18883, C4117.m12360(jM28024));
                    break;
                case -2005332476:
                case 750113219:
                    if (C2272.f7362) {
                        iM2566 = (C2105.m6981("ܽܶ") + i4) * (-93);
                        i5 = ((iM2566 ^ i3) * 15957) ^ (-264647256);
                        i6 = 674315387;
                    } else {
                        iM2566 = C0630.m2566("ܺۛ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 12983) ^ 1272746621;
                        i6 = 284600628;
                    }
                    break;
                case -1998243239:
                case -840889695:
                    l2 = (Long) identityHashMap.get(interfaceC18883);
                    if (l2 == null) {
                        iM2566 = (C2105.m6981("ۨ۬") + i4) * (-79);
                        i5 = ((iM2566 ^ i3) * (-27067)) ^ 1446988580;
                        i6 = 1788290155;
                    } else {
                        iM2566 = C2105.m6981("۟ܺ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-12761)) ^ (-1339226747);
                        i6 = -203418336;
                    }
                    break;
                case -1751972661:
                case 704055171:
                    if (C0964.m3413()) {
                        iM2566 = C2105.m6981("ۘ۬") ^ i3;
                        i5 = ((iM2566 ^ i4) * 17927) ^ 1857926475;
                        i6 = 1900069834;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ܶ֨")) * q.h;
                        i5 = ((iM2566 ^ i3) * 6881) ^ (-691676425);
                        i6 = 423235615;
                    }
                    break;
                case -1734847745:
                case 2007797211:
                    c21042 = c9047.f27427;
                    if (RunnableC1937.m6381(c9047)) {
                        iM2566 = C0630.m2566("۟ۙ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-10281)) ^ 468584912;
                        i6 = 1653503959;
                    } else {
                        iM2566 = (C2105.m6981("ۙۧ") + i3) * 59;
                        i5 = ((iM2566 ^ i4) * (-25005)) ^ (-1504255766);
                        i6 = -1492568525;
                    }
                    break;
                case -1639879929:
                case 1732742910:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (i3 - C2105.m6981("۟ۧ")) * 63;
                        i5 = ((iM2566 ^ i4) * (-9321)) ^ (-1608995901);
                        i6 = -1126744026;
                    } else {
                        iM2566 = C2105.m6981("ۧ۠") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-10267)) ^ (-337804257);
                        i6 = 275761720;
                    }
                    break;
                case -1586767785:
                case 587976678:
                    C3911.m11924();
                    if (C7106.f21815 == 0) {
                        iM2566 = (i3 - C0630.m2566("ܽۧ")) * 3;
                        i5 = ((iM2566 ^ i4) * (-30489)) ^ (-926716427);
                        i6 = -337390288;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ܶ֨")) * q.h;
                        i5 = ((iM2566 ^ i3) * 6881) ^ (-691676425);
                        i6 = 423235615;
                    }
                    break;
                case -1518645815:
                case 227139973:
                    if (c9047 == null) {
                        iM2566 = (i3 - C2105.m6981("᩺᩶")) * (-89);
                        i5 = ((iM2566 ^ i4) * (-4447)) ^ 1914655099;
                        i6 = -986595187;
                    } else {
                        iM2566 = C0630.m2566("֫֨") ^ i4;
                        i5 = ((iM2566 ^ i3) * 25437) ^ (-283701757);
                        i6 = 1104046980;
                    }
                    break;
                case -1511910147:
                case -1087579815:
                    if (C0422.f1886 <= 0) {
                        iM2566 = (i3 - C0630.m2566("ܽۧ")) * 3;
                        i5 = ((iM2566 ^ i4) * (-30489)) ^ (-926716427);
                        i6 = -337390288;
                    } else {
                        iM2566 = (C2105.m6981("᩸ۘ") + i4) * (-33);
                        i5 = ((iM2566 ^ i3) * (-5229)) ^ (-929465512);
                        i6 = 47248984;
                    }
                    break;
                case -1342929397:
                case -1001110538:
                    if (C11340.m28031()) {
                        iM2566 = (C0630.m2566("ܳܺ") + i4) * 71;
                        i5 = ((iM2566 ^ i3) * 29545) ^ (-1022815188);
                        i6 = -818296033;
                    } else {
                        iM2566 = C0630.m2566("ᩴܽ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-9577)) ^ 1857914599;
                        i6 = -749045268;
                    }
                    break;
                case -1143463893:
                case -144901129:
                    interfaceC18883 = c21042.f67896;
                    i = c21042.f67894;
                    if (m42340(interfaceC18883, identityHashMap2)) {
                        iM2566 = (C2105.m6981("᩵֡") ^ i4) * (-5);
                        i5 = ((iM2566 ^ i3) * 17383) ^ (-922246958);
                        i6 = 213022927;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩺᩶")) * (-89);
                        i5 = ((iM2566 ^ i4) * (-4447)) ^ 1914655099;
                        i6 = -986595187;
                    }
                    break;
                case -937223559:
                case 182689040:
                    break;
                case -477738562:
                case 270746919:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ܽۧ")) * 3;
                        i5 = ((iM2566 ^ i4) * (-30489)) ^ (-926716427);
                        i6 = -337390288;
                    } else {
                        iM2566 = (C2105.m6981("۟۬") + i3) * (-109);
                        i5 = ((iM2566 ^ i4) * 6479) ^ 276862978;
                        i6 = 536278961;
                    }
                    break;
                case -187068758:
                case 990669307:
                    if (C3911.f12484 < 0) {
                        iM2566 = (i4 - C0630.m2566("ܶ֨")) * q.h;
                        i5 = ((iM2566 ^ i3) * 6881) ^ (-691676425);
                        i6 = 423235615;
                    } else {
                        iM2566 = (i3 - C2105.m6981("۟ۧ")) * 63;
                        i5 = ((iM2566 ^ i4) * (-9321)) ^ (-1608995901);
                        i6 = -1126744026;
                    }
                    break;
                case -105008670:
                case 286762860:
                    if (C1711.f5919) {
                        iM2566 = (i4 - C0630.m2566("ܶ֨")) * q.h;
                        i5 = ((iM2566 ^ i3) * 6881) ^ (-691676425);
                        i6 = 423235615;
                    } else {
                        iM2566 = (C2105.m6981("ܰۗ") ^ i4) * (-101);
                        i5 = ((iM2566 ^ i3) * 25123) ^ (-1014984352);
                        i6 = 1355490620;
                    }
                    break;
                case -42258624:
                case 132683067:
                    C3683.m11222();
                    C3432.m10477();
                    iM2566 = (i3 - C2105.m6981("۟ۧ")) * 63;
                    i5 = ((iM2566 ^ i4) * (-9321)) ^ (-1608995901);
                    i6 = -1126744026;
                    break;
                case 140411159:
                case 485143521:
                    m42324(c9047.f27426, identityHashMap, arrayList, identityHashMap2);
                    m42324(c9047.f27430, identityHashMap, arrayList, identityHashMap2);
                    break;
                case 222567339:
                case 716588349:
                    jM28024 = C11340.m28024(l2.longValue(), i);
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("ᩴܽ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-9577)) ^ 1857914599;
                        i6 = -749045268;
                    } else {
                        iM2566 = C2105.m6981("۠ۛ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 1439) ^ 1651644081;
                        i6 = -696365590;
                    }
                    break;
                case 423578763:
                case 1716328845:
                    C5695.m16023();
                    if (!C1711.f5919) {
                        iM2566 = (C2105.m6981("ܽܶ") + i4) * (-93);
                        i5 = ((iM2566 ^ i3) * 15957) ^ (-264647256);
                        i6 = 674315387;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ܽۧ")) * 3;
                        i5 = ((iM2566 ^ i4) * (-30489)) ^ (-926716427);
                        i6 = -337390288;
                    }
                    break;
                case 543733391:
                case 857411814:
                    C7811.m20844();
                    break;
                default:
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C2105.m6981("ܽܶ") + i4) * (-93);
                        i5 = ((iM2566 ^ i3) * 15957) ^ (-264647256);
                        i6 = 674315387;
                    } else {
                        iM2566 = C0630.m2566("ۤۢ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-12653)) ^ (-1162455895);
                        i6 = 727051345;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9711 m42311(C9711 c9711, File file) throws Throwable {
        boolean z;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        AutoCloseable autoCloseable;
        IOException iOException;
        IOException iOException2;
        int iM6981;
        int i8;
        int iM6982;
        int i9;
        int iM6983;
        int i10;
        int iM2567;
        int i11;
        int i12;
        int iM2568;
        int i13;
        int i14;
        File file2 = file;
        InterfaceC17066 interfaceC17066M38504 = null;
        int length = 0;
        Iterator itM9029 = null;
        AutoCloseable autoCloseable2 = null;
        boolean zM5910 = false;
        IOException iOException3 = null;
        IOException iOException4 = null;
        Throwable th = null;
        C21042 c21042 = null;
        boolean zM7150 = false;
        boolean zM7151 = false;
        InterfaceC15895 interfaceC15895M11894 = null;
        InterfaceC15895 interfaceC15895 = null;
        int i15 = -32922827;
        int i16 = C1294.f4556;
        int i17 = RunnableC1937.f6483;
        int iM2569 = C0630.m2566("ۢ᩷") ^ i16;
        int i18 = ((iM2569 ^ i17) * (-26315)) ^ (-60068512);
        int i19 = iM2569 ^ 1615805336;
        InterfaceC15895 interfaceC15896 = null;
        C9711 c9712 = null;
        int i20 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i17) * (-4239)) >> 31));
            switch (i15) {
                case -2109312208:
                case -1264376529:
                    try {
                        interfaceC15895M11894.mo11896(c21042, interfaceC17066M38504);
                        iM2566 = (C0630.m2566("ۧ֡") + i17) * 5;
                        i3 = ((iM2566 ^ i16) * 24785) ^ 1059361371;
                        i4 = 1290536398;
                        i5 = iM2566 ^ i4;
                        zM5910 = zM5910;
                        autoCloseable2 = autoCloseable2;
                        interfaceC17066M38504 = interfaceC17066M38504;
                        i19 = i5;
                        i18 = i3;
                    } catch (IOException | Error | RuntimeException e) {
                        e = e;
                        interfaceC17066M38504 = interfaceC17066M38504;
                        z = zM5910;
                        th = e;
                        autoCloseable2 = interfaceC15896;
                        int iM25610 = C0630.m2566("ۨᩳ") ^ i16;
                        i19 = iM25610 ^ 1455063886;
                        i18 = ((iM25610 ^ i17) * (-6189)) ^ (-523619161);
                        zM5910 = z;
                        interfaceC17066M38504 = interfaceC17066M38504;
                    }
                    file2 = file;
                    break;
                case -2032879435:
                case 961115053:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    autoCloseable2 = autoCloseable2;
                    zM5910 = zM5910;
                    C0714.m2815(th, iOException4);
                    iM2566 = C2105.m6981("۫ۙ") ^ i16;
                    i3 = ((iM2566 ^ i17) * (-10621)) ^ 1497397504;
                    i4 = -48188436;
                    i5 = iM2566 ^ i4;
                    zM5910 = zM5910;
                    autoCloseable2 = autoCloseable2;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case -1968524361:
                case 839839518:
                    i20 = 36072;
                    iM6983 = C2105.m6981("᩷ᩳ") ^ i16;
                    i = ((iM6983 ^ i17) * (-25559)) ^ (-483252965);
                    i10 = -486031990;
                    i2 = iM6983 ^ i10;
                    zM5910 = zM5910;
                    autoCloseable2 = autoCloseable2;
                    i19 = i2;
                    i18 = i;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    break;
                case -1953156924:
                case 880075997:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    autoCloseable2 = autoCloseable2;
                    zM5910 = zM5910;
                    interfaceC15895M11894.finish();
                    c9711.m24679();
                    zM7150 = C2167.m7150(interfaceC17066M38504);
                    iM2566 = (C0630.m2566("֨ۛ") ^ i16) * 91;
                    i3 = ((iM2566 ^ i17) * (-1893)) ^ (-242407167);
                    i4 = 1160205511;
                    i5 = iM2566 ^ i4;
                    zM5910 = zM5910;
                    autoCloseable2 = autoCloseable2;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case -1939804188:
                case 1378408585:
                    throw th;
                case -1935621521:
                case 546438142:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    autoCloseable2 = autoCloseable2;
                    zM5910 = zM5910;
                    if (C2167.m7150(interfaceC17066M38504)) {
                        iM6983 = (i16 - C2105.m6981("۠ܰ")) * (-3);
                        i = ((iM6983 ^ i17) * (-10139)) ^ (-634828245);
                        i10 = 1333077276;
                    } else {
                        iM6983 = (C2105.m6981("᩺ۤ") ^ i17) * (-35);
                        i = ((iM6983 ^ i16) * (-24571)) ^ 1870699450;
                        i10 = -650384544;
                    }
                    i2 = iM6983 ^ i10;
                    zM5910 = zM5910;
                    autoCloseable2 = autoCloseable2;
                    i19 = i2;
                    i18 = i;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    break;
                case -1850434761:
                case 1003973161:
                    i20 = 16837;
                    iM6983 = C2105.m6981("᩷ᩳ") ^ i16;
                    i = ((iM6983 ^ i17) * (-25559)) ^ (-483252965);
                    i10 = -486031990;
                    i2 = iM6983 ^ i10;
                    zM5910 = zM5910;
                    autoCloseable2 = autoCloseable2;
                    i19 = i2;
                    i18 = i;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    break;
                case -1848868714:
                case -576443:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    z = zM5910;
                    IOException iOException5 = iOException3;
                    IOException iOException6 = iOException4;
                    try {
                        throw new C23821();
                    } catch (IOException | Error | RuntimeException e2) {
                        e = e2;
                        iOException3 = iOException5;
                        iOException4 = iOException6;
                        th = e;
                        autoCloseable2 = interfaceC15896;
                        int iM25611 = C0630.m2566("ۨᩳ") ^ i16;
                        i19 = iM25611 ^ 1455063886;
                        i18 = ((iM25611 ^ i17) * (-6189)) ^ (-523619161);
                        zM5910 = z;
                        interfaceC17066M38504 = interfaceC17066M38504;
                        file2 = file;
                    }
                    break;
                case -1832984230:
                case 1218585872:
                    return c9712;
                case -1784963046:
                case -813579922:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    autoCloseable2 = autoCloseable2;
                    zM5910 = C1773.m5910(itM9029);
                    int iM25612 = (i17 - C0630.m2566("ܶۗ")) * 67;
                    i3 = ((iM25612 ^ i16) * (-24879)) ^ (-1665616058);
                    i5 = iM25612 ^ 712996468;
                    autoCloseable2 = autoCloseable2;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case -1572475869:
                case 1396629226:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    autoCloseable2 = autoCloseable2;
                    zM5910 = zM5910;
                    try {
                        interfaceC15895.close();
                        iM2566 = C2105.m6981("۫ۙ") ^ i16;
                        i3 = ((iM2566 ^ i17) * (-10621)) ^ 1497397504;
                        i4 = -48188436;
                        i5 = iM2566 ^ i4;
                        zM5910 = zM5910;
                        autoCloseable2 = autoCloseable2;
                        interfaceC17066M38504 = interfaceC17066M38504;
                        i19 = i5;
                        i18 = i3;
                    } catch (IOException e3) {
                        int iM25613 = (C0630.m2566("֫۫") ^ i17) * (-97);
                        i6 = ((iM25613 ^ i16) * 31867) ^ 1687951479;
                        i7 = iM25613 ^ 1040300547;
                        iOException4 = e3;
                        i18 = i6;
                        zM5910 = zM5910;
                        autoCloseable2 = autoCloseable2;
                        interfaceC17066M38504 = interfaceC17066M38504;
                        i19 = i7;
                    }
                    file2 = file;
                    break;
                case -1496834150:
                case 2090856788:
                    file2 = file;
                    interfaceC15895M11894 = new C18719(length);
                    interfaceC15895 = interfaceC15896;
                    iM6983 = C2105.m6981("ۙۚ") ^ i17;
                    i = ((iM6983 ^ i16) * (-24277)) ^ 700252611;
                    i10 = 1395501804;
                    i2 = iM6983 ^ i10;
                    zM5910 = zM5910;
                    autoCloseable2 = autoCloseable2;
                    i19 = i2;
                    i18 = i;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    break;
                case -1445242035:
                case 559203397:
                    try {
                        interfaceC15895.close();
                        iM2568 = (i16 - C0630.m2566("ܿ᩷")) * 41;
                        i13 = ((iM2568 ^ i17) * 25199) ^ 554022937;
                        i14 = -1065070394;
                        i19 = iM2568 ^ i14;
                        i18 = i13;
                    } catch (IOException | Error | RuntimeException e4) {
                        th = e4;
                        interfaceC17066M38504 = interfaceC17066M38504;
                        z = zM5910;
                        autoCloseable2 = c9712;
                        int iM25614 = C0630.m2566("ۨᩳ") ^ i16;
                        i19 = iM25614 ^ 1455063886;
                        i18 = ((iM25614 ^ i17) * (-6189)) ^ (-523619161);
                        zM5910 = z;
                        interfaceC17066M38504 = interfaceC17066M38504;
                        file2 = file;
                    }
                    break;
                case -1389859344:
                case 1233197531:
                    throw new C23821();
                case -1184641402:
                case 1691839470:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    autoCloseable2 = autoCloseable2;
                    zM5910 = zM5910;
                    try {
                        autoCloseable2.close();
                        iM2566 = (C0630.m2566("ᩴܰ") ^ i16) * 37;
                        i3 = ((iM2566 ^ i17) * (-6199)) ^ 918048494;
                        i4 = 61129834;
                        i5 = iM2566 ^ i4;
                        zM5910 = zM5910;
                        autoCloseable2 = autoCloseable2;
                        interfaceC17066M38504 = interfaceC17066M38504;
                        i19 = i5;
                        i18 = i3;
                    } catch (IOException e5) {
                        int iM6984 = C2105.m6981("ᩴᩳ") ^ i16;
                        i6 = ((iM6984 ^ i17) * 17927) ^ 1092148547;
                        i7 = iM6984 ^ (-192655772);
                        iOException3 = e5;
                        i18 = i6;
                        zM5910 = zM5910;
                        autoCloseable2 = autoCloseable2;
                        interfaceC17066M38504 = interfaceC17066M38504;
                        i19 = i7;
                    }
                    file2 = file;
                    break;
                case -1113761933:
                case 658278753:
                    throw new C23821();
                case -1026642201:
                case -250698684:
                    itM9029 = C2958.m9029(C19631.m45135(c9711.f29397));
                    iM2566 = (C0630.m2566("ۧ֡") + i17) * 5;
                    i3 = ((iM2566 ^ i16) * 24785) ^ 1059361371;
                    i4 = 1290536398;
                    i5 = iM2566 ^ i4;
                    zM5910 = zM5910;
                    autoCloseable2 = autoCloseable2;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case -1018567689:
                case -105724434:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    autoCloseable2 = autoCloseable2;
                    zM5910 = zM5910;
                    if (autoCloseable2 != null) {
                        iM2566 = (C0630.m2566("ܿ֡") + i17) * q.h;
                        i3 = ((iM2566 ^ i16) * (-29447)) ^ (-8534857);
                        i4 = -2049463494;
                    } else {
                        iM2566 = (C0630.m2566("ᩴܰ") ^ i16) * 37;
                        i3 = ((iM2566 ^ i17) * (-6199)) ^ 918048494;
                        i4 = 61129834;
                    }
                    i5 = iM2566 ^ i4;
                    zM5910 = zM5910;
                    autoCloseable2 = autoCloseable2;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case -927422771:
                case -868456037:
                    return c9712;
                case -861770237:
                case 1275872637:
                    AutoCloseable autoCloseable3 = autoCloseable2;
                    boolean z2 = zM5910;
                    int i21 = i20;
                    C11003.requireNonNull(file2, C2105.m6988(f56533, 30, 14, i21));
                    interfaceC15896 = null;
                    interfaceC17066M38504 = C16360.m38504(null);
                    length = c9711.length();
                    if (length <= 33554432) {
                        iM2567 = (C0630.m2566("ܽ᩵") + i17) * (-37);
                        i11 = ((iM2567 ^ i16) * (-19905)) ^ 276134962;
                        i12 = -914520504;
                    } else {
                        iM2567 = (i17 - C0630.m2566("ۚۛ")) * (-117);
                        i11 = ((iM2567 ^ i16) * 24647) ^ 1286135820;
                        i12 = 959734374;
                    }
                    int i22 = iM2567 ^ i12;
                    i20 = i21;
                    autoCloseable2 = autoCloseable3;
                    i19 = i22;
                    i18 = i11;
                    zM5910 = z2;
                    break;
                case -817405338:
                case 1890554594:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    autoCloseable2 = autoCloseable2;
                    zM5910 = zM5910;
                    int i23 = i20;
                    short s = f56533[29];
                    if (((s * s) + 8970025) - (s * 5990) >= 0) {
                        iM6982 = (C2105.m6981("᩵ۖ") ^ i16) * 63;
                        i = ((iM6982 ^ i17) * 18365) ^ 525944101;
                        i9 = 567890504;
                    } else {
                        iM6982 = C2105.m6981("ۘ᩶") ^ i17;
                        i = ((iM6982 ^ i16) * 15101) ^ 555548477;
                        i9 = -1439409251;
                    }
                    i2 = iM6982 ^ i9;
                    i20 = i23;
                    zM5910 = zM5910;
                    autoCloseable2 = autoCloseable2;
                    i19 = i2;
                    i18 = i;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    break;
                case -679794208:
                case 1112642829:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    autoCloseable2 = autoCloseable2;
                    zM5910 = zM5910;
                    c9711.m24679();
                    if (length <= 65536) {
                        iM6983 = (C2105.m6981("۠ܺ") ^ i16) * 13;
                        i = ((iM6983 ^ i17) * (-26425)) ^ (-878457937);
                        i10 = 1168472103;
                    } else {
                        iM6983 = C0630.m2566("ۗ᩸") ^ i16;
                        i = ((iM6983 ^ i17) * (-20343)) ^ 784820983;
                        i10 = -730838517;
                    }
                    i2 = iM6983 ^ i10;
                    zM5910 = zM5910;
                    autoCloseable2 = autoCloseable2;
                    i19 = i2;
                    i18 = i;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    break;
                case -452978063:
                case 1779127525:
                    throw new C21978();
                case -353869923:
                case 1606792927:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    autoCloseable = autoCloseable2;
                    z = zM5910;
                    iOException = iOException3;
                    iOException2 = iOException4;
                    if (zM7151) {
                        iM6981 = C2105.m6981("ܿᩳ") ^ i17;
                        i3 = ((iM6981 ^ i16) * 19781) ^ 885507202;
                        i8 = 1019955662;
                    } else {
                        iM6981 = (C0630.m2566("ܽ᩸") + i16) * (-27);
                        i3 = ((iM6981 ^ i17) * (-27391)) ^ 1547000171;
                        i8 = 196880238;
                    }
                    i5 = iM6981 ^ i8;
                    zM5910 = z;
                    autoCloseable2 = autoCloseable;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    iOException3 = iOException;
                    iOException4 = iOException2;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case -268754426:
                case 359044544:
                    if (interfaceC15895 != null) {
                        iM2568 = (C2105.m6981("᩻ܳ") ^ i16) * (-37);
                        i13 = ((iM2568 ^ i17) * (-9105)) ^ (-566273971);
                        i14 = 445537772;
                    } else {
                        iM2568 = (C0630.m2566("۫ۘ") + i17) * (-49);
                        i13 = ((iM2568 ^ i16) * (-10257)) ^ 1133307780;
                        i14 = 1536542761;
                    }
                    i19 = iM2568 ^ i14;
                    i18 = i13;
                    break;
                case 68709103:
                case 1953637401:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    autoCloseable2 = autoCloseable2;
                    zM5910 = zM5910;
                    if (zM5910) {
                        iM2566 = C0630.m2566("᩵۬") ^ i17;
                        i3 = ((iM2566 ^ i16) * 8971) ^ 1036787595;
                        i4 = -2016153145;
                    } else {
                        iM2566 = C2105.m6981("ۨܺ") ^ i16;
                        i3 = ((iM2566 ^ i17) * (-3017)) ^ (-942797364);
                        i4 = 614292413;
                    }
                    i5 = iM2566 ^ i4;
                    zM5910 = zM5910;
                    autoCloseable2 = autoCloseable2;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case 372446714:
                case 1556841091:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    AutoCloseable autoCloseable4 = autoCloseable2;
                    z = zM5910;
                    try {
                        C21042 c21043 = (C21042) RunnableC1108.m3791(itM9029);
                        try {
                            zM7151 = C2167.m7150(interfaceC17066M38504);
                            int iM25615 = C0630.m2566("᩻᩶") ^ i17;
                            i = ((iM25615 ^ i16) * (-2975)) ^ 1091025240;
                            i2 = iM25615 ^ (-836426066);
                            c21042 = c21043;
                            zM5910 = z;
                            autoCloseable2 = autoCloseable4;
                            file2 = file;
                            i19 = i2;
                            i18 = i;
                            interfaceC17066M38504 = interfaceC17066M38504;
                        } catch (IOException | Error | RuntimeException e6) {
                            e = e6;
                            c21042 = c21043;
                            th = e;
                            autoCloseable2 = interfaceC15896;
                            int iM25616 = C0630.m2566("ۨᩳ") ^ i16;
                            i19 = iM25616 ^ 1455063886;
                            i18 = ((iM25616 ^ i17) * (-6189)) ^ (-523619161);
                            zM5910 = z;
                            interfaceC17066M38504 = interfaceC17066M38504;
                            file2 = file;
                        }
                    } catch (IOException e7) {
                        e = e7;
                    } catch (Error e8) {
                        e = e8;
                    } catch (RuntimeException e9) {
                        e = e9;
                    }
                    break;
                case 699589377:
                case 1536144944:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    autoCloseable2 = autoCloseable2;
                    zM5910 = zM5910;
                    C2167.m7154(th, iOException3);
                    iM2566 = (C0630.m2566("ᩴܰ") ^ i16) * 37;
                    i3 = ((iM2566 ^ i17) * (-6199)) ^ 918048494;
                    i4 = 61129834;
                    i5 = iM2566 ^ i4;
                    zM5910 = zM5910;
                    autoCloseable2 = autoCloseable2;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case 1141639768:
                case 1929337935:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    autoCloseable = autoCloseable2;
                    z = zM5910;
                    iOException = iOException3;
                    iOException2 = iOException4;
                    if (zM7150) {
                        iM6981 = C2105.m6981("ۢ᩵") ^ i16;
                        i3 = ((iM6981 ^ i17) * (-26231)) ^ (-2030625615);
                        i8 = 1053088110;
                    } else {
                        iM6981 = (C2105.m6981("ۚ۫") ^ i16) * (-17);
                        i3 = ((iM6981 ^ i17) * (-18547)) ^ 346108404;
                        i8 = 1001587610;
                    }
                    i5 = iM6981 ^ i8;
                    zM5910 = z;
                    autoCloseable2 = autoCloseable;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    iOException3 = iOException;
                    iOException4 = iOException2;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case 1141701590:
                case 2071466657:
                    interfaceC15895M11894 = C3902.m11894(file2, length);
                    interfaceC15895 = interfaceC15895M11894;
                    iM6983 = C2105.m6981("ۙۚ") ^ i17;
                    i = ((iM6983 ^ i16) * (-24277)) ^ 700252611;
                    i10 = 1395501804;
                    i2 = iM6983 ^ i10;
                    zM5910 = zM5910;
                    autoCloseable2 = autoCloseable2;
                    i19 = i2;
                    i18 = i;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    break;
                case 1229286868:
                case 1539553660:
                    try {
                        autoCloseable = autoCloseable2;
                        z = zM5910;
                        try {
                            interfaceC17066M38504 = interfaceC17066M38504;
                            try {
                                iOException = iOException3;
                                iOException2 = iOException4;
                                try {
                                    c9712 = new C9711(c9711.f29395, c9711.f29400, c9711.f29396, C19631.m45107(interfaceC15895M11894), C13510.m32552(length, false));
                                    iM6981 = C0630.m2566("ۛܳ") ^ i17;
                                    i3 = ((iM6981 ^ i16) * (-20169)) ^ 853670265;
                                    i8 = 2115511956;
                                    i5 = iM6981 ^ i8;
                                    zM5910 = z;
                                    autoCloseable2 = autoCloseable;
                                    interfaceC17066M38504 = interfaceC17066M38504;
                                    iOException3 = iOException;
                                    iOException4 = iOException2;
                                    i19 = i5;
                                    i18 = i3;
                                } catch (IOException e10) {
                                    e = e10;
                                    iOException3 = iOException;
                                    iOException4 = iOException2;
                                    c9712 = null;
                                    th = e;
                                    autoCloseable2 = interfaceC15896;
                                    int iM25617 = C0630.m2566("ۨᩳ") ^ i16;
                                    i19 = iM25617 ^ 1455063886;
                                    i18 = ((iM25617 ^ i17) * (-6189)) ^ (-523619161);
                                    zM5910 = z;
                                    interfaceC17066M38504 = interfaceC17066M38504;
                                } catch (Error e11) {
                                    e = e11;
                                    iOException3 = iOException;
                                    iOException4 = iOException2;
                                    c9712 = null;
                                    th = e;
                                    autoCloseable2 = interfaceC15896;
                                    int iM25618 = C0630.m2566("ۨᩳ") ^ i16;
                                    i19 = iM25618 ^ 1455063886;
                                    i18 = ((iM25618 ^ i17) * (-6189)) ^ (-523619161);
                                    zM5910 = z;
                                    interfaceC17066M38504 = interfaceC17066M38504;
                                } catch (RuntimeException e12) {
                                    e = e12;
                                    iOException3 = iOException;
                                    iOException4 = iOException2;
                                    c9712 = null;
                                    th = e;
                                    autoCloseable2 = interfaceC15896;
                                    int iM25619 = C0630.m2566("ۨᩳ") ^ i16;
                                    i19 = iM25619 ^ 1455063886;
                                    i18 = ((iM25619 ^ i17) * (-6189)) ^ (-523619161);
                                    zM5910 = z;
                                    interfaceC17066M38504 = interfaceC17066M38504;
                                }
                            } catch (IOException e13) {
                                e = e13;
                            } catch (Error e14) {
                                e = e14;
                            } catch (RuntimeException e15) {
                                e = e15;
                            }
                        } catch (IOException e16) {
                            e = e16;
                            interfaceC17066M38504 = interfaceC17066M38504;
                        } catch (Error e17) {
                            e = e17;
                            interfaceC17066M38504 = interfaceC17066M38504;
                        } catch (RuntimeException e18) {
                            e = e18;
                            interfaceC17066M38504 = interfaceC17066M38504;
                        }
                    } catch (IOException e19) {
                        e = e19;
                        interfaceC17066M38504 = interfaceC17066M38504;
                        z = zM5910;
                    } catch (Error e20) {
                        e = e20;
                        interfaceC17066M38504 = interfaceC17066M38504;
                        z = zM5910;
                    } catch (RuntimeException e21) {
                        e = e21;
                        interfaceC17066M38504 = interfaceC17066M38504;
                        z = zM5910;
                    }
                    file2 = file;
                    break;
                default:
                    interfaceC17066M38504 = interfaceC17066M38504;
                    autoCloseable2 = autoCloseable2;
                    zM5910 = zM5910;
                    if (interfaceC15895 != null) {
                        iM2566 = (C2105.m6981("۟֨") ^ i17) * 89;
                        i3 = ((iM2566 ^ i16) * 15605) ^ (-1455876119);
                        i4 = -455986079;
                    } else {
                        iM2566 = C2105.m6981("۫ۙ") ^ i16;
                        i3 = ((iM2566 ^ i17) * (-10621)) ^ 1497397504;
                        i4 = -48188436;
                    }
                    i5 = iM2566 ^ i4;
                    zM5910 = zM5910;
                    autoCloseable2 = autoCloseable2;
                    interfaceC17066M38504 = interfaceC17066M38504;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x010a A[PHI: r8 r9 r16
      0x010a: PHI (r8v4 l.᩷ᩳܳ) = (r8v3 l.᩷ᩳܳ), (r8v2 l.᩷ᩳܳ), (r8v2 l.᩷ᩳܳ) binds: [B:38:0x00f1, B:33:0x00e1, B:28:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r9v4 l.ᩴܽܳ) = (r9v3 l.ᩴܽܳ), (r9v2 l.ᩴܽܳ), (r9v2 l.ᩴܽܳ) binds: [B:38:0x00f1, B:33:0x00e1, B:28:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r16v15 int) = (r16v12 int), (r16v14 int), (r16v16 int) binds: [B:38:0x00f1, B:33:0x00e1, B:28:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0142 A[PHI: r6 r7 r16
      0x0142: PHI (r6v4 l.ۡᩳܳ) = (r6v3 l.ۡᩳܳ), (r6v2 l.ۡᩳܳ) binds: [B:42:0x0129, B:33:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r7v4 l.ۡᩳܳ) = (r7v3 l.ۡᩳܳ), (r7v2 l.ۡᩳܳ) binds: [B:42:0x0129, B:33:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r16v13 int) = (r16v11 int), (r16v14 int) binds: [B:42:0x0129, B:33:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0203 A[PHI: r16
      0x0203: PHI (r16v20 int) = (r16v7 int), (r16v19 int), (r16v22 int) binds: [B:59:0x0201, B:16:0x007e, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0290 A[PHI: r16
      0x0290: PHI (r16v21 int) = (r16v3 int), (r16v4 int), (r16v5 int), (r16v6 int), (r16v22 int) binds: [B:75:0x028e, B:71:0x026f, B:67:0x024f, B:63:0x0233, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02c3 A[PHI: r10 r11 r12 r16
      0x02c3: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:79:0x02c1, B:54:0x01cc, B:24:0x00a2, B:18:0x0082, B:16:0x007e, B:10:0x0051, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r11v4 byte[]) = (r11v2 byte[]), (r11v2 byte[]), (r11v3 byte[]), (r11v2 byte[]), (r11v2 byte[]), (r11v2 byte[]), (r11v2 byte[]) binds: [B:79:0x02c1, B:54:0x01cc, B:24:0x00a2, B:18:0x0082, B:16:0x007e, B:10:0x0051, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:79:0x02c1, B:54:0x01cc, B:24:0x00a2, B:18:0x0082, B:16:0x007e, B:10:0x0051, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r16v25 int) = (r16v2 int), (r16v8 int), (r16v17 int), (r16v18 int), (r16v19 int), (r16v24 int), (r16v28 int) binds: [B:79:0x02c1, B:54:0x01cc, B:24:0x00a2, B:18:0x0082, B:16:0x007e, B:10:0x0051, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9047 m42309(C9047 c9047, IdentityHashMap identityHashMap, C21541 c21541) {
        int i;
        int iM2566;
        int i2;
        int i3;
        int i4 = C1773.f6144;
        int i5 = C4616.f14690;
        int iM6981 = C2105.m6981("֡ᩴ") ^ i5;
        int i6 = ((iM6981 ^ i4) * 14099) ^ 1556673621;
        InterfaceC18883 interfaceC18883 = null;
        byte[] bArr = null;
        int i7 = iM6981 ^ (-1043934012);
        int i8 = 0;
        int i9 = 0;
        int i10 = -72258407;
        C21042 c21042 = null;
        C9047 c9047M42309 = null;
        C9047 c9047M423010 = null;
        C9047 c9048 = null;
        C9047 c9049 = null;
        while (true) {
            int i11 = i7 ^ (i6 & (((i10 ^ i4) * (-23759)) >> 31));
            switch (i11) {
                case -2139260836:
                case -641831729:
                    i = i11;
                    if (C3432.m10477() <= 0) {
                        iM2566 = (C2105.m6981("ܺۙ") + i4) * (-55);
                        i2 = ((iM2566 ^ i5) * (-19043)) ^ (-1113574505);
                        i3 = -1974427684;
                    } else {
                        iM2566 = C2105.m6981("ܽᩳ") ^ i4;
                        i2 = ((iM2566 ^ i5) * 8165) ^ 857223684;
                        i3 = 1710904328;
                    }
                    int i12 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i12;
                    break;
                case -2134242822:
                case 1035502521:
                    i = i11;
                    c9047M423010 = m42309(c9048, identityHashMap, c21541);
                    c9047M42309 = m42309(c9049, identityHashMap, c21541);
                    if (c9047M423010 == c9048) {
                        iM2566 = (C2105.m6981("ۧᩳ") ^ i4) * (-71);
                        i2 = ((iM2566 ^ i5) * 18113) ^ 1885209197;
                        i3 = 298120363;
                    } else {
                        iM2566 = C0630.m2566("᩶ۙ") ^ i4;
                        i2 = ((iM2566 ^ i5) * (-30019)) ^ 512831648;
                        i3 = 653112206;
                    }
                    int i13 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i13;
                    break;
                case -2078602106:
                case 413690593:
                    i = i11;
                    if (c9047M42309 == c9049) {
                        iM2566 = C2105.m6981("᩺֫") ^ i5;
                        i2 = ((iM2566 ^ i4) * 16919) ^ 1677623136;
                        i3 = -289514882;
                    } else {
                        iM2566 = C0630.m2566("᩶ۙ") ^ i4;
                        i2 = ((iM2566 ^ i5) * (-30019)) ^ 512831648;
                        i3 = 653112206;
                    }
                    int i14 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i14;
                    break;
                case -2030144565:
                case 1178125473:
                    C0630.m2564();
                    return null;
                case -2008196020:
                case 1262997288:
                    i = i11;
                    boolean zM6381 = RunnableC1937.m6381(c9047);
                    c9049 = c9047.f27430;
                    c9048 = c9047.f27426;
                    if (zM6381) {
                        iM2566 = (C0630.m2566("᩵᩻") ^ i5) * (-81);
                        i2 = ((iM2566 ^ i4) * 7747) ^ 31318712;
                        i3 = 1647296416;
                    } else {
                        iM2566 = (i5 - C0630.m2566("ۡᩴ")) * 29;
                        i2 = ((iM2566 ^ i4) * (-5151)) ^ (-283107860);
                        i3 = 1586862016;
                    }
                    int i15 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i15;
                    break;
                case -1996493795:
                case 1168914857:
                    i = i11;
                    if (C0964.m3413()) {
                        iM2566 = (i4 - C0630.m2566("᩺ۗ")) * (-97);
                        i2 = ((iM2566 ^ i5) * 31079) ^ (-597871987);
                        i3 = 1387955912;
                    } else {
                        iM2566 = C2105.m6981("۫᩹") ^ i4;
                        i2 = ((iM2566 ^ i5) * (-12193)) ^ (-1568765543);
                        i3 = -329823899;
                    }
                    int i16 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i16;
                    break;
                case -1939700129:
                case 2135868897:
                    if (C2958.f9394 < 0) {
                        i = i11;
                        iM2566 = (C0630.m2566("ᩳ᩸") + i4) * (-41);
                        i2 = ((iM2566 ^ i5) * (-21525)) ^ 1088820645;
                        i3 = -988084788;
                    } else {
                        iM2566 = C2105.m6981("ᩳᩳ") ^ i5;
                        i = i11;
                        i2 = ((iM2566 ^ i4) * 15171) ^ (-2107533889);
                        i3 = 343070770;
                    }
                    int i17 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i17;
                    break;
                case -1893497138:
                case -939082033:
                    return c9047;
                case -1412730676:
                case -1024796547:
                    i = i11;
                    C22628.m50615();
                    if (C1916.f6442) {
                        iM2566 = C2105.m6981("۟ᩳ") ^ i5;
                        i2 = ((iM2566 ^ i4) * (-18173)) ^ (-62348220);
                        i3 = -1797508640;
                    } else {
                        iM2566 = (C0630.m2566("ᩳ᩸") + i4) * (-41);
                        i2 = ((iM2566 ^ i5) * (-21525)) ^ 1088820645;
                        i3 = -988084788;
                    }
                    int i18 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i18;
                    break;
                case -1301872556:
                case 436143830:
                    i = i11;
                    C3683.m11222();
                    C3245.m9925();
                    iM2566 = (C0630.m2566("ᩳ᩸") + i4) * (-41);
                    i2 = ((iM2566 ^ i5) * (-21525)) ^ 1088820645;
                    i3 = -988084788;
                    int i19 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i19;
                    break;
                case -1196539482:
                case -876568796:
                    i = i11;
                    if (identityHashMap.containsKey((C3902) interfaceC18883)) {
                        iM2566 = C0630.m2566("ۤܳ") ^ i5;
                        i2 = ((iM2566 ^ i4) * (-17603)) ^ 2049284191;
                        i3 = 1575682398;
                    } else {
                        iM2566 = C2105.m6981("᩺֫") ^ i5;
                        i2 = ((iM2566 ^ i4) * 16919) ^ 1677623136;
                        i3 = -289514882;
                    }
                    int i110 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i110;
                    break;
                case -1073635563:
                case 8564474:
                    c21042.m47875(i9, bArr, i9, i8);
                    return c21541.m48697(i8, bArr);
                case -930666833:
                case 852117650:
                    i = i11;
                    C1420.m4913();
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("۟ᩳ") ^ i5;
                        i2 = ((iM2566 ^ i4) * (-18173)) ^ (-62348220);
                        i3 = -1797508640;
                    } else {
                        iM2566 = C2105.m6981("۫᩹") ^ i4;
                        i2 = ((iM2566 ^ i5) * (-12193)) ^ (-1568765543);
                        i3 = -329823899;
                    }
                    int i111 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i111;
                    break;
                case -913537601:
                case 1921649067:
                    i = i11;
                    if (C4075.f12947 >= 0) {
                        iM2566 = C2105.m6981("۫᩹") ^ i4;
                        i2 = ((iM2566 ^ i5) * (-12193)) ^ (-1568765543);
                        i3 = -329823899;
                    } else {
                        iM2566 = C2105.m6981("۫ܶ") ^ i5;
                        i2 = ((iM2566 ^ i4) * 2673) ^ 1121419311;
                        i3 = 1457731116;
                    }
                    int i112 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i112;
                    break;
                case -575279078:
                case 1220941638:
                    i = i11;
                    c21042 = c9047.f27427;
                    interfaceC18883 = c21042.f67896;
                    if (interfaceC18883 instanceof C3902) {
                        iM2566 = (C0630.m2566("֡ۙ") + i4) * (-101);
                        i2 = ((iM2566 ^ i5) * 12877) ^ (-436588112);
                        i3 = 934186908;
                    } else {
                        iM2566 = C2105.m6981("᩺֫") ^ i5;
                        i2 = ((iM2566 ^ i4) * 16919) ^ 1677623136;
                        i3 = -289514882;
                    }
                    int i113 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i113;
                    break;
                case -411188489:
                case 1199767613:
                    i = i11;
                    if (RunnableC1108.m3790()) {
                        iM2566 = (C0630.m2566("ᩳ᩸") + i4) * (-41);
                        i2 = ((iM2566 ^ i5) * (-21525)) ^ 1088820645;
                        i3 = -988084788;
                    } else {
                        iM2566 = (C0630.m2566("ۗ᩸") + i5) * 37;
                        i2 = ((iM2566 ^ i4) * 13837) ^ 923569603;
                        i3 = -588934196;
                    }
                    int i114 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i114;
                    break;
                case -273671320:
                case 879912147:
                    i = i11;
                    if (C1711.f5919) {
                        iM2566 = C2105.m6981("۫᩹") ^ i4;
                        i2 = ((iM2566 ^ i5) * (-12193)) ^ (-1568765543);
                        i3 = -329823899;
                    } else {
                        iM2566 = (C2105.m6981("ۘܺ") ^ i4) * 109;
                        i2 = ((iM2566 ^ i5) * (-16101)) ^ 1760870840;
                        i3 = 793048251;
                    }
                    int i115 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i115;
                    break;
                case -194975946:
                case 1165309570:
                    i = i11;
                    if (C3663.m11168() >= 0) {
                        iM2566 = (C0630.m2566("ᩳ᩸") + i4) * (-41);
                        i2 = ((iM2566 ^ i5) * (-21525)) ^ 1088820645;
                        i3 = -988084788;
                    } else {
                        iM2566 = C2105.m6981("ۧ۠") ^ i5;
                        i2 = ((iM2566 ^ i4) * 6523) ^ 588729926;
                        i3 = -1496942011;
                    }
                    int i116 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i116;
                    break;
                case -131851227:
                case 1884828999:
                    i = i11;
                    if (C0050.f910 >= 0) {
                        iM2566 = C2105.m6981("۟ᩳ") ^ i5;
                        i2 = ((iM2566 ^ i4) * (-18173)) ^ (-62348220);
                        i3 = -1797508640;
                    } else {
                        iM2566 = (C2105.m6981("۫ܽ") ^ i4) * 57;
                        i2 = ((iM2566 ^ i5) * 18609) ^ (-173630830);
                        i3 = 132699918;
                    }
                    int i117 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i117;
                    break;
                case 139716955:
                case 2012351610:
                    return C19631.m45139(c9047M423010, c9047M42309);
                case 432930447:
                case 765199187:
                    i = i11;
                    if (C4117.m12364() != 0) {
                        iM2566 = C2105.m6981("۫᩹") ^ i4;
                        i2 = ((iM2566 ^ i5) * (-12193)) ^ (-1568765543);
                        i3 = -329823899;
                    } else {
                        iM2566 = (C2105.m6981("֡֨") ^ i5) * (-63);
                        i2 = ((iM2566 ^ i4) * (-4281)) ^ 1441101644;
                        i3 = -1739543985;
                    }
                    int i118 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i118;
                    break;
                case 837168731:
                case 2068841297:
                    i = i11;
                    i8 = c21042.f67894;
                    bArr = new byte[i8];
                    i9 = 0;
                    if (C3537.f11231 >= 0) {
                        iM2566 = (C0630.m2566("ᩳ᩸") + i4) * (-41);
                        i2 = ((iM2566 ^ i5) * (-21525)) ^ 1088820645;
                        i3 = -988084788;
                    } else {
                        iM2566 = (C2105.m6981("ܰۨ") ^ i5) * (-71);
                        i2 = ((iM2566 ^ i4) * (-9227)) ^ 1483035977;
                        i3 = 1116745538;
                    }
                    int i119 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i119;
                    break;
                default:
                    i = i11;
                    if (C4263.m12819() >= 0) {
                        iM2566 = (C0630.m2566("ᩳ᩸") + i4) * (-41);
                        i2 = ((iM2566 ^ i5) * (-21525)) ^ 1088820645;
                        i3 = -988084788;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ᩴ᩵")) * (-65);
                        i2 = ((iM2566 ^ i5) * (-23351)) ^ (-801815657);
                        i3 = -694032259;
                    }
                    int i1110 = i;
                    i7 = iM2566 ^ i3;
                    i6 = i2;
                    i10 = i1110;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x06f5 A[PHI: r2 r9 r23 r24 r40 r42
      0x06f5: PHI (r2v21 java.util.IdentityHashMap) = (r2v8 java.util.IdentityHashMap), (r2v22 java.util.IdentityHashMap) binds: [B:137:0x06dc, B:99:0x0498] A[DONT_GENERATE, DONT_INLINE]
      0x06f5: PHI (r9v18 long) = (r9v8 long), (r9v19 long) binds: [B:137:0x06dc, B:99:0x0498] A[DONT_GENERATE, DONT_INLINE]
      0x06f5: PHI (r23v33 java.util.IdentityHashMap) = (r23v25 java.util.IdentityHashMap), (r23v34 java.util.IdentityHashMap) binds: [B:137:0x06dc, B:99:0x0498] A[DONT_GENERATE, DONT_INLINE]
      0x06f5: PHI (r24v18 long) = (r24v7 long), (r24v19 long) binds: [B:137:0x06dc, B:99:0x0498] A[DONT_GENERATE, DONT_INLINE]
      0x06f5: PHI (r40v19 long) = (r40v9 long), (r40v20 long) binds: [B:137:0x06dc, B:99:0x0498] A[DONT_GENERATE, DONT_INLINE]
      0x06f5: PHI (r42v19 long) = (r42v9 long), (r42v20 long) binds: [B:137:0x06dc, B:99:0x0498] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m42304(C9047 c9047, C9047 c9048) {
        int iM6981;
        int i;
        int i2;
        long j;
        IdentityHashMap identityHashMap;
        IdentityHashMap identityHashMap2;
        IdentityHashMap identityHashMap3;
        int iM2566;
        int i3;
        IdentityHashMap identityHashMap4;
        int iM6982;
        int i4;
        int i5;
        int iM2567;
        int i6;
        int i7;
        int iM2568;
        int i8;
        int i9;
        C9047 c9049 = c9047;
        long j2 = 0;
        IdentityHashMap identityHashMap5 = null;
        ArrayDeque arrayDeque = null;
        Object objM3791 = null;
        C6018 c6018 = null;
        IdentityHashMap identityHashMap6 = null;
        ArrayDeque arrayDeque2 = null;
        ArrayDeque arrayDeque3 = null;
        IdentityHashMap identityHashMap7 = null;
        C6018 c6019 = null;
        Iterator itM10483 = null;
        C6018 c60110 = null;
        C6018 c60111 = null;
        C9047 c90410 = null;
        long jM28024 = 0;
        Iterator itM10484 = null;
        Iterator itM1837 = null;
        int i10 = -1327400034;
        int i11 = C0630.f2410;
        int i12 = C3911.f12484;
        int iM6983 = (C2105.m6981("֡᩷") + i11) * (-9);
        int i13 = ((iM6983 ^ i12) * (-17453)) ^ 701942478;
        int i14 = iM6983 ^ 1726016446;
        long j3 = 0;
        long jM3495 = 0;
        long j4 = 0;
        long jM3496 = 0;
        IdentityHashMap identityHashMap8 = null;
        IdentityHashMap identityHashMap9 = null;
        IdentityHashMap identityHashMap10 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 27495) >> 31));
            switch (i10) {
                case -2136354224:
                case -2019063495:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    j3 = j3;
                    long j5 = j4;
                    jM3496 = jM3496;
                    j = j5;
                    if (!C0483.m2123(itM10483)) {
                        identityHashMap3 = identityHashMap10;
                        iM6982 = C0630.m2566("ۚۡ") ^ i12;
                        i4 = ((iM6982 ^ i11) * 7313) ^ 1199581504;
                        i5 = -186847431;
                        i14 = iM6982 ^ i5;
                        identityHashMap10 = identityHashMap3;
                        i13 = i4;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j6 = jM3496;
                        j4 = j;
                        jM3496 = j6;
                    } else {
                        iM2567 = (C2105.m6981("ܿܿ") + i12) * 21;
                        i6 = ((iM2567 ^ i11) * (-31557)) ^ 1884420892;
                        i7 = 1715602943;
                        i14 = iM2567 ^ i7;
                        i13 = i6;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j7 = jM3496;
                        j4 = j;
                        jM3496 = j7;
                    }
                    break;
                case -2116787086:
                case 1062404852:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        j2 = j2;
                        identityHashMap6 = identityHashMap6;
                        j3 = j3;
                        long j8 = j4;
                        jM3496 = jM3496;
                        j = j8;
                        int iM6984 = (i12 - C2105.m6981("᩵ܰ")) * (-9);
                        i13 = ((iM6984 ^ i11) * (-20123)) ^ 1829074551;
                        i14 = iM6984 ^ (-1484627415);
                        identityHashMap10 = null;
                        c9049 = c9047;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j9 = jM3496;
                        j4 = j;
                        jM3496 = j9;
                    } else {
                        iM6981 = (C2105.m6981("ۡ۟") ^ i11) * 17;
                        i = ((iM6981 ^ i12) * (-15947)) ^ (-539119242);
                        i2 = -1974980399;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                    }
                    break;
                case -2104355681:
                case -1762189082:
                    C3663.m11175(arrayDeque, (C6018) C2272.m7513(itM10483));
                    identityHashMap3 = identityHashMap10;
                    j = j4;
                    iM6982 = C2105.m6981("ۙܰ") ^ i11;
                    i4 = ((iM6982 ^ i12) * 15621) ^ 2147464669;
                    i5 = -585646840;
                    i14 = iM6982 ^ i5;
                    identityHashMap10 = identityHashMap3;
                    i13 = i4;
                    j3 = j3;
                    identityHashMap6 = identityHashMap6;
                    j2 = j2;
                    long j10 = jM3496;
                    j4 = j;
                    jM3496 = j10;
                    break;
                case -2074575433:
                case -949354651:
                    if (AbstractC2021.f6743 > 0) {
                        iM6981 = (C2105.m6981("ۤ᩸") + i11) * (-101);
                        i = ((iM6981 ^ i12) * 18935) ^ (-1234989637);
                        i2 = 142730122;
                    } else {
                        iM6981 = (C2105.m6981("᩺ۧ") + i11) * (-101);
                        i = ((iM6981 ^ i12) * 3043) ^ (-151932578);
                        i2 = -196611240;
                    }
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    break;
                case -1984479379:
                case -793219113:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    long j11 = j4;
                    jM3496 = jM3496;
                    j = j11;
                    j3 = j3;
                    jM3495 = C1005.m3495(j3, c60111.f18472);
                    c90410 = c60111.f18476;
                    if (C1420.f5096 > 0) {
                        iM2567 = C2105.m6981("ܳᩳ") ^ i12;
                        i6 = ((iM2567 ^ i11) * (-21779)) ^ 20599484;
                        i7 = 903863418;
                        i14 = iM2567 ^ i7;
                        i13 = i6;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j12 = jM3496;
                        j4 = j;
                        jM3496 = j12;
                    } else {
                        identityHashMap3 = identityHashMap10;
                        iM6982 = (C0630.m2566("ۛ۟") + i11) * 3;
                        i4 = ((iM6982 ^ i12) * (-32017)) ^ 1490645983;
                        i5 = -1308679057;
                        i14 = iM6982 ^ i5;
                        identityHashMap10 = identityHashMap3;
                        i13 = i4;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j13 = jM3496;
                        j4 = j;
                        jM3496 = j13;
                    }
                    break;
                case -1879353335:
                case -1538938226:
                    C4616.m13552();
                    return 0L;
                case -1873739817:
                case 1171856903:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    identityHashMap3 = identityHashMap10;
                    j3 = j3;
                    long j14 = j4;
                    jM3496 = jM3496;
                    j = j14;
                    objM3791 = RunnableC1108.m3791(C0382.m1837(C3432.m10486(identityHashMap9)));
                    if (C22628.m50615() != 0) {
                        iM6982 = (C0630.m2566("ۛ۟") + i11) * 3;
                        i4 = ((iM6982 ^ i12) * (-32017)) ^ 1490645983;
                        i5 = -1308679057;
                    } else {
                        iM6982 = C0630.m2566("᩻۟") ^ i11;
                        i4 = ((iM6982 ^ i12) * (-6991)) ^ (-401230298);
                        i5 = -204938985;
                    }
                    i14 = iM6982 ^ i5;
                    identityHashMap10 = identityHashMap3;
                    i13 = i4;
                    j3 = j3;
                    identityHashMap6 = identityHashMap6;
                    j2 = j2;
                    long j15 = jM3496;
                    j4 = j;
                    jM3496 = j15;
                    break;
                case -1799858561:
                case 306123371:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    identityHashMap3 = identityHashMap10;
                    j3 = j3;
                    long j16 = j4;
                    jM3496 = jM3496;
                    j = j16;
                    if (C2167.m7162(arrayDeque)) {
                        iM6982 = (C0630.m2566("ۢᩳ") ^ i12) * (-73);
                        i4 = ((iM6982 ^ i11) * 23813) ^ 1791290758;
                        i5 = -2088202893;
                    } else {
                        iM6982 = (C2105.m6981("ۖ۬") ^ i12) * 87;
                        i4 = ((iM6982 ^ i11) * (-26935)) ^ 2011938946;
                        i5 = 1604670849;
                    }
                    i14 = iM6982 ^ i5;
                    identityHashMap10 = identityHashMap3;
                    i13 = i4;
                    j3 = j3;
                    identityHashMap6 = identityHashMap6;
                    j2 = j2;
                    long j17 = jM3496;
                    j4 = j;
                    jM3496 = j17;
                    break;
                case -1705299522:
                case 1017811420:
                    C1504.m5174(arrayDeque3, (C6018) RunnableC1108.m3791(itM10484));
                    iM6981 = (C0630.m2566("ۛ֫") ^ i12) * (-111);
                    i = ((iM6981 ^ i11) * 23493) ^ (-1761612022);
                    i2 = -1077869316;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    break;
                case -1682777222:
                case 1273314893:
                    identityHashMap6.clear();
                    m42322(c60110.f18476, identityHashMap6);
                    itM1837 = C0382.m1837(C0382.m1841(identityHashMap6));
                    iM6981 = C0630.m2566("ۛۙ") ^ i11;
                    i = ((iM6981 ^ i12) * 31423) ^ (-1391437554);
                    i2 = -221953681;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    break;
                case -1578468463:
                case -1188487125:
                    C0050.m940();
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("ܰ֫") ^ i12;
                        i = ((iM6981 ^ i11) * (-1425)) ^ (-622529000);
                        i2 = 946677189;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                    } else {
                        j2 = j2;
                        identityHashMap6 = identityHashMap6;
                        j3 = j3;
                        long j18 = j4;
                        jM3496 = jM3496;
                        j = j18;
                        int iM6985 = (i12 - C2105.m6981("᩵ܰ")) * (-9);
                        i13 = ((iM6985 ^ i11) * (-20123)) ^ 1829074551;
                        i14 = iM6985 ^ (-1484627415);
                        identityHashMap10 = null;
                        c9049 = c9047;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j19 = jM3496;
                        j4 = j;
                        jM3496 = j19;
                    }
                    break;
                case -1468697225:
                case 502367690:
                    if (!C0483.m2123(itM1837)) {
                        j2 = j2;
                        identityHashMap = identityHashMap6;
                        identityHashMap2 = identityHashMap10;
                        j3 = j3;
                        long j20 = j4;
                        jM3496 = jM3496;
                        j = j20;
                        int iM2569 = C0630.m2566("᩸ܺ") ^ i11;
                        IdentityHashMap identityHashMap11 = identityHashMap;
                        i13 = ((iM2569 ^ i12) * (-6793)) ^ (-836949636);
                        i14 = iM2569 ^ (-1365565029);
                        j3 = j3;
                        identityHashMap6 = identityHashMap11;
                        identityHashMap10 = identityHashMap2;
                        j2 = j2;
                        long j110 = jM3496;
                        j4 = j;
                        jM3496 = j110;
                    } else {
                        iM6981 = (C0630.m2566("ܿܶ") ^ i12) * 51;
                        i = ((iM6981 ^ i11) * 26897) ^ 1894400812;
                        i2 = -1221256286;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                    }
                    break;
                case -1457492390:
                case -842625481:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    identityHashMap3 = identityHashMap10;
                    j3 = j3;
                    long j21 = j4;
                    jM3496 = jM3496;
                    j = j21;
                    if (C4616.f14690 > 0) {
                        identityHashMap9 = new IdentityHashMap();
                        if (C0714.m2805()) {
                            iM2566 = C0630.m2566("᩷֡") ^ i12;
                            i13 = ((iM2566 ^ i11) * 21393) ^ (-2014771238);
                            i3 = -78479148;
                            i14 = iM2566 ^ i3;
                            c9049 = c9047;
                            identityHashMap10 = identityHashMap3;
                            j3 = j3;
                            identityHashMap6 = identityHashMap6;
                            j2 = j2;
                            long j111 = jM3496;
                            j4 = j;
                            jM3496 = j111;
                        }
                        int iM6986 = (i12 - C2105.m6981("᩵ܰ")) * (-9);
                        i13 = ((iM6986 ^ i11) * (-20123)) ^ 1829074551;
                        i14 = iM6986 ^ (-1484627415);
                        identityHashMap10 = null;
                        c9049 = c9047;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j112 = jM3496;
                        j4 = j;
                        jM3496 = j112;
                    } else {
                        identityHashMap10 = identityHashMap3;
                        int iM6987 = (C2105.m6981("᩹֡") ^ i12) * 127;
                        i13 = ((iM6987 ^ i11) * 16761) ^ 659417967;
                        i14 = iM6987 ^ 1313336646;
                        identityHashMap9 = null;
                        c9049 = c9047;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j113 = jM3496;
                        j4 = j;
                        jM3496 = j113;
                    }
                    break;
                case -1455047637:
                case -1434191249:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    long j22 = j4;
                    jM3496 = jM3496;
                    j = j22;
                    arrayDeque3 = new ArrayDeque(C3432.m10486(identityHashMap9));
                    identityHashMap7 = new IdentityHashMap();
                    j3 = j2;
                    int iM25610 = C0630.m2566("֫ۜ") ^ i12;
                    i14 = iM25610 ^ (-700467024);
                    identityHashMap10 = identityHashMap10;
                    i13 = ((iM25610 ^ i11) * (-30957)) ^ (-244975496);
                    identityHashMap6 = identityHashMap6;
                    j2 = j2;
                    long j114 = jM3496;
                    j4 = j;
                    jM3496 = j114;
                    break;
                case -1451543147:
                case 402765268:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    identityHashMap3 = identityHashMap10;
                    j3 = j3;
                    long j23 = j4;
                    jM3496 = jM3496;
                    j = j23;
                    c6018 = (C6018) objM3791;
                    if (!m42337(c9049, c6018)) {
                        iM6982 = (C2105.m6981("ۚۧ") + i11) * 123;
                        i4 = ((iM6982 ^ i12) * (-28007)) ^ 851195326;
                        i5 = 1750045948;
                        i14 = iM6982 ^ i5;
                        identityHashMap10 = identityHashMap3;
                        i13 = i4;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j115 = jM3496;
                        j4 = j;
                        jM3496 = j115;
                    } else {
                        identityHashMap4 = identityHashMap9;
                        int iM25611 = C0630.m2566("ۗ֡") ^ i11;
                        int i15 = ((iM25611 ^ i12) * 28963) ^ 439036315;
                        i14 = iM25611 ^ (-1840482121);
                        identityHashMap9 = identityHashMap4;
                        identityHashMap10 = identityHashMap3;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        i13 = i15;
                        c9049 = c9047;
                        long j116 = jM3496;
                        j4 = j;
                        jM3496 = j116;
                    }
                    break;
                case -1320959588:
                case -146777525:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    long j24 = j4;
                    jM3496 = C1005.m3495(j24, C19631.m45128(c60111.f18476));
                    if (C2105.f7037 != 0) {
                        iM2568 = C2105.m6981("ᩴۖ") ^ i12;
                        i8 = ((iM2568 ^ i11) * 30507) ^ 730932945;
                        i9 = -1893839357;
                    } else {
                        iM2568 = C0630.m2566("ᩴ֨") ^ i12;
                        i8 = ((iM2568 ^ i11) * (-6271)) ^ 1521202788;
                        i9 = 675011205;
                    }
                    i14 = iM2568 ^ i9;
                    i13 = i8;
                    j4 = j24;
                    identityHashMap6 = identityHashMap6;
                    j2 = j2;
                    break;
                case -1318341141:
                case -561059925:
                    RunnableC0588.m2441();
                    if (!C1504.f5354) {
                        iM6981 = (C2105.m6981("ۤ᩸") + i11) * (-101);
                        i = ((iM6981 ^ i12) * 18935) ^ (-1234989637);
                        i2 = 142730122;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                    } else {
                        j2 = j2;
                        identityHashMap6 = identityHashMap6;
                        j3 = j3;
                        long j25 = j4;
                        jM3496 = jM3496;
                        j = j25;
                        int iM6988 = (C2105.m6981("᩹֡") ^ i12) * 127;
                        i13 = ((iM6988 ^ i11) * 16761) ^ 659417967;
                        i14 = iM6988 ^ 1313336646;
                        identityHashMap9 = null;
                        c9049 = c9047;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j117 = jM3496;
                        j4 = j;
                        jM3496 = j117;
                    }
                    break;
                case -1265303676:
                case -751041585:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    jM3496 = jM3496;
                    long j26 = jM3495;
                    long jM28025 = C11340.m28024(j26, C19631.m45118(c90410));
                    if (RunnableC3474.m10630()) {
                        int iM6989 = C2105.m6981("ᩳ᩷") ^ i11;
                        jM3495 = j26;
                        i13 = ((iM6989 ^ i12) * 9527) ^ 1590977542;
                        i14 = iM6989 ^ (-336568130);
                        j2 = j2;
                        jM3496 = jM3496;
                        j4 = jM28025;
                        identityHashMap6 = identityHashMap6;
                    } else {
                        jM3495 = j26;
                        j = jM28025;
                        identityHashMap3 = identityHashMap10;
                        j3 = j3;
                        iM6982 = (C0630.m2566("ۛ۟") + i11) * 3;
                        i4 = ((iM6982 ^ i12) * (-32017)) ^ 1490645983;
                        i5 = -1308679057;
                        i14 = iM6982 ^ i5;
                        identityHashMap10 = identityHashMap3;
                        i13 = i4;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j118 = jM3496;
                        j4 = j;
                        jM3496 = j118;
                    }
                    break;
                case -1156686645:
                case -922988965:
                    return j2;
                case -1028850311:
                case -458707397:
                    C3746.m11369();
                    if (C4117.f13076 <= 0) {
                        iM6981 = (C2105.m6981("ۤ᩸") + i11) * (-101);
                        i = ((iM6981 ^ i12) * 18935) ^ (-1234989637);
                        i2 = 142730122;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                    } else {
                        j2 = j2;
                        identityHashMap6 = identityHashMap6;
                        j3 = j3;
                        long j119 = j4;
                        jM3496 = jM3496;
                        j = j119;
                        int iM69810 = (i12 - C2105.m6981("᩵ܰ")) * (-9);
                        i13 = ((iM69810 ^ i11) * (-20123)) ^ 1829074551;
                        i14 = iM69810 ^ (-1484627415);
                        identityHashMap10 = null;
                        c9049 = c9047;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j1110 = jM3496;
                        j4 = j;
                        jM3496 = j1110;
                    }
                    break;
                case -824457948:
                case 1764927015:
                    identityHashMap6 = identityHashMap6;
                    j2 = j2;
                    long j27 = jM3496;
                    jM28024 = C11340.m28024(j27, C19631.m45142(c60111.f18476));
                    identityHashMap7.clear();
                    if (C1420.f5096 > 0) {
                        int iM69811 = C2105.m6981("᩻ܿ") ^ i11;
                        i14 = iM69811 ^ 1975010011;
                        jM3496 = j27;
                        i13 = ((iM69811 ^ i12) * 20051) ^ (-1180386196);
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                    } else {
                        j3 = j3;
                        j = j4;
                        jM3496 = j27;
                        int iM69812 = (C2105.m6981("᩹֡") ^ i12) * 127;
                        i13 = ((iM69812 ^ i11) * 16761) ^ 659417967;
                        i14 = iM69812 ^ 1313336646;
                        identityHashMap9 = null;
                        c9049 = c9047;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j1111 = jM3496;
                        j4 = j;
                        jM3496 = j1111;
                    }
                    break;
                case -795240764:
                case 1491870324:
                    return j3;
                case -654716068:
                case -46040378:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    identityHashMap3 = identityHashMap10;
                    j3 = j3;
                    long j28 = j4;
                    jM3496 = jM3496;
                    j = j28;
                    m42322(c9049, identityHashMap3);
                    arrayDeque = new ArrayDeque(C3432.m10486(identityHashMap3));
                    iM6982 = C0630.m2566("ۚۡ") ^ i12;
                    i4 = ((iM6982 ^ i11) * 7313) ^ 1199581504;
                    i5 = -186847431;
                    i14 = iM6982 ^ i5;
                    identityHashMap10 = identityHashMap3;
                    i13 = i4;
                    j3 = j3;
                    identityHashMap6 = identityHashMap6;
                    j2 = j2;
                    long j1112 = jM3496;
                    j4 = j;
                    jM3496 = j1112;
                    break;
                case -636399439:
                case 405515724:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    j3 = j3;
                    long j29 = j4;
                    jM3496 = jM3496;
                    j = j29;
                    C6018 c60112 = (C6018) arrayDeque2.pop();
                    if (C0714.m2809(identityHashMap8, c60112, Boolean.TRUE) == null) {
                        int iM69813 = C2105.m6981("ۡۗ") ^ i12;
                        i4 = ((iM69813 ^ i11) * 12875) ^ 299625803;
                        i14 = iM69813 ^ (-294394495);
                        c60110 = c60112;
                        i13 = i4;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j1113 = jM3496;
                        j4 = j;
                        jM3496 = j1113;
                    } else {
                        c60110 = c60112;
                        identityHashMap2 = identityHashMap10;
                        identityHashMap = identityHashMap6;
                        int iM25612 = C0630.m2566("᩸ܺ") ^ i11;
                        IdentityHashMap identityHashMap12 = identityHashMap;
                        i13 = ((iM25612 ^ i12) * (-6793)) ^ (-836949636);
                        i14 = iM25612 ^ (-1365565029);
                        j3 = j3;
                        identityHashMap6 = identityHashMap12;
                        identityHashMap10 = identityHashMap2;
                        j2 = j2;
                        long j1114 = jM3496;
                        j4 = j;
                        jM3496 = j1114;
                    }
                    break;
                case -342632584:
                case 944472242:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    j3 = j3;
                    long j30 = j4;
                    jM3496 = jM3496;
                    j = j30;
                    C6018 c60113 = (C6018) arrayDeque3.pop();
                    if (C2167.m7148(identityHashMap5, c60113, Boolean.TRUE) == null) {
                        int iM69814 = (C2105.m6981("ܿܰ") + i11) * 41;
                        i4 = ((iM69814 ^ i12) * (-4819)) ^ (-177060344);
                        i14 = iM69814 ^ 265047490;
                        c60111 = c60113;
                        i13 = i4;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j1115 = jM3496;
                        j4 = j;
                        jM3496 = j1115;
                    } else {
                        c60111 = c60113;
                        j3 = j3;
                        int iM25613 = C0630.m2566("֫ۜ") ^ i12;
                        i14 = iM25613 ^ (-700467024);
                        identityHashMap10 = identityHashMap10;
                        i13 = ((iM25613 ^ i11) * (-30957)) ^ (-244975496);
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j1116 = jM3496;
                        j4 = j;
                        jM3496 = j1116;
                    }
                    break;
                case -198642401:
                case 977185284:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    identityHashMap3 = identityHashMap10;
                    j3 = j3;
                    long j31 = j4;
                    jM3496 = jM3496;
                    j = j31;
                    if (C2167.m7162(arrayDeque2)) {
                        iM6982 = (i11 - C0630.m2566("ۡ᩻")) * (-97);
                        i4 = ((iM6982 ^ i12) * (-18229)) ^ (-1256700693);
                        i5 = -1455877503;
                    } else {
                        iM6982 = (C0630.m2566("᩷ܳ") ^ i12) * (-35);
                        i4 = ((iM6982 ^ i11) * (-11241)) ^ (-1377286600);
                        i5 = -1253398796;
                    }
                    i14 = iM6982 ^ i5;
                    identityHashMap10 = identityHashMap3;
                    i13 = i4;
                    j3 = j3;
                    identityHashMap6 = identityHashMap6;
                    j2 = j2;
                    long j1117 = jM3496;
                    j4 = j;
                    jM3496 = j1117;
                    break;
                case -138222861:
                case 1513671280:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    identityHashMap3 = identityHashMap10;
                    j3 = j3;
                    long j32 = j4;
                    jM3496 = jM3496;
                    j = j32;
                    if (identityHashMap9.size() == 1) {
                        iM6982 = (C2105.m6981("ܿ۠") + i12) * 35;
                        i4 = ((iM6982 ^ i11) * (-13247)) ^ 297497620;
                        i5 = 24978517;
                    } else {
                        iM6982 = (i11 - C0630.m2566("ۡ᩻")) * (-97);
                        i4 = ((iM6982 ^ i12) * (-18229)) ^ (-1256700693);
                        i5 = -1455877503;
                    }
                    i14 = iM6982 ^ i5;
                    identityHashMap10 = identityHashMap3;
                    i13 = i4;
                    j3 = j3;
                    identityHashMap6 = identityHashMap6;
                    j2 = j2;
                    long j1118 = jM3496;
                    j4 = j;
                    jM3496 = j1118;
                    break;
                case -81543075:
                case 1458421879:
                    j2 = j2;
                    identityHashMap2 = identityHashMap10;
                    j3 = j3;
                    long j33 = j4;
                    jM3496 = jM3496;
                    j = j33;
                    identityHashMap = new IdentityHashMap();
                    m42322(c9049, identityHashMap);
                    if (C4263.f13799 <= 0) {
                        int iM25614 = (i11 - C0630.m2566("᩺ܰ")) * (-29);
                        i14 = iM25614 ^ (-206495234);
                        identityHashMap10 = identityHashMap2;
                        j3 = j3;
                        j2 = j2;
                        identityHashMap6 = identityHashMap;
                        i13 = ((iM25614 ^ i12) * 19191) ^ (-821915868);
                        identityHashMap8 = null;
                    } else {
                        IdentityHashMap identityHashMap13 = new IdentityHashMap();
                        arrayDeque2 = new ArrayDeque(C3432.m10486(identityHashMap));
                        identityHashMap8 = identityHashMap13;
                        int iM25615 = C0630.m2566("᩸ܺ") ^ i11;
                        IdentityHashMap identityHashMap14 = identityHashMap;
                        i13 = ((iM25615 ^ i12) * (-6793)) ^ (-836949636);
                        i14 = iM25615 ^ (-1365565029);
                        j3 = j3;
                        identityHashMap6 = identityHashMap14;
                        identityHashMap10 = identityHashMap2;
                        j2 = j2;
                    }
                    long j1119 = jM3496;
                    j4 = j;
                    jM3496 = j1119;
                    break;
                case 9388446:
                case 1778275060:
                    if (!C0798.f2919) {
                        iM6981 = (C2105.m6981("᩺ۧ") + i11) * (-101);
                        i = ((iM6981 ^ i12) * 3043) ^ (-151932578);
                        i2 = -196611240;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                    } else {
                        j2 = j2;
                        identityHashMap = identityHashMap6;
                        identityHashMap2 = identityHashMap10;
                        j3 = j3;
                        long j34 = j4;
                        jM3496 = jM3496;
                        j = j34;
                        int iM25616 = (i11 - C0630.m2566("᩺ܰ")) * (-29);
                        i14 = iM25616 ^ (-206495234);
                        identityHashMap10 = identityHashMap2;
                        j3 = j3;
                        j2 = j2;
                        identityHashMap6 = identityHashMap;
                        i13 = ((iM25616 ^ i12) * 19191) ^ (-821915868);
                        identityHashMap8 = null;
                        long j11110 = jM3496;
                        j4 = j;
                        jM3496 = j11110;
                    }
                    break;
                case 69731784:
                case 1214939652:
                    C3663.m11175(arrayDeque2, (C6018) RunnableC1108.m3791(itM1837));
                    iM6981 = C0630.m2566("ۛۙ") ^ i11;
                    i = ((iM6981 ^ i12) * 31423) ^ (-1391437554);
                    i2 = -221953681;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    break;
                case 143662978:
                case 2134198270:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    j3 = j3;
                    long j35 = j4;
                    jM3496 = jM3496;
                    j = j35;
                    if (!m42337(c60110.f18476, c6018)) {
                        iM2567 = C2105.m6981("᩵ܺ") ^ i11;
                        i6 = ((iM2567 ^ i12) * (-24491)) ^ (-61092135);
                        i7 = -1056895143;
                        i14 = iM2567 ^ i7;
                        i13 = i6;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j11111 = jM3496;
                        j4 = j;
                        jM3496 = j11111;
                    } else {
                        identityHashMap4 = identityHashMap9;
                        identityHashMap3 = identityHashMap10;
                        int iM25617 = C0630.m2566("ۗ֡") ^ i11;
                        int i16 = ((iM25617 ^ i12) * 28963) ^ 439036315;
                        i14 = iM25617 ^ (-1840482121);
                        identityHashMap9 = identityHashMap4;
                        identityHashMap10 = identityHashMap3;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        i13 = i16;
                        c9049 = c9047;
                        long j11112 = jM3496;
                        j4 = j;
                        jM3496 = j11112;
                    }
                    break;
                case 174668149:
                case 1449510133:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    j3 = j3;
                    long j36 = j4;
                    jM3496 = jM3496;
                    j = j36;
                    identityHashMap5 = new IdentityHashMap();
                    if (C4159.m12565() < 0) {
                        identityHashMap10 = new IdentityHashMap();
                        if (C0964.f3626 == 0) {
                            iM2567 = (C0630.m2566("ۙ֡") ^ i12) * (-9);
                            i6 = ((iM2567 ^ i11) * (-12609)) ^ (-1843476999);
                            i7 = 956683079;
                            i14 = iM2567 ^ i7;
                            i13 = i6;
                            j3 = j3;
                            identityHashMap6 = identityHashMap6;
                            j2 = j2;
                            long j11113 = jM3496;
                            j4 = j;
                            jM3496 = j11113;
                        } else {
                            int iM69815 = (C2105.m6981("᩹֡") ^ i12) * 127;
                            i13 = ((iM69815 ^ i11) * 16761) ^ 659417967;
                            i14 = iM69815 ^ 1313336646;
                            identityHashMap9 = null;
                            c9049 = c9047;
                            j3 = j3;
                            identityHashMap6 = identityHashMap6;
                            j2 = j2;
                            long j11114 = jM3496;
                            j4 = j;
                            jM3496 = j11114;
                        }
                    } else {
                        int iM69816 = (i12 - C2105.m6981("᩵ܰ")) * (-9);
                        i13 = ((iM69816 ^ i11) * (-20123)) ^ 1829074551;
                        i14 = iM69816 ^ (-1484627415);
                        identityHashMap10 = null;
                        c9049 = c9047;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j11115 = jM3496;
                        j4 = j;
                        jM3496 = j11115;
                    }
                    break;
                case 349283869:
                case 685749188:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    identityHashMap3 = identityHashMap10;
                    j3 = j3;
                    long j37 = j4;
                    jM3496 = jM3496;
                    j = j37;
                    c6019 = (C6018) arrayDeque.pop();
                    if (C2167.m7148(identityHashMap5, c6019, Boolean.TRUE) != null) {
                        iM6982 = C0630.m2566("ۚۡ") ^ i12;
                        i4 = ((iM6982 ^ i11) * 7313) ^ 1199581504;
                        i5 = -186847431;
                    } else {
                        iM6982 = (C2105.m6981("ۚۜ") + i11) * (-113);
                        i4 = ((iM6982 ^ i12) * (-10761)) ^ (-310032228);
                        i5 = -1414435603;
                    }
                    i14 = iM6982 ^ i5;
                    identityHashMap10 = identityHashMap3;
                    i13 = i4;
                    j3 = j3;
                    identityHashMap6 = identityHashMap6;
                    j2 = j2;
                    long j11116 = jM3496;
                    j4 = j;
                    jM3496 = j11116;
                    break;
                case 357711548:
                case 1558490889:
                    if (!C0483.m2123(itM10484)) {
                        j2 = j2;
                        identityHashMap6 = identityHashMap6;
                        j3 = jM28024;
                        long j38 = j4;
                        jM3496 = jM3496;
                        j = j38;
                        int iM25618 = C0630.m2566("֫ۜ") ^ i12;
                        i14 = iM25618 ^ (-700467024);
                        identityHashMap10 = identityHashMap10;
                        i13 = ((iM25618 ^ i11) * (-30957)) ^ (-244975496);
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j11117 = jM3496;
                        j4 = j;
                        jM3496 = j11117;
                    } else {
                        iM6981 = (C2105.m6981("ܽ᩵") ^ i11) * 37;
                        i = ((iM6981 ^ i12) * 12837) ^ 2010238797;
                        i2 = -2128073112;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                    }
                    break;
                case 498244811:
                case 1927555960:
                    identityHashMap6 = identityHashMap6;
                    identityHashMap4 = identityHashMap9;
                    identityHashMap3 = identityHashMap10;
                    j3 = j3;
                    long j39 = j4;
                    jM3496 = jM3496;
                    j = j39;
                    m42322(c9048, identityHashMap4);
                    j2 = 0;
                    if (identityHashMap4.isEmpty()) {
                        int iM25619 = C0630.m2566("ۗ֡") ^ i11;
                        int i17 = ((iM25619 ^ i12) * 28963) ^ 439036315;
                        i14 = iM25619 ^ (-1840482121);
                        identityHashMap9 = identityHashMap4;
                        identityHashMap10 = identityHashMap3;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        i13 = i17;
                        c9049 = c9047;
                    } else {
                        iM2566 = (i11 - C2105.m6981("᩷᩵")) * 7;
                        identityHashMap9 = identityHashMap4;
                        i13 = ((iM2566 ^ i12) * 14365) ^ 1215990714;
                        i3 = -1921155029;
                        i14 = iM2566 ^ i3;
                        c9049 = c9047;
                        identityHashMap10 = identityHashMap3;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                    }
                    long j11118 = jM3496;
                    j4 = j;
                    jM3496 = j11118;
                    break;
                case 789287353:
                case 799472192:
                    m42322(c60111.f18476, identityHashMap7);
                    itM10484 = C3432.m10483(C0382.m1841(identityHashMap7));
                    iM6981 = (C0630.m2566("ۛ֫") ^ i12) * (-111);
                    i = ((iM6981 ^ i11) * 23493) ^ (-1761612022);
                    i2 = -1077869316;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    break;
                case 819734580:
                case 1131813162:
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    identityHashMap3 = identityHashMap10;
                    j3 = j3;
                    long j40 = j4;
                    jM3496 = jM3496;
                    j = j40;
                    if (C0714.m2812(arrayDeque3)) {
                        iM6982 = C0630.m2566("ۖܽ") ^ i11;
                        i4 = ((iM6982 ^ i12) * 18689) ^ (-454847804);
                        i5 = 39589397;
                    } else {
                        iM6982 = C0630.m2566("֨֨") ^ i12;
                        i4 = ((iM6982 ^ i11) * 17107) ^ 1829013923;
                        i5 = -559410265;
                    }
                    i14 = iM6982 ^ i5;
                    identityHashMap10 = identityHashMap3;
                    i13 = i4;
                    j3 = j3;
                    identityHashMap6 = identityHashMap6;
                    j2 = j2;
                    long j11119 = jM3496;
                    j4 = j;
                    jM3496 = j11119;
                    break;
                case 911729442:
                case 1546974485:
                    j = j4;
                    identityHashMap10.clear();
                    identityHashMap3 = identityHashMap10;
                    m42322(c6019.f18476, identityHashMap3);
                    itM10483 = C3432.m10483(C3432.m10486(identityHashMap3));
                    iM6982 = C2105.m6981("ۙܰ") ^ i11;
                    i4 = ((iM6982 ^ i12) * 15621) ^ 2147464669;
                    i5 = -585646840;
                    i14 = iM6982 ^ i5;
                    identityHashMap10 = identityHashMap3;
                    i13 = i4;
                    j3 = j3;
                    identityHashMap6 = identityHashMap6;
                    j2 = j2;
                    long j111110 = jM3496;
                    j4 = j;
                    jM3496 = j111110;
                    break;
                case 1168301407:
                case 1620539864:
                    C4159.m12565();
                    if (C0382.m1848()) {
                        iM6981 = (C2105.m6981("ۡ۟") ^ i11) * 17;
                        i = ((iM6981 ^ i12) * (-15947)) ^ (-539119242);
                        i2 = -1974980399;
                    } else {
                        iM6981 = (C2105.m6981("᩺᩺") ^ i12) * (-53);
                        i = ((iM6981 ^ i11) * (-10143)) ^ 1677608976;
                        i2 = 1021574604;
                    }
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    break;
                case 1204370649:
                case 1239649806:
                    if (C3663.m11168() < 0) {
                        j2 = j2;
                        identityHashMap6 = identityHashMap6;
                        identityHashMap3 = identityHashMap10;
                        j3 = j3;
                        long j41 = j4;
                        jM3496 = jM3496;
                        j = j41;
                        iM6982 = (C0630.m2566("ۛ۟") + i11) * 3;
                        i4 = ((iM6982 ^ i12) * (-32017)) ^ 1490645983;
                        i5 = -1308679057;
                        i14 = iM6982 ^ i5;
                        identityHashMap10 = identityHashMap3;
                        i13 = i4;
                        j3 = j3;
                        identityHashMap6 = identityHashMap6;
                        j2 = j2;
                        long j111111 = jM3496;
                        j4 = j;
                        jM3496 = j111111;
                    }
                    j2 = j2;
                    identityHashMap6 = identityHashMap6;
                    j3 = j3;
                    long j1120 = j4;
                    jM3496 = jM3496;
                    j = j1120;
                    int iM69817 = (i12 - C2105.m6981("᩵ܰ")) * (-9);
                    i13 = ((iM69817 ^ i11) * (-20123)) ^ 1829074551;
                    i14 = iM69817 ^ (-1484627415);
                    identityHashMap10 = null;
                    c9049 = c9047;
                    j3 = j3;
                    identityHashMap6 = identityHashMap6;
                    j2 = j2;
                    long j111112 = jM3496;
                    j4 = j;
                    jM3496 = j111112;
                    break;
                default:
                    C1711.m5736();
                    C0382.m1848();
                    iM6981 = (C2105.m6981("ۡ۟") ^ i11) * 17;
                    i = ((iM6981 ^ i12) * (-15947)) ^ (-539119242);
                    i2 = -1974980399;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x04ef A[PHI: r2 r7 r16 r24 r28
      0x04ef: PHI (r2v26 long) = (r2v10 long), (r2v11 long), (r2v13 long), (r2v27 long) binds: [B:119:0x04ed, B:115:0x04c2, B:106:0x0446, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x04ef: PHI (r7v61 l.᩸ۧܳ) = (r7v36 l.᩸ۧܳ), (r7v37 l.᩸ۧܳ), (r7v39 l.᩸ۧܳ), (r7v62 l.᩸ۧܳ) binds: [B:119:0x04ed, B:115:0x04c2, B:106:0x0446, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x04ef: PHI (r16v17 long) = (r16v6 long), (r16v7 long), (r16v9 long), (r16v18 long) binds: [B:119:0x04ed, B:115:0x04c2, B:106:0x0446, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x04ef: PHI (r24v23 l.ᩳۧܳ) = (r24v7 l.ᩳۧܳ), (r24v8 l.ᩳۧܳ), (r24v10 l.ᩳۧܳ), (r24v24 l.ᩳۧܳ) binds: [B:119:0x04ed, B:115:0x04c2, B:106:0x0446, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x04ef: PHI (r28v67 byte[]) = (r28v28 byte[]), (r28v29 byte[]), (r28v31 byte[]), (r28v68 byte[]) binds: [B:119:0x04ed, B:115:0x04c2, B:106:0x0446, B:12:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0125 A[PHI: r2
      0x0125: PHI (r2v5 l.ᩳۧܳ) = (r2v3 l.ᩳۧܳ), (r2v2 l.ᩳۧܳ) binds: [B:37:0x0123, B:8:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0246 A[PHI: r7 r18
      0x0246: PHI (r7v58 byte[]) = (r7v13 byte[]), (r7v54 byte[]), (r7v59 byte[]) binds: [B:48:0x0196, B:65:0x0244, B:58:0x01fa] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r18v2 long) = (r18v1 long), (r18v1 long), (r18v3 long) binds: [B:48:0x0196, B:65:0x0244, B:58:0x01fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010d, code lost:
    
        if (l.C5695.f17556 < 0) goto L20;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C9047 m42355(C9047 c9047, InterfaceC17066 interfaceC17066) throws C23821 {
        int iM6981;
        int i;
        int i2;
        byte[] bArr;
        C21541 c21541;
        C18013 c18013;
        long jM45137;
        long j;
        int iM6982;
        int i3;
        int i4;
        byte[] bArr2;
        C18013 c18014;
        C21541 c21542;
        int iM2566;
        int i5;
        int i6;
        C18013 c18015;
        int iM6983;
        int i7;
        int i8 = -1686104209;
        int i9 = C0422.f1886;
        int i10 = C4075.f12947;
        int iM2567 = (C0630.m2566("۠ۗ") + i9) * 11;
        int i11 = ((iM2567 ^ i10) * IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation) ^ (-1443294755);
        int i12 = iM2567 ^ 1555432965;
        C9047 c9047M42353 = null;
        long jM45142 = 0;
        C9047 c9047M45105 = null;
        byte[] bArr3 = null;
        int i13 = 0;
        long j2 = 0;
        C9047 c9048 = null;
        long j3 = 0;
        long j4 = 0;
        long jM28024 = 0;
        C18013 c18016 = null;
        long jM45143 = 0;
        C21541 c21543 = null;
        long j5 = 0;
        long jM45120 = 0;
        int i14 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * 24537) >> 31));
            switch (i8) {
                case -2041447014:
                case 18263036:
                    bArr3 = bArr3;
                    i13 = 0;
                    if (c9047M45105 == null) {
                        iM6983 = C2105.m6981("ܺ۬") ^ i9;
                        i11 = ((iM6983 ^ i10) * 9651) ^ (-475095720);
                        i7 = -1523359644;
                    } else {
                        iM6983 = (C0630.m2566("᩻᩷") ^ i10) * 63;
                        i11 = ((iM6983 ^ i9) * (-19409)) ^ 1262714766;
                        i7 = 2062414656;
                    }
                    i12 = iM6983 ^ i7;
                    bArr3 = bArr3;
                    break;
                case -1932060256:
                case -1700154828:
                    RunnableC3474.m10630();
                    return null;
                case -1931118353:
                case 612002801:
                    bArr3 = bArr3;
                    C21541 c21544 = c21543;
                    C18013 c18017 = c18016;
                    C9047 c9049 = c9047M42353;
                    C9047 c9047M42307 = m42307(c9049, C19631.m45137(c9047M42353), c21544);
                    if (C2167.m7150(interfaceC17066)) {
                        int iM6984 = C2105.m6981("۬ۤ") ^ i10;
                        i11 = ((iM6984 ^ i9) * 12289) ^ (-1371042491);
                        c9047M42353 = c9049;
                        c18016 = c18017;
                        c21543 = c21544;
                        c9048 = c9047M42307;
                        i12 = iM6984 ^ (-40740729);
                    } else {
                        int iM2568 = (C0630.m2566("ᩳۜ") + i10) * (-33);
                        c9047M42353 = c9049;
                        c18016 = c18017;
                        c21543 = c21544;
                        c9048 = c9047M42307;
                        i12 = iM2568 ^ (-1559952914);
                        i11 = ((iM2568 ^ i9) * (-21791)) ^ 2107145159;
                    }
                    bArr3 = bArr3;
                    break;
                case -1901966542:
                case -1739020326:
                    if (C3245.f10203 <= 0) {
                        iM6981 = C2105.m6981("ۛۧ") ^ i10;
                        i = ((iM6981 ^ i9) * (-25151)) ^ (-1751744715);
                        i2 = -2097577118;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                    } else {
                        bArr = bArr3;
                        c21541 = c21543;
                        c18013 = c18016;
                        jM45137 = j5;
                        j = jM45143;
                        iM6982 = C0630.m2566("֫ۨ") ^ i10;
                        i3 = ((iM6982 ^ i9) * (-30829)) ^ 346618715;
                        i4 = -42218486;
                        i11 = i3;
                        byte[] bArr4 = bArr;
                        i12 = iM6982 ^ i4;
                        bArr3 = bArr4;
                        C18013 c18018 = c18013;
                        c21543 = c21541;
                        long j6 = jM45137;
                        c18016 = c18018;
                        jM45143 = j;
                        j5 = j6;
                    }
                    break;
                case -1900299751:
                case -556186157:
                    RunnableC0588.m2441();
                    if (C3537.f11231 < 0) {
                        bArr3 = bArr3;
                        iM6983 = C2105.m6981("᩶ۢ") ^ i9;
                        i11 = ((iM6983 ^ i10) * (-22977)) ^ 1507900069;
                        i7 = 1663452913;
                        i12 = iM6983 ^ i7;
                        bArr3 = bArr3;
                    } else {
                        bArr = bArr3;
                        c21541 = c21543;
                        c18013 = c18016;
                        jM45137 = j5;
                        j = jM45143;
                        iM6982 = C0630.m2566("֫ۨ") ^ i10;
                        i3 = ((iM6982 ^ i9) * (-30829)) ^ 346618715;
                        i4 = -42218486;
                        i11 = i3;
                        byte[] bArr5 = bArr;
                        i12 = iM6982 ^ i4;
                        bArr3 = bArr5;
                        C18013 c18019 = c18013;
                        c21543 = c21541;
                        long j7 = jM45137;
                        c18016 = c18019;
                        jM45143 = j;
                        j5 = j7;
                    }
                    break;
                case -1833243512:
                case -809271247:
                    C4616.m13552();
                    break;
                case -1811771573:
                case 498546819:
                    c21541 = c21543;
                    c18013 = c18016;
                    jM45137 = j5;
                    j = jM45143;
                    c9047M42353 = m42353(c9047, jM45137, c21541);
                    int iM6985 = C2105.m6981("ۡᩴ") ^ i9;
                    i11 = ((iM6985 ^ i10) * (-20239)) ^ 1403921364;
                    bArr3 = bArr3;
                    i12 = iM6985 ^ (-1810967459);
                    c18015 = c18013;
                    c21543 = c21541;
                    long j8 = jM45137;
                    c18016 = c18015;
                    jM45143 = j;
                    j5 = j8;
                    break;
                case -1806268590:
                case -24266265:
                    if (j4 <= jM28024 / j3) {
                        iM6981 = C0630.m2566("᩵᩹") ^ i9;
                        i = ((iM6981 ^ i10) * (-31325)) ^ (-975629657);
                        i2 = 359306308;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                    } else {
                        bArr3 = bArr3;
                        iM6983 = C2105.m6981("ܰܳ") ^ i10;
                        i11 = ((iM6983 ^ i9) * (-591)) ^ (-2031778782);
                        i7 = -655901608;
                        i12 = iM6983 ^ i7;
                        bArr3 = bArr3;
                    }
                    break;
                case -1751274331:
                case 49433662:
                    return null;
                case -1717768448:
                case 1318277805:
                    bArr = bArr3;
                    c21541 = c21543;
                    c18013 = c18016;
                    jM45137 = j5;
                    j = jM45143;
                    if (c9047 == null) {
                        iM6982 = C2105.m6981("֨ۧ") ^ i10;
                        i3 = ((iM6982 ^ i9) * 20033) ^ 935842557;
                        i4 = 533072706;
                    } else {
                        iM6982 = (i9 - C2105.m6981("ܶ᩶")) * (-3);
                        i3 = ((iM6982 ^ i10) * 9239) ^ 876544736;
                        i4 = -837310962;
                    }
                    i11 = i3;
                    byte[] bArr6 = bArr;
                    i12 = iM6982 ^ i4;
                    bArr3 = bArr6;
                    C18013 c180110 = c18013;
                    c21543 = c21541;
                    long j9 = jM45137;
                    c18016 = c180110;
                    jM45143 = j;
                    j5 = j9;
                    break;
                case -1696266942:
                case 1504695138:
                    throw new C23821();
                case -1597877719:
                case -748316569:
                    bArr = bArr3;
                    j = jM45143;
                    c21541 = c21543;
                    c18013 = c18016;
                    jM45137 = C19631.m45137(c9047);
                    if (C4616.f14690 > 0) {
                        iM6982 = (C0630.m2566("֡ܰ") ^ i10) * (-45);
                        i3 = ((iM6982 ^ i9) * 8611) ^ 2025134766;
                        i4 = -795392908;
                        i11 = i3;
                        byte[] bArr7 = bArr;
                        i12 = iM6982 ^ i4;
                        bArr3 = bArr7;
                        C18013 c180111 = c18013;
                        c21543 = c21541;
                        long j10 = jM45137;
                        c18016 = c180111;
                        jM45143 = j;
                        j5 = j10;
                    } else {
                        jM45143 = j;
                        j5 = jM45137;
                        int iM2569 = (i9 - C0630.m2566("۠ܿ")) * 31;
                        i11 = ((iM2569 ^ i10) * (-3313)) ^ 442699733;
                        c18016 = c18013;
                        c21543 = c21541;
                        byte[] bArr8 = bArr;
                        i12 = iM2569 ^ 1282465531;
                        bArr3 = bArr8;
                    }
                    break;
                case -1429703374:
                case 2077114076:
                    if (C2105.m6982() != 0) {
                        iM6981 = (C2105.m6981("ۡ᩷") ^ i9) * (-125);
                        i = ((iM6981 ^ i10) * 17733) ^ (-562604792);
                        i2 = 1180059181;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                    } else {
                        bArr = bArr3;
                        c21541 = c21543;
                        c18013 = c18016;
                        jM45137 = j5;
                        j = jM45143;
                        iM6982 = C0630.m2566("ۢ᩵") ^ i10;
                        i3 = ((iM6982 ^ i9) * (-2637)) ^ (-2062936982);
                        i4 = 317869119;
                        i11 = i3;
                        byte[] bArr9 = bArr;
                        i12 = iM6982 ^ i4;
                        bArr3 = bArr9;
                        C18013 c180112 = c18013;
                        c21543 = c21541;
                        long j11 = jM45137;
                        c18016 = c180112;
                        jM45143 = j;
                        j5 = j11;
                    }
                    break;
                case -1315155107:
                case -479055051:
                    bArr3 = bArr3;
                    jM28024 = C11340.m28024(jM45120, jM45143);
                    if (jM28024 >= j2) {
                        iM6983 = (C2105.m6981("ۧۙ") + i9) * 69;
                        i11 = ((iM6983 ^ i10) * (-14005)) ^ (-4984658);
                        i7 = -504532463;
                    } else {
                        iM6983 = C2105.m6981("ܰܳ") ^ i10;
                        i11 = ((iM6983 ^ i9) * (-591)) ^ (-2031778782);
                        i7 = -655901608;
                    }
                    i12 = iM6983 ^ i7;
                    bArr3 = bArr3;
                    break;
                case -1305477084:
                case -1134189027:
                    bArr3 = bArr3;
                    jM45120 = C19631.m45120(c9047M45105);
                    jM45143 = C19631.m45142(c9047M45105);
                    if (C2520.f8000 < 0) {
                        iM6983 = C2105.m6981("᩵ᩴ") ^ i9;
                        i11 = ((iM6983 ^ i10) * (-13125)) ^ 66654026;
                        i7 = -1451991357;
                        i12 = iM6983 ^ i7;
                        bArr3 = bArr3;
                    } else {
                        bArr = bArr3;
                        c21541 = c21543;
                        c18013 = c18016;
                        int iM25610 = (i9 - C0630.m2566("۠ܿ")) * 31;
                        i11 = ((iM25610 ^ i10) * (-3313)) ^ 442699733;
                        c18016 = c18013;
                        c21543 = c21541;
                        byte[] bArr10 = bArr;
                        i12 = iM25610 ^ 1282465531;
                        bArr3 = bArr10;
                    }
                    break;
                case -1276486069:
                case 523115202:
                    c18016 = new C18013(i14);
                    if (C3432.f10845 >= 0) {
                        iM6981 = (i10 - C0630.m2566("۟᩵")) * (-21);
                        i = ((iM6981 ^ i9) * 7711) ^ 1684311297;
                        i2 = 1220774444;
                    } else {
                        iM6981 = (i9 - C0630.m2566("᩷ۙ")) * (-89);
                        i = ((iM6981 ^ i10) * 1895) ^ (-2121117831);
                        i2 = -386612261;
                    }
                    i12 = iM6981 ^ i2;
                    i11 = i;
                    break;
                case -1169990225:
                case -11122700:
                    bArr3 = bArr3;
                    if (i14 > 65536) {
                        iM6983 = C2105.m6981("ܰܳ") ^ i10;
                        i11 = ((iM6983 ^ i9) * (-591)) ^ (-2031778782);
                        i7 = -655901608;
                    } else {
                        iM6983 = C0630.m2566("֡ܳ") ^ i10;
                        i11 = ((iM6983 ^ i9) * 4133) ^ (-161643442);
                        i7 = 876479095;
                    }
                    i12 = iM6983 ^ i7;
                    bArr3 = bArr3;
                    break;
                case -1109867113:
                case -336696866:
                    i14 = 0;
                    iM6983 = (C0630.m2566("ۗܶ") + i10) * (-97);
                    i11 = ((iM6983 ^ i9) * 24907) ^ (-363447741);
                    i7 = -278366234;
                    i12 = iM6983 ^ i7;
                    bArr3 = bArr3;
                    break;
                case -974461119:
                case -145575620:
                    i14 = c9047M45105.f27431;
                    iM6983 = (C0630.m2566("ۗܶ") + i10) * (-97);
                    i11 = ((iM6983 ^ i9) * 24907) ^ (-363447741);
                    i7 = -278366234;
                    i12 = iM6983 ^ i7;
                    bArr3 = bArr3;
                    break;
                case -925032751:
                case 1247959912:
                    bArr3 = bArr3;
                    jM45142 = C19631.m45142(c9048);
                    if (jM45142 >= j2) {
                        iM6983 = C2105.m6981("ۖܺ") ^ i10;
                        i11 = ((iM6983 ^ i9) * (-20855)) ^ (-203179364);
                        i7 = -442326052;
                    } else {
                        c9047M45105 = c9048;
                        iM6983 = (C0630.m2566("ܺ᩻") + i9) * 29;
                        i11 = ((iM6983 ^ i10) * 30447) ^ (-112057146);
                        i7 = -1778599180;
                    }
                    i12 = iM6983 ^ i7;
                    bArr3 = bArr3;
                    break;
                case -759610613:
                case 595376484:
                    throw new C23821();
                case -680307871:
                case 1868518771:
                    c21541 = c21543;
                    c18013 = c18016;
                    jM45137 = j5;
                    j = jM45143;
                    j2 = 1048576;
                    if (jM45137 >= 1048576) {
                        bArr = bArr3;
                        iM6982 = (i9 - C0630.m2566("᩶ۨ")) * (-99);
                        i3 = ((iM6982 ^ i10) * (-17851)) ^ 1979258719;
                        i4 = 1140048496;
                        i11 = i3;
                        byte[] bArr11 = bArr;
                        i12 = iM6982 ^ i4;
                        bArr3 = bArr11;
                        C18013 c180113 = c18013;
                        c21543 = c21541;
                        long j12 = jM45137;
                        c18016 = c180113;
                        jM45143 = j;
                        j5 = j12;
                    } else {
                        c9047M42353 = c9047;
                        int iM6986 = C2105.m6981("ۡᩴ") ^ i9;
                        i11 = ((iM6986 ^ i10) * (-20239)) ^ 1403921364;
                        bArr3 = bArr3;
                        i12 = iM6986 ^ (-1810967459);
                        c18015 = c18013;
                        c21543 = c21541;
                        long j13 = jM45137;
                        c18016 = c18015;
                        jM45143 = j;
                        j5 = j13;
                    }
                    break;
                case -620716079:
                case 226662881:
                    bArr3 = new byte[i14];
                    C19631.m45125(i13, i13, i14, c9047M45105, bArr3);
                    if (C2167.m7150(interfaceC17066)) {
                        iM6981 = (C2105.m6981("ܿᩳ") + i9) * (-109);
                        i = ((iM6981 ^ i10) * 4621) ^ 1500183828;
                        i2 = 330285942;
                    } else {
                        iM6981 = C0630.m2566("ۢ᩺") ^ i10;
                        i = ((iM6981 ^ i9) * 22687) ^ 846855958;
                        i2 = -1753881406;
                    }
                    i12 = iM6981 ^ i2;
                    i11 = i;
                    break;
                case -129735521:
                case 2108008868:
                    bArr = bArr3;
                    c21541 = c21543;
                    c18013 = c18016;
                    jM45137 = j5;
                    j = jM45143;
                    if (RunnableC3474.f10992 <= 0) {
                        iM6982 = C0630.m2566("֫ۨ") ^ i10;
                        i3 = ((iM6982 ^ i9) * (-30829)) ^ 346618715;
                        i4 = -42218486;
                    } else {
                        iM6982 = C0630.m2566("᩸֫") ^ i9;
                        i3 = ((iM6982 ^ i10) * (-9873)) ^ 459873592;
                        i4 = -1205196005;
                    }
                    i11 = i3;
                    byte[] bArr12 = bArr;
                    i12 = iM6982 ^ i4;
                    bArr3 = bArr12;
                    C18013 c180114 = c18013;
                    c21543 = c21541;
                    long j14 = jM45137;
                    c18016 = c180114;
                    jM45143 = j;
                    j5 = j14;
                    break;
                case 178407894:
                case 1390601366:
                    if (C21923.f70183 != 0) {
                        iM6981 = (C2105.m6981("ۢ֫") + i9) * 47;
                        i = ((iM6981 ^ i10) * 31457) ^ (-1576063926);
                        i2 = -1377978930;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                    } else {
                        bArr = bArr3;
                        c21541 = c21543;
                        c18013 = c18016;
                        jM45137 = j5;
                        j = jM45143;
                        iM6982 = C0630.m2566("֫ۨ") ^ i10;
                        i3 = ((iM6982 ^ i9) * (-30829)) ^ 346618715;
                        i4 = -42218486;
                        i11 = i3;
                        byte[] bArr13 = bArr;
                        i12 = iM6982 ^ i4;
                        bArr3 = bArr13;
                        C18013 c180115 = c18013;
                        c21543 = c21541;
                        long j15 = jM45137;
                        c18016 = c180115;
                        jM45143 = j;
                        j5 = j15;
                    }
                    break;
                case 233247324:
                case 1121814485:
                    bArr = bArr3;
                    c21541 = c21543;
                    c18013 = c18016;
                    jM45137 = j5;
                    j = jM45143;
                    if (C1916.m6308() < 0) {
                        iM6982 = (i10 - C0630.m2566("ᩴۛ")) * (-115);
                        i3 = ((iM6982 ^ i9) * (-23285)) ^ 986027823;
                        i4 = -1120937959;
                        i11 = i3;
                        byte[] bArr14 = bArr;
                        i12 = iM6982 ^ i4;
                        bArr3 = bArr14;
                        C18013 c180116 = c18013;
                        c21543 = c21541;
                        long j16 = jM45137;
                        c18016 = c180116;
                        jM45143 = j;
                        j5 = j16;
                    } else {
                        jM45143 = j;
                        j5 = jM45137;
                        int iM25611 = (i9 - C0630.m2566("۠ܿ")) * 31;
                        i11 = ((iM25611 ^ i10) * (-3313)) ^ 442699733;
                        c18016 = c18013;
                        c21543 = c21541;
                        byte[] bArr15 = bArr;
                        i12 = iM25611 ^ 1282465531;
                        bArr3 = bArr15;
                    }
                    break;
                case 348307416:
                case 2066589370:
                    bArr = bArr3;
                    c21541 = c21543;
                    c18013 = c18016;
                    jM45137 = j5;
                    j = jM45143;
                    if (C3663.f11553) {
                        iM6982 = C0630.m2566("ۢ᩵") ^ i10;
                        i3 = ((iM6982 ^ i9) * (-2637)) ^ (-2062936982);
                        i4 = 317869119;
                    } else {
                        iM6982 = (i9 - C0630.m2566("֨᩵")) * (-87);
                        i3 = ((iM6982 ^ i10) * (-1529)) ^ (-1960873514);
                        i4 = -586780299;
                    }
                    i11 = i3;
                    byte[] bArr16 = bArr;
                    i12 = iM6982 ^ i4;
                    bArr3 = bArr16;
                    C18013 c180117 = c18013;
                    c21543 = c21541;
                    long j17 = jM45137;
                    c18016 = c180117;
                    jM45143 = j;
                    j5 = j17;
                    break;
                case 405176088:
                case 1965058895:
                    RunnableC1108.m3790();
                    C2958.m9034();
                    bArr = bArr3;
                    c21541 = c21543;
                    c18013 = c18016;
                    jM45137 = j5;
                    j = jM45143;
                    iM6982 = C0630.m2566("ۢ᩵") ^ i10;
                    i3 = ((iM6982 ^ i9) * (-2637)) ^ (-2062936982);
                    i4 = 317869119;
                    i11 = i3;
                    byte[] bArr17 = bArr;
                    i12 = iM6982 ^ i4;
                    bArr3 = bArr17;
                    C18013 c180118 = c18013;
                    c21543 = c21541;
                    long j18 = jM45137;
                    c18016 = c180118;
                    jM45143 = j;
                    j5 = j18;
                    break;
                case 511641258:
                case 1209185125:
                    C3683.m11222();
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C2105.m6981("ۡ᩷") ^ i9) * (-125);
                        i = ((iM6981 ^ i10) * 17733) ^ (-562604792);
                        i2 = 1180059181;
                    } else {
                        iM6981 = (i10 - C0630.m2566("۟᩵")) * (-21);
                        i = ((iM6981 ^ i9) * 7711) ^ 1684311297;
                        i2 = 1220774444;
                    }
                    i12 = iM6981 ^ i2;
                    i11 = i;
                    break;
                case 574055347:
                case 1229602185:
                    bArr2 = bArr3;
                    c18014 = c18016;
                    jM45137 = j5;
                    j = jM45143;
                    c21542 = new C21541();
                    if (C2167.f7158 >= 0) {
                        iM2566 = (C2105.m6981("۟۠") ^ i10) * (-11);
                        i5 = ((iM2566 ^ i9) * (-959)) ^ (-1315504058);
                        i6 = -86570402;
                    } else {
                        iM2566 = (i10 - C0630.m2566("᩵᩷")) * 127;
                        i5 = ((iM2566 ^ i9) * (-12263)) ^ (-1084920143);
                        i6 = -660311696;
                    }
                    i11 = i5;
                    c18015 = c18014;
                    c21543 = c21542;
                    bArr3 = bArr2;
                    i12 = iM2566 ^ i6;
                    long j19 = jM45137;
                    c18016 = c18015;
                    jM45143 = j;
                    j5 = j19;
                    break;
                case 777499419:
                case 1354517379:
                    return c9047M45105;
                case 878172518:
                case 1213099043:
                    bArr = bArr3;
                    c21541 = c21543;
                    c18013 = c18016;
                    jM45137 = j5;
                    j = jM45143;
                    if (C1916.f6442) {
                        iM6982 = (C2105.m6981("ܰ᩶") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM6982 ^ i10) * (-3229)) ^ 1270564476;
                        i4 = 893941059;
                    } else {
                        iM6982 = C0630.m2566("֫ۨ") ^ i10;
                        i3 = ((iM6982 ^ i9) * (-30829)) ^ 346618715;
                        i4 = -42218486;
                    }
                    i11 = i3;
                    byte[] bArr18 = bArr;
                    i12 = iM6982 ^ i4;
                    bArr3 = bArr18;
                    C18013 c180119 = c18013;
                    c21543 = c21541;
                    long j110 = jM45137;
                    c18016 = c180119;
                    jM45143 = j;
                    j5 = j110;
                    break;
                case 1001597174:
                case 1195265358:
                    bArr3 = bArr3;
                    if (C0714.m2807(interfaceC17066)) {
                        iM6983 = C2105.m6981("ۙۗ") ^ i9;
                        i11 = ((iM6983 ^ i10) * (-26469)) ^ 321874194;
                        i7 = 999760251;
                    } else {
                        iM6983 = C0630.m2566("ᩳ۟") ^ i9;
                        i11 = ((iM6983 ^ i10) * (-445)) ^ (-10271463);
                        i7 = 436130353;
                    }
                    i12 = iM6983 ^ i7;
                    bArr3 = bArr3;
                    break;
                case 1048851992:
                case 1784025116:
                    if (!C1504.m5179()) {
                        bArr2 = bArr3;
                        c21542 = c21543;
                        c18014 = c18016;
                        jM45137 = j5;
                        j = jM45143;
                        iM2566 = (C2105.m6981("۟۠") ^ i10) * (-11);
                        i5 = ((iM2566 ^ i9) * (-959)) ^ (-1315504058);
                        i6 = -86570402;
                        i11 = i5;
                        c18015 = c18014;
                        c21543 = c21542;
                        bArr3 = bArr2;
                        i12 = iM2566 ^ i6;
                        long j111 = jM45137;
                        c18016 = c18015;
                        jM45143 = j;
                        j5 = j111;
                    } else {
                        bArr = bArr3;
                        c21541 = c21543;
                        c18013 = c18016;
                        jM45137 = j5;
                        j = jM45143;
                        iM6982 = C0630.m2566("ۢ᩵") ^ i10;
                        i3 = ((iM6982 ^ i9) * (-2637)) ^ (-2062936982);
                        i4 = 317869119;
                        i11 = i3;
                        byte[] bArr19 = bArr;
                        i12 = iM6982 ^ i4;
                        bArr3 = bArr19;
                        C18013 c1801110 = c18013;
                        c21543 = c21541;
                        long j112 = jM45137;
                        c18016 = c1801110;
                        jM45143 = j;
                        j5 = j112;
                    }
                    break;
                case 1431748129:
                case 1733427747:
                    bArr = bArr3;
                    c21541 = c21543;
                    c18013 = c18016;
                    jM45137 = j5;
                    j = jM45143;
                    if (RunnableC3474.f10992 <= 0) {
                        iM6982 = C0630.m2566("֫ۨ") ^ i10;
                        i3 = ((iM6982 ^ i9) * (-30829)) ^ 346618715;
                        i4 = -42218486;
                    } else {
                        iM6982 = C2105.m6981("ۡۨ") ^ i10;
                        i3 = ((iM6982 ^ i9) * (-897)) ^ 2034453831;
                        i4 = -1072324132;
                    }
                    i11 = i3;
                    byte[] bArr110 = bArr;
                    i12 = iM6982 ^ i4;
                    bArr3 = bArr110;
                    C18013 c1801111 = c18013;
                    c21543 = c21541;
                    long j113 = jM45137;
                    c18016 = c1801111;
                    jM45143 = j;
                    j5 = j113;
                    break;
                case 1447682510:
                case 1930528365:
                    bArr3 = bArr3;
                    long j20 = i14;
                    j3 = 4;
                    if (C1420.m4913()) {
                        j4 = j20;
                        iM6983 = C2105.m6981("᩶ۢ") ^ i9;
                        i11 = ((iM6983 ^ i10) * (-22977)) ^ 1507900069;
                        i7 = 1663452913;
                        i12 = iM6983 ^ i7;
                        bArr3 = bArr3;
                    } else {
                        int iM6987 = (C2105.m6981("֨֫") + i10) * q.h;
                        i11 = 789381987 ^ ((iM6987 ^ i9) * 10669);
                        i12 = iM6987 ^ 1784520968;
                        bArr3 = bArr3;
                        j4 = j20;
                    }
                    break;
                case 1462962054:
                case 1892045433:
                    throw new C23821();
                case 1673165376:
                case 2069267187:
                    bArr = bArr3;
                    c21541 = c21543;
                    c18013 = c18016;
                    jM45137 = j5;
                    j = jM45143;
                    if (C2167.m7150(interfaceC17066)) {
                        iM6982 = (C0630.m2566("۬ۖ") + i9) * 33;
                        i3 = ((iM6982 ^ i10) * (-4957)) ^ 2006913593;
                        i4 = -1399510903;
                    } else {
                        iM6982 = (C2105.m6981("ܳܰ") + i10) * 127;
                        i3 = ((iM6982 ^ i9) * (-27553)) ^ 445693004;
                        i4 = -320200766;
                    }
                    i11 = i3;
                    byte[] bArr111 = bArr;
                    i12 = iM6982 ^ i4;
                    bArr3 = bArr111;
                    C18013 c1801112 = c18013;
                    c21543 = c21541;
                    long j114 = jM45137;
                    c18016 = c1801112;
                    jM45143 = j;
                    j5 = j114;
                    break;
                case 1845061920:
                case 2086411737:
                    bArr3 = bArr3;
                    c9047M45105 = C19631.m45105(c9048, jM45142);
                    iM6983 = (C0630.m2566("ܺ᩻") + i9) * 29;
                    i11 = ((iM6983 ^ i10) * 30447) ^ (-112057146);
                    i7 = -1778599180;
                    i12 = iM6983 ^ i7;
                    bArr3 = bArr3;
                    break;
                case 1880139459:
                case 1976144935:
                    throw new C23821();
                default:
                    c18016.m42069(i13, i14, bArr3);
                    return C19631.m45107(c18016);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5313 m42306(C5313 c5313, C5313 c5314) {
        long jM15230 = 0;
        long jM15231 = 0;
        int i = -869176874;
        int i2 = C2958.f9394;
        int i3 = C7811.f24123;
        int iM2566 = C0630.m2566("᩻ۡ") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-4577)) ^ (-723171370);
        int i5 = -657523067;
        while (true) {
            i = ((((i ^ i3) * 23813) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2106460249:
                case 1650802699:
                    if (C3245.f10203 <= 0) {
                        iM2566 = C2105.m6981("۫ۢ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-9513)) ^ 1454326375;
                        i5 = 958632741;
                    } else {
                        iM2566 = C2105.m6981("᩺ܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-16743)) ^ (-514842559);
                        i5 = -112083310;
                    }
                    break;
                case -2077838564:
                case 1805068288:
                    if (c5314.m15230() == c5313.m15230()) {
                        iM2566 = (i2 - C0630.m2566("ۘ᩹")) * 115;
                        i4 = ((iM2566 ^ i3) * 14725) ^ 419796915;
                        i5 = 2135984443;
                    } else {
                        iM2566 = C0630.m2566("ۛܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 27509) ^ 1885915137;
                        i5 = -551746150;
                    }
                    break;
                case -1916282165:
                case 795265370:
                    ServiceConnectionC3453.m10564();
                    C0237.m1481();
                    return null;
                case -1863478476:
                case -1028393814:
                    jM15230 = c5314.m15230();
                    jM15231 = c5313.m15230();
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = (i3 - C0630.m2566("᩺֡")) * 27;
                        i4 = ((iM2566 ^ i2) * 3073) ^ (-1948308558);
                        i5 = -420865494;
                    } else {
                        iM2566 = (C0630.m2566("᩻ܳ") ^ i3) * 61;
                        i4 = ((iM2566 ^ i2) * 27487) ^ 1928011021;
                        i5 = 133964728;
                    }
                    break;
                case -1487976650:
                case 2147132364:
                    if (C2167.m7155()) {
                        iM2566 = C2105.m6981("᩸ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 27651) ^ (-836353911);
                        i5 = 1526439123;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۤ") + i2) * 83;
                        i4 = ((iM2566 ^ i3) * (-26967)) ^ 1583586972;
                        i5 = 334719843;
                    }
                    break;
                case -1235647405:
                case 1634498233:
                    if (c5314.m15228() >= c5313.m15228()) {
                        iM2566 = C0630.m2566("ۛܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 27509) ^ 1885915137;
                        i5 = -551746150;
                    } else {
                        iM2566 = C0630.m2566("ᩴۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 15721) ^ (-1396508344);
                        i5 = 200270578;
                    }
                    break;
                case -1192225735:
                case 434575629:
                    if (jM15230 <= jM15231) {
                        iM2566 = (i3 - C0630.m2566("ܽ᩻")) * (-23);
                        i4 = ((iM2566 ^ i2) * 26427) ^ (-1939004802);
                        i5 = -2024643699;
                    } else {
                        iM2566 = C0630.m2566("ᩴۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 15721) ^ (-1396508344);
                        i5 = 200270578;
                    }
                    break;
                case -1172562602:
                case 427527413:
                    return c5314;
                case -1038186737:
                case 585613194:
                    C4159.m12565();
                    if (C1047.f3863 >= 0) {
                        iM2566 = C2105.m6981("᩶֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5567) ^ (-2127531214);
                        i5 = 866693850;
                    } else {
                        iM2566 = C2105.m6981("᩸ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 27651) ^ (-836353911);
                        i5 = 1526439123;
                    }
                    break;
                case -964079169:
                case -946528301:
                    C1420.m4913();
                    if (C11340.f33930 >= 0) {
                        iM2566 = C2105.m6981("᩸ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 27651) ^ (-836353911);
                        i5 = 1526439123;
                    } else {
                        iM2566 = C2105.m6981("ܰ᩷") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16207)) ^ 2123021814;
                        i5 = -1634273958;
                    }
                    break;
                case -872311579:
                case 512721891:
                    C1773.m5908();
                    C0714.m2805();
                    iM2566 = C2105.m6981("ܰ᩷") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-16207)) ^ 2123021814;
                    i5 = -1634273958;
                    break;
                case -790209706:
                case 2104271606:
                    if (C5695.f17556 >= 0) {
                        iM2566 = C2105.m6981("ܰ᩷") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16207)) ^ 2123021814;
                        i5 = -1634273958;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩵ۧ")) * 79;
                        i4 = ((iM2566 ^ i3) * (-28755)) ^ 141565606;
                        i5 = -617047609;
                    }
                    break;
                case -700566128:
                case 708773048:
                    return c5313;
                case -671439046:
                case 464501946:
                    if (C0483.f2088 >= 0) {
                        iM2566 = (i3 - C0630.m2566("᩺֡")) * 27;
                        i4 = ((iM2566 ^ i2) * 3073) ^ (-1948308558);
                        i5 = -420865494;
                    } else {
                        iM2566 = (C2105.m6981("ܺ᩵") + i2) * (-25);
                        i4 = ((iM2566 ^ i3) * 6383) ^ 950187738;
                        i5 = 1481865526;
                    }
                    break;
                case -656228588:
                case 208689157:
                    if (C0483.f2088 >= 0) {
                        iM2566 = (i3 - C0630.m2566("᩺֡")) * 27;
                        i4 = ((iM2566 ^ i2) * 3073) ^ (-1948308558);
                        i5 = -420865494;
                    } else {
                        iM2566 = C0630.m2566("ۗ֨") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-3181)) ^ 1910763911;
                        i5 = -1474886149;
                    }
                    break;
                case -351791256:
                case 966579301:
                    if (C2105.f7037 != 0) {
                        iM2566 = C2105.m6981("۫ۢ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-9513)) ^ 1454326375;
                        i5 = 958632741;
                    } else {
                        iM2566 = C2105.m6981("ܰ᩷") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16207)) ^ 2123021814;
                        i5 = -1634273958;
                    }
                    break;
                case 221145637:
                case 1473464328:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C2105.m6981("۫ۢ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-9513)) ^ 1454326375;
                        i5 = 958632741;
                    } else {
                        iM2566 = (C2105.m6981("۫ۡ") ^ i3) * (-19);
                        i4 = ((iM2566 ^ i2) * 4789) ^ 1781994514;
                        i5 = -1237150645;
                    }
                    break;
                case 343411216:
                case 1756077019:
                    if (C3019.m9255() <= 0) {
                        iM2566 = C2105.m6981("᩸ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 27651) ^ (-836353911);
                        i5 = 1526439123;
                    } else {
                        iM2566 = C2105.m6981("᩺ܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16951)) ^ (-1414914403);
                        i5 = -745095499;
                    }
                    break;
                case 770645972:
                case 1505987240:
                    if (c5313 != null) {
                        iM2566 = C0630.m2566("ܶܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-895)) ^ 808739316;
                        i5 = 932300935;
                    } else {
                        iM2566 = C0630.m2566("ᩴۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 15721) ^ (-1396508344);
                        i5 = 200270578;
                    }
                    break;
                case 1057680367:
                case 1646744815:
                    if (C3683.m11222()) {
                        iM2566 = C2105.m6981("᩶֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5567) ^ (-2127531214);
                        i5 = 866693850;
                    } else {
                        iM2566 = (C0630.m2566("᩶۬") ^ i3) * 87;
                        i4 = ((iM2566 ^ i2) * 17317) ^ 1339019056;
                        i5 = 1648674013;
                    }
                    break;
                default:
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("ۨ۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-12749)) ^ (-691873988);
                        i5 = -903287684;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩺֡")) * 27;
                        i4 = ((iM2566 ^ i2) * 3073) ^ (-1948308558);
                        i5 = -420865494;
                    }
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35641. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static l.C9711 m42312(l.C9711 r65, java.io.File r66, l.InterfaceC17066 r67) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18177.m42312(l.ۢܽܳ, java.io.File, l.ܿۖ᩷):l.ۢܽܳ");
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m42375() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 286330944;
        int i5 = C3746.f11829;
        int i6 = C0050.f910;
        int iM6981 = (C2105.m6981("۫ۖ") ^ i5) * (-87);
        int i7 = ((iM6981 ^ i6) * 15441) ^ (-1696179610);
        int i8 = -905117774;
        while (true) {
            i4 = ((((i4 ^ i6) * 24855) >> 31) & i7) ^ (iM6981 ^ i8);
            switch (i4) {
                case -1889168272:
                case 1315094852:
                    int i9 = s + s2;
                    if ((i9 * i9) - i2 < 0) {
                        iM6981 = C0630.m2566("ۢۛ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-12395)) ^ 194511588;
                        i8 = 755483814;
                    } else {
                        iM6981 = (C0630.m2566("ۖۙ") ^ i6) * 101;
                        i7 = ((iM6981 ^ i5) * 17091) ^ (-1001756935);
                        i8 = 1367222825;
                    }
                    break;
                case -1508863803:
                case -902125390:
                    if (C21923.f70183 != 0) {
                        iM6981 = C0630.m2566("᩸۠") ^ i5;
                        i7 = ((iM6981 ^ i6) * 14141) ^ (-1697522097);
                        i8 = -1040672450;
                    } else {
                        iM6981 = C2105.m6981("ۢᩴ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 765) ^ 1395803328;
                        i8 = 1628303282;
                    }
                    break;
                case -1490883917:
                case 215669714:
                    RunnableC3474.m10630();
                    if (C22628.f73083 > 0) {
                        iM6981 = C0630.m2566("᩹ۘ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 23393) ^ 900775724;
                        i8 = 969955092;
                    } else {
                        iM6981 = (C0630.m2566("ۜۙ") + i5) * (-75);
                        i7 = ((iM6981 ^ i6) * 11615) ^ 328193721;
                        i8 = -325429200;
                    }
                    break;
                case -1150746123:
                case 860523484:
                    s2 = 1;
                    if (AbstractC2021.m6574()) {
                        iM6981 = (C0630.m2566("ۜۙ") + i5) * (-75);
                        i7 = ((iM6981 ^ i6) * 11615) ^ 328193721;
                        i8 = -325429200;
                    } else {
                        iM6981 = (C0630.m2566("֡ۢ") + i6) * (-81);
                        i7 = ((iM6981 ^ i5) * (-7085)) ^ (-2065989481);
                        i8 = 1105893072;
                    }
                    break;
                case -1148031787:
                case 2035248550:
                    return;
                case -1013698450:
                case -334733377:
                    c = 1004;
                    if (C1916.f6442) {
                        iM6981 = C2105.m6981("ۜۨ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-2087)) ^ (-1792860341);
                        i8 = 907037181;
                    } else {
                        iM6981 = C0630.m2566("᩸۠") ^ i5;
                        i7 = ((iM6981 ^ i6) * 14141) ^ (-1697522097);
                        i8 = -1040672450;
                    }
                    break;
                case -982093536:
                case 644580925:
                    RunnableC0588.m2441();
                    ServiceConnectionC3453.m10564();
                    iM6981 = (C0630.m2566("ۜۙ") + i5) * (-75);
                    i7 = ((iM6981 ^ i6) * 11615) ^ 328193721;
                    i8 = -325429200;
                    break;
                case -972890516:
                case 344298287:
                    sArr = f56533;
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C2105.m6981("ۢ۠") ^ i6) * 47;
                        i7 = ((iM6981 ^ i5) * (-3715)) ^ (-125967087);
                        i8 = 130690506;
                    } else {
                        iM6981 = C0630.m2566("ۗ۟") ^ i6;
                        i7 = ((iM6981 ^ i5) * 7489) ^ 972125873;
                        i8 = 916418321;
                    }
                    break;
                case -838977066:
                case 862576921:
                    if (this.f56538) {
                        iM6981 = (C0630.m2566("᩸ۧ") ^ i6) * 123;
                        i7 = ((iM6981 ^ i5) * (-29649)) ^ (-560692046);
                        i8 = 1329166102;
                    } else {
                        iM6981 = (C2105.m6981("۟ᩴ") + i6) * (-93);
                        i7 = ((iM6981 ^ i5) * 3035) ^ 1771403092;
                        i8 = 1323447270;
                    }
                    break;
                case -228636471:
                case 131352709:
                    if (C2105.m6982() != 0) {
                        iM6981 = (C0630.m2566("ۜۙ") + i5) * (-75);
                        i7 = ((iM6981 ^ i6) * 11615) ^ 328193721;
                        i8 = -325429200;
                    } else {
                        iM6981 = C2105.m6981("ۡ֫") ^ i6;
                        i7 = ((iM6981 ^ i5) * 3599) ^ (-222661843);
                        i8 = 279549982;
                    }
                    break;
                case -65432959:
                case 1412894943:
                    i3 = 55622;
                    iM6981 = C0630.m2566("ᩴ֡") ^ i5;
                    i7 = ((iM6981 ^ i6) * (-5827)) ^ (-1556107400);
                    i8 = 1437831249;
                    break;
                case 245768431:
                case 753738842:
                    short[] sArr2 = f56533;
                    if (C11340.f33930 < 0 && C3019.m9255() > 0) {
                        throw new IllegalStateException(C7811.m20837(sArr2, 1005, 21, i3));
                    }
                    iM6981 = C2105.m6981("ܺ֨") ^ i5;
                    i7 = ((iM6981 ^ i6) * 17473) ^ 1277724787;
                    i8 = 787019339;
                    break;
                case 353954694:
                case 1705290161:
                    if (C2167.f7158 >= 0) {
                        iM6981 = C2105.m6981("ܺ֨") ^ i5;
                        i7 = ((iM6981 ^ i6) * 17473) ^ 1277724787;
                        i8 = 787019339;
                    } else {
                        iM6981 = C0630.m2566("᩹ۘ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 23393) ^ 900775724;
                        i8 = 969955092;
                    }
                    break;
                case 371817116:
                case 848105338:
                    AbstractC2021.m6574();
                    C0050.m940();
                    return;
                case 714236409:
                case 1922686963:
                    i = s * 2;
                    if (C1294.m4372() <= 0) {
                        iM6981 = (C2105.m6981("ۢ۠") ^ i6) * 47;
                        i7 = ((iM6981 ^ i5) * (-3715)) ^ (-125967087);
                        i8 = 130690506;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ۚۨ")) * (-19);
                        i7 = ((iM6981 ^ i6) * 30551) ^ (-988016944);
                        i8 = 2048075522;
                    }
                    break;
                case 1211194112:
                case 1550934899:
                    C3432.m10477();
                    if (C21923.f70183 != 0) {
                        iM6981 = C0630.m2566("᩸۠") ^ i5;
                        i7 = ((iM6981 ^ i6) * 14141) ^ (-1697522097);
                        i8 = -1040672450;
                    } else {
                        iM6981 = C0630.m2566("᩹ۘ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 23393) ^ 900775724;
                        i8 = 969955092;
                    }
                    break;
                case 1272860794:
                case 1415610237:
                    i3 = 29610;
                    iM6981 = C0630.m2566("ᩴ֡") ^ i5;
                    i7 = ((iM6981 ^ i6) * (-5827)) ^ (-1556107400);
                    i8 = 1437831249;
                    break;
                case 1355405972:
                case 1467976973:
                    s = sArr[c];
                    if (C1916.f6442) {
                        iM6981 = (C0630.m2566("֨۬") ^ i6) * (-115);
                        i7 = ((iM6981 ^ i5) * (-22799)) ^ (-740942260);
                        i8 = -1425651270;
                    } else {
                        iM6981 = (C2105.m6981("ۢ۠") ^ i6) * 47;
                        i7 = ((iM6981 ^ i5) * (-3715)) ^ (-125967087);
                        i8 = 130690506;
                    }
                    break;
                default:
                    i2 = i + 1;
                    if (C2105.m6982() != 0) {
                        iM6981 = (C2105.m6981("ۢ۠") ^ i6) * 47;
                        i7 = ((iM6981 ^ i5) * (-3715)) ^ (-125967087);
                        i8 = 130690506;
                    } else {
                        iM6981 = C0630.m2566("ۤۙ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 12133) ^ 1481773646;
                        i8 = -575629979;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42339(C9711 c9711) {
        boolean z;
        int length = c9711.length();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        C19631.m45134(c9711.f29397, identityHashMap);
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        Iterator itM10483 = C3432.m10483(C3432.m10486(identityHashMap));
        while (C0483.m2123(itM10483)) {
            m42330((InterfaceC18883) C2272.m7513(itM10483), identityHashMap2, identityHashMap3);
        }
        long jM45120 = C19631.m45120(c9711.f29397);
        synchronized (f56530) {
            C22951 c22951 = f56534;
            Iterator itM1837 = C0382.m1837(C3432.m10486(identityHashMap3));
            z = false;
            boolean z2 = false;
            while (true) {
                boolean z3 = true;
                if (!C1773.m5910(itM1837)) {
                    break;
                }
                if (((C2491) C2272.m7513(itM1837)).f7938 != c22951) {
                    z3 = false;
                }
                z2 |= z3;
            }
            long j = length;
            if (jM45120 > j || (c22951 != null && z2 && c22951.f73939 > j)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0290 A[PHI: r43
      0x0290: PHI (r43v15 long) = (r43v14 long), (r43v16 long) binds: [B:71:0x0278, B:68:0x025e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a0, code lost:
    
        if (l.C1916.f6442 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        if (l.C0483.f2088 < 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c2, code lost:
    
        r43 = r34;
        r34 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        if (l.RunnableC3474.f10992 > 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dc, code lost:
    
        if (l.C2105.m6982() == 0) goto L25;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m42300(int i, int i2, int i3, int[] iArr) {
        int iM2566;
        int i4;
        int iM6981;
        int i5;
        int i6;
        int iM6982;
        int i7;
        int i8;
        int iM2567;
        int i9;
        int i10;
        int i11;
        long j = 0;
        long jM28024 = 0;
        long j2 = 0;
        int i12 = 0;
        long j3 = 0;
        long jMax = 0;
        long jMax2 = 0;
        int i13 = C1128.f4106;
        int i14 = C4075.f12947;
        int iM2568 = (i14 - C0630.m2566("ۚۗ")) * (-83);
        int i15 = ((iM2568 ^ i13) * (-16181)) ^ (-1277612373);
        int i16 = iM2568 ^ (-677476824);
        long j4 = 0;
        int i17 = 0;
        int i18 = 0;
        long j5 = 0;
        int i19 = 0;
        long jM10482 = 0;
        int i20 = 0;
        long j6 = 0;
        int i21 = -549938365;
        int i22 = 0;
        long jM1834 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        while (true) {
            i21 = i16 ^ (i15 & (((i21 ^ i13) * (-8233)) >> 31));
            switch (i21) {
                case -2138729044:
                case -461411504:
                    long j11 = 65536 + j;
                    j2 = j11;
                    i19 = i12;
                    jM10482 = C3432.m10482(i, j11);
                    int iM2569 = (C0630.m2566("۟᩷") ^ i13) * (-99);
                    i15 = ((iM2569 ^ i14) * 16645) ^ (-77284564);
                    i16 = iM2569 ^ 180179243;
                    j8 = j8;
                    break;
                case -2079997436:
                case 1194383766:
                    jM28024 = C11340.m28024(jM28024, 8 * j4);
                    j8 = j8;
                    i12 = i19;
                    j = j2;
                    i11 = i22;
                    int iM25610 = C0630.m2566("۠۬") ^ i14;
                    int i23 = i11;
                    i15 = ((iM25610 ^ i13) * 325) ^ (-1665895325);
                    i16 = iM25610 ^ (-435621421);
                    i22 = i23;
                    j8 = j8;
                    break;
                case -2066173675:
                case 346334638:
                    j8 = j8;
                    j3 = jM10482 - j;
                    if (jMax == 0) {
                        i12 = i19;
                        j = j2;
                        i11 = i22;
                        int iM25611 = C0630.m2566("۠۬") ^ i14;
                        int i24 = i11;
                        i15 = ((iM25611 ^ i13) * 325) ^ (-1665895325);
                        i16 = iM25611 ^ (-435621421);
                        i22 = i24;
                        j8 = j8;
                    } else {
                        iM6981 = (C2105.m6981("᩹ۛ") + i14) * 27;
                        i5 = ((iM6981 ^ i13) * 31307) ^ (-491408747);
                        i6 = -1583821038;
                        i10 = iM6981 ^ i6;
                        j8 = j8;
                        int i25 = i5;
                        i16 = i10;
                        i15 = i25;
                    }
                    break;
                case -2065586083:
                case -1889674187:
                    j8 = j8;
                    if (i17 < i2) {
                        iM6981 = C0630.m2566("ۧ᩷") ^ i13;
                        i5 = ((iM6981 ^ i14) * 4933) ^ 168507774;
                        i6 = 1344545847;
                        i10 = iM6981 ^ i6;
                        j8 = j8;
                        int i26 = i5;
                        i16 = i10;
                        i15 = i26;
                    }
                    j8 = j8;
                    iM6982 = (C2105.m6981("ۜۨ") + i13) * (-97);
                    i5 = ((iM6982 ^ i14) * 2357) ^ (-1970727361);
                    i7 = 1098738745;
                    i10 = iM6982 ^ i7;
                    int i27 = i5;
                    i16 = i10;
                    i15 = i27;
                    break;
                case -1975256367:
                case 1900171372:
                    j8 = j8;
                    i8 = i22;
                    j5 = 0;
                    if (i2 == 0) {
                        iM2567 = (C0630.m2566("᩷֡") + i13) * 101;
                        i5 = ((iM2567 ^ i14) * 15667) ^ 329176103;
                        i9 = -1606156168;
                    } else {
                        iM2567 = C0630.m2566("ܰ۬") ^ i13;
                        i5 = ((iM2567 ^ i14) * 30345) ^ (-1654445396);
                        i9 = 161889081;
                    }
                    i10 = iM2567 ^ i9;
                    i22 = i8;
                    j8 = j8;
                    int i28 = i5;
                    i16 = i10;
                    i15 = i28;
                    break;
                case -1572489273:
                case 358687202:
                    j4 = (j3 + 63) / 64;
                    if (C2958.f9394 >= 0) {
                        iM6982 = (C2105.m6981("ܶۨ") + i14) * 39;
                        i5 = ((iM6982 ^ i13) * 15953) ^ 2087735562;
                        i7 = 529478864;
                    } else {
                        iM6982 = C2105.m6981("᩶۬") ^ i13;
                        i5 = ((iM6982 ^ i14) * (-16939)) ^ 1414890764;
                        i7 = 1337451880;
                    }
                    i10 = iM6982 ^ i7;
                    int i29 = i5;
                    i16 = i10;
                    i15 = i29;
                    break;
                case -1512172942:
                case -645011562:
                    C1128.m3851();
                    break;
                case -1511020547:
                case 24458808:
                    C1420.m4913();
                    break;
                case -1504989219:
                case 1180780195:
                    j8 = j8;
                    i8 = i22;
                    if (C5695.f17556 < 0) {
                        iM2567 = (C2105.m6981("֫ܺ") + i14) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM2567 ^ i13) * (-2837)) ^ (-388588856);
                        i9 = -1161796346;
                        i10 = iM2567 ^ i9;
                        i22 = i8;
                        j8 = j8;
                        int i210 = i5;
                        i16 = i10;
                        i15 = i210;
                    } else {
                        i22 = i8;
                        iM6981 = (C0630.m2566("ܽܽ") + i14) * (-55);
                        i5 = ((iM6981 ^ i13) * (-3141)) ^ (-283008482);
                        i6 = 1097044714;
                        i10 = iM6981 ^ i6;
                        j8 = j8;
                        int i211 = i5;
                        i16 = i10;
                        i15 = i211;
                    }
                    break;
                case -1482550594:
                case 1210343878:
                    j8 = j8;
                    i22 = iArr[i2 + i18];
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (C0630.m2566("ܽܽ") + i14) * (-55);
                        i5 = ((iM6981 ^ i13) * (-3141)) ^ (-283008482);
                        i6 = 1097044714;
                    } else {
                        iM6981 = (i13 - C2105.m6981("ۚܿ")) * 27;
                        i5 = ((iM6981 ^ i14) * 21315) ^ 339721536;
                        i6 = -248750333;
                    }
                    i10 = iM6981 ^ i6;
                    j8 = j8;
                    int i212 = i5;
                    i16 = i10;
                    i15 = i212;
                    break;
                case -1368695571:
                case 19061069:
                    j8 = j8;
                    i8 = i22;
                    i20 = 0;
                    long j12 = iArr[0];
                    i18 = -1;
                    if (C3537.f11231 >= 0) {
                        j6 = j12;
                        iM2567 = (C0630.m2566("ۨᩴ") ^ i14) * (-105);
                        i5 = ((iM2567 ^ i13) * (-30201)) ^ (-1746349296);
                        i9 = -149482103;
                        i10 = iM2567 ^ i9;
                        i22 = i8;
                        j8 = j8;
                        int i213 = i5;
                        i16 = i10;
                        i15 = i213;
                    } else {
                        int iM25612 = C0630.m2566("ᩴۘ") ^ i14;
                        i15 = ((iM25612 ^ i13) * (-28883)) ^ (-1722138212);
                        i16 = iM25612 ^ 804927874;
                        i22 = i8;
                        j8 = j8;
                        j6 = j12;
                    }
                    break;
                case -1125683229:
                case -48695390:
                    return j5;
                case -1104719141:
                case 1881303871:
                    j8 = j8;
                    if (i19 < i2) {
                        iM6981 = C0630.m2566("ܺ᩻") ^ i14;
                        i5 = ((iM6981 ^ i13) * 23391) ^ 1297649916;
                        i6 = -1797565838;
                    } else {
                        iM6981 = (C0630.m2566("ܳۤ") + i14) * 31;
                        i5 = ((iM6981 ^ i13) * (-6907)) ^ 1556592572;
                        i6 = -1799469247;
                    }
                    i10 = iM6981 ^ i6;
                    j8 = j8;
                    int i214 = i5;
                    i16 = i10;
                    i15 = i214;
                    break;
                case -1066735764:
                case 444851115:
                    if (jMax >= j3) {
                        j8 = j8;
                        i12 = i19;
                        j = j2;
                        i11 = i22;
                        int iM25613 = C0630.m2566("۠۬") ^ i14;
                        int i215 = i11;
                        i15 = ((iM25613 ^ i13) * 325) ^ (-1665895325);
                        i16 = iM25613 ^ (-435621421);
                        i22 = i215;
                        j8 = j8;
                    } else {
                        iM6982 = (i13 - C2105.m6981("֫۟")) * (-125);
                        i5 = ((iM6982 ^ i14) * (-10445)) ^ (-1951590487);
                        i7 = 1973743195;
                        i10 = iM6982 ^ i7;
                        int i216 = i5;
                        i16 = i10;
                        i15 = i216;
                    }
                    break;
                case -851313463:
                case -448298747:
                    C1916.m6308();
                    j8 = j8;
                    i8 = i22;
                    iM2567 = C2105.m6981("ܿۧ") ^ i14;
                    i5 = ((iM2567 ^ i13) * (-21157)) ^ 1573292026;
                    i9 = -334379060;
                    i10 = iM2567 ^ i9;
                    i22 = i8;
                    j8 = j8;
                    int i217 = i5;
                    i16 = i10;
                    i15 = i217;
                    break;
                case -683605339:
                case 1774532144:
                    RunnableC0588.m2441();
                    break;
                case -678992178:
                case 775462976:
                    long j13 = j8;
                    jMax2 = Math.max(j, j13);
                    j9 = ((long) iArr[i17]) + j7;
                    if (C0964.f3626 == 0) {
                        iM2566 = C2105.m6981("ۤ᩷") ^ i13;
                        j8 = j13;
                        i15 = ((iM2566 ^ i14) * 23885) ^ 2011646274;
                        i4 = 96761330;
                        i16 = iM2566 ^ i4;
                        j8 = j8;
                    } else {
                        j8 = j13;
                        iM6981 = (C0630.m2566("ܽܽ") + i14) * (-55);
                        i5 = ((iM6981 ^ i13) * (-3141)) ^ (-283008482);
                        i6 = 1097044714;
                        i10 = iM6981 ^ i6;
                        j8 = j8;
                        int i218 = i5;
                        i16 = i10;
                        i15 = i218;
                    }
                    break;
                case -666017466:
                case 895835700:
                    C0422.m1963();
                    if (C0382.f1805) {
                        j8 = j8;
                        i8 = i22;
                        iM2567 = (i13 - C2105.m6981("ۨۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2567 ^ i14) * 1333) ^ (-986591866);
                        i9 = -2141243052;
                        i10 = iM2567 ^ i9;
                        i22 = i8;
                        j8 = j8;
                        int i219 = i5;
                        i16 = i10;
                        i15 = i219;
                    }
                    iM6982 = (C2105.m6981("ܽۙ") + i13) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i5 = ((iM6982 ^ i14) * 13219) ^ (-847299815);
                    i7 = 710951249;
                    i10 = iM6982 ^ i7;
                    int i2110 = i5;
                    i16 = i10;
                    i15 = i2110;
                    break;
                case -510467716:
                case -27981448:
                    jMax += Math.max(0L, jM1834);
                    i17++;
                    iM6981 = (C2105.m6981("᩶۟") + i14) * 59;
                    i5 = ((iM6981 ^ i13) * (-13727)) ^ (-409098629);
                    i6 = -379971738;
                    i10 = iM6981 ^ i6;
                    j8 = j8;
                    int i2111 = i5;
                    i16 = i10;
                    i15 = i2111;
                    break;
                case -377508998:
                case 1580535751:
                    j8 = j8;
                    i8 = i22;
                    if (C0382.f1805) {
                        iM2567 = C0630.m2566("ۛۤ") ^ i14;
                        i5 = ((iM2567 ^ i13) * 28591) ^ 760066362;
                        i9 = -1223352996;
                    } else {
                        iM2567 = C0630.m2566("ܳۜ") ^ i14;
                        i5 = ((iM2567 ^ i13) * 22539) ^ 1762645601;
                        i9 = 1343657623;
                    }
                    i10 = iM2567 ^ i9;
                    i22 = i8;
                    j8 = j8;
                    int i2112 = i5;
                    i16 = i10;
                    i15 = i2112;
                    break;
                case -325516062:
                case 1338020258:
                    break;
                case -239366775:
                case 351926450:
                    i11 = i22;
                    j8 = j8;
                    long j14 = i3;
                    long j15 = ((long) i11) + j14;
                    j7 = j14;
                    i12 = i20;
                    jM28024 = j5;
                    j = j6 & (-65536);
                    j10 = j15;
                    int iM25614 = C0630.m2566("۠۬") ^ i14;
                    int i2113 = i11;
                    i15 = ((iM25614 ^ i13) * 325) ^ (-1665895325);
                    i16 = iM25614 ^ (-435621421);
                    i22 = i2113;
                    j8 = j8;
                    break;
                case -193319731:
                case 779050598:
                    j8 = j8;
                    i8 = i22;
                    if (C3432.m10477() <= 0) {
                        iM2567 = (i13 - C2105.m6981("ܳۙ")) * 51;
                        i5 = ((iM2567 ^ i14) * (-25757)) ^ (-862501329);
                        i9 = 1700707075;
                    } else {
                        iM2567 = (C0630.m2566("ۖ֡") + i13) * 87;
                        i5 = ((iM2567 ^ i14) * 24227) ^ (-88765543);
                        i9 = 1130577128;
                    }
                    i10 = iM2567 ^ i9;
                    i22 = i8;
                    j8 = j8;
                    int i2114 = i5;
                    i16 = i10;
                    i15 = i2114;
                    break;
                case -178326062:
                case 1795344540:
                    if (C1294.f4556 < 0) {
                        j8 = j8;
                        i8 = i22;
                        iM2567 = C0630.m2566("ܳۜ") ^ i14;
                        i5 = ((iM2567 ^ i13) * 22539) ^ 1762645601;
                        i9 = 1343657623;
                        i10 = iM2567 ^ i9;
                        i22 = i8;
                        j8 = j8;
                        int i2115 = i5;
                        i16 = i10;
                        i15 = i2115;
                    }
                    j8 = j8;
                    i8 = i22;
                    iM2567 = (C0630.m2566("ۨᩴ") ^ i14) * (-105);
                    i5 = ((iM2567 ^ i13) * (-30201)) ^ (-1746349296);
                    i9 = -149482103;
                    i10 = iM2567 ^ i9;
                    i22 = i8;
                    j8 = j8;
                    int i2116 = i5;
                    i16 = i10;
                    i15 = i2116;
                    break;
                case 148495633:
                case 1486934927:
                    long j16 = iArr[i17];
                    if (j16 >= jM10482) {
                        j8 = j16;
                        j8 = j8;
                        iM6982 = (C2105.m6981("ۜۨ") + i13) * (-97);
                        i5 = ((iM6982 ^ i14) * 2357) ^ (-1970727361);
                        i7 = 1098738745;
                        i10 = iM6982 ^ i7;
                        int i2117 = i5;
                        i16 = i10;
                        i15 = i2117;
                    } else {
                        iM2566 = C0630.m2566("ۘۚ") ^ i14;
                        j8 = j16;
                        i15 = ((iM2566 ^ i13) * 28323) ^ (-1054701320);
                        i4 = 1608297492;
                        i16 = iM2566 ^ i4;
                        j8 = j8;
                    }
                    break;
                case 222331433:
                case 1665175180:
                    jM1834 = C0382.m1834(jM10482, j9) - jMax2;
                    if (C1773.f6144 > 0) {
                        iM6982 = C2105.m6981("ܳۛ") ^ i14;
                        i5 = ((iM6982 ^ i13) * 20915) ^ (-397700916);
                        i7 = 1980694184;
                        i10 = iM6982 ^ i7;
                        int i2118 = i5;
                        i16 = i10;
                        i15 = i2118;
                    } else {
                        j8 = j8;
                        iM6981 = (C0630.m2566("ܽܽ") + i14) * (-55);
                        i5 = ((iM6981 ^ i13) * (-3141)) ^ (-283008482);
                        i6 = 1097044714;
                        i10 = iM6981 ^ i6;
                        j8 = j8;
                        int i2119 = i5;
                        i16 = i10;
                        i15 = i2119;
                    }
                    break;
                case 231354222:
                case 1682583964:
                    C1047.m3599();
                    C3683.m11222();
                    return 0L;
                case 396182134:
                case 1470684209:
                    jMax = 0;
                    i17 = i19;
                    iM6981 = (C2105.m6981("᩶۟") + i14) * 59;
                    i5 = ((iM6981 ^ i13) * (-13727)) ^ (-409098629);
                    i6 = -379971738;
                    i10 = iM6981 ^ i6;
                    j8 = j8;
                    int i21110 = i5;
                    i16 = i10;
                    i15 = i21110;
                    break;
                case 478198059:
                case 1038646552:
                    j8 = j8;
                    if (((long) iArr[i19]) + j7 <= j) {
                        iM6981 = C2105.m6981("ۛ۫") ^ i13;
                        i5 = ((iM6981 ^ i14) * 26969) ^ (-1198673114);
                        i6 = 1930167687;
                    } else {
                        iM6981 = (C0630.m2566("ܳۤ") + i14) * 31;
                        i5 = ((iM6981 ^ i13) * (-6907)) ^ 1556592572;
                        i6 = -1799469247;
                    }
                    i10 = iM6981 ^ i6;
                    j8 = j8;
                    int i21111 = i5;
                    i16 = i10;
                    i15 = i21111;
                    break;
                case 487215292:
                case 1194670993:
                    return jM28024;
                case 492752279:
                case 1468858721:
                    j8 = j8;
                    i8 = i22;
                    if (C0422.f1886 <= 0) {
                        iM2567 = (i13 - C2105.m6981("ۨۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2567 ^ i14) * 1333) ^ (-986591866);
                        i9 = -2141243052;
                    } else {
                        iM2567 = (C0630.m2566("᩶ۖ") ^ i13) * 63;
                        i5 = ((iM2567 ^ i14) * 14131) ^ (-1461006595);
                        i9 = -264743326;
                    }
                    i10 = iM2567 ^ i9;
                    i22 = i8;
                    j8 = j8;
                    int i21112 = i5;
                    i16 = i10;
                    i15 = i21112;
                    break;
                case 1510976633:
                case 2072566079:
                    i19++;
                    int iM25615 = (C0630.m2566("۟᩷") ^ i13) * (-99);
                    i15 = ((iM25615 ^ i14) * 16645) ^ (-77284564);
                    i16 = iM25615 ^ 180179243;
                    j8 = j8;
                    break;
                case 1850948615:
                case 1862065640:
                    j8 = j8;
                    if (j < j10) {
                        iM6981 = C0630.m2566("᩻ᩴ") ^ i13;
                        i5 = ((iM6981 ^ i14) * (-6705)) ^ (-1875148293);
                        i6 = -2013078211;
                    } else {
                        iM6981 = (i14 - C0630.m2566("ۜ֨")) * 7;
                        i5 = ((iM6981 ^ i13) * 11517) ^ (-284292735);
                        i6 = -1484925848;
                    }
                    i10 = iM6981 ^ i6;
                    j8 = j8;
                    int i21113 = i5;
                    i16 = i10;
                    i15 = i21113;
                    break;
                default:
                    j8 = j8;
                    i8 = i22;
                    if (C1773.f6144 <= 0) {
                        iM2567 = C2105.m6981("ܿۧ") ^ i14;
                        i5 = ((iM2567 ^ i13) * (-21157)) ^ 1573292026;
                        i9 = -334379060;
                    } else {
                        iM2567 = (i14 - C2105.m6981("֫ۙ")) * 21;
                        i5 = ((iM2567 ^ i13) * 10949) ^ 1978810217;
                        i9 = 17179508;
                    }
                    i10 = iM2567 ^ i9;
                    i22 = i8;
                    j8 = j8;
                    int i21114 = i5;
                    i16 = i10;
                    i15 = i21114;
                    break;
            }
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 44421. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static l.C18177 m42316(l.C5477 r84, java.io.DataInput r85, l.C21896 r86) {
        /*
            Method dump skipped, instruction units count: 4442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18177.m42316(l.ۚܽܳ, java.io.DataInput, l.᩸᩺ܿ):l.ᩳܽܳ");
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m42390() {
        synchronized (this) {
            m42365();
            m42349();
            m42364();
            if (C2167.m7162(this.f56542)) {
                return false;
            }
            C7429 c7429 = (C7429) this.f56542.removeLast();
            this.f56541 -= c7429.f22837;
            boolean zM42335 = m42335(this.f56536, this.f56537.m19967(0L));
            long j = this.f56544 + 1;
            this.f56544 = j;
            this.f56537 = c7429.m19967(j);
            for (InterfaceC18883 interfaceC18883 : zM42335 ? m42363() : f56531) {
                try {
                    C1916.m6306(interfaceC18883);
                } catch (IOException unused) {
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m42377() {
        synchronized (this) {
            m42365();
            m42349();
            m42364();
            if (C2167.m7162(this.f56536)) {
                return false;
            }
            C7429 c7429 = (C7429) this.f56536.removeLast();
            this.f56541 -= c7429.f22837;
            boolean zM42335 = m42335(this.f56542, this.f56537.m19967(0L));
            long j = this.f56544 + 1;
            this.f56544 = j;
            this.f56537 = c7429.m19967(j);
            for (InterfaceC18883 interfaceC18883 : zM42335 ? m42363() : f56531) {
                try {
                    C7106.m19116(interfaceC18883);
                } catch (IOException unused) {
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized C11122 m42391() {
        C11122 c11122;
        m42365();
        m42349();
        m42364();
        c11122 = new C11122(this, this.f56537, this.f56547, this.f56545.m48698());
        this.f56551 = c11122;
        return c11122;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C11122 m42379(C16059 c16059) {
        C11122 c11122;
        short s = f56533[1061];
        int i = s + 17879;
        int i2 = (s * s) + 319658641;
        int i3 = (i * i) - (i2 + i2) <= 0 ? 62007 : 47475;
        synchronized (this) {
            m42365();
            m42349();
            m42364();
            C11003.requireNonNull(c16059, C0237.m1483(f56533, 1062, 8, i3));
            c16059.m37968();
            if (c16059.f49514 != this.f56540) {
                throw new IllegalArgumentException(ViewOnClickListenerC1958.m6435(f56533, 1070, 36, i3));
            }
            C7429 c7429 = this.f56537;
            if (c16059.f49519 != this.f56547 || c16059.m37965() != c7429.f22841 || c16059.f49516 != c7429.f22836 || c16059.f49521 != c7429.f22840) {
                throw new IllegalStateException(C1005.m3502(f56533, 1106, 17, i3));
            }
            m42396();
            c16059.m37969();
            c11122 = new C11122(this, c7429, this.f56547, this.f56545.m48698());
            this.f56551 = c11122;
        }
        return c11122;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42384(C11663 c11663, C5477 c5477) throws C5519 {
        int i;
        InterfaceC18883[] interfaceC18883Arr;
        short s = f56533[1196];
        int i2 = s + 8267;
        int i3 = (s * s) + 68343289;
        int i4 = (i3 + i3) - (i2 * i2) >= 0 ? 48633 : 62661;
        String strM19110 = C7106.m19110(f56533, 1197, 20, i4);
        C3019.m9257(c11663);
        C3537.m10749(c5477);
        if (!c5477.mo10086()) {
            throw new C5519();
        }
        synchronized (this) {
            m42365();
            if (c11663.f34768 != this) {
                throw new IllegalArgumentException(C2167.m7159(f56533, 1217, 38, i4));
            }
            if (c11663.f34770 || this.f56550 != c11663) {
                throw new IllegalStateException(C3911.m11919(f56533, 1255, 24, i4));
            }
            if (this.f56546.containsKey(c5477)) {
                throw new IllegalArgumentException(C2958.m9031(f56533, 1279, 41, i4));
            }
            C7429 c7429 = this.f56537;
            if (c11663.f34769 != this.f56547 || c11663.f34766 != c7429 || c11663.f34766.f22836 != c7429.f22836 || c11663.f34766.f22840 != c7429.f22840 || c11663.f34766.f22841 != c7429.f22841) {
                throw new IllegalStateException(C3537.m10748(f56533, 1320, 19, i4));
            }
            if (c5477.length() != c7429.m19966()) {
                StringBuilder sb = new StringBuilder(strM19110);
                C0422.m1944(sb, c5477.length());
                C1420.m4905(sb, C7106.m19110(f56533, 1339, 20, i4));
                C0050.m945(sb, c7429.m19966());
                throw new IllegalArgumentException(C0422.m1959(sb));
            }
            if (!c5477.mo10086()) {
                throw new C5519();
            }
            interfaceC18883Arr = (InterfaceC18883[]) C3432.m10486(this.f56546).toArray(new InterfaceC18883[0]);
            InterfaceC18883 interfaceC18883 = this.f56549;
            if (interfaceC18883 instanceof InterfaceC4339) {
                ((InterfaceC4339) interfaceC18883).mo13039();
            }
            this.f56546.clear();
            C0714.m2809(this.f56546, c5477, Boolean.TRUE);
            this.f56549 = c5477;
            this.f56545 = new C21541();
            this.f56542.clear();
            this.f56536.clear();
            this.f56541 = 0L;
            this.f56547++;
            m42346();
            C9047 c9047M45107 = C19631.m45107(c5477);
            C12100 c12100M32552 = C13510.m32552(c5477.length(), false);
            long j = this.f56544 + 1;
            this.f56544 = j;
            this.f56537 = new C7429(c9047M45107, c12100M32552, false, j, 0L, 0L, 0L, 0L, 0L);
            this.f56550 = null;
            c11663.f34770 = true;
        }
        try {
            c11663.f34767.close();
        } catch (IOException unused) {
        }
        for (InterfaceC18883 interfaceC18884 : interfaceC18883Arr) {
            try {
                C1916.m6306(interfaceC18884);
            } catch (IOException unused2) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01b7 A[PHI: r7 r11 r13 r15
      0x01b7: PHI (r7v4 java.util.Iterator) = 
      (r7v2 java.util.Iterator)
      (r7v3 java.util.Iterator)
      (r7v2 java.util.Iterator)
      (r7v2 java.util.Iterator)
      (r7v2 java.util.Iterator)
     binds: [B:101:0x01b7, B:54:0x01b0, B:27:0x0093, B:23:0x0073, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r11v4 long) = (r11v3 long), (r11v2 long), (r11v2 long), (r11v2 long), (r11v2 long) binds: [B:101:0x01b7, B:54:0x01b0, B:27:0x0093, B:23:0x0073, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r13v4 long) = (r13v3 long), (r13v2 long), (r13v2 long), (r13v2 long), (r13v2 long) binds: [B:101:0x01b7, B:54:0x01b0, B:27:0x0093, B:23:0x0073, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r15v4 long) = (r15v2 long), (r15v3 long), (r15v2 long), (r15v2 long), (r15v5 long) binds: [B:101:0x01b7, B:54:0x01b0, B:27:0x0093, B:23:0x0073, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01d6 A[PHI: r6
      0x01d6: PHI (r6v4 java.util.IdentityHashMap) = (r6v3 java.util.IdentityHashMap), (r6v2 java.util.IdentityHashMap), (r6v2 java.util.IdentityHashMap) binds: [B:57:0x01d4, B:20:0x005f, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02ca A[PHI: r2
      0x02ca: PHI (r2v3 long) = (r2v2 long), (r2v4 long) binds: [B:76:0x02b2, B:72:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x02e6 A[PHI: r4 r9
      0x02e6: PHI (r4v4 java.util.IdentityHashMap) = 
      (r4v2 java.util.IdentityHashMap)
      (r4v3 java.util.IdentityHashMap)
      (r4v2 java.util.IdentityHashMap)
      (r4v2 java.util.IdentityHashMap)
      (r4v2 java.util.IdentityHashMap)
      (r4v2 java.util.IdentityHashMap)
     binds: [B:81:0x02e4, B:68:0x027a, B:39:0x0105, B:15:0x0055, B:12:0x004f, B:9:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r9v4 java.lang.Object) = 
      (r9v2 java.lang.Object)
      (r9v2 java.lang.Object)
      (r9v3 java.lang.Object)
      (r9v2 java.lang.Object)
      (r9v2 java.lang.Object)
      (r9v2 java.lang.Object)
     binds: [B:81:0x02e4, B:68:0x027a, B:39:0x0105, B:15:0x0055, B:12:0x004f, B:9:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0317  */
    /* JADX WARN: Code duplicated, block: B:90:0x0347 A[PHI: r8 r10
      0x0347: PHI (r8v5 l.ۛۧܳ) = (r8v2 l.ۛۧܳ), (r8v4 l.ۛۧܳ), (r8v2 l.ۛۧܳ), (r8v2 l.ۛۧܳ), (r8v2 l.ۛۧܳ) binds: [B:89:0x0345, B:43:0x012a, B:35:0x00e3, B:18:0x005b, B:15:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0347: PHI (r10v5 java.lang.Long) = (r10v2 java.lang.Long), (r10v2 java.lang.Long), (r10v4 java.lang.Long), (r10v2 java.lang.Long), (r10v2 java.lang.Long) binds: [B:89:0x0345, B:43:0x012a, B:35:0x00e3, B:18:0x005b, B:15:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C9047 m42353(C9047 c9047, long j, C21541 c21541) {
        int iM6981;
        int i;
        int i2;
        long j2 = 0;
        IdentityHashMap identityHashMap = null;
        IdentityHashMap identityHashMap2 = null;
        Iterator itM12354 = null;
        C6018 c6018 = null;
        Object obj = null;
        Long l2 = null;
        long jLongValue = 0;
        long jMo11897 = 0;
        long j3 = 0;
        int i3 = -29695030;
        int i4 = C0050.f910;
        int i5 = C3537.f11231;
        int iM2566 = C0630.m2566("ۖ֡") ^ i4;
        int i6 = ((iM2566 ^ i5) * (-14451)) ^ 290893077;
        int i7 = iM2566 ^ (-340277956);
        C9047 c9047M42354 = null;
        while (true) {
            ArrayList arrayList = null;
            while (true) {
                i3 = i7 ^ (i6 & (((i3 ^ i5) * 31193) >> 31));
                switch (i3) {
                    case -2139791053:
                    case -84011608:
                        if (c9047 != null) {
                            iM6981 = C0630.m2566("᩻۠") ^ i5;
                            i = ((iM6981 ^ i4) * 18343) ^ (-2060738915);
                            i2 = -2104802886;
                        } else {
                            c9047M42354 = c9047;
                            iM6981 = C0630.m2566("ۛܽ") ^ i4;
                            i = ((iM6981 ^ i5) * (-30487)) ^ (-1374987132);
                            i2 = -1076637760;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -2048735494:
                    case -120023061:
                        if (C0237.f1507 != 0) {
                            iM6981 = (C2105.m6981("ᩳܽ") ^ i5) * (-47);
                            i = ((iM6981 ^ i4) * 20821) ^ (-1803708423);
                            i2 = -145743893;
                        } else {
                            iM6981 = C0630.m2566("᩺֨") ^ i4;
                            i = ((iM6981 ^ i5) * 13577) ^ (-1189350978);
                            i2 = -20784172;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -1986016629:
                    case 187190325:
                        C1711.m5736();
                        iM6981 = (C2105.m6981("ۜܳ") + i4) * 49;
                        i = ((iM6981 ^ i5) * 25043) ^ 2004232299;
                        i2 = -862222058;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -1945067456:
                    case -169664037:
                        if (C0483.m2123(itM12354)) {
                            iM6981 = (C2105.m6981("ۜۚ") ^ i4) * (-83);
                            i = ((iM6981 ^ i5) * (-29613)) ^ 1992773084;
                            i2 = -1269322514;
                        } else {
                            iM6981 = C0630.m2566("ۨ᩺") ^ i5;
                            i = ((iM6981 ^ i4) * (-12307)) ^ 1417235856;
                            i2 = 1804793731;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -1793475030:
                    case 1683155115:
                        C2167.m7148(identityHashMap2, c6018, Boolean.TRUE);
                        j3 += jLongValue;
                        iM6981 = C0630.m2566("᩵ۙ") ^ i4;
                        i = ((iM6981 ^ i5) * 7847) ^ 1874034392;
                        i2 = 1891010063;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -1751111264:
                    case 1391699728:
                        jLongValue = l2.longValue();
                        jMo11897 = c6018.mo11897();
                        if (jMo11897 >= j2) {
                            int iM2567 = C0630.m2566("᩹᩻") ^ i5;
                            i6 = ((iM2567 ^ i4) * 1725) ^ 808969825;
                            i7 = iM2567 ^ 711956967;
                        } else {
                            iM6981 = C0630.m2566("᩵ۙ") ^ i4;
                            i = ((iM6981 ^ i5) * 7847) ^ 1874034392;
                            i2 = 1891010063;
                            i7 = iM6981 ^ i2;
                            i6 = i;
                        }
                        break;
                    case -1598061030:
                    case 330398188:
                        if (C22628.f73083 <= 0) {
                            iM6981 = C0630.m2566("᩺֨") ^ i4;
                            i = ((iM6981 ^ i5) * 13577) ^ (-1189350978);
                            i2 = -20784172;
                        } else {
                            iM6981 = C0630.m2566("ܺ᩵") ^ i5;
                            i = ((iM6981 ^ i4) * (-28833)) ^ (-2092827427);
                            i2 = 726131609;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -1575546817:
                    case 1698585506:
                        c6018 = (C6018) C2272.m7513(itM12354);
                        if (C3683.f11629 >= 0) {
                            iM6981 = (C2105.m6981("ᩳܽ") ^ i5) * (-47);
                            i = ((iM6981 ^ i4) * 20821) ^ (-1803708423);
                            i2 = -145743893;
                        } else {
                            iM6981 = (C0630.m2566("ܶۚ") + i4) * 95;
                            i = ((iM6981 ^ i5) * (-19533)) ^ 1659750587;
                            i2 = -1429836923;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -1318482776:
                    case 40172785:
                        if (C3663.f11553) {
                            iM6981 = (C2105.m6981("ۜܳ") + i4) * 49;
                            i = ((iM6981 ^ i5) * 25043) ^ 2004232299;
                            i2 = -862222058;
                        } else {
                            iM6981 = (C2105.m6981("ᩳܽ") ^ i5) * (-47);
                            i = ((iM6981 ^ i4) * 20821) ^ (-1803708423);
                            i2 = -145743893;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -1283798894:
                    case -84851538:
                        if (jLongValue > 65536 - j3) {
                            iM6981 = C0630.m2566("᩵ۙ") ^ i4;
                            i = ((iM6981 ^ i5) * 7847) ^ 1874034392;
                            i2 = 1891010063;
                        } else {
                            iM6981 = C0630.m2566("ۚ᩶") ^ i4;
                            i = ((iM6981 ^ i5) * (-13325)) ^ 549800774;
                            i2 = 1773948349;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -1273249715:
                    case 1356882322:
                        if (C4616.m13552() == 0) {
                            ArrayList arrayList2 = new ArrayList();
                            m42358(c9047, identityHashMap, arrayList2);
                            if (C1047.f3863 >= 0) {
                                int iM6982 = (C2105.m6981("۬ۢ") + i4) * (-113);
                                i6 = ((iM6982 ^ i5) * (-15137)) ^ (-1493432075);
                                arrayList = arrayList2;
                                i7 = iM6982 ^ (-1327561042);
                            } else {
                                int iM2568 = (i5 - C0630.m2566("ܶ֨")) * 101;
                                i = ((iM2568 ^ i4) * (-22877)) ^ (-1703643669);
                                arrayList = arrayList2;
                                i7 = iM2568 ^ (-1927194864);
                                i6 = i;
                            }
                        }
                        break;
                    case -1254715948:
                    case -1145629359:
                        l2 = (Long) obj;
                        if (C3537.f11231 >= 0) {
                            iM6981 = (C2105.m6981("ᩳܽ") ^ i5) * (-47);
                            i = ((iM6981 ^ i4) * 20821) ^ (-1803708423);
                            i2 = -145743893;
                        } else {
                            iM6981 = (C0630.m2566("ۡۡ") + i4) * 5;
                            i = ((iM6981 ^ i5) * (-20817)) ^ (-196395997);
                            i2 = -1110542329;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -1171584165:
                    case -757205796:
                        if (identityHashMap2.isEmpty()) {
                            iM6981 = (C2105.m6981("ᩴۛ") + i4) * (-39);
                            i = ((iM6981 ^ i5) * 28001) ^ (-574466887);
                            i2 = -676647800;
                        } else {
                            iM6981 = (C2105.m6981("ۛۛ") + i5) * 89;
                            i = ((iM6981 ^ i4) * 27497) ^ (-1763442741);
                            i2 = 877654412;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -1111684591:
                    case -562792468:
                        if (C0050.f910 >= 0) {
                        }
                        iM6981 = C0630.m2566("᩺֨") ^ i4;
                        i = ((iM6981 ^ i5) * 13577) ^ (-1189350978);
                        i2 = -20784172;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -1053986972:
                    case -571573354:
                        c9047M42354 = m42354(c9047, identityHashMap2, c21541);
                        iM6981 = C0630.m2566("ۛܽ") ^ i4;
                        i = ((iM6981 ^ i5) * (-30487)) ^ (-1374987132);
                        i2 = -1076637760;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -1037325964:
                    case 1395750453:
                        j2 = 1048576;
                        if (j < 1048576) {
                            c9047M42354 = c9047;
                            iM6981 = C0630.m2566("ۛܽ") ^ i4;
                            i = ((iM6981 ^ i5) * (-30487)) ^ (-1374987132);
                            i2 = -1076637760;
                        } else {
                            iM6981 = C2105.m6981("᩶ۜ") ^ i4;
                            i = ((iM6981 ^ i5) * 20929) ^ (-61759704);
                            i2 = -447544752;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -943755975:
                    case -69870961:
                        if (jLongValue <= jMo11897 / 4) {
                            iM6981 = (C2105.m6981("ۙܿ") + i5) * (-105);
                            i = ((iM6981 ^ i4) * (-7461)) ^ 1502892677;
                            i2 = 5156638;
                        } else {
                            iM6981 = C0630.m2566("᩵ۙ") ^ i4;
                            i = ((iM6981 ^ i5) * 7847) ^ 1874034392;
                            i2 = 1891010063;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -899459487:
                    case -614255281:
                        C0714.m2805();
                        if (C1294.m4372() > 0) {
                            iM6981 = C0630.m2566("᩺֨") ^ i4;
                            i = ((iM6981 ^ i5) * 13577) ^ (-1189350978);
                            i2 = -20784172;
                        } else {
                            iM6981 = (C0630.m2566("ۘ᩻") + i5) * 127;
                            i = ((iM6981 ^ i4) * 14353) ^ (-1090164315);
                            i2 = -717812609;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case -52881394:
                    case 1801270900:
                        obj = identityHashMap.get(c6018);
                        if (C2272.f7362) {
                            iM6981 = C0630.m2566("᩺֨") ^ i4;
                            i = ((iM6981 ^ i5) * 13577) ^ (-1189350978);
                            i2 = -20784172;
                        } else {
                            iM6981 = (C0630.m2566("ۛ᩺") ^ i5) * (-79);
                            i = ((iM6981 ^ i4) * 15537) ^ (-1305320565);
                            i2 = -65790092;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case 91334002:
                    case 435495997:
                        identityHashMap = new IdentityHashMap();
                        if (C11340.f33930 >= 0) {
                            iM6981 = C0630.m2566("᩺֨") ^ i4;
                            i = ((iM6981 ^ i5) * 13577) ^ (-1189350978);
                            i2 = -20784172;
                        } else {
                            iM6981 = C0630.m2566("᩷ᩳ") ^ i4;
                            i = ((iM6981 ^ i5) * (-13063)) ^ 1626404906;
                            i2 = 1220383706;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case 387056124:
                    case 1987516139:
                        if (C2126.f7087) {
                            iM6981 = (C2105.m6981("ᩳܽ") ^ i5) * (-47);
                            i = ((iM6981 ^ i4) * 20821) ^ (-1803708423);
                            i2 = -145743893;
                        } else {
                            iM6981 = (C2105.m6981("ۙۘ") + i4) * 19;
                            i = ((iM6981 ^ i5) * (-23189)) ^ (-393400200);
                            i2 = -1315708054;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case 573598714:
                    case 814103400:
                        identityHashMap2 = new IdentityHashMap();
                        if (C0237.f1507 != 0) {
                            iM6981 = (C2105.m6981("ۜܳ") + i4) * 49;
                            i = ((iM6981 ^ i5) * 25043) ^ 2004232299;
                            i2 = -862222058;
                        } else {
                            iM6981 = (C0630.m2566("ۢ᩹") ^ i5) * (-35);
                            i = ((iM6981 ^ i4) * 53) ^ 773336743;
                            i2 = 1728612390;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case 882731439:
                    case 1604391714:
                        j3 = 0;
                        itM12354 = C4117.m12354(arrayList);
                        iM6981 = C0630.m2566("᩵ۙ") ^ i4;
                        i = ((iM6981 ^ i5) * 7847) ^ 1874034392;
                        i2 = 1891010063;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    case 982047611:
                    case 1441905898:
                        return c9047;
                    case 1131809097:
                    case 2102687414:
                        return c9047M42354;
                    case 1908575412:
                    case 2046017040:
                        if (C3537.m10746() <= 0) {
                            iM6981 = (C0630.m2566("ۘ᩻") + i5) * 127;
                            i = ((iM6981 ^ i4) * 14353) ^ (-1090164315);
                            i2 = -717812609;
                        } else {
                            iM6981 = C0630.m2566("ۙܽ") ^ i5;
                            i = ((iM6981 ^ i4) * (-3683)) ^ 1237620583;
                            i2 = 1896239572;
                        }
                        i7 = iM6981 ^ i2;
                        i6 = i;
                        break;
                    default:
                        C4159.m12565();
                        return null;
                }
            }
            int iM2569 = (i5 - C0630.m2566("ۘ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
            i7 = iM2569 ^ 369475969;
            i6 = ((iM2569 ^ i4) * 7835) ^ 983108586;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x0166 A[PHI: r19
      0x0166: PHI (r19v3 long) = (r19v2 long), (r19v1 long) binds: [B:49:0x014e, B:42:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x019e A[PHI: r9 r11
      0x019e: PHI (r9v3 long) = (r9v1 long), (r9v2 long), (r9v1 long) binds: [B:57:0x019c, B:26:0x0090, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r11v3 long) = (r11v1 long), (r11v2 long), (r11v1 long) binds: [B:57:0x019c, B:26:0x0090, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x0224 A[PHI: r13
      0x0224: PHI (r13v2 long) = (r13v1 long), (r13v3 long) binds: [B:69:0x0222, B:22:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0276  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a0  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m42301(int i, long j) {
        int iM6981;
        int i2;
        int i3;
        long j2 = 0;
        long jM3495 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        int i4 = -620408350;
        int i5 = C1294.f4556;
        int i6 = RunnableC1937.f6483;
        int iM6982 = C2105.m6981("ܳۛ") ^ i6;
        int i7 = ((iM6982 ^ i5) * 30287) ^ 919236966;
        int i8 = iM6982 ^ (-690493952);
        long j6 = 0;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i5) * 29045) >> 31));
            switch (i4) {
                case -1963090625:
                case -185660366:
                    j2 = C13132.FOREVER_NS;
                    if (j < j6) {
                        iM6981 = C0630.m2566("ܽۢ") ^ i6;
                        i2 = ((iM6981 ^ i5) * (-6343)) ^ 826932655;
                        i3 = 711172430;
                    } else {
                        iM6981 = C0630.m2566("᩻᩵") ^ i5;
                        i2 = ((iM6981 ^ i6) * (-20369)) ^ (-419307434);
                        i3 = 122548960;
                    }
                    int i9 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i9;
                    break;
                case -1958253142:
                case -1149200095:
                    return j2;
                case -1889811549:
                case 387597725:
                    if (C3663.m11168() >= 0) {
                        iM6981 = C2105.m6981("᩺֫") ^ i5;
                        i2 = ((iM6981 ^ i6) * 14693) ^ (-1019742852);
                        i3 = -1192814565;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ۡ֡")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM6981 ^ i6) * (-22283)) ^ 869060270;
                        i3 = -134570919;
                    }
                    int i10 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i10;
                    break;
                case -1793239800:
                case 1962104954:
                    jM3495 = C1005.m3495(32L, j5);
                    iM6981 = C2105.m6981("ܰۚ") ^ i5;
                    i2 = ((iM6981 ^ i6) * (-20617)) ^ 334318383;
                    i3 = 392872956;
                    int i11 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i11;
                    break;
                case -1702152829:
                case 1704159559:
                    C1420.m4913();
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("֡᩵") ^ i6;
                        i2 = ((iM6981 ^ i5) * (-26955)) ^ (-1623458596);
                        i3 = -1933851266;
                    } else {
                        iM6981 = C0630.m2566("ۙᩳ") ^ i6;
                        i2 = ((iM6981 ^ i5) * 21633) ^ 1877793936;
                        i3 = -1734087313;
                    }
                    int i12 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i12;
                    break;
                case -1684749996:
                case 155245823:
                    if (C2958.f9394 >= 0) {
                        iM6981 = C2105.m6981("֡᩵") ^ i6;
                        i2 = ((iM6981 ^ i5) * (-26955)) ^ (-1623458596);
                        i3 = -1933851266;
                    } else {
                        iM6981 = C2105.m6981("᩺֫") ^ i5;
                        i2 = ((iM6981 ^ i6) * 14693) ^ (-1019742852);
                        i3 = -1192814565;
                    }
                    int i13 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i13;
                    break;
                case -1658174317:
                case 1446375372:
                    if (C5695.m16023() >= 0) {
                        iM6981 = (C0630.m2566("ܽۨ") + i5) * 21;
                        i2 = ((iM6981 ^ i6) * (-31715)) ^ (-1950072016);
                        i3 = -1052582099;
                    } else {
                        iM6981 = (C2105.m6981("ܶܳ") + i5) * (-63);
                        i2 = ((iM6981 ^ i6) * (-15385)) ^ 948882293;
                        i3 = -709155890;
                    }
                    int i14 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i14;
                    break;
                case -1635974029:
                case 1586748764:
                    j3 = i;
                    j4 = 16;
                    if (C0964.f3626 != 0) {
                        iM6981 = C0630.m2566("ۙᩳ") ^ i6;
                        i2 = ((iM6981 ^ i5) * 21633) ^ 1877793936;
                        i3 = -1734087313;
                    } else {
                        iM6981 = C2105.m6981("ܺ᩵") ^ i5;
                        i2 = ((iM6981 ^ i6) * 25047) ^ (-433055908);
                        i3 = 380196669;
                    }
                    int i15 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i15;
                    break;
                case -1471804527:
                case -169092430:
                    if (i > 0) {
                        iM6981 = C2105.m6981("᩺ۗ") ^ i5;
                        i2 = ((iM6981 ^ i6) * (-29145)) ^ 1565742807;
                        i3 = -2025043235;
                    } else {
                        jM3495 = j2;
                        iM6981 = C2105.m6981("ܰۚ") ^ i5;
                        i2 = ((iM6981 ^ i6) * (-20617)) ^ 334318383;
                        i3 = 392872956;
                    }
                    int i16 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i16;
                    break;
                case -1204648736:
                case 1881194659:
                    return j6;
                case -1201500035:
                case 477336367:
                    return C1005.m3495(jM3495, j);
                case -1194720854:
                case -504517129:
                    if (C0050.m940() <= 0) {
                        iM6981 = C2105.m6981("֡᩵") ^ i6;
                        i2 = ((iM6981 ^ i5) * (-26955)) ^ (-1623458596);
                        i3 = -1933851266;
                    } else {
                        iM6981 = (C0630.m2566("ۗܳ") + i6) * 65;
                        i2 = ((iM6981 ^ i5) * 2619) ^ 578311008;
                        i3 = 1562819626;
                    }
                    int i17 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i17;
                    break;
                case -1180624019:
                case 1160452423:
                    j5 = j3 * j4;
                    if (C0798.f2919) {
                        iM6981 = (C0630.m2566("ᩴ᩷") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM6981 ^ i5) * (-24915)) ^ (-1994554145);
                        i3 = -1386248432;
                    } else {
                        iM6981 = C2105.m6981("᩺᩻") ^ i6;
                        i2 = ((iM6981 ^ i5) * (-25609)) ^ (-83121486);
                        i3 = -451688431;
                    }
                    int i18 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i18;
                    break;
                case -674877802:
                case 690721862:
                    j6 = 0;
                    if (i == 0) {
                        iM6981 = C0630.m2566("ۜۚ") ^ i6;
                        i2 = ((iM6981 ^ i5) * 22759) ^ 957470460;
                        i3 = -1955723702;
                    } else {
                        iM6981 = (i5 - C0630.m2566("֡ܿ")) * (-9);
                        i2 = ((iM6981 ^ i6) * (-8657)) ^ 937351714;
                        i3 = 744026137;
                    }
                    int i19 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i19;
                    break;
                case -365622128:
                case 558779878:
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("᩺֫") ^ i5;
                        i2 = ((iM6981 ^ i6) * 14693) ^ (-1019742852);
                        i3 = -1192814565;
                    } else {
                        iM6981 = C2105.m6981("᩻ۧ") ^ i5;
                        i2 = ((iM6981 ^ i6) * 9683) ^ (-181249591);
                        i3 = 542133828;
                    }
                    int i110 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i110;
                    break;
                case -318722217:
                case 1468898676:
                    C21923.m49329();
                    if (C3746.f11829 <= 0) {
                        iM6981 = C2105.m6981("֡᩵") ^ i6;
                        i2 = ((iM6981 ^ i5) * (-26955)) ^ (-1623458596);
                        i3 = -1933851266;
                    } else {
                        iM6981 = (C0630.m2566("ܽۨ") + i5) * 21;
                        i2 = ((iM6981 ^ i6) * (-31715)) ^ (-1950072016);
                        i3 = -1052582099;
                    }
                    int i111 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i111;
                    break;
                case -275420037:
                case 445448734:
                    if (j == j6) {
                        iM6981 = (C2105.m6981("᩷᩹") + i6) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM6981 ^ i5) * (-22085)) ^ 267441534;
                        i3 = -549857364;
                    } else {
                        iM6981 = (i5 - C0630.m2566("֡ܿ")) * (-9);
                        i2 = ((iM6981 ^ i6) * (-8657)) ^ 937351714;
                        i3 = 744026137;
                    }
                    int i112 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i112;
                    break;
                case 53326098:
                case 1068471015:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C2105.m6981("᩺֫") ^ i5;
                        i2 = ((iM6981 ^ i6) * 14693) ^ (-1019742852);
                        i3 = -1192814565;
                    } else {
                        iM6981 = C0630.m2566("ᩳܰ") ^ i6;
                        i2 = ((iM6981 ^ i5) * 15197) ^ (-1681919236);
                        i3 = 1176947361;
                    }
                    int i113 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i113;
                    break;
                case 328370652:
                case 1363318281:
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C0630.m2566("ᩴ᩷") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM6981 ^ i5) * (-24915)) ^ (-1994554145);
                        i3 = -1386248432;
                    } else {
                        iM6981 = (i6 - C2105.m6981("ᩴۧ")) * (-7);
                        i2 = ((iM6981 ^ i5) * (-30143)) ^ (-1851376375);
                        i3 = -1173257259;
                    }
                    int i114 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i114;
                    break;
                case 401380417:
                case 1491581453:
                    C3663.m11168();
                    C3663.m11168();
                    iM6981 = C2105.m6981("֡᩵") ^ i6;
                    i2 = ((iM6981 ^ i5) * (-26955)) ^ (-1623458596);
                    i3 = -1933851266;
                    int i115 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i115;
                    break;
                case 492360352:
                case 1776893509:
                    C4159.m12565();
                    return 0L;
                case 675792747:
                case 1435470968:
                    if (i > 1048576) {
                        jM3495 = j2;
                        iM6981 = C2105.m6981("ܰۚ") ^ i5;
                        i2 = ((iM6981 ^ i6) * (-20617)) ^ 334318383;
                        i3 = 392872956;
                    } else {
                        iM6981 = C0630.m2566("᩺ۨ") ^ i6;
                        i2 = ((iM6981 ^ i5) * (-4523)) ^ 1304297268;
                        i3 = -814532136;
                    }
                    int i116 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i116;
                    break;
                case 957956390:
                case 1569491549:
                    if (C3911.f12484 >= 0) {
                        iM6981 = C0630.m2566("ۙᩳ") ^ i6;
                        i2 = ((iM6981 ^ i5) * 21633) ^ 1877793936;
                        i3 = -1734087313;
                    } else {
                        iM6981 = C0630.m2566("֫ܰ") ^ i5;
                        i2 = ((iM6981 ^ i6) * 28983) ^ (-1643995639);
                        i3 = -1868066263;
                    }
                    int i117 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i117;
                    break;
                default:
                    if (C21923.f70183 != 0) {
                        iM6981 = C2105.m6981("֡᩵") ^ i6;
                        i2 = ((iM6981 ^ i5) * (-26955)) ^ (-1623458596);
                        i3 = -1933851266;
                    } else {
                        iM6981 = C2105.m6981("ۛܽ") ^ i6;
                        i2 = ((iM6981 ^ i5) * (-8157)) ^ (-392539681);
                        i3 = -1330820850;
                    }
                    int i118 = i2;
                    i8 = iM6981 ^ i3;
                    i7 = i118;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42383(C11663 c11663) {
        short s = f56533[1133];
        int i = s + 1;
        int i2 = (i * i) - ((s * 2) + 1) < 0 ? 42953 : 60150;
        synchronized (this) {
            if (c11663.f34768 != this) {
                throw new IllegalArgumentException(ServiceConnectionC3453.m10568(f56533, 1134, 38, i2));
            }
            if (c11663.f34770) {
                return;
            }
            if (this.f56550 == c11663) {
                this.f56550 = null;
            } else if (!this.f56538) {
                throw new IllegalStateException(C4263.m12817(f56533, 1172, 24, i2));
            }
            c11663.f34770 = true;
            c11663.f34767.close();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.f56538) {
                return;
            }
            C11122 c11122 = this.f56551;
            if (c11122 != null) {
                c11122.m27552();
            }
            IOException iOException = null;
            this.f56550 = null;
            this.f56538 = true;
            this.f56542.clear();
            this.f56536.clear();
            this.f56541 = 0L;
            m42346();
            InterfaceC18883[] interfaceC18883Arr = (InterfaceC18883[]) C0382.m1841(this.f56546).toArray(new InterfaceC18883[0]);
            this.f56546.clear();
            for (InterfaceC18883 interfaceC18883 : interfaceC18883Arr) {
                try {
                    C1916.m6306(interfaceC18883);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    } else {
                        C2167.m7154(iOException, e);
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m42356(Throwable th) throws IOException {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = 1617304637;
        int i6 = RunnableC0588.f2309;
        int i7 = C1128.f4106;
        int iM2566 = C0630.m2566("᩺۫") ^ i7;
        int i8 = ((iM2566 ^ i6) * (-30119)) ^ 289501795;
        int i9 = -1357239413;
        while (true) {
            i5 = ((((i5 ^ i6) * 19651) >> 31) & i8) ^ (iM2566 ^ i9);
            switch (i5) {
                case -2118822493:
                case 98294537:
                    int i10 = i + i2;
                    i3 = i10 + i10;
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C2105.m6981("᩹᩹") ^ i6) * (-63);
                        i8 = ((iM2566 ^ i7) * 5307) ^ 40795983;
                        i9 = 911862519;
                    } else {
                        iM2566 = C0630.m2566("֫᩵") ^ i6;
                        i8 = ((iM2566 ^ i7) * 2359) ^ (-225091455);
                        i9 = 119490497;
                    }
                    break;
                case -2113834373:
                case 1782826204:
                    if (th instanceof RuntimeException) {
                        iM2566 = (i6 - C0630.m2566("֫ۘ")) * 7;
                        i8 = ((iM2566 ^ i7) * 2659) ^ 682710557;
                        i9 = 9593191;
                    } else {
                        iM2566 = (C2105.m6981("ۚ֡") + i7) * (-97);
                        i8 = ((iM2566 ^ i6) * (-675)) ^ 988949655;
                        i9 = 449705375;
                    }
                    break;
                case -2103753516:
                case -1300898948:
                    i4 = 11481;
                    iM2566 = (i7 - C0630.m2566("֨ۙ")) * (-97);
                    i8 = ((iM2566 ^ i6) * (-14833)) ^ (-530369188);
                    i9 = 1723762046;
                    break;
                case -2053228015:
                case -1602187081:
                    if (th instanceof IOException) {
                        iM2566 = C2105.m6981("ܿܽ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 7211) ^ (-1132843070);
                        i9 = -614943099;
                    } else {
                        iM2566 = (C2105.m6981("᩺ۛ") ^ i7) * (-57);
                        i8 = ((iM2566 ^ i6) * 21527) ^ 1874636791;
                        i9 = -1679622428;
                    }
                    break;
                case -1990557323:
                case -36017441:
                    c = 849;
                    if (C5695.m16023() >= 0) {
                        iM2566 = C0630.m2566("ۖ᩺") ^ i6;
                        i8 = ((iM2566 ^ i7) * 20791) ^ (-855302964);
                        i9 = -1829192742;
                    } else {
                        iM2566 = (i7 - C2105.m6981("ܶ֨")) * (-25);
                        i8 = ((iM2566 ^ i6) * (-2545)) ^ (-663466795);
                        i9 = -1980977741;
                    }
                    break;
                case -1864964577:
                case -546601714:
                    if (th instanceof Error) {
                        iM2566 = C0630.m2566("ۙܳ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-31583)) ^ (-2107750527);
                        i9 = -189815477;
                    } else {
                        iM2566 = C0630.m2566("ۡ۠") ^ i6;
                        i8 = ((iM2566 ^ i7) * 10363) ^ (-1340265743);
                        i9 = -1753504158;
                    }
                    break;
                case -1823157765:
                case 150045572:
                    i4 = 36006;
                    iM2566 = (i7 - C0630.m2566("֨ۙ")) * (-97);
                    i8 = ((iM2566 ^ i6) * (-14833)) ^ (-530369188);
                    i9 = 1723762046;
                    break;
                case -1786366139:
                case -64259591:
                    throw ((Error) th);
                case -1629195708:
                case -680947378:
                    s2 = 8048;
                    if (C22628.f73083 <= 0) {
                        iM2566 = C0630.m2566("ۖ᩺") ^ i6;
                        i8 = ((iM2566 ^ i7) * 20791) ^ (-855302964);
                        i9 = -1829192742;
                    } else {
                        iM2566 = (C0630.m2566("᩻᩹") + i7) * 87;
                        i8 = ((iM2566 ^ i6) * 19931) ^ 81302565;
                        i9 = 61536992;
                    }
                    break;
                case -1562561815:
                case -390372761:
                    s = sArr[c];
                    if (C0382.f1805) {
                        iM2566 = C2105.m6981("ۗ᩶") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-11833)) ^ 2035473996;
                        i9 = -544405158;
                    } else {
                        iM2566 = C0630.m2566("ۖ᩺") ^ i6;
                        i8 = ((iM2566 ^ i7) * 20791) ^ (-855302964);
                        i9 = -1829192742;
                    }
                    break;
                case -1530456841:
                case -1482876942:
                    sArr = f56533;
                    if (C0382.f1805) {
                        iM2566 = C0630.m2566("ۜܿ") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-231)) ^ 634828291;
                        i9 = 1616584964;
                    } else {
                        iM2566 = (C2105.m6981("᩹᩹") ^ i6) * (-63);
                        i8 = ((iM2566 ^ i7) * 5307) ^ 40795983;
                        i9 = 911862519;
                    }
                    break;
                case -1489619125:
                case -423069259:
                    if (!RunnableC3474.m10630()) {
                        iM2566 = (C2105.m6981("֡᩷") + i7) * (-103);
                        i8 = ((iM2566 ^ i6) * 16137) ^ 120319961;
                        i9 = 1512772865;
                    } else {
                        iM2566 = (C2105.m6981("᩹᩹") ^ i6) * (-63);
                        i8 = ((iM2566 ^ i7) * 5307) ^ 40795983;
                        i9 = 911862519;
                    }
                    break;
                case -1458892507:
                case 1118023412:
                    throw ((IOException) th);
                case -1246993041:
                case -234755924:
                    if (C4117.f13076 <= 0) {
                        iM2566 = (C0630.m2566("ۗ᩹") + i6) * 17;
                        i8 = ((iM2566 ^ i7) * 3013) ^ (-1023158714);
                        i9 = -1371023405;
                    } else {
                        iM2566 = (C2105.m6981("ۗ᩻") ^ i6) * (-7);
                        i8 = ((iM2566 ^ i7) * (-22127)) ^ (-565868063);
                        i9 = 1131939494;
                    }
                    break;
                case -1102963848:
                case 184789521:
                    C1005.m3501();
                    if (C21923.f70183 == 0) {
                        iM2566 = (C2105.m6981("֡᩷") + i7) * (-103);
                        i8 = ((iM2566 ^ i6) * 16137) ^ 120319961;
                        i9 = 1512772865;
                    } else {
                        iM2566 = C2105.m6981("ۤ֫") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-10621)) ^ (-642386018);
                        i9 = -1347228732;
                    }
                    break;
                case -927263089:
                case 910624127:
                    C2126.m7040();
                    iM2566 = (C0630.m2566("ۗ᩹") + i6) * 17;
                    i8 = ((iM2566 ^ i7) * 3013) ^ (-1023158714);
                    i9 = -1371023405;
                    break;
                case -430676214:
                case 1436885288:
                    int i11 = s + s2;
                    if (i3 - (i11 * i11) < 0) {
                        iM2566 = C0630.m2566("ۜۚ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-727)) ^ 1414923902;
                        i9 = 7692082;
                    } else {
                        iM2566 = (C2105.m6981("۬۠") + i6) * 9;
                        i8 = ((iM2566 ^ i7) * (-19199)) ^ (-881127589);
                        i9 = -610919097;
                    }
                    break;
                case -283049110:
                case 764765752:
                    C3911.m11924();
                    if (C21923.f70183 != 0) {
                        iM2566 = (C2105.m6981("֡᩷") + i7) * (-103);
                        i8 = ((iM2566 ^ i6) * 16137) ^ 120319961;
                        i9 = 1512772865;
                    } else {
                        iM2566 = (C0630.m2566("ۗ᩹") + i6) * 17;
                        i8 = ((iM2566 ^ i7) * 3013) ^ (-1023158714);
                        i9 = -1371023405;
                    }
                    break;
                case -106953400:
                case 1781547183:
                    if (C1711.f5919) {
                        iM2566 = (C2105.m6981("֡᩷") + i7) * (-103);
                        i8 = ((iM2566 ^ i6) * 16137) ^ 120319961;
                        i9 = 1512772865;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۚ") ^ i7) * 43;
                        i8 = ((iM2566 ^ i6) * (-13543)) ^ 78802393;
                        i9 = -1665750743;
                    }
                    break;
                case -73465234:
                case 1182144650:
                    i = s * s;
                    i2 = 64770304;
                    if (C0422.m1963()) {
                        iM2566 = C0630.m2566("ܿۤ") ^ i7;
                        i8 = ((iM2566 ^ i6) * 14707) ^ 777660972;
                        i9 = 224344900;
                    } else {
                        iM2566 = C0630.m2566("ۖ᩺") ^ i6;
                        i8 = ((iM2566 ^ i7) * 20791) ^ (-855302964);
                        i9 = -1829192742;
                    }
                    break;
                case 243303890:
                case 2069162635:
                    short[] sArr2 = f56533;
                    if (ViewOnClickListenerC1958.m6429() < 0) {
                        if (C5695.m16023() < 0) {
                            throw new IOException(C1916.m6311(sArr2, 850, 40, i4), th);
                        }
                        iM2566 = (C0630.m2566("ۗ᩹") + i6) * 17;
                        i8 = ((iM2566 ^ i7) * 3013) ^ (-1023158714);
                        i9 = -1371023405;
                    } else {
                        iM2566 = (C2105.m6981("᩹᩹") ^ i6) * (-63);
                        i8 = ((iM2566 ^ i7) * 5307) ^ 40795983;
                        i9 = 911862519;
                    }
                    break;
                case 894213769:
                case 1512225318:
                    throw ((RuntimeException) th);
                default:
                    C2958.m9034();
                    ViewOnClickListenerC1958.m6429();
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42327(C18177 c18177, C8841 c8841) {
        synchronized (c18177) {
            if (c18177.f56547 != c8841.f26921 || c18177.f56549 != c8841.f26925 || !c8841.f26925.mo10086()) {
                throw new C5519();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0120 A[PHI: r5
      0x0120: PHI (r5v3 l.ۛۧܳ) = (r5v2 l.ۛۧܳ), (r5v5 l.ۛۧܳ) binds: [B:41:0x011e, B:37:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x01e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42334(Iterable iterable) {
        int iM6981;
        int i;
        int iM2566;
        int i2;
        ?? r8;
        ArrayDeque arrayDeque = null;
        Iterator itM13555 = null;
        InterfaceC18883 interfaceC18883 = null;
        boolean z = false;
        C6018 c6018 = null;
        InterfaceC18883[] interfaceC18883Arr = null;
        int length = 0;
        ?? r9 = 0;
        int i3 = -540238674;
        int i4 = ServiceConnectionC3453.f10921;
        int i5 = C4616.f14690;
        int iM2567 = C0630.m2566("᩶᩷") ^ i5;
        int i6 = ((iM2567 ^ i4) * (-6885)) ^ 1558475823;
        int i7 = -283470254;
        while (true) {
            int i8 = iM2567 ^ i7;
            IdentityHashMap identityHashMap = null;
            while (true) {
                i3 = ((((i3 ^ i4) * 32343) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2118557087:
                    case -264768754:
                        if (C2167.m7162(arrayDeque)) {
                            iM2566 = C0630.m2566("᩶ᩴ") ^ i4;
                            i6 = ((iM2566 ^ i5) * 10255) ^ 125363939;
                            i2 = -2052836814;
                            r9 = r9;
                        } else {
                            iM2566 = (i5 - C2105.m6981("֫ܰ")) * 43;
                            i6 = ((iM2566 ^ i4) * 13419) ^ (-1040754725);
                            i2 = 1038650182;
                            r9 = r9;
                        }
                        i8 = iM2566 ^ i2;
                        break;
                    case -2035840284:
                    case 652109495:
                        C3663.m11175(arrayDeque, interfaceC18883Arr[r9 == true ? 1 : 0]);
                        if (C1128.m3851() > 0) {
                            iM2566 = C0630.m2566("ܿܽ") ^ i5;
                            i6 = ((iM2566 ^ i4) * (-7299)) ^ 24129479;
                            i2 = -394582693;
                            r9 = r9;
                            i8 = iM2566 ^ i2;
                        } else {
                            iM2567 = C0630.m2566("ۗܰ") ^ i4;
                            i6 = ((iM2567 ^ i5) * (-17039)) ^ 1233631734;
                            i7 = -566477509;
                        }
                        break;
                    case -1919593693:
                    case -614294665:
                        c6018 = (C6018) interfaceC18883;
                        if (C2167.m7147(c6018.f18475) <= 0) {
                            iM2566 = C2105.m6981("ܿܳ") ^ i4;
                            i6 = ((iM2566 ^ i5) * 28415) ^ 1314973738;
                            i2 = 497929089;
                            r9 = r9;
                        } else {
                            iM2566 = (i5 - C0630.m2566("۠۟")) * (-31);
                            i6 = ((iM2566 ^ i4) * 3233) ^ (-2029068177);
                            i2 = 74672756;
                            r9 = r9;
                        }
                        i8 = iM2566 ^ i2;
                        break;
                    case -1706874265:
                    case 315692112:
                        C2958.m9034();
                        RunnableC0588.m2441();
                        iM2567 = C2105.m6981("ᩴۘ") ^ i4;
                        i6 = ((iM2567 ^ i5) * 4297) ^ 1594544133;
                        i7 = 2009079707;
                        break;
                    case -1691037681:
                    case 219667198:
                        C2272.m7503();
                        return false;
                    case -1131988337:
                    case -1041620985:
                        interfaceC18883 = (InterfaceC18883) arrayDeque.pop();
                        if (C3245.m9925() == 0) {
                            iM2566 = C0630.m2566("ܳܶ") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-14523)) ^ (-2035455792);
                            i2 = -628799753;
                            r9 = r9;
                            i8 = iM2566 ^ i2;
                        } else {
                            iM2567 = C0630.m2566("ۗܰ") ^ i4;
                            i6 = ((iM2567 ^ i5) * (-17039)) ^ 1233631734;
                            i7 = -566477509;
                        }
                        break;
                    case -1041572907:
                    case 956153245:
                        C3663.m11175(arrayDeque, (InterfaceC18883) RunnableC1108.m3791(itM13555));
                        iM2566 = (C2105.m6981("ۡ۬") + i5) * (-21);
                        i6 = ((iM2566 ^ i4) * 20269) ^ 901231681;
                        i2 = 150541987;
                        r9 = r9;
                        i8 = iM2566 ^ i2;
                        break;
                    case -912128429:
                    case 1676326295:
                        if (C3911.f12484 < 0) {
                            if (C3911.f12484 >= 0) {
                                iM2567 = (C2105.m6981("ܶۤ") ^ i5) * (-33);
                                i6 = ((iM2567 ^ i4) * (-24851)) ^ 1014145097;
                                i7 = 1061753364;
                                break;
                            } else if (C7811.f24123 >= 0 || C3019.m9255() <= 0 || C7106.m19120() <= 0 || C2272.f7362) {
                                iM2567 = C0630.m2566("ۗܰ") ^ i4;
                                i6 = ((iM2567 ^ i5) * (-17039)) ^ 1233631734;
                                i7 = -566477509;
                                break;
                            } else if (!C1504.m5179()) {
                                iM2567 = C2105.m6981("ᩴۘ") ^ i4;
                                i6 = ((iM2567 ^ i5) * 4297) ^ 1594544133;
                                i7 = 2009079707;
                                break;
                            } else {
                                identityHashMap = new IdentityHashMap();
                                if (!C1711.f5919) {
                                    iM2566 = (C0630.m2566("֫ۛ") ^ i4) * 21;
                                    i6 = ((iM2566 ^ i5) * 28935) ^ (-1038940662);
                                    i2 = 743321703;
                                    r9 = r9;
                                    i8 = iM2566 ^ i2;
                                    break;
                                }
                            }
                        }
                        iM2567 = (i5 - C0630.m2566("۠֨")) * 43;
                        i6 = ((iM2567 ^ i4) * (-5959)) ^ 1072490674;
                        i7 = -810717267;
                        break;
                    case -899201679:
                    case 2033696174:
                        if (r9 < length) {
                            iM2566 = C2105.m6981("᩹ܺ") ^ i5;
                            i6 = ((iM2566 ^ i4) * (-14065)) ^ 2119786988;
                            i2 = -1608552507;
                            r9 = r9;
                        } else {
                            iM2566 = (C0630.m2566("ܺܽ") + i5) * 75;
                            i6 = ((iM2566 ^ i4) * (-15827)) ^ (-1774848238);
                            i2 = -654876544;
                            r9 = r9;
                        }
                        i8 = iM2566 ^ i2;
                        break;
                    case -846746236:
                    case 990651498:
                        if (interfaceC18883.mo10086()) {
                            iM2566 = (C0630.m2566("ܺܽ") + i5) * 75;
                            i6 = ((iM2566 ^ i4) * (-15827)) ^ (-1774848238);
                            i2 = -654876544;
                            r9 = r9;
                        } else {
                            iM2566 = C2105.m6981("ܿܳ") ^ i4;
                            i6 = ((iM2566 ^ i5) * 28415) ^ 1314973738;
                            i2 = 497929089;
                            r9 = r9;
                        }
                        i8 = iM2566 ^ i2;
                        break;
                    case -826270651:
                    case -605591500:
                        r8 = (r9 == true ? 1 : 0) + 1;
                        iM2566 = (i4 - C0630.m2566("ᩴ᩶")) * (-51);
                        i6 = ((iM2566 ^ i5) * (-13369)) ^ (-390534139);
                        i2 = -1300954312;
                        r9 = r8;
                        i8 = iM2566 ^ i2;
                        break;
                    case -785490067:
                    case 887182036:
                        if (RunnableC1937.f6483 < 0) {
                            iM2567 = (C2105.m6981("ܶۤ") ^ i5) * (-33);
                            i6 = ((iM2567 ^ i4) * (-24851)) ^ 1014145097;
                            i7 = 1061753364;
                        }
                        iM2566 = (i4 - C2105.m6981("ۙܳ")) * (-15);
                        i6 = ((iM2566 ^ i5) * (-6101)) ^ (-1668303803);
                        i2 = 257191622;
                        r9 = r9;
                        i8 = iM2566 ^ i2;
                        break;
                    case -629294054:
                    case 2065487118:
                        if (C1773.m5910(itM13555)) {
                            iM2566 = (C0630.m2566("۫֡") + i4) * (-49);
                            i6 = ((iM2566 ^ i5) * 22679) ^ 1342927262;
                            i2 = 1706376847;
                            r9 = r9;
                        } else {
                            iM2566 = (C0630.m2566("ܺܽ") + i5) * 75;
                            i6 = ((iM2566 ^ i4) * (-15827)) ^ (-1774848238);
                            i2 = -654876544;
                            r9 = r9;
                        }
                        i8 = iM2566 ^ i2;
                        break;
                    case -603962389:
                    case 913462756:
                        if (C0714.m2809(identityHashMap, interfaceC18883, Boolean.TRUE) != null) {
                            iM2566 = (C0630.m2566("ܺܽ") + i5) * 75;
                            i6 = ((iM2566 ^ i4) * (-15827)) ^ (-1774848238);
                            i2 = -654876544;
                            r9 = r9;
                        } else {
                            iM2566 = C0630.m2566("ܿ۟") ^ i5;
                            i6 = ((iM2566 ^ i4) * 32671) ^ 357525955;
                            i2 = -1052318603;
                            r9 = r9;
                        }
                        i8 = iM2566 ^ i2;
                        break;
                    case -593482037:
                    case 1261027541:
                        interfaceC18883Arr = c6018.f18478;
                        length = interfaceC18883Arr.length;
                        r8 = z;
                        iM2566 = (i4 - C0630.m2566("ᩴ᩶")) * (-51);
                        i6 = ((iM2566 ^ i5) * (-13369)) ^ (-390534139);
                        i2 = -1300954312;
                        r9 = r8;
                        i8 = iM2566 ^ i2;
                        break;
                    case -245704411:
                    case 1030274707:
                        return z;
                    case 744060109:
                    case 1766885884:
                        return true;
                    case 794767023:
                    case 1321518341:
                        if (C1294.f4556 < 0) {
                            iM2567 = C0630.m2566("ۗܰ") ^ i4;
                            i6 = ((iM2567 ^ i5) * (-17039)) ^ 1233631734;
                            i7 = -566477509;
                        } else {
                            iM2567 = C2105.m6981("ᩴۘ") ^ i4;
                            i6 = ((iM2567 ^ i5) * 4297) ^ 1594544133;
                            i7 = 2009079707;
                        }
                        break;
                    case 852169586:
                    case 1380908029:
                        if (C1128.m3851() <= 0) {
                            iM2566 = (C2105.m6981("ܶۜ") ^ i5) * 43;
                            i6 = ((iM2566 ^ i4) * (-26791)) ^ (-1341432965);
                            i2 = -1248603850;
                            r9 = r9;
                            i8 = iM2566 ^ i2;
                        } else {
                            iM2567 = (C2105.m6981("ܶۤ") ^ i5) * (-33);
                            i6 = ((iM2567 ^ i4) * (-24851)) ^ 1014145097;
                            i7 = 1061753364;
                        }
                        break;
                    case 1049928582:
                    case 1663386357:
                        C22628.m50615();
                        if (C22628.f73083 <= 0) {
                            iM2567 = C2105.m6981("ᩴۘ") ^ i4;
                            i6 = ((iM2567 ^ i5) * 4297) ^ 1594544133;
                            i7 = 2009079707;
                        }
                        iM2566 = (i4 - C2105.m6981("ۙܳ")) * (-15);
                        i6 = ((iM2566 ^ i5) * (-6101)) ^ (-1668303803);
                        i2 = 257191622;
                        r9 = r9;
                        i8 = iM2566 ^ i2;
                        break;
                    case 1490643565:
                    case 1543938311:
                        arrayDeque = new ArrayDeque();
                        itM13555 = C4616.m13555(iterable);
                        iM2566 = (C2105.m6981("ۡ۬") + i5) * (-21);
                        i6 = ((iM2566 ^ i4) * 20269) ^ 901231681;
                        i2 = 150541987;
                        r9 = r9;
                        i8 = iM2566 ^ i2;
                        break;
                    default:
                        if (interfaceC18883 instanceof C6018) {
                            iM6981 = C0630.m2566("᩻֨") ^ i5;
                            i6 = ((iM6981 ^ i4) * 19957) ^ 858591285;
                            i = -1423067282;
                        } else {
                            iM6981 = (C2105.m6981("ᩴ᩵") ^ i4) * (-7);
                            i6 = ((iM6981 ^ i5) * 31877) ^ 757052451;
                            i = 1221161453;
                        }
                        i8 = iM6981 ^ i;
                        z = false;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9047 m42308(C9047 c9047, IdentityHashMap identityHashMap, C3902 c3902, InterfaceC17066 interfaceC17066) throws IOException {
        int iM6981;
        int i;
        C9047 c9048 = null;
        C9047 c9049 = null;
        C9047 c9047M42308 = null;
        C9047 c9047M42309 = null;
        C21042 c21042 = null;
        int i2 = -989739817;
        int i3 = C1128.f4106;
        int i4 = C2167.f7158;
        int iM6982 = C2105.m6981("ۢ᩹") ^ i3;
        int i5 = ((iM6982 ^ i4) * (-31051)) ^ 70321539;
        int i6 = 849832057;
        while (true) {
            int i7 = iM6982 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * 24071) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1766707545:
                    case -278226491:
                        c9047M42308 = m42308(c9049, identityHashMap, c3902, interfaceC17066);
                        c9047M42309 = m42308(c9048, identityHashMap, c3902, interfaceC17066);
                        if (c9047M42308 != c9049) {
                            iM6982 = (i4 - C0630.m2566("ܿۜ")) * 81;
                            i5 = ((iM6982 ^ i3) * 2907) ^ 2115686673;
                            i6 = -1859943486;
                            break;
                        }
                        iM6982 = C2105.m6981("ۢۡ") ^ i3;
                        i5 = ((iM6982 ^ i4) * (-26867)) ^ (-1059150625);
                        i6 = 1949274935;
                        break;
                    case -1743454419:
                    case 792765476:
                        if (C4075.m12263() > 0) {
                            iM6982 = C2105.m6981("ۘܿ") ^ i4;
                            i5 = ((iM6982 ^ i3) * 11255) ^ 1123109264;
                            i6 = 77356866;
                            break;
                        }
                        iM6982 = (C0630.m2566("ܶ᩷") ^ i4) * (-3);
                        i5 = ((iM6982 ^ i3) * 16777) ^ 1164258647;
                        i6 = 2124852065;
                        break;
                    case -1533440253:
                    case 540861444:
                        int iMo11896 = c3902.mo11896(c21042, interfaceC17066);
                        int i8 = c21042.f67894;
                        if (C1047.f3863 < 0) {
                            return C19631.m45108(new C21042(c3902, iMo11896, i8, null));
                        }
                        iM6982 = (C2105.m6981("ۜۜ") + i4) * 61;
                        i5 = ((iM6982 ^ i3) * (-27467)) ^ (-1606315787);
                        i6 = -1274558612;
                        break;
                    case -1488892020:
                    case -137299319:
                        if (C0422.f1886 > 0) {
                            iM6982 = C2105.m6981("᩹֫") ^ i3;
                            i5 = ((iM6982 ^ i4) * (-31317)) ^ 1458372548;
                            i6 = 571786386;
                            break;
                        }
                        iM6982 = C2105.m6981("᩷۠") ^ i4;
                        i5 = ((iM6982 ^ i3) * (-31909)) ^ 1020056101;
                        i6 = -1478904265;
                        break;
                    case -1429564257:
                    case 423592986:
                        if (C1711.m5736() > 0) {
                            iM6982 = (i4 - C2105.m6981("ܺ᩹")) * 41;
                            i5 = ((iM6982 ^ i3) * (-11247)) ^ 1011200829;
                            i6 = -449413162;
                            break;
                        }
                        iM6982 = C2105.m6981("᩷۠") ^ i4;
                        i5 = ((iM6982 ^ i3) * (-31909)) ^ 1020056101;
                        i6 = -1478904265;
                        break;
                        break;
                    case -1396490619:
                    case 442616383:
                        c21042 = c9047.f27427;
                        if (!identityHashMap.containsKey(c21042.f67896)) {
                            iM6982 = (C0630.m2566("ܽܿ") + i3) * (-111);
                            i5 = ((iM6982 ^ i4) * 6241) ^ 1882395734;
                            i6 = 208076425;
                            break;
                        }
                        iM6982 = (C2105.m6981("᩶ۗ") ^ i4) * 23;
                        i5 = ((iM6982 ^ i3) * (-27197)) ^ (-1587272196);
                        i6 = -1500539483;
                        break;
                    case -1173296059:
                    case 535897049:
                        if (ServiceConnectionC3453.f10921 < 0) {
                            iM6982 = (C0630.m2566("᩺ܿ") ^ i4) * 73;
                            i5 = ((iM6982 ^ i3) * (-13427)) ^ (-726684095);
                            i6 = -1165527590;
                            break;
                        }
                        iM6982 = (C2105.m6981("ۜۜ") + i4) * 61;
                        i5 = ((iM6982 ^ i3) * (-27467)) ^ (-1606315787);
                        i6 = -1274558612;
                        break;
                        break;
                    case -1166731089:
                    case 1830252330:
                        C0237.m1481();
                        C7811.m20844();
                        iM6982 = (C0630.m2566("ܶ᩷") ^ i4) * (-3);
                        i5 = ((iM6982 ^ i3) * 16777) ^ 1164258647;
                        i6 = 2124852065;
                        break;
                        break;
                    case -847857485:
                    case 729951337:
                        if (RunnableC0588.f2309 < 0) {
                            iM6982 = C2105.m6981("۬ۨ") ^ i3;
                            i5 = ((iM6982 ^ i4) * 10985) ^ (-839850517);
                            i6 = 667188880;
                            break;
                        }
                        iM6982 = C2105.m6981("᩷۠") ^ i4;
                        i5 = ((iM6982 ^ i3) * (-31909)) ^ 1020056101;
                        i6 = -1478904265;
                        break;
                        break;
                    case -573962237:
                    case 1514796732:
                        if (C22628.f73083 > 0) {
                            iM6982 = (C0630.m2566("ۜۙ") + i3) * 61;
                            i5 = ((iM6982 ^ i4) * (-12179)) ^ 1851924186;
                            i6 = -1440498298;
                            break;
                        }
                        iM6982 = C2105.m6981("᩷۠") ^ i4;
                        i5 = ((iM6982 ^ i3) * (-31909)) ^ 1020056101;
                        i6 = -1478904265;
                        break;
                        break;
                    case -572764030:
                    case 2091600064:
                        if (c9047M42309 != c9048) {
                            iM6982 = (i4 - C0630.m2566("ܿۜ")) * 81;
                            i5 = ((iM6982 ^ i3) * 2907) ^ 2115686673;
                            i6 = -1859943486;
                            break;
                            break;
                        }
                        iM6982 = (C0630.m2566("ܽܿ") + i3) * (-111);
                        i5 = ((iM6982 ^ i4) * 6241) ^ 1882395734;
                        i6 = 208076425;
                        break;
                        break;
                    case -403884041:
                    case 612926316:
                        if (C3746.f11829 > 0) {
                            iM6982 = C2105.m6981("᩷۠") ^ i4;
                            i5 = ((iM6982 ^ i3) * (-31909)) ^ 1020056101;
                            i6 = -1478904265;
                            break;
                            break;
                        }
                        iM6982 = (C0630.m2566("ܶ᩷") ^ i4) * (-3);
                        i5 = ((iM6982 ^ i3) * 16777) ^ 1164258647;
                        i6 = 2124852065;
                        break;
                        break;
                    case -91583642:
                    case 224016106:
                        RunnableC1937.m6387();
                        C1128.m3851();
                        return null;
                    case 247731833:
                    case 1111150467:
                        return c9047;
                    case 450060888:
                    case 714340616:
                        if (C0630.f2410 > 0) {
                            iM6982 = C2105.m6981("ۜ۬") ^ i4;
                            i5 = ((iM6982 ^ i3) * (-15619)) ^ (-927283430);
                            i6 = -962104209;
                            break;
                        }
                        iM6982 = (i3 - C2105.m6981("ۙۛ")) * (-117);
                        i5 = ((iM6982 ^ i4) * (-12569)) ^ (-1422053351);
                        i6 = 1897658120;
                        break;
                    case 502747511:
                    case 1139297313:
                        boolean zM3598 = C1047.m3598(c9047);
                        C9047 c90410 = c9047.f27430;
                        C9047 c90411 = c9047.f27426;
                        if (zM3598) {
                            iM6981 = C0630.m2566("ۨۖ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-28013)) ^ (-1396244038);
                            i = -1538792029;
                        } else {
                            iM6981 = C2105.m6981("ۛᩳ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 28311) ^ 1397859480;
                            i = -403803915;
                        }
                        i7 = iM6981 ^ i;
                        c9048 = c90410;
                        c9049 = c90411;
                        break;
                    case 737097640:
                    case 975405158:
                        if (C0422.f1886 > 0) {
                            iM6982 = C0630.m2566("ۨۛ") ^ i3;
                            i5 = ((iM6982 ^ i4) * (-21333)) ^ (-1860191014);
                            i6 = 297492257;
                            break;
                        }
                        iM6982 = C0630.m2566("ܳۗ") ^ i3;
                        i5 = ((iM6982 ^ i4) * (-9339)) ^ 1528167433;
                        i6 = 739009184;
                        break;
                    case 1429904059:
                    case 1460389953:
                        return C19631.m45139(c9047M42308, c9047M42309);
                    case 1864124265:
                    case 2111075810:
                        C1504.m5179();
                        if (ServiceConnectionC3453.f10921 < 0) {
                            iM6982 = C0630.m2566("ܳۗ") ^ i3;
                            i5 = ((iM6982 ^ i4) * (-9339)) ^ 1528167433;
                            i6 = 739009184;
                            break;
                            break;
                        }
                        iM6982 = (C0630.m2566("ܶ᩷") ^ i4) * (-3);
                        i5 = ((iM6982 ^ i3) * 16777) ^ 1164258647;
                        i6 = 2124852065;
                        break;
                        break;
                    case 1879610144:
                    case 2123104600:
                        C0630.m2564();
                        if (!C1504.f5354) {
                            iM6982 = (C0630.m2566("ܶ᩷") ^ i4) * (-3);
                            i5 = ((iM6982 ^ i3) * 16777) ^ 1164258647;
                            i6 = 2124852065;
                            break;
                            break;
                        }
                        iM6982 = (i3 - C2105.m6981("ۙۛ")) * (-117);
                        i5 = ((iM6982 ^ i4) * (-12569)) ^ (-1422053351);
                        i6 = 1897658120;
                        break;
                        break;
                    default:
                        if (C1294.f4556 < 0) {
                            iM6982 = (C2105.m6981("᩹ۚ") ^ i4) * 85;
                            i5 = ((iM6982 ^ i3) * 7701) ^ 1946423122;
                            i6 = -1909148161;
                            break;
                        }
                        iM6982 = C2105.m6981("᩷۠") ^ i4;
                        i5 = ((iM6982 ^ i3) * (-31909)) ^ 1020056101;
                        i6 = -1478904265;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0577 A[PHI: r15 r16 r20 r22
      0x0577: PHI (r15v4 short) = (r15v2 short), (r15v3 short), (r15v2 short) binds: [B:132:0x0575, B:112:0x04b2, B:17:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0577: PHI (r16v4 int) = (r16v2 int), (r16v3 int), (r16v2 int) binds: [B:132:0x0575, B:112:0x04b2, B:17:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0577: PHI (r20v36 byte) = (r20v15 byte), (r20v21 byte), (r20v37 byte) binds: [B:132:0x0575, B:112:0x04b2, B:17:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0577: PHI (r22v25 l.᩷ᩳܳ) = (r22v5 l.᩷ᩳܳ), (r22v11 l.᩷ᩳܳ), (r22v26 l.᩷ᩳܳ) binds: [B:132:0x0575, B:112:0x04b2, B:17:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:137:0x05b3 A[PHI: r20 r21 r22
      0x05b3: PHI (r20v19 byte) = (r20v14 byte), (r20v16 byte), (r20v20 byte) binds: [B:136:0x05b1, B:128:0x0550, B:116:0x04e0] A[DONT_GENERATE, DONT_INLINE]
      0x05b3: PHI (r21v4 short) = (r21v3 short), (r21v3 short), (r21v5 short) binds: [B:136:0x05b1, B:128:0x0550, B:116:0x04e0] A[DONT_GENERATE, DONT_INLINE]
      0x05b3: PHI (r22v9 l.᩷ᩳܳ) = (r22v4 l.᩷ᩳܳ), (r22v6 l.᩷ᩳܳ), (r22v10 l.᩷ᩳܳ) binds: [B:136:0x05b1, B:128:0x0550, B:116:0x04e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:145:0x0612 A[PHI: r20 r22
      0x0612: PHI (r20v38 byte) = (r20v12 byte), (r20v18 byte), (r20v39 byte) binds: [B:144:0x0610, B:120:0x0506, B:13:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0612: PHI (r22v27 l.᩷ᩳܳ) = (r22v2 l.᩷ᩳܳ), (r22v8 l.᩷ᩳܳ), (r22v28 l.᩷ᩳܳ) binds: [B:144:0x0610, B:120:0x0506, B:13:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:149:0x0648 A[PHI: r20 r22
      0x0648: PHI (r20v43 byte) = (r20v11 byte), (r20v13 byte), (r20v17 byte), (r20v44 byte) binds: [B:148:0x0646, B:140:0x05ed, B:124:0x052c, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0648: PHI (r22v31 l.᩷ᩳܳ) = (r22v1 l.᩷ᩳܳ), (r22v3 l.᩷ᩳܳ), (r22v7 l.᩷ᩳܳ), (r22v32 l.᩷ᩳܳ) binds: [B:148:0x0646, B:140:0x05ed, B:124:0x052c, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        if (l.C1711.f5919 == false) goto L13;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m42318(DataOutputStream dataOutputStream, C9047 c9047, InterfaceC18883 interfaceC18883, IdentityHashMap identityHashMap, IdentityHashMap identityHashMap2, HashMap map) throws IOException {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int iM6982;
        int i5;
        int i6;
        int i7 = C2958.f9394;
        int i8 = C3537.f11231;
        int iM2567 = C0630.m2566("᩹ܶ") ^ i7;
        int i9 = ((iM2567 ^ i8) * 23317) ^ 1524322976;
        C17513 c17513 = null;
        Integer num = null;
        int i10 = iM2567 ^ (-188777430);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short s = 0;
        int i15 = 0;
        int i16 = -2125842094;
        short s2 = 0;
        InterfaceC18883 interfaceC18884 = null;
        Integer num2 = null;
        C21042 c21042 = null;
        byte b = 0;
        while (true) {
            i16 = i10 ^ (i9 & (((i16 ^ i8) * 25789) >> 31));
            switch (i16) {
                case -2027035953:
                case -1411271815:
                    C3245.m9922(dataOutputStream, i13);
                    return;
                case -1777563727:
                case -1114409905:
                    c21042 = c21042;
                    b = b;
                    if (i15 - ((s2 * s) + 1) < 0) {
                        iM2566 = C0630.m2566("ۘۚ") ^ i8;
                        i3 = ((iM2566 ^ i7) * 29013) ^ (-1293740493);
                        i4 = -1538451016;
                    } else {
                        iM2566 = C2105.m6981("ܿܰ") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-8271)) ^ 137750811;
                        i4 = -2053293484;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case -1688929307:
                case 1495202410:
                    return;
                case -1613908634:
                case 1233887006:
                    c21042 = c21042;
                    b = b;
                    if (C0714.m2805()) {
                        iM2566 = C0630.m2566("ۤ۠") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-18431)) ^ (-1800288023);
                        i4 = -827747047;
                    } else {
                        iM2566 = (i8 - C0630.m2566("֫᩶")) * 115;
                        i3 = ((iM2566 ^ i7) * (-2075)) ^ 1628885542;
                        i4 = 1285462188;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case -1597792457:
                case 1836438157:
                    C0050.m940();
                    iM6981 = C2105.m6981("֨ۡ") ^ i8;
                    i = ((iM6981 ^ i7) * 8483) ^ (-1674047177);
                    i2 = -486680397;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1588583723:
                case -173460048:
                    c17513.m40918(dataOutputStream, i11, i12, identityHashMap);
                    return;
                case -1480077093:
                case 860119744:
                    C1005.m3501();
                    return;
                case -1387520090:
                case 1475712266:
                    c21042 = c21042;
                    b = b;
                    dataOutputStream.writeByte(1);
                    C1420.m4914(dataOutputStream, i11);
                    C3245.m9922(dataOutputStream, i12);
                    if (c17513 == null) {
                        iM2566 = (i8 - C2105.m6981("ᩴܳ")) * 93;
                        i3 = ((iM2566 ^ i7) * 12193) ^ (-1675783458);
                        i4 = -1474227664;
                    } else {
                        iM2566 = (C2105.m6981("֨ۢ") ^ i7) * 87;
                        i3 = ((iM2566 ^ i8) * (-10431)) ^ 1023165190;
                        i4 = 876603078;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case -1340784280:
                case 1791152652:
                    c21042 = c21042;
                    b = b;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C2105.m6981("ܳ۠") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-19627)) ^ (-1267799894);
                        i4 = 1440850861;
                    } else {
                        iM2566 = (i8 - C0630.m2566("ܰ᩵")) * (-65);
                        i3 = ((iM2566 ^ i7) * (-9861)) ^ 799680860;
                        i4 = 2099444718;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case -1246125042:
                case -577222171:
                    c21042 = c21042;
                    b = b;
                    if (interfaceC18884 instanceof C20130) {
                        iM2566 = C2105.m6981("ۜܰ") ^ i8;
                        i3 = ((iM2566 ^ i7) * (-14099)) ^ 208796136;
                        i4 = 752033767;
                    } else {
                        iM2566 = C0630.m2566("۬ۙ") ^ i8;
                        i3 = ((iM2566 ^ i7) * (-7029)) ^ (-222488028);
                        i4 = -981318883;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case -1151201414:
                case -909049403:
                    C0964.m3413();
                    if (C2105.f7037 != 0) {
                        iM6981 = C0630.m2566("ᩳܿ") ^ i8;
                        i = ((iM6981 ^ i7) * 6655) ^ (-1652818930);
                        i2 = -1009077799;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        c21042 = c21042;
                        b = b;
                        iM2566 = C2105.m6981("ܳ۠") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-19627)) ^ (-1267799894);
                        i4 = 1440850861;
                        b = b;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        c21042 = c21042;
                    }
                    break;
                case -1117663147:
                case 681235757:
                    c21042 = c21042;
                    b = b;
                    s2 = f56533[477];
                    if (C7811.m20844() != 0) {
                        iM2566 = (i8 - C0630.m2566("֫᩶")) * 115;
                        i3 = ((iM2566 ^ i7) * (-2075)) ^ 1628885542;
                        i4 = 1285462188;
                    } else {
                        iM2566 = (i8 - C0630.m2566("ۖᩳ")) * 13;
                        i3 = ((iM2566 ^ i7) * 31377) ^ 425413899;
                        i4 = 1689331168;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case -1024941847:
                case -809395812:
                    c21042 = c21042;
                    b = b;
                    int i17 = s2 + 1;
                    i15 = i17 * i17;
                    s = 2;
                    if (C5695.f17556 >= 0) {
                        iM2566 = (i7 - C2105.m6981("ۧۛ")) * 57;
                        i3 = ((iM2566 ^ i8) * 13007) ^ (-1516974576);
                        i4 = 1564508590;
                    } else {
                        iM2566 = (C2105.m6981("ᩴ۠") ^ i7) * 17;
                        i3 = ((iM2566 ^ i8) * 16491) ^ (-1998174347);
                        i4 = -785158246;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case -1002286354:
                case 953952378:
                    c21042 = c21042;
                    b = b;
                    if (C3019.m9255() <= 0) {
                        iM2566 = C0630.m2566("᩸᩷") ^ i8;
                        i3 = ((iM2566 ^ i7) * 29609) ^ (-1999646654);
                        i4 = -269587431;
                    } else {
                        iM2566 = C0630.m2566("᩶ۤ") ^ i8;
                        i3 = ((iM2566 ^ i7) * (-24027)) ^ (-184745881);
                        i4 = 1316454914;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case -982948843:
                case -462260889:
                    b = b;
                    c21042 = c9047.f27427;
                    interfaceC18884 = c21042.f67896;
                    c17513 = c21042.f67895;
                    i11 = c21042.f67897;
                    i12 = c21042.f67894;
                    if (interfaceC18884 == interfaceC18883) {
                        int iM2568 = (C0630.m2566("ܰۚ") + i7) * 93;
                        i9 = ((iM2568 ^ i8) * (-19555)) ^ (-385766025);
                        i10 = iM2568 ^ 1510556311;
                    } else {
                        int iM6983 = (C2105.m6981("֨᩹") + i8) * (-95);
                        i9 = ((iM6983 ^ i7) * (-10137)) ^ (-208334945);
                        i10 = iM6983 ^ (-242105826);
                    }
                    i13 = 0;
                    break;
                case -850289801:
                case 162801503:
                    throw new IOException(C0483.m2128(f56533, 478, 33, i14));
                case -692612376:
                case -59608124:
                    c21042 = c21042;
                    b = b;
                    if (c9047 == null) {
                        iM2566 = C0630.m2566("ۧۤ") ^ i8;
                        i3 = ((iM2566 ^ i7) * (-10157)) ^ 1727938447;
                        i4 = 1257057138;
                    } else {
                        iM2566 = (C2105.m6981("᩶᩵") ^ i7) * (-65);
                        i3 = ((iM2566 ^ i8) * (-13107)) ^ 2127150544;
                        i4 = -37155727;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case -593805075:
                case 32020146:
                    c21042 = c21042;
                    b = b;
                    if (C3911.f12484 >= 0) {
                        iM2566 = C2105.m6981("ܳ۠") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-19627)) ^ (-1267799894);
                        i4 = 1440850861;
                    } else {
                        iM2566 = C2105.m6981("֡ۨ") ^ i7;
                        i3 = ((iM2566 ^ i8) * 7161) ^ 37152638;
                        i4 = -838973558;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case -535908761:
                case 1869077963:
                    c21042 = c21042;
                    b = b;
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("᩸᩷") ^ i8;
                        i3 = ((iM2566 ^ i7) * 29609) ^ (-1999646654);
                        i4 = -269587431;
                    } else {
                        iM2566 = C2105.m6981("۟ۖ") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-6323)) ^ 76243302;
                        i4 = 1161248808;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case -473081213:
                case 1201381292:
                    b = b;
                    num2 = (Integer) C0964.m3410(map, new C23657(c21042));
                    if (num2 != null) {
                        iM2566 = (C0630.m2566("ܳ᩷") + i8) * (-97);
                        c21042 = c21042;
                        i3 = ((iM2566 ^ i7) * (-3573)) ^ (-1790133514);
                        i4 = -256526242;
                    } else {
                        c21042 = c21042;
                        iM2566 = (C2105.m6981("۟ۢ") ^ i8) * (-45);
                        i3 = ((iM2566 ^ i7) * 25373) ^ 2043402692;
                        i4 = 736178196;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case -472173850:
                case 529175421:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C2105.m6981("֨ۡ") ^ i8;
                        i = ((iM6981 ^ i7) * 8483) ^ (-1674047177);
                        i2 = -486680397;
                    } else {
                        iM6981 = C2105.m6981("ۙ᩷") ^ i7;
                        i = ((iM6981 ^ i8) * (-12515)) ^ 1325414067;
                        i2 = -1249108742;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -326437186:
                case 308315839:
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C0630.m2566("ۗ۫") + i8) * (-115);
                        i = ((iM6981 ^ i7) * 16459) ^ 1563069248;
                        i2 = -688419749;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        c21042 = c21042;
                        b = b;
                        iM2566 = C2105.m6981("ܳ۠") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-19627)) ^ (-1267799894);
                        i4 = 1440850861;
                        b = b;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        c21042 = c21042;
                    }
                    break;
                case -214088568:
                case -160841890:
                    c21042 = c21042;
                    b = b;
                    if (C3245.f10203 <= 0) {
                        iM2566 = (i8 - C0630.m2566("֫᩶")) * 115;
                        i3 = ((iM2566 ^ i7) * (-2075)) ^ 1628885542;
                        i4 = 1285462188;
                    } else {
                        iM2566 = (C0630.m2566("ۙ᩶") ^ i8) * (-71);
                        i3 = ((iM2566 ^ i7) * (-26305)) ^ (-495994444);
                        i4 = -1172975436;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case -169769611:
                case 204682495:
                    if (!c17513.m40923(i11, i12)) {
                        c21042 = c21042;
                        b = b;
                        iM2566 = (i7 - C0630.m2566("۟ۘ")) * (-45);
                        i3 = ((iM2566 ^ i8) * (-12945)) ^ 1186015207;
                        i4 = 401965028;
                        b = b;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        c21042 = c21042;
                    } else {
                        iM6981 = (i7 - C2105.m6981("ܿۜ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM6981 ^ i8) * (-9891)) ^ (-653079586);
                        i2 = 927507726;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    }
                    break;
                case -136643236:
                case 1411789580:
                    dataOutputStream.writeByte(4);
                    C1420.m4914(dataOutputStream, C0050.m942(num));
                    C1420.m4914(dataOutputStream, i11);
                    C3245.m9922(dataOutputStream, i12);
                    if (c17513 == null) {
                        iM6981 = C0630.m2566("ۧ᩺") ^ i7;
                        i = ((iM6981 ^ i8) * (-21871)) ^ 161791207;
                        i2 = 1358055304;
                    } else {
                        iM6981 = C2105.m6981("᩹ܺ") ^ i8;
                        i = ((iM6981 ^ i7) * 8977) ^ 40887193;
                        i2 = 1894389118;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -72366701:
                case 1068527017:
                    c21042 = c21042;
                    b = b;
                    if (C1047.m3598(c9047)) {
                        iM2566 = C2105.m6981("᩶֨") ^ i7;
                        i3 = ((iM2566 ^ i8) * 3247) ^ 249209939;
                        i4 = 290690562;
                    } else {
                        iM2566 = C2105.m6981("ܽ᩺") ^ i7;
                        i3 = ((iM2566 ^ i8) * 27685) ^ (-1424087506);
                        i4 = -1170115636;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case -43333511:
                case 162146500:
                    c21042 = c21042;
                    byte b2 = ((C20130) interfaceC18884).f65168;
                    if (c17513 != null) {
                        int iM6984 = (i7 - C2105.m6981("ۧ᩸")) * 51;
                        i9 = ((iM6984 ^ i8) * (-9215)) ^ (-180029358);
                        b = b2;
                        i10 = iM6984 ^ (-638414483);
                    } else {
                        b = b2;
                        iM2566 = (i7 - C0630.m2566("۟ۘ")) * (-45);
                        i3 = ((iM2566 ^ i8) * (-12945)) ^ 1186015207;
                        i4 = 401965028;
                        b = b;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                    }
                    c21042 = c21042;
                    break;
                case -17610882:
                case 991958697:
                    dataOutputStream.writeByte(3);
                    dataOutputStream.writeByte(b);
                    C3245.m9922(dataOutputStream, i12);
                    return;
                case 27172192:
                case 126860992:
                    c21042 = c21042;
                    b = b;
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("᩸᩷") ^ i8;
                        i3 = ((iM2566 ^ i7) * 29609) ^ (-1999646654);
                        i4 = -269587431;
                    } else {
                        iM2566 = (C0630.m2566("֨ۗ") ^ i8) * 39;
                        i3 = ((iM2566 ^ i7) * (-21637)) ^ 627105891;
                        i4 = 802170254;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case 59263644:
                case 1045704364:
                    if (RunnableC3474.f10992 <= 0) {
                        c21042 = c21042;
                        b = b;
                        iM2566 = (i7 - C2105.m6981("ۧۛ")) * 57;
                        i3 = ((iM2566 ^ i8) * 13007) ^ (-1516974576);
                        i4 = 1564508590;
                        b = b;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        c21042 = c21042;
                    }
                    c21042 = c21042;
                    b = b;
                    iM2566 = C2105.m6981("ܳ۠") ^ i7;
                    i3 = ((iM2566 ^ i8) * (-19627)) ^ (-1267799894);
                    i4 = 1440850861;
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case 78965620:
                case 2075499482:
                    dataOutputStream.writeByte(5);
                    dataOutputStream.writeByte(b);
                    C3245.m9922(dataOutputStream, i12);
                    c17513.m40918(dataOutputStream, i11, i12, identityHashMap);
                    return;
                case 208572558:
                case 339448378:
                    c21042 = c21042;
                    b = b;
                    if (interfaceC18884 instanceof C6018) {
                        iM2566 = (C2105.m6981("ۜᩳ") ^ i8) * (-113);
                        i3 = ((iM2566 ^ i7) * (-32671)) ^ 491364146;
                        i4 = 1595061206;
                    } else {
                        iM2566 = C0630.m2566("ۧᩳ") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-2221)) ^ (-844654772);
                        i4 = 384790648;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case 573351762:
                case 1235211673:
                    throw new IOException(C4117.m12355(f56533, SecP521R1Field.P16, 34, i14));
                case 612379048:
                case 1331909510:
                    m42318(dataOutputStream, c9047.f27426, interfaceC18883, identityHashMap, identityHashMap2, map);
                    m42318(dataOutputStream, c9047.f27430, interfaceC18883, identityHashMap, identityHashMap2, map);
                    return;
                case 635597299:
                case 870322213:
                    num = (Integer) identityHashMap2.get((C6018) interfaceC18884);
                    if (num != null) {
                        iM6982 = (C2105.m6981("᩷۠") ^ i8) * (-125);
                        i5 = ((iM6982 ^ i7) * (-18349)) ^ (-86009110);
                        i6 = 1875500757;
                    } else {
                        iM6982 = (i7 - C2105.m6981("᩸ۙ")) * 41;
                        i5 = ((iM6982 ^ i8) * 29357) ^ 1418796215;
                        i6 = 1614600436;
                    }
                    i10 = iM6982 ^ i6;
                    i9 = i5;
                    b = b;
                    break;
                case 648518074:
                case 999003122:
                    c21042 = c21042;
                    b = b;
                    if (C1420.f5096 <= 0) {
                        iM2566 = (i7 - C2105.m6981("ۧۛ")) * 57;
                        i3 = ((iM2566 ^ i8) * 13007) ^ (-1516974576);
                        i4 = 1564508590;
                    } else {
                        iM2566 = C2105.m6981("ۢۤ") ^ i7;
                        i3 = ((iM2566 ^ i8) * 16589) ^ 396081797;
                        i4 = 55294347;
                    }
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case 896578373:
                case 1891567378:
                    i14 = 54101;
                    iM2566 = (C0630.m2566("ۙۢ") + i8) * 15;
                    i3 = ((iM2566 ^ i7) * 3485) ^ (-47137298);
                    i4 = -1621942955;
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case 1020039882:
                case 2056062989:
                    c17513.m40918(dataOutputStream, i11, i12, identityHashMap);
                    return;
                case 1085155539:
                case 1617194583:
                    if (C3537.f11231 >= 0) {
                        c21042 = c21042;
                        b = b;
                        iM2566 = C2105.m6981("ܳ۠") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-19627)) ^ (-1267799894);
                        i4 = 1440850861;
                        b = b;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        c21042 = c21042;
                    } else {
                        iM6981 = C2105.m6981("֨ۡ") ^ i8;
                        i = ((iM6981 ^ i7) * 8483) ^ (-1674047177);
                        i2 = -486680397;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    }
                    break;
                case 1481422662:
                case 1537098439:
                    break;
                case 1603064520:
                case 1978978032:
                    i14 = 31536;
                    iM2566 = (C0630.m2566("ۙۢ") + i8) * 15;
                    i3 = ((iM2566 ^ i7) * 3485) ^ (-47137298);
                    i4 = -1621942955;
                    b = b;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    c21042 = c21042;
                    break;
                case 1946282309:
                case 2036017985:
                    C7106.m19120();
                    if (C0483.f2088 >= 0) {
                        iM6981 = C0630.m2566("ۛ֫") ^ i7;
                        i = ((iM6981 ^ i8) * (-25767)) ^ (-1910568732);
                        i2 = -1363393952;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        c21042 = c21042;
                        b = b;
                        iM2566 = C0630.m2566("᩸᩷") ^ i8;
                        i3 = ((iM2566 ^ i7) * 29609) ^ (-1999646654);
                        i4 = -269587431;
                        b = b;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        c21042 = c21042;
                    }
                    break;
                case 2016835724:
                case 2064029837:
                    dataOutputStream.writeByte(2);
                    C1420.m4914(dataOutputStream, C0050.m942(num2));
                    return;
                default:
                    C3245.m9922(dataOutputStream, i13);
                    return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x046f A[PHI: r9 r10 r17
      0x046f: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:123:0x046d, B:111:0x03fa, B:42:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x046f: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:123:0x046d, B:111:0x03fa, B:42:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x046f: PHI (r17v49 l.᩻ۧܳ) = (r17v20 l.᩻ۧܳ), (r17v23 l.᩻ۧܳ), (r17v50 l.᩻ۧܳ) binds: [B:123:0x046d, B:111:0x03fa, B:42:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x049f A[PHI: r17 r18
      0x049f: PHI (r17v54 l.᩻ۧܳ) = (r17v19 l.᩻ۧܳ), (r17v22 l.᩻ۧܳ), (r17v57 l.᩻ۧܳ) binds: [B:127:0x049d, B:115:0x041c, B:24:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x049f: PHI (r18v5 short[]) = (r18v3 short[]), (r18v4 short[]), (r18v3 short[]) binds: [B:127:0x049d, B:115:0x041c, B:24:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:136:0x04ee A[PHI: r17
      0x04ee: PHI (r17v17 l.᩻ۧܳ) = (r17v8 l.᩻ۧܳ), (r17v16 l.᩻ۧܳ), (r17v18 l.᩻ۧܳ) binds: [B:17:0x00a5, B:135:0x04ec, B:131:0x04cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x02f9 A[PHI: r17
      0x02f9: PHI (r17v32 l.᩻ۧܳ) = (r17v30 l.᩻ۧܳ), (r17v33 l.᩻ۧܳ) binds: [B:90:0x02e3, B:82:0x02ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x032d A[PHI: r17
      0x032d: PHI (r17v37 l.᩻ۧܳ) = (r17v29 l.᩻ۧܳ), (r17v33 l.᩻ۧܳ), (r17v38 l.᩻ۧܳ) binds: [B:96:0x032b, B:82:0x02ab, B:204:0x032d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b0, code lost:
    
        if (l.C2105.f7037 == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0107, code lost:
    
        if (l.C3019.f9544 >= 0) goto L12;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m42325(C9047 c9047, InterfaceC18883 interfaceC18883, HashMap map, ArrayList arrayList) throws IOException {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        int iM2567;
        int i5;
        int i6;
        C23657 c23657;
        int iM2568;
        int i7;
        int i8;
        HashMap map2 = map;
        int i9 = RunnableC0588.f2309;
        int i10 = C22628.f73083;
        int iM6982 = C2105.m6981("ᩴۛ") ^ i10;
        int i11 = ((iM6982 ^ i9) * 32347) ^ (-129018012);
        short[] sArr = null;
        int i12 = iM6982 ^ (-676386415);
        short s = 0;
        int i13 = 0;
        int i14 = 0;
        short s2 = 0;
        int i15 = 0;
        int i16 = -1075195129;
        C23657 c23658 = null;
        InterfaceC18883 interfaceC18884 = null;
        C21042 c21042 = null;
        C9047 c9048 = null;
        C9047 c9049 = null;
        ArrayDeque arrayDeque = null;
        while (true) {
            i16 = i12 ^ (i11 & (((i16 ^ i9) * (-6309)) >> 31));
            switch (i16) {
                case -2139555387:
                case -355036492:
                    c23658 = c23658;
                    C1504.m5174(arrayDeque, c9048);
                    c9048 = c9048.f27426;
                    iM6981 = (C0630.m2566("ۛۜ") ^ i9) * (-83);
                    i3 = ((iM6981 ^ i10) * (-2347)) ^ 1242906783;
                    i4 = -397355606;
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -2130994501:
                case 1859478158:
                    short[] sArr2 = f56533;
                    c23658 = c23658;
                    if (C3245.m9925() == 0) {
                        throw new IOException(C0050.m948(sArr2, 647, 33, i15));
                    }
                    iM6981 = C2105.m6981("ܺ᩹") ^ i10;
                    i3 = ((iM6981 ^ i9) * (-11179)) ^ 2060857529;
                    i4 = -1829484507;
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                    break;
                case -2052513495:
                case -651245899:
                    C3911.m11924();
                    if (C4117.f13076 <= 0) {
                        iM2566 = (C0630.m2566("ۧᩳ") ^ i10) * 39;
                        i = ((iM2566 ^ i9) * (-23019)) ^ 950141630;
                        i2 = -34363739;
                        i12 = iM2566 ^ i2;
                        i11 = i;
                    } else {
                        c23658 = c23658;
                        iM6981 = (C0630.m2566("۟᩻") ^ i9) * 27;
                        i3 = ((iM6981 ^ i10) * (-7053)) ^ (-751829734);
                        i4 = 1157041975;
                        i11 = i3;
                        c23658 = c23658;
                        i12 = iM6981 ^ i4;
                        map2 = map;
                    }
                    break;
                case -1972615397:
                case -610987035:
                    c23658 = c23658;
                    if (C7106.f21815 != 0) {
                        iM6981 = (C0630.m2566("ۚܰ") + i9) * 51;
                        i3 = ((iM6981 ^ i10) * 20151) ^ 1820797773;
                        i4 = 397765971;
                    } else {
                        iM6981 = (i10 - C0630.m2566("ܽ᩺")) * (-117);
                        i3 = ((iM6981 ^ i9) * 25957) ^ (-619653116);
                        i4 = 1429651145;
                    }
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -1936696783:
                case 381433121:
                    c23658 = c23658;
                    c21042 = c9048.f27427;
                    interfaceC18884 = c21042.f67896;
                    if (interfaceC18884 == interfaceC18883) {
                        c23658 = c23658;
                        int iM6983 = (C2105.m6981("ܳۗ") ^ i10) * (-47);
                        i12 = iM6983 ^ 133316303;
                        i11 = ((iM6983 ^ i9) * 18385) ^ (-670612380);
                        map2 = map;
                    } else {
                        iM2567 = C0630.m2566("ۨ۠") ^ i10;
                        i5 = ((iM2567 ^ i9) * 28783) ^ (-1125660113);
                        i6 = 923280821;
                        i11 = i5;
                        c23657 = c23658;
                        i12 = iM2567 ^ i6;
                        c23658 = c23657;
                    }
                    break;
                case -1933590316:
                case 1308202288:
                    c23658 = c23658;
                    if (C3432.m10481(arrayList) < 1048576) {
                        iM2568 = (i10 - C2105.m6981("ۢ֨")) * 25;
                        i7 = ((iM2568 ^ i9) * 5909) ^ (-1333805951);
                        i8 = 1819154219;
                    } else {
                        iM2568 = C2105.m6981("ܿۡ") ^ i10;
                        i7 = ((iM2568 ^ i9) * 25281) ^ 399830395;
                        i8 = -1256686630;
                    }
                    c23657 = c23658;
                    i12 = iM2568 ^ i8;
                    i11 = i7;
                    c23658 = c23657;
                    break;
                case -1928664069:
                case -491167305:
                    c23658 = c23658;
                    s = sArr[646];
                    i13 = s * s;
                    if (RunnableC1108.f4040) {
                        iM6981 = C2105.m6981("᩵ᩴ") ^ i9;
                        i3 = ((iM6981 ^ i10) * (-10907)) ^ (-1515575927);
                        i4 = 1731092137;
                    } else {
                        iM6981 = C2105.m6981("ܺ᩹") ^ i10;
                        i3 = ((iM6981 ^ i9) * (-11179)) ^ 2060857529;
                        i4 = -1829484507;
                    }
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -1864686156:
                case -1739723944:
                    i15 = 32747;
                    iM6981 = C2105.m6981("᩷ۤ") ^ i10;
                    i3 = ((iM6981 ^ i9) * (-11571)) ^ 1304100175;
                    i4 = 242460801;
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -1862587251:
                case 49020846:
                    c23658 = c23658;
                    if (!(interfaceC18884 instanceof C20130)) {
                        iM2568 = (i10 - C0630.m2566("ۙۢ")) * (-63);
                        i7 = ((iM2568 ^ i9) * (-9339)) ^ 376707787;
                        i8 = 1800174759;
                        c23657 = c23658;
                        i12 = iM2568 ^ i8;
                        i11 = i7;
                        c23658 = c23657;
                    } else {
                        c23658 = c23658;
                        int iM6984 = (C2105.m6981("ܳۗ") ^ i10) * (-47);
                        i12 = iM6984 ^ 133316303;
                        i11 = ((iM6984 ^ i9) * 18385) ^ (-670612380);
                        map2 = map;
                    }
                    break;
                case -1626679064:
                case 2016746397:
                    c23658 = c23658;
                    if (C0714.m2812(arrayDeque)) {
                        iM6981 = C2105.m6981("֡᩸") ^ i10;
                        i3 = ((iM6981 ^ i9) * 14151) ^ (-1530872744);
                        i4 = 237517686;
                    } else {
                        c9048 = c9049;
                        iM6981 = (C0630.m2566("ۛۜ") ^ i9) * (-83);
                        i3 = ((iM6981 ^ i10) * (-2347)) ^ 1242906783;
                        i4 = -397355606;
                    }
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -1587682134:
                case 2039335286:
                    C4117.m12364();
                    C1420.m4913();
                    return;
                case -1552464723:
                case 999527727:
                    c23658 = c23658;
                    if (c9047 == null) {
                        iM6981 = C2105.m6981("֡᩸") ^ i10;
                        i3 = ((iM6981 ^ i9) * 14151) ^ (-1530872744);
                        i4 = 237517686;
                    } else {
                        iM6981 = C0630.m2566("᩸۠") ^ i9;
                        i3 = ((iM6981 ^ i10) * (-17671)) ^ (-1945957282);
                        i4 = 33263576;
                    }
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -1528659597:
                case 338799855:
                    C1005.m3501();
                    C1773.m5908();
                    c23658 = c23658;
                    iM6981 = (C0630.m2566("۟᩻") ^ i9) * 27;
                    i3 = ((iM6981 ^ i10) * (-7053)) ^ (-751829734);
                    i4 = 1157041975;
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -1491618631:
                case -559034385:
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = (C2105.m6981("ۡۛ") ^ i9) * (-119);
                        i = ((iM2566 ^ i10) * 15765) ^ (-1034146422);
                        i2 = -1251172248;
                        i12 = iM2566 ^ i2;
                        i11 = i;
                    } else {
                        c23658 = c23658;
                        iM6981 = C2105.m6981("֡ܽ") ^ i10;
                        i3 = ((iM6981 ^ i9) * (-19041)) ^ 351393916;
                        i4 = -615569865;
                        i11 = i3;
                        c23658 = c23658;
                        i12 = iM6981 ^ i4;
                        map2 = map;
                    }
                    break;
                case -1477431266:
                case 2050051644:
                    c23658 = c23658;
                    if (C1294.f4556 >= 0) {
                        iM6981 = C2105.m6981("ܺ᩹") ^ i10;
                        i3 = ((iM6981 ^ i9) * (-11179)) ^ 2060857529;
                        i4 = -1829484507;
                    } else {
                        iM6981 = C0630.m2566("ܿ᩶") ^ i10;
                        i3 = ((iM6981 ^ i9) * 5145) ^ (-1876140157);
                        i4 = 1970682691;
                    }
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -1298670679:
                case 1112613404:
                    c23658 = c23658;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C0630.m2566("ۚܰ") + i9) * 51;
                        i3 = ((iM6981 ^ i10) * 20151) ^ 1820797773;
                        i4 = 397765971;
                    } else {
                        iM6981 = (C0630.m2566("۠ۘ") + i9) * (-117);
                        i3 = ((iM6981 ^ i10) * 3017) ^ (-1560291904);
                        i4 = 352574390;
                    }
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -1218906187:
                case 1783267804:
                    c9049 = ((C9047) arrayDeque.pop()).f27430;
                    iM6981 = (i10 - C2105.m6981("ۜܿ")) * (-105);
                    i3 = ((iM6981 ^ i9) * (-3051)) ^ (-1557951424);
                    i4 = 412706830;
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -1159019540:
                case 2084931941:
                    C1005.m3501();
                    break;
                case -1156670879:
                case 1127695708:
                    if (!C0382.m1848()) {
                        c23658 = c23658;
                        iM6981 = (C2105.m6981("ۢۡ") ^ i9) * 59;
                        i3 = ((iM6981 ^ i10) * (-22907)) ^ (-1757385213);
                        i4 = -670846141;
                        i11 = i3;
                        c23658 = c23658;
                        i12 = iM6981 ^ i4;
                        map2 = map;
                    } else {
                        iM2566 = (C2105.m6981("᩷᩶") + i10) * (-95);
                        i = ((iM2566 ^ i9) * 21951) ^ (-717906900);
                        i2 = 802010108;
                        i12 = iM2566 ^ i2;
                        i11 = i;
                    }
                    break;
                case -1037241032:
                case -498133611:
                    c23658 = c23658;
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C2105.m6981("ۢۡ") ^ i9) * 59;
                        i3 = ((iM6981 ^ i10) * (-22907)) ^ (-1757385213);
                        i4 = -670846141;
                    } else {
                        iM6981 = C2105.m6981("۟ۤ") ^ i10;
                        i3 = ((iM6981 ^ i9) * 18237) ^ 1134287088;
                        i4 = 2008219418;
                    }
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -934729364:
                case -281970804:
                    C1420.m4913();
                    if (!C1916.f6442) {
                        iM2566 = (C0630.m2566("۫ۡ") ^ i9) * 71;
                        i = ((iM2566 ^ i10) * 23665) ^ (-450903535);
                        i2 = 262678894;
                        i12 = iM2566 ^ i2;
                        i11 = i;
                    } else {
                        c23658 = c23658;
                        iM6981 = (C0630.m2566("ۚܰ") + i9) * 51;
                        i3 = ((iM6981 ^ i10) * 20151) ^ 1820797773;
                        i4 = 397765971;
                        i11 = i3;
                        c23658 = c23658;
                        i12 = iM6981 ^ i4;
                        map2 = map;
                    }
                    break;
                case -890096592:
                case 1817604051:
                    c23658 = c23658;
                    if (!RunnableC1937.m6381(c9048)) {
                        iM2567 = C0630.m2566("ᩳ۫") ^ i10;
                        i5 = ((iM2567 ^ i9) * (-23193)) ^ 168329213;
                        i6 = -550064497;
                        i11 = i5;
                        c23657 = c23658;
                        i12 = iM2567 ^ i6;
                        c23658 = c23657;
                    } else {
                        iM6981 = (C0630.m2566("ۙᩳ") + i10) * (-71);
                        i3 = ((iM6981 ^ i9) * 10201) ^ 869631235;
                        i4 = -1026281149;
                        i11 = i3;
                        c23658 = c23658;
                        i12 = iM6981 ^ i4;
                        map2 = map;
                    }
                    break;
                case -820850634:
                case 189073919:
                    c23658 = c23658;
                    if (c9048 == null) {
                        c23658 = c23658;
                        int iM6985 = (C2105.m6981("ܳۗ") ^ i10) * (-47);
                        i12 = iM6985 ^ 133316303;
                        i11 = ((iM6985 ^ i9) * 18385) ^ (-670612380);
                        map2 = map;
                    } else {
                        iM2567 = (i9 - C0630.m2566("ܰۙ")) * 3;
                        i5 = ((iM2567 ^ i10) * (-17533)) ^ (-1717685949);
                        i6 = -615679181;
                        i11 = i5;
                        c23657 = c23658;
                        i12 = iM2567 ^ i6;
                        c23658 = c23657;
                    }
                    break;
                case -806232323:
                case 796417982:
                    C1128.m3856(map2, c23658, C3245.m9931(C0382.m1847(arrayList)));
                    C7106.m19117(arrayList, c21042);
                    int iM6986 = (C2105.m6981("ܳۗ") ^ i10) * (-47);
                    i12 = iM6986 ^ 133316303;
                    i11 = ((iM6986 ^ i9) * 18385) ^ (-670612380);
                    map2 = map;
                    break;
                case -800350466:
                case 1001235137:
                    break;
                case -716541170:
                case 176570251:
                    c23658 = c23658;
                    if (C0714.f2697 >= 0) {
                        iM6981 = C0630.m2566("ᩳ᩺") ^ i10;
                        i3 = ((iM6981 ^ i9) * 9541) ^ (-1253130574);
                        i4 = -722225293;
                    } else {
                        iM6981 = C0630.m2566("᩵᩵") ^ i9;
                        i3 = ((iM6981 ^ i10) * 8837) ^ (-988636226);
                        i4 = -473301197;
                    }
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -707865281:
                case -702856803:
                    c23658 = c23658;
                    if (!(interfaceC18884 instanceof C6018)) {
                        iM2568 = C2105.m6981("᩹ۗ") ^ i9;
                        i7 = ((iM2568 ^ i10) * (-20181)) ^ (-27389220);
                        i8 = 1865817188;
                        c23657 = c23658;
                        i12 = iM2568 ^ i8;
                        i11 = i7;
                        c23658 = c23657;
                    } else {
                        c23658 = c23658;
                        int iM6987 = (C2105.m6981("ܳۗ") ^ i10) * (-47);
                        i12 = iM6987 ^ 133316303;
                        i11 = ((iM6987 ^ i9) * 18385) ^ (-670612380);
                        map2 = map;
                    }
                    break;
                case -518782985:
                case 816633042:
                    ServiceConnectionC3453.m10564();
                    if (C0483.f2088 < 0) {
                        iM2566 = (C0630.m2566("۫ۡ") ^ i9) * 71;
                        i = ((iM2566 ^ i10) * 23665) ^ (-450903535);
                        i2 = 262678894;
                        i12 = iM2566 ^ i2;
                        i11 = i;
                    } else {
                        c23658 = c23658;
                        iM6981 = (C0630.m2566("۟᩻") ^ i9) * 27;
                        i3 = ((iM6981 ^ i10) * (-7053)) ^ (-751829734);
                        i4 = 1157041975;
                        i11 = i3;
                        c23658 = c23658;
                        i12 = iM6981 ^ i4;
                        map2 = map;
                    }
                    break;
                case -459747196:
                case 484150104:
                    c23658 = c23658;
                    if (!C2167.m7162(arrayDeque)) {
                        iM2567 = (C2105.m6981("ۜܶ") + i9) * (-85);
                        i5 = ((iM2567 ^ i10) * 14209) ^ (-531358967);
                        i6 = -1253991841;
                        i11 = i5;
                        c23657 = c23658;
                        i12 = iM2567 ^ i6;
                        c23658 = c23657;
                    } else {
                        iM6981 = C2105.m6981("֡᩸") ^ i10;
                        i3 = ((iM6981 ^ i9) * 14151) ^ (-1530872744);
                        i4 = 237517686;
                        i11 = i3;
                        c23658 = c23658;
                        i12 = iM6981 ^ i4;
                        map2 = map;
                    }
                    break;
                case -436595858:
                case 1906013206:
                    c23658 = c23658;
                    int i17 = s + s2;
                    if (i14 - (i17 * i17) < 0) {
                        iM6981 = (C0630.m2566("᩻᩻") + i9) * 47;
                        i3 = ((iM6981 ^ i10) * 26305) ^ 876074985;
                        i4 = -1189215012;
                    } else {
                        iM6981 = (C0630.m2566("ܳ᩺") ^ i10) * (-35);
                        i3 = ((iM6981 ^ i9) * (-9413)) ^ 241102805;
                        i4 = 966390508;
                    }
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -290679448:
                case 1053832196:
                    C4616.m13552();
                    if (C22628.m50615() == 0) {
                        c23658 = c23658;
                        iM6981 = C0630.m2566("ᩳ᩺") ^ i10;
                        i3 = ((iM6981 ^ i9) * 9541) ^ (-1253130574);
                        i4 = -722225293;
                        i11 = i3;
                        c23658 = c23658;
                        i12 = iM6981 ^ i4;
                        map2 = map;
                    }
                    c23658 = c23658;
                    iM6981 = (C2105.m6981("ۢۡ") ^ i9) * 59;
                    i3 = ((iM6981 ^ i10) * (-22907)) ^ (-1757385213);
                    i4 = -670846141;
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -154216267:
                case 1596783119:
                    c23658 = new C23657(c21042);
                    if (!C1128.m3842(map2, c23658)) {
                        iM2566 = (C0630.m2566("ۢܳ") ^ i9) * (-127);
                        i = ((iM2566 ^ i10) * 10379) ^ 1944174619;
                        i2 = 282477802;
                        i12 = iM2566 ^ i2;
                        i11 = i;
                    } else {
                        int iM6988 = (C2105.m6981("ܳۗ") ^ i10) * (-47);
                        i12 = iM6988 ^ 133316303;
                        i11 = ((iM6988 ^ i9) * 18385) ^ (-670612380);
                        map2 = map;
                    }
                    break;
                case -71056228:
                case 730007098:
                    c23658 = c23658;
                    if (c9048 != null) {
                        iM6981 = C0630.m2566("ۗܽ") ^ i9;
                        i3 = ((iM6981 ^ i10) * (-18513)) ^ 1684943157;
                        i4 = -173192390;
                    } else {
                        iM6981 = (C0630.m2566("ۙᩳ") + i10) * (-71);
                        i3 = ((iM6981 ^ i9) * 10201) ^ 869631235;
                        i4 = -1026281149;
                    }
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -54425827:
                case 1918745174:
                    i15 = 27866;
                    iM6981 = C2105.m6981("᩷ۤ") ^ i10;
                    i3 = ((iM6981 ^ i9) * (-11571)) ^ 1304100175;
                    i4 = 242460801;
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -22727410:
                case 1111923989:
                    c23658 = c23658;
                    if (c9049 == null) {
                        iM6981 = C0630.m2566("᩸ۙ") ^ i9;
                        i3 = ((iM6981 ^ i10) * (-1267)) ^ (-710789060);
                        i4 = 116530214;
                    } else {
                        c9048 = c9049;
                        iM6981 = (C0630.m2566("ۛۜ") ^ i9) * (-83);
                        i3 = ((iM6981 ^ i10) * (-2347)) ^ 1242906783;
                        i4 = -397355606;
                    }
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case -19468391:
                case 1685315375:
                    c23658 = c23658;
                    int i18 = 175561 + i13;
                    i14 = i18 + i18;
                    s2 = 419;
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C0630.m2566("۟᩻") ^ i9) * 27;
                        i3 = ((iM6981 ^ i10) * (-7053)) ^ (-751829734);
                        i4 = 1157041975;
                    } else {
                        iM6981 = (C0630.m2566("ۜ᩷") + i9) * 101;
                        i3 = ((iM6981 ^ i10) * (-22005)) ^ 635869443;
                        i4 = -1320074844;
                    }
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case 339275824:
                case 584968937:
                    c23658 = c23658;
                    sArr = f56533;
                    if (C1504.m5179()) {
                        iM6981 = (i10 - C0630.m2566("ܽ᩹")) * (-103);
                        i3 = ((iM6981 ^ i9) * 1881) ^ (-954361652);
                        i4 = -553139500;
                    } else {
                        iM6981 = C0630.m2566("ᩳ᩺") ^ i10;
                        i3 = ((iM6981 ^ i9) * 9541) ^ (-1253130574);
                        i4 = -722225293;
                    }
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                case 1003222370:
                case 1919925991:
                    return;
                case 1083557559:
                case 2118045655:
                    c23658 = c23658;
                    if (C7811.f24123 >= 0) {
                        iM6981 = C2105.m6981("֡ܽ") ^ i10;
                        i3 = ((iM6981 ^ i9) * (-19041)) ^ 351393916;
                        i4 = -615569865;
                    } else {
                        iM6981 = C0630.m2566("᩹᩵") ^ i9;
                        i3 = ((iM6981 ^ i10) * 12911) ^ 1065006697;
                        i4 = -1916780413;
                    }
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
                default:
                    c9049 = c9047;
                    arrayDeque = new ArrayDeque();
                    iM6981 = (i10 - C2105.m6981("ۜܿ")) * (-105);
                    i3 = ((iM6981 ^ i9) * (-3051)) ^ (-1557951424);
                    i4 = 412706830;
                    i11 = i3;
                    c23658 = c23658;
                    i12 = iM6981 ^ i4;
                    map2 = map;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42332(InterfaceC18883[] interfaceC18883Arr) {
        int length = 0;
        int i = 0;
        InterfaceC18883 interfaceC18883 = null;
        int i2 = -715632869;
        int i3 = ViewOnClickListenerC1958.f6529;
        int i4 = C3537.f11231;
        int iM6981 = (C2105.m6981("ۘܿ") ^ i4) * 77;
        int i5 = ((iM6981 ^ i3) * (-7167)) ^ 679070260;
        int i6 = -2088037059;
        while (true) {
            i2 = ((((i2 ^ i3) * 20663) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2009985130:
                case 43997344:
                    C0050.m940();
                    C1420.m4913();
                    break;
                case -1965152362:
                case 173578268:
                    interfaceC18883 = interfaceC18883Arr[i];
                    iM6981 = (i4 - C2105.m6981("۠۫")) * (-11);
                    i5 = ((iM6981 ^ i3) * (-22083)) ^ 1651164567;
                    i6 = -124920395;
                    break;
                case -1964398177:
                case 1632004184:
                    if (i < length) {
                        iM6981 = (i3 - C0630.m2566("᩵ܿ")) * (-69);
                        i5 = ((iM6981 ^ i4) * 5493) ^ (-269911181);
                        i6 = 1494964387;
                    } else {
                        iM6981 = C0630.m2566("ۙۛ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-10955)) ^ (-1659343239);
                        i6 = 78335675;
                    }
                    break;
                case -1896015685:
                case 1038749925:
                    if (C0630.m2564()) {
                        iM6981 = C2105.m6981("ۢۜ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 15713) ^ (-304139676);
                        i6 = 1263127324;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۜۤ")) * 53;
                        i5 = ((iM6981 ^ i4) * (-21881)) ^ (-1250275440);
                        i6 = 1468025057;
                    }
                    break;
                case -1754354252:
                case 716583742:
                    length = interfaceC18883Arr.length;
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("ۘ᩺") ^ i4;
                        i5 = ((iM6981 ^ i3) * 7739) ^ 1416699987;
                        i6 = -752436664;
                    } else {
                        iM6981 = C0630.m2566("ᩴܳ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-4331)) ^ 1829015572;
                        i6 = 19650041;
                    }
                    break;
                case -1695540372:
                case 437637359:
                    C0382.m1848();
                    ServiceConnectionC3453.m10564();
                    iM6981 = C0630.m2566("ۘ᩺") ^ i4;
                    i5 = ((iM6981 ^ i3) * 7739) ^ 1416699987;
                    i6 = -752436664;
                    break;
                case -1432473139:
                case 1846202452:
                    C3911.m11924();
                    if (!C2272.f7362) {
                        iM6981 = C2105.m6981("᩸ۖ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-10625)) ^ 329459972;
                        i6 = 1066804872;
                    } else {
                        iM6981 = C0630.m2566("ۘ᩺") ^ i4;
                        i5 = ((iM6981 ^ i3) * 7739) ^ 1416699987;
                        i6 = -752436664;
                    }
                    break;
                case -1100546203:
                case 510643774:
                    if (C22628.m50615() != 0) {
                        iM6981 = (C0630.m2566("۬ܽ") + i3) * q.h;
                        i5 = ((iM6981 ^ i4) * (-3557)) ^ 563593615;
                        i6 = -1085453275;
                    } else {
                        iM6981 = C2105.m6981("֫ܺ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-23439)) ^ 723704930;
                        i6 = -1952766774;
                    }
                    break;
                case -1067037311:
                case 616638399:
                    if (C3019.f9544 >= 0) {
                        iM6981 = (C0630.m2566("۬ܽ") + i3) * q.h;
                        i5 = ((iM6981 ^ i4) * (-3557)) ^ 563593615;
                        i6 = -1085453275;
                    } else {
                        iM6981 = C2105.m6981("ܳ᩷") ^ i4;
                        i5 = ((iM6981 ^ i3) * 15765) ^ 1490087364;
                        i6 = -189507104;
                    }
                    break;
                case -1046772786:
                case -430851628:
                    if (C0964.f3626 != 0) {
                        iM6981 = C2105.m6981("᩸ۖ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-10625)) ^ 329459972;
                        i6 = 1066804872;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ܿ֨")) * (-123);
                        i5 = ((iM6981 ^ i3) * 10651) ^ 1169692824;
                        i6 = -1300716226;
                    }
                    break;
                case -795745652:
                case 2135212274:
                    if (C21923.f70183 != 0) {
                        iM6981 = C0630.m2566("֫᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-8833)) ^ 594674437;
                        i6 = 1092683893;
                    } else {
                        iM6981 = C2105.m6981("ᩴܺ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-29441)) ^ (-582231394);
                        i6 = 1246712143;
                    }
                    break;
                case -720201261:
                case -7202303:
                    break;
                case -536413949:
                case 1263442111:
                    i++;
                    iM6981 = C0630.m2566("ۡۚ") ^ i3;
                    i5 = ((iM6981 ^ i4) * (-4419)) ^ 762782739;
                    i6 = -557133391;
                    break;
                case -451256699:
                case 169834615:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("ۘ᩺") ^ i4;
                        i5 = ((iM6981 ^ i3) * 7739) ^ 1416699987;
                        i6 = -752436664;
                    } else {
                        iM6981 = C2105.m6981("ۘ᩷") ^ i4;
                        i5 = ((iM6981 ^ i3) * 23355) ^ 1127300702;
                        i6 = -210656918;
                    }
                    break;
                case -418691969:
                case 1512218223:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C0630.m2566("۬ܽ") + i3) * q.h;
                        i5 = ((iM6981 ^ i4) * (-3557)) ^ 563593615;
                        i6 = -1085453275;
                    } else {
                        iM6981 = C0630.m2566("ۘ۟") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-4235)) ^ (-366897448);
                        i6 = -1783038722;
                    }
                    break;
                case -394037051:
                case -299101796:
                    if (C11340.f33930 >= 0) {
                        iM6981 = C0630.m2566("֫᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-8833)) ^ 594674437;
                        i6 = 1092683893;
                    } else {
                        iM6981 = C2105.m6981("ۢۜ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 15713) ^ (-304139676);
                        i6 = 1263127324;
                    }
                    break;
                case -175171193:
                case 621653006:
                    i = 0;
                    iM6981 = C0630.m2566("ۡۚ") ^ i3;
                    i5 = ((iM6981 ^ i4) * (-4419)) ^ 762782739;
                    i6 = -557133391;
                    break;
                case 93860094:
                case 501869029:
                    try {
                        C7106.m19116(interfaceC18883);
                        break;
                    } catch (IOException unused) {
                    }
                    iM6981 = (i3 - C0630.m2566("᩵֨")) * (-25);
                    i5 = ((iM6981 ^ i4) * (-4317)) ^ (-277378146);
                    i6 = -2086992765;
                    break;
                case 352478831:
                case 441823450:
                    if (C2958.f9394 < 0) {
                        iM6981 = C2105.m6981("ۢۜ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 15713) ^ (-304139676);
                        i6 = 1263127324;
                    } else {
                        iM6981 = C0630.m2566("ۘ᩺") ^ i4;
                        i5 = ((iM6981 ^ i3) * 7739) ^ 1416699987;
                        i6 = -752436664;
                    }
                    break;
                case 1018414298:
                case 1579831005:
                    if (C4117.m12364() != 0) {
                        iM6981 = (C0630.m2566("۬ܽ") + i3) * q.h;
                        i5 = ((iM6981 ^ i4) * (-3557)) ^ 563593615;
                        i6 = -1085453275;
                    } else {
                        iM6981 = C0630.m2566("᩶ۨ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-26497)) ^ 206756547;
                        i6 = 1581246322;
                    }
                    break;
                default:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (C0630.m2566("۬ܽ") + i3) * q.h;
                        i5 = ((iM6981 ^ i4) * (-3557)) ^ 563593615;
                        i6 = -1085453275;
                    } else {
                        iM6981 = (C2105.m6981("ۚۖ") + i3) * 51;
                        i5 = ((iM6981 ^ i4) * (-11467)) ^ 1778655105;
                        i6 = 52637288;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m42357(C9047 c9047, ArrayList arrayList) {
        IdentityHashMap identityHashMap = null;
        ArrayDeque arrayDeque = null;
        C9047 c9048 = null;
        C9047 c9049 = null;
        InterfaceC18883 interfaceC18883 = null;
        C6018 c6018 = null;
        int i = 2010974312;
        int i2 = C7811.f24123;
        int i3 = C3537.f11231;
        int iM6981 = (C2105.m6981("ܶۙ") ^ i3) * 23;
        int i4 = ((iM6981 ^ i2) * 13995) ^ (-582742892);
        int i5 = 87875011;
        while (true) {
            i = ((((i ^ i2) * 20869) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1977900742:
                case 1396179284:
                    C1916.m6308();
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("᩵۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 173) ^ 956347946;
                        i5 = 325507973;
                    } else {
                        iM6981 = C0630.m2566("᩸᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17867) ^ 2075413140;
                        i5 = -810189080;
                    }
                    break;
                case -1464337752:
                case 147996402:
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C2105.m6981("ۖۗ") ^ i2) * 49;
                        i4 = ((iM6981 ^ i3) * 15457) ^ (-79983358);
                        i5 = -2064799332;
                    } else {
                        iM6981 = C0630.m2566("ۖۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 15017) ^ 1962343137;
                        i5 = -699223855;
                    }
                    break;
                case -1431232847:
                case 1357090445:
                    C1916.m6307(arrayList, c6018);
                    iM6981 = C0630.m2566("᩸ۢ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 11139) ^ 1700350245;
                    i5 = 675864439;
                    break;
                case -1189417085:
                case -603673302:
                    c6018 = (C6018) interfaceC18883;
                    if (C0714.m2809(identityHashMap, c6018, Boolean.TRUE) == null) {
                        iM6981 = C0630.m2566("ۖۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 9667) ^ 500858024;
                        i5 = 457244967;
                    } else {
                        iM6981 = C0630.m2566("᩸ۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 11139) ^ 1700350245;
                        i5 = 675864439;
                    }
                    break;
                case -1098455596:
                case 1287407192:
                    identityHashMap = new IdentityHashMap();
                    if (C3911.f12484 >= 0) {
                        iM6981 = C2105.m6981("ۢۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-15205)) ^ (-937021550);
                        i5 = 905748840;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۗ۫")) * 47;
                        i4 = ((iM6981 ^ i3) * (-18327)) ^ (-1608726209);
                        i5 = -2019567551;
                    }
                    break;
                case -1025708860:
                case -377891616:
                    if (C3683.f11629 < 0) {
                        iM6981 = C0630.m2566("᩸᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17867) ^ 2075413140;
                        i5 = -810189080;
                    } else {
                        iM6981 = C2105.m6981("֨ܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32613) ^ 1160521074;
                        i5 = -2105143449;
                    }
                    break;
                case -853710168:
                case 665847445:
                    if (c9048 == null) {
                        iM6981 = C2105.m6981("۫᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-16881)) ^ (-341229348);
                        i5 = 124523443;
                    } else {
                        c9049 = c9048;
                        iM6981 = (i3 - C0630.m2566("ۗۤ")) * (-69);
                        i4 = ((iM6981 ^ i2) * (-10015)) ^ 1799037645;
                        i5 = -1924823144;
                    }
                    break;
                case -762784660:
                case -589228544:
                    if (c9047 == null) {
                        iM6981 = (C0630.m2566("ۧۤ") ^ i2) * (-47);
                        i4 = ((iM6981 ^ i3) * (-9709)) ^ 1086635738;
                        i5 = 1695953108;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩷ۨ")) * 3;
                        i4 = ((iM6981 ^ i2) * 17521) ^ 1734435168;
                        i5 = 966603955;
                    }
                    break;
                case -717963358:
                case 97184244:
                    arrayDeque = new ArrayDeque();
                    c9048 = c9047;
                    iM6981 = C2105.m6981("᩶᩵") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-3839)) ^ (-386239089);
                    i5 = -1773957779;
                    break;
                case -690622697:
                case -31362682:
                    if (!C2167.m7162(arrayDeque)) {
                        c9049 = c9048;
                        iM6981 = (i3 - C0630.m2566("ۗۤ")) * (-69);
                        i4 = ((iM6981 ^ i2) * (-10015)) ^ 1799037645;
                        i5 = -1924823144;
                    } else {
                        iM6981 = (C0630.m2566("ۧۤ") ^ i2) * (-47);
                        i4 = ((iM6981 ^ i3) * (-9709)) ^ 1086635738;
                        i5 = 1695953108;
                    }
                    break;
                case -565251228:
                case 838696046:
                    break;
                case -552434369:
                case 1180220448:
                    C3663.m11175(arrayDeque, c9049);
                    c9049 = c9049.f27426;
                    iM6981 = (i3 - C0630.m2566("ۗۤ")) * (-69);
                    i4 = ((iM6981 ^ i2) * (-10015)) ^ 1799037645;
                    i5 = -1924823144;
                    break;
                case -484435926:
                case 1230794559:
                    if (C7106.f21815 != 0) {
                        iM6981 = (C2105.m6981("ۖۗ") ^ i2) * 49;
                        i4 = ((iM6981 ^ i3) * 15457) ^ (-79983358);
                        i5 = -2064799332;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۙ۫")) * 19;
                        i4 = ((iM6981 ^ i2) * 9059) ^ (-1269624549);
                        i5 = 1168055146;
                    }
                    break;
                case -476779554:
                case 1595500091:
                    if (C3432.m10477() <= 0) {
                        iM6981 = C0630.m2566("ᩳ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14267)) ^ (-41927169);
                        i5 = -939456785;
                    } else {
                        iM6981 = C2105.m6981("ܳ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-855)) ^ (-1041100654);
                        i5 = -122924070;
                    }
                    break;
                case -465211114:
                case 119874311:
                    RunnableC1937.m6387();
                    if (C0237.f1507 == 0) {
                        iM6981 = C2105.m6981("֨ܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32613) ^ 1160521074;
                        i5 = -2105143449;
                    } else {
                        iM6981 = C0630.m2566("ᩳ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14267)) ^ (-41927169);
                        i5 = -939456785;
                    }
                    break;
                case -451379828:
                case 747887996:
                    if (C1711.f5919) {
                        iM6981 = C2105.m6981("۬ۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-7851)) ^ 1547942997;
                        i5 = -1595418783;
                    } else {
                        iM6981 = C0630.m2566("ۜ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29469)) ^ 883444568;
                        i5 = -435335884;
                    }
                    break;
                case -199281033:
                case 615666450:
                    if (c9049 != null) {
                        iM6981 = (i3 - C2105.m6981("ۢۜ")) * 75;
                        i4 = ((iM6981 ^ i2) * (-5531)) ^ (-253899998);
                        i5 = 528349789;
                    } else {
                        iM6981 = (C0630.m2566("᩻᩻") ^ i2) * 99;
                        i4 = ((iM6981 ^ i3) * (-12323)) ^ 1987980799;
                        i5 = -730787816;
                    }
                    break;
                case -156619208:
                case 858908491:
                    if (C2958.f9394 >= 0) {
                        iM6981 = C0630.m2566("ۜۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 17711) ^ (-1934442048);
                        i5 = -81255150;
                    } else {
                        iM6981 = C2105.m6981("ᩳۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 761) ^ (-1632937231);
                        i5 = 423888161;
                    }
                    break;
                case -112575003:
                case 714207965:
                    C4075.m12263();
                    C3911.m11924();
                    iM6981 = C0630.m2566("ᩳ۬") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-14267)) ^ (-41927169);
                    i5 = -939456785;
                    break;
                case -97865487:
                case 90144013:
                    if (c9049 != null) {
                        iM6981 = (C2105.m6981("ۘᩴ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM6981 ^ i2) * (-32095)) ^ 1525024062;
                        i5 = -926922937;
                    } else {
                        iM6981 = C0630.m2566("᩸ۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 11139) ^ 1700350245;
                        i5 = 675864439;
                    }
                    break;
                case 85386247:
                case 863403191:
                    if (C4159.m12565() >= 0) {
                        iM6981 = C2105.m6981("۬ۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-7851)) ^ 1547942997;
                        i5 = -1595418783;
                    } else {
                        iM6981 = C0630.m2566("ۜۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 17711) ^ (-1934442048);
                        i5 = -81255150;
                    }
                    break;
                case 126702589:
                case 853512784:
                    if (C0382.m1848()) {
                        iM6981 = (C2105.m6981("ۖۗ") ^ i2) * 49;
                        i4 = ((iM6981 ^ i3) * 15457) ^ (-79983358);
                        i5 = -2064799332;
                    } else {
                        iM6981 = (C0630.m2566("᩹᩻") ^ i3) * (-103);
                        i4 = ((iM6981 ^ i2) * (-6891)) ^ (-1634941442);
                        i5 = 2107247350;
                    }
                    break;
                case 132867664:
                case 1839559943:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("֨ܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32613) ^ 1160521074;
                        i5 = -2105143449;
                    } else {
                        iM6981 = (C0630.m2566("᩹ۛ") + i3) * (-59);
                        i4 = ((iM6981 ^ i2) * (-24477)) ^ 186550583;
                        i5 = -7428309;
                    }
                    break;
                case 206778078:
                case 660836093:
                    interfaceC18883 = c9049.f27427.f67896;
                    if (interfaceC18883 instanceof C6018) {
                        iM6981 = (C2105.m6981("۬ۛ") + i3) * 109;
                        i4 = ((iM6981 ^ i2) * (-27111)) ^ 1509116955;
                        i5 = -181244858;
                    } else {
                        iM6981 = C0630.m2566("᩸ۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 11139) ^ 1700350245;
                        i5 = 675864439;
                    }
                    break;
                case 250853820:
                case 1871441645:
                    if (RunnableC1937.m6381(c9049)) {
                        iM6981 = (C0630.m2566("᩻᩻") ^ i2) * 99;
                        i4 = ((iM6981 ^ i3) * (-12323)) ^ 1987980799;
                        i5 = -730787816;
                    } else {
                        iM6981 = C0630.m2566("֡ۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 13229) ^ 740561153;
                        i5 = -139932612;
                    }
                    break;
                case 286773086:
                case 1402858706:
                    if (C22628.f73083 > 0) {
                        iM6981 = C0630.m2566("ۜۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 17711) ^ (-1934442048);
                        i5 = -81255150;
                    } else {
                        iM6981 = C0630.m2566("ᩳ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14267)) ^ (-41927169);
                        i5 = -939456785;
                    }
                    break;
                case 431698044:
                case 1793480103:
                    C4263.m12819();
                    break;
                case 660234678:
                case 1476219446:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("ۜۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 17711) ^ (-1934442048);
                        i5 = -81255150;
                    } else {
                        iM6981 = (C2105.m6981("᩺ۖ") ^ i3) * (-109);
                        i4 = ((iM6981 ^ i2) * 29531) ^ 1998726356;
                        i5 = -2138579287;
                    }
                    break;
                case 1038387089:
                case 1117927380:
                    c9048 = ((C9047) arrayDeque.pop()).f27430;
                    iM6981 = C2105.m6981("᩶᩵") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-3839)) ^ (-386239089);
                    i5 = -1773957779;
                    break;
                case 1344985009:
                case 1444271319:
                    if (C2958.f9394 >= 0) {
                        iM6981 = C0630.m2566("᩵۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 173) ^ 956347946;
                        i5 = 325507973;
                    } else {
                        iM6981 = (C2105.m6981("۬ᩴ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM6981 ^ i3) * 1859) ^ 415578084;
                        i5 = -1613952460;
                    }
                    break;
                case 1951200116:
                case 2118579537:
                    if (C7106.f21815 != 0) {
                        iM6981 = C2105.m6981("ۢۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-15205)) ^ (-937021550);
                        i5 = 905748840;
                    } else {
                        iM6981 = C2105.m6981("۬ۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-7851)) ^ 1547942997;
                        i5 = -1595418783;
                    }
                    break;
                default:
                    if (C2167.m7162(arrayDeque)) {
                        iM6981 = (C0630.m2566("ۧۤ") ^ i2) * (-47);
                        i4 = ((iM6981 ^ i3) * (-9709)) ^ 1086635738;
                        i5 = 1695953108;
                    } else {
                        iM6981 = C0630.m2566("ܿ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-21225)) ^ (-1810755800);
                        i5 = -1944798784;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01be A[PHI: r5 r9 r19
      0x01be: PHI (r5v7 l.ۛۧܳ) = (r5v4 l.ۛۧܳ), (r5v2 l.ۛۧܳ), (r5v2 l.ۛۧܳ) binds: [B:53:0x01bc, B:44:0x0160, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r9v7 long) = (r9v2 long), (r9v4 long), (r9v2 long) binds: [B:53:0x01bc, B:44:0x0160, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r19v36 java.util.Iterator) = (r19v18 java.util.Iterator), (r19v20 java.util.Iterator), (r19v42 java.util.Iterator) binds: [B:53:0x01bc, B:44:0x0160, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m42351(C9047 c9047) {
        int iM6981;
        int i;
        int i2;
        Iterator it;
        int iM2566;
        int i3;
        int iM6982;
        int i4;
        int i5;
        long j = 0;
        C6018 c6018 = null;
        long jM28024 = 0;
        C9047 c9048 = null;
        long jM3495 = 0;
        long jM28025 = 0;
        Iterator itM9029 = null;
        int i6 = 345795359;
        int i7 = RunnableC3474.f10992;
        int i8 = C1773.f6144;
        int iM6983 = C2105.m6981("ۖۨ") ^ i8;
        int i9 = ((iM6983 ^ i7) * (-22205)) ^ (-1923991820);
        int i10 = iM6983 ^ 25206316;
        long jM28026 = 0;
        ArrayList arrayList = null;
        IdentityHashMap identityHashMap = null;
        while (true) {
            ArrayDeque arrayDeque = null;
            while (true) {
                i6 = i10 ^ (i9 & (((i6 ^ i7) * 9489) >> 31));
                switch (i6) {
                    case -1946451911:
                    case 505667502:
                        return j;
                    case -1908124284:
                    case -1535374381:
                        C0382.m1848();
                        if (C1128.f4106 > 0) {
                            it = itM9029;
                            int iM6984 = (C2105.m6981("ۙ᩵") ^ i7) * (-31);
                            i9 = ((iM6984 ^ i8) * (-20673)) ^ (-1491997646);
                            itM9029 = it;
                            i10 = iM6984 ^ 931103257;
                            arrayList = null;
                        } else {
                            it = itM9029;
                            iM6982 = (i8 - C0630.m2566("ᩴ᩺")) * 89;
                            i4 = ((iM6982 ^ i7) * 22653) ^ (-520782177);
                            i5 = 375426531;
                            i9 = i4;
                            itM9029 = it;
                            i10 = iM6982 ^ i5;
                        }
                        break;
                    case -1460378329:
                    case 792536328:
                        it = itM9029;
                        if (C1128.f4106 > 0) {
                            arrayList = new ArrayList();
                            if (C0237.m1481() >= 0) {
                                iM6982 = (i8 - C0630.m2566("ᩴ᩺")) * 89;
                                i4 = ((iM6982 ^ i7) * 22653) ^ (-520782177);
                                i5 = 375426531;
                            } else {
                                iM6982 = (C2105.m6981("ۡ᩶") ^ i8) * 21;
                                i4 = ((iM6982 ^ i7) * (-17957)) ^ (-1793907818);
                                i5 = 1755378998;
                            }
                            i9 = i4;
                            itM9029 = it;
                            i10 = iM6982 ^ i5;
                        } else {
                            int iM6985 = (C2105.m6981("ۙ᩵") ^ i7) * (-31);
                            i9 = ((iM6985 ^ i8) * (-20673)) ^ (-1491997646);
                            itM9029 = it;
                            i10 = iM6985 ^ 931103257;
                            arrayList = null;
                        }
                        break;
                    case -1400753857:
                    case 374822598:
                        C0237.m1481();
                        if (!C3663.f11553) {
                            it = itM9029;
                        }
                        it = itM9029;
                        int iM6986 = (C2105.m6981("ۙ᩵") ^ i7) * (-31);
                        i9 = ((iM6986 ^ i8) * (-20673)) ^ (-1491997646);
                        itM9029 = it;
                        i10 = iM6986 ^ 931103257;
                        arrayList = null;
                        break;
                    case -1313162240:
                    case 2103179377:
                        it = itM9029;
                        c6018 = (C6018) arrayDeque.pop();
                        if (RunnableC3474.f10992 <= 0) {
                            iM2566 = (C2105.m6981("۬᩷") + i8) * (-93);
                            i = ((iM2566 ^ i7) * 18585) ^ (-225123673);
                            i3 = -1470502500;
                        } else {
                            iM2566 = (C2105.m6981("ܺ᩺") + i7) * 39;
                            i = ((iM2566 ^ i8) * (-29721)) ^ 1728630554;
                            i3 = 818087658;
                        }
                        int i11 = iM2566 ^ i3;
                        itM9029 = it;
                        i10 = i11;
                        i9 = i;
                        break;
                    case -1121165751:
                    case -987051399:
                        it = itM9029;
                        m42357(c9047, arrayList);
                        if (C2958.f9394 < 0) {
                            identityHashMap = new IdentityHashMap();
                            if (C2105.f7037 == 0) {
                                arrayDeque = new ArrayDeque(arrayList);
                                j = 0;
                                iM6982 = C0630.m2566("ܳܶ") ^ i7;
                                i4 = ((iM6982 ^ i8) * 27263) ^ (-1706730004);
                                i5 = -1907517754;
                                i9 = i4;
                                itM9029 = it;
                                i10 = iM6982 ^ i5;
                            }
                        } else {
                            int iM6987 = (C2105.m6981("ۧۤ") ^ i7) * (-59);
                            i9 = ((iM6987 ^ i8) * 183) ^ (-471188825);
                            itM9029 = it;
                            i10 = iM6987 ^ 901284779;
                            identityHashMap = null;
                        }
                        break;
                    case -1090429573:
                    case -484506392:
                        C1047.m3597(arrayList);
                        if (C1047.f3863 < 0) {
                            iM6981 = C2105.m6981("ܰ᩶") ^ i8;
                            i = ((iM6981 ^ i7) * (-10065)) ^ 1597343949;
                            i2 = -814460872;
                            i10 = iM6981 ^ i2;
                            i9 = i;
                        } else {
                            it = itM9029;
                            int iM6988 = (C2105.m6981("ۙ᩵") ^ i7) * (-31);
                            i9 = ((iM6988 ^ i8) * (-20673)) ^ (-1491997646);
                            itM9029 = it;
                            i10 = iM6988 ^ 931103257;
                            arrayList = null;
                        }
                        break;
                    case -734388238:
                    case 1346382776:
                        C3663.m11175(arrayDeque, (C6018) C2272.m7513(itM9029));
                        iM6981 = (C0630.m2566("ܳ۫") ^ i7) * (-107);
                        i = ((iM6981 ^ i8) * (-8697)) ^ 766033346;
                        i2 = -966851074;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                        break;
                    case -717177177:
                    case -159334484:
                        if (!C0483.m2123(itM9029)) {
                            it = itM9029;
                            j = jM28026;
                            iM6982 = C0630.m2566("ܳܶ") ^ i7;
                            i4 = ((iM6982 ^ i8) * 27263) ^ (-1706730004);
                            i5 = -1907517754;
                            i9 = i4;
                            itM9029 = it;
                            i10 = iM6982 ^ i5;
                        } else {
                            iM6981 = C2105.m6981("֨ᩳ") ^ i7;
                            i = ((iM6981 ^ i8) * (-23327)) ^ (-685066278);
                            i2 = 833236958;
                            i10 = iM6981 ^ i2;
                            i9 = i;
                        }
                        break;
                    case -634881999:
                    case 1884694448:
                        it = itM9029;
                        if (C0714.m2809(identityHashMap, c6018, Boolean.TRUE) == null) {
                            iM2566 = C0630.m2566("ۨۖ") ^ i8;
                            i = ((iM2566 ^ i7) * 14653) ^ 549074609;
                            i3 = -2080034071;
                            int i12 = iM2566 ^ i3;
                            itM9029 = it;
                            i10 = i12;
                            i9 = i;
                        } else {
                            iM6982 = C0630.m2566("ܳܶ") ^ i7;
                            i4 = ((iM6982 ^ i8) * 27263) ^ (-1706730004);
                            i5 = -1907517754;
                            i9 = i4;
                            itM9029 = it;
                            i10 = iM6982 ^ i5;
                        }
                        break;
                    case -506869624:
                    case 698017430:
                        m42357(c6018.f18476, arrayList);
                        itM9029 = C2958.m9029(arrayList);
                        iM6981 = (C0630.m2566("ܳ۫") ^ i7) * (-107);
                        i = ((iM6981 ^ i8) * (-8697)) ^ 766033346;
                        i2 = -966851074;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                        break;
                    case -274219768:
                    case -185867988:
                        it = itM9029;
                        if (C0714.m2812(arrayDeque)) {
                            iM2566 = (C2105.m6981("۫۟") ^ i8) * 59;
                            i = ((iM2566 ^ i7) * (-2075)) ^ (-1341305328);
                            i3 = -610687240;
                        } else {
                            iM2566 = (i7 - C2105.m6981("ۙ۟")) * (-25);
                            i = ((iM2566 ^ i8) * (-18879)) ^ (-1106218858);
                            i3 = -1046614831;
                        }
                        int i13 = iM2566 ^ i3;
                        itM9029 = it;
                        i10 = i13;
                        i9 = i;
                        break;
                    case 28258791:
                    case 1456290979:
                        it = itM9029;
                        jM28026 = C11340.m28024(jM28025, C19631.m45142(c6018.f18476));
                        if (C7106.f21815 == 0) {
                            iM2566 = C0630.m2566("ܺ۫") ^ i8;
                            i = ((iM2566 ^ i7) * (-30375)) ^ 1572714121;
                            i3 = -1849894276;
                            int i14 = iM2566 ^ i3;
                            itM9029 = it;
                            i10 = i14;
                            i9 = i;
                        } else {
                            iM6982 = (i8 - C0630.m2566("ᩴ᩺")) * 89;
                            i4 = ((iM6982 ^ i7) * 22653) ^ (-520782177);
                            i5 = 375426531;
                            i9 = i4;
                            itM9029 = it;
                            i10 = iM6982 ^ i5;
                        }
                        break;
                    case 98027363:
                    case 333071080:
                        C4075.m12263();
                        it = itM9029;
                        iM6982 = (i8 - C0630.m2566("ᩴ᩺")) * 89;
                        i4 = ((iM6982 ^ i7) * 22653) ^ (-520782177);
                        i5 = 375426531;
                        i9 = i4;
                        itM9029 = it;
                        i10 = iM6982 ^ i5;
                        break;
                    case 124464875:
                    case 1164557512:
                        it = itM9029;
                        jM28025 = C11340.m28024(jM3495, C19631.m45128(c6018.f18476));
                        if (!C3663.f11553) {
                            iM2566 = (i7 - C2105.m6981("۬᩺")) * (-9);
                            i = ((iM2566 ^ i8) * 29555) ^ 1485794345;
                            i3 = -1889005682;
                            int i15 = iM2566 ^ i3;
                            itM9029 = it;
                            i10 = i15;
                            i9 = i;
                        } else {
                            int iM6989 = (C2105.m6981("ۧۤ") ^ i7) * (-59);
                            i9 = ((iM6989 ^ i8) * 183) ^ (-471188825);
                            itM9029 = it;
                            i10 = iM6989 ^ 901284779;
                            identityHashMap = null;
                        }
                        break;
                    case 684739603:
                    case 1260205029:
                        C3683.m11222();
                        C0630.m2564();
                        return 0L;
                    case 828320215:
                    case 1114147569:
                        it = itM9029;
                        jM3495 = C1005.m3495(jM28024, C19631.m45118(c9048));
                        if (C4616.f14690 <= 0) {
                            iM2566 = (C2105.m6981("۬᩷") + i8) * (-93);
                            i = ((iM2566 ^ i7) * 18585) ^ (-225123673);
                            i3 = -1470502500;
                        } else {
                            iM2566 = (i7 - C2105.m6981("ۧۚ")) * (-13);
                            i = ((iM2566 ^ i8) * 10651) ^ 696737707;
                            i3 = 7727621;
                        }
                        int i16 = iM2566 ^ i3;
                        itM9029 = it;
                        i10 = i16;
                        i9 = i;
                        break;
                    case 1281483190:
                    case 1521842331:
                        C0382.m1848();
                        if (C3663.m11168() >= 0) {
                            it = itM9029;
                            iM2566 = (C2105.m6981("۬᩷") + i8) * (-93);
                            i = ((iM2566 ^ i7) * 18585) ^ (-225123673);
                            i3 = -1470502500;
                            int i17 = iM2566 ^ i3;
                            itM9029 = it;
                            i10 = i17;
                            i9 = i;
                        } else {
                            it = itM9029;
                            iM6982 = (i8 - C0630.m2566("ᩴ᩺")) * 89;
                            i4 = ((iM6982 ^ i7) * 22653) ^ (-520782177);
                            i5 = 375426531;
                            i9 = i4;
                            itM9029 = it;
                            i10 = iM6982 ^ i5;
                        }
                        break;
                    default:
                        it = itM9029;
                        jM28024 = C11340.m28024(j, c6018.f18472);
                        c9048 = c6018.f18476;
                        if (ServiceConnectionC3453.f10921 < 0) {
                            iM2566 = C0630.m2566("۠ܿ") ^ i8;
                            i = ((iM2566 ^ i7) * 17531) ^ 737428170;
                            i3 = 534942846;
                            int i18 = iM2566 ^ i3;
                            itM9029 = it;
                            i10 = i18;
                            i9 = i;
                        } else {
                            int iM69810 = (C2105.m6981("ۙ᩵") ^ i7) * (-31);
                            i9 = ((iM69810 ^ i8) * (-20673)) ^ (-1491997646);
                            itM9029 = it;
                            i10 = iM69810 ^ 931103257;
                            arrayList = null;
                        }
                        break;
                }
            }
            int iM69811 = (C2105.m6981("ܰᩳ") + i8) * (-21);
            i9 = ((iM69811 ^ i7) * 20047) ^ (-6133963);
            itM9029 = it;
            i10 = iM69811 ^ (-1910599808);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42340(InterfaceC18883 interfaceC18883, IdentityHashMap identityHashMap) {
        Boolean bool = null;
        boolean z = false;
        boolean z2 = false;
        InterfaceC18883[] interfaceC18883Arr = null;
        int length = 0;
        int i = 0;
        int i2 = 507285601;
        int i3 = C3683.f11629;
        int i4 = C1047.f3863;
        int iM2566 = C0630.m2566("᩷ۢ") ^ i3;
        int i5 = ((iM2566 ^ i4) * (-14389)) ^ (-641441815);
        int i6 = -91923440;
        while (true) {
            i2 = ((((i2 ^ i4) * (-16707)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2091572161:
                case -152824032:
                    if (C4616.m13552() != 0) {
                        iM2566 = (i3 - C0630.m2566("ۗ᩸")) * (-121);
                        i5 = ((iM2566 ^ i4) * (-7577)) ^ (-1635337581);
                        i6 = -999116452;
                    } else {
                        iM2566 = C0630.m2566("ۧۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-5039)) ^ 1445518720;
                        i6 = -446397315;
                    }
                    break;
                case -2024323195:
                case -863796827:
                    i++;
                    iM2566 = (i3 - C0630.m2566("֫۟")) * (-99);
                    i5 = ((iM2566 ^ i4) * 20033) ^ (-317102115);
                    i6 = 895456002;
                    break;
                case -1953429342:
                case 685628992:
                    z2 = true;
                    iM2566 = C0630.m2566("ۡ᩷") ^ i3;
                    i5 = ((iM2566 ^ i4) * (-155)) ^ (-652849554);
                    i6 = -980319371;
                    break;
                case -1870181857:
                case 1880523484:
                    if (C22628.m50615() != 0) {
                        iM2566 = C0630.m2566("ۛܰ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-32505)) ^ (-265133568);
                        i6 = -1454178201;
                    } else {
                        iM2566 = C0630.m2566("ܽۨ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-10937)) ^ (-868129706);
                        i6 = 105154164;
                    }
                    break;
                case -1799041424:
                case -898152175:
                    C0798.m2998();
                    C2167.m7155();
                    iM2566 = C0630.m2566("ۛܰ") ^ i4;
                    i5 = ((iM2566 ^ i3) * (-32505)) ^ (-265133568);
                    i6 = -1454178201;
                    break;
                case -1647470289:
                case -1362761065:
                    if (C2272.f7362) {
                        iM2566 = (C0630.m2566("۬ܺ") ^ i4) * (-103);
                        i5 = ((iM2566 ^ i3) * o.a.x) ^ 1045759614;
                        i6 = -102528699;
                    } else {
                        iM2566 = C0630.m2566("ܽ᩻") ^ i3;
                        i5 = ((iM2566 ^ i4) * 7081) ^ 1052828566;
                        i6 = -108846086;
                    }
                    break;
                case -1472946008:
                case 1866333968:
                    C2105.m6982();
                    if (C3432.f10845 < 0) {
                        iM2566 = C0630.m2566("۬ۢ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-22581)) ^ (-1549851068);
                        i6 = 540262194;
                    } else {
                        iM2566 = (C0630.m2566("۬ܺ") ^ i4) * (-103);
                        i5 = ((iM2566 ^ i3) * o.a.x) ^ 1045759614;
                        i6 = -102528699;
                    }
                    break;
                case -1310112501:
                case 1528304689:
                    if (m42340(interfaceC18883Arr[i], identityHashMap)) {
                        iM2566 = C0630.m2566("ܿܿ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-1091)) ^ (-1226769866);
                        i6 = 2132160175;
                    } else {
                        iM2566 = C2105.m6981("ܰۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-9539)) ^ 2042245980;
                        i6 = 1106993508;
                    }
                    break;
                case -1268809660:
                case -125775451:
                    if (interfaceC18883 instanceof C6018) {
                        iM2566 = C0630.m2566("ۡܽ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-32401)) ^ (-15839981);
                        i6 = 1837360050;
                    } else {
                        z2 = z;
                        iM2566 = C0630.m2566("ۡ᩷") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-155)) ^ (-652849554);
                        i6 = -980319371;
                    }
                    break;
                case -1260837322:
                case -104802914:
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("۬ۢ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-22581)) ^ (-1549851068);
                        i6 = 540262194;
                    } else {
                        iM2566 = C2105.m6981("۟ܳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-5031)) ^ 2055702330;
                        i6 = -1658792720;
                    }
                    break;
                case -1002574355:
                case -222060334:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C0630.m2566("۬ܺ") ^ i4) * (-103);
                        i5 = ((iM2566 ^ i3) * o.a.x) ^ 1045759614;
                        i6 = -102528699;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܰۛ")) * (-29);
                        i5 = ((iM2566 ^ i4) * (-32759)) ^ 130558671;
                        i6 = -127915344;
                    }
                    break;
                case -897565702:
                case 823569710:
                    C2167.m7148(identityHashMap, interfaceC18883, C1420.m4911(z2));
                    return z2;
                case -726359127:
                case 2054157579:
                    C1773.m5908();
                    if (!C2272.f7362) {
                        iM2566 = C0630.m2566("ᩳᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-23455)) ^ 678770437;
                        i6 = 1056163484;
                    } else {
                        iM2566 = (C0630.m2566("۬ܺ") ^ i4) * (-103);
                        i5 = ((iM2566 ^ i3) * o.a.x) ^ 1045759614;
                        i6 = -102528699;
                    }
                    break;
                case -538424858:
                case 543227905:
                    return ViewOnClickListenerC1958.m6437(Boolean.TRUE, bool);
                case -520406361:
                case 1204665404:
                    interfaceC18883Arr = ((C6018) interfaceC18883).f18478;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C0630.m2566("ۛܰ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-32505)) ^ (-265133568);
                        i6 = -1454178201;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۚܿ")) * 11;
                        i5 = ((iM2566 ^ i4) * 28857) ^ 768500353;
                        i6 = 2088346541;
                    }
                    break;
                case -333736092:
                case 300128607:
                    bool = (Boolean) identityHashMap.get(interfaceC18883);
                    if (bool == null) {
                        iM2566 = C0630.m2566("᩻᩷") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-14687)) ^ (-1668165679);
                        i6 = -858915136;
                    } else {
                        iM2566 = (C2105.m6981("ۗۗ") + i4) * 7;
                        i5 = ((iM2566 ^ i3) * (-27901)) ^ 1954332625;
                        i6 = -30465538;
                    }
                    break;
                case -310157942:
                case 420849094:
                    C3432.m10477();
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C0630.m2566("ᩳᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-23455)) ^ 678770437;
                        i6 = 1056163484;
                    } else {
                        iM2566 = C0630.m2566("ۛܰ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-32505)) ^ (-265133568);
                        i6 = -1454178201;
                    }
                    break;
                case -38648139:
                case 810714525:
                    length = interfaceC18883Arr.length;
                    i = 0;
                    iM2566 = (i3 - C0630.m2566("֫۟")) * (-99);
                    i5 = ((iM2566 ^ i4) * 20033) ^ (-317102115);
                    i6 = 895456002;
                    break;
                case 218372297:
                case 1188518965:
                    if (C0422.f1886 <= 0) {
                        iM2566 = (i3 - C0630.m2566("ۗ᩸")) * (-121);
                        i5 = ((iM2566 ^ i4) * (-7577)) ^ (-1635337581);
                        i6 = -999116452;
                    } else {
                        iM2566 = (C0630.m2566("ۨ۬") ^ i3) * (-57);
                        i5 = ((iM2566 ^ i4) * (-12031)) ^ 228010530;
                        i6 = -1479956086;
                    }
                    break;
                case 274206125:
                case 287203239:
                    if (C1711.f5919) {
                        iM2566 = (C0630.m2566("۬ܺ") ^ i4) * (-103);
                        i5 = ((iM2566 ^ i3) * o.a.x) ^ 1045759614;
                        i6 = -102528699;
                    } else {
                        iM2566 = (C2105.m6981("۟᩷") + i4) * (-29);
                        i5 = ((iM2566 ^ i3) * 14045) ^ (-446571954);
                        i6 = 1686231980;
                    }
                    break;
                case 295253996:
                case 606854843:
                    C21923.m49329();
                    C3019.m9255();
                    return false;
                case 315590838:
                case 1519980439:
                    if (i < length) {
                        iM2566 = C0630.m2566("ܰ᩶") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-30119)) ^ 699686216;
                        i6 = 1016183076;
                    } else {
                        z2 = z;
                        iM2566 = C0630.m2566("ۡ᩷") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-155)) ^ (-652849554);
                        i6 = -980319371;
                    }
                    break;
                case 620608888:
                case 944337009:
                    if (identityHashMap.containsKey(interfaceC18883)) {
                        iM2566 = (C2105.m6981("ۗۗ") + i4) * 7;
                        i5 = ((iM2566 ^ i3) * (-27901)) ^ 1954332625;
                        i6 = -30465538;
                    } else {
                        iM2566 = C0630.m2566("۫ۧ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-23579)) ^ 1877525937;
                        i6 = -42915958;
                    }
                    break;
                case 706951573:
                case 815134913:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C0630.m2566("۬ܺ") ^ i4) * (-103);
                        i5 = ((iM2566 ^ i3) * o.a.x) ^ 1045759614;
                        i6 = -102528699;
                    } else {
                        iM2566 = C2105.m6981("ᩴܽ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-12589)) ^ 1411512552;
                        i6 = 237902367;
                    }
                    break;
                case 1798282294:
                case 1879703487:
                    C0714.m2809(identityHashMap, interfaceC18883, Boolean.FALSE);
                    z = interfaceC18883 instanceof C3902;
                    if (z) {
                        z2 = z;
                        iM2566 = C0630.m2566("ۡ᩷") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-155)) ^ (-652849554);
                        i6 = -980319371;
                    } else {
                        iM2566 = (C0630.m2566("֨᩸") ^ i4) * 57;
                        i5 = ((iM2566 ^ i3) * (-19559)) ^ (-152970595);
                        i6 = -876997259;
                    }
                    break;
                default:
                    if (C1005.f3721) {
                        iM2566 = (C0630.m2566("᩻۫") + i4) * (-87);
                        i5 = ((iM2566 ^ i3) * (-25591)) ^ 1746390639;
                        i6 = 2073796542;
                    } else {
                        iM2566 = C0630.m2566("۬ۢ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-22581)) ^ (-1549851068);
                        i6 = 540262194;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x024a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0278  */
    /* JADX WARN: Code duplicated, block: B:113:0x0287  */
    /* JADX WARN: Code duplicated, block: B:116:0x0297  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cc A[LOOP:11: B:122:0x02c6->B:124:0x02cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x0302 A[LOOP:12: B:127:0x0300->B:128:0x0302, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x0317  */
    /* JADX WARN: Code duplicated, block: B:134:0x032b A[LOOP:14: B:133:0x0329->B:134:0x032b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x037f A[LOOP:13: B:130:0x0311->B:137:0x037f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x03aa A[LOOP:15: B:141:0x03a4->B:143:0x03aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:148:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:153:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:159:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:179:0x0458  */
    /* JADX WARN: Code duplicated, block: B:182:0x045f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0474  */
    /* JADX WARN: Code duplicated, block: B:188:0x0483  */
    /* JADX WARN: Code duplicated, block: B:190:0x048f  */
    /* JADX WARN: Code duplicated, block: B:191:0x049a  */
    /* JADX WARN: Code duplicated, block: B:193:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:197:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:200:0x04da  */
    /* JADX WARN: Code duplicated, block: B:202:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:204:0x0503  */
    /* JADX WARN: Code duplicated, block: B:205:0x0509  */
    /* JADX WARN: Code duplicated, block: B:221:0x0551  */
    /* JADX WARN: Code duplicated, block: B:240:0x05d2 A[EDGE_INSN: B:240:0x05d2->B:245:0x0608 BREAK  A[LOOP:17: B:154:0x03e8->B:175:0x044c]] */
    /* JADX WARN: Code duplicated, block: B:241:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:243:0x05e5 A[LOOP:24: B:242:0x05e3->B:243:0x05e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:246:0x060a  */
    /* JADX WARN: Code duplicated, block: B:248:0x0614  */
    /* JADX WARN: Code duplicated, block: B:251:0x061e A[Catch: IOException -> 0x0660, Error -> 0x0665, Error | RuntimeException -> 0x0667, TRY_ENTER, TryCatch #5 {IOException -> 0x0660, blocks: (B:251:0x061e, B:253:0x0628), top: B:295:0x061c }] */
    /* JADX WARN: Code duplicated, block: B:253:0x0628 A[Catch: IOException -> 0x0660, Error -> 0x0665, Error | RuntimeException -> 0x0667, TRY_LEAVE, TryCatch #5 {IOException -> 0x0660, blocks: (B:251:0x061e, B:253:0x0628), top: B:295:0x061c }] */
    /* JADX WARN: Code duplicated, block: B:256:0x063b A[Catch: Error -> 0x065a, RuntimeException -> 0x065c, IOException -> 0x065e, TRY_ENTER, TryCatch #7 {IOException -> 0x065e, Error -> 0x065a, RuntimeException -> 0x065c, blocks: (B:256:0x063b, B:258:0x0641), top: B:297:0x0639 }] */
    /* JADX WARN: Code duplicated, block: B:258:0x0641 A[Catch: Error -> 0x065a, RuntimeException -> 0x065c, IOException -> 0x065e, TRY_LEAVE, TryCatch #7 {IOException -> 0x065e, Error -> 0x065a, RuntimeException -> 0x065c, blocks: (B:256:0x063b, B:258:0x0641), top: B:297:0x0639 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x066b  */
    /* JADX WARN: Code duplicated, block: B:317:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x044f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x05ce A[EDGE_INSN: B:359:0x05ce->B:238:0x05ce BREAK  A[LOOP:19: B:177:0x0452->B:237:0x05c2, LOOP_LABEL: LOOP:19: B:177:0x0452->B:237:0x05c2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x019c  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cd A[LOOP:6: B:89:0x01c7->B:91:0x01cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:99:0x0224  */
    /* JADX WARN: Instruction removed from duplicated block: B:241:0x05d4, please report this as an issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13778 m42315(C9047 c9047, long j, C21541 c21541, InterfaceC17066 interfaceC17066) throws Throwable {
        long j2;
        C8135 c8135;
        HashMap map;
        ArrayList arrayList;
        Iterator itM12354;
        int[] iArr;
        ArrayList arrayList2;
        IdentityHashMap identityHashMap;
        Iterator itM9029;
        C19425 c19425;
        int iM1847;
        long[] jArr;
        long[] jArr2;
        ArrayList arrayList3;
        int i;
        Iterator itM90210;
        C9047 c9048;
        int i2;
        long[] jArr3;
        long j3;
        Iterator itM12355;
        long jM28024;
        int i3;
        int i4;
        C5313 c5313M42306;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList4;
        IdentityHashMap identityHashMap2;
        int i8;
        ArrayList arrayList5;
        int i9;
        C5313 c5313;
        C0373 c0373M15229;
        Iterator itM12356;
        C5313 c5314;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i10;
        long[] jArr4;
        ArrayList arrayList8;
        C5313 c5315;
        ArrayList arrayList9;
        int length;
        int[] iArr2;
        int length2;
        boolean z;
        int i11;
        long jM3495;
        int i12;
        int i13;
        Iterator itM12357;
        long j4;
        C5313 c5316;
        long j5;
        C0373 c0373;
        int[] iArr3;
        int length3;
        int i14;
        C9047 c9049;
        long jM3496;
        Iterator it;
        long jLongValue;
        long j6;
        ArrayList arrayList10;
        int i15;
        int i16;
        long[] jArr5;
        C1079 c1079;
        int iM10481;
        ArrayList arrayList11;
        ArrayDeque arrayDeque;
        int i17;
        int[] iArr4;
        C1079 c10710;
        C3902[] c3902ArrM3661;
        int length4;
        int i18;
        C3902 c3902;
        Iterator itM12358;
        C1079 c10711;
        ArrayList arrayList12;
        int[] iArr5;
        int i19;
        C0373 c0374;
        Long lM9026;
        C9047 c90410;
        InterfaceC18883[] interfaceC18883Arr;
        C3902 c3903;
        int i20;
        char c;
        C3902 c3902M11889;
        long j7;
        ArrayList arrayList13;
        int i21;
        C9047 c9047M42307 = m42307(c9047, j, c21541);
        if (c9047M42307 == null) {
            return new C13778(null, f56531);
        }
        if (interfaceC17066 == null) {
            return new C13778(c9047M42307, f56531);
        }
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        ArrayList arrayList14 = new ArrayList();
        m42324(c9047M42307, identityHashMap3, arrayList14, new IdentityHashMap());
        ArrayList arrayList15 = new ArrayList();
        IdentityHashMap identityHashMap4 = new IdentityHashMap();
        ArrayList arrayList16 = new ArrayList();
        Iterator itM90211 = C2958.m9029(arrayList14);
        while (C0483.m2123(itM90211)) {
            InterfaceC18883 interfaceC18883 = (InterfaceC18883) RunnableC1108.m3791(itM90211);
            long jLongValue2 = ((Long) identityHashMap3.get(interfaceC18883)).longValue();
            IdentityHashMap identityHashMap5 = new IdentityHashMap();
            ArrayList arrayList17 = new ArrayList();
            m42329(interfaceC18883, identityHashMap5, arrayList17, new IdentityHashMap());
            int iM10482 = C3432.m10481(arrayList15);
            int i22 = (int) jLongValue2;
            IdentityHashMap identityHashMap6 = identityHashMap3;
            Iterator it2 = itM90211;
            if (jLongValue2 != i22) {
                throw new ArithmeticException();
            }
            C1079 c10712 = new C1079(iM10482, interfaceC18883, i22, (C3902[]) arrayList17.toArray(new C3902[0]));
            C1916.m6307(arrayList15, c10712);
            Iterator itM90212 = C2958.m9029(arrayList17);
            while (C1773.m5910(itM90212)) {
                C3902 c3904 = (C3902) C2272.m7513(itM90212);
                ArrayList arrayList18 = (ArrayList) identityHashMap4.get(c3904);
                if (arrayList18 == null) {
                    arrayList18 = new ArrayList();
                    C0714.m2809(identityHashMap4, c3904, arrayList18);
                    C7106.m19117(arrayList16, c3904);
                }
                C7106.m19117(arrayList18, c10712);
            }
            identityHashMap3 = identityHashMap6;
            itM90211 = it2;
        }
        synchronized (f56530) {
            C22951 c22951 = f56534;
            if (c22951 == null || !c22951.m51073()) {
                j2 = 33554432;
            } else {
                long j8 = c22951.f73939;
                Iterator itM90213 = C2958.m9029(arrayList16);
                while (true) {
                    if (!C1773.m5910(itM90213)) {
                        j2 = 33554432;
                        j7 = -1;
                        arrayList13 = null;
                        i21 = 0;
                        break;
                    }
                    C3902 c3905 = (C3902) C2272.m7513(itM90213);
                    C2491 c2491 = c3905.f12475;
                    if (c2491.f7938 == c22951 && c2491.f7937 + ((long) c2491.f7940) == j8) {
                        arrayList13 = (ArrayList) identityHashMap4.get(c3905);
                        Iterator itM90214 = C2958.m9029(arrayList13);
                        long jM28025 = 0;
                        while (C1773.m5910(itM90214)) {
                            jM28025 = C11340.m28024(jM28025, ((C1079) RunnableC1108.m3791(itM90214)).m3664());
                        }
                        if (jM28025 > 0 && jM28025 <= 33554432) {
                            int i23 = (int) jM28025;
                            if (jM28025 != i23) {
                                throw new ArithmeticException();
                            }
                            j7 = c2491.f7937;
                            j2 = 33554432;
                            i21 = i23;
                            break;
                        }
                    }
                }
                if (arrayList13 != null) {
                    synchronized (f56530) {
                        if (f56534 == c22951 && c22951.f73939 == j8 && c22951.m51073() && c22951.m51075(i21, j7)) {
                            IdentityHashMap identityHashMap7 = new IdentityHashMap();
                            Iterator itM12359 = C4117.m12354(arrayList13);
                            while (C0483.m2123(itM12359)) {
                                C2167.m7148(identityHashMap7, ((C1079) C2272.m7513(itM12359)).m3662(), Boolean.TRUE);
                            }
                            c8135 = new C8135(identityHashMap7, i21, c22951, j7);
                        }
                    }
                }
                if (c8135 != null) {
                    map = new HashMap();
                    arrayList = new ArrayList();
                    itM12354 = C4117.m12354(arrayList16);
                    while (C1773.m5910(itM12354)) {
                        C3902 c3906 = (C3902) C2272.m7513(itM12354);
                        arrayList12 = (ArrayList) identityHashMap4.get(c3906);
                        iArr5 = new int[C0382.m1847(arrayList12)];
                        for (i19 = 0; i19 < C3432.m10481(arrayList12); i19++) {
                            iArr5[i19] = ((C1079) C3019.m9263(arrayList12, i19)).m3663();
                        }
                        c0374 = new C0373(iArr5);
                        lM9026 = (Long) C0964.m3410(map, c0374);
                        if (lM9026 == null) {
                            C7106.m19117(arrayList, c0374);
                            lM9026 = C2958.m9026(0L);
                        }
                        C3746.m11368(map, c0374, C4117.m12360(C11340.m28024(lM9026.longValue(), c3906.mo10087())));
                    }
                    iArr = new int[C3432.m10481(arrayList15)];
                    Arrays.fill(iArr, -1);
                    arrayList2 = new ArrayList();
                    identityHashMap = new IdentityHashMap();
                    itM9029 = C2958.m9029(arrayList15);
                    while (C1773.m5910(itM9029)) {
                        c1079 = (C1079) RunnableC1108.m3791(itM9029);
                        if (iArr[c1079.m3663()] >= 0) {
                            iM10481 = C3432.m10481(arrayList2);
                            arrayList11 = new ArrayList();
                            arrayDeque = new ArrayDeque();
                            C1504.m5174(arrayDeque, c1079);
                            while (!C2167.m7162(arrayDeque)) {
                                c10710 = (C1079) arrayDeque.pop();
                                if (iArr[c10710.m3663()] >= 0) {
                                    iArr[c10710.m3663()] = iM10481;
                                    Iterator it3 = itM9029;
                                    C7106.m19117(arrayList11, C3245.m9931(c10710.m3663()));
                                    c3902ArrM3661 = c10710.m3661();
                                    length4 = c3902ArrM3661.length;
                                    int i24 = iM10481;
                                    i18 = 0;
                                    while (i18 < length4) {
                                        int i25 = length4;
                                        c3902 = c3902ArrM3661[i18];
                                        C3902[] c3902Arr = c3902ArrM3661;
                                        if (C0714.m2809(identityHashMap, c3902, Boolean.TRUE) != null) {
                                            itM12358 = C4117.m12354((ArrayList) identityHashMap4.get(c3902));
                                            while (C0483.m2123(itM12358)) {
                                                c10711 = (C1079) C2272.m7513(itM12358);
                                                if (iArr[c10711.m3663()] < 0) {
                                                    C1504.m5174(arrayDeque, c10711);
                                                }
                                            }
                                        }
                                        i18++;
                                        c3902ArrM3661 = c3902Arr;
                                        length4 = i25;
                                    }
                                    itM9029 = it3;
                                    iM10481 = i24;
                                }
                            }
                            Iterator it4 = itM9029;
                            C6083.sort(arrayList11, new C16601(0));
                            iArr4 = new int[C0382.m1847(arrayList11)];
                            for (i17 = 0; i17 < C3432.m10481(arrayList11); i17++) {
                                iArr4[i17] = C0422.m1951((Integer) C3537.m10755(arrayList11, i17));
                            }
                            C7106.m19117(arrayList2, new C0373(iArr4));
                            itM9029 = it4;
                        }
                    }
                    c19425 = new C19425(arrayList2, iArr);
                    iM1847 = C0382.m1847((ArrayList) c19425.m44729());
                    jArr = new long[iM1847];
                    jArr2 = new long[iM1847];
                    arrayList3 = new ArrayList(iM1847);
                    for (i = 0; i < iM1847; i++) {
                        C1916.m6307(arrayList3, new ArrayList());
                    }
                    itM90210 = C2958.m9029(arrayList);
                    while (C1773.m5910(itM90210)) {
                        c0373 = (C0373) C2272.m7513(itM90210);
                        iArr3 = c0373.f1790;
                        i14 = 0;
                        c9049 = c9047M42307;
                        jM3496 = 0;
                        for (length3 = iArr3.length; i14 < length3; length3 = length3) {
                            jM3496 = C1005.m3495(jM3496, ((C1079) C3537.m10755(arrayList15, iArr3[i14])).m3664());
                            i14++;
                            itM90210 = itM90210;
                            iArr3 = iArr3;
                        }
                        it = itM90210;
                        int i26 = c19425.m44728()[c0373.f1790[0]];
                        jLongValue = ((Long) C0964.m3410(map, c0373)).longValue();
                        j6 = j2;
                        jArr[i26] = C1005.m3495(jArr[i26], jLongValue);
                        arrayList10 = (ArrayList) C3019.m9263(arrayList3, i26);
                        i15 = (int) jM3496;
                        i16 = iM1847;
                        jArr5 = jArr;
                        if (jM3496 == i15) {
                            throw new ArithmeticException();
                        }
                        C1916.m6307(arrayList10, new C5313(c0373, i15, jLongValue - jM3496));
                        c9047M42307 = c9049;
                        itM90210 = it;
                        j2 = j6;
                        iM1847 = i16;
                        jArr = jArr5;
                    }
                    c9048 = c9047M42307;
                    i2 = iM1847;
                    jArr3 = jArr;
                    j3 = j2;
                    itM12355 = C4117.m12354(arrayList15);
                    while (C1773.m5910(itM12355)) {
                        C1079 c10713 = (C1079) C2272.m7513(itM12355);
                        int i27 = c19425.m44728()[c10713.m3663()];
                        jArr2[i27] = C11340.m28024(jArr2[i27], c10713.m3664());
                    }
                    jM28024 = 0;
                    for (i3 = 0; i3 < i2; i3++) {
                        j5 = jArr3[i3] - jArr2[i3];
                        if (j5 > 0) {
                            jM28024 = C11340.m28024(jM28024, j5);
                        }
                    }
                    if (jM28024 <= j3) {
                        c8135 = null;
                        break;
                    }
                    i4 = 0;
                    c5313M42306 = null;
                    while (true) {
                        i5 = 33554432;
                        if (i4 < i2) {
                            i6 = 0;
                            i7 = 1048576;
                            loop19: while (i6 < C0382.m1847(arrayList3)) {
                                if (jArr2[i6] > j3) {
                                    arrayList5 = (ArrayList) C3019.m9263(arrayList3, i6);
                                    if (C3432.m10481(arrayList5) >= 2) {
                                        C6083.sort(arrayList5, new C10958());
                                        i9 = 0;
                                        while (i9 < C0382.m1847(arrayList5)) {
                                            c5313 = (C5313) C3537.m10755(arrayList5, i9);
                                            if (c5313.m15228() > i5) {
                                                arrayList6 = arrayList15;
                                                arrayList7 = arrayList5;
                                                i10 = i9;
                                                jArr4 = jArr2;
                                                arrayList8 = arrayList3;
                                            } else {
                                                c0373M15229 = c5313.m15229();
                                                int iM15228 = c5313.m15228();
                                                long jM15230 = c5313.m15230() + ((long) iM15228);
                                                if (c5313.m15230() > 0) {
                                                    c5313M42306 = m42306(c5313M42306, c5313);
                                                }
                                                while (true) {
                                                    itM12356 = C4117.m12354(arrayList5);
                                                    c5314 = null;
                                                    long j9 = 0;
                                                    long j10 = 0;
                                                    while (C0483.m2123(itM12356)) {
                                                        c5315 = (C5313) C2272.m7513(itM12356);
                                                        arrayList9 = arrayList5;
                                                        length = c5315.m15229().f1790.length;
                                                        if (length > i7) {
                                                            break loop19;
                                                        }
                                                        int i28 = i7 - length;
                                                        iArr2 = c5315.m15229().f1790;
                                                        length2 = iArr2.length;
                                                        z = false;
                                                        Iterator it5 = itM12356;
                                                        i11 = 0;
                                                        long[] jArr6 = jArr2;
                                                        ArrayList arrayList19 = arrayList3;
                                                        jM3495 = 0;
                                                        while (i11 < length2) {
                                                            int i29 = length2;
                                                            i13 = iArr2[i11];
                                                            if (c0373M15229.m1826(i13)) {
                                                                z = true;
                                                            } else {
                                                                jM3495 = C1005.m3495(jM3495, ((C1079) C3537.m10755(arrayList15, i13)).m3664());
                                                            }
                                                            i11++;
                                                            length2 = i29;
                                                            arrayList15 = arrayList15;
                                                        }
                                                        ArrayList arrayList20 = arrayList15;
                                                        if (z || jM3495 == 0 || ((long) iM15228) + jM3495 > j3) {
                                                            i12 = i9;
                                                        } else {
                                                            i12 = i9;
                                                            long jM15231 = (c5315.m15230() + ((long) c5315.m15228())) - jM3495;
                                                            if (jM15231 > j9 || (jM15231 == j9 && c5314 != null && jM3495 < j10)) {
                                                                j9 = jM15231;
                                                                j10 = jM3495;
                                                                c5314 = c5315;
                                                            }
                                                        }
                                                        arrayList5 = arrayList9;
                                                        i9 = i12;
                                                        i7 = i28;
                                                        itM12356 = it5;
                                                        jArr2 = jArr6;
                                                        arrayList3 = arrayList19;
                                                        arrayList15 = arrayList20;
                                                    }
                                                    arrayList6 = arrayList15;
                                                    arrayList7 = arrayList5;
                                                    i10 = i9;
                                                    jArr4 = jArr2;
                                                    arrayList8 = arrayList3;
                                                    if (c5314 == null || j9 <= 0) {
                                                        break;
                                                    }
                                                    c0373M15229 = c0373M15229.m1825(c5314.m15229());
                                                    long j11 = ((long) iM15228) + j10;
                                                    iM15228 = (int) j11;
                                                    long j12 = iM15228;
                                                    if (j11 != j12) {
                                                        throw new ArithmeticException();
                                                    }
                                                    jM15230 = C1005.m3495(jM15230, c5314.m15230() + ((long) c5314.m15228()));
                                                    long j13 = jM15230 - j12;
                                                    if (j13 > 0) {
                                                        c5313M42306 = m42306(c5313M42306, new C5313(c0373M15229, iM15228, j13));
                                                    }
                                                    arrayList5 = arrayList7;
                                                    i9 = i10;
                                                    jArr2 = jArr4;
                                                    arrayList3 = arrayList8;
                                                    arrayList15 = arrayList6;
                                                }
                                            }
                                            i9 = i10 + 1;
                                            i5 = 33554432;
                                            arrayList5 = arrayList7;
                                            jArr2 = jArr4;
                                            arrayList3 = arrayList8;
                                            arrayList15 = arrayList6;
                                        }
                                    }
                                }
                                i6++;
                                i5 = 33554432;
                                jArr2 = jArr2;
                                arrayList3 = arrayList3;
                                arrayList15 = arrayList15;
                            }
                            arrayList4 = arrayList15;
                            if (c5313M42306 == null) {
                                identityHashMap2 = new IdentityHashMap();
                                for (int i30 : c5313M42306.m15229().f1790) {
                                    C2167.m7148(identityHashMap2, ((C1079) C3537.m10755(arrayList4, i30)).m3662(), Boolean.TRUE);
                                }
                                c8135 = new C8135(identityHashMap2, c5313M42306.m15228(), null, -1L);
                                break;
                            }
                            c8135 = null;
                            break;
                        }
                        itM12357 = C4117.m12354((ArrayList) C3019.m9263(arrayList3, i4));
                        while (C1773.m5910(itM12357)) {
                            c5316 = (C5313) RunnableC1108.m3791(itM12357);
                            if (c5316.m15228() > 33554432 && c5316.m15230() > 0) {
                                c5313M42306 = m42306(c5313M42306, c5316);
                            }
                        }
                        j4 = jArr2[i4];
                        long j14 = jArr3[i4] - j4;
                        if (j4 <= 0 && j4 <= j3 && j14 > 0) {
                            C0373 c0375 = (C0373) C3019.m9263((ArrayList) c19425.m44729(), i4);
                            int i31 = (int) j4;
                            if (j4 != i31) {
                                throw new ArithmeticException();
                            }
                            c5313M42306 = m42306(c5313M42306, new C5313(c0375, i31, j14));
                        }
                        i4++;
                    }
                } else {
                    c9048 = c9047M42307;
                }
                if (c8135 == null) {
                    return new C13778(c9048, f56531);
                }
                c90410 = c9048;
                interfaceC18883Arr = f56531;
                try {
                    try {
                        try {
                            if (c8135.m21600() == null) {
                                c3902M11889 = C3902.m11888(c8135.m21599());
                            } else {
                                c3902M11889 = C3902.m11889(c8135.m21599(), c8135.m21597(), c8135.m21600());
                            }
                            c3903 = c3902M11889;
                            try {
                                if (c3903 == null) {
                                    return new C13778(c90410, interfaceC18883Arr);
                                }
                                C9047 c9047M42308 = m42308(c90410, c8135.m21598(), c3903, interfaceC17066);
                                c3903.finish();
                                return new C13778(c9047M42308, new InterfaceC18883[]{c3903});
                            } catch (IOException e) {
                                e = e;
                                i20 = 1;
                                c = 0;
                                if (c3903 != null) {
                                    InterfaceC18883[] interfaceC18883Arr2 = new InterfaceC18883[i20];
                                    interfaceC18883Arr2[c] = c3903;
                                    m42359(interfaceC18883Arr2, e);
                                }
                                if ((e instanceof C23821) || c8135.m21600() == null) {
                                    throw e;
                                }
                                return new C13778(c90410, interfaceC18883Arr);
                            } catch (Error e2) {
                                e = e2;
                                if (c3903 != null) {
                                    m42359(new InterfaceC18883[]{c3903}, e);
                                }
                                throw e;
                            } catch (RuntimeException e3) {
                                e = e3;
                                if (c3903 != null) {
                                    m42359(new InterfaceC18883[]{c3903}, e);
                                }
                                throw e;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            c3903 = null;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        i20 = 1;
                        c = 0;
                        c3903 = null;
                    }
                } catch (Error | RuntimeException e6) {
                    e = e6;
                    c3903 = null;
                }
            }
        }
        c8135 = null;
        if (c8135 != null) {
            map = new HashMap();
            arrayList = new ArrayList();
            itM12354 = C4117.m12354(arrayList16);
            while (C1773.m5910(itM12354)) {
                C3902 c3907 = (C3902) C2272.m7513(itM12354);
                arrayList12 = (ArrayList) identityHashMap4.get(c3907);
                iArr5 = new int[C0382.m1847(arrayList12)];
                while (i19 < C3432.m10481(arrayList12)) {
                    iArr5[i19] = ((C1079) C3019.m9263(arrayList12, i19)).m3663();
                }
                c0374 = new C0373(iArr5);
                lM9026 = (Long) C0964.m3410(map, c0374);
                if (lM9026 == null) {
                    C7106.m19117(arrayList, c0374);
                    lM9026 = C2958.m9026(0L);
                }
                C3746.m11368(map, c0374, C4117.m12360(C11340.m28024(lM9026.longValue(), c3907.mo10087())));
            }
            iArr = new int[C3432.m10481(arrayList15)];
            Arrays.fill(iArr, -1);
            arrayList2 = new ArrayList();
            identityHashMap = new IdentityHashMap();
            itM9029 = C2958.m9029(arrayList15);
            while (C1773.m5910(itM9029)) {
                c1079 = (C1079) RunnableC1108.m3791(itM9029);
                if (iArr[c1079.m3663()] >= 0) {
                    iM10481 = C3432.m10481(arrayList2);
                    arrayList11 = new ArrayList();
                    arrayDeque = new ArrayDeque();
                    C1504.m5174(arrayDeque, c1079);
                    while (!C2167.m7162(arrayDeque)) {
                        c10710 = (C1079) arrayDeque.pop();
                        if (iArr[c10710.m3663()] >= 0) {
                            iArr[c10710.m3663()] = iM10481;
                            Iterator it6 = itM9029;
                            C7106.m19117(arrayList11, C3245.m9931(c10710.m3663()));
                            c3902ArrM3661 = c10710.m3661();
                            length4 = c3902ArrM3661.length;
                            int i210 = iM10481;
                            i18 = 0;
                            while (i18 < length4) {
                                int i211 = length4;
                                c3902 = c3902ArrM3661[i18];
                                C3902[] c3902Arr2 = c3902ArrM3661;
                                if (C0714.m2809(identityHashMap, c3902, Boolean.TRUE) != null) {
                                    itM12358 = C4117.m12354((ArrayList) identityHashMap4.get(c3902));
                                    while (C0483.m2123(itM12358)) {
                                        c10711 = (C1079) C2272.m7513(itM12358);
                                        if (iArr[c10711.m3663()] < 0) {
                                            C1504.m5174(arrayDeque, c10711);
                                        }
                                    }
                                }
                                i18++;
                                c3902ArrM3661 = c3902Arr2;
                                length4 = i211;
                            }
                            itM9029 = it6;
                            iM10481 = i210;
                        }
                    }
                    Iterator it7 = itM9029;
                    C6083.sort(arrayList11, new C16601(0));
                    iArr4 = new int[C0382.m1847(arrayList11)];
                    while (i17 < C3432.m10481(arrayList11)) {
                        iArr4[i17] = C0422.m1951((Integer) C3537.m10755(arrayList11, i17));
                    }
                    C7106.m19117(arrayList2, new C0373(iArr4));
                    itM9029 = it7;
                }
            }
            c19425 = new C19425(arrayList2, iArr);
            iM1847 = C0382.m1847((ArrayList) c19425.m44729());
            jArr = new long[iM1847];
            jArr2 = new long[iM1847];
            arrayList3 = new ArrayList(iM1847);
            while (i < iM1847) {
                C1916.m6307(arrayList3, new ArrayList());
            }
            itM90210 = C2958.m9029(arrayList);
            while (C1773.m5910(itM90210)) {
                c0373 = (C0373) C2272.m7513(itM90210);
                iArr3 = c0373.f1790;
                i14 = 0;
                c9049 = c9047M42307;
                jM3496 = 0;
                while (i14 < length3) {
                    jM3496 = C1005.m3495(jM3496, ((C1079) C3537.m10755(arrayList15, iArr3[i14])).m3664());
                    i14++;
                    itM90210 = itM90210;
                    iArr3 = iArr3;
                }
                it = itM90210;
                int i212 = c19425.m44728()[c0373.f1790[0]];
                jLongValue = ((Long) C0964.m3410(map, c0373)).longValue();
                j6 = j2;
                jArr[i212] = C1005.m3495(jArr[i212], jLongValue);
                arrayList10 = (ArrayList) C3019.m9263(arrayList3, i212);
                i15 = (int) jM3496;
                i16 = iM1847;
                jArr5 = jArr;
                if (jM3496 == i15) {
                    throw new ArithmeticException();
                }
                C1916.m6307(arrayList10, new C5313(c0373, i15, jLongValue - jM3496));
                c9047M42307 = c9049;
                itM90210 = it;
                j2 = j6;
                iM1847 = i16;
                jArr = jArr5;
            }
            c9048 = c9047M42307;
            i2 = iM1847;
            jArr3 = jArr;
            j3 = j2;
            itM12355 = C4117.m12354(arrayList15);
            while (C1773.m5910(itM12355)) {
                C1079 c10714 = (C1079) C2272.m7513(itM12355);
                int i213 = c19425.m44728()[c10714.m3663()];
                jArr2[i213] = C11340.m28024(jArr2[i213], c10714.m3664());
            }
            jM28024 = 0;
            while (i3 < i2) {
                j5 = jArr3[i3] - jArr2[i3];
                if (j5 > 0) {
                    jM28024 = C11340.m28024(jM28024, j5);
                }
            }
            if (jM28024 <= j3) {
                c8135 = null;
                break;
            }
            i4 = 0;
            c5313M42306 = null;
            while (true) {
                i5 = 33554432;
                if (i4 < i2) {
                    i6 = 0;
                    i7 = 1048576;
                    loop19: while (i6 < C0382.m1847(arrayList3)) {
                        if (jArr2[i6] > j3) {
                            arrayList5 = (ArrayList) C3019.m9263(arrayList3, i6);
                            if (C3432.m10481(arrayList5) >= 2) {
                                C6083.sort(arrayList5, new C10958());
                                i9 = 0;
                                while (i9 < C0382.m1847(arrayList5)) {
                                    c5313 = (C5313) C3537.m10755(arrayList5, i9);
                                    if (c5313.m15228() > i5) {
                                        arrayList6 = arrayList15;
                                        arrayList7 = arrayList5;
                                        i10 = i9;
                                        jArr4 = jArr2;
                                        arrayList8 = arrayList3;
                                    } else {
                                        c0373M15229 = c5313.m15229();
                                        int iM15229 = c5313.m15228();
                                        long jM15232 = c5313.m15230() + ((long) iM15229);
                                        if (c5313.m15230() > 0) {
                                            c5313M42306 = m42306(c5313M42306, c5313);
                                        }
                                        while (true) {
                                            itM12356 = C4117.m12354(arrayList5);
                                            c5314 = null;
                                            long j15 = 0;
                                            long j16 = 0;
                                            while (C0483.m2123(itM12356)) {
                                                c5315 = (C5313) C2272.m7513(itM12356);
                                                arrayList9 = arrayList5;
                                                length = c5315.m15229().f1790.length;
                                                if (length > i7) {
                                                    break loop19;
                                                    break loop19;
                                                }
                                                int i214 = i7 - length;
                                                iArr2 = c5315.m15229().f1790;
                                                length2 = iArr2.length;
                                                z = false;
                                                Iterator it8 = itM12356;
                                                i11 = 0;
                                                long[] jArr7 = jArr2;
                                                ArrayList arrayList110 = arrayList3;
                                                jM3495 = 0;
                                                while (i11 < length2) {
                                                    int i215 = length2;
                                                    i13 = iArr2[i11];
                                                    if (c0373M15229.m1826(i13)) {
                                                        z = true;
                                                    } else {
                                                        jM3495 = C1005.m3495(jM3495, ((C1079) C3537.m10755(arrayList15, i13)).m3664());
                                                    }
                                                    i11++;
                                                    length2 = i215;
                                                    arrayList15 = arrayList15;
                                                }
                                                ArrayList arrayList21 = arrayList15;
                                                if (z) {
                                                    i12 = i9;
                                                } else {
                                                    i12 = i9;
                                                }
                                                arrayList5 = arrayList9;
                                                i9 = i12;
                                                i7 = i214;
                                                itM12356 = it8;
                                                jArr2 = jArr7;
                                                arrayList3 = arrayList110;
                                                arrayList15 = arrayList21;
                                            }
                                            arrayList6 = arrayList15;
                                            arrayList7 = arrayList5;
                                            i10 = i9;
                                            jArr4 = jArr2;
                                            arrayList8 = arrayList3;
                                            if (c5314 == null) {
                                                break;
                                            }
                                            break;
                                            break;
                                            arrayList5 = arrayList7;
                                            i9 = i10;
                                            jArr2 = jArr4;
                                            arrayList3 = arrayList8;
                                            arrayList15 = arrayList6;
                                        }
                                    }
                                    i9 = i10 + 1;
                                    i5 = 33554432;
                                    arrayList5 = arrayList7;
                                    jArr2 = jArr4;
                                    arrayList3 = arrayList8;
                                    arrayList15 = arrayList6;
                                }
                            }
                        }
                        i6++;
                        i5 = 33554432;
                        jArr2 = jArr2;
                        arrayList3 = arrayList3;
                        arrayList15 = arrayList15;
                    }
                    arrayList4 = arrayList15;
                    if (c5313M42306 == null) {
                        identityHashMap2 = new IdentityHashMap();
                        while (i8 < r2) {
                            C2167.m7148(identityHashMap2, ((C1079) C3537.m10755(arrayList4, i30)).m3662(), Boolean.TRUE);
                        }
                        c8135 = new C8135(identityHashMap2, c5313M42306.m15228(), null, -1L);
                        break;
                    }
                    c8135 = null;
                    break;
                }
                itM12357 = C4117.m12354((ArrayList) C3019.m9263(arrayList3, i4));
                while (C1773.m5910(itM12357)) {
                    c5316 = (C5313) RunnableC1108.m3791(itM12357);
                    if (c5316.m15228() > 33554432) {
                    }
                }
                j4 = jArr2[i4];
                long j17 = jArr3[i4] - j4;
                if (j4 <= 0) {
                }
                i4++;
            }
        } else {
            c9048 = c9047M42307;
        }
        if (c8135 == null) {
            return new C13778(c9048, f56531);
        }
        c90410 = c9048;
        interfaceC18883Arr = f56531;
        if (c8135.m21600() == null) {
            c3902M11889 = C3902.m11888(c8135.m21599());
        } else {
            c3902M11889 = C3902.m11889(c8135.m21599(), c8135.m21597(), c8135.m21600());
        }
        c3903 = c3902M11889;
        if (c3903 == null) {
            return new C13778(c90410, interfaceC18883Arr);
        }
        C9047 c9047M42309 = m42308(c90410, c8135.m21598(), c3903, interfaceC17066);
        c3903.finish();
        return new C13778(c9047M42309, new InterfaceC18883[]{c3903});
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42322(C9047 c9047, IdentityHashMap identityHashMap) {
        ArrayDeque arrayDeque = null;
        C9047 c9048 = null;
        InterfaceC18883 interfaceC18883 = null;
        int i = 1810693610;
        int i2 = C3683.f11629;
        int i3 = ServiceConnectionC3453.f10921;
        int iM2566 = C0630.m2566("۠᩸") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-12057)) ^ 1160464802;
        int i5 = -1237338601;
        while (true) {
            i = ((((i ^ i2) * (-24235)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2126529882:
                case -588713102:
                    if (C22628.f73083 <= 0) {
                        iM2566 = (i2 - C2105.m6981("֨ۨ")) * 75;
                        i4 = ((iM2566 ^ i3) * (-26803)) ^ 1396310319;
                        i5 = -1233066382;
                    } else {
                        iM2566 = C0630.m2566("ᩳۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 27793) ^ 379015486;
                        i5 = 191901742;
                    }
                    break;
                case -2018215469:
                case -324069074:
                    C1047.m3599();
                    if (C0964.f3626 != 0) {
                        iM2566 = (i3 - C0630.m2566("ܿ۠")) * 77;
                        i4 = ((iM2566 ^ i2) * (-5393)) ^ (-777671190);
                        i5 = -1783906833;
                    } else {
                        iM2566 = C2105.m6981("ۜۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-13149)) ^ (-527792620);
                        i5 = -760475542;
                    }
                    break;
                case -1842694563:
                case -410714215:
                    if (C1128.f4106 <= 0) {
                        iM2566 = (i2 - C2105.m6981("֨ۨ")) * 75;
                        i4 = ((iM2566 ^ i3) * (-26803)) ^ 1396310319;
                        i5 = -1233066382;
                    } else {
                        iM2566 = C2105.m6981("᩶᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * 12533) ^ (-60685313);
                        i5 = -22556238;
                    }
                    break;
                case -1830160582:
                case -1182067142:
                    C1504.m5174(arrayDeque, c9048.f27430);
                    if (C3911.f12484 >= 0) {
                        iM2566 = (i2 - C2105.m6981("֨ۨ")) * 75;
                        i4 = ((iM2566 ^ i3) * (-26803)) ^ 1396310319;
                        i5 = -1233066382;
                    } else {
                        iM2566 = (C2105.m6981("ܺ۠") ^ i2) * 47;
                        i4 = ((iM2566 ^ i3) * 26615) ^ 1232155386;
                        i5 = -1082775781;
                    }
                    break;
                case -1718976559:
                case 242184475:
                    if (C2105.f7037 != 0) {
                        iM2566 = (i3 - C2105.m6981("۠֫")) * 83;
                        i4 = ((iM2566 ^ i2) * (-26859)) ^ 824660743;
                        i5 = 951237201;
                    } else {
                        iM2566 = C0630.m2566("ܳܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 5931) ^ 81884944;
                        i5 = 919949425;
                    }
                    break;
                case -1556632189:
                case 1069448104:
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ۜۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-13149)) ^ (-527792620);
                        i5 = -760475542;
                    } else {
                        iM2566 = (C0630.m2566("᩺ܺ") ^ i3) * 95;
                        i4 = ((iM2566 ^ i2) * 30787) ^ 2135858227;
                        i5 = -1152626905;
                    }
                    break;
                case -1499399948:
                case -739996404:
                    C0422.m1963();
                    if (C0483.f2088 < 0) {
                        iM2566 = (C0630.m2566("ܿ᩶") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * 13475) ^ 810323266;
                        i5 = -588945244;
                    } else {
                        iM2566 = C2105.m6981("ۜۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-13149)) ^ (-527792620);
                        i5 = -760475542;
                    }
                    break;
                case -1353870039:
                case -396329551:
                    if (C0714.m2812(arrayDeque)) {
                        iM2566 = (i3 - C0630.m2566("᩺ܿ")) * (-77);
                        i4 = ((iM2566 ^ i2) * 26269) ^ (-1704637424);
                        i5 = -364854673;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۙ᩸")) * (-95);
                        i4 = ((iM2566 ^ i2) * (-17973)) ^ 1215700388;
                        i5 = 1215873279;
                    }
                    break;
                case -1196296130:
                case -1075747784:
                    C4263.m12819();
                    C5695.m16023();
                    iM2566 = C2105.m6981("ۜۧ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-13149)) ^ (-527792620);
                    i5 = -760475542;
                    break;
                case -1107371358:
                case 1586884411:
                    C0714.m2809(identityHashMap, (C6018) interfaceC18883, Boolean.TRUE);
                    iM2566 = C0630.m2566("ᩳ۟") ^ i2;
                    i4 = ((iM2566 ^ i3) * 20931) ^ 1074159659;
                    i5 = 1539927560;
                    break;
                case -882151138:
                case 1479296174:
                    c9048 = (C9047) arrayDeque.pop();
                    if (C1047.m3598(c9048)) {
                        iM2566 = C2105.m6981("ܽᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 5405) ^ 1631209672;
                        i5 = -1751096025;
                    } else {
                        iM2566 = C0630.m2566("֫ۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28113)) ^ 262450019;
                        i5 = 1718517831;
                    }
                    break;
                case -635288735:
                case -483713266:
                    if (C0483.f2088 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ܿ۠")) * 77;
                        i4 = ((iM2566 ^ i2) * (-5393)) ^ (-777671190);
                        i5 = -1783906833;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ᩳۘ")) * 115;
                        i4 = ((iM2566 ^ i3) * 30595) ^ 2125923706;
                        i5 = -744800160;
                    }
                    break;
                case -557368097:
                case 1513707321:
                    if (C3911.f12484 >= 0) {
                        iM2566 = (i2 - C2105.m6981("֨ۨ")) * 75;
                        i4 = ((iM2566 ^ i3) * (-26803)) ^ 1396310319;
                        i5 = -1233066382;
                    } else {
                        iM2566 = C0630.m2566("ܿ֫") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-12031)) ^ 1013660165;
                        i5 = 1841867162;
                    }
                    break;
                case -534301318:
                case 68417176:
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C0630.m2566("ܿ᩶") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * 13475) ^ 810323266;
                        i5 = -588945244;
                    } else {
                        iM2566 = (C2105.m6981("᩶֡") + i2) * (-13);
                        i4 = ((iM2566 ^ i3) * 19933) ^ 576699774;
                        i5 = 1245055703;
                    }
                    break;
                case -248387533:
                case 1436192695:
                    if (C4616.m13552() != 0) {
                        iM2566 = (i3 - C0630.m2566("ܿ۠")) * 77;
                        i4 = ((iM2566 ^ i2) * (-5393)) ^ (-777671190);
                        i5 = -1783906833;
                    } else {
                        iM2566 = C0630.m2566("᩷֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 2603) ^ 234997193;
                        i5 = -85226782;
                    }
                    break;
                case -97547513:
                case 1537608734:
                    C1504.m5174(arrayDeque, c9048.f27426);
                    iM2566 = C0630.m2566("ᩳ۟") ^ i2;
                    i4 = ((iM2566 ^ i3) * 20931) ^ 1074159659;
                    i5 = 1539927560;
                    break;
                case -80419179:
                case 170090140:
                    C1504.m5174(arrayDeque, c9047);
                    iM2566 = C0630.m2566("ᩳ۟") ^ i2;
                    i4 = ((iM2566 ^ i3) * 20931) ^ 1074159659;
                    i5 = 1539927560;
                    break;
                case -39104670:
                case 1344600254:
                    break;
                case 353406429:
                case 606854881:
                    C1005.m3501();
                    if (C0050.f910 >= 0) {
                        iM2566 = (i3 - C2105.m6981("۠֫")) * 83;
                        i4 = ((iM2566 ^ i2) * (-26859)) ^ 824660743;
                        i5 = 951237201;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ܿ۠")) * 77;
                        i4 = ((iM2566 ^ i2) * (-5393)) ^ (-777671190);
                        i5 = -1783906833;
                    }
                    break;
                case 534685494:
                case 2069326465:
                    interfaceC18883 = c9048.f27427.f67896;
                    if (interfaceC18883 instanceof C6018) {
                        iM2566 = (C2105.m6981("ܶ֡") ^ i3) * 67;
                        i4 = ((iM2566 ^ i2) * 941) ^ 946364181;
                        i5 = -1185440397;
                    } else {
                        iM2566 = C0630.m2566("ᩳ۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * 20931) ^ 1074159659;
                        i5 = 1539927560;
                    }
                    break;
                case 640354828:
                case 1509314330:
                    C2958.m9034();
                    break;
                case 955741916:
                case 1421622483:
                    arrayDeque = new ArrayDeque();
                    if (C4117.f13076 <= 0) {
                        iM2566 = (i3 - C0630.m2566("ܿ۠")) * 77;
                        i4 = ((iM2566 ^ i2) * (-5393)) ^ (-777671190);
                        i5 = -1783906833;
                    } else {
                        iM2566 = (C0630.m2566("ۜܰ") ^ i3) * 81;
                        i4 = ((iM2566 ^ i2) * 23559) ^ (-1033311724);
                        i5 = -980698548;
                    }
                    break;
                default:
                    if (c9047 == null) {
                        iM2566 = (i3 - C0630.m2566("᩺ܿ")) * (-77);
                        i4 = ((iM2566 ^ i2) * 26269) ^ (-1704637424);
                        i5 = -364854673;
                    } else {
                        iM2566 = (C2105.m6981("۫۫") ^ i2) * (-3);
                        i4 = ((iM2566 ^ i3) * (-2943)) ^ (-795062874);
                        i5 = 446553221;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m42358(C9047 c9047, IdentityHashMap identityHashMap, ArrayList arrayList) {
        int iM2566;
        int i;
        C21042 c21042 = null;
        InterfaceC18883 interfaceC18883 = null;
        int i2 = 0;
        C6018 c6018 = null;
        Long l2 = null;
        long jM3495 = 0;
        int i3 = -1211264827;
        int i4 = RunnableC0588.f2309;
        int i5 = RunnableC1937.f6483;
        int iM2567 = (C0630.m2566("֨ܳ") ^ i4) * (-115);
        int i6 = ((iM2567 ^ i5) * 785) ^ (-1845037134);
        int i7 = 68230069;
        while (true) {
            int i8 = iM2567 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i5) * 26081) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1940255136:
                    case -1021096571:
                        if (!C1711.f5919) {
                            iM2567 = (i5 - C0630.m2566("ۘۖ")) * (-91);
                            i6 = ((iM2567 ^ i4) * 9915) ^ (-427375938);
                            i7 = 902538672;
                        } else {
                            iM2567 = C0630.m2566("᩵۟") ^ i5;
                            i6 = ((iM2567 ^ i4) * 5613) ^ (-611140740);
                            i7 = 1861601654;
                        }
                        break;
                    case -1870047017:
                    case 722601301:
                        C2167.m7148(identityHashMap, c6018, C4117.m12360(jM3495));
                        iM2567 = C0630.m2566("᩸ۨ") ^ i5;
                        i6 = ((iM2567 ^ i4) * 10697) ^ 961184207;
                        i7 = 2145278231;
                        break;
                    case -1629706167:
                    case -15389354:
                        if (C3911.m11924() <= 0) {
                            iM2567 = C0630.m2566("ۘ֫") ^ i4;
                            i6 = ((iM2567 ^ i5) * 16107) ^ 1571809123;
                            i7 = -791813298;
                        } else {
                            iM2567 = (C2105.m6981("ۜܶ") ^ i5) * 47;
                            i6 = ((iM2567 ^ i4) * (-24965)) ^ (-1951571740);
                            i7 = -2103848104;
                        }
                        break;
                    case -1582315400:
                    case 1246855005:
                        C0714.m2809(identityHashMap, c6018, C2958.m9026(i2));
                        C7106.m19117(arrayList, c6018);
                        break;
                    case -1430094891:
                    case -81731853:
                        if (C3911.f12484 < 0) {
                            iM2567 = C0630.m2566("᩵۟") ^ i5;
                            i6 = ((iM2567 ^ i4) * 5613) ^ (-611140740);
                            i7 = 1861601654;
                            break;
                        }
                        iM2567 = C0630.m2566("ۘ֫") ^ i4;
                        i6 = ((iM2567 ^ i5) * 16107) ^ 1571809123;
                        i7 = -791813298;
                        break;
                    case -1338792325:
                    case -511839579:
                        m42358(c9047.f27426, identityHashMap, arrayList);
                        m42358(c9047.f27430, identityHashMap, arrayList);
                        break;
                    case -1154598389:
                    case -131915673:
                        jM3495 = C1005.m3495(l2.longValue(), i2);
                        if (C3911.m11924() > 0) {
                            iM2567 = C2105.m6981("ۗ᩶") ^ i4;
                            i6 = ((iM2567 ^ i5) * 12635) ^ 468988252;
                            i7 = -1293347707;
                        } else {
                            iM2567 = C0630.m2566("᩵۟") ^ i5;
                            i6 = ((iM2567 ^ i4) * 5613) ^ (-611140740);
                            i7 = 1861601654;
                        }
                        break;
                    case -1071195596:
                    case -352326146:
                        if (C1773.f6144 > 0) {
                            iM2567 = (i5 - C0630.m2566("֨ᩳ")) * (-43);
                            i6 = ((iM2567 ^ i4) * (-8289)) ^ 380315705;
                            i7 = -1107811186;
                        } else {
                            iM2567 = (C2105.m6981("ۘۤ") + i4) * (-67);
                            i6 = ((iM2567 ^ i5) * (-28193)) ^ (-1947371603);
                            i7 = -1535600806;
                        }
                        break;
                    case -957344061:
                    case 380261973:
                        C3746.m11369();
                        C0798.m2998();
                        iM2567 = (C2105.m6981("ۜܶ") ^ i5) * 47;
                        i6 = ((iM2567 ^ i4) * (-24965)) ^ (-1951571740);
                        i7 = -2103848104;
                        break;
                    case -804307103:
                    case -573014771:
                        if (ViewOnClickListenerC1958.f6529 > 0) {
                            iM2567 = C0630.m2566("ܿ᩸") ^ i5;
                            i6 = ((iM2567 ^ i4) * (-14195)) ^ 999566150;
                            i7 = -769187143;
                        } else {
                            iM2567 = (C2105.m6981("ۘۤ") + i4) * (-67);
                            i6 = ((iM2567 ^ i5) * (-28193)) ^ (-1947371603);
                            i7 = -1535600806;
                        }
                        break;
                    case -555806359:
                    case 1244937032:
                        C0714.m2805();
                        C5695.m16023();
                        break;
                    case -297878195:
                    case 1672940767:
                        break;
                    case -108786315:
                    case 915304806:
                        if (C3019.f9544 < 0) {
                            iM2567 = C2105.m6981("ᩳۘ") ^ i4;
                            i6 = ((iM2567 ^ i5) * (-15357)) ^ (-1795983094);
                            i7 = 1929848980;
                        } else {
                            iM2567 = C0630.m2566("ۘ֫") ^ i4;
                            i6 = ((iM2567 ^ i5) * 16107) ^ 1571809123;
                            i7 = -791813298;
                        }
                        break;
                    case 110579371:
                    case 1013601316:
                        if (C2105.f7037 == 0) {
                            iM2567 = C0630.m2566("۫ۙ") ^ i4;
                            i6 = ((iM2567 ^ i5) * 21569) ^ 1546283380;
                            i7 = -1299085140;
                        } else {
                            iM2567 = (C0630.m2566("ۖۡ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i6 = ((iM2567 ^ i5) * b.g) ^ (-784173436);
                            i7 = 254596559;
                        }
                        break;
                    case 192267192:
                    case 1440745895:
                        interfaceC18883 = c21042.f67896;
                        i2 = c21042.f67894;
                        if (!(interfaceC18883 instanceof C6018)) {
                            iM2567 = C0630.m2566("᩸ۨ") ^ i5;
                            i6 = ((iM2567 ^ i4) * 10697) ^ 961184207;
                            i7 = 2145278231;
                            break;
                            break;
                        }
                        iM2567 = C0630.m2566("ۜܰ") ^ i4;
                        i6 = ((iM2567 ^ i5) * (-10553)) ^ 722739413;
                        i7 = -1287955874;
                        break;
                    case 687398213:
                    case 1207678030:
                        if (C11340.f33930 < 0) {
                            iM2567 = (C0630.m2566("ᩳ۠") + i5) * (-59);
                            i6 = ((iM2567 ^ i4) * 17281) ^ (-1297256017);
                            i7 = 1764980085;
                        } else {
                            iM2567 = (C0630.m2566("ۖۡ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i6 = ((iM2567 ^ i5) * b.g) ^ (-784173436);
                            i7 = 254596559;
                        }
                        break;
                    case 717258277:
                    case 870600455:
                        c6018 = (C6018) interfaceC18883;
                        l2 = (Long) identityHashMap.get(c6018);
                        if (l2 != null) {
                            iM2567 = (i5 - C0630.m2566("۟֨")) * (-41);
                            i6 = ((iM2567 ^ i4) * (-26259)) ^ (-2024217612);
                            i7 = 428506460;
                        } else {
                            iM2567 = C0630.m2566("֨ۘ") ^ i5;
                            i6 = ((iM2567 ^ i4) * (-2365)) ^ (-550957318);
                            i7 = -609085881;
                        }
                        break;
                    case 728410701:
                    case 920637362:
                        boolean zM3598 = C1047.m3598(c9047);
                        C21042 c21043 = c9047.f27427;
                        if (zM3598) {
                            iM2566 = (i4 - C0630.m2566("᩷ܽ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i6 = ((iM2566 ^ i5) * (-15191)) ^ (-590528436);
                            i = 746431497;
                        } else {
                            iM2566 = (i5 - C0630.m2566("ᩴ᩸")) * (-85);
                            i6 = ((iM2566 ^ i4) * (-6617)) ^ 1031872101;
                            i = 1897007687;
                        }
                        i8 = iM2566 ^ i;
                        c21042 = c21043;
                        break;
                    case 1136920202:
                    case 2113337632:
                        if (C1420.f5096 > 0) {
                            iM2567 = C0630.m2566("᩷ᩳ") ^ i4;
                            i6 = ((iM2567 ^ i5) * 23951) ^ 1614122899;
                            i7 = -832625919;
                        } else {
                            iM2567 = (C2105.m6981("ۜܶ") ^ i5) * 47;
                            i6 = ((iM2567 ^ i4) * (-24965)) ^ (-1951571740);
                            i7 = -2103848104;
                        }
                        break;
                    case 1228326194:
                    case 1876334499:
                        if (C3663.m11168() < 0) {
                            iM2567 = (C2105.m6981("ۘۤ") + i4) * (-67);
                            i6 = ((iM2567 ^ i5) * (-28193)) ^ (-1947371603);
                            i7 = -1535600806;
                            break;
                        }
                        iM2567 = (C2105.m6981("ۜܶ") ^ i5) * 47;
                        i6 = ((iM2567 ^ i4) * (-24965)) ^ (-1951571740);
                        i7 = -2103848104;
                        break;
                    case 1241179478:
                    case 1470599794:
                        if (C7106.f21815 == 0) {
                            iM2567 = (C0630.m2566("ۤᩳ") + i4) * 63;
                            i6 = ((iM2567 ^ i5) * 28149) ^ (-1851773181);
                            i7 = -842653049;
                        } else {
                            iM2567 = C0630.m2566("ۘ֫") ^ i4;
                            i6 = ((iM2567 ^ i5) * 16107) ^ 1571809123;
                            i7 = -791813298;
                        }
                        break;
                    default:
                        if (C2167.f7158 < 0) {
                            iM2567 = (C2105.m6981("ۛܿ") + i4) * 51;
                            i6 = ((iM2567 ^ i5) * 27215) ^ (-76019550);
                            i7 = -1412892350;
                        } else {
                            iM2567 = (C0630.m2566("ۖۡ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i6 = ((iM2567 ^ i5) * b.g) ^ (-784173436);
                            i7 = 254596559;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x018a A[PHI: r1 r2
      0x018a: PHI (r1v4 char) = (r1v3 char), (r1v2 char), (r1v2 char) binds: [B:54:0x0188, B:50:0x0169, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x018a: PHI (r2v4 short) = (r2v2 short), (r2v3 short), (r2v2 short) binds: [B:54:0x0188, B:50:0x0169, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01bc A[PHI: r3 r6
      0x01bc: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:58:0x01ba, B:46:0x0148, B:38:0x00f4, B:27:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:58:0x01ba, B:46:0x0148, B:38:0x00f4, B:27:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (l.RunnableC1937.f6483 < 0) goto L11;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static IOException m42352(String str) {
        int iM2566;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1268795732;
        int i8 = RunnableC0588.f2309;
        int i9 = C5695.f17556;
        int iM6981 = (i8 - C2105.m6981("ۧۤ")) * (-15);
        int i10 = ((iM6981 ^ i9) * (-24981)) ^ (-441599052);
        int i11 = 1748165508;
        while (true) {
            int i12 = iM6981 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i9) * (-22531)) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -2100905795:
                    case 1273464774:
                        i4 = i3 * i3;
                        s2 = 2;
                        if (C3537.f11231 >= 0) {
                            iM2566 = (i8 - C2105.m6981("ۨ᩶")) * (-3);
                            i = ((iM2566 ^ i9) * (-27789)) ^ (-457864462);
                            i2 = 950729661;
                        } else {
                            iM2566 = C2105.m6981("᩺ۛ") ^ i8;
                            i = ((iM2566 ^ i9) * (-16433)) ^ (-1229376168);
                            i2 = 1704451502;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1933618048:
                    case 577088238:
                        if ((i5 + 1) - i4 > 0) {
                            iM2566 = (C0630.m2566("ܰۘ") + i9) * 115;
                            i = ((iM2566 ^ i8) * 29705) ^ 1853021615;
                            i2 = 147601387;
                        } else {
                            iM2566 = C2105.m6981("ۚۙ") ^ i9;
                            i = ((iM2566 ^ i8) * (-2669)) ^ 2012186413;
                            i2 = -1215811748;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1837492682:
                    case -1789193931:
                        sArr = f56533;
                        if (C2105.f7037 != 0) {
                            iM2566 = (i9 - C0630.m2566("᩺֨")) * (-37);
                            i = ((iM2566 ^ i8) * 14259) ^ 126884554;
                            i2 = 1330402289;
                        } else {
                            iM2566 = (i8 - C0630.m2566("ۖ֨")) * 57;
                            i = ((iM2566 ^ i9) * 8565) ^ 1703789346;
                            i2 = 370368380;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1729722778:
                    case -648577797:
                        i6 = 59043;
                        iM2566 = C0630.m2566("᩶ܿ") ^ i8;
                        i = ((iM2566 ^ i9) * 625) ^ (-451860806);
                        i2 = -1090116849;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1362180098:
                    case 1771936365:
                        break;
                    case -506911217:
                    case -59827808:
                        i5 = s * s2;
                        if (C0964.m3413()) {
                            iM2566 = (C2105.m6981("ۖ᩷") ^ i8) * (-9);
                            i = ((iM2566 ^ i9) * 14583) ^ 1705660077;
                            i2 = 445844290;
                        } else {
                            iM2566 = (C2105.m6981("᩸ܺ") ^ i9) * (-65);
                            i = ((iM2566 ^ i8) * (-11483)) ^ 1805360429;
                            i2 = -731106087;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -329025934:
                    case 654239529:
                        short[] sArr2 = f56533;
                        if (ServiceConnectionC3453.m10564() > 0) {
                            if (C7811.f24123 >= 0) {
                            }
                            if (C11340.m28031()) {
                                return new IOException(C20094.m46315(C0382.m1840(sArr2, 825, 24, i6), str));
                            }
                        }
                        iM2566 = (C2105.m6981("᩸ܺ") ^ i9) * (-65);
                        i = ((iM2566 ^ i8) * (-11483)) ^ 1805360429;
                        i2 = -731106087;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -296817539:
                    case -118107494:
                        i3 = s + 1;
                        if (C2167.f7158 >= 0) {
                            iM2566 = (C2105.m6981("᩸ܺ") ^ i9) * (-65);
                            i = ((iM2566 ^ i8) * (-11483)) ^ 1805360429;
                            i2 = -731106087;
                        } else {
                            iM2566 = (i9 - C0630.m2566("ۨ֨")) * (-105);
                            i = ((iM2566 ^ i8) * (-16061)) ^ 1579953601;
                            i2 = 914056876;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -130836830:
                    case 277016156:
                        C3746.m11369();
                        RunnableC3474.m10630();
                        return null;
                    case 178530592:
                    case 1958325612:
                        C2126.m7040();
                        iM2566 = (i9 - C0630.m2566("᩺֨")) * (-37);
                        i = ((iM2566 ^ i8) * 14259) ^ 126884554;
                        i2 = 1330402289;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case 249798049:
                    case 1593320201:
                        if (C0798.m2998() != 0) {
                            iM2566 = (C2105.m6981("᩸ܺ") ^ i9) * (-65);
                            i = ((iM2566 ^ i8) * (-11483)) ^ 1805360429;
                            i2 = -731106087;
                        } else {
                            iM2566 = C2105.m6981("ۘۖ") ^ i9;
                            i = ((iM2566 ^ i8) * 25917) ^ 719553274;
                            i2 = -1358130953;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case 296274930:
                    case 942705099:
                        ViewOnClickListenerC1958.m6429();
                        if (C3746.f11829 <= 0) {
                            iM2566 = C2105.m6981("ۜᩴ") ^ i8;
                            i = ((iM2566 ^ i9) * (-10823)) ^ 1461412501;
                            i2 = 596447521;
                            i12 = iM2566 ^ i2;
                            i10 = i;
                        }
                        iM2566 = (i9 - C0630.m2566("᩺֨")) * (-37);
                        i = ((iM2566 ^ i8) * 14259) ^ 126884554;
                        i2 = 1330402289;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case 977303754:
                    case 1111190110:
                        c = 824;
                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                            iM2566 = C2105.m6981("ۜᩴ") ^ i8;
                            i = ((iM2566 ^ i9) * (-10823)) ^ 1461412501;
                            i2 = 596447521;
                        } else {
                            iM2566 = (i9 - C0630.m2566("۠ܽ")) * 13;
                            i = ((iM2566 ^ i8) * 13291) ^ (-386292774);
                            i2 = 1383557228;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case 1424481691:
                    case 1505106910:
                        s = sArr[c];
                        if (C3911.f12484 >= 0) {
                            iM2566 = C2105.m6981("ۜᩴ") ^ i8;
                            i = ((iM2566 ^ i9) * (-10823)) ^ 1461412501;
                            i2 = 596447521;
                        } else {
                            iM2566 = (C2105.m6981("ۡۗ") ^ i8) * 53;
                            i = ((iM2566 ^ i9) * 32183) ^ 925182321;
                            i2 = 403421143;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case 1522521140:
                    case 1638031964:
                        i6 = 7479;
                        iM2566 = C0630.m2566("᩶ܿ") ^ i8;
                        i = ((iM2566 ^ i9) * 625) ^ (-451860806);
                        i2 = -1090116849;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    default:
                        C2167.m7155();
                        if (C1294.m4372() > 0) {
                        }
                        iM2566 = (i8 - C2105.m6981("ۨ᩶")) * (-3);
                        i = ((iM2566 ^ i9) * (-27789)) ^ (-457864462);
                        i2 = 950729661;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                }
            }
            iM6981 = (i9 - C2105.m6981("ܿ֡")) * 75;
            i10 = ((iM6981 ^ i8) * (-23723)) ^ 1622688187;
            i11 = -802307111;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0240 A[PHI: r17
      0x0240: PHI (r17v4 java.lang.Long) = (r17v1 java.lang.Long), (r17v3 java.lang.Long), (r17v1 java.lang.Long), (r17v1 java.lang.Long) binds: [B:196:0x0240, B:71:0x023e, B:34:0x00f3, B:27:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
    
        if (l.C1005.f3721 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f3, code lost:
    
        if (l.C7106.f21815 != 0) goto L8;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C9047 m42307(C9047 c9047, long j, C21541 c21541) {
        IdentityHashMap identityHashMap;
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4;
        ArrayList arrayList;
        int iM2566;
        int i5;
        ArrayList arrayList2;
        int iM6983;
        int i6;
        int i7;
        long j2;
        int iM6984;
        int i8;
        int i9;
        int iM2567;
        int i10;
        long j3 = 0;
        IdentityHashMap identityHashMap2 = null;
        ArrayDeque arrayDeque = null;
        IdentityHashMap identityHashMap3 = null;
        IdentityHashMap identityHashMap4 = null;
        Iterator itM12354 = null;
        C6018 c6018 = null;
        InterfaceC18883[] interfaceC18883Arr = null;
        int length = 0;
        C3902 c3902 = null;
        Object obj = null;
        Long l2 = null;
        long jLongValue = 0;
        long jMo10087 = 0;
        long j4 = 0;
        int i11 = 2124236104;
        int i12 = AbstractC2021.f6743;
        int i13 = C4117.f13076;
        int iM6985 = C2105.m6981("ۨܺ") ^ i13;
        int i14 = ((iM6985 ^ i12) * (-32277)) ^ 1525847720;
        int i15 = iM6985 ^ 1226589640;
        IdentityHashMap identityHashMap5 = null;
        InterfaceC18883 interfaceC18883 = null;
        int i16 = 0;
        C9047 c9047M42309 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i12) * (-29299)) >> 31));
            switch (i11) {
                case -2066030773:
                case 1981008114:
                    return c9047M42309;
                case -1908679846:
                case 504122437:
                    return c9047;
                case -1741136801:
                case -1080073256:
                    identityHashMap5 = identityHashMap5;
                    j3 = j3;
                    identityHashMap4 = new IdentityHashMap();
                    if (C4075.f12947 >= 0) {
                        iM6981 = (i13 - C2105.m6981("᩺ۧ")) * 5;
                        i = ((iM6981 ^ i12) * (-5919)) ^ 369879718;
                        i2 = -1597953651;
                    } else {
                        iM6981 = (C0630.m2566("ܺ۫") + i13) * 15;
                        i = ((iM6981 ^ i12) * (-13833)) ^ (-2065115369);
                        i2 = 676317909;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    j3 = j3;
                    identityHashMap5 = identityHashMap5;
                    break;
                case -1699009279:
                case 610855827:
                    if (identityHashMap4.isEmpty()) {
                        iM6982 = (C2105.m6981("ۡܳ") ^ i13) * (-5);
                        i3 = ((iM6982 ^ i12) * 4609) ^ (-801936053);
                        i4 = 1344131474;
                    } else {
                        iM6982 = (C2105.m6981("ۧۤ") ^ i13) * (-47);
                        i3 = ((iM6982 ^ i12) * (-27857)) ^ (-431873913);
                        i4 = -1207266362;
                    }
                    i15 = iM6982 ^ i4;
                    i14 = i3;
                    break;
                case -1682893700:
                case 664901883:
                    identityHashMap5 = identityHashMap5;
                    j3 = j3;
                    if (C1504.f5354) {
                        int iM6986 = C2105.m6981("᩸֨") ^ i12;
                        i15 = iM6986 ^ (-2101682470);
                        i14 = ((iM6986 ^ i13) * 8243) ^ 935935646;
                        j3 = j3;
                        arrayList4 = null;
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        m42357(c9047, arrayList5);
                        if (C1005.f3721) {
                            iM2567 = (C0630.m2566("ۤ᩶") ^ i13) * (-99);
                            i6 = ((iM2567 ^ i12) * 21459) ^ 957148776;
                            i10 = -300719589;
                        } else {
                            iM2567 = (i12 - C0630.m2566("ۘ᩺")) * (-65);
                            i6 = ((iM2567 ^ i13) * 31981) ^ 2069034225;
                            i10 = 760486510;
                        }
                        i15 = iM2567 ^ i10;
                        arrayList4 = arrayList5;
                        i14 = i6;
                        j3 = j3;
                    }
                    identityHashMap5 = identityHashMap5;
                    break;
                case -1644040505:
                case 534053437:
                    identityHashMap5 = identityHashMap5;
                    j3 = j3;
                    arrayList2 = arrayList4;
                    if (c9047 == null) {
                        j2 = j3;
                        c9047M42309 = c9047;
                        iM6984 = (C0630.m2566("ۡܽ") ^ i13) * (-3);
                        i8 = ((iM6984 ^ i12) * (-12235)) ^ (-405605531);
                        i9 = -1917328483;
                        i15 = iM6984 ^ i9;
                        i14 = i8;
                        long j5 = j2;
                        arrayList4 = arrayList2;
                        identityHashMap5 = identityHashMap5;
                        j3 = j5;
                    } else {
                        iM6983 = C2105.m6981("۟۟") ^ i12;
                        i6 = ((iM6983 ^ i13) * 32285) ^ 46046585;
                        i7 = 1614567689;
                        i15 = iM6983 ^ i7;
                        arrayList4 = arrayList2;
                        i14 = i6;
                        j3 = j3;
                        identityHashMap5 = identityHashMap5;
                    }
                    break;
                case -1643586022:
                case -255546796:
                    j3 = j3;
                    arrayList = arrayList4;
                    identityHashMap = new IdentityHashMap();
                    if (C0382.f1805) {
                        iM2566 = (i12 - C0630.m2566("᩹᩺")) * 127;
                        i3 = ((iM2566 ^ i13) * (-6045)) ^ 311467127;
                        i5 = 1030231321;
                    } else {
                        iM2566 = C0630.m2566("ۜܺ") ^ i12;
                        i3 = ((iM2566 ^ i13) * (-29165)) ^ (-39235521);
                        i5 = 614302645;
                    }
                    i15 = iM2566 ^ i5;
                    arrayList4 = arrayList;
                    j3 = j3;
                    identityHashMap5 = identityHashMap;
                    i14 = i3;
                    break;
                case -1606421934:
                case -694691053:
                    C0714.m2809(identityHashMap2, (C3902) interfaceC18883, Boolean.TRUE);
                    iM6982 = (i13 - C2105.m6981("ۖ۟")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i3 = ((iM6982 ^ i12) * 14809) ^ 1832916271;
                    i4 = 238750388;
                    i15 = iM6982 ^ i4;
                    i14 = i3;
                    break;
                case -1555678473:
                case 1476840549:
                    InterfaceC18883[] interfaceC18883Arr2 = c6018.f18478;
                    interfaceC18883Arr = interfaceC18883Arr2;
                    length = interfaceC18883Arr2.length;
                    i16 = 0;
                    iM6982 = (i12 - C2105.m6981("ۛ۬")) * 5;
                    i3 = ((iM6982 ^ i13) * (-11513)) ^ (-486506647);
                    i4 = -1965211572;
                    i15 = iM6982 ^ i4;
                    i14 = i3;
                    break;
                case -1459184548:
                case 205677388:
                    c9047M42309 = m42309(c9047, identityHashMap4, c21541);
                    identityHashMap5 = identityHashMap5;
                    long j6 = j3;
                    arrayList2 = arrayList4;
                    j2 = j6;
                    iM6984 = (C0630.m2566("ۡܽ") ^ i13) * (-3);
                    i8 = ((iM6984 ^ i12) * (-12235)) ^ (-405605531);
                    i9 = -1917328483;
                    i15 = iM6984 ^ i9;
                    i14 = i8;
                    long j7 = j2;
                    arrayList4 = arrayList2;
                    identityHashMap5 = identityHashMap5;
                    j3 = j7;
                    break;
                case -1446874864:
                case 182035802:
                    i16++;
                    iM6982 = (i12 - C2105.m6981("ۛ۬")) * 5;
                    i3 = ((iM6982 ^ i13) * (-11513)) ^ (-486506647);
                    i4 = -1965211572;
                    i15 = iM6982 ^ i4;
                    i14 = i3;
                    break;
                case -1305418604:
                case 999146518:
                    if (i16 < length) {
                        int iM2568 = C0630.m2566("ۖܺ") ^ i13;
                        i14 = ((iM2568 ^ i12) * 22151) ^ (-1944830432);
                        i15 = iM2568 ^ 197600088;
                    } else {
                        identityHashMap5 = identityHashMap5;
                        arrayList2 = arrayList4;
                        iM6983 = C2105.m6981("ۢۘ") ^ i13;
                        i6 = ((iM6983 ^ i12) * 19609) ^ 1795100027;
                        i7 = -1962080860;
                        i15 = iM6983 ^ i7;
                        arrayList4 = arrayList2;
                        i14 = i6;
                        j3 = j3;
                        identityHashMap5 = identityHashMap5;
                    }
                    break;
                case -1290075377:
                case 871761754:
                    if (jLongValue <= 65536 - j4) {
                        iM6982 = C0630.m2566("ۚۜ") ^ i12;
                        i3 = ((iM6982 ^ i13) * (-4589)) ^ (-1970535798);
                        i4 = -1722107823;
                        i15 = iM6982 ^ i4;
                        i14 = i3;
                    } else {
                        iM6981 = C2105.m6981("۬ۗ") ^ i12;
                        i = ((iM6981 ^ i13) * 27149) ^ (-10889097);
                        i2 = -493111200;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                        j3 = j3;
                        identityHashMap5 = identityHashMap5;
                    }
                    break;
                case -1271797112:
                case 493474044:
                    if (C1773.m5910(itM12354)) {
                        iM6982 = C2105.m6981("ۘۛ") ^ i12;
                        i3 = ((iM6982 ^ i13) * 2429) ^ 261979127;
                        i4 = -505434813;
                    } else {
                        iM6982 = C0630.m2566("ۘܳ") ^ i13;
                        i3 = ((iM6982 ^ i12) * (-11595)) ^ (-375002279);
                        i4 = -864916227;
                    }
                    i15 = iM6982 ^ i4;
                    i14 = i3;
                    break;
                case -1217005117:
                case 169052735:
                    c3902 = (C3902) C2272.m7513(itM12354);
                    obj = identityHashMap3.get(c3902);
                    if (C2167.f7158 < 0) {
                        iM6982 = (i13 - C2105.m6981("ۚۖ")) * (-109);
                        i3 = ((iM6982 ^ i12) * (-18845)) ^ 792297163;
                        i4 = -664725281;
                        i15 = iM6982 ^ i4;
                        i14 = i3;
                    }
                    identityHashMap = identityHashMap5;
                    j3 = j3;
                    arrayList = arrayList4;
                    iM2566 = C0630.m2566("ۜܺ") ^ i12;
                    i3 = ((iM2566 ^ i13) * (-29165)) ^ (-39235521);
                    i5 = 614302645;
                    i15 = iM2566 ^ i5;
                    arrayList4 = arrayList;
                    j3 = j3;
                    identityHashMap5 = identityHashMap;
                    i14 = i3;
                    break;
                case -1204689059:
                case 336760301:
                    c6018 = (C6018) arrayDeque.pop();
                    identityHashMap5 = identityHashMap5;
                    if (C0714.m2809(identityHashMap5, c6018, Boolean.TRUE) == null) {
                        iM6981 = C0630.m2566("֨ۡ") ^ i13;
                        j3 = j3;
                        i = ((iM6981 ^ i12) * (-2001)) ^ 242416833;
                        i2 = -175171991;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                        j3 = j3;
                        identityHashMap5 = identityHashMap5;
                    }
                    arrayList2 = arrayList4;
                    iM6983 = C2105.m6981("ۢۘ") ^ i13;
                    i6 = ((iM6983 ^ i12) * 19609) ^ 1795100027;
                    i7 = -1962080860;
                    i15 = iM6983 ^ i7;
                    arrayList4 = arrayList2;
                    i14 = i6;
                    j3 = j3;
                    identityHashMap5 = identityHashMap5;
                    break;
                case -1070765621:
                case 393442531:
                    C3911.m11924();
                    break;
                case -1047468665:
                case -64567813:
                    identityHashMap5 = identityHashMap5;
                    arrayList2 = arrayList4;
                    arrayDeque = new ArrayDeque(arrayList2);
                    iM6983 = C2105.m6981("ۢۘ") ^ i13;
                    i6 = ((iM6983 ^ i12) * 19609) ^ 1795100027;
                    i7 = -1962080860;
                    i15 = iM6983 ^ i7;
                    arrayList4 = arrayList2;
                    i14 = i6;
                    j3 = j3;
                    identityHashMap5 = identityHashMap5;
                    break;
                case -806294384:
                case 1201261448:
                    C0714.m2809(identityHashMap4, c3902, Boolean.TRUE);
                    j4 += jLongValue;
                    iM6981 = C2105.m6981("۬ۗ") ^ i12;
                    i = ((iM6981 ^ i13) * 27149) ^ (-10889097);
                    i2 = -493111200;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    j3 = j3;
                    identityHashMap5 = identityHashMap5;
                    break;
                case -742769487:
                case 1157321560:
                    RunnableC0588.m2441();
                    if (C1128.f4106 > 0) {
                        identityHashMap5 = identityHashMap5;
                        j3 = j3;
                        arrayList2 = arrayList4;
                        iM6983 = C0630.m2566("ܶ۟") ^ i13;
                        i6 = ((iM6983 ^ i12) * 295) ^ 1428709108;
                        i7 = 27924145;
                        i15 = iM6983 ^ i7;
                        arrayList4 = arrayList2;
                        i14 = i6;
                        j3 = j3;
                        identityHashMap5 = identityHashMap5;
                    } else {
                        identityHashMap = identityHashMap5;
                        j3 = j3;
                        arrayList = arrayList4;
                        iM2566 = C0630.m2566("ۜܺ") ^ i12;
                        i3 = ((iM2566 ^ i13) * (-29165)) ^ (-39235521);
                        i5 = 614302645;
                        i15 = iM2566 ^ i5;
                        arrayList4 = arrayList;
                        j3 = j3;
                        identityHashMap5 = identityHashMap;
                        i14 = i3;
                    }
                    break;
                case -736924823:
                case -86919925:
                    if (C3746.f11829 <= 0) {
                        identityHashMap5 = identityHashMap5;
                        j3 = j3;
                        iM6981 = (i13 - C2105.m6981("᩺ۧ")) * 5;
                        i = ((iM6981 ^ i12) * (-5919)) ^ 369879718;
                        i2 = -1597953651;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                        j3 = j3;
                        identityHashMap5 = identityHashMap5;
                    } else {
                        identityHashMap = identityHashMap5;
                        j3 = j3;
                        arrayList = arrayList4;
                        iM2566 = C0630.m2566("ۜܺ") ^ i12;
                        i3 = ((iM2566 ^ i13) * (-29165)) ^ (-39235521);
                        i5 = 614302645;
                        i15 = iM2566 ^ i5;
                        arrayList4 = arrayList;
                        j3 = j3;
                        identityHashMap5 = identityHashMap;
                        i14 = i3;
                    }
                    break;
                case -723532961:
                case 2010166299:
                    C0714.m2805();
                    if (C0964.f3626 == 0) {
                        iM6982 = C2105.m6981("᩻ܰ") ^ i12;
                        i3 = ((iM6982 ^ i13) * 26267) ^ 1576823683;
                        i4 = -1769678243;
                        i15 = iM6982 ^ i4;
                        i14 = i3;
                    } else {
                        identityHashMap5 = identityHashMap5;
                        j3 = j3;
                        iM6981 = (i13 - C2105.m6981("᩺ۧ")) * 5;
                        i = ((iM6981 ^ i12) * (-5919)) ^ 369879718;
                        i2 = -1597953651;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                        j3 = j3;
                        identityHashMap5 = identityHashMap5;
                    }
                    break;
                case -723032146:
                case 442835187:
                    l2 = (Long) obj;
                    if (C1504.f5354) {
                        iM6982 = C2105.m6981("֡ۚ") ^ i13;
                        i3 = ((iM6982 ^ i12) * 24113) ^ 1178817842;
                        i4 = -937576158;
                    } else {
                        iM6982 = C2105.m6981("ۘᩴ") ^ i12;
                        i3 = ((iM6982 ^ i13) * 29613) ^ 2036090358;
                        i4 = 550637235;
                    }
                    i15 = iM6982 ^ i4;
                    i14 = i3;
                    break;
                case -688479304:
                case 1254464758:
                    C3663.m11175(arrayDeque, (C6018) interfaceC18883);
                    iM6982 = (i13 - C2105.m6981("ۖ۟")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i3 = ((iM6982 ^ i12) * 14809) ^ 1832916271;
                    i4 = 238750388;
                    i15 = iM6982 ^ i4;
                    i14 = i3;
                    break;
                case -601037646:
                case 1150274244:
                    C1916.m6308();
                    if (C0483.f2088 < 0) {
                        identityHashMap5 = identityHashMap5;
                        j3 = j3;
                        int iM6987 = (C2105.m6981("֡֨") + i13) * 101;
                        i15 = iM6987 ^ 1437303424;
                        i14 = ((iM6987 ^ i12) * 8773) ^ 1601821242;
                        j3 = j3;
                        arrayList3 = null;
                        identityHashMap5 = identityHashMap5;
                    } else {
                        iM6982 = C2105.m6981("֡ۚ") ^ i13;
                        i3 = ((iM6982 ^ i12) * 24113) ^ 1178817842;
                        i4 = -937576158;
                        i15 = iM6982 ^ i4;
                        i14 = i3;
                    }
                    break;
                case -574340299:
                case 1819266444:
                    identityHashMap5 = identityHashMap5;
                    j3 = j3;
                    if (C0714.m2812(arrayDeque)) {
                        iM6981 = (C2105.m6981("ۨۤ") + i12) * (-5);
                        i = ((iM6981 ^ i13) * 10519) ^ 1957399581;
                        i2 = 2103336543;
                    } else {
                        iM6981 = (C2105.m6981("۠ۡ") ^ i12) * 39;
                        i = ((iM6981 ^ i13) * 14049) ^ (-568848647);
                        i2 = 669005091;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    j3 = j3;
                    identityHashMap5 = identityHashMap5;
                    break;
                case -162079566:
                case 394645194:
                    if (jLongValue > jMo10087 / 4) {
                        iM6981 = C2105.m6981("۬ۗ") ^ i12;
                        i = ((iM6981 ^ i13) * 27149) ^ (-10889097);
                        i2 = -493111200;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                        j3 = j3;
                        identityHashMap5 = identityHashMap5;
                    } else {
                        iM6982 = (C0630.m2566("ᩴ۠") + i12) * (-113);
                        i3 = ((iM6982 ^ i13) * 3323) ^ 1767320471;
                        i4 = 240297486;
                        i15 = iM6982 ^ i4;
                        i14 = i3;
                    }
                    break;
                case 287241071:
                case 1762388872:
                    C2126.m7040();
                    if (C22628.m50615() != 0) {
                        iM6982 = C2105.m6981("֡ۚ") ^ i13;
                        i3 = ((iM6982 ^ i12) * 24113) ^ 1178817842;
                        i4 = -937576158;
                    } else {
                        iM6982 = C0630.m2566("ۚۡ") ^ i12;
                        i3 = ((iM6982 ^ i13) * (-7247)) ^ 1845712133;
                        i4 = -1970884490;
                    }
                    i15 = iM6982 ^ i4;
                    i14 = i3;
                    break;
                case 446926681:
                case 1916262376:
                    C0483.m2121();
                    C3663.m11168();
                    return null;
                case 468574645:
                case 2112861985:
                    if (interfaceC18883 instanceof C6018) {
                        iM6982 = C2105.m6981("᩸᩵") ^ i13;
                        i3 = ((iM6982 ^ i12) * (-17019)) ^ 1714869235;
                        i4 = -2143520798;
                    } else {
                        iM6982 = (i13 - C2105.m6981("ۖ۟")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((iM6982 ^ i12) * 14809) ^ 1832916271;
                        i4 = 238750388;
                    }
                    i15 = iM6982 ^ i4;
                    i14 = i3;
                    break;
                case 523924519:
                case 915803498:
                    arrayList2 = arrayList4;
                    identityHashMap5 = identityHashMap5;
                    j2 = 1048576;
                    if (j < 1048576) {
                        c9047M42309 = c9047;
                        iM6984 = (C0630.m2566("ۡܽ") ^ i13) * (-3);
                        i8 = ((iM6984 ^ i12) * (-12235)) ^ (-405605531);
                        i9 = -1917328483;
                    } else {
                        iM6984 = (C2105.m6981("ܳۚ") ^ i12) * (-89);
                        i8 = ((iM6984 ^ i13) * (-17425)) ^ (-31066020);
                        i9 = -1094053145;
                    }
                    i15 = iM6984 ^ i9;
                    i14 = i8;
                    long j8 = j2;
                    arrayList4 = arrayList2;
                    identityHashMap5 = identityHashMap5;
                    j3 = j8;
                    break;
                case 578873602:
                case 1987604396:
                    jLongValue = l2.longValue();
                    jMo10087 = c3902.mo10087();
                    if (!identityHashMap2.containsKey(c3902)) {
                        iM6982 = C2105.m6981("֫ۙ") ^ i12;
                        i3 = ((iM6982 ^ i13) * 17679) ^ (-1799384654);
                        i4 = 175266275;
                        i15 = iM6982 ^ i4;
                        i14 = i3;
                    } else {
                        iM6981 = C2105.m6981("۬ۗ") ^ i12;
                        i = ((iM6981 ^ i13) * 27149) ^ (-10889097);
                        i2 = -493111200;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                        j3 = j3;
                        identityHashMap5 = identityHashMap5;
                    }
                    break;
                case 680827306:
                case 1557684462:
                    if (jMo10087 < j3) {
                        iM6981 = C2105.m6981("۬ۗ") ^ i12;
                        i = ((iM6981 ^ i13) * 27149) ^ (-10889097);
                        i2 = -493111200;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                        j3 = j3;
                        identityHashMap5 = identityHashMap5;
                    } else {
                        iM6982 = C2105.m6981("ۧ֨") ^ i12;
                        i3 = ((iM6982 ^ i13) * 15651) ^ 873070423;
                        i4 = 1093638888;
                        i15 = iM6982 ^ i4;
                        i14 = i3;
                    }
                    break;
                case 871940058:
                case 1273999817:
                    identityHashMap5 = identityHashMap5;
                    j3 = j3;
                    identityHashMap3 = new IdentityHashMap();
                    if (C2958.f9394 < 0) {
                        iM6981 = (C2105.m6981("֫ۢ") ^ i13) * 7;
                        i = ((iM6981 ^ i12) * 1163) ^ (-1431113915);
                        i2 = 185082558;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                        j3 = j3;
                        identityHashMap5 = identityHashMap5;
                    } else {
                        identityHashMap = identityHashMap5;
                        arrayList = arrayList4;
                        iM2566 = C0630.m2566("ۜܺ") ^ i12;
                        i3 = ((iM2566 ^ i13) * (-29165)) ^ (-39235521);
                        i5 = 614302645;
                        i15 = iM2566 ^ i5;
                        arrayList4 = arrayList;
                        j3 = j3;
                        identityHashMap5 = identityHashMap;
                        i14 = i3;
                    }
                    break;
                case 953358359:
                case 1033002301:
                    itM12354 = C4117.m12354(arrayList3);
                    j4 = 0;
                    iM6981 = C2105.m6981("۬ۗ") ^ i12;
                    i = ((iM6981 ^ i13) * 27149) ^ (-10889097);
                    i2 = -493111200;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    j3 = j3;
                    identityHashMap5 = identityHashMap5;
                    break;
                case 1063417650:
                case 1611351035:
                    identityHashMap5 = identityHashMap5;
                    j3 = j3;
                    arrayList2 = arrayList4;
                    identityHashMap2 = new IdentityHashMap();
                    if (C5695.f17556 >= 0) {
                        iM6983 = C0630.m2566("ܶ۟") ^ i13;
                        i6 = ((iM6983 ^ i12) * 295) ^ 1428709108;
                        i7 = 27924145;
                    } else {
                        iM6983 = C2105.m6981("ܿۙ") ^ i13;
                        i6 = ((iM6983 ^ i12) * 28003) ^ 147344605;
                        i7 = 1902699814;
                    }
                    i15 = iM6983 ^ i7;
                    arrayList4 = arrayList2;
                    i14 = i6;
                    j3 = j3;
                    identityHashMap5 = identityHashMap5;
                    break;
                case 1418205166:
                case 1529103418:
                    identityHashMap5 = identityHashMap5;
                    j3 = j3;
                    if (C3683.f11629 >= 0) {
                        int iM6988 = (C2105.m6981("֡֨") + i13) * 101;
                        i15 = iM6988 ^ 1437303424;
                        i14 = ((iM6988 ^ i12) * 8773) ^ 1601821242;
                        j3 = j3;
                        arrayList3 = null;
                    } else {
                        ArrayList arrayList6 = new ArrayList();
                        m42323(c9047, identityHashMap3, arrayList6);
                        if (C4159.m12565() >= 0) {
                            arrayList3 = arrayList6;
                            arrayList2 = arrayList4;
                            iM6983 = C0630.m2566("ܶ۟") ^ i13;
                            i6 = ((iM6983 ^ i12) * 295) ^ 1428709108;
                            i7 = 27924145;
                            i15 = iM6983 ^ i7;
                            arrayList4 = arrayList2;
                        } else {
                            int iM2569 = (C0630.m2566("ܺۡ") ^ i12) * 85;
                            i6 = ((iM2569 ^ i13) * (-6559)) ^ 277549620;
                            i15 = iM2569 ^ 1588372075;
                            arrayList3 = arrayList6;
                        }
                        i14 = i6;
                        j3 = j3;
                    }
                    identityHashMap5 = identityHashMap5;
                    break;
                case 1436096741:
                case 1752864198:
                    C3683.m11222();
                    break;
                case 1466133119:
                case 1902537008:
                    if (!RunnableC1108.m3790()) {
                        identityHashMap5 = identityHashMap5;
                        j3 = j3;
                        int iM6989 = C2105.m6981("᩸֨") ^ i12;
                        i15 = iM6989 ^ (-2101682470);
                        i14 = ((iM6989 ^ i13) * 8243) ^ 935935646;
                        j3 = j3;
                        arrayList4 = null;
                        identityHashMap5 = identityHashMap5;
                    } else {
                        iM6982 = (C0630.m2566("ۘ᩵") + i13) * (-123);
                        i3 = ((iM6982 ^ i12) * (-22509)) ^ 1907005361;
                        i4 = 996194383;
                        i15 = iM6982 ^ i4;
                        i14 = i3;
                    }
                    break;
                case 1561223899:
                case 1792016123:
                    interfaceC18883 = interfaceC18883Arr[i16];
                    if (interfaceC18883 instanceof C3902) {
                        iM6982 = C0630.m2566("ۙܺ") ^ i13;
                        i3 = ((iM6982 ^ i12) * (-83)) ^ (-1458820672);
                        i4 = -151604364;
                    } else {
                        iM6982 = C0630.m2566("᩹᩸") ^ i12;
                        i3 = ((iM6982 ^ i13) * 18957) ^ (-1191447445);
                        i4 = 726038461;
                    }
                    i15 = iM6982 ^ i4;
                    i14 = i3;
                    break;
                default:
                    C0382.m1848();
                    identityHashMap = identityHashMap5;
                    j3 = j3;
                    arrayList = arrayList4;
                    iM2566 = C0630.m2566("ۜܺ") ^ i12;
                    i3 = ((iM2566 ^ i13) * (-29165)) ^ (-39235521);
                    i5 = 614302645;
                    i15 = iM2566 ^ i5;
                    arrayList4 = arrayList;
                    j3 = j3;
                    identityHashMap5 = identityHashMap;
                    i14 = i3;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x020e A[PHI: r16 r17
      0x020e: PHI (r16v29 l.᩷ᩳܳ) = (r16v9 l.᩷ᩳܳ), (r16v24 l.᩷ᩳܳ), (r16v33 l.᩷ᩳܳ) binds: [B:63:0x020c, B:15:0x006c, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x020e: PHI (r17v29 l.ۡᩳܳ) = (r17v10 l.ۡᩳܳ), (r17v24 l.ۡᩳܳ), (r17v32 l.ۡᩳܳ) binds: [B:63:0x020c, B:15:0x006c, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x02e5 A[PHI: r16 r17
      0x02e5: PHI (r16v11 l.᩷ᩳܳ) = (r16v4 l.᩷ᩳܳ), (r16v5 l.᩷ᩳܳ), (r16v7 l.᩷ᩳܳ), (r16v12 l.᩷ᩳܳ) binds: [B:83:0x02e3, B:79:0x02c5, B:71:0x0270, B:54:0x01a4] A[DONT_GENERATE, DONT_INLINE]
      0x02e5: PHI (r17v12 l.ۡᩳܳ) = (r17v5 l.ۡᩳܳ), (r17v6 l.ۡᩳܳ), (r17v8 l.ۡᩳܳ), (r17v13 l.ۡᩳܳ) binds: [B:83:0x02e3, B:79:0x02c5, B:71:0x0270, B:54:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if (l.C1005.f3721 == false) goto L18;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C9047 m42354(C9047 c9047, IdentityHashMap identityHashMap, C21541 c21541) {
        C21042 c21042;
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        C21042 c21043;
        int iM2567;
        int i4;
        int i5;
        int i6 = C3019.f9544;
        int i7 = C0483.f2088;
        int iM2568 = (i7 - C0630.m2566("ܽ۟")) * 53;
        int i8 = ((iM2568 ^ i6) * (-7801)) ^ (-113799001);
        InterfaceC18883 interfaceC18883 = null;
        byte[] bArr = null;
        int i9 = iM2568 ^ (-451497054);
        int i10 = 0;
        int i11 = 0;
        int i12 = 2106468486;
        C21042 c21044 = null;
        C9047 c9047M42354 = null;
        C9047 c9047M42355 = null;
        C9047 c9048 = null;
        C9047 c9049 = null;
        while (true) {
            i12 = i9 ^ (i8 & (((i12 ^ i6) * (-20413)) >> 31));
            switch (i12) {
                case -1979952100:
                case 2023027441:
                    c9047M42355 = c9047M42355;
                    c21042 = c21044;
                    if (C5695.f17556 >= 0) {
                        iM6981 = (C0630.m2566("ܰۛ") ^ i6) * (-119);
                        i = ((iM6981 ^ i7) * 6407) ^ 759843204;
                        i2 = -1399588911;
                    } else {
                        iM6981 = C0630.m2566("ܳۗ") ^ i7;
                        i = ((iM6981 ^ i6) * 17431) ^ 858467749;
                        i2 = -722819148;
                    }
                    int i13 = iM6981 ^ i2;
                    c21044 = c21042;
                    i9 = i13;
                    i8 = i;
                    c9047M42355 = c9047M42355;
                    break;
                case -1925067555:
                case 626892677:
                    c9047M42355 = c9047M42355;
                    c21042 = c21044;
                    if (C4075.m12263() <= 0) {
                        iM6981 = (i6 - C2105.m6981("᩺ܿ")) * (-101);
                        i = ((iM6981 ^ i7) * (-23987)) ^ 529927404;
                        i2 = 1796962060;
                    } else {
                        iM6981 = C2105.m6981("ۚᩳ") ^ i7;
                        i = ((iM6981 ^ i6) * (-26807)) ^ 1431157085;
                        i2 = 1385683009;
                    }
                    int i14 = iM6981 ^ i2;
                    c21044 = c21042;
                    i9 = i14;
                    i8 = i;
                    c9047M42355 = c9047M42355;
                    break;
                case -1917558629:
                case -670297284:
                    c9047M42355 = c9047M42355;
                    c21042 = c21044;
                    if (C21923.m49329()) {
                        iM6981 = C2105.m6981("ܶ᩶") ^ i7;
                        i = ((iM6981 ^ i6) * (-5379)) ^ (-836658010);
                        i2 = 113231762;
                    } else {
                        iM6981 = (C2105.m6981("ܰ᩵") ^ i6) * 3;
                        i = ((iM6981 ^ i7) * (-27705)) ^ 2022207784;
                        i2 = -245428428;
                    }
                    int i15 = iM6981 ^ i2;
                    c21044 = c21042;
                    i9 = i15;
                    i8 = i;
                    c9047M42355 = c9047M42355;
                    break;
                case -1879785339:
                case 76610052:
                    return C19631.m45139(c9047M42355, c9047M42354);
                case -1602377175:
                case 405530221:
                    c21044.m47875(i11, bArr, i11, i10);
                    return c21541.m48697(i10, bArr);
                case -1592455057:
                case -1185079298:
                    if (!identityHashMap.containsKey((C6018) interfaceC18883)) {
                        iM2566 = C0630.m2566("۟۟") ^ i7;
                        i = ((iM2566 ^ i6) * 19647) ^ (-1060077816);
                        i3 = -29349269;
                        i9 = iM2566 ^ i3;
                        i8 = i;
                        c9047M42355 = c9047M42355;
                    } else {
                        iM2567 = (C0630.m2566("ۛۖ") ^ i7) * 27;
                        c21043 = c21044;
                        i4 = ((iM2567 ^ i6) * (-26579)) ^ 533616100;
                        i5 = -1405312427;
                        C21042 c21045 = c21043;
                        i9 = iM2567 ^ i5;
                        i8 = i4;
                        c21044 = c21045;
                    }
                    break;
                case -1450871123:
                case 560179080:
                    return c9047;
                case -1394513904:
                case -644060271:
                    C0237.m1481();
                    if (C3432.m10477() <= 0) {
                        c9047M42355 = c9047M42355;
                        c21042 = c21044;
                        iM6981 = (C0630.m2566("ܰۛ") ^ i6) * (-119);
                        i = ((iM6981 ^ i7) * 6407) ^ 759843204;
                        i2 = -1399588911;
                        int i16 = iM6981 ^ i2;
                        c21044 = c21042;
                        i9 = i16;
                        i8 = i;
                        c9047M42355 = c9047M42355;
                    }
                    c9047M42355 = c9047M42355;
                    c21042 = c21044;
                    iM6981 = (i6 - C2105.m6981("᩺ܿ")) * (-101);
                    i = ((iM6981 ^ i7) * (-23987)) ^ 529927404;
                    i2 = 1796962060;
                    int i17 = iM6981 ^ i2;
                    c21044 = c21042;
                    i9 = i17;
                    i8 = i;
                    c9047M42355 = c9047M42355;
                    break;
                case -1306711676:
                case 71241288:
                    c9047M42355 = c9047M42355;
                    c21042 = c21044;
                    boolean zM3598 = C1047.m3598(c9047);
                    c9049 = c9047.f27430;
                    c9048 = c9047.f27426;
                    if (zM3598) {
                        iM6981 = (C2105.m6981("ۡ᩺") ^ i6) * (-3);
                        i = ((iM6981 ^ i7) * (-6171)) ^ 1183936765;
                        i2 = 43204766;
                    } else {
                        iM6981 = C2105.m6981("ۤۨ") ^ i7;
                        i = ((iM6981 ^ i6) * 11323) ^ 623472479;
                        i2 = -711021677;
                    }
                    int i18 = iM6981 ^ i2;
                    c21044 = c21042;
                    i9 = i18;
                    i8 = i;
                    c9047M42355 = c9047M42355;
                    break;
                case -1168707920:
                case 1904128558:
                    C7106.m19120();
                    return null;
                case -753201626:
                case 180166932:
                    c21043 = c21044;
                    c9047M42355 = m42354(c9048, identityHashMap, c21541);
                    c9047M42354 = m42354(c9049, identityHashMap, c21541);
                    if (c9047M42355 == c9048) {
                        iM2567 = C2105.m6981("۬᩸") ^ i6;
                        i4 = ((iM2567 ^ i7) * (-21537)) ^ (-1659779405);
                        i5 = -1660736336;
                    } else {
                        iM2567 = (C0630.m2566("ܶۗ") ^ i7) * 91;
                        i4 = ((iM2567 ^ i6) * 15703) ^ (-947249813);
                        i5 = 1430210770;
                    }
                    C21042 c21046 = c21043;
                    i9 = iM2567 ^ i5;
                    i8 = i4;
                    c21044 = c21046;
                    break;
                case -684302761:
                case 471788883:
                    c9047M42355 = c9047M42355;
                    c21042 = c21044;
                    if (C1047.m3599() >= 0) {
                        iM6981 = C2105.m6981("ܶ᩶") ^ i7;
                        i = ((iM6981 ^ i6) * (-5379)) ^ (-836658010);
                        i2 = 113231762;
                    } else {
                        iM6981 = (C2105.m6981("ۛۛ") ^ i7) * (-51);
                        i = ((iM6981 ^ i6) * 12333) ^ 21017144;
                        i2 = -529169164;
                    }
                    int i19 = iM6981 ^ i2;
                    c21044 = c21042;
                    i9 = i19;
                    i8 = i;
                    c9047M42355 = c9047M42355;
                    break;
                case -610201156:
                case 1127563654:
                    c9047M42355 = c9047M42355;
                    c21042 = c21044;
                    if (C21923.f70183 != 0) {
                        iM6981 = (C0630.m2566("ۘᩳ") ^ i7) * 63;
                        i = ((iM6981 ^ i6) * (-25103)) ^ 908053297;
                        i2 = -401402154;
                    } else {
                        iM6981 = C2105.m6981("᩵ۗ") ^ i6;
                        i = ((iM6981 ^ i7) * 28381) ^ 154578404;
                        i2 = -1417714828;
                    }
                    int i110 = iM6981 ^ i2;
                    c21044 = c21042;
                    i9 = i110;
                    i8 = i;
                    c9047M42355 = c9047M42355;
                    break;
                case -3708473:
                case 968580395:
                    c9047M42355 = c9047M42355;
                    c21042 = c21044;
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C2105.m6981("۬ܰ") ^ i7;
                        i = ((iM6981 ^ i6) * (-23985)) ^ 308682855;
                        i2 = -1369622039;
                    } else {
                        iM6981 = C0630.m2566("ۖ᩵") ^ i7;
                        i = ((iM6981 ^ i6) * 12185) ^ (-1904602122);
                        i2 = -1676215846;
                    }
                    int i111 = iM6981 ^ i2;
                    c21044 = c21042;
                    i9 = i111;
                    i8 = i;
                    c9047M42355 = c9047M42355;
                    break;
                case 31030206:
                case 1206770583:
                    C1047.m3599();
                    break;
                case 197728179:
                case 435874599:
                    c9047M42355 = c9047M42355;
                    c21042 = c21044;
                    if (C2272.m7503()) {
                        iM6981 = C2105.m6981("ܶ᩶") ^ i7;
                        i = ((iM6981 ^ i6) * (-5379)) ^ (-836658010);
                        i2 = 113231762;
                    } else {
                        iM6981 = (C2105.m6981("ۚܳ") ^ i6) * (-29);
                        i = ((iM6981 ^ i7) * (-20121)) ^ (-1582161308);
                        i2 = -1499167841;
                    }
                    int i112 = iM6981 ^ i2;
                    c21044 = c21042;
                    i9 = i112;
                    i8 = i;
                    c9047M42355 = c9047M42355;
                    break;
                case 612583965:
                case 1441362593:
                    i10 = c21044.f67894;
                    bArr = new byte[i10];
                    if (C3245.f10203 <= 0) {
                        c9047M42355 = c9047M42355;
                        c21042 = c21044;
                        i11 = 0;
                        iM6981 = (C0630.m2566("ܰۛ") ^ i6) * (-119);
                        i = ((iM6981 ^ i7) * 6407) ^ 759843204;
                        i2 = -1399588911;
                        int i113 = iM6981 ^ i2;
                        c21044 = c21042;
                        i9 = i113;
                        i8 = i;
                        c9047M42355 = c9047M42355;
                    } else {
                        int iM6982 = C2105.m6981("᩸ܶ") ^ i6;
                        i9 = iM6982 ^ 1306466407;
                        i8 = ((iM6982 ^ i7) * (-10201)) ^ (-565447681);
                        i11 = 0;
                    }
                    break;
                case 627398242:
                case 1294395958:
                    if (C1128.m3851() <= 0) {
                        c9047M42355 = c9047M42355;
                        c21042 = c21044;
                        iM6981 = (C0630.m2566("ۘᩳ") ^ i7) * 63;
                        i = ((iM6981 ^ i6) * (-25103)) ^ 908053297;
                        i2 = -401402154;
                        int i114 = iM6981 ^ i2;
                        c21044 = c21042;
                        i9 = i114;
                        i8 = i;
                        c9047M42355 = c9047M42355;
                    }
                    c9047M42355 = c9047M42355;
                    c21042 = c21044;
                    iM6981 = (i6 - C2105.m6981("᩺ܿ")) * (-101);
                    i = ((iM6981 ^ i7) * (-23987)) ^ 529927404;
                    i2 = 1796962060;
                    int i115 = iM6981 ^ i2;
                    c21044 = c21042;
                    i9 = i115;
                    i8 = i;
                    c9047M42355 = c9047M42355;
                    break;
                case 679466974:
                case 1889686604:
                    c21043 = c21044;
                    if (c9047M42354 != c9049) {
                        iM2567 = (C0630.m2566("ܶۗ") ^ i7) * 91;
                        i4 = ((iM2567 ^ i6) * 15703) ^ (-947249813);
                        i5 = 1430210770;
                        C21042 c21047 = c21043;
                        i9 = iM2567 ^ i5;
                        i8 = i4;
                        c21044 = c21047;
                    } else {
                        c21044 = c21043;
                        iM2566 = C0630.m2566("۟۟") ^ i7;
                        i = ((iM2566 ^ i6) * 19647) ^ (-1060077816);
                        i3 = -29349269;
                        i9 = iM2566 ^ i3;
                        i8 = i;
                        c9047M42355 = c9047M42355;
                    }
                    break;
                case 730871109:
                case 2048710635:
                    C4075.m12263();
                    c9047M42355 = c9047M42355;
                    c21042 = c21044;
                    iM6981 = C2105.m6981("۬ܰ") ^ i7;
                    i = ((iM6981 ^ i6) * (-23985)) ^ 308682855;
                    i2 = -1369622039;
                    int i116 = iM6981 ^ i2;
                    c21044 = c21042;
                    i9 = i116;
                    i8 = i;
                    c9047M42355 = c9047M42355;
                    break;
                case 898141627:
                case 1080422328:
                    c21044 = c9047.f27427;
                    interfaceC18883 = c21044.f67896;
                    if (interfaceC18883 instanceof C6018) {
                        iM2566 = (C0630.m2566("᩺ۘ") ^ i6) * (-117);
                        c9047M42355 = c9047M42355;
                        i = ((iM2566 ^ i7) * (-8685)) ^ (-531811030);
                        i3 = -978230315;
                    } else {
                        iM2566 = C0630.m2566("۟۟") ^ i7;
                        i = ((iM2566 ^ i6) * 19647) ^ (-1060077816);
                        i3 = -29349269;
                    }
                    i9 = iM2566 ^ i3;
                    i8 = i;
                    c9047M42355 = c9047M42355;
                    break;
                case 1805603251:
                case 1988001696:
                    c9047M42355 = c9047M42355;
                    c21042 = c21044;
                    if (C1420.m4913()) {
                        iM6981 = C2105.m6981("ܶ᩶") ^ i7;
                        i = ((iM6981 ^ i6) * (-5379)) ^ (-836658010);
                        i2 = 113231762;
                    } else {
                        iM6981 = C2105.m6981("۬ۗ") ^ i6;
                        i = ((iM6981 ^ i7) * 9339) ^ 617139280;
                        i2 = 1625331782;
                    }
                    int i117 = iM6981 ^ i2;
                    c21044 = c21042;
                    i9 = i117;
                    i8 = i;
                    c9047M42355 = c9047M42355;
                    break;
                default:
                    c9047M42355 = c9047M42355;
                    c21042 = c21044;
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C0630.m2566("ۘᩳ") ^ i7) * 63;
                        i = ((iM6981 ^ i6) * (-25103)) ^ 908053297;
                        i2 = -401402154;
                    } else {
                        iM6981 = (C0630.m2566("ܿۖ") ^ i6) * (-91);
                        i = ((iM6981 ^ i7) * (-19147)) ^ (-2104703251);
                        i2 = 241295903;
                    }
                    int i118 = iM6981 ^ i2;
                    c21044 = c21042;
                    i9 = i118;
                    i8 = i;
                    c9047M42355 = c9047M42355;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x02d7  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42323(C9047 c9047, IdentityHashMap identityHashMap, ArrayList arrayList) {
        int iM6981;
        int i;
        int iM6982;
        int i2;
        IdentityHashMap identityHashMap2 = identityHashMap;
        ArrayList arrayList2 = arrayList;
        int i3 = C1420.f5096;
        int i4 = C1294.f4556;
        int iM2566 = C0630.m2566("۫۬") ^ i4;
        int i5 = ((iM2566 ^ i3) * 28187) ^ 1487191954;
        InterfaceC18883 interfaceC18883 = null;
        Long lM12360 = null;
        int i6 = iM2566 ^ (-760828872);
        C21042 c21042 = null;
        int i7 = 444172587;
        long jM3495 = 0;
        long j = 0;
        long jLongValue = 0;
        Long l2 = null;
        C3902 c3902 = null;
        int i8 = 0;
        while (true) {
            i7 = i6 ^ ((((i7 ^ i3) * (-14595)) >> 31) & i5);
            switch (i7) {
                case -2103933847:
                case 1167172599:
                    jLongValue = l2.longValue();
                    j = i8;
                    if (C3537.m10746() > 0) {
                        iM6982 = C0630.m2566("ۨܺ") ^ i4;
                        i5 = 1716003430 ^ ((iM6982 ^ i3) * (-28709));
                        i2 = -653103216;
                        i6 = iM6982 ^ i2;
                        arrayList2 = arrayList;
                    } else {
                        arrayList2 = arrayList;
                        iM6981 = C0630.m2566("۟ۚ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-28907)) ^ 1891085901;
                        i = 1450130317;
                        i6 = iM6981 ^ i;
                        identityHashMap2 = identityHashMap;
                    }
                    break;
                case -2065803597:
                case 1041887959:
                    c3902 = (C3902) interfaceC18883;
                    l2 = (Long) identityHashMap2.get(c3902);
                    if (l2 == null) {
                        iM6982 = (i4 - C2105.m6981("ۙۜ")) * 45;
                        i5 = (-1521628850) ^ ((iM6982 ^ i3) * 10495);
                        i2 = 1881549842;
                    } else {
                        iM6982 = C0630.m2566("ܰᩴ") ^ i3;
                        i5 = 930723831 ^ ((iM6982 ^ i4) * 2795);
                        i2 = 106660135;
                    }
                    i6 = iM6982 ^ i2;
                    arrayList2 = arrayList;
                    break;
                case -2055048310:
                case 2108606322:
                    if (C3911.f12484 >= 0) {
                        iM6981 = (C0630.m2566("ۧۡ") ^ i3) * (-63);
                        i5 = ((iM6981 ^ i4) * 12021) ^ 218049262;
                        i = 1958200471;
                    } else {
                        iM6981 = (C2105.m6981("۬ۙ") ^ i4) * (-65);
                        i5 = ((iM6981 ^ i3) * 2945) ^ (-753693201);
                        i = 739312436;
                    }
                    i6 = iM6981 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -1977181392:
                case 1981416681:
                    jM3495 = C1005.m3495(jLongValue, j);
                    if (ServiceConnectionC3453.m10564() > 0) {
                        iM6982 = C2105.m6981("ܽ۬") ^ i3;
                        i5 = (-1145319161) ^ ((iM6982 ^ i4) * 27707);
                        i2 = -1972657750;
                        i6 = iM6982 ^ i2;
                        arrayList2 = arrayList;
                    } else {
                        arrayList2 = arrayList;
                        iM6981 = C0630.m2566("۟ۚ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-28907)) ^ 1891085901;
                        i = 1450130317;
                        i6 = iM6981 ^ i;
                        identityHashMap2 = identityHashMap;
                    }
                    break;
                case -1759246239:
                case -87156940:
                    if (c9047 == null) {
                        iM6981 = C2105.m6981("᩸ܰ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 17727) ^ (-831863671);
                        i = -1661372870;
                    } else {
                        iM6981 = C2105.m6981("᩺ۗ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 29259) ^ 1470328122;
                        i = -1696733340;
                    }
                    i6 = iM6981 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -1746911817:
                case 179141906:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C0630.m2566("ۧۡ") ^ i3) * (-63);
                        i5 = ((iM6981 ^ i4) * 12021) ^ 218049262;
                        i = 1958200471;
                        i6 = iM6981 ^ i;
                        identityHashMap2 = identityHashMap;
                    }
                    iM6981 = C2105.m6981("۟ᩴ") ^ i4;
                    i5 = ((iM6981 ^ i3) * 23479) ^ (-2033613886);
                    i = 809317633;
                    i6 = iM6981 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -1623888801:
                case 2054530043:
                    C4117.m12364();
                    C3663.m11168();
                    break;
                case -1572039131:
                case -736300696:
                    C0714.m2809(identityHashMap2, c3902, lM12360);
                    C1916.m6307(arrayList2, c3902);
                    break;
                case -1571016295:
                case 871562153:
                    break;
                case -1563574258:
                case 988783695:
                    if (C0422.f1886 <= 0) {
                        iM6981 = C2105.m6981("۟ᩴ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 23479) ^ (-2033613886);
                        i = 809317633;
                    } else {
                        iM6981 = C2105.m6981("ۙ᩹") ^ i3;
                        i5 = ((iM6981 ^ i4) * 17645) ^ 895963969;
                        i = -2061215264;
                    }
                    i6 = iM6981 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -1377311323:
                case 204149970:
                    m42323(c9047.f27430, identityHashMap2, arrayList);
                    break;
                case -1270371206:
                case -82156240:
                    lM12360 = C4117.m12360(i8);
                    if (C2105.f7037 == 0) {
                        iM6982 = C0630.m2566("ۤۚ") ^ i3;
                        i5 = (-1313052066) ^ ((iM6982 ^ i4) * 22011);
                        i2 = -511274553;
                        i6 = iM6982 ^ i2;
                        arrayList2 = arrayList;
                    } else {
                        arrayList2 = arrayList;
                        iM6981 = (C0630.m2566("ۚ۬") ^ i4) * q.h;
                        i5 = ((iM6981 ^ i3) * (-18299)) ^ (-1394425082);
                        i = 1711284042;
                        i6 = iM6981 ^ i;
                        identityHashMap2 = identityHashMap;
                    }
                    break;
                case -1026582626:
                case 637531993:
                    if (C0422.f1886 > 0) {
                        iM6981 = (C0630.m2566("ۚ۬") ^ i4) * q.h;
                        i5 = ((iM6981 ^ i3) * (-18299)) ^ (-1394425082);
                        i = 1711284042;
                        i6 = iM6981 ^ i;
                        identityHashMap2 = identityHashMap;
                    }
                    iM6981 = C2105.m6981("۟ᩴ") ^ i4;
                    i5 = ((iM6981 ^ i3) * 23479) ^ (-2033613886);
                    i = 809317633;
                    i6 = iM6981 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -957453132:
                case 680019814:
                    if (C3019.f9544 >= 0) {
                        iM6981 = (C0630.m2566("ۧۡ") ^ i3) * (-63);
                        i5 = ((iM6981 ^ i4) * 12021) ^ 218049262;
                        i = 1958200471;
                    } else {
                        iM6981 = (C0630.m2566("᩷֡") + i3) * (-61);
                        i5 = ((iM6981 ^ i4) * (-16721)) ^ (-826128065);
                        i = -1106797193;
                    }
                    i6 = iM6981 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -912155279:
                case -781645530:
                    C2167.m7148(identityHashMap2, c3902, C4117.m12360(jM3495));
                    arrayList2 = arrayList;
                    iM6981 = C2105.m6981("᩸ܰ") ^ i4;
                    i5 = ((iM6981 ^ i3) * 17727) ^ (-831863671);
                    i = -1661372870;
                    i6 = iM6981 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -738979232:
                case -182195989:
                    interfaceC18883 = c21042.f67896;
                    i8 = c21042.f67894;
                    if (!(interfaceC18883 instanceof C3902)) {
                        arrayList2 = arrayList;
                        iM6981 = C2105.m6981("᩸ܰ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 17727) ^ (-831863671);
                        i = -1661372870;
                        i6 = iM6981 ^ i;
                        identityHashMap2 = identityHashMap;
                    } else {
                        iM6982 = C2105.m6981("ۨۗ") ^ i3;
                        i5 = 1107529012 ^ ((iM6982 ^ i4) * (-26239));
                        i2 = 2111042988;
                        i6 = iM6982 ^ i2;
                        arrayList2 = arrayList;
                    }
                    break;
                case -257545724:
                case -110668163:
                    if (C1294.f4556 < 0) {
                        iM6981 = C2105.m6981("۟ᩴ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 23479) ^ (-2033613886);
                        i = 809317633;
                        i6 = iM6981 ^ i;
                        identityHashMap2 = identityHashMap;
                    } else {
                        int iM2567 = (i3 - C0630.m2566("ۘۜ")) * 3;
                        i5 = ((iM2567 ^ i4) * (-11883)) ^ (-410113902);
                        i6 = iM2567 ^ 1555971079;
                    }
                    break;
                case 287140703:
                case 2001620572:
                    C3746.m11369();
                    ViewOnClickListenerC1958.m6429();
                    iM6981 = C2105.m6981("۟ᩴ") ^ i4;
                    i5 = ((iM6981 ^ i3) * 23479) ^ (-2033613886);
                    i = 809317633;
                    i6 = iM6981 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case 331612461:
                case 1776501805:
                    if (C2958.f9394 >= 0) {
                        iM6981 = C0630.m2566("۟ۚ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-28907)) ^ 1891085901;
                        i = 1450130317;
                    } else {
                        iM6981 = C0630.m2566("ܶۘ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-31623)) ^ (-307954598);
                        i = -788705636;
                    }
                    i6 = iM6981 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case 378165278:
                case 903244498:
                    c21042 = c9047.f27427;
                    if (C1047.m3598(c9047)) {
                        iM6981 = (i3 - C0630.m2566("᩸֨")) * 45;
                        i5 = ((iM6981 ^ i4) * (-28515)) ^ 1214896040;
                        i = 523548287;
                    } else {
                        iM6981 = (C0630.m2566("ܶۙ") + i3) * (-49);
                        i5 = ((iM6981 ^ i4) * (-30271)) ^ (-33203078);
                        i = 786042001;
                    }
                    i6 = iM6981 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case 591289572:
                case 1116658902:
                    if (C2126.f7087) {
                        iM6981 = (C0630.m2566("ۧۡ") ^ i3) * (-63);
                        i5 = ((iM6981 ^ i4) * 12021) ^ 218049262;
                        i = 1958200471;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۛ᩺")) * (-67);
                        i5 = ((iM6981 ^ i3) * 26239) ^ 2035335245;
                        i = -1479354595;
                    }
                    i6 = iM6981 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case 1046801914:
                case 2146770645:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (C0630.m2566("ۚ۬") ^ i4) * q.h;
                        i5 = ((iM6981 ^ i3) * (-18299)) ^ (-1394425082);
                        i = 1711284042;
                    } else {
                        iM6981 = (C0630.m2566("ܺ֨") + i3) * (-83);
                        i5 = ((iM6981 ^ i4) * 16395) ^ (-38964567);
                        i = 1182698316;
                    }
                    i6 = iM6981 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                default:
                    m42323(c9047.f27426, identityHashMap2, arrayList2);
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C0630.m2566("ۧۡ") ^ i3) * (-63);
                        i5 = ((iM6981 ^ i4) * 12021) ^ 218049262;
                        i = 1958200471;
                        i6 = iM6981 ^ i;
                    } else {
                        int iM6983 = (C2105.m6981("۬ۘ") ^ i4) * 81;
                        i6 = iM6983 ^ 1837295013;
                        i5 = ((iM6983 ^ i3) * (-23985)) ^ (-1827269766);
                    }
                    identityHashMap2 = identityHashMap;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0247 A[PHI: r5 r16
      0x0247: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v7 int) binds: [B:67:0x0245, B:16:0x0058, B:7:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r16v27 int) = (r16v5 int), (r16v22 int), (r16v30 int) binds: [B:67:0x0245, B:16:0x0058, B:7:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x027a A[PHI: r1 r2 r6 r10 r16
      0x027a: PHI (r1v4 short[]) = (r1v2 short[]), (r1v3 short[]), (r1v2 short[]), (r1v2 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:71:0x0278, B:63:0x0225, B:59:0x0204, B:50:0x0193, B:31:0x00bd, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r2v4 char) = (r2v2 char), (r2v2 char), (r2v3 char), (r2v2 char), (r2v2 char), (r2v2 char) binds: [B:71:0x0278, B:63:0x0225, B:59:0x0204, B:50:0x0193, B:31:0x00bd, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r6v4 short) = (r6v2 short), (r6v2 short), (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:71:0x0278, B:63:0x0225, B:59:0x0204, B:50:0x0193, B:31:0x00bd, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:71:0x0278, B:63:0x0225, B:59:0x0204, B:50:0x0193, B:31:0x00bd, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r16v20 int) = (r16v4 int), (r16v6 int), (r16v7 int), (r16v9 int), (r16v16 int), (r16v21 int) binds: [B:71:0x0278, B:63:0x0225, B:59:0x0204, B:50:0x0193, B:31:0x00bd, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02af A[PHI: r8 r9 r16
      0x02af: PHI (r8v4 short[]) = (r8v2 short[]), (r8v3 short[]), (r8v2 short[]) binds: [B:75:0x02ad, B:35:0x00e2, B:12:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:75:0x02ad, B:35:0x00e2, B:12:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r16v25 int) = (r16v3 int), (r16v15 int), (r16v26 int) binds: [B:75:0x02ad, B:35:0x00e2, B:12:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42317(int i, int i2) throws IOException {
        int iM2566;
        int i3;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 2089174672;
        int i10 = C4117.f13076;
        int i11 = C0050.f910;
        int iM6981 = (i10 - C2105.m6981("᩵ᩳ")) * 123;
        int i12 = ((iM6981 ^ i11) * (-9191)) ^ 2083368504;
        int i13 = 1068602131;
        while (true) {
            int i14 = iM6981 ^ i13;
            while (true) {
                i9 = ((((i9 ^ i11) * 32473) >> 31) & i12) ^ i14;
                switch (i9) {
                    case -2085123105:
                    case 818617511:
                        i6 = 17312;
                        iM2566 = (i10 - C2105.m6981("ܰ᩷")) * (-37);
                        i12 = ((iM2566 ^ i11) * (-20039)) ^ (-1278714388);
                        i3 = -231242493;
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    case -2026428381:
                    case 1672744348:
                        i9 = i9;
                        if (i > 0) {
                            iM2566 = (C2105.m6981("᩸ܽ") ^ i11) * (-61);
                            i12 = ((iM2566 ^ i10) * (-32205)) ^ 1636511510;
                            i3 = -659329714;
                        } else {
                            iM2566 = C0630.m2566("ᩳ᩸") ^ i11;
                            i12 = ((iM2566 ^ i10) * 3103) ^ 1813941011;
                            i3 = -1325421872;
                        }
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    case -1935900075:
                    case 1472289447:
                        RunnableC1937.m6387();
                        AbstractC2021.m6574();
                        return;
                    case -1904307343:
                    case 1199988389:
                        i9 = i9;
                        sArr = f56533;
                        if (C0422.f1886 <= 0) {
                            iM2566 = C2105.m6981("ᩴᩳ") ^ i11;
                            i12 = ((iM2566 ^ i10) * (-19721)) ^ (-1712369417);
                            i3 = 1416402202;
                        } else {
                            iM2566 = C0630.m2566("᩶ᩳ") ^ i11;
                            i12 = ((iM2566 ^ i10) * 19721) ^ (-1237713910);
                            i3 = -66789020;
                        }
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    case -1896408256:
                    case 1754831392:
                        i9 = i9;
                        if (C7811.m20844() != 0) {
                            iM2566 = (C0630.m2566("ۡ֡") + i10) * (-37);
                            i12 = ((iM2566 ^ i11) * (-5839)) ^ 417285016;
                            i3 = -396820145;
                        } else {
                            iM2566 = (C0630.m2566("ۖܿ") ^ i11) * (-23);
                            i12 = ((iM2566 ^ i10) * 7043) ^ (-1667207414);
                            i3 = -1180875101;
                        }
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    case -1662778830:
                    case 1709027324:
                        if (!C0382.f1805) {
                            i9 = i9;
                            iM2566 = (C2105.m6981("᩻᩵") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i12 = ((iM2566 ^ i10) * (-29463)) ^ (-1295653502);
                            i3 = -458080425;
                            i14 = iM2566 ^ i3;
                            i9 = i9;
                        }
                        i9 = i9;
                        iM2566 = C2105.m6981("ᩴᩳ") ^ i11;
                        i12 = ((iM2566 ^ i10) * (-19721)) ^ (-1712369417);
                        i3 = 1416402202;
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    case -1463106002:
                    case 1398088716:
                        RunnableC1937.m6387();
                        C4075.m12263();
                        break;
                    case -1061379718:
                    case 1280965118:
                        i9 = i9;
                        sArr2 = f56533;
                        i7 = 456;
                        if (C0382.m1848()) {
                            iM2566 = (C0630.m2566("ۡ֡") + i10) * (-37);
                            i12 = ((iM2566 ^ i11) * (-5839)) ^ 417285016;
                            i3 = -396820145;
                        } else {
                            iM2566 = C2105.m6981("۫֨") ^ i11;
                            i12 = ((iM2566 ^ i10) * (-14957)) ^ (-2099875965);
                            i3 = -521153326;
                        }
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    case -851572047:
                    case 38125397:
                        if (C21923.f70183 != 0) {
                            i9 = i9;
                            iM2566 = (C0630.m2566("ۡ֡") + i10) * (-37);
                            i12 = ((iM2566 ^ i11) * (-5839)) ^ 417285016;
                            i3 = -396820145;
                            i14 = iM2566 ^ i3;
                            i9 = i9;
                        }
                        break;
                    case -192517231:
                    case 504802468:
                        i9 = i9;
                        if (C1916.f6442) {
                            iM2566 = (i10 - C2105.m6981("ۚᩳ")) * 71;
                            i12 = ((iM2566 ^ i11) * (-21191)) ^ (-42269284);
                            i3 = 570762775;
                        } else {
                            iM2566 = C2105.m6981("ᩴᩳ") ^ i11;
                            i12 = ((iM2566 ^ i10) * (-19721)) ^ (-1712369417);
                            i3 = 1416402202;
                        }
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    case -48227218:
                    case 173739405:
                        i9 = i9;
                        s2 = 38340;
                        if (C0630.m2564()) {
                            iM2566 = C2105.m6981("ᩴᩳ") ^ i11;
                            i12 = ((iM2566 ^ i10) * (-19721)) ^ (-1712369417);
                            i3 = 1416402202;
                        } else {
                            iM2566 = C0630.m2566("᩹֨") ^ i11;
                            i12 = ((iM2566 ^ i10) * (-18985)) ^ 1458753167;
                            i3 = -1833647120;
                        }
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    case 10662546:
                    case 736116289:
                        i9 = i9;
                        c = 455;
                        if (C1420.f5096 <= 0) {
                            iM2566 = C2105.m6981("ᩴᩳ") ^ i11;
                            i12 = ((iM2566 ^ i10) * (-19721)) ^ (-1712369417);
                            i3 = 1416402202;
                        } else {
                            iM2566 = C0630.m2566("ۧۙ") ^ i11;
                            i12 = ((iM2566 ^ i10) * 9095) ^ (-1939011194);
                            i3 = -103916927;
                        }
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    case 90938136:
                    case 647693612:
                        i9 = i9;
                        s = sArr[c];
                        i4 = s * s;
                        if (C0964.m3413()) {
                            iM2566 = C0630.m2566("ᩴۜ") ^ i10;
                            i12 = ((iM2566 ^ i11) * (-22149)) ^ 1040360449;
                            i3 = -772452281;
                        } else {
                            iM2566 = C0630.m2566("᩵ܿ") ^ i10;
                            i12 = ((iM2566 ^ i11) * 22197) ^ (-986776742);
                            i3 = 1418665624;
                        }
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    case 346290747:
                    case 1472686166:
                        return;
                    case 349945188:
                    case 505472613:
                        if (i <= i2) {
                            int iM6982 = C2105.m6981("᩷ۖ") ^ i10;
                            i9 = i9;
                            i14 = iM6982 ^ 17680846;
                            i12 = ((iM6982 ^ i11) * 23073) ^ 61675358;
                        } else {
                            i9 = i9;
                            iM2566 = C0630.m2566("ᩳ᩸") ^ i11;
                            i12 = ((iM2566 ^ i10) * 3103) ^ 1813941011;
                            i3 = -1325421872;
                            i14 = iM2566 ^ i3;
                        }
                        i9 = i9;
                        break;
                    case 395760077:
                    case 1536755191:
                        throw m42352(C0798.m3005(sArr2, i7, i8, i6));
                    case 474617220:
                    case 2106866276:
                        i9 = i9;
                        i8 = 21;
                        if (C1420.f5096 <= 0) {
                            iM2566 = C2105.m6981("ᩴᩳ") ^ i11;
                            i12 = ((iM2566 ^ i10) * (-19721)) ^ (-1712369417);
                            i3 = 1416402202;
                        } else {
                            iM2566 = C2105.m6981("ۧ᩺") ^ i10;
                            i12 = ((iM2566 ^ i11) * 2261) ^ 1676913521;
                            i3 = 1096792857;
                        }
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    case 663681266:
                    case 2128041888:
                        C21923.m49329();
                        if (C7811.f24123 >= 0) {
                        }
                        i9 = i9;
                        iM2566 = C2105.m6981("ᩴᩳ") ^ i11;
                        i12 = ((iM2566 ^ i10) * (-19721)) ^ (-1712369417);
                        i3 = 1416402202;
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    case 738273992:
                    case 866287669:
                        i9 = i9;
                        if (C7811.m20844() != 0) {
                            iM2566 = (C2105.m6981("᩻᩵") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i12 = ((iM2566 ^ i10) * (-29463)) ^ (-1295653502);
                            i3 = -458080425;
                        } else {
                            iM2566 = C2105.m6981("᩺ۖ") ^ i10;
                            i12 = ((iM2566 ^ i11) * 4229) ^ 1311452132;
                            i3 = 290258846;
                        }
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    case 1184740728:
                    case 1402570743:
                        i6 = 46972;
                        iM2566 = (i10 - C2105.m6981("ܰ᩷")) * (-37);
                        i12 = ((iM2566 ^ i11) * (-20039)) ^ (-1278714388);
                        i3 = -231242493;
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    case 1604954270:
                    case 1846732020:
                        i9 = i9;
                        if ((s * s2) - i5 <= 0) {
                            iM2566 = C2105.m6981("֫֨") ^ i10;
                            i12 = ((iM2566 ^ i11) * (-14081)) ^ 61600960;
                            i3 = 89171981;
                        } else {
                            iM2566 = (C0630.m2566("ܽ᩶") + i11) * (-5);
                            i12 = ((iM2566 ^ i10) * (-3087)) ^ 929279043;
                            i3 = 537566187;
                        }
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                    default:
                        i9 = i9;
                        i5 = 367488900 + i4;
                        if (C3911.f12484 >= 0) {
                            iM2566 = (C2105.m6981("᩻᩵") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i12 = ((iM2566 ^ i10) * (-29463)) ^ (-1295653502);
                            i3 = -458080425;
                        } else {
                            iM2566 = (i10 - C0630.m2566("ۧۧ")) * (-33);
                            i12 = ((iM2566 ^ i11) * (-6457)) ^ 646206493;
                            i3 = 759141687;
                        }
                        i14 = iM2566 ^ i3;
                        i9 = i9;
                        break;
                }
            }
            iM6981 = (i10 - C0630.m2566("᩹ۡ")) * 43;
            i12 = ((iM6981 ^ i11) * (-21707)) ^ 126537700;
            i13 = 533559392;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x04a6 A[PHI: r12 r13 r18 r24 r25 r27 r33
      0x04a6: PHI (r12v22 int) = (r12v3 int), (r12v4 int), (r12v23 int) binds: [B:108:0x04a4, B:104:0x047c, B:9:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x04a6: PHI (r13v18 int) = (r13v1 int), (r13v2 int), (r13v19 int) binds: [B:108:0x04a4, B:104:0x047c, B:9:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x04a6: PHI (r18v5 char) = (r18v2 char), (r18v3 char), (r18v2 char) binds: [B:108:0x04a4, B:104:0x047c, B:9:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x04a6: PHI (r24v5 short[]) = (r24v3 short[]), (r24v2 short[]), (r24v2 short[]) binds: [B:108:0x04a4, B:104:0x047c, B:9:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x04a6: PHI (r25v5 long) = (r25v2 long), (r25v2 long), (r25v6 long) binds: [B:108:0x04a4, B:104:0x047c, B:9:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x04a6: PHI (r27v16 int) = (r27v3 int), (r27v4 int), (r27v17 int) binds: [B:108:0x04a4, B:104:0x047c, B:9:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x04a6: PHI (r33v23 short[]) = (r33v5 short[]), (r33v6 short[]), (r33v24 short[]) binds: [B:108:0x04a4, B:104:0x047c, B:9:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ec A[PHI: r9 r10 r14
      0x01ec: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:50:0x01d3, B:41:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r10v3 long) = (r10v2 long), (r10v1 long) binds: [B:50:0x01d3, B:41:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r14v3 long) = (r14v2 long), (r14v1 long) binds: [B:50:0x01d3, B:41:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x03dd A[PHI: r2 r5 r6 r12 r16 r21 r22 r23 r36 r37 r38
      0x03dd: PHI (r2v8 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v9 int) binds: [B:96:0x03d7, B:77:0x02e3, B:67:0x028c, B:13:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r5v7 short[]) = (r5v1 short[]), (r5v1 short[]), (r5v1 short[]), (r5v8 short[]) binds: [B:96:0x03d7, B:77:0x02e3, B:67:0x028c, B:13:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r6v8 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v9 int) binds: [B:96:0x03d7, B:77:0x02e3, B:67:0x028c, B:13:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r12v55 int) = (r12v6 int), (r12v27 int), (r12v28 int), (r12v56 int) binds: [B:96:0x03d7, B:77:0x02e3, B:67:0x028c, B:13:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r16v7 long) = (r16v2 long), (r16v2 long), (r16v4 long), (r16v2 long) binds: [B:96:0x03d7, B:77:0x02e3, B:67:0x028c, B:13:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r21v8 int) = (r21v3 int), (r21v2 int), (r21v2 int), (r21v2 int) binds: [B:96:0x03d7, B:77:0x02e3, B:67:0x028c, B:13:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r22v8 int) = (r22v3 int), (r22v2 int), (r22v2 int), (r22v2 int) binds: [B:96:0x03d7, B:77:0x02e3, B:67:0x028c, B:13:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r23v8 int) = (r23v3 int), (r23v2 int), (r23v2 int), (r23v2 int) binds: [B:96:0x03d7, B:77:0x02e3, B:67:0x028c, B:13:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r36v13 short[]) = (r36v4 short[]), (r36v10 short[]), (r36v1 short[]), (r36v1 short[]) binds: [B:96:0x03d7, B:77:0x02e3, B:67:0x028c, B:13:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r37v13 int) = (r37v4 int), (r37v10 int), (r37v1 int), (r37v1 int) binds: [B:96:0x03d7, B:77:0x02e3, B:67:0x028c, B:13:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r38v13 int) = (r38v4 int), (r38v10 int), (r38v1 int), (r38v1 int) binds: [B:96:0x03d7, B:77:0x02e3, B:67:0x028c, B:13:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12532[] m42341(DataInput dataInput, C17307 c17307) throws IOException {
        int i;
        int iM2566;
        int i2;
        int i3;
        int i4;
        int i5;
        short[] sArr;
        int iM6981;
        int i6;
        C12532[] c12532Arr;
        int i7;
        long j;
        int i8;
        int i9;
        int iM2567;
        int i10;
        int iM2568;
        int i11;
        int i12;
        C17307 c17308 = c17307;
        int i13 = -560627154;
        int i14 = C2958.f9394;
        int i15 = C3245.f10203;
        int iM2569 = C0630.m2566("ۗܶ") ^ i15;
        int i16 = ((iM2569 ^ i14) * 17819) ^ (-1643599674);
        int i17 = iM2569 ^ 660973391;
        long j2 = 0;
        C12532[] c12532Arr2 = null;
        long j3 = 0;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        char c = 0;
        short s = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        long j4 = 0;
        short[] sArr4 = null;
        int i28 = 0;
        long j5 = 0;
        byte[] bArr = null;
        int i29 = 0;
        long j6 = 0;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i14) * 22047) >> 31));
            switch (i13) {
                case -2108689689:
                case 1865788727:
                    if (C7811.f24123 >= 0) {
                        i25 = i25;
                        sArr2 = sArr2;
                        i = i26;
                        i27 = i27;
                        iM2566 = (i15 - C2105.m6981("ܶܰ")) * 69;
                        i16 = ((iM2566 ^ i14) * (-22941)) ^ 1056462321;
                        i2 = 254947790;
                        i27 = i27;
                        i26 = i;
                        sArr2 = sArr2;
                        i17 = iM2566 ^ i2;
                        i25 = i25;
                        c17308 = c17307;
                    } else {
                        iM2568 = C0630.m2566("ܽ֡") ^ i14;
                        i11 = ((iM2568 ^ i15) * (-10491)) ^ (-507215898);
                        i12 = 741873521;
                        i17 = iM2568 ^ i12;
                        i16 = i11;
                    }
                    break;
                case -1980748031:
                case -237048203:
                    if (j6 <= 67108864) {
                        iM2567 = (i14 - C2105.m6981("ۘۨ")) * (-59);
                        i9 = ((iM2567 ^ i15) * (-14899)) ^ 1531261525;
                        i10 = 1064548969;
                    } else {
                        iM2567 = C2105.m6981("᩷ܶ") ^ i14;
                        i9 = ((iM2567 ^ i15) * 18617) ^ 1648044624;
                        i10 = 1846317877;
                    }
                    i17 = iM2567 ^ i10;
                    i16 = i9;
                    break;
                case -1892420345:
                case -1427570176:
                    i18 = 7549;
                    iM2566 = C0630.m2566("ۙܿ") ^ i14;
                    i = i26;
                    i16 = ((iM2566 ^ i15) * 23373) ^ (-1483061769);
                    i2 = 1512295281;
                    i27 = i27;
                    i26 = i;
                    sArr2 = sArr2;
                    i17 = iM2566 ^ i2;
                    i25 = i25;
                    c17308 = c17307;
                    break;
                case -1735091298:
                case 85730328:
                    i25 = i25;
                    sArr2 = sArr2;
                    i = i26;
                    i27 = i27;
                    sArr4 = f56533;
                    if (C21923.m49329()) {
                        iM2566 = (i15 - C2105.m6981("ܶܰ")) * 69;
                        i16 = ((iM2566 ^ i14) * (-22941)) ^ 1056462321;
                        i2 = 254947790;
                    } else {
                        iM2566 = (i14 - C0630.m2566("۬ᩴ")) * 33;
                        i16 = ((iM2566 ^ i15) * (-15177)) ^ (-554618749);
                        i2 = -1482159030;
                    }
                    i27 = i27;
                    i26 = i;
                    sArr2 = sArr2;
                    i17 = iM2566 ^ i2;
                    i25 = i25;
                    c17308 = c17307;
                    break;
                case -1691520451:
                case 1784065549:
                    sArr3 = f56533;
                    i19 = 707;
                    i29 = 30;
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2567 = C0630.m2566("ۡۚ") ^ i15;
                        i9 = ((iM2567 ^ i14) * 21895) ^ 1873175672;
                        i10 = 1487796886;
                        i17 = iM2567 ^ i10;
                        i16 = i9;
                    } else {
                        i25 = i25;
                        iM6981 = C0630.m2566("ۤܽ") ^ i14;
                        i16 = ((iM6981 ^ i15) * 19695) ^ (-1019579734);
                        i6 = -1709724807;
                        i17 = iM6981 ^ i6;
                        c17308 = c17307;
                        i25 = i25;
                    }
                    break;
                case -1667607748:
                case 1197586856:
                    C1773.m5908();
                    return null;
                case -1590449652:
                case 607256201:
                    i28 = dataInput.readInt();
                    j4 = i28;
                    j6 = j3 + j4;
                    if (i28 > 0) {
                        iM2567 = (C0630.m2566("֨ۖ") + i15) * 63;
                        i9 = ((iM2567 ^ i14) * (-22131)) ^ (-1376492371);
                        i10 = -1915258721;
                    } else {
                        iM2567 = C2105.m6981("᩷ܶ") ^ i14;
                        i9 = ((iM2567 ^ i15) * 18617) ^ 1648044624;
                        i10 = 1846317877;
                    }
                    i17 = iM2567 ^ i10;
                    i16 = i9;
                    break;
                case -1581986770:
                case -1328379840:
                    i25 = i25;
                    j2 = j5 + 16;
                    if (C4117.f13076 > 0) {
                        iM6981 = C2105.m6981("۬ۢ") ^ i14;
                        i16 = ((iM6981 ^ i15) * 29315) ^ (-278336025);
                        i6 = -64186882;
                        i17 = iM6981 ^ i6;
                        c17308 = c17307;
                        i25 = i25;
                    } else {
                        sArr2 = sArr2;
                        i = i26;
                        i27 = i27;
                        iM2566 = (i15 - C2105.m6981("ܶܰ")) * 69;
                        i16 = ((iM2566 ^ i14) * (-22941)) ^ 1056462321;
                        i2 = 254947790;
                        i27 = i27;
                        i26 = i;
                        sArr2 = sArr2;
                        i17 = iM2566 ^ i2;
                        i25 = i25;
                        c17308 = c17307;
                    }
                    break;
                case -1461632401:
                case -1415420898:
                    c12532Arr = c12532Arr2;
                    i7 = i20 + 1;
                    j3 = j6;
                    j = j2;
                    i8 = i25;
                    int iM6982 = C2105.m6981("ۛᩴ") ^ i15;
                    i3 = ((iM6982 ^ i14) * 28787) ^ 1171383392;
                    i17 = iM6982 ^ (-367518492);
                    j2 = j;
                    i25 = i8;
                    i20 = i7;
                    c12532Arr2 = c12532Arr;
                    i16 = i3;
                    c17308 = c17307;
                    break;
                case -1455255069:
                case -652596254:
                    C1504.m5179();
                    C1005.m3501();
                    iM2568 = (C2105.m6981("ۡ᩵") + i15) * (-123);
                    i11 = ((iM2568 ^ i14) * 31285) ^ 752060675;
                    i12 = 677307172;
                    i17 = iM2568 ^ i12;
                    i16 = i11;
                    break;
                case -1451867853:
                case -350915370:
                    short[] sArr5 = f56533;
                    if (C1773.f6144 > 0) {
                        throw new IllegalArgumentException(C1711.m5726(sArr5, 737, 37, i18));
                    }
                    i25 = i25;
                    iM6981 = C0630.m2566("ۤܽ") ^ i14;
                    i16 = ((iM6981 ^ i15) * 19695) ^ (-1019579734);
                    i6 = -1709724807;
                    i17 = iM6981 ^ i6;
                    c17308 = c17307;
                    i25 = i25;
                    break;
                case -1358837152:
                case 937190386:
                    short[] sArr6 = sArr2;
                    i4 = i26;
                    i5 = i27;
                    i25 = dataInput.readInt();
                    if (i25 >= 0) {
                        int iM25610 = C0630.m2566("ᩳ᩺") ^ i14;
                        i26 = i4;
                        i27 = i5;
                        sArr2 = sArr6;
                        i16 = ((iM25610 ^ i15) * (-24247)) ^ 1329219892;
                        i17 = iM25610 ^ 536706243;
                    } else {
                        sArr = sArr6;
                        int iM6983 = C2105.m6981("ۨܳ") ^ i15;
                        i26 = i4;
                        i16 = ((iM6983 ^ i14) * 9177) ^ (-758326603);
                        i27 = i5;
                        sArr2 = sArr;
                        i17 = iM6983 ^ (-523966903);
                    }
                    c17308 = c17307;
                    break;
                case -1285321994:
                case 357445828:
                    throw m42352(C0798.m3005(sArr2, i26, i27, i18));
                case -1101422198:
                case 2080415376:
                    c17308.m40619(j4);
                    bArr = new byte[i28];
                    dataInput.readFully(bArr);
                    if (i28 != 0) {
                        iM2567 = C0630.m2566("᩷᩸") ^ i14;
                        i9 = ((iM2567 ^ i15) * 469) ^ 1410619120;
                        i10 = 404755696;
                    } else {
                        iM2567 = C2105.m6981("᩹᩺") ^ i15;
                        i9 = ((iM2567 ^ i14) * 29277) ^ (-2071162813);
                        i10 = -915446881;
                    }
                    i17 = iM2567 ^ i10;
                    i16 = i9;
                    break;
                case -1027775638:
                case 452461131:
                    i25 = i25;
                    sArr2 = f56533;
                    i26 = 681;
                    i27 = 26;
                    if (C1916.f6442) {
                        iM6981 = (C0630.m2566("᩶ۙ") + i15) * 101;
                        i16 = ((iM6981 ^ i14) * 2793) ^ (-168035470);
                        i6 = -1905785581;
                    } else {
                        iM6981 = C0630.m2566("ۤܽ") ^ i14;
                        i16 = ((iM6981 ^ i15) * 19695) ^ (-1019579734);
                        i6 = -1709724807;
                    }
                    i17 = iM6981 ^ i6;
                    c17308 = c17307;
                    i25 = i25;
                    break;
                case -937826866:
                case 2057383251:
                    if (!C0382.m1848()) {
                        i25 = i25;
                        iM6981 = C0630.m2566("ۤܽ") ^ i14;
                        i16 = ((iM6981 ^ i15) * 19695) ^ (-1019579734);
                        i6 = -1709724807;
                        i17 = iM6981 ^ i6;
                        c17308 = c17307;
                        i25 = i25;
                    } else {
                        i25 = i25;
                        sArr2 = sArr2;
                        i = i26;
                        i27 = i27;
                        iM2566 = (i15 - C2105.m6981("ܶܰ")) * 69;
                        i16 = ((iM2566 ^ i14) * (-22941)) ^ 1056462321;
                        i2 = 254947790;
                        i27 = i27;
                        i26 = i;
                        sArr2 = sArr2;
                        i17 = iM2566 ^ i2;
                        i25 = i25;
                        c17308 = c17307;
                    }
                    break;
                case -933123467:
                case 820275367:
                    i25 = i25;
                    if (i20 >= i25) {
                        int iM25611 = (i14 - C0630.m2566("֫ܺ")) * (-81);
                        i9 = ((iM25611 ^ i15) * 27641) ^ (-1858093398);
                        i17 = iM25611 ^ 572943192;
                        i25 = i25;
                        i16 = i9;
                    } else {
                        int iM25612 = (i15 - C0630.m2566("۟ܶ")) * 17;
                        i16 = ((iM25612 ^ i14) * 4867) ^ 1366673159;
                        i17 = iM25612 ^ (-348940979);
                        i25 = i25;
                    }
                    break;
                case -815755119:
                case 26717718:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2568 = (i15 - C0630.m2566("֡᩻")) * (-93);
                        i11 = ((iM2568 ^ i14) * (-26263)) ^ 264381688;
                        i12 = -1305870140;
                        i17 = iM2568 ^ i12;
                        i16 = i11;
                    } else {
                        i25 = i25;
                        sArr2 = sArr2;
                        i = i26;
                        i27 = i27;
                        iM2566 = (i15 - C2105.m6981("ܶܰ")) * 69;
                        i16 = ((iM2566 ^ i14) * (-22941)) ^ 1056462321;
                        i2 = 254947790;
                        i27 = i27;
                        i26 = i;
                        sArr2 = sArr2;
                        i17 = iM2566 ^ i2;
                        i25 = i25;
                        c17308 = c17307;
                    }
                    break;
                case -779923873:
                case -354621389:
                    i25 = i25;
                    if (i25 > 1048576) {
                        i25 = i25;
                        sArr = sArr2;
                        i4 = i26;
                        i5 = i27;
                        int iM6984 = C2105.m6981("ۨܳ") ^ i15;
                        i26 = i4;
                        i16 = ((iM6984 ^ i14) * 9177) ^ (-758326603);
                        i27 = i5;
                        sArr2 = sArr;
                        i17 = iM6984 ^ (-523966903);
                        c17308 = c17307;
                    } else {
                        iM6981 = C2105.m6981("ۚ֫") ^ i14;
                        i16 = ((iM6981 ^ i15) * (-9415)) ^ 1016234370;
                        i6 = 170035875;
                        i17 = iM6981 ^ i6;
                        c17308 = c17307;
                        i25 = i25;
                    }
                    break;
                case -721354989:
                case 1541588923:
                    i25 = i25;
                    sArr2 = sArr2;
                    i = i26;
                    i27 = i27;
                    int i30 = i23 + i24;
                    if ((i30 + i30) - i22 >= 0) {
                        iM2566 = C0630.m2566("᩸֡") ^ i15;
                        i16 = ((iM2566 ^ i14) * (-14045)) ^ 1602617030;
                        i2 = 1036735015;
                    } else {
                        iM2566 = C0630.m2566("ܰ۬") ^ i14;
                        i16 = ((iM2566 ^ i15) * (-28275)) ^ (-565500448);
                        i2 = 2047986220;
                    }
                    i27 = i27;
                    i26 = i;
                    sArr2 = sArr2;
                    i17 = iM2566 ^ i2;
                    i25 = i25;
                    c17308 = c17307;
                    break;
                case -467414855:
                case 1371364707:
                    i25 = i25;
                    sArr2 = sArr2;
                    i = i26;
                    i27 = i27;
                    i22 = i21 * i21;
                    i23 = s * s;
                    i24 = 45900625;
                    if (C22628.f73083 > 0) {
                        iM2566 = C2105.m6981("ܺܺ") ^ i15;
                        i16 = ((iM2566 ^ i14) * 19591) ^ 1032151825;
                        i2 = 2040232083;
                        i27 = i27;
                        i26 = i;
                        sArr2 = sArr2;
                        i17 = iM2566 ^ i2;
                        i25 = i25;
                        c17308 = c17307;
                    } else {
                        i27 = i27;
                        i26 = i;
                        sArr2 = sArr2;
                        iM6981 = C0630.m2566("ۤܽ") ^ i14;
                        i16 = ((iM6981 ^ i15) * 19695) ^ (-1019579734);
                        i6 = -1709724807;
                        i17 = iM6981 ^ i6;
                        c17308 = c17307;
                        i25 = i25;
                    }
                    break;
                case -318668666:
                case 1018700928:
                    c12532Arr2[i20] = new C12532(bArr);
                    if (C2167.m7155()) {
                        iM2568 = (i15 - C0630.m2566("֡᩻")) * (-93);
                        i11 = ((iM2568 ^ i14) * (-26263)) ^ 264381688;
                        i12 = -1305870140;
                    } else {
                        iM2568 = C0630.m2566("֨᩵") ^ i14;
                        i11 = ((iM2568 ^ i15) * (-13229)) ^ 1141907271;
                        i12 = 1585477444;
                    }
                    i17 = iM2568 ^ i12;
                    i16 = i11;
                    break;
                case -237665012:
                case -131633288:
                    int i31 = i25;
                    short[] sArr7 = sArr2;
                    int i32 = i26;
                    int i33 = i27;
                    short s2 = sArr4[c];
                    int i34 = s2 + 6775;
                    if (RunnableC1108.f4040) {
                        int iM25613 = (C0630.m2566("ᩳ۠") + i14) * (-77);
                        i16 = ((iM25613 ^ i15) * (-10805)) ^ 1447582070;
                        i27 = i33;
                        i26 = i32;
                        sArr2 = sArr7;
                        i17 = iM25613 ^ 305581455;
                        i25 = i31;
                        c17308 = c17307;
                        i21 = i34;
                        s = s2;
                    } else {
                        int iM25614 = C0630.m2566("ܳۛ") ^ i15;
                        i3 = ((iM25614 ^ i14) * (-24943)) ^ 820682592;
                        i27 = i33;
                        i26 = i32;
                        sArr2 = sArr7;
                        i25 = i31;
                        i17 = iM25614 ^ (-317116687);
                        s = s2;
                        i21 = i34;
                        i16 = i3;
                        c17308 = c17307;
                    }
                    break;
                case -222071851:
                case 2060746471:
                    throw m42352(C0382.m1840(sArr3, i19, i29, i18));
                case -16741851:
                case 2096000345:
                    i25 = i25;
                    j5 = 40 * ((long) i25);
                    if (C2105.m6982() != 0) {
                        iM6981 = C0630.m2566("ۤܽ") ^ i14;
                        i16 = ((iM6981 ^ i15) * 19695) ^ (-1019579734);
                        i6 = -1709724807;
                    } else {
                        iM6981 = (C0630.m2566("᩷ۙ") + i15) * 37;
                        i16 = ((iM6981 ^ i14) * 8663) ^ 1399803997;
                        i6 = 1572182972;
                    }
                    i17 = iM6981 ^ i6;
                    c17308 = c17307;
                    i25 = i25;
                    break;
                case 169988122:
                case 1377098880:
                    return c12532Arr2;
                case 531705958:
                case 559908322:
                    i18 = 37080;
                    iM2566 = C0630.m2566("ۙܿ") ^ i14;
                    i = i26;
                    i16 = ((iM2566 ^ i15) * 23373) ^ (-1483061769);
                    i2 = 1512295281;
                    i27 = i27;
                    i26 = i;
                    sArr2 = sArr2;
                    i17 = iM2566 ^ i2;
                    i25 = i25;
                    c17308 = c17307;
                    break;
                case 815948199:
                case 1056380709:
                    i25 = i25;
                    sArr2 = sArr2;
                    i = i26;
                    i27 = i27;
                    c = 680;
                    if (C4616.f14690 <= 0) {
                        iM2566 = (i15 - C2105.m6981("ܶܰ")) * 69;
                        i16 = ((iM2566 ^ i14) * (-22941)) ^ 1056462321;
                        i2 = 254947790;
                    } else {
                        iM2566 = (i15 - C0630.m2566("֫ۘ")) * (-5);
                        i16 = ((iM2566 ^ i14) * (-23875)) ^ (-1316162686);
                        i2 = -1569631307;
                    }
                    i27 = i27;
                    i26 = i;
                    sArr2 = sArr2;
                    i17 = iM2566 ^ i2;
                    i25 = i25;
                    c17308 = c17307;
                    break;
                case 826669930:
                case 1162121768:
                    C1128.m3851();
                    if (C4159.m12565() >= 0) {
                        iM2568 = (C2105.m6981("ۡ᩵") + i15) * (-123);
                        i11 = ((iM2568 ^ i14) * 31285) ^ 752060675;
                        i12 = 677307172;
                    } else {
                        iM2568 = C0630.m2566("ܽ֡") ^ i14;
                        i11 = ((iM2568 ^ i15) * (-10491)) ^ (-507215898);
                        i12 = 741873521;
                    }
                    i17 = iM2568 ^ i12;
                    i16 = i11;
                    break;
                default:
                    j = j2;
                    i8 = i25;
                    c17308.m40619(j);
                    c12532Arr = new C12532[i8];
                    i7 = 0;
                    j3 = 0;
                    int iM6985 = C2105.m6981("ۛᩴ") ^ i15;
                    i3 = ((iM6985 ^ i14) * 28787) ^ 1171383392;
                    i17 = iM6985 ^ (-367518492);
                    j2 = j;
                    i25 = i8;
                    i20 = i7;
                    c12532Arr2 = c12532Arr;
                    i16 = i3;
                    c17308 = c17307;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01df A[PHI: r4 r6 r27
      0x01df: PHI (r4v6 long) = (r4v3 long), (r4v4 long), (r4v3 long) binds: [B:55:0x01dd, B:47:0x0182, B:11:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01df: PHI (r6v6 long) = (r6v3 long), (r6v4 long), (r6v3 long) binds: [B:55:0x01dd, B:47:0x0182, B:11:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01df: PHI (r27v16 long) = (r27v3 long), (r27v4 long), (r27v17 long) binds: [B:55:0x01dd, B:47:0x0182, B:11:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m42350(int i, int i2, int i3, int[] iArr) {
        long j;
        int iM6981;
        int i4;
        int i5;
        int iM6982;
        int i6;
        int i7;
        int iM6983;
        int i8;
        int i9;
        int i10 = 2111439730;
        int i11 = C3245.f10203;
        int i12 = C5695.f17556;
        int iM6984 = (C2105.m6981("֨᩷") ^ i12) * (-51);
        int i13 = ((iM6984 ^ i11) * 9413) ^ 236599819;
        int i14 = iM6984 ^ (-2050257498);
        long jM1834 = 0;
        int i15 = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long jM10482 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        int i16 = i14;
        while (true) {
            long j9 = 0;
            while (true) {
                i10 = i16 ^ (i13 & (((i10 ^ i11) * 1413) >> 31));
                switch (i10) {
                    case -2079515141:
                    case 339782844:
                        break;
                    case -1791465712:
                    case 1363969566:
                        j = j9;
                        if (C1504.f5354) {
                            iM6981 = C2105.m6981("ۘ᩵") ^ i12;
                            i4 = ((iM6981 ^ i11) * 549) ^ 568550529;
                            i5 = -1357036733;
                        } else {
                            iM6981 = C0630.m2566("᩹ۡ") ^ i12;
                            i4 = ((iM6981 ^ i11) * 31329) ^ (-1650567640);
                            i5 = 297064007;
                        }
                        i13 = i4;
                        i16 = iM6981 ^ i5;
                        j9 = j;
                        break;
                    case -1650127149:
                    case 1892731227:
                        if (C4263.f13799 <= 0) {
                            j = j9;
                            iM6982 = C0630.m2566("᩶ۘ") ^ i11;
                            i6 = ((iM6982 ^ i12) * 27739) ^ (-378542523);
                            i7 = -46390839;
                            i16 = i7 ^ iM6982;
                            i13 = i6;
                            j9 = j;
                        }
                        j = j9;
                        iM6981 = (C0630.m2566("۬۟") ^ i12) * (-3);
                        i4 = ((iM6981 ^ i11) * (-9213)) ^ 2012766641;
                        i5 = 427255107;
                        i13 = i4;
                        i16 = iM6981 ^ i5;
                        j9 = j;
                        break;
                    case -1507071881:
                    case 869676959:
                        j = j9;
                        if (C1773.m5908() <= 0) {
                            iM6981 = (C0630.m2566("۬۟") ^ i12) * (-3);
                            i4 = ((iM6981 ^ i11) * (-9213)) ^ 2012766641;
                            i5 = 427255107;
                        } else {
                            iM6981 = C0630.m2566("ۚܽ") ^ i11;
                            i4 = ((iM6981 ^ i12) * (-11327)) ^ (-406102565);
                            i5 = 909717367;
                        }
                        i13 = i4;
                        i16 = iM6981 ^ i5;
                        j9 = j;
                        break;
                    case -1486507782:
                    case 724259140:
                        return j9;
                    case -1443865512:
                    case -166222487:
                        j = j9;
                        j8 = iArr[0];
                        j7 = i;
                        if (C2126.m7040()) {
                            iM6981 = (C0630.m2566("۬۟") ^ i12) * (-3);
                            i4 = ((iM6981 ^ i11) * (-9213)) ^ 2012766641;
                            i5 = 427255107;
                        } else {
                            iM6981 = (C2105.m6981("ۢۛ") + i11) * 37;
                            i4 = ((iM6981 ^ i12) * 23591) ^ 420324541;
                            i5 = -227032006;
                        }
                        i13 = i4;
                        i16 = iM6981 ^ i5;
                        j9 = j;
                        break;
                    case -1434627920:
                    case 1801978728:
                        if (C4263.m12819() < 0) {
                            j = j9;
                            iM6981 = C0630.m2566("ܶ᩵") ^ i11;
                            i4 = ((iM6981 ^ i12) * (-6247)) ^ (-699790264);
                            i5 = -1076056252;
                            i13 = i4;
                            i16 = iM6981 ^ i5;
                            j9 = j;
                        }
                        j = j9;
                        iM6981 = (C0630.m2566("۬۟") ^ i12) * (-3);
                        i4 = ((iM6981 ^ i11) * (-9213)) ^ 2012766641;
                        i5 = 427255107;
                        i13 = i4;
                        i16 = iM6981 ^ i5;
                        j9 = j;
                        break;
                    case -1288645189:
                    case 482621049:
                        j = j9;
                        jM1834 = C0382.m1834(j7, j2 & j4);
                        if (C7106.f21815 == 0) {
                            iM6983 = (i11 - C0630.m2566("ۢۡ")) * 49;
                            i8 = ((iM6983 ^ i12) * 12685) ^ (-2108387080);
                            i9 = -1097963814;
                            i16 = iM6983 ^ i9;
                            i13 = i8;
                            j9 = j;
                        }
                        iM6981 = C2105.m6981("ۘ᩵") ^ i12;
                        i4 = ((iM6981 ^ i11) * 549) ^ 568550529;
                        i5 = -1357036733;
                        i13 = i4;
                        i16 = iM6981 ^ i5;
                        j9 = j;
                        break;
                    case -1159206323:
                    case -229542600:
                        j = j9;
                        jM10482 = C3432.m10482(j7, j6 + j5);
                        if (C3683.f11629 < 0) {
                            iM6983 = C2105.m6981("ۙ֨") ^ i11;
                            i8 = ((iM6983 ^ i12) * 27625) ^ (-762941417);
                            i9 = -522207366;
                            i16 = iM6983 ^ i9;
                            i13 = i8;
                            j9 = j;
                        }
                        iM6981 = C2105.m6981("ۘ᩵") ^ i12;
                        i4 = ((iM6981 ^ i11) * 549) ^ 568550529;
                        i5 = -1357036733;
                        i13 = i4;
                        i16 = iM6981 ^ i5;
                        j9 = j;
                        break;
                    case -908620142:
                    case 556756439:
                        C4117.m12364();
                        C0483.m2121();
                        return 0L;
                    case -549043581:
                    case 2129572745:
                        C1711.m5736();
                        C1916.m6308();
                        j = j9;
                        iM6981 = (C0630.m2566("۬۟") ^ i12) * (-3);
                        i4 = ((iM6981 ^ i11) * (-9213)) ^ 2012766641;
                        i5 = 427255107;
                        i13 = i4;
                        i16 = iM6981 ^ i5;
                        j9 = j;
                        break;
                    case -264183710:
                    case 1110085001:
                        C4117.m12364();
                        if (C1773.f6144 > 0) {
                            j = j9;
                            iM6981 = (C2105.m6981("᩵ۛ") ^ i12) * 97;
                            i4 = ((iM6981 ^ i11) * (-32335)) ^ 817427409;
                            i5 = -1948886311;
                            i13 = i4;
                            i16 = iM6981 ^ i5;
                            j9 = j;
                        }
                        j = j9;
                        iM6981 = (C0630.m2566("۬۟") ^ i12) * (-3);
                        i4 = ((iM6981 ^ i11) * (-9213)) ^ 2012766641;
                        i5 = 427255107;
                        i13 = i4;
                        i16 = iM6981 ^ i5;
                        j9 = j;
                        break;
                    case -58667624:
                    case 1066747367:
                        j = j9;
                        if (C0798.f2919) {
                            iM6981 = C0630.m2566("ܶ᩵") ^ i11;
                            i4 = ((iM6981 ^ i12) * (-6247)) ^ (-699790264);
                            i5 = -1076056252;
                        } else {
                            iM6981 = C0630.m2566("ܺܳ") ^ i12;
                            i4 = ((iM6981 ^ i11) * (-14815)) ^ 2095512622;
                            i5 = -555618063;
                        }
                        i13 = i4;
                        i16 = iM6981 ^ i5;
                        j9 = j;
                        break;
                    case 165568383:
                    case 1840974972:
                        j = j9;
                        i15 = i2 - 1;
                        if (C4159.m12565() < 0) {
                            iM6982 = C2105.m6981("۬۠") ^ i11;
                            i6 = ((iM6982 ^ i12) * (-20905)) ^ 1922572765;
                            i7 = 2142716970;
                            i16 = i7 ^ iM6982;
                            i13 = i6;
                            j9 = j;
                        } else {
                            iM6981 = C2105.m6981("ۘ᩵") ^ i12;
                            i4 = ((iM6981 ^ i11) * 549) ^ 568550529;
                            i5 = -1357036733;
                            i13 = i4;
                            i16 = iM6981 ^ i5;
                            j9 = j;
                        }
                        break;
                    case 582977285:
                    case 941095710:
                        j = j9;
                        if (C4263.f13799 <= 0) {
                            iM6981 = (C2105.m6981("᩵ۛ") ^ i12) * 97;
                            i4 = ((iM6981 ^ i11) * (-32335)) ^ 817427409;
                            i5 = -1948886311;
                        } else {
                            iM6981 = (C2105.m6981("ܳᩳ") ^ i11) * (-95);
                            i4 = ((iM6981 ^ i12) * (-4119)) ^ 1779508921;
                            i5 = -1578855976;
                        }
                        i13 = i4;
                        i16 = iM6981 ^ i5;
                        j9 = j;
                        break;
                    case 662807811:
                    case 1127659213:
                        return C11340.m28024(C13510.m32535(Math.max(j9, jM1834 - j3)), 192L);
                    case 1573830966:
                    case 1839122070:
                        j = j9;
                        j6 = iArr[i15];
                        j5 = i3;
                        if (C2167.f7158 >= 0) {
                            iM6982 = C0630.m2566("᩶ۘ") ^ i11;
                            i6 = ((iM6982 ^ i12) * 27739) ^ (-378542523);
                            i7 = -46390839;
                        } else {
                            iM6982 = (C0630.m2566("ۚ᩵") ^ i12) * 65;
                            i6 = ((iM6982 ^ i11) * 11659) ^ 2018463161;
                            i7 = -914750284;
                        }
                        i16 = i7 ^ iM6982;
                        i13 = i6;
                        j9 = j;
                        break;
                    default:
                        j = j9;
                        j4 = -65536;
                        j3 = j8 & (-65536);
                        j2 = jM10482 + 65535;
                        if (C2105.f7037 == 0) {
                            iM6983 = C2105.m6981("ۙۜ") ^ i12;
                            i8 = ((iM6983 ^ i11) * (-17531)) ^ 772854350;
                            i9 = -235680499;
                            i16 = iM6983 ^ i9;
                            i13 = i8;
                            j9 = j;
                        } else {
                            iM6982 = C0630.m2566("᩶ۘ") ^ i11;
                            i6 = ((iM6982 ^ i12) * 27739) ^ (-378542523);
                            i7 = -46390839;
                            i16 = i7 ^ iM6982;
                            i13 = i6;
                            j9 = j;
                        }
                        break;
                }
            }
            if (i2 == 0) {
                int iM2566 = C0630.m2566("۫ۛ") ^ i12;
                i16 = (-971199421) ^ iM2566;
                i13 = ((iM2566 ^ i11) * (-25533)) ^ 79368627;
            } else {
                int iM2567 = (i12 - C0630.m2566("۫ܽ")) * 11;
                i13 = ((iM2567 ^ i11) * 8421) ^ (-2020625494);
                i16 = iM2567 ^ (-1734049457);
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m42364() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        short s3 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1196404635;
        int i5 = C4075.f12947;
        int i6 = RunnableC0588.f2309;
        int iM6981 = C2105.m6981("᩷᩸") ^ i6;
        int i7 = ((iM6981 ^ i5) * (-26629)) ^ (-2106550744);
        int i8 = -1639589146;
        while (true) {
            i4 = ((((i4 ^ i5) * 9399) >> 31) & i7) ^ (iM6981 ^ i8);
            switch (i4) {
                case -2127785145:
                case 844268112:
                    if (!C3663.f11553) {
                        iM6981 = (C0630.m2566("֫᩸") ^ i5) * 7;
                        i7 = ((iM6981 ^ i6) * (-28617)) ^ (-1240350767);
                        i8 = 15956344;
                    } else {
                        iM6981 = (C2105.m6981("۟ۚ") + i5) * 127;
                        i7 = ((iM6981 ^ i6) * 16817) ^ 1943483773;
                        i8 = -1830898084;
                    }
                    break;
                case -2110392743:
                case 832842050:
                    i = s * s2;
                    s3 = 4046;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (i6 - C2105.m6981("۫ܳ")) * (-33);
                        i7 = ((iM6981 ^ i5) * 375) ^ (-1511540402);
                        i8 = -1620538263;
                    } else {
                        iM6981 = (i5 - C0630.m2566("۬ۡ")) * 97;
                        i7 = ((iM6981 ^ i6) * 32367) ^ (-677231265);
                        i8 = -549438134;
                    }
                    break;
                case -2060929073:
                case 1033088036:
                    s = sArr[c];
                    s2 = 16184;
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C0630.m2566("ܽ᩺") ^ i5) * (-39);
                        i7 = ((iM6981 ^ i6) * 21613) ^ (-2097912192);
                        i8 = -290206253;
                    } else {
                        iM6981 = (C0630.m2566("֨ۜ") ^ i5) * 31;
                        i7 = ((iM6981 ^ i6) * 11743) ^ (-254838914);
                        i8 = 19702733;
                    }
                    break;
                case -1890936393:
                case 629997992:
                    short[] sArr2 = f56533;
                    if (C2105.f7037 == 0) {
                        if (!C1504.f5354) {
                            throw new IllegalStateException(C0798.m3005(sArr2, 891, 24, i3));
                        }
                        iM6981 = (i6 - C2105.m6981("۫ܳ")) * (-33);
                        i7 = ((iM6981 ^ i5) * 375) ^ (-1511540402);
                        i8 = -1620538263;
                    } else {
                        iM6981 = (C2105.m6981("۟ۚ") + i5) * 127;
                        i7 = ((iM6981 ^ i6) * 16817) ^ 1943483773;
                        i8 = -1830898084;
                    }
                    break;
                case -1520136547:
                case -1342453602:
                    c = 890;
                    if (C1005.f3721) {
                        iM6981 = (C2105.m6981("᩻ܳ") ^ i6) * (-115);
                        i7 = ((iM6981 ^ i5) * (-12699)) ^ (-871345772);
                        i8 = -388777745;
                    } else {
                        iM6981 = (C2105.m6981("۟ۚ") + i5) * 127;
                        i7 = ((iM6981 ^ i6) * 16817) ^ 1943483773;
                        i8 = -1830898084;
                    }
                    break;
                case -1419964270:
                case 129854376:
                    sArr = f56533;
                    if (C1916.f6442) {
                        iM6981 = (C0630.m2566("᩸۟") ^ i5) * 123;
                        i7 = ((iM6981 ^ i6) * 18321) ^ (-1336277505);
                        i8 = 1934734043;
                    } else {
                        iM6981 = (i6 - C2105.m6981("۫ܳ")) * (-33);
                        i7 = ((iM6981 ^ i5) * 375) ^ (-1511540402);
                        i8 = -1620538263;
                    }
                    break;
                case -1407724002:
                case 210167178:
                    if (this.f56550 == null) {
                        iM6981 = (C0630.m2566("۬᩸") ^ i6) * (-67);
                        i7 = ((iM6981 ^ i5) * (-2315)) ^ (-1442282410);
                        i8 = -189907220;
                    } else {
                        iM6981 = C0630.m2566("ᩴ֫") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-8043)) ^ 1671629535;
                        i8 = -1133131856;
                    }
                    break;
                case -1287929835:
                case 2042651776:
                    i3 = 20742;
                    iM6981 = (C2105.m6981("۟֫") + i5) * (-115);
                    i7 = ((iM6981 ^ i6) * (-27205)) ^ 924056621;
                    i8 = 312678058;
                    break;
                case -1178070672:
                case 1314162313:
                    C3911.m11924();
                    C4263.m12819();
                    iM6981 = (C0630.m2566("֫᩸") ^ i5) * 7;
                    i7 = ((iM6981 ^ i6) * (-28617)) ^ (-1240350767);
                    i8 = 15956344;
                    break;
                case -1167033653:
                case -1127207138:
                    C1504.m5179();
                    return;
                case -1102303284:
                case -477181178:
                    if (C2520.m8026()) {
                        iM6981 = (C0630.m2566("ۨۙ") ^ i6) * (-55);
                        i7 = ((iM6981 ^ i5) * 2561) ^ 881410561;
                        i8 = 1781003657;
                    } else {
                        iM6981 = C2105.m6981("ۡۗ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-141)) ^ 81486157;
                        i8 = -1234461980;
                    }
                    break;
                case -682819602:
                case -523766204:
                    C1916.m6308();
                    if (C0630.f2410 > 0) {
                        iM6981 = (C0630.m2566("ۨۙ") ^ i6) * (-55);
                        i7 = ((iM6981 ^ i5) * 2561) ^ 881410561;
                        i8 = 1781003657;
                    } else {
                        iM6981 = (i6 - C2105.m6981("۫ܳ")) * (-33);
                        i7 = ((iM6981 ^ i5) * 375) ^ (-1511540402);
                        i8 = -1620538263;
                    }
                    break;
                case -668950860:
                case 1927456708:
                    if ((i2 * i2) - i < 0) {
                        iM6981 = C2105.m6981("᩵۬") ^ i6;
                        i7 = ((iM6981 ^ i5) * 13757) ^ 1813662299;
                        i8 = -2052037109;
                    } else {
                        iM6981 = C2105.m6981("۟ۖ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 26797) ^ 905353653;
                        i8 = -241455473;
                    }
                    break;
                case -250791138:
                case 1525040875:
                    if (C3683.f11629 >= 0) {
                        iM6981 = (C0630.m2566("֫᩸") ^ i5) * 7;
                        i7 = ((iM6981 ^ i6) * (-28617)) ^ (-1240350767);
                        i8 = 15956344;
                    } else {
                        iM6981 = C0630.m2566("ۡ᩹") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-7593)) ^ 1625866131;
                        i8 = 666320859;
                    }
                    break;
                case 164881718:
                case 1206195643:
                    return;
                case 567841070:
                case 927227281:
                    C3537.m10746();
                    if (C4117.f13076 > 0) {
                        iM6981 = (i6 - C2105.m6981("۫ܳ")) * (-33);
                        i7 = ((iM6981 ^ i5) * 375) ^ (-1511540402);
                        i8 = -1620538263;
                    } else {
                        iM6981 = (C0630.m2566("֫᩸") ^ i5) * 7;
                        i7 = ((iM6981 ^ i6) * (-28617)) ^ (-1240350767);
                        i8 = 15956344;
                    }
                    break;
                case 1043355434:
                case 1882158836:
                    if (C0050.f910 >= 0) {
                        iM6981 = (C0630.m2566("֫᩸") ^ i5) * 7;
                        i7 = ((iM6981 ^ i6) * (-28617)) ^ (-1240350767);
                        i8 = 15956344;
                    } else {
                        iM6981 = (C2105.m6981("֨ۖ") ^ i6) * (-33);
                        i7 = ((iM6981 ^ i5) * (-5195)) ^ (-886945424);
                        i8 = -2080438078;
                    }
                    break;
                case 1114346626:
                case 1970136265:
                    i2 = s + s3;
                    if (C21923.f70183 != 0) {
                        iM6981 = (C2105.m6981("۟ۚ") + i5) * 127;
                        i7 = ((iM6981 ^ i6) * 16817) ^ 1943483773;
                        i8 = -1830898084;
                    } else {
                        iM6981 = C0630.m2566("᩻ᩴ") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-1441)) ^ 523470178;
                        i8 = 1104686658;
                    }
                    break;
                default:
                    i3 = 55837;
                    iM6981 = (C2105.m6981("۟֫") + i5) * (-115);
                    i7 = ((iM6981 ^ i6) * (-27205)) ^ 924056621;
                    i8 = 312678058;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42338(C9047 c9047, C12100 c12100, C5477 c5477, int i) {
        boolean z = false;
        C21042 c21042 = null;
        int i2 = 1479119867;
        int i3 = C1128.f4106;
        int i4 = C3245.f10203;
        int iM6981 = C2105.m6981("ᩳ᩻") ^ i4;
        int i5 = ((iM6981 ^ i3) * 14675) ^ 784898537;
        int i6 = 2012401330;
        while (true) {
            int i7 = iM6981 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * 20363) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2045618907:
                    case 1484007084:
                        return z;
                    case -1996442361:
                    case -657662079:
                        if (!c12100.f36164) {
                            iM6981 = C2105.m6981("ᩴۨ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-14043)) ^ 1755406958;
                            i6 = -1066861860;
                            break;
                        }
                        iM6981 = C2105.m6981("᩷ۚ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 24423) ^ 468007552;
                        i6 = 2073734243;
                        break;
                    case -1952638587:
                    case 1762023592:
                        if (c21042.f67895 != null) {
                            iM6981 = C2105.m6981("᩷ۚ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 24423) ^ 468007552;
                            i6 = 2073734243;
                            break;
                            break;
                        }
                        iM6981 = (C2105.m6981("ۤ۫") + i4) * 25;
                        i5 = ((iM6981 ^ i3) * 12287) ^ (-1334094614);
                        i6 = 1426671130;
                        break;
                    case -1895391616:
                    case 837404965:
                        if (C7811.f24123 < 0) {
                            iM6981 = (C0630.m2566("ۖܽ") ^ i3) * (-47);
                            i5 = ((iM6981 ^ i4) * (-21871)) ^ 1704465915;
                            i6 = 1435913649;
                            break;
                        }
                        iM6981 = C0630.m2566("᩶᩻") ^ i4;
                        i5 = ((iM6981 ^ i3) * 6549) ^ 1299041223;
                        i6 = -15346052;
                        break;
                    case -1875405612:
                    case -1057396101:
                        if (C7106.f21815 == 0) {
                            iM6981 = C0630.m2566("ۡۖ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-7957)) ^ (-970945641);
                            i6 = -1634232810;
                            break;
                        }
                        iM6981 = (C0630.m2566("ۨۜ") ^ i4) * (-57);
                        i5 = ((iM6981 ^ i3) * (-16993)) ^ 1004920916;
                        i6 = -992241612;
                        break;
                    case -1775574672:
                    case -1021970992:
                        C1420.m4913();
                        C0050.m940();
                        return false;
                    case -1731199290:
                    case -1546906819:
                        if (C3019.m9255() > 0) {
                            iM6981 = (C2105.m6981("ۨܳ") ^ i4) * 97;
                            i5 = ((iM6981 ^ i3) * (-717)) ^ (-1998807532);
                            i6 = -1626477373;
                            break;
                        }
                        iM6981 = (C0630.m2566("ۛ۬") ^ i3) * 3;
                        i5 = ((iM6981 ^ i4) * (-8275)) ^ 355348054;
                        i6 = 1496908321;
                        break;
                    case -1415811036:
                    case -476949477:
                        if (C5695.f17556 < 0) {
                            iM6981 = C2105.m6981("ᩴۖ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 10155) ^ 1853156518;
                            i6 = 1980381966;
                            break;
                        }
                        iM6981 = C2105.m6981("ۢۙ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 23561) ^ 1739105365;
                        i6 = 447386653;
                        break;
                    case -1380280908:
                    case 986501670:
                        if (!C0382.f1805) {
                            iM6981 = C0630.m2566("᩷ۗ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-12241)) ^ 1741489330;
                            i6 = 517248798;
                            break;
                        }
                        iM6981 = (C0630.m2566("ۨۜ") ^ i4) * (-57);
                        i5 = ((iM6981 ^ i3) * (-16993)) ^ 1004920916;
                        i6 = -992241612;
                        break;
                        break;
                    case -1320116432:
                    case 1514320140:
                        if (C21923.f70183 == 0) {
                            iM6981 = C2105.m6981("ۖ֫") ^ i3;
                            i5 = ((iM6981 ^ i4) * 19395) ^ 1298195808;
                            i6 = -350844346;
                            break;
                        }
                        iM6981 = (i3 - C0630.m2566("֨֨")) * 49;
                        i5 = ((iM6981 ^ i4) * 9969) ^ (-1453450830);
                        i6 = 211308028;
                        break;
                    case -1131421989:
                    case -1125248405:
                        if (!C0382.f1805) {
                            iM6981 = (i4 - C0630.m2566("۫ܽ")) * 49;
                            i5 = ((iM6981 ^ i3) * (-17415)) ^ 1964865281;
                            i6 = -218495965;
                            break;
                        }
                        iM6981 = C2105.m6981("ܰۤ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-15757)) ^ (-1237513117);
                        i6 = 606800840;
                        break;
                    case -1052345829:
                    case 1085772810:
                        if (C21923.f70183 != 0) {
                            iM6981 = (i4 - C0630.m2566("۫ܽ")) * 49;
                            i5 = ((iM6981 ^ i3) * (-17415)) ^ 1964865281;
                            i6 = -218495965;
                            break;
                            break;
                        }
                        iM6981 = C2105.m6981("ۢۙ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 23561) ^ 1739105365;
                        i6 = 447386653;
                        break;
                        break;
                    case -1052225448:
                    case 953356354:
                        if (C1294.m4372() > 0) {
                            iM6981 = (i3 - C0630.m2566("֨֨")) * 49;
                            i5 = ((iM6981 ^ i4) * 9969) ^ (-1453450830);
                            i6 = 211308028;
                            break;
                            break;
                        }
                        iM6981 = C0630.m2566("᩷ۗ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-12241)) ^ 1741489330;
                        i6 = 517248798;
                        break;
                        break;
                    case -923809824:
                    case 783367338:
                        if (i != 0) {
                            iM6981 = C0630.m2566("ۚ᩺") ^ i4;
                            i5 = ((iM6981 ^ i3) * 28451) ^ 1799109929;
                            i6 = 2014292348;
                            break;
                        }
                        iM6981 = C0630.m2566("ܳۜ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 29601) ^ 1093052478;
                        i6 = 42544487;
                        break;
                    case -830777898:
                    case 106838058:
                        if (c21042.f67897 != 0) {
                            iM6981 = C2105.m6981("᩷ۚ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 24423) ^ 468007552;
                            i6 = 2073734243;
                            break;
                            break;
                        }
                        iM6981 = C2105.m6981("֡ۛ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-22323)) ^ 793794473;
                        i6 = -263007787;
                        break;
                    case -775694051:
                    case 1517690868:
                        if (c9047 == null) {
                            iM6981 = C2105.m6981("᩷ۚ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 24423) ^ 468007552;
                            i6 = 2073734243;
                            break;
                            break;
                        }
                        iM6981 = C0630.m2566("ۧۖ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-3587)) ^ 1343700931;
                        i6 = -85461590;
                        break;
                    case -660705011:
                    case 694037885:
                        if (!RunnableC1937.m6381(c9047)) {
                            iM6981 = C2105.m6981("᩷ۚ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 24423) ^ 468007552;
                            i6 = 2073734243;
                            break;
                            break;
                        }
                        iM6981 = C0630.m2566("ᩴܿ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-8409)) ^ 1659537352;
                        i6 = -822777367;
                        break;
                    case -579878703:
                    case 1167128543:
                        if (AbstractC2021.f6743 > 0) {
                            iM6981 = (C0630.m2566("ۛ۬") ^ i3) * 3;
                            i5 = ((iM6981 ^ i4) * (-8275)) ^ 355348054;
                            i6 = 1496908321;
                            break;
                            break;
                        }
                        iM6981 = C0630.m2566("᩷ۗ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-12241)) ^ 1741489330;
                        i6 = 517248798;
                        break;
                        break;
                    case -575822130:
                    case 380095727:
                        if (c12100 != null) {
                            iM6981 = (C2105.m6981("ۨ֨") + i3) * 45;
                            i5 = ((iM6981 ^ i4) * 17791) ^ 1433889289;
                            i6 = 657446980;
                            break;
                        }
                        iM6981 = (C2105.m6981("ۤ۫") + i4) * 25;
                        i5 = ((iM6981 ^ i3) * 12287) ^ (-1334094614);
                        i6 = 1426671130;
                        break;
                        break;
                    case -444050694:
                    case 2104006526:
                        if (C0422.f1886 > 0) {
                            iM6981 = C0630.m2566("ܶ᩸") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-27221)) ^ 1478542090;
                            i6 = 2017137510;
                            break;
                        }
                        iM6981 = (C0630.m2566("ۨۜ") ^ i4) * (-57);
                        i5 = ((iM6981 ^ i3) * (-16993)) ^ 1004920916;
                        i6 = -992241612;
                        break;
                        break;
                    case -426531366:
                    case 1811249397:
                        if (C4616.f14690 > 0) {
                            iM6981 = (C0630.m2566("᩷ᩴ") ^ i4) * 27;
                            i5 = ((iM6981 ^ i3) * (-13913)) ^ (-486466330);
                            i6 = -30020671;
                            break;
                        }
                        iM6981 = C2105.m6981("ۢۙ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 23561) ^ 1739105365;
                        i6 = 447386653;
                        break;
                        break;
                    case -326169910:
                    case 1339726287:
                        c21042 = c9047.f27427;
                        if (c21042.f67896 != c5477) {
                            iM6981 = C2105.m6981("᩷ۚ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 24423) ^ 468007552;
                            i6 = 2073734243;
                            break;
                            break;
                        }
                        iM6981 = C2105.m6981("֨ۗ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 11011) ^ (-284054447);
                        i6 = -956308431;
                        break;
                    case -323031394:
                    case 1925256952:
                        if (c12100 == null) {
                            iM6981 = C2105.m6981("ᩴۨ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-14043)) ^ 1755406958;
                            i6 = -1066861860;
                            break;
                            break;
                        }
                        iM6981 = (C0630.m2566("۟᩻") ^ i4) * (-43);
                        i5 = ((iM6981 ^ i3) * (-20655)) ^ 1169015978;
                        i6 = -314384347;
                        break;
                    case -238083683:
                    case 1507905352:
                        return z;
                    case -217510180:
                    case -120167609:
                        if (c21042.f67894 != i) {
                            iM6981 = C2105.m6981("᩷ۚ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 24423) ^ 468007552;
                            i6 = 2073734243;
                            break;
                            break;
                        }
                        iM6981 = C0630.m2566("۬۬") ^ i4;
                        i5 = ((iM6981 ^ i3) * 23545) ^ 256880653;
                        i6 = -1444635539;
                        break;
                    case -116061565:
                    case 1435031730:
                        if (!C0964.m3413()) {
                            iM6981 = (i3 - C0630.m2566("ܽܽ")) * (-127);
                            i5 = ((iM6981 ^ i4) * (-27463)) ^ 539738026;
                            i6 = -549619755;
                            break;
                        }
                        iM6981 = (C2105.m6981("۟ᩴ") ^ i3) * 17;
                        i5 = ((iM6981 ^ i4) * (-30595)) ^ 683830654;
                        i6 = 1344937718;
                        break;
                    case 149318989:
                    case 2054134470:
                        return true;
                    case 168676518:
                    case 1221839569:
                        if (c9047 != null) {
                            iM6981 = (C2105.m6981("ۨ֨") + i3) * 45;
                            i5 = ((iM6981 ^ i4) * 17791) ^ 1433889289;
                            i6 = 657446980;
                            break;
                            break;
                        }
                        iM6981 = C0630.m2566("ۘᩳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-1217)) ^ 1425153188;
                        i6 = -718712931;
                        break;
                    case 374582166:
                    case 1079257604:
                        C1420.m4913();
                        iM6981 = (C0630.m2566("ۨۜ") ^ i4) * (-57);
                        i5 = ((iM6981 ^ i3) * (-16993)) ^ 1004920916;
                        i6 = -992241612;
                        break;
                        break;
                    case 703202377:
                    case 1557499606:
                        if (C0714.f2697 >= 0) {
                            iM6981 = (i3 - C0630.m2566("ܽܽ")) * (-127);
                            i5 = ((iM6981 ^ i4) * (-27463)) ^ 539738026;
                            i6 = -549619755;
                            break;
                            break;
                        }
                        iM6981 = C2105.m6981("ۢۙ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 23561) ^ 1739105365;
                        i6 = 447386653;
                        break;
                        break;
                    case 749726132:
                    case 1182489387:
                        if (C21923.f70183 == 0) {
                            iM6981 = C0630.m2566("᩻᩵") ^ i4;
                            i5 = ((iM6981 ^ i3) * 30071) ^ (-2126715982);
                            i6 = -940423736;
                            break;
                        }
                        iM6981 = (C0630.m2566("ۨۜ") ^ i4) * (-57);
                        i5 = ((iM6981 ^ i3) * (-16993)) ^ 1004920916;
                        i6 = -992241612;
                        break;
                        break;
                    case 973946286:
                    case 2081806642:
                        if (i != c5477.length()) {
                            z = false;
                            iM6981 = C2105.m6981("᩷ۚ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 24423) ^ 468007552;
                            i6 = 2073734243;
                            break;
                        }
                        int iM2566 = (C0630.m2566("᩶ۡ") ^ i3) * 127;
                        i5 = ((iM2566 ^ i4) * (-21385)) ^ 149666181;
                        i7 = iM2566 ^ (-676734461);
                        z = false;
                        break;
                        break;
                    case 1130234932:
                    case 1416649092:
                        if (C1047.f3863 < 0) {
                            iM6981 = C2105.m6981("֨᩸") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-30959)) ^ (-977280885);
                            i6 = -1421288155;
                            break;
                        }
                        iM6981 = (C0630.m2566("ۛ۬") ^ i3) * 3;
                        i5 = ((iM6981 ^ i4) * (-8275)) ^ 355348054;
                        i6 = 1496908321;
                        break;
                        break;
                    default:
                        C4159.m12565();
                        if (!C3683.m11222()) {
                            iM6981 = C2105.m6981("ۢۙ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 23561) ^ 1739105365;
                            i6 = 447386653;
                            break;
                            break;
                        }
                        iM6981 = C0630.m2566("᩷ۗ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-12241)) ^ 1741489330;
                        i6 = 517248798;
                        break;
                        break;
                }
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 87441. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42319(java.io.DataOutputStream r73, l.InterfaceC18883 r74, l.C16059 r75, boolean r76) {
        /*
            Method dump skipped, instruction units count: 8744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18177.m42319(java.io.DataOutputStream, l.ᩴܽܳ, l.ܺܽܳ, boolean):void");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x021c  */
    /* JADX WARN: Code duplicated, block: B:72:0x024b  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (l.C1420.m4913() == false) goto L14;
     */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m42388(int i, int i2, byte[] bArr) throws Throwable {
        int iM2566;
        int i3;
        int i4;
        int iM2567;
        int i5;
        int i6;
        int i7 = C3683.f11629;
        int i8 = C22628.f73083;
        int iM2568 = C0630.m2566("ۘ֫") ^ i8;
        int i9 = ((iM2568 ^ i7) * (-8133)) ^ 139397374;
        int i10 = iM2568 ^ 617329158;
        Object obj = null;
        int i11 = -121167532;
        Throwable th = null;
        InterfaceC17066 interfaceC17066 = null;
        C11122 c11122M42391 = null;
        int length = 0;
        while (true) {
            int i12 = i10 ^ ((((i11 ^ i7) * 7407) >> 31) & i9);
            switch (i12) {
                case -1998270676:
                case -1474924785:
                    if (C4117.f13076 <= 0) {
                        iM2566 = (C0630.m2566("ᩳ۠") ^ i7) * (-5);
                        i3 = ((iM2566 ^ i8) * 1417) ^ (-1360309590);
                        i4 = 1259664955;
                    } else {
                        iM2566 = (C2105.m6981("ۖ᩻") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i3 = ((iM2566 ^ i8) * 13221) ^ 1953290351;
                        i4 = -815208514;
                    }
                    i6 = iM2566 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -1694544899:
                case -1012758997:
                    if (C1005.m3501()) {
                        iM2566 = C2105.m6981("ܺ۠") ^ i8;
                        i3 = ((iM2566 ^ i7) * 24415) ^ (-867234501);
                        i4 = -1644851446;
                    } else {
                        iM2566 = (i7 - C2105.m6981("۠ۛ")) * 123;
                        i3 = ((iM2566 ^ i8) * (-25217)) ^ 1024127019;
                        i4 = 1998568683;
                    }
                    i6 = iM2566 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -1680580630:
                case 1920200283:
                    break;
                case -1638725974:
                case 916404000:
                    length = bArr.length;
                    c11122M42391 = m42391();
                    interfaceC17066 = null;
                    iM2566 = C0630.m2566("᩻ۗ") ^ i8;
                    i3 = ((iM2566 ^ i7) * 6067) ^ (-54130638);
                    i4 = 1351030770;
                    i6 = iM2566 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -1391591891:
                case 34058794:
                    if (C22628.f73083 > 0) {
                        iM2566 = C0630.m2566("ۤܽ") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-18437)) ^ 1108710357;
                        i4 = 352974202;
                        i6 = iM2566 ^ i4;
                        i9 = i3;
                        i10 = i6;
                        i11 = i12;
                    }
                    iM2566 = C0630.m2566("ܰ۬") ^ i8;
                    i3 = ((iM2566 ^ i7) * (-24277)) ^ 1965744036;
                    i4 = 1496409281;
                    i6 = iM2566 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -1297250474:
                case -510728114:
                    C3911.m11924();
                    if (C0050.m940() > 0) {
                        iM2566 = (C0630.m2566("ᩳ۠") ^ i7) * (-5);
                        i3 = ((iM2566 ^ i8) * 1417) ^ (-1360309590);
                        i4 = 1259664955;
                        i6 = iM2566 ^ i4;
                        i9 = i3;
                        i10 = i6;
                        i11 = i12;
                    }
                    iM2566 = (i7 - C2105.m6981("۠ۛ")) * 123;
                    i3 = ((iM2566 ^ i8) * (-25217)) ^ 1024127019;
                    i4 = 1998568683;
                    i6 = iM2566 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -906658746:
                case -729938098:
                    if (C0630.m2564()) {
                        iM2566 = (i7 - C2105.m6981("۠ۛ")) * 123;
                        i3 = ((iM2566 ^ i8) * (-25217)) ^ 1024127019;
                        i4 = 1998568683;
                    } else {
                        iM2566 = (C2105.m6981("ۗ֡") + i8) * 47;
                        i3 = ((iM2566 ^ i7) * (-30695)) ^ 535033431;
                        i4 = -1521600391;
                    }
                    i6 = iM2566 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -822323436:
                case -353887465:
                    C0714.m2815(th, obj);
                    iM2567 = C2105.m6981("۟ܽ") ^ i8;
                    i9 = ((iM2567 ^ i7) * (-23875)) ^ (-1132352480);
                    i5 = -723747847;
                    i6 = iM2567 ^ i5;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -729515365:
                case 585477864:
                    c11122M42391.close();
                    return;
                case -590523961:
                case 485109660:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (i7 - C2105.m6981("۠ۛ")) * 123;
                        i3 = ((iM2566 ^ i8) * (-25217)) ^ 1024127019;
                        i4 = 1998568683;
                    } else {
                        iM2566 = (C2105.m6981("֡ۛ") + i8) * (-35);
                        i3 = ((iM2566 ^ i7) * 6923) ^ (-285819764);
                        i4 = -624037619;
                    }
                    i6 = iM2566 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -588445263:
                case 1260359429:
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("ۤܽ") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-18437)) ^ 1108710357;
                        i4 = 352974202;
                    } else {
                        iM2566 = (C0630.m2566("ۤ۟") + i8) * 79;
                        i3 = ((iM2566 ^ i7) * 645) ^ 589685395;
                        i4 = -619363291;
                    }
                    i6 = iM2566 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -547520938:
                case -366604020:
                    try {
                        c11122M42391.close();
                        iM2567 = C2105.m6981("۟ܽ") ^ i8;
                        i9 = ((iM2567 ^ i7) * (-23875)) ^ (-1132352480);
                        i5 = -723747847;
                        i6 = iM2567 ^ i5;
                        i10 = i6;
                        i11 = i12;
                    } catch (Throwable th2) {
                        int iM6981 = C2105.m6981("ۧ᩻") ^ i8;
                        i9 = ((iM6981 ^ i7) * 12511) ^ 1688698693;
                        int i13 = iM6981 ^ (-81813117);
                        obj = th2;
                        i11 = i12;
                        i10 = i13;
                    }
                    break;
                case -515923676:
                case 1498578804:
                    throw th;
                case 180915433:
                case 1701259949:
                    try {
                        c11122M42391.m27598(i, i2, bArr, length, interfaceC17066);
                        c11122M42391.m27600((InterfaceC17066) null);
                        iM2567 = (C0630.m2566("۟֫") ^ i7) * 7;
                        i9 = ((iM2567 ^ i8) * 12557) ^ 1561586087;
                        i5 = 2067121244;
                    } catch (Throwable th3) {
                        th = th3;
                        iM2567 = (C0630.m2566("ۚۢ") + i7) * (-123);
                        i9 = ((iM2567 ^ i8) * 519) ^ (-1335524676);
                        i5 = 1560349151;
                    }
                    i6 = iM2567 ^ i5;
                    i10 = i6;
                    i11 = i12;
                    break;
                case 198166445:
                case 1345434205:
                    C0237.m1481();
                    return;
                case 287862070:
                case 391125287:
                    if (C1005.f3721) {
                        iM2566 = (C0630.m2566("ۢᩴ") ^ i7) * 35;
                        i3 = ((iM2566 ^ i8) * (-16271)) ^ 4195912;
                        i4 = -1378233162;
                    } else {
                        iM2566 = (C0630.m2566("ᩳ۠") ^ i7) * (-5);
                        i3 = ((iM2566 ^ i8) * 1417) ^ (-1360309590);
                        i4 = 1259664955;
                    }
                    i6 = iM2566 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case 404094367:
                case 2051436071:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (i7 - C2105.m6981("۠ۛ")) * 123;
                        i3 = ((iM2566 ^ i8) * (-25217)) ^ 1024127019;
                        i4 = 1998568683;
                    } else {
                        iM2566 = C2105.m6981("ۗܳ") ^ i7;
                        i3 = ((iM2566 ^ i8) * 11971) ^ (-1938487219);
                        i4 = 675957526;
                    }
                    i6 = iM2566 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case 932098478:
                case 2027815545:
                    if (C2105.f7037 != 0) {
                        iM2566 = C0630.m2566("ܰ۬") ^ i8;
                        i3 = ((iM2566 ^ i7) * (-24277)) ^ 1965744036;
                        i4 = 1496409281;
                    } else {
                        iM2566 = C0630.m2566("ܶۨ") ^ i7;
                        i3 = ((iM2566 ^ i8) * 23745) ^ 1601652936;
                        i4 = 678047278;
                    }
                    i6 = iM2566 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case 1100480922:
                case 1975606931:
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = C0630.m2566("ۤܽ") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-18437)) ^ 1108710357;
                        i4 = 352974202;
                    } else {
                        iM2566 = C2105.m6981("ۛܶ") ^ i8;
                        i3 = ((iM2566 ^ i7) * 25333) ^ 681341166;
                        i4 = 1295900449;
                    }
                    i6 = iM2566 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case 1258921436:
                case 1825736606:
                    C0483.m2121();
                    iM2566 = (i7 - C2105.m6981("۠ۛ")) * 123;
                    i3 = ((iM2566 ^ i8) * (-25217)) ^ 1024127019;
                    i4 = 1998568683;
                    i6 = iM2566 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                default:
                    if (C0483.f2088 >= 0) {
                        iM2566 = (C0630.m2566("ᩴ֨") + i8) * 19;
                        i3 = ((iM2566 ^ i7) * 20989) ^ 952910719;
                        i4 = -1390725864;
                    } else {
                        iM2566 = (C2105.m6981("ۛ᩶") + i7) * (-41);
                        i3 = ((iM2566 ^ i8) * (-4477)) ^ (-2064659013);
                        i4 = 1212722290;
                    }
                    i6 = iM2566 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    private C7429 m42372() throws IOException {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = 1880165899;
        int i6 = ServiceConnectionC3453.f10921;
        int i7 = C1294.f4556;
        int iM2566 = (i6 - C0630.m2566("᩺ۗ")) * (-43);
        int i8 = ((iM2566 ^ i7) * (-13477)) ^ (-695285722);
        int i9 = 1402696675;
        while (true) {
            i5 = ((((i5 ^ i7) * (-21435)) >> 31) & i8) ^ (iM2566 ^ i9);
            switch (i5) {
                case -2095889851:
                case -276341728:
                    i4 = 57280;
                    iM2566 = (C0630.m2566("ۘ֨") + i6) * 91;
                    i8 = ((iM2566 ^ i7) * (-19009)) ^ 1670797803;
                    i9 = 459390932;
                    break;
                case -1733689625:
                case 398687669:
                    if (this.f56539) {
                        iM2566 = C2105.m6981("᩷ۨ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-29319)) ^ 966342407;
                        i9 = 1575674875;
                    } else {
                        iM2566 = (C2105.m6981("ۚۘ") + i6) * q.h;
                        i8 = ((iM2566 ^ i7) * (-28451)) ^ 680229929;
                        i9 = -690844527;
                    }
                    break;
                case -1688921850:
                case 1635760748:
                    sArr = f56533;
                    if (C1504.f5354) {
                        iM2566 = (i7 - C0630.m2566("ܰ᩵")) * (-107);
                        i8 = ((iM2566 ^ i6) * 26249) ^ (-2128183285);
                        i9 = 1908705669;
                    } else {
                        iM2566 = (C0630.m2566("ܽۜ") ^ i6) * 43;
                        i8 = ((iM2566 ^ i7) * 32265) ^ 1509424620;
                        i9 = 763761681;
                    }
                    break;
                case -1555238885:
                case -50758163:
                    C2167.m7155();
                    C7811.m20844();
                    return null;
                case -1509916069:
                case 1097506126:
                    if (C0483.f2088 >= 0) {
                        iM2566 = C0630.m2566("ۢۡ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 7135) ^ 1427775043;
                        i9 = -641334535;
                    } else {
                        iM2566 = (C2105.m6981("ۢ᩷") ^ i6) * 67;
                        i8 = ((iM2566 ^ i7) * (-7547)) ^ (-1220265945);
                        i9 = 313440494;
                    }
                    break;
                case -1452372994:
                case -599833972:
                    s2 = 19695;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C0630.m2566("᩺ܽ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-25069)) ^ 1028148862;
                        i9 = 206010931;
                    } else {
                        iM2566 = (C2105.m6981("ܺۤ") ^ i7) * 39;
                        i8 = ((iM2566 ^ i6) * (-15431)) ^ 1892808302;
                        i9 = 1355156030;
                    }
                    break;
                case -1445663502:
                case 369443265:
                    C22628.m50615();
                    iM2566 = C0630.m2566("᩺ܽ") ^ i7;
                    i8 = ((iM2566 ^ i6) * (-25069)) ^ 1028148862;
                    i9 = 206010931;
                    break;
                case -1352999639:
                case 2122191727:
                    RunnableC1937.m6387();
                    if (!C0798.f2919) {
                        iM2566 = (C2105.m6981("ۢ᩷") ^ i6) * 67;
                        i8 = ((iM2566 ^ i7) * (-7547)) ^ (-1220265945);
                        i9 = 313440494;
                    } else {
                        iM2566 = C0630.m2566("᩺ܽ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-25069)) ^ 1028148862;
                        i9 = 206010931;
                    }
                    break;
                case -1104517101:
                case 1865904260:
                    i = s * s;
                    i2 = 387893025;
                    if (C2272.m7503()) {
                        iM2566 = (i7 - C0630.m2566("ܰ᩵")) * (-107);
                        i8 = ((iM2566 ^ i6) * 26249) ^ (-2128183285);
                        i9 = 1908705669;
                    } else {
                        iM2566 = (i6 - C0630.m2566("۫ᩴ")) * (-75);
                        i8 = ((iM2566 ^ i7) * 769) ^ 1091321572;
                        i9 = -2068247390;
                    }
                    break;
                case -937177977:
                case 1672439911:
                    return this.f56537;
                case -820038486:
                case 655365140:
                    if (this.f56538) {
                        iM2566 = (C0630.m2566("ۘۛ") ^ i7) * (-9);
                        i8 = ((iM2566 ^ i6) * (-28947)) ^ (-2093761776);
                        i9 = -602510709;
                    } else {
                        iM2566 = (C0630.m2566("ۗ۫") ^ i6) * 17;
                        i8 = ((iM2566 ^ i7) * (-4989)) ^ (-1218412001);
                        i9 = -1414964623;
                    }
                    break;
                case -816759640:
                case -92125351:
                    int i10 = s + s2;
                    if (i3 - (i10 * i10) >= 0) {
                        iM2566 = C2105.m6981("ܺۖ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 6161) ^ 401259410;
                        i9 = 57692044;
                    } else {
                        iM2566 = (C0630.m2566("ۡ᩶") ^ i7) * 21;
                        i8 = ((iM2566 ^ i6) * (-2055)) ^ 1349297816;
                        i9 = 1132762565;
                    }
                    break;
                case -646844004:
                case 721178945:
                    s = sArr[c];
                    if (C1711.m5736() <= 0) {
                        iM2566 = C0630.m2566("ۢۡ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 7135) ^ 1427775043;
                        i9 = -641334535;
                    } else {
                        iM2566 = C2105.m6981("᩹ۖ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-11903)) ^ 959744433;
                        i9 = 287434053;
                    }
                    break;
                case -536475820:
                case 29888102:
                    c = 949;
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = (i7 - C0630.m2566("ܰ᩵")) * (-107);
                        i8 = ((iM2566 ^ i6) * 26249) ^ (-2128183285);
                        i9 = 1908705669;
                    } else {
                        iM2566 = (i7 - C2105.m6981("ܿ֫")) * 19;
                        i8 = ((iM2566 ^ i6) * 14973) ^ (-37313196);
                        i9 = -681034548;
                    }
                    break;
                case -220107135:
                case 1930454844:
                    short[] sArr2 = f56533;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        if (C22628.m50615() == 0) {
                            throw new IOException(C22628.m50602(sArr2, 971, 33, i4));
                        }
                        iM2566 = (C2105.m6981("ۢ᩷") ^ i6) * 67;
                        i8 = ((iM2566 ^ i7) * (-7547)) ^ (-1220265945);
                        i9 = 313440494;
                    } else {
                        iM2566 = C0630.m2566("᩺ܽ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-25069)) ^ 1028148862;
                        i9 = 206010931;
                    }
                    break;
                case 387490001:
                case 1642904685:
                    int i11 = i + i2;
                    i3 = i11 + i11;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("ܰܺ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-15895)) ^ 685394431;
                        i9 = -780778674;
                    } else {
                        iM2566 = (C2105.m6981("ܽܽ") ^ i6) * (-73);
                        i8 = ((iM2566 ^ i7) * 2901) ^ 1111050501;
                        i9 = -1313546180;
                    }
                    break;
                case 405523507:
                case 2137551613:
                    i4 = 27511;
                    iM2566 = (C0630.m2566("ۘ֨") + i6) * 91;
                    i8 = ((iM2566 ^ i7) * (-19009)) ^ 1670797803;
                    i9 = 459390932;
                    break;
                case 892414902:
                case 1364218345:
                    if (C21923.f70183 == 0) {
                        iM2566 = C2105.m6981("ܰܺ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-15895)) ^ 685394431;
                        i9 = -780778674;
                    } else {
                        iM2566 = (C2105.m6981("ۢ᩷") ^ i6) * 67;
                        i8 = ((iM2566 ^ i7) * (-7547)) ^ (-1220265945);
                        i9 = 313440494;
                    }
                    break;
                default:
                    short[] sArr3 = f56533;
                    if (C4616.m13552() == 0) {
                        if (C0422.f1886 > 0) {
                            throw new IOException(C2272.m7507(sArr3, 950, 21, i4));
                        }
                        iM2566 = C0630.m2566("᩺ܽ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-25069)) ^ 1028148862;
                        i9 = 206010931;
                    } else {
                        iM2566 = (C2105.m6981("ۢ᩷") ^ i6) * 67;
                        i8 = ((iM2566 ^ i7) * (-7547)) ^ (-1220265945);
                        i9 = 313440494;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    private void m42369() throws IOException {
        if (this.f56550 != null) {
            m42372();
            return;
        }
        long jNanoTime = System.nanoTime();
        long j = this.f56552;
        if (j != 0 && jNanoTime - j < 0) {
            m42372();
            return;
        }
        synchronized (this) {
            if (this.f56550 != null) {
                m42372();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j2 = this.f56552;
            if (j2 == 0 || jNanoTime2 - j2 >= 0) {
                m42396();
            } else {
                m42372();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0186  */
    /* JADX WARN: Code duplicated, block: B:77:0x018f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC18883[] m42342(C18177 c18177, C11122 c11122, InterfaceC17066 interfaceC17066) throws Throwable {
        C11122 c11123;
        boolean z;
        boolean z2;
        C13778 c13778M42315;
        InterfaceC18883[] interfaceC18883Arr;
        boolean z3;
        short s = f56533[774];
        int i = s + 12367;
        int i2 = (s * s) + 152942689;
        int i3 = (i * i) - (i2 + i2) > 0 ? 56032 : 53808;
        c18177.m42365();
        if (c18177.f56551 != c11122 || c11122.f33370 != c18177.f56547 || c18177.f56537 != c11122.f33377) {
            throw new IllegalStateException(C1711.m5726(f56533, 775, 17, i3));
        }
        c18177.m42396();
        C11122.m27575(c11122);
        if (c11122.f33372) {
            if (interfaceC17066 == null || c11122.f33371 == 0) {
                z2 = false;
            } else {
                synchronized (f56530) {
                    C22951 c22951 = f56534;
                    z3 = c22951 != null && c22951.m51073();
                }
                if (z3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (c11122.f33380 || c11122.f33373 || z2) {
                C15189 c15189M48698 = c18177.f56545.m48698();
                try {
                    c13778M42315 = m42315(m42353(c11122.f33375, c11122.f33371, c18177.f56545), c11122.f33371, c18177.f56545, interfaceC17066);
                    try {
                        C9047 c9047M45105 = C19631.m45105(c13778M42315.f41089, c11122.f33362);
                        c18177.m42396();
                        C11122.m27575(c11122);
                        C4108 c4108M45129 = C19631.m45129(c9047M45105);
                        long jM45142 = C19631.m45142(c9047M45105);
                        long jM42351 = m42351(c9047M45105);
                        long jM45137 = C19631.m45137(c9047M45105);
                        c13778M42315.m33090(c11122);
                        c11122.f33375 = c9047M45105;
                        c11122.f33364 = c4108M45129.m12331();
                        c11122.f33365 = c4108M45129.m12332();
                        c11122.f33362 = jM45142;
                        c11122.f33374 = jM42351;
                        c11122.f33371 = jM45137;
                        interfaceC18883Arr = null;
                    } catch (IOException e) {
                        e = e;
                        if (c13778M42315 != null) {
                            c13778M42315.m33089(e);
                        }
                        if (!c11122.f33367) {
                            c18177.f56545.m48699(c15189M48698);
                        }
                        throw e;
                    } catch (Error e2) {
                        e = e2;
                        if (c13778M42315 != null) {
                            c13778M42315.m33089(e);
                        }
                        if (!c11122.f33367) {
                            c18177.f56545.m48699(c15189M48698);
                        }
                        throw e;
                    } catch (RuntimeException e3) {
                        e = e3;
                        if (c13778M42315 != null) {
                            c13778M42315.m33089(e);
                        }
                        if (!c11122.f33367) {
                            c18177.f56545.m48699(c15189M48698);
                        }
                        throw e;
                    }
                } catch (IOException | Error | RuntimeException e4) {
                    e = e4;
                    c13778M42315 = null;
                }
            } else {
                interfaceC18883Arr = null;
            }
            C11122.m27590(c11122);
            if (c11122.f33376 != null) {
                C4607 c4607 = c11122.f33376;
                C9047 c9047 = c11122.f33375;
                C4607.m13516(c4607, c9047 == null ? 0 : c9047.f27431);
            }
            if (interfaceC17066 != null && C0714.m2807(interfaceC17066)) {
                c11122.m27552();
                return interfaceC18883Arr;
            }
            ArrayDeque arrayDeque = c18177.f56536;
            boolean z4 = !C0714.m2812(arrayDeque);
            Iterator it = arrayDeque.iterator();
            while (C0483.m2123(it)) {
                c18177.f56541 -= ((C7429) RunnableC1108.m3791(it)).f22837;
            }
            arrayDeque.clear();
            boolean zM42335 = c18177.m42335(c18177.f56542, c18177.f56537.m19967(0L)) | z4;
            C11122.m27565(c11122);
            C9047 c9048 = c11122.f33375;
            C12100 c12100 = c11122.f33363;
            long j = c18177.f56544 + 1;
            c18177.f56544 = j;
            c18177.f56537 = new C7429(c9048, c12100, j, c11122.f33364, c11122.f33365, c11122.f33362, c11122.f33374, c11122.f33371, c11122.f33376);
            c18177.f56545.m48700();
            z = zM42335;
            c11123 = interfaceC18883Arr;
        } else {
            c11123 = 0;
            c18177.f56545.m48699(c11122.f33379);
            C11122.m27563(c11122);
            z = false;
        }
        c18177.f56551 = c11123;
        c11122.f33367 = true;
        return z ? c18177.m42363() : f56531;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42328(C18177 c18177, C11122 c11122) {
        synchronized (c18177) {
            if (!c11122.f33367 && c18177.f56551 == c11122) {
                c11122.m27552();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m42365() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = 1690574393;
        int i6 = C3537.f11231;
        int i7 = ServiceConnectionC3453.f10921;
        int iM6981 = C2105.m6981("᩸ۗ") ^ i6;
        int i8 = ((iM6981 ^ i7) * (-23397)) ^ (-2055774245);
        int i9 = -310964286;
        while (true) {
            i5 = ((((i5 ^ i7) * (-19949)) >> 31) & i8) ^ (iM6981 ^ i9);
            switch (i5) {
                case -2054631091:
                case 138415249:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("ܿۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-18279)) ^ 1552936810;
                        i9 = 1768643473;
                    } else {
                        iM6981 = C0630.m2566("֨֨") ^ i7;
                        i8 = ((iM6981 ^ i6) * 723) ^ (-122071849);
                        i9 = 1600336227;
                    }
                    break;
                case -1988424436:
                case -910891540:
                    s2 = 15755;
                    if (C0237.m1481() >= 0) {
                        iM6981 = (C0630.m2566("ܶۛ") ^ i7) * 53;
                        i8 = ((iM6981 ^ i6) * 32369) ^ 1598037662;
                        i9 = 290620152;
                    } else {
                        iM6981 = C0630.m2566("۬֫") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-5691)) ^ 551903524;
                        i9 = 1797322478;
                    }
                    break;
                case -1786642389:
                case 1020082391:
                    sArr = f56533;
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C0630.m2566("֫֨") ^ i7) * (-65);
                        i8 = ((iM6981 ^ i6) * (-10757)) ^ 753603615;
                        i9 = 1353737694;
                    } else {
                        iM6981 = C2105.m6981("ܺ᩺") ^ i6;
                        i8 = ((iM6981 ^ i7) * 1623) ^ 850779653;
                        i9 = -479919410;
                    }
                    break;
                case -1631138472:
                case -604436598:
                    i4 = 48887;
                    iM6981 = (i6 - C0630.m2566("ܰ᩺")) * 27;
                    i8 = ((iM6981 ^ i7) * 26753) ^ (-925000451);
                    i9 = 195243053;
                    break;
                case -1516984719:
                case -709772837:
                    short[] sArr2 = f56533;
                    if (C3746.f11829 > 0) {
                        if (C4159.f13567) {
                            throw new IllegalStateException(C1047.m3603(sArr2, 916, 33, i4));
                        }
                        iM6981 = C0630.m2566("ܿۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-18279)) ^ 1552936810;
                        i9 = 1768643473;
                    } else {
                        iM6981 = C0630.m2566("֨֨") ^ i7;
                        i8 = ((iM6981 ^ i6) * 723) ^ (-122071849);
                        i9 = 1600336227;
                    }
                    break;
                case -1453497852:
                case 1055186197:
                    c = 915;
                    if (C2167.f7158 >= 0) {
                        iM6981 = (i6 - C2105.m6981("ܽᩳ")) * (-117);
                        i8 = ((iM6981 ^ i7) * (-31479)) ^ (-1138725628);
                        i9 = 1624678048;
                    } else {
                        iM6981 = C2105.m6981("᩻ۨ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-23309)) ^ 1619124703;
                        i9 = -1447858154;
                    }
                    break;
                case -1443853769:
                case 853341188:
                    if (C4263.f13799 <= 0) {
                        iM6981 = (i6 - C2105.m6981("ܽᩳ")) * (-117);
                        i8 = ((iM6981 ^ i7) * (-31479)) ^ (-1138725628);
                        i9 = 1624678048;
                    } else {
                        iM6981 = (C0630.m2566("᩸۠") ^ i7) * 123;
                        i8 = ((iM6981 ^ i6) * 12193) ^ (-671059143);
                        i9 = -155969936;
                    }
                    break;
                case -1282117357:
                case 1863082506:
                    C1047.m3599();
                    return;
                case -1194151842:
                case 1331164947:
                    C4075.m12263();
                    C4159.m12565();
                    iM6981 = C0630.m2566("֨֨") ^ i7;
                    i8 = ((iM6981 ^ i6) * 723) ^ (-122071849);
                    i9 = 1600336227;
                    break;
                case -1164368229:
                case -1112322458:
                    int i10 = s + s2;
                    if (i3 - (i10 * i10) < 0) {
                        iM6981 = (i7 - C0630.m2566("ܳۡ")) * (-71);
                        i8 = ((iM6981 ^ i6) * (-26369)) ^ (-278795590);
                        i9 = -1669088168;
                    } else {
                        iM6981 = (C2105.m6981("ۜۜ") ^ i6) * (-85);
                        i8 = ((iM6981 ^ i7) * 3879) ^ 262603578;
                        i9 = 1097661192;
                    }
                    break;
                case -1017193541:
                case -103042059:
                    int i11 = i + i2;
                    i3 = i11 + i11;
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C0630.m2566("ܶۛ") ^ i7) * 53;
                        i8 = ((iM6981 ^ i6) * 32369) ^ 1598037662;
                        i9 = 290620152;
                    } else {
                        iM6981 = C2105.m6981("ܿ֨") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-21959)) ^ 656127611;
                        i9 = 625211093;
                    }
                    break;
                case -325213757:
                case 791352312:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C0630.m2566("ܿۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-18279)) ^ 1552936810;
                        i9 = 1768643473;
                    } else {
                        iM6981 = (C2105.m6981("ܿܶ") + i7) * 61;
                        i8 = ((iM6981 ^ i6) * 2151) ^ 1295033558;
                        i9 = 1235772670;
                    }
                    break;
                case 189254671:
                case 604796123:
                    return;
                case 472359654:
                case 844836814:
                    i4 = 48756;
                    iM6981 = (i6 - C0630.m2566("ܰ᩺")) * 27;
                    i8 = ((iM6981 ^ i7) * 26753) ^ (-925000451);
                    i9 = 195243053;
                    break;
                case 510947745:
                case 1159634524:
                    C21923.m49329();
                    if (C5695.m16023() < 0) {
                        iM6981 = (i6 - C2105.m6981("ܽᩳ")) * (-117);
                        i8 = ((iM6981 ^ i7) * (-31479)) ^ (-1138725628);
                        i9 = 1624678048;
                    } else {
                        iM6981 = (C0630.m2566("֫֨") ^ i7) * (-65);
                        i8 = ((iM6981 ^ i6) * (-10757)) ^ 753603615;
                        i9 = 1353737694;
                    }
                    break;
                case 641198651:
                case 2013874065:
                    s = sArr[c];
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("֨֨") ^ i7;
                        i8 = ((iM6981 ^ i6) * 723) ^ (-122071849);
                        i9 = 1600336227;
                    } else {
                        iM6981 = C2105.m6981("᩶֨") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-20205)) ^ (-2037019890);
                        i9 = -1149240885;
                    }
                    break;
                case 1177983836:
                case 1616037556:
                    C1773.m5908();
                    if (C1294.f4556 < 0) {
                        iM6981 = (C0630.m2566("֫֨") ^ i7) * (-65);
                        i8 = ((iM6981 ^ i6) * (-10757)) ^ 753603615;
                        i9 = 1353737694;
                    } else {
                        iM6981 = C0630.m2566("ܿۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-18279)) ^ 1552936810;
                        i9 = 1768643473;
                    }
                    break;
                case 1468740937:
                case 1599678623:
                    i = s * s;
                    i2 = 248220025;
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C0630.m2566("ܶۛ") ^ i7) * 53;
                        i8 = ((iM6981 ^ i6) * 32369) ^ 1598037662;
                        i9 = 290620152;
                    } else {
                        iM6981 = C2105.m6981("ۙۚ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-9233)) ^ (-880371589);
                        i9 = 317131984;
                    }
                    break;
                default:
                    m42375();
                    if (this.f56539) {
                        iM6981 = C2105.m6981("ܳᩳ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 21375) ^ (-1010752052);
                        i9 = 960935179;
                    } else {
                        iM6981 = C0630.m2566("ۧᩴ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-25541)) ^ (-1977773095);
                        i9 = -620875736;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m42349() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1299748686;
        int i7 = C4117.f13076;
        int i8 = RunnableC0588.f2309;
        int iM2566 = C0630.m2566("ۗۚ") ^ i8;
        int i9 = ((iM2566 ^ i7) * 10645) ^ 596550907;
        int i10 = -265834376;
        while (true) {
            i6 = ((((i6 ^ i7) * (-11301)) >> 31) & i9) ^ (iM2566 ^ i10);
            switch (i6) {
                case -1996169448:
                case 1820218355:
                    if (C2105.f7037 != 0) {
                        iM2566 = (i7 - C0630.m2566("᩹ۨ")) * 91;
                        i9 = ((iM2566 ^ i8) * (-29989)) ^ 1033754242;
                        i10 = 1070404152;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ܶ᩹")) * 95;
                        i9 = ((iM2566 ^ i7) * 15821) ^ (-1983242761);
                        i10 = -332413232;
                    }
                    break;
                case -1990324548:
                case -1504597411:
                    C1420.m4913();
                    RunnableC3474.m10630();
                    return;
                case -1671789852:
                case -938943484:
                    c = 792;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (i7 - C0630.m2566("᩹ۨ")) * 91;
                        i9 = ((iM2566 ^ i8) * (-29989)) ^ 1033754242;
                        i10 = 1070404152;
                    } else {
                        iM2566 = (C2105.m6981("᩷֡") ^ i7) * 73;
                        i9 = ((iM2566 ^ i8) * (-2223)) ^ (-116562471);
                        i10 = -2018175601;
                    }
                    break;
                case -1515748672:
                case 1219346636:
                    i4 = 331931961;
                    if (C5695.m16023() >= 0) {
                        iM2566 = C2105.m6981("ᩳܺ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 2587) ^ 704911384;
                        i10 = 1834233577;
                    } else {
                        iM2566 = C0630.m2566("᩷ۖ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 4333) ^ 192338504;
                        i10 = -1217214494;
                    }
                    break;
                case -1505792660:
                case 739181676:
                    C4263.m12819();
                    C4075.m12263();
                    iM2566 = C2105.m6981("ܰ֨") ^ i8;
                    i9 = ((iM2566 ^ i7) * 24487) ^ (-923491087);
                    i10 = 279254379;
                    break;
                case -1466303693:
                case 1376433062:
                    i5 = 21937;
                    iM2566 = C2105.m6981("ܶᩴ") ^ i7;
                    i9 = ((iM2566 ^ i8) * 4093) ^ (-1849864678);
                    i10 = 284795901;
                    break;
                case -1310253640:
                case -778361579:
                    return;
                case -1148981236:
                case 1537738553:
                    i5 = 57967;
                    iM2566 = C2105.m6981("ܶᩴ") ^ i7;
                    i9 = ((iM2566 ^ i8) * 4093) ^ (-1849864678);
                    i10 = 284795901;
                    break;
                case -1016368687:
                case 780796786:
                    int i11 = i3 + i4;
                    if ((i11 + i11) - i2 >= 0) {
                        iM2566 = C0630.m2566("ܶܽ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 18799) ^ (-564733196);
                        i10 = 578349412;
                    } else {
                        iM2566 = C2105.m6981("᩻᩶") ^ i7;
                        i9 = ((iM2566 ^ i8) * 20617) ^ (-1004871938);
                        i10 = 79717978;
                    }
                    break;
                case -456928518:
                case 916061713:
                    if (C0798.f2919) {
                        iM2566 = C2105.m6981("ܰ֨") ^ i8;
                        i9 = ((iM2566 ^ i7) * 24487) ^ (-923491087);
                        i10 = 279254379;
                    } else {
                        iM2566 = (C2105.m6981("ۚۘ") ^ i8) * (-9);
                        i9 = ((iM2566 ^ i7) * 21543) ^ 2105749803;
                        i10 = 523201023;
                    }
                    break;
                case -452811183:
                case 944725027:
                    C1916.m6308();
                    if (C0237.m1481() < 0) {
                        iM2566 = C2105.m6981("ۙۖ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-12319)) ^ (-284728715);
                        i10 = -252302122;
                    } else {
                        iM2566 = C2105.m6981("ܰ֨") ^ i8;
                        i9 = ((iM2566 ^ i7) * 24487) ^ (-923491087);
                        i10 = 279254379;
                    }
                    break;
                case -414261328:
                case 1080550511:
                    if (!C1916.f6442) {
                        iM2566 = C2105.m6981("ۙۖ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-12319)) ^ (-284728715);
                        i10 = -252302122;
                    } else {
                        iM2566 = C2105.m6981("֨ۨ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 20701) ^ 497753946;
                        i10 = 2096754622;
                    }
                    break;
                case -216766712:
                case 1776063796:
                    sArr = f56533;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = C2105.m6981("֨ۨ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 20701) ^ 497753946;
                        i10 = 2096754622;
                    } else {
                        iM2566 = (i7 - C0630.m2566("֨ᩳ")) * (-5);
                        i9 = ((iM2566 ^ i8) * (-12539)) ^ 435492204;
                        i10 = 2022315429;
                    }
                    break;
                case -189994399:
                case 424294028:
                    if (C7106.m19120() > 0) {
                        iM2566 = (i7 - C0630.m2566("᩹ۨ")) * 91;
                        i9 = ((iM2566 ^ i8) * (-29989)) ^ 1033754242;
                        i10 = 1070404152;
                    } else {
                        iM2566 = C2105.m6981("ۙۖ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-12319)) ^ (-284728715);
                        i10 = -252302122;
                    }
                    break;
                case 818115800:
                case 1120463516:
                    i2 = i * i;
                    i3 = s * s;
                    if (C7811.f24123 >= 0) {
                        iM2566 = (i7 - C0630.m2566("᩹ۨ")) * 91;
                        i9 = ((iM2566 ^ i8) * (-29989)) ^ 1033754242;
                        i10 = 1070404152;
                    } else {
                        iM2566 = (C0630.m2566("۬۫") + i7) * 33;
                        i9 = ((iM2566 ^ i8) * (-29055)) ^ 1369958341;
                        i10 = 2025110570;
                    }
                    break;
                case 947045594:
                case 974893593:
                    s = sArr[c];
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("ᩳܺ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 2587) ^ 704911384;
                        i10 = 1834233577;
                    } else {
                        iM2566 = (C0630.m2566("ܰۖ") + i8) * 49;
                        i9 = ((iM2566 ^ i7) * (-5069)) ^ (-1795131997);
                        i10 = 243738968;
                    }
                    break;
                case 1059417016:
                case 2011221021:
                    i = s + 18219;
                    if (C3683.m11222()) {
                        iM2566 = C2105.m6981("ᩳܺ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 2587) ^ 704911384;
                        i10 = 1834233577;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۙ") ^ i7) * 85;
                        i9 = ((iM2566 ^ i8) * 1247) ^ 1029886306;
                        i10 = -511429395;
                    }
                    break;
                case 1177600164:
                case 1807353760:
                    if (this.f56551 == null) {
                        iM2566 = (i7 - C2105.m6981("ܿ᩵")) * (-3);
                        i9 = ((iM2566 ^ i8) * (-16499)) ^ 945838295;
                        i10 = 1245789429;
                    } else {
                        iM2566 = C2105.m6981("᩺֡") ^ i8;
                        i9 = ((iM2566 ^ i7) * 11915) ^ 485046449;
                        i10 = -789850211;
                    }
                    break;
                default:
                    short[] sArr2 = f56533;
                    if (!C1711.f5919) {
                        if (C1128.f4106 > 0) {
                            throw new IllegalStateException(C0714.m2816(sArr2, 793, 31, i5));
                        }
                        iM2566 = (i7 - C0630.m2566("᩹ۨ")) * 91;
                        i9 = ((iM2566 ^ i8) * (-29989)) ^ 1033754242;
                        i10 = 1070404152;
                    } else {
                        iM2566 = C2105.m6981("֨ۨ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 20701) ^ 497753946;
                        i10 = 2096754622;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:57:0x01e2 A[PHI: r9 r10 r11 r12
      0x01e2: PHI (r9v3 java.lang.Object[]) = (r9v1 java.lang.Object[]), (r9v2 java.lang.Object[]), (r9v1 java.lang.Object[]) binds: [B:137:0x01e2, B:56:0x01e0, B:52:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r10v2 l.ᩴܽܳ[]) = (r10v1 l.ᩴܽܳ[]), (r10v1 l.ᩴܽܳ[]), (r10v4 l.ᩴܽܳ[]) binds: [B:137:0x01e2, B:56:0x01e0, B:52:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:137:0x01e2, B:56:0x01e0, B:52:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r12v2 l.ᩴܽܳ[]) = (r12v1 l.ᩴܽܳ[]), (r12v1 l.ᩴܽܳ[]), (r12v3 l.ᩴܽܳ[]) binds: [B:137:0x01e2, B:56:0x01e0, B:52:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
    
        if (l.C5695.f17556 < 0) goto L10;
     */
    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC18883[] m42363() {
        InterfaceC18883 interfaceC18883;
        IdentityHashMap identityHashMap;
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4;
        IdentityHashMap identityHashMap2;
        InterfaceC18883 interfaceC18884;
        int iM2566;
        int i5;
        C18177 c18177 = this;
        IdentityHashMap identityHashMap3 = null;
        Iterator itM10483 = null;
        Set setM10486 = null;
        int i6 = 0;
        Object[] array = null;
        InterfaceC18883[] interfaceC18883Arr = null;
        int length = 0;
        InterfaceC18883[] interfaceC18883Arr2 = null;
        int length2 = 0;
        C7429 c7429 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 501045346;
        int i11 = C0630.f2410;
        int i12 = C1047.f3863;
        int iM2567 = (C0630.m2566("۬ۨ") ^ i11) * (-27);
        int i13 = ((iM2567 ^ i12) * (-9395)) ^ (-1755575075);
        int i14 = iM2567 ^ (-971133697);
        InterfaceC18883 interfaceC18885 = null;
        Iterator it = null;
        int i15 = 0;
        IdentityHashMap identityHashMap4 = null;
        Iterator it2 = null;
        InterfaceC18883 interfaceC18886 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 27309) >> 31));
            switch (i10) {
                case -2136746679:
                case 41005885:
                    i15 = 0;
                    length2 = interfaceC18883Arr.length;
                    i7 = i6;
                    iM6982 = C0630.m2566("ۧᩴ") ^ i12;
                    i3 = ((iM6982 ^ i11) * 8475) ^ (-405660230);
                    i4 = -287883511;
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case -2118132349:
                case -1048426300:
                    C7811.m20844();
                    if (C1294.f4556 < 0) {
                        interfaceC18883 = interfaceC18885;
                        iM6981 = C0630.m2566("ܰܶ") ^ i12;
                        identityHashMap = identityHashMap3;
                        i = ((iM6981 ^ i11) * (-8533)) ^ 1007919989;
                        i2 = 1240747341;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        identityHashMap3 = identityHashMap;
                        interfaceC18885 = interfaceC18883;
                    }
                    interfaceC18883 = interfaceC18885;
                    identityHashMap = identityHashMap3;
                    iM6981 = C0630.m2566("ۘۛ") ^ i11;
                    i = ((iM6981 ^ i12) * 21365) ^ 235848008;
                    i2 = 896580288;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    identityHashMap3 = identityHashMap;
                    interfaceC18885 = interfaceC18883;
                    break;
                case -1837500232:
                case 204669773:
                    if (i15 == length) {
                        iM6982 = (i11 - C0630.m2566("ܶۢ")) * (-127);
                        i3 = ((iM6982 ^ i12) * 26655) ^ 88963821;
                        i4 = -727761507;
                    } else {
                        iM6982 = (C2105.m6981("᩻۠") ^ i11) * 123;
                        i3 = ((iM6982 ^ i12) * 31569) ^ (-166432889);
                        i4 = -872014035;
                    }
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case -1760363972:
                case -668306856:
                    interfaceC18883 = interfaceC18885;
                    identityHashMap3 = new IdentityHashMap();
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("ܰܶ") ^ i12;
                        identityHashMap = identityHashMap3;
                        i = ((iM6981 ^ i11) * (-8533)) ^ 1007919989;
                        i2 = 1240747341;
                    } else {
                        iM6981 = C0630.m2566("ۖۨ") ^ i12;
                        identityHashMap = identityHashMap3;
                        i = ((iM6981 ^ i11) * 11379) ^ (-1225682609);
                        i2 = 683973152;
                    }
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    identityHashMap3 = identityHashMap;
                    interfaceC18885 = interfaceC18883;
                    break;
                case -1721331248:
                case -383421003:
                    C3019.m9255();
                    if (C21923.f70183 != 0) {
                        interfaceC18884 = interfaceC18885;
                        identityHashMap2 = identityHashMap3;
                        iM2566 = (C0630.m2566("۠ۢ") + i11) * (-115);
                        i3 = ((iM2566 ^ i12) * 31963) ^ (-1864695972);
                        i5 = -2086410644;
                        i14 = iM2566 ^ i5;
                        identityHashMap3 = identityHashMap2;
                        interfaceC18885 = interfaceC18884;
                        i13 = i3;
                    } else {
                        interfaceC18883 = interfaceC18885;
                        identityHashMap = identityHashMap3;
                        iM6981 = C0630.m2566("ۘۛ") ^ i11;
                        i = ((iM6981 ^ i12) * 21365) ^ 235848008;
                        i2 = 896580288;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        identityHashMap3 = identityHashMap;
                        interfaceC18885 = interfaceC18883;
                    }
                    break;
                case -1557419503:
                case 2155405:
                    it = c18177.f56536.iterator();
                    iM6982 = (C2105.m6981("֨֡") + i11) * 49;
                    i3 = ((iM6982 ^ i12) * 27247) ^ 562019934;
                    i4 = -1935977553;
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case -1514388069:
                case 1142204787:
                    identityHashMap2 = identityHashMap3;
                    interfaceC18884 = c18177.f56549;
                    if (C0050.m940() <= 0) {
                        iM2566 = (C0630.m2566("۠ۢ") + i11) * (-115);
                        i3 = ((iM2566 ^ i12) * 31963) ^ (-1864695972);
                        i5 = -2086410644;
                    } else {
                        iM2566 = (C0630.m2566("᩷᩶") + i11) * (-83);
                        i3 = ((iM2566 ^ i12) * (-10397)) ^ 1626517442;
                        i5 = -226302009;
                    }
                    i14 = iM2566 ^ i5;
                    identityHashMap3 = identityHashMap2;
                    interfaceC18885 = interfaceC18884;
                    i13 = i3;
                    break;
                case -1470985073:
                case -1396625215:
                    C19631.m45134(c18177.f56537.f22836, identityHashMap3);
                    if (C4263.f13799 <= 0) {
                        iM6982 = C0630.m2566("֫۠") ^ i12;
                        i3 = ((iM6982 ^ i11) * (-8223)) ^ 620039632;
                        i4 = 1411837655;
                    } else {
                        iM6982 = (i12 - C2105.m6981("ۜ۠")) * 85;
                        i3 = ((iM6982 ^ i11) * (-23095)) ^ (-1856405854);
                        i4 = -172504428;
                    }
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case -1335807225:
                case -701192633:
                    return interfaceC18883Arr2;
                case -1260005410:
                case -149479352:
                    c7429 = ((C16765) RunnableC1108.m3791(itM10483)).f51468;
                    if (C1294.m4372() > 0) {
                        iM6982 = C2105.m6981("᩸֨") ^ i11;
                        i3 = ((iM6982 ^ i12) * 24781) ^ 561869093;
                        i4 = 802893708;
                        i14 = iM6982 ^ i4;
                        i13 = i3;
                    }
                    interfaceC18884 = interfaceC18885;
                    identityHashMap2 = identityHashMap3;
                    iM2566 = (C0630.m2566("۠ۢ") + i11) * (-115);
                    i3 = ((iM2566 ^ i12) * 31963) ^ (-1864695972);
                    i5 = -2086410644;
                    i14 = iM2566 ^ i5;
                    identityHashMap3 = identityHashMap2;
                    interfaceC18885 = interfaceC18884;
                    i13 = i3;
                    break;
                case -1091817668:
                case 1695366598:
                    interfaceC18883 = interfaceC18885;
                    C0714.m2809(identityHashMap3, interfaceC18883, Boolean.TRUE);
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (C0630.m2566("۠۫") ^ i11) * 77;
                        identityHashMap = identityHashMap3;
                        i = ((iM6981 ^ i12) * 11919) ^ (-541131498);
                        i2 = 1878366722;
                    } else {
                        identityHashMap = identityHashMap3;
                        iM6981 = C0630.m2566("ܶ۟") ^ i11;
                        i = ((iM6981 ^ i12) * 16623) ^ 1917274388;
                        i2 = -160351762;
                    }
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    identityHashMap3 = identityHashMap;
                    interfaceC18885 = interfaceC18883;
                    break;
                case -997413342:
                case 1771937844:
                    C4616.m13552();
                    interfaceC18883 = interfaceC18885;
                    identityHashMap = identityHashMap3;
                    iM6981 = C0630.m2566("ۘۛ") ^ i11;
                    i = ((iM6981 ^ i12) * 21365) ^ 235848008;
                    i2 = 896580288;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    identityHashMap3 = identityHashMap;
                    interfaceC18885 = interfaceC18883;
                    break;
                case -970388964:
                case 216515689:
                    itM10483 = C3432.m10483(C0382.m1841(c18177.f56548));
                    iM6982 = (C2105.m6981("ܳܺ") ^ i11) * (-115);
                    i3 = ((iM6982 ^ i12) * (-10571)) ^ (-1293144194);
                    i4 = -1528130693;
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case -795139168:
                case 1110687428:
                    if (C1773.m5910(it)) {
                        iM6982 = C2105.m6981("ۧ۫") ^ i12;
                        i3 = ((iM6982 ^ i11) * 15695) ^ 985588149;
                        i4 = -1442447174;
                    } else {
                        iM6982 = C0630.m2566("ܰ᩶") ^ i12;
                        i3 = ((iM6982 ^ i11) * 18369) ^ (-503967908);
                        i4 = 1263662643;
                    }
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case -726934212:
                case -436112042:
                    if (C1773.m5910(itM10483)) {
                        iM6982 = (i12 - C0630.m2566("֫ᩴ")) * (-85);
                        i3 = ((iM6982 ^ i11) * (-3685)) ^ 1396423860;
                        i4 = -260148344;
                    } else {
                        iM6982 = (i12 - C0630.m2566("ܳ۬")) * (-49);
                        i3 = ((iM6982 ^ i11) * 1609) ^ (-971999610);
                        i4 = -700939560;
                    }
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case -655795325:
                case 1378911317:
                    if (C1773.m5910(it2)) {
                        iM6982 = (i11 - C2105.m6981("۫ᩳ")) * 81;
                        i3 = ((iM6982 ^ i12) * (-30775)) ^ (-343878810);
                        i4 = -1464237388;
                    } else {
                        iM6982 = C0630.m2566("۬᩵") ^ i12;
                        i3 = ((iM6982 ^ i11) * 18293) ^ (-1091519550);
                        i4 = -1923606547;
                    }
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case -648127189:
                case 781112705:
                    if (C4616.f14690 <= 0) {
                        iM6982 = C0630.m2566("ۡۛ") ^ i12;
                        i3 = ((iM6982 ^ i11) * (-18245)) ^ 541283538;
                        i4 = 1683860678;
                        i14 = iM6982 ^ i4;
                        i13 = i3;
                    } else {
                        interfaceC18883 = interfaceC18885;
                        identityHashMap = identityHashMap3;
                        iM6981 = C0630.m2566("ۘۛ") ^ i11;
                        i = ((iM6981 ^ i12) * 21365) ^ 235848008;
                        i2 = 896580288;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        identityHashMap3 = identityHashMap;
                        interfaceC18885 = interfaceC18883;
                    }
                    break;
                case -551346744:
                case 973833064:
                    setM10486 = C3432.m10486(c18177.f56546);
                    i6 = 0;
                    if (!C3683.m11222()) {
                        iM6982 = (i11 - C2105.m6981("ᩴܶ")) * (-45);
                        i3 = ((iM6982 ^ i12) * (-2287)) ^ 1136351163;
                        i4 = 1477749348;
                        i14 = iM6982 ^ i4;
                        i13 = i3;
                    } else {
                        interfaceC18883 = interfaceC18885;
                        identityHashMap = identityHashMap3;
                        iM6981 = C0630.m2566("ۘۛ") ^ i11;
                        i = ((iM6981 ^ i12) * 21365) ^ 235848008;
                        i2 = 896580288;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        identityHashMap3 = identityHashMap;
                        interfaceC18885 = interfaceC18883;
                    }
                    break;
                case -408816943:
                case 1874890373:
                    C1128.m3851();
                    C1420.m4913();
                    return null;
                case -211918339:
                case 688583723:
                    break;
                case -115439554:
                case 144003163:
                    i7++;
                    i15 = i8;
                    iM6982 = C0630.m2566("ۧᩴ") ^ i12;
                    i3 = ((iM6982 ^ i11) * 8475) ^ (-405660230);
                    i4 = -287883511;
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case 117620199:
                case 319621023:
                    interfaceC18883 = interfaceC18885;
                    identityHashMap = identityHashMap3;
                    if (identityHashMap4.size() <= 1) {
                        iM6981 = (i12 - C2105.m6981("ܽۙ")) * (-23);
                        i = ((iM6981 ^ i11) * 17039) ^ (-259607164);
                        i2 = 370936300;
                    } else {
                        iM6981 = (C2105.m6981("ۘۚ") ^ i11) * 21;
                        i = ((iM6981 ^ i12) * (-31243)) ^ 217093957;
                        i2 = -412699736;
                    }
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    identityHashMap3 = identityHashMap;
                    interfaceC18885 = interfaceC18883;
                    break;
                case 151032129:
                case 1672464909:
                    if (i7 < length2) {
                        iM6982 = (C0630.m2566("ۧ᩻") + i12) * (-27);
                        i3 = ((iM6982 ^ i11) * (-10223)) ^ (-275406531);
                        i4 = 1672313412;
                    } else {
                        iM6982 = (C2105.m6981("᩶ۚ") ^ i11) * (-67);
                        i3 = ((iM6982 ^ i12) * 8163) ^ (-134988596);
                        i4 = -795438366;
                    }
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case 208492006:
                case 1466167592:
                    array = setM10486.toArray(new InterfaceC18883[i6]);
                    if (C4075.m12263() <= 0) {
                        iM6982 = C0630.m2566("ۡۛ") ^ i12;
                        i3 = ((iM6982 ^ i11) * (-18245)) ^ 541283538;
                        i4 = 1683860678;
                    } else {
                        iM6982 = C2105.m6981("ۜ᩸") ^ i12;
                        i3 = ((iM6982 ^ i11) * (-8581)) ^ 250419584;
                        i4 = -1571493349;
                    }
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case 214808160:
                case 1548763161:
                    return f56531;
                case 220668829:
                case 1956151864:
                    it2 = c18177.f56542.iterator();
                    iM6982 = (i11 - C0630.m2566("ۨۧ")) * (-33);
                    i3 = ((iM6982 ^ i12) * 18389) ^ (-55670618);
                    i4 = -1750794406;
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case 413719971:
                case 420935946:
                    C19631.m45134(((C7429) RunnableC1108.m3791(it2)).f22836, identityHashMap3);
                    iM6982 = (i11 - C0630.m2566("ۨۧ")) * (-33);
                    i3 = ((iM6982 ^ i12) * 18389) ^ (-55670618);
                    i4 = -1750794406;
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case 662624567:
                case 1444380455:
                    C19631.m45134(((C7429) C2272.m7513(it)).f22836, identityHashMap3);
                    iM6982 = (C2105.m6981("֨֡") + i11) * 49;
                    i3 = ((iM6982 ^ i12) * 27247) ^ 562019934;
                    i4 = -1935977553;
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case 691907743:
                case 762862233:
                    interfaceC18883Arr2[i15] = interfaceC18886;
                    i8 = i15 + i9;
                    iM6982 = C0630.m2566("ۨᩴ") ^ i12;
                    i3 = ((iM6982 ^ i11) * 9059) ^ 1066225260;
                    i4 = -2048023106;
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case 791412846:
                case 1034461295:
                    interfaceC18883Arr = (InterfaceC18883[]) array;
                    length = interfaceC18883Arr.length;
                    interfaceC18883Arr2 = new InterfaceC18883[length];
                    if (C2126.m7040()) {
                        iM6982 = C0630.m2566("ۡۛ") ^ i12;
                        i3 = ((iM6982 ^ i11) * (-18245)) ^ 541283538;
                        i4 = 1683860678;
                    } else {
                        iM6982 = (i11 - C2105.m6981("۫۬")) * (-37);
                        i3 = ((iM6982 ^ i12) * 26883) ^ 1706354142;
                        i4 = 1680784558;
                    }
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case 1174935928:
                case 1200330724:
                    c18177.f56546.remove(interfaceC18886);
                    i9 = 1;
                    if (C4616.f14690 > 0) {
                        iM6982 = C0630.m2566("ۤۨ") ^ i12;
                        i3 = ((iM6982 ^ i11) * (-27491)) ^ (-620981031);
                        i4 = -1538951822;
                        i14 = iM6982 ^ i4;
                        i13 = i3;
                    } else {
                        interfaceC18883 = interfaceC18885;
                        iM6981 = (C0630.m2566("۠۫") ^ i11) * 77;
                        identityHashMap = identityHashMap3;
                        i = ((iM6981 ^ i12) * 11919) ^ (-541131498);
                        i2 = 1878366722;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        identityHashMap3 = identityHashMap;
                        interfaceC18885 = interfaceC18883;
                    }
                    break;
                case 1202625711:
                case 2006150133:
                    interfaceC18886 = interfaceC18883Arr[i7];
                    if (identityHashMap3.containsKey(interfaceC18886)) {
                        i8 = i15;
                        iM6982 = C0630.m2566("ۨᩴ") ^ i12;
                        i3 = ((iM6982 ^ i11) * 9059) ^ 1066225260;
                        i4 = -2048023106;
                    } else {
                        iM6982 = (i11 - C0630.m2566("ܰ᩵")) * 11;
                        i3 = ((iM6982 ^ i12) * (-4437)) ^ (-1254181654);
                        i4 = -1551398029;
                    }
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                case 1232235843:
                case 1482753500:
                    return (InterfaceC18883[]) Arrays.copyOf(interfaceC18883Arr2, i15);
                case 1750385420:
                case 1969814266:
                    C19631.m45134(c7429.f22836, identityHashMap3);
                    iM6982 = (C2105.m6981("ܳܺ") ^ i11) * (-115);
                    i3 = ((iM6982 ^ i12) * (-10571)) ^ (-1293144194);
                    i4 = -1528130693;
                    i14 = iM6982 ^ i4;
                    i13 = i3;
                    break;
                default:
                    interfaceC18883 = interfaceC18885;
                    identityHashMap = identityHashMap3;
                    IdentityHashMap identityHashMap5 = c18177.f56546;
                    if (C3537.f11231 >= 0) {
                        identityHashMap4 = identityHashMap5;
                        iM6981 = C0630.m2566("ۘۛ") ^ i11;
                        i = ((iM6981 ^ i12) * 21365) ^ 235848008;
                        i2 = 896580288;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        identityHashMap3 = identityHashMap;
                        interfaceC18885 = interfaceC18883;
                    } else {
                        int iM2568 = (i12 - C0630.m2566("᩺᩺")) * (-23);
                        int i16 = ((iM2568 ^ i11) * 14787) ^ (-684560899);
                        i14 = iM2568 ^ 1300307894;
                        identityHashMap4 = identityHashMap5;
                        identityHashMap3 = identityHashMap;
                        i13 = i16;
                        interfaceC18885 = interfaceC18883;
                        c18177 = this;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m42346() {
        IdentityHashMap identityHashMap = null;
        Iterator itM1837 = null;
        int i = 571901255;
        int i2 = C3245.f10203;
        int i3 = C2958.f9394;
        int iM2566 = (i3 - C0630.m2566("ܳ᩺")) * (-67);
        int i4 = ((iM2566 ^ i2) * (-23431)) ^ 1738058695;
        int i5 = -1782284252;
        while (true) {
            i = ((((i ^ i2) * 24849) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2113509435:
                case -2041855191:
                    itM1837 = C0382.m1837(C3432.m10486(identityHashMap));
                    iM2566 = C2105.m6981("ۨ֡") ^ i2;
                    i4 = ((iM2566 ^ i3) * 28085) ^ (-1194368275);
                    i5 = 1868720662;
                    break;
                case -2084417407:
                case 1612710719:
                    if (C0422.f1886 <= 0) {
                        iM2566 = (C0630.m2566("᩶ۘ") + i2) * 119;
                        i4 = ((iM2566 ^ i3) * 16177) ^ (-1069514397);
                        i5 = 1082353270;
                    } else {
                        iM2566 = C0630.m2566("۠ۘ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-20113)) ^ 1230640456;
                        i5 = 1769245378;
                    }
                    break;
                case -2081059068:
                case -2080410240:
                    if (C3537.f11231 < 0) {
                        iM2566 = (i3 - C0630.m2566("ۡ᩷")) * (-39);
                        i4 = ((iM2566 ^ i2) * (-21387)) ^ 11551962;
                        i5 = -63340161;
                    } else {
                        iM2566 = (C2105.m6981("ۡ۫") + i2) * 51;
                        i4 = ((iM2566 ^ i3) * (-17693)) ^ 406957487;
                        i5 = 1198602069;
                    }
                    break;
                case -2073995633:
                case -1725346237:
                    C0422.m1963();
                    C3019.m9255();
                    break;
                case -1803115209:
                case 2065634058:
                    if (C3537.m10746() <= 0) {
                        iM2566 = (C2105.m6981("ۡ۫") + i2) * 51;
                        i4 = ((iM2566 ^ i3) * (-17693)) ^ 406957487;
                        i5 = 1198602069;
                    } else {
                        iM2566 = C0630.m2566("ܺ֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * 18835) ^ 87791023;
                        i5 = 1492033937;
                    }
                    break;
                case -1428523254:
                case -1410319430:
                    if (C21923.f70183 != 0) {
                        iM2566 = (i3 - C0630.m2566("ۡ᩷")) * (-39);
                        i4 = ((iM2566 ^ i2) * (-21387)) ^ 11551962;
                        i5 = -63340161;
                    } else {
                        iM2566 = C0630.m2566("ۘᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 7277) ^ 1419552331;
                        i5 = -143902820;
                    }
                    break;
                case -1379098975:
                case 285435014:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ۡ᩷")) * (-39);
                        i4 = ((iM2566 ^ i2) * (-21387)) ^ 11551962;
                        i5 = -63340161;
                    } else {
                        iM2566 = (C0630.m2566("۫ܰ") + i2) * 99;
                        i4 = ((iM2566 ^ i3) * (-27825)) ^ (-2075565613);
                        i5 = 153435608;
                    }
                    break;
                case -1325657306:
                case 660845996:
                    identityHashMap.clear();
                    break;
                case -1253032471:
                case -965945900:
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("ۗ۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-23941)) ^ (-293485546);
                        i5 = -1584990463;
                    } else {
                        iM2566 = C2105.m6981("ܳۧ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 27555) ^ 1400190481;
                        i5 = 1590822713;
                    }
                    break;
                case -1016804404:
                case 1841865048:
                    if (C0798.m2998() == 0) {
                        iM2566 = C0630.m2566("ۗ۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-23941)) ^ (-293485546);
                        i5 = -1584990463;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۡ᩷")) * (-39);
                        i4 = ((iM2566 ^ i2) * (-21387)) ^ 11551962;
                        i5 = -63340161;
                    }
                    break;
                case -981549614:
                case 1198256976:
                    C1916.m6308();
                    iM2566 = (C2105.m6981("ۡ۫") + i2) * 51;
                    i4 = ((iM2566 ^ i3) * (-17693)) ^ 406957487;
                    i5 = 1198602069;
                    break;
                case -720010904:
                case 810474756:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (i3 - C2105.m6981("۟֡")) * 127;
                        i4 = ((iM2566 ^ i2) * 27201) ^ (-527224009);
                        i5 = 1488531783;
                    } else {
                        iM2566 = C0630.m2566("ۗ۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * 8917) ^ 1425997263;
                        i5 = 1936311126;
                    }
                    break;
                case -666733415:
                case 1542239942:
                    C4117.m12364();
                    if (C0964.f3626 != 0) {
                        iM2566 = (C0630.m2566("᩶ۘ") + i2) * 119;
                        i4 = ((iM2566 ^ i3) * 16177) ^ (-1069514397);
                        i5 = 1082353270;
                    } else {
                        iM2566 = (C2105.m6981("ۡ۫") + i2) * 51;
                        i4 = ((iM2566 ^ i3) * (-17693)) ^ 406957487;
                        i5 = 1198602069;
                    }
                    break;
                case -582195372:
                case 1293674951:
                    if (C1773.m5910(itM1837)) {
                        iM2566 = (i3 - C0630.m2566("᩺ۜ")) * q.h;
                        i4 = ((iM2566 ^ i2) * 2283) ^ 248733334;
                        i5 = -2089290571;
                    } else {
                        iM2566 = (C0630.m2566("᩵᩹") + i3) * 63;
                        i4 = ((iM2566 ^ i2) * (-31431)) ^ (-1232106417);
                        i5 = 1929875497;
                    }
                    break;
                case -398728383:
                case -260587305:
                    if (C2105.f7037 != 0) {
                        iM2566 = (i3 - C0630.m2566("ۡ᩷")) * (-39);
                        i4 = ((iM2566 ^ i2) * (-21387)) ^ 11551962;
                        i5 = -63340161;
                    } else {
                        iM2566 = (C2105.m6981("ۤۙ") ^ i2) * 83;
                        i4 = ((iM2566 ^ i3) * (-9203)) ^ (-1906120947);
                        i5 = -351731533;
                    }
                    break;
                case 846556435:
                case 1259145554:
                    if (C2272.m7503()) {
                        iM2566 = (i3 - C2105.m6981("۟֡")) * 127;
                        i4 = ((iM2566 ^ i2) * 27201) ^ (-527224009);
                        i5 = 1488531783;
                    } else {
                        iM2566 = C2105.m6981("ܰ᩷") ^ i3;
                        i4 = ((iM2566 ^ i2) * 31381) ^ (-377974386);
                        i5 = 488226961;
                    }
                    break;
                case 856123668:
                case 1626529793:
                    ((C16765) C2272.m7513(itM1837)).f51471 = false;
                    iM2566 = C2105.m6981("ۨ֡") ^ i2;
                    i4 = ((iM2566 ^ i3) * 28085) ^ (-1194368275);
                    i5 = 1868720662;
                    break;
                case 1532105852:
                case 1550310111:
                    if (C1916.f6442) {
                        iM2566 = C2105.m6981("᩻ܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 18399) ^ (-794685561);
                        i5 = 1994634766;
                    } else {
                        iM2566 = (i3 - C2105.m6981("۟֡")) * 127;
                        i4 = ((iM2566 ^ i2) * 27201) ^ (-527224009);
                        i5 = 1488531783;
                    }
                    break;
                default:
                    identityHashMap = this.f56548;
                    if (C2958.f9394 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ۡ᩷")) * (-39);
                        i4 = ((iM2566 ^ i2) * (-21387)) ^ 11551962;
                        i5 = -63340161;
                    } else {
                        iM2566 = (C2105.m6981("᩺ܺ") + i2) * (-3);
                        i4 = ((iM2566 ^ i3) * 12559) ^ 1569893036;
                        i5 = 202172415;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0167 A[PHI: r18
      0x0167: PHI (r18v5 long) = (r18v0 long), (r18v6 long) binds: [B:45:0x0152, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x02d2 A[PHI: r1 r5 r6 r7
      0x02d2: PHI (r1v39 long) = (r1v11 long), (r1v12 long), (r1v16 long), (r1v37 long), (r1v41 long) binds: [B:83:0x02d0, B:79:0x02b4, B:62:0x0201, B:15:0x0062, B:50:0x018e] A[DONT_GENERATE, DONT_INLINE]
      0x02d2: PHI (r5v4 java.util.ArrayDeque) = 
      (r5v2 java.util.ArrayDeque)
      (r5v2 java.util.ArrayDeque)
      (r5v2 java.util.ArrayDeque)
      (r5v2 java.util.ArrayDeque)
      (r5v5 java.util.ArrayDeque)
     binds: [B:83:0x02d0, B:79:0x02b4, B:62:0x0201, B:15:0x0062, B:50:0x018e] A[DONT_GENERATE, DONT_INLINE]
      0x02d2: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v5 int) binds: [B:83:0x02d0, B:79:0x02b4, B:62:0x0201, B:15:0x0062, B:50:0x018e] A[DONT_GENERATE, DONT_INLINE]
      0x02d2: PHI (r7v4 java.util.ArrayDeque) = 
      (r7v2 java.util.ArrayDeque)
      (r7v2 java.util.ArrayDeque)
      (r7v2 java.util.ArrayDeque)
      (r7v2 java.util.ArrayDeque)
      (r7v5 java.util.ArrayDeque)
     binds: [B:83:0x02d0, B:79:0x02b4, B:62:0x0201, B:15:0x0062, B:50:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (l.C1128.m3851() <= 0) goto L18;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m42335(ArrayDeque arrayDeque, C7429 c7429) {
        long j;
        int iM2566;
        int i;
        int i2;
        long j2;
        int iM2567;
        int i3;
        int i4;
        int iM6981;
        int i5;
        int i6;
        int i7;
        int iM2568;
        int i8;
        int i9;
        int i10 = -1400665254;
        int i11 = C0483.f2088;
        int i12 = ServiceConnectionC3453.f10921;
        int iM6982 = C2105.m6981("ᩴܺ") ^ i11;
        int i13 = ((iM6982 ^ i12) * (-27415)) ^ (-514774482);
        int i14 = iM6982 ^ 1611428808;
        long j3 = 0;
        int size = 0;
        long j4 = 0;
        ArrayDeque arrayDeque2 = null;
        C7429 c74210 = null;
        boolean z = false;
        ArrayDeque arrayDeque3 = null;
        ArrayDeque arrayDeque4 = null;
        long j5 = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * (-15241)) >> 31));
            switch (i10) {
                case -2142888365:
                case -1254737268:
                    C2167.m7155();
                    return false;
                case -1993350590:
                case 886389882:
                    ServiceConnectionC3453.m10564();
                    C2272.m7503();
                    j2 = j5;
                    iM2567 = (i12 - C0630.m2566("ۡ۬")) * 85;
                    i3 = ((iM2567 ^ i11) * 1629) ^ 967784157;
                    i4 = 776830394;
                    i7 = i3;
                    i14 = iM2567 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                case -1920198469:
                case -1376125645:
                    j = j5;
                    if (arrayDeque3.size() + size <= 1024) {
                        iM2566 = C0630.m2566("۬ۙ") ^ i11;
                        i = ((iM2566 ^ i12) * (-28675)) ^ 708433454;
                        i2 = -1990454244;
                    } else {
                        iM2566 = (C0630.m2566("ۗ۠") + i12) * 115;
                        i = ((iM2566 ^ i11) * 8073) ^ (-1229510455);
                        i2 = -2013454343;
                    }
                    i14 = i2 ^ iM2566;
                    i13 = i;
                    j5 = j;
                    break;
                case -1625154967:
                case -135680040:
                    C1773.m5908();
                    if (C2272.m7503()) {
                        j2 = j5;
                        iM2567 = (C2105.m6981("۟᩷") + i11) * (-59);
                        i3 = ((iM2567 ^ i12) * (-18549)) ^ 1954783374;
                        i4 = 692731311;
                        i7 = i3;
                        i14 = iM2567 ^ i4;
                        j5 = j2;
                        i13 = i7;
                    }
                    j2 = j5;
                    iM2567 = (C0630.m2566("ۙ۫") ^ i11) * 119;
                    i3 = ((iM2567 ^ i12) * 28693) ^ 715578683;
                    i4 = 816399237;
                    i7 = i3;
                    i14 = iM2567 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                case -1531034437:
                case -359964810:
                    j2 = j5;
                    this.f56541 = C1005.m3495(j2, c7429.f22837);
                    z = false;
                    iM2567 = (i12 - C0630.m2566("ۨ۬")) * 99;
                    i3 = ((iM2567 ^ i11) * 1745) ^ 1104873050;
                    i4 = -1945549982;
                    i7 = i3;
                    i14 = iM2567 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                case -1433000272:
                case 589723949:
                    j2 = j5;
                    if (C2167.f7158 >= 0) {
                        iM2567 = (C2105.m6981("۟᩷") + i11) * (-59);
                        i3 = ((iM2567 ^ i12) * (-18549)) ^ 1954783374;
                        i4 = 692731311;
                    } else {
                        iM2567 = (C0630.m2566("᩹۠") ^ i11) * 37;
                        i3 = ((iM2567 ^ i12) * 23931) ^ 424518626;
                        i4 = 270656882;
                    }
                    i7 = i3;
                    i14 = iM2567 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                case -1403319830:
                case -157431303:
                    if (C0422.f1886 > 0) {
                        j = j5;
                        iM2568 = (C0630.m2566("֫ܳ") + i12) * 11;
                        i8 = ((iM2568 ^ i11) * 7171) ^ 1121811664;
                        i9 = -649672688;
                        i14 = iM2568 ^ i9;
                        i13 = i8;
                        j5 = j;
                    } else {
                        j2 = j5;
                        iM2567 = (C0630.m2566("ۙ۫") ^ i11) * 119;
                        i3 = ((iM2567 ^ i12) * 28693) ^ 715578683;
                        i4 = 816399237;
                        i7 = i3;
                        i14 = iM2567 ^ i4;
                        j5 = j2;
                        i13 = i7;
                    }
                    break;
                case -1241851577:
                case -7268626:
                    j = j5;
                    c74210 = (C7429) arrayDeque2.removeFirst();
                    j4 = this.f56541;
                    if (C0237.f1507 == 0) {
                        iM2568 = (C0630.m2566("ܺۗ") + i12) * 21;
                        i8 = ((iM2568 ^ i11) * (-20085)) ^ (-397713618);
                        i9 = 1312309185;
                        i14 = iM2568 ^ i9;
                        i13 = i8;
                        j5 = j;
                    } else {
                        j2 = j;
                        iM2567 = (i12 - C0630.m2566("ۡ۬")) * 85;
                        i3 = ((iM2567 ^ i11) * 1629) ^ 967784157;
                        i4 = 776830394;
                        i7 = i3;
                        i14 = iM2567 ^ i4;
                        j5 = j2;
                        i13 = i7;
                    }
                    break;
                case -1240459381:
                case 797389478:
                    j = j5;
                    arrayDeque4 = this.f56542;
                    size = arrayDeque4.size();
                    arrayDeque3 = this.f56536;
                    if (C2105.m6982() == 0) {
                        iM2566 = (C0630.m2566("ܽۗ") + i11) * (-35);
                        i = ((iM2566 ^ i12) * 3467) ^ (-1087683493);
                        i2 = -739091046;
                        i14 = i2 ^ iM2566;
                        i13 = i;
                        j5 = j;
                    } else {
                        j2 = j;
                        iM2567 = (C2105.m6981("۟᩷") + i11) * (-59);
                        i3 = ((iM2567 ^ i12) * (-18549)) ^ 1954783374;
                        i4 = 692731311;
                        i7 = i3;
                        i14 = iM2567 ^ i4;
                        j5 = j2;
                        i13 = i7;
                    }
                    break;
                case -1178940024:
                case 797847910:
                    arrayDeque.addLast(c7429);
                    j5 = this.f56541;
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("᩸ܿ") ^ i12;
                        i5 = ((iM6981 ^ i11) * 22215) ^ (-484250625);
                        i6 = 1085261661;
                    } else {
                        iM6981 = (i11 - C2105.m6981("ۚۚ")) * (-103);
                        i5 = ((iM6981 ^ i12) * (-211)) ^ (-245719854);
                        i6 = -1650532560;
                    }
                    i7 = i5;
                    i14 = iM6981 ^ i6;
                    i13 = i7;
                    break;
                case -1142308600:
                case 1874422075:
                    C7106.m19120();
                    break;
                case -1087627635:
                case 1702762654:
                    j2 = j5;
                    if (C4075.f12947 >= 0) {
                        iM2567 = (C2105.m6981("۟᩷") + i11) * (-59);
                        i3 = ((iM2567 ^ i12) * (-18549)) ^ 1954783374;
                        i4 = 692731311;
                    } else {
                        iM2567 = C0630.m2566("᩺ۙ") ^ i11;
                        i3 = ((iM2567 ^ i12) * 10197) ^ (-1801780353);
                        i4 = -1745063083;
                    }
                    i7 = i3;
                    i14 = iM2567 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                case -805905221:
                case 1371677146:
                    return z;
                case -508528719:
                case 1350968592:
                    j2 = j5;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2567 = (C0630.m2566("ۙ۫") ^ i11) * 119;
                        i3 = ((iM2567 ^ i12) * 28693) ^ 715578683;
                        i4 = 816399237;
                    } else {
                        iM2567 = (i12 - C2105.m6981("ۧۘ")) * (-33);
                        i3 = ((iM2567 ^ i11) * (-1809)) ^ (-10826813);
                        i4 = 1459858092;
                    }
                    i7 = i3;
                    i14 = iM2567 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                case -238544210:
                case 1057476593:
                    j2 = j5;
                    if (C7106.f21815 == 0) {
                        iM2567 = C0630.m2566("ۚۢ") ^ i11;
                        i3 = ((iM2567 ^ i12) * (-2345)) ^ (-1953957588);
                        i4 = -1884968869;
                        i7 = i3;
                        i14 = iM2567 ^ i4;
                        j5 = j2;
                        i13 = i7;
                    } else {
                        j5 = j2;
                        iM6981 = C2105.m6981("᩸ܿ") ^ i12;
                        i5 = ((iM6981 ^ i11) * 22215) ^ (-484250625);
                        i6 = 1085261661;
                        i7 = i5;
                        i14 = iM6981 ^ i6;
                        i13 = i7;
                    }
                    break;
                case -197621758:
                case 980776307:
                    j = j5;
                    if (C2167.m7162(arrayDeque)) {
                        iM2566 = (C2105.m6981("۫᩷") ^ i12) * 53;
                        i = ((iM2566 ^ i11) * (-26289)) ^ (-406910877);
                        i2 = 867064959;
                    } else {
                        arrayDeque2 = arrayDeque;
                        iM2566 = C2105.m6981("ۘۖ") ^ i12;
                        i = ((iM2566 ^ i11) * (-2769)) ^ 681741898;
                        i2 = 1494087369;
                    }
                    i14 = i2 ^ iM2566;
                    i13 = i;
                    j5 = j;
                    break;
                case -182256335:
                case 1015706931:
                    j = j5;
                    arrayDeque2 = arrayDeque == arrayDeque4 ? arrayDeque3 : arrayDeque4;
                    iM2566 = C2105.m6981("ۘۖ") ^ i12;
                    i = ((iM2566 ^ i11) * (-2769)) ^ 681741898;
                    i2 = 1494087369;
                    i14 = i2 ^ iM2566;
                    i13 = i;
                    j5 = j;
                    break;
                case 652815850:
                case 1222385353:
                    j2 = j5;
                    if (C0798.m2998() != 0) {
                        iM2567 = (C2105.m6981("۟᩷") + i11) * (-59);
                        i3 = ((iM2567 ^ i12) * (-18549)) ^ 1954783374;
                        i4 = 692731311;
                    } else {
                        iM2567 = (C2105.m6981("ۜۘ") + i12) * 89;
                        i3 = ((iM2567 ^ i11) * (-19119)) ^ (-1442228468);
                        i4 = 449319594;
                    }
                    i7 = i3;
                    i14 = iM2567 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                case 706622485:
                case 2018029734:
                    j2 = j5;
                    if (C4075.f12947 >= 0) {
                        iM2567 = (i12 - C0630.m2566("ۡ۬")) * 85;
                        i3 = ((iM2567 ^ i11) * 1629) ^ 967784157;
                        i4 = 776830394;
                    } else {
                        iM2567 = C0630.m2566("֨ۖ") ^ i12;
                        i3 = ((iM2567 ^ i11) * 18489) ^ (-17482518);
                        i4 = 490691056;
                    }
                    i7 = i3;
                    i14 = iM2567 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                case 1045573008:
                case 1185658936:
                    j = j5;
                    long j6 = c74210.f22837;
                    if (C3245.f10203 <= 0) {
                        j3 = j6;
                        iM2568 = (C0630.m2566("֫ܳ") + i12) * 11;
                        i8 = ((iM2568 ^ i11) * 7171) ^ 1121811664;
                        i9 = -649672688;
                        i14 = iM2568 ^ i9;
                        i13 = i8;
                    } else {
                        int iM6983 = (i11 - C2105.m6981("۠ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        j3 = j6;
                        i13 = ((iM6983 ^ i12) * 27365) ^ 1384673262;
                        i14 = iM6983 ^ (-1030316595);
                    }
                    j5 = j;
                    break;
                case 1202885591:
                case 1703097835:
                    this.f56541 = j4 - j3;
                    j2 = j5;
                    z = true;
                    iM2567 = (i12 - C0630.m2566("ۨ۬")) * 99;
                    i3 = ((iM2567 ^ i11) * 1745) ^ 1104873050;
                    i4 = -1945549982;
                    i7 = i3;
                    i14 = iM2567 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                default:
                    j = j5;
                    if (this.f56541 > 67108864) {
                        iM2566 = (C0630.m2566("ۗ۠") + i12) * 115;
                        i = ((iM2566 ^ i11) * 8073) ^ (-1229510455);
                        i2 = -2013454343;
                    } else {
                        iM2566 = (C0630.m2566("۠۫") ^ i11) * (-121);
                        i = ((iM2566 ^ i12) * (-12767)) ^ 877391145;
                        i2 = -638458910;
                    }
                    i14 = i2 ^ iM2566;
                    i13 = i;
                    j5 = j;
                    break;
            }
        }
    }
}
