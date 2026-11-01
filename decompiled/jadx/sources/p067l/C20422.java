package p067l;

import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes4.dex */
public final class C20422 {
    /* JADX INFO: renamed from: ֫ */
    public static void m46099(AbstractActivityC5549 abstractActivityC5549) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        C14849 c14849 = (C14849) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        textView2.setText("-- " + ((Object) textView2.getText()) + " --");
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC10554(abstractActivityC5549, 2));
        textView.setText(((Object) textView.getText()) + " ↓↓");
        C4999 c4999 = new C4999(abstractActivityC5549);
        c4999.registerAdapterDataObserver(new C11705(c4999, c14849, textView2));
        c4999.notifyDataSetChanged();
        c14849.setAdapter(c4999);
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46732();
    }
}
