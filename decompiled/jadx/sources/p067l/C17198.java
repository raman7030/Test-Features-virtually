package p067l;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܺ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17198 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final Drawable[] f51194;

    /* JADX INFO: renamed from: ۧ */
    public final String[] f51195;

    /* JADX INFO: renamed from: ܽ */
    public final String[] f51196;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C9823 f51197;

    @Override // p067l.AbstractC21283
    public final long getItemId(int i) {
        return i;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        C10494 c10494 = (C10494) abstractC5462;
        if (m38949(i)) {
            c10494.itemView.setLayoutParams(new C16190(-1, -2));
        } else {
            c10494.itemView.setLayoutParams(new C16190(0, 0));
        }
        c10494.f29056.setText(this.f51195[i]);
        String[] strArr = this.f51196;
        if (strArr[i] == null) {
            c10494.f29057.setVisibility(8);
        } else {
            c10494.f29057.setText(strArr[i]);
        }
        Drawable[] drawableArr = this.f51194;
        if (drawableArr[i] == null) {
            c10494.f29055.setVisibility(8);
        } else {
            c10494.f29055.setImageDrawable(drawableArr[i]);
        }
    }

    public C17198(C9823 c9823, String[] strArr, Drawable[] drawableArr) {
        this.f51197 = c9823;
        this.f51195 = strArr;
        this.f51196 = new String[strArr.length];
        this.f51194 = drawableArr;
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C9823 c9823 = this.f51197;
        return new C10494(c9823, LayoutInflater.from(c9823.getContext()).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f51195.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38950(int i, String str) {
        this.f51196[i] = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38951() {
        return m38949(1) || m38949(0);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m38949(int i) {
        C9823 c9823 = this.f51197;
        if (c9823.f27181 == null) {
            return false;
        }
        if (i == 0) {
            return c9823.f27181.mo6821(13);
        }
        if (i != 1) {
            return true;
        }
        return c9823.f27181.mo6821(30) && c9823.f27181.mo6821(29);
    }
}
