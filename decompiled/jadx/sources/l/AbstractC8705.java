package l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 852L */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8705 implements InterfaceC14762 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C3060 f26497;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public LayoutInflater f26499;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Context f26500;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC7002 f26501;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26503;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC17585 f26504;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Context f26505;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f26502 = R.layout.MT_Protector;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f26498 = R.layout.MT_Protector;

    @Override // l.InterfaceC14762
    public final boolean collapseItemActionView(C3060 c3060, C5882 c5882) {
        return false;
    }

    @Override // l.InterfaceC14762
    public final boolean expandItemActionView(C3060 c3060, C5882 c5882) {
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo22491(C5882 c5882, InterfaceC23935 interfaceC23935);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo22492(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo22493(C5882 c5882);

    public AbstractC8705(Context context) {
        this.f26500 = context;
        this.f26499 = LayoutInflater.from(context);
    }

    @Override // l.InterfaceC14762
    public void initForMenu(Context context, C3060 c3060) {
        this.f26505 = context;
        LayoutInflater.from(context);
        this.f26497 = c3060;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7002 mo22488(ViewGroup viewGroup) {
        if (this.f26501 == null) {
            InterfaceC7002 interfaceC7002 = (InterfaceC7002) this.f26499.inflate(this.f26502, viewGroup, false);
            this.f26501 = interfaceC7002;
            interfaceC7002.initialize(this.f26497);
            updateMenuView(true);
        }
        return this.f26501;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC14762
    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f26501;
        if (viewGroup == null) {
            return;
        }
        C3060 c3060 = this.f26497;
        int i = 0;
        if (c3060 != null) {
            c3060.flagActionItems();
            ArrayList visibleItems = this.f26497.getVisibleItems();
            int size = visibleItems.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C5882 c5882 = (C5882) visibleItems.get(i3);
                if (mo22493(c5882)) {
                    View childAt = viewGroup.getChildAt(i2);
                    C5882 itemData = childAt instanceof InterfaceC23935 ? ((InterfaceC23935) childAt).getItemData() : null;
                    View viewMo22487 = mo22487(c5882, childAt, viewGroup);
                    if (c5882 != itemData) {
                        viewMo22487.setPressed(false);
                        viewMo22487.jumpDrawablesToCurrentState();
                    }
                    if (viewMo22487 != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) viewMo22487.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewMo22487);
                        }
                        ((ViewGroup) this.f26501).addView(viewMo22487, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo22492(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // l.InterfaceC14762
    public final void setCallback(InterfaceC17585 interfaceC17585) {
        this.f26504 = interfaceC17585;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17585 m22489() {
        return this.f26504;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public View mo22487(C5882 c5882, View view, ViewGroup viewGroup) {
        InterfaceC23935 interfaceC23935;
        if (!(view instanceof InterfaceC23935)) {
            interfaceC23935 = (InterfaceC23935) this.f26499.inflate(this.f26498, viewGroup, false);
        } else {
            interfaceC23935 = (InterfaceC23935) view;
        }
        mo22491(c5882, interfaceC23935);
        return (View) interfaceC23935;
    }

    @Override // l.InterfaceC14762
    public void onCloseMenu(C3060 c3060, boolean z) {
        InterfaceC17585 interfaceC17585 = this.f26504;
        if (interfaceC17585 != null) {
            interfaceC17585.onCloseMenu(c3060, z);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.InterfaceC14762
    public boolean onSubMenuSelected(SubMenuC19703 subMenuC19703) {
        InterfaceC17585 interfaceC17585 = this.f26504;
        C3060 c3060 = subMenuC19703;
        if (interfaceC17585 == null) {
            return false;
        }
        if (subMenuC19703 == null) {
            c3060 = this.f26497;
        }
        return interfaceC17585.mo2048(c3060);
    }

    @Override // l.InterfaceC14762
    public final int getId() {
        return this.f26503;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22490(int i) {
        this.f26503 = R.id.MT_Protector;
    }
}
