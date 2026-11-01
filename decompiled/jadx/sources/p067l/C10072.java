package p067l;

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
public final class C10072 implements InterfaceC6777 {

    /* JADX INFO: renamed from: ֫ۧ */
    public static ScheduledExecutorService f27897;

    /* JADX INFO: renamed from: ۟֫ */
    public static int f27898;

    /* JADX INFO: renamed from: ۧۧ */
    public static final Object f27899 = new Object();

    /* JADX INFO: renamed from: ֡ */
    public int f27900;

    /* JADX INFO: renamed from: ֡֫ */
    public Handler f27901;

    /* JADX INFO: renamed from: ֨ */
    public C11414 f27902;

    /* JADX INFO: renamed from: ֨֫ */
    public long f27903;

    /* JADX INFO: renamed from: ֫ */
    public long f27904;

    /* JADX INFO: renamed from: ֫֫ */
    public InterfaceC22871 f27905;

    /* JADX INFO: renamed from: ۖ */
    public final C22813 f27906;

    /* JADX INFO: renamed from: ۖ֫ */
    public C15512 f27907;

    /* JADX INFO: renamed from: ۗ */
    public int f27908;

    /* JADX INFO: renamed from: ۗ֫ */
    public final C14095 f27909;

    /* JADX INFO: renamed from: ۘ */
    public C19024 f27910;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f27911;

    /* JADX INFO: renamed from: ۙ */
    public boolean f27912;

    /* JADX INFO: renamed from: ۙ֫ */
    public long f27913;

    /* JADX INFO: renamed from: ۚ */
    public final C8118 f27914;

    /* JADX INFO: renamed from: ۚ֫ */
    public boolean f27915;

    /* JADX INFO: renamed from: ۛ */
    public ByteBuffer f27916;

    /* JADX INFO: renamed from: ۛ֫ */
    public float f27917;

    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC7113 f27918;

    /* JADX INFO: renamed from: ۜ֫ */
    public ByteBuffer f27919;

    /* JADX INFO: renamed from: ۟ */
    public long f27920;

    /* JADX INFO: renamed from: ۠ */
    public final Context f27921;

    /* JADX INFO: renamed from: ۠֫ */
    public long f27922;

    /* JADX INFO: renamed from: ۡ */
    public final C16776 f27923;

    /* JADX INFO: renamed from: ۡ֫ */
    public Looper f27924;

    /* JADX INFO: renamed from: ۢ */
    public AudioTrack f27925;

    /* JADX INFO: renamed from: ۢ֫ */
    public C11414 f27926;

    /* JADX INFO: renamed from: ۤ */
    public final C20131 f27927;

    /* JADX INFO: renamed from: ۤ֫ */
    public boolean f27928;

    /* JADX INFO: renamed from: ۧ */
    public C17447 f27929;

    /* JADX INFO: renamed from: ۧ֫ */
    public C17447 f27930;

    /* JADX INFO: renamed from: ۨ */
    public int f27931;

    /* JADX INFO: renamed from: ۨ֫ */
    public final C20131 f27932;

    /* JADX INFO: renamed from: ۫ */
    public boolean f27933;

    /* JADX INFO: renamed from: ۫֫ */
    public final C12084 f27934;

    /* JADX INFO: renamed from: ۬ */
    public boolean f27935;

    /* JADX INFO: renamed from: ۬֫ */
    public final C22537 f27936;

    /* JADX INFO: renamed from: ܰ */
    public long f27937;

    /* JADX INFO: renamed from: ܰ֫ */
    public long f27938;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC16106 f27939;

    /* JADX INFO: renamed from: ܳ֫ */
    public C3366 f27940;

    /* JADX INFO: renamed from: ܶ */
    public final int f27941;

    /* JADX INFO: renamed from: ܶ֫ */
    public boolean f27942;

    /* JADX INFO: renamed from: ܺ */
    public final C12142 f27943;

    /* JADX INFO: renamed from: ܺ֫ */
    public C4963 f27944;

    /* JADX INFO: renamed from: ܽ */
    public C19695 f27945;

    /* JADX INFO: renamed from: ܽ֫ */
    public final ArrayDeque f27946;

    /* JADX INFO: renamed from: ܿ */
    public C22201 f27947;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f27948;

    /* JADX INFO: renamed from: ᩳ */
    public C19518 f27949;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f27950;

    /* JADX INFO: renamed from: ᩴ */
    public ByteBuffer f27951;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final boolean f27952;

    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC16192 f27953;

    /* JADX INFO: renamed from: ᩵֫ */
    public C11472 f27954;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f27955;

    /* JADX INFO: renamed from: ᩶֫ */
    public long f27956;

    /* JADX INFO: renamed from: ᩷ */
    public int f27957;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f27958;

    /* JADX INFO: renamed from: ᩸ */
    public Context f27959;

    /* JADX INFO: renamed from: ᩸֫ */
    public boolean f27960;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f27961;

    /* JADX INFO: renamed from: ᩹֫ */
    public boolean f27962;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f27963;

    /* JADX INFO: renamed from: ᩺֫ */
    public long f27964;

    /* JADX INFO: renamed from: ᩻ */
    public C5772 f27965;

    /* JADX INFO: renamed from: ᩻֫ */
    public C6049 f27966;

    public C10072(C22143 c22143) {
        int deviceId;
        Context applicationContext = c22143.f70056.getApplicationContext();
        this.f27921 = applicationContext;
        this.f27945 = C19695.f59870;
        this.f27949 = applicationContext != null ? null : c22143.f70050;
        this.f27918 = c22143.f70053;
        this.f27961 = false;
        int i = Build.VERSION.SDK_INT;
        this.f27952 = false;
        this.f27948 = 0;
        this.f27923 = c22143.f70055;
        InterfaceC16106 interfaceC16106 = c22143.f70051;
        interfaceC16106.getClass();
        this.f27939 = interfaceC16106;
        this.f27943 = new C12142(new C20802(this));
        C8118 c8118 = new C8118();
        this.f27914 = c8118;
        C12084 c12084 = new C12084();
        this.f27934 = c12084;
        this.f27936 = new C22537();
        this.f27909 = new C14095();
        this.f27953 = AbstractC16192.m36874of((Object) c12084, (Object) c8118);
        this.f27917 = 1.0f;
        this.f27957 = 0;
        this.f27910 = new C19024();
        C4963 c4963 = C4963.f11302;
        this.f27930 = new C17447(c4963, 0L, 0L);
        this.f27944 = c4963;
        this.f27915 = false;
        this.f27946 = new ArrayDeque();
        this.f27927 = new C20131();
        this.f27932 = new C20131();
        this.f27906 = c22143.f70054;
        int i2 = -1;
        if (i >= 34 && (deviceId = c22143.f70056.getDeviceId()) != 0 && deviceId != -1) {
            i2 = deviceId;
        }
        this.f27941 = i2;
        this.f27955 = true;
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ֫ */
    public final void mo15466(InterfaceC22871 interfaceC22871) {
        this.f27905 = interfaceC22871;
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ֫ */
    public final void mo15462(C15512 c15512) {
        this.f27907 = c15512;
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ֫ */
    public final void mo15463(InterfaceC17980 interfaceC17980) {
        this.f27943.m28060(interfaceC17980);
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15470(C10307 c10307) {
        return mo15473(c10307) != 0;
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ۧ */
    public final int mo15473(C10307 c10307) {
        m23506();
        String str = c10307.f28528;
        int i = c10307.f28519;
        if ("audio/raw".equals(str)) {
            if (!C5792.m13010(i)) {
                C10050.m23419(i, "Invalid PCM encoding: ");
                return 0;
            }
            if (i != 2 && (!this.f27961 || i != 4)) {
                return 1;
            }
        } else if (this.f27949.m44353(this.f27945, c10307) == null) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17505 m23535(C10307 c10307) {
        if (this.f27950) {
            return C17505.f52339;
        }
        return this.f27939.mo29290(this.f27945, c10307);
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ᩻ */
    public final long mo15480() {
        ArrayDeque arrayDeque;
        long j;
        if (!m23529() || this.f27942) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f27943.m28061(), C5792.m12989(this.f27902.f31850, m23516()));
        while (true) {
            arrayDeque = this.f27946;
            if (arrayDeque.isEmpty() || jMin < ((C17447) arrayDeque.getFirst()).f52176) {
                break;
            }
            this.f27930 = (C17447) arrayDeque.remove();
        }
        C17447 c17447 = this.f27930;
        long j2 = jMin - c17447.f52176;
        long jM12991 = C5792.m12991(j2, c17447.f52179.f11305);
        boolean zIsEmpty = arrayDeque.isEmpty();
        InterfaceC7113 interfaceC7113 = this.f27918;
        if (zIsEmpty) {
            long jM24740 = ((C10743) interfaceC7113).m24740(j2);
            C17447 c17448 = this.f27930;
            j = c17448.f52178 + jM24740;
            c17448.f52177 = jM24740 - jM12991;
        } else {
            C17447 c17449 = this.f27930;
            j = c17449.f52178 + jM12991 + c17449.f52177;
        }
        long jM24744 = ((C10743) interfaceC7113).m24744();
        long jM12989 = C5792.m12989(this.f27902.f31850, jM24744) + j;
        long j3 = this.f27903;
        if (jM24744 > j3) {
            long jM129810 = C5792.m12989(this.f27902.f31850, jM24744 - j3);
            this.f27903 = jM24744;
            this.f27904 += jM129810;
            if (this.f27901 == null) {
                this.f27901 = new Handler(Looper.myLooper());
            }
            this.f27901.removeCallbacksAndMessages(null);
            this.f27901.postDelayed(new RunnableC9966(1, this), 100L);
        }
        return jM12989;
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ֫ */
    public final void mo15461(C10307 c10307, int[] iArr) throws C10130 {
        C5772 c5772;
        C17505 c17505M23535;
        int iIntValue;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int iM12976;
        int i7;
        int iM52872;
        m23506();
        String str = c10307.f28528;
        int i8 = c10307.f28538;
        int i9 = c10307.f28539;
        int i10 = c10307.f28519;
        boolean zEquals = "audio/raw".equals(str);
        boolean z3 = this.f27952;
        C22813 c22813 = this.f27906;
        if (zEquals) {
            C23877.m52957(C5792.m13010(i10));
            int iM13023 = C5792.m13023(i10) * i9;
            C4123 c4123 = new C4123();
            c4123.m18183((List) this.f27953);
            if (this.f27961 && (i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4)) {
                c4123.m18184(this.f27909);
            } else {
                c4123.m18184(this.f27936);
                c4123.m8330((Object[]) ((C10743) this.f27918).m24743());
            }
            c5772 = new C5772(c4123.m8329());
            if (c5772.equals(this.f27965)) {
                c5772 = this.f27965;
            }
            this.f27934.m27690(c10307.f28543, c10307.f28544);
            this.f27914.m18808(iArr);
            try {
                C19854 c19854M12946 = c5772.m12946(new C19854(i8, i9, i10));
                int i11 = c19854M12946.f60352;
                int i12 = c19854M12946.f60353;
                int i13 = c19854M12946.f60354;
                c22813.getClass();
                iIntValue = C5792.m13011(i11);
                int iM13024 = C5792.m13023(i12) * i11;
                i2 = iM13023;
                z = z3;
                i4 = iM13024;
                z2 = false;
                i5 = i13;
                i = i12;
                i3 = 0;
            } catch (C20525 e) {
                throw new C10130(e, c10307);
            }
        } else {
            c5772 = new C5772(AbstractC16192.m36872of());
            if (this.f27948 != 0) {
                c17505M23535 = m23535(c10307);
            } else {
                c17505M23535 = C17505.f52339;
            }
            if (this.f27948 != 0 && c17505M23535.f52340) {
                str.getClass();
                int iM26820 = C11669.m26820(str, c10307.f28533);
                c22813.getClass();
                iIntValue = C5792.m13011(i9);
                z2 = c17505M23535.f52341;
                i = iM26820;
                i2 = -1;
                i3 = 1;
                i4 = -1;
                z = true;
            } else {
                Pair pairM44353 = this.f27949.m44353(this.f27945, c10307);
                if (pairM44353 == null) {
                    throw new C10130("Unable to configure passthrough for: " + c10307, c10307);
                }
                int iIntValue2 = ((Integer) pairM44353.first).intValue();
                iIntValue = ((Integer) pairM44353.second).intValue();
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
            throw new C10130("Invalid output encoding (mode=" + i3 + ") for: " + c10307, c10307);
        }
        if (iIntValue == 0) {
            throw new C10130("Invalid output channel config (mode=" + i3 + ") for: " + c10307, c10307);
        }
        int i14 = c10307.f28541;
        if ("audio/vnd.dts.hd;profile=lbr".equals(str) && i14 == -1) {
            i14 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i5, iIntValue, i);
        C23877.m52960(minBufferSize != -2);
        int i15 = i4 != -1 ? i4 : 1;
        double d = z ? 8.0d : 1.0d;
        this.f27923.getClass();
        if (i3 != 0) {
            if (i3 == 1) {
                int iM52873 = C23786.m52872(i);
                C23877.m52960(iM52873 != -2147483647);
                iM12976 = C15129.m34548((((long) 50000000) * ((long) iM52873)) / 1000000);
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
                    iM52872 = C7754.m17907(i14, 8);
                } else {
                    iM52872 = C23786.m52872(i);
                    C23877.m52960(iM52872 != -2147483647);
                }
                iM12976 = C15129.m34548((((long) i7) * ((long) iM52872)) / 1000000);
            }
            i6 = i;
        } else {
            z = z;
            z2 = z2;
            int i16 = i;
            long j = i5;
            i6 = i16;
            long j2 = i15;
            iM12976 = C5792.m12976(minBufferSize * 4, C15129.m34548(((((long) 250000) * j) * j2) / 1000000), C15129.m34548(((((long) 750000) * j) * j2) / 1000000));
        }
        int iMax = i15 * (((Math.max(minBufferSize, (int) (((double) iM12976) * d)) + i15) - 1) / i15);
        this.f27950 = false;
        C11414 c11414 = new C11414(c10307, i2, i3, i4, i5, iIntValue, i6, iMax, c5772, z, z2, this.f27928);
        if (m23529()) {
            this.f27926 = c11414;
        } else {
            this.f27902 = c11414;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:64:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩴ */
    private boolean m23528() throws C16834 {
        AudioTrack audioTrackM23509;
        C22201 c22201;
        C15512 c15512;
        if (this.f27927.m45576()) {
            return false;
        }
        try {
            C11414 c11414 = this.f27902;
            c11414.getClass();
            audioTrackM23509 = m23509(c11414);
        } catch (C16834 e) {
            C11414 c11415 = this.f27902;
            if (c11415.f31852 > 1000000) {
                C11414 c11416 = new C11414(c11415.f31856, c11415.f31853, c11415.f31858, c11415.f31851, c11415.f31850, c11415.f31859, c11415.f31849, BasicLabelFormatter.MILLION, c11415.f31848, c11415.f31855, c11415.f31857, c11415.f31854);
                try {
                    audioTrackM23509 = m23509(c11416);
                    this.f27902 = c11416;
                } catch (C16834 e2) {
                    e.addSuppressed(e2);
                    if (this.f27902.f31858 == 1) {
                        throw e;
                    }
                    this.f27950 = true;
                    throw e;
                }
            }
            if (this.f27902.f31858 == 1) {
                throw e;
            }
            this.f27950 = true;
            throw e;
        }
        this.f27925 = audioTrackM23509;
        if (m23514(audioTrackM23509)) {
            AudioTrack audioTrack = this.f27925;
            if (this.f27940 == null) {
                this.f27940 = new C3366(this);
            }
            this.f27940.m5889(audioTrack);
            C11414 c11417 = this.f27902;
            if (c11417.f31857) {
                AudioTrack audioTrack2 = this.f27925;
                C10307 c10307 = c11417.f31856;
                audioTrack2.setOffloadDelayPadding(c10307.f28543, c10307.f28544);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && (c15512 = this.f27907) != null) {
            C18789.m42818(this.f27925, c15512);
        }
        AudioTrack audioTrack3 = this.f27925;
        C11414 c11418 = this.f27902;
        this.f27943.m28059(audioTrack3, c11418.f31858 == 2, c11418.f31849, c11418.f31851, c11418.f31852, this.f27955);
        if (m23529()) {
            this.f27925.setVolume(this.f27917);
        }
        this.f27910.getClass();
        C11472 c11472 = this.f27954;
        if (c11472 != null && i >= 23) {
            C19460.m44274(this.f27925, c11472);
            C22201 c22202 = this.f27947;
            if (c22202 != null) {
                c22202.m50020(this.f27954.f31988);
            }
        }
        if (i >= 24 && (c22201 = this.f27947) != null) {
            this.f27966 = new C6049(this.f27925, c22201);
        }
        this.f27942 = true;
        int audioSessionId = this.f27925.getAudioSessionId();
        boolean z = audioSessionId != this.f27957;
        this.f27957 = audioSessionId;
        InterfaceC22871 interfaceC22871 = this.f27905;
        if (interfaceC22871 != null) {
            interfaceC22871.mo48666(this.f27902.m26399());
            if (z) {
                this.f27958 = true;
                this.f27905.mo48662(this.f27957);
            }
        }
        return true;
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ܿ */
    public final void mo15477() {
        this.f27911 = true;
        if (m23529()) {
            this.f27943.m28063();
            if (!this.f27962 || m23514(this.f27925)) {
                this.f27925.play();
            }
        }
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ᩷ */
    public final void mo15479() {
        this.f27960 = true;
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
    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo15469(int i, long j, ByteBuffer byteBuffer) throws C16834, C21530 {
        boolean zM23529;
        C20131 c20131;
        boolean z;
        C11414 c11414;
        C11414 c11415;
        long j2;
        long jM12989;
        InterfaceC22871 interfaceC22871;
        InterfaceC22871 interfaceC22872;
        int i2;
        int iM13903;
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
        ByteBuffer byteBuffer2 = this.f27916;
        C23877.m52957(byteBuffer2 == null || byteBuffer == byteBuffer2);
        C11414 c11416 = this.f27926;
        C12142 c12142 = this.f27943;
        if (c11416 == null) {
            zM23529 = m23529();
            c20131 = this.f27927;
            if (!zM23529) {
                c20131.m45574();
                if (this.f27942) {
                    this.f27922 = Math.max(0L, j);
                    this.f27960 = false;
                    this.f27942 = false;
                    if (m23519()) {
                        m23507();
                    }
                    m23510(j);
                    if (this.f27911) {
                        mo15477();
                    }
                }
                if (c12142.m28068(m23516())) {
                    if (this.f27916 != null) {
                        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C23877.m52957(z);
                        if (byteBuffer.hasRemaining()) {
                            c11414 = this.f27902;
                            if (c11414.f31858 != 0) {
                                i2 = c11414.f31849;
                                if (i2 != 20) {
                                    if (i2 != 30) {
                                        switch (i2) {
                                            case 5:
                                            case 6:
                                                iM13903 = C7969.m18437(byteBuffer);
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
                                                String str = C5792.f14228;
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
                                                                String str2 = C5792.f14228;
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
                                                            iM13903 = (40 << ((byteBuffer.get(iPosition3 + i10) >> 4) & 7)) * 16;
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
                                                        i3 = C15344.m34921(new C17861(bArr, 16)).f76428;
                                                        break;
                                                    case 18:
                                                        iM13903 = C7969.m18437(byteBuffer);
                                                        break;
                                                    default:
                                                        throw new IllegalStateException(C20778.m46922(i2, "Unexpected audio encoding: "));
                                                }
                                                break;
                                        }
                                    } else if (byteBuffer.getInt(0) == -233094848) {
                                        i3 = 1024;
                                    } else {
                                        i3 = 1024;
                                    }
                                    this.f27908 = i3;
                                } else {
                                    iM13903 = C6112.m13903(byteBuffer);
                                }
                                i3 = iM13903;
                                this.f27908 = i3;
                            }
                            if (this.f27929 == null) {
                                long j3 = this.f27922;
                                c11415 = this.f27902;
                                if (c11415.f31858 == 0) {
                                    j2 = this.f27913 / ((long) c11415.f31853);
                                } else {
                                    j2 = this.f27956;
                                }
                                jM12989 = C5792.m12989(c11415.f31856.f28538, j2 - this.f27934.m27692()) + j3;
                                if (!this.f27960) {
                                    interfaceC22872 = this.f27905;
                                    if (interfaceC22872 != null) {
                                        StringBuilder sbM33191 = C14536.m33191("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM12989);
                                        sbM33191.append(j);
                                        interfaceC22872.mo48665(new C23541(sbM33191.toString()));
                                    }
                                    this.f27960 = true;
                                }
                                if (this.f27960) {
                                    if (m23515()) {
                                        long j4 = j - jM12989;
                                        this.f27922 += j4;
                                        this.f27960 = false;
                                        m23510(j);
                                        interfaceC22871 = this.f27905;
                                        if (interfaceC22871 != null) {
                                            interfaceC22871.mo48672();
                                        }
                                    }
                                }
                                if (this.f27902.f31858 == 0) {
                                    this.f27913 += (long) byteBuffer.remaining();
                                } else {
                                    this.f27956 = (((long) this.f27908) * ((long) i)) + this.f27956;
                                }
                                this.f27916 = byteBuffer;
                                this.f27931 = i;
                                m23525(j);
                                if (!this.f27916.hasRemaining()) {
                                    this.f27916 = null;
                                    this.f27931 = 0;
                                    return true;
                                }
                                if (c12142.m28065(m23516())) {
                                    C21334.m48351("Resetting stalled audio track");
                                    flush();
                                    return true;
                                }
                            } else if (m23515()) {
                                m23510(j);
                                this.f27929 = null;
                                long j5 = this.f27922;
                                c11415 = this.f27902;
                                if (c11415.f31858 == 0) {
                                    j2 = this.f27913 / ((long) c11415.f31853);
                                } else {
                                    j2 = this.f27956;
                                }
                                jM12989 = C5792.m12989(c11415.f31856.f28538, j2 - this.f27934.m27692()) + j5;
                                if (!this.f27960) {
                                    interfaceC22872 = this.f27905;
                                    if (interfaceC22872 != null) {
                                        StringBuilder sbM33192 = C14536.m33191("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM12989);
                                        sbM33192.append(j);
                                        interfaceC22872.mo48665(new C23541(sbM33192.toString()));
                                    }
                                    this.f27960 = true;
                                }
                                if (this.f27960) {
                                    if (m23515()) {
                                        long j6 = j - jM12989;
                                        this.f27922 += j6;
                                        this.f27960 = false;
                                        m23510(j);
                                        interfaceC22871 = this.f27905;
                                        if (interfaceC22871 != null) {
                                            interfaceC22871.mo48672();
                                        }
                                    }
                                }
                                if (this.f27902.f31858 == 0) {
                                    this.f27913 += (long) byteBuffer.remaining();
                                } else {
                                    this.f27956 = (((long) this.f27908) * ((long) i)) + this.f27956;
                                }
                                this.f27916 = byteBuffer;
                                this.f27931 = i;
                                m23525(j);
                                if (!this.f27916.hasRemaining()) {
                                    this.f27916 = null;
                                    this.f27931 = 0;
                                    return true;
                                }
                                if (c12142.m28065(m23516())) {
                                    C21334.m48351("Resetting stalled audio track");
                                    flush();
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    m23525(j);
                    if (!this.f27916.hasRemaining()) {
                        this.f27916 = null;
                        this.f27931 = 0;
                        return true;
                    }
                    if (c12142.m28065(m23516())) {
                        C21334.m48351("Resetting stalled audio track");
                        flush();
                        return true;
                    }
                }
            } else {
                try {
                    if (m23528()) {
                        c20131.m45574();
                        if (this.f27942) {
                            this.f27922 = Math.max(0L, j);
                            this.f27960 = false;
                            this.f27942 = false;
                            if (m23519()) {
                                m23507();
                            }
                            m23510(j);
                            if (this.f27911) {
                                mo15477();
                            }
                        }
                        if (c12142.m28068(m23516())) {
                            if (this.f27916 != null) {
                                if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C23877.m52957(z);
                                if (byteBuffer.hasRemaining()) {
                                    c11414 = this.f27902;
                                    if (c11414.f31858 != 0 && this.f27908 == 0) {
                                        i2 = c11414.f31849;
                                        if (i2 != 20) {
                                            if (i2 != 30) {
                                                switch (i2) {
                                                    case 5:
                                                    case 6:
                                                        iM13903 = C7969.m18437(byteBuffer);
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
                                                                iM13903 = (((i5 >> 2) | i4) + 1) * 32;
                                                            } else {
                                                                i4 = (byteBuffer.get(iPosition5 + 5) & 1) << 6;
                                                                b = byteBuffer.get(iPosition5 + 4);
                                                            }
                                                            i5 = b & Poly1305KeyGenerator.R_MASK_LOW_2;
                                                            iM13903 = (((i5 >> 2) | i4) + 1) * 32;
                                                        } else {
                                                            i3 = 4096;
                                                        }
                                                        break;
                                                    case 9:
                                                        int iPosition6 = byteBuffer.position();
                                                        String str3 = C5792.f14228;
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
                                                                        String str4 = C5792.f14228;
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
                                                                    iM13903 = (40 << ((byteBuffer.get(iPosition7 + i10) >> 4) & 7)) * 16;
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
                                                                i3 = C15344.m34921(new C17861(bArr2, 16)).f76428;
                                                                break;
                                                            case 18:
                                                                iM13903 = C7969.m18437(byteBuffer);
                                                                break;
                                                            default:
                                                                throw new IllegalStateException(C20778.m46922(i2, "Unexpected audio encoding: "));
                                                        }
                                                        break;
                                                }
                                            } else if (byteBuffer.getInt(0) == -233094848) {
                                                i3 = 1024;
                                            } else {
                                                i3 = 1024;
                                            }
                                            this.f27908 = i3;
                                        } else {
                                            iM13903 = C6112.m13903(byteBuffer);
                                        }
                                        i3 = iM13903;
                                        this.f27908 = i3;
                                    }
                                    if (this.f27929 == null) {
                                        long j7 = this.f27922;
                                        c11415 = this.f27902;
                                        if (c11415.f31858 == 0) {
                                            j2 = this.f27913 / ((long) c11415.f31853);
                                        } else {
                                            j2 = this.f27956;
                                        }
                                        jM12989 = C5792.m12989(c11415.f31856.f28538, j2 - this.f27934.m27692()) + j7;
                                        if (!this.f27960 && Math.abs(jM12989 - j) > 200000) {
                                            interfaceC22872 = this.f27905;
                                            if (interfaceC22872 != null) {
                                                StringBuilder sbM33193 = C14536.m33191("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM12989);
                                                sbM33193.append(j);
                                                interfaceC22872.mo48665(new C23541(sbM33193.toString()));
                                            }
                                            this.f27960 = true;
                                        }
                                        if (this.f27960) {
                                            if (m23515()) {
                                                long j8 = j - jM12989;
                                                this.f27922 += j8;
                                                this.f27960 = false;
                                                m23510(j);
                                                interfaceC22871 = this.f27905;
                                                if (interfaceC22871 != null && j8 != 0) {
                                                    interfaceC22871.mo48672();
                                                }
                                            }
                                        }
                                        if (this.f27902.f31858 == 0) {
                                            this.f27913 += (long) byteBuffer.remaining();
                                        } else {
                                            this.f27956 = (((long) this.f27908) * ((long) i)) + this.f27956;
                                        }
                                        this.f27916 = byteBuffer;
                                        this.f27931 = i;
                                        m23525(j);
                                        if (!this.f27916.hasRemaining()) {
                                            this.f27916 = null;
                                            this.f27931 = 0;
                                            return true;
                                        }
                                        if (c12142.m28065(m23516())) {
                                            C21334.m48351("Resetting stalled audio track");
                                            flush();
                                            return true;
                                        }
                                    } else if (m23515()) {
                                        m23510(j);
                                        this.f27929 = null;
                                        long j9 = this.f27922;
                                        c11415 = this.f27902;
                                        if (c11415.f31858 == 0) {
                                            j2 = this.f27913 / ((long) c11415.f31853);
                                        } else {
                                            j2 = this.f27956;
                                        }
                                        jM12989 = C5792.m12989(c11415.f31856.f28538, j2 - this.f27934.m27692()) + j9;
                                        if (!this.f27960) {
                                            interfaceC22872 = this.f27905;
                                            if (interfaceC22872 != null) {
                                                StringBuilder sbM33194 = C14536.m33191("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM12989);
                                                sbM33194.append(j);
                                                interfaceC22872.mo48665(new C23541(sbM33194.toString()));
                                            }
                                            this.f27960 = true;
                                        }
                                        if (this.f27960) {
                                            if (m23515()) {
                                                long j10 = j - jM12989;
                                                this.f27922 += j10;
                                                this.f27960 = false;
                                                m23510(j);
                                                interfaceC22871 = this.f27905;
                                                if (interfaceC22871 != null) {
                                                    interfaceC22871.mo48672();
                                                }
                                            }
                                        }
                                        if (this.f27902.f31858 == 0) {
                                            this.f27913 += (long) byteBuffer.remaining();
                                        } else {
                                            this.f27956 = (((long) this.f27908) * ((long) i)) + this.f27956;
                                        }
                                        this.f27916 = byteBuffer;
                                        this.f27931 = i;
                                        m23525(j);
                                        if (!this.f27916.hasRemaining()) {
                                            this.f27916 = null;
                                            this.f27931 = 0;
                                            return true;
                                        }
                                        if (c12142.m28065(m23516())) {
                                            C21334.m48351("Resetting stalled audio track");
                                            flush();
                                            return true;
                                        }
                                    }
                                }
                                return true;
                            }
                            m23525(j);
                            if (!this.f27916.hasRemaining()) {
                                this.f27916 = null;
                                this.f27931 = 0;
                                return true;
                            }
                            if (c12142.m28065(m23516())) {
                                C21334.m48351("Resetting stalled audio track");
                                flush();
                                return true;
                            }
                        }
                    }
                } catch (C16834 e) {
                    if (e.f49831) {
                        throw e;
                    }
                    c20131.m45575(e);
                    return false;
                }
            }
        } else if (m23515()) {
            C11414 c11417 = this.f27926;
            C11414 c11418 = this.f27902;
            c11417.getClass();
            if (c11418.f31858 == c11417.f31858 && c11418.f31849 == c11417.f31849 && c11418.f31850 == c11417.f31850 && c11418.f31859 == c11417.f31859 && c11418.f31851 == c11417.f31851 && c11418.f31855 == c11417.f31855 && c11418.f31857 == c11417.f31857) {
                this.f27902 = this.f27926;
                this.f27926 = null;
                AudioTrack audioTrack = this.f27925;
                if (audioTrack != null && m23514(audioTrack) && this.f27902.f31857) {
                    if (this.f27925.getPlayState() == 3) {
                        this.f27925.setOffloadEndOfStream();
                        c12142.m28056();
                    }
                    AudioTrack audioTrack2 = this.f27925;
                    C10307 c10307 = this.f27902.f31856;
                    audioTrack2.setOffloadDelayPadding(c10307.f28543, c10307.f28544);
                    this.f27963 = true;
                }
            } else {
                m23517();
                if (!mo15468()) {
                    flush();
                }
            }
            m23510(j);
            zM23529 = m23529();
            c20131 = this.f27927;
            if (!zM23529) {
                c20131.m45574();
                if (this.f27942) {
                    this.f27922 = Math.max(0L, j);
                    this.f27960 = false;
                    this.f27942 = false;
                    if (m23519()) {
                        m23507();
                    }
                    m23510(j);
                    if (this.f27911) {
                        mo15477();
                    }
                }
                if (c12142.m28068(m23516())) {
                    if (this.f27916 != null) {
                        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C23877.m52957(z);
                        if (byteBuffer.hasRemaining()) {
                            c11414 = this.f27902;
                            if (c11414.f31858 != 0) {
                                i2 = c11414.f31849;
                                if (i2 != 20) {
                                    if (i2 != 30) {
                                        switch (i2) {
                                            case 5:
                                            case 6:
                                                iM13903 = C7969.m18437(byteBuffer);
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
                                                String str5 = C5792.f14228;
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
                                                                String str6 = C5792.f14228;
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
                                                            iM13903 = (40 << ((byteBuffer.get(iPosition10 + i10) >> 4) & 7)) * 16;
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
                                                        i3 = C15344.m34921(new C17861(bArr3, 16)).f76428;
                                                        break;
                                                    case 18:
                                                        iM13903 = C7969.m18437(byteBuffer);
                                                        break;
                                                    default:
                                                        throw new IllegalStateException(C20778.m46922(i2, "Unexpected audio encoding: "));
                                                }
                                                break;
                                        }
                                    } else if (byteBuffer.getInt(0) == -233094848) {
                                        i3 = 1024;
                                    } else {
                                        i3 = 1024;
                                    }
                                    this.f27908 = i3;
                                } else {
                                    iM13903 = C6112.m13903(byteBuffer);
                                }
                                i3 = iM13903;
                                this.f27908 = i3;
                            }
                            if (this.f27929 == null) {
                                long j11 = this.f27922;
                                c11415 = this.f27902;
                                if (c11415.f31858 == 0) {
                                    j2 = this.f27913 / ((long) c11415.f31853);
                                } else {
                                    j2 = this.f27956;
                                }
                                jM12989 = C5792.m12989(c11415.f31856.f28538, j2 - this.f27934.m27692()) + j11;
                                if (!this.f27960) {
                                    interfaceC22872 = this.f27905;
                                    if (interfaceC22872 != null) {
                                        StringBuilder sbM33195 = C14536.m33191("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM12989);
                                        sbM33195.append(j);
                                        interfaceC22872.mo48665(new C23541(sbM33195.toString()));
                                    }
                                    this.f27960 = true;
                                }
                                if (this.f27960) {
                                    if (m23515()) {
                                        long j12 = j - jM12989;
                                        this.f27922 += j12;
                                        this.f27960 = false;
                                        m23510(j);
                                        interfaceC22871 = this.f27905;
                                        if (interfaceC22871 != null) {
                                            interfaceC22871.mo48672();
                                        }
                                    }
                                }
                                if (this.f27902.f31858 == 0) {
                                    this.f27913 += (long) byteBuffer.remaining();
                                } else {
                                    this.f27956 = (((long) this.f27908) * ((long) i)) + this.f27956;
                                }
                                this.f27916 = byteBuffer;
                                this.f27931 = i;
                                m23525(j);
                                if (!this.f27916.hasRemaining()) {
                                    this.f27916 = null;
                                    this.f27931 = 0;
                                    return true;
                                }
                                if (c12142.m28065(m23516())) {
                                    C21334.m48351("Resetting stalled audio track");
                                    flush();
                                    return true;
                                }
                            } else if (m23515()) {
                                m23510(j);
                                this.f27929 = null;
                                long j13 = this.f27922;
                                c11415 = this.f27902;
                                if (c11415.f31858 == 0) {
                                    j2 = this.f27913 / ((long) c11415.f31853);
                                } else {
                                    j2 = this.f27956;
                                }
                                jM12989 = C5792.m12989(c11415.f31856.f28538, j2 - this.f27934.m27692()) + j13;
                                if (!this.f27960) {
                                    interfaceC22872 = this.f27905;
                                    if (interfaceC22872 != null) {
                                        StringBuilder sbM33196 = C14536.m33191("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM12989);
                                        sbM33196.append(j);
                                        interfaceC22872.mo48665(new C23541(sbM33196.toString()));
                                    }
                                    this.f27960 = true;
                                }
                                if (this.f27960) {
                                    if (m23515()) {
                                        long j14 = j - jM12989;
                                        this.f27922 += j14;
                                        this.f27960 = false;
                                        m23510(j);
                                        interfaceC22871 = this.f27905;
                                        if (interfaceC22871 != null) {
                                            interfaceC22871.mo48672();
                                        }
                                    }
                                }
                                if (this.f27902.f31858 == 0) {
                                    this.f27913 += (long) byteBuffer.remaining();
                                } else {
                                    this.f27956 = (((long) this.f27908) * ((long) i)) + this.f27956;
                                }
                                this.f27916 = byteBuffer;
                                this.f27931 = i;
                                m23525(j);
                                if (!this.f27916.hasRemaining()) {
                                    this.f27916 = null;
                                    this.f27931 = 0;
                                    return true;
                                }
                                if (c12142.m28065(m23516())) {
                                    C21334.m48351("Resetting stalled audio track");
                                    flush();
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    m23525(j);
                    if (!this.f27916.hasRemaining()) {
                        this.f27916 = null;
                        this.f27931 = 0;
                        return true;
                    }
                    if (c12142.m28065(m23516())) {
                        C21334.m48351("Resetting stalled audio track");
                        flush();
                        return true;
                    }
                }
            } else if (m23528()) {
                c20131.m45574();
                if (this.f27942) {
                    this.f27922 = Math.max(0L, j);
                    this.f27960 = false;
                    this.f27942 = false;
                    if (m23519()) {
                        m23507();
                    }
                    m23510(j);
                    if (this.f27911) {
                        mo15477();
                    }
                }
                if (c12142.m28068(m23516())) {
                    if (this.f27916 != null) {
                        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C23877.m52957(z);
                        if (byteBuffer.hasRemaining()) {
                            c11414 = this.f27902;
                            if (c11414.f31858 != 0) {
                                i2 = c11414.f31849;
                                if (i2 != 20) {
                                    if (i2 != 30) {
                                        switch (i2) {
                                            case 5:
                                            case 6:
                                                iM13903 = C7969.m18437(byteBuffer);
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
                                                String str7 = C5792.f14228;
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
                                                                String str8 = C5792.f14228;
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
                                                            iM13903 = (40 << ((byteBuffer.get(iPosition13 + i10) >> 4) & 7)) * 16;
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
                                                        i3 = C15344.m34921(new C17861(bArr4, 16)).f76428;
                                                        break;
                                                    case 18:
                                                        iM13903 = C7969.m18437(byteBuffer);
                                                        break;
                                                    default:
                                                        throw new IllegalStateException(C20778.m46922(i2, "Unexpected audio encoding: "));
                                                }
                                                break;
                                        }
                                    } else if (byteBuffer.getInt(0) == -233094848) {
                                        i3 = 1024;
                                    } else {
                                        i3 = 1024;
                                    }
                                    this.f27908 = i3;
                                } else {
                                    iM13903 = C6112.m13903(byteBuffer);
                                }
                                i3 = iM13903;
                                this.f27908 = i3;
                            }
                            if (this.f27929 == null) {
                                long j15 = this.f27922;
                                c11415 = this.f27902;
                                if (c11415.f31858 == 0) {
                                    j2 = this.f27913 / ((long) c11415.f31853);
                                } else {
                                    j2 = this.f27956;
                                }
                                jM12989 = C5792.m12989(c11415.f31856.f28538, j2 - this.f27934.m27692()) + j15;
                                if (!this.f27960) {
                                    interfaceC22872 = this.f27905;
                                    if (interfaceC22872 != null) {
                                        StringBuilder sbM33197 = C14536.m33191("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM12989);
                                        sbM33197.append(j);
                                        interfaceC22872.mo48665(new C23541(sbM33197.toString()));
                                    }
                                    this.f27960 = true;
                                }
                                if (this.f27960) {
                                    if (m23515()) {
                                        long j16 = j - jM12989;
                                        this.f27922 += j16;
                                        this.f27960 = false;
                                        m23510(j);
                                        interfaceC22871 = this.f27905;
                                        if (interfaceC22871 != null) {
                                            interfaceC22871.mo48672();
                                        }
                                    }
                                }
                                if (this.f27902.f31858 == 0) {
                                    this.f27913 += (long) byteBuffer.remaining();
                                } else {
                                    this.f27956 = (((long) this.f27908) * ((long) i)) + this.f27956;
                                }
                                this.f27916 = byteBuffer;
                                this.f27931 = i;
                                m23525(j);
                                if (!this.f27916.hasRemaining()) {
                                    this.f27916 = null;
                                    this.f27931 = 0;
                                    return true;
                                }
                                if (c12142.m28065(m23516())) {
                                    C21334.m48351("Resetting stalled audio track");
                                    flush();
                                    return true;
                                }
                            } else if (m23515()) {
                                m23510(j);
                                this.f27929 = null;
                                long j17 = this.f27922;
                                c11415 = this.f27902;
                                if (c11415.f31858 == 0) {
                                    j2 = this.f27913 / ((long) c11415.f31853);
                                } else {
                                    j2 = this.f27956;
                                }
                                jM12989 = C5792.m12989(c11415.f31856.f28538, j2 - this.f27934.m27692()) + j17;
                                if (!this.f27960) {
                                    interfaceC22872 = this.f27905;
                                    if (interfaceC22872 != null) {
                                        StringBuilder sbM33198 = C14536.m33191("Unexpected audio track timestamp discontinuity: expected ", ", got ", jM12989);
                                        sbM33198.append(j);
                                        interfaceC22872.mo48665(new C23541(sbM33198.toString()));
                                    }
                                    this.f27960 = true;
                                }
                                if (this.f27960) {
                                    if (m23515()) {
                                        long j18 = j - jM12989;
                                        this.f27922 += j18;
                                        this.f27960 = false;
                                        m23510(j);
                                        interfaceC22871 = this.f27905;
                                        if (interfaceC22871 != null) {
                                            interfaceC22871.mo48672();
                                        }
                                    }
                                }
                                if (this.f27902.f31858 == 0) {
                                    this.f27913 += (long) byteBuffer.remaining();
                                } else {
                                    this.f27956 = (((long) this.f27908) * ((long) i)) + this.f27956;
                                }
                                this.f27916 = byteBuffer;
                                this.f27931 = i;
                                m23525(j);
                                if (!this.f27916.hasRemaining()) {
                                    this.f27916 = null;
                                    this.f27931 = 0;
                                    return true;
                                }
                                if (c12142.m28065(m23516())) {
                                    C21334.m48351("Resetting stalled audio track");
                                    flush();
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    m23525(j);
                    if (!this.f27916.hasRemaining()) {
                        this.f27916 = null;
                        this.f27931 = 0;
                        return true;
                    }
                    if (c12142.m28065(m23516())) {
                        C21334.m48351("Resetting stalled audio track");
                        flush();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private AudioTrack m23509(C11414 c11414) throws C16834 {
        int i;
        Context context;
        Context context2;
        try {
            int i2 = this.f27957;
            int i3 = this.f27941;
            if (i3 == -1 || (context2 = this.f27921) == null || Build.VERSION.SDK_INT < 34) {
                i = i2;
                context = null;
            } else {
                if (this.f27959 == null) {
                    this.f27959 = context2.createDeviceContext(i3);
                }
                context = this.f27959;
                i = 0;
            }
            return m23508(c11414.m26399(), this.f27945, i, c11414.f31856, context);
        } catch (C16834 e) {
            InterfaceC22871 interfaceC22871 = this.f27905;
            if (interfaceC22871 != null) {
                interfaceC22871.mo48665(e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private AudioTrack m23508(C3424 c3424, C19695 c19695, int i, C10307 c10307, Context context) throws C16834 {
        try {
            AudioTrack audioTrackM51017 = this.f27906.m51017(c3424, c19695, i, context);
            int state = audioTrackM51017.getState();
            if (state == 1) {
                return audioTrackM51017;
            }
            try {
                audioTrackM51017.release();
            } catch (Exception unused) {
            }
            throw new C16834(state, c3424.f6828, c3424.f6825, c3424.f6827, c3424.f6824, c10307, c3424.f6829, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new C16834(0, c3424.f6828, c3424.f6825, c3424.f6827, c3424.f6824, c10307, c3424.f6829, e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m23525(long j) throws C21530 {
        m23521(j);
        if (this.f27919 != null) {
            return;
        }
        if (!this.f27965.m12953()) {
            ByteBuffer byteBuffer = this.f27916;
            if (byteBuffer != null) {
                m23512(byteBuffer);
                m23521(j);
                return;
            }
            return;
        }
        while (!this.f27965.m12951()) {
            do {
                ByteBuffer byteBufferM12949 = this.f27965.m12949();
                if (byteBufferM12949.hasRemaining()) {
                    m23512(byteBufferM12949);
                    m23521(j);
                } else {
                    ByteBuffer byteBuffer2 = this.f27916;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f27965.m12948(this.f27916);
                    }
                }
            } while (this.f27919 == null);
            return;
        }
    }

    /* JADX INFO: renamed from: ۖ */
    private boolean m23515() throws C21530 {
        if (!this.f27965.m12953()) {
            m23521(Long.MIN_VALUE);
            return this.f27919 == null;
        }
        this.f27965.m12952();
        m23525(Long.MIN_VALUE);
        if (!this.f27965.m12951()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f27919;
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
    /* JADX INFO: renamed from: ֫ */
    private void m23512(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        float f;
        C23877.m52960(this.f27919 == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f27902.f31858 != 0) {
                byteBufferOrder = byteBuffer;
            } else {
                int iM12993 = (int) C5792.m12993(C5792.m12990(20L), this.f27902.f31850, 1000000L, RoundingMode.UP);
                long jM23516 = m23516();
                long j = iM12993;
                if (jM23516 >= j) {
                    byteBufferOrder = byteBuffer;
                } else {
                    C11414 c11414 = this.f27902;
                    int i5 = c11414.f31849;
                    int i6 = c11414.f31851;
                    int i7 = (int) jM23516;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i7 < iM12993) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i5 == 4) {
                                float fM12973 = C5792.m12973(byteBuffer.getFloat(), -1.0f, 1.0f);
                                if (fM12973 < 0.0f) {
                                    fM12973 = -fM12973;
                                    f = -2.14748365E9f;
                                } else {
                                    f = 2.14748365E9f;
                                }
                                i3 = (int) (fM12973 * f);
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
            this.f27919 = byteBufferOrder;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX INFO: renamed from: ۧ */
    private void m23521(long j) throws C21530 {
        int iWrite;
        InterfaceC22871 interfaceC22871;
        if (this.f27919 == null) {
            return;
        }
        C20131 c20131 = this.f27932;
        if (c20131.m45576()) {
            return;
        }
        int iRemaining = this.f27919.remaining();
        boolean z = false;
        if (this.f27928) {
            C23877.m52960(j != -9223372036854775807L);
            if (j == Long.MIN_VALUE) {
                j = this.f27920;
            } else {
                this.f27920 = j;
            }
            AudioTrack audioTrack = this.f27925;
            ByteBuffer byteBuffer = this.f27919;
            if (Build.VERSION.SDK_INT >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining, 1, 1000 * j);
            } else {
                if (this.f27951 == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.f27951 = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.f27951.putInt(1431633921);
                }
                if (this.f27900 == 0) {
                    this.f27951.putInt(4, iRemaining);
                    this.f27951.putLong(8, j * 1000);
                    this.f27951.position(0);
                    this.f27900 = iRemaining;
                }
                int iRemaining2 = this.f27951.remaining();
                if (iRemaining2 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                    if (iWrite < 0) {
                        this.f27900 = 0;
                    } else {
                        this.f27900 -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.f27951, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.f27900 = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining2) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                        if (iWrite < 0) {
                            this.f27900 = 0;
                        } else {
                            this.f27900 -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = this.f27925.write(this.f27919, iRemaining, 1);
        }
        this.f27937 = SystemClock.elapsedRealtime();
        if (iWrite >= 0) {
            c20131.m45574();
            if (m23514(this.f27925)) {
                if (this.f27964 > 0) {
                    this.f27963 = false;
                }
                if (this.f27911 && (interfaceC22871 = this.f27905) != null && iWrite < iRemaining && !this.f27963) {
                    interfaceC22871.mo48668();
                }
            }
            int i = this.f27902.f31858;
            if (i == 0) {
                this.f27938 += (long) iWrite;
            }
            if (iWrite == iRemaining) {
                if (i != 0) {
                    C23877.m52960(this.f27919 == this.f27916);
                    this.f27964 = (((long) this.f27908) * ((long) this.f27931)) + this.f27964;
                }
                this.f27919 = null;
                return;
            }
            return;
        }
        if ((Build.VERSION.SDK_INT >= 24 && iWrite == -6) || iWrite == -32) {
            if (m23516() > 0) {
                z = true;
            } else if (m23514(this.f27925)) {
                if (this.f27902.f31858 == 1) {
                    this.f27950 = true;
                }
                z = true;
            }
        }
        C21530 c21530 = new C21530(iWrite, this.f27902.f31856, z);
        InterfaceC22871 interfaceC22872 = this.f27905;
        if (interfaceC22872 != null) {
            interfaceC22872.mo48665(c21530);
        }
        if (c21530.f67923 && this.f27921 != null) {
            C19518 c19518 = C19518.f59441;
            this.f27949 = c19518;
            this.f27947.m50021(c19518);
            throw c21530;
        }
        c20131.m45575(c21530);
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ۜ */
    public final void mo15471() {
        if (!this.f27935 && m23529() && m23515()) {
            m23517();
            this.f27935 = true;
        }
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo15474() {
        if (m23529()) {
            return this.f27935 && !mo15468();
        }
        return true;
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15468() {
        if (m23529()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.f27925.isOffloadedPlayback() && this.f27933) && this.f27943.m28062(m23516());
        }
        return false;
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ֫ */
    public final void mo15460(C4963 c4963) {
        this.f27944 = new C4963(C5792.m12973(c4963.f11305, 0.1f, 8.0f), C5792.m12973(c4963.f11303, 0.1f, 8.0f));
        if (m23519()) {
            m23507();
            return;
        }
        C17447 c17447 = new C17447(c4963, -9223372036854775807L, -9223372036854775807L);
        if (m23529()) {
            this.f27929 = c17447;
        } else {
            this.f27930 = c17447;
        }
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ܽ */
    public final C4963 mo15476() {
        return this.f27944;
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ֫ */
    public final void mo15467(boolean z) {
        this.f27915 = z;
        C17447 c17447 = new C17447(m23519() ? C4963.f11302 : this.f27944, -9223372036854775807L, -9223372036854775807L);
        if (m23529()) {
            this.f27929 = c17447;
        } else {
            this.f27930 = c17447;
        }
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ֫ */
    public final void mo15465(C19695 c19695) {
        if (this.f27945.equals(c19695)) {
            return;
        }
        this.f27945 = c19695;
        if (this.f27928) {
            return;
        }
        C22201 c22201 = this.f27947;
        if (c22201 != null) {
            c22201.m50022(c19695);
        }
        flush();
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ֫ */
    public final void mo15458(int i) {
        if (this.f27958) {
            if (this.f27957 != i) {
                return;
            } else {
                this.f27958 = false;
            }
        }
        if (this.f27957 != i) {
            this.f27957 = i;
            this.f27912 = i != 0;
            flush();
        }
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ֫ */
    public final void mo15464(C19024 c19024) {
        if (this.f27910.equals(c19024)) {
            return;
        }
        c19024.getClass();
        if (this.f27925 != null) {
            this.f27910.getClass();
        }
        this.f27910 = c19024;
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ֫ */
    public final void mo15459(AudioDeviceInfo audioDeviceInfo) {
        this.f27954 = audioDeviceInfo == null ? null : new C11472(audioDeviceInfo);
        C22201 c22201 = this.f27947;
        if (c22201 != null) {
            c22201.m50020(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f27925;
        if (audioTrack != null) {
            C19460.m44274(audioTrack, this.f27954);
        }
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ᩳ */
    public final long mo15478() {
        long j;
        if (!m23529()) {
            return -9223372036854775807L;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return C19460.m44273(this.f27925, this.f27902);
        }
        C11414 c11414 = this.f27902;
        if (c11414.f31858 == 0) {
            j = ((long) c11414.f31850) * ((long) c11414.f31851);
        } else {
            int iM52872 = C23786.m52872(c11414.f31849);
            C23877.m52960(iM52872 != -2147483647);
            j = iM52872;
        }
        return C5792.m12993(this.f27902.f31852, 1000000L, j, RoundingMode.DOWN);
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ۢ */
    public final void mo15472() {
        C23877.m52960(this.f27912);
        if (this.f27928) {
            return;
        }
        this.f27928 = true;
        flush();
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ܳ */
    public final void mo15475() {
        if (this.f27928) {
            this.f27928 = false;
            flush();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23534(int i) {
        C23877.m52960(Build.VERSION.SDK_INT >= 29);
        this.f27948 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23531(int i, int i2) {
        C11414 c11414;
        AudioTrack audioTrack = this.f27925;
        if (audioTrack == null || !m23514(audioTrack) || (c11414 = this.f27902) == null || !c11414.f31857) {
            return;
        }
        this.f27925.setOffloadDelayPadding(i, i2);
    }

    @Override // p067l.InterfaceC6777
    /* JADX INFO: renamed from: ֫ */
    public final void mo15457(float f) {
        if (this.f27917 != f) {
            this.f27917 = f;
            if (m23529()) {
                this.f27925.setVolume(this.f27917);
            }
        }
    }

    @Override // p067l.InterfaceC6777
    public final void pause() {
        this.f27911 = false;
        if (m23529()) {
            this.f27943.m28067();
            if (!this.f27962 || m23514(this.f27925)) {
                this.f27925.pause();
            }
        }
    }

    @Override // p067l.InterfaceC6777
    public final void flush() {
        C6049 c6049;
        if (m23529()) {
            this.f27913 = 0L;
            this.f27956 = 0L;
            this.f27938 = 0L;
            this.f27964 = 0L;
            this.f27963 = false;
            this.f27908 = 0;
            this.f27930 = new C17447(this.f27944, 0L, 0L);
            this.f27922 = 0L;
            this.f27929 = null;
            this.f27946.clear();
            this.f27916 = null;
            this.f27931 = 0;
            this.f27919 = null;
            this.f27962 = false;
            this.f27935 = false;
            this.f27933 = false;
            this.f27951 = null;
            this.f27900 = 0;
            this.f27934.m27691();
            C5772 c5772 = this.f27902.f31848;
            this.f27965 = c5772;
            c5772.m12947();
            if (this.f27943.m28064()) {
                this.f27925.pause();
            }
            if (m23514(this.f27925)) {
                C3366 c3366 = this.f27940;
                c3366.getClass();
                c3366.m5890(this.f27925);
            }
            final C3424 c3424M26399 = this.f27902.m26399();
            C11414 c11414 = this.f27926;
            if (c11414 != null) {
                this.f27902 = c11414;
                this.f27926 = null;
            }
            this.f27943.m28066();
            if (Build.VERSION.SDK_INT >= 24 && (c6049 = this.f27966) != null) {
                c6049.m13632();
                this.f27966 = null;
            }
            final AudioTrack audioTrack = this.f27925;
            final InterfaceC22871 interfaceC22871 = this.f27905;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f27899) {
                if (f27897 == null) {
                    String str = C5792.f14228;
                    f27897 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC4451());
                }
                f27898++;
                f27897.schedule(new Runnable() { // from class: l.ܽۤ֫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10072.m23511(audioTrack, interfaceC22871, handler, c3424M26399);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            }
            this.f27925 = null;
        }
        this.f27932.m45574();
        this.f27927.m45574();
        this.f27903 = 0L;
        this.f27904 = 0L;
        Handler handler2 = this.f27901;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // p067l.InterfaceC6777
    public final void reset() {
        flush();
        AbstractC6767 abstractC6767ListIterator = this.f27953.listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            ((InterfaceC2418) abstractC6767ListIterator.next()).reset();
        }
        this.f27936.reset();
        this.f27909.reset();
        C5772 c5772 = this.f27965;
        if (c5772 != null) {
            c5772.m12950();
        }
        this.f27911 = false;
        this.f27950 = false;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m23533() {
        C22201 c22201 = this.f27947;
        if (c22201 != null) {
            c22201.m50023();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23532(C19518 c19518) {
        Looper looperMyLooper = Looper.myLooper();
        boolean z = this.f27924 == looperMyLooper;
        StringBuilder sb = new StringBuilder("Current looper (");
        sb.append(looperMyLooper == null ? "null" : looperMyLooper.getThread().getName());
        sb.append(") is not the playback looper (");
        Looper looper = this.f27924;
        sb.append(looper != null ? looper.getThread().getName() : "null");
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        C23877.m52959(sb.toString(), z);
        C19518 c19519 = this.f27949;
        if (c19519 == null || c19518.equals(c19519)) {
            return;
        }
        this.f27949 = c19518;
        InterfaceC22871 interfaceC22871 = this.f27905;
        if (interfaceC22871 != null) {
            interfaceC22871.mo48670();
        }
    }

    /* JADX INFO: renamed from: ֨ */
    private void m23507() {
        if (m23529()) {
            try {
                this.f27925.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f27944.f11305).setPitch(this.f27944.f11303).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                C21334.m48350("Failed to set playback params", e);
            }
            C4963 c4963 = new C4963(this.f27925.getPlaybackParams().getSpeed(), this.f27925.getPlaybackParams().getPitch());
            this.f27944 = c4963;
            this.f27943.m28057(c4963.f11305);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX INFO: renamed from: ֫ */
    private void m23510(long j) {
        C4963 c4963;
        boolean z;
        boolean zM23519 = m23519();
        boolean z2 = this.f27961;
        InterfaceC7113 interfaceC7113 = this.f27918;
        if (zM23519) {
            c4963 = C4963.f11302;
        } else {
            if (this.f27928) {
                c4963 = C4963.f11302;
            } else {
                C11414 c11414 = this.f27902;
                if (c11414.f31858 == 0) {
                    int i = c11414.f31856.f28519;
                    if (z2) {
                        String str = C5792.f14228;
                        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
                            c4963 = C4963.f11302;
                        }
                    }
                    c4963 = this.f27944;
                    ((C10743) interfaceC7113).m24741(c4963);
                } else {
                    c4963 = C4963.f11302;
                }
            }
            this.f27944 = c4963;
        }
        C4963 c4964 = c4963;
        if (this.f27928) {
            z = false;
        } else {
            C11414 c11415 = this.f27902;
            if (c11415.f31858 == 0) {
                int i2 = c11415.f31856.f28519;
                if (z2) {
                    String str2 = C5792.f14228;
                    if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4) {
                        z = false;
                    }
                }
                z = this.f27915;
                ((C10743) interfaceC7113).m24742(z);
            } else {
                z = false;
            }
        }
        this.f27915 = z;
        long jMax = Math.max(0L, j);
        C11414 c11416 = this.f27902;
        this.f27946.add(new C17447(c4964, jMax, C5792.m12989(c11416.f31850, m23516())));
        C5772 c5772 = this.f27902.f31848;
        this.f27965 = c5772;
        c5772.m12947();
        InterfaceC22871 interfaceC22871 = this.f27905;
        if (interfaceC22871 != null) {
            interfaceC22871.mo48667(this.f27915);
        }
    }

    /* JADX INFO: renamed from: ۠ */
    private boolean m23519() {
        C11414 c11414 = this.f27902;
        return c11414 != null && c11414.f31855 && Build.VERSION.SDK_INT >= 23;
    }

    /* JADX INFO: renamed from: ᩵ */
    private boolean m23529() {
        return this.f27925 != null;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static long m23530(C10072 c10072) {
        C11414 c11414 = c10072.f27902;
        if (c11414.f31858 == 0) {
            return c10072.f27913 / ((long) c11414.f31853);
        }
        return c10072.f27956;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ */
    public long m23516() {
        C11414 c11414 = this.f27902;
        if (c11414.f31858 == 0) {
            long j = this.f27938;
            long j2 = c11414.f31851;
            String str = C5792.f14228;
            return ((j + j2) - 1) / j2;
        }
        return this.f27964;
    }

    @EnsuresNonNull({"audioCapabilities"})
    /* JADX INFO: renamed from: ֡ */
    private void m23506() {
        Context context;
        Looper looperMyLooper = Looper.myLooper();
        boolean z = this.f27947 == null || this.f27924 == looperMyLooper;
        StringBuilder sb = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f27924;
        sb.append(looper == null ? "null" : looper.getThread().getName());
        sb.append(" and ");
        sb.append(looperMyLooper != null ? looperMyLooper.getThread().getName() : "null");
        C23877.m52959(sb.toString(), z);
        if (this.f27947 == null && (context = this.f27921) != null) {
            this.f27924 = looperMyLooper;
            C22201 c22201 = new C22201(context, new H5PayActivity$$ExternalSyntheticLambda0(this), this.f27945, this.f27954);
            this.f27947 = c22201;
            this.f27949 = c22201.m50019();
        }
        this.f27949.getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23514(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: ۚ */
    private void m23517() {
        if (this.f27962) {
            return;
        }
        this.f27962 = true;
        this.f27943.m28058(m23516());
        if (m23514(this.f27925)) {
            this.f27933 = false;
        }
        this.f27925.stop();
        this.f27900 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m23511(AudioTrack audioTrack, InterfaceC22871 interfaceC22871, Handler handler, C3424 c3424) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (interfaceC22871 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC16526(1, interfaceC22871, c3424));
            }
            synchronized (f27899) {
                int i = f27898 - 1;
                f27898 = i;
                if (i == 0) {
                    f27897.shutdown();
                    f27897 = null;
                }
            }
        } catch (Throwable th) {
            if (interfaceC22871 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC16526(1, interfaceC22871, c3424));
            }
            synchronized (f27899) {
                int i2 = f27898 - 1;
                f27898 = i2;
                if (i2 == 0) {
                    f27897.shutdown();
                    f27897 = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public static boolean m23523() {
        boolean z;
        synchronized (f27899) {
            z = f27898 > 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23513(C10072 c10072) {
        if (c10072.f27904 >= 300000) {
            c10072.f27905.mo48661();
            c10072.f27904 = 0L;
        }
    }
}
