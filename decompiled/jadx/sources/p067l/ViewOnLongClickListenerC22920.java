package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95HF */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnLongClickListenerC22920 implements View.OnLongClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public TextView f72114;

    /* JADX INFO: renamed from: ۙ */
    public TextView f72115;

    /* JADX INFO: renamed from: ۬ */
    public ViewGroup f72116;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C21579 f72117;

    /* JADX INFO: renamed from: ᩸ */
    public int f72118;

    /* JADX INFO: renamed from: ᩹ */
    public int f72119;

    public ViewOnLongClickListenerC22920(C21579 c21579, int i, int i2) {
        this.f72117 = c21579;
        this.f72119 = i;
        this.f72118 = i2;
        ViewGroup viewGroup = (ViewGroup) c21579.f68039.m12277(i2);
        this.f72116 = viewGroup;
        viewGroup.setOnClickListener(this);
        viewGroup.setOnLongClickListener(this);
        this.f72114 = (TextView) viewGroup.getChildAt(1);
        this.f72115 = (TextView) viewGroup.getChildAt(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m51194(int i) {
        int i2 = this.f72119;
        ViewGroup viewGroup = this.f72116;
        TextView textView = this.f72115;
        TextView textView2 = this.f72114;
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

    /* JADX INFO: renamed from: ֫ */
    public final void m51193(String str) {
        this.f72114.setText(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m51192(byte[] bArr) {
        boolean zIsChecked = this.f72117.f68045.isChecked();
        int i = this.f72119;
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
        C21579 c21579 = this.f72117;
        if (c21579.f68039.m17304()) {
            return false;
        }
        final C8838 c8838 = c21579.f68039.f19629;
        final C19644 c19644M29476 = c8838.f23986.m29476();
        final long jM44646 = c19644M29476.m44646();
        final int iM29480 = c8838.f23986.m29480();
        final String string = this.f72114.getText().toString();
        onClick(null);
        View viewInflate = View.inflate(view.getContext(), R.layout.MT_Protector, null);
        EditText editText = (EditText) viewInflate.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewInflate.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.textView1);
        textView.setText(this.f72115.getText());
        editText.setText(string);
        editText.setSelection(0, editText.length());
        int i = this.f72118;
        if (i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector) {
            editText.setKeyListener(DigitsKeyListener.getInstance(true, false));
        } else if (i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector) {
            editText.setKeyListener(DigitsKeyListener.getInstance(false, false));
        } else if (i == R.id.MT_Protector || i == R.id.MT_Protector) {
            editText.setKeyListener(DigitsKeyListener.getInstance("0123456789-.eE"));
        }
        final C23590 c23590 = new C23590(editText, textView2, i, c21579.f68045.isChecked());
        Context context = view.getContext();
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(context);
        c20671.m46715(viewInflate);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671.m46732();
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ܶܰܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                ViewOnLongClickListenerC22920 viewOnLongClickListenerC22920 = this.f49987;
                C21579 c215710 = viewOnLongClickListenerC22920.f72117;
                C23590 c23591 = c23590;
                if (!c23591.f75101 && !c23591.f75098) {
                    C8838 c8839 = c8838;
                    C12862 c12862 = c8839.f23986;
                    C19644 c19644M29477 = c12862.m29476();
                    C19644 c19644 = c19644M29476;
                    DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M46732;
                    if (c19644M29477 == c19644 && c19644.m44646() == jM44646) {
                        int iM29481 = c12862.m29480();
                        int i3 = iM29480;
                        if (iM29481 == i3) {
                            if (c8839.m20440()) {
                                C22682.m50793(R.string.MT_Protector);
                                return;
                            }
                            if (c23591.f75102.getText().toString().equals(string)) {
                                dialogInterfaceC2564.dismiss();
                                return;
                            }
                            byte[] bArr = c23591.f75103;
                            try {
                                c19644.m44649(i3, bArr.length + i3, bArr);
                                c12862.m29463();
                                c215710.f68039.f19629.invalidate();
                                dialogInterfaceC2564.dismiss();
                                c215710.m48772();
                                viewOnLongClickListenerC22920.onClick(null);
                                return;
                            } catch (IOException e) {
                                c215710.f68039.m17295(e);
                                return;
                            }
                        }
                    }
                    dialogInterfaceC2564.dismiss();
                    return;
                }
                C22682.m50794(0, c23591.f75099.getText()).m50804();
            }
        });
        C7050.m16226(editText);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C21579 c21579 = this.f72117;
        SpannableString spannableString = new SpannableString(c21579.f68049.getText().toString());
        spannableString.setSpan(c21579.f68048, 0, (this.f72119 * 3) - 1, 33);
        c21579.f68049.setText(spannableString);
    }
}
