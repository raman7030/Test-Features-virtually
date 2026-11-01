package p067l;

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
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0708d;
import java.util.ArrayList;
import java.util.Iterator;
import net.engio.mbassy.listener.MessageHandler;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩸᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C1GQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23187 extends FrameLayout {

    /* JADX INFO: renamed from: ۙ */
    public final ArrayList f72832;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f72833;

    /* JADX INFO: renamed from: ᩸ */
    public View.OnApplyWindowInsetsListener f72834;

    /* JADX INFO: renamed from: ᩹ */
    public final ArrayList f72835;

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C13045.m29867(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C13045.m29867(view, "child");
        Object tag = view.getTag(R.id.MT_Protector);
        if ((tag instanceof ComponentCallbacksC11117 ? (ComponentCallbacksC11117) tag : null) == null) {
            throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C1914 c1914M43570;
        C13045.m29867(windowInsets, "insets");
        C1914 c1914M51162 = C1914.m51162(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f72834;
        if (onApplyWindowInsetsListener != null) {
            C13045.m29861(onApplyWindowInsetsListener);
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            C13045.m29865(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c1914M43570 = C1914.m51162(null, windowInsetsOnApplyWindowInsets);
        } else {
            c1914M43570 = C1717.m43570(this, c1914M51162);
        }
        C13045.m29865(c1914M43570, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c1914M43570.m51178()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1717.m43545(getChildAt(i), c1914M43570);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C13045.m29867(canvas, "canvas");
        if (this.f72833) {
            Iterator it = this.f72835.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C13045.m29867(canvas, "canvas");
        C13045.m29867(view, "child");
        if (this.f72833) {
            ArrayList arrayList = this.f72835;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C13045.m29867(onApplyWindowInsetsListener, MessageHandler.Properties.Listener);
        this.f72834 = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        C13045.m29867(view, "view");
        this.f72832.remove(view);
        if (this.f72835.remove(view)) {
            this.f72833 = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        C13045.m29867(view, "view");
        m51656(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        C13045.m29867(view, "view");
        m51656(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        C13045.m29867(view, "view");
        if (view.getParent() == this) {
            this.f72832.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23187(Context context) {
        super(context);
        C13045.m29867(context, C0708d.f2602R);
        this.f72835 = new ArrayList();
        this.f72832 = new ArrayList();
        this.f72833 = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C23187(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C13045.m29867(context, C0708d.f2602R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23187(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        C13045.m29867(context, C0708d.f2602R);
        this.f72835 = new ArrayList();
        this.f72832 = new ArrayList();
        this.f72833 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18233.f54416, 0, 0);
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
    public C23187(Context context, AttributeSet attributeSet, AbstractC7291 abstractC7291) {
        super(context, attributeSet);
        C13045.m29867(context, C0708d.f2602R);
        C13045.m29867(attributeSet, "attrs");
        this.f72835 = new ArrayList();
        this.f72832 = new ArrayList();
        this.f72833 = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18233.f54416, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        ComponentCallbacksC11117 componentCallbacksC11117M16772 = abstractC7291.m16772(id);
        if (classAttribute != null && componentCallbacksC11117M16772 == null) {
            if (id == -1) {
                throw new IllegalStateException(C6988.m16053("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C21846 c21846M16799 = abstractC7291.m16799();
            context.getClassLoader();
            ComponentCallbacksC11117 componentCallbacksC11117Mo44095 = c21846M16799.mo44095(classAttribute);
            C13045.m29865(componentCallbacksC11117Mo44095, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            componentCallbacksC11117Mo44095.onInflate(context, attributeSet, (Bundle) null);
            C19575 c19575 = new C19575(abstractC7291);
            c19575.f54982 = true;
            componentCallbacksC11117Mo44095.mContainer = this;
            c19575.mo41921(getId(), componentCallbacksC11117Mo44095, string, 1);
            if (c19575.f54981) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c19575.f54987 = false;
            c19575.f59572.m16786(c19575, true);
        }
        abstractC7291.m16788(this);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51657(boolean z) {
        this.f72833 = z;
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C13045.m29865(childAt, "view");
        m51656(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C13045.m29865(childAt, "view");
            m51656(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C13045.m29865(childAt, "view");
            m51656(childAt);
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
                C13045.m29865(childAt, "view");
                m51656(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m51656(View view) {
        if (this.f72832.contains(view)) {
            this.f72835.add(view);
        }
    }
}
