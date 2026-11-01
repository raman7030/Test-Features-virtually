package p067l;

import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X81I */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7875 {

    /* JADX INFO: renamed from: ֫ */
    public final C12096 f20669;

    /* JADX INFO: renamed from: ۧ */
    public final ImageView f20670;

    /* JADX INFO: renamed from: ܳ */
    public final C12096 f20671;

    /* JADX INFO: renamed from: ܽ */
    public boolean f20672 = true;

    /* JADX INFO: renamed from: ܿ */
    public int f20673;

    /* JADX INFO: renamed from: ᩳ */
    public int f20674;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo18192(int i, int i2);

    public AbstractC7875(AbstractActivityC5549 abstractActivityC5549, int i, int i2) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        C12096 c12096 = (C12096) viewM12252.findViewById(R.id.MT_Protector);
        this.f20671 = c12096;
        C12096 c12097 = (C12096) viewM12252.findViewById(R.id.editText2);
        this.f20669 = c12097;
        ImageView imageView = (ImageView) viewM12252.findViewById(R.id.MT_Protector);
        this.f20670 = imageView;
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        c12096.mo27932((CharSequence) String.valueOf(i));
        c12097.mo27932((CharSequence) String.valueOf(i2));
        this.f20673 = Math.max(1, i);
        this.f20674 = Math.max(1, i2);
        c12096.m27919(new InputFilter[]{new InputFilter.LengthFilter(6)});
        c12097.m27919(new InputFilter[]{new InputFilter.LengthFilter(6)});
        c12096.m32377(new C13910(this));
        c12097.m32377(new C11899(this));
        imageView.setOnClickListener(new ViewOnClickListenerC15934(2, this));
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC2564M21200.m3860().setOnClickListener(new ViewOnClickListenerC15974(this, dialogInterfaceC2564M21200));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m18185(AbstractC7875 abstractC7875) {
        ImageView imageView = abstractC7875.f20670;
        boolean z = abstractC7875.f20672;
        abstractC7875.f20672 = !z;
        if (!z) {
            imageView.setImageResource(R.drawable.MT_Protector);
            try {
                int i = Integer.parseInt(abstractC7875.f20671.m32500().toString());
                int i2 = Integer.parseInt(abstractC7875.f20669.m32500().toString());
                if (i <= 0 || i2 <= 0) {
                    return;
                }
                abstractC7875.f20673 = i;
                abstractC7875.f20674 = i2;
                return;
            } catch (Exception unused) {
                return;
            }
        }
        imageView.setImageResource(R.drawable.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m18186(AbstractC7875 abstractC7875, DialogInterfaceC2564 dialogInterfaceC2564) {
        C12096 c12096 = abstractC7875.f20669;
        C12096 c12097 = abstractC7875.f20671;
        try {
            int i = Integer.parseInt(c12097.m32500().toString());
            try {
                int i2 = Integer.parseInt(c12096.m32500().toString());
                dialogInterfaceC2564.dismiss();
                abstractC7875.mo18192(i, i2);
            } catch (Exception unused) {
                c12096.requestFocus();
                C22682.m50793(R.string.MT_Protector);
            }
        } catch (Exception unused2) {
            c12097.requestFocus();
            C22682.m50793(R.string.MT_Protector);
        }
    }
}
