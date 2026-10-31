package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۖ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2398 implements Supplier {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7651;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13521 f7652;

    public /* synthetic */ C2398(AbstractC13521 abstractC13521, int i) {
        this.f7651 = i;
        this.f7652 = abstractC13521;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f7651) {
            case 0:
                return "type " + ((AbstractC4308) this.f7652);
            default:
                return ((C7814) this.f7652).toString();
        }
    }
}
