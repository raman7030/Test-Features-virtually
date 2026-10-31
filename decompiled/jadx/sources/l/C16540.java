package l;

/* JADX INFO: renamed from: l.ܽۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBDW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16540 implements InterfaceC9069 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2430 f50821;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f50822;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f50823;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21064 f50824;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public C16540(int i, C2430 c2430, C21064 c21064, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        try {
            c2430.m43732();
            int size = c2430.size();
            if (size == 0) {
                throw new IllegalArgumentException("insns.size() == 0");
            }
            int i3 = size - 2;
            while (true) {
                if (i3 < 0) {
                    if (c2430.m41001get(size - 1).m37484().m9558() == 1) {
                        throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
                    }
                    try {
                        c21064.m43732();
                        if (i2 < -1) {
                            throw new IllegalArgumentException("primarySuccessor < -1");
                        }
                        if (i2 >= 0) {
                            int iM47912 = c21064.m47912(i2);
                            if (!((iM47912 >= 0 ? iM47912 : -1) >= 0)) {
                                throw new IllegalArgumentException("primarySuccessor " + i2 + " not in successors " + c21064);
                            }
                        }
                        this.f50822 = i;
                        this.f50821 = c2430;
                        this.f50824 = c21064;
                        this.f50823 = i2;
                        return;
                    } catch (NullPointerException unused) {
                        throw new NullPointerException("successors == null");
                    }
                }
                if (c2430.m41001get(i3).m37484().m9558() != 1) {
                    throw new IllegalArgumentException(C18307.m42645(i3, "insns[", "] is a branch or can throw"));
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

    @Override // l.InterfaceC9069
    /* JADX INFO: renamed from: ֫ */
    public final int mo2269() {
        return this.f50822;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2430 m38916() {
        return this.f50821;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C21064 m38911() {
        return this.f50824;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m38913() {
        return this.f50823;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m38918() {
        C21064 c21064 = this.f50824;
        if (c21064.size() != 2) {
            throw new UnsupportedOperationException("block doesn't have exactly two successors");
        }
        int i = c21064.get(0);
        return i == this.f50823 ? c21064.get(1) : i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15834 m38914() {
        return this.f50821.m41001get(0);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC15834 m38915() {
        return this.f50821.m7865();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m38912() {
        return this.f50821.m7865().m37481();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m38917() {
        return this.f50821.m7865().mo3533().size() != 0;
    }

    public final String toString() {
        return "{" + C14712.m35006(this.f50822) + '}';
    }
}
