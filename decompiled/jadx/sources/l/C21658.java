package l;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩸ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21658 implements InterfaceC5577 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f69493;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C15306 f69494;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f69495;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f69496;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f69497;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile int f69498;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19689 f69499;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C11197 f69500;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15306 f69501;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f69502;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16431 f69503;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f69504;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final RunnableC18836 f69505;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final MediaPlayer f69506;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f69507;

    public C21658(C16431 c16431, final InterfaceC19689 interfaceC19689) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f69506 = mediaPlayer;
        this.f69495 = true;
        this.f69502 = -1;
        this.f69497 = new AtomicInteger();
        this.f69499 = interfaceC19689;
        this.f69503 = c16431;
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: l.ۘܶۜ
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                C21658.m48921(this.f12753, interfaceC19689);
            }
        });
        this.f69505 = new RunnableC18836(0, this);
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: l.᩵ܶۜ
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return C21658.m48923(this.f63194, interfaceC19689, i, i2);
            }
        });
        mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: l.֡ܶۜ
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                C21658.m48924(this.f2114);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48921(C21658 c21658, InterfaceC19689 interfaceC19689) {
        synchronized (c21658) {
            C4925.m14324().removeCallbacksAndMessages(c21658.f69505);
            int currentPosition = c21658.f69506.getCurrentPosition();
            if (currentPosition != c21658.f69502 && currentPosition >= c21658.f69507) {
                c21658.f69507 = currentPosition;
                c21658.f69502 = currentPosition;
                ((C0637) c21658.f69499).mo2596(currentPosition);
            }
            ((C0637) interfaceC19689).mo2590();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48917(C21658 c21658) {
        synchronized (c21658) {
            if (c21658.isPlaying()) {
                int currentPosition = c21658.f69506.getCurrentPosition();
                if (currentPosition != c21658.f69502 && currentPosition >= c21658.f69507) {
                    c21658.f69507 = currentPosition;
                    c21658.f69502 = currentPosition;
                    ((C0637) c21658.f69499).mo2596(currentPosition);
                }
                Handler handlerM14324 = C4925.m14324();
                RunnableC18836 runnableC18836 = c21658.f69505;
                handlerM14324.postAtTime(runnableC18836, runnableC18836, SystemClock.uptimeMillis() + 10);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m48923(C21658 c21658, InterfaceC19689 interfaceC19689, int i, int i2) {
        C11197 c11197;
        if (!c21658.f69496 || (c11197 = c21658.f69500) == null) {
            return false;
        }
        c21658.f69496 = false;
        ((C8525) interfaceC19689).mo2593(c11197, new Exception(C18307.m42646("MediaPlayer error: what=", i, i2, ", extra=")));
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48924(C21658 c21658) {
        synchronized (c21658) {
            C15306 c15306 = c21658.f69501;
            if (c15306 == null) {
                return;
            }
            C15306 c15307 = c21658.f69494;
            if (c15307 != null) {
                c21658.f69501 = c15307;
                c21658.f69494 = null;
                c21658.f69506.seekTo(c15307.position());
            } else {
                c21658.f69501 = null;
            }
            Runnable runnableM36324 = c15306.m36324();
            if (runnableM36324 != null) {
                runnableM36324.run();
            }
        }
    }

    @Override // l.InterfaceC5577
    public final void reset() {
        this.f69498 = 0;
        this.f69497.incrementAndGet();
        synchronized (this) {
            this.f69501 = null;
            this.f69494 = null;
        }
        this.f69493 = false;
        this.f69496 = false;
        this.f69495 = true;
        this.f69500 = null;
        C4925.m14324().removeCallbacksAndMessages(this.f69505);
        try {
            this.f69506.reset();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48920(C21658 c21658, int i, C11197 c11197, C15495 c15495, long j) {
        if (c21658.m48922(i)) {
            ((C8525) c21658.f69499).mo2594(c11197, c15495, j);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48919(C21658 c21658, int i, C11197 c11197, Exception exc) {
        if (c21658.m48922(i)) {
            ((C8525) c21658.f69499).mo2597(c11197, exc);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48918(final C21658 c21658, final int i, final C11197 c11197) throws Throwable {
        C9398 c9398M24229;
        C16431 c16431 = c21658.f69503;
        MediaPlayer mediaPlayer = c21658.f69506;
        try {
            if (c21658.m48922(i)) {
                c21658.f69496 = false;
                synchronized (c21658) {
                    c21658.f69501 = null;
                    c21658.f69494 = null;
                }
                mediaPlayer.reset();
                InterfaceC17889 interfaceC17889M41812 = C17843.m41812(c11197);
                c16431.m38741(interfaceC17889M41812);
                if (c21658.m48922(i)) {
                    C23411 c23411M38738 = c16431.m38738(interfaceC17889M41812);
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(new C8252(c23411M38738, false));
                    C15495 c15495 = new C15495(c11197, mediaMetadataRetriever);
                    C0349.m1793(mediaMetadataRetriever);
                    if (c15495.f47383 && (c9398M24229 = C9398.m24229(c23411M38738)) != null) {
                        c15495 = new C15495(c11197, c9398M24229.m24233(), c9398M24229.m24231(), c9398M24229.m24232());
                    }
                    final C15495 c15496 = c15495;
                    if (!c21658.m48922(i)) {
                        C0349.m1793(c23411M38738);
                        return;
                    }
                    mediaPlayer.setDataSource(new C8252(c23411M38738, true));
                    mediaPlayer.prepare();
                    if (!c21658.m48922(i)) {
                        C0349.m1793(c23411M38738);
                        return;
                    }
                    mediaPlayer.setLooping(false);
                    c21658.f69502 = -1;
                    c21658.f69507 = 0;
                    c21658.f69500 = c11197;
                    c21658.f69493 = false;
                    c21658.f69496 = true;
                    final long duration = mediaPlayer.getDuration();
                    C4925.m14315(new Runnable() { // from class: l.֨ܶۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C21658.m48920(this.f4330, i, c11197, c15496, duration);
                        }
                    });
                    if (c21658.m48922(i)) {
                        c16431.m38744(interfaceC17889M41812);
                    }
                }
            }
        } catch (Exception e) {
            if (0 != 0) {
                C0349.m1793(null);
            }
            if (c21658.m48922(i)) {
                c21658.f69493 = false;
                C4925.m14315(new RunnableC17571(c21658, i, c11197, e, 1));
            }
        }
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ֫ */
    public final void mo15845() {
        MediaPlayer mediaPlayer = this.f69506;
        if (this.f69504) {
            return;
        }
        this.f69498 = 0;
        this.f69497.incrementAndGet();
        synchronized (this) {
            this.f69501 = null;
            this.f69494 = null;
        }
        C4925.m14324().removeCallbacksAndMessages(this.f69505);
        if (isPlaying()) {
            mediaPlayer.stop();
        }
        this.f69493 = false;
        this.f69496 = false;
        this.f69500 = null;
        this.f69504 = true;
        ExecutorService executorService = C1802.f6208;
        C11003.requireNonNull(mediaPlayer);
        executorService.execute(new RunnableC7412(5, mediaPlayer));
        C16431 c16431 = this.f69503;
        c16431.m38742();
        c16431.m38740();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m48922(int i) {
        return i != 0 && !this.f69504 && i == this.f69498 && i == this.f69497.get();
    }

    @Override // l.InterfaceC5577
    public final void pause() {
        if (this.f69504 || this.f69493) {
            return;
        }
        if (this.f69496) {
            try {
                if (this.f69495) {
                    return;
                }
                C4925.m14324().removeCallbacksAndMessages(this.f69505);
                this.f69506.pause();
                this.f69495 = true;
                ((C0637) this.f69499).mo2598(false);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    @Override // l.InterfaceC5577
    public final void start() {
        if (this.f69504 || this.f69493) {
            return;
        }
        if (this.f69496) {
            try {
                if (!isPlaying()) {
                    Handler handlerM14324 = C4925.m14324();
                    RunnableC18836 runnableC18836 = this.f69505;
                    handlerM14324.postAtTime(runnableC18836, runnableC18836, SystemClock.uptimeMillis() + 10);
                    this.f69506.start();
                    this.f69495 = false;
                    ((C0637) this.f69499).mo2598(true);
                    mo15846(C18340.f56996[C18340.m42762()]);
                    return;
                }
                this.f69495 = false;
                return;
            } catch (Exception unused) {
                return;
            }
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo15853() {
        return this.f69504;
    }

    @Override // l.InterfaceC5577
    public final int getCurrentPosition() {
        int iMax;
        if (this.f69496) {
            synchronized (this) {
                try {
                    try {
                        iMax = Math.max(this.f69506.getCurrentPosition(), 0);
                    } catch (IllegalStateException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iMax;
        }
        return 0;
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ֫ */
    public final void mo15846(float f) {
        if (!this.f69496 || this.f69495) {
            return;
        }
        MediaPlayer mediaPlayer = this.f69506;
        if (mediaPlayer.getPlaybackParams().getSpeed() != f) {
            PlaybackParams playbackParams = new PlaybackParams();
            playbackParams.setSpeed(f);
            try {
                mediaPlayer.setPlaybackParams(playbackParams);
            } catch (Exception unused) {
            }
        }
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ֫ */
    public final void mo15847(int i, RunnableC16865 runnableC16865) {
        if (this.f69496) {
            synchronized (this) {
                this.f69507 = i;
                C15306 c15306 = this.f69501;
                if (c15306 != null) {
                    if (i == c15306.position()) {
                        this.f69501 = new C15306(i, runnableC16865);
                        this.f69494 = null;
                    } else {
                        this.f69494 = new C15306(i, runnableC16865);
                    }
                } else {
                    this.f69501 = new C15306(i, runnableC16865);
                    this.f69506.seekTo(i);
                }
            }
        }
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo15850() {
        return this.f69496;
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ֫ */
    public final void mo15848(final C11197 c11197) {
        if (!this.f69493 && !this.f69504) {
            final int iIncrementAndGet = this.f69497.incrementAndGet();
            this.f69498 = iIncrementAndGet;
            this.f69500 = null;
            this.f69493 = true;
            this.f69495 = true;
            C4925.m14324().removeCallbacksAndMessages(this.f69505);
            C1802.f6208.execute(new Runnable() { // from class: l.ۚܶۜ
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    C21658.m48918(this.f16924, iIncrementAndGet, c11197);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo15851() {
        return this.f69493;
    }

    @Override // l.InterfaceC5577
    public final boolean isPlaying() {
        try {
            return this.f69496 && this.f69506.isPlaying();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ۧ */
    public final void mo15849() {
        synchronized (this) {
            mo15847(0, (RunnableC16865) null);
            if (this.f69495) {
                return;
            }
            Handler handlerM14324 = C4925.m14324();
            RunnableC18836 runnableC18836 = this.f69505;
            handlerM14324.postAtTime(runnableC18836, runnableC18836, SystemClock.uptimeMillis() + 10);
            this.f69506.start();
        }
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ᩳ */
    public final void mo15852() {
        synchronized (this) {
            mo15847(0, (RunnableC16865) null);
        }
    }
}
