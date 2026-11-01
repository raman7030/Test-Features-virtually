package p067l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes5.dex */
public final class C22908 implements InterfaceC8453 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5473 f72094;

    public final String toString() {
        return "unnamedModule Completer";
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo9173() {
        return false;
    }

    public C22908(C5473 c5473) {
        this.f72094 = c5473;
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public final void mo9171(AbstractC7783 abstractC7783) {
        C5473 c5473 = this.f72094;
        if (c5473.f13061) {
            abstractC7783.f20410 = this;
            return;
        }
        C2417 c2417 = (C2417) abstractC7783;
        HashSet hashSet = new HashSet(c5473.m12097());
        hashSet.remove(c5473.f13069.f69129);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C2417) it.next()).mo18020();
        }
        c5473.m12057(c2417, hashSet);
    }
}
