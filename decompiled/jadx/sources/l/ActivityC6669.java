package l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC6669 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f20722 = 0;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C23602 f20723;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "AccountDeletionActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ۨۢ᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC6669.f20722;
                this.f34712.finish();
            }
        });
        AbstractC16157 abstractC16157M46962 = C20500.m46962((Context) this, false);
        View viewM10241 = m10241(R.id.MT_Protector);
        TextView textView = (TextView) m10241(R.id.textView);
        CheckBox checkBox = (CheckBox) m10241(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) m10241(R.id.checkBox2);
        Button button = (Button) m10241(R.id.MT_Protector);
        button.setEnabled(false);
        viewM10241.setVisibility(4);
        new C1730(this, abstractC16157M46962, textView, checkBox, checkBox2, button, viewM10241).m20274();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m18206(ActivityC6669 activityC6669) {
        EditText editText;
        View viewM10216 = activityC6669.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(activityC6669.f20723.f76515);
        Button button = (Button) viewM10216.findViewById(R.id.button1);
        button.setEnabled(false);
        if (activityC6669.f20723.f76511) {
            viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
            editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
            editText.addTextChangedListener(new C10903(button));
            viewM10216.findViewById(R.id.button2).setOnClickListener(new ViewOnClickListenerC22396(activityC6669, 1));
        } else {
            viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
            editText = (EditText) viewM10216.findViewById(R.id.editText2);
            editText.addTextChangedListener(new C17958(button));
        }
        C19258 c19258BuildDialog = activityC6669.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        button.setOnClickListener(new ViewOnClickListenerC17845(activityC6669, editText, c19258BuildDialog.m44438()));
        C4925.m14329(editText);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18204(final ActivityC6669 activityC6669, EditText editText, final DialogInterfaceC0206 dialogInterfaceC0206, final View view) {
        final String string = editText.getText().toString();
        if (activityC6669.f20723.f76511) {
            if (!string.matches("\\d{6}")) {
                C21374.m48457(R.string.MT_Protector);
                return;
            }
        } else if (string.length() < 7) {
            C21374.m48457(R.string.MT_Protector);
            return;
        } else if (!C23343.m51757(string)) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        C19258 c19258BuildDialog = activityC6669.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(activityC6669.f20723.f76512);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺ۢ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = ActivityC6669.f20722;
                View view2 = view;
                view2.setEnabled(false);
                new C14429(view2, activityC6669, dialogInterfaceC0206, string).m20274();
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }
}
