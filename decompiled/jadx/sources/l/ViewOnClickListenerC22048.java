package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC22048 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f70669;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f70670;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19932 f70671;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC22048(ActivityC19932 activityC19932, View view) {
        super(view);
        this.f70671 = activityC19932;
        C19890.m45741(view);
        int i = C18342.f56999;
        view.setOnTouchListener(new ViewOnTouchListenerC16930());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f70669 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f70670 = imageView;
        Drawable drawableM3234 = C0881.m3234(activityC19932, R.drawable.MT_Protector);
        C11003.requireNonNull(drawableM3234);
        Drawable drawableMutate = drawableM3234.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition = getBindingAdapterPosition();
        ActivityC19932 activityC19932 = this.f70671;
        activityC19932.f64530 = bindingAdapterPosition;
        ((C2292) activityC19932.f64531.get(activityC19932.f64530)).mo6367((AbstractActivityC3346) activityC19932);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C21282 c21282 = new C21282(this.f70671, view, 0);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48306();
        c21282.m48302(new InterfaceC14930() { // from class: l.ܶۘ᩻
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC22048 viewOnClickListenerC22048 = this.f45717;
                ActivityC19932 activityC19932 = viewOnClickListenerC22048.f70671;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC22048.onClick(view);
                } else {
                    C19258 c19258BuildDialog = activityC19932.buildDialog();
                    c19258BuildDialog.m44433(R.string.MT_Protector);
                    c19258BuildDialog.m44424(activityC19932.getString(R.string.MT_Protector, viewOnClickListenerC22048.f70669.getText()));
                    final int i = bindingAdapterPosition;
                    c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩸ۘ᩻
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            int i3 = i;
                            C12749.m31043(i3);
                            viewOnClickListenerC22048.f70671.f64532.notifyItemRemoved(i3);
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
        if (this.f70670.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f70671.f64533.m5326(this);
        return false;
    }
}
