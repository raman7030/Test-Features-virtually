package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC20585 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f66269;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9296 f66270;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f66271;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Drawable f66272;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC20585(ActivityC9296 activityC9296, View view) {
        super(view);
        this.f66270 = activityC9296;
        C19890.m45741(view);
        int i = C18342.f56999;
        view.setOnTouchListener(new ViewOnTouchListenerC16930());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f66269 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f66271 = imageView;
        Drawable drawableM3234 = C0881.m3234(activityC9296, R.drawable.MT_Protector);
        C11003.requireNonNull(drawableM3234);
        Drawable drawableMutate = drawableM3234.mutate();
        this.f66272 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f66270.m23862(getBindingAdapterPosition());
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C21282 c21282 = new C21282(this.f66270, view, 0);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48306();
        c21282.m48302(new InterfaceC14930() { // from class: l.᩻ۖۡ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC20585 viewOnClickListenerC20585 = this.f75168;
                ActivityC9296 activityC9296 = viewOnClickListenerC20585.f66270;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC20585.onClick(view);
                } else {
                    C19258 c19258BuildDialog = activityC9296.buildDialog();
                    c19258BuildDialog.m44433(R.string.MT_Protector);
                    c19258BuildDialog.m44424(activityC9296.getString(R.string.MT_Protector, viewOnClickListenerC20585.f66269.getText()));
                    final int i = bindingAdapterPosition;
                    c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۖۡ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActivityC9296 activityC9297 = viewOnClickListenerC20585.f66270;
                            ArrayList arrayList = (ArrayList) activityC9297.f28177;
                            int i3 = i;
                            arrayList.remove(i3);
                            activityC9297.f28178.notifyItemRemoved(i3);
                            int i4 = C1534.f5415;
                            C1802.m5991(new RunnableC18848(1), C1534.class, 500L);
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
        if (this.f66271.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f66270.f28176.m5326(this);
        return false;
    }
}
