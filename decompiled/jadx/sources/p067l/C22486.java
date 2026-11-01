package p067l;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩷᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63W */
/* JADX INFO: loaded from: classes5.dex */
public final class C22486 extends AbstractC5462 {

    /* JADX INFO: renamed from: ֫ */
    public final Drawable f70906;

    /* JADX INFO: renamed from: ۧ */
    public final SparseArray f70907;

    /* JADX INFO: renamed from: ܽ */
    public boolean f70908;

    /* JADX INFO: renamed from: ܿ */
    public ColorStateList f70909;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f70910;

    public C22486(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f70907 = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(bin.p000mt.plus.R.id.MT_Protector, view.findViewById(bin.p000mt.plus.R.id.MT_Protector));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f70906 = view.getBackground();
        if (textView != null) {
            this.f70909 = textView.getTextColors();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final View m50437(int i) {
        SparseArray sparseArray = this.f70907;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i);
        if (viewFindViewById != null) {
            sparseArray.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m50436() {
        return this.f70908;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50435(boolean z) {
        this.f70908 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m50439() {
        return this.f70910;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50438(boolean z) {
        this.f70910 = z;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m50440() {
        ColorStateList colorStateList;
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.f70906;
        if (background != drawable) {
            View view = this.itemView;
            int i = C1717.f57146;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) m50437(R.id.title);
        if (textView == null || (colorStateList = this.f70909) == null || textView.getTextColors().equals(colorStateList)) {
            return;
        }
        textView.setTextColor(colorStateList);
    }
}
