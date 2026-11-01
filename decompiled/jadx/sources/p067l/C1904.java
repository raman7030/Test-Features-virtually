package p067l;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import bin.p000mt.plus.R;
import com.google.android.material.internal.NavigationMenuPresenter;

/* JADX INFO: renamed from: l.᩸ۜ */
/* JADX INFO: compiled from: 85OU */
/* JADX INFO: loaded from: classes5.dex */
public final class C1904 implements InterfaceC1574, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۗ */
    public C0994 f71607;

    /* JADX INFO: renamed from: ۙ */
    public LayoutInflater f71608;

    /* JADX INFO: renamed from: ۬ */
    public C0889 f71609;

    /* JADX INFO: renamed from: ᩶ */
    public Context f71610;

    /* JADX INFO: renamed from: ᩸ */
    public C1589 f71611;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC1714 f71612;

    @Override // p067l.InterfaceC1574
    public final boolean collapseItemActionView(C0994 c0994, C1134 c1134) {
        return false;
    }

    @Override // p067l.InterfaceC1574
    public final boolean expandItemActionView(C0994 c0994, C1134 c1134) {
        return false;
    }

    @Override // p067l.InterfaceC1574
    public final boolean flagActionItems() {
        return false;
    }

    @Override // p067l.InterfaceC1574
    public final int getId() {
        return 0;
    }

    public C1904(Context context) {
        this.f71610 = context;
        this.f71608 = LayoutInflater.from(context);
    }

    @Override // p067l.InterfaceC1574
    public final void initForMenu(Context context, C0994 c0994) {
        if (this.f71610 != null) {
            this.f71610 = context;
            if (this.f71608 == null) {
                this.f71608 = LayoutInflater.from(context);
            }
        }
        this.f71607 = c0994;
        C1589 c1589 = this.f71611;
        if (c1589 != null) {
            c1589.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1189 m50840(ViewGroup viewGroup) {
        if (this.f71609 == null) {
            this.f71609 = (C0889) this.f71608.inflate(R.layout.MT_Protector, viewGroup, false);
            if (this.f71611 == null) {
                this.f71611 = new C1589(this);
            }
            this.f71609.setAdapter((ListAdapter) this.f71611);
            this.f71609.setOnItemClickListener(this);
        }
        return this.f71609;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ListAdapter m50839() {
        if (this.f71611 == null) {
            this.f71611 = new C1589(this);
        }
        return this.f71611;
    }

    @Override // p067l.InterfaceC1574
    public final void updateMenuView(boolean z) {
        C1589 c1589 = this.f71611;
        if (c1589 != null) {
            c1589.notifyDataSetChanged();
        }
    }

    @Override // p067l.InterfaceC1574
    public final void setCallback(InterfaceC1714 interfaceC1714) {
        this.f71612 = interfaceC1714;
    }

    @Override // p067l.InterfaceC1574
    public final boolean onSubMenuSelected(SubMenuC1819 subMenuC1819) {
        if (!subMenuC1819.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC1449(subMenuC1819).m31800();
        InterfaceC1714 interfaceC1714 = this.f71612;
        if (interfaceC1714 == null) {
            return true;
        }
        interfaceC1714.mo4428(subMenuC1819);
        return true;
    }

    @Override // p067l.InterfaceC1574
    public final void onCloseMenu(C0994 c0994, boolean z) {
        InterfaceC1714 interfaceC1714 = this.f71612;
        if (interfaceC1714 != null) {
            interfaceC1714.onCloseMenu(c0994, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f71607.performItemAction(this.f71611.getItem(i), this, 0);
    }

    @Override // p067l.InterfaceC1574
    public final Parcelable onSaveInstanceState() {
        if (this.f71609 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        C0889 c0889 = this.f71609;
        if (c0889 != null) {
            c0889.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(NavigationMenuPresenter.STATE_HIERARCHY, sparseArray);
        return bundle;
    }

    @Override // p067l.InterfaceC1574
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray(NavigationMenuPresenter.STATE_HIERARCHY);
        if (sparseParcelableArray != null) {
            this.f71609.restoreHierarchyState(sparseParcelableArray);
        }
    }
}
