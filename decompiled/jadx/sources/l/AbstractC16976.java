package l;

/* JADX INFO: renamed from: l.ܽ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1FC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16976 implements InterfaceC6121 {
    /* JADX INFO: renamed from: ۧ */
    public abstract void mo7135(C18906 c18906, C10355 c10355, C19220 c19220);

    @Override // l.InterfaceC6121
    /* JADX INFO: renamed from: ֫ */
    public void mo3995(C18906 c18906, C10355 c10355, C19220 c19220) throws C1580 {
        c18906.m43647(false);
        if (c19220.m44346()) {
            String strM3219 = c19220.m44347().m3219();
            if (!strM3219.startsWith("@")) {
                if (strM3219.startsWith("?")) {
                    C11766.m28795(c18906, c10355, c19220);
                    return;
                }
            } else {
                C11766.m28796(c18906, c19220, c10355, true);
                return;
            }
        }
        mo7135(c18906, c10355, c19220);
    }
}
