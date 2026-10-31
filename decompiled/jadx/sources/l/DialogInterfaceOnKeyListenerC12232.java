package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.alipay.sdk.m.t0.b;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.۫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5PE */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnKeyListenerC12232 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC17585 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C21405 f36478;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19598 f36479;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3060 f36480;

    @Override // l.InterfaceC17585
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2048(C3060 c3060) {
        return false;
    }

    public DialogInterfaceOnKeyListenerC12232(SubMenuC19703 subMenuC19703) {
        this.f36480 = subMenuC19703;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29738() {
        C3060 c3060 = this.f36480;
        C18892 c18892 = new C18892(c3060.getContext());
        C21405 c21405 = new C21405(c18892.getContext());
        this.f36478 = c21405;
        c21405.setCallback(this);
        c3060.addMenuPresenter(this.f36478);
        c18892.setAdapter(this.f36478.m48503(), this);
        View headerView = c3060.getHeaderView();
        if (headerView != null) {
            c18892.setCustomTitle(headerView);
        } else {
            c18892.setIcon(c3060.getHeaderIcon()).setTitle(c3060.getHeaderTitle());
        }
        c18892.setOnKeyListener(this);
        DialogInterfaceC19598 dialogInterfaceC19598Create = c18892.create();
        this.f36479 = dialogInterfaceC19598Create;
        dialogInterfaceC19598Create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f36479.getWindow().getAttributes();
        attributes.type = b.d;
        attributes.flags |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f36479.show();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        C3060 c3060 = this.f36480;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f36479.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f36479.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                c3060.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return c3060.performShortcut(i, keyEvent, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f36478.onCloseMenu(this.f36480, true);
    }

    @Override // l.InterfaceC17585
    public final void onCloseMenu(C3060 c3060, boolean z) {
        DialogInterfaceC19598 dialogInterfaceC19598;
        if ((z || c3060 == this.f36480) && (dialogInterfaceC19598 = this.f36479) != null) {
            dialogInterfaceC19598.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f36480.performItemAction((C5882) ((C15053) this.f36478.m48503()).getItem(i), 0);
    }
}
