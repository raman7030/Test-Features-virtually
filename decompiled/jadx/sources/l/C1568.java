package l;

/* JADX INFO: renamed from: l.֫ۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes3.dex */
public final class C1568 extends AbstractC8624 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC8624[] f5564;

    public C1568(AbstractC4308 abstractC4308, AbstractC8624[] abstractC8624Arr) {
        super(abstractC4308);
        this.f5564 = abstractC8624Arr;
    }

    public C1568(C5138 c5138, C2609 c2609) {
        super(c5138);
        this.f5564 = (AbstractC8624[]) c2609.toArray(new AbstractC8624[c2609.m8245()]);
    }

    @Override // l.AbstractC8624
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5382(InterfaceC9330 interfaceC9330) {
        interfaceC9330.mo24015(this);
    }

    @Override // l.InterfaceC10559
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        AbstractC8624[] abstractC8624Arr = this.f5564;
        int length = abstractC8624Arr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            AbstractC8624 abstractC8624 = abstractC8624Arr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append(abstractC8624);
            i++;
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // l.AbstractC8624, l.InterfaceC10559
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo5381(InterfaceC6325 interfaceC6325) {
        return interfaceC6325.mo17595(C2609.m8238((Object[]) this.f5564));
    }

    @Override // l.AbstractC8624
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9953 mo5383() {
        AbstractC8624[] abstractC8624Arr = this.f5564;
        if (abstractC8624Arr.length != 0) {
            return abstractC8624Arr[0].mo5383();
        }
        return null;
    }
}
