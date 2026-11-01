package p067l;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩸᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23136 extends ComponentCallbacksC11117 implements InterfaceC19803, InterfaceC13098, InterfaceC18461, InterfaceC4180 {

    /* JADX INFO: renamed from: ۙ */
    public boolean f72717;

    /* JADX INFO: renamed from: ۛ */
    public Runnable f72718;

    /* JADX INFO: renamed from: ۫ */
    public C19132 f72720;

    /* JADX INFO: renamed from: ۬ */
    public C14849 f72721;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f72722;

    /* JADX INFO: renamed from: ᩸ */
    public final C3018 f72723 = new C3018(this);

    /* JADX INFO: renamed from: ۗ */
    public int f72716 = R.layout.MT_Protector;

    /* JADX INFO: renamed from: ᩹ */
    public final Handler f72724 = new HandlerC6372(this, Looper.getMainLooper());

    /* JADX INFO: renamed from: ۤ */
    public final Runnable f72719 = new RunnableC20454(this);

    /* JADX INFO: renamed from: ܿ */
    public abstract void mo22602();

    @Override // p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.MT_Protector, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.MT_Protector;
        }
        requireContext().getTheme().applyStyle(i, false);
        C19132 c19132 = new C19132(requireContext());
        this.f72720 = c19132;
        c19132.m43518((InterfaceC18461) this);
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        mo22602();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C14849 c14849;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, C11757.f32868, R.attr.MT_Protector, 0);
        this.f72716 = typedArrayObtainStyledAttributes.getResourceId(0, this.f72716);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f72716, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (c14849 = (C14849) viewGroup2.findViewById(R.id.MT_Protector)) == null) {
            c14849 = (C14849) layoutInflaterCloneInContext.inflate(R.layout.MT_Protector, viewGroup2, false);
            c14849.setLayoutManager(new C8541(requireContext()));
            c14849.setAccessibilityDelegateCompat(new C25167(c14849));
        }
        this.f72721 = c14849;
        C3018 c3018 = this.f72723;
        c14849.addItemDecoration(c3018);
        c3018.m5109(drawable);
        if (dimensionPixelSize != -1) {
            c3018.m5108(dimensionPixelSize);
        }
        c3018.m5110(z);
        if (this.f72721.getParent() == null) {
            viewGroup2.addView(this.f72721);
        }
        this.f72724.post(this.f72719);
        return viewInflate;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        C9074 c9074M43524;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (c9074M43524 = this.f72720.m43524()) != null) {
            c9074M43524.mo9017(bundle2);
        }
        if (this.f72722) {
            m51588();
            Runnable runnable = this.f72718;
            if (runnable != null) {
                ((RunnableC21125) runnable).run();
                this.f72718 = null;
            }
        }
        this.f72717 = true;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onStart() {
        super.onStart();
        this.f72720.m43519((InterfaceC19803) this);
        this.f72720.m43517((InterfaceC13098) this);
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onStop() {
        super.onStop();
        this.f72720.m43519((InterfaceC19803) null);
        this.f72720.m43517((InterfaceC13098) null);
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onDestroyView() {
        Runnable runnable = this.f72719;
        Handler handler = this.f72724;
        handler.removeCallbacks(runnable);
        handler.removeMessages(1);
        if (this.f72722) {
            this.f72721.setAdapter(null);
            C9074 c9074M43524 = this.f72720.m43524();
            if (c9074M43524 != null) {
                c9074M43524.mo9046();
            }
        }
        this.f72721 = null;
        super.onDestroyView();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C9074 c9074M43524 = this.f72720.m43524();
        if (c9074M43524 != null) {
            Bundle bundle2 = new Bundle();
            c9074M43524.mo9041(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C19132 m51590() {
        return this.f72720;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51588() {
        C9074 c9074M43524 = this.f72720.m43524();
        if (c9074M43524 != null) {
            this.f72721.setAdapter(new C8383(c9074M43524));
            c9074M43524.mo9038();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C9074 m51591() {
        return this.f72720.m43524();
    }

    @Override // p067l.InterfaceC19803
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10709(C4360 c4360) {
        if (c4360.m9055() == null) {
            return false;
        }
        boolean zMo7113 = false;
        for (ComponentCallbacksC11117 parentFragment = this; !zMo7113 && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC3689) {
                zMo7113 = ((InterfaceC3689) parentFragment).mo7113(this, c4360);
            }
        }
        if (!zMo7113 && (getContext() instanceof InterfaceC3689)) {
            zMo7113 = ((InterfaceC3689) getContext()).mo7113(this, c4360);
        }
        if (!zMo7113 && (getActivity() instanceof InterfaceC3689)) {
            zMo7113 = ((InterfaceC3689) getActivity()).mo7113(this, c4360);
        }
        if (zMo7113) {
            return true;
        }
        AbstractC7291 parentFragmentManager = getParentFragmentManager();
        Bundle bundleM9039 = c4360.m9039();
        C21846 c21846M16799 = parentFragmentManager.m16799();
        requireActivity().getClassLoader();
        ComponentCallbacksC11117 componentCallbacksC11117Mo44095 = c21846M16799.mo44095(c4360.m9055());
        componentCallbacksC11117Mo44095.setArguments(bundleM9039);
        componentCallbacksC11117Mo44095.setTargetFragment(this, 0);
        AbstractC18413 abstractC18413M16810 = parentFragmentManager.m16810();
        abstractC18413M16810.m41920(((View) requireView().getParent()).getId(), componentCallbacksC11117Mo44095, null);
        abstractC18413M16810.m41918();
        abstractC18413M16810.mo41926();
        return true;
    }

    @Override // p067l.InterfaceC18461
    /* JADX INFO: renamed from: ֫ */
    public final void mo10707(C9074 c9074) {
        boolean zM24094 = false;
        for (ComponentCallbacksC11117 parentFragment = this; !zM24094 && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC10395) {
                zM24094 = ((InterfaceC10395) parentFragment).m24094();
            }
        }
        if (!zM24094 && (getContext() instanceof InterfaceC10395)) {
            zM24094 = ((InterfaceC10395) getContext()).m24094();
        }
        if (zM24094 || !(getActivity() instanceof InterfaceC10395)) {
            return;
        }
        ((InterfaceC10395) getActivity()).m24094();
    }

    @Override // p067l.InterfaceC4180
    public final C4360 findPreference(String str) {
        C19132 c19132 = this.f72720;
        if (c19132 == null) {
            return null;
        }
        return c19132.m43513((CharSequence) str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51587(int i) {
        C19132 c19132 = this.f72720;
        if (c19132 != null) {
            if (this.f72720.m43520(c19132.m43514(requireContext(), i, this.f72720.m43524()))) {
                this.f72722 = true;
                if (this.f72717) {
                    Handler handler = this.f72724;
                    if (handler.hasMessages(1)) {
                        return;
                    }
                    handler.obtainMessage(1).sendToTarget();
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    @Override // p067l.InterfaceC13098
    /* JADX INFO: renamed from: ֫ */
    public final void mo10708(AbstractC12898 abstractC12898) {
        DialogInterfaceOnCancelListenerC12199 c14908;
        boolean zM17850 = false;
        for (ComponentCallbacksC11117 parentFragment = this; !zM17850 && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC7713) {
                zM17850 = ((InterfaceC7713) parentFragment).m17850();
            }
        }
        if (!zM17850 && (getContext() instanceof InterfaceC7713)) {
            zM17850 = ((InterfaceC7713) getContext()).m17850();
        }
        if (!zM17850 && (getActivity() instanceof InterfaceC7713)) {
            zM17850 = ((InterfaceC7713) getActivity()).m17850();
        }
        if (!zM17850 && getParentFragmentManager().m16809("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (abstractC12898 instanceof C8874) {
                String strM9037 = abstractC12898.m9037();
                c14908 = new C10886();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", strM9037);
                c14908.setArguments(bundle);
            } else if (abstractC12898 instanceof C20945) {
                String strM9038 = abstractC12898.m9037();
                c14908 = new C10215();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", strM9038);
                c14908.setArguments(bundle2);
            } else if (abstractC12898 instanceof C23626) {
                String strM9039 = abstractC12898.m9037();
                c14908 = new C14908();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", strM9039);
                c14908.setArguments(bundle3);
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + abstractC12898.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            c14908.setTargetFragment(this, 0);
            c14908.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51589(String str) {
        RunnableC21125 runnableC21125 = new RunnableC21125(this, str);
        if (this.f72721 == null) {
            this.f72718 = runnableC21125;
        } else {
            runnableC21125.run();
        }
    }
}
