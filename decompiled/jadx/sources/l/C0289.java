package l;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֡۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8GO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0289 extends FrameLayout {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f1636;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f1637;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C22785 f1638;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C11497 f1639;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public View f1640;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f1641;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f1642;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f1643;

    public C0289(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1637 = Collections.EMPTY_LIST;
        this.f1638 = C22785.f73570;
        this.f1636 = 0.0533f;
        this.f1641 = 0.08f;
        this.f1643 = true;
        this.f1642 = true;
        C11497 c11497 = new C11497(context, null);
        this.f1639 = c11497;
        this.f1640 = c11497;
        addView(c11497);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1636(List list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f1637 = list;
        m1633();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1635(float f) {
        this.f1636 = f;
        m1633();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1634() {
        this.f1642 = false;
        m1633();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1637(C22785 c22785) {
        this.f1638 = c22785;
        m1633();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1638() {
        this.f1641 = 0.045f;
        m1633();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m1633() {
        List list;
        boolean z = this.f1643;
        if (z && this.f1642) {
            list = this.f1637;
        } else {
            ArrayList arrayList = new ArrayList(this.f1637.size());
            for (int i = 0; i < this.f1637.size(); i++) {
                C21927 c21927M45556 = ((C19811) this.f1637.get(i)).m45556();
                if (!z) {
                    c21927M45556.m49390();
                    if (c21927M45556.m49398() instanceof Spanned) {
                        if (!(c21927M45556.m49398() instanceof Spannable)) {
                            c21927M45556.m49389(SpannableString.valueOf(c21927M45556.m49398()));
                        }
                        CharSequence charSequenceM49398 = c21927M45556.m49398();
                        charSequenceM49398.getClass();
                        Spannable spannable = (Spannable) charSequenceM49398;
                        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                            if (!(obj instanceof InterfaceC12049)) {
                                spannable.removeSpan(obj);
                            }
                        }
                    }
                    C5229.m15020(c21927M45556);
                } else if (!this.f1642) {
                    C5229.m15020(c21927M45556);
                }
                arrayList.add(c21927M45556.m49383());
            }
            list = arrayList;
        }
        this.f1639.m28325(list, this.f1638, this.f1636, this.f1641);
    }
}
