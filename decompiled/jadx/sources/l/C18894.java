package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ᩴܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18894 implements Supplier {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59558;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11817 f59559;

    public /* synthetic */ C18894(AbstractC11817 abstractC11817, int i) {
        this.f59558 = i;
        this.f59559 = abstractC11817;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f59558;
        AbstractC11817 abstractC11817 = this.f59559;
        switch (i) {
            case 0:
                C13248 c13248 = (C13248) abstractC11817;
                return String.format(" stack_map_entry:pc=%d numloc=%s  numstack=%s", Integer.valueOf(c13248.f39673), C18486.m42977(c13248.f39670), C18486.m42977(c13248.f39664));
            default:
                C0800 c0800 = (C0800) abstractC11817;
                return c0800.f35264.m25953(c0800.f2926).mo3639();
        }
    }
}
