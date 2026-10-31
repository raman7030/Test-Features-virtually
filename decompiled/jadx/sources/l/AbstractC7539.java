package l;

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

/* JADX INFO: renamed from: l.۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JO */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7539 extends View {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f23292;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f23293;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Context f23294;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public View[] f23295;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f23296;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f23297;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f23298;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12978 f23299;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo17041(C15094 c15094, boolean z) {
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo15917() {
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo20237(C17606 c17606) {
    }

    public AbstractC7539(Context context) {
        super(context);
        this.f23297 = new int[32];
        this.f23295 = null;
        this.f23293 = new HashMap();
        this.f23294 = context;
        mo1338((AttributeSet) null);
    }

    public AbstractC7539(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23297 = new int[32];
        this.f23295 = null;
        this.f23293 = new HashMap();
        this.f23294 = context;
        mo1338(attributeSet);
    }

    public AbstractC7539(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23297 = new int[32];
        this.f23295 = null;
        this.f23293 = new HashMap();
        this.f23294 = context;
        mo1338(attributeSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo1338(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21840.f69980);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f23292 = string;
                    m20230(string);
                } else if (index == 20) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f23296 = string2;
                    m20234(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f23292;
        if (str != null) {
            m20230(str);
        }
        String str2 = this.f23296;
        if (str2 != null) {
            m20234(str2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20229(TextView textView) {
        if (textView == this || textView.getId() == -1 || textView.getParent() == null) {
            return;
        }
        this.f23292 = null;
        m20224(textView.getId());
        requestLayout();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20233(int[] iArr) {
        this.f23292 = null;
        this.f23298 = 0;
        for (int i : iArr) {
            m20224(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20224(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f23298 + 1;
        int[] iArr = this.f23297;
        if (i2 > iArr.length) {
            this.f23297 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f23297;
        int i3 = this.f23298;
        iArr2[i3] = i;
        this.f23298 = i3 + 1;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20236() {
        if (this.f23299 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C16900) {
            ((C16900) layoutParams).f51902 = this.f23299;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20225(String str) {
        if (str == null || str.length() == 0 || this.f23294 == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof C17606) {
        }
        int iM20226 = m20226(strTrim);
        if (iM20226 != 0) {
            this.f23293.put(Integer.valueOf(iM20226), strTrim);
            m20224(iM20226);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m20227(String str) {
        if (str == null || str.length() == 0 || this.f23294 == null) {
            return;
        }
        String strTrim = str.trim();
        C17606 c17606 = getParent() instanceof C17606 ? (C17606) getParent() : null;
        if (c17606 == null) {
            return;
        }
        int childCount = c17606.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c17606.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C16900) && strTrim.equals(((C16900) layoutParams).f51940) && childAt.getId() != -1) {
                m20224(childAt.getId());
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m20226(String str) {
        C17606 c17606 = getParent() instanceof C17606 ? (C17606) getParent() : null;
        int iM20223 = 0;
        if (isInEditMode() && c17606 != null) {
            Object designInformation = c17606.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iM20223 = ((Integer) designInformation).intValue();
            }
        }
        if (iM20223 == 0 && c17606 != null) {
            iM20223 = m20223(c17606, str);
        }
        if (iM20223 == 0) {
            try {
                iM20223 = C15488.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iM20223 != 0) {
            return iM20223;
        }
        Context context = this.f23294;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m20223(C17606 c17606, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f23294.getResources()) != null) {
            int childCount = c17606.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = c17606.getChildAt(i);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20230(String str) {
        this.f23292 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f23298 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m20225(str.substring(i));
                return;
            } else {
                m20225(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20234(String str) {
        this.f23296 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f23298 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m20227(str.substring(i));
                return;
            } else {
                m20227(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo20232(C17606 c17606) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f23298; i++) {
            View viewById = c17606.getViewById(this.f23297[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20228() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof C17606)) {
            return;
        }
        mo20232((C17606) parent);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20238(C17606 c17606) {
        if (isInEditMode()) {
            m20230(this.f23292);
        }
        C12978 c12978 = this.f23299;
        if (c12978 == null) {
            return;
        }
        c12978.m31544();
        for (int i = 0; i < this.f23298; i++) {
            int i2 = this.f23297[i];
            View viewById = c17606.getViewById(i2);
            if (viewById == null) {
                Integer numValueOf = Integer.valueOf(i2);
                HashMap map = this.f23293;
                String str = (String) map.get(numValueOf);
                int iM20223 = m20223(c17606, str);
                if (iM20223 != 0) {
                    this.f23297[i] = iM20223;
                    map.put(Integer.valueOf(iM20223), str);
                    viewById = c17606.getViewById(iM20223);
                }
            }
            if (viewById != null) {
                this.f23299.m31543(c17606.getViewWidget(viewById));
            }
        }
        this.f23299.mo25519();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20231(C12978 c12978, SparseArray sparseArray) {
        c12978.m31544();
        for (int i = 0; i < this.f23298; i++) {
            c12978.m31543((C15094) sparseArray.get(this.f23297[i]));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View[] m20235(C17606 c17606) {
        View[] viewArr = this.f23295;
        if (viewArr == null || viewArr.length != this.f23298) {
            this.f23295 = new View[this.f23298];
        }
        for (int i = 0; i < this.f23298; i++) {
            this.f23295[i] = c17606.getViewById(this.f23297[i]);
        }
        return this.f23295;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo17042(C21135 c21135, C12978 c12978, C19018 c19018, SparseArray sparseArray) {
        C9846 c9846 = c21135.f68158;
        int[] iArr = c9846.f29771;
        int i = 0;
        if (iArr != null) {
            m20233(iArr);
        } else {
            String str = c9846.f29800;
            if (str != null && str.length() > 0) {
                String[] strArrSplit = c9846.f29800.split(",");
                getContext();
                int[] iArrCopyOf = new int[strArrSplit.length];
                int i2 = 0;
                for (String str2 : strArrSplit) {
                    int iM20226 = m20226(str2.trim());
                    if (iM20226 != 0) {
                        iArrCopyOf[i2] = iM20226;
                        i2++;
                    }
                }
                if (i2 != strArrSplit.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                }
                c9846.f29771 = iArrCopyOf;
            }
        }
        c12978.m31544();
        if (c9846.f29771 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = c9846.f29771;
            if (i >= iArr2.length) {
                return;
            }
            C15094 c15094 = (C15094) sparseArray.get(iArr2[i]);
            if (c15094 != null) {
                c12978.m31543(c15094);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f23292 == null) {
            m20224(i);
        }
    }
}
