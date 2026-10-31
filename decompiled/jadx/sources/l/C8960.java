package l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S57O */
/* JADX INFO: loaded from: classes3.dex */
public final class C8960 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23097(DialogInterfaceC0206 dialogInterfaceC0206) {
        ViewGroup viewGroup = (ViewGroup) dialogInterfaceC0206.m1433(R.id.MT_Protector);
        if (viewGroup != null) {
            View childAt = viewGroup.getChildAt(0);
            childAt.setPadding(childAt.getPaddingLeft(), 0, childAt.getPaddingRight(), childAt.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m23098(DialogInterfaceC0206 dialogInterfaceC0206) {
        TextView textView = (TextView) dialogInterfaceC0206.m1433(android.R.id.message);
        C19890.m45744(textView);
        textView.setOnLongClickListener(new ViewOnLongClickListenerC9666(0));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23095(DialogInterfaceC0206 dialogInterfaceC0206) {
        ((TextView) dialogInterfaceC0206.m1433(android.R.id.message)).setLineSpacing(0.0f, 1.1f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23096(AbstractActivityC3346 abstractActivityC3346, SpannableStringBuilder spannableStringBuilder) {
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44424(spannableStringBuilder);
        c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44442(R.string.MT_Protector, null);
        DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258.m44415();
        dialogInterfaceC0206M44415.m1449();
        dialogInterfaceC0206M44415.m1448().setOnClickListener(new ViewOnClickListenerC8183(abstractActivityC3346));
        m23097(dialogInterfaceC0206M44415);
        ((TextView) dialogInterfaceC0206M44415.m1433(android.R.id.message)).setTextIsSelectable(true);
    }
}
