package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44R4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1434 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f5139 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4945(final C6807 c6807) {
        Context context = c6807.getContext();
        View viewInflate = View.inflate(context, R.layout.MT_Protector, null);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.MT_Protector);
        StringBuilder sb = new StringBuilder("0…");
        sb.append(Integer.toString(c6807.f21109.m27415(), f5139 ? 16 : 10).toUpperCase());
        editText.setHint(sb.toString());
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.MT_Protector);
        checkBox.setChecked(f5139);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(context);
        c19258.m44421(viewInflate);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258.m44438();
        C4925.m14329(editText);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.֡᩺ܿ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C1434.m4944(editText, c6807, z);
            }
        });
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۚ᩺ܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    int i2 = Integer.parseInt(editText.getText().toString(), checkBox.isChecked() ? 16 : 10);
                    if (i2 >= 0) {
                        C6807 c6808 = c6807;
                        if (i2 <= c6808.f21109.m27415()) {
                            c6808.m18490(i2);
                            dialogInterfaceC0206M44438.dismiss();
                            return;
                        }
                    }
                    C21374.m48462(R.string.MT_Protector, 0).m48468();
                } catch (NumberFormatException unused) {
                    C21374.m48462(R.string.MT_Protector, 0).m48468();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4944(EditText editText, C6807 c6807, boolean z) {
        f5139 = z;
        try {
            editText.setText(Integer.toString(Integer.parseInt(editText.getText().toString(), z ? 10 : 16), z ? 16 : 10).toUpperCase());
            editText.setSelection(editText.length());
        } catch (NumberFormatException unused) {
        }
        StringBuilder sb = new StringBuilder("0…");
        sb.append(Integer.toString(c6807.f21109.m27415(), z ? 16 : 10).toUpperCase());
        editText.setHint(sb.toString());
    }
}
