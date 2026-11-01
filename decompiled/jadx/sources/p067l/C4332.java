package p067l;

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
public class C4332 extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f9676;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f9677;

    /* JADX INFO: renamed from: ᩹ */
    public TabHost.OnTabChangeListener f9678;

    @Deprecated
    public C4332(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9676 = new ArrayList();
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
        this.f9678 = onTabChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCurrentTabTag();
        ArrayList arrayList = this.f9676;
        if (arrayList.size() > 0) {
            ((C9302) arrayList.get(0)).getClass();
            throw null;
        }
        this.f9677 = true;
        m8881();
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9677 = false;
    }

    @Override // android.view.View
    @Deprecated
    public final Parcelable onSaveInstanceState() {
        C15336 c15336 = new C15336(super.onSaveInstanceState());
        c15336.f43783 = getCurrentTabTag();
        return c15336;
    }

    @Override // android.view.View
    @Deprecated
    public final void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof C15336)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C15336 c15336 = (C15336) parcelable;
        super.onRestoreInstanceState(c15336.getSuperState());
        setCurrentTabByTag(c15336.f43783);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public final void onTabChanged(String str) {
        if (this.f9677) {
            m8881();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f9678;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC18413 m8881() {
        ArrayList arrayList = this.f9676;
        if (arrayList.size() <= 0) {
            return null;
        }
        ((C9302) arrayList.get(0)).getClass();
        throw null;
    }
}
