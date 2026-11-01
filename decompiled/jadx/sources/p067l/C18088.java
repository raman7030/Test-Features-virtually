package p067l;

/* JADX INFO: renamed from: l.ܽۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBDW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18088 implements InterfaceC10988 {

    /* JADX INFO: renamed from: ֫ */
    public final C4678 f53999;

    /* JADX INFO: renamed from: ۧ */
    public final int f54000;

    /* JADX INFO: renamed from: ܽ */
    public final int f54001;

    /* JADX INFO: renamed from: ᩳ */
    public final C22388 f54002;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public C18088(int i, C4678 c4678, C22388 c22388, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        try {
            c4678.m45999();
            int size = c4678.size();
            if (size == 0) {
                throw new IllegalArgumentException("insns.size() == 0");
            }
            int i3 = size - 2;
            while (true) {
                if (i3 < 0) {
                    if (c4678.m56521get(size - 1).m39656().m11601() == 1) {
                        throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
                    }
                    try {
                        c22388.m45999();
                        if (i2 < -1) {
                            throw new IllegalArgumentException("primarySuccessor < -1");
                        }
                        if (i2 >= 0) {
                            int iM50242 = c22388.m50242(i2);
                            if (!((iM50242 >= 0 ? iM50242 : -1) >= 0)) {
                                throw new IllegalArgumentException("primarySuccessor " + i2 + " not in successors " + c22388);
                            }
                        }
                        this.f54000 = i;
                        this.f53999 = c4678;
                        this.f54002 = c22388;
                        this.f54001 = i2;
                        return;
                    } catch (NullPointerException unused) {
                        throw new NullPointerException("successors == null");
                    }
                }
                if (c4678.m56521get(i3).m39656().m11601() != 1) {
                    throw new IllegalArgumentException(C19768.m44906(i3, "insns[", "] is a branch or can throw"));
                }
                i3--;
            }
        } catch (NullPointerException unused2) {
            throw new NullPointerException("insns == null");
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // p067l.InterfaceC10988
    /* JADX INFO: renamed from: ֫ */
    public final int mo4636() {
        return this.f54000;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4678 m41142() {
        return this.f53999;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C22388 m41137() {
        return this.f54002;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m41139() {
        return this.f54001;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m41144() {
        C22388 c22388 = this.f54002;
        if (c22388.size() != 2) {
            throw new UnsupportedOperationException("block doesn't have exactly two successors");
        }
        int i = c22388.get(0);
        return i == this.f54001 ? c22388.get(1) : i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC17417 m41140() {
        return this.f53999.m56521get(0);
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC17417 m41141() {
        return this.f53999.m9913();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m41138() {
        return this.f53999.m9913().m39653();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m41143() {
        return this.f53999.m9913().mo5820().size() != 0;
    }

    public final String toString() {
        return "{" + C16351.m37153(this.f54000) + '}';
    }
}
