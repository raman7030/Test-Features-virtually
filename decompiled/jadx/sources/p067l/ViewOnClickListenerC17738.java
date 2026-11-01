package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import bin.p000mt.plus.ShortcutActivity;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܺ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC17738 extends AbstractC5462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C4999 f52988;

    /* JADX INFO: renamed from: ᩸ */
    public ImageView f52989;

    /* JADX INFO: renamed from: ᩹ */
    public TextView f52990;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC17738(C4999 c4999, View view) {
        super(view);
        this.f52988 = c4999;
        view.setOnClickListener(this);
        this.f52989 = (ImageView) view.findViewById(R.id.icon);
        this.f52990 = (TextView) view.findViewById(R.id.text);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C4999 c4999 = this.f52988;
        C20671 c20671BuildDialog = c4999.f11390.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(c4999.f11390.getString(R.string.MT_Protector, ((C6340) c4999.f11391.get(bindingAdapterPosition)).m14500()));
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡ᩶᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C4999 c49910 = this.f30567.f52988;
                String strM14499 = ((C6340) c49910.f11391.remove(bindingAdapterPosition)).m14499();
                C1654.m40727(c49910.f11390, Collections.singletonList(strM14499));
                ShortcutActivity.m138(strM14499);
                c49910.notifyDataSetChanged();
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }
}
