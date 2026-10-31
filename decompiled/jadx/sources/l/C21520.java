package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AJ5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21520 extends AbstractC8255 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4586 f69191;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69192;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22306 f69193;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f69194;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22306 f69195;

    public C21520(C4586 c4586, String str, C22306 c22306, C22306 c22307, boolean z) {
        this.f69191 = c4586;
        this.f69192 = str;
        this.f69193 = c22306;
        this.f69195 = c22307;
        this.f69194 = z;
    }

    @Override // l.AbstractC8255
    /* JADX INFO: renamed from: ֫ */
    public final View mo8845(Main main) {
        View viewM10216 = main.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(this.f69192);
        C4667.m13724(viewM10216, this.f69193, this.f69195);
        final RadioButton[] radioButtonArr = {(RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.radioButton3)};
        C4586 c4586 = this.f69191;
        if (c4586.f14629) {
            radioButtonArr[0].setText(R.string.MT_Protector);
            radioButtonArr[2].setText(R.string.MT_Protector);
        }
        ((CheckBox) viewM10216.findViewById(R.id.MT_Protector)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.֨ۤܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f3898.f69191.f14632 = z;
            }
        });
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.checkBox2);
        final boolean z = this.f69194 && C21939.m49417();
        if (z) {
            checkBox.setVisibility(c4586.f14631 == 0 ? 0 : 8);
            checkBox.setChecked(c4586.f14628);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۠ۤܳ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    this.f25073.f69191.f14628 = z2;
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
            radioButtonArr[i].setChecked(i == c4586.f14631);
            radioButtonArr[i].setOnClickListener(onClickListener);
            i++;
        }
        viewM10216.setTag(radioButtonArr);
        return viewM10216;
    }

    @Override // l.AbstractC8255
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8847(View view) {
        RadioButton[] radioButtonArr = (RadioButton[]) view.getTag();
        boolean zIsChecked = radioButtonArr[0].isChecked();
        C4586 c4586 = this.f69191;
        if (zIsChecked) {
            c4586.f14631 = 0;
            return true;
        }
        if (radioButtonArr[1].isChecked()) {
            c4586.f14631 = 1;
            return true;
        }
        c4586.f14631 = 2;
        return true;
    }
}
