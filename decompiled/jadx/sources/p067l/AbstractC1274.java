package p067l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡۜ */
/* JADX INFO: compiled from: 852L */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1274 implements InterfaceC1574 {

    /* JADX INFO: renamed from: ۗ */
    public C0994 f29422;

    /* JADX INFO: renamed from: ۛ */
    public LayoutInflater f29424;

    /* JADX INFO: renamed from: ۤ */
    public Context f29425;

    /* JADX INFO: renamed from: ۫ */
    public InterfaceC1189 f29426;

    /* JADX INFO: renamed from: ᩶ */
    public int f29428;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC1714 f29429;

    /* JADX INFO: renamed from: ᩹ */
    public Context f29430;

    /* JADX INFO: renamed from: ۬ */
    public int f29427 = R.layout.MT_Protector;

    /* JADX INFO: renamed from: ۙ */
    public int f29423 = R.layout.MT_Protector;

    @Override // p067l.InterfaceC1574
    public final boolean collapseItemActionView(C0994 c0994, C1134 c1134) {
        return false;
    }

    @Override // p067l.InterfaceC1574
    public final boolean expandItemActionView(C0994 c0994, C1134 c1134) {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo24460(C1134 c1134, InterfaceC2029 interfaceC2029);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo24461(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo24462(C1134 c1134);

    public AbstractC1274(Context context) {
        this.f29425 = context;
        this.f29424 = LayoutInflater.from(context);
    }

    @Override // p067l.InterfaceC1574
    public void initForMenu(Context context, C0994 c0994) {
        this.f29430 = context;
        LayoutInflater.from(context);
        this.f29422 = c0994;
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC1189 mo24457(ViewGroup viewGroup) {
        if (this.f29426 == null) {
            InterfaceC1189 interfaceC1189 = (InterfaceC1189) this.f29424.inflate(this.f29427, viewGroup, false);
            this.f29426 = interfaceC1189;
            interfaceC1189.initialize(this.f29422);
            updateMenuView(true);
        }
        return this.f29426;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.InterfaceC1574
    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f29426;
        if (viewGroup == null) {
            return;
        }
        C0994 c0994 = this.f29422;
        int i = 0;
        if (c0994 != null) {
            c0994.flagActionItems();
            ArrayList visibleItems = this.f29422.getVisibleItems();
            int size = visibleItems.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C1134 c1134 = (C1134) visibleItems.get(i3);
                if (mo24462(c1134)) {
                    View childAt = viewGroup.getChildAt(i2);
                    C1134 itemData = childAt instanceof InterfaceC2029 ? ((InterfaceC2029) childAt).getItemData() : null;
                    View viewMo24456 = mo24456(c1134, childAt, viewGroup);
                    if (c1134 != itemData) {
                        viewMo24456.setPressed(false);
                        viewMo24456.jumpDrawablesToCurrentState();
                    }
                    if (viewMo24456 != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) viewMo24456.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewMo24456);
                        }
                        ((ViewGroup) this.f29426).addView(viewMo24456, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo24461(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // p067l.InterfaceC1574
    public final void setCallback(InterfaceC1714 interfaceC1714) {
        this.f29429 = interfaceC1714;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1714 m24458() {
        return this.f29429;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public View mo24456(C1134 c1134, View view, ViewGroup viewGroup) {
        InterfaceC2029 interfaceC2029;
        if (!(view instanceof InterfaceC2029)) {
            interfaceC2029 = (InterfaceC2029) this.f29424.inflate(this.f29423, viewGroup, false);
        } else {
            interfaceC2029 = (InterfaceC2029) view;
        }
        mo24460(c1134, interfaceC2029);
        return (View) interfaceC2029;
    }

    @Override // p067l.InterfaceC1574
    public void onCloseMenu(C0994 c0994, boolean z) {
        InterfaceC1714 interfaceC1714 = this.f29429;
        if (interfaceC1714 != null) {
            interfaceC1714.onCloseMenu(c0994, z);
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
    @Override // p067l.InterfaceC1574
    public boolean onSubMenuSelected(SubMenuC1819 subMenuC1819) {
        InterfaceC1714 interfaceC1714 = this.f29429;
        C0994 c0994 = subMenuC1819;
        if (interfaceC1714 == null) {
            return false;
        }
        if (subMenuC1819 == null) {
            c0994 = this.f29422;
        }
        return interfaceC1714.mo4428(c0994);
    }

    @Override // p067l.InterfaceC1574
    public final int getId() {
        return this.f29428;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24459(int i) {
        this.f29428 = R.id.MT_Protector;
    }
}
