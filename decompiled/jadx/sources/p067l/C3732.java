package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֨᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44R4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3732 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f7912 = true;

    /* JADX INFO: renamed from: ֫ */
    public static void m7188(final C8838 c8838) {
        Context context = c8838.getContext();
        View viewInflate = View.inflate(context, R.layout.MT_Protector, null);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.MT_Protector);
        StringBuilder sb = new StringBuilder("0…");
        sb.append(Integer.toString(c8838.f23986.m29477(), f7912 ? 16 : 10).toUpperCase());
        editText.setHint(sb.toString());
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.MT_Protector);
        checkBox.setChecked(f7912);
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(context);
        c20671.m46715(viewInflate);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671.m46732();
        C7050.m16226(editText);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.֡᩺ܿ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C3732.m7187(editText, c8838, z);
            }
        });
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ۚ᩺ܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    int i2 = Integer.parseInt(editText.getText().toString(), checkBox.isChecked() ? 16 : 10);
                    if (i2 >= 0) {
                        C8838 c8839 = c8838;
                        if (i2 <= c8839.f23986.m29477()) {
                            c8839.m20439(i2);
                            dialogInterfaceC2564M46732.dismiss();
                            return;
                        }
                    }
                    C22682.m50798(R.string.MT_Protector, 0).m50804();
                } catch (NumberFormatException unused) {
                    C22682.m50798(R.string.MT_Protector, 0).m50804();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7187(EditText editText, C8838 c8838, boolean z) {
        f7912 = z;
        try {
            editText.setText(Integer.toString(Integer.parseInt(editText.getText().toString(), z ? 10 : 16), z ? 16 : 10).toUpperCase());
            editText.setSelection(editText.length());
        } catch (NumberFormatException unused) {
        }
        StringBuilder sb = new StringBuilder("0…");
        sb.append(Integer.toString(c8838.f23986.m29477(), z ? 16 : 10).toUpperCase());
        editText.setHint(sb.toString());
    }
}
