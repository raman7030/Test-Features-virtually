package l;

/* JADX INFO: renamed from: l.ۡ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 6628 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8891 extends AbstractC19475 implements InterfaceC4060 {
    public final int hashCode() {
        return mo12181().hashCode() + ((mo12182().hashCode() + ((mo12183().hashCode() + ((mo12184().hashCode() + (getName().hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC4060)) {
            InterfaceC4060 interfaceC4060 = (InterfaceC4060) obj;
            if (mo12184().equals(interfaceC4060.mo12184()) && mo12183().equals(interfaceC4060.mo12183()) && mo12182().equals(interfaceC4060.mo12182()) && mo12181().equals(interfaceC4060.mo12181())) {
                return true;
            }
        }
        return false;
    }
}
