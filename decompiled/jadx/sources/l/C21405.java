package l;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import bin.mt.plus.R;
import com.google.android.material.internal.NavigationMenuPresenter;

/* JADX INFO: renamed from: l.᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85OU */
/* JADX INFO: loaded from: classes5.dex */
public final class C21405 implements InterfaceC14762, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C3060 f68909;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LayoutInflater f68910;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C0943 f68911;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Context f68912;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15053 f68913;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC17585 f68914;

    @Override // l.InterfaceC14762
    public final boolean collapseItemActionView(C3060 c3060, C5882 c5882) {
        return false;
    }

    @Override // l.InterfaceC14762
    public final boolean expandItemActionView(C3060 c3060, C5882 c5882) {
        return false;
    }

    @Override // l.InterfaceC14762
    public final boolean flagActionItems() {
        return false;
    }

    @Override // l.InterfaceC14762
    public final int getId() {
        return 0;
    }

    public C21405(Context context) {
        this.f68912 = context;
        this.f68910 = LayoutInflater.from(context);
    }

    @Override // l.InterfaceC14762
    public final void initForMenu(Context context, C3060 c3060) {
        if (this.f68912 != null) {
            this.f68912 = context;
            if (this.f68910 == null) {
                this.f68910 = LayoutInflater.from(context);
            }
        }
        this.f68909 = c3060;
        C15053 c15053 = this.f68913;
        if (c15053 != null) {
            c15053.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7002 m48504(ViewGroup viewGroup) {
        if (this.f68911 == null) {
            this.f68911 = (C0943) this.f68910.inflate(R.layout.MT_Protector, viewGroup, false);
            if (this.f68913 == null) {
                this.f68913 = new C15053(this);
            }
            this.f68911.setAdapter((ListAdapter) this.f68913);
            this.f68911.setOnItemClickListener(this);
        }
        return this.f68911;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ListAdapter m48503() {
        if (this.f68913 == null) {
            this.f68913 = new C15053(this);
        }
        return this.f68913;
    }

    @Override // l.InterfaceC14762
    public final void updateMenuView(boolean z) {
        C15053 c15053 = this.f68913;
        if (c15053 != null) {
            c15053.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC14762
    public final void setCallback(InterfaceC17585 interfaceC17585) {
        this.f68914 = interfaceC17585;
    }

    @Override // l.InterfaceC14762
    public final boolean onSubMenuSelected(SubMenuC19703 subMenuC19703) {
        if (!subMenuC19703.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC12232(subMenuC19703).m29738();
        InterfaceC17585 interfaceC17585 = this.f68914;
        if (interfaceC17585 == null) {
            return true;
        }
        interfaceC17585.mo2048(subMenuC19703);
        return true;
    }

    @Override // l.InterfaceC14762
    public final void onCloseMenu(C3060 c3060, boolean z) {
        InterfaceC17585 interfaceC17585 = this.f68914;
        if (interfaceC17585 != null) {
            interfaceC17585.onCloseMenu(c3060, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f68909.performItemAction(this.f68913.getItem(i), this, 0);
    }

    @Override // l.InterfaceC14762
    public final Parcelable onSaveInstanceState() {
        if (this.f68911 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        C0943 c0943 = this.f68911;
        if (c0943 != null) {
            c0943.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(NavigationMenuPresenter.STATE_HIERARCHY, sparseArray);
        return bundle;
    }

    @Override // l.InterfaceC14762
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray(NavigationMenuPresenter.STATE_HIERARCHY);
        if (sparseParcelableArray != null) {
            this.f68911.restoreHierarchyState(sparseParcelableArray);
        }
    }
}
