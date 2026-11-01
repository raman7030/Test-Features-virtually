package p067l;

/* JADX INFO: renamed from: l.ᩳۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: IA0M */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19337 implements InterfaceC7365 {

    /* JADX INFO: renamed from: ۬ */
    public static final InterfaceC4410 f57729 = C13128.m30022(AbstractC19337.class);

    /* JADX INFO: renamed from: ۗ */
    public final C5807 f57730;

    /* JADX INFO: renamed from: ۙ */
    public int f57731;

    /* JADX INFO: renamed from: ᩶ */
    public final C14642 f57732;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f57733 = false;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC15983 f57734;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m44072() {
        if (!this.f57733) {
            this.f57733 = true;
            try {
                mo29047();
                this.f57734 = null;
                this.f57730.m13077();
            } catch (Throwable th) {
                this.f57734 = null;
                this.f57730.m13077();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public abstract boolean mo29045();

    /* JADX INFO: renamed from: ۘ */
    public abstract InterfaceC15983 mo29046();

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo29047();

    /* JADX INFO: renamed from: ᩳ */
    public abstract boolean mo29048();

    /* JADX INFO: renamed from: ᩻ */
    public abstract InterfaceC15983[] mo29049();

    public AbstractC19337(C14642 c14642, C5807 c5807) throws Exception {
        this.f57732 = c14642;
        c5807.m13064();
        this.f57730 = c5807;
        try {
            InterfaceC15983 interfaceC15983Mo29046 = mo29046();
            this.f57734 = interfaceC15983Mo29046;
            if (interfaceC15983Mo29046 == null) {
                m44072();
            }
        } catch (Exception e) {
            m44072();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final C5807 m44073() {
        return this.f57730;
    }

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC12059 m44074() {
        return this.f57732;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15983 m44071(boolean z) {
        InterfaceC15983[] interfaceC15983ArrMo29049 = mo29049();
        while (true) {
            int i = this.f57731;
            if (i < interfaceC15983ArrMo29049.length) {
                InterfaceC15983 interfaceC15983 = interfaceC15983ArrMo29049[i];
                this.f57731 = i + 1;
                String name = interfaceC15983.getName();
                if (name.length() < 3) {
                    int iHashCode = name.hashCode();
                    int i2 = C14642.f41793;
                    if ((iHashCode == 46 || iHashCode == 1472) && (name.equals(".") || name.equals(".."))) {
                    }
                }
                return interfaceC15983;
            }
            if (z || mo29045()) {
                return null;
            }
            if (!mo29048()) {
                m44072();
                return null;
            }
            this.f57731 = 0;
            return m44071(true);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f57734 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC15983 interfaceC15983 = this.f57734;
        try {
            InterfaceC15983 interfaceC15983M44071 = m44071(false);
            if (interfaceC15983M44071 == null) {
                m44072();
                return interfaceC15983;
            }
            this.f57734 = interfaceC15983M44071;
            return interfaceC15983;
        } catch (C20777 e) {
            InterfaceC4410 interfaceC4410 = f57729;
            interfaceC4410.mo9178("Enumeration failed", (Throwable) e);
            this.f57734 = null;
            try {
                m44072();
            } catch (C20777 unused) {
                interfaceC4410.mo9176("Failed to close enum", (Exception) e);
            }
            return interfaceC15983;
        }
    }

    @Override // p067l.InterfaceC7365, java.lang.AutoCloseable
    public final void close() {
        if (this.f57734 != null) {
            m44072();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
