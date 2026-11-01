package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩻᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: IB3L */
/* JADX INFO: loaded from: classes.dex */
public class C25108 extends AbstractC11994 {

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC21323 f80349;

    public C25108(InterfaceC21323 interfaceC21323) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f80349 = interfaceC21323;
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ֫ */
    public final void mo7575(final C18107 c18107) {
        if (c18107.m41256()) {
            final List list = (List) C7480.stream(c18107.m41288()).filter(new C19744(0)).map(new C19073(0)).collect(C24205.toList());
            if (!list.isEmpty()) {
                CharSequence[] charSequenceArr = {C7050.m16224(R.string.MT_Protector), C7050.m16224(R.string.MT_Protector)};
                C20671 c20671BuildDialog = c18107.m41282().buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46723(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.ܳ᩶ܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C25108.m55097(this.f48155, c18107, list, dialogInterface, i);
                    }
                });
                c20671BuildDialog.m46732();
                return;
            }
        }
        new C15957(c18107, this.f80349);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m55097(C25108 c25108, C18107 c18107, List list, DialogInterface dialogInterface, int i) {
        InterfaceC21323 interfaceC21323 = c25108.f80349;
        if (i == 0) {
            new C15957(c18107, interfaceC21323);
        } else {
            new C15957(c18107, interfaceC21323).m36252(list);
        }
        dialogInterface.dismiss();
    }
}
