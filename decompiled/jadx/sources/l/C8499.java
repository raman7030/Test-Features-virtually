package l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G1H1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8499 {
    /* JADX WARN: Code duplicated, block: B:68:0x00d9 A[Catch: RuntimeException -> 0x00df, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00df, blocks: (B:66:0x00d3, B:68:0x00d9), top: B:79:0x00d3 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5677 m22198(Context context, ComponentCallbacksC9205 componentCallbacksC9205, boolean z, boolean z2) {
        int exitAnim;
        Animator animatorLoadAnimator;
        int iM22197;
        int nextTransition = componentCallbacksC9205.getNextTransition();
        if (z2) {
            if (z) {
                exitAnim = componentCallbacksC9205.getPopEnterAnim();
            } else {
                exitAnim = componentCallbacksC9205.getPopExitAnim();
            }
        } else if (z) {
            exitAnim = componentCallbacksC9205.getEnterAnim();
        } else {
            exitAnim = componentCallbacksC9205.getExitAnim();
        }
        componentCallbacksC9205.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = componentCallbacksC9205.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.MT_Protector) != null) {
            componentCallbacksC9205.mContainer.setTag(R.id.MT_Protector, null);
        }
        ViewGroup viewGroup2 = componentCallbacksC9205.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = componentCallbacksC9205.onCreateAnimation(nextTransition, z, exitAnim);
        if (animationOnCreateAnimation != null) {
            return new C5677(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = componentCallbacksC9205.onCreateAnimator(nextTransition, z, exitAnim);
        if (animatorOnCreateAnimator != null) {
            return new C5677(animatorOnCreateAnimator);
        }
        if (exitAnim == 0 && nextTransition != 0) {
            if (nextTransition == 4097) {
                exitAnim = z ? R.animator.MT_Protector : R.animator.MT_Protector;
            } else if (nextTransition != 8194) {
                if (nextTransition != 8197) {
                    if (nextTransition == 4099) {
                        exitAnim = z ? R.animator.MT_Protector : R.animator.MT_Protector;
                    } else if (nextTransition != 4100) {
                        exitAnim = -1;
                    } else if (z) {
                        iM22197 = m22197(context, android.R.attr.activityOpenEnterAnimation);
                    } else {
                        iM22197 = m22197(context, android.R.attr.activityOpenExitAnimation);
                    }
                } else if (z) {
                    iM22197 = m22197(context, android.R.attr.activityCloseEnterAnimation);
                } else {
                    iM22197 = m22197(context, android.R.attr.activityCloseExitAnimation);
                }
                exitAnim = iM22197;
            } else {
                exitAnim = z ? R.animator.MT_Protector : R.animator.MT_Protector;
            }
        }
        if (exitAnim != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(exitAnim));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, exitAnim);
                    if (animationLoadAnimation != null) {
                        return new C5677(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                        if (animatorLoadAnimator != null) {
                            return new C5677(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e2) {
                        if (zEquals) {
                            throw e2;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                        if (animationLoadAnimation2 != null) {
                            return new C5677(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                if (animatorLoadAnimator != null) {
                    return new C5677(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22197(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
