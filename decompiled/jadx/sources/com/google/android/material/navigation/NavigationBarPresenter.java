package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;
import p067l.C0994;
import p067l.C1134;
import p067l.InterfaceC1189;
import p067l.InterfaceC1574;
import p067l.InterfaceC1714;
import p067l.SubMenuC1819;

/* JADX INFO: loaded from: classes.dex */
public class NavigationBarPresenter implements InterfaceC1574 {

    /* JADX INFO: renamed from: id */
    public int f2052id;
    public C0994 menu;
    public NavigationBarMenuView menuView;
    public boolean updateSuspended = false;

    @Override // p067l.InterfaceC1574
    public boolean collapseItemActionView(C0994 c0994, C1134 c1134) {
        return false;
    }

    @Override // p067l.InterfaceC1574
    public boolean expandItemActionView(C0994 c0994, C1134 c1134) {
        return false;
    }

    @Override // p067l.InterfaceC1574
    public boolean flagActionItems() {
        return false;
    }

    @Override // p067l.InterfaceC1574
    public void onCloseMenu(C0994 c0994, boolean z) {
    }

    @Override // p067l.InterfaceC1574
    public boolean onSubMenuSelected(SubMenuC1819 subMenuC1819) {
        return false;
    }

    @Override // p067l.InterfaceC1574
    public void setCallback(InterfaceC1714 interfaceC1714) {
    }

    public void setMenuView(NavigationBarMenuView navigationBarMenuView) {
        this.menuView = navigationBarMenuView;
    }

    @Override // p067l.InterfaceC1574
    public void initForMenu(Context context, C0994 c0994) {
        this.menu = c0994;
        this.menuView.initialize(c0994);
    }

    public InterfaceC1189 getMenuView(ViewGroup viewGroup) {
        return this.menuView;
    }

    @Override // p067l.InterfaceC1574
    public void updateMenuView(boolean z) {
        if (this.updateSuspended) {
            return;
        }
        if (z) {
            this.menuView.buildMenuView();
        } else {
            this.menuView.updateMenuView();
        }
    }

    public void setId(int i) {
        this.f2052id = i;
    }

    @Override // p067l.InterfaceC1574
    public int getId() {
        return this.f2052id;
    }

    @Override // p067l.InterfaceC1574
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        savedState.badgeSavedStates = BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return savedState;
    }

    @Override // p067l.InterfaceC1574
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.menuView.tryRestoreSelectedItemId(savedState.selectedItemId);
            this.menuView.restoreBadgeDrawables(BadgeUtils.createBadgeDrawablesFromSavedStates(this.menuView.getContext(), savedState.badgeSavedStates));
        }
    }

    public void setUpdateSuspended(boolean z) {
        this.updateSuspended = z;
    }

    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.google.android.material.navigation.NavigationBarPresenter.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public ParcelableSparseArray badgeSavedStates;
        public int selectedItemId;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.selectedItemId = parcel.readInt();
            this.badgeSavedStates = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
            parcel.writeParcelable(this.badgeSavedStates, 0);
        }
    }
}
