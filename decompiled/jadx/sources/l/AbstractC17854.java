package l;

/* JADX INFO: renamed from: l.ᩳۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: IA0M */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17854 implements InterfaceC5257 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f54531 = C11321.m27961(AbstractC17854.class);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C3618 f54532;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54533;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12914 f54534;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f54535 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC14325 f54536;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m41826() {
        if (!this.f54535) {
            this.f54535 = true;
            try {
                mo27002();
                this.f54536 = null;
                this.f54532.m11101();
            } catch (Throwable th) {
                this.f54536 = null;
                this.f54532.m11101();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public abstract boolean mo27000();

    /* JADX INFO: renamed from: ۘ */
    public abstract InterfaceC14325 mo27001();

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo27002();

    /* JADX INFO: renamed from: ᩳ */
    public abstract boolean mo27003();

    /* JADX INFO: renamed from: ᩻ */
    public abstract InterfaceC14325[] mo27004();

    public AbstractC17854(C12914 c12914, C3618 c3618) throws Exception {
        this.f54534 = c12914;
        c3618.m11088();
        this.f54532 = c3618;
        try {
            InterfaceC14325 interfaceC14325Mo27001 = mo27001();
            this.f54536 = interfaceC14325Mo27001;
            if (interfaceC14325Mo27001 == null) {
                m41826();
            }
        } catch (Exception e) {
            m41826();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C3618 m41827() {
        return this.f54532;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10196 m41828() {
        return this.f54534;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14325 m41825(boolean z) {
        InterfaceC14325[] interfaceC14325ArrMo27004 = mo27004();
        while (true) {
            int i = this.f54533;
            if (i < interfaceC14325ArrMo27004.length) {
                InterfaceC14325 interfaceC14325 = interfaceC14325ArrMo27004[i];
                this.f54533 = i + 1;
                String name = interfaceC14325.getName();
                if (name.length() < 3) {
                    int iHashCode = name.hashCode();
                    int i2 = C12914.f38751;
                    if ((iHashCode == 46 || iHashCode == 1472) && (name.equals(".") || name.equals(".."))) {
                    }
                }
                return interfaceC14325;
            }
            if (z || mo27000()) {
                return null;
            }
            if (!mo27003()) {
                m41826();
                return null;
            }
            this.f54533 = 0;
            return m41825(true);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f54536 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC14325 interfaceC14325 = this.f54536;
        try {
            InterfaceC14325 interfaceC14325M41825 = m41825(false);
            if (interfaceC14325M41825 == null) {
                m41826();
                return interfaceC14325;
            }
            this.f54536 = interfaceC14325M41825;
            return interfaceC14325;
        } catch (C19369 e) {
            InterfaceC2148 interfaceC2148 = f54531;
            interfaceC2148.mo7083("Enumeration failed", (Throwable) e);
            this.f54536 = null;
            try {
                m41826();
            } catch (C19369 unused) {
                interfaceC2148.mo7081("Failed to close enum", (Exception) e);
            }
            return interfaceC14325;
        }
    }

    @Override // l.InterfaceC5257, java.lang.AutoCloseable
    public final void close() {
        if (this.f54536 != null) {
            m41826();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
