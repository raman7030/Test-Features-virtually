package p067l;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֫᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G64W */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4399 extends AbstractC18164 {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    public static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    public int mMode;
    public static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    public static final String PROPNAME_PARENT = "android:visibility:parent";
    public static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    public Animator onAppear(ViewGroup viewGroup, View view, C20848 c20848, C20848 c20849) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, C20848 c20848, C20848 c20849) {
        return null;
    }

    public AbstractC4399() {
        this.mMode = 3;
    }

    public AbstractC4399(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16665.f49046);
        int iM11086 = C0989.m11086(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iM11086 != 0) {
            setMode(iM11086);
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

    @Override // p067l.AbstractC18164
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    private void captureValues(C20848 c20848) {
        int visibility = c20848.f65506.getVisibility();
        HashMap map = c20848.f65505;
        map.put(PROPNAME_VISIBILITY, Integer.valueOf(visibility));
        map.put(PROPNAME_PARENT, c20848.f65506.getParent());
        int[] iArr = new int[2];
        c20848.f65506.getLocationOnScreen(iArr);
        map.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    @Override // p067l.AbstractC18164
    public void captureStartValues(C20848 c20848) {
        captureValues(c20848);
    }

    @Override // p067l.AbstractC18164
    public void captureEndValues(C20848 c20848) {
        captureValues(c20848);
    }

    public boolean isVisible(C20848 c20848) {
        if (c20848 == null) {
            return false;
        }
        HashMap map = c20848.f65505;
        return ((Integer) map.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) map.get(PROPNAME_PARENT)) != null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: ֫ */
    private C9447 m9154(C20848 c20848, C20848 c20849) {
        C9447 c9447 = new C9447();
        c9447.f25781 = false;
        c9447.f25782 = false;
        if (c20848 != null) {
            HashMap map = c20848.f65505;
            if (map.containsKey(PROPNAME_VISIBILITY)) {
                c9447.f25783 = ((Integer) map.get(PROPNAME_VISIBILITY)).intValue();
                c9447.f25784 = (ViewGroup) map.get(PROPNAME_PARENT);
            } else {
                c9447.f25783 = -1;
                c9447.f25784 = null;
            }
        } else {
            c9447.f25783 = -1;
            c9447.f25784 = null;
        }
        if (c20849 != null) {
            HashMap map2 = c20849.f65505;
            if (map2.containsKey(PROPNAME_VISIBILITY)) {
                c9447.f25780 = ((Integer) map2.get(PROPNAME_VISIBILITY)).intValue();
                c9447.f25779 = (ViewGroup) map2.get(PROPNAME_PARENT);
            } else {
                c9447.f25780 = -1;
                c9447.f25779 = null;
            }
        } else {
            c9447.f25780 = -1;
            c9447.f25779 = null;
        }
        if (c20848 != null && c20849 != null) {
            int i = c9447.f25783;
            int i2 = c9447.f25780;
            if (i != i2 || c9447.f25784 != c9447.f25779) {
                if (i != i2) {
                    if (i == 0) {
                        c9447.f25782 = false;
                        c9447.f25781 = true;
                        return c9447;
                    }
                    if (i2 == 0) {
                        c9447.f25782 = true;
                        c9447.f25781 = true;
                        return c9447;
                    }
                } else {
                    if (c9447.f25779 == null) {
                        c9447.f25782 = false;
                        c9447.f25781 = true;
                        return c9447;
                    }
                    if (c9447.f25784 == null) {
                        c9447.f25782 = true;
                        c9447.f25781 = true;
                        return c9447;
                    }
                }
            }
        } else {
            if (c20848 == null && c9447.f25780 == 0) {
                c9447.f25782 = true;
                c9447.f25781 = true;
                return c9447;
            }
            if (c20849 == null && c9447.f25783 == 0) {
                c9447.f25782 = false;
                c9447.f25781 = true;
            }
        }
        return c9447;
    }

    @Override // p067l.AbstractC18164
    public Animator createAnimator(ViewGroup viewGroup, C20848 c20848, C20848 c20849) {
        C9447 c9447M9154 = m9154(c20848, c20849);
        if (!c9447M9154.f25781) {
            return null;
        }
        if (c9447M9154.f25784 == null && c9447M9154.f25779 == null) {
            return null;
        }
        if (c9447M9154.f25782) {
            return onAppear(viewGroup, c20848, c9447M9154.f25783, c20849, c9447M9154.f25780);
        }
        return onDisappear(viewGroup, c20848, c9447M9154.f25783, c20849, c9447M9154.f25780);
    }

    public Animator onAppear(ViewGroup viewGroup, C20848 c20848, int i, C20848 c20849, int i2) {
        if ((this.mMode & 1) != 1 || c20849 == null) {
            return null;
        }
        if (c20848 == null) {
            View view = (View) c20849.f65506.getParent();
            if (m9154(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f25781) {
                return null;
            }
        }
        return onAppear(viewGroup, c20849.f65506, c20848, c20849);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public Animator onDisappear(ViewGroup viewGroup, C20848 c20848, int i, C20848 c20849, int i2) {
        View view;
        boolean z;
        View view2;
        boolean z2;
        if ((this.mMode & 2) == 2 && c20848 != null) {
            View view3 = c20848.f65506;
            View viewM45659 = c20849 != null ? c20849.f65506 : null;
            View view4 = (View) view3.getTag(R.id.MT_Protector);
            if (view4 != null) {
                z2 = true;
                view2 = null;
            } else {
                if (viewM45659 == null || viewM45659.getParent() == null) {
                    if (viewM45659 != null) {
                        view = null;
                        z = false;
                    } else {
                        viewM45659 = null;
                        view = null;
                        z = true;
                    }
                } else if (i2 == 4 || view3 == viewM45659) {
                    view = viewM45659;
                    z = false;
                    viewM45659 = null;
                } else {
                    viewM45659 = null;
                    view = null;
                    z = true;
                }
                if (z) {
                    if (view3.getParent() != null) {
                        if (view3.getParent() instanceof View) {
                            View view5 = (View) view3.getParent();
                            if (!m9154(getTransitionValues(view5, true), getMatchedTransitionValues(view5, true)).f25781) {
                                viewM45659 = C20177.m45659(viewGroup, view3, view5);
                            } else {
                                int id = view5.getId();
                                if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.mCanRemoveViews) {
                                }
                            }
                        }
                        view2 = view;
                        view4 = viewM45659;
                        z2 = false;
                    }
                    z2 = false;
                    view2 = view;
                    view4 = view3;
                } else {
                    view2 = view;
                    view4 = viewM45659;
                    z2 = false;
                }
            }
            if (view4 != null) {
                if (!z2) {
                    int[] iArr = (int[]) c20848.f65505.get(PROPNAME_SCREEN_LOCATION);
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view4.offsetLeftAndRight((i3 - iArr2[0]) - view4.getLeft());
                    view4.offsetTopAndBottom((i4 - iArr2[1]) - view4.getTop());
                    viewGroup.getOverlay().add(view4);
                }
                Animator animatorOnDisappear = onDisappear(viewGroup, view4, c20848, c20849);
                if (!z2) {
                    if (animatorOnDisappear == null) {
                        viewGroup.getOverlay().remove(view4);
                        return animatorOnDisappear;
                    }
                    view3.setTag(R.id.MT_Protector, view4);
                    C15481 c15481 = new C15481(this, viewGroup, view4, view3);
                    animatorOnDisappear.addListener(c15481);
                    animatorOnDisappear.addPauseListener(c15481);
                    getRootTransition().addListener(c15481);
                }
                return animatorOnDisappear;
            }
            if (view2 != null) {
                int visibility = view2.getVisibility();
                C22859.m51061(view2, 0);
                Animator animatorOnDisappear2 = onDisappear(viewGroup, view2, c20848, c20849);
                if (animatorOnDisappear2 != null) {
                    C24199 c24199 = new C24199(i2, view2);
                    animatorOnDisappear2.addListener(c24199);
                    getRootTransition().addListener(c24199);
                    return animatorOnDisappear2;
                }
                C22859.m51061(view2, visibility);
                return animatorOnDisappear2;
            }
        }
        return null;
    }

    @Override // p067l.AbstractC18164
    public boolean isTransitionRequired(C20848 c20848, C20848 c20849) {
        if (c20848 == null && c20849 == null) {
            return false;
        }
        if (c20848 != null && c20849 != null && c20849.f65505.containsKey(PROPNAME_VISIBILITY) != c20848.f65505.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        C9447 c9447M9154 = m9154(c20848, c20849);
        if (c9447M9154.f25781) {
            return c9447M9154.f25783 == 0 || c9447M9154.f25780 == 0;
        }
        return false;
    }
}
