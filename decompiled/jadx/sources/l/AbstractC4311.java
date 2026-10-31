package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7JV */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4311 extends FrameLayout {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f13894 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f13895;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f13896;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C20746 f13897;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f13898;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f13899;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f13900;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f13901;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract AbstractC11367 mo12955();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo12956(int i);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public abstract EnumC19834 mo12959();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public abstract void mo12960();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo12962(int i);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC4311(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C11233.m27805(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4311(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11233.m27805(context, d.R);
        this.f13900 = new ArrayList();
        this.f13901 = true;
        this.f13899 = -16711681;
        float fM12954 = m12954(mo12959().m45605());
        this.f13895 = fM12954;
        float f = fM12954 / 2.0f;
        this.f13896 = f;
        float fM12955 = m12954(mo12959().m45608());
        this.f13898 = fM12955;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mo12959().m45609(), 0, 0);
            this.f13899 = typedArrayObtainStyledAttributes.getColor(mo12959().m45612(), -16711681);
            m12961();
            this.f13895 = typedArrayObtainStyledAttributes.getDimension(mo12959().m45607(), fM12954);
            this.f13896 = typedArrayObtainStyledAttributes.getDimension(mo12959().m45611(), f);
            this.f13898 = typedArrayObtainStyledAttributes.getDimension(mo12959().m45606(), fM12955);
            this.f13901 = typedArrayObtainStyledAttributes.getBoolean(mo12959().m45610(), true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m12963() {
        return this.f13901;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m12965() {
        return this.f13899;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float m12966() {
        return this.f13895;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m12967() {
        return this.f13896;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m12964() {
        return this.f13898;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12958(C20746 c20746) {
        this.f13897 = c20746;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC21950 m12969() {
        return this.f13897;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new RunnableC22375(5, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12953(AbstractC4311 abstractC4311) {
        C20746 c20746 = abstractC4311.f13897;
        C11233.m27799(c20746);
        int iM47379 = c20746.m47379();
        ArrayList arrayList = abstractC4311.f13900;
        if (arrayList.size() < iM47379) {
            abstractC4311.m12957(arrayList.size(), iM47379 - arrayList.size());
        } else if (arrayList.size() > iM47379) {
            int size = arrayList.size() - iM47379;
            for (int i = 0; i < size; i++) {
                abstractC4311.mo12960();
            }
        }
        abstractC4311.m12961();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5722.m16158((int) abstractC4311.f13895, (ImageView) it.next());
        }
        C20746 c20747 = abstractC4311.f13897;
        C11233.m27799(c20747);
        if (c20747.m47385()) {
            C20746 c20748 = abstractC4311.f13897;
            C11233.m27799(c20748);
            c20748.m47384();
            AbstractC11367 abstractC11367Mo12955 = abstractC4311.mo12955();
            C20746 c20749 = abstractC4311.f13897;
            C11233.m27799(c20749);
            c20749.m47381(abstractC11367Mo12955);
            C20746 c207410 = abstractC4311.f13897;
            C11233.m27799(c207410);
            abstractC11367Mo12955.m28123(0.0f, c207410.m47382());
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m12961() {
        int size = this.f13900.size();
        for (int i = 0; i < size; i++) {
            mo12962(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m12954(float f) {
        return getContext().getResources().getDisplayMetrics().density * f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12957(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            mo12956(i + i3);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12968() {
        if (this.f13897 == null) {
            return;
        }
        post(new RunnableC19781(7, this));
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
        post(new RunnableC4196(8, this));
    }
}
