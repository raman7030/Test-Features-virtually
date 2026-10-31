package l;

import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20464 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f65972;

    public C20464(ActivityC21107 activityC21107) {
        this.f65972 = activityC21107;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f65972, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        ActivityC21107 activityC21107 = this.f65972;
        C18284 c18284 = activityC21107.f68093;
        int i = C16999.f52136;
        c18284.f56842 = C16999.m39862(activityC21107.getIntent());
        activityC21107.f68093.f56840 = new C3454(activityC21107.f68093.f56842.mo27926());
        for (C11258 c11258 : activityC21107.f68093.f56840.f10940.m25236()) {
            activityC21107.f68093.f56832.put(C15472.m36561(1, 1, c11258.m27862().m50835()), c11258);
        }
        C18284 c18285 = activityC21107.f68093;
        Set setKeySet = activityC21107.f68093.f56832.keySet();
        C14755 c14755 = new C14755();
        c14755.f45069 = new C23928(activityC21107, "", "", null);
        c14755.m35066(setKeySet);
        c18285.f56847 = c14755;
        ActivityC21107.m48062(activityC21107);
        activityC21107.f68093.f56848 = true;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        ActivityC21107 activityC21107 = this.f65972;
        ListView listView = activityC21107.f68089;
        C12609 c12609 = new C12609(new C7763(activityC21107));
        activityC21107.f68092 = c12609;
        listView.setAdapter((ListAdapter) c12609);
        activityC21107.f68089.setOnScrollListener(new C22580(this));
        activityC21107.f68092.m14112(activityC21107.f68089);
        activityC21107.f68092.m10504(true);
        activityC21107.f68092.m10506();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f65972.m10224((Throwable) exc, true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
