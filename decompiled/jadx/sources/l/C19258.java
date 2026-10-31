package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ScrollView;

/* JADX INFO: renamed from: l.᩵ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1Z9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19258 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18892 f60624;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public DialogInterface.OnShowListener f60625;

    public C19258(Context context) {
        this.f60624 = new C18892(context);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Context m44432() {
        return this.f60624.getContext();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44433(int i) {
        this.f60624.setTitle(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44436(CharSequence charSequence) {
        this.f60624.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44416(int i) {
        this.f60624.setMessage(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44424(CharSequence charSequence) {
        this.f60624.setMessage(charSequence);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44442(int i, DialogInterface.OnClickListener onClickListener) {
        this.f60624.setPositiveButton(i, onClickListener);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44441(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f60624.setPositiveButton(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44434(int i, DialogInterface.OnClickListener onClickListener) {
        this.f60624.setNegativeButton(i, onClickListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44425(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f60624.setNegativeButton(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44440(int i, DialogInterface.OnClickListener onClickListener) {
        this.f60624.setNeutralButton(i, onClickListener);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44437(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f60624.setNeutralButton(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44428(boolean z) {
        this.f60624.setCancelable(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44419(DialogInterface.OnCancelListener onCancelListener) {
        this.f60624.setOnCancelListener(onCancelListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44420(DialogInterface.OnDismissListener onDismissListener) {
        this.f60624.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44426(DialogInterfaceOnShowListenerC0670 dialogInterfaceOnShowListenerC0670) {
        this.f60625 = dialogInterfaceOnShowListenerC0670;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44427(DialogInterfaceOnKeyListenerC1376 dialogInterfaceOnKeyListenerC1376) {
        this.f60624.setOnKeyListener(dialogInterfaceOnKeyListenerC1376);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44418(int i, DialogInterface.OnClickListener onClickListener) {
        this.f60624.setItems(i, onClickListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44430(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        this.f60624.setItems(charSequenceArr, onClickListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44422(BaseAdapter baseAdapter, DialogInterfaceOnClickListenerC1348 dialogInterfaceOnClickListenerC1348) {
        this.f60624.setAdapter(baseAdapter, dialogInterfaceOnClickListenerC1348);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44431(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        this.f60624.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44417(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        this.f60624.setSingleChoiceItems(i, i2, onClickListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44429(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        this.f60624.setSingleChoiceItems(charSequenceArr, i, onClickListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44423(ListAdapter listAdapter, DialogInterfaceOnClickListenerC5209 dialogInterfaceOnClickListenerC5209) {
        this.f60624.setSingleChoiceItems(listAdapter, -1, dialogInterfaceOnClickListenerC5209);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44439(int i) {
        this.f60624.setView(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44421(View view) {
        this.f60624.setView(view);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44435(View view) {
        ScrollView scrollView = new ScrollView(view.getContext());
        scrollView.addView(view);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f60624.setView(scrollView);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 m44415() {
        DialogInterfaceC0206 dialogInterfaceC0206 = new DialogInterfaceC0206(this.f60624.create());
        DialogInterface.OnShowListener onShowListener = this.f60625;
        if (onShowListener != null) {
            dialogInterfaceC0206.m1438(onShowListener);
        }
        return dialogInterfaceC0206;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 m44438() {
        DialogInterfaceC0206 dialogInterfaceC0206M44415 = m44415();
        dialogInterfaceC0206M44415.m1449();
        return dialogInterfaceC0206M44415;
    }
}
