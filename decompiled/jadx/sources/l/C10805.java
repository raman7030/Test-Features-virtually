package l;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ۧۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 58TM */
/* JADX INFO: loaded from: classes4.dex */
public final class C10805 implements InterfaceC0220 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC11634 f32494;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public HandlerThread f32495;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23669 f32496;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Looper f32497;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C13830 f32498;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HandlerC22922 f32499;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C19272 f32500;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final HandlerC7400 f32501;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f32502;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7276 f32503;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC19021 f32504;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f32505;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List f32506;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f32507;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5865 f32508;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6550 f32509;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C13625 f32510;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5989 f32511;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f32512;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final UUID f32513;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC11058 f32514;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f32515;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f32516;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashMap f32517;

    public C10805(UUID uuid, InterfaceC7276 interfaceC7276, InterfaceC5989 interfaceC5989, InterfaceC11634 interfaceC11634, List list, boolean z, boolean z2, byte[] bArr, HashMap map, C17319 c17319, Looper looper, InterfaceC11058 interfaceC11058, C13830 c13830) {
        this.f32513 = uuid;
        this.f32511 = interfaceC5989;
        this.f32494 = interfaceC11634;
        this.f32503 = interfaceC7276;
        this.f32507 = z;
        this.f32505 = z2;
        if (bArr == null) {
            list.getClass();
            this.f32506 = C20195.unmodifiableList(list);
        } else {
            this.f32502 = bArr;
            this.f32506 = null;
        }
        this.f32517 = map;
        this.f32496 = c17319;
        this.f32509 = new C6550();
        this.f32514 = interfaceC11058;
        this.f32498 = c13830;
        this.f32516 = 2;
        this.f32497 = looper;
        this.f32501 = new HandlerC7400(this, looper);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27020(byte[] bArr) {
        m27011();
        return Arrays.equals(this.f32515, bArr);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m27021() {
        C13625 c13625Mo19524 = this.f32503.mo19524();
        this.f32510 = c13625Mo19524;
        HandlerC22922 handlerC22922 = this.f32499;
        String str = C3603.f11424;
        c13625Mo19524.getClass();
        handlerC22922.getClass();
        handlerC22922.obtainMessage(1, new C13749(C10957.m27273(), true, SystemClock.elapsedRealtime(), c13625Mo19524)).sendToTarget();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m27022() {
        if (m27017()) {
            m27009(true);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27019(Exception exc, boolean z) {
        m27006(z ? 1 : 3, exc);
    }

    @Override // l.InterfaceC0220
    public final int getState() {
        m27011();
        return this.f32516;
    }

    @Override // l.InterfaceC0220
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo1473() {
        m27011();
        return this.f32507;
    }

    @Override // l.InterfaceC0220
    public final C19272 getError() {
        m27011();
        if (this.f32516 == 1) {
            return this.f32500;
        }
        return null;
    }

    @Override // l.InterfaceC0220
    /* JADX INFO: renamed from: ֫ */
    public final UUID mo1469() {
        m27011();
        return this.f32513;
    }

    @Override // l.InterfaceC0220
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC19021 mo1474() {
        m27011();
        return this.f32504;
    }

    @Override // l.InterfaceC0220
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1471(String str) {
        m27011();
        byte[] bArr = this.f32515;
        C22632.m50632(bArr);
        return this.f32503.mo19523(str, bArr);
    }

    @Override // l.InterfaceC0220
    /* JADX INFO: renamed from: ֫ */
    public final void mo1470(C15036 c15036) {
        m27011();
        if (this.f32512 < 0) {
            C19956.m46033("Session reference count less than zero: " + this.f32512);
            this.f32512 = 0;
        }
        C6550 c6550 = this.f32509;
        if (c15036 != null) {
            c6550.m18055(c15036);
        }
        int i = this.f32512 + 1;
        this.f32512 = i;
        if (i == 1) {
            C22632.m50634(this.f32516 == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f32495 = handlerThread;
            handlerThread.start();
            this.f32499 = new HandlerC22922(this, this.f32495.getLooper());
            if (m27017()) {
                m27009(true);
            }
        } else if (c15036 != null && m27014() && c6550.m18056(c15036) == 1) {
            c15036.m35562(this.f32516);
        }
        C2338 c2338 = ((C15742) this.f32494).f48569;
        if (c2338.f7511 != -9223372036854775807L) {
            c2338.f7514.remove(this);
            Handler handler = c2338.f7503;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // l.InterfaceC0220
    /* JADX INFO: renamed from: ۧ */
    public final void mo1472(C15036 c15036) {
        m27011();
        int i = this.f32512;
        if (i <= 0) {
            C19956.m46033("release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f32512 = i2;
        if (i2 == 0) {
            this.f32516 = 0;
            String str = C3603.f11424;
            this.f32501.removeCallbacksAndMessages(null);
            this.f32499.m51012();
            this.f32499 = null;
            this.f32495.quit();
            this.f32495 = null;
            this.f32504 = null;
            this.f32500 = null;
            this.f32508 = null;
            this.f32510 = null;
            byte[] bArr = this.f32515;
            if (bArr != null) {
                this.f32503.mo19530(bArr);
                this.f32515 = null;
            }
        }
        if (c15036 != null) {
            C6550 c6550 = this.f32509;
            c6550.m18058(c15036);
            if (c6550.m18056(c15036) == 0) {
                c15036.m35567();
            }
        }
        int i3 = this.f32512;
        C2338 c2338 = ((C15742) this.f32494).f48569;
        if (i3 == 1 && c2338.f7504 > 0 && c2338.f7511 != -9223372036854775807L) {
            c2338.f7514.add(this);
            Handler handler = c2338.f7503;
            handler.getClass();
            handler.postAtTime(new Runnable() { // from class: l.ۡۛ֫
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26472.mo1472((C15036) null);
                }
            }, this, SystemClock.uptimeMillis() + c2338.f7511);
        } else if (i3 == 0) {
            c2338.f7520.remove(this);
            if (c2338.f7512 == this) {
                c2338.f7512 = null;
            }
            if (c2338.f7508 == this) {
                c2338.f7508 = null;
            }
            c2338.f7501.m24225(this);
            if (c2338.f7511 != -9223372036854775807L) {
                Handler handler2 = c2338.f7503;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                c2338.f7514.remove(this);
            }
        }
        c2338.m7619();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m27017() {
        InterfaceC5989 interfaceC5989 = this.f32511;
        InterfaceC7276 interfaceC7276 = this.f32503;
        if (m27014()) {
            return true;
        }
        try {
            byte[] bArrMo19528 = interfaceC7276.mo19528();
            this.f32515 = bArrMo19528;
            interfaceC7276.mo19521(bArrMo19528, this.f32498);
            this.f32504 = interfaceC7276.mo19527(this.f32515);
            this.f32516 = 3;
            Iterator it = this.f32509.m18057().iterator();
            while (it.hasNext()) {
                ((C15036) it.next()).m35562(3);
            }
            this.f32515.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            ((C9394) interfaceC5989).m24226(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (C12920.m31426(e)) {
                ((C9394) interfaceC5989).m24226(this);
                return false;
            }
            m27006(1, e);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (C12920.m31426(e)) {
                ((C9394) interfaceC5989).m24226(this);
                return false;
            }
            m27006(1, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27013(C10805 c10805, Object obj, Object obj2) {
        InterfaceC5989 interfaceC5989 = c10805.f32511;
        if (obj == c10805.f32510) {
            if (c10805.f32516 == 2 || c10805.m27014()) {
                c10805.f32510 = null;
                if (obj2 instanceof Exception) {
                    ((C9394) interfaceC5989).m24224((Exception) obj2, false);
                    return;
                }
                try {
                    c10805.f32503.mo19525((byte[]) obj2);
                    ((C9394) interfaceC5989).m24223();
                } catch (Exception e) {
                    ((C9394) interfaceC5989).m24224(e, true);
                }
            }
        }
    }

    @RequiresNonNull({"sessionId"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27009(boolean z) {
        long jMin;
        long j;
        if (this.f32505) {
            return;
        }
        byte[] bArr = this.f32515;
        String str = C3603.f11424;
        boolean z2 = true;
        if (this.f32502 == null) {
            m27010(bArr, 1, z);
            return;
        }
        int i = this.f32516;
        InterfaceC7276 interfaceC7276 = this.f32503;
        if (i != 4) {
            try {
                interfaceC7276.mo19522(this.f32515, this.f32502);
            } catch (Exception | NoSuchMethodError e) {
                m27006(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (C23875.f77203.equals(this.f32513)) {
            m27011();
            byte[] bArr2 = this.f32515;
            Pair pair = null;
            Map mapMo19517 = bArr2 == null ? null : interfaceC7276.mo19517(bArr2);
            if (mapMo19517 != null) {
                long j2 = -9223372036854775807L;
                try {
                    String str2 = (String) mapMo19517.get("LicenseDurationRemaining");
                    j = str2 != null ? Long.parseLong(str2) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j);
                try {
                    String str3 = (String) mapMo19517.get("PlaybackDurationRemaining");
                    if (str3 != null) {
                        j2 = Long.parseLong(str3);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j2));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = C13132.FOREVER_NS;
        }
        if (jMin <= 60) {
            C19956.m46031("Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            m27010(bArr, 2, z);
            return;
        }
        if (jMin <= 0) {
            m27006(2, new C14496());
            return;
        }
        this.f32516 = 4;
        Iterator it = this.f32509.m18057().iterator();
        while (it.hasNext()) {
            ((C15036) it.next()).m35566();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27010(byte[] bArr, int i, boolean z) {
        try {
            C5865 c5865Mo19518 = this.f32503.mo19518(bArr, this.f32506, i, this.f32517);
            this.f32508 = c5865Mo19518;
            HandlerC22922 handlerC22922 = this.f32499;
            String str = C3603.f11424;
            c5865Mo19518.getClass();
            handlerC22922.getClass();
            handlerC22922.obtainMessage(2, new C13749(C10957.m27273(), z, SystemClock.elapsedRealtime(), c5865Mo19518)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m27007(e, true);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27008(C10805 c10805, Object obj, Object obj2) {
        C6550 c6550 = c10805.f32509;
        InterfaceC7276 interfaceC7276 = c10805.f32503;
        if (obj == c10805.f32508 && c10805.m27014()) {
            c10805.f32508 = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                c10805.m27007((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArrMo19526 = interfaceC7276.mo19526(c10805.f32515, (byte[]) obj2);
                if (c10805.f32502 != null && bArrMo19526 != null && bArrMo19526.length != 0) {
                    c10805.f32502 = bArrMo19526;
                }
                c10805.f32516 = 4;
                Iterator it = c6550.m18057().iterator();
                while (it.hasNext()) {
                    ((C15036) it.next()).m35561();
                }
            } catch (Exception | NoSuchMethodError e) {
                c10805.m27007(e, true);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27018(int i) {
        if (i == 2 && this.f32516 == 4) {
            String str = C3603.f11424;
            m27009(false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27007(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || C12920.m31426(th)) {
            ((C9394) this.f32511).m24226(this);
        } else {
            m27006(z ? 1 : 2, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27006(int i, Throwable th) {
        int iM11053;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            iM11053 = C3603.m11053(C3603.m11008(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else if (Build.VERSION.SDK_INT >= 23 && C3043.m9296(th)) {
            iM11053 = 6006;
        } else if ((th instanceof NotProvisionedException) || C12920.m31426(th)) {
            iM11053 = 6002;
        } else if (th instanceof DeniedByServerException) {
            iM11053 = 6007;
        } else if (th instanceof C20848) {
            iM11053 = 6001;
        } else if (th instanceof C14331) {
            iM11053 = 6003;
        } else if (th instanceof C14496) {
            iM11053 = 6008;
        } else if (i == 1) {
            iM11053 = 6006;
        } else if (i == 2) {
            iM11053 = 6004;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException();
            }
            iM11053 = 6002;
        }
        this.f32500 = new C19272(iM11053, th);
        C19956.m46034("DRM session error", th);
        if (!(th instanceof Exception)) {
            if (th instanceof Error) {
                if (!C12920.m31428(th) && !C12920.m31426(th)) {
                    throw ((Error) th);
                }
            } else {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
        } else {
            Iterator it = this.f32509.m18057().iterator();
            while (it.hasNext()) {
                ((C15036) it.next()).m35564((Exception) th);
            }
        }
        if (this.f32516 != 4) {
            this.f32516 = 1;
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m27014() {
        int i = this.f32516;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m27011() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f32497;
        if (threadCurrentThread != looper.getThread()) {
            C19956.m46036("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
