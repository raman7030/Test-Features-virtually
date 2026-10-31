package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12738 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6388 f38306;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f38307;

    public C12738(ActivityC6388 activityC6388, boolean z) {
        this.f38306 = activityC6388;
        this.f38307 = z;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        ActivityC6388 activityC6388 = this.f38306;
        activityC6388.f19761.setVisibility(8);
        activityC6388.f19762.m29958(true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f38306.f19758 = (List) C5378.stream(C13651.m32800(this.f38307)).filter(new C0065(4)).collect(C22976.toList());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        ActivityC6388 activityC6388 = this.f38306;
        if (activityC6388.f19758.isEmpty()) {
            activityC6388.f19761.setText(R.string.MT_Protector);
        }
        activityC6388.f19759.getAdapter().notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        ActivityC6388 activityC6388 = this.f38306;
        activityC6388.f19761.setText(R.string.MT_Protector);
        activityC6388.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        ActivityC6388 activityC6388 = this.f38306;
        activityC6388.f19762.m29958(false);
        if (activityC6388.f19758.isEmpty()) {
            activityC6388.f19761.setVisibility(0);
        }
    }
}
