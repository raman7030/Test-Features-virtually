package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩶ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20296 implements InterfaceC7961, InterfaceC15564, InterfaceC21423, InterfaceC20106, InterfaceC4585 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65551;

    public /* synthetic */ C20296(Object obj) {
        this.f65551 = obj;
    }

    @Override // l.InterfaceC21423
    public Object apply(Object obj) {
        return (FutureC3575) this.f65551;
    }

    @Override // l.InterfaceC20106
    /* JADX INFO: renamed from: ֫ */
    public void mo13218(Object obj) {
        ((ActivityC17169) this.f65551).m40271((InterfaceC9922) obj);
    }

    @Override // l.InterfaceC4585
    /* JADX INFO: renamed from: ᩳ */
    public void mo1502() {
        ActivityC6242.m17210((ActivityC6242) this.f65551);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC0612) obj).mo2504((C17546) this.f65551);
    }

    @Override // l.InterfaceC15564
    /* JADX INFO: renamed from: ֫ */
    public boolean mo10274(String str) {
        return (str == null || ((HashSet) this.f65551).add(str)) ? false : true;
    }
}
