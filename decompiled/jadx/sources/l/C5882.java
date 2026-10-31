package l;

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
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5OM */
/* JADX INFO: loaded from: classes3.dex */
public final class C5882 implements InterfaceMenuItemC13827 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C3060 f18032;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC17151 f18034;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f18036;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f18037;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ContextMenu.ContextMenuInfo f18039;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public CharSequence f18040;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public MenuItem.OnActionExpandListener f18042;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Drawable f18044;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public CharSequence f18045;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public View f18046;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public CharSequence f18047;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public SubMenuC19703 f18048;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f18050;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f18052;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CharSequence f18053;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public MenuItem.OnMenuItemClickListener f18054;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Intent f18055;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char f18057;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public char f18059;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f18061;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f18038 = 4096;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f18060 = 4096;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f18043 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ColorStateList f18051 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f18035 = null;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f18041 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f18058 = false;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f18033 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f18049 = 16;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f18056 = false;

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

    public C5882(C3060 c3060, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f18032 = c3060;
        this.f18037 = i2;
        this.f18061 = i;
        this.f18052 = i3;
        this.f18050 = i4;
        this.f18047 = charSequence;
        this.f18036 = i5;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m16453() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f18054;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            C3060 c3060 = this.f18032;
            if (!c3060.dispatchMenuItemSelected(c3060, this)) {
                if (this.f18055 != null) {
                    try {
                        c3060.getContext().startActivity(this.f18055);
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                AbstractC17151 abstractC17151 = this.f18034;
                if (abstractC17151 == null || !abstractC17151.mo28366()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f18049 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f18049 |= 16;
        } else {
            this.f18049 &= -17;
        }
        this.f18032.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f18061;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f18037;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f18052;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m16464() {
        return this.f18050;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f18055;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f18055 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f18059;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f18059 == c) {
            return this;
        }
        this.f18059 = Character.toLowerCase(c);
        this.f18032.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f18059 == c && this.f18060 == i) {
            return this;
        }
        this.f18059 = Character.toLowerCase(c);
        this.f18060 = KeyEvent.normalizeMetaState(i);
        this.f18032.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f18060;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f18057;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f18038;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f18057 == c) {
            return this;
        }
        this.f18057 = c;
        this.f18032.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f18057 == c && this.f18038 == i) {
            return this;
        }
        this.f18057 = c;
        this.f18038 = KeyEvent.normalizeMetaState(i);
        this.f18032.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f18057 = c;
        this.f18059 = Character.toLowerCase(c2);
        this.f18032.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f18057 = c;
        this.f18038 = KeyEvent.normalizeMetaState(i);
        this.f18059 = Character.toLowerCase(c2);
        this.f18060 = KeyEvent.normalizeMetaState(i2);
        this.f18032.onItemsChanged(false);
        return this;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final char m16462() {
        return this.f18032.isQwertyMode() ? this.f18059 : this.f18057;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m16458() {
        char cM16462 = m16462();
        if (cM16462 == 0) {
            return "";
        }
        C3060 c3060 = this.f18032;
        Resources resources = c3060.getContext().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(c3060.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(R.string.MT_Protector));
        }
        int i = c3060.isQwertyMode() ? this.f18060 : this.f18038;
        m16446(i, 65536, resources.getString(R.string.MT_Protector), sb);
        m16446(i, 4096, resources.getString(R.string.MT_Protector), sb);
        m16446(i, 2, resources.getString(R.string.MT_Protector), sb);
        m16446(i, 1, resources.getString(R.string.MT_Protector), sb);
        m16446(i, 4, resources.getString(R.string.MT_Protector), sb);
        m16446(i, 8, resources.getString(R.string.MT_Protector), sb);
        if (cM16462 == '\b') {
            sb.append(resources.getString(R.string.MT_Protector));
        } else if (cM16462 == '\n') {
            sb.append(resources.getString(R.string.MT_Protector));
        } else if (cM16462 == ' ') {
            sb.append(resources.getString(R.string.MT_Protector));
        } else {
            sb.append(cM16462);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16446(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f18048;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f18048 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16451(SubMenuC19703 subMenuC19703) {
        this.f18048 = subMenuC19703;
        subMenuC19703.setHeaderTitle(this.f18047);
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f18047;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m16447(InterfaceC23935 interfaceC23935) {
        if (!interfaceC23935.prefersCondensedTitle()) {
            return this.f18047;
        }
        return getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f18047 = charSequence;
        this.f18032.onItemsChanged(false);
        SubMenuC19703 subMenuC19703 = this.f18048;
        if (subMenuC19703 != null) {
            subMenuC19703.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f18032.getContext().getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f18045;
        return charSequence != null ? charSequence : this.f18047;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f18045 = charSequence;
        this.f18032.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f18044;
        if (drawable != null) {
            return m16445(drawable);
        }
        if (this.f18043 == 0) {
            return null;
        }
        Drawable drawableM48345 = C21311.m48345(this.f18032.getContext(), this.f18043);
        this.f18043 = 0;
        this.f18044 = drawableM48345;
        return m16445(drawableM48345);
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f18043 = 0;
        this.f18044 = drawable;
        this.f18033 = true;
        this.f18032.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f18044 = null;
        this.f18043 = i;
        this.f18033 = true;
        this.f18032.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f18051 = colorStateList;
        this.f18041 = true;
        this.f18033 = true;
        this.f18032.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f18051;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f18035 = mode;
        this.f18058 = true;
        this.f18033 = true;
        this.f18032.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f18035;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Drawable m16445(Drawable drawable) {
        if (drawable != null && this.f18033 && (this.f18041 || this.f18058)) {
            drawable = C8184.m21684(drawable).mutate();
            if (this.f18041) {
                C8184.m21676(drawable, this.f18051);
            }
            if (this.f18058) {
                C8184.m21679(drawable, this.f18035);
            }
            this.f18033 = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f18049 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f18049;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f18049 = i2;
        if (i != i2) {
            this.f18032.onItemsChanged(false);
        }
        return this;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m16460(boolean z) {
        this.f18049 = (z ? 4 : 0) | (this.f18049 & (-5));
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m16455() {
        return (this.f18049 & 4) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f18049 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.f18049 & 4) != 0) {
            this.f18032.setExclusiveItemChecked(this);
            return this;
        }
        m16456(z);
        return this;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16456(boolean z) {
        int i = this.f18049;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f18049 = i2;
        if (i != i2) {
            this.f18032.onItemsChanged(false);
        }
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC17151 abstractC17151 = this.f18034;
        if (abstractC17151 == null || !abstractC17151.mo28365()) {
            return (this.f18049 & 8) == 0;
        }
        return (this.f18049 & 8) == 0 && this.f18034.mo28363();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m16463(boolean z) {
        int i = this.f18049;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f18049 = i2;
        return i != i2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (m16463(z)) {
            this.f18032.onItemVisibleChanged(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f18054 = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f18047;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16450(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f18039 = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f18039;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m16466() {
        return (this.f18049 & 32) == 32;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m16454() {
        return (this.f18036 & 1) == 1;
    }

    @Override // l.InterfaceMenuItemC13827
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo16457() {
        return (this.f18036 & 2) == 2;
    }

    @Override // l.InterfaceMenuItemC13827
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo16461() {
        return (mo16457() || m16454()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m16465(boolean z) {
        if (z) {
            this.f18049 |= 32;
        } else {
            this.f18049 &= -33;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m16459() {
        return (this.f18036 & 4) == 4;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f18036 = i;
        this.f18032.onItemActionRequestChanged(this);
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f18046 = view;
        this.f18034 = null;
        if (view != null && view.getId() == -1 && (i = this.f18037) > 0) {
            view.setId(i);
        }
        this.f18032.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        C3060 c3060 = this.f18032;
        Context context = c3060.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f18046 = viewInflate;
        this.f18034 = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f18037) > 0) {
            viewInflate.setId(i2);
        }
        c3060.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f18046;
        if (view != null) {
            return view;
        }
        AbstractC17151 abstractC17151 = this.f18034;
        if (abstractC17151 == null) {
            return null;
        }
        View viewMo28359 = abstractC17151.mo28359(this);
        this.f18046 = viewMo28359;
        return viewMo28359;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // l.InterfaceMenuItemC13827
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC17151 mo16449() {
        return this.f18034;
    }

    @Override // l.InterfaceMenuItemC13827
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceMenuItemC13827 mo16448(AbstractC17151 abstractC17151) {
        this.f18046 = null;
        this.f18034 = abstractC17151;
        this.f18032.onItemsChanged(true);
        AbstractC17151 abstractC17152 = this.f18034;
        if (abstractC17152 != null) {
            abstractC17152.mo28360(new C10116(this));
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
        if (!m16467()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f18042;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f18032.expandItemActionView(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f18036 & 8) == 0) {
            return false;
        }
        if (this.f18046 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f18042;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f18032.collapseItemActionView(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m16467() {
        AbstractC17151 abstractC17151;
        if ((this.f18036 & 8) == 0) {
            return false;
        }
        if (this.f18046 == null && (abstractC17151 = this.f18034) != null) {
            this.f18046 = abstractC17151.mo28359(this);
        }
        return this.f18046 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16452(boolean z) {
        this.f18056 = z;
        this.f18032.onItemsChanged(false);
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f18056;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f18042 = onActionExpandListener;
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final InterfaceMenuItemC13827 setContentDescription(CharSequence charSequence) {
        this.f18053 = charSequence;
        this.f18032.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f18053;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final InterfaceMenuItemC13827 setTooltipText(CharSequence charSequence) {
        this.f18040 = charSequence;
        this.f18032.onItemsChanged(false);
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f18040;
    }
}
