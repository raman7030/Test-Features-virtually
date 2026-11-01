package p067l;

import android.app.Application;
import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۠֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18PZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9799 implements InterfaceC7669 {

    /* JADX INFO: renamed from: ۖ */
    public boolean f27101;

    /* JADX INFO: renamed from: ۘ */
    public final RunnableC20529 f27102;

    /* JADX INFO: renamed from: ۡ */
    public boolean f27104;

    /* JADX INFO: renamed from: ۢ */
    public C13010 f27105;

    /* JADX INFO: renamed from: ۧ */
    public volatile int f27106;

    /* JADX INFO: renamed from: ܳ */
    public boolean f27107;

    /* JADX INFO: renamed from: ܺ */
    public C13010 f27108;

    /* JADX INFO: renamed from: ܽ */
    public final C17984 f27109;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC21081 f27110;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f27112;

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC6324 f27113;

    /* JADX INFO: renamed from: ᩳ */
    public int f27111 = -1;

    /* JADX INFO: renamed from: ۜ */
    public final AtomicInteger f27103 = new AtomicInteger();

    public C9799(AbstractC15599 abstractC15599, C17984 c17984, InterfaceC21081 interfaceC21081) {
        this.f27110 = interfaceC21081;
        this.f27109 = c17984;
        Application applicationM16232 = C7050.m16232();
        C9736 c9736 = new C9736(applicationM16232);
        c9736.m22760();
        C20434 c20434 = new C20434();
        c20434.m46117();
        C23925 c23925 = new C23925(c17984, c20434);
        C17722 c17722 = new C17722(applicationM16232);
        c17722.m40275(c23925);
        c17722.m40274(c9736);
        InterfaceC6324 interfaceC6324M40273 = c17722.m40273();
        this.f27113 = interfaceC6324M40273;
        interfaceC6324M40273.mo6794(0);
        interfaceC6324M40273.mo6802(false);
        interfaceC6324M40273.mo6819(new C3093(this, interfaceC21081, c17984, abstractC15599));
        this.f27102 = new RunnableC20529(0, this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22868(C9799 c9799) {
        InterfaceC3621 interfaceC3621 = c9799.f27113;
        if (((AbstractC16341) interfaceC3621).isPlaying()) {
            int currentPosition = (int) interfaceC3621.getCurrentPosition();
            if (currentPosition != c9799.f27111) {
                c9799.f27111 = currentPosition;
                c9799.f27110.mo4936(currentPosition);
            }
            Handler handlerM16221 = C7050.m16221();
            RunnableC20529 runnableC20529 = c9799.f27102;
            handlerM16221.postAtTime(runnableC20529, runnableC20529, SystemClock.uptimeMillis() + 10);
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public static void m22876(C9799 c9799) {
        int currentPosition = (int) c9799.f27113.getCurrentPosition();
        if (currentPosition != c9799.f27111) {
            c9799.f27111 = currentPosition;
            c9799.f27110.mo4936(currentPosition);
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public static void m22881(C9799 c9799) {
        Handler handlerM16221 = C7050.m16221();
        RunnableC20529 runnableC20529 = c9799.f27102;
        handlerM16221.postAtTime(runnableC20529, runnableC20529, SystemClock.uptimeMillis() + 10);
    }

    /* JADX INFO: renamed from: ۖ */
    public static void m22874(C9799 c9799) {
        C7050.m16221().removeCallbacksAndMessages(c9799.f27102);
    }

    @Override // p067l.InterfaceC7669
    public final void reset() {
        this.f27106 = 0;
        this.f27103.incrementAndGet();
        this.f27104 = false;
        this.f27112 = false;
        this.f27108 = null;
        this.f27105 = null;
        C7050.m16221().removeCallbacksAndMessages(this.f27102);
        this.f27113.stop();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m22879(final C9799 c9799, final int i, final C13010 c13010, final C17095 c17095, final long j) {
        if (C12799.m29347()) {
            if (c9799.m22872(i)) {
                c9799.f27110.mo4934(c13010, c17095, j);
                return;
            }
            return;
        }
        C7050.m16212(new Runnable() { // from class: l.֡֡ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C9799.m22869(this.f3719, i, c13010, c17095, j);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m22869(C9799 c9799, int i, C13010 c13010, C17095 c17095, long j) {
        if (c9799.m22872(i)) {
            c9799.f27110.mo4934(c13010, c17095, j);
        }
    }

    @Override // p067l.InterfaceC7669
    public final int getCurrentPosition() {
        if (this.f27112) {
            return (int) Math.min(Math.max(this.f27113.getCurrentPosition(), 0L), 2147483647L);
        }
        return 0;
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ֫ */
    public final void mo17761(float f) {
        if (this.f27112) {
            InterfaceC6324 interfaceC6324 = this.f27113;
            if (interfaceC6324.mo6831().f11305 != f) {
                interfaceC6324.mo6800(new C4963(f));
            }
        }
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ֫ */
    public final void mo17762(int i, RunnableC18397 runnableC18397) {
        if (this.f27112) {
            ((AbstractC16341) this.f27113).seekTo(i);
            runnableC18397.run();
        }
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo17765() {
        return this.f27112;
    }

    @Override // p067l.InterfaceC7669
    public final void pause() {
        if (this.f27104) {
            return;
        }
        if (!this.f27112) {
            throw new IllegalStateException("MusicPlayer is not prepared");
        }
        this.f27107 = true;
        ((AbstractC16341) this.f27113).mo6802(false);
        this.f27110.mo4938(false);
    }

    @Override // p067l.InterfaceC7669
    public final void start() {
        if (this.f27104) {
            return;
        }
        if (!this.f27112) {
            throw new IllegalStateException("MusicPlayer is not prepared");
        }
        this.f27107 = false;
        ((AbstractC16341) this.f27113).mo6802(true);
        mo17761(C19799.f60214[C19799.m45024()]);
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ֫ */
    public final void mo17763(C13010 c13010) {
        if (this.f27104 || this.f27101) {
            throw new IllegalStateException();
        }
        this.f27104 = true;
        this.f27112 = false;
        this.f27105 = null;
        C7050.m16221().removeCallbacksAndMessages(this.f27102);
        this.f27113.stop();
        this.f27106 = this.f27103.incrementAndGet();
        this.f27108 = c13010;
        ((AbstractC16341) this.f27113).m37143(c13010);
        this.f27113.mo6816();
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo17766() {
        return this.f27104;
    }

    @Override // p067l.InterfaceC7669
    public final boolean isPlaying() {
        return this.f27113.isPlaying();
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ۧ */
    public final void mo17764() {
        AbstractC16341 abstractC16341 = (AbstractC16341) this.f27113;
        abstractC16341.seekTo(0L);
        if (this.f27107) {
            abstractC16341.mo6802(false);
        }
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ᩳ */
    public final void mo17767() {
        AbstractC16341 abstractC16341 = (AbstractC16341) this.f27113;
        abstractC16341.seekTo(0L);
        abstractC16341.mo6802(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ֫ */
    public final void mo17760() {
        InterfaceC6324 interfaceC6324 = this.f27113;
        if (this.f27101) {
            return;
        }
        this.f27106 = 0;
        this.f27103.incrementAndGet();
        C7050.m16221().removeCallbacksAndMessages(this.f27102);
        if (((AbstractC16341) interfaceC6324).isPlaying()) {
            interfaceC6324.stop();
        }
        this.f27104 = false;
        this.f27112 = false;
        this.f27108 = null;
        this.f27105 = null;
        interfaceC6324.mo14457();
        C17984 c17984 = this.f27109;
        c17984.m40967();
        c17984.m40965();
        this.f27101 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m22872(int i) {
        return i != 0 && !this.f27101 && i == this.f27106 && i == this.f27103.get();
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo17768() {
        return this.f27101;
    }
}
