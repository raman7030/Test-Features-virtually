package l;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J62A */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C2066 extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f6892;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f6893;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public TabHost.OnTabChangeListener f6894;

    @Deprecated
    public C2066(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6892 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.widget.TabHost
    @Deprecated
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Override // android.widget.TabHost
    @Deprecated
    public final void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f6894 = onTabChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCurrentTabTag();
        ArrayList arrayList = this.f6892;
        if (arrayList.size() > 0) {
            ((C7296) arrayList.get(0)).getClass();
            throw null;
        }
        this.f6893 = true;
        m6755();
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6893 = false;
    }

    @Override // android.view.View
    @Deprecated
    public final Parcelable onSaveInstanceState() {
        C13645 c13645 = new C13645(super.onSaveInstanceState());
        c13645.f40702 = getCurrentTabTag();
        return c13645;
    }

    @Override // android.view.View
    @Deprecated
    public final void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof C13645)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C13645 c13645 = (C13645) parcelable;
        super.onRestoreInstanceState(c13645.getSuperState());
        setCurrentTabByTag(c13645.f40702);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public final void onTabChanged(String str) {
        if (this.f6893) {
            m6755();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f6894;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC16882 m6755() {
        ArrayList arrayList = this.f6892;
        if (arrayList.size() <= 0) {
            return null;
        }
        ((C7296) arrayList.get(0)).getClass();
        throw null;
    }
}
