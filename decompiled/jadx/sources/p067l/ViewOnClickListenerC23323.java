package p067l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC23323 extends AbstractC5462 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ᩶ */
    public TextView f73386;

    /* JADX INFO: renamed from: ᩸ */
    public ImageView f73387;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ActivityC21312 f73388;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC23323(ActivityC21312 activityC21312, View view) {
        super(view);
        this.f73388 = activityC21312;
        C21272.m48052(view);
        int i = C19801.f60217;
        view.setOnTouchListener(new ViewOnTouchListenerC18459());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f73386 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f73387 = imageView;
        Drawable drawableM5548 = C0886.m5548(activityC21312, R.drawable.MT_Protector);
        C12826.requireNonNull(drawableM5548);
        Drawable drawableMutate = drawableM5548.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition = getBindingAdapterPosition();
        ActivityC21312 activityC21312 = this.f73388;
        activityC21312.f67167 = bindingAdapterPosition;
        ((C4547) activityC21312.f67168.get(activityC21312.f67167)).mo8540((AbstractActivityC5549) activityC21312);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C1898 c1898 = new C1898(this.f73388, view, 0);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50640();
        c1898.m50636(new InterfaceC1583() { // from class: l.ܶۘ᩻
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC23323 viewOnClickListenerC23323 = this.f48830;
                ActivityC21312 activityC21312 = viewOnClickListenerC23323.f73388;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC23323.onClick(view);
                } else {
                    C20671 c20671BuildDialog = activityC21312.buildDialog();
                    c20671BuildDialog.m46727(R.string.MT_Protector);
                    c20671BuildDialog.m46718(activityC21312.getString(R.string.MT_Protector, viewOnClickListenerC23323.f73386.getText()));
                    final int i = bindingAdapterPosition;
                    c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩸ۘ᩻
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            int i3 = i;
                            C14486.m33127(i3);
                            viewOnClickListenerC23323.f73388.f67169.notifyItemRemoved(i3);
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

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f73387.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f73388.f67170.m7555(this);
        return false;
    }
}
