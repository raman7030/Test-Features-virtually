package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8970 extends AbstractC0525 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16024 f27245;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8970(ActivityC16024 activityC16024) {
        super(true);
        this.f27245 = activityC16024;
    }

    @Override // l.AbstractC0525
    /* JADX INFO: renamed from: ۧ */
    public final void mo1201() {
        ActivityC16024 activityC16024 = this.f27245;
        if (activityC16024.f49434.m32872()) {
            C19258 c19258BuildDialog = activityC16024.buildDialog();
            c19258BuildDialog.m44436(activityC16024.f49431);
            c19258BuildDialog.m44416(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ܶ᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f67740.f27245.m37879(true);
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢܶ᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f29279.f27245.finish();
                }
            });
            c19258BuildDialog.m44438();
            return;
        }
        activityC16024.finish();
    }
}
