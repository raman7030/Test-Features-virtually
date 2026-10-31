package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC17875 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f54591;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f54592;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f54593;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public View f54594;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f54595;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View f54596;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ImageView f54597;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC17875(ActivityC17169 activityC17169, View view) {
        super(view);
        this.f54593 = activityC17169;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f54596 = view.findViewById(R.id.MT_Protector);
        this.f54594 = view.findViewById(R.id.MT_Protector);
        this.f54595 = (ImageView) view.findViewById(R.id.icon);
        this.f54591 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f54592 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f54597 = imageView;
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        Drawable drawableM3234 = C0881.m3234(activityC17169, R.drawable.MT_Protector);
        C11003.requireNonNull(drawableM3234);
        Drawable drawableMutate = drawableM3234.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition;
        ActivityC17169 activityC17169 = this.f54593;
        if (activityC17169.f52599.m38954() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return;
        }
        ActivityC17169.m40275(activityC17169, bindingAdapterPosition, true);
        activityC17169.m40358();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        final int bindingAdapterPosition;
        ActivityC17169 activityC17169 = this.f54593;
        if (!activityC17169.f52599.m38954() && (bindingAdapterPosition = getBindingAdapterPosition()) != -1) {
            final AbstractC14346 abstractC14346 = (AbstractC14346) activityC17169.f52616.get(bindingAdapterPosition);
            C10820 c10820M40306 = ActivityC17169.m40306(activityC17169, bindingAdapterPosition);
            if (abstractC14346.mo34235() || C10820.m27048(c10820M40306)) {
                View view2 = this.f54594;
                C21282 c21282 = new C21282(activityC17169, view2, 8388611);
                C7716.m20669(view2);
                c21282.m48306();
                C3060 c3060M48304 = c21282.m48304();
                if (abstractC14346.mo34235()) {
                    c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                }
                if (C10820.m27048(c10820M40306)) {
                    SubMenu subMenuAddSubMenu = c3060M48304.addSubMenu(0, R.id.MT_Protector, 0, activityC17169.getString(R.string.MT_Protector) + "…");
                    subMenuAddSubMenu.getItem().setIcon(R.drawable.MT_Protector);
                    subMenuAddSubMenu.setHeaderTitle(R.string.MT_Protector);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c10820M40306.f32543 + c10820M40306.f32545 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c10820M40306.f32544 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c10820M40306.f32546 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c10820M40306.f32543 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c10820M40306.f32545 > 0);
                }
                if (abstractC14346.mo34235()) {
                    if (abstractC14346.m34230()) {
                        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                    } else {
                        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                    }
                    if (abstractC14346.mo14418()) {
                        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                    }
                    c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                }
                c21282.m48302(new InterfaceC14930() { // from class: l.ܽۛ᩷
                    @Override // l.InterfaceC14930
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        ActivityC17169 activityC171610 = this.f50604.f54593;
                        int itemId = menuItem.getItemId();
                        AbstractC14346 abstractC14347 = abstractC14346;
                        if (itemId == R.string.MT_Protector) {
                            abstractC14347.mo17428(activityC171610);
                            return true;
                        }
                        int i = bindingAdapterPosition;
                        if (itemId == R.id.MT_Protector) {
                            activityC171610.m40348(i);
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            View viewM10216 = activityC171610.m10216(R.layout.MT_Protector);
                            ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                            DialogInterfaceOnClickListenerC12415 dialogInterfaceOnClickListenerC12415 = new DialogInterfaceOnClickListenerC12415(0, activityC171610, (CheckBox) viewM10216.findViewById(R.id.MT_Protector));
                            C19258 c19258BuildDialog = activityC171610.buildDialog();
                            c19258BuildDialog.m44421(viewM10216);
                            c19258BuildDialog.m44442(R.string.MT_Protector, dialogInterfaceOnClickListenerC12415);
                            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c19258BuildDialog.m44438();
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            C19258 c19258BuildDialog2 = activityC171610.buildDialog();
                            c19258BuildDialog2.m44433(R.string.MT_Protector);
                            c19258BuildDialog2.m44416(R.string.MT_Protector);
                            c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20919(activityC171610, 1));
                            c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c19258BuildDialog2.m44438();
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            activityC171610.m40359(i);
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            activityC171610.m40372(i);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            ActivityC17169.m40320(activityC171610, i);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            abstractC14347.mo17423(activityC171610.f52607);
                            activityC171610.m40358();
                            return true;
                        }
                        if (itemId != R.string.MT_Protector) {
                            return true;
                        }
                        activityC171610.f52599.m38948();
                        return true;
                    }
                });
                c21282.m48305();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView = this.f54597;
        if (view != imageView || motionEvent.getActionMasked() != 0 || imageView.getVisibility() != 0) {
            return false;
        }
        this.f54593.f52599.m38951(this);
        return true;
    }
}
