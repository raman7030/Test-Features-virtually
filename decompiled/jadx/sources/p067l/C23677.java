package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩹ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23677 implements Supplier {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f75379;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC11588 f75380;

    public /* synthetic */ C23677(AbstractC11588 abstractC11588, int i) {
        this.f75379 = i;
        this.f75380 = abstractC11588;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f75379;
        AbstractC11588 abstractC11588 = this.f75380;
        switch (i) {
            case 0:
                C14959 c14959 = (C14959) abstractC11588;
                return String.format(" append_frame=%d offset=%d numlock=%s", Integer.valueOf(c14959.f42724), Integer.valueOf(c14959.f42726), C19937.m45253(c14959.f42734));
            default:
                return String.format("#%d;", Integer.valueOf(((AbstractC13188) abstractC11588).f37054));
        }
    }
}
