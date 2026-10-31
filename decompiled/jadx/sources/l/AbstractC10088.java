package l;

/* JADX INFO: renamed from: l.ۤۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10088 extends AbstractC15731 {
    @Override // l.AbstractC15731, l.InterfaceC3738
    /* JADX INFO: renamed from: ֫ */
    public final void mo7197(C5149 c5149) throws C19136 {
        if (c5149 instanceof InterfaceC12204) {
            this.f48531.add(c5149);
            return;
        }
        throw new C19136("Text content elements cannot contain " + c5149 + " elements.");
    }
}
