package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۟ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BHK */
/* JADX INFO: loaded from: classes3.dex */
public final class C9606 {

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f26473;

    /* JADX INFO: renamed from: ۧ */
    public int f26471 = 0;

    /* JADX INFO: renamed from: ܽ */
    public C6689 f26472 = null;

    /* JADX INFO: renamed from: ֫ */
    public int[] f26470 = null;

    public C9606(int i) {
        this.f26473 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22384(int i, int i2) {
        int[] iArr = this.f26470;
        boolean z = iArr == null;
        if (i != 0 || z) {
            if (i < 0) {
                throw new RuntimeException("shouldn't happen");
            }
            if (z || i2 >= iArr.length) {
                int i3 = i2 + 1;
                C6689 c6689 = new C6689(i3);
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, -1);
                if (!z) {
                    c6689.m15245(this.f26472);
                    int[] iArr3 = this.f26470;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                }
                this.f26472 = c6689;
                this.f26470 = iArr2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22388(int i, C6689 c6689) {
        int iM15244 = c6689.m15244();
        m22384(i, iM15244 - 1);
        for (int i2 = 0; i2 < iM15244; i2++) {
            C22783 c22783 = this.f26472.get(i2);
            C22783 c22783M50978 = c6689.get(i2);
            if (c22783M50978 != null && c22783M50978.getType() == C9566.f26329) {
                c22783M50978 = c22783M50978.m50978(C9566.f26324);
            }
            if (c22783 == null) {
                if (c22783M50978 != null) {
                    m22389(i, c22783M50978);
                }
            } else if (c22783M50978 != null) {
                if (!c22783M50978.m50984(c22783)) {
                    m22390(i, EnumC24358.END_SIMPLY, c22783);
                    m22389(i, c22783M50978);
                }
            } else {
                m22390(i, EnumC24358.END_SIMPLY, c22783);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22389(int i, C22783 c22783) {
        C22783 c22784;
        C22783 c22785;
        int iM50989 = c22783.m50989();
        if (c22783.getType() == C9566.f26329) {
            c22783 = c22783.m50978(C9566.f26324);
        }
        m22384(i, iM50989);
        C22783 c22786 = this.f26472.get(iM50989);
        if (c22783.m50984(c22786)) {
            return;
        }
        C22783 c22783M15242 = this.f26472.m15242(c22783);
        if (c22783M15242 != null) {
            m22386(i, EnumC24358.END_MOVED, c22783M15242);
        }
        int i2 = this.f26470[iM50989];
        if (c22786 != null) {
            m22385(i, EnumC24358.END_REPLACED, c22786);
        } else if (i2 >= 0) {
            ArrayList arrayList = this.f26473;
            C15640 c15640 = (C15640) arrayList.get(i2);
            if (c15640.m35535() == i) {
                if (c15640.m35538(c22783)) {
                    arrayList.set(i2, null);
                    this.f26471++;
                    this.f26472.m15246(c22783);
                    this.f26470[iM50989] = -1;
                    return;
                }
                arrayList.set(i2, c15640.m35537(EnumC24358.END_REPLACED));
            }
        }
        if (iM50989 > 0 && (c22785 = this.f26472.get(iM50989 - 1)) != null && c22785.m50980()) {
            m22386(i, EnumC24358.END_CLOBBERED_BY_NEXT, c22785);
        }
        if (c22783.m50980() && (c22784 = this.f26472.get(iM50989 + 1)) != null) {
            m22386(i, EnumC24358.END_CLOBBERED_BY_PREV, c22784);
        }
        m22385(i, EnumC24358.START, c22783);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22390(int i, EnumC24358 enumC24358, C22783 c22783) {
        int iM50989 = c22783.m50989();
        if (c22783.getType() == C9566.f26329) {
            c22783 = c22783.m50978(C9566.f26324);
        }
        m22384(i, iM50989);
        if (this.f26470[iM50989] >= 0) {
            return;
        }
        ArrayList arrayList = this.f26473;
        boolean z = true;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            C15640 c15640 = (C15640) arrayList.get(size);
            if (c15640 != null) {
                if (c15640.m35535() != i) {
                    m22385(i, enumC24358, c22783);
                    return;
                } else if (c15640.m35538(c22783)) {
                    break;
                }
            }
            size--;
        }
        this.f26472.m15247(c22783);
        C15640 c15641 = null;
        arrayList.set(size, null);
        this.f26471++;
        int iM509810 = c22783.m50989();
        while (true) {
            size--;
            if (size < 0) {
                z = false;
                break;
            }
            c15641 = (C15640) arrayList.get(size);
            if (c15641 != null && c15641.m35543().m50989() == iM509810) {
                break;
            }
        }
        if (z) {
            this.f26470[iM509810] = size;
            if (c15641.m35535() == i) {
                arrayList.set(size, c15641.m35537(EnumC24358.END_SIMPLY));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m22385(int i, EnumC24358 enumC24358, C22783 c22783) {
        int iM50989 = c22783.m50989();
        C15640 c15640 = new C15640(i, enumC24358, c22783);
        ArrayList arrayList = this.f26473;
        arrayList.add(c15640);
        if (enumC24358 == EnumC24358.START) {
            this.f26472.m15246(c22783);
            this.f26470[iM50989] = -1;
        } else {
            this.f26472.m15247(c22783);
            this.f26470[iM50989] = arrayList.size() - 1;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m22386(int i, EnumC24358 enumC24358, C22783 c22783) {
        if (enumC24358 == EnumC24358.START) {
            throw new RuntimeException("shouldn't happen");
        }
        int i2 = this.f26470[c22783.m50989()];
        if (i2 >= 0) {
            ArrayList arrayList = this.f26473;
            C15640 c15640 = (C15640) arrayList.get(i2);
            if (c15640.m35535() == i && c15640.m35543().equals(c22783)) {
                arrayList.set(i2, c15640.m35537(enumC24358));
                this.f26472.m15247(c22783);
                return;
            }
        }
        m22390(i, enumC24358, c22783);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4162 m22387() {
        m22384(Integer.MAX_VALUE, 0);
        ArrayList<C15640> arrayList = this.f26473;
        int size = arrayList.size();
        int i = size - this.f26471;
        if (i == 0) {
            return C4162.f9179;
        }
        C15640[] c15640Arr = new C15640[i];
        if (size == i) {
            arrayList.toArray(c15640Arr);
        } else {
            int i2 = 0;
            for (C15640 c15640 : arrayList) {
                if (c15640 != null) {
                    c15640Arr[i2] = c15640;
                    i2++;
                }
            }
        }
        Arrays.sort(c15640Arr);
        C4162 c4162 = new C4162(i);
        for (int i3 = 0; i3 < i; i3++) {
            c4162.m43245(i3, c15640Arr[i3]);
        }
        c4162.mo22326();
        return c4162;
    }
}
