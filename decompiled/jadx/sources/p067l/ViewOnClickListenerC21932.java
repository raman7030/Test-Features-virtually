package p067l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21932 extends AbstractC5462 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ۙ */
    public TextView f68950;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ActivityC11203 f68951;

    /* JADX INFO: renamed from: ᩸ */
    public ImageView f68952;

    /* JADX INFO: renamed from: ᩹ */
    public Drawable f68953;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC21932(ActivityC11203 activityC11203, View view) {
        super(view);
        this.f68951 = activityC11203;
        C21272.m48052(view);
        int i = C19801.f60217;
        view.setOnTouchListener(new ViewOnTouchListenerC18459());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f68950 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f68952 = imageView;
        Drawable drawableM5548 = C0886.m5548(activityC11203, R.drawable.MT_Protector);
        C12826.requireNonNull(drawableM5548);
        Drawable drawableMutate = drawableM5548.mutate();
        this.f68953 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f68951.m25871(getBindingAdapterPosition());
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C1898 c1898 = new C1898(this.f68951, view, 0);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50640();
        c1898.m50636(new InterfaceC1583() { // from class: l.᩻ۖۡ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC21932 viewOnClickListenerC21932 = this.f77914;
                ActivityC11203 activityC11203 = viewOnClickListenerC21932.f68951;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC21932.onClick(view);
                } else {
                    C20671 c20671BuildDialog = activityC11203.buildDialog();
                    c20671BuildDialog.m46727(R.string.MT_Protector);
                    c20671BuildDialog.m46718(activityC11203.getString(R.string.MT_Protector, viewOnClickListenerC21932.f68950.getText()));
                    final int i = bindingAdapterPosition;
                    c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۖۡ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActivityC11203 activityC11204 = viewOnClickListenerC21932.f68951;
                            ArrayList arrayList = (ArrayList) activityC11204.f31126;
                            int i3 = i;
                            arrayList.remove(i3);
                            activityC11204.f31127.notifyItemRemoved(i3);
                            int i4 = C3826.f8197;
                            C4081.m8188(new RunnableC20282(1), C3826.class, 500L);
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
        if (this.f68952.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f68951.f31125.m7555(this);
        return false;
    }
}
