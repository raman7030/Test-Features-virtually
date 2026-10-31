package l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩻ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes.dex */
public class C23511 extends AbstractC16620 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f75467;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String[] f75462 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Property f75464 = new C22929(PointF.class, "topLeft");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Property f75465 = new C13756(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Property f75466 = new C7407(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Property f75460 = new C1639(PointF.class, "topLeft");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Property f75461 = new C10812(PointF.class, "position");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C0933 f75463 = new C0933();

    @Override // l.AbstractC16620
    public final boolean isSeekingSupported() {
        return true;
    }

    public C23511() {
        this.f75467 = false;
    }

    public C23511(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75467 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15043.f45925);
        boolean z = C2958.m9022((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
        typedArrayObtainStyledAttributes.recycle();
        this.f75467 = z;
    }

    @Override // l.AbstractC16620
    public final String[] getTransitionProperties() {
        return f75462;
    }

    private void captureValues(C19444 c19444) {
        View view = c19444.f62890;
        HashMap map = c19444.f62889;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c19444.f62890.getParent());
        if (this.f75467) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // l.AbstractC16620
    public final void captureStartValues(C19444 c19444) {
        Rect rect;
        captureValues(c19444);
        if (!this.f75467 || (rect = (Rect) c19444.f62890.getTag(R.id.MT_Protector)) == null) {
            return;
        }
        c19444.f62889.put("android:changeBounds:clip", rect);
    }

    @Override // l.AbstractC16620
    public final void captureEndValues(C19444 c19444) {
        captureValues(c19444);
    }

    @Override // l.AbstractC16620
    public final Animator createAnimator(ViewGroup viewGroup, C19444 c19444, C19444 c19445) {
        int i;
        View view;
        ObjectAnimator objectAnimatorM44463;
        int i2;
        ObjectAnimator objectAnimator;
        Animator animator;
        Path path;
        Property property;
        ObjectAnimator objectAnimatorM44464;
        if (c19444 != null) {
            HashMap map = c19444.f62889;
            if (c19445 != null) {
                HashMap map2 = c19445.f62889;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view2 = c19445.f62890;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i3 = rect.left;
                    int i4 = rect2.left;
                    int i5 = rect.top;
                    int i6 = rect2.top;
                    int i7 = rect.right;
                    int i8 = rect2.right;
                    int i9 = rect.bottom;
                    int i10 = rect2.bottom;
                    int i11 = i7 - i3;
                    int i12 = i9 - i5;
                    int i13 = i8 - i4;
                    int i14 = i10 - i6;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                        i = 0;
                    } else {
                        i = (i3 == i4 && i5 == i6) ? 0 : 1;
                        if (i7 != i8 || i9 != i10) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i15 = i;
                    if (i15 > 0) {
                        boolean z = this.f75467;
                        Property property2 = f75461;
                        if (z) {
                            C21560.m48717(view, i3, i5, Math.max(i11, i13) + i3, i5 + Math.max(i12, i14));
                            if (i3 == i4 && i5 == i6) {
                                objectAnimatorM44463 = null;
                            } else {
                                view = view2;
                                objectAnimatorM44463 = C19279.m44463(view, property2, getPathMotion().getPath(i3, i5, i4, i6));
                            }
                            boolean z2 = rect3 == null;
                            if (z2) {
                                i2 = 0;
                                rect3 = new Rect(0, 0, i11, i12);
                            } else {
                                i2 = 0;
                            }
                            boolean z3 = rect4 == null;
                            Rect rect5 = z3 ? new Rect(i2, i2, i13, i14) : rect4;
                            if (rect3.equals(rect5)) {
                                objectAnimator = null;
                            } else {
                                view.setClipBounds(rect3);
                                Object[] objArr = new Object[2];
                                objArr[i2] = rect3;
                                objArr[1] = rect5;
                                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f75463, objArr);
                                C17867 c17867 = new C17867(view, rect3, z2, rect5, z3, i3, i5, i7, i9, i4, i6, i8, i10);
                                objectAnimatorOfObject.addListener(c17867);
                                addListener(c17867);
                                objectAnimator = objectAnimatorOfObject;
                            }
                            int i16 = C18738.f59215;
                            animator = objectAnimatorM44463;
                            if (objectAnimatorM44463 == null) {
                                animator = objectAnimator;
                            } else if (objectAnimator != null) {
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(objectAnimatorM44463, objectAnimator);
                                animator = animatorSet;
                            }
                        } else {
                            C21560.m48717(view2, i3, i5, i7, i9);
                            if (i15 != 2) {
                                if (i3 == i4 && i5 == i6) {
                                    path = getPathMotion().getPath(i7, i9, i8, i10);
                                    property = f75466;
                                } else {
                                    path = getPathMotion().getPath(i3, i5, i4, i6);
                                    property = f75460;
                                }
                                objectAnimatorM44464 = C19279.m44463(view2, property, path);
                            } else if (i11 == i13 && i12 == i14) {
                                objectAnimatorM44464 = C19279.m44463(view2, property2, getPathMotion().getPath(i3, i5, i4, i6));
                            } else {
                                C14338 c14338 = new C14338(view2);
                                ObjectAnimator objectAnimatorM44465 = C19279.m44463(c14338, f75464, getPathMotion().getPath(i3, i5, i4, i6));
                                ObjectAnimator objectAnimatorM44466 = C19279.m44463(c14338, f75465, getPathMotion().getPath(i7, i9, i8, i10));
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(objectAnimatorM44465, objectAnimatorM44466);
                                animatorSet2.addListener(new C16455(c14338));
                                view = view2;
                                animator = animatorSet2;
                            }
                            view = view2;
                            animator = objectAnimatorM44464;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            C1098.m3770(viewGroup4, true);
                            getRootTransition().addListener(new C17161(viewGroup4));
                        }
                        return animator;
                    }
                }
            }
        }
        return null;
    }
}
