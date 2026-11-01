package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩷֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21894 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final String[] f68842;

    /* JADX INFO: renamed from: ۧ */
    public final float[] f68843;

    /* JADX INFO: renamed from: ܽ */
    public int f68844;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C9823 f68845;

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, final int i) {
        C4459 c4459 = (C4459) abstractC5462;
        String[] strArr = this.f68842;
        if (i < strArr.length) {
            c4459.f10014.setText(strArr[i]);
        }
        if (i == this.f68844) {
            c4459.itemView.setSelected(true);
            c4459.f10013.setVisibility(0);
        } else {
            c4459.itemView.setSelected(false);
            c4459.f10013.setVisibility(4);
        }
        c4459.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ۜ֨ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21894.m49356(this.f22755, i);
            }
        });
    }

    public C21894(C9823 c9823, String[] strArr, float[] fArr) {
        this.f68845 = c9823;
        this.f68842 = strArr;
        this.f68843 = fArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49358(float f) {
        int i = 0;
        int i2 = 0;
        float f2 = Float.MAX_VALUE;
        while (true) {
            float[] fArr = this.f68843;
            if (i < fArr.length) {
                float fAbs = Math.abs(f - fArr[i]);
                if (fAbs < f2) {
                    i2 = i;
                    f2 = fAbs;
                }
                i++;
            } else {
                this.f68844 = i2;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m49357() {
        return this.f68842[this.f68844];
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C4459(LayoutInflater.from(this.f68845.getContext()).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m49356(C21894 c21894, int i) {
        C9823 c9823 = c21894.f68845;
        if (i != c21894.f68844) {
            C9823.m22922(c9823, c21894.f68843[i]);
        }
        c9823.f27197.dismiss();
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f68842.length;
    }
}
