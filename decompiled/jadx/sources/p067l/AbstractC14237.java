package p067l;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۫ܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7TE */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14237 extends AbstractC5996 {

    /* JADX INFO: renamed from: ۡ֫ */
    public static final /* synthetic */ int f40542 = 0;

    /* JADX INFO: renamed from: ۫֫ */
    public abstract void m32719();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final DialogInterfaceC2564 mo12166(AbstractActivityC5549 abstractActivityC5549) {
        m13458(abstractActivityC5549);
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.textView1);
        TextView textView2 = (TextView) viewM12252.findViewById(R.id.textView2);
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.۬ܶۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = AbstractC14237.f40542;
                AbstractC14237 abstractC14237 = this.f42516;
                abstractC14237.getClass();
                view.setEnabled(false);
                ((Button) view).setTextColor(-7829368);
                abstractC14237.m32719();
            }
        });
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46722(false);
        c20671BuildDialog.m46715(viewM12252);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        m13468().m4066(dialogInterfaceC2564M46732, new C8566(this, textView, textView2, 1));
        return dialogInterfaceC2564M46732;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m32718(AbstractC14237 abstractC14237, TextView textView, TextView textView2) {
        if (abstractC14237.m13497()) {
            textView.setText(abstractC14237.m13493());
        }
        if (abstractC14237.m13483()) {
            textView2.setText(abstractC14237.m13470());
        }
    }
}
