package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC23629 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f75207;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f75208;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f75209;

    public /* synthetic */ DialogInterfaceOnClickListenerC23629(int i, Object obj, Object obj2) {
        this.f75208 = i;
        this.f75209 = obj;
        this.f75207 = obj2;
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC23629(C18107 c18107, InterfaceC19370 interfaceC19370) {
        this.f75208 = 2;
        this.f75207 = c18107;
        this.f75209 = interfaceC19370;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f75208;
        Object obj = this.f75207;
        Object obj2 = this.f75209;
        switch (i2) {
            case 0:
                C9315 c9315 = (C9315) obj2;
                c9315.m21560();
                AbstractC17043 abstractC17043 = c9315.f25327;
                AbstractC17043 abstractC17044 = c9315.f25328;
                AbstractC17043 abstractC17043M54158 = C24556.m54158((C18107) obj, R.string.MT_Protector, "mtcr");
                int i3 = C16723.f49313;
                C3313 c3313 = new C3313(C14911.class);
                c3313.m5777("saveAsPath", abstractC17043M54158.mo25505());
                c3313.m5777("inputPath1", abstractC17043.mo25505());
                c3313.m5777("inputPath2", abstractC17044.mo25505());
                c3313.m5772();
                break;
            case 1:
                ActivityC21758.m49045((ActivityC21758) obj2, (C21249) obj);
                break;
            case 2:
                C18107 c18107 = (C18107) obj;
                C20966.m47304(c18107, (InterfaceC19370) obj2, new C23509(2, c18107));
                break;
            default:
                C7043.m16188((C7043) obj2, (C21796) obj);
                break;
        }
    }
}
