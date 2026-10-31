package l;

import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8965 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8259 f27234;

    public C8965(ActivityC8259 activityC8259) {
        this.f27234 = activityC8259;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f27234, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        ActivityC8259 activityC8259 = this.f27234;
        C1203 c1203 = activityC8259.f25415;
        int i = C16999.f52136;
        c1203.f4347 = C16999.m39862(activityC8259.getIntent());
        activityC8259.f25415.f4346 = activityC8259.f25415.f4347.getName();
        activityC8259.f25415.f4340 = C15206.m35971(activityC8259.f25415.f4347);
        activityC8259.f25415.f4344 = new int[activityC8259.f25415.f4340.f46672.size()];
        activityC8259.f25415.f4349 = true;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        ActivityC8259 activityC8259 = this.f27234;
        ListView listView = activityC8259.f25416;
        C12609 c12609 = new C12609(new C5437(activityC8259));
        activityC8259.f25417 = c12609;
        listView.setAdapter((ListAdapter) c12609);
        activityC8259.f25416.setOnScrollListener(new C9671(this));
        activityC8259.f25417.m14112(activityC8259.f25416);
        activityC8259.f25417.m10504(true);
        activityC8259.f25417.m10506();
        activityC8259.f25416.setOnItemClickListener(activityC8259);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f27234.m10224((Throwable) exc, true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
