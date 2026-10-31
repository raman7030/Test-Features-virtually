package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C627 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12889 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f38683;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f38684;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TextView f38685;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f38686;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5062 f38687;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC4423 f38688;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo17648();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo17649(String str, String str2, boolean z);

    /* JADX WARN: Type inference failed for: r13v5, types: [l.ۙۙܽ] */
    public AbstractC12889(int i, final AbstractActivityC3346 abstractActivityC3346, final String str) {
        this.f38684 = false;
        this.f38686 = false;
        View viewM10216 = abstractActivityC3346.m10216(i);
        final C5062 c5062 = (C5062) viewM10216.findViewById(R.id.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM10216.findViewById(R.id.MT_Protector);
        final RadioButton radioButton2 = (RadioButton) viewM10216.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM10216.findViewById(R.id.radioButton3);
        this.f38685 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        this.f38687 = c5062;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.᩶ۙܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC12889.m31327(this.f64604, radioButton, radioButton2, radioButton3, c5062, view);
            }
        };
        radioButton.setOnClickListener(onClickListener);
        radioButton2.setOnClickListener(onClickListener);
        radioButton3.setOnClickListener(onClickListener);
        int i2 = ApplicationC20075.f65008.getInt(str, 0);
        if (i2 == 1) {
            radioButton2.setChecked(true);
            this.f38686 = true;
        } else if (i2 == 2) {
            radioButton3.setChecked(true);
            this.f38684 = true;
        } else {
            radioButton.setChecked(true);
        }
        c5062.m14604(radioButton.isChecked());
        int i3 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f38683 = c19258.m44415();
        this.f38688 = new View.OnClickListener() { // from class: l.ۙۙܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC12889.m31328(this.f14148, radioButton2, radioButton3, c5062, str, radioButton, abstractActivityC3346);
            }
        };
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31327(AbstractC12889 abstractC12889, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, C5062 c5062, View view) {
        if (view == radioButton) {
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
            c5062.m14599(1);
            abstractC12889.f38684 = false;
            abstractC12889.f38686 = false;
        } else if (view == radioButton2) {
            radioButton.setChecked(false);
            radioButton3.setChecked(false);
            c5062.m14599(2);
            try {
                if (abstractC12889.f38684 && m31329(c5062.m14611().toString().trim())) {
                    c5062.m14601(String.valueOf(Long.parseLong(c5062.m14611().toString().trim(), 16)));
                }
                abstractC12889.f38684 = false;
                abstractC12889.f38686 = true;
            } catch (NumberFormatException unused) {
                abstractC12889.f38684 = false;
                abstractC12889.f38686 = false;
            }
        } else {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            c5062.m14599(1);
            try {
                if (abstractC12889.f38686 && m31330(c5062.m14611().toString().trim())) {
                    c5062.m14601(Long.toHexString(Long.parseLong(c5062.m14611().toString().trim())));
                }
                abstractC12889.f38684 = true;
                abstractC12889.f38686 = false;
            } catch (NumberFormatException unused2) {
                abstractC12889.f38684 = false;
                abstractC12889.f38686 = false;
            }
        }
        c5062.m14604(radioButton.isChecked());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31328(AbstractC12889 abstractC12889, RadioButton radioButton, RadioButton radioButton2, C5062 c5062, String str, RadioButton radioButton3, AbstractActivityC3346 abstractActivityC3346) {
        int i;
        String strTrim;
        String str2;
        if (radioButton.isChecked()) {
            i = 1;
        } else {
            i = radioButton2.isChecked() ? 2 : 0;
        }
        String string = c5062.m14611().toString();
        ApplicationC20075.f65008.edit().mo25853(i, str).apply();
        c5062.m14610();
        if (i == 1) {
            strTrim = string.trim();
            if (!m31330(strTrim)) {
                C21374.m48457(R.string.MT_Protector);
                return;
            }
        } else {
            if (i != 2) {
                str2 = string;
            } else {
                String strTrim2 = string.trim();
                if (!m31329(strTrim2)) {
                    C21374.m48457(R.string.MT_Protector);
                    return;
                }
                long jM24989 = 0;
                for (char c : strTrim2.toCharArray()) {
                    jM24989 = (jM24989 << 4) | ((long) C9896.m24989(c));
                }
                strTrim = String.valueOf(jM24989);
            }
            if (str2.length() > 0) {
                if (i != 0) {
                    try {
                        Long.parseLong(str2);
                    } catch (NumberFormatException unused) {
                        C21374.m48457(R.string.MT_Protector);
                        return;
                    }
                }
                new C3012(abstractC12889, abstractActivityC3346, str2, string, radioButton3.isChecked()).m20274();
            }
            abstractC12889.f38683.dismiss();
        }
        str2 = strTrim;
        if (str2.length() > 0) {
            if (i != 0) {
                Long.parseLong(str2);
            }
            new C3012(abstractC12889, abstractActivityC3346, str2, string, radioButton3.isChecked()).m20274();
        }
        abstractC12889.f38683.dismiss();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31331(boolean z) {
        this.f38685.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f38683;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this.f38688);
        C5062 c5062 = this.f38687;
        c5062.m14615();
        C4925.m14329(c5062.m14607());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31332() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f38683;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this.f38688);
        C5062 c5062 = this.f38687;
        c5062.m14615();
        C4925.m14329(c5062.m14607());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31329(String str) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m31330(String str) {
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
