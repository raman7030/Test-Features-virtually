package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBEP */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5211 {

    /* JADX INFO: renamed from: ֫ */
    public final C23316 f12233;

    /* JADX INFO: renamed from: ۧ */
    public final C21975 f12234;

    public AbstractC5211(C21975 c21975, C23316 c23316) {
        this.f12234 = c21975;
        this.f12233 = c23316;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22783 m11176(AbstractC15938 abstractC15938, C22783 c22783) {
        C23316 c23316;
        C17950 c17950M36177 = abstractC15938.m36177();
        ArrayList arrayListM40832 = c17950M36177.m40832();
        int iIndexOf = arrayListM40832.indexOf(abstractC15938);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("specified insn is not in this block");
        }
        if (iIndexOf != arrayListM40832.size() - 1) {
            throw new IllegalArgumentException("Adding move here not supported:" + abstractC15938.mo4819());
        }
        C21975 c21975 = this.f12234;
        C22783 c22783M50968 = C22783.m50968(c21975.m49520(), c22783.m50974());
        arrayListM40832.add(iIndexOf, AbstractC15938.m36170(new C3336(C14065.m31920(c22783M50968.getType()), C12054.f33582, c22783M50968, C21442.m48568(c22783)), c17950M36177));
        int iM50989 = c22783M50968.m50989();
        InterfaceC8976 it = c17950M36177.m40836().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c23316 = this.f12233;
            if (!zHasNext) {
                break;
            }
            c23316.m51924(iM50989, it.next());
        }
        C21442 c21442Mo31600 = abstractC15938.mo31600();
        int size = c21442Mo31600.size();
        for (int i = 0; i < size; i++) {
            c23316.m51924(iM50989, c21442Mo31600.m56524get(i).m50989());
        }
        c21975.m49511();
        return c22783M50968;
    }
}
