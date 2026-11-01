package p067l;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩶ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AJ5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21480 extends AbstractC10214 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C23568 f67759;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ String f67760;

    /* JADX INFO: renamed from: ۜ */
    public Button f67761;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C6727 f67762;

    /* JADX INFO: renamed from: ۢ */
    public TextView f67763;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ C23568 f67764;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ int f67765;

    /* JADX INFO: renamed from: ᩵ */
    public final /* synthetic */ int[] f67766;

    /* JADX INFO: renamed from: ᩷ */
    public final RadioButton[] f67767 = new RadioButton[3];

    public C21480(C6727 c6727, String str, C23568 c23568, C23568 c23569, int i, int[] iArr) {
        this.f67762 = c6727;
        this.f67760 = str;
        this.f67759 = c23568;
        this.f67764 = c23569;
        this.f67765 = i;
        this.f67766 = iArr;
    }

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final View mo10912(Main main) {
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(this.f67760);
        C6804.m15599(viewM12252, this.f67759, this.f67764);
        RadioButton radioButton = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        RadioButton[] radioButtonArr = this.f67767;
        radioButtonArr[0] = radioButton;
        radioButtonArr[1] = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        radioButtonArr[2] = (RadioButton) viewM12252.findViewById(R.id.radioButton3);
        if (this.f67762.f17458) {
            radioButtonArr[0].setText(R.string.MT_Protector);
            radioButtonArr[2].setText(R.string.MT_Protector);
        }
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM12252.findViewById(R.id.checkBox2).setVisibility(8);
        this.f67763 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.᩹ۤܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21480.m48683(this.f74841, view);
            }
        };
        int i = 0;
        while (i < radioButtonArr.length) {
            radioButtonArr[i].setChecked(i == this.f67765);
            radioButtonArr[i].setOnClickListener(onClickListener);
            i++;
        }
        m48682();
        return viewM12252;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m48683(C21480 c21480, View view) {
        RadioButton[] radioButtonArr = c21480.f67767;
        int length = radioButtonArr.length;
        for (int i = 0; i < length; i++) {
            RadioButton radioButton = radioButtonArr[i];
            radioButton.setChecked(radioButton == view);
        }
        c21480.m48682();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48682() {
        boolean zIsChecked = this.f67767[0].isChecked();
        this.f67763.setVisibility(zIsChecked ? 0 : 8);
        Button button = this.f67761;
        if (button != null) {
            button.setEnabled(!zIsChecked);
        }
    }

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final void mo12797(DialogInterfaceC2564 dialogInterfaceC2564) {
        this.f67761 = dialogInterfaceC2564.m3860();
        m48682();
    }

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10914(View view) {
        RadioButton[] radioButtonArr = this.f67767;
        if (radioButtonArr[0].isChecked()) {
            return false;
        }
        this.f67766[0] = radioButtonArr[1].isChecked() ? 1 : 2;
        return true;
    }
}
