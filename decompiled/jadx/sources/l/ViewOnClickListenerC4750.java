package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC4750 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f15062;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3339 f15063;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f15064;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Drawable f15065;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC4750(ActivityC3339 activityC3339, View view) {
        super(view);
        this.f15063 = activityC3339;
        C19890.m45741(view);
        int i = C18342.f56999;
        view.setOnTouchListener(new ViewOnTouchListenerC16930());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f15062 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f15064 = imageView;
        Drawable drawableM3234 = C0881.m3234(activityC3339, R.drawable.MT_Protector);
        C11003.requireNonNull(drawableM3234);
        Drawable drawableMutate = drawableM3234.mutate();
        this.f15065 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f15063.m10201(getBindingAdapterPosition());
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C21282 c21282 = new C21282(this.f15063, view, 0);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48306();
        c21282.m48302(new InterfaceC14930() { // from class: l.᩹ܺܳ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC4750 viewOnClickListenerC4750 = this.f72543;
                ActivityC3339 activityC3339 = viewOnClickListenerC4750.f15063;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    C4925.m14314((CharSequence) ((C12511) activityC3339.f10555.get(viewOnClickListenerC4750.getBindingAdapterPosition())).f37581);
                } else if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC4750.onClick(view);
                } else {
                    C19258 c19258BuildDialog = activityC3339.buildDialog();
                    c19258BuildDialog.m44433(R.string.MT_Protector);
                    c19258BuildDialog.m44424(activityC3339.getString(R.string.MT_Protector, viewOnClickListenerC4750.f15062.getText()));
                    final int i = bindingAdapterPosition;
                    c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶ܺܳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActivityC3339 activityC33310 = viewOnClickListenerC4750.f15063;
                            List list = activityC33310.f10555;
                            int i3 = i;
                            list.remove(i3);
                            activityC33310.f10557.notifyItemRemoved(i3);
                            C10395.m26219();
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

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f15064.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f15063.f10556.m5326(this);
        return false;
    }
}
