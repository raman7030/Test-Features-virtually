package p067l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۖۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BHP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4540 implements InterfaceC18621 {

    /* JADX INFO: renamed from: ֫ */
    public final C17950 f10169;

    /* JADX INFO: renamed from: ۧ */
    public final C22783[] f10170;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ RunnableC5881 f10171;

    /* JADX INFO: renamed from: ܿ */
    public final HashSet f10173 = new HashSet();

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f10172 = new HashMap();

    /* JADX INFO: renamed from: ᩳ */
    public final C17279 f10174 = new C17279(this);

    public C4540(RunnableC5881 runnableC5881, C17950 c17950) {
        this.f10171 = runnableC5881;
        this.f10169 = c17950;
        this.f10170 = runnableC5881.f14460[c17950.m40826()];
        runnableC5881.f14460[c17950.m40826()] = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9598() {
        RunnableC5881 runnableC5881;
        C17950 c17950 = this.f10169;
        c17950.m40816(this);
        C10575 c10575 = new C10575(this);
        BitSet bitSetM40821 = c17950.m40821();
        int iNextSetBit = bitSetM40821.nextSetBit(0);
        while (true) {
            runnableC5881 = this.f10171;
            if (iNextSetBit < 0) {
                break;
            }
            ((C17950) runnableC5881.f14463.m49517().get(iNextSetBit)).m40819(c10575);
            iNextSetBit = bitSetM40821.nextSetBit(iNextSetBit + 1);
        }
        ArrayList arrayListM40832 = c17950.m40832();
        boolean z = true;
        for (int size = arrayListM40832.size() - 1; size >= 0; size--) {
            AbstractC15938 abstractC15938 = (AbstractC15938) arrayListM40832.get(size);
            AbstractC15938 abstractC15939 = (AbstractC15938) this.f10172.get(abstractC15938);
            if (abstractC15939 != null) {
                arrayListM40832.set(size, abstractC15939);
            } else if (abstractC15938.mo31601() && !this.f10173.contains(abstractC15938)) {
                arrayListM40832.remove(size);
            }
        }
        for (C17950 c17951 : c17950.m40811()) {
            if (c17951 != c17950) {
                C22783[] c22783Arr = this.f10170;
                if (!z) {
                    C22783[] c22783Arr2 = new C22783[c22783Arr.length];
                    System.arraycopy(c22783Arr, 0, c22783Arr2, 0, c22783Arr.length);
                    c22783Arr = c22783Arr2;
                }
                runnableC5881.f14460[c17951.m40826()] = c22783Arr;
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m9596(int i, C22783 c22783) {
        int iM50989 = c22783.m50989();
        C20101 c20101M50990 = c22783.m50990();
        C22783[] c22783Arr = this.f10170;
        c22783Arr[i] = c22783;
        int length = c22783Arr.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            } else if (iM50989 == c22783Arr[length].m50989()) {
                c22783Arr[length] = c22783;
            }
        }
        if (c20101M50990 == null) {
            return;
        }
        RunnableC5881.m13207(this.f10171, c22783);
        int length2 = c22783Arr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            C22783 c22784 = c22783Arr[length2];
            if (iM50989 != c22784.m50989() && c20101M50990.equals(c22784.m50990())) {
                c22783Arr[length2] = c22784.m50979((C20101) null);
            }
        }
    }

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ֫ */
    public final void mo9600(C15229 c15229) {
        m9601((AbstractC15938) c15229);
    }

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ֫ */
    public final void mo9599(C13889 c13889) {
        C22783 c22783M36175 = c13889.m36175();
        int iM50989 = c22783M36175.m50989();
        int iM509810 = c13889.mo31600().m56524get(0).m50989();
        c13889.mo31604(this.f10174);
        int iM509811 = c13889.mo31600().m56524get(0).m50989();
        C20101 c20101M50990 = this.f10170[iM509810].m50990();
        C20101 c20101M50991 = c22783M36175.m50990();
        if (c20101M50991 == null) {
            c20101M50991 = c20101M50990;
        }
        RunnableC5881 runnableC5881 = this.f10171;
        C20101 c20101M13208 = RunnableC5881.m13208(runnableC5881, iM509811);
        boolean z = c20101M13208 == null || c20101M50991 == null || c20101M50991.equals(c20101M13208);
        C22783 c22783M50973 = C22783.m50973(iM509811, c22783M36175.getType(), c20101M50991);
        if (!C7854.m18150() || (z && ((c20101M50991 == c20101M50990 || (c20101M50991 != null && c20101M50991.equals(c20101M50990))) && runnableC5881.f14462 == 0))) {
            m9596(iM50989, c22783M50973);
            return;
        }
        if (z && c20101M50990 == null && runnableC5881.f14462 == 0) {
            this.f10172.put(c13889, new C13889(new C3336(C14065.m31918(c22783M50973), C12054.f33582, (C22783) null, C21442.m48568(C22783.m50969(c22783M50973.m50989(), c22783M50973.getType(), c20101M50991))), this.f10169));
            m9596(iM50989, c22783M50973);
        } else {
            m9601((AbstractC15938) c13889);
            this.f10173.add(c13889);
        }
    }

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ۧ */
    public final void mo9602(C13889 c13889) {
        c13889.mo31604(this.f10174);
        m9601((AbstractC15938) c13889);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9601(AbstractC15938 abstractC15938) {
        C22783 c22783M36175 = abstractC15938.m36175();
        if (c22783M36175 == null) {
            return;
        }
        int iM50989 = c22783M36175.m50989();
        RunnableC5881 runnableC5881 = this.f10171;
        if (RunnableC5881.m13210(runnableC5881, iM50989)) {
            return;
        }
        abstractC15938.m36171(runnableC5881.f14464);
        m9596(iM50989, abstractC15938.m36175());
        runnableC5881.f14464++;
    }
}
