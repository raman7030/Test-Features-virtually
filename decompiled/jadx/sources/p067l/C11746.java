package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۢ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11746 extends AbstractC11994 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C11075 f32799;

    /* JADX INFO: renamed from: ᩳ */
    public int f32800;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11746(C11075 c11075) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f32799 = c11075;
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
        this.f32800 = 0;
        String strM43449 = this.f32799.f30666.m43449();
        if (strM43449 != null) {
            for (int i3 = 1; i3 < i; i3++) {
                if (strM43449.equals(C16412.m37298(i3 - 1).name())) {
                    this.f32800 = i3;
                    break;
                }
            }
        }
        C20671 c20671BuildDialog = c18107.m41282().buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46723(strArr, this.f32800, new DialogInterface.OnClickListener() { // from class: l.᩷᩸᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C11746 c11746 = this.f70889;
                C11075 c11075 = c11746.f32799;
                if (c11746.f32800 != i4) {
                    if (i4 == 0) {
                        c11075.f30666.m43451(null);
                        C11075.f30662.remove(c11075.m25519());
                    } else {
                        Charset charsetM37298 = C16412.m37298(i4 - 1);
                        c11075.f30666.m43451(charsetM37298.name());
                        C11075.f30662.put(c11075.m25519(), charsetM37298.name());
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
