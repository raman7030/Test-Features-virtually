package l;

import android.app.Application;
import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۠֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18PZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7819 implements InterfaceC5577 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f24185;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final RunnableC19109 f24186;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f24188;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C11197 f24189;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile int f24190;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f24191;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C11197 f24192;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16431 f24193;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19689 f24194;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f24196;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC4162 f24197;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f24195 = -1;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f24187 = new AtomicInteger();

    public C7819(AbstractC13921 abstractC13921, C16431 c16431, InterfaceC19689 interfaceC19689) {
        this.f24194 = interfaceC19689;
        this.f24193 = c16431;
        Application applicationM14335 = C4925.m14335();
        C7752 c7752 = new C7752(applicationM14335);
        c7752.m20779();
        C19008 c19008 = new C19008();
        c19008.m43849();
        C22682 c22682 = new C22682(c16431, c19008);
        C16155 c16155 = new C16155(applicationM14335);
        c16155.m38083(c22682);
        c16155.m38082(c7752);
        InterfaceC4162 interfaceC4162M38081 = c16155.m38081();
        this.f24197 = interfaceC4162M38081;
        interfaceC4162M38081.mo4562(0);
        interfaceC4162M38081.mo4570(false);
        interfaceC4162M38081.mo4587(new C0763(this, interfaceC19689, c16431, abstractC13921));
        this.f24186 = new RunnableC19109(0, this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20903(C7819 c7819) {
        InterfaceC1318 interfaceC1318 = c7819.f24197;
        if (((AbstractC14702) interfaceC1318).isPlaying()) {
            int currentPosition = (int) interfaceC1318.getCurrentPosition();
            if (currentPosition != c7819.f24195) {
                c7819.f24195 = currentPosition;
                c7819.f24194.mo2596(currentPosition);
            }
            Handler handlerM14324 = C4925.m14324();
            RunnableC19109 runnableC19109 = c7819.f24186;
            handlerM14324.postAtTime(runnableC19109, runnableC19109, SystemClock.uptimeMillis() + 10);
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static void m20911(C7819 c7819) {
        int currentPosition = (int) c7819.f24197.getCurrentPosition();
        if (currentPosition != c7819.f24195) {
            c7819.f24195 = currentPosition;
            c7819.f24194.mo2596(currentPosition);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m20916(C7819 c7819) {
        Handler handlerM14324 = C4925.m14324();
        RunnableC19109 runnableC19109 = c7819.f24186;
        handlerM14324.postAtTime(runnableC19109, runnableC19109, SystemClock.uptimeMillis() + 10);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m20909(C7819 c7819) {
        C4925.m14324().removeCallbacksAndMessages(c7819.f24186);
    }

    @Override // l.InterfaceC5577
    public final void reset() {
        this.f24190 = 0;
        this.f24187.incrementAndGet();
        this.f24188 = false;
        this.f24196 = false;
        this.f24192 = null;
        this.f24189 = null;
        C4925.m14324().removeCallbacksAndMessages(this.f24186);
        this.f24197.stop();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m20914(final C7819 c7819, final int i, final C11197 c11197, final C15495 c15495, final long j) {
        if (C10975.m27285()) {
            if (c7819.m20907(i)) {
                c7819.f24194.mo2594(c11197, c15495, j);
                return;
            }
            return;
        }
        C4925.m14315(new Runnable() { // from class: l.֡֡ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C7819.m20904(this.f943, i, c11197, c15495, j);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20904(C7819 c7819, int i, C11197 c11197, C15495 c15495, long j) {
        if (c7819.m20907(i)) {
            c7819.f24194.mo2594(c11197, c15495, j);
        }
    }

    @Override // l.InterfaceC5577
    public final int getCurrentPosition() {
        if (this.f24196) {
            return (int) Math.min(Math.max(this.f24197.getCurrentPosition(), 0L), 2147483647L);
        }
        return 0;
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ֫ */
    public final void mo15846(float f) {
        if (this.f24196) {
            InterfaceC4162 interfaceC4162 = this.f24197;
            if (interfaceC4162.mo4599().f8510 != f) {
                interfaceC4162.mo4568(new C2730(f));
            }
        }
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ֫ */
    public final void mo15847(int i, RunnableC16865 runnableC16865) {
        if (this.f24196) {
            ((AbstractC14702) this.f24197).seekTo(i);
            runnableC16865.run();
        }
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo15850() {
        return this.f24196;
    }

    @Override // l.InterfaceC5577
    public final void pause() {
        if (this.f24188) {
            return;
        }
        if (!this.f24196) {
            throw new IllegalStateException("MusicPlayer is not prepared");
        }
        this.f24191 = true;
        ((AbstractC14702) this.f24197).mo4570(false);
        this.f24194.mo2598(false);
    }

    @Override // l.InterfaceC5577
    public final void start() {
        if (this.f24188) {
            return;
        }
        if (!this.f24196) {
            throw new IllegalStateException("MusicPlayer is not prepared");
        }
        this.f24191 = false;
        ((AbstractC14702) this.f24197).mo4570(true);
        mo15846(C18340.f56996[C18340.m42762()]);
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ֫ */
    public final void mo15848(C11197 c11197) {
        if (this.f24188 || this.f24185) {
            throw new IllegalStateException();
        }
        this.f24188 = true;
        this.f24196 = false;
        this.f24189 = null;
        C4925.m14324().removeCallbacksAndMessages(this.f24186);
        this.f24197.stop();
        this.f24190 = this.f24187.incrementAndGet();
        this.f24192 = c11197;
        ((AbstractC14702) this.f24197).m34996(c11197);
        this.f24197.mo4584();
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo15851() {
        return this.f24188;
    }

    @Override // l.InterfaceC5577
    public final boolean isPlaying() {
        return this.f24197.isPlaying();
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ۧ */
    public final void mo15849() {
        AbstractC14702 abstractC14702 = (AbstractC14702) this.f24197;
        abstractC14702.seekTo(0L);
        if (this.f24191) {
            abstractC14702.mo4570(false);
        }
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ᩳ */
    public final void mo15852() {
        AbstractC14702 abstractC14702 = (AbstractC14702) this.f24197;
        abstractC14702.seekTo(0L);
        abstractC14702.mo4570(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ֫ */
    public final void mo15845() {
        InterfaceC4162 interfaceC4162 = this.f24197;
        if (this.f24185) {
            return;
        }
        this.f24190 = 0;
        this.f24187.incrementAndGet();
        C4925.m14324().removeCallbacksAndMessages(this.f24186);
        if (((AbstractC14702) interfaceC4162).isPlaying()) {
            interfaceC4162.stop();
        }
        this.f24188 = false;
        this.f24196 = false;
        this.f24192 = null;
        this.f24189 = null;
        interfaceC4162.mo12583();
        C16431 c16431 = this.f24193;
        c16431.m38742();
        c16431.m38740();
        this.f24185 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m20907(int i) {
        return i != 0 && !this.f24185 && i == this.f24190 && i == this.f24187.get();
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo15853() {
        return this.f24185;
    }
}
