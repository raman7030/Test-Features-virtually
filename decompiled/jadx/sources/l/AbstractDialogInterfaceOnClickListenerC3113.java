package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O60D */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC3113 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C10235 f9728;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View f9729;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2978 f9730;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Spinner f9731;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Spinner f9732;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f9733;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f9734;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final View f9735;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    public AbstractDialogInterfaceOnClickListenerC3113(C16560 c16560, String str, boolean z, String str2) {
        Main mainM39056 = c16560.m39056();
        View viewM10216 = mainM39056.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        editText.setText(str);
        editText.setKeyListener(null);
        this.f9735 = viewM10216.findViewById(R.id.header3);
        this.f9728 = (C10235) viewM10216.findViewById(R.id.editTextView);
        Spinner spinner = (Spinner) viewM10216.findViewById(R.id.spinner1);
        this.f9732 = spinner;
        Spinner spinner2 = (Spinner) viewM10216.findViewById(R.id.spinner2);
        this.f9731 = spinner2;
        this.f9729 = viewM10216.findViewById(R.id.MT_Protector);
        this.f9733 = viewM10216.findViewById(R.id.MT_Protector);
        String[] stringArray = mainM39056.getResources().getStringArray(R.array.MT_Protector);
        String[] stringArray2 = mainM39056.getResources().getStringArray(R.array.MT_Protector);
        spinner.setAdapter((SpinnerAdapter) new C20065(mainM39056, stringArray));
        spinner2.setAdapter((SpinnerAdapter) new C20065(mainM39056, stringArray2));
        final String str3 = z ? "zacl" : "zcl";
        spinner.setSelection(Math.max(0, Math.min(ApplicationC20075.f65008.getInt(str3, z ? 6 : 3), stringArray.length - 1)));
        this.f9730 = (C2978) viewM10216.findViewById(R.id.switch1);
        C19258 c19258BuildDialog = mainM39056.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44428(false);
        c19258BuildDialog.m44442(R.string.MT_Protector, this);
        c19258BuildDialog.m44434(R.string.MT_Protector, this);
        if (z) {
            c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        this.f9734 = dialogInterfaceC0206M44438;
        dialogInterfaceC0206M44438.m1436(new DialogInterface.OnDismissListener() { // from class: l.᩶۠ܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractDialogInterfaceOnClickListenerC3113 abstractDialogInterfaceOnClickListenerC3113 = this.f64957;
                C2978 c2978 = abstractDialogInterfaceOnClickListenerC3113.f9730;
                InterfaceC13049 interfaceC13049Edit = ApplicationC20075.f65008.edit();
                if (abstractDialogInterfaceOnClickListenerC3113.f9733.getVisibility() == 0) {
                    interfaceC13049Edit.mo25853(abstractDialogInterfaceOnClickListenerC3113.f9732.getSelectedItemPosition(), str3);
                }
                if (c2978.getVisibility() == 0) {
                    interfaceC13049Edit.putBoolean("dzds", c2978.isChecked());
                }
                interfaceC13049Edit.apply();
            }
        });
        dialogInterfaceC0206M44438.m1437(new DialogInterface.OnKeyListener() { // from class: l.ۙ۠ܳ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                AbstractDialogInterfaceOnClickListenerC3113 abstractDialogInterfaceOnClickListenerC3113 = this.f14378;
                abstractDialogInterfaceOnClickListenerC3113.getClass();
                if (keyEvent.getAction() != 0 || i != 4) {
                    return false;
                }
                abstractDialogInterfaceOnClickListenerC3113.f9734.dismiss();
                return true;
            }
        });
        if (z) {
            C10025.m25199(c16560, dialogInterfaceC0206M44438, str2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9490(String str) {
        this.f9729.setVisibility(0);
        this.f9728.mo25910((CharSequence) str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m9491() {
        return this.f9728.m30436().toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9489(int i) {
        String quantityString = C4925.m14338().getQuantityString(R.plurals.MT_Protector, i);
        C2978 c2978 = this.f9730;
        c2978.setText(quantityString);
        c2978.setChecked(ApplicationC20075.f65008.getBoolean("dzds", false));
        c2978.setVisibility(0);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m9494() {
        this.f9733.setVisibility(8);
        this.f9731.setTranslationY(0.0f);
        this.f9735.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m9488() {
        return this.f9732.getSelectedItemPosition();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m9492() {
        return this.f9731.getSelectedItemPosition();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m9493() {
        return this.f9730.isChecked();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9487(int i, C8918 c8918) {
        switch (i) {
            case 0:
                c8918.m23018(0);
                return false;
            case 1:
                c8918.m23009(1);
                return false;
            case 2:
                c8918.m23009(3);
                return false;
            case 3:
                c8918.m23009(-1);
                return false;
            case 4:
                c8918.m23009(9);
                return false;
            case 5:
                c8918.m23009(10);
                return false;
            case 6:
                c8918.m23009(-1);
                c8918.m23025();
                return true;
            default:
                return false;
        }
    }
}
