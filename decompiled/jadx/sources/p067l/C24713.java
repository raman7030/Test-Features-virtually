package p067l;

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
import bin.p000mt.plus.R;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩻ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes.dex */
public class C24713 extends AbstractC18164 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f78214;

    /* JADX INFO: renamed from: ۤ */
    public static final String[] f78209 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: ۬ */
    public static final Property f78211 = new C24160(PointF.class, "topLeft");

    /* JADX INFO: renamed from: ᩶ */
    public static final Property f78212 = new C15442(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: ᩹ */
    public static final Property f78213 = new C9408(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: ۗ */
    public static final Property f78207 = new C3926(PointF.class, "topLeft");

    /* JADX INFO: renamed from: ۙ */
    public static final Property f78208 = new C12644(PointF.class, "position");

    /* JADX INFO: renamed from: ۫ */
    public static final C3255 f78210 = new C3255();

    @Override // p067l.AbstractC18164
    public final boolean isSeekingSupported() {
        return true;
    }

    public C24713() {
        this.f78214 = false;
    }

    public C24713(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f78214 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16665.f49041);
        boolean z = C0989.m11090((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
        typedArrayObtainStyledAttributes.recycle();
        this.f78214 = z;
    }

    @Override // p067l.AbstractC18164
    public final String[] getTransitionProperties() {
        return f78209;
    }

    private void captureValues(C20848 c20848) {
        View view = c20848.f65506;
        HashMap map = c20848.f65505;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c20848.f65506.getParent());
        if (this.f78214) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // p067l.AbstractC18164
    public final void captureStartValues(C20848 c20848) {
        Rect rect;
        captureValues(c20848);
        if (!this.f78214 || (rect = (Rect) c20848.f65506.getTag(R.id.MT_Protector)) == null) {
            return;
        }
        c20848.f65505.put("android:changeBounds:clip", rect);
    }

    @Override // p067l.AbstractC18164
    public final void captureEndValues(C20848 c20848) {
        captureValues(c20848);
    }

    @Override // p067l.AbstractC18164
    public final Animator createAnimator(ViewGroup viewGroup, C20848 c20848, C20848 c20849) {
        int i;
        View view;
        ObjectAnimator objectAnimatorM46757;
        int i2;
        ObjectAnimator objectAnimator;
        Animator animator;
        Path path;
        Property property;
        ObjectAnimator objectAnimatorM46758;
        if (c20848 != null) {
            HashMap map = c20848.f65505;
            if (c20849 != null) {
                HashMap map2 = c20849.f65505;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view2 = c20849.f65506;
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
                        boolean z = this.f78214;
                        Property property2 = f78208;
                        if (z) {
                            C22859.m51062(view, i3, i5, Math.max(i11, i13) + i3, i5 + Math.max(i12, i14));
                            if (i3 == i4 && i5 == i6) {
                                objectAnimatorM46757 = null;
                            } else {
                                view = view2;
                                objectAnimatorM46757 = C20691.m46757(view, property2, getPathMotion().getPath(i3, i5, i4, i6));
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
                                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f78210, objArr);
                                C19349 c19349 = new C19349(view, rect3, z2, rect5, z3, i3, i5, i7, i9, i4, i6, i8, i10);
                                objectAnimatorOfObject.addListener(c19349);
                                addListener(c19349);
                                objectAnimator = objectAnimatorOfObject;
                            }
                            int i16 = C20177.f62438;
                            animator = objectAnimatorM46757;
                            if (objectAnimatorM46757 == null) {
                                animator = objectAnimator;
                            } else if (objectAnimator != null) {
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(objectAnimatorM46757, objectAnimator);
                                animator = animatorSet;
                            }
                        } else {
                            C22859.m51062(view2, i3, i5, i7, i9);
                            if (i15 != 2) {
                                if (i3 == i4 && i5 == i6) {
                                    path = getPathMotion().getPath(i7, i9, i8, i10);
                                    property = f78213;
                                } else {
                                    path = getPathMotion().getPath(i3, i5, i4, i6);
                                    property = f78207;
                                }
                                objectAnimatorM46758 = C20691.m46757(view2, property, path);
                            } else if (i11 == i13 && i12 == i14) {
                                objectAnimatorM46758 = C20691.m46757(view2, property2, getPathMotion().getPath(i3, i5, i4, i6));
                            } else {
                                C15995 c15995 = new C15995(view2);
                                ObjectAnimator objectAnimatorM46759 = C20691.m46757(c15995, f78211, getPathMotion().getPath(i3, i5, i4, i6));
                                ObjectAnimator objectAnimatorM467510 = C20691.m46757(c15995, f78212, getPathMotion().getPath(i7, i9, i8, i10));
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(objectAnimatorM46759, objectAnimatorM467510);
                                animatorSet2.addListener(new C18007(c15995));
                                view = view2;
                                animator = animatorSet2;
                            }
                            view = view2;
                            animator = objectAnimatorM46758;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            C3412.m6043(viewGroup4, true);
                            getRootTransition().addListener(new C18678(viewGroup4));
                        }
                        return animator;
                    }
                }
            }
        }
        return null;
    }
}
