package l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.۟᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7ANL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7739 extends ComponentCallbacksC9205 implements InterfaceC1389 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC0525 f23948;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC21851 m20750();

    @Override // l.ComponentCallbacksC9205
    public final void onAttach(Context context) {
        C11233.m27805(context, d.R);
        super.onAttach(context);
        AbstractC5180 parentFragmentManager = getParentFragmentManager();
        C11233.m27803(parentFragmentManager, "parentFragmentManager");
        AbstractC16882 abstractC16882M14900 = parentFragmentManager.m14900();
        abstractC16882M14900.mo39674(this);
        abstractC16882M14900.mo39685();
    }

    @Override // l.ComponentCallbacksC9205
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C11233.m27805(layoutInflater, "inflater");
        C14462 c14462 = new C14462(layoutInflater.getContext(), null);
        c14462.setId(R.id.MT_Protector);
        C21905 c21905 = new C21905(layoutInflater.getContext());
        c21905.setId(R.id.MT_Protector);
        C1763 c1763 = new C1763(getResources().getDimensionPixelSize(R.dimen.MT_Protector));
        c1763.f6116 = getResources().getInteger(R.integer.MT_Protector);
        c14462.addView(c21905, c1763);
        C21905 c21906 = new C21905(layoutInflater.getContext());
        c21906.setId(R.id.MT_Protector);
        C1763 c1764 = new C1763(getResources().getDimensionPixelSize(R.dimen.MT_Protector));
        c1764.f6116 = getResources().getInteger(R.integer.MT_Protector);
        c14462.addView(c21906, c1764);
        if (getChildFragmentManager().m14862(R.id.MT_Protector) == null) {
            AbstractC21851 abstractC21851M20750 = m20750();
            AbstractC5180 childFragmentManager = getChildFragmentManager();
            C11233.m27803(childFragmentManager, "childFragmentManager");
            AbstractC16882 abstractC16882M14900 = childFragmentManager.m14900();
            abstractC16882M14900.m39691();
            abstractC16882M14900.m39684(abstractC21851M20750);
            abstractC16882M14900.mo39685();
        }
        c14462.m34550();
        return c14462;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ۨ᩸ۧ] */
    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        C11815 onBackPressedDispatcher;
        C11233.m27805(view, "view");
        super.onViewCreated(view, bundle);
        this.f23948 = new C23261(this);
        C14462 c14462 = (C14462) requireView();
        int i = C17648.f53953;
        if (!c14462.isLaidOut() || c14462.isLayoutRequested()) {
            c14462.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC14088(this));
        } else {
            AbstractC0525 abstractC0525 = this.f23948;
            C11233.m27799(abstractC0525);
            abstractC0525.m2240(((C14462) requireView()).m34547() && ((C14462) requireView()).m34549());
        }
        getChildFragmentManager().m14875((C11973) new InterfaceC18586() { // from class: l.ۨ᩸ۧ
            @Override // l.InterfaceC18586
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo29246() {
                AbstractC7739.m20748(this.f35842);
            }
        });
        InterfaceC23103 interfaceC23103M42422 = C18207.m42422(view);
        if (interfaceC23103M42422 == null || (onBackPressedDispatcher = interfaceC23103M42422.getOnBackPressedDispatcher()) == null) {
            return;
        }
        InterfaceC23586 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC0525 abstractC0526 = this.f23948;
        C11233.m27799(abstractC0526);
        onBackPressedDispatcher.m28894(viewLifecycleOwner, abstractC0526);
    }

    @Override // l.InterfaceC1389
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4875(AbstractC21851 abstractC21851, C2095 c2095) {
        AbstractC16882 abstractC16882M14900;
        ComponentCallbacksC9205 componentCallbacksC9205Mo41848;
        if (abstractC21851.getId() != R.id.MT_Protector) {
            if (abstractC21851.getId() != R.id.MT_Protector) {
                return false;
            }
            C20494 c20494M14889 = getChildFragmentManager().m14889();
            requireContext().getClassLoader();
            String strM6929 = c2095.m6929();
            C11233.m27799((Object) strM6929);
            ComponentCallbacksC9205 componentCallbacksC9205Mo41849 = c20494M14889.mo41848(strM6929);
            C11233.m27803(componentCallbacksC9205Mo41849, "childFragmentManager.fra….fragment!!\n            )");
            componentCallbacksC9205Mo41849.setArguments(c2095.m6913());
            AbstractC5180 childFragmentManager = getChildFragmentManager();
            C11233.m27803(childFragmentManager, "childFragmentManager");
            abstractC16882M14900 = childFragmentManager.m14900();
            abstractC16882M14900.m39691();
            abstractC16882M14900.m39679(R.id.MT_Protector, componentCallbacksC9205Mo41849, null);
            abstractC16882M14900.m39688();
            abstractC16882M14900.m39677();
        } else {
            if (c2095.m6929() == null) {
                Intent intentM6937 = c2095.m6937();
                if (intentM6937 == null) {
                    return true;
                }
                startActivity(intentM6937);
                return true;
            }
            String strM69210 = c2095.m6929();
            if (strM69210 == null) {
                componentCallbacksC9205Mo41848 = null;
            } else {
                C20494 c20494M148810 = getChildFragmentManager().m14889();
                requireContext().getClassLoader();
                componentCallbacksC9205Mo41848 = c20494M148810.mo41848(strM69210);
            }
            if (componentCallbacksC9205Mo41848 != null) {
                componentCallbacksC9205Mo41848.setArguments(c2095.m6913());
            }
            if (getChildFragmentManager().m14925() > 0) {
                InterfaceC8708 interfaceC8708M14924 = getChildFragmentManager().m14924();
                C11233.m27803(interfaceC8708M14924, "childFragmentManager.getBackStackEntryAt(0)");
                getChildFragmentManager().m14901(interfaceC8708M14924.getId());
            }
            AbstractC5180 childFragmentManager2 = getChildFragmentManager();
            C11233.m27803(childFragmentManager2, "childFragmentManager");
            abstractC16882M14900 = childFragmentManager2.m14900();
            abstractC16882M14900.m39691();
            C11233.m27799(componentCallbacksC9205Mo41848);
            abstractC16882M14900.m39679(R.id.MT_Protector, componentCallbacksC9205Mo41848, null);
            if (((C14462) requireView()).m34549()) {
                abstractC16882M14900.m39688();
            }
            ((C14462) requireView()).m34544();
        }
        abstractC16882M14900.mo39685();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20748(AbstractC7739 abstractC7739) {
        AbstractC0525 abstractC0525 = abstractC7739.f23948;
        C11233.m27799(abstractC0525);
        abstractC0525.m2240(abstractC7739.getChildFragmentManager().m14925() == 0);
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewStateRestored(Bundle bundle) {
        ComponentCallbacksC9205 componentCallbacksC9205Mo41848;
        super.onViewStateRestored(bundle);
        if (bundle == null) {
            ComponentCallbacksC9205 componentCallbacksC9205M14862 = getChildFragmentManager().m14862(R.id.MT_Protector);
            if (componentCallbacksC9205M14862 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
            }
            AbstractC21851 abstractC21851 = (AbstractC21851) componentCallbacksC9205M14862;
            if (abstractC21851.m49240().m10699() > 0) {
                int iM10699 = abstractC21851.m49240().m10699();
                int i = 0;
                while (true) {
                    if (i >= iM10699) {
                        componentCallbacksC9205Mo41848 = null;
                        break;
                    }
                    int i2 = i + 1;
                    C2095 c2095M10701 = abstractC21851.m49240().m10701(i);
                    C11233.m27803(c2095M10701, "headerFragment.preferenc…reen.getPreference(index)");
                    if (c2095M10701.m6929() != null) {
                        String strM6929 = c2095M10701.m6929();
                        if (strM6929 == null) {
                            componentCallbacksC9205Mo41848 = null;
                        } else {
                            C20494 c20494M14889 = getChildFragmentManager().m14889();
                            requireContext().getClassLoader();
                            componentCallbacksC9205Mo41848 = c20494M14889.mo41848(strM6929);
                        }
                        if (componentCallbacksC9205Mo41848 == null) {
                            break;
                        }
                        componentCallbacksC9205Mo41848.setArguments(c2095M10701.m6913());
                        break;
                    }
                    i = i2;
                }
            } else {
                componentCallbacksC9205Mo41848 = null;
                break;
            }
            if (componentCallbacksC9205Mo41848 == null) {
                return;
            }
            AbstractC5180 childFragmentManager = getChildFragmentManager();
            C11233.m27803(childFragmentManager, "childFragmentManager");
            AbstractC16882 abstractC16882M14900 = childFragmentManager.m14900();
            abstractC16882M14900.m39691();
            abstractC16882M14900.m39679(R.id.MT_Protector, componentCallbacksC9205Mo41848, null);
            abstractC16882M14900.mo39685();
        }
    }
}
