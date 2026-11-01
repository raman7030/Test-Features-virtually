package p067l;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: l.֨ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7F1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3332 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C16742 f6510;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3332(C16742 c16742, InputConnection inputConnection) {
        super(inputConnection, false);
        this.f6510 = c16742;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        InterfaceC10038 interfaceC10038 = this.f6510.f49361;
        if (interfaceC10038 == null || !C24790.m54445((C24790) ((C9387) interfaceC10038).f25643, i)) {
            return super.performEditorAction(i);
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InterfaceC10038 interfaceC10038 = this.f6510.f49361;
        if (interfaceC10038 != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66 && C24790.m54445((C24790) ((C9387) interfaceC10038).f25643, 0)) {
            return true;
        }
        return super.sendKeyEvent(keyEvent);
    }
}
