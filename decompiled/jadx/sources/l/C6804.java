package l;

import java.util.ArrayList;
import java.util.List;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ۜܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6804 implements InterfaceC21213 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f21099;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21100;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f21101;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15975 f21102;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f21103;

    public C6804(C15975 c15975, ArrayList arrayList, AbstractC15440 abstractC15440, int i, AbstractC15440 abstractC15441) {
        this.f21102 = c15975;
        this.f21099 = arrayList;
        this.f21103 = abstractC15440;
        this.f21100 = i;
        this.f21101 = abstractC15441;
    }

    @Override // l.InterfaceC21213
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18443(AbstractC15440 abstractC15440) {
        this.f21102.f49300.m38486(abstractC15440);
        List list = this.f21099;
        if (list != null) {
            list.add(new C8921(abstractC15440));
        }
    }

    @Override // l.InterfaceC21213
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18444(IInArchive iInArchive) {
        C15975 c15975 = this.f21102;
        AbstractC15440 abstractC15440 = this.f21103;
        try {
            int numberOfItems = iInArchive.getNumberOfItems();
            String[] strArr = new String[numberOfItems];
            C9627[] c9627Arr = new C9627[numberOfItems];
            int i = C15975.f49290;
            String strMo23554 = abstractC15440.mo23554();
            boolean z = (C16999.m39887(strMo23554) || C16999.m39877(strMo23554)) ? false : true;
            for (int i2 = 0; i2 < numberOfItems; i2++) {
                C4007 c4007M12071 = C4007.m12071(iInArchive, i2);
                boolean z2 = z && c4007M12071.m12083() != null;
                String strM39860 = C16999.m39860(c4007M12071.m12082(), z2 ? false : c4007M12071.m12076());
                strArr[i2] = strM39860;
                if (z2) {
                    c9627Arr[i2] = new C9627(strM39860, C16999.m39881(strM39860, c4007M12071.m12083()), c4007M12071.m12076());
                }
            }
            c15975.m37776(abstractC15440);
            C15975.m37773(c15975, abstractC15440, this.f21100, iInArchive, this.f21101, strArr, c9627Arr);
        } finally {
            C0349.m1793(iInArchive);
        }
    }

    @Override // l.InterfaceC21213
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo18445() {
        this.f21102.cancel();
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f21102.mo1526();
    }
}
