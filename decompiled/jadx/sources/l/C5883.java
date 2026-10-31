package l;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4RX */
/* JADX INFO: loaded from: classes2.dex */
public final class C5883 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7086 f18062;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f18063;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f18064;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f18065 = new HashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile C13643 f18066;

    public C5883(AbstractC7086 abstractC7086, int i) {
        this.f18062 = abstractC7086;
        this.f18063 = i;
        boolean z = false;
        if ((abstractC7086 instanceof C22111) && ((C22111) abstractC7086).f71785) {
            C13643 c13643 = new C13643(new C13163());
            c13643.f40685 = new C13643[0];
            c13643.f40687 = false;
            c13643.f40690 = false;
            this.f18066 = c13643;
            z = true;
        }
        this.f18064 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13643 m16468(int i) {
        if (!this.f18064) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0 || i >= this.f18066.f40685.length) {
            return null;
        }
        return this.f18066.f40685[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16469(int i, C13643 c13643) {
        if (!this.f18064) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.f18066) {
            if (i >= this.f18066.f40685.length) {
                this.f18066.f40685 = (C13643[]) Arrays.copyOf(this.f18066.f40685, i + 1);
            }
            this.f18066.f40685[i] = c13643;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16470() {
        return this.f18064;
    }

    public final String toString() {
        return this.f18066 == null ? "" : new C11528(this, C15279.f46873).toString();
    }
}
