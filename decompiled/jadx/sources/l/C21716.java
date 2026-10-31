package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩸ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21716 implements Supplier {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69676;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC9701 f69677;

    public /* synthetic */ C21716(AbstractC9701 abstractC9701, int i) {
        this.f69676 = i;
        this.f69677 = abstractC9701;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f69676;
        AbstractC9701 abstractC9701 = this.f69677;
        switch (i) {
            case 0:
                C13248 c13248 = (C13248) abstractC9701;
                return String.format(" same_locals_1_stack_item_frame_extended=%d, offset=%d, numstack=%s", Integer.valueOf(c13248.f39660), Integer.valueOf(c13248.f39662), C18486.m42977(c13248.f39664));
            default:
                return String.format("#%d;", Integer.valueOf(((AbstractC11385) abstractC9701).f34056));
        }
    }
}
