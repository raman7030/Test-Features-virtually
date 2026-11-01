package p067l;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: l.ۙ۟ */
/* JADX INFO: compiled from: 33S4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1065 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4183 f17125;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1065(InputConnection inputConnection, C4183 c4183) {
        super(inputConnection, false);
        this.f17125 = c4183;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (this.f17125.m8468(C1415.m30472(inputContentInfo), i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
