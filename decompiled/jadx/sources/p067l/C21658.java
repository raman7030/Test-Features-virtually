package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩶ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21658 implements InterfaceC9934, InterfaceC17161, InterfaceC22729, InterfaceC21477, InterfaceC6726 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f68226;

    public /* synthetic */ C21658(Object obj) {
        this.f68226 = obj;
    }

    @Override // p067l.InterfaceC22729
    public Object apply(Object obj) {
        return (FutureC5767) this.f68226;
    }

    @Override // p067l.InterfaceC21477
    /* JADX INFO: renamed from: ֫ */
    public void mo15100(Object obj) {
        ((ActivityC18686) this.f68226).m42516((InterfaceC11799) obj);
    }

    @Override // p067l.InterfaceC6726
    /* JADX INFO: renamed from: ᩳ */
    public void mo3900() {
        ActivityC8301.m19148((ActivityC8301) this.f68226);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC2950) obj).mo4860((C19044) this.f68226);
    }

    @Override // p067l.InterfaceC17161
    /* JADX INFO: renamed from: ֫ */
    public boolean mo12311(String str) {
        return (str == null || ((HashSet) this.f68226).add(str)) ? false : true;
    }
}
