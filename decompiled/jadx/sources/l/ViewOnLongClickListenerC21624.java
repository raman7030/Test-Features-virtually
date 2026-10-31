package l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95HF */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnLongClickListenerC21624 implements View.OnLongClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f69411;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f69412;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ViewGroup f69413;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20213 f69414;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f69415;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f69416;

    public ViewOnLongClickListenerC21624(C20213 c20213, int i, int i2) {
        this.f69414 = c20213;
        this.f69416 = i;
        this.f69415 = i2;
        ViewGroup viewGroup = (ViewGroup) c20213.f65393.m10241(i2);
        this.f69413 = viewGroup;
        viewGroup.setOnClickListener(this);
        viewGroup.setOnLongClickListener(this);
        this.f69411 = (TextView) viewGroup.getChildAt(1);
        this.f69412 = (TextView) viewGroup.getChildAt(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48846(int i) {
        int i2 = this.f69416;
        ViewGroup viewGroup = this.f69413;
        TextView textView = this.f69412;
        TextView textView2 = this.f69411;
        if (i >= i2) {
            textView2.setEnabled(true);
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            viewGroup.setEnabled(true);
            return true;
        }
        textView2.setText("----");
        textView2.setEnabled(false);
        textView2.setAlpha(0.3f);
        textView.setAlpha(0.3f);
        viewGroup.setEnabled(false);
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48845(String str) {
        this.f69411.setText(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m48844(byte[] bArr) {
        boolean zIsChecked = this.f69414.f65399.isChecked();
        int i = this.f69416;
        long j = 0;
        if (zIsChecked) {
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 8) | ((long) (bArr[i2] & 255));
            }
            return j;
        }
        while (true) {
            i--;
            if (i < 0) {
                return j;
            }
            j = (j << 8) | ((long) (bArr[i] & 255));
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C20213 c20213 = this.f69414;
        if (c20213.f65393.m15393()) {
            return false;
        }
        final C6807 c6807 = c20213.f65393.f16793;
        final C18177 c18177M27414 = c6807.f21109.m27414();
        final long jM42385 = c18177M27414.m42385();
        final int iM27418 = c6807.f21109.m27418();
        final String string = this.f69411.getText().toString();
        onClick(null);
        View viewInflate = View.inflate(view.getContext(), R.layout.MT_Protector, null);
        EditText editText = (EditText) viewInflate.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewInflate.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.textView1);
        textView.setText(this.f69412.getText());
        editText.setText(string);
        editText.setSelection(0, editText.length());
        int i = this.f69415;
        if (i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector) {
            editText.setKeyListener(DigitsKeyListener.getInstance(true, false));
        } else if (i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector) {
            editText.setKeyListener(DigitsKeyListener.getInstance(false, false));
        } else if (i == R.id.MT_Protector || i == R.id.MT_Protector) {
            editText.setKeyListener(DigitsKeyListener.getInstance("0123456789-.eE"));
        }
        final C22329 c22329 = new C22329(editText, textView2, i, c20213.f65399.isChecked());
        Context context = view.getContext();
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(context);
        c19258.m44421(viewInflate);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258.m44438();
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܶܰܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                ViewOnLongClickListenerC21624 viewOnLongClickListenerC21624 = this.f46863;
                C20213 c20214 = viewOnLongClickListenerC21624.f69414;
                C22329 c223210 = c22329;
                if (!c223210.f72375 && !c223210.f72372) {
                    C6807 c6808 = c6807;
                    C11041 c11041 = c6808.f21109;
                    C18177 c18177M27415 = c11041.m27414();
                    C18177 c18177 = c18177M27414;
                    DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M44438;
                    if (c18177M27415 == c18177 && c18177.m42385() == jM42385) {
                        int iM27419 = c11041.m27418();
                        int i3 = iM27418;
                        if (iM27419 == i3) {
                            if (c6808.m18491()) {
                                C21374.m48457(R.string.MT_Protector);
                                return;
                            }
                            if (c223210.f72376.getText().toString().equals(string)) {
                                dialogInterfaceC0206.dismiss();
                                return;
                            }
                            byte[] bArr = c223210.f72377;
                            try {
                                c18177.m42388(i3, bArr.length + i3, bArr);
                                c11041.m27401();
                                c20214.f65393.f16793.invalidate();
                                dialogInterfaceC0206.dismiss();
                                c20214.m46453();
                                viewOnLongClickListenerC21624.onClick(null);
                                return;
                            } catch (IOException e) {
                                c20214.f65393.m15384(e);
                                return;
                            }
                        }
                    }
                    dialogInterfaceC0206.dismiss();
                    return;
                }
                C21374.m48458(0, c223210.f72373.getText()).m48468();
            }
        });
        C4925.m14329(editText);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C20213 c20213 = this.f69414;
        SpannableString spannableString = new SpannableString(c20213.f65403.getText().toString());
        spannableString.setSpan(c20213.f65402, 0, (this.f69416 * 3) - 1, 33);
        c20213.f65403.setText(spannableString);
    }
}
