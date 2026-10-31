package l;

/* JADX INFO: renamed from: l.ۘܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB8X */
/* JADX INFO: loaded from: classes3.dex */
public final class C4067 extends C17535 {
    @Override // l.C17535
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12223(int i, AbstractC13717 abstractC13717) {
        if ((abstractC13717 instanceof C13217) || (abstractC13717 instanceof C12512) || (abstractC13717 instanceof C2635) || (abstractC13717 instanceof C8279) || (abstractC13717 instanceof C16039) || (abstractC13717 instanceof C20980) || (abstractC13717 instanceof C21685) || (abstractC13717 instanceof C4751)) {
            m40981(i, (Object) abstractC13717);
            return;
        }
        throw new IllegalArgumentException("bad type for bootstrap argument: " + abstractC13717.getClass());
    }
}
