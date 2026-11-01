package p067l;

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
public final class C22952 implements InterfaceC7669 {

    /* JADX INFO: renamed from: ۖ */
    public boolean f72197;

    /* JADX INFO: renamed from: ۘ */
    public C16915 f72198;

    /* JADX INFO: renamed from: ۜ */
    public boolean f72199;

    /* JADX INFO: renamed from: ۡ */
    public boolean f72200;

    /* JADX INFO: renamed from: ۢ */
    public final AtomicInteger f72201;

    /* JADX INFO: renamed from: ۧ */
    public volatile int f72202;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC21081 f72203;

    /* JADX INFO: renamed from: ܺ */
    public C13010 f72204;

    /* JADX INFO: renamed from: ܽ */
    public C16915 f72205;

    /* JADX INFO: renamed from: ܿ */
    public int f72206;

    /* JADX INFO: renamed from: ᩳ */
    public final C17984 f72207;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f72208;

    /* JADX INFO: renamed from: ᩵ */
    public final RunnableC20270 f72209;

    /* JADX INFO: renamed from: ᩷ */
    public final MediaPlayer f72210;

    /* JADX INFO: renamed from: ᩻ */
    public int f72211;

    public C22952(C17984 c17984, final InterfaceC21081 interfaceC21081) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f72210 = mediaPlayer;
        this.f72199 = true;
        this.f72206 = -1;
        this.f72201 = new AtomicInteger();
        this.f72203 = interfaceC21081;
        this.f72207 = c17984;
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: l.ۘܶۜ
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                C22952.m51270(this.f15568, interfaceC21081);
            }
        });
        this.f72209 = new RunnableC20270(0, this);
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: l.᩵ܶۜ
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return C22952.m51272(this.f65814, interfaceC21081, i, i2);
            }
        });
        mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: l.֡ܶۜ
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                C22952.m51273(this.f4886);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51270(C22952 c22952, InterfaceC21081 interfaceC21081) {
        synchronized (c22952) {
            C7050.m16221().removeCallbacksAndMessages(c22952.f72209);
            int currentPosition = c22952.f72210.getCurrentPosition();
            if (currentPosition != c22952.f72206 && currentPosition >= c22952.f72211) {
                c22952.f72211 = currentPosition;
                c22952.f72206 = currentPosition;
                ((C2974) c22952.f72203).mo4936(currentPosition);
            }
            ((C2974) interfaceC21081).mo4930();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51266(C22952 c22952) {
        synchronized (c22952) {
            if (c22952.isPlaying()) {
                int currentPosition = c22952.f72210.getCurrentPosition();
                if (currentPosition != c22952.f72206 && currentPosition >= c22952.f72211) {
                    c22952.f72211 = currentPosition;
                    c22952.f72206 = currentPosition;
                    ((C2974) c22952.f72203).mo4936(currentPosition);
                }
                Handler handlerM16221 = C7050.m16221();
                RunnableC20270 runnableC20270 = c22952.f72209;
                handlerM16221.postAtTime(runnableC20270, runnableC20270, SystemClock.uptimeMillis() + 10);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m51272(C22952 c22952, InterfaceC21081 interfaceC21081, int i, int i2) {
        C13010 c13010;
        if (!c22952.f72200 || (c13010 = c22952.f72204) == null) {
            return false;
        }
        c22952.f72200 = false;
        ((C10470) interfaceC21081).mo4933(c13010, new Exception(C19768.m44907("MediaPlayer error: what=", i, i2, ", extra=")));
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m51273(C22952 c22952) {
        synchronized (c22952) {
            C16915 c16915 = c22952.f72205;
            if (c16915 == null) {
                return;
            }
            C16915 c16916 = c22952.f72198;
            if (c16916 != null) {
                c22952.f72205 = c16916;
                c22952.f72198 = null;
                c22952.f72210.seekTo(c16916.position());
            } else {
                c22952.f72205 = null;
            }
            Runnable runnableM38486 = c16915.m38486();
            if (runnableM38486 != null) {
                runnableM38486.run();
            }
        }
    }

    @Override // p067l.InterfaceC7669
    public final void reset() {
        this.f72202 = 0;
        this.f72201.incrementAndGet();
        synchronized (this) {
            this.f72205 = null;
            this.f72198 = null;
        }
        this.f72197 = false;
        this.f72200 = false;
        this.f72199 = true;
        this.f72204 = null;
        C7050.m16221().removeCallbacksAndMessages(this.f72209);
        try {
            this.f72210.reset();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m51269(C22952 c22952, int i, C13010 c13010, C17095 c17095, long j) {
        if (c22952.m51271(i)) {
            ((C10470) c22952.f72203).mo4934(c13010, c17095, j);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m51268(C22952 c22952, int i, C13010 c13010, Exception exc) {
        if (c22952.m51271(i)) {
            ((C10470) c22952.f72203).mo4937(c13010, exc);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51267(final C22952 c22952, final int i, final C13010 c13010) throws Throwable {
        C11300 c11300M26239;
        C17984 c17984 = c22952.f72207;
        MediaPlayer mediaPlayer = c22952.f72210;
        try {
            if (c22952.m51271(i)) {
                c22952.f72200 = false;
                synchronized (c22952) {
                    c22952.f72205 = null;
                    c22952.f72198 = null;
                }
                mediaPlayer.reset();
                InterfaceC19370 interfaceC19370M44058 = C19326.m44058(c13010);
                c17984.m40966(interfaceC19370M44058);
                if (c22952.m51271(i)) {
                    C24618 c24618M40963 = c17984.m40963(interfaceC19370M44058);
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(new C10211(c24618M40963, false));
                    C17095 c17095 = new C17095(c13010, mediaMetadataRetriever);
                    C2700.m4192(mediaMetadataRetriever);
                    if (c17095.f50514 && (c11300M26239 = C11300.m26239(c24618M40963)) != null) {
                        c17095 = new C17095(c13010, c11300M26239.m26243(), c11300M26239.m26241(), c11300M26239.m26242());
                    }
                    final C17095 c17096 = c17095;
                    if (!c22952.m51271(i)) {
                        C2700.m4192(c24618M40963);
                        return;
                    }
                    mediaPlayer.setDataSource(new C10211(c24618M40963, true));
                    mediaPlayer.prepare();
                    if (!c22952.m51271(i)) {
                        C2700.m4192(c24618M40963);
                        return;
                    }
                    mediaPlayer.setLooping(false);
                    c22952.f72206 = -1;
                    c22952.f72211 = 0;
                    c22952.f72204 = c13010;
                    c22952.f72197 = false;
                    c22952.f72200 = true;
                    final long duration = mediaPlayer.getDuration();
                    C7050.m16212(new Runnable() { // from class: l.֨ܶۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22952.m51269(this.f7099, i, c13010, c17096, duration);
                        }
                    });
                    if (c22952.m51271(i)) {
                        c17984.m40969(interfaceC19370M44058);
                    }
                }
            }
        } catch (Exception e) {
            if (0 != 0) {
                C2700.m4192(null);
            }
            if (c22952.m51271(i)) {
                c22952.f72197 = false;
                C7050.m16212(new RunnableC19068(c22952, i, c13010, e, 1));
            }
        }
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ֫ */
    public final void mo17760() {
        MediaPlayer mediaPlayer = this.f72210;
        if (this.f72208) {
            return;
        }
        this.f72202 = 0;
        this.f72201.incrementAndGet();
        synchronized (this) {
            this.f72205 = null;
            this.f72198 = null;
        }
        C7050.m16221().removeCallbacksAndMessages(this.f72209);
        if (isPlaying()) {
            mediaPlayer.stop();
        }
        this.f72197 = false;
        this.f72200 = false;
        this.f72204 = null;
        this.f72208 = true;
        ExecutorService executorService = C4081.f8987;
        C12826.requireNonNull(mediaPlayer);
        executorService.execute(new RunnableC9413(5, mediaPlayer));
        C17984 c17984 = this.f72207;
        c17984.m40967();
        c17984.m40965();
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m51271(int i) {
        return i != 0 && !this.f72208 && i == this.f72202 && i == this.f72201.get();
    }

    @Override // p067l.InterfaceC7669
    public final void pause() {
        if (this.f72208 || this.f72197) {
            return;
        }
        if (this.f72200) {
            try {
                if (this.f72199) {
                    return;
                }
                C7050.m16221().removeCallbacksAndMessages(this.f72209);
                this.f72210.pause();
                this.f72199 = true;
                ((C2974) this.f72203).mo4938(false);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    @Override // p067l.InterfaceC7669
    public final void start() {
        if (this.f72208 || this.f72197) {
            return;
        }
        if (this.f72200) {
            try {
                if (!isPlaying()) {
                    Handler handlerM16221 = C7050.m16221();
                    RunnableC20270 runnableC20270 = this.f72209;
                    handlerM16221.postAtTime(runnableC20270, runnableC20270, SystemClock.uptimeMillis() + 10);
                    this.f72210.start();
                    this.f72199 = false;
                    ((C2974) this.f72203).mo4938(true);
                    mo17761(C19799.f60214[C19799.m45024()]);
                    return;
                }
                this.f72199 = false;
                return;
            } catch (Exception unused) {
                return;
            }
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo17768() {
        return this.f72208;
    }

    @Override // p067l.InterfaceC7669
    public final int getCurrentPosition() {
        int iMax;
        if (this.f72200) {
            synchronized (this) {
                try {
                    try {
                        iMax = Math.max(this.f72210.getCurrentPosition(), 0);
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

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ֫ */
    public final void mo17761(float f) {
        if (!this.f72200 || this.f72199) {
            return;
        }
        MediaPlayer mediaPlayer = this.f72210;
        if (mediaPlayer.getPlaybackParams().getSpeed() != f) {
            PlaybackParams playbackParams = new PlaybackParams();
            playbackParams.setSpeed(f);
            try {
                mediaPlayer.setPlaybackParams(playbackParams);
            } catch (Exception unused) {
            }
        }
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ֫ */
    public final void mo17762(int i, RunnableC18397 runnableC18397) {
        if (this.f72200) {
            synchronized (this) {
                this.f72211 = i;
                C16915 c16915 = this.f72205;
                if (c16915 != null) {
                    if (i == c16915.position()) {
                        this.f72205 = new C16915(i, runnableC18397);
                        this.f72198 = null;
                    } else {
                        this.f72198 = new C16915(i, runnableC18397);
                    }
                } else {
                    this.f72205 = new C16915(i, runnableC18397);
                    this.f72210.seekTo(i);
                }
            }
        }
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo17765() {
        return this.f72200;
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ֫ */
    public final void mo17763(final C13010 c13010) {
        if (!this.f72197 && !this.f72208) {
            final int iIncrementAndGet = this.f72201.incrementAndGet();
            this.f72202 = iIncrementAndGet;
            this.f72204 = null;
            this.f72197 = true;
            this.f72199 = true;
            C7050.m16221().removeCallbacksAndMessages(this.f72209);
            C4081.f8987.execute(new Runnable() { // from class: l.ۚܶۜ
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    C22952.m51267(this.f19765, iIncrementAndGet, c13010);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo17766() {
        return this.f72197;
    }

    @Override // p067l.InterfaceC7669
    public final boolean isPlaying() {
        try {
            return this.f72200 && this.f72210.isPlaying();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ۧ */
    public final void mo17764() {
        synchronized (this) {
            mo17762(0, (RunnableC18397) null);
            if (this.f72199) {
                return;
            }
            Handler handlerM16221 = C7050.m16221();
            RunnableC20270 runnableC20270 = this.f72209;
            handlerM16221.postAtTime(runnableC20270, runnableC20270, SystemClock.uptimeMillis() + 10);
            this.f72210.start();
        }
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ᩳ */
    public final void mo17767() {
        synchronized (this) {
            mo17762(0, (RunnableC18397) null);
        }
    }
}
