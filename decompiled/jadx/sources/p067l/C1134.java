package p067l;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛۜ */
/* JADX INFO: compiled from: L5OM */
/* JADX INFO: loaded from: classes3.dex */
public final class C1134 implements InterfaceMenuItemC1528 {

    /* JADX INFO: renamed from: ֡ */
    public C0994 f20887;

    /* JADX INFO: renamed from: ֫ */
    public AbstractC1693 f20889;

    /* JADX INFO: renamed from: ۗ */
    public int f20891;

    /* JADX INFO: renamed from: ۘ */
    public final int f20892;

    /* JADX INFO: renamed from: ۚ */
    public ContextMenu.ContextMenuInfo f20894;

    /* JADX INFO: renamed from: ۛ */
    public CharSequence f20895;

    /* JADX INFO: renamed from: ۠ */
    public MenuItem.OnActionExpandListener f20897;

    /* JADX INFO: renamed from: ۢ */
    public Drawable f20899;

    /* JADX INFO: renamed from: ۤ */
    public CharSequence f20900;

    /* JADX INFO: renamed from: ۧ */
    public View f20901;

    /* JADX INFO: renamed from: ۫ */
    public CharSequence f20902;

    /* JADX INFO: renamed from: ۬ */
    public SubMenuC1819 f20903;

    /* JADX INFO: renamed from: ܶ */
    public final int f20905;

    /* JADX INFO: renamed from: ܽ */
    public final int f20907;

    /* JADX INFO: renamed from: ܿ */
    public CharSequence f20908;

    /* JADX INFO: renamed from: ᩳ */
    public MenuItem.OnMenuItemClickListener f20909;

    /* JADX INFO: renamed from: ᩴ */
    public Intent f20910;

    /* JADX INFO: renamed from: ᩶ */
    public char f20912;

    /* JADX INFO: renamed from: ᩸ */
    public char f20914;

    /* JADX INFO: renamed from: ᩻ */
    public final int f20916;

    /* JADX INFO: renamed from: ۙ */
    public int f20893 = 4096;

    /* JADX INFO: renamed from: ᩹ */
    public int f20915 = 4096;

    /* JADX INFO: renamed from: ۡ */
    public int f20898 = 0;

    /* JADX INFO: renamed from: ܺ */
    public ColorStateList f20906 = null;

    /* JADX INFO: renamed from: ۖ */
    public PorterDuff.Mode f20890 = null;

    /* JADX INFO: renamed from: ۜ */
    public boolean f20896 = false;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f20913 = false;

    /* JADX INFO: renamed from: ֨ */
    public boolean f20888 = false;

    /* JADX INFO: renamed from: ܳ */
    public int f20904 = 16;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f20911 = false;

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    public C1134(C0994 c0994, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f20887 = c0994;
        this.f20892 = i2;
        this.f20916 = i;
        this.f20907 = i3;
        this.f20905 = i4;
        this.f20902 = charSequence;
        this.f20891 = i5;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m18379() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f20909;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            C0994 c0994 = this.f20887;
            if (!c0994.dispatchMenuItemSelected(c0994, this)) {
                if (this.f20910 != null) {
                    try {
                        c0994.getContext().startActivity(this.f20910);
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                AbstractC1693 abstractC1693 = this.f20889;
                if (abstractC1693 == null || !abstractC1693.mo30412()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f20904 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f20904 |= 16;
        } else {
            this.f20904 &= -17;
        }
        this.f20887.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f20916;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f20892;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f20907;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m18390() {
        return this.f20905;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f20910;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f20910 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f20914;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f20914 == c) {
            return this;
        }
        this.f20914 = Character.toLowerCase(c);
        this.f20887.onItemsChanged(false);
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f20914 == c && this.f20915 == i) {
            return this;
        }
        this.f20914 = Character.toLowerCase(c);
        this.f20915 = KeyEvent.normalizeMetaState(i);
        this.f20887.onItemsChanged(false);
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f20915;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f20912;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f20893;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f20912 == c) {
            return this;
        }
        this.f20912 = c;
        this.f20887.onItemsChanged(false);
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f20912 == c && this.f20893 == i) {
            return this;
        }
        this.f20912 = c;
        this.f20893 = KeyEvent.normalizeMetaState(i);
        this.f20887.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f20912 = c;
        this.f20914 = Character.toLowerCase(c2);
        this.f20887.onItemsChanged(false);
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f20912 = c;
        this.f20893 = KeyEvent.normalizeMetaState(i);
        this.f20914 = Character.toLowerCase(c2);
        this.f20915 = KeyEvent.normalizeMetaState(i2);
        this.f20887.onItemsChanged(false);
        return this;
    }

    /* JADX INFO: renamed from: ܿ */
    public final char m18388() {
        return this.f20887.isQwertyMode() ? this.f20914 : this.f20912;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m18384() {
        char cM18388 = m18388();
        if (cM18388 == 0) {
            return "";
        }
        C0994 c0994 = this.f20887;
        Resources resources = c0994.getContext().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(c0994.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(R.string.MT_Protector));
        }
        int i = c0994.isQwertyMode() ? this.f20915 : this.f20893;
        m18372(i, 65536, resources.getString(R.string.MT_Protector), sb);
        m18372(i, 4096, resources.getString(R.string.MT_Protector), sb);
        m18372(i, 2, resources.getString(R.string.MT_Protector), sb);
        m18372(i, 1, resources.getString(R.string.MT_Protector), sb);
        m18372(i, 4, resources.getString(R.string.MT_Protector), sb);
        m18372(i, 8, resources.getString(R.string.MT_Protector), sb);
        if (cM18388 == '\b') {
            sb.append(resources.getString(R.string.MT_Protector));
        } else if (cM18388 == '\n') {
            sb.append(resources.getString(R.string.MT_Protector));
        } else if (cM18388 == ' ') {
            sb.append(resources.getString(R.string.MT_Protector));
        } else {
            sb.append(cM18388);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18372(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f20903;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f20903 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18377(SubMenuC1819 subMenuC1819) {
        this.f20903 = subMenuC1819;
        subMenuC1819.setHeaderTitle(this.f20902);
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f20902;
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m18373(InterfaceC2029 interfaceC2029) {
        if (!interfaceC2029.prefersCondensedTitle()) {
            return this.f20902;
        }
        return getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f20902 = charSequence;
        this.f20887.onItemsChanged(false);
        SubMenuC1819 subMenuC1819 = this.f20903;
        if (subMenuC1819 != null) {
            subMenuC1819.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f20887.getContext().getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f20900;
        return charSequence != null ? charSequence : this.f20902;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f20900 = charSequence;
        this.f20887.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f20899;
        if (drawable != null) {
            return m18371(drawable);
        }
        if (this.f20898 == 0) {
            return null;
        }
        Drawable drawableM50680 = C22622.m50680(this.f20887.getContext(), this.f20898);
        this.f20898 = 0;
        this.f20899 = drawableM50680;
        return m18371(drawableM50680);
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f20898 = 0;
        this.f20899 = drawable;
        this.f20888 = true;
        this.f20887.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f20899 = null;
        this.f20898 = i;
        this.f20888 = true;
        this.f20887.onItemsChanged(false);
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f20906 = colorStateList;
        this.f20896 = true;
        this.f20888 = true;
        this.f20887.onItemsChanged(false);
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f20906;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f20890 = mode;
        this.f20913 = true;
        this.f20888 = true;
        this.f20887.onItemsChanged(false);
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f20890;
    }

    /* JADX INFO: renamed from: ֫ */
    private Drawable m18371(Drawable drawable) {
        if (drawable != null && this.f20888 && (this.f20896 || this.f20913)) {
            drawable = C1248.m23653(drawable).mutate();
            if (this.f20896) {
                C1248.m23645(drawable, this.f20906);
            }
            if (this.f20913) {
                C1248.m23648(drawable, this.f20890);
            }
            this.f20888 = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f20904 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f20904;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f20904 = i2;
        if (i != i2) {
            this.f20887.onItemsChanged(false);
        }
        return this;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m18386(boolean z) {
        this.f20904 = (z ? 4 : 0) | (this.f20904 & (-5));
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m18381() {
        return (this.f20904 & 4) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f20904 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.f20904 & 4) != 0) {
            this.f20887.setExclusiveItemChecked(this);
            return this;
        }
        m18382(z);
        return this;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18382(boolean z) {
        int i = this.f20904;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f20904 = i2;
        if (i != i2) {
            this.f20887.onItemsChanged(false);
        }
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC1693 abstractC1693 = this.f20889;
        if (abstractC1693 == null || !abstractC1693.mo30411()) {
            return (this.f20904 & 8) == 0;
        }
        return (this.f20904 & 8) == 0 && this.f20889.mo30409();
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m18389(boolean z) {
        int i = this.f20904;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f20904 = i2;
        return i != i2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (m18389(z)) {
            this.f20887.onItemVisibleChanged(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f20909 = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f20902;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18376(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f20894 = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f20894;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m18392() {
        return (this.f20904 & 32) == 32;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m18380() {
        return (this.f20891 & 1) == 1;
    }

    @Override // p067l.InterfaceMenuItemC1528
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo18383() {
        return (this.f20891 & 2) == 2;
    }

    @Override // p067l.InterfaceMenuItemC1528
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo18387() {
        return (mo18383() || m18380()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m18391(boolean z) {
        if (z) {
            this.f20904 |= 32;
        } else {
            this.f20904 &= -33;
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m18385() {
        return (this.f20891 & 4) == 4;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f20891 = i;
        this.f20887.onItemActionRequestChanged(this);
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f20901 = view;
        this.f20889 = null;
        if (view != null && view.getId() == -1 && (i = this.f20892) > 0) {
            view.setId(i);
        }
        this.f20887.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        C0994 c0994 = this.f20887;
        Context context = c0994.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f20901 = viewInflate;
        this.f20889 = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f20892) > 0) {
            viewInflate.setId(i2);
        }
        c0994.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f20901;
        if (view != null) {
            return view;
        }
        AbstractC1693 abstractC1693 = this.f20889;
        if (abstractC1693 == null) {
            return null;
        }
        View viewMo30405 = abstractC1693.mo30405(this);
        this.f20901 = viewMo30405;
        return viewMo30405;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p067l.InterfaceMenuItemC1528
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1693 mo18375() {
        return this.f20889;
    }

    @Override // p067l.InterfaceMenuItemC1528
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceMenuItemC1528 mo18374(AbstractC1693 abstractC1693) {
        this.f20901 = null;
        this.f20889 = abstractC1693;
        this.f20887.onItemsChanged(true);
        AbstractC1693 abstractC1694 = this.f20889;
        if (abstractC1694 != null) {
            abstractC1694.mo30406(new C1344(this));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m18393()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f20897;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f20887.expandItemActionView(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f20891 & 8) == 0) {
            return false;
        }
        if (this.f20901 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f20897;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f20887.collapseItemActionView(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m18393() {
        AbstractC1693 abstractC1693;
        if ((this.f20891 & 8) == 0) {
            return false;
        }
        if (this.f20901 == null && (abstractC1693 = this.f20889) != null) {
            this.f20901 = abstractC1693.mo30405(this);
        }
        return this.f20901 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18378(boolean z) {
        this.f20911 = z;
        this.f20887.onItemsChanged(false);
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f20911;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f20897 = onActionExpandListener;
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final InterfaceMenuItemC1528 setContentDescription(CharSequence charSequence) {
        this.f20908 = charSequence;
        this.f20887.onItemsChanged(false);
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f20908;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final InterfaceMenuItemC1528 setTooltipText(CharSequence charSequence) {
        this.f20895 = charSequence;
        this.f20887.onItemsChanged(false);
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f20895;
    }
}
