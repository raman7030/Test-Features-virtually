package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܺ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC16171 extends AbstractC3255 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2767 f49822;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f49823;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public TextView f49824;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC16171(C2767 c2767, View view) {
        super(view);
        this.f49822 = c2767;
        view.setOnClickListener(this);
        this.f49823 = (ImageView) view.findViewById(R.id.icon);
        this.f49824 = (TextView) view.findViewById(R.id.text);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C2767 c2767 = this.f49822;
        C19258 c19258BuildDialog = c2767.f8596.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(c2767.f8596.getString(R.string.MT_Protector, ((C4178) c2767.f8597.get(bindingAdapterPosition)).m12625()));
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡ᩶᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C2767 c2768 = this.f27627.f49822;
                String strM12624 = ((C4178) c2768.f8597.remove(bindingAdapterPosition)).m12624();
                C16362.m38510(c2768.f8596, Collections.singletonList(strM12624));
                ShortcutActivity.m140(strM12624);
                c2768.notifyDataSetChanged();
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }
}
