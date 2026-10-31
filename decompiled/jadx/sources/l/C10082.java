package l;

import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۤۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 574A */
/* JADX INFO: loaded from: classes3.dex */
public final class C10082 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11493 f30367;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12198 f30368;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC5848 f30369 = EnumC5848.WAITING;

    public C10082(C11493 c11493, C12198 c12198) {
        this.f30367 = c11493;
        this.f30368 = c12198;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25335() {
        synchronized (this.f30367) {
            if (this.f30369 == EnumC5848.WAITING) {
                while (this.f30368.f36408 != null) {
                    m25333();
                }
                m25332();
                this.f30368.f36410--;
                this.f30368.f36409++;
                this.f30369 = EnumC5848.READING;
            } else {
                throw new IllegalStateException("Unexpected HLS playlist cache lease state: " + this.f30369);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m25337() {
        synchronized (this.f30367) {
            if (this.f30369 != EnumC5848.READING) {
                return;
            }
            this.f30368.f36409--;
            this.f30369 = EnumC5848.RELEASED;
            C11493.m28319(this.f30367, this.f30368);
            this.f30367.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m25336() {
        synchronized (this.f30367) {
            if (this.f30369 == EnumC5848.READING) {
                this.f30368.f36409--;
                if (this.f30368.f36408 == null) {
                    this.f30369 = EnumC5848.REFRESHING;
                    this.f30368.f36408 = this;
                    this.f30367.notifyAll();
                    while (this.f30368.f36409 > 0) {
                        m25333();
                    }
                    m25332();
                    return true;
                }
                this.f30369 = EnumC5848.WAITING;
                this.f30368.f36410++;
                this.f30367.notifyAll();
                while (this.f30368.f36408 != null) {
                    m25333();
                }
                m25332();
                this.f30368.f36410--;
                this.f30368.f36409++;
                this.f30369 = EnumC5848.READING;
                return false;
            }
            throw new IllegalStateException("Unexpected HLS playlist cache lease state: " + this.f30369);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m25338() {
        synchronized (this.f30367) {
            if (this.f30369 != EnumC5848.REFRESHING) {
                return;
            }
            if (this.f30368.f36408 == this) {
                this.f30368.f36408 = null;
            }
            this.f30369 = EnumC5848.RELEASED;
            C11493.m28319(this.f30367, this.f30368);
            this.f30367.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m25339() throws InterruptedIOException {
        synchronized (this.f30367) {
            m25332();
        }
        if (Thread.currentThread().isInterrupted()) {
            throw C11493.m28318("Interrupted while loading HLS playlist", (InterruptedException) null);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m25333() throws InterruptedIOException {
        try {
            this.f30367.wait();
            m25332();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            m25334();
            throw C11493.m28318("Interrupted while waiting for HLS playlist cache", e);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m25332() throws InterruptedIOException {
        if (this.f30367.f34343 || this.f30369 == EnumC5848.RELEASED) {
            throw C11493.m28318("HLS playlist cache lease was released", (InterruptedException) null);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m25334() {
        EnumC5848 enumC5848 = this.f30369;
        EnumC5848 enumC5849 = EnumC5848.WAITING;
        C12198 c12198 = this.f30368;
        if (enumC5848 == enumC5849) {
            c12198.f36410--;
        } else if (enumC5848 == EnumC5848.READING) {
            c12198.f36409--;
        } else if (enumC5848 == EnumC5848.REFRESHING && c12198.f36408 == this) {
            c12198.f36408 = null;
        }
        this.f30369 = EnumC5848.RELEASED;
        C11493 c11493 = this.f30367;
        C11493.m28319(c11493, c12198);
        c11493.notifyAll();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f30367) {
            if (this.f30369 != EnumC5848.RELEASED) {
                m25334();
            }
        }
    }
}
