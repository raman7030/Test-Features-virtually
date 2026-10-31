package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Q6 */
/* JADX INFO: loaded from: classes2.dex */
public class C3060 implements InterfaceMenuC23000 {
    public static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    public static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    public static final String PRESENTER_KEY = "android:menu:presenters";
    public static final String TAG = "MenuBuilder";
    public static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    public InterfaceC19994 mCallback;
    public final Context mContext;
    public ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    public C5882 mExpandedItem;
    public Drawable mHeaderIcon;
    public CharSequence mHeaderTitle;
    public View mHeaderView;
    public boolean mOverrideVisibleItems;
    public boolean mQwertyMode;
    public final Resources mResources;
    public boolean mShortcutsVisible;
    public int mDefaultShowAsAction = 0;
    public boolean mPreventDispatchingItemsChanged = false;
    public boolean mItemsChangedWhileDispatchPrevented = false;
    public boolean mStructureChangedWhileDispatchPrevented = false;
    public boolean mOptionalIconsVisible = false;
    public boolean mIsClosing = false;
    public ArrayList mTempShortcutItemList = new ArrayList();
    public CopyOnWriteArrayList mPresenters = new CopyOnWriteArrayList();
    public boolean mGroupDividerEnabled = false;
    public ArrayList mItems = new ArrayList();
    public ArrayList mVisibleItems = new ArrayList();
    public boolean mIsVisibleItemsStale = true;
    public ArrayList mActionItems = new ArrayList();
    public ArrayList mNonActionItems = new ArrayList();
    public boolean mIsActionItemsStale = true;

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public C3060 getRootMenu() {
        return this;
    }

    public C3060(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        m9380(true);
    }

    public C3060 setDefaultShowAsAction(int i) {
        this.mDefaultShowAsAction = i;
        return this;
    }

    public void addMenuPresenter(InterfaceC14762 interfaceC14762) {
        addMenuPresenter(interfaceC14762, this.mContext);
    }

    public void addMenuPresenter(InterfaceC14762 interfaceC14762, Context context) {
        this.mPresenters.add(new WeakReference(interfaceC14762));
        interfaceC14762.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    public void removeMenuPresenter(InterfaceC14762 interfaceC14762) {
        for (WeakReference weakReference : this.mPresenters) {
            InterfaceC14762 interfaceC14763 = (InterfaceC14762) weakReference.get();
            if (interfaceC14763 == null || interfaceC14763 == interfaceC14762) {
                this.mPresenters.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9377(boolean z) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        for (WeakReference weakReference : this.mPresenters) {
            InterfaceC14762 interfaceC14762 = (InterfaceC14762) weakReference.get();
            if (interfaceC14762 == null) {
                this.mPresenters.remove(weakReference);
            } else {
                interfaceC14762.updateMenuView(z);
            }
        }
        startDispatchingItemsChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m9378(SubMenuC19703 subMenuC19703, InterfaceC14762 interfaceC14762) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean zOnSubMenuSelected = interfaceC14762 != null ? interfaceC14762.onSubMenuSelected(subMenuC19703) : false;
        for (WeakReference weakReference : this.mPresenters) {
            InterfaceC14762 interfaceC14763 = (InterfaceC14762) weakReference.get();
            if (interfaceC14763 == null) {
                this.mPresenters.remove(weakReference);
            } else if (!zOnSubMenuSelected) {
                zOnSubMenuSelected = interfaceC14763.onSubMenuSelected(subMenuC19703);
            }
        }
        return zOnSubMenuSelected;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m9379(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : this.mPresenters) {
            InterfaceC14762 interfaceC14762 = (InterfaceC14762) weakReference.get();
            if (interfaceC14762 == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id = interfaceC14762.getId();
                if (id > 0 && (parcelableOnSaveInstanceState = interfaceC14762.onSaveInstanceState()) != null) {
                    sparseArray.put(id, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9376(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : this.mPresenters) {
            InterfaceC14762 interfaceC14762 = (InterfaceC14762) weakReference.get();
            if (interfaceC14762 == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id = interfaceC14762.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    interfaceC14762.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    public void savePresenterStates(Bundle bundle) {
        m9379(bundle);
    }

    public void restorePresenterStates(Bundle bundle) {
        m9376(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC19703) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC19703) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i2 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void setCallback(InterfaceC19994 interfaceC19994) {
        this.mCallback = interfaceC19994;
    }

    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        int iM9371 = m9371(i3);
        C5882 c5882M9373 = m9373(i, i2, i3, iM9371, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            c5882M9373.m16450(contextMenuInfo);
        }
        ArrayList arrayList = this.mItems;
        arrayList.add(m9372(arrayList, iM9371), c5882M9373);
        onItemsChanged(true);
        return c5882M9373;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5882 m9373(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C5882(this, i, i2, i3, i4, charSequence, i5);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return addInternal(0, 0, 0, this.mResources.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return addInternal(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return addInternal(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C5882 c5882 = (C5882) addInternal(i, i2, i3, charSequence);
        SubMenuC19703 subMenuC19703 = new SubMenuC19703(this.mContext, this, c5882);
        c5882.m16451(subMenuC19703);
        return subMenuC19703;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // l.InterfaceMenuC23000, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mGroupDividerEnabled = z;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m9375(findItemIndex(i), true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int iFindGroupIndex = findGroupIndex(i);
        if (iFindGroupIndex >= 0) {
            int size = this.mItems.size() - iFindGroupIndex;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((C5882) this.mItems.get(iFindGroupIndex)).getGroupId() != i) {
                    break;
                }
                m9375(iFindGroupIndex, false);
                i2 = i3;
            }
            onItemsChanged(true);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9375(int i, boolean z) {
        if (i < 0 || i >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i);
        if (z) {
            onItemsChanged(true);
        }
    }

    public void removeItemAt(int i) {
        m9375(i, true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    @Override // android.view.Menu
    public void clear() {
        C5882 c5882 = this.mExpandedItem;
        if (c5882 != null) {
            collapseItemActionView(c5882);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i = 0; i < size; i++) {
            C5882 c5882 = (C5882) this.mItems.get(i);
            if (c5882.getGroupId() == groupId && c5882.m16455() && c5882.isCheckable()) {
                c5882.m16456(c5882 == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5882 c5882 = (C5882) this.mItems.get(i2);
            if (c5882.getGroupId() == i) {
                c5882.m16460(z2);
                c5882.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.mItems.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C5882 c5882 = (C5882) this.mItems.get(i2);
            if (c5882.getGroupId() == i && c5882.m16463(z)) {
                z2 = true;
            }
        }
        if (z2) {
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5882 c5882 = (C5882) this.mItems.get(i2);
            if (c5882.getGroupId() == i) {
                c5882.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C5882) this.mItems.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C5882 c5882 = (C5882) this.mItems.get(i2);
            if (c5882.getItemId() == i) {
                return c5882;
            }
            if (c5882.hasSubMenu() && (menuItemFindItem = c5882.getSubMenu().findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C5882) this.mItems.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public int findGroupIndex(int i) {
        return findGroupIndex(i, 0);
    }

    public int findGroupIndex(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((C5882) this.mItems.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return (MenuItem) this.mItems.get(i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mQwertyMode = z;
        onItemsChanged(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m9371(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    public void setShortcutsVisible(boolean z) {
        if (this.mShortcutsVisible == z) {
            return;
        }
        m9380(z);
        onItemsChanged(false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m9380(boolean z) {
        boolean z2;
        if (z) {
            z2 = this.mResources.getConfiguration().keyboard != 1 && C21177.m48126(ViewConfiguration.get(this.mContext), this.mContext);
        }
        this.mShortcutsVisible = z2;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean dispatchMenuItemSelected(C3060 c3060, MenuItem menuItem) {
        InterfaceC19994 interfaceC19994 = this.mCallback;
        return interfaceC19994 != null && interfaceC19994.onMenuItemSelected(c3060, menuItem);
    }

    public void changeMenuMode() {
        InterfaceC19994 interfaceC19994 = this.mCallback;
        if (interfaceC19994 != null) {
            interfaceC19994.onMenuModeChange(this);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m9372(ArrayList arrayList, int i) {
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return 0;
            }
        } while (((C5882) arrayList.get(size)).m16464() > i);
        return size + 1;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C5882 c5882FindItemWithShortcutForKey = findItemWithShortcutForKey(i, keyEvent);
        boolean zPerformItemAction = c5882FindItemWithShortcutForKey != null ? performItemAction(c5882FindItemWithShortcutForKey, i2) : false;
        if ((i2 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    public void findItemsWithShortcutForKey(List list, int i, KeyEvent keyEvent) {
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.mItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                C5882 c5882 = (C5882) this.mItems.get(i2);
                if (c5882.hasSubMenu()) {
                    ((C3060) c5882.getSubMenu()).findItemsWithShortcutForKey(list, i, keyEvent);
                }
                char alphabeticShortcut = zIsQwertyMode ? c5882.getAlphabeticShortcut() : c5882.getNumericShortcut();
                if ((modifiers & 69647) == ((zIsQwertyMode ? c5882.getAlphabeticModifiers() : c5882.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zIsQwertyMode && alphabeticShortcut == '\b' && i == 67)) && c5882.isEnabled()) {
                        list.add(c5882);
                    }
                }
            }
        }
    }

    public C5882 findItemWithShortcutForKey(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C5882) arrayList.get(0);
        }
        boolean zIsQwertyMode = isQwertyMode();
        for (int i2 = 0; i2 < size; i2++) {
            C5882 c5882 = (C5882) arrayList.get(i2);
            if (zIsQwertyMode) {
                numericShortcut = c5882.getAlphabeticShortcut();
            } else {
                numericShortcut = c5882.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (zIsQwertyMode && numericShortcut == '\b' && i == 67))) {
                return c5882;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return performItemAction(findItem(i), i2);
    }

    public boolean performItemAction(MenuItem menuItem, int i) {
        return performItemAction(menuItem, null, i);
    }

    public boolean performItemAction(MenuItem menuItem, InterfaceC14762 interfaceC14762, int i) {
        C5882 c5882 = (C5882) menuItem;
        if (c5882 == null || !c5882.isEnabled()) {
            return false;
        }
        boolean zM16453 = c5882.m16453();
        AbstractC17151 abstractC17151Mo16449 = c5882.mo16449();
        boolean z = abstractC17151Mo16449 != null && abstractC17151Mo16449.mo28362();
        if (c5882.m16467()) {
            boolean zExpandActionView = c5882.expandActionView() | zM16453;
            if (zExpandActionView) {
                close(true);
            }
            return zExpandActionView;
        }
        if (!c5882.hasSubMenu() && !z) {
            if ((i & 1) == 0) {
                close(true);
            }
            return zM16453;
        }
        if ((i & 4) == 0) {
            close(false);
        }
        if (!c5882.hasSubMenu()) {
            c5882.m16451(new SubMenuC19703(getContext(), this, c5882));
        }
        SubMenuC19703 subMenuC19703 = (SubMenuC19703) c5882.getSubMenu();
        if (z) {
            abstractC17151Mo16449.mo28361(subMenuC19703);
        }
        boolean zM9378 = m9378(subMenuC19703, interfaceC14762) | zM16453;
        if (!zM9378) {
            close(true);
        }
        return zM9378;
    }

    public final void close(boolean z) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        for (WeakReference weakReference : this.mPresenters) {
            InterfaceC14762 interfaceC14762 = (InterfaceC14762) weakReference.get();
            if (interfaceC14762 == null) {
                this.mPresenters.remove(weakReference);
            } else {
                interfaceC14762.onCloseMenu(this, z);
            }
        }
        this.mIsClosing = false;
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public void onItemsChanged(boolean z) {
        if (!this.mPreventDispatchingItemsChanged) {
            if (z) {
                this.mIsVisibleItemsStale = true;
                this.mIsActionItemsStale = true;
            }
            m9377(z);
            return;
        }
        this.mItemsChangedWhileDispatchPrevented = true;
        if (z) {
            this.mStructureChangedWhileDispatchPrevented = true;
        }
    }

    public boolean isDispatchingItemsChanged() {
        return !this.mPreventDispatchingItemsChanged;
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void onItemVisibleChanged(C5882 c5882) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemActionRequestChanged(C5882 c5882) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public ArrayList getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i = 0; i < size; i++) {
            C5882 c5882 = (C5882) this.mItems.get(i);
            if (c5882.isVisible()) {
                this.mVisibleItems.add(c5882);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    public void flagActionItems() {
        ArrayList visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            boolean zFlagActionItems = false;
            for (WeakReference weakReference : this.mPresenters) {
                InterfaceC14762 interfaceC14762 = (InterfaceC14762) weakReference.get();
                if (interfaceC14762 == null) {
                    this.mPresenters.remove(weakReference);
                } else {
                    zFlagActionItems |= interfaceC14762.flagActionItems();
                }
            }
            if (zFlagActionItems) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i = 0; i < size; i++) {
                    C5882 c5882 = (C5882) visibleItems.get(i);
                    if (c5882.m16466()) {
                        this.mActionItems.add(c5882);
                    } else {
                        this.mNonActionItems.add(c5882);
                    }
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public ArrayList getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9374(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i > 0) {
                this.mHeaderTitle = resources.getText(i);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i2 > 0) {
                this.mHeaderIcon = C0881.m3234(getContext(), i2);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    public C3060 setHeaderTitleInt(CharSequence charSequence) {
        m9374(0, charSequence, 0, null, null);
        return this;
    }

    public C3060 setHeaderTitleInt(int i) {
        m9374(i, null, 0, null, null);
        return this;
    }

    public C3060 setHeaderIconInt(Drawable drawable) {
        m9374(0, null, 0, drawable, null);
        return this;
    }

    public C3060 setHeaderIconInt(int i) {
        m9374(0, null, i, null, null);
        return this;
    }

    public C3060 setHeaderViewInt(View view) {
        m9374(0, null, 0, null, view);
        return this;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public void setOptionalIconsVisible(boolean z) {
        this.mOptionalIconsVisible = z;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public boolean expandItemActionView(C5882 c5882) {
        boolean zExpandItemActionView = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        for (WeakReference weakReference : this.mPresenters) {
            InterfaceC14762 interfaceC14762 = (InterfaceC14762) weakReference.get();
            if (interfaceC14762 == null) {
                this.mPresenters.remove(weakReference);
            } else {
                zExpandItemActionView = interfaceC14762.expandItemActionView(this, c5882);
                if (zExpandItemActionView) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.mExpandedItem = c5882;
        }
        return zExpandItemActionView;
    }

    public boolean collapseItemActionView(C5882 c5882) {
        boolean zCollapseItemActionView = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == c5882) {
            stopDispatchingItemsChanged();
            for (WeakReference weakReference : this.mPresenters) {
                InterfaceC14762 interfaceC14762 = (InterfaceC14762) weakReference.get();
                if (interfaceC14762 == null) {
                    this.mPresenters.remove(weakReference);
                } else {
                    zCollapseItemActionView = interfaceC14762.collapseItemActionView(this, c5882);
                    if (zCollapseItemActionView) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.mExpandedItem = null;
            }
        }
        return zCollapseItemActionView;
    }

    public C5882 getExpandedItem() {
        return this.mExpandedItem;
    }

    public void setOverrideVisibleItems(boolean z) {
        this.mOverrideVisibleItems = z;
    }
}
