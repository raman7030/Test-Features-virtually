package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC10499 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f29072;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f29073;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C23631 f29074;

    public /* synthetic */ DialogInterfaceOnClickListenerC10499(C23631 c23631, Object obj, int i) {
        this.f29073 = i;
        this.f29074 = c23631;
        this.f29072 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f29073) {
            case 0:
                final C6867 c6867 = (C6867) this.f29072;
                final C23631 c23631 = this.f29074;
                if (!c23631.m7655()) {
                    ((ActivityC17874) c23631.requireActivity()).m40663(c23631);
                } else {
                    C20671 c20671BuildDialog = ((ActivityC17874) c23631.requireActivity()).buildDialog();
                    c20671BuildDialog.m46727(R.string.MT_Protector);
                    c20671BuildDialog.m46710(R.string.MT_Protector);
                    c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡֨ᩳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i2) {
                            C23631 c23632 = c23631;
                            ((ActivityC17874) c23632.requireActivity()).m40663(c23632);
                        }
                    });
                    c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚ֨ᩳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i2) {
                            c23631.m52521(c6867);
                        }
                    });
                    c20671BuildDialog.m46722(false);
                    c20671BuildDialog.m46732();
                }
                break;
            default:
                ActivityC17874 activityC17874 = (ActivityC17874) this.f29072;
                this.f29074.m52572();
                activityC17874.m40664(false);
                break;
        }
    }
}
