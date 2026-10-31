package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T62G */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16069 extends C9015 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Object f49540;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f49539 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f49538 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f49537 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo37975(Object obj);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public abstract Object mo37976();

    @Override // l.C9015
    /* JADX INFO: renamed from: ܿ */
    public Object mo23262() {
        Object objM23263 = m23263(0);
        int i = this.f27374 + 1;
        this.f27374 = i;
        ArrayList arrayList = this.f27373;
        if (i == arrayList.size() && this.f49537 == 0) {
            this.f49540 = objM23263;
            this.f27374 = 0;
            arrayList.clear();
        }
        return objM23263;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37977() {
        m37978(1);
        mo23262();
        this.f49539++;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m37978(int i) {
        int i2 = this.f27374 + i;
        ArrayList arrayList = this.f27373;
        int size = ((i2 - 1) - arrayList.size()) + 1;
        if (size > 0) {
            for (int i3 = 1; i3 <= size; i3++) {
                Object objMo37976 = mo37976();
                if (mo37975(objMo37976)) {
                    this.f49538 = objMo37976;
                }
                arrayList.add(objMo37976);
            }
        }
    }

    @Override // l.C9015
    public final int size() {
        throw new UnsupportedOperationException("streams are of unknown size");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m37979(int i) {
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = this.f27373;
        if (i >= 0) {
            m37978(i);
            return (this.f27374 + i) + (-1) > arrayList.size() ? this.f49538 : m23263(i - 1);
        }
        int i2 = this.f27374 - (-i);
        if (i2 == -1) {
            return this.f49540;
        }
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (i2 < -1) {
            throw new UnsupportedOperationException("can't look more than one token before the beginning of this stream's buffer");
        }
        throw new UnsupportedOperationException("can't look past the end of this stream's buffer using LB(int)");
    }

    public final int index() {
        return this.f49539;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m37981() {
        this.f49537++;
        return this.f27374;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m37980(int i) {
        this.f49537--;
        this.f49539 -= this.f27374 - i;
        this.f27374 = i;
    }
}
