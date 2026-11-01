package p067l;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ۤ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8SY */
/* JADX INFO: loaded from: classes3.dex */
public final class C12142 {

    /* JADX INFO: renamed from: ֡ */
    public long f33920;

    /* JADX INFO: renamed from: ֨ */
    public int f33921;

    /* JADX INFO: renamed from: ֫ */
    public C14823 f33922;

    /* JADX INFO: renamed from: ֫֫ */
    public long f33923;

    /* JADX INFO: renamed from: ۖ */
    public boolean f33924;

    /* JADX INFO: renamed from: ۗ */
    public int f33925;

    /* JADX INFO: renamed from: ۘ */
    public long f33926;

    /* JADX INFO: renamed from: ۙ */
    public long f33927;

    /* JADX INFO: renamed from: ۚ */
    public long f33928;

    /* JADX INFO: renamed from: ۛ */
    public long f33929;

    /* JADX INFO: renamed from: ۜ */
    public long f33930;

    /* JADX INFO: renamed from: ۟ */
    public long f33931;

    /* JADX INFO: renamed from: ۠ */
    public long f33932;

    /* JADX INFO: renamed from: ۡ */
    public Method f33933;

    /* JADX INFO: renamed from: ۢ */
    public long f33934;

    /* JADX INFO: renamed from: ۤ */
    public final long[] f33935;

    /* JADX INFO: renamed from: ۧ */
    public AudioTrack f33936;

    /* JADX INFO: renamed from: ۨ */
    public long f33937;

    /* JADX INFO: renamed from: ۫ */
    public int f33938;

    /* JADX INFO: renamed from: ۬ */
    public long f33939;

    /* JADX INFO: renamed from: ܰ */
    public long f33940;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC17980 f33941;

    /* JADX INFO: renamed from: ܶ */
    public final InterfaceC14153 f33942;

    /* JADX INFO: renamed from: ܺ */
    public boolean f33943;

    /* JADX INFO: renamed from: ܽ */
    public float f33944;

    /* JADX INFO: renamed from: ܿ */
    public long f33945;

    /* JADX INFO: renamed from: ᩳ */
    public int f33946;

    /* JADX INFO: renamed from: ᩴ */
    public long f33947;

    /* JADX INFO: renamed from: ᩵ */
    public long f33948;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f33949;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f33950;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f33951;

    /* JADX INFO: renamed from: ᩹ */
    public int f33952;

    /* JADX INFO: renamed from: ᩺ */
    public long f33953;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f33954;

    public C12142(InterfaceC14153 interfaceC14153) {
        this.f33942 = interfaceC14153;
        try {
            this.f33933 = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f33935 = new long[10];
        this.f33928 = -9223372036854775807L;
        this.f33948 = -9223372036854775807L;
        this.f33941 = InterfaceC17980.f53699;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28059(AudioTrack audioTrack, boolean z, int i, int i2, int i3, boolean z2) {
        long jM12989;
        this.f33936 = audioTrack;
        this.f33946 = i3;
        this.f33922 = new C14823(audioTrack, this.f33942);
        this.f33925 = audioTrack.getSampleRate();
        this.f33951 = z && Build.VERSION.SDK_INT < 23 && (i == 5 || i == 6);
        boolean zM13010 = C5792.m13010(i);
        this.f33924 = zM13010;
        if (zM13010) {
            jM12989 = C5792.m12989(this.f33925, i3 / i2);
        } else {
            jM12989 = -9223372036854775807L;
        }
        this.f33945 = jM12989;
        this.f33929 = 0L;
        this.f33937 = 0L;
        this.f33950 = false;
        this.f33923 = 0L;
        this.f33939 = 0L;
        this.f33943 = false;
        this.f33931 = -9223372036854775807L;
        this.f33934 = -9223372036854775807L;
        this.f33926 = 0L;
        this.f33932 = 0L;
        this.f33944 = 1.0f;
        this.f33921 = 0;
        this.f33927 = -9223372036854775807L;
        this.f33954 = z2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28057(float f) {
        this.f33944 = f;
        C14823 c14823 = this.f33922;
        if (c14823 != null) {
            c14823.m33861();
        }
        m28054();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9 A[Catch: Exception -> 0x00bd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bd, blocks: (B:26:0x0083, B:28:0x00a9), top: B:64:0x0083 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x00a9, please report this as an issue */
    /* JADX INFO: renamed from: ۧ */
    public final long m28061() {
        Method method;
        long jMax;
        AudioTrack audioTrack = this.f33936;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long jMo35967 = this.f33941.mo35967() / 1000;
            if (jMo35967 - this.f33947 >= 30000) {
                long jM12989 = C5792.m12989(this.f33925, m28055());
                if (jM12989 != 0) {
                    int i = this.f33952;
                    long jM13014 = C5792.m13014(jM12989, this.f33944) - jMo35967;
                    long[] jArr = this.f33935;
                    jArr[i] = jM13014;
                    this.f33952 = (this.f33952 + 1) % 10;
                    int i2 = this.f33938;
                    if (i2 < 10) {
                        this.f33938 = i2 + 1;
                    }
                    this.f33947 = jMo35967;
                    this.f33953 = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f33938;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f33953 += jArr[i3] / ((long) i4);
                        i3++;
                        jArr = jArr;
                    }
                    if (!this.f33951) {
                        if (this.f33924 && (method = this.f33933) != null && jMo35967 - this.f33926 >= 500000) {
                            try {
                                AudioTrack audioTrack2 = this.f33936;
                                audioTrack2.getClass();
                                Integer num = (Integer) method.invoke(audioTrack2, null);
                                String str = C5792.f14228;
                                long jIntValue = (((long) num.intValue()) * 1000) - this.f33945;
                                this.f33932 = jIntValue;
                                jMax = Math.max(jIntValue, 0L);
                                this.f33932 = jMax;
                                if (jMax > 5000000) {
                                    C21334.m48351("Ignoring impossibly large audio latency: " + jMax);
                                    this.f33932 = 0L;
                                }
                            } catch (Exception unused) {
                                this.f33933 = null;
                            }
                            this.f33926 = jMo35967;
                        }
                        C14823 c14823 = this.f33922;
                        c14823.getClass();
                        c14823.m33858(this.f33944, jMo35967, m28053(jMo35967));
                    }
                }
            } else if (!this.f33951) {
                if (this.f33924) {
                    AudioTrack audioTrack3 = this.f33936;
                    audioTrack3.getClass();
                    Integer num2 = (Integer) method.invoke(audioTrack3, null);
                    String str2 = C5792.f14228;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.f33945;
                    this.f33932 = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.f33932 = jMax;
                    if (jMax > 5000000) {
                        C21334.m48351("Ignoring impossibly large audio latency: " + jMax);
                        this.f33932 = 0L;
                    }
                    this.f33926 = jMo35967;
                }
                C14823 c14824 = this.f33922;
                c14824.getClass();
                c14824.m33858(this.f33944, jMo35967, m28053(jMo35967));
            }
        }
        long jMo35968 = this.f33941.mo35967() / 1000;
        C14823 c14825 = this.f33922;
        c14825.getClass();
        boolean zM33859 = c14825.m33859();
        long jM33856 = zM33859 ? c14825.m33856(jMo35968, this.f33944) : m28053(jMo35968);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zM33859 || !c14825.m33860()) {
                m28052(jM33856);
            }
            long j = this.f33928;
            if (j != -9223372036854775807L) {
                long j2 = jM33856 - this.f33948;
                long jM12991 = C5792.m12991(jMo35968 - j, this.f33944);
                long j3 = this.f33948 + jM12991;
                long jAbs = Math.abs(j3 - jM33856);
                if (j2 != 0 && jAbs < 1000000) {
                    long j4 = (jM12991 * 10) / 100;
                    jM33856 = C5792.m12992(jM33856, j3 - j4, j3 + j4);
                }
            }
            if (!this.f33954 && !this.f33949) {
                long j5 = this.f33948;
                if (j5 != -9223372036854775807L && jM33856 > j5) {
                    this.f33949 = true;
                    ((C20802) this.f33942).m46964(this.f33941.mo35963() - C5792.m13013(C5792.m13014(C5792.m13013(jM33856 - j5), this.f33944)));
                }
            }
            this.f33928 = jMo35968;
            this.f33948 = jM33856;
        } else if (playState == 1) {
            m28052(jM33856);
        }
        return jM33856;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m28063() {
        if (this.f33931 != -9223372036854775807L) {
            this.f33931 = C5792.m12990(this.f33941.mo35966());
        }
        this.f33927 = C5792.m12989(this.f33925, m28055());
        C14823 c14823 = this.f33922;
        c14823.getClass();
        c14823.m33861();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m28064() {
        AudioTrack audioTrack = this.f33936;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m28068(long j) {
        AudioTrack audioTrack = this.f33936;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        boolean z = false;
        if (this.f33951) {
            if (playState == 2) {
                this.f33943 = false;
                return false;
            }
            if (playState == 1 && m28055() == 0) {
                return false;
            }
        }
        if (Build.VERSION.SDK_INT < 24) {
            boolean z2 = this.f33943;
            boolean zM28062 = m28062(j);
            this.f33943 = zM28062;
            if (z2 && !zM28062 && playState != 1) {
                z = true;
            }
        } else {
            AudioTrack audioTrack2 = this.f33936;
            audioTrack2.getClass();
            int underrunCount = audioTrack2.getUnderrunCount();
            z = underrunCount > this.f33921;
            this.f33921 = underrunCount;
        }
        if (z) {
            int i = this.f33946;
            long jM13013 = C5792.m13013(this.f33945);
            C10072 c10072 = ((C20802) this.f33942).f65373;
            if (c10072.f27905 != null) {
                c10072.f27905.mo48664(jM13013, i, SystemClock.elapsedRealtime() - c10072.f27937);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m28065(long j) {
        return this.f33934 != -9223372036854775807L && j > 0 && this.f33941.mo35966() - this.f33934 >= 200;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28058(long j) {
        this.f33940 = m28055();
        this.f33931 = C5792.m12990(this.f33941.mo35966());
        this.f33930 = j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m28062(long j) {
        long jM28061 = m28061();
        int i = this.f33925;
        String str = C5792.f14228;
        if (j > C5792.m12993(jM28061, i, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (!this.f33951) {
            return false;
        }
        AudioTrack audioTrack = this.f33936;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && m28055() == 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m28067() {
        m28054();
        if (this.f33931 == -9223372036854775807L) {
            C14823 c14823 = this.f33922;
            c14823.getClass();
            c14823.m33861();
        }
        this.f33940 = m28055();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28056() {
        this.f33950 = true;
        C14823 c14823 = this.f33922;
        if (c14823 != null) {
            c14823.m33857();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m28066() {
        m28054();
        this.f33936 = null;
        this.f33922 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28060(InterfaceC17980 interfaceC17980) {
        this.f33941 = interfaceC17980;
    }

    /* JADX INFO: renamed from: ܳ */
    private void m28052(long j) {
        if (this.f33954) {
            long j2 = this.f33927;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long jMo35963 = this.f33941.mo35963() - C5792.m13013(C5792.m13014(j - j2, this.f33944));
            this.f33927 = -9223372036854775807L;
            ((C20802) this.f33942).m46964(jMo35963);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private long m28053(long j) {
        long jM12991;
        if (this.f33938 != 0) {
            jM12991 = C5792.m12991(j + this.f33953, this.f33944);
        } else if (this.f33931 != -9223372036854775807L) {
            jM12991 = C5792.m12989(this.f33925, m28051());
        } else {
            jM12991 = C5792.m12989(this.f33925, m28055());
        }
        long jMax = Math.max(0L, jM12991 - this.f33932);
        if (this.f33931 == -9223372036854775807L) {
            return jMax;
        }
        return Math.min(C5792.m12989(this.f33925, this.f33930), jMax);
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m28054() {
        this.f33953 = 0L;
        this.f33938 = 0;
        this.f33952 = 0;
        this.f33947 = 0L;
        this.f33948 = -9223372036854775807L;
        this.f33928 = -9223372036854775807L;
        this.f33949 = false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX INFO: renamed from: ᩻ */
    private long m28055() {
        long j;
        if (this.f33931 != -9223372036854775807L) {
            return Math.min(this.f33930, m28051());
        }
        long jMo35966 = this.f33941.mo35966();
        if (jMo35966 - this.f33920 >= 5) {
            AudioTrack audioTrack = this.f33936;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f33951) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f33939 = this.f33929;
                    }
                    playbackHeadPosition += this.f33939;
                }
                if (Build.VERSION.SDK_INT > 29) {
                    j = this.f33929;
                    if (j > playbackHeadPosition) {
                        if (this.f33950) {
                            this.f33923 += j;
                            this.f33950 = false;
                        } else {
                            this.f33937++;
                        }
                    }
                    this.f33929 = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f33929 <= 0 || playState != 3) {
                    this.f33934 = -9223372036854775807L;
                    j = this.f33929;
                    if (j > playbackHeadPosition) {
                        if (this.f33950) {
                            this.f33923 += j;
                            this.f33950 = false;
                        } else {
                            this.f33937++;
                        }
                    }
                    this.f33929 = playbackHeadPosition;
                } else if (this.f33934 == -9223372036854775807L) {
                    this.f33934 = jMo35966;
                }
            }
            this.f33920 = jMo35966;
        }
        return this.f33929 + this.f33923 + (this.f33937 << 32);
    }

    /* JADX INFO: renamed from: ۜ */
    private long m28051() {
        AudioTrack audioTrack = this.f33936;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f33940;
        }
        return this.f33940 + C5792.m12993(C5792.m12991(C5792.m12990(this.f33941.mo35966()) - this.f33931, this.f33944), this.f33925, 1000000L, RoundingMode.UP);
    }
}
