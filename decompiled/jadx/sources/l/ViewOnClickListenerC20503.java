package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩶᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC20503 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f66079;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public TextView f66080;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4980 f66081;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC20503(ActivityC4980 activityC4980, View view) {
        super(view);
        this.f66081 = activityC4980;
        C19890.m45741(view);
        int i = C18342.f56999;
        view.setOnTouchListener(new ViewOnTouchListenerC16930());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f66079 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f66080 = (TextView) view.findViewById(R.id.MT_Protector);
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(C19883.f64181.f64250.m28878());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f66081.m14457(getBindingAdapterPosition());
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C21282 c21282 = new C21282(this.f66081, view, 0);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48306();
        c21282.m48302(new InterfaceC14930() { // from class: l.᩸᩻ܳ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC20503 viewOnClickListenerC20503 = this.f70163;
                ActivityC4980 activityC4980 = viewOnClickListenerC20503.f66081;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC20503.onClick(view);
                } else {
                    C19258 c19258BuildDialog = activityC4980.buildDialog();
                    c19258BuildDialog.m44433(R.string.MT_Protector);
                    c19258BuildDialog.m44424(activityC4980.getString(R.string.MT_Protector, viewOnClickListenerC20503.f66079.getText()));
                    final int i = bindingAdapterPosition;
                    c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹᩻ܳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActivityC4980 activityC4981 = viewOnClickListenerC20503.f66081;
                            List list = activityC4981.f15688;
                            int i3 = i;
                            activityC4981.f15689.mo16002((C1452) list.remove(i3));
                            activityC4981.f15690.notifyItemRemoved(i3);
                        }
                    });
                    c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c19258BuildDialog.m44438();
                }
                return true;
            }
        });
        C18342.m42767(view, c21282);
        return true;
    }
}
