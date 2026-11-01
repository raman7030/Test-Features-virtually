package p067l;

import bin.p000mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10418 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ String f28810;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC22429 f28811;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ boolean f28812;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10418(ActivityC22429 activityC22429, ActivityC22429 activityC224210, String str, boolean z) {
        super(activityC224210, -1);
        this.f28811 = activityC22429;
        this.f28810 = str;
        this.f28812 = z;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strTrim = m33346().replace('.', '/').trim();
        if (strTrim.length() != 0) {
            String str = this.f28810;
            if (!strTrim.equals(str)) {
                ActivityC22429 activityC22429 = this.f28811;
                Iterator it = activityC22429.f70775.f60060.f80355.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(strTrim)) {
                        m33337(String.format(activityC22429.getString(R.string.MT_Protector), strTrim));
                        return;
                    }
                }
                String strReplace = str.replace('.', '/');
                if (this.f28812) {
                    strTrim = strTrim.concat("/");
                    strReplace = C17588.m40053(strReplace, "/");
                }
                ActivityC22429.m50384(activityC22429, C10965.m25286(new StringBuilder(), activityC22429.f70775.f60060.f80350, strReplace), C10965.m25286(new StringBuilder(), activityC22429.f70775.f60060.f80350, strTrim));
                ActivityC22429.f70770 = true;
                activityC22429.f70775.f60049.clear();
                for (C13068 c13068 : activityC22429.f70775.f60057.f13741.m27253()) {
                    activityC22429.f70775.f60049.put(C17073.m38720(1, 1, c13068.m29923().m53168()), c13068);
                }
                activityC22429.f70775.f60064.m37213(activityC22429.f70775.f60049.keySet());
                activityC22429.m50391();
                m33348();
                return;
            }
        }
        m33348();
    }
}
