package p067l;

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
public final class C20671 {

    /* JADX INFO: renamed from: ֫ */
    public final C1779 f63854;

    /* JADX INFO: renamed from: ۧ */
    public DialogInterface.OnShowListener f63855;

    public C20671(Context context) {
        this.f63854 = new C1779(context);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Context m46726() {
        return this.f63854.getContext();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46727(int i) {
        this.f63854.setTitle(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46730(CharSequence charSequence) {
        this.f63854.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46710(int i) {
        this.f63854.setMessage(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46718(CharSequence charSequence) {
        this.f63854.setMessage(charSequence);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m46736(int i, DialogInterface.OnClickListener onClickListener) {
        this.f63854.setPositiveButton(i, onClickListener);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m46735(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f63854.setPositiveButton(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46728(int i, DialogInterface.OnClickListener onClickListener) {
        this.f63854.setNegativeButton(i, onClickListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46719(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f63854.setNegativeButton(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m46734(int i, DialogInterface.OnClickListener onClickListener) {
        this.f63854.setNeutralButton(i, onClickListener);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46731(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f63854.setNeutralButton(charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46722(boolean z) {
        this.f63854.setCancelable(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46713(DialogInterface.OnCancelListener onCancelListener) {
        this.f63854.setOnCancelListener(onCancelListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46714(DialogInterface.OnDismissListener onDismissListener) {
        this.f63854.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46720(DialogInterfaceOnShowListenerC3006 dialogInterfaceOnShowListenerC3006) {
        this.f63855 = dialogInterfaceOnShowListenerC3006;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46721(DialogInterfaceOnKeyListenerC3677 dialogInterfaceOnKeyListenerC3677) {
        this.f63854.setOnKeyListener(dialogInterfaceOnKeyListenerC3677);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46712(int i, DialogInterface.OnClickListener onClickListener) {
        this.f63854.setItems(i, onClickListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46724(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        this.f63854.setItems(charSequenceArr, onClickListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46716(BaseAdapter baseAdapter, DialogInterfaceOnClickListenerC3650 dialogInterfaceOnClickListenerC3650) {
        this.f63854.setAdapter(baseAdapter, dialogInterfaceOnClickListenerC3650);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46725(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        this.f63854.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46711(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        this.f63854.setSingleChoiceItems(i, i2, onClickListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46723(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        this.f63854.setSingleChoiceItems(charSequenceArr, i, onClickListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46717(ListAdapter listAdapter, DialogInterfaceOnClickListenerC7319 dialogInterfaceOnClickListenerC7319) {
        this.f63854.setSingleChoiceItems(listAdapter, -1, dialogInterfaceOnClickListenerC7319);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m46733(int i) {
        this.f63854.setView(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46715(View view) {
        this.f63854.setView(view);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46729(View view) {
        ScrollView scrollView = new ScrollView(view.getContext());
        scrollView.addView(view);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f63854.setView(scrollView);
    }

    /* JADX INFO: renamed from: ֫ */
    public final DialogInterfaceC2564 m46709() {
        DialogInterfaceC2564 dialogInterfaceC2564 = new DialogInterfaceC2564(this.f63854.create());
        DialogInterface.OnShowListener onShowListener = this.f63855;
        if (onShowListener != null) {
            dialogInterfaceC2564.m3851(onShowListener);
        }
        return dialogInterfaceC2564;
    }

    /* JADX INFO: renamed from: ܽ */
    public final DialogInterfaceC2564 m46732() {
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = m46709();
        dialogInterfaceC2564M46709.m3862();
        return dialogInterfaceC2564M46709;
    }
}
