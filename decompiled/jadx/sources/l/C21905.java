package l;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Iterator;
import net.engio.mbassy.listener.MessageHandler;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩸᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C1GQ */
/* JADX INFO: loaded from: classes.dex */
public final class C21905 extends FrameLayout {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70118;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f70119;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View.OnApplyWindowInsetsListener f70120;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f70121;

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C11233.m27805(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C11233.m27805(view, "child");
        Object tag = view.getTag(R.id.MT_Protector);
        if ((tag instanceof ComponentCallbacksC9205 ? (ComponentCallbacksC9205) tag : null) == null) {
            throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C21610 c21610M41324;
        C11233.m27805(windowInsets, "insets");
        C21610 c21610M48814 = C21610.m48814(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f70120;
        if (onApplyWindowInsetsListener != null) {
            C11233.m27799(onApplyWindowInsetsListener);
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            C11233.m27803(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c21610M41324 = C21610.m48814(null, windowInsetsOnApplyWindowInsets);
        } else {
            c21610M41324 = C17648.m41324(this, c21610M48814);
        }
        C11233.m27803(c21610M41324, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c21610M41324.m48830()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C17648.m41299(getChildAt(i), c21610M41324);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C11233.m27805(canvas, "canvas");
        if (this.f70119) {
            Iterator it = this.f70121.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C11233.m27805(canvas, "canvas");
        C11233.m27805(view, "child");
        if (this.f70119) {
            ArrayList arrayList = this.f70121;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C11233.m27805(onApplyWindowInsetsListener, MessageHandler.Properties.Listener);
        this.f70120 = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        C11233.m27805(view, "view");
        this.f70118.remove(view);
        if (this.f70121.remove(view)) {
            this.f70119 = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        C11233.m27805(view, "view");
        m49303(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        C11233.m27805(view, "view");
        m49303(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        C11233.m27805(view, "view");
        if (view.getParent() == this) {
            this.f70118.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21905(Context context) {
        super(context);
        C11233.m27805(context, d.R);
        this.f70121 = new ArrayList();
        this.f70118 = new ArrayList();
        this.f70119 = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21905(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C11233.m27805(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21905(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        C11233.m27805(context, d.R);
        this.f70121 = new ArrayList();
        this.f70118 = new ArrayList();
        this.f70119 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16693.f51231, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = Name.LABEL;
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21905(Context context, AttributeSet attributeSet, AbstractC5180 abstractC5180) {
        super(context, attributeSet);
        C11233.m27805(context, d.R);
        C11233.m27805(attributeSet, "attrs");
        this.f70121 = new ArrayList();
        this.f70118 = new ArrayList();
        this.f70119 = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16693.f51231, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        ComponentCallbacksC9205 componentCallbacksC9205M14862 = abstractC5180.m14862(id);
        if (classAttribute != null && componentCallbacksC9205M14862 == null) {
            if (id == -1) {
                throw new IllegalStateException(C4860.m14172("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C20494 c20494M14889 = abstractC5180.m14889();
            context.getClassLoader();
            ComponentCallbacksC9205 componentCallbacksC9205Mo41848 = c20494M14889.mo41848(classAttribute);
            C11233.m27803(componentCallbacksC9205Mo41848, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            componentCallbacksC9205Mo41848.onInflate(context, attributeSet, (Bundle) null);
            C18105 c18105 = new C18105(abstractC5180);
            c18105.f51801 = true;
            componentCallbacksC9205Mo41848.mContainer = this;
            c18105.mo39680(getId(), componentCallbacksC9205Mo41848, string, 1);
            if (c18105.f51800) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c18105.f51806 = false;
            c18105.f56359.m14876(c18105, true);
        }
        abstractC5180.m14878(this);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49304(boolean z) {
        this.f70119 = z;
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C11233.m27803(childAt, "view");
        m49303(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C11233.m27803(childAt, "view");
            m49303(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C11233.m27803(childAt, "view");
            m49303(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                C11233.m27803(childAt, "view");
                m49303(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m49303(View view) {
        if (this.f70118.contains(view)) {
            this.f70121.add(view);
        }
    }
}
