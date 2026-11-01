package p067l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩺᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AMS */
/* JADX INFO: loaded from: classes.dex */
public final class C24448 {

    /* JADX INFO: renamed from: ֫ */
    public static C13720 f77392 = C13720.f38714;

    /* JADX INFO: renamed from: ֫ */
    public static final void m53935(ComponentCallbacksC11117 componentCallbacksC11117, String str) {
        C13045.m29867(componentCallbacksC11117, "fragment");
        C13045.m29867(str, "previousFragmentId");
        m53933(new C12379(componentCallbacksC11117, "Attempting to reuse fragment " + componentCallbacksC11117 + " with previous ID " + str));
        m53932(componentCallbacksC11117).getClass();
        EnumC8355 enumC8355 = EnumC8355.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۧ */
    public static final void m53939(ComponentCallbacksC11117 componentCallbacksC11117, ViewGroup viewGroup) {
        C13045.m29867(componentCallbacksC11117, "fragment");
        m53933(new C22123(componentCallbacksC11117, "Attempting to add fragment " + componentCallbacksC11117 + " to container " + viewGroup + " which is not a FragmentContainerView"));
        m53932(componentCallbacksC11117).getClass();
        EnumC8355 enumC8355 = EnumC8355.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13720 m53932(ComponentCallbacksC11117 componentCallbacksC11117) {
        while (componentCallbacksC11117 != null) {
            if (componentCallbacksC11117.isAdded()) {
                C13045.m29865(componentCallbacksC11117.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            componentCallbacksC11117 = componentCallbacksC11117.getParentFragment();
        }
        return f77392;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m53934(ComponentCallbacksC11117 componentCallbacksC11117, ViewGroup viewGroup) {
        m53933(new C15730(componentCallbacksC11117, "Attempting to use <fragment> tag to add fragment " + componentCallbacksC11117 + " to container " + viewGroup));
        m53932(componentCallbacksC11117).getClass();
        EnumC8355 enumC8355 = EnumC8355.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ܿ */
    public static final void m53941(ComponentCallbacksC11117 componentCallbacksC11117) {
        m53933(new C19440(componentCallbacksC11117, "Attempting to set retain instance for fragment " + componentCallbacksC11117));
        m53932(componentCallbacksC11117).getClass();
        EnumC8355 enumC8355 = EnumC8355.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۧ */
    public static final void m53938(ComponentCallbacksC11117 componentCallbacksC11117) {
        m53933(new C9696(componentCallbacksC11117, "Attempting to get retain instance for fragment " + componentCallbacksC11117));
        m53932(componentCallbacksC11117).getClass();
        EnumC8355 enumC8355 = EnumC8355.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m53937(ComponentCallbacksC11117 componentCallbacksC11117, boolean z) {
        m53933(new C16086(componentCallbacksC11117, "Attempting to set user visible hint to " + z + " for fragment " + componentCallbacksC11117));
        m53932(componentCallbacksC11117).getClass();
        EnumC8355 enumC8355 = EnumC8355.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m53936(ComponentCallbacksC11117 componentCallbacksC11117, ComponentCallbacksC11117 componentCallbacksC11118, int i) {
        m53933(new C18769(componentCallbacksC11117, "Attempting to set target fragment " + componentCallbacksC11118 + " with request code " + i + " for fragment " + componentCallbacksC11117));
        m53932(componentCallbacksC11117).getClass();
        EnumC8355 enumC8355 = EnumC8355.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static final void m53942(ComponentCallbacksC11117 componentCallbacksC11117) {
        m53933(new C12735(componentCallbacksC11117, "Attempting to get target fragment from fragment " + componentCallbacksC11117));
        m53932(componentCallbacksC11117).getClass();
        EnumC8355 enumC8355 = EnumC8355.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ܽ */
    public static final void m53940(ComponentCallbacksC11117 componentCallbacksC11117) {
        m53933(new C4017(componentCallbacksC11117, "Attempting to get target request code from fragment " + componentCallbacksC11117));
        m53932(componentCallbacksC11117).getClass();
        EnumC8355 enumC8355 = EnumC8355.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53933(AbstractC8711 abstractC8711) {
        if (AbstractC7291.m16763(3)) {
            abstractC8711.m20156().getClass();
        }
    }
}
