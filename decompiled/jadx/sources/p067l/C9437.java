package p067l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9437 extends AbstractC11994 {
    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo21944(C18107 c18107) {
        return c18107.m41256();
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ֫ */
    public final void mo7575(C18107 c18107) {
        String lowerCase = C7050.m16224(R.string.MT_Protector).toLowerCase();
        final List listM41288 = c18107.m41288();
        String strM16203 = listM41288.size() == 1 ? C7050.m16203(R.string.MT_Protector, lowerCase, ((InterfaceC19370) listM41288.get(0)).mo39151()) : C7050.m16203(R.string.MT_Protector, lowerCase, Integer.valueOf(listM41288.size()));
        StringBuilder sbM21133 = C9179.m21133(strM16203, "\n\n");
        sbM21133.append(C7050.m16224(R.string.MT_Protector));
        SpannableString spannableString = new SpannableString(sbM21133.toString());
        spannableString.setSpan(new ForegroundColorSpan(C23223.f72980), strM16203.length(), spannableString.length(), 17);
        spannableString.setSpan(new RelativeSizeSpan(0.25f), strM16203.length(), strM16203.length() + 2, 17);
        spannableString.setSpan(new RelativeSizeSpan(0.9f), strM16203.length() + 2, spannableString.length(), 17);
        C20671 c20671BuildDialog = c18107.m41282().buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(spannableString);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܰۧ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C18825.m42875((List) C7480.stream(listM41288).map(new C4055(1)).collect(C24205.toList()));
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        C10884.m25071(c20671BuildDialog.m46732());
    }
}
