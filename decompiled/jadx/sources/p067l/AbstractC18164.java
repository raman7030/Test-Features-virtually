package p067l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.google.android.material.chip.Chip;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: l.ܽۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18164 implements Cloneable {
    public static final boolean DBG = false;
    public static final String LOG_TAG = "Transition";
    public static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    public static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    public static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    public static final String MATCH_ITEM_ID_STR = "itemId";
    public static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    public static final String MATCH_NAME_STR = "name";
    public ArrayList mEndValuesList;
    public AbstractC14654 mEpicenterCallback;
    public InterfaceC7949[] mListenersCache;
    public C0977 mNameOverrides;
    public AbstractC8777 mPropagation;
    public C11973 mSeekController;
    public long mSeekOffsetInParent;
    public ArrayList mStartValuesList;
    public long mTotalDuration;
    public static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    public static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    public static final AbstractC2584 STRAIGHT_PATH_MOTION = new C22702();
    public static ThreadLocal sRunningAnimators = new ThreadLocal();
    public String mName = getClass().getName();
    public long mStartDelay = -1;
    public long mDuration = -1;
    public TimeInterpolator mInterpolator = null;
    public ArrayList mTargetIds = new ArrayList();
    public ArrayList mTargets = new ArrayList();
    public ArrayList mTargetNames = null;
    public ArrayList mTargetTypes = null;
    public ArrayList mTargetIdExcludes = null;
    public ArrayList mTargetExcludes = null;
    public ArrayList mTargetTypeExcludes = null;
    public ArrayList mTargetNameExcludes = null;
    public ArrayList mTargetIdChildExcludes = null;
    public ArrayList mTargetChildExcludes = null;
    public ArrayList mTargetTypeChildExcludes = null;
    public C2741 mStartValues = new C2741();
    public C2741 mEndValues = new C2741();
    public C4754 mParent = null;
    public int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    public boolean mCanRemoveViews = false;
    public ArrayList mCurrentAnimators = new ArrayList();
    public Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    public int mNumInstances = 0;
    public boolean mPaused = false;
    public boolean mEnded = false;
    public AbstractC18164 mCloneParent = null;
    public ArrayList mListeners = null;
    public ArrayList mAnimators = new ArrayList();
    public AbstractC2584 mPathMotion = STRAIGHT_PATH_MOTION;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m41385(int i) {
        return i >= 1 && i <= 4;
    }

    public abstract void captureEndValues(C20848 c20848);

    public void capturePropagationValues(C20848 c20848) {
    }

    public abstract void captureStartValues(C20848 c20848);

    public Animator createAnimator(ViewGroup viewGroup, C20848 c20848, C20848 c20849) {
        return null;
    }

    public AbstractC8777 getPropagation() {
        return null;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public void setPropagation(AbstractC8777 abstractC8777) {
    }

    public AbstractC18164() {
    }

    public AbstractC18164(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16665.f49044);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jM11086 = C0989.m11086(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jM11086 >= 0) {
            setDuration(jM11086);
        }
        long j = xmlResourceParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "startDelay") != null ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
        if (j > 0) {
            setStartDelay(j);
        }
        int resourceId = xmlResourceParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "interpolator") != null ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String strM11088 = C0989.m11088(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM11088 != null) {
            setMatchOrder(m41388(strM11088));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int[] m41388(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(strTrim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(strTrim)) {
                iArr[i] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException(C6988.m16053("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            }
            i++;
        }
        return iArr;
    }

    public final AbstractC18164 getRootTransition() {
        C4754 c4754 = this.mParent;
        return c4754 != null ? c4754.getRootTransition() : this;
    }

    public AbstractC18164 setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public long getDuration() {
        return this.mDuration;
    }

    public AbstractC18164 setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public AbstractC18164 setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public InterfaceC22189 createSeekController() {
        C11973 c11973 = new C11973(this);
        this.mSeekController = c11973;
        addListener(c11973);
        return this.mSeekController;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!m41385(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (m41387(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m41387(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m41389(C0977 c0977, C0977 c0978) {
        C20848 c20848;
        int size = c0977.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            View view = (View) c0977.m12522(size);
            if (view != null && isValidTarget(view) && (c20848 = (C20848) c0978.remove(view)) != null && isValidTarget(c20848.f65506)) {
                this.mStartValuesList.add((C20848) c0977.m12523(size));
                this.mEndValuesList.add(c20848);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41383(C0977 c0977, C0977 c0978, C1117 c1117, C1117 c1118) {
        View view;
        int iM17614 = c1117.m17614();
        for (int i = 0; i < iM17614; i++) {
            View view2 = (View) c1117.m17616(i);
            if (view2 != null && isValidTarget(view2) && (view = (View) c1118.m17612(c1117.m17608(i), null)) != null && isValidTarget(view)) {
                C20848 c20848 = (C20848) c0977.getOrDefault(view2, null);
                C20848 c20849 = (C20848) c0978.getOrDefault(view, null);
                if (c20848 != null && c20849 != null) {
                    this.mStartValuesList.add(c20848);
                    this.mEndValuesList.add(c20849);
                    c0977.remove(view2);
                    c0978.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41381(C0977 c0977, C0977 c0978, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) sparseArray.valueAt(i);
            if (view2 != null && isValidTarget(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                C20848 c20848 = (C20848) c0977.getOrDefault(view2, null);
                C20848 c20849 = (C20848) c0978.getOrDefault(view, null);
                if (c20848 != null && c20849 != null) {
                    this.mStartValuesList.add(c20848);
                    this.mEndValuesList.add(c20849);
                    c0977.remove(view2);
                    c0978.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41382(C0977 c0977, C0977 c0978, C0977 c0979, C0977 c09710) {
        View view;
        int size = c0979.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) c0979.m12521(i);
            if (view2 != null && isValidTarget(view2) && (view = (View) c09710.getOrDefault(c0979.m12522(i), null)) != null && isValidTarget(view)) {
                C20848 c20848 = (C20848) c0977.getOrDefault(view2, null);
                C20848 c20849 = (C20848) c0978.getOrDefault(view, null);
                if (c20848 != null && c20849 != null) {
                    this.mStartValuesList.add(c20848);
                    this.mEndValuesList.add(c20849);
                    c0977.remove(view2);
                    c0978.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41380(C0977 c0977, C0977 c0978) {
        for (int i = 0; i < c0977.size(); i++) {
            C20848 c20848 = (C20848) c0977.m12521(i);
            if (isValidTarget(c20848.f65506)) {
                this.mStartValuesList.add(c20848);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < c0978.size(); i2++) {
            C20848 c20849 = (C20848) c0978.m12521(i2);
            if (isValidTarget(c20849.f65506)) {
                this.mEndValuesList.add(c20849);
                this.mStartValuesList.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41379(C2741 c2741, C2741 c2742) {
        C0977 c0977 = new C0977(c2741.f4618);
        C0977 c0978 = new C0977(c2742.f4618);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m41389(c0977, c0978);
                } else if (i2 == 2) {
                    m41382(c0977, c0978, c2741.f4617, c2742.f4617);
                } else if (i2 == 3) {
                    m41381(c0977, c0978, c2741.f4615, c2742.f4615);
                } else if (i2 == 4) {
                    m41383(c0977, c0978, c2741.f4616, c2742.f4616);
                }
                i++;
            } else {
                m41380(c0977, c0978);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111 A[SYNTHETIC] */
    public void createAnimators(ViewGroup viewGroup, C2741 c2741, C2741 c2742, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        C20848 c20848;
        Object obj;
        C0977 c0977M41373 = m41373();
        SparseIntArray sparseIntArray = new SparseIntArray();
        boolean z = getRootTransition().mSeekController != null;
        int i = 0;
        for (int size = arrayList.size(); i < size; size = size) {
            C20848 c20849 = (C20848) arrayList.get(i);
            C20848 c208410 = (C20848) arrayList2.get(i);
            if (c20849 != null && !c20849.f65504.contains(this)) {
                c20849 = null;
            }
            if (c208410 != null && !c208410.f65504.contains(this)) {
                c208410 = null;
            }
            if ((c20849 != null || c208410 != null) && (c20849 == null || c208410 == null || isTransitionRequired(c20849, c208410))) {
                Animator animatorCreateAnimator = createAnimator(viewGroup, c20849, c208410);
                if (animatorCreateAnimator != null) {
                    if (c208410 != null) {
                        view = c208410.f65506;
                        String[] transitionProperties = getTransitionProperties();
                        if (transitionProperties != null && transitionProperties.length > 0) {
                            c20848 = new C20848(view);
                            C20848 c208411 = (C20848) c2742.f4618.getOrDefault(view, null);
                            if (c208411 != null) {
                                int i2 = 0;
                                while (i2 < transitionProperties.length) {
                                    String str = transitionProperties[i2];
                                    c20848.f65505.put(str, c208411.f65505.get(str));
                                    i2++;
                                    c208411 = c208411;
                                }
                            }
                            int size2 = c0977M41373.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                C6608 c6608 = (C6608) c0977M41373.getOrDefault((Animator) c0977M41373.m12522(i3), null);
                                if (c6608.f17047 != null && c6608.f17046 == view && c6608.f17043.equals(getName()) && c6608.f17047.equals(c20848)) {
                                    animatorCreateAnimator = null;
                                    break;
                                }
                            }
                        }
                        if (animatorCreateAnimator != null) {
                            String name = getName();
                            WindowId windowId = viewGroup.getWindowId();
                            C6608 c6609 = new C6608();
                            c6609.f17046 = view;
                            c6609.f17043 = name;
                            c6609.f17047 = c20848;
                            c6609.f17044 = windowId;
                            c6609.f17045 = this;
                            c6609.f17042 = animatorCreateAnimator;
                            if (z) {
                                obj = animatorCreateAnimator;
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(animatorCreateAnimator);
                                obj = animatorSet;
                            }
                            obj = animatorCreateAnimator;
                            c0977M41373.put(obj, c6609);
                            this.mAnimators.add(obj);
                        }
                    } else {
                        view = c20849.f65506;
                    }
                    c20848 = null;
                    if (animatorCreateAnimator != null) {
                        String name2 = getName();
                        WindowId windowId2 = viewGroup.getWindowId();
                        C6608 c66010 = new C6608();
                        c66010.f17046 = view;
                        c66010.f17043 = name2;
                        c66010.f17047 = c20848;
                        c66010.f17044 = windowId2;
                        c66010.f17045 = this;
                        c66010.f17042 = animatorCreateAnimator;
                        if (z) {
                            obj = animatorCreateAnimator;
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.play(animatorCreateAnimator);
                            obj = animatorSet2;
                        }
                        obj = animatorCreateAnimator;
                        c0977M41373.put(obj, c66010);
                        this.mAnimators.add(obj);
                    }
                }
                i++;
            }
            size = size;
            i++;
        }
        if (sparseIntArray.size() != 0) {
            for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                C6608 c66011 = (C6608) c0977M41373.getOrDefault((Animator) this.mAnimators.get(sparseIntArray.keyAt(i4)), null);
                c66011.f17042.setStartDelay(c66011.f17042.getStartDelay() + (((long) sparseIntArray.valueAt(i4)) - C14849.FOREVER_NS));
            }
        }
    }

    public boolean isValidTarget(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.mTargetTypeExcludes.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && C1717.m43568(view) != null && this.mTargetNameExcludes.contains(C1717.m43568(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(C1717.m43568(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                if (((Class) this.mTargetTypes.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C0977 m41373() {
        C0977 c0977 = (C0977) sRunningAnimators.get();
        if (c0977 != null) {
            return c0977;
        }
        C0977 c0978 = new C0977();
        sRunningAnimators.set(c0978);
        return c0978;
    }

    public void runAnimators() {
        start();
        C0977 c0977M41373 = m41373();
        for (Animator animator : this.mAnimators) {
            if (c0977M41373.containsKey(animator)) {
                start();
                m41376(animator, c0977M41373);
            }
        }
        this.mAnimators.clear();
        end();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41376(Animator animator, C0977 c0977) {
        if (animator != null) {
            animator.addListener(new C23372(this, c0977));
            animate(animator);
        }
    }

    public void prepareAnimatorsForSeeking() {
        C0977 c0977M41373 = m41373();
        this.mTotalDuration = 0L;
        for (int i = 0; i < this.mAnimators.size(); i++) {
            Animator animator = (Animator) this.mAnimators.get(i);
            C6608 c6608 = (C6608) c0977M41373.getOrDefault(animator, null);
            if (animator != null && c6608 != null) {
                Animator animator2 = c6608.f17042;
                if (getDuration() >= 0) {
                    animator2.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + getStartDelay());
                }
                if (getInterpolator() != null) {
                    animator2.setInterpolator(getInterpolator());
                }
                this.mCurrentAnimators.add(animator);
                this.mTotalDuration = Math.max(this.mTotalDuration, C13984.m31780(animator));
            }
        }
        this.mAnimators.clear();
    }

    public AbstractC18164 addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    public AbstractC18164 addTarget(int i) {
        if (i != 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    public AbstractC18164 addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public AbstractC18164 addTarget(Class cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public AbstractC18164 removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public AbstractC18164 removeTarget(int i) {
        if (i != 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    public AbstractC18164 removeTarget(String str) {
        ArrayList arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public AbstractC18164 removeTarget(Class cls) {
        ArrayList arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m41372(ArrayList arrayList, Object obj, boolean z) {
        if (obj == null) {
            return arrayList;
        }
        if (z) {
            return C5267.m11383(obj, arrayList);
        }
        return C5267.m11384(obj, arrayList);
    }

    public AbstractC18164 excludeTarget(View view, boolean z) {
        this.mTargetExcludes = m41370(this.mTargetExcludes, view, z);
        return this;
    }

    public AbstractC18164 excludeTarget(int i, boolean z) {
        this.mTargetIdExcludes = m41369(this.mTargetIdExcludes, i, z);
        return this;
    }

    public AbstractC18164 excludeTarget(String str, boolean z) {
        this.mTargetNameExcludes = m41372(this.mTargetNameExcludes, str, z);
        return this;
    }

    public AbstractC18164 excludeChildren(View view, boolean z) {
        this.mTargetChildExcludes = m41370(this.mTargetChildExcludes, view, z);
        return this;
    }

    public AbstractC18164 excludeChildren(int i, boolean z) {
        this.mTargetIdChildExcludes = m41369(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    private ArrayList m41369(ArrayList arrayList, int i, boolean z) {
        if (i <= 0) {
            return arrayList;
        }
        if (z) {
            return C5267.m11383(Integer.valueOf(i), arrayList);
        }
        return C5267.m11384(Integer.valueOf(i), arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    private ArrayList m41370(ArrayList arrayList, View view, boolean z) {
        if (view == null) {
            return arrayList;
        }
        if (z) {
            return C5267.m11383(view, arrayList);
        }
        return C5267.m11384(view, arrayList);
    }

    public AbstractC18164 excludeTarget(Class cls, boolean z) {
        this.mTargetTypeExcludes = m41371(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    public AbstractC18164 excludeChildren(Class cls, boolean z) {
        this.mTargetTypeChildExcludes = m41371(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    private ArrayList m41371(ArrayList arrayList, Class cls, boolean z) {
        if (cls == null) {
            return arrayList;
        }
        if (z) {
            return C5267.m11383(cls, arrayList);
        }
        return C5267.m11384(cls, arrayList);
    }

    public List getTargetIds() {
        return this.mTargetIds;
    }

    public List getTargets() {
        return this.mTargets;
    }

    public List getTargetNames() {
        return this.mTargetNames;
    }

    public List getTargetTypes() {
        return this.mTargetTypes;
    }

    public void captureValues(ViewGroup viewGroup, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C0977 c0977;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.mTargetIds.get(i)).intValue());
                if (viewFindViewById != null) {
                    C20848 c20848 = new C20848(viewFindViewById);
                    if (z) {
                        captureStartValues(c20848);
                    } else {
                        captureEndValues(c20848);
                    }
                    c20848.f65504.add(this);
                    capturePropagationValues(c20848);
                    if (z) {
                        m41378(this.mStartValues, viewFindViewById, c20848);
                    } else {
                        m41378(this.mEndValues, viewFindViewById, c20848);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = (View) this.mTargets.get(i2);
                C20848 c20849 = new C20848(view);
                if (z) {
                    captureStartValues(c20849);
                } else {
                    captureEndValues(c20849);
                }
                c20849.f65504.add(this);
                capturePropagationValues(c20849);
                if (z) {
                    m41378(this.mStartValues, view, c20849);
                } else {
                    m41378(this.mEndValues, view, c20849);
                }
            }
        } else {
            m41377(viewGroup, z);
        }
        if (z || (c0977 = this.mNameOverrides) == null) {
            return;
        }
        int size = c0977.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add((View) this.mStartValues.f4617.remove((String) this.mNameOverrides.m12522(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.mStartValues.f4617.put((String) this.mNameOverrides.m12521(i4), view2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41378(C2741 c2741, View view, C20848 c20848) {
        C0977 c0977 = c2741.f4618;
        C0977 c0978 = c2741.f4617;
        SparseArray sparseArray = c2741.f4615;
        C1117 c1117 = c2741.f4616;
        c0977.put(view, c20848);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String strM43568 = C1717.m43568(view);
        if (strM43568 != null) {
            if (c0978.containsKey(strM43568)) {
                c0978.put(strM43568, null);
            } else {
                c0978.put(strM43568, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c1117.m17607(itemIdAtPosition) >= 0) {
                    View view2 = (View) c1117.m17612(itemIdAtPosition, null);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        c1117.m17611(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                c1117.m17611(itemIdAtPosition, view);
            }
        }
    }

    public void clearValues(boolean z) {
        if (z) {
            this.mStartValues.f4618.clear();
            this.mStartValues.f4615.clear();
            this.mStartValues.f4616.m17609();
        } else {
            this.mEndValues.f4618.clear();
            this.mEndValues.f4615.clear();
            this.mEndValues.f4616.m17609();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41377(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (((Class) this.mTargetTypeExcludes.get(i)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C20848 c20848 = new C20848(view);
                    if (z) {
                        captureStartValues(c20848);
                    } else {
                        captureEndValues(c20848);
                    }
                    c20848.f65504.add(this);
                    capturePropagationValues(c20848);
                    if (z) {
                        m41378(this.mStartValues, view, c20848);
                    } else {
                        m41378(this.mEndValues, view, c20848);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (((Class) this.mTargetTypeChildExcludes.get(i2)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                m41377(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public C20848 getTransitionValues(View view, boolean z) {
        C4754 c4754 = this.mParent;
        if (c4754 != null) {
            return c4754.getTransitionValues(view, z);
        }
        return (C20848) (z ? this.mStartValues : this.mEndValues).f4618.getOrDefault(view, null);
    }

    public C20848 getMatchedTransitionValues(View view, boolean z) {
        C4754 c4754 = this.mParent;
        if (c4754 != null) {
            return c4754.getMatchedTransitionValues(view, z);
        }
        ArrayList arrayList = z ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C20848 c20848 = (C20848) arrayList.get(i);
            if (c20848 == null) {
                return null;
            }
            if (c20848.f65506 == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C20848) (z ? this.mEndValuesList : this.mStartValuesList).get(i);
        }
        return null;
    }

    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(InterfaceC12801.f36026, false);
        this.mPaused = true;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                int size = this.mCurrentAnimators.size();
                Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                notifyListeners(InterfaceC12801.f36028, false);
            }
            this.mPaused = false;
        }
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    public void playTransition(ViewGroup viewGroup) {
        C6608 c6608;
        this.mStartValuesList = new ArrayList();
        this.mEndValuesList = new ArrayList();
        m41379(this.mStartValues, this.mEndValues);
        C0977 c0977M41373 = m41373();
        int size = c0977M41373.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) c0977M41373.m12522(i);
            if (animator != null && (c6608 = (C6608) c0977M41373.getOrDefault(animator, null)) != null) {
                AbstractC18164 abstractC18164 = c6608.f17045;
                View view = c6608.f17046;
                if (view != null && windowId.equals(c6608.f17044)) {
                    C20848 c20848 = c6608.f17047;
                    C20848 transitionValues = getTransitionValues(view, true);
                    C20848 matchedTransitionValues = getMatchedTransitionValues(view, true);
                    if (transitionValues == null && matchedTransitionValues == null) {
                        matchedTransitionValues = (C20848) this.mEndValues.f4618.getOrDefault(view, null);
                    }
                    if ((transitionValues != null || matchedTransitionValues != null) && abstractC18164.isTransitionRequired(c20848, matchedTransitionValues)) {
                        if (abstractC18164.getRootTransition().mSeekController != null) {
                            animator.cancel();
                            abstractC18164.mCurrentAnimators.remove(animator);
                            c0977M41373.remove(animator);
                            if (abstractC18164.mCurrentAnimators.size() == 0) {
                                abstractC18164.notifyListeners(InterfaceC12801.f36024, false);
                                if (!abstractC18164.mEnded) {
                                    abstractC18164.mEnded = true;
                                    abstractC18164.notifyListeners(InterfaceC12801.f36025, false);
                                }
                            }
                        } else if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            c0977M41373.remove(animator);
                        }
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        if (this.mSeekController == null) {
            runAnimators();
        } else if (Build.VERSION.SDK_INT >= 34) {
            prepareAnimatorsForSeeking();
            this.mSeekController.m27409();
            this.mSeekController.getClass();
        }
    }

    public boolean isTransitionRequired(C20848 c20848, C20848 c20849) {
        if (c20848 != null && c20849 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (m41386(c20848, c20849, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c20848.f65505.keySet().iterator();
                while (it.hasNext()) {
                    if (m41386(c20848, c20849, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m41386(C20848 c20848, C20848 c20849, String str) {
        Object obj = c20848.f65505.get(str);
        Object obj2 = c20849.f65505.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new C21361(this));
        animator.start();
    }

    public void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(InterfaceC12801.f36027, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            notifyListeners(InterfaceC12801.f36025, false);
            for (int i2 = 0; i2 < this.mStartValues.f4616.m17614(); i2++) {
                View view = (View) this.mStartValues.f4616.m17616(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.mEndValues.f4616.m17614(); i3++) {
                View view2 = (View) this.mEndValues.f4616.m17616(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    public void forceToEnd(ViewGroup viewGroup) {
        C0977 c0977M41373 = m41373();
        int size = c0977M41373.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        C0977 c0977 = new C0977(c0977M41373);
        c0977M41373.clear();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C6608 c6608 = (C6608) c0977.m12521(size);
            if (c6608.f17046 != null && windowId.equals(c6608.f17044)) {
                ((Animator) c0977.m12522(size)).end();
            }
        }
    }

    public void cancel() {
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        while (true) {
            size--;
            if (size >= 0) {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            } else {
                this.mAnimatorCache = animatorArr;
                notifyListeners(InterfaceC12801.f36024, false);
                return;
            }
        }
    }

    public AbstractC18164 addListener(InterfaceC7949 interfaceC7949) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
        }
        this.mListeners.add(interfaceC7949);
        return this;
    }

    public AbstractC18164 removeListener(InterfaceC7949 interfaceC7949) {
        AbstractC18164 abstractC18164;
        ArrayList arrayList = this.mListeners;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC7949) && (abstractC18164 = this.mCloneParent) != null) {
                abstractC18164.removeListener(interfaceC7949);
            }
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    public void setPathMotion(AbstractC2584 abstractC2584) {
        if (abstractC2584 == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = abstractC2584;
        }
    }

    public AbstractC2584 getPathMotion() {
        return this.mPathMotion;
    }

    public void setEpicenterCallback(AbstractC14654 abstractC14654) {
        this.mEpicenterCallback = abstractC14654;
    }

    public AbstractC14654 getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public Rect getEpicenter() {
        AbstractC14654 abstractC14654 = this.mEpicenterCallback;
        if (abstractC14654 == null) {
            return null;
        }
        return abstractC14654.mo24446();
    }

    public void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    public String toString() {
        return toString("");
    }

    @Override // 
    public AbstractC18164 clone() {
        try {
            AbstractC18164 abstractC18164 = (AbstractC18164) super.clone();
            abstractC18164.mAnimators = new ArrayList();
            abstractC18164.mStartValues = new C2741();
            abstractC18164.mEndValues = new C2741();
            abstractC18164.mStartValuesList = null;
            abstractC18164.mEndValuesList = null;
            abstractC18164.mSeekController = null;
            abstractC18164.mCloneParent = this;
            abstractC18164.mListeners = null;
            return abstractC18164;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return this.mName;
    }

    public void notifyListeners(InterfaceC12801 interfaceC12801, boolean z) {
        m41384(this, interfaceC12801, z);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41384(AbstractC18164 abstractC18164, InterfaceC12801 interfaceC12801, boolean z) {
        AbstractC18164 abstractC18165 = this.mCloneParent;
        if (abstractC18165 != null) {
            abstractC18165.m41384(abstractC18164, interfaceC12801, z);
        }
        ArrayList arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        InterfaceC7949[] interfaceC7949Arr = this.mListenersCache;
        if (interfaceC7949Arr == null) {
            interfaceC7949Arr = new InterfaceC7949[size];
        }
        this.mListenersCache = null;
        InterfaceC7949[] interfaceC7949Arr2 = (InterfaceC7949[]) this.mListeners.toArray(interfaceC7949Arr);
        for (int i = 0; i < size; i++) {
            interfaceC12801.mo8198(interfaceC7949Arr2[i], abstractC18164, z);
            interfaceC7949Arr2[i] = null;
        }
        this.mListenersCache = interfaceC7949Arr2;
    }

    public final long getTotalDurationMillis() {
        return this.mTotalDuration;
    }

    public void setCurrentPlayTimeMillis(long j, long j2) {
        long totalDurationMillis = getTotalDurationMillis();
        int i = 0;
        boolean z = j < j2;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if ((i2 < 0 && j >= 0) || (j2 > totalDurationMillis && j <= totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(InterfaceC12801.f36027, z);
        }
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int size = this.mCurrentAnimators.size(); i < size; size = size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            C13984.m31781(animator, Math.min(Math.max(0L, j), C13984.m31780(animator)));
            i++;
            i2 = i2;
        }
        int i3 = i2;
        this.mAnimatorCache = animatorArr;
        if ((j <= totalDurationMillis || j2 > totalDurationMillis) && (j >= 0 || i3 < 0)) {
            return;
        }
        if (j > totalDurationMillis) {
            this.mEnded = true;
        }
        notifyListeners(InterfaceC12801.f36025, z);
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.mDuration != -1) {
            sb.append("dur(");
            sb.append(this.mDuration);
            sb.append(") ");
        }
        if (this.mStartDelay != -1) {
            sb.append("dly(");
            sb.append(this.mStartDelay);
            sb.append(") ");
        }
        if (this.mInterpolator != null) {
            sb.append("interp(");
            sb.append(this.mInterpolator);
            sb.append(") ");
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            sb.append("tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i = 0; i < this.mTargetIds.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargetIds.get(i));
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargets.get(i2));
                }
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return sb.toString();
    }
}
