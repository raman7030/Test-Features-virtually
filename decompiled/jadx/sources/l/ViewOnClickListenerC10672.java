package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC10672 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f32093;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f32094;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f32095;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public View f32096;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f32097;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View f32098;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ImageView f32099;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC10672(ActivityC16315 activityC16315, View view) {
        super(view);
        this.f32095 = activityC16315;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f32098 = view.findViewById(R.id.MT_Protector);
        this.f32096 = view.findViewById(R.id.MT_Protector);
        this.f32097 = (ImageView) view.findViewById(R.id.icon);
        this.f32093 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f32094 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f32099 = imageView;
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        Drawable drawableM3234 = C0881.m3234(activityC16315, R.drawable.MT_Protector);
        C11003.requireNonNull(drawableM3234);
        Drawable drawableMutate = drawableM3234.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition;
        ActivityC16315 activityC16315 = this.f32095;
        if (activityC16315.f50244.m38954() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return;
        }
        ActivityC16315.m38428(activityC16315, bindingAdapterPosition);
        activityC16315.m38461();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        final int bindingAdapterPosition;
        ActivityC16315 activityC16315 = this.f32095;
        if (activityC16315.f50244.m38954() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return false;
        }
        final C22372 c22372 = (C22372) activityC16315.f50241.get(bindingAdapterPosition);
        View view2 = this.f32096;
        C21282 c21282 = new C21282(activityC16315, view2, 8388611);
        C7716.m20669(view2);
        c21282.m48306();
        C3060 c3060M48304 = c21282.m48304();
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        ActivityC16315.m38418(activityC16315, c3060M48304, bindingAdapterPosition);
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        if (c22372.m5413()) {
            c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        } else {
            c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        }
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c21282.m48302(new InterfaceC14930() { // from class: l.֫֨ᩳ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC16315 activityC16316 = this.f5350.f32095;
                int itemId = menuItem.getItemId();
                C22372 c22373 = c22372;
                if (itemId == R.string.MT_Protector) {
                    c22373.m50220(activityC16316);
                    return true;
                }
                int i = bindingAdapterPosition;
                if (itemId == R.id.MT_Protector) {
                    activityC16316.m38451(i);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    View viewM10216 = activityC16316.m10216(R.layout.MT_Protector);
                    ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                    DialogInterfaceOnClickListenerC20675 dialogInterfaceOnClickListenerC20675 = new DialogInterfaceOnClickListenerC20675(0, activityC16316, (CheckBox) viewM10216.findViewById(R.id.MT_Protector));
                    C19258 c19258BuildDialog = activityC16316.buildDialog();
                    c19258BuildDialog.m44421(viewM10216);
                    c19258BuildDialog.m44442(R.string.MT_Protector, dialogInterfaceOnClickListenerC20675);
                    c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c19258BuildDialog.m44438();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    View viewM10217 = activityC16316.m10216(R.layout.MT_Protector);
                    ((TextView) viewM10217.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                    viewM10217.findViewById(R.id.MT_Protector).setVisibility(8);
                    DialogInterfaceOnClickListenerC8680 dialogInterfaceOnClickListenerC8680 = new DialogInterfaceOnClickListenerC8680(0, activityC16316);
                    C19258 c19258BuildDialog2 = activityC16316.buildDialog();
                    c19258BuildDialog2.m44421(viewM10217);
                    c19258BuildDialog2.m44442(R.string.MT_Protector, dialogInterfaceOnClickListenerC8680);
                    c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c19258BuildDialog2.m44438();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    activityC16316.m38457(i);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    activityC16316.m38462(i);
                    return true;
                }
                if (itemId == R.string.MT_Protector) {
                    c22373.m50223(activityC16316, (DialogInterfaceC19598) null);
                    return true;
                }
                if (itemId == R.string.MT_Protector) {
                    ActivityC16315.m38435(activityC16316, i);
                    return true;
                }
                if (itemId != R.string.MT_Protector) {
                    return true;
                }
                activityC16316.f50244.m38948();
                return true;
            }
        });
        c21282.m48305();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView = this.f32099;
        if (view != imageView || motionEvent.getActionMasked() != 0 || imageView.getVisibility() != 0) {
            return false;
        }
        this.f32095.f50244.m38951(this);
        return true;
    }
}
