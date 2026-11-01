package p067l;

/* JADX INFO: renamed from: l.֫ۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes3.dex */
public final class C3858 extends AbstractC10564 {

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC10564[] f8345;

    public C3858(AbstractC6462 abstractC6462, AbstractC10564[] abstractC10564Arr) {
        super(abstractC6462);
        this.f8345 = abstractC10564Arr;
    }

    public C3858(C7251 c7251, C4848 c4848) {
        super(c7251);
        this.f8345 = (AbstractC10564[]) c4848.toArray(new AbstractC10564[c4848.m10289()]);
    }

    @Override // p067l.AbstractC10564
    /* JADX INFO: renamed from: ֫ */
    public final void mo7611(InterfaceC11235 interfaceC11235) {
        interfaceC11235.mo26024(this);
    }

    @Override // p067l.InterfaceC12404
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        AbstractC10564[] abstractC10564Arr = this.f8345;
        int length = abstractC10564Arr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            AbstractC10564 abstractC10564 = abstractC10564Arr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append(abstractC10564);
            i++;
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // p067l.AbstractC10564, p067l.InterfaceC12404
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7610(InterfaceC8380 interfaceC8380) {
        return interfaceC8380.mo19535(C4848.m10282((Object[]) this.f8345));
    }

    @Override // p067l.AbstractC10564
    /* JADX INFO: renamed from: ۧ */
    public final C11827 mo7612() {
        AbstractC10564[] abstractC10564Arr = this.f8345;
        if (abstractC10564Arr.length != 0) {
            return abstractC10564Arr[0].mo7612();
        }
        return null;
    }
}
