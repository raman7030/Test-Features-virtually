package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۟ܶ */
/* JADX INFO: compiled from: O1JO */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1216 extends View {

    /* JADX INFO: renamed from: ۗ */
    public String f26205;

    /* JADX INFO: renamed from: ۙ */
    public HashMap f26206;

    /* JADX INFO: renamed from: ۤ */
    public Context f26207;

    /* JADX INFO: renamed from: ۫ */
    public View[] f26208;

    /* JADX INFO: renamed from: ۬ */
    public String f26209;

    /* JADX INFO: renamed from: ᩶ */
    public int[] f26210;

    /* JADX INFO: renamed from: ᩸ */
    public int f26211;

    /* JADX INFO: renamed from: ᩹ */
    public C1486 f26212;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo18972(C1591 c1591, boolean z) {
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo17838() {
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo22213(C1715 c1715) {
    }

    public AbstractC1216(Context context) {
        super(context);
        this.f26210 = new int[32];
        this.f26208 = null;
        this.f26206 = new HashMap();
        this.f26207 = context;
        mo3751((AttributeSet) null);
    }

    public AbstractC1216(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26210 = new int[32];
        this.f26208 = null;
        this.f26206 = new HashMap();
        this.f26207 = context;
        mo3751(attributeSet);
    }

    public AbstractC1216(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26210 = new int[32];
        this.f26208 = null;
        this.f26206 = new HashMap();
        this.f26207 = context;
        mo3751(attributeSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo3751(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1925.f72689);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f26205 = string;
                    m22206(string);
                } else if (index == 20) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f26209 = string2;
                    m22210(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f26205;
        if (str != null) {
            m22206(str);
        }
        String str2 = this.f26209;
        if (str2 != null) {
            m22210(str2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22205(TextView textView) {
        if (textView == this || textView.getId() == -1 || textView.getParent() == null) {
            return;
        }
        this.f26205 = null;
        m22200(textView.getId());
        requestLayout();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22209(int[] iArr) {
        this.f26205 = null;
        this.f26211 = 0;
        for (int i : iArr) {
            m22200(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22200(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f26211 + 1;
        int[] iArr = this.f26210;
        if (i2 > iArr.length) {
            this.f26210 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f26210;
        int i3 = this.f26211;
        iArr2[i3] = i;
        this.f26211 = i3 + 1;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22212() {
        if (this.f26212 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1680) {
            ((C1680) layoutParams).f55082 = this.f26212;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m22201(String str) {
        if (str == null || str.length() == 0 || this.f26207 == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof C1715) {
        }
        int iM22202 = m22202(strTrim);
        if (iM22202 != 0) {
            this.f26206.put(Integer.valueOf(iM22202), strTrim);
            m22200(iM22202);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m22203(String str) {
        if (str == null || str.length() == 0 || this.f26207 == null) {
            return;
        }
        String strTrim = str.trim();
        C1715 c1715 = getParent() instanceof C1715 ? (C1715) getParent() : null;
        if (c1715 == null) {
            return;
        }
        int childCount = c1715.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c1715.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C1680) && strTrim.equals(((C1680) layoutParams).f55120) && childAt.getId() != -1) {
                m22200(childAt.getId());
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private int m22202(String str) {
        C1715 c1715 = getParent() instanceof C1715 ? (C1715) getParent() : null;
        int iM22199 = 0;
        if (isInEditMode() && c1715 != null) {
            Object designInformation = c1715.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iM22199 = ((Integer) designInformation).intValue();
            }
        }
        if (iM22199 == 0 && c1715 != null) {
            iM22199 = m22199(c1715, str);
        }
        if (iM22199 == 0) {
            try {
                iM22199 = C1610.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iM22199 != 0) {
            return iM22199;
        }
        Context context = this.f26207;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    /* JADX INFO: renamed from: ֫ */
    private int m22199(C1715 c1715, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f26207.getResources()) != null) {
            int childCount = c1715.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = c1715.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22206(String str) {
        this.f26205 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f26211 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m22201(str.substring(i));
                return;
            } else {
                m22201(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22210(String str) {
        this.f26209 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f26211 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m22203(str.substring(i));
                return;
            } else {
                m22203(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo22208(C1715 c1715) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f26211; i++) {
            View viewById = c1715.getViewById(this.f26210[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22204() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof C1715)) {
            return;
        }
        mo22208((C1715) parent);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m22214(C1715 c1715) {
        if (isInEditMode()) {
            m22206(this.f26205);
        }
        C1486 c1486 = this.f26212;
        if (c1486 == null) {
            return;
        }
        c1486.m33629();
        for (int i = 0; i < this.f26211; i++) {
            int i2 = this.f26210[i];
            View viewById = c1715.getViewById(i2);
            if (viewById == null) {
                Integer numValueOf = Integer.valueOf(i2);
                HashMap map = this.f26206;
                String str = (String) map.get(numValueOf);
                int iM22199 = m22199(c1715, str);
                if (iM22199 != 0) {
                    this.f26210[i] = iM22199;
                    map.put(Integer.valueOf(iM22199), str);
                    viewById = c1715.getViewById(iM22199);
                }
            }
            if (viewById != null) {
                this.f26212.m33628(c1715.getViewWidget(viewById));
            }
        }
        this.f26212.mo27538();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22207(C1486 c1486, SparseArray sparseArray) {
        c1486.m33629();
        for (int i = 0; i < this.f26211; i++) {
            c1486.m33628((C1591) sparseArray.get(this.f26210[i]));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final View[] m22211(C1715 c1715) {
        View[] viewArr = this.f26208;
        if (viewArr == null || viewArr.length != this.f26211) {
            this.f26208 = new View[this.f26211];
        }
        for (int i = 0; i < this.f26211; i++) {
            this.f26208[i] = c1715.getViewById(this.f26210[i]);
        }
        return this.f26208;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo18973(C1890 c1890, C1486 c1486, C1785 c1785, SparseArray sparseArray) {
        C1330 c1330 = c1890.f70840;
        int[] iArr = c1330.f32724;
        int i = 0;
        if (iArr != null) {
            m22209(iArr);
        } else {
            String str = c1330.f32753;
            if (str != null && str.length() > 0) {
                String[] strArrSplit = c1330.f32753.split(",");
                getContext();
                int[] iArrCopyOf = new int[strArrSplit.length];
                int i2 = 0;
                for (String str2 : strArrSplit) {
                    int iM22202 = m22202(str2.trim());
                    if (iM22202 != 0) {
                        iArrCopyOf[i2] = iM22202;
                        i2++;
                    }
                }
                if (i2 != strArrSplit.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                }
                c1330.f32724 = iArrCopyOf;
            }
        }
        c1486.m33629();
        if (c1330.f32724 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = c1330.f32724;
            if (i >= iArr2.length) {
                return;
            }
            C1591 c1591 = (C1591) sparseArray.get(iArr2[i]);
            if (c1591 != null) {
                c1486.m33628(c1591);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f26205 == null) {
            m22200(i);
        }
    }
}
