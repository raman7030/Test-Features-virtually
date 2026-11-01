package p067l;

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
public final class C13502 implements InterfaceC3443 {

    /* JADX INFO: renamed from: ֡ */
    public PlaybackMetrics.Builder f37934;

    /* JADX INFO: renamed from: ֨ */
    public C17702 f37935;

    /* JADX INFO: renamed from: ֫ */
    public String f37936;

    /* JADX INFO: renamed from: ۖ */
    public int f37937;

    /* JADX INFO: renamed from: ۗ */
    public final C14842 f37938;

    /* JADX INFO: renamed from: ۘ */
    public boolean f37939;

    /* JADX INFO: renamed from: ۙ */
    public boolean f37940;

    /* JADX INFO: renamed from: ۚ */
    public C8137 f37941;

    /* JADX INFO: renamed from: ۠ */
    public C8137 f37943;

    /* JADX INFO: renamed from: ۡ */
    public C10307 f37944;

    /* JADX INFO: renamed from: ۢ */
    public C10307 f37945;

    /* JADX INFO: renamed from: ۧ */
    public int f37946;

    /* JADX INFO: renamed from: ܳ */
    public final Context f37949;

    /* JADX INFO: renamed from: ܶ */
    public C8137 f37950;

    /* JADX INFO: renamed from: ܺ */
    public int f37951;

    /* JADX INFO: renamed from: ᩴ */
    public int f37955;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f37956;

    /* JADX INFO: renamed from: ᩶ */
    public int f37957;

    /* JADX INFO: renamed from: ᩹ */
    public final PlaybackSession f37960;

    /* JADX INFO: renamed from: ᩻ */
    public C10307 f37961;

    /* JADX INFO: renamed from: ܽ */
    public final Executor f37952 = C12710.m29223();

    /* JADX INFO: renamed from: ۫ */
    public final C21727 f37947 = new C21727();

    /* JADX INFO: renamed from: ᩸ */
    public final C23738 f37959 = new C23738();

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f37954 = new HashMap();

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f37953 = new HashMap();

    /* JADX INFO: renamed from: ۬ */
    public final long f37948 = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: ᩷ */
    public int f37958 = 0;

    /* JADX INFO: renamed from: ۜ */
    public int f37942 = 0;

    /* JADX INFO: renamed from: ֫ */
    public static C13502 m30643(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C13502(context, mediaMetricsManager.createPlaybackSession());
    }

    public C13502(Context context, PlaybackSession playbackSession) {
        this.f37949 = context.getApplicationContext();
        this.f37960 = playbackSession;
        C14842 c14842 = new C14842();
        this.f37938 = c14842;
        c14842.m33888(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final LogSessionId m30653() {
        return this.f37960.getSessionId();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30654(C2772 c2772, String str) {
        C17474 c17474 = c2772.f4671;
        if (c17474 == null || !c17474.m39842()) {
            m30652();
            this.f37936 = str;
            this.f37934 = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            m30645(c2772.f4668, c17474);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30655(C2772 c2772, String str) {
        C17474 c17474 = c2772.f4671;
        if ((c17474 == null || !c17474.m39842()) && str.equals(this.f37936)) {
            m30652();
        }
        this.f37953.remove(str);
        this.f37954.remove(str);
    }

    @Override // p067l.InterfaceC3443
    /* JADX INFO: renamed from: ֫ */
    public final void mo6102(int i) {
        if (i == 1) {
            this.f37956 = true;
        }
        this.f37951 = i;
    }

    @Override // p067l.InterfaceC3443
    /* JADX INFO: renamed from: ֫ */
    public final void mo6106(C5713 c5713) {
        this.f37937 += c5713.f13984;
        this.f37957 += c5713.f13978;
    }

    @Override // p067l.InterfaceC3443
    /* JADX INFO: renamed from: ֫ */
    public final void mo6103(C2772 c2772, int i, long j) {
        C17474 c17474 = c2772.f4671;
        if (c17474 != null) {
            String strM33885 = this.f37938.m33885(c2772.f4668, c17474);
            HashMap map = this.f37954;
            Long l2 = (Long) map.get(strM33885);
            HashMap map2 = this.f37953;
            Long l3 = (Long) map2.get(strM33885);
            map.put(strM33885, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j));
            map2.put(strM33885, Long.valueOf((l3 != null ? l3.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // p067l.InterfaceC3443
    /* JADX INFO: renamed from: ֫ */
    public final void mo6104(C2772 c2772, C8758 c8758) {
        C17474 c17474 = c2772.f4671;
        if (c17474 == null) {
            return;
        }
        C10307 c10307 = c8758.f23741;
        c10307.getClass();
        int i = c8758.f23738;
        AbstractC6974 abstractC6974 = c2772.f4668;
        c17474.getClass();
        C8137 c8137 = new C8137(c10307, i, this.f37938.m33885(abstractC6974, c17474));
        int i2 = c8758.f23742;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f37941 = c8137;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f37943 = c8137;
                return;
            }
        }
        this.f37950 = c8137;
    }

    @Override // p067l.InterfaceC3443
    /* JADX INFO: renamed from: ֫ */
    public final void mo6107(C8454 c8454) {
        C8137 c8137 = this.f37950;
        if (c8137 != null) {
            C10307 c10307 = c8137.f21442;
            if (c10307.f28523 == -1) {
                C3601 c3601M23918 = c10307.m23918();
                c3601M23918.m6685(c8454.f22687);
                c3601M23918.m6689(c8454.f22685);
                this.f37950 = new C8137(c3601M23918.m6672(), c8137.f21443, c8137.f21444);
            }
        }
    }

    @Override // p067l.InterfaceC3443
    /* JADX INFO: renamed from: ֫ */
    public final void mo6108(C8758 c8758) {
        this.f37955 = c8758.f23736;
    }

    @Override // p067l.InterfaceC3443
    /* JADX INFO: renamed from: ֫ */
    public final void mo6109(C17702 c17702) {
        this.f37935 = c17702;
    }

    /* JADX WARN: Code duplicated, block: B:230:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:337:0x0524  */
    /* JADX WARN: Code duplicated, block: B:340:0x054d  */
    /* JADX WARN: Code duplicated, block: B:355:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, l.۠ᩴ֫] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r7v1 */
    @Override // p067l.InterfaceC3443
    /* JADX INFO: renamed from: ֫ */
    public final void mo6105(InterfaceC3621 interfaceC3621, C7467 c7467) {
        C14842 c14842;
        int i;
        boolean z;
        C14842 c14843;
        C12161 c12161;
        int i2;
        C12161 c12162;
        C12161 c12163;
        int i3;
        int i4;
        C10307 c10307;
        int i5;
        boolean z2;
        C7467 c7468;
        int i6;
        boolean z3;
        int i7;
        C21037 c21037;
        int i8;
        if (c7467.m17235() == 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            int iM17235 = c7467.m17235();
            c14842 = this.f37938;
            if (i9 >= iM17235) {
                break;
            }
            int iM17237 = c7467.m17237(i9);
            C2772 c2772M17238 = c7467.m17238(iM17237);
            if (iM17237 == 0) {
                c14842.m33890(c2772M17238);
            } else if (iM17237 == 11) {
                c14842.m33887(c2772M17238, this.f37951);
            } else {
                c14842.m33889(c2772M17238);
            }
            i9++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c7467.m17236(0)) {
            C2772 c2772M17239 = c7467.m17238(0);
            if (this.f37934 != null) {
                m30645(c2772M17239.f4668, c2772M17239.f4671);
            }
        }
        if (c7467.m17236(2) && this.f37934 != null) {
            AbstractC6767 abstractC6767ListIterator = interfaceC3621.mo6806().m35728().listIterator(0);
            loop1: while (true) {
                if (!abstractC6767ListIterator.hasNext()) {
                    c21037 = null;
                    break;
                }
                C24408 c24408 = (C24408) abstractC6767ListIterator.next();
                for (int i10 = 0; i10 < c24408.f77291; i10++) {
                    if (c24408.m53837(i10) && (c21037 = c24408.m53833(i10).f28516) != null) {
                        break loop1;
                    }
                }
            }
            if (c21037 != null) {
                PlaybackMetrics.Builder builder = this.f37934;
                int i11 = 0;
                while (true) {
                    if (i11 >= c21037.f66012) {
                        i8 = 1;
                        break;
                    }
                    UUID uuid = c21037.m47449(i11).f62957;
                    if (uuid.equals(C25059.f79955)) {
                        i8 = 3;
                        break;
                    } else if (uuid.equals(C25059.f79954)) {
                        i8 = 2;
                        break;
                    } else {
                        if (uuid.equals(C25059.f79952)) {
                            i8 = 6;
                            break;
                        }
                        i11++;
                    }
                }
                builder.setDrmType(i8);
            }
        }
        if (c7467.m17236(1011)) {
            this.f37946++;
        }
        C17702 c17702 = this.f37935;
        Context context = this.f37949;
        Executor executor = this.f37952;
        long j = this.f37948;
        if (c17702 == null) {
            i4 = 1;
            c14843 = c14842;
        } else {
            int i12 = c17702.f52873;
            boolean z4 = this.f37955 == 4;
            if (i12 == 1001) {
                c12161 = new C12161(20, 0);
                c14843 = c14842;
            } else {
                if (c17702 instanceof C19735) {
                    C19735 c19735 = (C19735) c17702;
                    z = c19735.f60029 == 1;
                    i = c19735.f60032;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = c17702.getCause();
                cause.getClass();
                c14843 = c14842;
                if (cause instanceof IOException) {
                    if (cause instanceof C24959) {
                        c12163 = new C12161(5, ((C24959) cause).f79694);
                        c12161 = c12163;
                    } else if ((cause instanceof C16241) || (cause instanceof C10998)) {
                        c12161 = new C12161(z4 ? 10 : 11, 0);
                    } else {
                        boolean z5 = cause instanceof C18924;
                        if (z5 || (cause instanceof C7525)) {
                            if (C12498.m28788(context).m28792() == 1) {
                                c12161 = new C12161(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    c12161 = new C12161(6, 0);
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    c12161 = new C12161(7, 0);
                                } else if (z5 && ((C18924) cause).f56468 == 1) {
                                    c12161 = new C12161(4, 0);
                                } else {
                                    c12161 = new C12161(8, 0);
                                }
                            }
                        } else if (i12 == 1002) {
                            c12161 = new C12161(21, 0);
                        } else if (cause instanceof C20684) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int iM12984 = C5792.m12984(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (C5792.m13029(iM12984)) {
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
                                c12162 = new C12161(i3, iM12984);
                                c12161 = c12162;
                            } else if (C6988.m16055(cause3)) {
                                c12161 = new C12161(27, 0);
                            } else if (cause3 instanceof NotProvisionedException) {
                                c12161 = new C12161(24, 0);
                            } else if (cause3 instanceof DeniedByServerException) {
                                c12161 = new C12161(29, 0);
                            } else if (cause3 instanceof C22182) {
                                c12161 = new C12161(23, 0);
                            } else if (cause3 instanceof C15988) {
                                c12161 = new C12161(28, 0);
                            } else {
                                c12161 = new C12161(30, 0);
                            }
                        } else if ((cause instanceof C12890) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                c12161 = new C12161(32, 0);
                            } else {
                                c12161 = new C12161(31, 0);
                            }
                        } else {
                            c12161 = new C12161(9, 0);
                        }
                    }
                } else if (z && (i == 0 || i == 1)) {
                    c12161 = new C12161(35, 0);
                } else if (z && i == 3) {
                    c12161 = new C12161(15, 0);
                } else if (z && i == 2) {
                    c12161 = new C12161(23, 0);
                } else {
                    if (cause instanceof C22064) {
                        c12163 = new C12161(13, C5792.m12984(((C22064) cause).f69417));
                    } else {
                        if (cause instanceof C19381) {
                            c12162 = new C12161(14, ((C19381) cause).f57866);
                        } else if (cause instanceof OutOfMemoryError) {
                            c12161 = new C12161(14, 0);
                        } else if (cause instanceof C16834) {
                            c12163 = new C12161(17, ((C16834) cause).f49832);
                        } else if (cause instanceof C21530) {
                            c12163 = new C12161(18, ((C21530) cause).f67924);
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (C5792.m13029(errorCode)) {
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
                            c12162 = new C12161(i2, errorCode);
                        } else {
                            c12161 = new C12161(22, 0);
                        }
                        c12161 = c12162;
                    }
                    c12161 = c12163;
                }
            }
            executor.execute(new RunnableC14172(0, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - j).setErrorCode(c12161.f34000).setSubErrorCode(c12161.f34001).setException(c17702).build()));
            i4 = 1;
            this.f37940 = true;
            this.f37935 = null;
        }
        if (c7467.m17236(2)) {
            C15690 c15690Mo6806 = interfaceC3621.mo6806();
            boolean zM35731 = c15690Mo6806.m35731(2);
            boolean zM35732 = c15690Mo6806.m35731(i4);
            boolean zM35733 = c15690Mo6806.m35731(3);
            if (zM35731 || zM35732 || zM35733) {
                if (zM35731) {
                    c10307 = 0;
                } else {
                    if (!C12826.equals(this.f37944, null)) {
                        int i13 = this.f37944 == null ? 1 : 0;
                        this.f37944 = null;
                        m30644(1, jElapsedRealtime, null, i13);
                    }
                    c10307 = 0;
                }
                if (!zM35732 && !C12826.equals(this.f37961, c10307)) {
                    int i14 = this.f37961 == null ? 1 : 0;
                    this.f37961 = c10307;
                    m30644(0, jElapsedRealtime, c10307, i14);
                }
                if (!zM35733 && !C12826.equals(this.f37945, c10307)) {
                    int i15 = this.f37945 == null ? 1 : 0;
                    this.f37945 = c10307;
                    m30644(2, jElapsedRealtime, c10307, i15);
                }
            } else {
                c10307 = 0;
            }
        } else {
            c10307 = 0;
        }
        if (m30651(this.f37950)) {
            C8137 c8137 = this.f37950;
            C10307 c10308 = c8137.f21442;
            if (c10308.f28523 != -1) {
                int i16 = c8137.f21443;
                if (!C12826.equals(this.f37944, c10308)) {
                    int i17 = (this.f37944 == null && i16 == 0) ? 1 : i16;
                    this.f37944 = c10308;
                    m30644(1, jElapsedRealtime, c10308, i17);
                }
                this.f37950 = c10307;
            }
        }
        if (m30651(this.f37941)) {
            C8137 c8138 = this.f37941;
            C10307 c10309 = c8138.f21442;
            int i18 = c8138.f21443;
            if (!C12826.equals(this.f37961, c10309)) {
                int i19 = (this.f37961 == null && i18 == 0) ? 1 : i18;
                this.f37961 = c10309;
                m30644(0, jElapsedRealtime, c10309, i19);
            }
            this.f37941 = c10307;
        }
        if (m30651(this.f37943)) {
            C8137 c8139 = this.f37943;
            C10307 c103010 = c8139.f21442;
            int i20 = c8139.f21443;
            if (!C12826.equals(this.f37945, c103010)) {
                int i21 = (this.f37945 == null && i20 == 0) ? 1 : i20;
                this.f37945 = c103010;
                m30644(2, jElapsedRealtime, c103010, i21);
            }
            this.f37943 = c10307;
        }
        switch (C12498.m28788(context).m28792()) {
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
        if (i5 != this.f37942) {
            this.f37942 = i5;
            executor.execute(new RunnableC21902(1, this, new NetworkEvent.Builder().setNetworkType(i5).setTimeSinceCreatedMillis(jElapsedRealtime - j).build()));
        }
        if (interfaceC3621.mo6835() != 2) {
            z2 = false;
            this.f37956 = false;
        } else {
            z2 = false;
        }
        if (interfaceC3621.mo6804() == null) {
            this.f37939 = z2;
            c7468 = c7467;
        } else {
            c7468 = c7467;
            if (c7468.m17236(10)) {
                this.f37939 = true;
            }
        }
        int iMo6835 = interfaceC3621.mo6835();
        if (this.f37956) {
            i7 = 5;
        } else if (this.f37939) {
            i7 = 13;
        } else if (iMo6835 == 4) {
            i7 = 11;
        } else {
            if (iMo6835 != 2) {
                if (iMo6835 == 3) {
                    if (interfaceC3621.mo6839()) {
                        i7 = interfaceC3621.mo6792() != 0 ? 9 : 3;
                    } else {
                        i7 = 4;
                    }
                } else {
                    i6 = (iMo6835 != 1 || this.f37958 == 0) ? this.f37958 : 12;
                    z3 = true;
                }
                if (this.f37958 != i6) {
                    this.f37958 = i6;
                    this.f37940 = z3;
                    executor.execute(new RunnableC20876(1, this, new PlaybackStateEvent.Builder().setState(this.f37958).setTimeSinceCreatedMillis(jElapsedRealtime - j).build()));
                }
                if (c7468.m17236(1028)) {
                    c14843.m33886(c7468.m17238(1028));
                }
            }
            int i22 = this.f37958;
            if (i22 == 0 || i22 == 2 || i22 == 12) {
                i7 = 2;
            } else if (interfaceC3621.mo6839()) {
                i7 = interfaceC3621.mo6792() != 0 ? 10 : 6;
            } else {
                i7 = 7;
            }
        }
        z3 = true;
        i6 = i7;
        if (this.f37958 != i6) {
            this.f37958 = i6;
            this.f37940 = z3;
            executor.execute(new RunnableC20876(1, this, new PlaybackStateEvent.Builder().setState(this.f37958).setTimeSinceCreatedMillis(jElapsedRealtime - j).build()));
        }
        if (c7468.m17236(1028)) {
            c14843.m33886(c7468.m17238(1028));
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: ֫ */
    private boolean m30651(C8137 c8137) {
        return c8137 != null && c8137.f21444.equals(this.f37938.m33884());
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30644(int i, long j, C10307 c10307, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.f37948);
        int i4 = 1;
        if (c10307 != null) {
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
            String str = c10307.f28520;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c10307.f28528;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c10307.f28533;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i5 = c10307.f28541;
            if (i5 != -1) {
                timeSinceCreatedMillis.setBitrate(i5);
            }
            int i6 = c10307.f28547;
            if (i6 != -1) {
                timeSinceCreatedMillis.setWidth(i6);
            }
            int i7 = c10307.f28523;
            if (i7 != -1) {
                timeSinceCreatedMillis.setHeight(i7);
            }
            int i8 = c10307.f28539;
            if (i8 != -1) {
                timeSinceCreatedMillis.setChannelCount(i8);
            }
            int i9 = c10307.f28538;
            if (i9 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i9);
            }
            String str4 = c10307.f28517;
            if (str4 != null) {
                String str5 = C5792.f14228;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c10307.f28510;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f37940 = true;
        this.f37952.execute(new RunnableC15504(i4, this, timeSinceCreatedMillis.build()));
    }

    @RequiresNonNull({"metricsBuilder"})
    /* JADX INFO: renamed from: ֫ */
    private void m30645(AbstractC6974 abstractC6974, C17474 c17474) {
        int iMo15978;
        PlaybackMetrics.Builder builder = this.f37934;
        if (c17474 == null || (iMo15978 = abstractC6974.mo15978(c17474.f52252)) == -1) {
            return;
        }
        C23738 c23738 = this.f37959;
        int i = 0;
        abstractC6974.mo15984(iMo15978, c23738, false);
        int i2 = c23738.f75532;
        C21727 c21727 = this.f37947;
        abstractC6974.m15986(i2, c21727);
        C13660 c13660 = c21727.f68429.f36611;
        if (c13660 != null) {
            int iM12982 = C5792.m12982(c13660.f38436, c13660.f38433);
            if (iM12982 == 0) {
                i = 3;
            } else if (iM12982 != 1) {
                i = iM12982 != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (c21727.f68431 != -9223372036854775807L && !c21727.f68432 && !c21727.f68435 && !c21727.m49010()) {
            builder.setMediaDurationMillis(C5792.m13013(c21727.f68431));
        }
        builder.setPlaybackType(c21727.m49010() ? 2 : 1);
        this.f37940 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m30652() {
        PlaybackMetrics.Builder builder = this.f37934;
        if (builder != null && this.f37940) {
            builder.setAudioUnderrunCount(this.f37946);
            this.f37934.setVideoFramesDropped(this.f37937);
            this.f37934.setVideoFramesPlayed(this.f37957);
            Long l2 = (Long) this.f37953.get(this.f37936);
            this.f37934.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = (Long) this.f37954.get(this.f37936);
            this.f37934.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.f37934.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            this.f37952.execute(new RunnableC4440(1, this, this.f37934.build()));
        }
        this.f37934 = null;
        this.f37936 = null;
        this.f37946 = 0;
        this.f37937 = 0;
        this.f37957 = 0;
        this.f37944 = null;
        this.f37961 = null;
        this.f37945 = null;
        this.f37940 = false;
    }
}
