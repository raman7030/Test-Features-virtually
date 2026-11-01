package p067l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC6883 extends AbstractC5462 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ۙ */
    public TextView f17893;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ActivityC5542 f17894;

    /* JADX INFO: renamed from: ᩸ */
    public ImageView f17895;

    /* JADX INFO: renamed from: ᩹ */
    public Drawable f17896;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC6883(ActivityC5542 activityC5542, View view) {
        super(view);
        this.f17894 = activityC5542;
        C21272.m48052(view);
        int i = C19801.f60217;
        view.setOnTouchListener(new ViewOnTouchListenerC18459());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f17893 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f17895 = imageView;
        Drawable drawableM5548 = C0886.m5548(activityC5542, R.drawable.MT_Protector);
        C12826.requireNonNull(drawableM5548);
        Drawable drawableMutate = drawableM5548.mutate();
        this.f17896 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f17894.m12237(getBindingAdapterPosition());
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C1898 c1898 = new C1898(this.f17894, view, 0);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50640();
        c1898.m50636(new InterfaceC1583() { // from class: l.᩹ܺܳ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC6883 viewOnClickListenerC6883 = this.f75269;
                ActivityC5542 activityC5542 = viewOnClickListenerC6883.f17894;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    C7050.m16211((CharSequence) ((C14259) activityC5542.f13365.get(viewOnClickListenerC6883.getBindingAdapterPosition())).f40605);
                } else if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC6883.onClick(view);
                } else {
                    C20671 c20671BuildDialog = activityC5542.buildDialog();
                    c20671BuildDialog.m46727(R.string.MT_Protector);
                    c20671BuildDialog.m46718(activityC5542.getString(R.string.MT_Protector, viewOnClickListenerC6883.f17893.getText()));
                    final int i = bindingAdapterPosition;
                    c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶ܺܳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActivityC5542 activityC5543 = viewOnClickListenerC6883.f17894;
                            List list = activityC5543.f13365;
                            int i3 = i;
                            list.remove(i3);
                            activityC5543.f13367.notifyItemRemoved(i3);
                            C12248.m28248();
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
        if (this.f17895.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f17894.f13366.m7555(this);
        return false;
    }
}
