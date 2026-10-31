package l;

import android.content.DialogInterface;
import android.widget.CheckBox;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC20675 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66620;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66621;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66622;

    public /* synthetic */ DialogInterfaceOnClickListenerC20675(int i, Object obj, Object obj2) {
        this.f66621 = i;
        this.f66622 = obj;
        this.f66620 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f66621) {
            case 0:
                ActivityC16315.m38417((ActivityC16315) this.f66622, (CheckBox) this.f66620);
                break;
            default:
                final C22372 c22372 = (C22372) this.f66622;
                final C4733 c4733 = (C4733) this.f66620;
                if (!c22372.m5426()) {
                    c22372.m50218(-1, false, true);
                } else {
                    C19258 c19258BuildDialog = ((ActivityC16315) c22372.requireActivity()).buildDialog();
                    c19258BuildDialog.m44433(R.string.MT_Protector);
                    c19258BuildDialog.m44416(R.string.MT_Protector);
                    c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23364(2, c22372));
                    c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵֨ᩳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i2) {
                            c22372.m50145(c4733);
                        }
                    });
                    c19258BuildDialog.m44428(false);
                    c19258BuildDialog.m44438();
                }
                break;
        }
    }
}
