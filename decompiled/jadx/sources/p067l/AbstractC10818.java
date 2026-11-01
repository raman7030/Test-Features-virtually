package p067l;

/* JADX INFO: renamed from: l.ۡ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 6628 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10818 extends AbstractC20877 implements InterfaceC6227 {
    public final int hashCode() {
        return mo14102().hashCode() + ((mo14103().hashCode() + ((mo14104().hashCode() + ((mo14105().hashCode() + (getName().hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC6227)) {
            InterfaceC6227 interfaceC6227 = (InterfaceC6227) obj;
            if (mo14105().equals(interfaceC6227.mo14105()) && mo14104().equals(interfaceC6227.mo14104()) && mo14103().equals(interfaceC6227.mo14103()) && mo14102().equals(interfaceC6227.mo14102())) {
                return true;
            }
        }
        return false;
    }
}
