package p067l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G1H1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10446 {
    /* JADX WARN: Code duplicated, block: B:68:0x00d9 A[Catch: RuntimeException -> 0x00df, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00df, blocks: (B:66:0x00d3, B:68:0x00d9), top: B:79:0x00d3 }] */
    /* JADX INFO: renamed from: ֫ */
    public static C7764 m24166(Context context, ComponentCallbacksC11117 componentCallbacksC11117, boolean z, boolean z2) {
        int exitAnim;
        Animator animatorLoadAnimator;
        int iM24165;
        int nextTransition = componentCallbacksC11117.getNextTransition();
        if (z2) {
            if (z) {
                exitAnim = componentCallbacksC11117.getPopEnterAnim();
            } else {
                exitAnim = componentCallbacksC11117.getPopExitAnim();
            }
        } else if (z) {
            exitAnim = componentCallbacksC11117.getEnterAnim();
        } else {
            exitAnim = componentCallbacksC11117.getExitAnim();
        }
        componentCallbacksC11117.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = componentCallbacksC11117.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.MT_Protector) != null) {
            componentCallbacksC11117.mContainer.setTag(R.id.MT_Protector, null);
        }
        ViewGroup viewGroup2 = componentCallbacksC11117.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = componentCallbacksC11117.onCreateAnimation(nextTransition, z, exitAnim);
        if (animationOnCreateAnimation != null) {
            return new C7764(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = componentCallbacksC11117.onCreateAnimator(nextTransition, z, exitAnim);
        if (animatorOnCreateAnimator != null) {
            return new C7764(animatorOnCreateAnimator);
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
                        iM24165 = m24165(context, android.R.attr.activityOpenEnterAnimation);
                    } else {
                        iM24165 = m24165(context, android.R.attr.activityOpenExitAnimation);
                    }
                } else if (z) {
                    iM24165 = m24165(context, android.R.attr.activityCloseEnterAnimation);
                } else {
                    iM24165 = m24165(context, android.R.attr.activityCloseExitAnimation);
                }
                exitAnim = iM24165;
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
                        return new C7764(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                        if (animatorLoadAnimator != null) {
                            return new C7764(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e2) {
                        if (zEquals) {
                            throw e2;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                        if (animationLoadAnimation2 != null) {
                            return new C7764(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                if (animatorLoadAnimator != null) {
                    return new C7764(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m24165(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
