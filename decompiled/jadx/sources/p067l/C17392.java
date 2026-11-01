package p067l;

/* JADX INFO: renamed from: l.ܺ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17392 extends AbstractC20076 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC20076
    /* JADX INFO: renamed from: ֫ */
    public final void mo21094(InterfaceC10688 interfaceC10688, AbstractC11359 abstractC11359, AbstractC11359 abstractC113510, Object obj) {
        InterfaceC4653 interfaceC4653 = (InterfaceC4653) abstractC11359;
        InterfaceC4653 interfaceC4654 = (InterfaceC4653) abstractC113510;
        StringBuilder sb = (StringBuilder) obj;
        sb.append(interfaceC4653.hashCode() + " -> " + interfaceC4654.hashCode());
        sb.append(interfaceC4653.mo7945(interfaceC4654, interfaceC10688).toString().replaceAll(",", " ").replaceAll("\\{", "[").replaceAll("\\}", "]"));
        sb.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC20076
    /* JADX INFO: renamed from: ֫ */
    public final void mo21095(AbstractC11359 abstractC11359, Object obj) {
        InterfaceC4653 interfaceC4653 = (InterfaceC4653) abstractC11359;
        StringBuilder sb = (StringBuilder) obj;
        sb.append(interfaceC4653.hashCode() + " ");
        sb.append(interfaceC4653.mo7944().toString().replaceAll(",", " ").replaceAll("\\{", "[").replaceAll("\\}", "]"));
        sb.append('\n');
    }
}
