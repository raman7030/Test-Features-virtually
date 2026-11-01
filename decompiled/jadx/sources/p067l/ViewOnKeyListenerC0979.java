package p067l;

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
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖ᩷ */
/* JADX INFO: compiled from: C4MC */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnKeyListenerC0979 extends AbstractC1399 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {

    /* JADX INFO: renamed from: ֫֫ */
    public final int f11396;

    /* JADX INFO: renamed from: ۗ */
    public int f11397;

    /* JADX INFO: renamed from: ۛ */
    public boolean f11399;

    /* JADX INFO: renamed from: ۟ */
    public final C0848 f11400;

    /* JADX INFO: renamed from: ۧ֫ */
    public final int f11402;

    /* JADX INFO: renamed from: ۨ */
    public final C0994 f11403;

    /* JADX INFO: renamed from: ۬ */
    public final Context f11405;

    /* JADX INFO: renamed from: ܰ */
    public final boolean f11406;

    /* JADX INFO: renamed from: ܳ֫ */
    public ViewTreeObserver f11407;

    /* JADX INFO: renamed from: ܽ֫ */
    public InterfaceC1714 f11408;

    /* JADX INFO: renamed from: ܿ֫ */
    public View f11409;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f11410;

    /* JADX INFO: renamed from: ᩶ */
    public View f11411;

    /* JADX INFO: renamed from: ᩹ */
    public final C1939 f11412;

    /* JADX INFO: renamed from: ᩺ */
    public PopupWindow.OnDismissListener f11413;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f11414;

    /* JADX INFO: renamed from: ۤ */
    public final ViewTreeObserver.OnGlobalLayoutListener f11401 = new ViewTreeObserverOnGlobalLayoutListenerC1294(this);

    /* JADX INFO: renamed from: ۙ */
    public final View.OnAttachStateChangeListener f11398 = new ViewOnAttachStateChangeListenerC1644(this);

    /* JADX INFO: renamed from: ۫ */
    public int f11404 = 0;

    @Override // p067l.InterfaceC1574
    public final boolean flagActionItems() {
        return false;
    }

    @Override // p067l.InterfaceC1574
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // p067l.InterfaceC1574
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ֫ */
    public final void mo10598(C0994 c0994) {
    }

    public ViewOnKeyListenerC0979(Context context, C0994 c0994, View view, int i, boolean z) {
        this.f11405 = context;
        this.f11403 = c0994;
        this.f11406 = z;
        this.f11412 = new C1939(c0994, LayoutInflater.from(context), z, R.layout.MT_Protector);
        this.f11402 = i;
        Resources resources = context.getResources();
        this.f11396 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Protector));
        this.f11411 = view;
        this.f11400 = new C0848(context, null, i, 0);
        c0994.addMenuPresenter(this, context);
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ֫ */
    public final void mo10599(boolean z) {
        this.f11412.m52026(z);
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ֫ */
    public final void mo10595(int i) {
        this.f11404 = i;
    }

    @Override // p067l.InterfaceC1329
    public final void show() {
        View view;
        if (isShowing()) {
            return;
        }
        if (!this.f11414 && (view = this.f11411) != null) {
            this.f11409 = view;
            C0848 c0848 = this.f11400;
            c0848.m25843((PopupWindow.OnDismissListener) this);
            c0848.m25841((AdapterView.OnItemClickListener) this);
            c0848.m25844();
            View view2 = this.f11409;
            boolean z = this.f11407 == null;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f11407 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f11401);
            }
            view2.addOnAttachStateChangeListener(this.f11398);
            c0848.m25840(view2);
            c0848.m25854(this.f11404);
            boolean z2 = this.f11399;
            Context context = this.f11405;
            C1939 c1939 = this.f11412;
            if (!z2) {
                this.f11397 = AbstractC1399.m29869(c1939, context, this.f11396);
                this.f11399 = true;
            }
            c0848.m25855(this.f11397);
            c0848.m25851();
            c0848.m25839(m29870());
            c0848.show();
            ListView listViewMo10603 = c0848.mo10603();
            listViewMo10603.setOnKeyListener(this);
            if (this.f11410) {
                C0994 c0994 = this.f11403;
                if (c0994.getHeaderTitle() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) listViewMo10603, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(c0994.getHeaderTitle());
                    }
                    frameLayout.setEnabled(false);
                    listViewMo10603.addHeaderView(frameLayout, null, false);
                }
            }
            c0848.mo4052(c1939);
            c0848.show();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // p067l.InterfaceC1329
    public final void dismiss() {
        if (isShowing()) {
            this.f11400.dismiss();
        }
    }

    @Override // p067l.InterfaceC1329
    public final boolean isShowing() {
        return !this.f11414 && this.f11400.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f11414 = true;
        this.f11403.close();
        ViewTreeObserver viewTreeObserver = this.f11407;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f11407 = this.f11409.getViewTreeObserver();
            }
            this.f11407.removeGlobalOnLayoutListener(this.f11401);
            this.f11407 = null;
        }
        this.f11409.removeOnAttachStateChangeListener(this.f11398);
        PopupWindow.OnDismissListener onDismissListener = this.f11413;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // p067l.InterfaceC1574
    public final void updateMenuView(boolean z) {
        this.f11399 = false;
        C1939 c1939 = this.f11412;
        if (c1939 != null) {
            c1939.notifyDataSetChanged();
        }
    }

    @Override // p067l.InterfaceC1574
    public final void setCallback(InterfaceC1714 interfaceC1714) {
        this.f11408 = interfaceC1714;
    }

    @Override // p067l.InterfaceC1574
    public final boolean onSubMenuSelected(SubMenuC1819 subMenuC1819) {
        boolean z;
        if (subMenuC1819.hasVisibleItems()) {
            C1749 c1749 = new C1749(this.f11405, subMenuC1819, this.f11409, this.f11406, this.f11402, 0);
            c1749.m44893(this.f11408);
            int size = subMenuC1819.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC1819.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c1749.m44894(z);
            c1749.m44892(this.f11413);
            this.f11413 = null;
            this.f11403.close(false);
            C0848 c0848 = this.f11400;
            int iM25837 = c0848.m25837();
            int iM25852 = c0848.m25852();
            if ((Gravity.getAbsoluteGravity(this.f11404, this.f11411.getLayoutDirection()) & 7) == 5) {
                iM25837 += this.f11411.getWidth();
            }
            if (c1749.m44895(iM25837, iM25852)) {
                InterfaceC1714 interfaceC1714 = this.f11408;
                if (interfaceC1714 != null) {
                    interfaceC1714.mo4428(subMenuC1819);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC1574
    public final void onCloseMenu(C0994 c0994, boolean z) {
        if (c0994 != this.f11403) {
            return;
        }
        dismiss();
        InterfaceC1714 interfaceC1714 = this.f11408;
        if (interfaceC1714 != null) {
            interfaceC1714.onCloseMenu(c0994, z);
        }
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ֫ */
    public final void mo10596(View view) {
        this.f11411 = view;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ֫ */
    public final void mo10597(PopupWindow.OnDismissListener onDismissListener) {
        this.f11413 = onDismissListener;
    }

    @Override // p067l.InterfaceC1329
    /* JADX INFO: renamed from: ᩳ */
    public final ListView mo10603() {
        return this.f11400.mo10603();
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ۧ */
    public final void mo10600(int i) {
        this.f11400.m25838(i);
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ܽ */
    public final void mo10602(int i) {
        this.f11400.m25849(i);
    }

    @Override // p067l.AbstractC1399
    /* JADX INFO: renamed from: ۧ */
    public final void mo10601(boolean z) {
        this.f11410 = z;
    }
}
