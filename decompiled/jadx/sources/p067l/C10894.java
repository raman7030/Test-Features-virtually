package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10894 extends AbstractC0868 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC17598 f30180;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10894(ActivityC17598 activityC17598) {
        super(true);
        this.f30180 = activityC17598;
    }

    @Override // p067l.AbstractC0868
    /* JADX INFO: renamed from: ۧ */
    public final void mo3603() {
        ActivityC17598 activityC17598 = this.f30180;
        if (activityC17598.f52598.m34987()) {
            C20671 c20671BuildDialog = activityC17598.buildDialog();
            c20671BuildDialog.m46730(activityC17598.f52595);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ܶ᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f70426.f30180.m40066(true);
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢܶ᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f32229.f30180.finish();
                }
            });
            c20671BuildDialog.m46732();
            return;
        }
        activityC17598.finish();
    }
}
