package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩻᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: IB3L */
/* JADX INFO: loaded from: classes.dex */
public class C23926 extends AbstractC10128 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19944 f77598;

    public C23926(InterfaceC19944 interfaceC19944) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f77598 = interfaceC19944;
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ֫ */
    public final void mo5346(final C16560 c16560) {
        if (c16560.m39030()) {
            final List list = (List) C5378.stream(c16560.m39062()).filter(new C18282(0)).map(new C17576(0)).collect(C22976.toList());
            if (!list.isEmpty()) {
                CharSequence[] charSequenceArr = {C4925.m14327(R.string.MT_Protector), C4925.m14327(R.string.MT_Protector)};
                C19258 c19258BuildDialog = c16560.m39056().buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44429(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.ܳ᩶ܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C23926.m52691(this.f45042, c16560, list, dialogInterface, i);
                    }
                });
                c19258BuildDialog.m44438();
                return;
            }
        }
        new C14298(c16560, this.f77598);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52691(C23926 c23926, C16560 c16560, List list, DialogInterface dialogInterface, int i) {
        InterfaceC19944 interfaceC19944 = c23926.f77598;
        if (i == 0) {
            new C14298(c16560, interfaceC19944);
        } else {
            new C14298(c16560, interfaceC19944).m34119(list);
        }
        dialogInterface.dismiss();
    }
}
