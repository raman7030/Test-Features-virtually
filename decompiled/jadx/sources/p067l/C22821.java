package p067l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AJ5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22821 extends AbstractC10214 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C6727 f71887;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ String f71888;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C23568 f71889;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ boolean f71890;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C23568 f71891;

    public C22821(C6727 c6727, String str, C23568 c23568, C23568 c23569, boolean z) {
        this.f71887 = c6727;
        this.f71888 = str;
        this.f71889 = c23568;
        this.f71891 = c23569;
        this.f71890 = z;
    }

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final View mo10912(Main main) {
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(this.f71888);
        C6804.m15599(viewM12252, this.f71889, this.f71891);
        final RadioButton[] radioButtonArr = {(RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.radioButton3)};
        C6727 c6727 = this.f71887;
        if (c6727.f17458) {
            radioButtonArr[0].setText(R.string.MT_Protector);
            radioButtonArr[2].setText(R.string.MT_Protector);
        }
        ((CheckBox) viewM12252.findViewById(R.id.MT_Protector)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.֨ۤܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f6669.f71887.f17461 = z;
            }
        });
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        final boolean z = this.f71890 && C23219.m51754();
        if (z) {
            checkBox.setVisibility(c6727.f17460 == 0 ? 0 : 8);
            checkBox.setChecked(c6727.f17457);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۠ۤܳ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    this.f27982.f71887.f17457 = z2;
                }
            });
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ܶۤܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RadioButton[] radioButtonArr2 = radioButtonArr;
                int length = radioButtonArr2.length;
                for (int i = 0; i < length; i++) {
                    RadioButton radioButton = radioButtonArr2[i];
                    radioButton.setChecked(radioButton == view);
                }
                if (z) {
                    checkBox.setVisibility(view.getId() != R.id.MT_Protector ? 8 : 0);
                }
            }
        };
        int i = 0;
        while (i < 3) {
            radioButtonArr[i].setChecked(i == c6727.f17460);
            radioButtonArr[i].setOnClickListener(onClickListener);
            i++;
        }
        viewM12252.setTag(radioButtonArr);
        return viewM12252;
    }

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10914(View view) {
        RadioButton[] radioButtonArr = (RadioButton[]) view.getTag();
        boolean zIsChecked = radioButtonArr[0].isChecked();
        C6727 c6727 = this.f71887;
        if (zIsChecked) {
            c6727.f17460 = 0;
            return true;
        }
        if (radioButtonArr[1].isChecked()) {
            c6727.f17460 = 1;
            return true;
        }
        c6727.f17460 = 2;
        return true;
    }
}
