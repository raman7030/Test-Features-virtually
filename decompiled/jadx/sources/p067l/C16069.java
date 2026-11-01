package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ܳۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5J6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16069 extends C18416 implements InterfaceC13053 {

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f47281;

    /* JADX INFO: renamed from: ֫ */
    public final int m36579(InterfaceC22991 interfaceC22991) {
        return ((C24787) interfaceC22991).f79219;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9384 m36580(CharSequence charSequence) {
        return ((C24787) charSequence).f79220;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ܳ */
    public final int mo10638(Object obj) {
        return ((C24787) obj).f79219;
    }

    @Override // p067l.InterfaceC7964
    /* JADX INFO: renamed from: ܽ */
    public final int mo18431(Object obj) {
        C24787 c24787 = (C24787) obj;
        if (c24787 == null) {
            return -1;
        }
        return c24787.f79219;
    }

    public C16069(C20765 c20765) {
        super(c20765);
        this.f47281 = new ConcurrentMapC12768();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24787 m36581(String str) {
        ConcurrentMapC12768 concurrentMapC12768 = this.f47281;
        C24787 c24787 = (C24787) concurrentMapC12768.get(str);
        if (c24787 != null) {
            return c24787;
        }
        C24787 c24788 = new C24787(((C15418) this.f55000.f71646).m35146(str));
        C24787 c24789 = (C24787) concurrentMapC12768.putIfAbsent(str, c24788);
        return c24789 == null ? c24788 : c24789;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo10634() {
        return new C18752(this.f47281.values());
    }

    @Override // p067l.InterfaceC6623
    public final int getItemCount() {
        return this.f47281.size();
    }
}
