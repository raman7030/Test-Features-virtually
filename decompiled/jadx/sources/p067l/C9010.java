package p067l;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes2.dex */
public final class C9010 {

    /* JADX INFO: renamed from: ۘ */
    public static final Object f24446 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public int f24447;

    /* JADX INFO: renamed from: ۖ */
    public final AbstractC15599 f24448;

    /* JADX INFO: renamed from: ۜ */
    public final long f24449 = C22422.f70735.incrementAndGet();

    /* JADX INFO: renamed from: ۡ */
    public int f24450 = -1;

    /* JADX INFO: renamed from: ۢ */
    public C13010 f24451;

    /* JADX INFO: renamed from: ۧ */
    public boolean f24452;

    /* JADX INFO: renamed from: ܳ */
    public boolean f24453;

    /* JADX INFO: renamed from: ܺ */
    public boolean f24454;

    /* JADX INFO: renamed from: ܽ */
    public C25103 f24455;

    /* JADX INFO: renamed from: ܿ */
    public final C19799 f24456;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f24457;

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC7669 f24458;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f24459;

    public C9010(AbstractC15599 abstractC15599, List list, int i, boolean z) {
        InterfaceC7669 c9799;
        this.f24448 = abstractC15599;
        this.f24457 = z;
        C19799 c19799 = new C19799(this, list, i);
        this.f24456 = c19799;
        C16385 c16385 = new C16385(this);
        if (Build.VERSION.SDK_INT >= 23) {
            c9799 = new C17174(abstractC15599, c19799, c16385);
        } else {
            C17984 c17984 = new C17984(null, abstractC15599, c19799, EnumC12621.NORMAL, null);
            c17984.m40960(new C19858(c16385));
            c9799 = new C9799(abstractC15599, c17984, c16385);
        }
        this.f24458 = c9799;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20849(C9010 c9010, C25103 c25103, C13010 c13010) {
        InterfaceC7669 interfaceC7669 = c9010.f24458;
        if (c9010.f24455 == c25103 && C22422.f70732 == c9010 && !interfaceC7669.mo17768() && c9010.f24456.mo18258() == c13010) {
            c9010.f24455 = null;
            if (!c9010.f24453 || interfaceC7669.isPlaying() || c9010.m20862()) {
                return;
            }
            interfaceC7669.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ */
    public boolean m20862() {
        C25103 c25103 = this.f24455;
        return c25103 != null && c25103.m55092() == this.f24456.mo18258();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20848(C9010 c9010, int i, C13010 c13010, C10391 c10391) {
        if (i == c9010.f24447 && C22422.f70732 == c9010 && !c9010.f24458.mo17768() && c9010.f24456.mo18258() == c13010) {
            m20856(c10391.m24088());
            m20854(c10391.m24087());
            long jM24087 = c10391.m24087();
            int i2 = c9010.f24450;
            if (i2 <= 0) {
                i2 = 0;
            } else if (jM24087 > 0 && i2 >= jM24087) {
                c9010.f24450 = 0;
                if (c9010.f24457) {
                    C10351.m23974(c9010.f24448);
                }
                i2 = 0;
            }
            m20857(i2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m20856(C17095 c17095) {
        C22422.f70730.mo4067(c17095.f50513);
        C7350 c7350 = C22422.f70739;
        String str = c17095.f50512;
        c7350.mo4067(str);
        C22422.f70734.mo4067(str);
        C22422.f70728.mo4067(c17095.f50516);
        C22422.f70731.mo4067(c17095.f50511);
        C22422.f70729.mo4067(c17095.f50515);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m20854(long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        C22422.f70737.mo4067(Integer.valueOf((int) (j / 50)));
        C22422.f70727.mo4067(Integer.valueOf(C22422.m50341(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢ */
    public void m20853() {
        InterfaceC7669 interfaceC7669 = this.f24458;
        if (interfaceC7669.mo17766()) {
            return;
        }
        this.f24447++;
        if (!this.f24459) {
            Application applicationM16232 = C7050.m16232();
            int i = ServiceC6328.f16400;
            C0886.m5546(applicationM16232, new Intent(applicationM16232, (Class<?>) ServiceC6328.class).putExtra("playbackSessionId", this.f24449));
            this.f24459 = true;
        }
        C13010 c13010Mo18258 = this.f24456.mo18258();
        C25103 c25103 = this.f24455;
        if (c25103 != null && c25103.m55092() != c13010Mo18258) {
            this.f24455 = null;
        }
        if (!interfaceC7669.mo17765() || this.f24451 != c13010Mo18258) {
            this.f24451 = null;
            Handler handlerM16221 = C7050.m16221();
            Object obj = f24446;
            handlerM16221.removeCallbacksAndMessages(obj);
            C7050.m16221().postAtTime(new RunnableC13034(0, c13010Mo18258), obj, SystemClock.uptimeMillis() + 400);
            interfaceC7669.mo17763(c13010Mo18258);
            return;
        }
        if (m20862()) {
            return;
        }
        interfaceC7669.start();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m20859(C9010 c9010) {
        if (c9010.m20862()) {
            return;
        }
        c9010.f24458.start();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20865(int i) {
        this.f24454 = false;
        int iM20860 = m20860(i);
        InterfaceC7669 interfaceC7669 = this.f24458;
        boolean zMo17765 = interfaceC7669.mo17765();
        AbstractC15599 abstractC15599 = this.f24448;
        boolean z = this.f24457;
        C19799 c19799 = this.f24456;
        if (!zMo17765) {
            if (interfaceC7669.mo17766() || this.f24450 < 0) {
                return;
            }
            this.f24450 = iM20860;
            m20857(iM20860);
            if (this.f24452 && z) {
                C10351.m23976(abstractC15599, c19799.mo18261(), iM20860);
                return;
            }
            return;
        }
        C13010 c13010Mo18258 = c19799.mo18258();
        C25103 c25103 = new C25103(c13010Mo18258, iM20860);
        this.f24455 = c25103;
        interfaceC7669.mo17762(iM20860, new RunnableC18397(this, c25103, c13010Mo18258));
        m20857(iM20860);
        if (this.f24452) {
            this.f24450 = iM20860;
            if (z) {
                C10351.m23976(abstractC15599, c19799.mo18261(), iM20860);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m20857(int i) {
        int i2 = i / 50;
        C7350 c7350 = C22422.f70733;
        Integer num = (Integer) c7350.m4060();
        C12826.requireNonNull(num);
        if (i2 != num.intValue()) {
            c7350.mo4067(Integer.valueOf(i2));
        }
        int iM50341 = C22422.m50341(i);
        C7350 c7351 = C22422.f70736;
        Integer num2 = (Integer) c7351.m4060();
        C12826.requireNonNull(num2);
        if (iM50341 != num2.intValue()) {
            c7351.mo4067(Integer.valueOf(iM50341));
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m20860(int i) {
        int iMax = Math.max(i, 0);
        Integer num = (Integer) C22422.f70737.m4060();
        return (num == null || num.intValue() <= 0) ? iMax : Math.min(iMax, num.intValue() * 50);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20866(boolean z) {
        InterfaceC7669 interfaceC7669 = this.f24458;
        if (interfaceC7669.mo17768()) {
            return;
        }
        C7050.m16221().removeCallbacksAndMessages(f24446);
        this.f24447++;
        this.f24455 = null;
        interfaceC7669.mo17760();
        C22422.m50351(this);
        if (z) {
            C4491.m9493(C7050.m16232()).m9497(new Intent("bin.mt.media.ACTION_MUSIC_PLAYER_STATE_RELEASED"));
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private boolean m20852() {
        InterfaceC7669 interfaceC7669 = this.f24458;
        return interfaceC7669.isPlaying() || interfaceC7669.mo17766() || m20862();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m20872() {
        this.f24453 = true;
        InterfaceC7669 interfaceC7669 = this.f24458;
        if (interfaceC7669.mo17766() || interfaceC7669.isPlaying()) {
            return;
        }
        m20853();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20864() {
        if (this.f24453 && m20852()) {
            this.f24453 = false;
            this.f24458.pause();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20867() {
        int currentPosition;
        if (this.f24453 && m20852()) {
            this.f24453 = false;
            InterfaceC7669 interfaceC7669 = this.f24458;
            interfaceC7669.pause();
            this.f24452 = true;
            if (m20862()) {
                currentPosition = this.f24455.position();
            } else {
                currentPosition = interfaceC7669.mo17765() ? interfaceC7669.getCurrentPosition() : Math.max(this.f24450, 0);
            }
            this.f24450 = currentPosition;
            if (this.f24457) {
                C10351.m23976(this.f24448, this.f24456.mo18261(), currentPosition);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m20870() {
        if (this.f24453 && m20852()) {
            m20867();
        } else {
            m20872();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m20868(int i) {
        C19799 c19799 = this.f24456;
        if (c19799.mo18261() == i || this.f24458.mo17766()) {
            return false;
        }
        this.f24453 = true;
        c19799.m44061(i);
        m20853();
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m20871() {
        if (this.f24458.mo17766()) {
            return;
        }
        this.f24453 = true;
        this.f24456.mo18257();
        m20853();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m20869() {
        if (this.f24458.mo17766()) {
            return;
        }
        this.f24453 = true;
        this.f24456.mo18262();
        m20853();
    }
}
