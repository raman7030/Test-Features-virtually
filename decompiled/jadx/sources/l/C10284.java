package l;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ۤ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8SY */
/* JADX INFO: loaded from: classes3.dex */
public final class C10284 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f30957;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f30958;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13105 f30959;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f30960;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f30961;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f30962;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f30963;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f30964;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f30965;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f30966;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f30967;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f30968;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f30969;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Method f30970;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f30971;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long[] f30972;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AudioTrack f30973;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f30974;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f30975;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f30976;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f30977;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC16427 f30978;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12400 f30979;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f30980;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f30981;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f30982;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f30983;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f30984;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f30985;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f30986;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f30987;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f30988;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f30989;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f30990;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f30991;

    public C10284(InterfaceC12400 interfaceC12400) {
        this.f30979 = interfaceC12400;
        try {
            this.f30970 = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f30972 = new long[10];
        this.f30965 = -9223372036854775807L;
        this.f30985 = -9223372036854775807L;
        this.f30978 = InterfaceC16427.f50519;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26035(AudioTrack audioTrack, boolean z, int i, int i2, int i3, boolean z2) {
        long jM11013;
        this.f30973 = audioTrack;
        this.f30983 = i3;
        this.f30959 = new C13105(audioTrack, this.f30979);
        this.f30962 = audioTrack.getSampleRate();
        this.f30988 = z && Build.VERSION.SDK_INT < 23 && (i == 5 || i == 6);
        boolean zM11034 = C3603.m11034(i);
        this.f30961 = zM11034;
        if (zM11034) {
            jM11013 = C3603.m11013(this.f30962, i3 / i2);
        } else {
            jM11013 = -9223372036854775807L;
        }
        this.f30982 = jM11013;
        this.f30966 = 0L;
        this.f30974 = 0L;
        this.f30987 = false;
        this.f30960 = 0L;
        this.f30976 = 0L;
        this.f30980 = false;
        this.f30968 = -9223372036854775807L;
        this.f30971 = -9223372036854775807L;
        this.f30963 = 0L;
        this.f30969 = 0L;
        this.f30981 = 1.0f;
        this.f30958 = 0;
        this.f30964 = -9223372036854775807L;
        this.f30991 = z2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26033(float f) {
        this.f30981 = f;
        C13105 c13105 = this.f30959;
        if (c13105 != null) {
            c13105.m31771();
        }
        m26030();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9 A[Catch: Exception -> 0x00bd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bd, blocks: (B:26:0x0083, B:28:0x00a9), top: B:64:0x0083 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x00a9, please report this as an issue */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m26037() {
        Method method;
        long jMax;
        AudioTrack audioTrack = this.f30973;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long jMo33835 = this.f30978.mo33835() / 1000;
            if (jMo33835 - this.f30984 >= 30000) {
                long jM11013 = C3603.m11013(this.f30962, m26031());
                if (jM11013 != 0) {
                    int i = this.f30989;
                    long jM11038 = C3603.m11038(jM11013, this.f30981) - jMo33835;
                    long[] jArr = this.f30972;
                    jArr[i] = jM11038;
                    this.f30989 = (this.f30989 + 1) % 10;
                    int i2 = this.f30975;
                    if (i2 < 10) {
                        this.f30975 = i2 + 1;
                    }
                    this.f30984 = jMo33835;
                    this.f30990 = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f30975;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f30990 += jArr[i3] / ((long) i4);
                        i3++;
                        jArr = jArr;
                    }
                    if (!this.f30988) {
                        if (this.f30961 && (method = this.f30970) != null && jMo33835 - this.f30963 >= 500000) {
                            try {
                                AudioTrack audioTrack2 = this.f30973;
                                audioTrack2.getClass();
                                Integer num = (Integer) method.invoke(audioTrack2, null);
                                String str = C3603.f11424;
                                long jIntValue = (((long) num.intValue()) * 1000) - this.f30982;
                                this.f30969 = jIntValue;
                                jMax = Math.max(jIntValue, 0L);
                                this.f30969 = jMax;
                                if (jMax > 5000000) {
                                    C19956.m46037("Ignoring impossibly large audio latency: " + jMax);
                                    this.f30969 = 0L;
                                }
                            } catch (Exception unused) {
                                this.f30970 = null;
                            }
                            this.f30963 = jMo33835;
                        }
                        C13105 c13105 = this.f30959;
                        c13105.getClass();
                        c13105.m31768(this.f30981, jMo33835, m26029(jMo33835));
                    }
                }
            } else if (!this.f30988) {
                if (this.f30961) {
                    AudioTrack audioTrack3 = this.f30973;
                    audioTrack3.getClass();
                    Integer num2 = (Integer) method.invoke(audioTrack3, null);
                    String str2 = C3603.f11424;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.f30982;
                    this.f30969 = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.f30969 = jMax;
                    if (jMax > 5000000) {
                        C19956.m46037("Ignoring impossibly large audio latency: " + jMax);
                        this.f30969 = 0L;
                    }
                    this.f30963 = jMo33835;
                }
                C13105 c13106 = this.f30959;
                c13106.getClass();
                c13106.m31768(this.f30981, jMo33835, m26029(jMo33835));
            }
        }
        long jMo33836 = this.f30978.mo33835() / 1000;
        C13105 c13107 = this.f30959;
        c13107.getClass();
        boolean zM31769 = c13107.m31769();
        long jM31766 = zM31769 ? c13107.m31766(jMo33836, this.f30981) : m26029(jMo33836);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zM31769 || !c13107.m31770()) {
                m26028(jM31766);
            }
            long j = this.f30965;
            if (j != -9223372036854775807L) {
                long j2 = jM31766 - this.f30985;
                long jM11015 = C3603.m11015(jMo33836 - j, this.f30981);
                long j3 = this.f30985 + jM11015;
                long jAbs = Math.abs(j3 - jM31766);
                if (j2 != 0 && jAbs < 1000000) {
                    long j4 = (jM11015 * 10) / 100;
                    jM31766 = C3603.m11016(jM31766, j3 - j4, j3 + j4);
                }
            }
            if (!this.f30991 && !this.f30986) {
                long j5 = this.f30985;
                if (j5 != -9223372036854775807L && jM31766 > j5) {
                    this.f30986 = true;
                    ((C19396) this.f30979).m44670(this.f30978.mo33831() - C3603.m11037(C3603.m11038(C3603.m11037(jM31766 - j5), this.f30981)));
                }
            }
            this.f30965 = jMo33836;
            this.f30985 = jM31766;
        } else if (playState == 1) {
            m26028(jM31766);
        }
        return jM31766;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m26039() {
        if (this.f30968 != -9223372036854775807L) {
            this.f30968 = C3603.m11014(this.f30978.mo33834());
        }
        this.f30964 = C3603.m11013(this.f30962, m26031());
        C13105 c13105 = this.f30959;
        c13105.getClass();
        c13105.m31771();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m26040() {
        AudioTrack audioTrack = this.f30973;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m26044(long j) {
        AudioTrack audioTrack = this.f30973;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        boolean z = false;
        if (this.f30988) {
            if (playState == 2) {
                this.f30980 = false;
                return false;
            }
            if (playState == 1 && m26031() == 0) {
                return false;
            }
        }
        if (Build.VERSION.SDK_INT < 24) {
            boolean z2 = this.f30980;
            boolean zM26038 = m26038(j);
            this.f30980 = zM26038;
            if (z2 && !zM26038 && playState != 1) {
                z = true;
            }
        } else {
            AudioTrack audioTrack2 = this.f30973;
            audioTrack2.getClass();
            int underrunCount = audioTrack2.getUnderrunCount();
            z = underrunCount > this.f30958;
            this.f30958 = underrunCount;
        }
        if (z) {
            int i = this.f30983;
            long jM11037 = C3603.m11037(this.f30982);
            C8106 c8106 = ((C19396) this.f30979).f62762;
            if (c8106.f24996 != null) {
                c8106.f24996.mo46348(jM11037, i, SystemClock.elapsedRealtime() - c8106.f25028);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m26041(long j) {
        return this.f30971 != -9223372036854775807L && j > 0 && this.f30978.mo33834() - this.f30971 >= 200;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26034(long j) {
        this.f30977 = m26031();
        this.f30968 = C3603.m11014(this.f30978.mo33834());
        this.f30967 = j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m26038(long j) {
        long jM26037 = m26037();
        int i = this.f30962;
        String str = C3603.f11424;
        if (j > C3603.m11017(jM26037, i, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (!this.f30988) {
            return false;
        }
        AudioTrack audioTrack = this.f30973;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && m26031() == 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m26043() {
        m26030();
        if (this.f30968 == -9223372036854775807L) {
            C13105 c13105 = this.f30959;
            c13105.getClass();
            c13105.m31771();
        }
        this.f30977 = m26031();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26032() {
        this.f30987 = true;
        C13105 c13105 = this.f30959;
        if (c13105 != null) {
            c13105.m31767();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m26042() {
        m26030();
        this.f30973 = null;
        this.f30959 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26036(InterfaceC16427 interfaceC16427) {
        this.f30978 = interfaceC16427;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m26028(long j) {
        if (this.f30991) {
            long j2 = this.f30964;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long jMo33831 = this.f30978.mo33831() - C3603.m11037(C3603.m11038(j - j2, this.f30981));
            this.f30964 = -9223372036854775807L;
            ((C19396) this.f30979).m44670(jMo33831);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private long m26029(long j) {
        long jM11015;
        if (this.f30975 != 0) {
            jM11015 = C3603.m11015(j + this.f30990, this.f30981);
        } else if (this.f30968 != -9223372036854775807L) {
            jM11015 = C3603.m11013(this.f30962, m26027());
        } else {
            jM11015 = C3603.m11013(this.f30962, m26031());
        }
        long jMax = Math.max(0L, jM11015 - this.f30969);
        if (this.f30968 == -9223372036854775807L) {
            return jMax;
        }
        return Math.min(C3603.m11013(this.f30962, this.f30967), jMax);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m26030() {
        this.f30990 = 0L;
        this.f30975 = 0;
        this.f30989 = 0;
        this.f30984 = 0L;
        this.f30985 = -9223372036854775807L;
        this.f30965 = -9223372036854775807L;
        this.f30986 = false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private long m26031() {
        long j;
        if (this.f30968 != -9223372036854775807L) {
            return Math.min(this.f30967, m26027());
        }
        long jMo33834 = this.f30978.mo33834();
        if (jMo33834 - this.f30957 >= 5) {
            AudioTrack audioTrack = this.f30973;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f30988) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f30976 = this.f30966;
                    }
                    playbackHeadPosition += this.f30976;
                }
                if (Build.VERSION.SDK_INT > 29) {
                    j = this.f30966;
                    if (j > playbackHeadPosition) {
                        if (this.f30987) {
                            this.f30960 += j;
                            this.f30987 = false;
                        } else {
                            this.f30974++;
                        }
                    }
                    this.f30966 = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f30966 <= 0 || playState != 3) {
                    this.f30971 = -9223372036854775807L;
                    j = this.f30966;
                    if (j > playbackHeadPosition) {
                        if (this.f30987) {
                            this.f30960 += j;
                            this.f30987 = false;
                        } else {
                            this.f30974++;
                        }
                    }
                    this.f30966 = playbackHeadPosition;
                } else if (this.f30971 == -9223372036854775807L) {
                    this.f30971 = jMo33834;
                }
            }
            this.f30957 = jMo33834;
        }
        return this.f30966 + this.f30960 + (this.f30974 << 32);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private long m26027() {
        AudioTrack audioTrack = this.f30973;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f30977;
        }
        return this.f30977 + C3603.m11017(C3603.m11015(C3603.m11014(this.f30978.mo33834()) - this.f30968, this.f30981), this.f30962, 1000000L, RoundingMode.UP);
    }
}
