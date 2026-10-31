package l;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ۨ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 48U6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11715 implements InterfaceC1131 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public PlaybackMetrics.Builder f34934;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C16134 f34935;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f34936;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f34937;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C13125 f34938;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f34939;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f34940;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C6070 f34941;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C6070 f34943;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C8353 f34944;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C8353 f34945;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f34946;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Context f34949;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C6070 f34950;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f34951;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f34955;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f34956;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34957;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final PlaybackSession f34960;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C8353 f34961;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Executor f34952 = C10881.m27178();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20369 f34947 = new C20369();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22485 f34959 = new C22485();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f34954 = new HashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f34953 = new HashMap();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f34948 = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f34958 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f34942 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11715 m28595(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C11715(context, mediaMetricsManager.createPlaybackSession());
    }

    public C11715(Context context, PlaybackSession playbackSession) {
        this.f34949 = context.getApplicationContext();
        this.f34960 = playbackSession;
        C13125 c13125 = new C13125();
        this.f34938 = c13125;
        c13125.m31796(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LogSessionId m28605() {
        return this.f34960.getSessionId();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28606(C0425 c0425, String str) {
        C15894 c15894 = c0425.f1895;
        if (c15894 == null || !c15894.m37669()) {
            m28604();
            this.f34936 = str;
            this.f34934 = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            m28597(c0425.f1892, c15894);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28607(C0425 c0425, String str) {
        C15894 c15894 = c0425.f1895;
        if ((c15894 == null || !c15894.m37669()) && str.equals(this.f34936)) {
            m28604();
        }
        this.f34953.remove(str);
        this.f34954.remove(str);
    }

    @Override // l.InterfaceC1131
    /* JADX INFO: renamed from: ֫ */
    public final void mo3861(int i) {
        if (i == 1) {
            this.f34956 = true;
        }
        this.f34951 = i;
    }

    @Override // l.InterfaceC1131
    /* JADX INFO: renamed from: ֫ */
    public final void mo3865(C3519 c3519) {
        this.f34937 += c3519.f11178;
        this.f34957 += c3519.f11172;
    }

    @Override // l.InterfaceC1131
    /* JADX INFO: renamed from: ֫ */
    public final void mo3862(C0425 c0425, int i, long j) {
        C15894 c15894 = c0425.f1895;
        if (c15894 != null) {
            String strM31793 = this.f34938.m31793(c0425.f1892, c15894);
            HashMap map = this.f34954;
            Long l2 = (Long) map.get(strM31793);
            HashMap map2 = this.f34953;
            Long l3 = (Long) map2.get(strM31793);
            map.put(strM31793, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j));
            map2.put(strM31793, Long.valueOf((l3 != null ? l3.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // l.InterfaceC1131
    /* JADX INFO: renamed from: ֫ */
    public final void mo3863(C0425 c0425, C6723 c6723) {
        C15894 c15894 = c0425.f1895;
        if (c15894 == null) {
            return;
        }
        C8353 c8353 = c6723.f20867;
        c8353.getClass();
        int i = c6723.f20864;
        AbstractC4846 abstractC4846 = c0425.f1892;
        c15894.getClass();
        C6070 c6070 = new C6070(c8353, i, this.f34938.m31793(abstractC4846, c15894));
        int i2 = c6723.f20868;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f34941 = c6070;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f34943 = c6070;
                return;
            }
        }
        this.f34950 = c6070;
    }

    @Override // l.InterfaceC1131
    /* JADX INFO: renamed from: ֫ */
    public final void mo3866(C6404 c6404) {
        C6070 c6070 = this.f34950;
        if (c6070 != null) {
            C8353 c8353 = c6070.f18586;
            if (c8353.f25609 == -1) {
                C1297 c1297M21948 = c8353.m21948();
                c1297M21948.m4453(c6404.f19815);
                c1297M21948.m4457(c6404.f19813);
                this.f34950 = new C6070(c1297M21948.m4440(), c6070.f18587, c6070.f18588);
            }
        }
    }

    @Override // l.InterfaceC1131
    /* JADX INFO: renamed from: ֫ */
    public final void mo3867(C6723 c6723) {
        this.f34955 = c6723.f20862;
    }

    @Override // l.InterfaceC1131
    /* JADX INFO: renamed from: ֫ */
    public final void mo3868(C16134 c16134) {
        this.f34935 = c16134;
    }

    /* JADX WARN: Code duplicated, block: B:230:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:337:0x0524  */
    /* JADX WARN: Code duplicated, block: B:340:0x054d  */
    /* JADX WARN: Code duplicated, block: B:355:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, l.۠ᩴ֫] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r7v1 */
    @Override // l.InterfaceC1131
    /* JADX INFO: renamed from: ֫ */
    public final void mo3864(InterfaceC1318 interfaceC1318, C5365 c5365) {
        C13125 c13125;
        int i;
        boolean z;
        C13125 c13126;
        C10304 c10304;
        int i2;
        C10304 c10305;
        C10304 c10306;
        int i3;
        int i4;
        C8353 c8353;
        int i5;
        boolean z2;
        C5365 c5366;
        int i6;
        boolean z3;
        int i7;
        C19643 c19643;
        int i8;
        if (c5365.m15326() == 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            int iM15326 = c5365.m15326();
            c13125 = this.f34938;
            if (i9 >= iM15326) {
                break;
            }
            int iM15328 = c5365.m15328(i9);
            C0425 c0425M15329 = c5365.m15329(iM15328);
            if (iM15328 == 0) {
                c13125.m31798(c0425M15329);
            } else if (iM15328 == 11) {
                c13125.m31795(c0425M15329, this.f34951);
            } else {
                c13125.m31797(c0425M15329);
            }
            i9++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c5365.m15327(0)) {
            C0425 c0425M153210 = c5365.m15329(0);
            if (this.f34934 != null) {
                m28597(c0425M153210.f1892, c0425M153210.f1895);
            }
        }
        if (c5365.m15327(2) && this.f34934 != null) {
            AbstractC4628 abstractC4628ListIterator = interfaceC1318.mo4574().m33608().listIterator(0);
            loop1: while (true) {
                if (!abstractC4628ListIterator.hasNext()) {
                    c19643 = null;
                    break;
                }
                C23190 c23190 = (C23190) abstractC4628ListIterator.next();
                for (int i10 = 0; i10 < c23190.f74548; i10++) {
                    if (c23190.m51441(i10) && (c19643 = c23190.m51437(i10).f25602) != null) {
                        break loop1;
                    }
                }
            }
            if (c19643 != null) {
                PlaybackMetrics.Builder builder = this.f34934;
                int i11 = 0;
                while (true) {
                    if (i11 >= c19643.f63389) {
                        i8 = 1;
                        break;
                    }
                    UUID uuid = c19643.m45153(i11).f59726;
                    if (uuid.equals(C23875.f77203)) {
                        i8 = 3;
                        break;
                    } else if (uuid.equals(C23875.f77202)) {
                        i8 = 2;
                        break;
                    } else {
                        if (uuid.equals(C23875.f77200)) {
                            i8 = 6;
                            break;
                        }
                        i11++;
                    }
                }
                builder.setDrmType(i8);
            }
        }
        if (c5365.m15327(1011)) {
            this.f34946++;
        }
        C16134 c16134 = this.f34935;
        Context context = this.f34949;
        Executor executor = this.f34952;
        long j = this.f34948;
        if (c16134 == null) {
            i4 = 1;
            c13126 = c13125;
        } else {
            int i12 = c16134.f49707;
            boolean z4 = this.f34955 == 4;
            if (i12 == 1001) {
                c10304 = new C10304(20, 0);
                c13126 = c13125;
            } else {
                if (c16134 instanceof C18273) {
                    C18273 c18273 = (C18273) c16134;
                    z = c18273.f56812 == 1;
                    i = c18273.f56815;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = c16134.getCause();
                cause.getClass();
                c13126 = c13125;
                if (cause instanceof IOException) {
                    if (cause instanceof C23770) {
                        c10306 = new C10304(5, ((C23770) cause).f76941);
                        c10304 = c10306;
                    } else if ((cause instanceof C14597) || (cause instanceof C9080)) {
                        c10304 = new C10304(z4 ? 10 : 11, 0);
                    } else {
                        boolean z5 = cause instanceof C17420;
                        if (z5 || (cause instanceof C5426)) {
                            if (C10659.m26749(context).m26753() == 1) {
                                c10304 = new C10304(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    c10304 = new C10304(6, 0);
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    c10304 = new C10304(7, 0);
                                } else if (z5 && ((C17420) cause).f53280 == 1) {
                                    c10304 = new C10304(4, 0);
                                } else {
                                    c10304 = new C10304(8, 0);
                                }
                            }
                        } else if (i12 == 1002) {
                            c10304 = new C10304(21, 0);
                        } else if (cause instanceof C19272) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int iM11008 = C3603.m11008(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (C3603.m11053(iM11008)) {
                                    case 6002:
                                        i3 = 24;
                                        break;
                                    case 6003:
                                        i3 = 28;
                                        break;
                                    case 6004:
                                        i3 = 25;
                                        break;
                                    case 6005:
                                        i3 = 26;
                                        break;
                                    default:
                                        i3 = 27;
                                        break;
                                }
                                c10305 = new C10304(i3, iM11008);
                                c10304 = c10305;
                            } else if (C4860.m14174(cause3)) {
                                c10304 = new C10304(27, 0);
                            } else if (cause3 instanceof NotProvisionedException) {
                                c10304 = new C10304(24, 0);
                            } else if (cause3 instanceof DeniedByServerException) {
                                c10304 = new C10304(29, 0);
                            } else if (cause3 instanceof C20848) {
                                c10304 = new C10304(23, 0);
                            } else if (cause3 instanceof C14331) {
                                c10304 = new C10304(28, 0);
                            } else {
                                c10304 = new C10304(30, 0);
                            }
                        } else if ((cause instanceof C11071) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                c10304 = new C10304(32, 0);
                            } else {
                                c10304 = new C10304(31, 0);
                            }
                        } else {
                            c10304 = new C10304(9, 0);
                        }
                    }
                } else if (z && (i == 0 || i == 1)) {
                    c10304 = new C10304(35, 0);
                } else if (z && i == 3) {
                    c10304 = new C10304(15, 0);
                } else if (z && i == 2) {
                    c10304 = new C10304(23, 0);
                } else {
                    if (cause instanceof C20724) {
                        c10306 = new C10304(13, C3603.m11008(((C20724) cause).f66736));
                    } else {
                        if (cause instanceof C17901) {
                            c10305 = new C10304(14, ((C17901) cause).f54669);
                        } else if (cause instanceof OutOfMemoryError) {
                            c10304 = new C10304(14, 0);
                        } else if (cause instanceof C15221) {
                            c10306 = new C10304(17, ((C15221) cause).f46708);
                        } else if (cause instanceof C20162) {
                            c10306 = new C10304(18, ((C20162) cause).f65281);
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (C3603.m11053(errorCode)) {
                                case 6002:
                                    i2 = 24;
                                    break;
                                case 6003:
                                    i2 = 28;
                                    break;
                                case 6004:
                                    i2 = 25;
                                    break;
                                case 6005:
                                    i2 = 26;
                                    break;
                                default:
                                    i2 = 27;
                                    break;
                            }
                            c10305 = new C10304(i2, errorCode);
                        } else {
                            c10304 = new C10304(22, 0);
                        }
                        c10304 = c10305;
                    }
                    c10304 = c10306;
                }
            }
            executor.execute(new RunnableC12420(0, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - j).setErrorCode(c10304.f31037).setSubErrorCode(c10304.f31038).setException(c16134).build()));
            i4 = 1;
            this.f34940 = true;
            this.f34935 = null;
        }
        if (c5365.m15327(2)) {
            C14017 c14017Mo4574 = interfaceC1318.mo4574();
            boolean zM33611 = c14017Mo4574.m33611(2);
            boolean zM33612 = c14017Mo4574.m33611(i4);
            boolean zM33613 = c14017Mo4574.m33611(3);
            if (zM33611 || zM33612 || zM33613) {
                if (zM33611) {
                    c8353 = 0;
                } else {
                    if (!C11003.equals(this.f34944, null)) {
                        int i13 = this.f34944 == null ? 1 : 0;
                        this.f34944 = null;
                        m28596(1, jElapsedRealtime, null, i13);
                    }
                    c8353 = 0;
                }
                if (!zM33612 && !C11003.equals(this.f34961, c8353)) {
                    int i14 = this.f34961 == null ? 1 : 0;
                    this.f34961 = c8353;
                    m28596(0, jElapsedRealtime, c8353, i14);
                }
                if (!zM33613 && !C11003.equals(this.f34945, c8353)) {
                    int i15 = this.f34945 == null ? 1 : 0;
                    this.f34945 = c8353;
                    m28596(2, jElapsedRealtime, c8353, i15);
                }
            } else {
                c8353 = 0;
            }
        } else {
            c8353 = 0;
        }
        if (m28603(this.f34950)) {
            C6070 c6070 = this.f34950;
            C8353 c8354 = c6070.f18586;
            if (c8354.f25609 != -1) {
                int i16 = c6070.f18587;
                if (!C11003.equals(this.f34944, c8354)) {
                    int i17 = (this.f34944 == null && i16 == 0) ? 1 : i16;
                    this.f34944 = c8354;
                    m28596(1, jElapsedRealtime, c8354, i17);
                }
                this.f34950 = c8353;
            }
        }
        if (m28603(this.f34941)) {
            C6070 c6071 = this.f34941;
            C8353 c8355 = c6071.f18586;
            int i18 = c6071.f18587;
            if (!C11003.equals(this.f34961, c8355)) {
                int i19 = (this.f34961 == null && i18 == 0) ? 1 : i18;
                this.f34961 = c8355;
                m28596(0, jElapsedRealtime, c8355, i19);
            }
            this.f34941 = c8353;
        }
        if (m28603(this.f34943)) {
            C6070 c6072 = this.f34943;
            C8353 c8356 = c6072.f18586;
            int i20 = c6072.f18587;
            if (!C11003.equals(this.f34945, c8356)) {
                int i21 = (this.f34945 == null && i20 == 0) ? 1 : i20;
                this.f34945 = c8356;
                m28596(2, jElapsedRealtime, c8356, i21);
            }
            this.f34943 = c8353;
        }
        switch (C10659.m26749(context).m26753()) {
            case 0:
                i5 = 0;
                break;
            case 1:
                i5 = 9;
                break;
            case 2:
                i5 = 2;
                break;
            case 3:
                i5 = 4;
                break;
            case 4:
                i5 = 5;
                break;
            case 5:
                i5 = 6;
                break;
            case 6:
            case 8:
            default:
                i5 = 1;
                break;
            case 7:
                i5 = 3;
                break;
            case 9:
                i5 = 8;
                break;
            case 10:
                i5 = 7;
                break;
        }
        if (i5 != this.f34942) {
            this.f34942 = i5;
            executor.execute(new RunnableC20553(1, this, new NetworkEvent.Builder().setNetworkType(i5).setTimeSinceCreatedMillis(jElapsedRealtime - j).build()));
        }
        if (interfaceC1318.mo4603() != 2) {
            z2 = false;
            this.f34956 = false;
        } else {
            z2 = false;
        }
        if (interfaceC1318.mo4572() == null) {
            this.f34939 = z2;
            c5366 = c5365;
        } else {
            c5366 = c5365;
            if (c5366.m15327(10)) {
                this.f34939 = true;
            }
        }
        int iMo4603 = interfaceC1318.mo4603();
        if (this.f34956) {
            i7 = 5;
        } else if (this.f34939) {
            i7 = 13;
        } else if (iMo4603 == 4) {
            i7 = 11;
        } else {
            if (iMo4603 != 2) {
                if (iMo4603 == 3) {
                    if (interfaceC1318.mo4607()) {
                        i7 = interfaceC1318.mo4560() != 0 ? 9 : 3;
                    } else {
                        i7 = 4;
                    }
                } else {
                    i6 = (iMo4603 != 1 || this.f34958 == 0) ? this.f34958 : 12;
                    z3 = true;
                }
                if (this.f34958 != i6) {
                    this.f34958 = i6;
                    this.f34940 = z3;
                    executor.execute(new RunnableC19473(1, this, new PlaybackStateEvent.Builder().setState(this.f34958).setTimeSinceCreatedMillis(jElapsedRealtime - j).build()));
                }
                if (c5366.m15327(1028)) {
                    c13126.m31794(c5366.m15329(1028));
                }
            }
            int i22 = this.f34958;
            if (i22 == 0 || i22 == 2 || i22 == 12) {
                i7 = 2;
            } else if (interfaceC1318.mo4607()) {
                i7 = interfaceC1318.mo4560() != 0 ? 10 : 6;
            } else {
                i7 = 7;
            }
        }
        z3 = true;
        i6 = i7;
        if (this.f34958 != i6) {
            this.f34958 = i6;
            this.f34940 = z3;
            executor.execute(new RunnableC19473(1, this, new PlaybackStateEvent.Builder().setState(this.f34958).setTimeSinceCreatedMillis(jElapsedRealtime - j).build()));
        }
        if (c5366.m15327(1028)) {
            c13126.m31794(c5366.m15329(1028));
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m28603(C6070 c6070) {
        return c6070 != null && c6070.f18588.equals(this.f34938.m31792());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28596(int i, long j, C8353 c8353, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.f34948);
        int i4 = 1;
        if (c8353 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = c8353.f25606;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c8353.f25614;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c8353.f25619;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i5 = c8353.f25627;
            if (i5 != -1) {
                timeSinceCreatedMillis.setBitrate(i5);
            }
            int i6 = c8353.f25633;
            if (i6 != -1) {
                timeSinceCreatedMillis.setWidth(i6);
            }
            int i7 = c8353.f25609;
            if (i7 != -1) {
                timeSinceCreatedMillis.setHeight(i7);
            }
            int i8 = c8353.f25625;
            if (i8 != -1) {
                timeSinceCreatedMillis.setChannelCount(i8);
            }
            int i9 = c8353.f25624;
            if (i9 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i9);
            }
            String str4 = c8353.f25603;
            if (str4 != null) {
                String str5 = C3603.f11424;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c8353.f25596;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f34940 = true;
        this.f34952.execute(new RunnableC13821(i4, this, timeSinceCreatedMillis.build()));
    }

    @RequiresNonNull({"metricsBuilder"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28597(AbstractC4846 abstractC4846, C15894 c15894) {
        int iMo14098;
        PlaybackMetrics.Builder builder = this.f34934;
        if (c15894 == null || (iMo14098 = abstractC4846.mo14098(c15894.f49112)) == -1) {
            return;
        }
        C22485 c22485 = this.f34959;
        int i = 0;
        abstractC4846.mo14104(iMo14098, c22485, false);
        int i2 = c22485.f72806;
        C20369 c20369 = this.f34947;
        abstractC4846.m14106(i2, c20369);
        C11881 c11881 = c20369.f65753.f33612;
        if (c11881 != null) {
            int iM11006 = C3603.m11006(c11881.f35426, c11881.f35423);
            if (iM11006 == 0) {
                i = 3;
            } else if (iM11006 != 1) {
                i = iM11006 != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (c20369.f65755 != -9223372036854775807L && !c20369.f65756 && !c20369.f65759 && !c20369.m46687()) {
            builder.setMediaDurationMillis(C3603.m11037(c20369.f65755));
        }
        builder.setPlaybackType(c20369.m46687() ? 2 : 1);
        this.f34940 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m28604() {
        PlaybackMetrics.Builder builder = this.f34934;
        if (builder != null && this.f34940) {
            builder.setAudioUnderrunCount(this.f34946);
            this.f34934.setVideoFramesDropped(this.f34937);
            this.f34934.setVideoFramesPlayed(this.f34957);
            Long l2 = (Long) this.f34953.get(this.f34936);
            this.f34934.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = (Long) this.f34954.get(this.f34936);
            this.f34934.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.f34934.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            this.f34952.execute(new RunnableC2180(1, this, this.f34934.build()));
        }
        this.f34934 = null;
        this.f34936 = null;
        this.f34946 = 0;
        this.f34937 = 0;
        this.f34957 = 0;
        this.f34944 = null;
        this.f34961 = null;
        this.f34945 = null;
        this.f34940 = false;
    }
}
