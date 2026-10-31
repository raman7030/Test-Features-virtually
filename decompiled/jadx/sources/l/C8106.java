package l;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.alipay.sdk.app.H5PayActivity$$ExternalSyntheticLambda0;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.۠ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8106 implements InterfaceC4639 {

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public static ScheduledExecutorService f24988;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public static int f24989;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static final Object f24990 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f24991;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public Handler f24992;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9518 f24993;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public long f24994;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f24995;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public InterfaceC21573 f24996;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21512 f24997;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public C13830 f24998;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f24999;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final C12339 f25000;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C17525 f25001;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f25002;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f25003;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public long f25004;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6050 f25005;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public boolean f25006;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f25007;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public float f25008;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4993 f25009;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public ByteBuffer f25010;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f25011;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Context f25012;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public long f25013;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C15160 f25014;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public Looper f25015;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AudioTrack f25016;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public C9518 f25017;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18690 f25018;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public boolean f25019;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15866 f25020;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C15866 f25021;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f25022;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final C18690 f25023;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f25024;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final C10223 f25025;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f25026;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final C21222 f25027;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f25028;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public long f25029;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14455 f25030;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C1050 f25031;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f25032;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f25033;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10284 f25034;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public C2730 f25035;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18231 f25036;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f25037;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20868 f25038;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f25039;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C18045 f25040;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f25041;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f25042;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final boolean f25043;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f25044;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C9579 f25045;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f25046;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public long f25047;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f25048;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f25049;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Context f25050;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f25051;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f25052;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public boolean f25053;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f25054;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public long f25055;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C3582 f25056;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C3873 f25057;

    public C8106(C20807 c20807) {
        int deviceId;
        Context applicationContext = c20807.f67373.getApplicationContext();
        this.f25012 = applicationContext;
        this.f25036 = C18231.f56651;
        this.f25040 = applicationContext != null ? null : c20807.f67367;
        this.f25009 = c20807.f67370;
        this.f25052 = false;
        int i = Build.VERSION.SDK_INT;
        this.f25043 = false;
        this.f25039 = 0;
        this.f25014 = c20807.f67372;
        InterfaceC14455 interfaceC14455 = c20807.f67368;
        interfaceC14455.getClass();
        this.f25030 = interfaceC14455;
        this.f25034 = new C10284(new C19396(this));
        C6050 c6050 = new C6050();
        this.f25005 = c6050;
        C10223 c10223 = new C10223();
        this.f25025 = c10223;
        this.f25027 = new C21222();
        this.f25000 = new C12339();
        this.f25044 = AbstractC14545.of((Object) c10223, (Object) c6050);
        this.f25008 = 1.0f;
        this.f25048 = 0;
        this.f25001 = new C17525();
        C2730 c2730 = C2730.f8507;
        this.f25021 = new C15866(c2730, 0L, 0L);
        this.f25035 = c2730;
        this.f25006 = false;
        this.f25037 = new ArrayDeque();
        this.f25018 = new C18690();
        this.f25023 = new C18690();
        this.f24997 = c20807.f67371;
        int i2 = -1;
        if (i >= 34 && (deviceId = c20807.f67373.getDeviceId()) != 0 && deviceId != -1) {
            i2 = deviceId;
        }
        this.f25032 = i2;
        this.f25046 = true;
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ֫ */
    public final void mo13591(InterfaceC21573 interfaceC21573) {
        this.f24996 = interfaceC21573;
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ֫ */
    public final void mo13587(C13830 c13830) {
        this.f24998 = c13830;
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ֫ */
    public final void mo13588(InterfaceC16427 interfaceC16427) {
        this.f25034.m26036(interfaceC16427);
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13595(C8353 c8353) {
        return mo13598(c8353) != 0;
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ۧ */
    public final int mo13598(C8353 c8353) {
        m21538();
        String str = c8353.f25614;
        int i = c8353.f25605;
        if ("audio/raw".equals(str)) {
            if (!C3603.m11034(i)) {
                C8083.m21451(i, "Invalid PCM encoding: ");
                return 0;
            }
            if (i != 2 && (!this.f25052 || i != 4)) {
                return 1;
            }
        } else if (this.f25040.m42102(this.f25036, c8353) == null) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15927 m21567(C8353 c8353) {
        if (this.f25041) {
            return C15927.f49192;
        }
        return this.f25030.mo27246(this.f25036, c8353);
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ᩻ */
    public final long mo13605() {
        ArrayDeque arrayDeque;
        long j;
        if (!m21561() || this.f25033) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f25034.m26037(), C3603.m11013(this.f24993.f28903, m21548()));
        while (true) {
            arrayDeque = this.f25037;
            if (arrayDeque.isEmpty() || jMin < ((C15866) arrayDeque.getFirst()).f49038) {
                break;
            }
            this.f25021 = (C15866) arrayDeque.remove();
        }
        C15866 c15866 = this.f25021;
        long j2 = jMin - c15866.f49038;
        long jM11015 = C3603.m11015(j2, c15866.f49041.f8510);
        boolean zIsEmpty = arrayDeque.isEmpty();
        InterfaceC4993 interfaceC4993 = this.f25009;
        if (zIsEmpty) {
            long jM22770 = ((C8812) interfaceC4993).m22770(j2);
            C15866 c15867 = this.f25021;
            j = c15867.f49040 + jM22770;
            c15867.f49039 = jM22770 - jM11015;
        } else {
            C15866 c15868 = this.f25021;
            j = c15868.f49040 + jM11015 + c15868.f49039;
        }
        long jM22774 = ((C8812) interfaceC4993).m22774();
        long jM11013 = C3603.m11013(this.f24993.f28903, jM22774) + j;
        long j3 = this.f24994;
        if (jM22774 > j3) {
            long jM11014 = C3603.m11013(this.f24993.f28903, jM22774 - j3);
            this.f24994 = jM22774;
            this.f24995 += jM11014;
            if (this.f24992 == null) {
                this.f24992 = new Handler(Looper.myLooper());
            }
            this.f24992.removeCallbacksAndMessages(null);
            this.f24992.postDelayed(new RunnableC7994(1, this), 100L);
        }
        return jM11013;
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ֫ */
    public final void mo13586(C8353 c8353, int[] iArr) throws C8167 {
        C3582 c3582;
        C15927 c15927M21567;
        int iIntValue;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int iM11000;
        int i7;
        int iM50530;
        m21538();
        String str = c8353.f25614;
        int i8 = c8353.f25624;
        int i9 = c8353.f25625;
        int i10 = c8353.f25605;
        boolean zEquals = "audio/raw".equals(str);
        boolean z3 = this.f25043;
        C21512 c21512 = this.f24997;
        if (zEquals) {
            C22632.m50631(C3603.m11034(i10));
            int iM11047 = C3603.m11047(i10) * i9;
            C1846 c1846 = new C1846();
            c1846.m16263((List) this.f25044);
            if (this.f25052 && (i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4)) {
                c1846.m16264(this.f25000);
            } else {
                c1846.m16264(this.f25027);
                c1846.m6132((Object[]) ((C8812) this.f25009).m22773());
            }
            c3582 = new C3582(c1846.m6131());
            if (c3582.equals(this.f25056)) {
                c3582 = this.f25056;
            }
            this.f25025.m25668(c8353.f25629, c8353.f25630);
            this.f25005.m16879(iArr);
            try {
                C18399 c18399M10970 = c3582.m10970(new C18399(i8, i9, i10));
                int i11 = c18399M10970.f57132;
                int i12 = c18399M10970.f57133;
                int i13 = c18399M10970.f57134;
                c21512.getClass();
                iIntValue = C3603.m11035(i11);
                int iM11048 = C3603.m11047(i12) * i11;
                i2 = iM11047;
                z = z3;
                i4 = iM11048;
                z2 = false;
                i5 = i13;
                i = i12;
                i3 = 0;
            } catch (C19105 e) {
                throw new C8167(e, c8353);
            }
        } else {
            c3582 = new C3582(AbstractC14545.of());
            if (this.f25039 != 0) {
                c15927M21567 = m21567(c8353);
            } else {
                c15927M21567 = C15927.f49192;
            }
            if (this.f25039 != 0 && c15927M21567.f49193) {
                str.getClass();
                int iM24805 = C9786.m24805(str, c8353.f25619);
                c21512.getClass();
                iIntValue = C3603.m11035(i9);
                z2 = c15927M21567.f49194;
                i = iM24805;
                i2 = -1;
                i3 = 1;
                i4 = -1;
                z = true;
            } else {
                Pair pairM42102 = this.f25040.m42102(this.f25036, c8353);
                if (pairM42102 == null) {
                    throw new C8167("Unable to configure passthrough for: " + c8353, c8353);
                }
                int iIntValue2 = ((Integer) pairM42102.first).intValue();
                iIntValue = ((Integer) pairM42102.second).intValue();
                i = iIntValue2;
                z = z3;
                i2 = -1;
                i3 = 2;
                i4 = -1;
                z2 = false;
            }
            i5 = i8;
        }
        if (i == 0) {
            throw new C8167("Invalid output encoding (mode=" + i3 + ") for: " + c8353, c8353);
        }
        if (iIntValue == 0) {
            throw new C8167("Invalid output channel config (mode=" + i3 + ") for: " + c8353, c8353);
        }
        int i14 = c8353.f25627;
        if ("audio/vnd.dts.hd;profile=lbr".equals(str) && i14 == -1) {
            i14 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i5, iIntValue, i);
        C22632.m50634(minBufferSize != -2);
        int i15 = i4 != -1 ? i4 : 1;
        double d = z ? 8.0d : 1.0d;
        this.f25014.getClass();
        if (i3 != 0) {
            if (i3 == 1) {
                int iM50531 = C22535.m50530(i);
                C22632.m50634(iM50531 != -2147483647);
                iM11000 = C13426.m32446((((long) 50000000) * ((long) iM50531)) / 1000000);
            } else {
                if (i3 != 2) {
                    throw new IllegalArgumentException();
                }
                if (i == 5) {
                    i7 = 500000;
                } else {
                    i7 = i == 8 ? BasicLabelFormatter.MILLION : 250000;
                }
                if (i14 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    iM50530 = C5666.m15978(i14, 8);
                } else {
                    iM50530 = C22535.m50530(i);
                    C22632.m50634(iM50530 != -2147483647);
                }
                iM11000 = C13426.m32446((((long) i7) * ((long) iM50530)) / 1000000);
            }
            i6 = i;
        } else {
            z = z;
            z2 = z2;
            int i16 = i;
            long j = i5;
            i6 = i16;
            long j2 = i15;
            iM11000 = C3603.m11000(minBufferSize * 4, C13426.m32446(((((long) 250000) * j) * j2) / 1000000), C13426.m32446(((((long) 750000) * j) * j2) / 1000000));
        }
        int iMax = i15 * (((Math.max(minBufferSize, (int) (((double) iM11000) * d)) + i15) - 1) / i15);
        this.f25041 = false;
        C9518 c9518 = new C9518(c8353, i2, i3, i4, i5, iIntValue, i6, iMax, c3582, z, z2, this.f25019);
        if (m21561()) {
            this.f25017 = c9518;
        } else {
            this.f24993 = c9518;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:64:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m21560() throws C15221 {
        AudioTrack audioTrackM21541;
        C20868 c20868;
        C13830 c13830;
        if (this.f25018.m43310()) {
            return false;
        }
        try {
            C9518 c9518 = this.f24993;
            c9518.getClass();
            audioTrackM21541 = m21541(c9518);
        } catch (C15221 e) {
            C9518 c9519 = this.f24993;
            if (c9519.f28905 > 1000000) {
                C9518 c95110 = new C9518(c9519.f28909, c9519.f28906, c9519.f28911, c9519.f28904, c9519.f28903, c9519.f28912, c9519.f28902, BasicLabelFormatter.MILLION, c9519.f28901, c9519.f28908, c9519.f28910, c9519.f28907);
                try {
                    audioTrackM21541 = m21541(c95110);
                    this.f24993 = c95110;
                } catch (C15221 e2) {
                    e.addSuppressed(e2);
                    if (this.f24993.f28911 == 1) {
                        throw e;
                    }
                    this.f25041 = true;
                    throw e;
                }
            }
            if (this.f24993.f28911 == 1) {
                throw e;
            }
            this.f25041 = true;
            throw e;
        }
        this.f25016 = audioTrackM21541;
        if (m21546(audioTrackM21541)) {
            AudioTrack audioTrack = this.f25016;
            if (this.f25031 == null) {
                this.f25031 = new C1050(this);
            }
            this.f25031.m3618(audioTrack);
            C9518 c95111 = this.f24993;
            if (c95111.f28910) {
                AudioTrack audioTrack2 = this.f25016;
                C8353 c8353 = c95111.f28909;
                audioTrack2.setOffloadDelayPadding(c8353.f25629, c8353.f25630);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && (c13830 = this.f24998) != null) {
            C17278.m40568(this.f25016, c13830);
        }
        AudioTrack audioTrack3 = this.f25016;
        C9518 c95112 = this.f24993;
        this.f25034.m26035(audioTrack3, c95112.f28911 == 2, c95112.f28902, c95112.f28904, c95112.f28905, this.f25046);
        if (m21561()) {
            this.f25016.setVolume(this.f25008);
        }
        this.f25001.getClass();
        C9579 c9579 = this.f25045;
        if (c9579 != null && i >= 23) {
            C17984.m42024(this.f25016, c9579);
            C20868 c20869 = this.f25038;
            if (c20869 != null) {
                c20869.m47690(this.f25045.f29041);
            }
        }
        if (i >= 24 && (c20868 = this.f25038) != null) {
            this.f25057 = new C3873(this.f25016, c20868);
        }
        this.f25033 = true;
        int audioSessionId = this.f25016.getAudioSessionId();
        boolean z = audioSessionId != this.f25048;
        this.f25048 = audioSessionId;
        InterfaceC21573 interfaceC21573 = this.f24996;
        if (interfaceC21573 != null) {
            interfaceC21573.mo46350(this.f24993.m24389());
            if (z) {
                this.f25049 = true;
                this.f24996.mo46346(this.f25048);
            }
        }
        return true;
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ܿ */
    public final void mo13602() {
        this.f25002 = true;
        if (m21561()) {
            this.f25034.m26039();
            if (!this.f25053 || m21546(this.f25016)) {
                this.f25016.play();
            }
        }
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13604() {
        this.f25051 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x0183  */
    /* JADX WARN: Code duplicated, block: B:113:0x0189  */
    /* JADX WARN: Code duplicated, block: B:116:0x018e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0194  */
    /* JADX WARN: Code duplicated, block: B:119:0x019a  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e4 A[LOOP:0: B:122:0x01c4->B:130:0x01e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:136:0x0200  */
    /* JADX WARN: Code duplicated, block: B:137:0x0202  */
    /* JADX WARN: Code duplicated, block: B:140:0x020a  */
    /* JADX WARN: Code duplicated, block: B:141:0x020d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0220  */
    /* JADX WARN: Code duplicated, block: B:145:0x0229  */
    /* JADX WARN: Code duplicated, block: B:163:0x029c  */
    /* JADX WARN: Code duplicated, block: B:164:0x029f  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:175:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:181:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:185:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:189:0x030f  */
    /* JADX WARN: Code duplicated, block: B:192:0x0316  */
    /* JADX WARN: Code duplicated, block: B:194:0x0326  */
    /* JADX WARN: Code duplicated, block: B:199:0x0335  */
    /* JADX WARN: Code duplicated, block: B:200:0x0340  */
    /* JADX WARN: Code duplicated, block: B:202:0x034f  */
    /* JADX WARN: Code duplicated, block: B:204:0x035a  */
    /* JADX WARN: Code duplicated, block: B:206:0x0360  */
    /* JADX WARN: Code duplicated, block: B:208:0x036a  */
    /* JADX WARN: Code duplicated, block: B:211:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:73:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x010c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0116  */
    /* JADX WARN: Code duplicated, block: B:81:0x011f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0122  */
    /* JADX WARN: Code duplicated, block: B:84:0x0127  */
    /* JADX WARN: Code duplicated, block: B:86:0x0133  */
    /* JADX WARN: Code duplicated, block: B:87:0x0139  */
    /* JADX WARN: Code duplicated, block: B:90:0x014c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0156  */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02a7, code lost:
    
        if (r5 == 0) goto L168;
     */
    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo13594(int i, long j, ByteBuffer byteBuffer) throws C15221, C20162 {
        boolean zM21561;
        C18690 c18690;
        boolean z;
        C9518 c9518;
        C9518 c9519;
        long j2;
        long jM11013;
        InterfaceC21573 interfaceC21573;
        InterfaceC21573 interfaceC21574;
        int i2;
        int iM11983;
        int i3;
        int i4;
        byte b;
        int i5;
        byte b2;
        int iReverseBytes;
        int i6;
        int i7;
        int iPosition;
        int iLimit;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int iReverseBytes2;
        ByteBuffer byteBuffer2 = this.f25007;
        C22632.m50631(byteBuffer2 == null || byteBuffer == byteBuffer2);
        C9518 c95110 = this.f25017;
        C10284 c10284 = this.f25034;
        if (c95110 == null) {
            zM21561 = m21561();
            c18690 = this.f25018;
            if (!zM21561) {
                c18690.m43308();
                if (this.f25033) {
                    this.f25013 = Math.max(0L, j);
                    this.f25051 = false;
                    this.f25033 = false;
                    if (m21551()) {
                        m21539();
                    }
                    m21542(j);
                    if (this.f25002) {
                        mo13602();
                    }
                }
                if (c10284.m26044(m21548())) {
                    if (this.f25007 != null) {
                        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C22632.m50631(z);
                        if (byteBuffer.hasRemaining()) {
                            c9518 = this.f24993;
                            if (c9518.f28911 != 0) {
                                i2 = c9518.f28902;
                                if (i2 != 20) {
                                    if (i2 != 30) {
                                        switch (i2) {
                                            case 5:
                                            case 6:
                                                iM11983 = C5893.m16511(byteBuffer);
                                                break;
                                            case 7:
                                            case 8:
                                                if (byteBuffer.getInt(0) == -233094848) {
                                                    i3 = 1024;
                                                } else {
                                                    i3 = 1024;
                                                }
                                                break;
                                            case 9:
                                                int iPosition2 = byteBuffer.position();
                                                String str = C3603.f11424;
                                                iReverseBytes = byteBuffer.getInt(iPosition2);
                                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                    iReverseBytes = Integer.reverseBytes(iReverseBytes);
                                                }
                                                if ((iReverseBytes & (-2097152)) == -2097152) {
                                                    i3 = -1;
                                                } else {
                                                    i3 = -1;
                                                }
                                                if (i3 == -1) {
                                                    throw new IllegalArgumentException();
                                                }
                                                break;
                                            case 10:
                                                i3 = 1024;
                                                break;
                                            case 11:
                                            case 12:
                                                i3 = 2048;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 14:
                                                        iPosition = byteBuffer.position();
                                                        iLimit = byteBuffer.limit() - 10;
                                                        i8 = iPosition;
                                                        while (true) {
                                                            if (i8 <= iLimit) {
                                                                String str2 = C3603.f11424;
                                                                iReverseBytes2 = byteBuffer.getInt(i8 + 4);
                                                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                                    iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                                                }
                                                                if ((iReverseBytes2 & (-2)) == -126718022) {
                                                                    i9 = i8 - iPosition;
                                                                } else {
                                                                    i8++;
                                                                }
                                                            } else {
                                                                i9 = -1;
                                                            }
                                                        }
                                                        if (i9 == -1) {
                                                            if ((byteBuffer.get(byteBuffer.position() + i9 + 7) & 255) == 187) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            int iPosition3 = byteBuffer.position() + i9;
                                                            if (z2) {
                                                                i10 = 9;
                                                            } else {
                                                                i10 = 8;
                                                            }
                                                            iM11983 = (40 << ((byteBuffer.get(iPosition3 + i10) >> 4) & 7)) * 16;
                                                        } else {
                                                            i3 = 0;
                                                        }
                                                        break;
                                                    case 15:
                                                        i3 = 512;
                                                        break;
                                                    case 16:
                                                        i3 = 1024;
                                                        break;
                                                    case 17:
                                                        byte[] bArr = new byte[16];
                                                        int iPosition4 = byteBuffer.position();
                                                        byteBuffer.get(bArr);
                                                        byteBuffer.position(iPosition4);
                                                        i3 = C13653.m32806(new C16302(bArr, 16)).f73696;
                                                        break;
                                                    case 18:
                                                        iM11983 = C5893.m16511(byteBuffer);
                                                        break;
                                                    default:
                                                        throw new IllegalStateException(C19370.m44628(i2, "Unexpected audio encoding: "));
                                                }
                                                break;
                                        }
                                    } else if (byteBuffer.getInt(0) == -233094848) {
                                        i3 = 1024;
                                    } else {
                                        i3 = 1024;
                                    }
                                    this.f24999 = i3;
                                } else {
                                    iM11983 = C3939.m11983(byteBuffer);
                                }
                                i3 = iM11983;
                                this.f24999 = i3;
                            }
                            if (this.f25020 == null) {
                                long j3 = this.f25013;
                                c9519 = this.f24993;
                                if (c9519.f28911 == 0) {
                                    j2 = this.f25004 / ((long) c9519.f28906);
                                } else {
                                    j2 = this.f25047;
                                }
                                jM11013 = C3603.m11013(c9519.f28909.f25624, j2 - this.f25025.m25670()) + j3;
                                if (!this.f25051) {
                                    interfaceC21574 = this.f24996;
                                    if (interfaceC21574 != null) {
                                        StringBuilder sbM31106 = C12803.m31106("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM11013);
                                        sbM31106.append(j);
                                        interfaceC21574.mo46349(new C22278(sbM31106.toString()));
                                    }
                                    this.f25051 = true;
                                }
                                if (this.f25051) {
                                    if (m21547()) {
                                        long j4 = j - jM11013;
                                        this.f25013 += j4;
                                        this.f25051 = false;
                                        m21542(j);
                                        interfaceC21573 = this.f24996;
                                        if (interfaceC21573 != null) {
                                            interfaceC21573.mo46356();
                                        }
                                    }
                                }
                                if (this.f24993.f28911 == 0) {
                                    this.f25004 += (long) byteBuffer.remaining();
                                } else {
                                    this.f25047 = (((long) this.f24999) * ((long) i)) + this.f25047;
                                }
                                this.f25007 = byteBuffer;
                                this.f25022 = i;
                                m21557(j);
                                if (!this.f25007.hasRemaining()) {
                                    this.f25007 = null;
                                    this.f25022 = 0;
                                    return true;
                                }
                                if (c10284.m26041(m21548())) {
                                    C19956.m46037("Resetting stalled audio track");
                                    flush();
                                    return true;
                                }
                            } else if (m21547()) {
                                m21542(j);
                                this.f25020 = null;
                                long j5 = this.f25013;
                                c9519 = this.f24993;
                                if (c9519.f28911 == 0) {
                                    j2 = this.f25004 / ((long) c9519.f28906);
                                } else {
                                    j2 = this.f25047;
                                }
                                jM11013 = C3603.m11013(c9519.f28909.f25624, j2 - this.f25025.m25670()) + j5;
                                if (!this.f25051) {
                                    interfaceC21574 = this.f24996;
                                    if (interfaceC21574 != null) {
                                        StringBuilder sbM31107 = C12803.m31106("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM11013);
                                        sbM31107.append(j);
                                        interfaceC21574.mo46349(new C22278(sbM31107.toString()));
                                    }
                                    this.f25051 = true;
                                }
                                if (this.f25051) {
                                    if (m21547()) {
                                        long j6 = j - jM11013;
                                        this.f25013 += j6;
                                        this.f25051 = false;
                                        m21542(j);
                                        interfaceC21573 = this.f24996;
                                        if (interfaceC21573 != null) {
                                            interfaceC21573.mo46356();
                                        }
                                    }
                                }
                                if (this.f24993.f28911 == 0) {
                                    this.f25004 += (long) byteBuffer.remaining();
                                } else {
                                    this.f25047 = (((long) this.f24999) * ((long) i)) + this.f25047;
                                }
                                this.f25007 = byteBuffer;
                                this.f25022 = i;
                                m21557(j);
                                if (!this.f25007.hasRemaining()) {
                                    this.f25007 = null;
                                    this.f25022 = 0;
                                    return true;
                                }
                                if (c10284.m26041(m21548())) {
                                    C19956.m46037("Resetting stalled audio track");
                                    flush();
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    m21557(j);
                    if (!this.f25007.hasRemaining()) {
                        this.f25007 = null;
                        this.f25022 = 0;
                        return true;
                    }
                    if (c10284.m26041(m21548())) {
                        C19956.m46037("Resetting stalled audio track");
                        flush();
                        return true;
                    }
                }
            } else {
                try {
                    if (m21560()) {
                        c18690.m43308();
                        if (this.f25033) {
                            this.f25013 = Math.max(0L, j);
                            this.f25051 = false;
                            this.f25033 = false;
                            if (m21551()) {
                                m21539();
                            }
                            m21542(j);
                            if (this.f25002) {
                                mo13602();
                            }
                        }
                        if (c10284.m26044(m21548())) {
                            if (this.f25007 != null) {
                                if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C22632.m50631(z);
                                if (byteBuffer.hasRemaining()) {
                                    c9518 = this.f24993;
                                    if (c9518.f28911 != 0 && this.f24999 == 0) {
                                        i2 = c9518.f28902;
                                        if (i2 != 20) {
                                            if (i2 != 30) {
                                                switch (i2) {
                                                    case 5:
                                                    case 6:
                                                        iM11983 = C5893.m16511(byteBuffer);
                                                        break;
                                                    case 7:
                                                    case 8:
                                                        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
                                                            i3 = 1024;
                                                        } else if (byteBuffer.getInt(0) != 622876772) {
                                                            int iPosition5 = byteBuffer.position();
                                                            byte b3 = byteBuffer.get(iPosition5);
                                                            if (b3 != -2) {
                                                                if (b3 == -1) {
                                                                    i4 = (byteBuffer.get(iPosition5 + 4) & 7) << 4;
                                                                    b2 = byteBuffer.get(iPosition5 + 7);
                                                                } else if (b3 != 31) {
                                                                    i4 = (byteBuffer.get(iPosition5 + 4) & 1) << 6;
                                                                    b = byteBuffer.get(iPosition5 + 5);
                                                                } else {
                                                                    i4 = (byteBuffer.get(iPosition5 + 5) & 7) << 4;
                                                                    b2 = byteBuffer.get(iPosition5 + 6);
                                                                }
                                                                i5 = b2 & 60;
                                                                iM11983 = (((i5 >> 2) | i4) + 1) * 32;
                                                            } else {
                                                                i4 = (byteBuffer.get(iPosition5 + 5) & 1) << 6;
                                                                b = byteBuffer.get(iPosition5 + 4);
                                                            }
                                                            i5 = b & Poly1305KeyGenerator.R_MASK_LOW_2;
                                                            iM11983 = (((i5 >> 2) | i4) + 1) * 32;
                                                        } else {
                                                            i3 = 4096;
                                                        }
                                                        break;
                                                    case 9:
                                                        int iPosition6 = byteBuffer.position();
                                                        String str3 = C3603.f11424;
                                                        iReverseBytes = byteBuffer.getInt(iPosition6);
                                                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                            iReverseBytes = Integer.reverseBytes(iReverseBytes);
                                                        }
                                                        if ((iReverseBytes & (-2097152)) == -2097152 || (i6 = (iReverseBytes >>> 19) & 3) == 1 || (i7 = (iReverseBytes >>> 17) & 3) == 0) {
                                                            i3 = -1;
                                                        } else {
                                                            int i11 = (iReverseBytes >>> 12) & 15;
                                                            int i12 = (iReverseBytes >>> 10) & 3;
                                                            if (i11 == 0 || i11 == 15 || i12 == 3) {
                                                                i3 = -1;
                                                            } else if (i7 != 1) {
                                                                if (i7 == 2) {
                                                                    i3 = 1152;
                                                                } else {
                                                                    if (i7 != 3) {
                                                                        throw new IllegalArgumentException();
                                                                    }
                                                                    i3 = MLKEMEngine.KyberPolyBytes;
                                                                }
                                                            } else if (i6 == 3) {
                                                                i3 = 1152;
                                                            } else {
                                                                i3 = 576;
                                                            }
                                                        }
                                                        if (i3 == -1) {
                                                            throw new IllegalArgumentException();
                                                        }
                                                        break;
                                                    case 10:
                                                        i3 = 1024;
                                                        break;
                                                    case 11:
                                                    case 12:
                                                        i3 = 2048;
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case 14:
                                                                iPosition = byteBuffer.position();
                                                                iLimit = byteBuffer.limit() - 10;
                                                                i8 = iPosition;
                                                                while (true) {
                                                                    if (i8 <= iLimit) {
                                                                        String str4 = C3603.f11424;
                                                                        iReverseBytes2 = byteBuffer.getInt(i8 + 4);
                                                                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                                            iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                                                        }
                                                                        if ((iReverseBytes2 & (-2)) == -126718022) {
                                                                            i9 = i8 - iPosition;
                                                                        } else {
                                                                            i8++;
                                                                        }
                                                                    } else {
                                                                        i9 = -1;
                                                                    }
                                                                }
                                                                if (i9 == -1) {
                                                                    if ((byteBuffer.get(byteBuffer.position() + i9 + 7) & 255) == 187) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    int iPosition7 = byteBuffer.position() + i9;
                                                                    if (z2) {
                                                                        i10 = 9;
                                                                    } else {
                                                                        i10 = 8;
                                                                    }
                                                                    iM11983 = (40 << ((byteBuffer.get(iPosition7 + i10) >> 4) & 7)) * 16;
                                                                } else {
                                                                    i3 = 0;
                                                                }
                                                                break;
                                                            case 15:
                                                                i3 = 512;
                                                                break;
                                                            case 16:
                                                                i3 = 1024;
                                                                break;
                                                            case 17:
                                                                byte[] bArr2 = new byte[16];
                                                                int iPosition8 = byteBuffer.position();
                                                                byteBuffer.get(bArr2);
                                                                byteBuffer.position(iPosition8);
                                                                i3 = C13653.m32806(new C16302(bArr2, 16)).f73696;
                                                                break;
                                                            case 18:
                                                                iM11983 = C5893.m16511(byteBuffer);
                                                                break;
                                                            default:
                                                                throw new IllegalStateException(C19370.m44628(i2, "Unexpected audio encoding: "));
                                                        }
                                                        break;
                                                }
                                            } else if (byteBuffer.getInt(0) == -233094848) {
                                                i3 = 1024;
                                            } else {
                                                i3 = 1024;
                                            }
                                            this.f24999 = i3;
                                        } else {
                                            iM11983 = C3939.m11983(byteBuffer);
                                        }
                                        i3 = iM11983;
                                        this.f24999 = i3;
                                    }
                                    if (this.f25020 == null) {
                                        long j7 = this.f25013;
                                        c9519 = this.f24993;
                                        if (c9519.f28911 == 0) {
                                            j2 = this.f25004 / ((long) c9519.f28906);
                                        } else {
                                            j2 = this.f25047;
                                        }
                                        jM11013 = C3603.m11013(c9519.f28909.f25624, j2 - this.f25025.m25670()) + j7;
                                        if (!this.f25051 && Math.abs(jM11013 - j) > 200000) {
                                            interfaceC21574 = this.f24996;
                                            if (interfaceC21574 != null) {
                                                StringBuilder sbM31108 = C12803.m31106("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM11013);
                                                sbM31108.append(j);
                                                interfaceC21574.mo46349(new C22278(sbM31108.toString()));
                                            }
                                            this.f25051 = true;
                                        }
                                        if (this.f25051) {
                                            if (m21547()) {
                                                long j8 = j - jM11013;
                                                this.f25013 += j8;
                                                this.f25051 = false;
                                                m21542(j);
                                                interfaceC21573 = this.f24996;
                                                if (interfaceC21573 != null && j8 != 0) {
                                                    interfaceC21573.mo46356();
                                                }
                                            }
                                        }
                                        if (this.f24993.f28911 == 0) {
                                            this.f25004 += (long) byteBuffer.remaining();
                                        } else {
                                            this.f25047 = (((long) this.f24999) * ((long) i)) + this.f25047;
                                        }
                                        this.f25007 = byteBuffer;
                                        this.f25022 = i;
                                        m21557(j);
                                        if (!this.f25007.hasRemaining()) {
                                            this.f25007 = null;
                                            this.f25022 = 0;
                                            return true;
                                        }
                                        if (c10284.m26041(m21548())) {
                                            C19956.m46037("Resetting stalled audio track");
                                            flush();
                                            return true;
                                        }
                                    } else if (m21547()) {
                                        m21542(j);
                                        this.f25020 = null;
                                        long j9 = this.f25013;
                                        c9519 = this.f24993;
                                        if (c9519.f28911 == 0) {
                                            j2 = this.f25004 / ((long) c9519.f28906);
                                        } else {
                                            j2 = this.f25047;
                                        }
                                        jM11013 = C3603.m11013(c9519.f28909.f25624, j2 - this.f25025.m25670()) + j9;
                                        if (!this.f25051) {
                                            interfaceC21574 = this.f24996;
                                            if (interfaceC21574 != null) {
                                                StringBuilder sbM31109 = C12803.m31106("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM11013);
                                                sbM31109.append(j);
                                                interfaceC21574.mo46349(new C22278(sbM31109.toString()));
                                            }
                                            this.f25051 = true;
                                        }
                                        if (this.f25051) {
                                            if (m21547()) {
                                                long j10 = j - jM11013;
                                                this.f25013 += j10;
                                                this.f25051 = false;
                                                m21542(j);
                                                interfaceC21573 = this.f24996;
                                                if (interfaceC21573 != null) {
                                                    interfaceC21573.mo46356();
                                                }
                                            }
                                        }
                                        if (this.f24993.f28911 == 0) {
                                            this.f25004 += (long) byteBuffer.remaining();
                                        } else {
                                            this.f25047 = (((long) this.f24999) * ((long) i)) + this.f25047;
                                        }
                                        this.f25007 = byteBuffer;
                                        this.f25022 = i;
                                        m21557(j);
                                        if (!this.f25007.hasRemaining()) {
                                            this.f25007 = null;
                                            this.f25022 = 0;
                                            return true;
                                        }
                                        if (c10284.m26041(m21548())) {
                                            C19956.m46037("Resetting stalled audio track");
                                            flush();
                                            return true;
                                        }
                                    }
                                }
                                return true;
                            }
                            m21557(j);
                            if (!this.f25007.hasRemaining()) {
                                this.f25007 = null;
                                this.f25022 = 0;
                                return true;
                            }
                            if (c10284.m26041(m21548())) {
                                C19956.m46037("Resetting stalled audio track");
                                flush();
                                return true;
                            }
                        }
                    }
                } catch (C15221 e) {
                    if (e.f46707) {
                        throw e;
                    }
                    c18690.m43309(e);
                    return false;
                }
            }
        } else if (m21547()) {
            C9518 c95111 = this.f25017;
            C9518 c95112 = this.f24993;
            c95111.getClass();
            if (c95112.f28911 == c95111.f28911 && c95112.f28902 == c95111.f28902 && c95112.f28903 == c95111.f28903 && c95112.f28912 == c95111.f28912 && c95112.f28904 == c95111.f28904 && c95112.f28908 == c95111.f28908 && c95112.f28910 == c95111.f28910) {
                this.f24993 = this.f25017;
                this.f25017 = null;
                AudioTrack audioTrack = this.f25016;
                if (audioTrack != null && m21546(audioTrack) && this.f24993.f28910) {
                    if (this.f25016.getPlayState() == 3) {
                        this.f25016.setOffloadEndOfStream();
                        c10284.m26032();
                    }
                    AudioTrack audioTrack2 = this.f25016;
                    C8353 c8353 = this.f24993.f28909;
                    audioTrack2.setOffloadDelayPadding(c8353.f25629, c8353.f25630);
                    this.f25054 = true;
                }
            } else {
                m21549();
                if (!mo13593()) {
                    flush();
                }
            }
            m21542(j);
            zM21561 = m21561();
            c18690 = this.f25018;
            if (!zM21561) {
                c18690.m43308();
                if (this.f25033) {
                    this.f25013 = Math.max(0L, j);
                    this.f25051 = false;
                    this.f25033 = false;
                    if (m21551()) {
                        m21539();
                    }
                    m21542(j);
                    if (this.f25002) {
                        mo13602();
                    }
                }
                if (c10284.m26044(m21548())) {
                    if (this.f25007 != null) {
                        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C22632.m50631(z);
                        if (byteBuffer.hasRemaining()) {
                            c9518 = this.f24993;
                            if (c9518.f28911 != 0) {
                                i2 = c9518.f28902;
                                if (i2 != 20) {
                                    if (i2 != 30) {
                                        switch (i2) {
                                            case 5:
                                            case 6:
                                                iM11983 = C5893.m16511(byteBuffer);
                                                break;
                                            case 7:
                                            case 8:
                                                if (byteBuffer.getInt(0) == -233094848) {
                                                    i3 = 1024;
                                                } else {
                                                    i3 = 1024;
                                                }
                                                break;
                                            case 9:
                                                int iPosition9 = byteBuffer.position();
                                                String str5 = C3603.f11424;
                                                iReverseBytes = byteBuffer.getInt(iPosition9);
                                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                    iReverseBytes = Integer.reverseBytes(iReverseBytes);
                                                }
                                                if ((iReverseBytes & (-2097152)) == -2097152) {
                                                    i3 = -1;
                                                } else {
                                                    i3 = -1;
                                                }
                                                if (i3 == -1) {
                                                    throw new IllegalArgumentException();
                                                }
                                                break;
                                            case 10:
                                                i3 = 1024;
                                                break;
                                            case 11:
                                            case 12:
                                                i3 = 2048;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 14:
                                                        iPosition = byteBuffer.position();
                                                        iLimit = byteBuffer.limit() - 10;
                                                        i8 = iPosition;
                                                        while (true) {
                                                            if (i8 <= iLimit) {
                                                                String str6 = C3603.f11424;
                                                                iReverseBytes2 = byteBuffer.getInt(i8 + 4);
                                                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                                    iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                                                }
                                                                if ((iReverseBytes2 & (-2)) == -126718022) {
                                                                    i9 = i8 - iPosition;
                                                                } else {
                                                                    i8++;
                                                                }
                                                            } else {
                                                                i9 = -1;
                                                            }
                                                        }
                                                        if (i9 == -1) {
                                                            if ((byteBuffer.get(byteBuffer.position() + i9 + 7) & 255) == 187) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            int iPosition10 = byteBuffer.position() + i9;
                                                            if (z2) {
                                                                i10 = 9;
                                                            } else {
                                                                i10 = 8;
                                                            }
                                                            iM11983 = (40 << ((byteBuffer.get(iPosition10 + i10) >> 4) & 7)) * 16;
                                                        } else {
                                                            i3 = 0;
                                                        }
                                                        break;
                                                    case 15:
                                                        i3 = 512;
                                                        break;
                                                    case 16:
                                                        i3 = 1024;
                                                        break;
                                                    case 17:
                                                        byte[] bArr3 = new byte[16];
                                                        int iPosition11 = byteBuffer.position();
                                                        byteBuffer.get(bArr3);
                                                        byteBuffer.position(iPosition11);
                                                        i3 = C13653.m32806(new C16302(bArr3, 16)).f73696;
                                                        break;
                                                    case 18:
                                                        iM11983 = C5893.m16511(byteBuffer);
                                                        break;
                                                    default:
                                                        throw new IllegalStateException(C19370.m44628(i2, "Unexpected audio encoding: "));
                                                }
                                                break;
                                        }
                                    } else if (byteBuffer.getInt(0) == -233094848) {
                                        i3 = 1024;
                                    } else {
                                        i3 = 1024;
                                    }
                                    this.f24999 = i3;
                                } else {
                                    iM11983 = C3939.m11983(byteBuffer);
                                }
                                i3 = iM11983;
                                this.f24999 = i3;
                            }
                            if (this.f25020 == null) {
                                long j11 = this.f25013;
                                c9519 = this.f24993;
                                if (c9519.f28911 == 0) {
                                    j2 = this.f25004 / ((long) c9519.f28906);
                                } else {
                                    j2 = this.f25047;
                                }
                                jM11013 = C3603.m11013(c9519.f28909.f25624, j2 - this.f25025.m25670()) + j11;
                                if (!this.f25051) {
                                    interfaceC21574 = this.f24996;
                                    if (interfaceC21574 != null) {
                                        StringBuilder sbM311010 = C12803.m31106("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM11013);
                                        sbM311010.append(j);
                                        interfaceC21574.mo46349(new C22278(sbM311010.toString()));
                                    }
                                    this.f25051 = true;
                                }
                                if (this.f25051) {
                                    if (m21547()) {
                                        long j12 = j - jM11013;
                                        this.f25013 += j12;
                                        this.f25051 = false;
                                        m21542(j);
                                        interfaceC21573 = this.f24996;
                                        if (interfaceC21573 != null) {
                                            interfaceC21573.mo46356();
                                        }
                                    }
                                }
                                if (this.f24993.f28911 == 0) {
                                    this.f25004 += (long) byteBuffer.remaining();
                                } else {
                                    this.f25047 = (((long) this.f24999) * ((long) i)) + this.f25047;
                                }
                                this.f25007 = byteBuffer;
                                this.f25022 = i;
                                m21557(j);
                                if (!this.f25007.hasRemaining()) {
                                    this.f25007 = null;
                                    this.f25022 = 0;
                                    return true;
                                }
                                if (c10284.m26041(m21548())) {
                                    C19956.m46037("Resetting stalled audio track");
                                    flush();
                                    return true;
                                }
                            } else if (m21547()) {
                                m21542(j);
                                this.f25020 = null;
                                long j13 = this.f25013;
                                c9519 = this.f24993;
                                if (c9519.f28911 == 0) {
                                    j2 = this.f25004 / ((long) c9519.f28906);
                                } else {
                                    j2 = this.f25047;
                                }
                                jM11013 = C3603.m11013(c9519.f28909.f25624, j2 - this.f25025.m25670()) + j13;
                                if (!this.f25051) {
                                    interfaceC21574 = this.f24996;
                                    if (interfaceC21574 != null) {
                                        StringBuilder sbM311011 = C12803.m31106("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM11013);
                                        sbM311011.append(j);
                                        interfaceC21574.mo46349(new C22278(sbM311011.toString()));
                                    }
                                    this.f25051 = true;
                                }
                                if (this.f25051) {
                                    if (m21547()) {
                                        long j14 = j - jM11013;
                                        this.f25013 += j14;
                                        this.f25051 = false;
                                        m21542(j);
                                        interfaceC21573 = this.f24996;
                                        if (interfaceC21573 != null) {
                                            interfaceC21573.mo46356();
                                        }
                                    }
                                }
                                if (this.f24993.f28911 == 0) {
                                    this.f25004 += (long) byteBuffer.remaining();
                                } else {
                                    this.f25047 = (((long) this.f24999) * ((long) i)) + this.f25047;
                                }
                                this.f25007 = byteBuffer;
                                this.f25022 = i;
                                m21557(j);
                                if (!this.f25007.hasRemaining()) {
                                    this.f25007 = null;
                                    this.f25022 = 0;
                                    return true;
                                }
                                if (c10284.m26041(m21548())) {
                                    C19956.m46037("Resetting stalled audio track");
                                    flush();
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    m21557(j);
                    if (!this.f25007.hasRemaining()) {
                        this.f25007 = null;
                        this.f25022 = 0;
                        return true;
                    }
                    if (c10284.m26041(m21548())) {
                        C19956.m46037("Resetting stalled audio track");
                        flush();
                        return true;
                    }
                }
            } else if (m21560()) {
                c18690.m43308();
                if (this.f25033) {
                    this.f25013 = Math.max(0L, j);
                    this.f25051 = false;
                    this.f25033 = false;
                    if (m21551()) {
                        m21539();
                    }
                    m21542(j);
                    if (this.f25002) {
                        mo13602();
                    }
                }
                if (c10284.m26044(m21548())) {
                    if (this.f25007 != null) {
                        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C22632.m50631(z);
                        if (byteBuffer.hasRemaining()) {
                            c9518 = this.f24993;
                            if (c9518.f28911 != 0) {
                                i2 = c9518.f28902;
                                if (i2 != 20) {
                                    if (i2 != 30) {
                                        switch (i2) {
                                            case 5:
                                            case 6:
                                                iM11983 = C5893.m16511(byteBuffer);
                                                break;
                                            case 7:
                                            case 8:
                                                if (byteBuffer.getInt(0) == -233094848) {
                                                    i3 = 1024;
                                                } else {
                                                    i3 = 1024;
                                                }
                                                break;
                                            case 9:
                                                int iPosition12 = byteBuffer.position();
                                                String str7 = C3603.f11424;
                                                iReverseBytes = byteBuffer.getInt(iPosition12);
                                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                    iReverseBytes = Integer.reverseBytes(iReverseBytes);
                                                }
                                                if ((iReverseBytes & (-2097152)) == -2097152) {
                                                    i3 = -1;
                                                } else {
                                                    i3 = -1;
                                                }
                                                if (i3 == -1) {
                                                    throw new IllegalArgumentException();
                                                }
                                                break;
                                            case 10:
                                                i3 = 1024;
                                                break;
                                            case 11:
                                            case 12:
                                                i3 = 2048;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 14:
                                                        iPosition = byteBuffer.position();
                                                        iLimit = byteBuffer.limit() - 10;
                                                        i8 = iPosition;
                                                        while (true) {
                                                            if (i8 <= iLimit) {
                                                                String str8 = C3603.f11424;
                                                                iReverseBytes2 = byteBuffer.getInt(i8 + 4);
                                                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                                    iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                                                }
                                                                if ((iReverseBytes2 & (-2)) == -126718022) {
                                                                    i9 = i8 - iPosition;
                                                                } else {
                                                                    i8++;
                                                                }
                                                            } else {
                                                                i9 = -1;
                                                            }
                                                        }
                                                        if (i9 == -1) {
                                                            if ((byteBuffer.get(byteBuffer.position() + i9 + 7) & 255) == 187) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            int iPosition13 = byteBuffer.position() + i9;
                                                            if (z2) {
                                                                i10 = 9;
                                                            } else {
                                                                i10 = 8;
                                                            }
                                                            iM11983 = (40 << ((byteBuffer.get(iPosition13 + i10) >> 4) & 7)) * 16;
                                                        } else {
                                                            i3 = 0;
                                                        }
                                                        break;
                                                    case 15:
                                                        i3 = 512;
                                                        break;
                                                    case 16:
                                                        i3 = 1024;
                                                        break;
                                                    case 17:
                                                        byte[] bArr4 = new byte[16];
                                                        int iPosition14 = byteBuffer.position();
                                                        byteBuffer.get(bArr4);
                                                        byteBuffer.position(iPosition14);
                                                        i3 = C13653.m32806(new C16302(bArr4, 16)).f73696;
                                                        break;
                                                    case 18:
                                                        iM11983 = C5893.m16511(byteBuffer);
                                                        break;
                                                    default:
                                                        throw new IllegalStateException(C19370.m44628(i2, "Unexpected audio encoding: "));
                                                }
                                                break;
                                        }
                                    } else if (byteBuffer.getInt(0) == -233094848) {
                                        i3 = 1024;
                                    } else {
                                        i3 = 1024;
                                    }
                                    this.f24999 = i3;
                                } else {
                                    iM11983 = C3939.m11983(byteBuffer);
                                }
                                i3 = iM11983;
                                this.f24999 = i3;
                            }
                            if (this.f25020 == null) {
                                long j15 = this.f25013;
                                c9519 = this.f24993;
                                if (c9519.f28911 == 0) {
                                    j2 = this.f25004 / ((long) c9519.f28906);
                                } else {
                                    j2 = this.f25047;
                                }
                                jM11013 = C3603.m11013(c9519.f28909.f25624, j2 - this.f25025.m25670()) + j15;
                                if (!this.f25051) {
                                    interfaceC21574 = this.f24996;
                                    if (interfaceC21574 != null) {
                                        StringBuilder sbM311012 = C12803.m31106("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM11013);
                                        sbM311012.append(j);
                                        interfaceC21574.mo46349(new C22278(sbM311012.toString()));
                                    }
                                    this.f25051 = true;
                                }
                                if (this.f25051) {
                                    if (m21547()) {
                                        long j16 = j - jM11013;
                                        this.f25013 += j16;
                                        this.f25051 = false;
                                        m21542(j);
                                        interfaceC21573 = this.f24996;
                                        if (interfaceC21573 != null) {
                                            interfaceC21573.mo46356();
                                        }
                                    }
                                }
                                if (this.f24993.f28911 == 0) {
                                    this.f25004 += (long) byteBuffer.remaining();
                                } else {
                                    this.f25047 = (((long) this.f24999) * ((long) i)) + this.f25047;
                                }
                                this.f25007 = byteBuffer;
                                this.f25022 = i;
                                m21557(j);
                                if (!this.f25007.hasRemaining()) {
                                    this.f25007 = null;
                                    this.f25022 = 0;
                                    return true;
                                }
                                if (c10284.m26041(m21548())) {
                                    C19956.m46037("Resetting stalled audio track");
                                    flush();
                                    return true;
                                }
                            } else if (m21547()) {
                                m21542(j);
                                this.f25020 = null;
                                long j17 = this.f25013;
                                c9519 = this.f24993;
                                if (c9519.f28911 == 0) {
                                    j2 = this.f25004 / ((long) c9519.f28906);
                                } else {
                                    j2 = this.f25047;
                                }
                                jM11013 = C3603.m11013(c9519.f28909.f25624, j2 - this.f25025.m25670()) + j17;
                                if (!this.f25051) {
                                    interfaceC21574 = this.f24996;
                                    if (interfaceC21574 != null) {
                                        StringBuilder sbM311013 = C12803.m31106("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM11013);
                                        sbM311013.append(j);
                                        interfaceC21574.mo46349(new C22278(sbM311013.toString()));
                                    }
                                    this.f25051 = true;
                                }
                                if (this.f25051) {
                                    if (m21547()) {
                                        long j18 = j - jM11013;
                                        this.f25013 += j18;
                                        this.f25051 = false;
                                        m21542(j);
                                        interfaceC21573 = this.f24996;
                                        if (interfaceC21573 != null) {
                                            interfaceC21573.mo46356();
                                        }
                                    }
                                }
                                if (this.f24993.f28911 == 0) {
                                    this.f25004 += (long) byteBuffer.remaining();
                                } else {
                                    this.f25047 = (((long) this.f24999) * ((long) i)) + this.f25047;
                                }
                                this.f25007 = byteBuffer;
                                this.f25022 = i;
                                m21557(j);
                                if (!this.f25007.hasRemaining()) {
                                    this.f25007 = null;
                                    this.f25022 = 0;
                                    return true;
                                }
                                if (c10284.m26041(m21548())) {
                                    C19956.m46037("Resetting stalled audio track");
                                    flush();
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    m21557(j);
                    if (!this.f25007.hasRemaining()) {
                        this.f25007 = null;
                        this.f25022 = 0;
                        return true;
                    }
                    if (c10284.m26041(m21548())) {
                        C19956.m46037("Resetting stalled audio track");
                        flush();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AudioTrack m21541(C9518 c9518) throws C15221 {
        int i;
        Context context;
        Context context2;
        try {
            int i2 = this.f25048;
            int i3 = this.f25032;
            if (i3 == -1 || (context2 = this.f25012) == null || Build.VERSION.SDK_INT < 34) {
                i = i2;
                context = null;
            } else {
                if (this.f25050 == null) {
                    this.f25050 = context2.createDeviceContext(i3);
                }
                context = this.f25050;
                i = 0;
            }
            return m21540(c9518.m24389(), this.f25036, i, c9518.f28909, context);
        } catch (C15221 e) {
            InterfaceC21573 interfaceC21573 = this.f24996;
            if (interfaceC21573 != null) {
                interfaceC21573.mo46349(e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AudioTrack m21540(C1111 c1111, C18231 c18231, int i, C8353 c8353, Context context) throws C15221 {
        try {
            AudioTrack audioTrackM48680 = this.f24997.m48680(c1111, c18231, i, context);
            int state = audioTrackM48680.getState();
            if (state == 1) {
                return audioTrackM48680;
            }
            try {
                audioTrackM48680.release();
            } catch (Exception unused) {
            }
            throw new C15221(state, c1111.f4057, c1111.f4054, c1111.f4056, c1111.f4053, c8353, c1111.f4058, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new C15221(0, c1111.f4057, c1111.f4054, c1111.f4056, c1111.f4053, c8353, c1111.f4058, e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m21557(long j) throws C20162 {
        m21553(j);
        if (this.f25010 != null) {
            return;
        }
        if (!this.f25056.m10977()) {
            ByteBuffer byteBuffer = this.f25007;
            if (byteBuffer != null) {
                m21544(byteBuffer);
                m21553(j);
                return;
            }
            return;
        }
        while (!this.f25056.m10975()) {
            do {
                ByteBuffer byteBufferM10973 = this.f25056.m10973();
                if (byteBufferM10973.hasRemaining()) {
                    m21544(byteBufferM10973);
                    m21553(j);
                } else {
                    ByteBuffer byteBuffer2 = this.f25007;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f25056.m10972(this.f25007);
                    }
                }
            } while (this.f25010 == null);
            return;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m21547() throws C20162 {
        if (!this.f25056.m10977()) {
            m21553(Long.MIN_VALUE);
            return this.f25010 == null;
        }
        this.f25056.m10976();
        m21557(Long.MIN_VALUE);
        if (!this.f25056.m10975()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f25010;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:47:0x0140  */
    /* JADX WARN: Code duplicated, block: B:49:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0148  */
    /* JADX WARN: Code duplicated, block: B:54:0x014c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0150  */
    /* JADX WARN: Code duplicated, block: B:58:0x0154  */
    /* JADX WARN: Code duplicated, block: B:60:0x0158  */
    /* JADX WARN: Code duplicated, block: B:63:0x0176  */
    /* JADX WARN: Code duplicated, block: B:64:0x0189  */
    /* JADX WARN: Code duplicated, block: B:65:0x0196  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01da  */
    /* JADX WARN: Code duplicated, block: B:81:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0057 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21544(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        float f;
        C22632.m50634(this.f25010 == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f24993.f28911 != 0) {
                byteBufferOrder = byteBuffer;
            } else {
                int iM11017 = (int) C3603.m11017(C3603.m11014(20L), this.f24993.f28903, 1000000L, RoundingMode.UP);
                long jM21548 = m21548();
                long j = iM11017;
                if (jM21548 >= j) {
                    byteBufferOrder = byteBuffer;
                } else {
                    C9518 c9518 = this.f24993;
                    int i5 = c9518.f28902;
                    int i6 = c9518.f28904;
                    int i7 = (int) jM21548;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i7 < iM11017) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i5 == 4) {
                                float fM10997 = C3603.m10997(byteBuffer.getFloat(), -1.0f, 1.0f);
                                if (fM10997 < 0.0f) {
                                    fM10997 = -fM10997;
                                    f = -2.14748365E9f;
                                } else {
                                    f = 2.14748365E9f;
                                }
                                i3 = (int) (fM10997 * f);
                            } else if (i5 != 21) {
                                if (i5 == 22) {
                                    i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b = byteBuffer.get();
                                } else if (i5 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i5 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i5 == 1610612736) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                } else {
                                    throw new IllegalStateException();
                                }
                                i3 = i | i2;
                            } else {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            i4 = (int) ((((long) i3) * ((long) i7)) / j);
                            if (i5 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 4) {
                                if (i5 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i5 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else if (i5 == 1610612736) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.14748365E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.14748365E9f);
                            }
                            if (byteBuffer.position() == iPosition + i6) {
                                i7++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i7)) / j);
                        if (i5 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 4) {
                            if (i5 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i5 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else if (i5 == 1610612736) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            } else {
                                throw new IllegalStateException();
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.14748365E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.14748365E9f);
                        }
                        if (byteBuffer.position() == iPosition + i6) {
                            i7++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            }
            this.f25010 = byteBufferOrder;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m21553(long j) throws C20162 {
        int iWrite;
        InterfaceC21573 interfaceC21573;
        if (this.f25010 == null) {
            return;
        }
        C18690 c18690 = this.f25023;
        if (c18690.m43310()) {
            return;
        }
        int iRemaining = this.f25010.remaining();
        boolean z = false;
        if (this.f25019) {
            C22632.m50634(j != -9223372036854775807L);
            if (j == Long.MIN_VALUE) {
                j = this.f25011;
            } else {
                this.f25011 = j;
            }
            AudioTrack audioTrack = this.f25016;
            ByteBuffer byteBuffer = this.f25010;
            if (Build.VERSION.SDK_INT >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining, 1, 1000 * j);
            } else {
                if (this.f25042 == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.f25042 = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.f25042.putInt(1431633921);
                }
                if (this.f24991 == 0) {
                    this.f25042.putInt(4, iRemaining);
                    this.f25042.putLong(8, j * 1000);
                    this.f25042.position(0);
                    this.f24991 = iRemaining;
                }
                int iRemaining2 = this.f25042.remaining();
                if (iRemaining2 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                    if (iWrite < 0) {
                        this.f24991 = 0;
                    } else {
                        this.f24991 -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.f25042, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.f24991 = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining2) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                        if (iWrite < 0) {
                            this.f24991 = 0;
                        } else {
                            this.f24991 -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = this.f25016.write(this.f25010, iRemaining, 1);
        }
        this.f25028 = SystemClock.elapsedRealtime();
        if (iWrite >= 0) {
            c18690.m43308();
            if (m21546(this.f25016)) {
                if (this.f25055 > 0) {
                    this.f25054 = false;
                }
                if (this.f25002 && (interfaceC21573 = this.f24996) != null && iWrite < iRemaining && !this.f25054) {
                    interfaceC21573.mo46352();
                }
            }
            int i = this.f24993.f28911;
            if (i == 0) {
                this.f25029 += (long) iWrite;
            }
            if (iWrite == iRemaining) {
                if (i != 0) {
                    C22632.m50634(this.f25010 == this.f25007);
                    this.f25055 = (((long) this.f24999) * ((long) this.f25022)) + this.f25055;
                }
                this.f25010 = null;
                return;
            }
            return;
        }
        if ((Build.VERSION.SDK_INT >= 24 && iWrite == -6) || iWrite == -32) {
            if (m21548() > 0) {
                z = true;
            } else if (m21546(this.f25016)) {
                if (this.f24993.f28911 == 1) {
                    this.f25041 = true;
                }
                z = true;
            }
        }
        C20162 c20162 = new C20162(iWrite, this.f24993.f28909, z);
        InterfaceC21573 interfaceC21574 = this.f24996;
        if (interfaceC21574 != null) {
            interfaceC21574.mo46349(c20162);
        }
        if (c20162.f65280 && this.f25012 != null) {
            C18045 c18045 = C18045.f56239;
            this.f25040 = c18045;
            this.f25038.m47691(c18045);
            throw c20162;
        }
        c18690.m43309(c20162);
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ۜ */
    public final void mo13596() {
        if (!this.f25026 && m21561() && m21547()) {
            m21549();
            this.f25026 = true;
        }
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo13599() {
        if (m21561()) {
            return this.f25026 && !mo13593();
        }
        return true;
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13593() {
        if (m21561()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.f25016.isOffloadedPlayback() && this.f25024) && this.f25034.m26038(m21548());
        }
        return false;
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ֫ */
    public final void mo13585(C2730 c2730) {
        this.f25035 = new C2730(C3603.m10997(c2730.f8510, 0.1f, 8.0f), C3603.m10997(c2730.f8508, 0.1f, 8.0f));
        if (m21551()) {
            m21539();
            return;
        }
        C15866 c15866 = new C15866(c2730, -9223372036854775807L, -9223372036854775807L);
        if (m21561()) {
            this.f25020 = c15866;
        } else {
            this.f25021 = c15866;
        }
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ܽ */
    public final C2730 mo13601() {
        return this.f25035;
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ֫ */
    public final void mo13592(boolean z) {
        this.f25006 = z;
        C15866 c15866 = new C15866(m21551() ? C2730.f8507 : this.f25035, -9223372036854775807L, -9223372036854775807L);
        if (m21561()) {
            this.f25020 = c15866;
        } else {
            this.f25021 = c15866;
        }
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ֫ */
    public final void mo13590(C18231 c18231) {
        if (this.f25036.equals(c18231)) {
            return;
        }
        this.f25036 = c18231;
        if (this.f25019) {
            return;
        }
        C20868 c20868 = this.f25038;
        if (c20868 != null) {
            c20868.m47692(c18231);
        }
        flush();
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ֫ */
    public final void mo13583(int i) {
        if (this.f25049) {
            if (this.f25048 != i) {
                return;
            } else {
                this.f25049 = false;
            }
        }
        if (this.f25048 != i) {
            this.f25048 = i;
            this.f25003 = i != 0;
            flush();
        }
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ֫ */
    public final void mo13589(C17525 c17525) {
        if (this.f25001.equals(c17525)) {
            return;
        }
        c17525.getClass();
        if (this.f25016 != null) {
            this.f25001.getClass();
        }
        this.f25001 = c17525;
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ֫ */
    public final void mo13584(AudioDeviceInfo audioDeviceInfo) {
        this.f25045 = audioDeviceInfo == null ? null : new C9579(audioDeviceInfo);
        C20868 c20868 = this.f25038;
        if (c20868 != null) {
            c20868.m47690(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f25016;
        if (audioTrack != null) {
            C17984.m42024(audioTrack, this.f25045);
        }
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ᩳ */
    public final long mo13603() {
        long j;
        if (!m21561()) {
            return -9223372036854775807L;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return C17984.m42023(this.f25016, this.f24993);
        }
        C9518 c9518 = this.f24993;
        if (c9518.f28911 == 0) {
            j = ((long) c9518.f28903) * ((long) c9518.f28904);
        } else {
            int iM50530 = C22535.m50530(c9518.f28902);
            C22632.m50634(iM50530 != -2147483647);
            j = iM50530;
        }
        return C3603.m11017(this.f24993.f28905, 1000000L, j, RoundingMode.DOWN);
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ۢ */
    public final void mo13597() {
        C22632.m50634(this.f25003);
        if (this.f25019) {
            return;
        }
        this.f25019 = true;
        flush();
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ܳ */
    public final void mo13600() {
        if (this.f25019) {
            this.f25019 = false;
            flush();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21566(int i) {
        C22632.m50634(Build.VERSION.SDK_INT >= 29);
        this.f25039 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21563(int i, int i2) {
        C9518 c9518;
        AudioTrack audioTrack = this.f25016;
        if (audioTrack == null || !m21546(audioTrack) || (c9518 = this.f24993) == null || !c9518.f28910) {
            return;
        }
        this.f25016.setOffloadDelayPadding(i, i2);
    }

    @Override // l.InterfaceC4639
    /* JADX INFO: renamed from: ֫ */
    public final void mo13582(float f) {
        if (this.f25008 != f) {
            this.f25008 = f;
            if (m21561()) {
                this.f25016.setVolume(this.f25008);
            }
        }
    }

    @Override // l.InterfaceC4639
    public final void pause() {
        this.f25002 = false;
        if (m21561()) {
            this.f25034.m26043();
            if (!this.f25053 || m21546(this.f25016)) {
                this.f25016.pause();
            }
        }
    }

    @Override // l.InterfaceC4639
    public final void flush() {
        C3873 c3873;
        if (m21561()) {
            this.f25004 = 0L;
            this.f25047 = 0L;
            this.f25029 = 0L;
            this.f25055 = 0L;
            this.f25054 = false;
            this.f24999 = 0;
            this.f25021 = new C15866(this.f25035, 0L, 0L);
            this.f25013 = 0L;
            this.f25020 = null;
            this.f25037.clear();
            this.f25007 = null;
            this.f25022 = 0;
            this.f25010 = null;
            this.f25053 = false;
            this.f25026 = false;
            this.f25024 = false;
            this.f25042 = null;
            this.f24991 = 0;
            this.f25025.m25669();
            C3582 c3582 = this.f24993.f28901;
            this.f25056 = c3582;
            c3582.m10971();
            if (this.f25034.m26040()) {
                this.f25016.pause();
            }
            if (m21546(this.f25016)) {
                C1050 c1050 = this.f25031;
                c1050.getClass();
                c1050.m3619(this.f25016);
            }
            final C1111 c1111M24389 = this.f24993.m24389();
            C9518 c9518 = this.f25017;
            if (c9518 != null) {
                this.f24993 = c9518;
                this.f25017 = null;
            }
            this.f25034.m26042();
            if (Build.VERSION.SDK_INT >= 24 && (c3873 = this.f25057) != null) {
                c3873.m11696();
                this.f25057 = null;
            }
            final AudioTrack audioTrack = this.f25016;
            final InterfaceC21573 interfaceC21573 = this.f24996;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f24990) {
                if (f24988 == null) {
                    String str = C3603.f11424;
                    f24988 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC2192());
                }
                f24989++;
                f24988.schedule(new Runnable() { // from class: l.ܽۤ֫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8106.m21543(audioTrack, interfaceC21573, handler, c1111M24389);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            }
            this.f25016 = null;
        }
        this.f25023.m43308();
        this.f25018.m43308();
        this.f24994 = 0L;
        this.f24995 = 0L;
        Handler handler2 = this.f24992;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // l.InterfaceC4639
    public final void reset() {
        flush();
        AbstractC4628 abstractC4628ListIterator = this.f25044.listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            ((InterfaceC0053) abstractC4628ListIterator.next()).reset();
        }
        this.f25027.reset();
        this.f25000.reset();
        C3582 c3582 = this.f25056;
        if (c3582 != null) {
            c3582.m10974();
        }
        this.f25002 = false;
        this.f25041 = false;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m21565() {
        C20868 c20868 = this.f25038;
        if (c20868 != null) {
            c20868.m47693();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21564(C18045 c18045) {
        Looper looperMyLooper = Looper.myLooper();
        boolean z = this.f25015 == looperMyLooper;
        StringBuilder sb = new StringBuilder("Current looper (");
        sb.append(looperMyLooper == null ? "null" : looperMyLooper.getThread().getName());
        sb.append(") is not the playback looper (");
        Looper looper = this.f25015;
        sb.append(looper != null ? looper.getThread().getName() : "null");
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        C22632.m50633(sb.toString(), z);
        C18045 c18046 = this.f25040;
        if (c18046 == null || c18045.equals(c18046)) {
            return;
        }
        this.f25040 = c18045;
        InterfaceC21573 interfaceC21573 = this.f24996;
        if (interfaceC21573 != null) {
            interfaceC21573.mo46354();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m21539() {
        if (m21561()) {
            try {
                this.f25016.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f25035.f8510).setPitch(this.f25035.f8508).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                C19956.m46036("Failed to set playback params", e);
            }
            C2730 c2730 = new C2730(this.f25016.getPlaybackParams().getSpeed(), this.f25016.getPlaybackParams().getPitch());
            this.f25035 = c2730;
            this.f25034.m26033(c2730.f8510);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21542(long j) {
        C2730 c2730;
        boolean z;
        boolean zM21551 = m21551();
        boolean z2 = this.f25052;
        InterfaceC4993 interfaceC4993 = this.f25009;
        if (zM21551) {
            c2730 = C2730.f8507;
        } else {
            if (this.f25019) {
                c2730 = C2730.f8507;
            } else {
                C9518 c9518 = this.f24993;
                if (c9518.f28911 == 0) {
                    int i = c9518.f28909.f25605;
                    if (z2) {
                        String str = C3603.f11424;
                        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
                            c2730 = C2730.f8507;
                        }
                    }
                    c2730 = this.f25035;
                    ((C8812) interfaceC4993).m22771(c2730);
                } else {
                    c2730 = C2730.f8507;
                }
            }
            this.f25035 = c2730;
        }
        C2730 c2731 = c2730;
        if (this.f25019) {
            z = false;
        } else {
            C9518 c9519 = this.f24993;
            if (c9519.f28911 == 0) {
                int i2 = c9519.f28909.f25605;
                if (z2) {
                    String str2 = C3603.f11424;
                    if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4) {
                        z = false;
                    }
                }
                z = this.f25006;
                ((C8812) interfaceC4993).m22772(z);
            } else {
                z = false;
            }
        }
        this.f25006 = z;
        long jMax = Math.max(0L, j);
        C9518 c95110 = this.f24993;
        this.f25037.add(new C15866(c2731, jMax, C3603.m11013(c95110.f28903, m21548())));
        C3582 c3582 = this.f24993.f28901;
        this.f25056 = c3582;
        c3582.m10971();
        InterfaceC21573 interfaceC21573 = this.f24996;
        if (interfaceC21573 != null) {
            interfaceC21573.mo46351(this.f25006);
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private boolean m21551() {
        C9518 c9518 = this.f24993;
        return c9518 != null && c9518.f28908 && Build.VERSION.SDK_INT >= 23;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private boolean m21561() {
        return this.f25016 != null;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static long m21562(C8106 c8106) {
        C9518 c9518 = c8106.f24993;
        if (c9518.f28911 == 0) {
            return c8106.f25004 / ((long) c9518.f28906);
        }
        return c8106.f25047;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long m21548() {
        C9518 c9518 = this.f24993;
        if (c9518.f28911 == 0) {
            long j = this.f25029;
            long j2 = c9518.f28904;
            String str = C3603.f11424;
            return ((j + j2) - 1) / j2;
        }
        return this.f25055;
    }

    @EnsuresNonNull({"audioCapabilities"})
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m21538() {
        Context context;
        Looper looperMyLooper = Looper.myLooper();
        boolean z = this.f25038 == null || this.f25015 == looperMyLooper;
        StringBuilder sb = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f25015;
        sb.append(looper == null ? "null" : looper.getThread().getName());
        sb.append(" and ");
        sb.append(looperMyLooper != null ? looperMyLooper.getThread().getName() : "null");
        C22632.m50633(sb.toString(), z);
        if (this.f25038 == null && (context = this.f25012) != null) {
            this.f25015 = looperMyLooper;
            C20868 c20868 = new C20868(context, new H5PayActivity$$ExternalSyntheticLambda0(this), this.f25036, this.f25045);
            this.f25038 = c20868;
            this.f25040 = c20868.m47689();
        }
        this.f25040.getClass();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21546(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m21549() {
        if (this.f25053) {
            return;
        }
        this.f25053 = true;
        this.f25034.m26034(m21548());
        if (m21546(this.f25016)) {
            this.f25024 = false;
        }
        this.f25016.stop();
        this.f24991 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21543(AudioTrack audioTrack, InterfaceC21573 interfaceC21573, Handler handler, C1111 c1111) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (interfaceC21573 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC14897(1, interfaceC21573, c1111));
            }
            synchronized (f24990) {
                int i = f24989 - 1;
                f24989 = i;
                if (i == 0) {
                    f24988.shutdown();
                    f24988 = null;
                }
            }
        } catch (Throwable th) {
            if (interfaceC21573 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC14897(1, interfaceC21573, c1111));
            }
            synchronized (f24990) {
                int i2 = f24989 - 1;
                f24989 = i2;
                if (i2 == 0) {
                    f24988.shutdown();
                    f24988 = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean m21555() {
        boolean z;
        synchronized (f24990) {
            z = f24989 > 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21545(C8106 c8106) {
        if (c8106.f24995 >= 300000) {
            c8106.f24996.mo46345();
            c8106.f24995 = 0L;
        }
    }
}
