package p067l;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ܶܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16906 extends C3418 implements RandomAccess {
    public static final long serialVersionUID = -2542308836966382001L;

    @Override // p067l.C3418, java.util.List
    public final List subList(int i, int i2) {
        return new C16906(this.f6781b.subList(i, i2));
    }

    private Object writeReplace() {
        return new C3418(this.f6781b);
    }
}
