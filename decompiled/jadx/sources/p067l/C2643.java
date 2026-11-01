package p067l;

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
public final class C2643 extends FrameLayout {

    /* JADX INFO: renamed from: ۗ */
    public float f4413;

    /* JADX INFO: renamed from: ۙ */
    public List f4414;

    /* JADX INFO: renamed from: ۤ */
    public C24023 f4415;

    /* JADX INFO: renamed from: ۫ */
    public C13295 f4416;

    /* JADX INFO: renamed from: ۬ */
    public View f4417;

    /* JADX INFO: renamed from: ᩶ */
    public float f4418;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f4419;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f4420;

    public C2643(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4414 = Collections.EMPTY_LIST;
        this.f4415 = C24023.f76300;
        this.f4413 = 0.0533f;
        this.f4418 = 0.08f;
        this.f4420 = true;
        this.f4419 = true;
        C13295 c13295 = new C13295(context, null);
        this.f4416 = c13295;
        this.f4417 = c13295;
        addView(c13295);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4036(List list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f4414 = list;
        m4033();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4035(float f) {
        this.f4413 = f;
        m4033();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4034() {
        this.f4419 = false;
        m4033();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4037(C24023 c24023) {
        this.f4415 = c24023;
        m4033();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4038() {
        this.f4418 = 0.045f;
        m4033();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m4033() {
        List list;
        boolean z = this.f4420;
        if (z && this.f4419) {
            list = this.f4414;
        } else {
            ArrayList arrayList = new ArrayList(this.f4414.size());
            for (int i = 0; i < this.f4414.size(); i++) {
                C23207 c23207M47867 = ((C21196) this.f4414.get(i)).m47867();
                if (!z) {
                    c23207M47867.m51727();
                    if (c23207M47867.m51735() instanceof Spanned) {
                        if (!(c23207M47867.m51735() instanceof Spannable)) {
                            c23207M47867.m51726(SpannableString.valueOf(c23207M47867.m51735()));
                        }
                        CharSequence charSequenceM51735 = c23207M47867.m51735();
                        charSequenceM51735.getClass();
                        Spannable spannable = (Spannable) charSequenceM51735;
                        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                            if (!(obj instanceof InterfaceC13819)) {
                                spannable.removeSpan(obj);
                            }
                        }
                    }
                    C7338.m16930(c23207M47867);
                } else if (!this.f4419) {
                    C7338.m16930(c23207M47867);
                }
                arrayList.add(c23207M47867.m51720());
            }
            list = arrayList;
        }
        this.f4416.m30369(list, this.f4415, this.f4413, this.f4418);
    }
}
