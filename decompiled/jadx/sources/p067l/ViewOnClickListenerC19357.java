package p067l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC19357 extends AbstractC5462 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ۗ */
    public TextView f57788;

    /* JADX INFO: renamed from: ۙ */
    public TextView f57789;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ ActivityC18686 f57790;

    /* JADX INFO: renamed from: ۬ */
    public View f57791;

    /* JADX INFO: renamed from: ᩶ */
    public ImageView f57792;

    /* JADX INFO: renamed from: ᩸ */
    public View f57793;

    /* JADX INFO: renamed from: ᩹ */
    public ImageView f57794;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC19357(ActivityC18686 activityC18686, View view) {
        super(view);
        this.f57790 = activityC18686;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f57793 = view.findViewById(R.id.MT_Protector);
        this.f57791 = view.findViewById(R.id.MT_Protector);
        this.f57792 = (ImageView) view.findViewById(R.id.icon);
        this.f57788 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f57789 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f57794 = imageView;
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        Drawable drawableM5548 = C0886.m5548(activityC18686, R.drawable.MT_Protector);
        C12826.requireNonNull(drawableM5548);
        Drawable drawableMutate = drawableM5548.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition;
        ActivityC18686 activityC18686 = this.f57790;
        if (activityC18686.f55780.m41180() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return;
        }
        ActivityC18686.m42520(activityC18686, bindingAdapterPosition, true);
        activityC18686.m42603();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        final int bindingAdapterPosition;
        ActivityC18686 activityC18686 = this.f57790;
        if (!activityC18686.f55780.m41180() && (bindingAdapterPosition = getBindingAdapterPosition()) != -1) {
            final AbstractC16003 abstractC16003 = (AbstractC16003) activityC18686.f55797.get(bindingAdapterPosition);
            C12652 c12652M42551 = ActivityC18686.m42551(activityC18686, bindingAdapterPosition);
            if (abstractC16003.mo36368() || C12652.m29093(c12652M42551)) {
                View view2 = this.f57791;
                C1898 c1898 = new C1898(activityC18686, view2, 8388611);
                C9702.m22649(view2);
                c1898.m50640();
                C0994 c0994M50638 = c1898.m50638();
                if (abstractC16003.mo36368()) {
                    c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                }
                if (C12652.m29093(c12652M42551)) {
                    SubMenu subMenuAddSubMenu = c0994M50638.addSubMenu(0, R.id.MT_Protector, 0, activityC18686.getString(R.string.MT_Protector) + "…");
                    subMenuAddSubMenu.getItem().setIcon(R.drawable.MT_Protector);
                    subMenuAddSubMenu.setHeaderTitle(R.string.MT_Protector);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c12652M42551.f35519 + c12652M42551.f35521 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c12652M42551.f35520 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c12652M42551.f35522 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c12652M42551.f35519 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c12652M42551.f35521 > 0);
                }
                if (abstractC16003.mo36368()) {
                    if (abstractC16003.m36363()) {
                        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                    } else {
                        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                    }
                    if (abstractC16003.mo16322()) {
                        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                    }
                    c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                }
                c1898.m50636(new InterfaceC1583() { // from class: l.ܽۛ᩷
                    @Override // p067l.InterfaceC1583
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        ActivityC18686 activityC18687 = this.f53782.f57790;
                        int itemId = menuItem.getItemId();
                        AbstractC16003 abstractC16004 = abstractC16003;
                        if (itemId == R.string.MT_Protector) {
                            abstractC16004.mo19368(activityC18687);
                            return true;
                        }
                        int i = bindingAdapterPosition;
                        if (itemId == R.id.MT_Protector) {
                            activityC18687.m42593(i);
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            View viewM12252 = activityC18687.m12252(R.layout.MT_Protector);
                            ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                            DialogInterfaceOnClickListenerC14168 dialogInterfaceOnClickListenerC14168 = new DialogInterfaceOnClickListenerC14168(0, activityC18687, (CheckBox) viewM12252.findViewById(R.id.MT_Protector));
                            C20671 c20671BuildDialog = activityC18687.buildDialog();
                            c20671BuildDialog.m46715(viewM12252);
                            c20671BuildDialog.m46736(R.string.MT_Protector, dialogInterfaceOnClickListenerC14168);
                            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c20671BuildDialog.m46732();
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            C20671 c20671BuildDialog2 = activityC18687.buildDialog();
                            c20671BuildDialog2.m46727(R.string.MT_Protector);
                            c20671BuildDialog2.m46710(R.string.MT_Protector);
                            c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22250(activityC18687, 1));
                            c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c20671BuildDialog2.m46732();
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            activityC18687.m42604(i);
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            activityC18687.m42617(i);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            ActivityC18686.m42565(activityC18687, i);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            abstractC16004.mo19363(activityC18687.f55788);
                            activityC18687.m42603();
                            return true;
                        }
                        if (itemId != R.string.MT_Protector) {
                            return true;
                        }
                        activityC18687.f55780.m41174();
                        return true;
                    }
                });
                c1898.m50639();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView = this.f57794;
        if (view != imageView || motionEvent.getActionMasked() != 0 || imageView.getVisibility() != 0) {
            return false;
        }
        this.f57790.f55780.m41177(this);
        return true;
    }
}
