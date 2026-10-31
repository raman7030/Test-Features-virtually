package l;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: renamed from: l.ۗ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 33S4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3081 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1909 f9655;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3081(InputConnection inputConnection, C1909 c1909) {
        super(inputConnection, false);
        this.f9655 = c1909;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
        boolean z;
        ResultReceiver resultReceiver;
        C1909 c1909 = this.f9655;
        boolean zM6266 = false;
        zM6266 = false;
        zM6266 = false;
        zM6266 = false;
        if (bundle != null) {
            if (!TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z = TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str);
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                try {
                    Uri uri = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                    Uri uri2 = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                    int i = bundle.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                    Bundle bundle2 = (Bundle) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                    if (uri != null && clipDescription != null) {
                        zM6266 = c1909.m6266(new C11548(uri, clipDescription, uri2), i, bundle2);
                    }
                    if (resultReceiver != null) {
                        resultReceiver.send(zM6266 ? 1 : 0, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = null;
            }
        }
        if (zM6266) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
