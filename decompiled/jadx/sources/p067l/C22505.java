package p067l;

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
public final class C22505 extends AbstractC6411 implements Animatable {

    /* JADX INFO: renamed from: ۗ */
    public final Drawable.Callback f70966;

    /* JADX INFO: renamed from: ۙ */
    public Animator.AnimatorListener f70967;

    /* JADX INFO: renamed from: ۬ */
    public Context f70968;

    /* JADX INFO: renamed from: ᩶ */
    public ArrayList f70969;

    /* JADX INFO: renamed from: ᩹ */
    public C25186 f70970;

    public C22505(Context context, int i) {
        this.f70967 = null;
        this.f70969 = null;
        this.f70966 = new C19151(this);
        this.f70968 = context;
        this.f70970 = new C25186();
    }

    public C22505() {
        this(null, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22505 m50463(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C22505 c22505 = new C22505(context, 0);
            Drawable drawableM14961 = C1059.m14961(context.getResources(), i, context.getTheme());
            c22505.f16594 = drawableM14961;
            drawableM14961.setCallback(c22505.f70966);
            new C9093(c22505.f16594.getConstantState());
            return c22505;
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
            return m50464(context, context.getResources(), xml, attributeSetAsAttributeSet, context.getTheme());
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22505 m50464(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        C22505 c22505 = new C22505(context, 0);
        c22505.inflate(resources, xmlResourceParser, attributeSet, theme);
        return c22505;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f16594 == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C9093(this.f16594.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f70970.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C25186 c25186 = this.f70970;
        c25186.f80562.draw(canvas);
        if (c25186.f80559.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f70970.f80562.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f70970.f80562.setState(iArr);
    }

    @Override // p067l.AbstractC6411, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f70970.f80562.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f70970.f80562.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f70970.f80562.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f70970.f80562.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return C1248.m23654(drawable);
        }
        return this.f70970.f80562.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            C1248.m23652(drawable, i);
        } else {
            this.f70970.f80562.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            C1248.m23645(drawable, colorStateList);
        } else {
            this.f70970.f80562.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            C1248.m23648(drawable, mode);
        } else {
            this.f70970.f80562.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f70970.f80562.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f70970.f80562.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f70970.f80562.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f70970.f80562.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f70970.f80562.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f70970.f80562.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f70970.f80562.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        C25186 c25186;
        Drawable drawable = this.f16594;
        if (drawable != null) {
            C1248.m23647(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c25186 = this.f70970;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM11087 = C0989.m11087(resources, theme, attributeSet, C13117.f36846);
                    int resourceId = typedArrayM11087.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C23845 c23845M52913 = C23845.m52913(resources, resourceId, theme);
                        c23845M52913.m52917();
                        c23845M52913.setCallback(this.f70966);
                        C23845 c23845 = c25186.f80562;
                        if (c23845 != null) {
                            c23845.setCallback(null);
                        }
                        c25186.f80562 = c23845M52913;
                    }
                    typedArrayM11087.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, C13117.f36850);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f70968;
                        if (context != null) {
                            Animator animatorM25574 = C11105.m25574(context, resourceId2);
                            animatorM25574.setTarget(c25186.f80562.m52916(string));
                            if (c25186.f80560 == null) {
                                c25186.f80560 = new ArrayList();
                                c25186.f80561 = new C0977();
                            }
                            c25186.f80560.add(animatorM25574);
                            c25186.f80561.put(animatorM25574, string);
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
        if (c25186.f80559 == null) {
            c25186.f80559 = new AnimatorSet();
        }
        c25186.f80559.playTogether(c25186.f80560);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // p067l.AbstractC6411, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            C1248.m23646(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return C1248.m23649(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f70970.f80559.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C25186 c25186 = this.f70970;
        if (c25186.f80559.isStarted()) {
            return;
        }
        c25186.f80559.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f70970.f80559.end();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50465(AbstractC19822 abstractC19822) {
        Drawable drawable = this.f16594;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(abstractC19822.getPlatformCallback());
            return;
        }
        if (abstractC19822 == null) {
            return;
        }
        if (this.f70969 == null) {
            this.f70969 = new ArrayList();
        }
        if (this.f70969.contains(abstractC19822)) {
            return;
        }
        this.f70969.add(abstractC19822);
        if (this.f70967 == null) {
            this.f70967 = new C16468(this);
        }
        this.f70970.f80559.addListener(this.f70967);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50466(AbstractC19822 abstractC19822) {
        Animator.AnimatorListener animatorListener;
        Drawable drawable = this.f16594;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(abstractC19822.getPlatformCallback());
        }
        ArrayList arrayList = this.f70969;
        if (arrayList == null || abstractC19822 == null) {
            return;
        }
        arrayList.remove(abstractC19822);
        if (this.f70969.size() != 0 || (animatorListener = this.f70967) == null) {
            return;
        }
        this.f70970.f80559.removeListener(animatorListener);
        this.f70967 = null;
    }
}
