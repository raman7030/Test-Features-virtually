package p067l;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֫ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes2.dex */
public final class C4013 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ CheckBox f8749;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ View f8750;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ AbstractC17724 f8751;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC8707 f8752;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ TextView f8753;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ CheckBox f8754;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ Button f8755;

    public C4013(ActivityC8707 activityC8707, AbstractC17724 abstractC17724, TextView textView, CheckBox checkBox, CheckBox checkBox2, Button button, View view) {
        this.f8752 = activityC8707;
        this.f8751 = abstractC17724;
        this.f8753 = textView;
        this.f8749 = checkBox;
        this.f8754 = checkBox2;
        this.f8755 = button;
        this.f8750 = view;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f8752);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        final CheckBox[] checkBoxArr;
        ActivityC8707 activityC8707 = this.f8752;
        this.f8751.mo40282(this.f8753, activityC8707.f23598.f79258);
        boolean zIsEmpty = TextUtils.isEmpty(activityC8707.f23598.f79254);
        CheckBox checkBox = this.f8749;
        CheckBox checkBox2 = this.f8754;
        if (zIsEmpty) {
            checkBoxArr = new CheckBox[]{checkBox};
            checkBox.setText(activityC8707.f23598.f79253);
            checkBox2.setVisibility(8);
        } else {
            checkBoxArr = new CheckBox[]{checkBox, checkBox2};
            checkBox.setText(activityC8707.f23598.f79253);
            checkBox2.setText(activityC8707.f23598.f79254);
        }
        final Button button = this.f8755;
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
                ActivityC8707.m20154(this.f25685.f8752);
            }
        });
        this.f8750.setVisibility(0);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f8752.m12260((Throwable) exc, true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924 {
        C25065 c25065M44755 = C19701.m44739(4212).m44755();
        if (!c25065M44755.m55016()) {
            throw new C3924(C3865.m7621(c25065M44755, R.string.MT_Protector));
        }
        this.f8752.f23598 = new C24800(c25065M44755.m55011(), c25065M44755.m55011(), c25065M44755.m55011(), c25065M44755.m55024(), c25065M44755.m55011(), c25065M44755.m55011(), c25065M44755.m55011());
    }
}
