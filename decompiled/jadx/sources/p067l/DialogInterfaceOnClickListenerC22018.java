package p067l;

import android.content.DialogInterface;
import android.widget.CheckBox;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC22018 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f69302;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f69303;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f69304;

    public /* synthetic */ DialogInterfaceOnClickListenerC22018(int i, Object obj, Object obj2) {
        this.f69303 = i;
        this.f69304 = obj;
        this.f69302 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f69303) {
            case 0:
                ActivityC17874.m40632((ActivityC17874) this.f69304, (CheckBox) this.f69302);
                break;
            default:
                final C23631 c23631 = (C23631) this.f69304;
                final C6867 c6867 = (C6867) this.f69302;
                if (!c23631.m7655()) {
                    c23631.m52558(-1, false, true);
                } else {
                    C20671 c20671BuildDialog = ((ActivityC17874) c23631.requireActivity()).buildDialog();
                    c20671BuildDialog.m46727(R.string.MT_Protector);
                    c20671BuildDialog.m46710(R.string.MT_Protector);
                    c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24573(2, c23631));
                    c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵֨ᩳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i2) {
                            c23631.m52485(c6867);
                        }
                    });
                    c20671BuildDialog.m46722(false);
                    c20671BuildDialog.m46732();
                }
                break;
        }
    }
}
