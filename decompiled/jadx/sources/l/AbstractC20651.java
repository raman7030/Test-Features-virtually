package l;

/* JADX INFO: renamed from: l.᩷ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 952M */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20651 implements InterfaceC1641 {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC1641) {
            return mo5516().equals(((InterfaceC1641) obj).mo5516());
        }
        return false;
    }

    public final int hashCode() {
        return mo5516().hashCode();
    }

    public final String toString() {
        return mo5516().toString();
    }
}
