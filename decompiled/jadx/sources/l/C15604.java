package l;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15604 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Drawable[] f48063;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String[] f48064;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String[] f48065;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7844 f48066;

    @Override // l.AbstractC19902
    public final long getItemId(int i) {
        return i;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C8550 c8550 = (C8550) abstractC3255;
        if (m36788(i)) {
            c8550.itemView.setLayoutParams(new C14543(-1, -2));
        } else {
            c8550.itemView.setLayoutParams(new C14543(0, 0));
        }
        c8550.f26141.setText(this.f48064[i]);
        String[] strArr = this.f48065;
        if (strArr[i] == null) {
            c8550.f26142.setVisibility(8);
        } else {
            c8550.f26142.setText(strArr[i]);
        }
        Drawable[] drawableArr = this.f48063;
        if (drawableArr[i] == null) {
            c8550.f26140.setVisibility(8);
        } else {
            c8550.f26140.setImageDrawable(drawableArr[i]);
        }
    }

    public C15604(C7844 c7844, String[] strArr, Drawable[] drawableArr) {
        this.f48066 = c7844;
        this.f48064 = strArr;
        this.f48065 = new String[strArr.length];
        this.f48063 = drawableArr;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7844 c7844 = this.f48066;
        return new C8550(c7844, LayoutInflater.from(c7844.getContext()).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f48064.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36789(int i, String str) {
        this.f48065[i] = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36790() {
        return m36788(1) || m36788(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m36788(int i) {
        C7844 c7844 = this.f48066;
        if (c7844.f24265 == null) {
            return false;
        }
        if (i == 0) {
            return c7844.f24265.mo4589(13);
        }
        if (i != 1) {
            return true;
        }
        return c7844.f24265.mo4589(30) && c7844.f24265.mo4589(29);
    }
}
