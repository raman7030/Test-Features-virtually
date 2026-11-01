package p067l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC12511 extends AbstractC5462 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ۗ */
    public TextView f35064;

    /* JADX INFO: renamed from: ۙ */
    public TextView f35065;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ ActivityC17874 f35066;

    /* JADX INFO: renamed from: ۬ */
    public View f35067;

    /* JADX INFO: renamed from: ᩶ */
    public ImageView f35068;

    /* JADX INFO: renamed from: ᩸ */
    public View f35069;

    /* JADX INFO: renamed from: ᩹ */
    public ImageView f35070;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC12511(ActivityC17874 activityC17874, View view) {
        super(view);
        this.f35066 = activityC17874;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f35069 = view.findViewById(R.id.MT_Protector);
        this.f35067 = view.findViewById(R.id.MT_Protector);
        this.f35068 = (ImageView) view.findViewById(R.id.icon);
        this.f35064 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f35065 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f35070 = imageView;
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        Drawable drawableM5548 = C0886.m5548(activityC17874, R.drawable.MT_Protector);
        C12826.requireNonNull(drawableM5548);
        Drawable drawableMutate = drawableM5548.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition;
        ActivityC17874 activityC17874 = this.f35066;
        if (activityC17874.f53411.m41180() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return;
        }
        ActivityC17874.m40643(activityC17874, bindingAdapterPosition);
        activityC17874.m40676();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        final int bindingAdapterPosition;
        ActivityC17874 activityC17874 = this.f35066;
        if (activityC17874.f53411.m41180() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return false;
        }
        final C23631 c23631 = (C23631) activityC17874.f53408.get(bindingAdapterPosition);
        View view2 = this.f35067;
        C1898 c1898 = new C1898(activityC17874, view2, 8388611);
        C9702.m22649(view2);
        c1898.m50640();
        C0994 c0994M50638 = c1898.m50638();
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        ActivityC17874.m40633(activityC17874, c0994M50638, bindingAdapterPosition);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        if (c23631.m7642()) {
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        } else {
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        }
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50636(new InterfaceC1583() { // from class: l.֫֨ᩳ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC17874 activityC17875 = this.f8123.f35066;
                int itemId = menuItem.getItemId();
                C23631 c23632 = c23631;
                if (itemId == R.string.MT_Protector) {
                    c23632.m52560(activityC17875);
                    return true;
                }
                int i = bindingAdapterPosition;
                if (itemId == R.id.MT_Protector) {
                    activityC17875.m40666(i);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    View viewM12252 = activityC17875.m12252(R.layout.MT_Protector);
                    ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                    DialogInterfaceOnClickListenerC22018 dialogInterfaceOnClickListenerC22018 = new DialogInterfaceOnClickListenerC22018(0, activityC17875, (CheckBox) viewM12252.findViewById(R.id.MT_Protector));
                    C20671 c20671BuildDialog = activityC17875.buildDialog();
                    c20671BuildDialog.m46715(viewM12252);
                    c20671BuildDialog.m46736(R.string.MT_Protector, dialogInterfaceOnClickListenerC22018);
                    c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c20671BuildDialog.m46732();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    View viewM12253 = activityC17875.m12252(R.layout.MT_Protector);
                    ((TextView) viewM12253.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                    viewM12253.findViewById(R.id.MT_Protector).setVisibility(8);
                    DialogInterfaceOnClickListenerC10618 dialogInterfaceOnClickListenerC10618 = new DialogInterfaceOnClickListenerC10618(0, activityC17875);
                    C20671 c20671BuildDialog2 = activityC17875.buildDialog();
                    c20671BuildDialog2.m46715(viewM12253);
                    c20671BuildDialog2.m46736(R.string.MT_Protector, dialogInterfaceOnClickListenerC10618);
                    c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c20671BuildDialog2.m46732();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    activityC17875.m40672(i);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    activityC17875.m40677(i);
                    return true;
                }
                if (itemId == R.string.MT_Protector) {
                    c23632.m52563(activityC17875, (DialogInterfaceC1814) null);
                    return true;
                }
                if (itemId == R.string.MT_Protector) {
                    ActivityC17874.m40650(activityC17875, i);
                    return true;
                }
                if (itemId != R.string.MT_Protector) {
                    return true;
                }
                activityC17875.f53411.m41174();
                return true;
            }
        });
        c1898.m50639();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView = this.f35070;
        if (view != imageView || motionEvent.getActionMasked() != 0 || imageView.getVisibility() != 0) {
            return false;
        }
        this.f35066.f53411.m41177(this);
        return true;
    }
}
