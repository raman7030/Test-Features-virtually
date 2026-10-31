package l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.᩷᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes5.dex */
public final class C21187 extends AbstractC4253 implements Animatable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Drawable.Callback f68284;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Animator.AnimatorListener f68285;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Context f68286;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f68287;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C24008 f68288;

    public C21187(Context context, int i) {
        this.f68285 = null;
        this.f68287 = null;
        this.f68284 = new C17658(this);
        this.f68286 = context;
        this.f68288 = new C24008();
    }

    public C21187() {
        this(null, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21187 m48133(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C21187 c21187 = new C21187(context, 0);
            Drawable drawableM13097 = C4369.m13097(context.getResources(), i, context.getTheme());
            c21187.f13777 = drawableM13097;
            drawableM13097.setCallback(c21187.f68284);
            new C7075(c21187.f13777.getConstantState());
            return c21187;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return m48134(context, context.getResources(), xml, attributeSetAsAttributeSet, context.getTheme());
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21187 m48134(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        C21187 c21187 = new C21187(context, 0);
        c21187.inflate(resources, xmlResourceParser, attributeSet, theme);
        return c21187;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f13777 == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C7075(this.f13777.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f68288.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C24008 c24008 = this.f68288;
        c24008.f77810.draw(canvas);
        if (c24008.f77807.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f68288.f77810.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f68288.f77810.setState(iArr);
    }

    @Override // l.AbstractC4253, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f68288.f77810.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f68288.f77810.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f68288.f77810.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f68288.f77810.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return C8184.m21685(drawable);
        }
        return this.f68288.f77810.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21683(drawable, i);
        } else {
            this.f68288.f77810.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21676(drawable, colorStateList);
        } else {
            this.f68288.f77810.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21679(drawable, mode);
        } else {
            this.f68288.f77810.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f68288.f77810.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f68288.f77810.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f68288.f77810.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f68288.f77810.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f68288.f77810.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f68288.f77810.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f68288.f77810.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        C24008 c24008;
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21678(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c24008 = this.f68288;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM9019 = C2958.m9019(resources, theme, attributeSet, C11309.f33846);
                    int resourceId = typedArrayM9019.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C22597 c22597M50571 = C22597.m50571(resources, resourceId, theme);
                        c22597M50571.m50575();
                        c22597M50571.setCallback(this.f68284);
                        C22597 c22597 = c24008.f77810;
                        if (c22597 != null) {
                            c22597.setCallback(null);
                        }
                        c24008.f77810 = c22597M50571;
                    }
                    typedArrayM9019.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C11309.f33850);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f68286;
                        if (context != null) {
                            Animator animatorM23621 = C9192.m23621(context, resourceId2);
                            animatorM23621.setTarget(c24008.f77810.m50574(string));
                            if (c24008.f77808 == null) {
                                c24008.f77808 = new ArrayList();
                                c24008.f77809 = new C2727();
                            }
                            c24008.f77808.add(animatorM23621);
                            c24008.f77809.put(animatorM23621, string);
                        } else {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c24008.f77807 == null) {
            c24008.f77807 = new AnimatorSet();
        }
        c24008.f77807.playTogether(c24008.f77808);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // l.AbstractC4253, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21677(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return C8184.m21680(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f68288.f77807.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C24008 c24008 = this.f68288;
        if (c24008.f77807.isStarted()) {
            return;
        }
        c24008.f77807.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f68288.f77807.end();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48135(AbstractC18364 abstractC18364) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(abstractC18364.getPlatformCallback());
            return;
        }
        if (abstractC18364 == null) {
            return;
        }
        if (this.f68287 == null) {
            this.f68287 = new ArrayList();
        }
        if (this.f68287.contains(abstractC18364)) {
            return;
        }
        this.f68287.add(abstractC18364);
        if (this.f68285 == null) {
            this.f68285 = new C14835(this);
        }
        this.f68288.f77807.addListener(this.f68285);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48136(AbstractC18364 abstractC18364) {
        Animator.AnimatorListener animatorListener;
        Drawable drawable = this.f13777;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(abstractC18364.getPlatformCallback());
        }
        ArrayList arrayList = this.f68287;
        if (arrayList == null || abstractC18364 == null) {
            return;
        }
        arrayList.remove(abstractC18364);
        if (this.f68287.size() != 0 || (animatorListener = this.f68285) == null) {
            return;
        }
        this.f68288.f77807.removeListener(animatorListener);
        this.f68285 = null;
    }
}
