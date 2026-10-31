package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21XP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11743 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f35050;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13858 f35051;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f35052;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11743(C13858 c13858, Main main, Set set, C2450 c2450) {
        super(main, -1);
        this.f35051 = c13858;
        this.f35050 = set;
        this.f35052 = c2450;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (strM31260.contains("\\") || strM31260.contains("/")) {
            m31263(R.string.MT_Protector);
            return;
        }
        boolean zContains = (ApplicationC20075.f65008.getBoolean("delete_dex_files_after_merged", false) ? this.f35050 : Collections.EMPTY_SET).contains(strM31260.toLowerCase());
        C13858 c13858 = this.f35051;
        if (!zContains && C13858.m33213(c13858, strM31260)) {
            m31263(R.string.MT_Protector);
            return;
        }
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C23031.class);
        C2450 c2450 = this.f35052;
        c0994.m3478(c2450.m7909());
        c0994.m3486(c2450);
        c0994.m3474("outputPath", c13858.f41322.m36526(strM31260).mo23554());
        c0994.m3469();
        m31262();
    }
}
