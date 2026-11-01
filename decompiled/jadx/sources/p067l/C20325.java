package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ᩴܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20325 implements Supplier {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f62788;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC13599 f62789;

    public /* synthetic */ C20325(AbstractC13599 abstractC13599, int i) {
        this.f62788 = i;
        this.f62789 = abstractC13599;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f62788;
        AbstractC13599 abstractC13599 = this.f62789;
        switch (i) {
            case 0:
                C14959 c14959 = (C14959) abstractC13599;
                return String.format(" stack_map_entry:pc=%d numloc=%s  numstack=%s", Integer.valueOf(c14959.f42737), C19937.m45253(c14959.f42734), C19937.m45253(c14959.f42728));
            default:
                C3128 c3128 = (C3128) abstractC13599;
                return c3128.f38266.m27975(c3128.f5697).mo5910();
        }
    }
}
