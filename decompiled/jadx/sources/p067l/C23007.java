package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩸ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23007 implements Supplier {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f72381;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC11588 f72382;

    public /* synthetic */ C23007(AbstractC11588 abstractC11588, int i) {
        this.f72381 = i;
        this.f72382 = abstractC11588;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f72381;
        AbstractC11588 abstractC11588 = this.f72382;
        switch (i) {
            case 0:
                C14959 c14959 = (C14959) abstractC11588;
                return String.format(" same_locals_1_stack_item_frame_extended=%d, offset=%d, numstack=%s", Integer.valueOf(c14959.f42724), Integer.valueOf(c14959.f42726), C19937.m45253(c14959.f42728));
            default:
                return String.format("#%d;", Integer.valueOf(((AbstractC13188) abstractC11588).f37054));
        }
    }
}
