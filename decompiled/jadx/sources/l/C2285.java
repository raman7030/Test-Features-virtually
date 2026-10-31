package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۖۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BHP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2285 implements InterfaceC17101 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16395 f7383;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21480[] f7384;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC3696 f7385;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashSet f7387 = new HashSet();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f7386 = new HashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15689 f7388 = new C15689(this);

    public C2285(RunnableC3696 runnableC3696, C16395 c16395) {
        this.f7385 = runnableC3696;
        this.f7383 = c16395;
        this.f7384 = runnableC3696.f11658[c16395.m38609()];
        runnableC3696.f11658[c16395.m38609()] = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7530() {
        RunnableC3696 runnableC3696;
        C16395 c16395 = this.f7383;
        c16395.m38599(this);
        C8635 c8635 = new C8635(this);
        BitSet bitSetM38604 = c16395.m38604();
        int iNextSetBit = bitSetM38604.nextSetBit(0);
        while (true) {
            runnableC3696 = this.f7385;
            if (iNextSetBit < 0) {
                break;
            }
            ((C16395) runnableC3696.f11661.m47190().get(iNextSetBit)).m38602(c8635);
            iNextSetBit = bitSetM38604.nextSetBit(iNextSetBit + 1);
        }
        ArrayList arrayListM38615 = c16395.m38615();
        boolean z = true;
        for (int size = arrayListM38615.size() - 1; size >= 0; size--) {
            AbstractC14278 abstractC14278 = (AbstractC14278) arrayListM38615.get(size);
            AbstractC14278 abstractC14279 = (AbstractC14278) this.f7386.get(abstractC14278);
            if (abstractC14279 != null) {
                arrayListM38615.set(size, abstractC14279);
            } else if (abstractC14278.mo29536() && !this.f7387.contains(abstractC14278)) {
                arrayListM38615.remove(size);
            }
        }
        for (C16395 c16396 : c16395.m38594()) {
            if (c16396 != c16395) {
                C21480[] c21480Arr = this.f7384;
                if (!z) {
                    C21480[] c21480Arr2 = new C21480[c21480Arr.length];
                    System.arraycopy(c21480Arr, 0, c21480Arr2, 0, c21480Arr.length);
                    c21480Arr = c21480Arr2;
                }
                runnableC3696.f11658[c16396.m38609()] = c21480Arr;
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m7528(int i, C21480 c21480) {
        int iM48652 = c21480.m48652();
        C18658 c18658M48653 = c21480.m48653();
        C21480[] c21480Arr = this.f7384;
        c21480Arr[i] = c21480;
        int length = c21480Arr.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            } else if (iM48652 == c21480Arr[length].m48652()) {
                c21480Arr[length] = c21480;
            }
        }
        if (c18658M48653 == null) {
            return;
        }
        RunnableC3696.m11261(this.f7385, c21480);
        int length2 = c21480Arr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            C21480 c21481 = c21480Arr[length2];
            if (iM48652 != c21481.m48652() && c18658M48653.equals(c21481.m48653())) {
                c21480Arr[length2] = c21481.m48642((C18658) null);
            }
        }
    }

    @Override // l.InterfaceC17101
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7532(C13532 c13532) {
        m7533((AbstractC14278) c13532);
    }

    @Override // l.InterfaceC17101
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7531(C12122 c12122) {
        C21480 c21480M34042 = c12122.m34042();
        int iM48652 = c21480M34042.m48652();
        int iM48653 = c12122.mo29535().m41004get(0).m48652();
        c12122.mo29539(this.f7388);
        int iM48654 = c12122.mo29535().m41004get(0).m48652();
        C18658 c18658M48653 = this.f7384[iM48653].m48653();
        C18658 c18658M48654 = c21480M34042.m48653();
        if (c18658M48654 == null) {
            c18658M48654 = c18658M48653;
        }
        RunnableC3696 runnableC3696 = this.f7385;
        C18658 c18658M11262 = RunnableC3696.m11262(runnableC3696, iM48654);
        boolean z = c18658M11262 == null || c18658M48654 == null || c18658M48654.equals(c18658M11262);
        C21480 c21480M48636 = C21480.m48636(iM48654, c21480M34042.getType(), c18658M48654);
        if (!C5772.m16231() || (z && ((c18658M48654 == c18658M48653 || (c18658M48654 != null && c18658M48654.equals(c18658M48653))) && runnableC3696.f11660 == 0))) {
            m7528(iM48652, c21480M48636);
            return;
        }
        if (z && c18658M48653 == null && runnableC3696.f11660 == 0) {
            this.f7386.put(c12122, new C12122(new C1018(C12307.m29858(c21480M48636), C10191.f30620, (C21480) null, C20069.m46252(C21480.m48632(c21480M48636.m48652(), c21480M48636.getType(), c18658M48654))), this.f7383));
            m7528(iM48652, c21480M48636);
        } else {
            m7533((AbstractC14278) c12122);
            this.f7387.add(c12122);
        }
    }

    @Override // l.InterfaceC17101
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo7534(C12122 c12122) {
        c12122.mo29539(this.f7388);
        m7533((AbstractC14278) c12122);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7533(AbstractC14278 abstractC14278) {
        C21480 c21480M34042 = abstractC14278.m34042();
        if (c21480M34042 == null) {
            return;
        }
        int iM48652 = c21480M34042.m48652();
        RunnableC3696 runnableC3696 = this.f7385;
        if (RunnableC3696.m11264(runnableC3696, iM48652)) {
            return;
        }
        abstractC14278.m34038(runnableC3696.f11662);
        m7528(iM48652, abstractC14278.m34042());
        runnableC3696.f11662++;
    }
}
