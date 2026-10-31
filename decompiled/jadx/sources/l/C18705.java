package l;

import bin.mt.plus.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ᩴۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18705 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f59140;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f59141;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18705(ActivityC17169 activityC17169, ActivityC17169 activityC171610, AbstractC15440 abstractC15440) {
        super(activityC171610, -1);
        this.f59141 = activityC17169;
        this.f59140 = abstractC15440;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (strM31260.contains("/") || strM31260.contains("\\")) {
            m31263(R.string.MT_Protector);
            return;
        }
        AbstractC15440 abstractC15440M36526 = this.f59140.m36526(strM31260);
        if (abstractC15440M36526.mo23120()) {
            m31263(R.string.MT_Protector);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (AbstractC14346 abstractC14346 : this.f59141.f52616) {
                C12392 c12392Mo17427 = abstractC14346.mo17427();
                if (c12392Mo17427 != null) {
                    linkedHashMap.put(abstractC14346, c12392Mo17427);
                }
            }
            new C3888(this, linkedHashMap, abstractC15440M36526).m20274();
        } catch (IllegalStateException unused) {
            C21374.m48457(R.string.MT_Protector);
        }
    }
}
