package p067l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۗ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O60D */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC5327 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final C12096 f12531;

    /* JADX INFO: renamed from: ۙ */
    public final View f12532;

    /* JADX INFO: renamed from: ۤ */
    public final C0990 f12533;

    /* JADX INFO: renamed from: ۫ */
    public final Spinner f12534;

    /* JADX INFO: renamed from: ۬ */
    public final Spinner f12535;

    /* JADX INFO: renamed from: ᩶ */
    public final View f12536;

    /* JADX INFO: renamed from: ᩸ */
    public final DialogInterfaceC2564 f12537;

    /* JADX INFO: renamed from: ᩹ */
    public final View f12538;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    public AbstractDialogInterfaceOnClickListenerC5327(C18107 c18107, String str, boolean z, String str2) {
        Main mainM41282 = c18107.m41282();
        View viewM12252 = mainM41282.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        editText.setText(str);
        editText.setKeyListener(null);
        this.f12538 = viewM12252.findViewById(R.id.header3);
        this.f12531 = (C12096) viewM12252.findViewById(R.id.editTextView);
        Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner1);
        this.f12535 = spinner;
        Spinner spinner2 = (Spinner) viewM12252.findViewById(R.id.spinner2);
        this.f12534 = spinner2;
        this.f12532 = viewM12252.findViewById(R.id.MT_Protector);
        this.f12536 = viewM12252.findViewById(R.id.MT_Protector);
        String[] stringArray = mainM41282.getResources().getStringArray(R.array.MT_Protector);
        String[] stringArray2 = mainM41282.getResources().getStringArray(R.array.MT_Protector);
        spinner.setAdapter((SpinnerAdapter) new C21438(mainM41282, stringArray));
        spinner2.setAdapter((SpinnerAdapter) new C21438(mainM41282, stringArray2));
        final String str3 = z ? "zacl" : "zcl";
        spinner.setSelection(Math.max(0, Math.min(ApplicationC21448.f67649.getInt(str3, z ? 6 : 3), stringArray.length - 1)));
        this.f12533 = (C0990) viewM12252.findViewById(R.id.switch1);
        C20671 c20671BuildDialog = mainM41282.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46722(false);
        c20671BuildDialog.m46736(R.string.MT_Protector, this);
        c20671BuildDialog.m46728(R.string.MT_Protector, this);
        if (z) {
            c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        this.f12537 = dialogInterfaceC2564M46732;
        dialogInterfaceC2564M46732.m3849(new DialogInterface.OnDismissListener() { // from class: l.᩶۠ܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractDialogInterfaceOnClickListenerC5327 abstractDialogInterfaceOnClickListenerC5327 = this.f67599;
                C0990 c0990 = abstractDialogInterfaceOnClickListenerC5327.f12533;
                InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
                if (abstractDialogInterfaceOnClickListenerC5327.f12536.getVisibility() == 0) {
                    interfaceC14770Edit.mo27875(abstractDialogInterfaceOnClickListenerC5327.f12535.getSelectedItemPosition(), str3);
                }
                if (c0990.getVisibility() == 0) {
                    interfaceC14770Edit.putBoolean("dzds", c0990.isChecked());
                }
                interfaceC14770Edit.apply();
            }
        });
        dialogInterfaceC2564M46732.m3850(new DialogInterface.OnKeyListener() { // from class: l.ۙ۠ܳ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                AbstractDialogInterfaceOnClickListenerC5327 abstractDialogInterfaceOnClickListenerC5327 = this.f17205;
                abstractDialogInterfaceOnClickListenerC5327.getClass();
                if (keyEvent.getAction() != 0 || i != 4) {
                    return false;
                }
                abstractDialogInterfaceOnClickListenerC5327.f12537.dismiss();
                return true;
            }
        });
        if (z) {
            C11896.m27216(c18107, dialogInterfaceC2564M46732, str2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11533(String str) {
        this.f12532.setVisibility(0);
        this.f12531.mo27932((CharSequence) str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m11534() {
        return this.f12531.m32500().toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11532(int i) {
        String quantityString = C7050.m16235().getQuantityString(R.plurals.MT_Protector, i);
        C0990 c0990 = this.f12533;
        c0990.setText(quantityString);
        c0990.setChecked(ApplicationC21448.f67649.getBoolean("dzds", false));
        c0990.setVisibility(0);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m11537() {
        this.f12536.setVisibility(8);
        this.f12534.setTranslationY(0.0f);
        this.f12538.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11531() {
        return this.f12535.getSelectedItemPosition();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m11535() {
        return this.f12534.getSelectedItemPosition();
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m11536() {
        return this.f12533.isChecked();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m11530(int i, C10844 c10844) {
        switch (i) {
            case 0:
                c10844.m24992(0);
                return false;
            case 1:
                c10844.m24983(1);
                return false;
            case 2:
                c10844.m24983(3);
                return false;
            case 3:
                c10844.m24983(-1);
                return false;
            case 4:
                c10844.m24983(9);
                return false;
            case 5:
                c10844.m24983(10);
                return false;
            case 6:
                c10844.m24983(-1);
                c10844.m24999();
                return true;
            default:
                return false;
        }
    }
}
