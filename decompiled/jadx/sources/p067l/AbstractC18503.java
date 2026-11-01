package p067l;

/* JADX INFO: renamed from: l.ܽ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1FC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18503 implements InterfaceC8186 {
    /* JADX INFO: renamed from: ۧ */
    public abstract void mo9230(C20337 c20337, C12210 c12210, C20635 c20635);

    @Override // p067l.InterfaceC8186
    /* JADX INFO: renamed from: ֫ */
    public void mo6237(C20337 c20337, C12210 c12210, C20635 c20635) throws C3870 {
        c20337.m45913(false);
        if (c20635.m46640()) {
            String strM5533 = c20635.m46641().m5533();
            if (!strM5533.startsWith("@")) {
                if (strM5533.startsWith("?")) {
                    C13551.m30842(c20337, c12210, c20635);
                    return;
                }
            } else {
                C13551.m30843(c20337, c20635, c12210, true);
                return;
            }
        }
        mo9230(c20337, c12210, c20635);
    }
}
