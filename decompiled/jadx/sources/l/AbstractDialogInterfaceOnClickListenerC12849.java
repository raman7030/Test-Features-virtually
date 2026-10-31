package l;

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
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5F9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC12849 implements DialogInterface.OnClickListener, View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final TextView f38589;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10235 f38590;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final TextView f38591;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextView f38592;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public View.OnClickListener f38593;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f38594 = false;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final FrameLayout f38595;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f38596;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f38597;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f38598;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Button f38599;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public View.OnLongClickListener f38600;

    public void onDismiss(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo31253() {
    }

    /* JADX INFO: renamed from: ۘ */
    public void mo7756() {
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract void mo2170();

    public AbstractDialogInterfaceOnClickListenerC12849(AbstractActivityC3346 abstractActivityC3346, int i) {
        this.f38598 = abstractActivityC3346;
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        this.f38596 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        this.f38589 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        this.f38592 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        this.f38591 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        C10235 c10235 = (C10235) viewM10216.findViewById(R.id.MT_Protector);
        this.f38590 = c10235;
        C9876.m24967(c10235, 0, -1, 0, -1);
        this.f38595 = (FrameLayout) viewM10216.findViewById(R.id.MT_Protector);
        this.f38599 = (Button) viewM10216.findViewById(R.id.button1);
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(viewM10216);
        c19258.m44428(false);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44434(R.string.MT_Protector, this);
        if (i != -1) {
            c19258.m44440(i, this);
        }
        DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258.m44415();
        this.f38597 = dialogInterfaceC0206M44415;
        dialogInterfaceC0206M44415.m1437(new DialogInterface.OnKeyListener() { // from class: l.᩶ۗܿ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849 = this.f64319;
                abstractDialogInterfaceOnClickListenerC12849.getClass();
                if (keyEvent.getAction() != 0 || i3 != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                abstractDialogInterfaceOnClickListenerC12849.mo31253();
                return true;
            }
        });
        dialogInterfaceC0206M44415.m1436(this);
        c10235.setOnKeyListener(new View.OnKeyListener() { // from class: l.ۙۗܿ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                return AbstractDialogInterfaceOnClickListenerC12849.m31241(this.f14065, i3, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31241(AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849, int i, KeyEvent keyEvent) {
        C10235 c10235 = abstractDialogInterfaceOnClickListenerC12849.f38590;
        if ((c10235.mo25893() & 131087) == 131073) {
            return false;
        }
        if (i != 66 && i != 160) {
            return false;
        }
        int iMo25920 = c10235.mo25920();
        if (iMo25920 != 2 && iMo25920 != 3 && iMo25920 != 4 && iMo25920 != 6) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            abstractDialogInterfaceOnClickListenerC12849.mo2170();
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 m31271() {
        return this.f38598;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m31254() {
        this.f38597.m1441(true);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            mo31253();
        } else {
            mo7756();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m31270() {
        this.f38590.m25926(131073);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31252(boolean z) {
        this.f38590.m30487(z);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31274(boolean z) {
        this.f38590.m30512(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m31285() {
        this.f38590.m30512(2);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m31243() {
        this.f38590.m25913(1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31245(int i) {
        C10235 c10235 = this.f38590;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c10235.getLayoutParams();
        marginLayoutParams.topMargin = i;
        c10235.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m31287(int i) {
        this.f38590.m25903(i);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m31269() {
        this.f38590.m25901(8);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m31276(int i) {
        this.f38590.m25926(i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m31279(int i) {
        this.f38590.m25924(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31249(TextWatcher textWatcher) {
        this.f38590.m30313(textWatcher);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31262() {
        this.f38597.dismiss();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m31260() {
        return this.f38590.m30436().toString();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 m31267() {
        return this.f38590.m30436();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31266(boolean z) {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f38597;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this);
        if (this.f38594 && this.f38593 != null) {
            dialogInterfaceC0206.m1448().setOnClickListener(this.f38593);
        }
        if (this.f38594 && this.f38600 != null) {
            dialogInterfaceC0206.m1448().setOnLongClickListener(this.f38600);
        }
        if (z) {
            C4925.m14329(this.f38590);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31247(int i, View.OnClickListener onClickListener, ViewOnLongClickListenerC23553 viewOnLongClickListenerC23553) {
        if (i == -1) {
            return;
        }
        this.f38593 = onClickListener;
        this.f38600 = viewOnLongClickListenerC23553;
        this.f38597.m1434(-3, C4925.m14327(i), null);
        this.f38594 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31250(CharSequence charSequence) {
        this.f38590.mo25910(charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31265(String str) {
        this.f38590.m30477(str);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m31277(String str) {
        this.f38590.m30317(str, true);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m31256(int i) {
        TextView textView = this.f38592;
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m31261(int i) {
        TextView textView = this.f38591;
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31246(int i, int i2) {
        this.f38590.mo25922(i, i2);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m31242() {
        C10235 c10235 = this.f38590;
        c10235.mo25919(c10235.m30526());
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m31281() {
        this.f38590.m25900();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m31268(int i) {
        this.f38590.m25897(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m31284() {
        this.f38590.m30475(13);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31283(int i) {
        this.f38592.setTextColor(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31248(ColorStateList colorStateList) {
        this.f38592.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m31257() {
        this.f38592.setTextSize(12);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31273(String str) {
        TextView textView = this.f38592;
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m31280(String str) {
        TextView textView = this.f38591;
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m31258(int i) {
        this.f38596.setText(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31264(CharSequence charSequence) {
        this.f38596.setText(charSequence);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m31259() {
        return this.f38589.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31251(String str) {
        TextView textView = this.f38589;
        if (str == null || str.isEmpty()) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31263(int i) {
        TextView textView = this.f38589;
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31244() {
        m31249(new C2972(this));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Button m31282() {
        return this.f38597.m1448();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Button m31275() {
        return this.f38599;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final FrameLayout m31286() {
        return this.f38595;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31272(int i) {
        this.f38589.setTextColor(i);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final TextView m31255() {
        return this.f38592;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 m31278() {
        return this.f38597;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo2170();
    }
}
