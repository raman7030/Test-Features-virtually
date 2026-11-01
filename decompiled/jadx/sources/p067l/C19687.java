package p067l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R16R */
/* JADX INFO: loaded from: classes4.dex */
public final class C19687 {

    /* JADX INFO: renamed from: ֫ */
    public C12982 f59838;

    /* JADX INFO: renamed from: ۜ */
    public PopupWindow f59839;

    /* JADX INFO: renamed from: ۧ */
    public int f59840;

    /* JADX INFO: renamed from: ܳ */
    public C13612 f59841;

    /* JADX INFO: renamed from: ܽ */
    public HandlerC18345 f59842;

    /* JADX INFO: renamed from: ܿ */
    public int f59843;

    /* JADX INFO: renamed from: ᩳ */
    public TextUtils.TruncateAt f59844;

    /* JADX INFO: renamed from: ᩷ */
    public RectF f59845 = new RectF();

    /* JADX INFO: renamed from: ᩻ */
    public List f59846;

    /* JADX INFO: renamed from: ܿ */
    public final void m44722() {
        this.f59844 = TextUtils.TruncateAt.START;
    }

    public C19687(Context context, int i) {
        PopupWindow popupWindow = new PopupWindow(context);
        this.f59839 = popupWindow;
        this.f59842 = new HandlerC18345(popupWindow);
        Drawable drawableM50680 = C22622.m50680(context, R.drawable.MT_Protector);
        if (drawableM50680 != null) {
            drawableM50680 = drawableM50680.mutate();
            drawableM50680.setAlpha(i);
            Rect rect = new Rect();
            drawableM50680.getPadding(rect);
            this.f59840 = rect.top + rect.bottom;
        }
        popupWindow.setBackgroundDrawable(drawableM50680);
        popupWindow.setFocusable(false);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(false);
        C12982 c12982 = new C12982(this, context);
        this.f59838 = c12982;
        C13612 c13612 = new C13612(context);
        this.f59841 = c13612;
        c13612.setAdapter((ListAdapter) c12982);
        c13612.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.֫ᩳܿ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f9457.f59841.setSelection(0);
            }
        });
        popupWindow.setContentView(c13612);
        View viewInflate = LayoutInflater.from(c13612.getContext()).inflate(R.layout.MT_Protector, (ViewGroup) c13612, false);
        viewInflate.measure(0, 0);
        this.f59843 = c13612.getDividerHeight() + viewInflate.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m44719() {
        return this.f59843;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44720(int i) {
        this.f59841.m30968(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44715(AdapterView.OnItemClickListener onItemClickListener) {
        this.f59841.setOnItemClickListener(onItemClickListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44717(C7577 c7577) {
        this.f59841.setOnItemLongClickListener(c7577);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m44721() {
        return this.f59846.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44714() {
        if (this.f59839.isShowing()) {
            this.f59842.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m44723() {
        return this.f59839.isShowing();
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m44713(int i) {
        return (CharSequence) this.f59846.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44716(ArrayList arrayList) {
        this.f59846 = arrayList;
        this.f59838.notifyDataSetChanged();
        this.f59841.setSelection(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44718(final C14146 c14146, int i) {
        int iMin;
        this.f59842.removeMessages(0);
        RectF rectF = this.f59845;
        c14146.m32376(rectF, i);
        int[] iArr = new int[2];
        c14146.getLocationOnScreen(iArr);
        final int i2 = iArr[1];
        final int height = c14146.getHeight();
        final View view = (View) c14146.getParent().getParent();
        view.getLocationOnScreen(iArr);
        int i3 = iArr[1];
        int height2 = view.getHeight();
        int iM30967 = this.f59841.m30967();
        if (iM30967 <= 0) {
            iMin = 0;
        } else {
            iMin = Math.min(iM30967, this.f59843 * this.f59838.getCount());
        }
        final int i4 = iMin + this.f59840;
        final int i5 = ((i3 + height2) - i2) - height;
        float fM32472 = c14146.m32472() + c14146.getHeight();
        float f = rectF.bottom;
        if ((fM32472 - f) + i5 <= i4) {
            C7050.m16212(new Runnable() { // from class: l.۟ܽܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C19687.m44710(this.f26394, i4, c14146, i5, height, i2, view);
                }
            });
            return;
        }
        int iM32472 = (int) ((f - c14146.m32472()) - c14146.getHeight());
        c14146.m32480();
        PopupWindow popupWindow = this.f59839;
        if (popupWindow.isShowing()) {
            popupWindow.update(0, height + i2 + iM32472, view.getWidth() - C13076.m29939(32.0f), -2);
            return;
        }
        m44708(c14146);
        popupWindow.setWidth(view.getWidth() - C13076.m29939(32.0f));
        popupWindow.setHeight(-2);
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.showAtLocation(c14146, 49, 0, height + i2 + iM32472);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m44710(C19687 c19687, int i, C14146 c14146, int i2, int i3, int i4, View view) {
        c14146.m32475(-1, (int) (((c19687.f59845.bottom + i) - c14146.getHeight()) - i2));
        int i5 = i2 - i;
        c14146.m32480();
        PopupWindow popupWindow = c19687.f59839;
        if (popupWindow.isShowing()) {
            popupWindow.update(0, i3 + i4 + i5, view.getWidth() - C13076.m29939(32.0f), -2);
            return;
        }
        c19687.m44708(c14146);
        popupWindow.setWidth(view.getWidth() - C13076.m29939(32.0f));
        popupWindow.setHeight(-2);
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.showAtLocation(c14146, 49, 0, i3 + i4 + i5);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44708(C14146 c14146) {
        C1914 c1914M43586 = C1717.m43586(c14146);
        PopupWindow popupWindow = this.f59839;
        if (c1914M43586 != null && c1914M43586.m51170()) {
            C1388 c1388M51163 = c1914M43586.m51163(8);
            if (c1388M51163.f36102 == 0 && c1388M51163.f36105 == 0 && c1388M51163.f36103 == 0 && c1388M51163.f36104 == 0) {
                popupWindow.setInputMethodMode(1);
                return;
            }
        }
        popupWindow.setInputMethodMode(2);
    }
}
