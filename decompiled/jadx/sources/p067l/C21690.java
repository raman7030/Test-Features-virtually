package p067l;

/* JADX INFO: renamed from: l.᩶ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4KU */
/* JADX INFO: loaded from: classes5.dex */
public final class C21690 extends AbstractC17522 implements InterfaceC14313 {

    /* JADX INFO: renamed from: ᩶ */
    public final String f68308;

    /* JADX INFO: renamed from: ᩸ */
    public final String f68309;

    /* JADX INFO: renamed from: ᩹ */
    public final String f68310;

    public C21690(String str, String str2, String str3) {
        this.f68309 = str;
        this.f68310 = str2;
        this.f68308 = str3;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C21690 m48963(InterfaceC20309 interfaceC20309) {
        if (interfaceC20309 instanceof C21690) {
            return (C21690) interfaceC20309;
        }
        return new C21690(interfaceC20309.mo10231(), interfaceC20309.getName(), interfaceC20309.getType());
    }

    @Override // p067l.InterfaceC20309
    /* JADX INFO: renamed from: ܳ */
    public final String mo10231() {
        return this.f68309;
    }

    @Override // p067l.InterfaceC20309
    public final String getName() {
        return this.f68310;
    }

    @Override // p067l.InterfaceC20309
    public final String getType() {
        return this.f68308;
    }
}
