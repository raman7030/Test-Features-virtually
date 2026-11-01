package p067l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0708d;

/* JADX INFO: renamed from: l.۟᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7ANL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9724 extends ComponentCallbacksC11117 implements InterfaceC3689 {

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC0868 f26861;

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC23136 m22730();

    @Override // p067l.ComponentCallbacksC11117
    public final void onAttach(Context context) {
        C13045.m29867(context, C0708d.f2602R);
        super.onAttach(context);
        AbstractC7291 parentFragmentManager = getParentFragmentManager();
        C13045.m29865(parentFragmentManager, "parentFragmentManager");
        AbstractC18413 abstractC18413M16810 = parentFragmentManager.m16810();
        abstractC18413M16810.mo41915(this);
        abstractC18413M16810.mo41926();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13045.m29867(layoutInflater, "inflater");
        C16113 c16113 = new C16113(layoutInflater.getContext(), null);
        c16113.setId(R.id.MT_Protector);
        C23187 c23187 = new C23187(layoutInflater.getContext());
        c23187.setId(R.id.MT_Protector);
        C4044 c4044 = new C4044(getResources().getDimensionPixelSize(R.dimen.MT_Protector));
        c4044.f8892 = getResources().getInteger(R.integer.MT_Protector);
        c16113.addView(c23187, c4044);
        C23187 c23188 = new C23187(layoutInflater.getContext());
        c23188.setId(R.id.MT_Protector);
        C4044 c4045 = new C4044(getResources().getDimensionPixelSize(R.dimen.MT_Protector));
        c4045.f8892 = getResources().getInteger(R.integer.MT_Protector);
        c16113.addView(c23188, c4045);
        if (getChildFragmentManager().m16772(R.id.MT_Protector) == null) {
            AbstractC23136 abstractC23136M22730 = m22730();
            AbstractC7291 childFragmentManager = getChildFragmentManager();
            C13045.m29865(childFragmentManager, "childFragmentManager");
            AbstractC18413 abstractC18413M16810 = childFragmentManager.m16810();
            abstractC18413M16810.m41932();
            abstractC18413M16810.m41925(abstractC23136M22730);
            abstractC18413M16810.mo41926();
        }
        c16113.m36684();
        return c16113;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ۨ᩸ۧ] */
    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        C1428 onBackPressedDispatcher;
        C13045.m29867(view, "view");
        super.onViewCreated(view, bundle);
        this.f26861 = new C24476(this);
        C16113 c16113 = (C16113) requireView();
        int i = C1717.f57146;
        if (!c16113.isLaidOut() || c16113.isLayoutRequested()) {
            c16113.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC15758(this));
        } else {
            AbstractC0868 abstractC0868 = this.f26861;
            C13045.m29861(abstractC0868);
            abstractC0868.m4607(((C16113) requireView()).m36681() && ((C16113) requireView()).m36683());
        }
        getChildFragmentManager().m16785((C13748) new InterfaceC20032() { // from class: l.ۨ᩸ۧ
            @Override // p067l.InterfaceC20032
            /* JADX INFO: renamed from: ֫ */
            public final void mo31300() {
                AbstractC9724.m22728(this.f38852);
            }
        });
        InterfaceC1988 interfaceC1988M44683 = C1745.m44683(view);
        if (interfaceC1988M44683 == null || (onBackPressedDispatcher = interfaceC1988M44683.getOnBackPressedDispatcher()) == null) {
            return;
        }
        InterfaceC24784 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC0868 abstractC0869 = this.f26861;
        C13045.m29861(abstractC0869);
        onBackPressedDispatcher.m30943(viewLifecycleOwner, abstractC0869);
    }

    @Override // p067l.InterfaceC3689
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7113(AbstractC23136 abstractC23136, C4360 c4360) {
        AbstractC18413 abstractC18413M16810;
        ComponentCallbacksC11117 componentCallbacksC11117Mo44095;
        if (abstractC23136.getId() != R.id.MT_Protector) {
            if (abstractC23136.getId() != R.id.MT_Protector) {
                return false;
            }
            C21846 c21846M16799 = getChildFragmentManager().m16799();
            requireContext().getClassLoader();
            String strM9055 = c4360.m9055();
            C13045.m29861((Object) strM9055);
            ComponentCallbacksC11117 componentCallbacksC11117Mo44096 = c21846M16799.mo44095(strM9055);
            C13045.m29865(componentCallbacksC11117Mo44096, "childFragmentManager.fra….fragment!!\n            )");
            componentCallbacksC11117Mo44096.setArguments(c4360.m9039());
            AbstractC7291 childFragmentManager = getChildFragmentManager();
            C13045.m29865(childFragmentManager, "childFragmentManager");
            abstractC18413M16810 = childFragmentManager.m16810();
            abstractC18413M16810.m41932();
            abstractC18413M16810.m41920(R.id.MT_Protector, componentCallbacksC11117Mo44096, null);
            abstractC18413M16810.m41929();
            abstractC18413M16810.m41918();
        } else {
            if (c4360.m9055() == null) {
                Intent intentM9063 = c4360.m9063();
                if (intentM9063 == null) {
                    return true;
                }
                startActivity(intentM9063);
                return true;
            }
            String strM9056 = c4360.m9055();
            if (strM9056 == null) {
                componentCallbacksC11117Mo44095 = null;
            } else {
                C21846 c21846M167910 = getChildFragmentManager().m16799();
                requireContext().getClassLoader();
                componentCallbacksC11117Mo44095 = c21846M167910.mo44095(strM9056);
            }
            if (componentCallbacksC11117Mo44095 != null) {
                componentCallbacksC11117Mo44095.setArguments(c4360.m9039());
            }
            if (getChildFragmentManager().m16835() > 0) {
                InterfaceC10644 interfaceC10644M16834 = getChildFragmentManager().m16834();
                C13045.m29865(interfaceC10644M16834, "childFragmentManager.getBackStackEntryAt(0)");
                getChildFragmentManager().m16811(interfaceC10644M16834.getId());
            }
            AbstractC7291 childFragmentManager2 = getChildFragmentManager();
            C13045.m29865(childFragmentManager2, "childFragmentManager");
            abstractC18413M16810 = childFragmentManager2.m16810();
            abstractC18413M16810.m41932();
            C13045.m29861(componentCallbacksC11117Mo44095);
            abstractC18413M16810.m41920(R.id.MT_Protector, componentCallbacksC11117Mo44095, null);
            if (((C16113) requireView()).m36683()) {
                abstractC18413M16810.m41929();
            }
            ((C16113) requireView()).m36678();
        }
        abstractC18413M16810.mo41926();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22728(AbstractC9724 abstractC9724) {
        AbstractC0868 abstractC0868 = abstractC9724.f26861;
        C13045.m29861(abstractC0868);
        abstractC0868.m4607(abstractC9724.getChildFragmentManager().m16835() == 0);
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewStateRestored(Bundle bundle) {
        ComponentCallbacksC11117 componentCallbacksC11117Mo44095;
        super.onViewStateRestored(bundle);
        if (bundle == null) {
            ComponentCallbacksC11117 componentCallbacksC11117M16772 = getChildFragmentManager().m16772(R.id.MT_Protector);
            if (componentCallbacksC11117M16772 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
            }
            AbstractC23136 abstractC23136 = (AbstractC23136) componentCallbacksC11117M16772;
            if (abstractC23136.m51591().m12694() > 0) {
                int iM12694 = abstractC23136.m51591().m12694();
                int i = 0;
                while (true) {
                    if (i >= iM12694) {
                        componentCallbacksC11117Mo44095 = null;
                        break;
                    }
                    int i2 = i + 1;
                    C4360 c4360M12696 = abstractC23136.m51591().m12696(i);
                    C13045.m29865(c4360M12696, "headerFragment.preferenc…reen.getPreference(index)");
                    if (c4360M12696.m9055() != null) {
                        String strM9055 = c4360M12696.m9055();
                        if (strM9055 == null) {
                            componentCallbacksC11117Mo44095 = null;
                        } else {
                            C21846 c21846M16799 = getChildFragmentManager().m16799();
                            requireContext().getClassLoader();
                            componentCallbacksC11117Mo44095 = c21846M16799.mo44095(strM9055);
                        }
                        if (componentCallbacksC11117Mo44095 == null) {
                            break;
                        }
                        componentCallbacksC11117Mo44095.setArguments(c4360M12696.m9039());
                        break;
                    }
                    i = i2;
                }
            } else {
                componentCallbacksC11117Mo44095 = null;
                break;
            }
            if (componentCallbacksC11117Mo44095 == null) {
                return;
            }
            AbstractC7291 childFragmentManager = getChildFragmentManager();
            C13045.m29865(childFragmentManager, "childFragmentManager");
            AbstractC18413 abstractC18413M16810 = childFragmentManager.m16810();
            abstractC18413M16810.m41932();
            abstractC18413M16810.m41920(R.id.MT_Protector, componentCallbacksC11117Mo44095, null);
            abstractC18413M16810.mo41926();
        }
    }
}
