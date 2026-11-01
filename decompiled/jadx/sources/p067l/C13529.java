package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21XP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13529 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ Set f38050;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C15539 f38051;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ C4697 f38052;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13529(C15539 c15539, Main main, Set set, C4697 c4697) {
        super(main, -1);
        this.f38051 = c15539;
        this.f38050 = set;
        this.f38052 = c4697;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (strM33346.contains("\\") || strM33346.contains("/")) {
            m33349(R.string.MT_Protector);
            return;
        }
        boolean zContains = (ApplicationC21448.f67649.getBoolean("delete_dex_files_after_merged", false) ? this.f38050 : Collections.EMPTY_SET).contains(strM33346.toLowerCase());
        C15539 c15539 = this.f38051;
        if (!zContains && C15539.m35332(c15539, strM33346)) {
            m33349(R.string.MT_Protector);
            return;
        }
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C24257.class);
        C4697 c4697 = this.f38052;
        c3313.m5781(c4697.m9957());
        c3313.m5789(c4697);
        c3313.m5777("outputPath", c15539.f44401.m38684(strM33346).mo25505());
        c3313.m5772();
        m33348();
    }
}
