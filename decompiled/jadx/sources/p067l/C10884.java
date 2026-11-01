package p067l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S57O */
/* JADX INFO: loaded from: classes3.dex */
public final class C10884 {
    /* JADX INFO: renamed from: ۧ */
    public static void m25071(DialogInterfaceC2564 dialogInterfaceC2564) {
        ViewGroup viewGroup = (ViewGroup) dialogInterfaceC2564.m3846(R.id.MT_Protector);
        if (viewGroup != null) {
            View childAt = viewGroup.getChildAt(0);
            childAt.setPadding(childAt.getPaddingLeft(), 0, childAt.getPaddingRight(), childAt.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m25072(DialogInterfaceC2564 dialogInterfaceC2564) {
        TextView textView = (TextView) dialogInterfaceC2564.m3846(android.R.id.message);
        C21272.m48055(textView);
        textView.setOnLongClickListener(new ViewOnLongClickListenerC11555(0));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25069(DialogInterfaceC2564 dialogInterfaceC2564) {
        ((TextView) dialogInterfaceC2564.m3846(android.R.id.message)).setLineSpacing(0.0f, 1.1f);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25070(AbstractActivityC5549 abstractActivityC5549, SpannableStringBuilder spannableStringBuilder) {
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46718(spannableStringBuilder);
        c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46736(R.string.MT_Protector, null);
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671.m46709();
        dialogInterfaceC2564M46709.m3862();
        dialogInterfaceC2564M46709.m3861().setOnClickListener(new ViewOnClickListenerC10146(abstractActivityC5549));
        m25071(dialogInterfaceC2564M46709);
        ((TextView) dialogInterfaceC2564M46709.m3846(android.R.id.message)).setTextIsSelectable(true);
    }
}
