package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;
import l.C3060;
import l.C5882;
import l.InterfaceC14762;
import l.InterfaceC17585;
import l.InterfaceC7002;
import l.SubMenuC19703;

/* JADX INFO: loaded from: classes.dex */
public class NavigationBarPresenter implements InterfaceC14762 {
    public int id;
    public C3060 menu;
    public NavigationBarMenuView menuView;
    public boolean updateSuspended = false;

    @Override // l.InterfaceC14762
    public boolean collapseItemActionView(C3060 c3060, C5882 c5882) {
        return false;
    }

    @Override // l.InterfaceC14762
    public boolean expandItemActionView(C3060 c3060, C5882 c5882) {
        return false;
    }

    @Override // l.InterfaceC14762
    public boolean flagActionItems() {
        return false;
    }

    @Override // l.InterfaceC14762
    public void onCloseMenu(C3060 c3060, boolean z) {
    }

    @Override // l.InterfaceC14762
    public boolean onSubMenuSelected(SubMenuC19703 subMenuC19703) {
        return false;
    }

    @Override // l.InterfaceC14762
    public void setCallback(InterfaceC17585 interfaceC17585) {
    }

    public void setMenuView(NavigationBarMenuView navigationBarMenuView) {
        this.menuView = navigationBarMenuView;
    }

    @Override // l.InterfaceC14762
    public void initForMenu(Context context, C3060 c3060) {
        this.menu = c3060;
        this.menuView.initialize(c3060);
    }

    public InterfaceC7002 getMenuView(ViewGroup viewGroup) {
        return this.menuView;
    }

    @Override // l.InterfaceC14762
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
        this.id = i;
    }

    @Override // l.InterfaceC14762
    public int getId() {
        return this.id;
    }

    @Override // l.InterfaceC14762
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        savedState.badgeSavedStates = BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return savedState;
    }

    @Override // l.InterfaceC14762
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
