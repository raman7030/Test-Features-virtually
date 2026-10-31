package l;

/* JADX INFO: renamed from: l.ܺ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15808 extends AbstractC18632 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC18632
    /* JADX INFO: renamed from: ֫ */
    public final void mo19151(InterfaceC8754 interfaceC8754, AbstractC9460 abstractC9460, AbstractC9460 abstractC9461, Object obj) {
        InterfaceC2404 interfaceC2404 = (InterfaceC2404) abstractC9460;
        InterfaceC2404 interfaceC2405 = (InterfaceC2404) abstractC9461;
        StringBuilder sb = (StringBuilder) obj;
        sb.append(interfaceC2404.hashCode() + " -> " + interfaceC2405.hashCode());
        sb.append(interfaceC2404.mo5712(interfaceC2405, interfaceC8754).toString().replaceAll(",", " ").replaceAll("\\{", "[").replaceAll("\\}", "]"));
        sb.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC18632
    /* JADX INFO: renamed from: ֫ */
    public final void mo19152(AbstractC9460 abstractC9460, Object obj) {
        InterfaceC2404 interfaceC2404 = (InterfaceC2404) abstractC9460;
        StringBuilder sb = (StringBuilder) obj;
        sb.append(interfaceC2404.hashCode() + " ");
        sb.append(interfaceC2404.mo5711().toString().replaceAll(",", " ").replaceAll("\\{", "[").replaceAll("\\}", "]"));
        sb.append('\n');
    }
}
