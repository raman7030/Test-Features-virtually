package l;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes2.dex */
public final class C6988 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Object f21566 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f21567;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 f21568;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f21569 = C21100.f68053.incrementAndGet();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f21570 = -1;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C11197 f21571;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f21572;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f21573;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f21574;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23921 f21575;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18340 f21576;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f21577;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC5577 f21578;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f21579;

    public C6988(AbstractC13921 abstractC13921, List list, int i, boolean z) {
        InterfaceC5577 c7819;
        this.f21568 = abstractC13921;
        this.f21577 = z;
        C18340 c18340 = new C18340(this, list, i);
        this.f21576 = c18340;
        C14748 c14748 = new C14748(this);
        if (Build.VERSION.SDK_INT >= 23) {
            c7819 = new C15579(abstractC13921, c18340, c14748);
        } else {
            C16431 c16431 = new C16431(null, abstractC13921, c18340, EnumC10788.NORMAL, null);
            c16431.m38735(new C18403(c14748));
            c7819 = new C7819(abstractC13921, c16431, c14748);
        }
        this.f21578 = c7819;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18895(C6988 c6988, C23921 c23921, C11197 c11197) {
        InterfaceC5577 interfaceC5577 = c6988.f21578;
        if (c6988.f21575 == c23921 && C21100.f68050 == c6988 && !interfaceC5577.mo15853() && c6988.f21576.mo16333() == c11197) {
            c6988.f21575 = null;
            if (!c6988.f21573 || interfaceC5577.isPlaying() || c6988.m18908()) {
                return;
            }
            interfaceC5577.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m18908() {
        C23921 c23921 = this.f21575;
        return c23921 != null && c23921.m52686() == this.f21576.mo16333();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18894(C6988 c6988, int i, C11197 c11197, C8441 c8441) {
        if (i == c6988.f21567 && C21100.f68050 == c6988 && !c6988.f21578.mo15853() && c6988.f21576.mo16333() == c11197) {
            m18902(c8441.m22119());
            m18900(c8441.m22118());
            long jM22118 = c8441.m22118();
            int i2 = c6988.f21570;
            if (i2 <= 0) {
                i2 = 0;
            } else if (jM22118 > 0 && i2 >= jM22118) {
                c6988.f21570 = 0;
                if (c6988.f21577) {
                    C8399.m22004(c6988.f21568);
                }
                i2 = 0;
            }
            m18903(i2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m18902(C15495 c15495) {
        C21100.f68048.mo1669(c15495.f47382);
        C5242 c5242 = C21100.f68057;
        String str = c15495.f47381;
        c5242.mo1669(str);
        C21100.f68052.mo1669(str);
        C21100.f68046.mo1669(c15495.f47385);
        C21100.f68049.mo1669(c15495.f47380);
        C21100.f68047.mo1669(c15495.f47384);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m18900(long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        C21100.f68055.mo1669(Integer.valueOf((int) (j / 50)));
        C21100.f68045.mo1669(Integer.valueOf(C21100.m48011(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public void m18899() {
        InterfaceC5577 interfaceC5577 = this.f21578;
        if (interfaceC5577.mo15851()) {
            return;
        }
        this.f21567++;
        if (!this.f21579) {
            Application applicationM14335 = C4925.m14335();
            int i = ServiceC4166.f13587;
            C0881.m3232(applicationM14335, new Intent(applicationM14335, (Class<?>) ServiceC4166.class).putExtra("playbackSessionId", this.f21569));
            this.f21579 = true;
        }
        C11197 c11197Mo16333 = this.f21576.mo16333();
        C23921 c23921 = this.f21575;
        if (c23921 != null && c23921.m52686() != c11197Mo16333) {
            this.f21575 = null;
        }
        if (!interfaceC5577.mo15850() || this.f21571 != c11197Mo16333) {
            this.f21571 = null;
            Handler handlerM14324 = C4925.m14324();
            Object obj = f21566;
            handlerM14324.removeCallbacksAndMessages(obj);
            C4925.m14324().postAtTime(new RunnableC11222(0, c11197Mo16333), obj, SystemClock.uptimeMillis() + 400);
            interfaceC5577.mo15848(c11197Mo16333);
            return;
        }
        if (m18908()) {
            return;
        }
        interfaceC5577.start();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m18905(C6988 c6988) {
        if (c6988.m18908()) {
            return;
        }
        c6988.f21578.start();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18911(int i) {
        this.f21574 = false;
        int iM18906 = m18906(i);
        InterfaceC5577 interfaceC5577 = this.f21578;
        boolean zMo15850 = interfaceC5577.mo15850();
        AbstractC13921 abstractC13921 = this.f21568;
        boolean z = this.f21577;
        C18340 c18340 = this.f21576;
        if (!zMo15850) {
            if (interfaceC5577.mo15851() || this.f21570 < 0) {
                return;
            }
            this.f21570 = iM18906;
            m18903(iM18906);
            if (this.f21572 && z) {
                C8399.m22006(abstractC13921, c18340.mo16336(), iM18906);
                return;
            }
            return;
        }
        C11197 c11197Mo16333 = c18340.mo16333();
        C23921 c23921 = new C23921(c11197Mo16333, iM18906);
        this.f21575 = c23921;
        interfaceC5577.mo15847(iM18906, new RunnableC16865(this, c23921, c11197Mo16333));
        m18903(iM18906);
        if (this.f21572) {
            this.f21570 = iM18906;
            if (z) {
                C8399.m22006(abstractC13921, c18340.mo16336(), iM18906);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m18903(int i) {
        int i2 = i / 50;
        C5242 c5242 = C21100.f68051;
        Integer num = (Integer) c5242.m1662();
        C11003.requireNonNull(num);
        if (i2 != num.intValue()) {
            c5242.mo1669(Integer.valueOf(i2));
        }
        int iM48011 = C21100.m48011(i);
        C5242 c5243 = C21100.f68054;
        Integer num2 = (Integer) c5243.m1662();
        C11003.requireNonNull(num2);
        if (iM48011 != num2.intValue()) {
            c5243.mo1669(Integer.valueOf(iM48011));
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m18906(int i) {
        int iMax = Math.max(i, 0);
        Integer num = (Integer) C21100.f68055.m1662();
        return (num == null || num.intValue() <= 0) ? iMax : Math.min(iMax, num.intValue() * 50);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18912(boolean z) {
        InterfaceC5577 interfaceC5577 = this.f21578;
        if (interfaceC5577.mo15853()) {
            return;
        }
        C4925.m14324().removeCallbacksAndMessages(f21566);
        this.f21567++;
        this.f21575 = null;
        interfaceC5577.mo15845();
        C21100.m48021(this);
        if (z) {
            C2234.m7411(C4925.m14335()).m7415(new Intent("bin.mt.media.ACTION_MUSIC_PLAYER_STATE_RELEASED"));
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m18898() {
        InterfaceC5577 interfaceC5577 = this.f21578;
        return interfaceC5577.isPlaying() || interfaceC5577.mo15851() || m18908();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m18918() {
        this.f21573 = true;
        InterfaceC5577 interfaceC5577 = this.f21578;
        if (interfaceC5577.mo15851() || interfaceC5577.isPlaying()) {
            return;
        }
        m18899();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18910() {
        if (this.f21573 && m18898()) {
            this.f21573 = false;
            this.f21578.pause();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18913() {
        int currentPosition;
        if (this.f21573 && m18898()) {
            this.f21573 = false;
            InterfaceC5577 interfaceC5577 = this.f21578;
            interfaceC5577.pause();
            this.f21572 = true;
            if (m18908()) {
                currentPosition = this.f21575.position();
            } else {
                currentPosition = interfaceC5577.mo15850() ? interfaceC5577.getCurrentPosition() : Math.max(this.f21570, 0);
            }
            this.f21570 = currentPosition;
            if (this.f21577) {
                C8399.m22006(this.f21568, this.f21576.mo16336(), currentPosition);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18916() {
        if (this.f21573 && m18898()) {
            m18913();
        } else {
            m18918();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m18914(int i) {
        C18340 c18340 = this.f21576;
        if (c18340.mo16336() == i || this.f21578.mo15851()) {
            return false;
        }
        this.f21573 = true;
        c18340.m41815(i);
        m18899();
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m18917() {
        if (this.f21578.mo15851()) {
            return;
        }
        this.f21573 = true;
        this.f21576.mo16332();
        m18899();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m18915() {
        if (this.f21578.mo15851()) {
            return;
        }
        this.f21573 = true;
        this.f21576.mo16337();
        m18899();
    }
}
