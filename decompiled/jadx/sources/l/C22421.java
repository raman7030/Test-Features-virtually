package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩹ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22421 implements Supplier {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72652;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC9701 f72653;

    public /* synthetic */ C22421(AbstractC9701 abstractC9701, int i) {
        this.f72652 = i;
        this.f72653 = abstractC9701;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f72652;
        AbstractC9701 abstractC9701 = this.f72653;
        switch (i) {
            case 0:
                C13248 c13248 = (C13248) abstractC9701;
                return String.format(" append_frame=%d offset=%d numlock=%s", Integer.valueOf(c13248.f39660), Integer.valueOf(c13248.f39662), C18486.m42977(c13248.f39670));
            default:
                return String.format("#%d;", Integer.valueOf(((AbstractC11385) abstractC9701).f34056));
        }
    }
}
