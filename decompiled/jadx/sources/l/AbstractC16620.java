package l;

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
public abstract class AbstractC16620 implements Cloneable {
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
    public AbstractC12927 mEpicenterCallback;
    public InterfaceC5872[] mListenersCache;
    public C2727 mNameOverrides;
    public AbstractC6743 mPropagation;
    public C10106 mSeekController;
    public long mSeekOffsetInParent;
    public ArrayList mStartValuesList;
    public long mTotalDuration;
    public static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    public static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    public static final AbstractC0227 STRAIGHT_PATH_MOTION = new C21395();
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
    public C0392 mStartValues = new C0392();
    public C0392 mEndValues = new C0392();
    public C2510 mParent = null;
    public int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    public boolean mCanRemoveViews = false;
    public ArrayList mCurrentAnimators = new ArrayList();
    public Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    public int mNumInstances = 0;
    public boolean mPaused = false;
    public boolean mEnded = false;
    public AbstractC16620 mCloneParent = null;
    public ArrayList mListeners = null;
    public ArrayList mAnimators = new ArrayList();
    public AbstractC0227 mPathMotion = STRAIGHT_PATH_MOTION;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39158(int i) {
        return i >= 1 && i <= 4;
    }

    public abstract void captureEndValues(C19444 c19444);

    public void capturePropagationValues(C19444 c19444) {
    }

    public abstract void captureStartValues(C19444 c19444);

    public Animator createAnimator(ViewGroup viewGroup, C19444 c19444, C19444 c19445) {
        return null;
    }

    public AbstractC6743 getPropagation() {
        return null;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public void setPropagation(AbstractC6743 abstractC6743) {
    }

    public AbstractC16620() {
    }

    public AbstractC16620(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15043.f45928);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jM9018 = C2958.m9018(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jM9018 >= 0) {
            setDuration(jM9018);
        }
        long j = xmlResourceParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "startDelay") != null ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
        if (j > 0) {
            setStartDelay(j);
        }
        int resourceId = xmlResourceParser.getAttributeValue(Chip.NAMESPACE_ANDROID, "interpolator") != null ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String strM9020 = C2958.m9020(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM9020 != null) {
            setMatchOrder(m39161(strM9020));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m39161(String str) {
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
                    throw new InflateException(C4860.m14172("Unknown match type in matchOrder: '", strTrim, "'"));
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

    public final AbstractC16620 getRootTransition() {
        C2510 c2510 = this.mParent;
        return c2510 != null ? c2510.getRootTransition() : this;
    }

    public AbstractC16620 setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public long getDuration() {
        return this.mDuration;
    }

    public AbstractC16620 setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public AbstractC16620 setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public InterfaceC20855 createSeekController() {
        C10106 c10106 = new C10106(this);
        this.mSeekController = c10106;
        addListener(c10106);
        return this.mSeekController;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!m39158(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (m39160(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39160(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m39162(C2727 c2727, C2727 c2728) {
        C19444 c19444;
        int size = c2727.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            View view = (View) c2727.m10499(size);
            if (view != null && isValidTarget(view) && (c19444 = (C19444) c2728.remove(view)) != null && isValidTarget(c19444.f62890)) {
                this.mStartValuesList.add((C19444) c2727.m10500(size));
                this.mEndValuesList.add(c19444);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39156(C2727 c2727, C2727 c2728, C5549 c5549, C5549 c55410) {
        View view;
        int iM15699 = c5549.m15699();
        for (int i = 0; i < iM15699; i++) {
            View view2 = (View) c5549.m15701(i);
            if (view2 != null && isValidTarget(view2) && (view = (View) c55410.m15697(c5549.m15693(i), null)) != null && isValidTarget(view)) {
                C19444 c19444 = (C19444) c2727.getOrDefault(view2, null);
                C19444 c19445 = (C19444) c2728.getOrDefault(view, null);
                if (c19444 != null && c19445 != null) {
                    this.mStartValuesList.add(c19444);
                    this.mEndValuesList.add(c19445);
                    c2727.remove(view2);
                    c2728.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39154(C2727 c2727, C2727 c2728, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) sparseArray.valueAt(i);
            if (view2 != null && isValidTarget(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                C19444 c19444 = (C19444) c2727.getOrDefault(view2, null);
                C19444 c19445 = (C19444) c2728.getOrDefault(view, null);
                if (c19444 != null && c19445 != null) {
                    this.mStartValuesList.add(c19444);
                    this.mEndValuesList.add(c19445);
                    c2727.remove(view2);
                    c2728.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39155(C2727 c2727, C2727 c2728, C2727 c2729, C2727 c27210) {
        View view;
        int size = c2729.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) c2729.m10498(i);
            if (view2 != null && isValidTarget(view2) && (view = (View) c27210.getOrDefault(c2729.m10499(i), null)) != null && isValidTarget(view)) {
                C19444 c19444 = (C19444) c2727.getOrDefault(view2, null);
                C19444 c19445 = (C19444) c2728.getOrDefault(view, null);
                if (c19444 != null && c19445 != null) {
                    this.mStartValuesList.add(c19444);
                    this.mEndValuesList.add(c19445);
                    c2727.remove(view2);
                    c2728.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39153(C2727 c2727, C2727 c2728) {
        for (int i = 0; i < c2727.size(); i++) {
            C19444 c19444 = (C19444) c2727.m10498(i);
            if (isValidTarget(c19444.f62890)) {
                this.mStartValuesList.add(c19444);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < c2728.size(); i2++) {
            C19444 c19445 = (C19444) c2728.m10498(i2);
            if (isValidTarget(c19445.f62890)) {
                this.mEndValuesList.add(c19445);
                this.mStartValuesList.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39152(C0392 c0392, C0392 c0393) {
        C2727 c2727 = new C2727(c0392.f1841);
        C2727 c2728 = new C2727(c0393.f1841);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m39162(c2727, c2728);
                } else if (i2 == 2) {
                    m39155(c2727, c2728, c0392.f1840, c0393.f1840);
                } else if (i2 == 3) {
                    m39154(c2727, c2728, c0392.f1838, c0393.f1838);
                } else if (i2 == 4) {
                    m39156(c2727, c2728, c0392.f1839, c0393.f1839);
                }
                i++;
            } else {
                m39153(c2727, c2728);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111 A[SYNTHETIC] */
    public void createAnimators(ViewGroup viewGroup, C0392 c0392, C0392 c0393, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        C19444 c19444;
        Object obj;
        C2727 c2727M39146 = m39146();
        SparseIntArray sparseIntArray = new SparseIntArray();
        boolean z = getRootTransition().mSeekController != null;
        int i = 0;
        for (int size = arrayList.size(); i < size; size = size) {
            C19444 c19445 = (C19444) arrayList.get(i);
            C19444 c19446 = (C19444) arrayList2.get(i);
            if (c19445 != null && !c19445.f62888.contains(this)) {
                c19445 = null;
            }
            if (c19446 != null && !c19446.f62888.contains(this)) {
                c19446 = null;
            }
            if ((c19445 != null || c19446 != null) && (c19445 == null || c19446 == null || isTransitionRequired(c19445, c19446))) {
                Animator animatorCreateAnimator = createAnimator(viewGroup, c19445, c19446);
                if (animatorCreateAnimator != null) {
                    if (c19446 != null) {
                        view = c19446.f62890;
                        String[] transitionProperties = getTransitionProperties();
                        if (transitionProperties != null && transitionProperties.length > 0) {
                            c19444 = new C19444(view);
                            C19444 c19447 = (C19444) c0393.f1841.getOrDefault(view, null);
                            if (c19447 != null) {
                                int i2 = 0;
                                while (i2 < transitionProperties.length) {
                                    String str = transitionProperties[i2];
                                    c19444.f62889.put(str, c19447.f62889.get(str));
                                    i2++;
                                    c19447 = c19447;
                                }
                            }
                            int size2 = c2727M39146.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                C4461 c4461 = (C4461) c2727M39146.getOrDefault((Animator) c2727M39146.m10499(i3), null);
                                if (c4461.f14223 != null && c4461.f14222 == view && c4461.f14219.equals(getName()) && c4461.f14223.equals(c19444)) {
                                    animatorCreateAnimator = null;
                                    break;
                                }
                            }
                        }
                        if (animatorCreateAnimator != null) {
                            String name = getName();
                            WindowId windowId = viewGroup.getWindowId();
                            C4461 c4462 = new C4461();
                            c4462.f14222 = view;
                            c4462.f14219 = name;
                            c4462.f14223 = c19444;
                            c4462.f14220 = windowId;
                            c4462.f14221 = this;
                            c4462.f14218 = animatorCreateAnimator;
                            if (z) {
                                obj = animatorCreateAnimator;
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(animatorCreateAnimator);
                                obj = animatorSet;
                            }
                            obj = animatorCreateAnimator;
                            c2727M39146.put(obj, c4462);
                            this.mAnimators.add(obj);
                        }
                    } else {
                        view = c19445.f62890;
                    }
                    c19444 = null;
                    if (animatorCreateAnimator != null) {
                        String name2 = getName();
                        WindowId windowId2 = viewGroup.getWindowId();
                        C4461 c4463 = new C4461();
                        c4463.f14222 = view;
                        c4463.f14219 = name2;
                        c4463.f14223 = c19444;
                        c4463.f14220 = windowId2;
                        c4463.f14221 = this;
                        c4463.f14218 = animatorCreateAnimator;
                        if (z) {
                            obj = animatorCreateAnimator;
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.play(animatorCreateAnimator);
                            obj = animatorSet2;
                        }
                        obj = animatorCreateAnimator;
                        c2727M39146.put(obj, c4463);
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
                C4461 c4464 = (C4461) c2727M39146.getOrDefault((Animator) this.mAnimators.get(sparseIntArray.keyAt(i4)), null);
                c4464.f14218.setStartDelay(c4464.f14218.getStartDelay() + (((long) sparseIntArray.valueAt(i4)) - C13132.FOREVER_NS));
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
        if (this.mTargetNameExcludes != null && C17648.m41322(view) != null && this.mTargetNameExcludes.contains(C17648.m41322(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(C17648.m41322(view))) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2727 m39146() {
        C2727 c2727 = (C2727) sRunningAnimators.get();
        if (c2727 != null) {
            return c2727;
        }
        C2727 c2728 = new C2727();
        sRunningAnimators.set(c2728);
        return c2728;
    }

    public void runAnimators() {
        start();
        C2727 c2727M39146 = m39146();
        for (Animator animator : this.mAnimators) {
            if (c2727M39146.containsKey(animator)) {
                start();
                m39149(animator, c2727M39146);
            }
        }
        this.mAnimators.clear();
        end();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39149(Animator animator, C2727 c2727) {
        if (animator != null) {
            animator.addListener(new C22100(this, c2727));
            animate(animator);
        }
    }

    public void prepareAnimatorsForSeeking() {
        C2727 c2727M39146 = m39146();
        this.mTotalDuration = 0L;
        for (int i = 0; i < this.mAnimators.size(); i++) {
            Animator animator = (Animator) this.mAnimators.get(i);
            C4461 c4461 = (C4461) c2727M39146.getOrDefault(animator, null);
            if (animator != null && c4461 != null) {
                Animator animator2 = c4461.f14218;
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
                this.mTotalDuration = Math.max(this.mTotalDuration, C12222.m29718(animator));
            }
        }
        this.mAnimators.clear();
    }

    public AbstractC16620 addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    public AbstractC16620 addTarget(int i) {
        if (i != 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    public AbstractC16620 addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public AbstractC16620 addTarget(Class cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public AbstractC16620 removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public AbstractC16620 removeTarget(int i) {
        if (i != 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    public AbstractC16620 removeTarget(String str) {
        ArrayList arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public AbstractC16620 removeTarget(Class cls) {
        ArrayList arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m39145(ArrayList arrayList, Object obj, boolean z) {
        if (obj == null) {
            return arrayList;
        }
        if (z) {
            return C3050.m9341(obj, arrayList);
        }
        return C3050.m9342(obj, arrayList);
    }

    public AbstractC16620 excludeTarget(View view, boolean z) {
        this.mTargetExcludes = m39143(this.mTargetExcludes, view, z);
        return this;
    }

    public AbstractC16620 excludeTarget(int i, boolean z) {
        this.mTargetIdExcludes = m39142(this.mTargetIdExcludes, i, z);
        return this;
    }

    public AbstractC16620 excludeTarget(String str, boolean z) {
        this.mTargetNameExcludes = m39145(this.mTargetNameExcludes, str, z);
        return this;
    }

    public AbstractC16620 excludeChildren(View view, boolean z) {
        this.mTargetChildExcludes = m39143(this.mTargetChildExcludes, view, z);
        return this;
    }

    public AbstractC16620 excludeChildren(int i, boolean z) {
        this.mTargetIdChildExcludes = m39142(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m39142(ArrayList arrayList, int i, boolean z) {
        if (i <= 0) {
            return arrayList;
        }
        if (z) {
            return C3050.m9341(Integer.valueOf(i), arrayList);
        }
        return C3050.m9342(Integer.valueOf(i), arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m39143(ArrayList arrayList, View view, boolean z) {
        if (view == null) {
            return arrayList;
        }
        if (z) {
            return C3050.m9341(view, arrayList);
        }
        return C3050.m9342(view, arrayList);
    }

    public AbstractC16620 excludeTarget(Class cls, boolean z) {
        this.mTargetTypeExcludes = m39144(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    public AbstractC16620 excludeChildren(Class cls, boolean z) {
        this.mTargetTypeChildExcludes = m39144(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m39144(ArrayList arrayList, Class cls, boolean z) {
        if (cls == null) {
            return arrayList;
        }
        if (z) {
            return C3050.m9341(cls, arrayList);
        }
        return C3050.m9342(cls, arrayList);
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
        C2727 c2727;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.mTargetIds.get(i)).intValue());
                if (viewFindViewById != null) {
                    C19444 c19444 = new C19444(viewFindViewById);
                    if (z) {
                        captureStartValues(c19444);
                    } else {
                        captureEndValues(c19444);
                    }
                    c19444.f62888.add(this);
                    capturePropagationValues(c19444);
                    if (z) {
                        m39151(this.mStartValues, viewFindViewById, c19444);
                    } else {
                        m39151(this.mEndValues, viewFindViewById, c19444);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = (View) this.mTargets.get(i2);
                C19444 c19445 = new C19444(view);
                if (z) {
                    captureStartValues(c19445);
                } else {
                    captureEndValues(c19445);
                }
                c19445.f62888.add(this);
                capturePropagationValues(c19445);
                if (z) {
                    m39151(this.mStartValues, view, c19445);
                } else {
                    m39151(this.mEndValues, view, c19445);
                }
            }
        } else {
            m39150(viewGroup, z);
        }
        if (z || (c2727 = this.mNameOverrides) == null) {
            return;
        }
        int size = c2727.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add((View) this.mStartValues.f1840.remove((String) this.mNameOverrides.m10499(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.mStartValues.f1840.put((String) this.mNameOverrides.m10498(i4), view2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39151(C0392 c0392, View view, C19444 c19444) {
        C2727 c2727 = c0392.f1841;
        C2727 c2728 = c0392.f1840;
        SparseArray sparseArray = c0392.f1838;
        C5549 c5549 = c0392.f1839;
        c2727.put(view, c19444);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String strM41322 = C17648.m41322(view);
        if (strM41322 != null) {
            if (c2728.containsKey(strM41322)) {
                c2728.put(strM41322, null);
            } else {
                c2728.put(strM41322, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c5549.m15692(itemIdAtPosition) >= 0) {
                    View view2 = (View) c5549.m15697(itemIdAtPosition, null);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        c5549.m15696(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                c5549.m15696(itemIdAtPosition, view);
            }
        }
    }

    public void clearValues(boolean z) {
        if (z) {
            this.mStartValues.f1841.clear();
            this.mStartValues.f1838.clear();
            this.mStartValues.f1839.m15694();
        } else {
            this.mEndValues.f1841.clear();
            this.mEndValues.f1838.clear();
            this.mEndValues.f1839.m15694();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39150(View view, boolean z) {
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
                    C19444 c19444 = new C19444(view);
                    if (z) {
                        captureStartValues(c19444);
                    } else {
                        captureEndValues(c19444);
                    }
                    c19444.f62888.add(this);
                    capturePropagationValues(c19444);
                    if (z) {
                        m39151(this.mStartValues, view, c19444);
                    } else {
                        m39151(this.mEndValues, view, c19444);
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
                                m39150(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public C19444 getTransitionValues(View view, boolean z) {
        C2510 c2510 = this.mParent;
        if (c2510 != null) {
            return c2510.getTransitionValues(view, z);
        }
        return (C19444) (z ? this.mStartValues : this.mEndValues).f1841.getOrDefault(view, null);
    }

    public C19444 getMatchedTransitionValues(View view, boolean z) {
        C2510 c2510 = this.mParent;
        if (c2510 != null) {
            return c2510.getMatchedTransitionValues(view, z);
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
            C19444 c19444 = (C19444) arrayList.get(i);
            if (c19444 == null) {
                return null;
            }
            if (c19444.f62890 == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C19444) (z ? this.mEndValuesList : this.mStartValuesList).get(i);
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
        notifyListeners(InterfaceC10977.f33033, false);
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
                notifyListeners(InterfaceC10977.f33035, false);
            }
            this.mPaused = false;
        }
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    public void playTransition(ViewGroup viewGroup) {
        C4461 c4461;
        this.mStartValuesList = new ArrayList();
        this.mEndValuesList = new ArrayList();
        m39152(this.mStartValues, this.mEndValues);
        C2727 c2727M39146 = m39146();
        int size = c2727M39146.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) c2727M39146.m10499(i);
            if (animator != null && (c4461 = (C4461) c2727M39146.getOrDefault(animator, null)) != null) {
                AbstractC16620 abstractC16620 = c4461.f14221;
                View view = c4461.f14222;
                if (view != null && windowId.equals(c4461.f14220)) {
                    C19444 c19444 = c4461.f14223;
                    C19444 transitionValues = getTransitionValues(view, true);
                    C19444 matchedTransitionValues = getMatchedTransitionValues(view, true);
                    if (transitionValues == null && matchedTransitionValues == null) {
                        matchedTransitionValues = (C19444) this.mEndValues.f1841.getOrDefault(view, null);
                    }
                    if ((transitionValues != null || matchedTransitionValues != null) && abstractC16620.isTransitionRequired(c19444, matchedTransitionValues)) {
                        if (abstractC16620.getRootTransition().mSeekController != null) {
                            animator.cancel();
                            abstractC16620.mCurrentAnimators.remove(animator);
                            c2727M39146.remove(animator);
                            if (abstractC16620.mCurrentAnimators.size() == 0) {
                                abstractC16620.notifyListeners(InterfaceC10977.f33031, false);
                                if (!abstractC16620.mEnded) {
                                    abstractC16620.mEnded = true;
                                    abstractC16620.notifyListeners(InterfaceC10977.f33032, false);
                                }
                            }
                        } else if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            c2727M39146.remove(animator);
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
            this.mSeekController.m25390();
            this.mSeekController.getClass();
        }
    }

    public boolean isTransitionRequired(C19444 c19444, C19444 c19445) {
        if (c19444 != null && c19445 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (m39159(c19444, c19445, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c19444.f62889.keySet().iterator();
                while (it.hasNext()) {
                    if (m39159(c19444, c19445, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39159(C19444 c19444, C19444 c19445, String str) {
        Object obj = c19444.f62889.get(str);
        Object obj2 = c19445.f62889.get(str);
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
        animator.addListener(new C19984(this));
        animator.start();
    }

    public void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(InterfaceC10977.f33034, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            notifyListeners(InterfaceC10977.f33032, false);
            for (int i2 = 0; i2 < this.mStartValues.f1839.m15699(); i2++) {
                View view = (View) this.mStartValues.f1839.m15701(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.mEndValues.f1839.m15699(); i3++) {
                View view2 = (View) this.mEndValues.f1839.m15701(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    public void forceToEnd(ViewGroup viewGroup) {
        C2727 c2727M39146 = m39146();
        int size = c2727M39146.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        C2727 c2727 = new C2727(c2727M39146);
        c2727M39146.clear();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C4461 c4461 = (C4461) c2727.m10498(size);
            if (c4461.f14222 != null && windowId.equals(c4461.f14220)) {
                ((Animator) c2727.m10499(size)).end();
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
                notifyListeners(InterfaceC10977.f33031, false);
                return;
            }
        }
    }

    public AbstractC16620 addListener(InterfaceC5872 interfaceC5872) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
        }
        this.mListeners.add(interfaceC5872);
        return this;
    }

    public AbstractC16620 removeListener(InterfaceC5872 interfaceC5872) {
        AbstractC16620 abstractC16620;
        ArrayList arrayList = this.mListeners;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC5872) && (abstractC16620 = this.mCloneParent) != null) {
                abstractC16620.removeListener(interfaceC5872);
            }
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    public void setPathMotion(AbstractC0227 abstractC0227) {
        if (abstractC0227 == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = abstractC0227;
        }
    }

    public AbstractC0227 getPathMotion() {
        return this.mPathMotion;
    }

    public void setEpicenterCallback(AbstractC12927 abstractC12927) {
        this.mEpicenterCallback = abstractC12927;
    }

    public AbstractC12927 getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public Rect getEpicenter() {
        AbstractC12927 abstractC12927 = this.mEpicenterCallback;
        if (abstractC12927 == null) {
            return null;
        }
        return abstractC12927.mo22477();
    }

    public void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    public String toString() {
        return toString("");
    }

    @Override // 
    public AbstractC16620 clone() {
        try {
            AbstractC16620 abstractC16620 = (AbstractC16620) super.clone();
            abstractC16620.mAnimators = new ArrayList();
            abstractC16620.mStartValues = new C0392();
            abstractC16620.mEndValues = new C0392();
            abstractC16620.mStartValuesList = null;
            abstractC16620.mEndValuesList = null;
            abstractC16620.mSeekController = null;
            abstractC16620.mCloneParent = this;
            abstractC16620.mListeners = null;
            return abstractC16620;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return this.mName;
    }

    public void notifyListeners(InterfaceC10977 interfaceC10977, boolean z) {
        m39157(this, interfaceC10977, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39157(AbstractC16620 abstractC16620, InterfaceC10977 interfaceC10977, boolean z) {
        AbstractC16620 abstractC16621 = this.mCloneParent;
        if (abstractC16621 != null) {
            abstractC16621.m39157(abstractC16620, interfaceC10977, z);
        }
        ArrayList arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        InterfaceC5872[] interfaceC5872Arr = this.mListenersCache;
        if (interfaceC5872Arr == null) {
            interfaceC5872Arr = new InterfaceC5872[size];
        }
        this.mListenersCache = null;
        InterfaceC5872[] interfaceC5872Arr2 = (InterfaceC5872[]) this.mListeners.toArray(interfaceC5872Arr);
        for (int i = 0; i < size; i++) {
            interfaceC10977.mo6001(interfaceC5872Arr2[i], abstractC16620, z);
            interfaceC5872Arr2[i] = null;
        }
        this.mListenersCache = interfaceC5872Arr2;
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
            notifyListeners(InterfaceC10977.f33034, z);
        }
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int size = this.mCurrentAnimators.size(); i < size; size = size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            C12222.m29719(animator, Math.min(Math.max(0L, j), C12222.m29718(animator)));
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
        notifyListeners(InterfaceC10977.f33032, z);
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
