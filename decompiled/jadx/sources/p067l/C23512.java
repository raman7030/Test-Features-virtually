package p067l;

/* JADX INFO: renamed from: l.᩹ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BEJ */
/* JADX INFO: loaded from: classes.dex */
public final class C23512 extends AbstractC25009 {

    /* JADX INFO: renamed from: ۧ */
    public final C15660 f74915;

    /* JADX INFO: renamed from: ܳ */
    public final int f74916;

    /* JADX INFO: renamed from: ܽ */
    public final C10257 f74917;

    /* JADX INFO: renamed from: ܿ */
    public final int f74918;

    /* JADX INFO: renamed from: ᩳ */
    public final C6904 f74919;

    public C23512(int i, int i2, C6904 c6904, C10257 c10257, C15660 c15660) {
        super("Code");
        if (i < 0) {
            throw new IllegalArgumentException("maxStack < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxLocals < 0");
        }
        try {
            if (c10257.m46000()) {
                throw new C21047("catches.isMutable()", null);
            }
            try {
                if (c15660.m46000()) {
                    throw new C21047("attributes.isMutable()", null);
                }
                this.f74916 = i;
                this.f74918 = i2;
                this.f74919 = c6904;
                this.f74917 = c10257;
                this.f74915 = c15660;
            } catch (NullPointerException unused) {
                throw new NullPointerException("attributes == null");
            }
        } catch (NullPointerException unused2) {
            throw new NullPointerException("catches == null");
        }
    }

    @Override // p067l.InterfaceC14320
    /* JADX INFO: renamed from: ֫ */
    public final int mo11873() {
        return this.f74915.m35583() + (this.f74917.size() * 8) + 2 + this.f74919.m15819() + 10;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m52283() {
        return this.f74916;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m52285() {
        return this.f74918;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C6904 m52286() {
        return this.f74919;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C10257 m52284() {
        return this.f74917;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15660 m52282() {
        return this.f74915;
    }
}
