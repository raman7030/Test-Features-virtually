package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC19673 extends AbstractC3255 implements View.OnClickListener, View.OnTouchListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C10402 f63538;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f63539;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5561 f63540;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View f63541;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final TextView f63542;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextView f63543;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f63544;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9089 f63545;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C16828 f63546;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC19673(C5561 c5561, C9089 c9089, View view) {
        super(view);
        this.f63540 = c5561;
        this.f63545 = c9089;
        this.f63538 = (C10402) view.findViewById(R.id.icon);
        this.f63542 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f63543 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f63541 = view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f63544 = imageView;
        Drawable drawableMutate = C0881.m3234(c5561.f17216, R.drawable.MT_Protector).mutate();
        this.f63539 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        C19890.m45741(view);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45226() {
        TextView textView = this.f63542;
        if (textView.getTextColors().getDefaultColor() != C21943.f70275.getDefaultColor()) {
            this.f63538.m26234();
            textView.setTextColor(C21943.f70275);
            this.f63543.setTextColor(C21943.f70273);
            C19890.m45741(this.itemView);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.MT_Protector) {
            C9089 c9089 = this.f63545;
            boolean z = c9089.f27548;
            C5561 c5561 = this.f63540;
            if (z) {
                boolean zM39587 = this.f63546.m39587();
                this.f63546.m39586(!zM39587);
                if (!zM39587) {
                    c9089.f27553++;
                } else {
                    c9089.f27553--;
                }
                c9089.f27555 = -1;
                this.itemView.setBackgroundColor(!zM39587 ? C21943.f70286 : 0);
                C5561.m15772(c5561, c9089.f27553 > 0);
                if (!zM39587) {
                    int bindingAdapterPosition = getBindingAdapterPosition();
                    int iAbs = Math.abs(bindingAdapterPosition - c9089.f27549);
                    c9089.f27549 = bindingAdapterPosition;
                    if (iAbs == 1) {
                        c9089.f27554++;
                    } else {
                        c9089.f27554 = 1;
                    }
                    if (c9089.f27554 == 5) {
                        C21374.m48463(R.string.MT_Protector);
                        c9089.f27554 = 0;
                        return;
                    }
                    return;
                }
                c9089.f27549 = -2;
                return;
            }
            if (c5561.f17236.m22793()) {
                return;
            }
            if (this.f63546.m39598() == null || C12749.m31047(this.f63546.m39598().m40974()) != null) {
                c5561.f17225.mo12404(this.f63546.m39588(), this.f63546.m39598());
            } else {
                this.f63546.m39580(c5561.f17216, new RunnableC2739(this, getBindingAdapterPosition()));
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || view.getVisibility() != 0) {
            return false;
        }
        this.f63545.f27557.m5326(this);
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C5561 c5561 = this.f63540;
        if (!C5561.m15779(c5561)) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        C9089 c9089 = this.f63545;
        if (!c9089.f27548) {
            C21282 c21282 = new C21282(view.getContext(), this.f63541, 0);
            c21282.m48306();
            C3060 c3060M48304 = c21282.m48304();
            boolean zM51419 = c9089.f27556.m51419();
            int iM51411 = zM51419 ? -1 : c9089.f27556.m51411(this.f63546);
            boolean z = !C5561.m15787(c5561);
            boolean z2 = !c9089.m23460() && iM51411 > 0;
            if (!zM51419) {
                c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            }
            c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            if (zM51419) {
                c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
                c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            } else {
                c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z2);
                c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
            }
            c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c21282.m48302(new InterfaceC14930() { // from class: l.ܺ᩵ܳ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ViewOnClickListenerC19673.m45218(this.f49737, menuItem);
                    return true;
                }
            });
            c21282.m48305();
            return true;
        }
        if (c9089.f27555 == -1) {
            c9089.f27555 = getBindingAdapterPosition();
            if (!this.f63546.m39587()) {
                this.f63546.m39586(true);
                c9089.f27553++;
                this.itemView.setBackgroundColor(C21943.f70286);
                C5561.m15772(c5561, c9089.f27553 > 0);
            }
            return true;
        }
        int i = c9089.f27555;
        int bindingAdapterPosition = getBindingAdapterPosition();
        c9089.f27555 = -1;
        if (i > bindingAdapterPosition) {
            bindingAdapterPosition = i;
            i = bindingAdapterPosition;
        }
        while (i <= bindingAdapterPosition) {
            C16828 c16828M51415 = c9089.f27556.m51415(i);
            if (!c16828M51415.m39587()) {
                c16828M51415.m39586(true);
                c9089.f27553++;
            }
            i++;
        }
        c9089.notifyDataSetChanged();
        C5561.m15772(c5561, c9089.f27553 > 0);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45218(final ViewOnClickListenerC19673 viewOnClickListenerC19673, MenuItem menuItem) {
        C5561 c5561 = viewOnClickListenerC19673.f63540;
        C9089 c9089 = viewOnClickListenerC19673.f63545;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            viewOnClickListenerC19673.f63546.m39580(c5561.f17216, new RunnableC2739(viewOnClickListenerC19673, viewOnClickListenerC19673.getBindingAdapterPosition()));
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C9089.m23454(c9089, viewOnClickListenerC19673.f63546);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            final DialogInterfaceOnClickListenerC14005 dialogInterfaceOnClickListenerC14005 = new DialogInterfaceOnClickListenerC14005(c9089.f27556.f74505);
            C19258 c19258BuildDialog = c5561.f17216.buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44429(dialogInterfaceOnClickListenerC14005.f42365, dialogInterfaceOnClickListenerC14005.f42366, dialogInterfaceOnClickListenerC14005);
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘ᩵ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ViewOnClickListenerC19673.m45219(this.f13555, dialogInterfaceOnClickListenerC14005);
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44438();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            int i = c9089.f27556.m51419() ? R.string.MT_Protector : R.string.MT_Protector;
            C19258 c19258BuildDialog2 = c5561.f17216.buildDialog();
            c19258BuildDialog2.m44433(R.string.MT_Protector);
            c19258BuildDialog2.m44424(C4925.m14306(i, viewOnClickListenerC19673.f63542.getText().toString()));
            c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴ᩵ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC19673.m45216(this.f59829);
                }
            });
            c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog2.m44438();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c9089.m23464(viewOnClickListenerC19673.getBindingAdapterPosition());
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C9068.m23403(viewOnClickListenerC19673.f63546.m39588(), viewOnClickListenerC19673.f63546.m39598(), -1);
            C21374.m48457(R.string.MT_Protector);
        } else if (itemId == R.string.MT_Protector) {
            viewOnClickListenerC19673.f63546.m39579(c5561.f17216);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45219(ViewOnClickListenerC19673 viewOnClickListenerC19673, DialogInterfaceOnClickListenerC14005 dialogInterfaceOnClickListenerC14005) {
        C9089 c9089 = viewOnClickListenerC19673.f63545;
        if (dialogInterfaceOnClickListenerC14005.f42367 != dialogInterfaceOnClickListenerC14005.f42366) {
            int iM51411 = c9089.f27556.m51411(viewOnClickListenerC19673.f63546);
            if (iM51411 != -1) {
                C9068.m23398(c9089.f27556.f74505, dialogInterfaceOnClickListenerC14005.f42365[dialogInterfaceOnClickListenerC14005.f42366].m47909(), iM51411);
            } else {
                c9089.m23466();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45216(ViewOnClickListenerC19673 viewOnClickListenerC19673) {
        C9089 c9089 = viewOnClickListenerC19673.f63545;
        try {
            int bindingAdapterPosition = viewOnClickListenerC19673.getBindingAdapterPosition();
            int iM51411 = c9089.f27556.m51411(viewOnClickListenerC19673.f63546);
            if (iM51411 == -1) {
                c9089.m23466();
            } else {
                c9089.f27556.m51412(iM51411);
                C9089.m23449(c9089, viewOnClickListenerC19673.f63546, bindingAdapterPosition);
            }
        } catch (RuntimeException unused) {
            c9089.notifyDataSetChanged();
        }
        C19547.f63204.mo1664(Object.class);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45217(ViewOnClickListenerC19673 viewOnClickListenerC19673, int i) {
        C9089 c9089 = viewOnClickListenerC19673.f63545;
        if (i == -1) {
            i = C9089.m23446(c9089, viewOnClickListenerC19673.f63546);
        }
        if (i != -1) {
            c9089.notifyItemChanged(i);
        } else {
            c9089.m23466();
        }
        C19547.f63204.mo1664(Object.class);
    }
}
