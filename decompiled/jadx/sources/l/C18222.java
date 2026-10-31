package l;

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
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R16R */
/* JADX INFO: loaded from: classes4.dex */
public final class C18222 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11167 f56625;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public PopupWindow f56626;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f56627;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C11830 f56628;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HandlerC16810 f56629;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f56630;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public TextUtils.TruncateAt f56631;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public RectF f56632 = new RectF();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f56633;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m42461() {
        this.f56631 = TextUtils.TruncateAt.START;
    }

    public C18222(Context context, int i) {
        PopupWindow popupWindow = new PopupWindow(context);
        this.f56626 = popupWindow;
        this.f56629 = new HandlerC16810(popupWindow);
        Drawable drawableM48345 = C21311.m48345(context, R.drawable.MT_Protector);
        if (drawableM48345 != null) {
            drawableM48345 = drawableM48345.mutate();
            drawableM48345.setAlpha(i);
            Rect rect = new Rect();
            drawableM48345.getPadding(rect);
            this.f56627 = rect.top + rect.bottom;
        }
        popupWindow.setBackgroundDrawable(drawableM48345);
        popupWindow.setFocusable(false);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(false);
        C11167 c11167 = new C11167(this, context);
        this.f56625 = c11167;
        C11830 c11830 = new C11830(context);
        this.f56628 = c11830;
        c11830.setAdapter((ListAdapter) c11167);
        c11830.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.֫ᩳܿ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f6677.f56628.setSelection(0);
            }
        });
        popupWindow.setContentView(c11830);
        View viewInflate = LayoutInflater.from(c11830.getContext()).inflate(R.layout.MT_Protector, (ViewGroup) c11830, false);
        viewInflate.measure(0, 0);
        this.f56630 = c11830.getDividerHeight() + viewInflate.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m42458() {
        return this.f56630;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42459(int i) {
        this.f56628.m28918(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42454(AdapterView.OnItemClickListener onItemClickListener) {
        this.f56628.setOnItemClickListener(onItemClickListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42456(C5480 c5480) {
        this.f56628.setOnItemLongClickListener(c5480);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m42460() {
        return this.f56633.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42453() {
        if (this.f56626.isShowing()) {
            this.f56629.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m42462() {
        return this.f56626.isShowing();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m42452(int i) {
        return (CharSequence) this.f56633.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42455(ArrayList arrayList) {
        this.f56633 = arrayList;
        this.f56625.notifyDataSetChanged();
        this.f56628.setSelection(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42457(final C12392 c12392, int i) {
        int iMin;
        this.f56629.removeMessages(0);
        RectF rectF = this.f56632;
        c12392.m30312(rectF, i);
        int[] iArr = new int[2];
        c12392.getLocationOnScreen(iArr);
        final int i2 = iArr[1];
        final int height = c12392.getHeight();
        final View view = (View) c12392.getParent().getParent();
        view.getLocationOnScreen(iArr);
        int i3 = iArr[1];
        int height2 = view.getHeight();
        int iM28917 = this.f56628.m28917();
        if (iM28917 <= 0) {
            iMin = 0;
        } else {
            iMin = Math.min(iM28917, this.f56630 * this.f56625.getCount());
        }
        final int i4 = iMin + this.f56627;
        final int i5 = ((i3 + height2) - i2) - height;
        float fM30408 = c12392.m30408() + c12392.getHeight();
        float f = rectF.bottom;
        if ((fM30408 - f) + i5 <= i4) {
            C4925.m14315(new Runnable() { // from class: l.۟ܽܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C18222.m42449(this.f23483, i4, c12392, i5, height, i2, view);
                }
            });
            return;
        }
        int iM30408 = (int) ((f - c12392.m30408()) - c12392.getHeight());
        c12392.m30416();
        PopupWindow popupWindow = this.f56626;
        if (popupWindow.isShowing()) {
            popupWindow.update(0, height + i2 + iM30408, view.getWidth() - C11266.m27878(32.0f), -2);
            return;
        }
        m42447(c12392);
        popupWindow.setWidth(view.getWidth() - C11266.m27878(32.0f));
        popupWindow.setHeight(-2);
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.showAtLocation(c12392, 49, 0, height + i2 + iM30408);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42449(C18222 c18222, int i, C12392 c12392, int i2, int i3, int i4, View view) {
        c12392.m30411(-1, (int) (((c18222.f56632.bottom + i) - c12392.getHeight()) - i2));
        int i5 = i2 - i;
        c12392.m30416();
        PopupWindow popupWindow = c18222.f56626;
        if (popupWindow.isShowing()) {
            popupWindow.update(0, i3 + i4 + i5, view.getWidth() - C11266.m27878(32.0f), -2);
            return;
        }
        c18222.m42447(c12392);
        popupWindow.setWidth(view.getWidth() - C11266.m27878(32.0f));
        popupWindow.setHeight(-2);
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.showAtLocation(c12392, 49, 0, i3 + i4 + i5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42447(C12392 c12392) {
        C21610 c21610M41340 = C17648.m41340(c12392);
        PopupWindow popupWindow = this.f56626;
        if (c21610M41340 != null && c21610M41340.m48822()) {
            C11007 c11007M48815 = c21610M41340.m48815(8);
            if (c11007M48815.f33108 == 0 && c11007M48815.f33111 == 0 && c11007M48815.f33109 == 0 && c11007M48815.f33110 == 0) {
                popupWindow.setInputMethodMode(1);
                return;
            }
        }
        popupWindow.setInputMethodMode(2);
    }
}
