package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes4.dex */
public final class C18995 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43831(AbstractActivityC3346 abstractActivityC3346) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        C13132 c13132 = (C13132) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        textView2.setText("-- " + ((Object) textView2.getText()) + " --");
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC8613(abstractActivityC3346, 2));
        textView.setText(((Object) textView.getText()) + " ↓↓");
        C2767 c2767 = new C2767(abstractActivityC3346);
        c2767.registerAdapterDataObserver(new C9823(c2767, c13132, textView2));
        c2767.notifyDataSetChanged();
        c13132.setAdapter(c2767);
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44438();
    }
}
