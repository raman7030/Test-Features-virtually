package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۖ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4647 implements Supplier {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f10443;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC15218 f10444;

    public /* synthetic */ C4647(AbstractC15218 abstractC15218, int i) {
        this.f10443 = i;
        this.f10444 = abstractC15218;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f10443) {
            case 0:
                return "type " + ((AbstractC6462) this.f10444);
            default:
                return ((C9794) this.f10444).toString();
        }
    }
}
