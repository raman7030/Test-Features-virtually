package p067l;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1GH */
/* JADX INFO: loaded from: classes2.dex */
public final class C7961 {

    /* JADX INFO: renamed from: ֫ */
    public final C12458 f20929;

    /* JADX INFO: renamed from: ۧ */
    public final ComponentCallbacksC11117 f20930;

    /* JADX INFO: renamed from: ᩳ */
    public final C13326 f20933;

    /* JADX INFO: renamed from: ܿ */
    public boolean f20932 = false;

    /* JADX INFO: renamed from: ܽ */
    public int f20931 = -1;

    public C7961(C12458 c12458, C13326 c13326, ComponentCallbacksC11117 componentCallbacksC11117) {
        this.f20929 = c12458;
        this.f20933 = c13326;
        this.f20930 = componentCallbacksC11117;
    }

    public C7961(C12458 c12458, C13326 c13326, ClassLoader classLoader, C21846 c21846, C14666 c14666) {
        this.f20929 = c12458;
        this.f20933 = c13326;
        ComponentCallbacksC11117 componentCallbacksC11117Mo44095 = c21846.mo44095(c14666.f41863);
        Bundle bundle = c14666.f41862;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        componentCallbacksC11117Mo44095.setArguments(bundle);
        componentCallbacksC11117Mo44095.mWho = c14666.f41855;
        componentCallbacksC11117Mo44095.mFromLayout = c14666.f41859;
        componentCallbacksC11117Mo44095.mRestored = true;
        componentCallbacksC11117Mo44095.mFragmentId = c14666.f41852;
        componentCallbacksC11117Mo44095.mContainerId = c14666.f41861;
        componentCallbacksC11117Mo44095.mTag = c14666.f41860;
        componentCallbacksC11117Mo44095.mRetainInstance = c14666.f41857;
        componentCallbacksC11117Mo44095.mRemoving = c14666.f41854;
        componentCallbacksC11117Mo44095.mDetached = c14666.f41853;
        componentCallbacksC11117Mo44095.mHidden = c14666.f41858;
        componentCallbacksC11117Mo44095.mMaxState = EnumC15415.values()[c14666.f41856];
        Bundle bundle2 = c14666.f41864;
        if (bundle2 != null) {
            componentCallbacksC11117Mo44095.mSavedFragmentState = bundle2;
        } else {
            componentCallbacksC11117Mo44095.mSavedFragmentState = new Bundle();
        }
        this.f20930 = componentCallbacksC11117Mo44095;
        if (AbstractC7291.m16763(2)) {
            C12826.toString(componentCallbacksC11117Mo44095);
        }
    }

    public C7961(C12458 c12458, C13326 c13326, ComponentCallbacksC11117 componentCallbacksC11117, C14666 c14666) {
        this.f20929 = c12458;
        this.f20933 = c13326;
        this.f20930 = componentCallbacksC11117;
        componentCallbacksC11117.mSavedViewState = null;
        componentCallbacksC11117.mSavedViewRegistryState = null;
        componentCallbacksC11117.mBackStackNesting = 0;
        componentCallbacksC11117.mInLayout = false;
        componentCallbacksC11117.mAdded = false;
        ComponentCallbacksC11117 componentCallbacksC11118 = componentCallbacksC11117.mTarget;
        componentCallbacksC11117.mTargetWho = componentCallbacksC11118 != null ? componentCallbacksC11118.mWho : null;
        componentCallbacksC11117.mTarget = null;
        Bundle bundle = c14666.f41864;
        if (bundle != null) {
            componentCallbacksC11117.mSavedFragmentState = bundle;
        } else {
            componentCallbacksC11117.mSavedFragmentState = new Bundle();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final ComponentCallbacksC11117 m18414() {
        return this.f20930;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18402(int i) {
        this.f20931 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m18411() {
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f20930;
        if (componentCallbacksC11117.mFragmentManager == null) {
            return componentCallbacksC11117.mState;
        }
        int iMin = this.f20931;
        int i = C11985.f33426[componentCallbacksC11117.mMaxState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i == 3) {
                iMin = Math.min(iMin, 1);
            } else if (i == 4) {
                iMin = Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, -1);
            }
        }
        if (componentCallbacksC11117.mFromLayout) {
            if (componentCallbacksC11117.mInLayout) {
                iMin = Math.max(this.f20931, 2);
                View view = componentCallbacksC11117.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f20931 < 4 ? Math.min(iMin, componentCallbacksC11117.mState) : Math.min(iMin, 1);
            }
        }
        if (!componentCallbacksC11117.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = componentCallbacksC11117.mContainer;
        EnumC23778 enumC23778M12643 = viewGroup != null ? AbstractC5673.m12630(viewGroup, componentCallbacksC11117.getParentFragmentManager()).m12643(this) : null;
        if (enumC23778M12643 == EnumC23778.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (enumC23778M12643 == EnumC23778.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (componentCallbacksC11117.mRemoving) {
            if (componentCallbacksC11117.isInBackStack()) {
                iMin = Math.min(iMin, 1);
            } else {
                iMin = Math.min(iMin, -1);
            }
        }
        if (componentCallbacksC11117.mDeferStart && componentCallbacksC11117.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (AbstractC7291.m16763(2)) {
            C12826.toString(componentCallbacksC11117);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m18407() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.f20932;
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f20930;
        if (z) {
            if (AbstractC7291.m16763(2)) {
                C12826.toString(componentCallbacksC11117);
                return;
            }
            return;
        }
        try {
            this.f20932 = true;
            boolean z2 = false;
            while (true) {
                int iM18411 = m18411();
                int i = componentCallbacksC11117.mState;
                C13326 c13326 = this.f20933;
                if (iM18411 != i) {
                    C12458 c12458 = this.f20929;
                    if (iM18411 > i) {
                        switch (i + 1) {
                            case 0:
                                m18408();
                                break;
                            case 1:
                                if (AbstractC7291.m16763(3)) {
                                    C12826.toString(componentCallbacksC11117);
                                }
                                if (!componentCallbacksC11117.mIsCreated) {
                                    c12458.m28679(false);
                                    componentCallbacksC11117.performCreate(componentCallbacksC11117.mSavedFragmentState);
                                    c12458.m28685(false);
                                } else {
                                    componentCallbacksC11117.restoreChildFragmentState(componentCallbacksC11117.mSavedFragmentState);
                                    componentCallbacksC11117.mState = 1;
                                }
                                break;
                            case 2:
                                m18405();
                                m18413();
                                break;
                            case 3:
                                if (AbstractC7291.m16763(3)) {
                                    C12826.toString(componentCallbacksC11117);
                                }
                                componentCallbacksC11117.performActivityCreated(componentCallbacksC11117.mSavedFragmentState);
                                c12458.m28676(false);
                                break;
                            case 4:
                                if (componentCallbacksC11117.mView != null && (viewGroup3 = componentCallbacksC11117.mContainer) != null) {
                                    AbstractC5673.m12630(viewGroup3, componentCallbacksC11117.getParentFragmentManager()).m12638(EnumC21767.m49054(componentCallbacksC11117.mView.getVisibility()), this);
                                }
                                componentCallbacksC11117.mState = 4;
                                break;
                            case 5:
                                if (AbstractC7291.m16763(3)) {
                                    C12826.toString(componentCallbacksC11117);
                                }
                                componentCallbacksC11117.performStart();
                                c12458.m28680(false);
                                break;
                            case 6:
                                componentCallbacksC11117.mState = 6;
                                break;
                            case 7:
                                m18406();
                                break;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                m18415();
                                break;
                            case 0:
                                if (componentCallbacksC11117.mBeingSaved && c13326.m30438(componentCallbacksC11117.mWho) == null) {
                                    m18410();
                                }
                                m18412();
                                break;
                            case 1:
                                m18409();
                                componentCallbacksC11117.mState = 1;
                                break;
                            case 2:
                                componentCallbacksC11117.mInLayout = false;
                                componentCallbacksC11117.mState = 2;
                                break;
                            case 3:
                                if (AbstractC7291.m16763(3)) {
                                    C12826.toString(componentCallbacksC11117);
                                }
                                if (componentCallbacksC11117.mBeingSaved) {
                                    m18410();
                                } else if (componentCallbacksC11117.mView != null && componentCallbacksC11117.mSavedViewState == null) {
                                    m18404();
                                }
                                if (componentCallbacksC11117.mView != null && (viewGroup2 = componentCallbacksC11117.mContainer) != null) {
                                    AbstractC5673.m12630(viewGroup2, componentCallbacksC11117.getParentFragmentManager()).m12640(this);
                                }
                                componentCallbacksC11117.mState = 3;
                                break;
                            case 4:
                                if (AbstractC7291.m16763(3)) {
                                    C12826.toString(componentCallbacksC11117);
                                }
                                componentCallbacksC11117.performStop();
                                c12458.m28684(false);
                                break;
                            case 5:
                                componentCallbacksC11117.mState = 5;
                                break;
                            case 6:
                                if (AbstractC7291.m16763(3)) {
                                    C12826.toString(componentCallbacksC11117);
                                }
                                componentCallbacksC11117.performPause();
                                c12458.m28683(false);
                                break;
                        }
                    }
                    z2 = true;
                } else {
                    if (!z2 && i == -1 && componentCallbacksC11117.mRemoving && !componentCallbacksC11117.isInBackStack() && !componentCallbacksC11117.mBeingSaved) {
                        if (AbstractC7291.m16763(3)) {
                            C12826.toString(componentCallbacksC11117);
                        }
                        c13326.m30439().m52034(componentCallbacksC11117);
                        c13326.m30437(this);
                        if (AbstractC7291.m16763(3)) {
                            C12826.toString(componentCallbacksC11117);
                        }
                        componentCallbacksC11117.initState();
                    }
                    if (componentCallbacksC11117.mHiddenChanged) {
                        if (componentCallbacksC11117.mView != null && (viewGroup = componentCallbacksC11117.mContainer) != null) {
                            AbstractC5673 abstractC5673M12630 = AbstractC5673.m12630(viewGroup, componentCallbacksC11117.getParentFragmentManager());
                            if (componentCallbacksC11117.mHidden) {
                                abstractC5673M12630.m12637(this);
                            } else {
                                abstractC5673M12630.m12642(this);
                            }
                        }
                        AbstractC7291 abstractC7291 = componentCallbacksC11117.mFragmentManager;
                        if (abstractC7291 != null) {
                            abstractC7291.m16838(componentCallbacksC11117);
                        }
                        componentCallbacksC11117.mHiddenChanged = false;
                        componentCallbacksC11117.onHiddenChanged(componentCallbacksC11117.mHidden);
                        componentCallbacksC11117.mChildFragmentManager.m16801();
                    }
                    return;
                }
            }
        } finally {
            this.f20932 = false;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m18405() {
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f20930;
        if (componentCallbacksC11117.mFromLayout && componentCallbacksC11117.mInLayout && !componentCallbacksC11117.mPerformedCreateView) {
            if (AbstractC7291.m16763(3)) {
                C12826.toString(componentCallbacksC11117);
            }
            componentCallbacksC11117.performCreateView(componentCallbacksC11117.performGetLayoutInflater(componentCallbacksC11117.mSavedFragmentState), null, componentCallbacksC11117.mSavedFragmentState);
            View view = componentCallbacksC11117.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                componentCallbacksC11117.mView.setTag(R.id.MT_Protector, componentCallbacksC11117);
                if (componentCallbacksC11117.mHidden) {
                    componentCallbacksC11117.mView.setVisibility(8);
                }
                componentCallbacksC11117.performViewCreated();
                this.f20929.m28677(false);
                componentCallbacksC11117.mState = 2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18403(ClassLoader classLoader) {
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f20930;
        Bundle bundle = componentCallbacksC11117.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        componentCallbacksC11117.mSavedViewState = componentCallbacksC11117.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        componentCallbacksC11117.mSavedViewRegistryState = componentCallbacksC11117.mSavedFragmentState.getBundle("android:view_registry_state");
        componentCallbacksC11117.mTargetWho = componentCallbacksC11117.mSavedFragmentState.getString("android:target_state");
        if (componentCallbacksC11117.mTargetWho != null) {
            componentCallbacksC11117.mTargetRequestCode = componentCallbacksC11117.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Boolean bool = componentCallbacksC11117.mSavedUserVisibleHint;
        if (bool != null) {
            componentCallbacksC11117.mUserVisibleHint = bool.booleanValue();
            componentCallbacksC11117.mSavedUserVisibleHint = null;
        } else {
            componentCallbacksC11117.mUserVisibleHint = componentCallbacksC11117.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (componentCallbacksC11117.mUserVisibleHint) {
            return;
        }
        componentCallbacksC11117.mDeferStart = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18408() {
        boolean zM16763 = AbstractC7291.m16763(3);
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f20930;
        if (zM16763) {
            C12826.toString(componentCallbacksC11117);
        }
        ComponentCallbacksC11117 componentCallbacksC11118 = componentCallbacksC11117.mTarget;
        C7961 c7961M30444 = null;
        C13326 c13326 = this.f20933;
        if (componentCallbacksC11118 != null) {
            C7961 c7961M30445 = c13326.m30444(componentCallbacksC11118.mWho);
            if (c7961M30445 == null) {
                throw new IllegalStateException("Fragment " + componentCallbacksC11117 + " declared target fragment " + componentCallbacksC11117.mTarget + " that does not belong to this FragmentManager!");
            }
            componentCallbacksC11117.mTargetWho = componentCallbacksC11117.mTarget.mWho;
            componentCallbacksC11117.mTarget = null;
            c7961M30444 = c7961M30445;
        } else {
            String str = componentCallbacksC11117.mTargetWho;
            if (str != null && (c7961M30444 = c13326.m30444(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(componentCallbacksC11117);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(C10965.m25286(sb, componentCallbacksC11117.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (c7961M30444 != null) {
            c7961M30444.m18407();
        }
        componentCallbacksC11117.mHost = componentCallbacksC11117.mFragmentManager.m16803();
        componentCallbacksC11117.mParentFragment = componentCallbacksC11117.mFragmentManager.m16840();
        C12458 c12458 = this.f20929;
        c12458.m28689(false);
        componentCallbacksC11117.performAttach();
        c12458.m28682(false);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m18413() {
        String resourceName;
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f20930;
        if (componentCallbacksC11117.mFromLayout) {
            return;
        }
        if (AbstractC7291.m16763(3)) {
            C12826.toString(componentCallbacksC11117);
        }
        LayoutInflater layoutInflaterPerformGetLayoutInflater = componentCallbacksC11117.performGetLayoutInflater(componentCallbacksC11117.mSavedFragmentState);
        ViewGroup viewGroup = componentCallbacksC11117.mContainer;
        if (viewGroup == null) {
            int i = componentCallbacksC11117.mContainerId;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException(C9199.m21198("Cannot create fragment ", componentCallbacksC11117, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) componentCallbacksC11117.mFragmentManager.m16768().mo9201(componentCallbacksC11117.mContainerId);
                if (viewGroup == null) {
                    if (!componentCallbacksC11117.mRestored) {
                        try {
                            resourceName = componentCallbacksC11117.getResources().getResourceName(componentCallbacksC11117.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(componentCallbacksC11117.mContainerId) + " (" + resourceName + ") for fragment " + componentCallbacksC11117);
                    }
                } else if (!(viewGroup instanceof C23187)) {
                    C24448.m53939(componentCallbacksC11117, viewGroup);
                }
            }
        }
        componentCallbacksC11117.mContainer = viewGroup;
        componentCallbacksC11117.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, componentCallbacksC11117.mSavedFragmentState);
        View view = componentCallbacksC11117.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            componentCallbacksC11117.mView.setTag(R.id.MT_Protector, componentCallbacksC11117);
            if (viewGroup != null) {
                m18401();
            }
            if (componentCallbacksC11117.mHidden) {
                componentCallbacksC11117.mView.setVisibility(8);
            }
            View view2 = componentCallbacksC11117.mView;
            int i2 = C1717.f57146;
            if (view2.isAttachedToWindow()) {
                C1717.m43585(componentCallbacksC11117.mView);
            } else {
                View view3 = componentCallbacksC11117.mView;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13996(view3));
            }
            componentCallbacksC11117.performViewCreated();
            this.f20929.m28677(false);
            int visibility = componentCallbacksC11117.mView.getVisibility();
            componentCallbacksC11117.setPostOnViewCreatedAlpha(componentCallbacksC11117.mView.getAlpha());
            if (componentCallbacksC11117.mContainer != null && visibility == 0) {
                View viewFindFocus = componentCallbacksC11117.mView.findFocus();
                if (viewFindFocus != null) {
                    componentCallbacksC11117.setFocusedView(viewFindFocus);
                    if (AbstractC7291.m16763(2)) {
                        viewFindFocus.toString();
                        C12826.toString(componentCallbacksC11117);
                    }
                }
                componentCallbacksC11117.mView.setAlpha(0.0f);
            }
        }
        componentCallbacksC11117.mState = 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX INFO: renamed from: ۡ */
    public final void m18406() {
        boolean zM16763 = AbstractC7291.m16763(3);
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f20930;
        if (zM16763) {
            C12826.toString(componentCallbacksC11117);
        }
        View focusedView = componentCallbacksC11117.getFocusedView();
        if (focusedView != null) {
            if (focusedView == componentCallbacksC11117.mView) {
                focusedView.requestFocus();
                if (AbstractC7291.m16763(2)) {
                    focusedView.toString();
                    C12826.toString(componentCallbacksC11117);
                    C12826.toString(componentCallbacksC11117.mView.findFocus());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == componentCallbacksC11117.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                focusedView.requestFocus();
                if (AbstractC7291.m16763(2)) {
                    focusedView.toString();
                    C12826.toString(componentCallbacksC11117);
                    C12826.toString(componentCallbacksC11117.mView.findFocus());
                }
            }
        }
        componentCallbacksC11117.setFocusedView(null);
        componentCallbacksC11117.performResume();
        this.f20929.m28688(false);
        componentCallbacksC11117.mSavedFragmentState = null;
        componentCallbacksC11117.mSavedViewState = null;
        componentCallbacksC11117.mSavedViewRegistryState = null;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m18410() {
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f20930;
        C14666 c14666 = new C14666(componentCallbacksC11117);
        if (componentCallbacksC11117.mState <= -1 || c14666.f41864 != null) {
            c14666.f41864 = componentCallbacksC11117.mSavedFragmentState;
        } else {
            Bundle bundle = new Bundle();
            componentCallbacksC11117.performSaveInstanceState(bundle);
            this.f20929.m28681(false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (componentCallbacksC11117.mView != null) {
                m18404();
            }
            if (componentCallbacksC11117.mSavedViewState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", componentCallbacksC11117.mSavedViewState);
            }
            if (componentCallbacksC11117.mSavedViewRegistryState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", componentCallbacksC11117.mSavedViewRegistryState);
            }
            if (!componentCallbacksC11117.mUserVisibleHint) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", componentCallbacksC11117.mUserVisibleHint);
            }
            c14666.f41864 = bundle;
            if (componentCallbacksC11117.mTargetWho != null) {
                if (bundle == null) {
                    c14666.f41864 = new Bundle();
                }
                c14666.f41864.putString("android:target_state", componentCallbacksC11117.mTargetWho);
                int i = componentCallbacksC11117.mTargetRequestCode;
                if (i != 0) {
                    c14666.f41864.putInt("android:target_req_state", i);
                }
            }
        }
        this.f20933.m30421(componentCallbacksC11117.mWho, c14666);
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m18404() {
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f20930;
        if (componentCallbacksC11117.mView == null) {
            return;
        }
        if (AbstractC7291.m16763(2)) {
            C12826.toString(componentCallbacksC11117);
            C12826.toString(componentCallbacksC11117.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        componentCallbacksC11117.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            componentCallbacksC11117.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        componentCallbacksC11117.mViewLifecycleOwner.m10630(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        componentCallbacksC11117.mSavedViewRegistryState = bundle;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m18409() {
        View view;
        boolean zM16763 = AbstractC7291.m16763(3);
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f20930;
        if (zM16763) {
            C12826.toString(componentCallbacksC11117);
        }
        ViewGroup viewGroup = componentCallbacksC11117.mContainer;
        if (viewGroup != null && (view = componentCallbacksC11117.mView) != null) {
            viewGroup.removeView(view);
        }
        componentCallbacksC11117.performDestroyView();
        this.f20929.m28678(false);
        componentCallbacksC11117.mContainer = null;
        componentCallbacksC11117.mView = null;
        componentCallbacksC11117.mViewLifecycleOwner = null;
        componentCallbacksC11117.mViewLifecycleOwnerLiveData.mo4067((Object) null);
        componentCallbacksC11117.mInLayout = false;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m18412() {
        ComponentCallbacksC11117 componentCallbacksC11117M30435;
        boolean zM16763 = AbstractC7291.m16763(3);
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f20930;
        if (zM16763) {
            C12826.toString(componentCallbacksC11117);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = componentCallbacksC11117.mRemoving && !componentCallbacksC11117.isInBackStack();
        C13326 c13326 = this.f20933;
        if (z && !componentCallbacksC11117.mBeingSaved) {
            c13326.m30421(componentCallbacksC11117.mWho, null);
        }
        if (z || c13326.m30439().m52035(componentCallbacksC11117)) {
            AbstractC7093 abstractC7093 = componentCallbacksC11117.mHost;
            if (abstractC7093 instanceof InterfaceC14920) {
                zIsChangingConfigurations = c13326.m30439().m52038();
            } else if (C14110.m32033(abstractC7093.m16339())) {
                zIsChangingConfigurations = true ^ ((Activity) abstractC7093.m16339()).isChangingConfigurations();
            }
            if ((z && !componentCallbacksC11117.mBeingSaved) || zIsChangingConfigurations) {
                c13326.m30439().m52034(componentCallbacksC11117);
            }
            componentCallbacksC11117.performDestroy();
            this.f20929.m28687(false);
            for (C7961 c7961 : c13326.m30433()) {
                if (c7961 != null) {
                    ComponentCallbacksC11117 componentCallbacksC11118 = c7961.f20930;
                    if (componentCallbacksC11117.mWho.equals(componentCallbacksC11118.mTargetWho)) {
                        componentCallbacksC11118.mTarget = componentCallbacksC11117;
                        componentCallbacksC11118.mTargetWho = null;
                    }
                }
            }
            String str = componentCallbacksC11117.mTargetWho;
            if (str != null) {
                componentCallbacksC11117.mTarget = c13326.m30435(str);
            }
            c13326.m30437(this);
            return;
        }
        String str2 = componentCallbacksC11117.mTargetWho;
        if (str2 != null && (componentCallbacksC11117M30435 = c13326.m30435(str2)) != null && componentCallbacksC11117M30435.mRetainInstance) {
            componentCallbacksC11117.mTarget = componentCallbacksC11117M30435;
        }
        componentCallbacksC11117.mState = 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m18415() {
        boolean zM16763 = AbstractC7291.m16763(3);
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f20930;
        if (zM16763) {
            C12826.toString(componentCallbacksC11117);
        }
        componentCallbacksC11117.performDetach();
        this.f20929.m28686(false);
        componentCallbacksC11117.mState = -1;
        componentCallbacksC11117.mHost = null;
        componentCallbacksC11117.mParentFragment = null;
        componentCallbacksC11117.mFragmentManager = null;
        if ((!componentCallbacksC11117.mRemoving || componentCallbacksC11117.isInBackStack()) && !this.f20933.m30439().m52035(componentCallbacksC11117)) {
            return;
        }
        if (AbstractC7291.m16763(3)) {
            C12826.toString(componentCallbacksC11117);
        }
        componentCallbacksC11117.initState();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18401() {
        C13326 c13326 = this.f20933;
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f20930;
        componentCallbacksC11117.mContainer.addView(componentCallbacksC11117.mView, c13326.m30432(componentCallbacksC11117));
    }
}
