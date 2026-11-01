package p067l;

import android.text.ClipboardManager;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܳ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34TE */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC16447 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public static final ViewOnClickListenerC16447 f48327 = new ViewOnClickListenerC16447();

    /* JADX INFO: renamed from: ֫ */
    public static ViewOnClickListenerC16447 m37362() {
        return f48327;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37363(TextView textView) {
        C21272.m48052(textView);
        textView.setOnClickListener(f48327);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m37365(TextView textView) {
        C21272.m48052(textView);
        textView.setOnLongClickListener(f48327);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37364(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        C21272.m48052(textView);
        textView.setOnClickListener(f48327);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ClipboardManager clipboardManager = (ClipboardManager) view.getContext().getSystemService("clipboard");
        if (clipboardManager != null) {
            try {
                clipboardManager.setText(((TextView) view).getText().toString());
                C22682.m50793(R.string.MT_Protector);
            } catch (Throwable unused) {
                C22682.m50793(R.string.MT_Protector);
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ClipboardManager clipboardManager = (ClipboardManager) view.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            return false;
        }
        try {
            clipboardManager.setText(((TextView) view).getText().toString());
            C22682.m50793(R.string.MT_Protector);
            return true;
        } catch (Throwable unused) {
            C22682.m50793(R.string.MT_Protector);
            return true;
        }
    }
}
