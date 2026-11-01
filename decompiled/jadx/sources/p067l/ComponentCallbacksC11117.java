package p067l;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۡ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes4.dex */
public class ComponentCallbacksC11117 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC24784, InterfaceC14920, InterfaceC6699, InterfaceC23548 {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public C16480 mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    public boolean mCalled;
    public AbstractC7291 mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    public int mContentLayoutId;
    public InterfaceC16931 mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public AbstractC7291 mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public AbstractC7093 mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public C22103 mLifecycleRegistry;
    public EnumC15415 mMaxState;
    public boolean mMenuVisible;
    public final AtomicInteger mNextLocalRequestCode;
    public final ArrayList mOnPreAttachedListeners;
    public ComponentCallbacksC11117 mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public final AbstractC9105 mSavedStateAttachListener;
    public C22878 mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray mSavedViewState;
    public int mState;
    public String mTag;
    public ComponentCallbacksC11117 mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public C5003 mViewLifecycleOwner;
    public C7350 mViewLifecycleOwnerLiveData;
    public String mWho;

    @Deprecated
    public void onAttachFragment(ComponentCallbacksC11117 componentCallbacksC11117) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Override // p067l.InterfaceC24784
    public AbstractC9381 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public InterfaceC24784 getViewLifecycleOwner() {
        C5003 c5003 = this.mViewLifecycleOwner;
        if (c5003 != null) {
            return c5003;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public AbstractC2655 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // p067l.InterfaceC14920
    public C5533 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m25647() == EnumC15415.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        return this.mFragmentManager.m16841(this);
    }

    /* JADX INFO: renamed from: ܽ */
    private int m25647() {
        EnumC15415 enumC15415 = this.mMaxState;
        if (enumC15415 == EnumC15415.INITIALIZED || this.mParentFragment == null) {
            return enumC15415.ordinal();
        }
        return Math.min(enumC15415.ordinal(), this.mParentFragment.m25647());
    }

    @Override // p067l.InterfaceC6699
    public InterfaceC16931 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && AbstractC7291.m16763(3)) {
                C12826.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new C4863(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @Override // p067l.InterfaceC6699
    public AbstractC9556 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && AbstractC7291.m16763(3)) {
            C12826.toString(requireContext().getApplicationContext());
        }
        C17901 c17901 = new C17901();
        if (application != null) {
            c17901.m22254().put(C10227.f28340, application);
        }
        c17901.m22254().put(C22298.f70433, this);
        c17901.m22254().put(C22298.f70434, this);
        if (getArguments() != null) {
            c17901.m22254().put(C22298.f70432, getArguments());
        }
        return c17901;
    }

    @Override // p067l.InterfaceC23548
    public final C16841 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m51093();
    }

    public ComponentCallbacksC11117() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C3267();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC13540(this);
        this.mMaxState = EnumC15415.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C7350();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList();
        this.mSavedStateAttachListener = new C24268(this);
        m25649();
    }

    public ComponentCallbacksC11117(int i) {
        this();
        this.mContentLayoutId = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m25649() {
        this.mLifecycleRegistry = new C22103(this);
        this.mSavedStateRegistryController = new C22878(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        m25645(this.mSavedStateAttachListener);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static ComponentCallbacksC11117 m25641(Context context, String str) {
        return m25642(context, str, (Bundle) null);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static ComponentCallbacksC11117 m25642(Context context, String str, Bundle bundle) {
        try {
            ComponentCallbacksC11117 componentCallbacksC11117 = (ComponentCallbacksC11117) C21846.m49284(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(componentCallbacksC11117.getClass().getClassLoader());
                componentCallbacksC11117.setArguments(bundle);
            }
            return componentCallbacksC11117;
        } catch (IllegalAccessException e) {
            throw new C25198(C6988.m16053("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C25198(C6988.m16053("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C25198(C6988.m16053("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C25198(C6988.m16053("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m10627(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C14390(C9199.m21198("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m10629(EnumC24133.ON_CREATE);
        }
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final String getTag() {
        return this.mTag;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(C9199.m21198("Fragment ", this, " does not have any arguments."));
    }

    public final boolean isStateSaved() {
        AbstractC7291 abstractC7291 = this.mFragmentManager;
        if (abstractC7291 == null) {
            return false;
        }
        return abstractC7291.m16820();
    }

    public void setInitialSavedState(C11788 c11788) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (c11788 == null || (bundle = c11788.f32938) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    @Deprecated
    public void setTargetFragment(ComponentCallbacksC11117 componentCallbacksC11117, int i) {
        if (componentCallbacksC11117 != null) {
            C24448.m53936(this, componentCallbacksC11117, i);
        }
        AbstractC7291 abstractC7291 = this.mFragmentManager;
        AbstractC7291 abstractC7292 = componentCallbacksC11117 != null ? componentCallbacksC11117.mFragmentManager : null;
        if (abstractC7291 != null && abstractC7292 != null && abstractC7291 != abstractC7292) {
            throw new IllegalArgumentException(C9199.m21198("Fragment ", componentCallbacksC11117, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (ComponentCallbacksC11117 componentCallbacksC11117M25643 = componentCallbacksC11117; componentCallbacksC11117M25643 != null; componentCallbacksC11117M25643 = componentCallbacksC11117M25643.m25643(false)) {
            if (componentCallbacksC11117M25643.equals(this)) {
                throw new IllegalArgumentException("Setting " + componentCallbacksC11117 + " as the target of " + this + " would create a target cycle");
            }
        }
        if (componentCallbacksC11117 == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || componentCallbacksC11117.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = componentCallbacksC11117;
        } else {
            this.mTargetWho = componentCallbacksC11117.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public final ComponentCallbacksC11117 getTargetFragment() {
        return m25643(true);
    }

    /* JADX INFO: renamed from: ֫ */
    private ComponentCallbacksC11117 m25643(boolean z) {
        String str;
        if (z) {
            C24448.m53942(this);
        }
        ComponentCallbacksC11117 componentCallbacksC11117 = this.mTarget;
        if (componentCallbacksC11117 != null) {
            return componentCallbacksC11117;
        }
        AbstractC7291 abstractC7291 = this.mFragmentManager;
        if (abstractC7291 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return abstractC7291.m16773(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C24448.m53940(this);
        return this.mTargetRequestCode;
    }

    public Context getContext() {
        AbstractC7093 abstractC7093 = this.mHost;
        if (abstractC7093 == null) {
            return null;
        }
        return abstractC7093.m16339();
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(C9199.m21198("Fragment ", this, " not attached to a context."));
    }

    public final ActivityC3069 getActivity() {
        AbstractC7093 abstractC7093 = this.mHost;
        if (abstractC7093 == null) {
            return null;
        }
        return (ActivityC3069) abstractC7093.m16337();
    }

    public final ActivityC3069 requireActivity() {
        ActivityC3069 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C9199.m21198("Fragment ", this, " not attached to an activity."));
    }

    public final Object getHost() {
        AbstractC7093 abstractC7093 = this.mHost;
        if (abstractC7093 == null) {
            return null;
        }
        return abstractC7093.mo16336();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(C9199.m21198("Fragment ", this, " not attached to a host."));
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @Deprecated
    public final AbstractC7291 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final AbstractC7291 getParentFragmentManager() {
        AbstractC7291 abstractC7291 = this.mFragmentManager;
        if (abstractC7291 != null) {
            return abstractC7291;
        }
        throw new IllegalStateException(C9199.m21198("Fragment ", this, " not associated with a fragment manager."));
    }

    @Deprecated
    public final AbstractC7291 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final AbstractC7291 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(C9199.m21198("Fragment ", this, " has not been attached yet."));
    }

    public final ComponentCallbacksC11117 getParentFragment() {
        return this.mParentFragment;
    }

    public final ComponentCallbacksC11117 requireParentFragment() {
        ComponentCallbacksC11117 parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(C9199.m21198("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        AbstractC7291 abstractC7291 = this.mFragmentManager;
        if (abstractC7291 != null) {
            ComponentCallbacksC11117 componentCallbacksC11117 = this.mParentFragment;
            abstractC7291.getClass();
            if (componentCallbacksC11117 == null ? false : componentCallbacksC11117.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            ComponentCallbacksC11117 componentCallbacksC11117 = this.mParentFragment;
            if (!(componentCallbacksC11117 == null ? true : componentCallbacksC11117.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        C24448.m53941(this);
        this.mRetainInstance = z;
        AbstractC7291 abstractC7291 = this.mFragmentManager;
        if (abstractC7291 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            abstractC7291.m16813(this);
        } else {
            abstractC7291.m16805(this);
        }
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C24448.m53938(this);
        return this.mRetainInstance;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.mo16340();
        }
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo16340();
            }
        }
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        C24448.m53937(this, z);
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            AbstractC7291 abstractC7291 = this.mFragmentManager;
            abstractC7291.m16779(abstractC7291.m16832(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Deprecated
    public AbstractC18572 getLoaderManager() {
        return AbstractC18572.m42264(this);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        AbstractC7093 abstractC7093 = this.mHost;
        if (abstractC7093 == null) {
            throw new IllegalStateException(C9199.m21198("Fragment ", this, " not attached to Activity"));
        }
        abstractC7093.m16331(intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(C9199.m21198("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().m16780(this, intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(C9199.m21198("Fragment ", this, " not attached to Activity"));
        }
        if (AbstractC7291.m16763(2)) {
            toString();
            C12826.toString(intentSender);
            C12826.toString(intent);
            C12826.toString(bundle);
        }
        getParentFragmentManager().m16781(this, intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (AbstractC7291.m16763(2)) {
            toString();
            C12826.toString(intent);
        }
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost == null) {
            throw new IllegalStateException(C9199.m21198("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().m16784(this, strArr, i);
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC7093 abstractC7093 = this.mHost;
        if (abstractC7093 != null) {
            return abstractC7093.mo16335(str);
        }
        return false;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC7093 abstractC7093 = this.mHost;
        if (abstractC7093 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterMo16334 = abstractC7093.mo16334();
        layoutInflaterMo16334.setFactory2(this.mChildFragmentManager.m16823());
        return layoutInflaterMo16334;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC7093 abstractC7093 = this.mHost;
        Activity activityM16337 = abstractC7093 == null ? null : abstractC7093.m16337();
        if (activityM16337 != null) {
            this.mCalled = false;
            onInflate(activityM16337, attributeSet, bundle);
        }
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC7093 abstractC7093 = this.mHost;
        Activity activityM16337 = abstractC7093 == null ? null : abstractC7093.m16337();
        if (activityM16337 != null) {
            this.mCalled = false;
            onAttach(activityM16337);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        AbstractC7291 abstractC7291 = this.mChildFragmentManager;
        if (abstractC7291.f19090 >= 1) {
            return;
        }
        abstractC7291.m16830();
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.m16775(parcelable);
        this.mChildFragmentManager.m16830();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public View getView() {
        return this.mView;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C9199.m21198("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void initState() {
        m25649();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C3267();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public void setEnterSharedElementCallback(AbstractC2006 abstractC2006) {
        m25646().getClass();
    }

    public void setExitSharedElementCallback(AbstractC2006 abstractC2006) {
        m25646().getClass();
    }

    public void setEnterTransition(Object obj) {
        m25646().f48399 = obj;
    }

    public Object getEnterTransition() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return null;
        }
        return c16480.f48399;
    }

    public void setReturnTransition(Object obj) {
        m25646().f48400 = obj;
    }

    public Object getReturnTransition() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return null;
        }
        Object obj = c16480.f48400;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    public void setExitTransition(Object obj) {
        m25646().f48403 = obj;
    }

    public Object getExitTransition() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return null;
        }
        return c16480.f48403;
    }

    public void setReenterTransition(Object obj) {
        m25646().f48389 = obj;
    }

    public Object getReenterTransition() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return null;
        }
        Object obj = c16480.f48389;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        m25646().f48401 = obj;
    }

    public Object getSharedElementEnterTransition() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return null;
        }
        return c16480.f48401;
    }

    public void setSharedElementReturnTransition(Object obj) {
        m25646().f48385 = obj;
    }

    public Object getSharedElementReturnTransition() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return null;
        }
        Object obj = c16480.f48385;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        m25646().f48387 = Boolean.valueOf(z);
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null || (bool = c16480.f48387) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        m25646().f48394 = Boolean.valueOf(z);
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null || (bool = c16480.f48394) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void postponeEnterTransition() {
        m25646().f48398 = true;
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        m25646().f48398 = true;
        AbstractC7291 abstractC7291 = this.mFragmentManager;
        if (abstractC7291 != null) {
            handler = abstractC7291.m16803().m16338();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !m25646().f48398) {
            return;
        }
        if (this.mHost == null) {
            m25646().f48398 = false;
        } else if (Looper.myLooper() != this.mHost.m16338().getLooper()) {
            this.mHost.m16338().postAtFrontOfQueue(new RunnableC15550(this));
        } else {
            callStartTransitionListener(true);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        AbstractC7291 abstractC7291;
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 != null) {
            c16480.f48398 = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (abstractC7291 = this.mFragmentManager) == null) {
            return;
        }
        AbstractC5673 abstractC5673M12631 = AbstractC5673.m12631(viewGroup, abstractC7291.m16836());
        abstractC5673M12631.m12644();
        if (z) {
            this.mHost.m16338().post(new RunnableC9516(abstractC5673M12631));
        } else {
            abstractC5673M12631.m12635();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        ComponentCallbacksC11117 componentCallbacksC11117M25643 = m25643(false);
        if (componentCallbacksC11117M25643 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(componentCallbacksC11117M25643);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC18572.m42264(this).mo42266(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m16777(C17588.m40053(str, EnumC2483.f3919), fileDescriptor, printWriter, strArr);
    }

    public ComponentCallbacksC11117 findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.m16826(str);
    }

    public AbstractC17150 createFragmentContainer() {
        return new C4411(this);
    }

    public void performAttach() {
        Iterator it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            ((AbstractC9105) it.next()).mo21042();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m16778(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m16339());
        if (!this.mCalled) {
            throw new C14390(C9199.m21198("Fragment ", this, " did not call through to super.onAttach()"));
        }
        this.mFragmentManager.m16822(this);
        this.mChildFragmentManager.m16833();
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m16819();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo21806(new C13129(this));
        this.mSavedStateRegistryController.m51094(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new C14390(C9199.m21198("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.m49766(EnumC24133.ON_CREATE);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m16819();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C5003(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.m10631()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.m10626();
        C8215.m18998(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        C5003 c5003 = this.mViewLifecycleOwner;
        C13045.m29867(view, "<this>");
        view.setTag(R.id.MT_Protector, c5003);
        C5755.m12836(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.mo4067(this.mViewLifecycleOwner);
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m16797();
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m16819();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new C14390(C9199.m21198("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        m25648();
        this.mChildFragmentManager.m16827();
    }

    /* JADX INFO: renamed from: ܿ */
    private void m25648() {
        if (AbstractC7291.m16763(3)) {
            toString();
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public void performStart() {
        this.mChildFragmentManager.m16819();
        this.mChildFragmentManager.m16817(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C14390(C9199.m21198("Fragment ", this, " did not call through to super.onStart()"));
        }
        C22103 c22103 = this.mLifecycleRegistry;
        EnumC24133 enumC24133 = EnumC24133.ON_START;
        c22103.m49766(enumC24133);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m10629(enumC24133);
        }
        this.mChildFragmentManager.m16824();
    }

    public void performResume() {
        this.mChildFragmentManager.m16819();
        this.mChildFragmentManager.m16817(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C14390(C9199.m21198("Fragment ", this, " did not call through to super.onResume()"));
        }
        C22103 c22103 = this.mLifecycleRegistry;
        EnumC24133 enumC24133 = EnumC24133.ON_RESUME;
        c22103.m49766(enumC24133);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m10629(enumC24133);
        }
        this.mChildFragmentManager.m16804();
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m16819();
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zM16766 = AbstractC7291.m16766(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM16766) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM16766);
            onPrimaryNavigationFragmentChanged(zM16766);
            this.mChildFragmentManager.m16806();
        }
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.mChildFragmentManager.m16792(menu, menuInflater) | z;
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.mChildFragmentManager.m16815(menu) | z;
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m16816(menuItem);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m16793(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m16776(menu);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m51096(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.m16800());
    }

    public void performPause() {
        this.mChildFragmentManager.m16837();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m10629(EnumC24133.ON_PAUSE);
        }
        this.mLifecycleRegistry.m49766(EnumC24133.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C14390(C9199.m21198("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performStop() {
        this.mChildFragmentManager.m16795();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m10629(EnumC24133.ON_STOP);
        }
        this.mLifecycleRegistry.m49766(EnumC24133.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C14390(C9199.m21198("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m16842();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo21805().m35142(EnumC15415.CREATED)) {
            this.mViewLifecycleOwner.m10629(EnumC24133.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new C14390(C9199.m21198("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        AbstractC18572.m42264(this).mo42265();
        this.mPerformedCreateView = false;
    }

    public void performDestroy() {
        this.mChildFragmentManager.m16821();
        this.mLifecycleRegistry.m49766(EnumC24133.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C14390(C9199.m21198("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new C14390(C9199.m21198("Fragment ", this, " did not call through to super.onDetach()"));
        }
        if (this.mChildFragmentManager.m16796()) {
            return;
        }
        this.mChildFragmentManager.m16821();
        this.mChildFragmentManager = new C3267();
    }

    /* JADX INFO: renamed from: ۧ */
    private C16480 m25646() {
        if (this.mAnimationInfo == null) {
            C16480 c16480 = new C16480();
            c16480.f48399 = null;
            Object obj = USE_DEFAULT_TRANSITION;
            c16480.f48400 = obj;
            c16480.f48403 = null;
            c16480.f48389 = obj;
            c16480.f48401 = null;
            c16480.f48385 = obj;
            c16480.f48388 = 1.0f;
            c16480.f48391 = null;
            this.mAnimationInfo = c16480;
        }
        return this.mAnimationInfo;
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m25646().f48397 = i;
        m25646().f48395 = i2;
        m25646().f48392 = i3;
        m25646().f48396 = i4;
    }

    public int getEnterAnim() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return 0;
        }
        return c16480.f48397;
    }

    public int getExitAnim() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return 0;
        }
        return c16480.f48395;
    }

    public int getPopEnterAnim() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return 0;
        }
        return c16480.f48392;
    }

    public int getPopExitAnim() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return 0;
        }
        return c16480.f48396;
    }

    public boolean getPopDirection() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return false;
        }
        return c16480.f48402;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        m25646().f48402 = z;
    }

    public int getNextTransition() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return 0;
        }
        return c16480.f48393;
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        m25646();
        this.mAnimationInfo.f48393 = i;
    }

    public ArrayList getSharedElementSourceNames() {
        ArrayList arrayList;
        C16480 c16480 = this.mAnimationInfo;
        return (c16480 == null || (arrayList = c16480.f48390) == null) ? new ArrayList() : arrayList;
    }

    public ArrayList getSharedElementTargetNames() {
        ArrayList arrayList;
        C16480 c16480 = this.mAnimationInfo;
        return (c16480 == null || (arrayList = c16480.f48386) == null) ? new ArrayList() : arrayList;
    }

    public void setSharedElementNames(ArrayList arrayList, ArrayList arrayList2) {
        m25646();
        C16480 c16480 = this.mAnimationInfo;
        c16480.f48390 = arrayList;
        c16480.f48386 = arrayList2;
    }

    public AbstractC2006 getEnterTransitionCallback() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return null;
        }
        c16480.getClass();
        return null;
    }

    public AbstractC2006 getExitTransitionCallback() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return null;
        }
        c16480.getClass();
        return null;
    }

    public View getAnimatingAway() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return null;
        }
        c16480.getClass();
        return null;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        m25646().f48388 = f;
    }

    public float getPostOnViewCreatedAlpha() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return 1.0f;
        }
        return c16480.f48388;
    }

    public void setFocusedView(View view) {
        m25646().f48391 = view;
    }

    public View getFocusedView() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return null;
        }
        return c16480.f48391;
    }

    public boolean isPostponed() {
        C16480 c16480 = this.mAnimationInfo;
        if (c16480 == null) {
            return false;
        }
        return c16480.f48398;
    }

    public final AbstractC1325 registerForActivityResult(AbstractC1920 abstractC1920, InterfaceC1885 interfaceC1885) {
        return m25644(abstractC1920, new C18492(this), interfaceC1885);
    }

    public final AbstractC1325 registerForActivityResult(AbstractC1920 abstractC1920, AbstractC1815 abstractC1815, InterfaceC1885 interfaceC1885) {
        return m25644(abstractC1920, new C19834(abstractC1815), interfaceC1885);
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC1325 m25644(AbstractC1920 abstractC1920, InterfaceC1677 interfaceC1677, InterfaceC1885 interfaceC1885) {
        if (this.mState > 1) {
            throw new IllegalStateException(C9199.m21198("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        m25645(new C19163(this, interfaceC1677, atomicReference, abstractC1920, interfaceC1885));
        return new C8175(atomicReference);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25645(AbstractC9105 abstractC9105) {
        if (this.mState >= 0) {
            abstractC9105.mo21042();
        } else {
            this.mOnPreAttachedListeners.add(abstractC9105);
        }
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }
}
