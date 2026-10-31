package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C4MC */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnKeyListenerC2769 extends AbstractC11236 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final int f8602;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f8603;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f8605;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C0113 f8606;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final int f8608;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3060 f8609;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Context f8611;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f8612;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f8613;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC17585 f8614;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public View f8615;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f8616;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f8617;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22110 f8618;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public PopupWindow.OnDismissListener f8619;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f8620;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f8607 = new ViewTreeObserverOnGlobalLayoutListenerC9119(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View.OnAttachStateChangeListener f8604 = new ViewOnAttachStateChangeListenerC16173(this);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f8610 = 0;

    @Override // l.InterfaceC14762
    public final boolean flagActionItems() {
        return false;
    }

    @Override // l.InterfaceC14762
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // l.InterfaceC14762
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8535(C3060 c3060) {
    }

    public ViewOnKeyListenerC2769(Context context, C3060 c3060, View view, int i, boolean z) {
        this.f8611 = context;
        this.f8609 = c3060;
        this.f8612 = z;
        this.f8618 = new C22110(c3060, LayoutInflater.from(context), z, R.layout.MT_Protector);
        this.f8608 = i;
        Resources resources = context.getResources();
        this.f8602 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Protector));
        this.f8617 = view;
        this.f8606 = new C0113(context, null, i, 0);
        c3060.addMenuPresenter(this, context);
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8536(boolean z) {
        this.f8618.m49688(z);
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8532(int i) {
        this.f8610 = i;
    }

    @Override // l.InterfaceC9825
    public final void show() {
        View view;
        if (isShowing()) {
            return;
        }
        if (!this.f8620 && (view = this.f8617) != null) {
            this.f8615 = view;
            C0113 c0113 = this.f8606;
            c0113.m23834((PopupWindow.OnDismissListener) this);
            c0113.m23832((AdapterView.OnItemClickListener) this);
            c0113.m23835();
            View view2 = this.f8615;
            boolean z = this.f8613 == null;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f8613 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f8607);
            }
            view2.addOnAttachStateChangeListener(this.f8604);
            c0113.m23831(view2);
            c0113.m23845(this.f8610);
            boolean z2 = this.f8605;
            Context context = this.f8611;
            C22110 c22110 = this.f8618;
            if (!z2) {
                this.f8603 = AbstractC11236.m27807(c22110, context, this.f8602);
                this.f8605 = true;
            }
            c0113.m23846(this.f8603);
            c0113.m23842();
            c0113.m23830(m27808());
            c0113.show();
            ListView listViewMo8540 = c0113.mo8540();
            listViewMo8540.setOnKeyListener(this);
            if (this.f8616) {
                C3060 c3060 = this.f8609;
                if (c3060.getHeaderTitle() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) listViewMo8540, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(c3060.getHeaderTitle());
                    }
                    frameLayout.setEnabled(false);
                    listViewMo8540.addHeaderView(frameLayout, null, false);
                }
            }
            c0113.mo1654(c22110);
            c0113.show();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // l.InterfaceC9825
    public final void dismiss() {
        if (isShowing()) {
            this.f8606.dismiss();
        }
    }

    @Override // l.InterfaceC9825
    public final boolean isShowing() {
        return !this.f8620 && this.f8606.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f8620 = true;
        this.f8609.close();
        ViewTreeObserver viewTreeObserver = this.f8613;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f8613 = this.f8615.getViewTreeObserver();
            }
            this.f8613.removeGlobalOnLayoutListener(this.f8607);
            this.f8613 = null;
        }
        this.f8615.removeOnAttachStateChangeListener(this.f8604);
        PopupWindow.OnDismissListener onDismissListener = this.f8619;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // l.InterfaceC14762
    public final void updateMenuView(boolean z) {
        this.f8605 = false;
        C22110 c22110 = this.f8618;
        if (c22110 != null) {
            c22110.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC14762
    public final void setCallback(InterfaceC17585 interfaceC17585) {
        this.f8614 = interfaceC17585;
    }

    @Override // l.InterfaceC14762
    public final boolean onSubMenuSelected(SubMenuC19703 subMenuC19703) {
        boolean z;
        if (subMenuC19703.hasVisibleItems()) {
            C18291 c18291 = new C18291(this.f8611, subMenuC19703, this.f8615, this.f8612, this.f8608, 0);
            c18291.m42633(this.f8614);
            int size = subMenuC19703.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC19703.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c18291.m42634(z);
            c18291.m42632(this.f8619);
            this.f8619 = null;
            this.f8609.close(false);
            C0113 c0113 = this.f8606;
            int iM23828 = c0113.m23828();
            int iM23843 = c0113.m23843();
            if ((Gravity.getAbsoluteGravity(this.f8610, this.f8617.getLayoutDirection()) & 7) == 5) {
                iM23828 += this.f8617.getWidth();
            }
            if (c18291.m42635(iM23828, iM23843)) {
                InterfaceC17585 interfaceC17585 = this.f8614;
                if (interfaceC17585 != null) {
                    interfaceC17585.mo2048(subMenuC19703);
                }
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC14762
    public final void onCloseMenu(C3060 c3060, boolean z) {
        if (c3060 != this.f8609) {
            return;
        }
        dismiss();
        InterfaceC17585 interfaceC17585 = this.f8614;
        if (interfaceC17585 != null) {
            interfaceC17585.onCloseMenu(c3060, z);
        }
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8533(View view) {
        this.f8617 = view;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8534(PopupWindow.OnDismissListener onDismissListener) {
        this.f8619 = onDismissListener;
    }

    @Override // l.InterfaceC9825
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ListView mo8540() {
        return this.f8606.mo8540();
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo8537(int i) {
        this.f8606.m23829(i);
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo8539(int i) {
        this.f8606.m23840(i);
    }

    @Override // l.AbstractC11236
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo8538(boolean z) {
        this.f8616 = z;
    }
}
