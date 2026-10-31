package l;

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
import bin.mt.plus.R;
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
public class ComponentCallbacksC9205 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC23586, InterfaceC13207, InterfaceC4557, InterfaceC22285 {
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
    public C14848 mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    public boolean mCalled;
    public AbstractC5180 mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    public int mContentLayoutId;
    public InterfaceC15323 mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public AbstractC5180 mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public AbstractC4971 mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public C20765 mLifecycleRegistry;
    public EnumC13728 mMaxState;
    public boolean mMenuVisible;
    public final AtomicInteger mNextLocalRequestCode;
    public final ArrayList mOnPreAttachedListeners;
    public ComponentCallbacksC9205 mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public final AbstractC7088 mSavedStateAttachListener;
    public C21580 mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray mSavedViewState;
    public int mState;
    public String mTag;
    public ComponentCallbacksC9205 mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public C2772 mViewLifecycleOwner;
    public C5242 mViewLifecycleOwnerLiveData;
    public String mWho;

    @Deprecated
    public void onAttachFragment(ComponentCallbacksC9205 componentCallbacksC9205) {
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

    @Override // l.InterfaceC23586
    public AbstractC7379 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public InterfaceC23586 getViewLifecycleOwner() {
        C2772 c2772 = this.mViewLifecycleOwner;
        if (c2772 != null) {
            return c2772;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public AbstractC0302 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // l.InterfaceC13207
    public C3330 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m23648() == EnumC13728.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        return this.mFragmentManager.m14931(this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m23648() {
        EnumC13728 enumC13728 = this.mMaxState;
        if (enumC13728 == EnumC13728.INITIALIZED || this.mParentFragment == null) {
            return enumC13728.ordinal();
        }
        return Math.min(enumC13728.ordinal(), this.mParentFragment.m23648());
    }

    @Override // l.InterfaceC4557
    public InterfaceC15323 getDefaultViewModelProviderFactory() {
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
            if (application == null && AbstractC5180.m14853(3)) {
                C11003.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new C2625(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @Override // l.InterfaceC4557
    public AbstractC7563 getDefaultViewModelCreationExtras() {
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
        if (application == null && AbstractC5180.m14853(3)) {
            C11003.toString(requireContext().getApplicationContext());
        }
        C16344 c16344 = new C16344();
        if (application != null) {
            c16344.m20277().put(C8269.f25430, application);
        }
        c16344.m20277().put(C20970.f67747, this);
        c16344.m20277().put(C20970.f67748, this);
        if (getArguments() != null) {
            c16344.m20277().put(C20970.f67746, getArguments());
        }
        return c16344;
    }

    @Override // l.InterfaceC22285
    public final C15228 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m48747();
    }

    public ComponentCallbacksC9205() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C0946();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC11755(this);
        this.mMaxState = EnumC13728.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C5242();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList();
        this.mSavedStateAttachListener = new C23043(this);
        m23650();
    }

    public ComponentCallbacksC9205(int i) {
        this();
        this.mContentLayoutId = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m23650() {
        this.mLifecycleRegistry = new C20765(this);
        this.mSavedStateRegistryController = new C21580(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        m23646(this.mSavedStateAttachListener);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ComponentCallbacksC9205 m23642(Context context, String str) {
        return m23643(context, str, (Bundle) null);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ComponentCallbacksC9205 m23643(Context context, String str, Bundle bundle) {
        try {
            ComponentCallbacksC9205 componentCallbacksC9205 = (ComponentCallbacksC9205) C20494.m46961(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(componentCallbacksC9205.getClass().getClassLoader());
                componentCallbacksC9205.setArguments(bundle);
            }
            return componentCallbacksC9205;
        } catch (IllegalAccessException e) {
            throw new C24021(C4860.m14172("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C24021(C4860.m14172("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C24021(C4860.m14172("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C24021(C4860.m14172("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m8564(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C12649(C7187.m19251("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m8566(EnumC22901.ON_CREATE);
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
        throw new IllegalStateException(C7187.m19251("Fragment ", this, " does not have any arguments."));
    }

    public final boolean isStateSaved() {
        AbstractC5180 abstractC5180 = this.mFragmentManager;
        if (abstractC5180 == null) {
            return false;
        }
        return abstractC5180.m14910();
    }

    public void setInitialSavedState(C9911 c9911) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (c9911 == null || (bundle = c9911.f29980) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    @Deprecated
    public void setTargetFragment(ComponentCallbacksC9205 componentCallbacksC9205, int i) {
        if (componentCallbacksC9205 != null) {
            C23232.m51539(this, componentCallbacksC9205, i);
        }
        AbstractC5180 abstractC5180 = this.mFragmentManager;
        AbstractC5180 abstractC5181 = componentCallbacksC9205 != null ? componentCallbacksC9205.mFragmentManager : null;
        if (abstractC5180 != null && abstractC5181 != null && abstractC5180 != abstractC5181) {
            throw new IllegalArgumentException(C7187.m19251("Fragment ", componentCallbacksC9205, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205M23644 = componentCallbacksC9205; componentCallbacksC9205M23644 != null; componentCallbacksC9205M23644 = componentCallbacksC9205M23644.m23644(false)) {
            if (componentCallbacksC9205M23644.equals(this)) {
                throw new IllegalArgumentException("Setting " + componentCallbacksC9205 + " as the target of " + this + " would create a target cycle");
            }
        }
        if (componentCallbacksC9205 == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || componentCallbacksC9205.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = componentCallbacksC9205;
        } else {
            this.mTargetWho = componentCallbacksC9205.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public final ComponentCallbacksC9205 getTargetFragment() {
        return m23644(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ComponentCallbacksC9205 m23644(boolean z) {
        String str;
        if (z) {
            C23232.m51545(this);
        }
        ComponentCallbacksC9205 componentCallbacksC9205 = this.mTarget;
        if (componentCallbacksC9205 != null) {
            return componentCallbacksC9205;
        }
        AbstractC5180 abstractC5180 = this.mFragmentManager;
        if (abstractC5180 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return abstractC5180.m14863(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C23232.m51543(this);
        return this.mTargetRequestCode;
    }

    public Context getContext() {
        AbstractC4971 abstractC4971 = this.mHost;
        if (abstractC4971 == null) {
            return null;
        }
        return abstractC4971.m14435();
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(C7187.m19251("Fragment ", this, " not attached to a context."));
    }

    public final ActivityC0737 getActivity() {
        AbstractC4971 abstractC4971 = this.mHost;
        if (abstractC4971 == null) {
            return null;
        }
        return (ActivityC0737) abstractC4971.m14433();
    }

    public final ActivityC0737 requireActivity() {
        ActivityC0737 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C7187.m19251("Fragment ", this, " not attached to an activity."));
    }

    public final Object getHost() {
        AbstractC4971 abstractC4971 = this.mHost;
        if (abstractC4971 == null) {
            return null;
        }
        return abstractC4971.mo14432();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(C7187.m19251("Fragment ", this, " not attached to a host."));
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
    public final AbstractC5180 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final AbstractC5180 getParentFragmentManager() {
        AbstractC5180 abstractC5180 = this.mFragmentManager;
        if (abstractC5180 != null) {
            return abstractC5180;
        }
        throw new IllegalStateException(C7187.m19251("Fragment ", this, " not associated with a fragment manager."));
    }

    @Deprecated
    public final AbstractC5180 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final AbstractC5180 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(C7187.m19251("Fragment ", this, " has not been attached yet."));
    }

    public final ComponentCallbacksC9205 getParentFragment() {
        return this.mParentFragment;
    }

    public final ComponentCallbacksC9205 requireParentFragment() {
        ComponentCallbacksC9205 parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(C7187.m19251("Fragment ", this, " is not attached to any Fragment or host"));
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
        AbstractC5180 abstractC5180 = this.mFragmentManager;
        if (abstractC5180 != null) {
            ComponentCallbacksC9205 componentCallbacksC9205 = this.mParentFragment;
            abstractC5180.getClass();
            if (componentCallbacksC9205 == null ? false : componentCallbacksC9205.isHidden()) {
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
            ComponentCallbacksC9205 componentCallbacksC9205 = this.mParentFragment;
            if (!(componentCallbacksC9205 == null ? true : componentCallbacksC9205.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        C23232.m51544(this);
        this.mRetainInstance = z;
        AbstractC5180 abstractC5180 = this.mFragmentManager;
        if (abstractC5180 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            abstractC5180.m14903(this);
        } else {
            abstractC5180.m14895(this);
        }
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C23232.m51541(this);
        return this.mRetainInstance;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.mo14436();
        }
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo14436();
            }
        }
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        C23232.m51540(this, z);
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            AbstractC5180 abstractC5180 = this.mFragmentManager;
            abstractC5180.m14869(abstractC5180.m14922(this));
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
    public AbstractC17050 getLoaderManager() {
        return AbstractC17050.m40019(this);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        AbstractC4971 abstractC4971 = this.mHost;
        if (abstractC4971 == null) {
            throw new IllegalStateException(C7187.m19251("Fragment ", this, " not attached to Activity"));
        }
        abstractC4971.m14427(intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(C7187.m19251("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().m14870(this, intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(C7187.m19251("Fragment ", this, " not attached to Activity"));
        }
        if (AbstractC5180.m14853(2)) {
            toString();
            C11003.toString(intentSender);
            C11003.toString(intent);
            C11003.toString(bundle);
        }
        getParentFragmentManager().m14871(this, intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (AbstractC5180.m14853(2)) {
            toString();
            C11003.toString(intent);
        }
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost == null) {
            throw new IllegalStateException(C7187.m19251("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().m14874(this, strArr, i);
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC4971 abstractC4971 = this.mHost;
        if (abstractC4971 != null) {
            return abstractC4971.mo14431(str);
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
        AbstractC4971 abstractC4971 = this.mHost;
        if (abstractC4971 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterMo14430 = abstractC4971.mo14430();
        layoutInflaterMo14430.setFactory2(this.mChildFragmentManager.m14913());
        return layoutInflaterMo14430;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC4971 abstractC4971 = this.mHost;
        Activity activityM14433 = abstractC4971 == null ? null : abstractC4971.m14433();
        if (activityM14433 != null) {
            this.mCalled = false;
            onInflate(activityM14433, attributeSet, bundle);
        }
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC4971 abstractC4971 = this.mHost;
        Activity activityM14433 = abstractC4971 == null ? null : abstractC4971.m14433();
        if (activityM14433 != null) {
            this.mCalled = false;
            onAttach(activityM14433);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        AbstractC5180 abstractC5180 = this.mChildFragmentManager;
        if (abstractC5180.f16249 >= 1) {
            return;
        }
        abstractC5180.m14920();
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.m14865(parcelable);
        this.mChildFragmentManager.m14920();
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
        throw new IllegalStateException(C7187.m19251("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
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
        m23650();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C0946();
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

    public void setEnterSharedElementCallback(AbstractC23459 abstractC23459) {
        m23647().getClass();
    }

    public void setExitSharedElementCallback(AbstractC23459 abstractC23459) {
        m23647().getClass();
    }

    public void setEnterTransition(Object obj) {
        m23647().f45283 = obj;
    }

    public Object getEnterTransition() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return null;
        }
        return c14848.f45283;
    }

    public void setReturnTransition(Object obj) {
        m23647().f45284 = obj;
    }

    public Object getReturnTransition() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return null;
        }
        Object obj = c14848.f45284;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    public void setExitTransition(Object obj) {
        m23647().f45287 = obj;
    }

    public Object getExitTransition() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return null;
        }
        return c14848.f45287;
    }

    public void setReenterTransition(Object obj) {
        m23647().f45273 = obj;
    }

    public Object getReenterTransition() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return null;
        }
        Object obj = c14848.f45273;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        m23647().f45285 = obj;
    }

    public Object getSharedElementEnterTransition() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return null;
        }
        return c14848.f45285;
    }

    public void setSharedElementReturnTransition(Object obj) {
        m23647().f45269 = obj;
    }

    public Object getSharedElementReturnTransition() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return null;
        }
        Object obj = c14848.f45269;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        m23647().f45271 = Boolean.valueOf(z);
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null || (bool = c14848.f45271) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        m23647().f45278 = Boolean.valueOf(z);
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null || (bool = c14848.f45278) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void postponeEnterTransition() {
        m23647().f45282 = true;
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        m23647().f45282 = true;
        AbstractC5180 abstractC5180 = this.mFragmentManager;
        if (abstractC5180 != null) {
            handler = abstractC5180.m14893().m14434();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !m23647().f45282) {
            return;
        }
        if (this.mHost == null) {
            m23647().f45282 = false;
        } else if (Looper.myLooper() != this.mHost.m14434().getLooper()) {
            this.mHost.m14434().postAtFrontOfQueue(new RunnableC13870(this));
        } else {
            callStartTransitionListener(true);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        AbstractC5180 abstractC5180;
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 != null) {
            c14848.f45282 = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (abstractC5180 = this.mFragmentManager) == null) {
            return;
        }
        AbstractC3477 abstractC3477M10636 = AbstractC3477.m10636(viewGroup, abstractC5180.m14926());
        abstractC3477M10636.m10649();
        if (z) {
            this.mHost.m14434().post(new RunnableC7521(abstractC3477M10636));
        } else {
            abstractC3477M10636.m10640();
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
        ComponentCallbacksC9205 componentCallbacksC9205M23644 = m23644(false);
        if (componentCallbacksC9205M23644 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(componentCallbacksC9205M23644);
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
            AbstractC17050.m40019(this).mo40021(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m14867(C16014.m37867(str, EnumC0121.f1143), fileDescriptor, printWriter, strArr);
    }

    public ComponentCallbacksC9205 findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.m14916(str);
    }

    public AbstractC15553 createFragmentContainer() {
        return new C2149(this);
    }

    public void performAttach() {
        Iterator it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            ((AbstractC7088) it.next()).mo19084();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m14868(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m14435());
        if (!this.mCalled) {
            throw new C12649(C7187.m19251("Fragment ", this, " did not call through to super.onAttach()"));
        }
        this.mFragmentManager.m14912(this);
        this.mChildFragmentManager.m14923();
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m14909();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo19833(new C11322(this));
        this.mSavedStateRegistryController.m48748(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new C12649(C7187.m19251("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.m47438(EnumC22901.ON_CREATE);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m14909();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C2772(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.m8568()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.m8563();
        C6152.m17066(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        C2772 c2772 = this.mViewLifecycleOwner;
        C11233.m27805(view, "<this>");
        view.setTag(R.id.MT_Protector, c2772);
        C3563.m10856(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.mo1669(this.mViewLifecycleOwner);
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m14887();
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m14909();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new C12649(C7187.m19251("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        m23649();
        this.mChildFragmentManager.m14917();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m23649() {
        if (AbstractC5180.m14853(3)) {
            toString();
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public void performStart() {
        this.mChildFragmentManager.m14909();
        this.mChildFragmentManager.m14907(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C12649(C7187.m19251("Fragment ", this, " did not call through to super.onStart()"));
        }
        C20765 c20765 = this.mLifecycleRegistry;
        EnumC22901 enumC22901 = EnumC22901.ON_START;
        c20765.m47438(enumC22901);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m8566(enumC22901);
        }
        this.mChildFragmentManager.m14914();
    }

    public void performResume() {
        this.mChildFragmentManager.m14909();
        this.mChildFragmentManager.m14907(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C12649(C7187.m19251("Fragment ", this, " did not call through to super.onResume()"));
        }
        C20765 c20765 = this.mLifecycleRegistry;
        EnumC22901 enumC22901 = EnumC22901.ON_RESUME;
        c20765.m47438(enumC22901);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m8566(enumC22901);
        }
        this.mChildFragmentManager.m14894();
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m14909();
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zM14856 = AbstractC5180.m14856(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM14856) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM14856);
            onPrimaryNavigationFragmentChanged(zM14856);
            this.mChildFragmentManager.m14896();
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
        return this.mChildFragmentManager.m14882(menu, menuInflater) | z;
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
        return this.mChildFragmentManager.m14905(menu) | z;
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m14906(menuItem);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m14883(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m14866(menu);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m48750(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.m14890());
    }

    public void performPause() {
        this.mChildFragmentManager.m14927();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m8566(EnumC22901.ON_PAUSE);
        }
        this.mLifecycleRegistry.m47438(EnumC22901.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C12649(C7187.m19251("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performStop() {
        this.mChildFragmentManager.m14885();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m8566(EnumC22901.ON_STOP);
        }
        this.mLifecycleRegistry.m47438(EnumC22901.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C12649(C7187.m19251("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m14932();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo19832().m33028(EnumC13728.CREATED)) {
            this.mViewLifecycleOwner.m8566(EnumC22901.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new C12649(C7187.m19251("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        AbstractC17050.m40019(this).mo40020();
        this.mPerformedCreateView = false;
    }

    public void performDestroy() {
        this.mChildFragmentManager.m14911();
        this.mLifecycleRegistry.m47438(EnumC22901.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C12649(C7187.m19251("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new C12649(C7187.m19251("Fragment ", this, " did not call through to super.onDetach()"));
        }
        if (this.mChildFragmentManager.m14886()) {
            return;
        }
        this.mChildFragmentManager.m14911();
        this.mChildFragmentManager = new C0946();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C14848 m23647() {
        if (this.mAnimationInfo == null) {
            C14848 c14848 = new C14848();
            c14848.f45283 = null;
            Object obj = USE_DEFAULT_TRANSITION;
            c14848.f45284 = obj;
            c14848.f45287 = null;
            c14848.f45273 = obj;
            c14848.f45285 = null;
            c14848.f45269 = obj;
            c14848.f45272 = 1.0f;
            c14848.f45275 = null;
            this.mAnimationInfo = c14848;
        }
        return this.mAnimationInfo;
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m23647().f45281 = i;
        m23647().f45279 = i2;
        m23647().f45276 = i3;
        m23647().f45280 = i4;
    }

    public int getEnterAnim() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return 0;
        }
        return c14848.f45281;
    }

    public int getExitAnim() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return 0;
        }
        return c14848.f45279;
    }

    public int getPopEnterAnim() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return 0;
        }
        return c14848.f45276;
    }

    public int getPopExitAnim() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return 0;
        }
        return c14848.f45280;
    }

    public boolean getPopDirection() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return false;
        }
        return c14848.f45286;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        m23647().f45286 = z;
    }

    public int getNextTransition() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return 0;
        }
        return c14848.f45277;
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        m23647();
        this.mAnimationInfo.f45277 = i;
    }

    public ArrayList getSharedElementSourceNames() {
        ArrayList arrayList;
        C14848 c14848 = this.mAnimationInfo;
        return (c14848 == null || (arrayList = c14848.f45274) == null) ? new ArrayList() : arrayList;
    }

    public ArrayList getSharedElementTargetNames() {
        ArrayList arrayList;
        C14848 c14848 = this.mAnimationInfo;
        return (c14848 == null || (arrayList = c14848.f45270) == null) ? new ArrayList() : arrayList;
    }

    public void setSharedElementNames(ArrayList arrayList, ArrayList arrayList2) {
        m23647();
        C14848 c14848 = this.mAnimationInfo;
        c14848.f45274 = arrayList;
        c14848.f45270 = arrayList2;
    }

    public AbstractC23459 getEnterTransitionCallback() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return null;
        }
        c14848.getClass();
        return null;
    }

    public AbstractC23459 getExitTransitionCallback() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return null;
        }
        c14848.getClass();
        return null;
    }

    public View getAnimatingAway() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return null;
        }
        c14848.getClass();
        return null;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        m23647().f45272 = f;
    }

    public float getPostOnViewCreatedAlpha() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return 1.0f;
        }
        return c14848.f45272;
    }

    public void setFocusedView(View view) {
        m23647().f45275 = view;
    }

    public View getFocusedView() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return null;
        }
        return c14848.f45275;
    }

    public boolean isPostponed() {
        C14848 c14848 = this.mAnimationInfo;
        if (c14848 == null) {
            return false;
        }
        return c14848.f45282;
    }

    public final AbstractC9741 registerForActivityResult(AbstractC21735 abstractC21735, InterfaceC21030 interfaceC21030) {
        return m23645(abstractC21735, new C16965(this), interfaceC21030);
    }

    public final AbstractC9741 registerForActivityResult(AbstractC21735 abstractC21735, AbstractC19619 abstractC19619, InterfaceC21030 interfaceC21030) {
        return m23645(abstractC21735, new C18377(abstractC19619), interfaceC21030);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC9741 m23645(AbstractC21735 abstractC21735, InterfaceC16837 interfaceC16837, InterfaceC21030 interfaceC21030) {
        if (this.mState > 1) {
            throw new IllegalStateException(C7187.m19251("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        m23646(new C17671(this, interfaceC16837, atomicReference, abstractC21735, interfaceC21030));
        return new C6110(atomicReference);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23646(AbstractC7088 abstractC7088) {
        if (this.mState >= 0) {
            abstractC7088.mo19084();
        } else {
            this.mOnPreAttachedListeners.add(abstractC7088);
        }
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }
}
