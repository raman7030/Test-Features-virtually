package p067l;

/* JADX INFO: renamed from: l.ۘܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB8X */
/* JADX INFO: loaded from: classes3.dex */
public final class C6234 extends C19034 {
    @Override // p067l.C19034
    /* JADX INFO: renamed from: ֫ */
    public final void mo14144(int i, AbstractC15405 abstractC15405) {
        if ((abstractC15405 instanceof C14930) || (abstractC15405 instanceof C14260) || (abstractC15405 instanceof C4873) || (abstractC15405 instanceof C10237) || (abstractC15405 instanceof C17612) || (abstractC15405 instanceof C22308) || (abstractC15405 instanceof C22978) || (abstractC15405 instanceof C6884)) {
            m43241(i, (Object) abstractC15405);
            return;
        }
        throw new IllegalArgumentException("bad type for bootstrap argument: " + abstractC15405.getClass());
    }
}
