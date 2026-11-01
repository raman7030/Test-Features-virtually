package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C627 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14618 {

    /* JADX INFO: renamed from: ֫ */
    public final DialogInterfaceC2564 f41726;

    /* JADX INFO: renamed from: ۧ */
    public boolean f41727;

    /* JADX INFO: renamed from: ܳ */
    public final TextView f41728;

    /* JADX INFO: renamed from: ܽ */
    public boolean f41729;

    /* JADX INFO: renamed from: ܿ */
    public final C7179 f41730;

    /* JADX INFO: renamed from: ᩳ */
    public ViewOnClickListenerC6572 f41731;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo19588();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo19589(String str, String str2, boolean z);

    /* JADX WARN: Type inference failed for: r13v5, types: [l.ۙۙܽ] */
    public AbstractC14618(int i, final AbstractActivityC5549 abstractActivityC5549, final String str) {
        this.f41727 = false;
        this.f41729 = false;
        View viewM12252 = abstractActivityC5549.m12252(i);
        final C7179 c7179 = (C7179) viewM12252.findViewById(R.id.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        final RadioButton radioButton2 = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM12252.findViewById(R.id.radioButton3);
        this.f41728 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f41730 = c7179;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.᩶ۙܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC14618.m33413(this.f67240, radioButton, radioButton2, radioButton3, c7179, view);
            }
        };
        radioButton.setOnClickListener(onClickListener);
        radioButton2.setOnClickListener(onClickListener);
        radioButton3.setOnClickListener(onClickListener);
        int i2 = ApplicationC21448.f67649.getInt(str, 0);
        if (i2 == 1) {
            radioButton2.setChecked(true);
            this.f41729 = true;
        } else if (i2 == 2) {
            radioButton3.setChecked(true);
            this.f41727 = true;
        } else {
            radioButton.setChecked(true);
        }
        c7179.m16511(radioButton.isChecked());
        int i3 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f41726 = c20671.m46709();
        this.f41731 = new View.OnClickListener() { // from class: l.ۙۙܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC14618.m33414(this.f16964, radioButton2, radioButton3, c7179, str, radioButton, abstractActivityC5549);
            }
        };
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m33413(AbstractC14618 abstractC14618, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, C7179 c7179, View view) {
        if (view == radioButton) {
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
            c7179.m16506(1);
            abstractC14618.f41727 = false;
            abstractC14618.f41729 = false;
        } else if (view == radioButton2) {
            radioButton.setChecked(false);
            radioButton3.setChecked(false);
            c7179.m16506(2);
            try {
                if (abstractC14618.f41727 && m33415(c7179.m16518().toString().trim())) {
                    c7179.m16508(String.valueOf(Long.parseLong(c7179.m16518().toString().trim(), 16)));
                }
                abstractC14618.f41727 = false;
                abstractC14618.f41729 = true;
            } catch (NumberFormatException unused) {
                abstractC14618.f41727 = false;
                abstractC14618.f41729 = false;
            }
        } else {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            c7179.m16506(1);
            try {
                if (abstractC14618.f41729 && m33416(c7179.m16518().toString().trim())) {
                    c7179.m16508(Long.toHexString(Long.parseLong(c7179.m16518().toString().trim())));
                }
                abstractC14618.f41727 = true;
                abstractC14618.f41729 = false;
            } catch (NumberFormatException unused2) {
                abstractC14618.f41727 = false;
                abstractC14618.f41729 = false;
            }
        }
        c7179.m16511(radioButton.isChecked());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static void m33414(AbstractC14618 abstractC14618, RadioButton radioButton, RadioButton radioButton2, C7179 c7179, String str, RadioButton radioButton3, AbstractActivityC5549 abstractActivityC5549) {
        int i;
        String strTrim;
        String str2;
        if (radioButton.isChecked()) {
            i = 1;
        } else {
            i = radioButton2.isChecked() ? 2 : 0;
        }
        String string = c7179.m16518().toString();
        ApplicationC21448.f67649.edit().mo27875(i, str).apply();
        c7179.m16517();
        if (i == 1) {
            strTrim = string.trim();
            if (!m33416(strTrim)) {
                C22682.m50793(R.string.MT_Protector);
                return;
            }
        } else {
            if (i != 2) {
                str2 = string;
            } else {
                String strTrim2 = string.trim();
                if (!m33415(strTrim2)) {
                    C22682.m50793(R.string.MT_Protector);
                    return;
                }
                long jM27004 = 0;
                for (char c : strTrim2.toCharArray()) {
                    jM27004 = (jM27004 << 4) | ((long) C11774.m27004(c));
                }
                strTrim = String.valueOf(jM27004);
            }
            if (str2.length() > 0) {
                if (i != 0) {
                    try {
                        Long.parseLong(str2);
                    } catch (NumberFormatException unused) {
                        C22682.m50793(R.string.MT_Protector);
                        return;
                    }
                }
                new C5231(abstractC14618, abstractActivityC5549, str2, string, radioButton3.isChecked()).m22250();
            }
            abstractC14618.f41726.dismiss();
        }
        str2 = strTrim;
        if (str2.length() > 0) {
            if (i != 0) {
                Long.parseLong(str2);
            }
            new C5231(abstractC14618, abstractActivityC5549, str2, string, radioButton3.isChecked()).m22250();
        }
        abstractC14618.f41726.dismiss();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33417(boolean z) {
        this.f41728.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f41726;
        dialogInterfaceC2564.m3862();
        dialogInterfaceC2564.m3860().setOnClickListener(this.f41731);
        C7179 c7179 = this.f41730;
        c7179.m16522();
        C7050.m16226(c7179.m16514());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33418() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f41726;
        dialogInterfaceC2564.m3862();
        dialogInterfaceC2564.m3860().setOnClickListener(this.f41731);
        C7179 c7179 = this.f41730;
        c7179.m16522();
        C7050.m16226(c7179.m16514());
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m33415(String str) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'A' || cCharAt > 'F') && cCharAt < 'a')) || cCharAt > 'f') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m33416(String str) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
        }
        return true;
    }
}
