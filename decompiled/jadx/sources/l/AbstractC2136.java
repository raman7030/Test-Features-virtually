package l;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֫᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G64W */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2136 extends AbstractC16620 {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    public static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    public int mMode;
    public static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    public static final String PROPNAME_PARENT = "android:visibility:parent";
    public static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    public Animator onAppear(ViewGroup viewGroup, View view, C19444 c19444, C19444 c19445) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, C19444 c19444, C19444 c19445) {
        return null;
    }

    public AbstractC2136() {
        this.mMode = 3;
    }

    public AbstractC2136(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15043.f45930);
        int iM9018 = C2958.m9018(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iM9018 != 0) {
            setMode(iM9018);
        }
    }

    public void setMode(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i;
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // l.AbstractC16620
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    private void captureValues(C19444 c19444) {
        int visibility = c19444.f62890.getVisibility();
        HashMap map = c19444.f62889;
        map.put(PROPNAME_VISIBILITY, Integer.valueOf(visibility));
        map.put(PROPNAME_PARENT, c19444.f62890.getParent());
        int[] iArr = new int[2];
        c19444.f62890.getLocationOnScreen(iArr);
        map.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    @Override // l.AbstractC16620
    public void captureStartValues(C19444 c19444) {
        captureValues(c19444);
    }

    @Override // l.AbstractC16620
    public void captureEndValues(C19444 c19444) {
        captureValues(c19444);
    }

    public boolean isVisible(C19444 c19444) {
        if (c19444 == null) {
            return false;
        }
        HashMap map = c19444.f62889;
        return ((Integer) map.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) map.get(PROPNAME_PARENT)) != null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C7448 m7059(C19444 c19444, C19444 c19445) {
        C7448 c7448 = new C7448();
        c7448.f22869 = false;
        c7448.f22870 = false;
        if (c19444 != null) {
            HashMap map = c19444.f62889;
            if (map.containsKey(PROPNAME_VISIBILITY)) {
                c7448.f22871 = ((Integer) map.get(PROPNAME_VISIBILITY)).intValue();
                c7448.f22872 = (ViewGroup) map.get(PROPNAME_PARENT);
            } else {
                c7448.f22871 = -1;
                c7448.f22872 = null;
            }
        } else {
            c7448.f22871 = -1;
            c7448.f22872 = null;
        }
        if (c19445 != null) {
            HashMap map2 = c19445.f62889;
            if (map2.containsKey(PROPNAME_VISIBILITY)) {
                c7448.f22868 = ((Integer) map2.get(PROPNAME_VISIBILITY)).intValue();
                c7448.f22867 = (ViewGroup) map2.get(PROPNAME_PARENT);
            } else {
                c7448.f22868 = -1;
                c7448.f22867 = null;
            }
        } else {
            c7448.f22868 = -1;
            c7448.f22867 = null;
        }
        if (c19444 != null && c19445 != null) {
            int i = c7448.f22871;
            int i2 = c7448.f22868;
            if (i != i2 || c7448.f22872 != c7448.f22867) {
                if (i != i2) {
                    if (i == 0) {
                        c7448.f22870 = false;
                        c7448.f22869 = true;
                        return c7448;
                    }
                    if (i2 == 0) {
                        c7448.f22870 = true;
                        c7448.f22869 = true;
                        return c7448;
                    }
                } else {
                    if (c7448.f22867 == null) {
                        c7448.f22870 = false;
                        c7448.f22869 = true;
                        return c7448;
                    }
                    if (c7448.f22872 == null) {
                        c7448.f22870 = true;
                        c7448.f22869 = true;
                        return c7448;
                    }
                }
            }
        } else {
            if (c19444 == null && c7448.f22868 == 0) {
                c7448.f22870 = true;
                c7448.f22869 = true;
                return c7448;
            }
            if (c19445 == null && c7448.f22871 == 0) {
                c7448.f22870 = false;
                c7448.f22869 = true;
            }
        }
        return c7448;
    }

    @Override // l.AbstractC16620
    public Animator createAnimator(ViewGroup viewGroup, C19444 c19444, C19444 c19445) {
        C7448 c7448M7059 = m7059(c19444, c19445);
        if (!c7448M7059.f22869) {
            return null;
        }
        if (c7448M7059.f22872 == null && c7448M7059.f22867 == null) {
            return null;
        }
        if (c7448M7059.f22870) {
            return onAppear(viewGroup, c19444, c7448M7059.f22871, c19445, c7448M7059.f22868);
        }
        return onDisappear(viewGroup, c19444, c7448M7059.f22871, c19445, c7448M7059.f22868);
    }

    public Animator onAppear(ViewGroup viewGroup, C19444 c19444, int i, C19444 c19445, int i2) {
        if ((this.mMode & 1) != 1 || c19445 == null) {
            return null;
        }
        if (c19444 == null) {
            View view = (View) c19445.f62890.getParent();
            if (m7059(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f22869) {
                return null;
            }
        }
        return onAppear(viewGroup, c19445.f62890, c19444, c19445);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public Animator onDisappear(ViewGroup viewGroup, C19444 c19444, int i, C19444 c19445, int i2) {
        View view;
        boolean z;
        View view2;
        boolean z2;
        if ((this.mMode & 2) == 2 && c19444 != null) {
            View view3 = c19444.f62890;
            View viewM43392 = c19445 != null ? c19445.f62890 : null;
            View view4 = (View) view3.getTag(R.id.MT_Protector);
            if (view4 != null) {
                z2 = true;
                view2 = null;
            } else {
                if (viewM43392 == null || viewM43392.getParent() == null) {
                    if (viewM43392 != null) {
                        view = null;
                        z = false;
                    } else {
                        viewM43392 = null;
                        view = null;
                        z = true;
                    }
                } else if (i2 == 4 || view3 == viewM43392) {
                    view = viewM43392;
                    z = false;
                    viewM43392 = null;
                } else {
                    viewM43392 = null;
                    view = null;
                    z = true;
                }
                if (z) {
                    if (view3.getParent() != null) {
                        if (view3.getParent() instanceof View) {
                            View view5 = (View) view3.getParent();
                            if (!m7059(getTransitionValues(view5, true), getMatchedTransitionValues(view5, true)).f22869) {
                                viewM43392 = C18738.m43392(viewGroup, view3, view5);
                            } else {
                                int id = view5.getId();
                                if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.mCanRemoveViews) {
                                }
                            }
                        }
                        view2 = view;
                        view4 = viewM43392;
                        z2 = false;
                    }
                    z2 = false;
                    view2 = view;
                    view4 = view3;
                } else {
                    view2 = view;
                    view4 = viewM43392;
                    z2 = false;
                }
            }
            if (view4 != null) {
                if (!z2) {
                    int[] iArr = (int[]) c19444.f62889.get(PROPNAME_SCREEN_LOCATION);
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view4.offsetLeftAndRight((i3 - iArr2[0]) - view4.getLeft());
                    view4.offsetTopAndBottom((i4 - iArr2[1]) - view4.getTop());
                    viewGroup.getOverlay().add(view4);
                }
                Animator animatorOnDisappear = onDisappear(viewGroup, view4, c19444, c19445);
                if (!z2) {
                    if (animatorOnDisappear == null) {
                        viewGroup.getOverlay().remove(view4);
                        return animatorOnDisappear;
                    }
                    view3.setTag(R.id.MT_Protector, view4);
                    C13797 c13797 = new C13797(this, viewGroup, view4, view3);
                    animatorOnDisappear.addListener(c13797);
                    animatorOnDisappear.addPauseListener(c13797);
                    getRootTransition().addListener(c13797);
                }
                return animatorOnDisappear;
            }
            if (view2 != null) {
                int visibility = view2.getVisibility();
                C21560.m48716(view2, 0);
                Animator animatorOnDisappear2 = onDisappear(viewGroup, view2, c19444, c19445);
                if (animatorOnDisappear2 != null) {
                    C22970 c22970 = new C22970(i2, view2);
                    animatorOnDisappear2.addListener(c22970);
                    getRootTransition().addListener(c22970);
                    return animatorOnDisappear2;
                }
                C21560.m48716(view2, visibility);
                return animatorOnDisappear2;
            }
        }
        return null;
    }

    @Override // l.AbstractC16620
    public boolean isTransitionRequired(C19444 c19444, C19444 c19445) {
        if (c19444 == null && c19445 == null) {
            return false;
        }
        if (c19444 != null && c19445 != null && c19445.f62889.containsKey(PROPNAME_VISIBILITY) != c19444.f62889.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        C7448 c7448M7059 = m7059(c19444, c19445);
        if (c7448M7059.f22869) {
            return c7448M7059.f22871 == 0 || c7448M7059.f22868 == 0;
        }
        return false;
    }
}
