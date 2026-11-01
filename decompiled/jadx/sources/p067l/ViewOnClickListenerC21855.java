package p067l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩶᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21855 extends AbstractC5462 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public TextView f68758;

    /* JADX INFO: renamed from: ᩸ */
    public TextView f68759;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ActivityC7102 f68760;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC21855(ActivityC7102 activityC7102, View view) {
        super(view);
        this.f68760 = activityC7102;
        C21272.m48052(view);
        int i = C19801.f60217;
        view.setOnTouchListener(new ViewOnTouchListenerC18459());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f68758 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f68759 = (TextView) view.findViewById(R.id.MT_Protector);
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(C21265.f66817.f66886.m30927());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f68760.m16361(getBindingAdapterPosition());
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C1898 c1898 = new C1898(this.f68760, view, 0);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50640();
        c1898.m50636(new InterfaceC1583() { // from class: l.᩸᩻ܳ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC21855 viewOnClickListenerC21855 = this.f72877;
                ActivityC7102 activityC7102 = viewOnClickListenerC21855.f68760;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC21855.onClick(view);
                } else {
                    C20671 c20671BuildDialog = activityC7102.buildDialog();
                    c20671BuildDialog.m46727(R.string.MT_Protector);
                    c20671BuildDialog.m46718(activityC7102.getString(R.string.MT_Protector, viewOnClickListenerC21855.f68758.getText()));
                    final int i = bindingAdapterPosition;
                    c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹᩻ܳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActivityC7102 activityC7103 = viewOnClickListenerC21855.f68760;
                            List list = activityC7103.f18522;
                            int i3 = i;
                            activityC7103.f18523.mo17937((C3749) list.remove(i3));
                            activityC7103.f18524.notifyItemRemoved(i3);
                        }
                    });
                    c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c20671BuildDialog.m46732();
                }
                return true;
            }
        });
        C19801.m45029(view, c1898);
        return true;
    }
}
