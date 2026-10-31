package l;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: l.ۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 33S4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4492 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1909 f14298;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4492(InputConnection inputConnection, C1909 c1909) {
        super(inputConnection, false);
        this.f14298 = c1909;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (this.f14298.m6266(C11548.m28426(inputContentInfo), i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
