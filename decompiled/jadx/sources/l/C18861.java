package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8LL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18861 implements InterfaceC14723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f59469;

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C8353 mo1025() {
        return null;
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo1026(C18252 c18252) {
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo1027() {
        return null;
    }

    public C18861(ArrayList arrayList) {
        this.f59469 = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((C4044) arrayList.get(0)).f12828;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((C4044) arrayList.get(i)).f12830 < j) {
                    z = true;
                    break;
                }
                j = ((C4044) arrayList.get(i)).f12828;
            }
        }
        C22632.m50631(!z);
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f59469;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18861.class != obj.getClass()) {
            return false;
        }
        return this.f59469.equals(((C18861) obj).f59469);
    }

    public final int hashCode() {
        return this.f59469.hashCode();
    }
}
