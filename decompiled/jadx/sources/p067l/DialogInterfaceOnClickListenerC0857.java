package p067l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: l.֡ۡ */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC0857 implements InterfaceC1067, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C0997 f4432;

    /* JADX INFO: renamed from: ᩶ */
    public CharSequence f4433;

    /* JADX INFO: renamed from: ᩸ */
    public ListAdapter f4434;

    /* JADX INFO: renamed from: ᩹ */
    public DialogInterfaceC1814 f4435;

    @Override // p067l.InterfaceC1067
    public final Drawable getBackground() {
        return null;
    }

    @Override // p067l.InterfaceC1067
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // p067l.InterfaceC1067
    /* JADX INFO: renamed from: ֫ */
    public final int mo4049() {
        return 0;
    }

    @Override // p067l.InterfaceC1067
    /* JADX INFO: renamed from: ֫ */
    public final void mo4050(int i) {
    }

    @Override // p067l.InterfaceC1067
    /* JADX INFO: renamed from: ۧ */
    public final void mo4055(int i) {
    }

    @Override // p067l.InterfaceC1067
    /* JADX INFO: renamed from: ܽ */
    public final int mo4056() {
        return 0;
    }

    @Override // p067l.InterfaceC1067
    /* JADX INFO: renamed from: ܽ */
    public final void mo4057(int i) {
    }

    public DialogInterfaceOnClickListenerC0857(C0997 c0997) {
        this.f4432 = c0997;
    }

    @Override // p067l.InterfaceC1067
    public final void dismiss() {
        DialogInterfaceC1814 dialogInterfaceC1814 = this.f4435;
        if (dialogInterfaceC1814 != null) {
            dialogInterfaceC1814.dismiss();
            this.f4435 = null;
        }
    }

    @Override // p067l.InterfaceC1067
    public final boolean isShowing() {
        DialogInterfaceC1814 dialogInterfaceC1814 = this.f4435;
        if (dialogInterfaceC1814 != null) {
            return dialogInterfaceC1814.isShowing();
        }
        return false;
    }

    @Override // p067l.InterfaceC1067
    /* JADX INFO: renamed from: ֫ */
    public final void mo4052(ListAdapter listAdapter) {
        this.f4434 = listAdapter;
    }

    @Override // p067l.InterfaceC1067
    /* JADX INFO: renamed from: ֫ */
    public final void mo4053(CharSequence charSequence) {
        this.f4433 = charSequence;
    }

    @Override // p067l.InterfaceC1067
    /* JADX INFO: renamed from: ۧ */
    public final CharSequence mo4054() {
        return this.f4433;
    }

    @Override // p067l.InterfaceC1067
    /* JADX INFO: renamed from: ֫ */
    public final void mo4051(int i, int i2) {
        if (this.f4434 == null) {
            return;
        }
        C0997 c0997 = this.f4432;
        C1779 c1779 = new C1779(c0997.getPopupContext());
        CharSequence charSequence = this.f4433;
        if (charSequence != null) {
            c1779.setTitle(charSequence);
        }
        DialogInterfaceC1814 dialogInterfaceC1814Create = c1779.setSingleChoiceItems(this.f4434, c0997.getSelectedItemPosition(), this).create();
        this.f4435 = dialogInterfaceC1814Create;
        C0974 c0974M47330 = dialogInterfaceC1814Create.m47330();
        c0974M47330.setTextDirection(i);
        c0974M47330.setTextAlignment(i2);
        this.f4435.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0997 c0997 = this.f4432;
        c0997.setSelection(i);
        if (c0997.getOnItemClickListener() != null) {
            c0997.performItemClick(null, i, this.f4434.getItemId(i));
        }
        dismiss();
    }
}
