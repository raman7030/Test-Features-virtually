package p067l;

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
public final class C12637 implements InterfaceC2577 {

    /* JADX INFO: renamed from: ֡ */
    public final InterfaceC13425 f35470;

    /* JADX INFO: renamed from: ֨ */
    public HandlerThread f35471;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC24863 f35472;

    /* JADX INFO: renamed from: ۖ */
    public final Looper f35473;

    /* JADX INFO: renamed from: ۘ */
    public final C15512 f35474;

    /* JADX INFO: renamed from: ۚ */
    public HandlerC24153 f35475;

    /* JADX INFO: renamed from: ۜ */
    public C20684 f35476;

    /* JADX INFO: renamed from: ۠ */
    public final HandlerC9401 f35477;

    /* JADX INFO: renamed from: ۡ */
    public byte[] f35478;

    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC9283 f35479;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC20446 f35480;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f35481;

    /* JADX INFO: renamed from: ܶ */
    public final List f35482;

    /* JADX INFO: renamed from: ܺ */
    public final boolean f35483;

    /* JADX INFO: renamed from: ܽ */
    public C7942 f35484;

    /* JADX INFO: renamed from: ܿ */
    public final C8593 f35485;

    /* JADX INFO: renamed from: ᩳ */
    public C15317 f35486;

    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC8060 f35487;

    /* JADX INFO: renamed from: ᩵ */
    public int f35488;

    /* JADX INFO: renamed from: ᩶ */
    public final UUID f35489;

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC12878 f35490;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f35491;

    /* JADX INFO: renamed from: ᩹ */
    public int f35492;

    /* JADX INFO: renamed from: ᩻ */
    public final HashMap f35493;

    public C12637(UUID uuid, InterfaceC9283 interfaceC9283, InterfaceC8060 interfaceC8060, InterfaceC13425 interfaceC13425, List list, boolean z, boolean z2, byte[] bArr, HashMap map, C18828 c18828, Looper looper, InterfaceC12878 interfaceC12878, C15512 c15512) {
        this.f35489 = uuid;
        this.f35487 = interfaceC8060;
        this.f35470 = interfaceC13425;
        this.f35479 = interfaceC9283;
        this.f35483 = z;
        this.f35481 = z2;
        if (bArr == null) {
            list.getClass();
            this.f35482 = C21562.unmodifiableList(list);
        } else {
            this.f35478 = bArr;
            this.f35482 = null;
        }
        this.f35493 = map;
        this.f35472 = c18828;
        this.f35485 = new C8593();
        this.f35490 = interfaceC12878;
        this.f35474 = c15512;
        this.f35492 = 2;
        this.f35473 = looper;
        this.f35477 = new HandlerC9401(this, looper);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29065(byte[] bArr) {
        m29056();
        return Arrays.equals(this.f35491, bArr);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m29066() {
        C15317 c15317Mo21491 = this.f35479.mo21491();
        this.f35486 = c15317Mo21491;
        HandlerC24153 handlerC24153 = this.f35475;
        String str = C5792.f14228;
        c15317Mo21491.getClass();
        handlerC24153.getClass();
        handlerC24153.obtainMessage(1, new C15435(C12782.m29334(), true, SystemClock.elapsedRealtime(), c15317Mo21491)).sendToTarget();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m29067() {
        if (m29062()) {
            m29054(true);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29064(Exception exc, boolean z) {
        m29051(z ? 1 : 3, exc);
    }

    @Override // p067l.InterfaceC2577
    public final int getState() {
        m29056();
        return this.f35492;
    }

    @Override // p067l.InterfaceC2577
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo3886() {
        m29056();
        return this.f35483;
    }

    @Override // p067l.InterfaceC2577
    public final C20684 getError() {
        m29056();
        if (this.f35492 == 1) {
            return this.f35476;
        }
        return null;
    }

    @Override // p067l.InterfaceC2577
    /* JADX INFO: renamed from: ֫ */
    public final UUID mo3882() {
        m29056();
        return this.f35489;
    }

    @Override // p067l.InterfaceC2577
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC20446 mo3887() {
        m29056();
        return this.f35480;
    }

    @Override // p067l.InterfaceC2577
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3884(String str) {
        m29056();
        byte[] bArr = this.f35491;
        C23877.m52958(bArr);
        return this.f35479.mo21490(str, bArr);
    }

    @Override // p067l.InterfaceC2577
    /* JADX INFO: renamed from: ֫ */
    public final void mo3883(C16658 c16658) {
        m29056();
        if (this.f35488 < 0) {
            C21334.m48347("Session reference count less than zero: " + this.f35488);
            this.f35488 = 0;
        }
        C8593 c8593 = this.f35485;
        if (c16658 != null) {
            c8593.m20005(c16658);
        }
        int i = this.f35488 + 1;
        this.f35488 = i;
        if (i == 1) {
            C23877.m52960(this.f35492 == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f35471 = handlerThread;
            handlerThread.start();
            this.f35475 = new HandlerC24153(this, this.f35471.getLooper());
            if (m29062()) {
                m29054(true);
            }
        } else if (c16658 != null && m29059() && c8593.m20006(c16658) == 1) {
            c16658.m37719(this.f35492);
        }
        C4590 c4590 = ((C17329) this.f35470).f51709;
        if (c4590.f10302 != -9223372036854775807L) {
            c4590.f10305.remove(this);
            Handler handler = c4590.f10294;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // p067l.InterfaceC2577
    /* JADX INFO: renamed from: ۧ */
    public final void mo3885(C16658 c16658) {
        m29056();
        int i = this.f35488;
        if (i <= 0) {
            C21334.m48347("release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f35488 = i2;
        if (i2 == 0) {
            this.f35492 = 0;
            String str = C5792.f14228;
            this.f35477.removeCallbacksAndMessages(null);
            this.f35475.m53403();
            this.f35475 = null;
            this.f35471.quit();
            this.f35471 = null;
            this.f35480 = null;
            this.f35476 = null;
            this.f35484 = null;
            this.f35486 = null;
            byte[] bArr = this.f35491;
            if (bArr != null) {
                this.f35479.mo21497(bArr);
                this.f35491 = null;
            }
        }
        if (c16658 != null) {
            C8593 c8593 = this.f35485;
            c8593.m20008(c16658);
            if (c8593.m20006(c16658) == 0) {
                c16658.m37724();
            }
        }
        int i3 = this.f35488;
        C4590 c4590 = ((C17329) this.f35470).f51709;
        if (i3 == 1 && c4590.f10295 > 0 && c4590.f10302 != -9223372036854775807L) {
            c4590.f10305.add(this);
            Handler handler = c4590.f10294;
            handler.getClass();
            handler.postAtTime(new Runnable() { // from class: l.ۡۛ֫
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29397.mo3885((C16658) null);
                }
            }, this, SystemClock.uptimeMillis() + c4590.f10302);
        } else if (i3 == 0) {
            c4590.f10311.remove(this);
            if (c4590.f10303 == this) {
                c4590.f10303 = null;
            }
            if (c4590.f10299 == this) {
                c4590.f10299 = null;
            }
            c4590.f10292.m26235(this);
            if (c4590.f10302 != -9223372036854775807L) {
                Handler handler2 = c4590.f10294;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                c4590.f10305.remove(this);
            }
        }
        c4590.m9690();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: ᩻ */
    private boolean m29062() {
        InterfaceC8060 interfaceC8060 = this.f35487;
        InterfaceC9283 interfaceC9283 = this.f35479;
        if (m29059()) {
            return true;
        }
        try {
            byte[] bArrMo21495 = interfaceC9283.mo21495();
            this.f35491 = bArrMo21495;
            interfaceC9283.mo21488(bArrMo21495, this.f35474);
            this.f35480 = interfaceC9283.mo21494(this.f35491);
            this.f35492 = 3;
            Iterator it = this.f35485.m20007().iterator();
            while (it.hasNext()) {
                ((C16658) it.next()).m37719(3);
            }
            this.f35491.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            ((C11296) interfaceC8060).m26236(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (C14647.m33512(e)) {
                ((C11296) interfaceC8060).m26236(this);
                return false;
            }
            m29051(1, e);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (C14647.m33512(e)) {
                ((C11296) interfaceC8060).m26236(this);
                return false;
            }
            m29051(1, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m29058(C12637 c12637, Object obj, Object obj2) {
        InterfaceC8060 interfaceC8060 = c12637.f35487;
        if (obj == c12637.f35486) {
            if (c12637.f35492 == 2 || c12637.m29059()) {
                c12637.f35486 = null;
                if (obj2 instanceof Exception) {
                    ((C11296) interfaceC8060).m26234((Exception) obj2, false);
                    return;
                }
                try {
                    c12637.f35479.mo21492((byte[]) obj2);
                    ((C11296) interfaceC8060).m26233();
                } catch (Exception e) {
                    ((C11296) interfaceC8060).m26234(e, true);
                }
            }
        }
    }

    @RequiresNonNull({"sessionId"})
    /* JADX INFO: renamed from: ֫ */
    private void m29054(boolean z) {
        long jMin;
        long j;
        if (this.f35481) {
            return;
        }
        byte[] bArr = this.f35491;
        String str = C5792.f14228;
        boolean z2 = true;
        if (this.f35478 == null) {
            m29055(bArr, 1, z);
            return;
        }
        int i = this.f35492;
        InterfaceC9283 interfaceC9283 = this.f35479;
        if (i != 4) {
            try {
                interfaceC9283.mo21489(this.f35491, this.f35478);
            } catch (Exception | NoSuchMethodError e) {
                m29051(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (C25059.f79955.equals(this.f35489)) {
            m29056();
            byte[] bArr2 = this.f35491;
            Pair pair = null;
            Map mapMo21484 = bArr2 == null ? null : interfaceC9283.mo21484(bArr2);
            if (mapMo21484 != null) {
                long j2 = -9223372036854775807L;
                try {
                    String str2 = (String) mapMo21484.get("LicenseDurationRemaining");
                    j = str2 != null ? Long.parseLong(str2) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j);
                try {
                    String str3 = (String) mapMo21484.get("PlaybackDurationRemaining");
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
            jMin = C14849.FOREVER_NS;
        }
        if (jMin <= 60) {
            C21334.m48345("Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            m29055(bArr, 2, z);
            return;
        }
        if (jMin <= 0) {
            m29051(2, new C16145());
            return;
        }
        this.f35492 = 4;
        Iterator it = this.f35485.m20007().iterator();
        while (it.hasNext()) {
            ((C16658) it.next()).m37723();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m29055(byte[] bArr, int i, boolean z) {
        try {
            C7942 c7942Mo21485 = this.f35479.mo21485(bArr, this.f35482, i, this.f35493);
            this.f35484 = c7942Mo21485;
            HandlerC24153 handlerC24153 = this.f35475;
            String str = C5792.f14228;
            c7942Mo21485.getClass();
            handlerC24153.getClass();
            handlerC24153.obtainMessage(2, new C15435(C12782.m29334(), z, SystemClock.elapsedRealtime(), c7942Mo21485)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m29052(e, true);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29053(C12637 c12637, Object obj, Object obj2) {
        C8593 c8593 = c12637.f35485;
        InterfaceC9283 interfaceC9283 = c12637.f35479;
        if (obj == c12637.f35484 && c12637.m29059()) {
            c12637.f35484 = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                c12637.m29052((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArrMo21493 = interfaceC9283.mo21493(c12637.f35491, (byte[]) obj2);
                if (c12637.f35478 != null && bArrMo21493 != null && bArrMo21493.length != 0) {
                    c12637.f35478 = bArrMo21493;
                }
                c12637.f35492 = 4;
                Iterator it = c8593.m20007().iterator();
                while (it.hasNext()) {
                    ((C16658) it.next()).m37718();
                }
            } catch (Exception | NoSuchMethodError e) {
                c12637.m29052(e, true);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29063(int i) {
        if (i == 2 && this.f35492 == 4) {
            String str = C5792.f14228;
            m29054(false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m29052(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || C14647.m33512(th)) {
            ((C11296) this.f35487).m26236(this);
        } else {
            m29051(z ? 1 : 2, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX INFO: renamed from: ֫ */
    private void m29051(int i, Throwable th) {
        int iM13029;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            iM13029 = C5792.m13029(C5792.m12984(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else if (Build.VERSION.SDK_INT >= 23 && C5260.m11338(th)) {
            iM13029 = 6006;
        } else if ((th instanceof NotProvisionedException) || C14647.m33512(th)) {
            iM13029 = 6002;
        } else if (th instanceof DeniedByServerException) {
            iM13029 = 6007;
        } else if (th instanceof C22182) {
            iM13029 = 6001;
        } else if (th instanceof C15988) {
            iM13029 = 6003;
        } else if (th instanceof C16145) {
            iM13029 = 6008;
        } else if (i == 1) {
            iM13029 = 6006;
        } else if (i == 2) {
            iM13029 = 6004;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException();
            }
            iM13029 = 6002;
        }
        this.f35476 = new C20684(iM13029, th);
        C21334.m48348("DRM session error", th);
        if (!(th instanceof Exception)) {
            if (th instanceof Error) {
                if (!C14647.m33514(th) && !C14647.m33512(th)) {
                    throw ((Error) th);
                }
            } else {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
        } else {
            Iterator it = this.f35485.m20007().iterator();
            while (it.hasNext()) {
                ((C16658) it.next()).m37721((Exception) th);
            }
        }
        if (this.f35492 != 4) {
            this.f35492 = 1;
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: ܳ */
    private boolean m29059() {
        int i = this.f35492;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: ۜ */
    private void m29056() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f35473;
        if (threadCurrentThread != looper.getThread()) {
            C21334.m48350("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
