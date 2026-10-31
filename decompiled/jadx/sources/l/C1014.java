package l;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: l.֨ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7F1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1014 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15124 f3736;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1014(C15124 c15124, InputConnection inputConnection) {
        super(inputConnection, false);
        this.f3736 = c15124;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        InterfaceC8070 interfaceC8070 = this.f3736.f46241;
        if (interfaceC8070 == null || !C23592.m52042((C23592) ((C7385) interfaceC8070).f22731, i)) {
            return super.performEditorAction(i);
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InterfaceC8070 interfaceC8070 = this.f3736.f46241;
        if (interfaceC8070 != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66 && C23592.m52042((C23592) ((C7385) interfaceC8070).f22731, 0)) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }
}
