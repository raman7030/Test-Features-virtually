package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿۢ */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes5.dex */
public final class C1698 extends AbstractC1274 {

    /* JADX INFO: renamed from: ֫֫ */
    public int f56069;

    /* JADX INFO: renamed from: ۜ֫ */
    public final C1383 f56070;

    /* JADX INFO: renamed from: ۟ */
    public boolean f56071;

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean f56072;

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f56073;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f56074;

    /* JADX INFO: renamed from: ۨ */
    public final SparseBooleanArray f56075;

    /* JADX INFO: renamed from: ܰ */
    public int f56076;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f56077;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f56078;

    /* JADX INFO: renamed from: ܽ֫ */
    public C1224 f56079;

    /* JADX INFO: renamed from: ܿ֫ */
    public Drawable f56080;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C0928 f56081;

    /* JADX INFO: renamed from: ᩷֫ */
    public RunnableC1994 f56082;

    /* JADX INFO: renamed from: ᩺ */
    public C1154 f56083;

    /* JADX INFO: renamed from: ᩻֫ */
    public C1434 f56084;

    public C1698(Context context) {
        super(context);
        this.f56075 = new SparseBooleanArray();
        this.f56070 = new C1383(this);
    }

    @Override // p067l.AbstractC1274, p067l.InterfaceC1574
    public final void initForMenu(Context context, C0994 c0994) {
        super.initForMenu(context, c0994);
        Resources resources = context.getResources();
        C1858 c1858M49274 = C1858.m49274(context);
        if (!this.f56072) {
            this.f56073 = true;
        }
        this.f56078 = c1858M49274.m49276();
        this.f56069 = c1858M49274.m49278();
        int measuredWidth = this.f56078;
        if (this.f56073) {
            if (this.f56079 == null) {
                C1224 c1224 = new C1224(this, this.f29425);
                this.f56079 = c1224;
                if (this.f56077) {
                    c1224.setImageDrawable(this.f56080);
                    this.f56080 = null;
                    this.f56077 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f56079.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f56079.getMeasuredWidth();
        } else {
            this.f56079 = null;
        }
        this.f56076 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m42800() {
        this.f56069 = C1858.m49274(this.f29430).m49278();
        C0994 c0994 = this.f29422;
        if (c0994 != null) {
            c0994.onItemsChanged(true);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m42802() {
        this.f56073 = true;
        this.f56072 = true;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m42798() {
        this.f56071 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42794(Drawable drawable) {
        C1224 c1224 = this.f56079;
        if (c1224 != null) {
            c1224.setImageDrawable(drawable);
        } else {
            this.f56077 = true;
            this.f56080 = drawable;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final Drawable m42797() {
        C1224 c1224 = this.f56079;
        if (c1224 != null) {
            return c1224.getDrawable();
        }
        if (this.f56077) {
            return this.f56080;
        }
        return null;
    }

    @Override // p067l.AbstractC1274
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1189 mo24457(ViewGroup viewGroup) {
        InterfaceC1189 interfaceC1189 = this.f29426;
        InterfaceC1189 interfaceC1189Mo24457 = super.mo24457(viewGroup);
        if (interfaceC1189 != interfaceC1189Mo24457) {
            ((C1278) interfaceC1189Mo24457).m24642(this);
        }
        return interfaceC1189Mo24457;
    }

    @Override // p067l.AbstractC1274
    /* JADX INFO: renamed from: ֫ */
    public final View mo24456(C1134 c1134, View view, ViewGroup viewGroup) {
        View actionView = c1134.getActionView();
        if (actionView == null || c1134.m18393()) {
            actionView = super.mo24456(c1134, view, viewGroup);
        }
        actionView.setVisibility(c1134.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((C1278) viewGroup).getClass();
        if (!(layoutParams instanceof C1173)) {
            actionView.setLayoutParams(C1278.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // p067l.AbstractC1274
    /* JADX INFO: renamed from: ֫ */
    public final void mo24460(C1134 c1134, InterfaceC2029 interfaceC2029) {
        interfaceC2029.initialize(c1134, 0);
        ViewOnClickListenerC1309 viewOnClickListenerC1309 = (ViewOnClickListenerC1309) interfaceC2029;
        viewOnClickListenerC1309.m26262((C1278) this.f29426);
        if (this.f56084 == null) {
            this.f56084 = new C1434(this);
        }
        viewOnClickListenerC1309.m26263(this.f56084);
    }

    @Override // p067l.AbstractC1274
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo24462(C1134 c1134) {
        return c1134.m18392();
    }

    @Override // p067l.AbstractC1274, p067l.InterfaceC1574
    public final void updateMenuView(boolean z) {
        super.updateMenuView(z);
        ((View) this.f29426).requestLayout();
        C0994 c0994 = this.f29422;
        boolean z2 = false;
        if (c0994 != null) {
            ArrayList actionItems = c0994.getActionItems();
            int size = actionItems.size();
            for (int i = 0; i < size; i++) {
                ((C1134) actionItems.get(i)).getClass();
            }
        }
        C0994 c0995 = this.f29422;
        ArrayList nonActionItems = c0995 != null ? c0995.getNonActionItems() : null;
        if (this.f56073 && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z2 = !((C1134) nonActionItems.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f56079 == null) {
                this.f56079 = new C1224(this, this.f29425);
            }
            ViewGroup viewGroup = (ViewGroup) this.f56079.getParent();
            if (viewGroup != this.f29426) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f56079);
                }
                C1278 c1278 = (C1278) this.f29426;
                C1224 c1224 = this.f56079;
                c1278.getClass();
                C1173 c1173GenerateDefaultLayoutParams = C1278.generateDefaultLayoutParams();
                c1173GenerateDefaultLayoutParams.f23605 = true;
                c1278.addView(c1224, c1173GenerateDefaultLayoutParams);
            }
        } else {
            C1224 c1225 = this.f56079;
            if (c1225 != null) {
                Object parent = c1225.getParent();
                Object obj = this.f29426;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f56079);
                }
            }
        }
        ((C1278) this.f29426).m24644(this.f56073);
    }

    @Override // p067l.AbstractC1274
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo24461(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f56079) {
            return false;
        }
        viewGroup.removeViewAt(i);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC1274, p067l.InterfaceC1574
    public final boolean onSubMenuSelected(SubMenuC1819 subMenuC1819) {
        boolean z = false;
        if (subMenuC1819.hasVisibleItems()) {
            SubMenuC1819 subMenuC18110 = subMenuC1819;
            while (subMenuC18110.getParentMenu() != this.f29422) {
                subMenuC18110 = (SubMenuC1819) subMenuC18110.getParentMenu();
            }
            MenuItem item = subMenuC18110.getItem();
            ViewGroup viewGroup = (ViewGroup) this.f29426;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof InterfaceC2029) && ((InterfaceC2029) childAt).getItemData() == item) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.f56074 = subMenuC1819.getItem().getItemId();
                int size = subMenuC1819.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItem item2 = subMenuC1819.getItem(i2);
                    if (item2.isVisible() && item2.getIcon() != null) {
                        z = true;
                        break;
                    }
                }
                C1154 c1154 = new C1154(this, this.f29430, subMenuC1819, view);
                this.f56083 = c1154;
                c1154.m44894(z);
                if (!this.f56083.m44900()) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                super.onSubMenuSelected(subMenuC1819);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m42796() {
        C0994 c0994;
        if (!this.f56073 || m42801() || (c0994 = this.f29422) == null || this.f29426 == null || this.f56082 != null || c0994.getNonActionItems().isEmpty()) {
            return false;
        }
        RunnableC1994 runnableC1994 = new RunnableC1994(this, new C0928(this, this.f29430, this.f29422, this.f56079));
        this.f56082 = runnableC1994;
        ((View) this.f29426).post(runnableC1994);
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m42799() {
        Object obj;
        RunnableC1994 runnableC1994 = this.f56082;
        if (runnableC1994 != null && (obj = this.f29426) != null) {
            ((View) obj).removeCallbacks(runnableC1994);
            this.f56082 = null;
            return true;
        }
        C0928 c0928 = this.f56081;
        if (c0928 == null) {
            return false;
        }
        c0928.m44889();
        return true;
    }

    @Override // p067l.AbstractC1274, p067l.InterfaceC1574
    public final void onCloseMenu(C0994 c0994, boolean z) {
        m42799();
        C1154 c1154 = this.f56083;
        if (c1154 != null) {
            c1154.m44889();
        }
        super.onCloseMenu(c0994, z);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m42801() {
        C0928 c0928 = this.f56081;
        return c0928 != null && c0928.m44899();
    }

    @Override // p067l.InterfaceC1574
    public final boolean flagActionItems() {
        int size;
        ArrayList visibleItems;
        boolean z;
        C0994 c0994 = this.f29422;
        View view = null;
        if (c0994 != null) {
            visibleItems = c0994.getVisibleItems();
            size = visibleItems.size();
        } else {
            size = 0;
            visibleItems = null;
        }
        int i = this.f56069;
        int i2 = this.f56076;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f29426;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            C1134 c1134 = (C1134) visibleItems.get(i3);
            if (c1134.mo18383()) {
                i4++;
            } else if (c1134.m18380()) {
                i5++;
            } else {
                z2 = true;
            }
            if (this.f56071 && c1134.isActionViewExpanded()) {
                i = 0;
            }
            i3++;
        }
        if (this.f56073 && (z2 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        SparseBooleanArray sparseBooleanArray = this.f56075;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            C1134 c1135 = (C1134) visibleItems.get(i7);
            if (c1135.mo18383()) {
                View viewMo24456 = mo24456(c1135, view, viewGroup);
                viewMo24456.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewMo24456.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int groupId = c1135.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, z);
                }
                c1135.m18391(z);
            } else if (c1135.m18380()) {
                int groupId2 = c1135.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i6 > 0 || z3) && i2 > 0;
                if (z4) {
                    View viewMo24457 = mo24456(c1135, view, viewGroup);
                    viewMo24457.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewMo24457.getMeasuredWidth();
                    i2 -= measuredWidth2;
                    if (i8 == 0) {
                        i8 = measuredWidth2;
                    }
                    z4 &= i2 + i8 > 0;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, z);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i9 = 0; i9 < i7; i9++) {
                        C1134 c1136 = (C1134) visibleItems.get(i9);
                        if (c1136.getGroupId() == groupId2) {
                            if (c1136.m18392()) {
                                i6++;
                            }
                            c1136.m18391(false);
                        }
                    }
                }
                if (z4) {
                    i6--;
                }
                c1135.m18391(z4);
            } else {
                c1135.m18391(false);
            }
            i7++;
            view = null;
            z = true;
        }
        return true;
    }

    @Override // p067l.InterfaceC1574
    public final Parcelable onSaveInstanceState() {
        C1733 c1733 = new C1733();
        c1733.f59187 = this.f56074;
        return c1733;
    }

    @Override // p067l.InterfaceC1574
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof C1733) && (i = ((C1733) parcelable).f59187) > 0 && (menuItemFindItem = this.f29422.findItem(i)) != null) {
            onSubMenuSelected((SubMenuC1819) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42795(C1278 c1278) {
        this.f29426 = c1278;
        c1278.initialize(this.f29422);
    }
}
