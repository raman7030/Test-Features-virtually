package p067l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21066 extends AbstractC5462 implements View.OnClickListener, View.OnTouchListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final C12255 f66159;

    /* JADX INFO: renamed from: ۙ */
    public final Drawable f66160;

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ C7654 f66161;

    /* JADX INFO: renamed from: ۤ */
    public final View f66162;

    /* JADX INFO: renamed from: ۫ */
    public final TextView f66163;

    /* JADX INFO: renamed from: ۬ */
    public final TextView f66164;

    /* JADX INFO: renamed from: ᩶ */
    public final ImageView f66165;

    /* JADX INFO: renamed from: ᩸ */
    public final C11007 f66166;

    /* JADX INFO: renamed from: ᩹ */
    public C18362 f66167;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC21066(C7654 c7654, C11007 c11007, View view) {
        super(view);
        this.f66161 = c7654;
        this.f66166 = c11007;
        this.f66159 = (C12255) view.findViewById(R.id.icon);
        this.f66163 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f66164 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f66162 = view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f66165 = imageView;
        Drawable drawableMutate = C0886.m5548(c7654.f20056, R.drawable.MT_Protector).mutate();
        this.f66160 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        C21272.m48052(view);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47523() {
        TextView textView = this.f66163;
        if (textView.getTextColors().getDefaultColor() != C23223.f72986.getDefaultColor()) {
            this.f66159.m28263();
            textView.setTextColor(C23223.f72986);
            this.f66164.setTextColor(C23223.f72984);
            C21272.m48052(this.itemView);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.MT_Protector) {
            C11007 c11007 = this.f66166;
            boolean z = c11007.f30485;
            C7654 c7654 = this.f66161;
            if (z) {
                boolean zM41823 = this.f66167.m41823();
                this.f66167.m41822(!zM41823);
                if (!zM41823) {
                    c11007.f30490++;
                } else {
                    c11007.f30490--;
                }
                c11007.f30492 = -1;
                this.itemView.setBackgroundColor(!zM41823 ? C23223.f72997 : 0);
                C7654.m17687(c7654, c11007.f30490 > 0);
                if (!zM41823) {
                    int bindingAdapterPosition = getBindingAdapterPosition();
                    int iAbs = Math.abs(bindingAdapterPosition - c11007.f30486);
                    c11007.f30486 = bindingAdapterPosition;
                    if (iAbs == 1) {
                        c11007.f30491++;
                    } else {
                        c11007.f30491 = 1;
                    }
                    if (c11007.f30491 == 5) {
                        C22682.m50799(R.string.MT_Protector);
                        c11007.f30491 = 0;
                        return;
                    }
                    return;
                }
                c11007.f30486 = -2;
                return;
            }
            if (c7654.f20076.m24763()) {
                return;
            }
            if (this.f66167.m41834() == null || C14486.m33131(this.f66167.m41834().m43234()) != null) {
                c7654.f20065.mo14294(this.f66167.m41824(), this.f66167.m41834());
            } else {
                this.f66167.m41816(c7654.f20056, new RunnableC4972(this, getBindingAdapterPosition()));
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || view.getVisibility() != 0) {
            return false;
        }
        this.f66166.f30494.m7555(this);
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C7654 c7654 = this.f66161;
        if (!C7654.m17694(c7654)) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        C11007 c11007 = this.f66166;
        if (!c11007.f30485) {
            C1898 c1898 = new C1898(view.getContext(), this.f66162, 0);
            c1898.m50640();
            C0994 c0994M50638 = c1898.m50638();
            boolean zM53815 = c11007.f30493.m53815();
            int iM53807 = zM53815 ? -1 : c11007.f30493.m53807(this.f66167);
            boolean z = !C7654.m17702(c7654);
            boolean z2 = !c11007.m25407() && iM53807 > 0;
            if (!zM53815) {
                c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            }
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            if (zM53815) {
                c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
                c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            } else {
                c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z2);
                c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
            }
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c1898.m50636(new InterfaceC1583() { // from class: l.ܺ᩵ܳ
                @Override // p067l.InterfaceC1583
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ViewOnClickListenerC21066.m47515(this.f52903, menuItem);
                    return true;
                }
            });
            c1898.m50639();
            return true;
        }
        if (c11007.f30492 == -1) {
            c11007.f30492 = getBindingAdapterPosition();
            if (!this.f66167.m41823()) {
                this.f66167.m41822(true);
                c11007.f30490++;
                this.itemView.setBackgroundColor(C23223.f72997);
                C7654.m17687(c7654, c11007.f30490 > 0);
            }
            return true;
        }
        int i = c11007.f30492;
        int bindingAdapterPosition = getBindingAdapterPosition();
        c11007.f30492 = -1;
        if (i > bindingAdapterPosition) {
            bindingAdapterPosition = i;
            i = bindingAdapterPosition;
        }
        while (i <= bindingAdapterPosition) {
            C18362 c18362M53811 = c11007.f30493.m53811(i);
            if (!c18362M53811.m41823()) {
                c18362M53811.m41822(true);
                c11007.f30490++;
            }
            i++;
        }
        c11007.notifyDataSetChanged();
        C7654.m17687(c7654, c11007.f30490 > 0);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47515(final ViewOnClickListenerC21066 viewOnClickListenerC21066, MenuItem menuItem) {
        C7654 c7654 = viewOnClickListenerC21066.f66161;
        C11007 c11007 = viewOnClickListenerC21066.f66166;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            viewOnClickListenerC21066.f66167.m41816(c7654.f20056, new RunnableC4972(viewOnClickListenerC21066, viewOnClickListenerC21066.getBindingAdapterPosition()));
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C11007.m25401(c11007, viewOnClickListenerC21066.f66167);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            final DialogInterfaceOnClickListenerC15679 dialogInterfaceOnClickListenerC15679 = new DialogInterfaceOnClickListenerC15679(c11007.f30493.f77249);
            C20671 c20671BuildDialog = c7654.f20056.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46723(dialogInterfaceOnClickListenerC15679.f45448, dialogInterfaceOnClickListenerC15679.f45449, dialogInterfaceOnClickListenerC15679);
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘ᩵ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ViewOnClickListenerC21066.m47516(this.f16369, dialogInterfaceOnClickListenerC15679);
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            int i = c11007.f30493.m53815() ? R.string.MT_Protector : R.string.MT_Protector;
            C20671 c20671BuildDialog2 = c7654.f20056.buildDialog();
            c20671BuildDialog2.m46727(R.string.MT_Protector);
            c20671BuildDialog2.m46718(C7050.m16203(i, viewOnClickListenerC21066.f66163.getText().toString()));
            c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴ᩵ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC21066.m47513(this.f63057);
                }
            });
            c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog2.m46732();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c11007.m25411(viewOnClickListenerC21066.getBindingAdapterPosition());
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C10987.m25349(viewOnClickListenerC21066.f66167.m41824(), viewOnClickListenerC21066.f66167.m41834(), -1);
            C22682.m50793(R.string.MT_Protector);
        } else if (itemId == R.string.MT_Protector) {
            viewOnClickListenerC21066.f66167.m41815(c7654.f20056);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47516(ViewOnClickListenerC21066 viewOnClickListenerC21066, DialogInterfaceOnClickListenerC15679 dialogInterfaceOnClickListenerC15679) {
        C11007 c11007 = viewOnClickListenerC21066.f66166;
        if (dialogInterfaceOnClickListenerC15679.f45450 != dialogInterfaceOnClickListenerC15679.f45449) {
            int iM53807 = c11007.f30493.m53807(viewOnClickListenerC21066.f66167);
            if (iM53807 != -1) {
                C10987.m25344(c11007.f30493.f77249, dialogInterfaceOnClickListenerC15679.f45448[dialogInterfaceOnClickListenerC15679.f45449].m50239(), iM53807);
            } else {
                c11007.m25413();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47513(ViewOnClickListenerC21066 viewOnClickListenerC21066) {
        C11007 c11007 = viewOnClickListenerC21066.f66166;
        try {
            int bindingAdapterPosition = viewOnClickListenerC21066.getBindingAdapterPosition();
            int iM53807 = c11007.f30493.m53807(viewOnClickListenerC21066.f66167);
            if (iM53807 == -1) {
                c11007.m25413();
            } else {
                c11007.f30493.m53808(iM53807);
                C11007.m25396(c11007, viewOnClickListenerC21066.f66167, bindingAdapterPosition);
            }
        } catch (RuntimeException unused) {
            c11007.notifyDataSetChanged();
        }
        C20946.f65824.mo4062(Object.class);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47514(ViewOnClickListenerC21066 viewOnClickListenerC21066, int i) {
        C11007 c11007 = viewOnClickListenerC21066.f66166;
        if (i == -1) {
            i = C11007.m25393(c11007, viewOnClickListenerC21066.f66167);
        }
        if (i != -1) {
            c11007.notifyItemChanged(i);
        } else {
            c11007.m25413();
        }
        C20946.f65824.mo4062(Object.class);
    }
}
