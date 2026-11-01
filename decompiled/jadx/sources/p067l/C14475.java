package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14475 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC8440 f41346;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ boolean f41347;

    public C14475(ActivityC8440 activityC8440, boolean z) {
        this.f41346 = activityC8440;
        this.f41347 = z;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        ActivityC8440 activityC8440 = this.f41346;
        activityC8440.f22634.setVisibility(8);
        activityC8440.f22635.m32018(true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f41346.f22631 = (List) C7480.stream(C15342.m34915(this.f41347)).filter(new C2430(4)).collect(C24205.toList());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ActivityC8440 activityC8440 = this.f41346;
        if (activityC8440.f22631.isEmpty()) {
            activityC8440.f22634.setText(R.string.MT_Protector);
        }
        activityC8440.f22632.getAdapter().notifyDataSetChanged();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ActivityC8440 activityC8440 = this.f41346;
        activityC8440.f22634.setText(R.string.MT_Protector);
        activityC8440.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        ActivityC8440 activityC8440 = this.f41346;
        activityC8440.f22635.m32018(false);
        if (activityC8440.f22631.isEmpty()) {
            activityC8440.f22634.setVisibility(0);
        }
    }
}
