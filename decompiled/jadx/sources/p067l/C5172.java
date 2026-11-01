package p067l;

import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBI9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5172 implements InterfaceC18621 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C14559 f12164;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ HashSet f12165;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C22783[] f12166;

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ֫ */
    public final void mo9599(C13889 c13889) {
    }

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ֫ */
    public final void mo9600(C15229 c15229) {
    }

    public C5172(C14559 c14559, C22783[] c22783Arr, HashSet hashSet) {
        this.f12164 = c14559;
        this.f12166 = c22783Arr;
        this.f12165 = hashSet;
    }

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ۧ */
    public final void mo9602(C13889 c13889) {
        if (c13889.mo31602().m11605() != 3) {
            return;
        }
        int iMo4598 = ((C4873) ((AbstractC16076) c13889.mo31607()).m36587()).mo4598();
        C22783[] c22783Arr = this.f12166;
        C22783 c22783 = c22783Arr[iMo4598];
        if (c22783 == null) {
            c22783Arr[iMo4598] = c13889.m36175();
            return;
        }
        C22783 c22783M36175 = c13889.m36175();
        C20101 c20101M50990 = c22783.m50990();
        C20101 c20101M50991 = c22783M36175.m50990();
        if (c20101M50990 == null) {
            c20101M50990 = c20101M50991;
        } else if (c20101M50991 != null && !c20101M50990.equals(c20101M50991)) {
            return;
        }
        C14559 c14559 = this.f12164;
        c14559.f41560.m49521(c22783.m50989()).m36173(c20101M50990);
        C6513 c6513 = new C6513(this, c22783M36175, c22783);
        List listM49526 = c14559.f41560.m49526(c22783M36175.m50989());
        int size = listM49526.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AbstractC15938) listM49526.get(size)).mo31604(c6513);
            } else {
                this.f12165.add(c13889);
                return;
            }
        }
    }
}
