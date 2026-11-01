package p067l;

/* JADX INFO: renamed from: l.ۤۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11956 extends AbstractC17319 {
    @Override // p067l.AbstractC17319, p067l.InterfaceC5921
    /* JADX INFO: renamed from: ֫ */
    public final void mo9276(C7262 c7262) throws C20555 {
        if (c7262 instanceof InterfaceC13967) {
            this.f51671.add(c7262);
            return;
        }
        throw new C20555("Text content elements cannot contain " + c7262 + " elements.");
    }
}
