package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: l.֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC0299 implements InterfaceC4533, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3122 f1655;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public CharSequence f1656;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ListAdapter f1657;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19598 f1658;

    @Override // l.InterfaceC4533
    public final Drawable getBackground() {
        return null;
    }

    @Override // l.InterfaceC4533
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // l.InterfaceC4533
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo1651() {
        return 0;
    }

    @Override // l.InterfaceC4533
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1652(int i) {
    }

    @Override // l.InterfaceC4533
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo1657(int i) {
    }

    @Override // l.InterfaceC4533
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo1658() {
        return 0;
    }

    @Override // l.InterfaceC4533
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo1659(int i) {
    }

    public DialogInterfaceOnClickListenerC0299(C3122 c3122) {
        this.f1655 = c3122;
    }

    @Override // l.InterfaceC4533
    public final void dismiss() {
        DialogInterfaceC19598 dialogInterfaceC19598 = this.f1658;
        if (dialogInterfaceC19598 != null) {
            dialogInterfaceC19598.dismiss();
            this.f1658 = null;
        }
    }

    @Override // l.InterfaceC4533
    public final boolean isShowing() {
        DialogInterfaceC19598 dialogInterfaceC19598 = this.f1658;
        if (dialogInterfaceC19598 != null) {
            return dialogInterfaceC19598.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC4533
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1654(ListAdapter listAdapter) {
        this.f1657 = listAdapter;
    }

    @Override // l.InterfaceC4533
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1655(CharSequence charSequence) {
        this.f1656 = charSequence;
    }

    @Override // l.InterfaceC4533
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharSequence mo1656() {
        return this.f1656;
    }

    @Override // l.InterfaceC4533
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1653(int i, int i2) {
        if (this.f1657 == null) {
            return;
        }
        C3122 c3122 = this.f1655;
        C18892 c18892 = new C18892(c3122.getPopupContext());
        CharSequence charSequence = this.f1656;
        if (charSequence != null) {
            c18892.setTitle(charSequence);
        }
        DialogInterfaceC19598 dialogInterfaceC19598Create = c18892.setSingleChoiceItems(this.f1657, c3122.getSelectedItemPosition(), this).create();
        this.f1658 = dialogInterfaceC19598Create;
        C2664 c2664M45035 = dialogInterfaceC19598Create.m45035();
        c2664M45035.setTextDirection(i);
        c2664M45035.setTextAlignment(i2);
        this.f1658.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C3122 c3122 = this.f1655;
        c3122.setSelection(i);
        if (c3122.getOnItemClickListener() != null) {
            c3122.performItemClick(null, i, this.f1657.getItemId(i));
        }
        dismiss();
    }
}
