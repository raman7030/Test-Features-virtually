package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ܺ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 251F */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC17733 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final CheckBox f52963;

    /* JADX INFO: renamed from: ۙ */
    public final CheckBox f52964;

    /* JADX INFO: renamed from: ۬ */
    public final TextView f52965;

    /* JADX INFO: renamed from: ᩶ */
    public final C7179 f52966;

    /* JADX INFO: renamed from: ᩸ */
    public final ActivityC22429 f52967;

    /* JADX INFO: renamed from: ᩹ */
    public final DialogInterfaceC2564 f52968;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5140();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5141(Pattern pattern, String str);

    public AbstractViewOnClickListenerC17733(ActivityC22429 activityC22429) {
        this.f52967 = activityC22429;
        View viewM12252 = activityC22429.m12252(R.layout.MT_Protector);
        this.f52966 = (C7179) viewM12252.findViewById(R.id.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f52964 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        this.f52963 = checkBox2;
        this.f52965 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        checkBox.setChecked(ApplicationC21448.f67649.getBoolean("dex_search_match_case", false));
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۢ᩶ܽ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f32623.f52966.m16516(z);
            }
        });
        checkBox2.setChecked(ApplicationC21448.f67649.getBoolean("dex_search_regex", false));
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(activityC22429);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f52968 = c20671.m46709();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40293(boolean z) {
        this.f52965.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f52968;
        dialogInterfaceC2564.m3862();
        dialogInterfaceC2564.m3860().setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Pattern patternCompile;
        boolean zIsChecked = this.f52964.isChecked();
        boolean zIsChecked2 = this.f52963.isChecked();
        C7179 c7179 = this.f52966;
        String string = c7179.m16518().toString();
        String strM13905 = !zIsChecked2 ? C6112.m13905(string) : string;
        try {
            if (zIsChecked) {
                patternCompile = Pattern.compile(strM13905, 8);
            } else {
                patternCompile = Pattern.compile(strM13905, 74);
            }
            ApplicationC21448.f67649.edit().putBoolean("dex_search_match_case", zIsChecked).putBoolean("dex_search_regex", zIsChecked2).apply();
            c7179.m16517();
            this.f52968.dismiss();
            new C11029(this, patternCompile, string).m22250();
        } catch (PatternSyntaxException e) {
            C22682.m50795((CharSequence) e.getMessage());
            c7179.requestFocus();
        }
    }
}
