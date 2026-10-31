package l;

import android.text.ClipboardManager;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34TE */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC14813 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final ViewOnClickListenerC14813 f45211 = new ViewOnClickListenerC14813();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ViewOnClickListenerC14813 m35214() {
        return f45211;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35215(TextView textView) {
        C19890.m45741(textView);
        textView.setOnClickListener(f45211);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m35217(TextView textView) {
        C19890.m45741(textView);
        textView.setOnLongClickListener(f45211);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35216(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        C19890.m45741(textView);
        textView.setOnClickListener(f45211);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ClipboardManager clipboardManager = (ClipboardManager) view.getContext().getSystemService("clipboard");
        if (clipboardManager != null) {
            try {
                clipboardManager.setText(((TextView) view).getText().toString());
                C21374.m48457(R.string.MT_Protector);
            } catch (Throwable unused) {
                C21374.m48457(R.string.MT_Protector);
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
            C21374.m48457(R.string.MT_Protector);
            return true;
        } catch (Throwable unused) {
            C21374.m48457(R.string.MT_Protector);
            return true;
        }
    }
}
