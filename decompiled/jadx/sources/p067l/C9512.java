package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.۟ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9512 implements InterfaceC19763, InterfaceC21477, InterfaceC8757 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f26040;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f26041;

    public /* synthetic */ C9512(int i, Object obj) {
        this.f26040 = i;
        this.f26041 = obj;
    }

    @Override // p067l.InterfaceC21477
    /* JADX INFO: renamed from: ֫ */
    public void mo15100(Object obj) {
        switch (this.f26040) {
            case 0:
                C20738.m46828((C20738) this.f26041);
                break;
            default:
                ((C2798) this.f26041).m4420(((Integer) obj).intValue());
                break;
        }
    }

    @Override // p067l.InterfaceC8757
    /* JADX INFO: renamed from: ֫ */
    public void mo20240(List list, List list2, List list3, List list4) {
        C18026.m41015((C18026) this.f26041, list, list2, list3, list4);
    }

    @Override // p067l.InterfaceC19763
    /* JADX INFO: renamed from: ֫ */
    public long mo22134(long j) {
        C8363 c8363 = (C8363) this.f26041;
        return C5792.m12992((j * ((long) c8363.f22408)) / 1000000, 0L, c8363.f22404 - 1);
    }
}
