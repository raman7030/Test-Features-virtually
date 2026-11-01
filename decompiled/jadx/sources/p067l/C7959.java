package p067l;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4RX */
/* JADX INFO: loaded from: classes2.dex */
public final class C7959 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9103 f20917;

    /* JADX INFO: renamed from: ۧ */
    public final int f20918;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f20919;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f20920 = new HashMap();

    /* JADX INFO: renamed from: ᩳ */
    public volatile C15334 f20921;

    public C7959(AbstractC9103 abstractC9103, int i) {
        this.f20917 = abstractC9103;
        this.f20918 = i;
        boolean z = false;
        if ((abstractC9103 instanceof C23382) && ((C23382) abstractC9103).f74507) {
            C15334 c15334 = new C15334(new C14878());
            c15334.f43766 = new C15334[0];
            c15334.f43768 = false;
            c15334.f43771 = false;
            this.f20921 = c15334;
            z = true;
        }
        this.f20919 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15334 m18394(int i) {
        if (!this.f20919) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0 || i >= this.f20921.f43766.length) {
            return null;
        }
        return this.f20921.f43766[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18395(int i, C15334 c15334) {
        if (!this.f20919) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.f20921) {
            if (i >= this.f20921.f43766.length) {
                this.f20921.f43766 = (C15334[]) Arrays.copyOf(this.f20921.f43766, i + 1);
            }
            this.f20921.f43766[i] = c15334;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m18396() {
        return this.f20919;
    }

    public final String toString() {
        return this.f20921 == null ? "" : new C13324(this, C16889.f50000).toString();
    }
}
