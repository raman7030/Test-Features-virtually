package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.umeng.analytics.pro.C0708d;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7JV */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6465 extends FrameLayout {

    /* JADX INFO: renamed from: ۤ */
    public static final /* synthetic */ int f16709 = 0;

    /* JADX INFO: renamed from: ۗ */
    public float f16710;

    /* JADX INFO: renamed from: ۙ */
    public float f16711;

    /* JADX INFO: renamed from: ۫ */
    public C22085 f16712;

    /* JADX INFO: renamed from: ۬ */
    public float f16713;

    /* JADX INFO: renamed from: ᩶ */
    public int f16714;

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f16715;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f16716;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC13171 mo14819();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo14820(int i);

    /* JADX INFO: renamed from: ۜ */
    public abstract EnumC21218 mo14823();

    /* JADX INFO: renamed from: ۡ */
    public abstract void mo14824();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo14826(int i);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC6465(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C13045.m29867(context, C0708d.f2602R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6465(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13045.m29867(context, C0708d.f2602R);
        this.f16715 = new ArrayList();
        this.f16716 = true;
        this.f16714 = -16711681;
        float fM14818 = m14818(mo14823().m47916());
        this.f16710 = fM14818;
        float f = fM14818 / 2.0f;
        this.f16711 = f;
        float fM14819 = m14818(mo14823().m47919());
        this.f16713 = fM14819;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mo14823().m47920(), 0, 0);
            this.f16714 = typedArrayObtainStyledAttributes.getColor(mo14823().m47923(), -16711681);
            m14825();
            this.f16710 = typedArrayObtainStyledAttributes.getDimension(mo14823().m47918(), fM14818);
            this.f16711 = typedArrayObtainStyledAttributes.getDimension(mo14823().m47922(), f);
            this.f16713 = typedArrayObtainStyledAttributes.getDimension(mo14823().m47917(), fM14819);
            this.f16716 = typedArrayObtainStyledAttributes.getBoolean(mo14823().m47921(), true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m14827() {
        return this.f16716;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m14829() {
        return this.f16714;
    }

    /* JADX INFO: renamed from: ܿ */
    public final float m14830() {
        return this.f16710;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final float m14831() {
        return this.f16711;
    }

    /* JADX INFO: renamed from: ܳ */
    public final float m14828() {
        return this.f16713;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14822(C22085 c22085) {
        this.f16712 = c22085;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC23229 m14833() {
        return this.f16712;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new RunnableC23634(5, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14817(AbstractC6465 abstractC6465) {
        C22085 c22085 = abstractC6465.f16712;
        C13045.m29861(c22085);
        int iM49706 = c22085.m49706();
        ArrayList arrayList = abstractC6465.f16715;
        if (arrayList.size() < iM49706) {
            abstractC6465.m14821(arrayList.size(), iM49706 - arrayList.size());
        } else if (arrayList.size() > iM49706) {
            int size = arrayList.size() - iM49706;
            for (int i = 0; i < size; i++) {
                abstractC6465.mo14824();
            }
        }
        abstractC6465.m14825();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7806.m18077((int) abstractC6465.f16710, (ImageView) it.next());
        }
        C22085 c22086 = abstractC6465.f16712;
        C13045.m29861(c22086);
        if (c22086.m49712()) {
            C22085 c22087 = abstractC6465.f16712;
            C13045.m29861(c22087);
            c22087.m49711();
            AbstractC13171 abstractC13171Mo14819 = abstractC6465.mo14819();
            C22085 c22088 = abstractC6465.f16712;
            C13045.m29861(c22088);
            c22088.m49708(abstractC13171Mo14819);
            C22085 c22089 = abstractC6465.f16712;
            C13045.m29861(c22089);
            abstractC13171Mo14819.m30167(0.0f, c22089.m49709());
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m14825() {
        int size = this.f16715.size();
        for (int i = 0; i < size; i++) {
            mo14826(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m14818(float f) {
        return getContext().getResources().getDisplayMetrics().density * f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14821(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            mo14820(i + i3);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m14832() {
        if (this.f16712 == null) {
            return;
        }
        post(new RunnableC21169(7, this));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getLayoutDirection() == 1) {
            setLayoutDirection(0);
            setRotation(180.0f);
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        post(new RunnableC6357(8, this));
    }
}
