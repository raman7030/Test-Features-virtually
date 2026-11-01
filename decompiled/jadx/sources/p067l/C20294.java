package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8LL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20294 implements InterfaceC16361 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f62698;

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10307 mo3421() {
        return null;
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo3422(C19715 c19715) {
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo3423() {
        return null;
    }

    public C20294(ArrayList arrayList) {
        this.f62698 = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((C6212) arrayList.get(0)).f15643;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((C6212) arrayList.get(i)).f15645 < j) {
                    z = true;
                    break;
                }
                j = ((C6212) arrayList.get(i)).f15643;
            }
        }
        C23877.m52957(!z);
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f62698;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20294.class != obj.getClass()) {
            return false;
        }
        return this.f62698.equals(((C20294) obj).f62698);
    }

    public final int hashCode() {
        return this.f62698.hashCode();
    }
}
