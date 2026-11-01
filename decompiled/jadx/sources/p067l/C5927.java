package p067l;

import android.content.DialogInterface;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes2.dex */
public final class C5927 extends WebChromeClient {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC3244 f14633;

    public C5927(ActivityC3244 activityC3244) {
        this.f14633 = activityC3244;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        String url = webView.getUrl();
        ActivityC3244 activityC3244 = this.f14633;
        if (activityC3244.m5641(url)) {
            activityC3244.setTitle(activityC3244.f6316.f18945);
        } else {
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            activityC3244.setTitle(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.f14633.m5595(i, i < 100);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        ActivityC3244 activityC3244 = this.f14633;
        String strM5630 = ActivityC3244.m5630(activityC3244, str);
        if (strM5630 == null || activityC3244.isFinishing() || activityC3244.isDestroyed()) {
            jsResult.cancel();
            return true;
        }
        C20671 c20671BuildDialog = activityC3244.buildDialog();
        c20671BuildDialog.m46730(strM5630);
        c20671BuildDialog.m46718(str2);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23243(1, jsResult));
        c20671BuildDialog.m46713(new DialogInterface.OnCancelListener() { // from class: l.᩻ۚ᩷
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C20680 c20680 = ActivityC3244.f6292;
                jsResult.cancel();
            }
        });
        c20671BuildDialog.m46732();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        ActivityC3244 activityC3244 = this.f14633;
        String strM5630 = ActivityC3244.m5630(activityC3244, str);
        if (strM5630 == null || activityC3244.isFinishing() || activityC3244.isDestroyed()) {
            jsResult.cancel();
            return true;
        }
        C20671 c20671BuildDialog = activityC3244.buildDialog();
        c20671BuildDialog.m46730(strM5630);
        c20671BuildDialog.m46718(str2);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽۚ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C20680 c20680 = ActivityC3244.f6292;
                jsResult.confirm();
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳۚ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C20680 c20680 = ActivityC3244.f6292;
                jsResult.cancel();
            }
        });
        c20671BuildDialog.m46713(new DialogInterface.OnCancelListener() { // from class: l.ܿۚ᩷
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C20680 c20680 = ActivityC3244.f6292;
                jsResult.cancel();
            }
        });
        c20671BuildDialog.m46732();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        ActivityC3244 activityC3244 = this.f14633;
        String strM5630 = ActivityC3244.m5630(activityC3244, str);
        if (strM5630 == null || activityC3244.isFinishing() || activityC3244.isDestroyed()) {
            jsPromptResult.cancel();
            return true;
        }
        final EditText editText = new EditText(activityC3244);
        editText.setSingleLine(true);
        if (str3 == null) {
            str3 = "";
        }
        editText.setText(str3);
        editText.selectAll();
        C20671 c20671BuildDialog = activityC3244.buildDialog();
        c20671BuildDialog.m46730(strM5630);
        c20671BuildDialog.m46718(str2);
        c20671BuildDialog.m46715(editText);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۟֡᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C20680 c20680 = ActivityC3244.f6292;
                jsPromptResult.confirm(editText.getText().toString());
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫ۚ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C20680 c20680 = ActivityC3244.f6292;
                jsPromptResult.cancel();
            }
        });
        c20671BuildDialog.m46713(new DialogInterface.OnCancelListener() { // from class: l.ۧۚ᩷
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C20680 c20680 = ActivityC3244.f6292;
                jsPromptResult.cancel();
            }
        });
        c20671BuildDialog.m46732();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        valueCallback.onReceiveValue(null);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        permissionRequest.deny();
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        callback.invoke(str, false, false);
    }
}
