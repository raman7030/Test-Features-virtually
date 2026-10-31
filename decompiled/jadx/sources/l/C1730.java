package l;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes2.dex */
public final class C1730 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f5972;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f5973;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16157 f5974;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6669 f5975;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f5976;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f5977;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f5978;

    public C1730(ActivityC6669 activityC6669, AbstractC16157 abstractC16157, TextView textView, CheckBox checkBox, CheckBox checkBox2, Button button, View view) {
        this.f5975 = activityC6669;
        this.f5974 = abstractC16157;
        this.f5976 = textView;
        this.f5972 = checkBox;
        this.f5977 = checkBox2;
        this.f5978 = button;
        this.f5973 = view;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f5975);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        final CheckBox[] checkBoxArr;
        ActivityC6669 activityC6669 = this.f5975;
        this.f5974.mo38090(this.f5976, activityC6669.f20723.f76514);
        boolean zIsEmpty = TextUtils.isEmpty(activityC6669.f20723.f76510);
        CheckBox checkBox = this.f5972;
        CheckBox checkBox2 = this.f5977;
        if (zIsEmpty) {
            checkBoxArr = new CheckBox[]{checkBox};
            checkBox.setText(activityC6669.f20723.f76509);
            checkBox2.setVisibility(8);
        } else {
            checkBoxArr = new CheckBox[]{checkBox, checkBox2};
            checkBox.setText(activityC6669.f20723.f76509);
            checkBox2.setText(activityC6669.f20723.f76510);
        }
        final Button button = this.f5978;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ܰۢ᩷
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                boolean z2 = false;
                for (CheckBox checkBox3 : checkBoxArr) {
                    if (!checkBox3.isChecked()) {
                        button.setEnabled(z2);
                    }
                }
                z2 = true;
                button.setEnabled(z2);
            }
        };
        for (CheckBox checkBox3 : checkBoxArr) {
            checkBox3.setOnCheckedChangeListener(onCheckedChangeListener);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: l.۟ۢ᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC6669.m18206(this.f22773.f5975);
            }
        });
        this.f5973.setVisibility(0);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f5975.m10224((Throwable) exc, true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C1637 {
        C23881 c23881M42496 = C18237.m42480(4212).m42496();
        if (!c23881M42496.m52607()) {
            throw new C1637(C1575.m5392(c23881M42496, R.string.MT_Protector));
        }
        this.f5975.f20723 = new C23602(c23881M42496.m52602(), c23881M42496.m52602(), c23881M42496.m52602(), c23881M42496.m52615(), c23881M42496.m52602(), c23881M42496.m52602(), c23881M42496.m52602());
    }
}
