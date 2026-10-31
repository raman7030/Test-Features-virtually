package l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7437 extends AbstractC10128 {
    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo19969(C16560 c16560) {
        return c16560.m39030();
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        String lowerCase = C4925.m14327(R.string.MT_Protector).toLowerCase();
        final List listM39062 = c16560.m39062();
        String strM14306 = listM39062.size() == 1 ? C4925.m14306(R.string.MT_Protector, lowerCase, ((InterfaceC17889) listM39062.get(0)).mo36985()) : C4925.m14306(R.string.MT_Protector, lowerCase, Integer.valueOf(listM39062.size()));
        StringBuilder sbM19190 = C7166.m19190(strM14306, "\n\n");
        sbM19190.append(C4925.m14327(R.string.MT_Protector));
        SpannableString spannableString = new SpannableString(sbM19190.toString());
        spannableString.setSpan(new ForegroundColorSpan(C21943.f70269), strM14306.length(), spannableString.length(), 17);
        spannableString.setSpan(new RelativeSizeSpan(0.25f), strM14306.length(), strM14306.length() + 2, 17);
        spannableString.setSpan(new RelativeSizeSpan(0.9f), strM14306.length() + 2, spannableString.length(), 17);
        C19258 c19258BuildDialog = c16560.m39056().buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(spannableString);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܰۧ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C17315.m40624((List) C5378.stream(listM39062).map(new C1775(1)).collect(C22976.toList()));
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        C8960.m23097(c19258BuildDialog.m44438());
    }
}
