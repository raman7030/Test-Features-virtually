package l;

/* JADX INFO: renamed from: l.֫֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8A8 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1488 implements InterfaceC18547 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17010 f5327;

    @Override // l.InterfaceC18547
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo5152(C15723 c15723) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17010 m5149() {
        return this.f5327;
    }

    @Override // l.InterfaceC18547
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5150(C15723 c15723) {
        C17010 c17010 = this.f5327;
        if (c17010 != null) {
            c15723.m37108(c17010);
        }
    }

    @Override // l.InterfaceC18547
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo5151(C15723 c15723) throws C8669 {
        c15723.m37107(EnumC3730.FOUR);
        int iM37111 = c15723.m37111();
        EnumC13606 enumC13606 = EnumC13606.SHARE_INFO_1_CONTAINER;
        if (iM37111 != enumC13606.m32722()) {
            throw new C8669(String.format("Expected info level %d, got: %d", Integer.valueOf(enumC13606.m32722()), Integer.valueOf(iM37111)));
        }
        int iM37112 = c15723.m37111();
        if (iM37112 == iM37111) {
            if (c15723.m37111() != 0) {
                this.f5327 = new C17010();
                return;
            } else {
                this.f5327 = null;
                return;
            }
        }
        throw new C8669(String.format("Expected info level %d to match enum level, got: %d", Integer.valueOf(iM37111), Integer.valueOf(iM37112)));
    }
}
