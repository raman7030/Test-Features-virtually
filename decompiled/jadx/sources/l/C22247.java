package l;

/* JADX INFO: renamed from: l.᩹ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BEJ */
/* JADX INFO: loaded from: classes.dex */
public final class C22247 extends AbstractC23822 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13985 f72190;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f72191;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8300 f72192;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f72193;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C4772 f72194;

    public C22247(int i, int i2, C4772 c4772, C8300 c8300, C13985 c13985) {
        super("Code");
        if (i < 0) {
            throw new IllegalArgumentException("maxStack < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxLocals < 0");
        }
        try {
            if (c8300.m43733()) {
                throw new C19653("catches.isMutable()", null);
            }
            try {
                if (c13985.m43733()) {
                    throw new C19653("attributes.isMutable()", null);
                }
                this.f72191 = i;
                this.f72193 = i2;
                this.f72194 = c4772;
                this.f72192 = c8300;
                this.f72190 = c13985;
            } catch (NullPointerException unused) {
                throw new NullPointerException("attributes == null");
            }
        } catch (NullPointerException unused2) {
            throw new NullPointerException("catches == null");
        }
    }

    @Override // l.InterfaceC12575
    /* JADX INFO: renamed from: ֫ */
    public final int mo9828() {
        return this.f72190.m33463() + (this.f72192.size() * 8) + 2 + this.f72194.m13939() + 10;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m49955() {
        return this.f72191;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m49957() {
        return this.f72193;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C4772 m49958() {
        return this.f72194;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8300 m49956() {
        return this.f72192;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13985 m49954() {
        return this.f72190;
    }
}
