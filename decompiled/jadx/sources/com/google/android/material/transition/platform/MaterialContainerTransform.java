package com.google.android.material.transition.platform;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import l.C17648;
import l.C17931;
import l.C20382;
import l.C20754;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialContainerTransform extends Transition {
    public static final ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS;
    public static final ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS_ARC;
    public static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    public static final String PROP_BOUNDS = "materialContainerTransition:bounds";
    public static final String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    public static final String TAG = "MaterialContainerTransform";
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    public boolean appliedThemeValues;
    public int containerColor;
    public boolean drawDebugEnabled;
    public int drawingViewId;
    public boolean elevationShadowEnabled;
    public int endContainerColor;
    public float endElevation;
    public ShapeAppearanceModel endShapeAppearanceModel;
    public View endView;
    public int endViewId;
    public int fadeMode;
    public ProgressThresholds fadeProgressThresholds;
    public int fitMode;
    public boolean holdAtEndEnabled;
    public boolean pathMotionCustom;
    public ProgressThresholds scaleMaskProgressThresholds;
    public ProgressThresholds scaleProgressThresholds;
    public int scrimColor;
    public ProgressThresholds shapeMaskProgressThresholds;
    public int startContainerColor;
    public float startElevation;
    public ShapeAppearanceModel startShapeAppearanceModel;
    public View startView;
    public int startViewId;
    public int transitionDirection;
    public static final String[] TRANSITION_PROPS = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
    public static final ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS = new ProgressThresholdsGroup(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f));
    public static final ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS_ARC = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));

    @Retention(RetentionPolicy.SOURCE)
    public @interface FadeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FitMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TransitionDirection {
    }

    static {
        DEFAULT_RETURN_THRESHOLDS = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f));
        DEFAULT_RETURN_THRESHOLDS_ARC = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f));
    }

    public MaterialContainerTransform() {
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = R.id.content;
        this.startViewId = -1;
        this.endViewId = -1;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 1375731712;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        this.elevationShadowEnabled = Build.VERSION.SDK_INT >= 28;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
    }

    public MaterialContainerTransform(Context context, boolean z) {
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = R.id.content;
        this.startViewId = -1;
        this.endViewId = -1;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 1375731712;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        this.elevationShadowEnabled = Build.VERSION.SDK_INT >= 28;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
        maybeApplyThemeValues(context, z);
        this.appliedThemeValues = true;
    }

    public int getStartViewId() {
        return this.startViewId;
    }

    public void setStartViewId(int i) {
        this.startViewId = i;
    }

    public int getEndViewId() {
        return this.endViewId;
    }

    public void setEndViewId(int i) {
        this.endViewId = i;
    }

    public View getStartView() {
        return this.startView;
    }

    public void setStartView(View view) {
        this.startView = view;
    }

    public View getEndView() {
        return this.endView;
    }

    public void setEndView(View view) {
        this.endView = view;
    }

    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.startShapeAppearanceModel;
    }

    public void setStartShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.startShapeAppearanceModel = shapeAppearanceModel;
    }

    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.endShapeAppearanceModel;
    }

    public void setEndShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.endShapeAppearanceModel = shapeAppearanceModel;
    }

    public boolean isElevationShadowEnabled() {
        return this.elevationShadowEnabled;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.elevationShadowEnabled = z;
    }

    public float getStartElevation() {
        return this.startElevation;
    }

    public void setStartElevation(float f) {
        this.startElevation = f;
    }

    public float getEndElevation() {
        return this.endElevation;
    }

    public void setEndElevation(float f) {
        this.endElevation = f;
    }

    public int getDrawingViewId() {
        return this.drawingViewId;
    }

    public void setDrawingViewId(int i) {
        this.drawingViewId = i;
    }

    public int getContainerColor() {
        return this.containerColor;
    }

    public void setContainerColor(int i) {
        this.containerColor = i;
    }

    public int getStartContainerColor() {
        return this.startContainerColor;
    }

    public void setStartContainerColor(int i) {
        this.startContainerColor = i;
    }

    public int getEndContainerColor() {
        return this.endContainerColor;
    }

    public void setEndContainerColor(int i) {
        this.endContainerColor = i;
    }

    public void setAllContainerColors(int i) {
        this.containerColor = i;
        this.startContainerColor = i;
        this.endContainerColor = i;
    }

    public int getScrimColor() {
        return this.scrimColor;
    }

    public void setScrimColor(int i) {
        this.scrimColor = i;
    }

    public int getTransitionDirection() {
        return this.transitionDirection;
    }

    public void setTransitionDirection(int i) {
        this.transitionDirection = i;
    }

    public int getFadeMode() {
        return this.fadeMode;
    }

    public void setFadeMode(int i) {
        this.fadeMode = i;
    }

    public int getFitMode() {
        return this.fitMode;
    }

    public void setFitMode(int i) {
        this.fitMode = i;
    }

    public ProgressThresholds getFadeProgressThresholds() {
        return this.fadeProgressThresholds;
    }

    public void setFadeProgressThresholds(ProgressThresholds progressThresholds) {
        this.fadeProgressThresholds = progressThresholds;
    }

    public ProgressThresholds getScaleProgressThresholds() {
        return this.scaleProgressThresholds;
    }

    public void setScaleProgressThresholds(ProgressThresholds progressThresholds) {
        this.scaleProgressThresholds = progressThresholds;
    }

    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.scaleMaskProgressThresholds;
    }

    public void setScaleMaskProgressThresholds(ProgressThresholds progressThresholds) {
        this.scaleMaskProgressThresholds = progressThresholds;
    }

    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.shapeMaskProgressThresholds;
    }

    public void setShapeMaskProgressThresholds(ProgressThresholds progressThresholds) {
        this.shapeMaskProgressThresholds = progressThresholds;
    }

    public boolean isHoldAtEndEnabled() {
        return this.holdAtEndEnabled;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.holdAtEndEnabled = z;
    }

    public boolean isDrawDebugEnabled() {
        return this.drawDebugEnabled;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.drawDebugEnabled = z;
    }

    @Override // android.transition.Transition
    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.pathMotionCustom = true;
    }

    @Override // android.transition.Transition
    public String[] getTransitionProperties() {
        return TRANSITION_PROPS;
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues, this.startView, this.startViewId, this.startShapeAppearanceModel);
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues, this.endView, this.endViewId, this.endShapeAppearanceModel);
    }

    public static void captureValues(TransitionValues transitionValues, View view, int i, ShapeAppearanceModel shapeAppearanceModel) {
        if (i != -1) {
            transitionValues.view = TransitionUtils.findDescendantOrAncestorById(transitionValues.view, i);
        } else if (view != null) {
            transitionValues.view = view;
        } else if (transitionValues.view.getTag(C20754.f67206) instanceof View) {
            View view2 = (View) transitionValues.view.getTag(C20754.f67206);
            transitionValues.view.setTag(C20754.f67206, null);
            transitionValues.view = view2;
        }
        View view3 = transitionValues.view;
        int i2 = C17648.f53953;
        if (!view3.isLaidOut() && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        RectF relativeBounds = view3.getParent() == null ? TransitionUtils.getRelativeBounds(view3) : TransitionUtils.getLocationOnScreen(view3);
        transitionValues.values.put("materialContainerTransition:bounds", relativeBounds);
        transitionValues.values.put("materialContainerTransition:shapeAppearance", captureShapeAppearance(view3, relativeBounds, shapeAppearanceModel));
    }

    public static ShapeAppearanceModel captureShapeAppearance(View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel) {
        return TransitionUtils.convertToRelativeCornerSizes(getShapeAppearance(view, shapeAppearanceModel), rectF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ShapeAppearanceModel getShapeAppearance(View view, ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        if (view.getTag(C20754.f67206) instanceof ShapeAppearanceModel) {
            return (ShapeAppearanceModel) view.getTag(C20754.f67206);
        }
        Context context = view.getContext();
        int transitionShapeAppearanceResId = getTransitionShapeAppearanceResId(context);
        if (transitionShapeAppearanceResId != -1) {
            return ShapeAppearanceModel.builder(context, transitionShapeAppearanceResId, 0).build();
        }
        if (view instanceof Shapeable) {
            return ((Shapeable) view).getShapeAppearanceModel();
        }
        return ShapeAppearanceModel.builder().build();
    }

    public static int getTransitionShapeAppearanceResId(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{C17931.f55910});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @Override // android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        final View viewFindAncestorById;
        View view;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF = (RectF) transitionValues.values.get("materialContainerTransition:bounds");
            ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) transitionValues.values.get("materialContainerTransition:shapeAppearance");
            if (rectF != null && shapeAppearanceModel != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get("materialContainerTransition:bounds");
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) transitionValues2.values.get("materialContainerTransition:shapeAppearance");
                if (rectF2 != null && shapeAppearanceModel2 != null) {
                    final View view2 = transitionValues.view;
                    final View view3 = transitionValues2.view;
                    View view4 = view3.getParent() != null ? view3 : view2;
                    if (this.drawingViewId == view4.getId()) {
                        viewFindAncestorById = (View) view4.getParent();
                        view = view4;
                    } else {
                        viewFindAncestorById = TransitionUtils.findAncestorById(view4, this.drawingViewId);
                        view = null;
                    }
                    RectF locationOnScreen = TransitionUtils.getLocationOnScreen(viewFindAncestorById);
                    float f = -locationOnScreen.left;
                    float f2 = -locationOnScreen.top;
                    RectF rectFCalculateDrawableBounds = calculateDrawableBounds(viewFindAncestorById, view, f, f2);
                    rectF.offset(f, f2);
                    rectF2.offset(f, f2);
                    boolean zIsEntering = isEntering(rectF, rectF2);
                    if (!this.appliedThemeValues) {
                        maybeApplyThemeValues(view4.getContext(), zIsEntering);
                    }
                    final TransitionDrawable transitionDrawable = new TransitionDrawable(getPathMotion(), view2, rectF, shapeAppearanceModel, getElevationOrDefault(this.startElevation, view2), view3, rectF2, shapeAppearanceModel2, getElevationOrDefault(this.endElevation, view3), this.containerColor, this.startContainerColor, this.endContainerColor, this.scrimColor, zIsEntering, this.elevationShadowEnabled, FadeModeEvaluators.get(this.fadeMode, zIsEntering), FitModeEvaluators.get(this.fitMode, zIsEntering, rectF, rectF2), buildThresholdsGroup(zIsEntering), this.drawDebugEnabled);
                    transitionDrawable.setBounds(Math.round(rectFCalculateDrawableBounds.left), Math.round(rectFCalculateDrawableBounds.top), Math.round(rectFCalculateDrawableBounds.right), Math.round(rectFCalculateDrawableBounds.bottom));
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            transitionDrawable.setProgress(valueAnimator.getAnimatedFraction());
                        }
                    });
                    addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.2
                        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                        public void onTransitionStart(Transition transition) {
                            ViewUtils.getOverlay(viewFindAncestorById).add(transitionDrawable);
                            view2.setAlpha(0.0f);
                            view3.setAlpha(0.0f);
                        }

                        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                        public void onTransitionEnd(Transition transition) {
                            MaterialContainerTransform.this.removeListener(this);
                            if (MaterialContainerTransform.this.holdAtEndEnabled) {
                                return;
                            }
                            view2.setAlpha(1.0f);
                            view3.setAlpha(1.0f);
                            ViewUtils.getOverlay(viewFindAncestorById).remove(transitionDrawable);
                        }
                    });
                    return valueAnimatorOfFloat;
                }
            }
        }
        return null;
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
        TransitionUtils.maybeApplyThemeInterpolator(this, context, C17931.f55271, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        TransitionUtils.maybeApplyThemeDuration(this, context, z ? C17931.f54897 : C17931.f54828);
        if (this.pathMotionCustom) {
            return;
        }
        TransitionUtils.maybeApplyThemePath(this, context, C17931.f55580);
    }

    public static float getElevationOrDefault(float f, View view) {
        return f != -1.0f ? f : C17648.m41320(view);
    }

    public static RectF calculateDrawableBounds(View view, View view2, float f, float f2) {
        if (view2 != null) {
            RectF locationOnScreen = TransitionUtils.getLocationOnScreen(view2);
            locationOnScreen.offset(f, f2);
            return locationOnScreen;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    private boolean isEntering(RectF rectF, RectF rectF2) {
        int i = this.transitionDirection;
        if (i == 0) {
            return TransitionUtils.calculateArea(rectF2) > TransitionUtils.calculateArea(rectF);
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.transitionDirection);
    }

    private ProgressThresholdsGroup buildThresholdsGroup(boolean z) {
        PathMotion pathMotion = getPathMotion();
        if ((pathMotion instanceof ArcMotion) || (pathMotion instanceof MaterialArcMotion)) {
            return getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS_ARC, DEFAULT_RETURN_THRESHOLDS_ARC);
        }
        return getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS, DEFAULT_RETURN_THRESHOLDS);
    }

    private ProgressThresholdsGroup getThresholdsOrDefault(boolean z, ProgressThresholdsGroup progressThresholdsGroup, ProgressThresholdsGroup progressThresholdsGroup2) {
        if (!z) {
            progressThresholdsGroup = progressThresholdsGroup2;
        }
        return new ProgressThresholdsGroup((ProgressThresholds) TransitionUtils.defaultIfNull(this.fadeProgressThresholds, progressThresholdsGroup.fade), (ProgressThresholds) TransitionUtils.defaultIfNull(this.scaleProgressThresholds, progressThresholdsGroup.scale), (ProgressThresholds) TransitionUtils.defaultIfNull(this.scaleMaskProgressThresholds, progressThresholdsGroup.scaleMask), (ProgressThresholds) TransitionUtils.defaultIfNull(this.shapeMaskProgressThresholds, progressThresholdsGroup.shapeMask));
    }

    public final class TransitionDrawable extends Drawable {
        public static final int COMPAT_SHADOW_COLOR = -7829368;
        public static final int SHADOW_COLOR = 754974720;
        public static final float SHADOW_DX_MULTIPLIER_ADJUSTMENT = 0.3f;
        public static final float SHADOW_DY_MULTIPLIER_ADJUSTMENT = 1.5f;
        public final MaterialShapeDrawable compatShadowDrawable;
        public final Paint containerPaint;
        public float currentElevation;
        public float currentElevationDy;
        public final RectF currentEndBounds;
        public final RectF currentEndBoundsMasked;
        public RectF currentMaskBounds;
        public final RectF currentStartBounds;
        public final RectF currentStartBoundsMasked;
        public final Paint debugPaint;
        public final Path debugPath;
        public final float displayHeight;
        public final float displayWidth;
        public final boolean drawDebugEnabled;
        public final boolean elevationShadowEnabled;
        public final RectF endBounds;
        public final Paint endContainerPaint;
        public final float endElevation;
        public final ShapeAppearanceModel endShapeAppearanceModel;
        public final View endView;
        public final boolean entering;
        public final FadeModeEvaluator fadeModeEvaluator;
        public FadeModeResult fadeModeResult;
        public final FitModeEvaluator fitModeEvaluator;
        public FitModeResult fitModeResult;
        public final MaskEvaluator maskEvaluator;
        public final float motionPathLength;
        public final PathMeasure motionPathMeasure;
        public final float[] motionPathPosition;
        public float progress;
        public final ProgressThresholdsGroup progressThresholds;
        public final Paint scrimPaint;
        public final Paint shadowPaint;
        public final RectF startBounds;
        public final Paint startContainerPaint;
        public final float startElevation;
        public final ShapeAppearanceModel startShapeAppearanceModel;
        public final View startView;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup, boolean z3) {
            Paint paint = new Paint();
            this.containerPaint = paint;
            Paint paint2 = new Paint();
            this.startContainerPaint = paint2;
            Paint paint3 = new Paint();
            this.endContainerPaint = paint3;
            this.shadowPaint = new Paint();
            Paint paint4 = new Paint();
            this.scrimPaint = paint4;
            this.maskEvaluator = new MaskEvaluator();
            this.motionPathPosition = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.compatShadowDrawable = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.debugPaint = paint5;
            this.debugPath = new Path();
            this.startView = view;
            this.startBounds = rectF;
            this.startShapeAppearanceModel = shapeAppearanceModel;
            this.startElevation = f;
            this.endView = view2;
            this.endBounds = rectF2;
            this.endShapeAppearanceModel = shapeAppearanceModel2;
            this.endElevation = f2;
            this.entering = z;
            this.elevationShadowEnabled = z2;
            this.fadeModeEvaluator = fadeModeEvaluator;
            this.fitModeEvaluator = fitModeEvaluator;
            this.progressThresholds = progressThresholdsGroup;
            this.drawDebugEnabled = z3;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.displayWidth = displayMetrics.widthPixels;
            this.displayHeight = displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.currentStartBounds = rectF3;
            this.currentStartBoundsMasked = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.currentEndBounds = rectF4;
            this.currentEndBoundsMasked = new RectF(rectF4);
            PointF motionPathPoint = getMotionPathPoint(rectF);
            PointF motionPathPoint2 = getMotionPathPoint(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(motionPathPoint.x, motionPathPoint.y, motionPathPoint2.x, motionPathPoint2.y), false);
            this.motionPathMeasure = pathMeasure;
            this.motionPathLength = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(TransitionUtils.createColorShader(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            updateProgress(0.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.scrimPaint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.scrimPaint);
            }
            int iSave = this.drawDebugEnabled ? canvas.save() : -1;
            if (this.elevationShadowEnabled && this.currentElevation > 0.0f) {
                drawElevationShadow(canvas);
            }
            this.maskEvaluator.clip(canvas);
            maybeDrawContainerColor(canvas, this.containerPaint);
            if (this.fadeModeResult.endOnTop) {
                drawStartView(canvas);
                drawEndView(canvas);
            } else {
                drawEndView(canvas);
                drawStartView(canvas);
            }
            if (this.drawDebugEnabled) {
                canvas.restoreToCount(iSave);
                drawDebugCumulativePath(canvas, this.currentStartBounds, this.debugPath, -65281);
                drawDebugRect(canvas, this.currentStartBoundsMasked, -256);
                drawDebugRect(canvas, this.currentStartBounds, -16711936);
                drawDebugRect(canvas, this.currentEndBoundsMasked, -16711681);
                drawDebugRect(canvas, this.currentEndBounds, -16776961);
            }
        }

        private void drawElevationShadow(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.maskEvaluator.getPath(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                drawElevationShadowWithPaintShadowLayer(canvas);
            } else {
                drawElevationShadowWithMaterialShapeDrawable(canvas);
            }
            canvas.restore();
        }

        private void drawElevationShadowWithPaintShadowLayer(Canvas canvas) {
            ShapeAppearanceModel currentShapeAppearanceModel = this.maskEvaluator.getCurrentShapeAppearanceModel();
            if (currentShapeAppearanceModel.isRoundRect(this.currentMaskBounds)) {
                float cornerSize = currentShapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.currentMaskBounds);
                canvas.drawRoundRect(this.currentMaskBounds, cornerSize, cornerSize, this.shadowPaint);
            } else {
                canvas.drawPath(this.maskEvaluator.getPath(), this.shadowPaint);
            }
        }

        private void drawElevationShadowWithMaterialShapeDrawable(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.compatShadowDrawable;
            RectF rectF = this.currentMaskBounds;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.compatShadowDrawable.setElevation(this.currentElevation);
            this.compatShadowDrawable.setShadowVerticalOffset((int) this.currentElevationDy);
            this.compatShadowDrawable.setShapeAppearanceModel(this.maskEvaluator.getCurrentShapeAppearanceModel());
            this.compatShadowDrawable.draw(canvas);
        }

        private void drawStartView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.startContainerPaint);
            Rect bounds = getBounds();
            RectF rectF = this.currentStartBounds;
            TransitionUtils.transform(canvas, bounds, rectF.left, rectF.top, this.fitModeResult.startScale, this.fadeModeResult.startAlpha, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.1
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public void run(Canvas canvas2) {
                    TransitionDrawable.this.startView.draw(canvas2);
                }
            });
        }

        private void drawEndView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.endContainerPaint);
            Rect bounds = getBounds();
            RectF rectF = this.currentEndBounds;
            TransitionUtils.transform(canvas, bounds, rectF.left, rectF.top, this.fitModeResult.endScale, this.fadeModeResult.endAlpha, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.2
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public void run(Canvas canvas2) {
                    TransitionDrawable.this.endView.draw(canvas2);
                }
            });
        }

        private void maybeDrawContainerColor(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgress(float f) {
            if (this.progress != f) {
                updateProgress(f);
            }
        }

        private void updateProgress(float f) {
            float f2;
            float f3;
            this.progress = f;
            this.scrimPaint.setAlpha((int) (this.entering ? TransitionUtils.lerp(0.0f, 255.0f, f) : TransitionUtils.lerp(255.0f, 0.0f, f)));
            this.motionPathMeasure.getPosTan(this.motionPathLength * f, this.motionPathPosition, null);
            float[] fArr = this.motionPathPosition;
            float fM46695 = fArr[0];
            float fM46696 = fArr[1];
            if (f > 1.0f || f < 0.0f) {
                if (f > 1.0f) {
                    f3 = (f - 1.0f) / 0.00999999f;
                    f2 = 0.99f;
                } else {
                    f2 = 0.01f;
                    f3 = (f / 0.01f) * (-1.0f);
                }
                this.motionPathMeasure.getPosTan(this.motionPathLength * f2, fArr, null);
                float[] fArr2 = this.motionPathPosition;
                float f4 = fArr2[0];
                float f5 = fArr2[1];
                fM46695 = C20382.m46695(fM46695, f4, f3, fM46695);
                fM46696 = C20382.m46695(fM46696, f5, f3, fM46696);
            }
            float f6 = fM46695;
            float f7 = fM46696;
            FitModeResult fitModeResultEvaluate = this.fitModeEvaluator.evaluate(f, Float.valueOf(this.progressThresholds.scale.start).floatValue(), Float.valueOf(this.progressThresholds.scale.end).floatValue(), this.startBounds.width(), this.startBounds.height(), this.endBounds.width(), this.endBounds.height());
            this.fitModeResult = fitModeResultEvaluate;
            RectF rectF = this.currentStartBounds;
            float f8 = fitModeResultEvaluate.currentStartWidth;
            rectF.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, fitModeResultEvaluate.currentStartHeight + f7);
            RectF rectF2 = this.currentEndBounds;
            FitModeResult fitModeResult = this.fitModeResult;
            float f9 = fitModeResult.currentEndWidth;
            rectF2.set(f6 - (f9 / 2.0f), f7, (f9 / 2.0f) + f6, fitModeResult.currentEndHeight + f7);
            this.currentStartBoundsMasked.set(this.currentStartBounds);
            this.currentEndBoundsMasked.set(this.currentEndBounds);
            float fFloatValue = Float.valueOf(this.progressThresholds.scaleMask.start).floatValue();
            float fFloatValue2 = Float.valueOf(this.progressThresholds.scaleMask.end).floatValue();
            boolean zShouldMaskStartBounds = this.fitModeEvaluator.shouldMaskStartBounds(this.fitModeResult);
            RectF rectF3 = zShouldMaskStartBounds ? this.currentStartBoundsMasked : this.currentEndBoundsMasked;
            float fLerp = TransitionUtils.lerp(0.0f, 1.0f, fFloatValue, fFloatValue2, f);
            if (!zShouldMaskStartBounds) {
                fLerp = 1.0f - fLerp;
            }
            this.fitModeEvaluator.applyMask(rectF3, fLerp, this.fitModeResult);
            this.currentMaskBounds = new RectF(Math.min(this.currentStartBoundsMasked.left, this.currentEndBoundsMasked.left), Math.min(this.currentStartBoundsMasked.top, this.currentEndBoundsMasked.top), Math.max(this.currentStartBoundsMasked.right, this.currentEndBoundsMasked.right), Math.max(this.currentStartBoundsMasked.bottom, this.currentEndBoundsMasked.bottom));
            this.maskEvaluator.evaluate(f, this.startShapeAppearanceModel, this.endShapeAppearanceModel, this.currentStartBounds, this.currentStartBoundsMasked, this.currentEndBoundsMasked, this.progressThresholds.shapeMask);
            this.currentElevation = TransitionUtils.lerp(this.startElevation, this.endElevation, f);
            float fCalculateElevationDxMultiplier = calculateElevationDxMultiplier(this.currentMaskBounds, this.displayWidth);
            float fCalculateElevationDyMultiplier = calculateElevationDyMultiplier(this.currentMaskBounds, this.displayHeight);
            float f10 = this.currentElevation;
            float f11 = (int) (fCalculateElevationDyMultiplier * f10);
            this.currentElevationDy = f11;
            this.shadowPaint.setShadowLayer(f10, (int) (fCalculateElevationDxMultiplier * f10), f11, 754974720);
            this.fadeModeResult = this.fadeModeEvaluator.evaluate(f, Float.valueOf(this.progressThresholds.fade.start).floatValue(), Float.valueOf(this.progressThresholds.fade.end).floatValue(), 0.35f);
            if (this.startContainerPaint.getColor() != 0) {
                this.startContainerPaint.setAlpha(this.fadeModeResult.startAlpha);
            }
            if (this.endContainerPaint.getColor() != 0) {
                this.endContainerPaint.setAlpha(this.fadeModeResult.endAlpha);
            }
            invalidateSelf();
        }

        public static PointF getMotionPathPoint(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        public static float calculateElevationDxMultiplier(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        public static float calculateElevationDyMultiplier(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        private void drawDebugCumulativePath(Canvas canvas, RectF rectF, Path path, int i) {
            PointF motionPathPoint = getMotionPathPoint(rectF);
            if (this.progress == 0.0f) {
                path.reset();
                path.moveTo(motionPathPoint.x, motionPathPoint.y);
            } else {
                path.lineTo(motionPathPoint.x, motionPathPoint.y);
                this.debugPaint.setColor(i);
                canvas.drawPath(path, this.debugPaint);
            }
        }

        private void drawDebugRect(Canvas canvas, RectF rectF, int i) {
            this.debugPaint.setColor(i);
            canvas.drawRect(rectF, this.debugPaint);
        }
    }

    public class ProgressThresholds {
        public final float end;
        public final float start;

        public ProgressThresholds(float f, float f2) {
            this.start = f;
            this.end = f2;
        }

        public float getStart() {
            return this.start;
        }

        public float getEnd() {
            return this.end;
        }
    }

    public class ProgressThresholdsGroup {
        public final ProgressThresholds fade;
        public final ProgressThresholds scale;
        public final ProgressThresholds scaleMask;
        public final ProgressThresholds shapeMask;

        public ProgressThresholdsGroup(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.fade = progressThresholds;
            this.scale = progressThresholds2;
            this.scaleMask = progressThresholds3;
            this.shapeMask = progressThresholds4;
        }
    }
}
