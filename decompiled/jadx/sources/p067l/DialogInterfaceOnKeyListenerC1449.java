package p067l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.alipay.sdk.p010m.p050t0.C0215b;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.۫ۜ */
/* JADX INFO: compiled from: S5PE */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnKeyListenerC1449 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC1714 {

    /* JADX INFO: renamed from: ᩶ */
    public C1904 f39495;

    /* JADX INFO: renamed from: ᩸ */
    public DialogInterfaceC1814 f39496;

    /* JADX INFO: renamed from: ᩹ */
    public C0994 f39497;

    @Override // p067l.InterfaceC1714
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4428(C0994 c0994) {
        return false;
    }

    public DialogInterfaceOnKeyListenerC1449(SubMenuC1819 subMenuC1819) {
        this.f39497 = subMenuC1819;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31800() {
        C0994 c0994 = this.f39497;
        C1779 c1779 = new C1779(c0994.getContext());
        C1904 c1904 = new C1904(c1779.getContext());
        this.f39495 = c1904;
        c1904.setCallback(this);
        c0994.addMenuPresenter(this.f39495);
        c1779.setAdapter(this.f39495.m50839(), this);
        View headerView = c0994.getHeaderView();
        if (headerView != null) {
            c1779.setCustomTitle(headerView);
        } else {
            c1779.setIcon(c0994.getHeaderIcon()).setTitle(c0994.getHeaderTitle());
        }
        c1779.setOnKeyListener(this);
        DialogInterfaceC1814 dialogInterfaceC1814Create = c1779.create();
        this.f39496 = dialogInterfaceC1814Create;
        dialogInterfaceC1814Create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f39496.getWindow().getAttributes();
        attributes.type = C0215b.f1001d;
        attributes.flags |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f39496.show();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        C0994 c0994 = this.f39497;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f39496.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f39496.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                c0994.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return c0994.performShortcut(i, keyEvent, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f39495.onCloseMenu(this.f39497, true);
    }

    @Override // p067l.InterfaceC1714
    public final void onCloseMenu(C0994 c0994, boolean z) {
        DialogInterfaceC1814 dialogInterfaceC1814;
        if ((z || c0994 == this.f39497) && (dialogInterfaceC1814 = this.f39496) != null) {
            dialogInterfaceC1814.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f39497.performItemAction((C1134) ((C1589) this.f39495.m50839()).getItem(i), 0);
    }
}
