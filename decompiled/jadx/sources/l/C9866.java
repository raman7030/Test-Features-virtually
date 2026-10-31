package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۢ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9866 extends AbstractC10128 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9160 f29842;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f29843;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9866(C9160 c9160) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f29842 = c9160;
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ֫ */
    public final void mo5346(final C16560 c16560) {
        int i = C14776.f45125 + 1;
        String[] strArr = new String[i];
        strArr[0] = C4925.m14327(R.string.MT_Protector);
        for (int i2 = 1; i2 < i; i2++) {
            strArr[i2] = C14776.m35153(i2 - 1);
        }
        this.f29843 = 0;
        String strM41203 = this.f29842.f27726.m41203();
        if (strM41203 != null) {
            for (int i3 = 1; i3 < i; i3++) {
                if (strM41203.equals(C14776.m35151(i3 - 1).name())) {
                    this.f29843 = i3;
                    break;
                }
            }
        }
        C19258 c19258BuildDialog = c16560.m39056().buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44429(strArr, this.f29843, new DialogInterface.OnClickListener() { // from class: l.᩷᩸᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C9866 c9866 = this.f68206;
                C9160 c9160 = c9866.f29842;
                if (c9866.f29843 != i4) {
                    if (i4 == 0) {
                        c9160.f27726.m41205(null);
                        C9160.f27722.remove(c9160.m23568());
                    } else {
                        Charset charsetM35151 = C14776.m35151(i4 - 1);
                        c9160.f27726.m41205(charsetM35151.name());
                        C9160.f27722.put(c9160.m23568(), charsetM35151.name());
                    }
                    c16560.m39055();
                }
                dialogInterface.dismiss();
            }
        });
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44438();
    }
}
