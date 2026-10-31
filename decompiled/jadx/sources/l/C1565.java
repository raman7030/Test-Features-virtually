package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.֫ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1565 extends AbstractC10128 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10738 f5521;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f5522;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1565(C10738 c10738) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f5521 = c10738;
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5346(final C16560 c16560) {
        int i = C14776.f45125 + 1;
        String[] strArr = new String[i];
        strArr[0] = C4925.m14327(R.string.MT_Protector);
        for (int i2 = 1; i2 < i; i2++) {
            strArr[i2] = C14776.m35153(i2 - 1);
        }
        this.f5522 = 0;
        String strM44382 = this.f5521.f32357.m44382();
        if (strM44382 != null) {
            for (int i3 = 1; i3 < i; i3++) {
                if (strM44382.equals(C14776.m35151(i3 - 1).name())) {
                    this.f5522 = i3;
                    break;
                }
            }
        }
        C19258 c19258BuildDialog = c16560.m39056().buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44429(strArr, this.f5522, new DialogInterface.OnClickListener() { // from class: l.۟ۙ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C1565 c1565 = this.f22250;
                C10738 c10738 = c1565.f5521;
                if (c1565.f5522 != i4) {
                    if (i4 == 0) {
                        c10738.f32357.m44387((Charset) null);
                        C10738.f32352.remove(c10738.m26937());
                    } else {
                        Charset charsetM35151 = C14776.m35151(i4 - 1);
                        c10738.f32357.m44387(charsetM35151);
                        C10738.f32352.put(c10738.m26937(), charsetM35151.name());
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
