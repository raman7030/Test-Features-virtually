package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩺᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AMS */
/* JADX INFO: loaded from: classes.dex */
public final class C23232 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11944 f74649 = C11944.f35703;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m51538(ComponentCallbacksC9205 componentCallbacksC9205, String str) {
        C11233.m27805(componentCallbacksC9205, "fragment");
        C11233.m27805(str, "previousFragmentId");
        m51536(new C10533(componentCallbacksC9205, "Attempting to reuse fragment " + componentCallbacksC9205 + " with previous ID " + str));
        m51535(componentCallbacksC9205).getClass();
        EnumC6299 enumC6299 = EnumC6299.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m51542(ComponentCallbacksC9205 componentCallbacksC9205, ViewGroup viewGroup) {
        C11233.m27805(componentCallbacksC9205, "fragment");
        m51536(new C20786(componentCallbacksC9205, "Attempting to add fragment " + componentCallbacksC9205 + " to container " + viewGroup + " which is not a FragmentContainerView"));
        m51535(componentCallbacksC9205).getClass();
        EnumC6299 enumC6299 = EnumC6299.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11944 m51535(ComponentCallbacksC9205 componentCallbacksC9205) {
        while (componentCallbacksC9205 != null) {
            if (componentCallbacksC9205.isAdded()) {
                C11233.m27803(componentCallbacksC9205.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            componentCallbacksC9205 = componentCallbacksC9205.getParentFragment();
        }
        return f74649;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m51537(ComponentCallbacksC9205 componentCallbacksC9205, ViewGroup viewGroup) {
        m51536(new C14059(componentCallbacksC9205, "Attempting to use <fragment> tag to add fragment " + componentCallbacksC9205 + " to container " + viewGroup));
        m51535(componentCallbacksC9205).getClass();
        EnumC6299 enumC6299 = EnumC6299.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final void m51544(ComponentCallbacksC9205 componentCallbacksC9205) {
        m51536(new C17963(componentCallbacksC9205, "Attempting to set retain instance for fragment " + componentCallbacksC9205));
        m51535(componentCallbacksC9205).getClass();
        EnumC6299 enumC6299 = EnumC6299.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m51541(ComponentCallbacksC9205 componentCallbacksC9205) {
        m51536(new C7710(componentCallbacksC9205, "Attempting to get retain instance for fragment " + componentCallbacksC9205));
        m51535(componentCallbacksC9205).getClass();
        EnumC6299 enumC6299 = EnumC6299.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m51540(ComponentCallbacksC9205 componentCallbacksC9205, boolean z) {
        m51536(new C14434(componentCallbacksC9205, "Attempting to set user visible hint to " + z + " for fragment " + componentCallbacksC9205));
        m51535(componentCallbacksC9205).getClass();
        EnumC6299 enumC6299 = EnumC6299.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m51539(ComponentCallbacksC9205 componentCallbacksC9205, ComponentCallbacksC9205 componentCallbacksC9206, int i) {
        m51536(new C17257(componentCallbacksC9205, "Attempting to set target fragment " + componentCallbacksC9206 + " with request code " + i + " for fragment " + componentCallbacksC9205));
        m51535(componentCallbacksC9205).getClass();
        EnumC6299 enumC6299 = EnumC6299.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final void m51545(ComponentCallbacksC9205 componentCallbacksC9205) {
        m51536(new C10908(componentCallbacksC9205, "Attempting to get target fragment from fragment " + componentCallbacksC9205));
        m51535(componentCallbacksC9205).getClass();
        EnumC6299 enumC6299 = EnumC6299.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final void m51543(ComponentCallbacksC9205 componentCallbacksC9205) {
        m51536(new C1735(componentCallbacksC9205, "Attempting to get target request code from fragment " + componentCallbacksC9205));
        m51535(componentCallbacksC9205).getClass();
        EnumC6299 enumC6299 = EnumC6299.PENALTY_LOG;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51536(AbstractC6674 abstractC6674) {
        if (AbstractC5180.m14853(3)) {
            abstractC6674.m18208().getClass();
        }
    }
}
