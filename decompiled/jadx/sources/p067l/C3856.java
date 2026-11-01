package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.֫ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3856 extends AbstractC11994 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C12574 f8302;

    /* JADX INFO: renamed from: ᩳ */
    public int f8303;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3856(C12574 c12574) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f8302 = c12574;
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ֫ */
    public final void mo7575(final C18107 c18107) {
        int i = C16412.f48239 + 1;
        String[] strArr = new String[i];
        strArr[0] = C7050.m16224(R.string.MT_Protector);
        for (int i2 = 1; i2 < i; i2++) {
            strArr[i2] = C16412.m37300(i2 - 1);
        }
        this.f8303 = 0;
        String strM46676 = this.f8302.f35332.m46676();
        if (strM46676 != null) {
            for (int i3 = 1; i3 < i; i3++) {
                if (strM46676.equals(C16412.m37298(i3 - 1).name())) {
                    this.f8303 = i3;
                    break;
                }
            }
        }
        C20671 c20671BuildDialog = c18107.m41282().buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46723(strArr, this.f8303, new DialogInterface.OnClickListener() { // from class: l.۟ۙ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C3856 c3856 = this.f25140;
                C12574 c12574 = c3856.f8302;
                if (c3856.f8303 != i4) {
                    if (i4 == 0) {
                        c12574.f35332.m46681((Charset) null);
                        C12574.f35327.remove(c12574.m28981());
                    } else {
                        Charset charsetM37298 = C16412.m37298(i4 - 1);
                        c12574.f35332.m46681(charsetM37298);
                        C12574.f35327.put(c12574.m28981(), charsetM37298.name());
                    }
                    c18107.m41281();
                }
                dialogInterface.dismiss();
            }
        });
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46732();
    }
}
