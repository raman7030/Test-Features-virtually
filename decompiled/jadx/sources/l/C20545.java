package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20545 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String[] f66165;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float[] f66166;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f66167;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7844 f66168;

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, final int i) {
        C2200 c2200 = (C2200) abstractC3255;
        String[] strArr = this.f66165;
        if (i < strArr.length) {
            c2200.f7229.setText(strArr[i]);
        }
        if (i == this.f66167) {
            c2200.itemView.setSelected(true);
            c2200.f7228.setVisibility(0);
        } else {
            c2200.itemView.setSelected(false);
            c2200.f7228.setVisibility(4);
        }
        c2200.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ۜ֨ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20545.m47033(this.f19883, i);
            }
        });
    }

    public C20545(C7844 c7844, String[] strArr, float[] fArr) {
        this.f66168 = c7844;
        this.f66165 = strArr;
        this.f66166 = fArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47035(float f) {
        int i = 0;
        int i2 = 0;
        float f2 = Float.MAX_VALUE;
        while (true) {
            float[] fArr = this.f66166;
            if (i < fArr.length) {
                float fAbs = Math.abs(f - fArr[i]);
                if (fAbs < f2) {
                    i2 = i;
                    f2 = fAbs;
                }
                i++;
            } else {
                this.f66167 = i2;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m47034() {
        return this.f66165[this.f66167];
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2200(LayoutInflater.from(this.f66168.getContext()).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47033(C20545 c20545, int i) {
        C7844 c7844 = c20545.f66168;
        if (i != c20545.f66167) {
            C7844.m20957(c7844, c20545.f66166[i]);
        }
        c7844.f24281.dismiss();
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f66165.length;
    }
}
