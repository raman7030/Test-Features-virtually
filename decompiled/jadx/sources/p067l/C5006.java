package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۖ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5E9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5006 extends C18416 implements InterfaceC22047 {

    /* JADX INFO: renamed from: ۧ */
    public int f11439;

    /* JADX INFO: renamed from: ܽ */
    public final ConcurrentMapC12768 f11440;

    /* JADX INFO: renamed from: ֫ */
    public final C14393 m10635(InterfaceC6227 interfaceC6227) {
        return ((C6347) interfaceC6227).f16451;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ܳ */
    public final int mo10638(Object obj) {
        return ((C6347) obj).f16452;
    }

    public C5006(C20765 c20765) {
        super(c20765);
        this.f11440 = new ConcurrentMapC12768();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C6347 m10637(InterfaceC6227 interfaceC6227) {
        ConcurrentMapC12768 concurrentMapC12768 = this.f11440;
        C6347 c6347 = (C6347) concurrentMapC12768.get(interfaceC6227);
        if (c6347 != null) {
            return c6347;
        }
        C6347 c6348 = new C6347(interfaceC6227.getName(), this.f55000.f71648.m12653((AbstractC10147) C14058.m31902(interfaceC6227)));
        C6347 c6349 = (C6347) concurrentMapC12768.putIfAbsent(c6348, c6348);
        return c6349 == null ? c6348 : c6349;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo10634() {
        return new C17745(this.f11440.values());
    }

    @Override // p067l.InterfaceC6623
    public final int getItemCount() {
        return this.f11440.size();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m10639() {
        return this.f11439 + this.f11440.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10636(int i) {
        this.f11439 = i;
    }
}
