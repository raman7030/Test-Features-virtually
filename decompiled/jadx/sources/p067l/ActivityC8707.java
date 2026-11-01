package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۜۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC8707 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ܿۧ */
    public static final /* synthetic */ int f23597 = 0;

    /* JADX INFO: renamed from: ᩳۧ */
    public C24800 f23598;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "AccountDeletionActivity";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12277(R.layout.MT_Protector);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        m12268();
        this.f13392.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ۨۢ᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC8707.f23597;
                this.f37709.finish();
            }
        });
        AbstractC17724 abstractC17724M49285 = C21852.m49285((Context) this, false);
        View viewM12277 = m12277(R.id.MT_Protector);
        TextView textView = (TextView) m12277(R.id.textView);
        CheckBox checkBox = (CheckBox) m12277(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) m12277(R.id.checkBox2);
        Button button = (Button) m12277(R.id.MT_Protector);
        button.setEnabled(false);
        viewM12277.setVisibility(4);
        new C4013(this, abstractC17724M49285, textView, checkBox, checkBox2, button, viewM12277).m22250();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m20154(ActivityC8707 activityC8707) {
        EditText editText;
        View viewM12252 = activityC8707.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(activityC8707.f23598.f79259);
        Button button = (Button) viewM12252.findViewById(R.id.button1);
        button.setEnabled(false);
        if (activityC8707.f23598.f79255) {
            viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
            editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
            editText.addTextChangedListener(new C12731(button));
            viewM12252.findViewById(R.id.button2).setOnClickListener(new ViewOnClickListenerC23654(activityC8707, 1));
        } else {
            viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
            editText = (EditText) viewM12252.findViewById(R.id.editText2);
            editText.addTextChangedListener(new C19436(button));
        }
        C20671 c20671BuildDialog = activityC8707.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        button.setOnClickListener(new ViewOnClickListenerC19328(activityC8707, editText, c20671BuildDialog.m46732()));
        C7050.m16226(editText);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m20152(final ActivityC8707 activityC8707, EditText editText, final DialogInterfaceC2564 dialogInterfaceC2564, final View view) {
        final String string = editText.getText().toString();
        if (activityC8707.f23598.f79255) {
            if (!string.matches("\\d{6}")) {
                C22682.m50793(R.string.MT_Protector);
                return;
            }
        } else if (string.length() < 7) {
            C22682.m50793(R.string.MT_Protector);
            return;
        } else if (!C24553.m54154(string)) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        C20671 c20671BuildDialog = activityC8707.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(activityC8707.f23598.f79256);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺ۢ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = ActivityC8707.f23597;
                View view2 = view;
                view2.setEnabled(false);
                new C16082(view2, activityC8707, dialogInterfaceC2564, string).m22250();
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }
}
