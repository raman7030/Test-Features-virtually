package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import l.AbstractC19902;
import l.AbstractC3255;
import l.C10311;
import l.C13132;
import l.C14369;
import l.C15813;
import l.C16445;
import l.C16486;
import l.C17648;
import l.C17898;
import l.C21610;
import l.C23575;
import l.C3060;
import l.C4330;
import l.C5882;
import l.InterfaceC14762;
import l.InterfaceC17585;
import l.InterfaceC7002;
import l.SubMenuC19703;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuPresenter implements InterfaceC14762 {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    public static final String STATE_ADAPTER = "android:menu:adapter";
    public static final String STATE_HEADER = "android:menu:header";
    public static final String STATE_HIERARCHY = "android:menu:list";
    public NavigationMenuAdapter adapter;
    public InterfaceC17585 callback;
    public int dividerInsetEnd;
    public int dividerInsetStart;
    public boolean hasCustomItemIconSize;
    public LinearLayout headerLayout;
    public ColorStateList iconTintList;
    public int id;
    public Drawable itemBackground;
    public RippleDrawable itemForeground;
    public int itemHorizontalPadding;
    public int itemIconPadding;
    public int itemIconSize;
    public int itemMaxLines;
    public int itemVerticalPadding;
    public LayoutInflater layoutInflater;
    public C3060 menu;
    public NavigationMenuView menuView;
    public int paddingSeparator;
    public int paddingTopDefault;
    public ColorStateList subheaderColor;
    public int subheaderInsetEnd;
    public int subheaderInsetStart;
    public ColorStateList textColor;
    public int subheaderTextAppearance = 0;
    public int textAppearance = 0;
    public boolean textAppearanceActiveBoldEnabled = true;
    public boolean isBehindStatusBar = true;
    public int overScrollMode = -1;
    public final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.internal.NavigationMenuPresenter.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            C5882 itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean zPerformItemAction = navigationMenuPresenter.menu.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && zPerformItemAction) {
                NavigationMenuPresenter.this.adapter.setCheckedItem(itemData);
            } else {
                z = false;
            }
            NavigationMenuPresenter.this.setUpdateSuspended(false);
            if (z) {
                NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    };

    public class NavigationMenuHeaderItem implements NavigationMenuItem {
    }

    public interface NavigationMenuItem {
    }

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
    public boolean onSubMenuSelected(SubMenuC19703 subMenuC19703) {
        return false;
    }

    @Override // l.InterfaceC14762
    public void initForMenu(Context context, C3060 c3060) {
        this.layoutInflater = LayoutInflater.from(context);
        this.menu = c3060;
        this.paddingSeparator = context.getResources().getDimensionPixelOffset(C23575.f76339);
    }

    public InterfaceC7002 getMenuView(ViewGroup viewGroup) {
        if (this.menuView == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.layoutInflater.inflate(C15813.f48891, viewGroup, false);
            this.menuView = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new NavigationMenuViewAccessibilityDelegate(this.menuView));
            if (this.adapter == null) {
                NavigationMenuAdapter navigationMenuAdapter = new NavigationMenuAdapter();
                this.adapter = navigationMenuAdapter;
                navigationMenuAdapter.setHasStableIds(true);
            }
            int i = this.overScrollMode;
            if (i != -1) {
                this.menuView.setOverScrollMode(i);
            }
            LinearLayout linearLayout = (LinearLayout) this.layoutInflater.inflate(C15813.f48866, (ViewGroup) this.menuView, false);
            this.headerLayout = linearLayout;
            int i2 = C17648.f53953;
            linearLayout.setImportantForAccessibility(2);
            this.menuView.setAdapter(this.adapter);
        }
        return this.menuView;
    }

    @Override // l.InterfaceC14762
    public void updateMenuView(boolean z) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.update();
        }
    }

    @Override // l.InterfaceC14762
    public void setCallback(InterfaceC17585 interfaceC17585) {
        this.callback = interfaceC17585;
    }

    @Override // l.InterfaceC14762
    public void onCloseMenu(C3060 c3060, boolean z) {
        InterfaceC17585 interfaceC17585 = this.callback;
        if (interfaceC17585 != null) {
            interfaceC17585.onCloseMenu(c3060, z);
        }
    }

    @Override // l.InterfaceC14762
    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    @Override // l.InterfaceC14762
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.menuView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.menuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(STATE_HIERARCHY, sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            bundle.putBundle(STATE_ADAPTER, navigationMenuAdapter.createInstanceState());
        }
        if (this.headerLayout != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.headerLayout.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(STATE_HEADER, sparseArray2);
        }
        return bundle;
    }

    @Override // l.InterfaceC14762
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(STATE_HIERARCHY);
            if (sparseParcelableArray != null) {
                this.menuView.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(STATE_ADAPTER);
            if (bundle2 != null) {
                this.adapter.restoreInstanceState(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(STATE_HEADER);
            if (sparseParcelableArray2 != null) {
                this.headerLayout.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public void setCheckedItem(C5882 c5882) {
        this.adapter.setCheckedItem(c5882);
    }

    public C5882 getCheckedItem() {
        return this.adapter.getCheckedItem();
    }

    public View inflateHeaderView(int i) {
        View viewInflate = this.layoutInflater.inflate(i, (ViewGroup) this.headerLayout, false);
        addHeaderView(viewInflate);
        return viewInflate;
    }

    public void addHeaderView(View view) {
        this.headerLayout.addView(view);
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void removeHeaderView(View view) {
        this.headerLayout.removeView(view);
        if (hasHeader()) {
            return;
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, this.paddingTopDefault, 0, navigationMenuView.getPaddingBottom());
    }

    public int getHeaderCount() {
        return this.headerLayout.getChildCount();
    }

    private boolean hasHeader() {
        return getHeaderCount() > 0;
    }

    public View getHeaderView(int i) {
        return this.headerLayout.getChildAt(i);
    }

    public void setSubheaderColor(ColorStateList colorStateList) {
        this.subheaderColor = colorStateList;
        updateMenuView(false);
    }

    public void setSubheaderTextAppearance(int i) {
        this.subheaderTextAppearance = i;
        updateMenuView(false);
    }

    public ColorStateList getItemTintList() {
        return this.iconTintList;
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        updateMenuView(false);
    }

    public ColorStateList getItemTextColor() {
        return this.textColor;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.textColor = colorStateList;
        updateMenuView(false);
    }

    public void setItemTextAppearance(int i) {
        this.textAppearance = i;
        updateMenuView(false);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.textAppearanceActiveBoldEnabled = z;
        updateMenuView(false);
    }

    public Drawable getItemBackground() {
        return this.itemBackground;
    }

    public void setItemBackground(Drawable drawable) {
        this.itemBackground = drawable;
        updateMenuView(false);
    }

    public void setItemForeground(RippleDrawable rippleDrawable) {
        this.itemForeground = rippleDrawable;
        updateMenuView(false);
    }

    public int getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    public void setItemHorizontalPadding(int i) {
        this.itemHorizontalPadding = i;
        updateMenuView(false);
    }

    public int getItemVerticalPadding() {
        return this.itemVerticalPadding;
    }

    public void setItemVerticalPadding(int i) {
        this.itemVerticalPadding = i;
        updateMenuView(false);
    }

    public int getDividerInsetStart() {
        return this.dividerInsetStart;
    }

    public void setDividerInsetStart(int i) {
        this.dividerInsetStart = i;
        updateMenuView(false);
    }

    public int getDividerInsetEnd() {
        return this.dividerInsetEnd;
    }

    public void setDividerInsetEnd(int i) {
        this.dividerInsetEnd = i;
        updateMenuView(false);
    }

    public int getSubheaderInsetStart() {
        return this.subheaderInsetStart;
    }

    public void setSubheaderInsetStart(int i) {
        this.subheaderInsetStart = i;
        updateMenuView(false);
    }

    public int getSubheaderInsetEnd() {
        return this.subheaderInsetEnd;
    }

    public void setSubheaderInsetEnd(int i) {
        this.subheaderInsetEnd = i;
        updateMenuView(false);
    }

    public int getItemIconPadding() {
        return this.itemIconPadding;
    }

    public void setItemIconPadding(int i) {
        this.itemIconPadding = i;
        updateMenuView(false);
    }

    public void setItemMaxLines(int i) {
        this.itemMaxLines = i;
        updateMenuView(false);
    }

    public int getItemMaxLines() {
        return this.itemMaxLines;
    }

    public void setItemIconSize(int i) {
        if (this.itemIconSize != i) {
            this.itemIconSize = i;
            this.hasCustomItemIconSize = true;
            updateMenuView(false);
        }
    }

    public void setUpdateSuspended(boolean z) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.setUpdateSuspended(z);
        }
    }

    public void setBehindStatusBar(boolean z) {
        if (this.isBehindStatusBar != z) {
            this.isBehindStatusBar = z;
            updateTopPadding();
        }
    }

    public boolean isBehindStatusBar() {
        return this.isBehindStatusBar;
    }

    private void updateTopPadding() {
        int i = (hasHeader() || !this.isBehindStatusBar) ? 0 : this.paddingTopDefault;
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    public void dispatchApplyWindowInsets(C21610 c21610) {
        int iM48826 = c21610.m48826();
        if (this.paddingTopDefault != iM48826) {
            this.paddingTopDefault = iM48826;
            updateTopPadding();
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c21610.m48835());
        C17648.m41299(this.headerLayout, c21610);
    }

    public void setOverScrollMode(int i) {
        this.overScrollMode = i;
        NavigationMenuView navigationMenuView = this.menuView;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    public abstract class ViewHolder extends AbstractC3255 {
        public ViewHolder(View view) {
            super(view);
        }
    }

    public class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C15813.f48858, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    public class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C15813.f48849, viewGroup, false));
        }
    }

    public class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C15813.f48862, viewGroup, false));
        }
    }

    public class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    public class NavigationMenuAdapter extends AbstractC19902 {
        public static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        public static final String STATE_CHECKED_ITEM = "android:menu:checked";
        public static final int VIEW_TYPE_HEADER = 3;
        public static final int VIEW_TYPE_NORMAL = 0;
        public static final int VIEW_TYPE_SEPARATOR = 2;
        public static final int VIEW_TYPE_SUBHEADER = 1;
        public C5882 checkedItem;
        public final ArrayList items = new ArrayList();
        public boolean updateSuspended;

        @Override // l.AbstractC19902
        public long getItemId(int i) {
            return i;
        }

        public NavigationMenuAdapter() {
            prepareMenuItems();
        }

        @Override // l.AbstractC19902
        public int getItemCount() {
            return this.items.size();
        }

        @Override // l.AbstractC19902
        public int getItemViewType(int i) {
            NavigationMenuItem navigationMenuItem = (NavigationMenuItem) this.items.get(i);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                return ((NavigationMenuTextItem) navigationMenuItem).getMenuItem().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // l.AbstractC19902
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new NormalViewHolder(navigationMenuPresenter.layoutInflater, viewGroup, navigationMenuPresenter.onClickListener);
            }
            if (i == 1) {
                return new SubheaderViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i == 2) {
                return new SeparatorViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new HeaderViewHolder(NavigationMenuPresenter.this.headerLayout);
        }

        @Override // l.AbstractC19902
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) this.items.get(i);
                    viewHolder.itemView.setPadding(NavigationMenuPresenter.this.dividerInsetStart, navigationMenuSeparatorItem.getPaddingTop(), NavigationMenuPresenter.this.dividerInsetEnd, navigationMenuSeparatorItem.getPaddingBottom());
                    return;
                }
                TextView textView = (TextView) viewHolder.itemView;
                textView.setText(((NavigationMenuTextItem) this.items.get(i)).getMenuItem().getTitle());
                C4330.m12997(textView, NavigationMenuPresenter.this.subheaderTextAppearance);
                textView.setPadding(NavigationMenuPresenter.this.subheaderInsetStart, textView.getPaddingTop(), NavigationMenuPresenter.this.subheaderInsetEnd, textView.getPaddingBottom());
                ColorStateList colorStateList = NavigationMenuPresenter.this.subheaderColor;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                setAccessibilityDelegate(textView, i, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.iconTintList);
            navigationMenuItemView.setTextAppearance(NavigationMenuPresenter.this.textAppearance);
            ColorStateList colorStateList2 = NavigationMenuPresenter.this.textColor;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = NavigationMenuPresenter.this.itemBackground;
            Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
            int i2 = C17648.f53953;
            navigationMenuItemView.setBackground(drawableNewDrawable);
            RippleDrawable rippleDrawable = NavigationMenuPresenter.this.itemForeground;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) this.items.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.needsEmptyIcon);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i3 = navigationMenuPresenter.itemHorizontalPadding;
            int i4 = navigationMenuPresenter.itemVerticalPadding;
            navigationMenuItemView.setPadding(i3, i4, i3, i4);
            navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.itemIconPadding);
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            if (navigationMenuPresenter2.hasCustomItemIconSize) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter2.itemIconSize);
            }
            navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.itemMaxLines);
            navigationMenuItemView.initialize(navigationMenuTextItem.getMenuItem(), NavigationMenuPresenter.this.textAppearanceActiveBoldEnabled);
            setAccessibilityDelegate(navigationMenuItemView, i, false);
        }

        private void setAccessibilityDelegate(View view, final int i, final boolean z) {
            C17648.m41309(view, new C16445() { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1
                @Override // l.C16445
                public void onInitializeAccessibilityNodeInfo(View view2, C14369 c14369) {
                    super.onInitializeAccessibilityNodeInfo(view2, c14369);
                    c14369.m34286(C17898.m41877(NavigationMenuAdapter.this.adjustItemPositionForA11yDelegate(i), 1, 1, 1, z, view2.isSelected()));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int adjustItemPositionForA11yDelegate(int i) {
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                if (NavigationMenuPresenter.this.adapter.getItemViewType(i3) == 2 || NavigationMenuPresenter.this.adapter.getItemViewType(i3) == 3) {
                    i2--;
                }
            }
            return i2;
        }

        @Override // l.AbstractC19902
        public void onViewRecycled(ViewHolder viewHolder) {
            if (viewHolder instanceof NormalViewHolder) {
                ((NavigationMenuItemView) viewHolder.itemView).recycle();
            }
        }

        public void update() {
            prepareMenuItems();
            notifyDataSetChanged();
        }

        private void prepareMenuItems() {
            if (this.updateSuspended) {
                return;
            }
            this.updateSuspended = true;
            this.items.clear();
            this.items.add(new NavigationMenuHeaderItem());
            int size = NavigationMenuPresenter.this.menu.getVisibleItems().size();
            int i = -1;
            boolean z = false;
            int size2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C5882 c5882 = (C5882) NavigationMenuPresenter.this.menu.getVisibleItems().get(i2);
                if (c5882.isChecked()) {
                    setCheckedItem(c5882);
                }
                if (c5882.isCheckable()) {
                    c5882.m16460(false);
                }
                if (c5882.hasSubMenu()) {
                    SubMenu subMenu = c5882.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.items.add(new NavigationMenuSeparatorItem(NavigationMenuPresenter.this.paddingSeparator, 0));
                        }
                        this.items.add(new NavigationMenuTextItem(c5882));
                        int size3 = this.items.size();
                        int size4 = subMenu.size();
                        boolean z2 = false;
                        for (int i3 = 0; i3 < size4; i3++) {
                            C5882 c5883 = (C5882) subMenu.getItem(i3);
                            if (c5883.isVisible()) {
                                if (!z2 && c5883.getIcon() != null) {
                                    z2 = true;
                                }
                                if (c5883.isCheckable()) {
                                    c5883.m16460(false);
                                }
                                if (c5882.isChecked()) {
                                    setCheckedItem(c5882);
                                }
                                this.items.add(new NavigationMenuTextItem(c5883));
                            }
                        }
                        if (z2) {
                            appendTransparentIconIfMissing(size3, this.items.size());
                        }
                    }
                } else {
                    int groupId = c5882.getGroupId();
                    if (groupId != i) {
                        size2 = this.items.size();
                        z = c5882.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            ArrayList arrayList = this.items;
                            int i4 = NavigationMenuPresenter.this.paddingSeparator;
                            arrayList.add(new NavigationMenuSeparatorItem(i4, i4));
                        }
                    } else if (!z && c5882.getIcon() != null) {
                        appendTransparentIconIfMissing(size2, this.items.size());
                        z = true;
                    }
                    NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(c5882);
                    navigationMenuTextItem.needsEmptyIcon = z;
                    this.items.add(navigationMenuTextItem);
                    i = groupId;
                }
            }
            this.updateSuspended = false;
        }

        private void appendTransparentIconIfMissing(int i, int i2) {
            while (i < i2) {
                ((NavigationMenuTextItem) this.items.get(i)).needsEmptyIcon = true;
                i++;
            }
        }

        public void setCheckedItem(C5882 c5882) {
            if (this.checkedItem == c5882 || !c5882.isCheckable()) {
                return;
            }
            C5882 c5883 = this.checkedItem;
            if (c5883 != null) {
                c5883.setChecked(false);
            }
            this.checkedItem = c5882;
            c5882.setChecked(true);
        }

        public C5882 getCheckedItem() {
            return this.checkedItem;
        }

        public Bundle createInstanceState() {
            Bundle bundle = new Bundle();
            C5882 c5882 = this.checkedItem;
            if (c5882 != null) {
                bundle.putInt(STATE_CHECKED_ITEM, c5882.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.items.size();
            for (int i = 0; i < size; i++) {
                NavigationMenuItem navigationMenuItem = (NavigationMenuItem) this.items.get(i);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    C5882 menuItem = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                    View actionView = menuItem != null ? menuItem.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItem.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(STATE_ACTION_VIEWS, sparseArray);
            return bundle;
        }

        public void restoreInstanceState(Bundle bundle) {
            C5882 menuItem;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C5882 menuItem2;
            int i = bundle.getInt(STATE_CHECKED_ITEM, 0);
            if (i != 0) {
                this.updateSuspended = true;
                int size = this.items.size();
                for (int i2 = 0; i2 < size; i2++) {
                    NavigationMenuItem navigationMenuItem = (NavigationMenuItem) this.items.get(i2);
                    if ((navigationMenuItem instanceof NavigationMenuTextItem) && (menuItem2 = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem()) != null && menuItem2.getItemId() == i) {
                        setCheckedItem(menuItem2);
                        break;
                    }
                }
                this.updateSuspended = false;
                prepareMenuItems();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(STATE_ACTION_VIEWS);
            if (sparseParcelableArray != null) {
                int size2 = this.items.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    NavigationMenuItem navigationMenuItem2 = (NavigationMenuItem) this.items.get(i3);
                    if ((navigationMenuItem2 instanceof NavigationMenuTextItem) && (menuItem = ((NavigationMenuTextItem) navigationMenuItem2).getMenuItem()) != null && (actionView = menuItem.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItem.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void setUpdateSuspended(boolean z) {
            this.updateSuspended = z;
        }

        public int getRowCount() {
            int i = 0;
            for (int i2 = 0; i2 < NavigationMenuPresenter.this.adapter.getItemCount(); i2++) {
                int itemViewType = NavigationMenuPresenter.this.adapter.getItemViewType(i2);
                if (itemViewType == 0 || itemViewType == 1) {
                    i++;
                }
            }
            return i;
        }
    }

    public class NavigationMenuTextItem implements NavigationMenuItem {
        public final C5882 menuItem;
        public boolean needsEmptyIcon;

        public NavigationMenuTextItem(C5882 c5882) {
            this.menuItem = c5882;
        }

        public C5882 getMenuItem() {
            return this.menuItem;
        }
    }

    public class NavigationMenuSeparatorItem implements NavigationMenuItem {
        public final int paddingBottom;
        public final int paddingTop;

        public NavigationMenuSeparatorItem(int i, int i2) {
            this.paddingTop = i;
            this.paddingBottom = i2;
        }

        public int getPaddingTop() {
            return this.paddingTop;
        }

        public int getPaddingBottom() {
            return this.paddingBottom;
        }
    }

    public class NavigationMenuViewAccessibilityDelegate extends C10311 {
        public NavigationMenuViewAccessibilityDelegate(C13132 c13132) {
            super(c13132);
        }

        @Override // l.C10311, l.C16445
        public void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
            super.onInitializeAccessibilityNodeInfo(view, c14369);
            c14369.m34284(C16486.m38849(NavigationMenuPresenter.this.adapter.getRowCount()));
        }
    }
}
