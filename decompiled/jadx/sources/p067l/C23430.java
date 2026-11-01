package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩹۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes.dex */
public final class C23430 extends AbstractC12605 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ArrayList f74644;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ List f74645;

    @Override // p067l.AbstractC12605
    /* JADX INFO: renamed from: ۧ */
    public final int mo3749() {
        return this.f74645.size();
    }

    @Override // p067l.AbstractC12605
    /* JADX INFO: renamed from: ֫ */
    public final int mo3747() {
        return this.f74644.size();
    }

    @Override // p067l.AbstractC12605
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo3750(int i, int i2) {
        return ((AbstractC5996) this.f74645.get(i)).m13480() == ((AbstractC5996) this.f74644.get(i2)).m13480();
    }

    @Override // p067l.AbstractC12605
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3748(int i, int i2) {
        return this.f74645.get(i) == this.f74644.get(i2);
    }

    public C23430(ArrayList arrayList, ArrayList arrayList2) {
        this.f74645 = arrayList;
        this.f74644 = arrayList2;
    }
}
