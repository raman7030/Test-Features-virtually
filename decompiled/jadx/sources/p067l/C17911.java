package p067l;

/* JADX INFO: renamed from: l.ܽۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBDV */
/* JADX INFO: loaded from: classes4.dex */
public class C17911 extends AbstractC5208 {

    /* JADX INFO: renamed from: ۧ */
    public final C22388 f53506;

    /* JADX INFO: renamed from: ܽ */
    public int f53507;

    public C17911(int i) {
        super(1);
        this.f53506 = new C22388(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40717() {
        return this.f53507;
    }

    @Override // p067l.AbstractC5208
    /* JADX INFO: renamed from: ֫ */
    public final C22783 mo11174(C22783 c22783) {
        int i;
        if (c22783 == null) {
            return null;
        }
        try {
            i = this.f53506.get(c22783.m50989());
        } catch (IndexOutOfBoundsException unused) {
            i = -1;
        }
        if (i < 0) {
            throw new RuntimeException("no mapping specified for register");
        }
        return c22783.m50983(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40718(int i) {
        C22388 c22388 = this.f53506;
        if (i >= c22388.size()) {
            return -1;
        }
        return c22388.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo23134(int i, int i2, int i3) {
        C22388 c22388 = this.f53506;
        if (i >= c22388.size()) {
            for (int size = i - c22388.size(); size >= 0; size--) {
                c22388.add(-1);
            }
        }
        c22388.set(i, i2);
        int i4 = i2 + i3;
        if (this.f53507 < i4) {
            this.f53507 = i4;
        }
    }
}
