package p067l;

import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۤۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 574A */
/* JADX INFO: loaded from: classes3.dex */
public final class C11950 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C13291 f33328;

    /* JADX INFO: renamed from: ᩸ */
    public final C13961 f33329;

    /* JADX INFO: renamed from: ᩹ */
    public EnumC7926 f33330 = EnumC7926.WAITING;

    public C11950(C13291 c13291, C13961 c13961) {
        this.f33328 = c13291;
        this.f33329 = c13961;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27354() {
        synchronized (this.f33328) {
            if (this.f33330 == EnumC7926.WAITING) {
                while (this.f33329.f39423 != null) {
                    m27352();
                }
                m27351();
                this.f33329.f39425--;
                this.f33329.f39424++;
                this.f33330 = EnumC7926.READING;
            } else {
                throw new IllegalStateException("Unexpected HLS playlist cache lease state: " + this.f33330);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m27356() {
        synchronized (this.f33328) {
            if (this.f33330 != EnumC7926.READING) {
                return;
            }
            this.f33329.f39424--;
            this.f33330 = EnumC7926.RELEASED;
            C13291.m30363(this.f33328, this.f33329);
            this.f33328.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m27355() {
        synchronized (this.f33328) {
            if (this.f33330 == EnumC7926.READING) {
                this.f33329.f39424--;
                if (this.f33329.f39423 == null) {
                    this.f33330 = EnumC7926.REFRESHING;
                    this.f33329.f39423 = this;
                    this.f33328.notifyAll();
                    while (this.f33329.f39424 > 0) {
                        m27352();
                    }
                    m27351();
                    return true;
                }
                this.f33330 = EnumC7926.WAITING;
                this.f33329.f39425++;
                this.f33328.notifyAll();
                while (this.f33329.f39423 != null) {
                    m27352();
                }
                m27351();
                this.f33329.f39425--;
                this.f33329.f39424++;
                this.f33330 = EnumC7926.READING;
                return false;
            }
            throw new IllegalStateException("Unexpected HLS playlist cache lease state: " + this.f33330);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m27357() {
        synchronized (this.f33328) {
            if (this.f33330 != EnumC7926.REFRESHING) {
                return;
            }
            if (this.f33329.f39423 == this) {
                this.f33329.f39423 = null;
            }
            this.f33330 = EnumC7926.RELEASED;
            C13291.m30363(this.f33328, this.f33329);
            this.f33328.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m27358() throws InterruptedIOException {
        synchronized (this.f33328) {
            m27351();
        }
        if (Thread.currentThread().isInterrupted()) {
            throw C13291.m30362("Interrupted while loading HLS playlist", (InterruptedException) null);
        }
    }

    /* JADX INFO: renamed from: ۘ */
    private void m27352() throws InterruptedIOException {
        try {
            this.f33328.wait();
            m27351();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            m27353();
            throw C13291.m30362("Interrupted while waiting for HLS playlist cache", e);
        }
    }

    /* JADX INFO: renamed from: ۖ */
    private void m27351() throws InterruptedIOException {
        if (this.f33328.f37340 || this.f33330 == EnumC7926.RELEASED) {
            throw C13291.m30362("HLS playlist cache lease was released", (InterruptedException) null);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private void m27353() {
        EnumC7926 enumC7926 = this.f33330;
        EnumC7926 enumC7927 = EnumC7926.WAITING;
        C13961 c13961 = this.f33329;
        if (enumC7926 == enumC7927) {
            c13961.f39425--;
        } else if (enumC7926 == EnumC7926.READING) {
            c13961.f39424--;
        } else if (enumC7926 == EnumC7926.REFRESHING && c13961.f39423 == this) {
            c13961.f39423 = null;
        }
        this.f33330 = EnumC7926.RELEASED;
        C13291 c13291 = this.f33328;
        C13291.m30363(c13291, c13961);
        c13291.notifyAll();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f33328) {
            if (this.f33330 != EnumC7926.RELEASED) {
                m27353();
            }
        }
    }
}
