package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.۬᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1H0 */
/* JADX INFO: loaded from: classes3.dex */
public final class LayoutInflaterFactory2C15139 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC7291 f43222;

    public LayoutInflaterFactory2C15139(AbstractC7291 abstractC7291) {
        this.f43222 = abstractC7291;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C7961 c7961M16832;
        boolean zEquals = C23187.class.getName().equals(str);
        AbstractC7291 abstractC7291 = this.f43222;
        if (zEquals) {
            return new C23187(context, attributeSet, abstractC7291);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, Name.LABEL);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18233.f54415);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null && C21846.m49282(context.getClassLoader(), attributeValue)) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                ComponentCallbacksC11117 componentCallbacksC11117M16772 = resourceId != -1 ? abstractC7291.m16772(resourceId) : null;
                if (componentCallbacksC11117M16772 == null && string != null) {
                    componentCallbacksC11117M16772 = abstractC7291.m16809(string);
                }
                if (componentCallbacksC11117M16772 == null && id != -1) {
                    componentCallbacksC11117M16772 = abstractC7291.m16772(id);
                }
                if (componentCallbacksC11117M16772 == null) {
                    C21846 c21846M16799 = abstractC7291.m16799();
                    context.getClassLoader();
                    componentCallbacksC11117M16772 = c21846M16799.mo44095(attributeValue);
                    componentCallbacksC11117M16772.mFromLayout = true;
                    componentCallbacksC11117M16772.mFragmentId = resourceId != 0 ? resourceId : id;
                    componentCallbacksC11117M16772.mContainerId = id;
                    componentCallbacksC11117M16772.mTag = string;
                    componentCallbacksC11117M16772.mInLayout = true;
                    componentCallbacksC11117M16772.mFragmentManager = abstractC7291;
                    componentCallbacksC11117M16772.mHost = abstractC7291.m16803();
                    componentCallbacksC11117M16772.onInflate(abstractC7291.m16803().m16339(), attributeSet, componentCallbacksC11117M16772.mSavedFragmentState);
                    c7961M16832 = abstractC7291.m16771(componentCallbacksC11117M16772);
                    if (AbstractC7291.m16763(2)) {
                        componentCallbacksC11117M16772.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    if (componentCallbacksC11117M16772.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    componentCallbacksC11117M16772.mInLayout = true;
                    componentCallbacksC11117M16772.mFragmentManager = abstractC7291;
                    componentCallbacksC11117M16772.mHost = abstractC7291.m16803();
                    componentCallbacksC11117M16772.onInflate(abstractC7291.m16803().m16339(), attributeSet, componentCallbacksC11117M16772.mSavedFragmentState);
                    c7961M16832 = abstractC7291.m16832(componentCallbacksC11117M16772);
                    if (AbstractC7291.m16763(2)) {
                        componentCallbacksC11117M16772.toString();
                        Integer.toHexString(resourceId);
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C24448.m53934(componentCallbacksC11117M16772, viewGroup);
                componentCallbacksC11117M16772.mContainer = viewGroup;
                c7961M16832.m18407();
                c7961M16832.m18405();
                View view2 = componentCallbacksC11117M16772.mView;
                if (view2 == null) {
                    throw new IllegalStateException(C6988.m16053("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (componentCallbacksC11117M16772.mView.getTag() == null) {
                    componentCallbacksC11117M16772.mView.setTag(string);
                }
                componentCallbacksC11117M16772.mView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC5752(this, c7961M16832));
                return componentCallbacksC11117M16772.mView;
            }
        }
        return null;
    }
}
