package p067l;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬ۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5F9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC14580 implements DialogInterface.OnClickListener, View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۗ */
    public final TextView f41631;

    /* JADX INFO: renamed from: ۙ */
    public final C12096 f41632;

    /* JADX INFO: renamed from: ۛ */
    public final TextView f41633;

    /* JADX INFO: renamed from: ۤ */
    public final TextView f41634;

    /* JADX INFO: renamed from: ۨ */
    public View.OnClickListener f41635;

    /* JADX INFO: renamed from: ۫ */
    public boolean f41636 = false;

    /* JADX INFO: renamed from: ۬ */
    public final FrameLayout f41637;

    /* JADX INFO: renamed from: ܰ */
    public final TextView f41638;

    /* JADX INFO: renamed from: ᩶ */
    public final DialogInterfaceC2564 f41639;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractActivityC5549 f41640;

    /* JADX INFO: renamed from: ᩹ */
    public final Button f41641;

    /* JADX INFO: renamed from: ᩺ */
    public View.OnLongClickListener f41642;

    public void onDismiss(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: ۖ */
    public void mo33339() {
    }

    /* JADX INFO: renamed from: ۘ */
    public void mo9819() {
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract void mo4537();

    public AbstractDialogInterfaceOnClickListenerC14580(AbstractActivityC5549 abstractActivityC5549, int i) {
        this.f41640 = abstractActivityC5549;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        this.f41638 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f41631 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f41634 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f41633 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        C12096 c12096 = (C12096) viewM12252.findViewById(R.id.MT_Protector);
        this.f41632 = c12096;
        C11755.m26982(c12096, 0, -1, 0, -1);
        this.f41637 = (FrameLayout) viewM12252.findViewById(R.id.MT_Protector);
        this.f41641 = (Button) viewM12252.findViewById(R.id.button1);
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46722(false);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, this);
        if (i != -1) {
            c20671.m46734(i, this);
        }
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671.m46709();
        this.f41639 = dialogInterfaceC2564M46709;
        dialogInterfaceC2564M46709.m3850(new DialogInterface.OnKeyListener() { // from class: l.᩶ۗܿ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580 = this.f66954;
                abstractDialogInterfaceOnClickListenerC14580.getClass();
                if (keyEvent.getAction() != 0 || i3 != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                abstractDialogInterfaceOnClickListenerC14580.mo33339();
                return true;
            }
        });
        dialogInterfaceC2564M46709.m3849(this);
        c12096.setOnKeyListener(new View.OnKeyListener() { // from class: l.ۙۗܿ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                return AbstractDialogInterfaceOnClickListenerC14580.m33327(this.f16880, i3, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m33327(AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580, int i, KeyEvent keyEvent) {
        C12096 c12096 = abstractDialogInterfaceOnClickListenerC14580.f41632;
        if ((c12096.mo27915() & 131087) == 131073) {
            return false;
        }
        if (i != 66 && i != 160) {
            return false;
        }
        int iMo27942 = c12096.mo27942();
        if (iMo27942 != 2 && iMo27942 != 3 && iMo27942 != 4 && iMo27942 != 6) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            abstractDialogInterfaceOnClickListenerC14580.mo4537();
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractActivityC5549 m33357() {
        return this.f41640;
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m33340() {
        this.f41639.m3854(true);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            mo33339();
        } else {
            mo9819();
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m33356() {
        this.f41632.m27948(131073);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33338(boolean z) {
        this.f41632.m32551(z);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m33360(boolean z) {
        this.f41632.m32576(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m33371() {
        this.f41632.m32576(2);
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m33329() {
        this.f41632.m27935(1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33331(int i) {
        C12096 c12096 = this.f41632;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c12096.getLayoutParams();
        marginLayoutParams.topMargin = i;
        c12096.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m33373(int i) {
        this.f41632.m27925(i);
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m33355() {
        this.f41632.m27923(8);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m33362(int i) {
        this.f41632.m27948(i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m33365(int i) {
        this.f41632.m27946(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33335(TextWatcher textWatcher) {
        this.f41632.m32377(textWatcher);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33348() {
        this.f41639.dismiss();
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m33346() {
        return this.f41632.m32500().toString();
    }

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC9768 m33353() {
        return this.f41632.m32500();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33352(boolean z) {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f41639;
        dialogInterfaceC2564.m3862();
        dialogInterfaceC2564.m3860().setOnClickListener(this);
        if (this.f41636 && this.f41635 != null) {
            dialogInterfaceC2564.m3861().setOnClickListener(this.f41635);
        }
        if (this.f41636 && this.f41642 != null) {
            dialogInterfaceC2564.m3861().setOnLongClickListener(this.f41642);
        }
        if (z) {
            C7050.m16226(this.f41632);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33333(int i, View.OnClickListener onClickListener, ViewOnLongClickListenerC24753 viewOnLongClickListenerC24753) {
        if (i == -1) {
            return;
        }
        this.f41635 = onClickListener;
        this.f41642 = viewOnLongClickListenerC24753;
        this.f41639.m3847(-3, C7050.m16224(i), null);
        this.f41636 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33336(CharSequence charSequence) {
        this.f41632.mo27932(charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33351(String str) {
        this.f41632.m32541(str);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m33363(String str) {
        this.f41632.m32381(str, true);
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m33342(int i) {
        TextView textView = this.f41634;
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m33347(int i) {
        TextView textView = this.f41633;
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33332(int i, int i2) {
        this.f41632.mo27944(i, i2);
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m33328() {
        C12096 c12096 = this.f41632;
        c12096.mo27941(c12096.m32590());
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m33367() {
        this.f41632.m27922();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m33354(int i) {
        this.f41632.m27919(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* JADX INFO: renamed from: ᩸ */
    public final void m33370() {
        this.f41632.m32539(13);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m33369(int i) {
        this.f41634.setTextColor(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33334(ColorStateList colorStateList) {
        this.f41634.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m33343() {
        this.f41634.setTextSize(12);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m33359(String str) {
        TextView textView = this.f41634;
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m33366(String str) {
        TextView textView = this.f41633;
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m33344(int i) {
        this.f41638.setText(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33350(CharSequence charSequence) {
        this.f41638.setText(charSequence);
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m33345() {
        return this.f41631.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33337(String str) {
        TextView textView = this.f41631;
        if (str == null || str.isEmpty()) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33349(int i) {
        TextView textView = this.f41631;
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33330() {
        m33335(new C5193(this));
    }

    /* JADX INFO: renamed from: ᩷ */
    public final Button m33368() {
        return this.f41639.m3861();
    }

    /* JADX INFO: renamed from: ܿ */
    public final Button m33361() {
        return this.f41641;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final FrameLayout m33372() {
        return this.f41637;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m33358(int i) {
        this.f41631.setTextColor(i);
    }

    /* JADX INFO: renamed from: ۜ */
    public final TextView m33341() {
        return this.f41634;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final DialogInterfaceC2564 m33364() {
        return this.f41639;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo4537();
    }
}
