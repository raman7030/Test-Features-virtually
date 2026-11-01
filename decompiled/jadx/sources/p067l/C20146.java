package p067l;

import bin.p000mt.plus.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ᩴۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20146 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ AbstractC17043 f62364;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC18686 f62365;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20146(ActivityC18686 activityC18686, ActivityC18686 activityC18687, AbstractC17043 abstractC17043) {
        super(activityC18687, -1);
        this.f62365 = activityC18686;
        this.f62364 = abstractC17043;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (strM33346.contains("/") || strM33346.contains("\\")) {
            m33349(R.string.MT_Protector);
            return;
        }
        AbstractC17043 abstractC17043M38684 = this.f62364.m38684(strM33346);
        if (abstractC17043M38684.mo25094()) {
            m33349(R.string.MT_Protector);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (AbstractC16003 abstractC16003 : this.f62365.f55797) {
                C14146 c14146Mo19367 = abstractC16003.mo19367();
                if (c14146Mo19367 != null) {
                    linkedHashMap.put(abstractC16003, c14146Mo19367);
                }
            }
            new C6064(this, linkedHashMap, abstractC17043M38684).m22250();
        } catch (IllegalStateException unused) {
            C22682.m50793(R.string.MT_Protector);
        }
    }
}
