package l;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1GH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5885 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10616 f18074;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 f18075;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11530 f18078;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f18077 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f18076 = -1;

    public C5885(C10616 c10616, C11530 c11530, ComponentCallbacksC9205 componentCallbacksC9205) {
        this.f18074 = c10616;
        this.f18078 = c11530;
        this.f18075 = componentCallbacksC9205;
    }

    public C5885(C10616 c10616, C11530 c11530, ClassLoader classLoader, C20494 c20494, C12940 c12940) {
        this.f18074 = c10616;
        this.f18078 = c11530;
        ComponentCallbacksC9205 componentCallbacksC9205Mo41848 = c20494.mo41848(c12940.f38819);
        Bundle bundle = c12940.f38818;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        componentCallbacksC9205Mo41848.setArguments(bundle);
        componentCallbacksC9205Mo41848.mWho = c12940.f38811;
        componentCallbacksC9205Mo41848.mFromLayout = c12940.f38815;
        componentCallbacksC9205Mo41848.mRestored = true;
        componentCallbacksC9205Mo41848.mFragmentId = c12940.f38808;
        componentCallbacksC9205Mo41848.mContainerId = c12940.f38817;
        componentCallbacksC9205Mo41848.mTag = c12940.f38816;
        componentCallbacksC9205Mo41848.mRetainInstance = c12940.f38813;
        componentCallbacksC9205Mo41848.mRemoving = c12940.f38810;
        componentCallbacksC9205Mo41848.mDetached = c12940.f38809;
        componentCallbacksC9205Mo41848.mHidden = c12940.f38814;
        componentCallbacksC9205Mo41848.mMaxState = EnumC13728.values()[c12940.f38812];
        Bundle bundle2 = c12940.f38820;
        if (bundle2 != null) {
            componentCallbacksC9205Mo41848.mSavedFragmentState = bundle2;
        } else {
            componentCallbacksC9205Mo41848.mSavedFragmentState = new Bundle();
        }
        this.f18075 = componentCallbacksC9205Mo41848;
        if (AbstractC5180.m14853(2)) {
            C11003.toString(componentCallbacksC9205Mo41848);
        }
    }

    public C5885(C10616 c10616, C11530 c11530, ComponentCallbacksC9205 componentCallbacksC9205, C12940 c12940) {
        this.f18074 = c10616;
        this.f18078 = c11530;
        this.f18075 = componentCallbacksC9205;
        componentCallbacksC9205.mSavedViewState = null;
        componentCallbacksC9205.mSavedViewRegistryState = null;
        componentCallbacksC9205.mBackStackNesting = 0;
        componentCallbacksC9205.mInLayout = false;
        componentCallbacksC9205.mAdded = false;
        ComponentCallbacksC9205 componentCallbacksC9206 = componentCallbacksC9205.mTarget;
        componentCallbacksC9205.mTargetWho = componentCallbacksC9206 != null ? componentCallbacksC9206.mWho : null;
        componentCallbacksC9205.mTarget = null;
        Bundle bundle = c12940.f38820;
        if (bundle != null) {
            componentCallbacksC9205.mSavedFragmentState = bundle;
        } else {
            componentCallbacksC9205.mSavedFragmentState = new Bundle();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m16488() {
        return this.f18075;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16476(int i) {
        this.f18076 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m16485() {
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f18075;
        if (componentCallbacksC9205.mFragmentManager == null) {
            return componentCallbacksC9205.mState;
        }
        int iMin = this.f18076;
        int i = C10119.f30464[componentCallbacksC9205.mMaxState.ordinal()];
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
        if (componentCallbacksC9205.mFromLayout) {
            if (componentCallbacksC9205.mInLayout) {
                iMin = Math.max(this.f18076, 2);
                View view = componentCallbacksC9205.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f18076 < 4 ? Math.min(iMin, componentCallbacksC9205.mState) : Math.min(iMin, 1);
            }
        }
        if (!componentCallbacksC9205.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = componentCallbacksC9205.mContainer;
        EnumC22527 enumC22527M10648 = viewGroup != null ? AbstractC3477.m10635(viewGroup, componentCallbacksC9205.getParentFragmentManager()).m10648(this) : null;
        if (enumC22527M10648 == EnumC22527.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (enumC22527M10648 == EnumC22527.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (componentCallbacksC9205.mRemoving) {
            if (componentCallbacksC9205.isInBackStack()) {
                iMin = Math.min(iMin, 1);
            } else {
                iMin = Math.min(iMin, -1);
            }
        }
        if (componentCallbacksC9205.mDeferStart && componentCallbacksC9205.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (AbstractC5180.m14853(2)) {
            C11003.toString(componentCallbacksC9205);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m16481() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.f18077;
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f18075;
        if (z) {
            if (AbstractC5180.m14853(2)) {
                C11003.toString(componentCallbacksC9205);
                return;
            }
            return;
        }
        try {
            this.f18077 = true;
            boolean z2 = false;
            while (true) {
                int iM16485 = m16485();
                int i = componentCallbacksC9205.mState;
                C11530 c11530 = this.f18078;
                if (iM16485 != i) {
                    C10616 c10616 = this.f18074;
                    if (iM16485 > i) {
                        switch (i + 1) {
                            case 0:
                                m16482();
                                break;
                            case 1:
                                if (AbstractC5180.m14853(3)) {
                                    C11003.toString(componentCallbacksC9205);
                                }
                                if (!componentCallbacksC9205.mIsCreated) {
                                    c10616.m26639(false);
                                    componentCallbacksC9205.performCreate(componentCallbacksC9205.mSavedFragmentState);
                                    c10616.m26645(false);
                                } else {
                                    componentCallbacksC9205.restoreChildFragmentState(componentCallbacksC9205.mSavedFragmentState);
                                    componentCallbacksC9205.mState = 1;
                                }
                                break;
                            case 2:
                                m16479();
                                m16487();
                                break;
                            case 3:
                                if (AbstractC5180.m14853(3)) {
                                    C11003.toString(componentCallbacksC9205);
                                }
                                componentCallbacksC9205.performActivityCreated(componentCallbacksC9205.mSavedFragmentState);
                                c10616.m26636(false);
                                break;
                            case 4:
                                if (componentCallbacksC9205.mView != null && (viewGroup3 = componentCallbacksC9205.mContainer) != null) {
                                    AbstractC3477.m10635(viewGroup3, componentCallbacksC9205.getParentFragmentManager()).m10643(EnumC20411.m46731(componentCallbacksC9205.mView.getVisibility()), this);
                                }
                                componentCallbacksC9205.mState = 4;
                                break;
                            case 5:
                                if (AbstractC5180.m14853(3)) {
                                    C11003.toString(componentCallbacksC9205);
                                }
                                componentCallbacksC9205.performStart();
                                c10616.m26640(false);
                                break;
                            case 6:
                                componentCallbacksC9205.mState = 6;
                                break;
                            case 7:
                                m16480();
                                break;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                m16489();
                                break;
                            case 0:
                                if (componentCallbacksC9205.mBeingSaved && c11530.m28392(componentCallbacksC9205.mWho) == null) {
                                    m16484();
                                }
                                m16486();
                                break;
                            case 1:
                                m16483();
                                componentCallbacksC9205.mState = 1;
                                break;
                            case 2:
                                componentCallbacksC9205.mInLayout = false;
                                componentCallbacksC9205.mState = 2;
                                break;
                            case 3:
                                if (AbstractC5180.m14853(3)) {
                                    C11003.toString(componentCallbacksC9205);
                                }
                                if (componentCallbacksC9205.mBeingSaved) {
                                    m16484();
                                } else if (componentCallbacksC9205.mView != null && componentCallbacksC9205.mSavedViewState == null) {
                                    m16478();
                                }
                                if (componentCallbacksC9205.mView != null && (viewGroup2 = componentCallbacksC9205.mContainer) != null) {
                                    AbstractC3477.m10635(viewGroup2, componentCallbacksC9205.getParentFragmentManager()).m10645(this);
                                }
                                componentCallbacksC9205.mState = 3;
                                break;
                            case 4:
                                if (AbstractC5180.m14853(3)) {
                                    C11003.toString(componentCallbacksC9205);
                                }
                                componentCallbacksC9205.performStop();
                                c10616.m26644(false);
                                break;
                            case 5:
                                componentCallbacksC9205.mState = 5;
                                break;
                            case 6:
                                if (AbstractC5180.m14853(3)) {
                                    C11003.toString(componentCallbacksC9205);
                                }
                                componentCallbacksC9205.performPause();
                                c10616.m26643(false);
                                break;
                        }
                    }
                    z2 = true;
                } else {
                    if (!z2 && i == -1 && componentCallbacksC9205.mRemoving && !componentCallbacksC9205.isInBackStack() && !componentCallbacksC9205.mBeingSaved) {
                        if (AbstractC5180.m14853(3)) {
                            C11003.toString(componentCallbacksC9205);
                        }
                        c11530.m28393().m49696(componentCallbacksC9205);
                        c11530.m28391(this);
                        if (AbstractC5180.m14853(3)) {
                            C11003.toString(componentCallbacksC9205);
                        }
                        componentCallbacksC9205.initState();
                    }
                    if (componentCallbacksC9205.mHiddenChanged) {
                        if (componentCallbacksC9205.mView != null && (viewGroup = componentCallbacksC9205.mContainer) != null) {
                            AbstractC3477 abstractC3477M10635 = AbstractC3477.m10635(viewGroup, componentCallbacksC9205.getParentFragmentManager());
                            if (componentCallbacksC9205.mHidden) {
                                abstractC3477M10635.m10642(this);
                            } else {
                                abstractC3477M10635.m10647(this);
                            }
                        }
                        AbstractC5180 abstractC5180 = componentCallbacksC9205.mFragmentManager;
                        if (abstractC5180 != null) {
                            abstractC5180.m14928(componentCallbacksC9205);
                        }
                        componentCallbacksC9205.mHiddenChanged = false;
                        componentCallbacksC9205.onHiddenChanged(componentCallbacksC9205.mHidden);
                        componentCallbacksC9205.mChildFragmentManager.m14891();
                    }
                    return;
                }
            }
        } finally {
            this.f18077 = false;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m16479() {
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f18075;
        if (componentCallbacksC9205.mFromLayout && componentCallbacksC9205.mInLayout && !componentCallbacksC9205.mPerformedCreateView) {
            if (AbstractC5180.m14853(3)) {
                C11003.toString(componentCallbacksC9205);
            }
            componentCallbacksC9205.performCreateView(componentCallbacksC9205.performGetLayoutInflater(componentCallbacksC9205.mSavedFragmentState), null, componentCallbacksC9205.mSavedFragmentState);
            View view = componentCallbacksC9205.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                componentCallbacksC9205.mView.setTag(R.id.MT_Protector, componentCallbacksC9205);
                if (componentCallbacksC9205.mHidden) {
                    componentCallbacksC9205.mView.setVisibility(8);
                }
                componentCallbacksC9205.performViewCreated();
                this.f18074.m26637(false);
                componentCallbacksC9205.mState = 2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16477(ClassLoader classLoader) {
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f18075;
        Bundle bundle = componentCallbacksC9205.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        componentCallbacksC9205.mSavedViewState = componentCallbacksC9205.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        componentCallbacksC9205.mSavedViewRegistryState = componentCallbacksC9205.mSavedFragmentState.getBundle("android:view_registry_state");
        componentCallbacksC9205.mTargetWho = componentCallbacksC9205.mSavedFragmentState.getString("android:target_state");
        if (componentCallbacksC9205.mTargetWho != null) {
            componentCallbacksC9205.mTargetRequestCode = componentCallbacksC9205.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Boolean bool = componentCallbacksC9205.mSavedUserVisibleHint;
        if (bool != null) {
            componentCallbacksC9205.mUserVisibleHint = bool.booleanValue();
            componentCallbacksC9205.mSavedUserVisibleHint = null;
        } else {
            componentCallbacksC9205.mUserVisibleHint = componentCallbacksC9205.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (componentCallbacksC9205.mUserVisibleHint) {
            return;
        }
        componentCallbacksC9205.mDeferStart = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16482() {
        boolean zM14853 = AbstractC5180.m14853(3);
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f18075;
        if (zM14853) {
            C11003.toString(componentCallbacksC9205);
        }
        ComponentCallbacksC9205 componentCallbacksC9206 = componentCallbacksC9205.mTarget;
        C5885 c5885M28398 = null;
        C11530 c11530 = this.f18078;
        if (componentCallbacksC9206 != null) {
            C5885 c5885M28399 = c11530.m28398(componentCallbacksC9206.mWho);
            if (c5885M28399 == null) {
                throw new IllegalStateException("Fragment " + componentCallbacksC9205 + " declared target fragment " + componentCallbacksC9205.mTarget + " that does not belong to this FragmentManager!");
            }
            componentCallbacksC9205.mTargetWho = componentCallbacksC9205.mTarget.mWho;
            componentCallbacksC9205.mTarget = null;
            c5885M28398 = c5885M28399;
        } else {
            String str = componentCallbacksC9205.mTargetWho;
            if (str != null && (c5885M28398 = c11530.m28398(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(componentCallbacksC9205);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(C9045.m23341(sb, componentCallbacksC9205.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (c5885M28398 != null) {
            c5885M28398.m16481();
        }
        componentCallbacksC9205.mHost = componentCallbacksC9205.mFragmentManager.m14893();
        componentCallbacksC9205.mParentFragment = componentCallbacksC9205.mFragmentManager.m14930();
        C10616 c10616 = this.f18074;
        c10616.m26649(false);
        componentCallbacksC9205.performAttach();
        c10616.m26642(false);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m16487() {
        String resourceName;
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f18075;
        if (componentCallbacksC9205.mFromLayout) {
            return;
        }
        if (AbstractC5180.m14853(3)) {
            C11003.toString(componentCallbacksC9205);
        }
        LayoutInflater layoutInflaterPerformGetLayoutInflater = componentCallbacksC9205.performGetLayoutInflater(componentCallbacksC9205.mSavedFragmentState);
        ViewGroup viewGroup = componentCallbacksC9205.mContainer;
        if (viewGroup == null) {
            int i = componentCallbacksC9205.mContainerId;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException(C7187.m19251("Cannot create fragment ", componentCallbacksC9205, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) componentCallbacksC9205.mFragmentManager.m14858().mo7106(componentCallbacksC9205.mContainerId);
                if (viewGroup == null) {
                    if (!componentCallbacksC9205.mRestored) {
                        try {
                            resourceName = componentCallbacksC9205.getResources().getResourceName(componentCallbacksC9205.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(componentCallbacksC9205.mContainerId) + " (" + resourceName + ") for fragment " + componentCallbacksC9205);
                    }
                } else if (!(viewGroup instanceof C21905)) {
                    C23232.m51542(componentCallbacksC9205, viewGroup);
                }
            }
        }
        componentCallbacksC9205.mContainer = viewGroup;
        componentCallbacksC9205.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, componentCallbacksC9205.mSavedFragmentState);
        View view = componentCallbacksC9205.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            componentCallbacksC9205.mView.setTag(R.id.MT_Protector, componentCallbacksC9205);
            if (viewGroup != null) {
                m16475();
            }
            if (componentCallbacksC9205.mHidden) {
                componentCallbacksC9205.mView.setVisibility(8);
            }
            View view2 = componentCallbacksC9205.mView;
            int i2 = C17648.f53953;
            if (view2.isAttachedToWindow()) {
                C17648.m41339(componentCallbacksC9205.mView);
            } else {
                View view3 = componentCallbacksC9205.mView;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC12235(view3));
            }
            componentCallbacksC9205.performViewCreated();
            this.f18074.m26637(false);
            int visibility = componentCallbacksC9205.mView.getVisibility();
            componentCallbacksC9205.setPostOnViewCreatedAlpha(componentCallbacksC9205.mView.getAlpha());
            if (componentCallbacksC9205.mContainer != null && visibility == 0) {
                View viewFindFocus = componentCallbacksC9205.mView.findFocus();
                if (viewFindFocus != null) {
                    componentCallbacksC9205.setFocusedView(viewFindFocus);
                    if (AbstractC5180.m14853(2)) {
                        viewFindFocus.toString();
                        C11003.toString(componentCallbacksC9205);
                    }
                }
                componentCallbacksC9205.mView.setAlpha(0.0f);
            }
        }
        componentCallbacksC9205.mState = 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m16480() {
        boolean zM14853 = AbstractC5180.m14853(3);
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f18075;
        if (zM14853) {
            C11003.toString(componentCallbacksC9205);
        }
        View focusedView = componentCallbacksC9205.getFocusedView();
        if (focusedView != null) {
            if (focusedView == componentCallbacksC9205.mView) {
                focusedView.requestFocus();
                if (AbstractC5180.m14853(2)) {
                    focusedView.toString();
                    C11003.toString(componentCallbacksC9205);
                    C11003.toString(componentCallbacksC9205.mView.findFocus());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == componentCallbacksC9205.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                focusedView.requestFocus();
                if (AbstractC5180.m14853(2)) {
                    focusedView.toString();
                    C11003.toString(componentCallbacksC9205);
                    C11003.toString(componentCallbacksC9205.mView.findFocus());
                }
            }
        }
        componentCallbacksC9205.setFocusedView(null);
        componentCallbacksC9205.performResume();
        this.f18074.m26648(false);
        componentCallbacksC9205.mSavedFragmentState = null;
        componentCallbacksC9205.mSavedViewState = null;
        componentCallbacksC9205.mSavedViewRegistryState = null;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m16484() {
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f18075;
        C12940 c12940 = new C12940(componentCallbacksC9205);
        if (componentCallbacksC9205.mState <= -1 || c12940.f38820 != null) {
            c12940.f38820 = componentCallbacksC9205.mSavedFragmentState;
        } else {
            Bundle bundle = new Bundle();
            componentCallbacksC9205.performSaveInstanceState(bundle);
            this.f18074.m26641(false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (componentCallbacksC9205.mView != null) {
                m16478();
            }
            if (componentCallbacksC9205.mSavedViewState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", componentCallbacksC9205.mSavedViewState);
            }
            if (componentCallbacksC9205.mSavedViewRegistryState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", componentCallbacksC9205.mSavedViewRegistryState);
            }
            if (!componentCallbacksC9205.mUserVisibleHint) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", componentCallbacksC9205.mUserVisibleHint);
            }
            c12940.f38820 = bundle;
            if (componentCallbacksC9205.mTargetWho != null) {
                if (bundle == null) {
                    c12940.f38820 = new Bundle();
                }
                c12940.f38820.putString("android:target_state", componentCallbacksC9205.mTargetWho);
                int i = componentCallbacksC9205.mTargetRequestCode;
                if (i != 0) {
                    c12940.f38820.putInt("android:target_req_state", i);
                }
            }
        }
        this.f18078.m28375(componentCallbacksC9205.mWho, c12940);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m16478() {
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f18075;
        if (componentCallbacksC9205.mView == null) {
            return;
        }
        if (AbstractC5180.m14853(2)) {
            C11003.toString(componentCallbacksC9205);
            C11003.toString(componentCallbacksC9205.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        componentCallbacksC9205.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            componentCallbacksC9205.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        componentCallbacksC9205.mViewLifecycleOwner.m8567(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        componentCallbacksC9205.mSavedViewRegistryState = bundle;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m16483() {
        View view;
        boolean zM14853 = AbstractC5180.m14853(3);
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f18075;
        if (zM14853) {
            C11003.toString(componentCallbacksC9205);
        }
        ViewGroup viewGroup = componentCallbacksC9205.mContainer;
        if (viewGroup != null && (view = componentCallbacksC9205.mView) != null) {
            viewGroup.removeView(view);
        }
        componentCallbacksC9205.performDestroyView();
        this.f18074.m26638(false);
        componentCallbacksC9205.mContainer = null;
        componentCallbacksC9205.mView = null;
        componentCallbacksC9205.mViewLifecycleOwner = null;
        componentCallbacksC9205.mViewLifecycleOwnerLiveData.mo1669((Object) null);
        componentCallbacksC9205.mInLayout = false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m16486() {
        ComponentCallbacksC9205 componentCallbacksC9205M28389;
        boolean zM14853 = AbstractC5180.m14853(3);
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f18075;
        if (zM14853) {
            C11003.toString(componentCallbacksC9205);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = componentCallbacksC9205.mRemoving && !componentCallbacksC9205.isInBackStack();
        C11530 c11530 = this.f18078;
        if (z && !componentCallbacksC9205.mBeingSaved) {
            c11530.m28375(componentCallbacksC9205.mWho, null);
        }
        if (z || c11530.m28393().m49697(componentCallbacksC9205)) {
            AbstractC4971 abstractC4971 = componentCallbacksC9205.mHost;
            if (abstractC4971 instanceof InterfaceC13207) {
                zIsChangingConfigurations = c11530.m28393().m49700();
            } else if (C12354.m29972(abstractC4971.m14435())) {
                zIsChangingConfigurations = true ^ ((Activity) abstractC4971.m14435()).isChangingConfigurations();
            }
            if ((z && !componentCallbacksC9205.mBeingSaved) || zIsChangingConfigurations) {
                c11530.m28393().m49696(componentCallbacksC9205);
            }
            componentCallbacksC9205.performDestroy();
            this.f18074.m26647(false);
            for (C5885 c5885 : c11530.m28387()) {
                if (c5885 != null) {
                    ComponentCallbacksC9205 componentCallbacksC9206 = c5885.f18075;
                    if (componentCallbacksC9205.mWho.equals(componentCallbacksC9206.mTargetWho)) {
                        componentCallbacksC9206.mTarget = componentCallbacksC9205;
                        componentCallbacksC9206.mTargetWho = null;
                    }
                }
            }
            String str = componentCallbacksC9205.mTargetWho;
            if (str != null) {
                componentCallbacksC9205.mTarget = c11530.m28389(str);
            }
            c11530.m28391(this);
            return;
        }
        String str2 = componentCallbacksC9205.mTargetWho;
        if (str2 != null && (componentCallbacksC9205M28389 = c11530.m28389(str2)) != null && componentCallbacksC9205M28389.mRetainInstance) {
            componentCallbacksC9205.mTarget = componentCallbacksC9205M28389;
        }
        componentCallbacksC9205.mState = 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m16489() {
        boolean zM14853 = AbstractC5180.m14853(3);
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f18075;
        if (zM14853) {
            C11003.toString(componentCallbacksC9205);
        }
        componentCallbacksC9205.performDetach();
        this.f18074.m26646(false);
        componentCallbacksC9205.mState = -1;
        componentCallbacksC9205.mHost = null;
        componentCallbacksC9205.mParentFragment = null;
        componentCallbacksC9205.mFragmentManager = null;
        if ((!componentCallbacksC9205.mRemoving || componentCallbacksC9205.isInBackStack()) && !this.f18078.m28393().m49697(componentCallbacksC9205)) {
            return;
        }
        if (AbstractC5180.m14853(3)) {
            C11003.toString(componentCallbacksC9205);
        }
        componentCallbacksC9205.initState();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16475() {
        C11530 c11530 = this.f18078;
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f18075;
        componentCallbacksC9205.mContainer.addView(componentCallbacksC9205.mView, c11530.m28386(componentCallbacksC9205));
    }
}
