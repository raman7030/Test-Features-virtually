package l;

import android.app.Application;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import bin.mt.plus.R;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/* JADX INFO: renamed from: l.۟᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7799 extends AbstractC15768 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f24097;

    public C7799(C12951 c12951) {
        super(6);
        this.f24097 = c12951.readInt();
    }

    @Override // l.AbstractC15768
    /* JADX INFO: renamed from: ֫ */
    public final void mo5599(AbstractActivityC3346 abstractActivityC3346) {
        if (!C23196.m51460()) {
            C21374.m48457(R.string.MT_Protector);
            new ViewOnClickListenerC0059(abstractActivityC3346);
            return;
        }
        PopupWindow popupWindow = new PopupWindow(abstractActivityC3346);
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        ViewOnClickListenerC12033 viewOnClickListenerC12033 = new ViewOnClickListenerC12033(this, abstractActivityC3346, popupWindow, 0);
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(viewOnClickListenerC12033);
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(viewOnClickListenerC12033);
        viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        final Window window = abstractActivityC3346.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.7f;
        window.addFlags(2);
        window.setAttributes(attributes);
        popupWindow.setWidth(-1);
        popupWindow.setHeight(-2);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setContentView(viewM10216);
        popupWindow.setAnimationStyle(R.style.MT_Protector);
        popupWindow.showAtLocation(window.getDecorView(), 81, 0, 0);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.᩺᩻ۡ
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                Window window2 = window;
                WindowManager.LayoutParams attributes2 = window2.getAttributes();
                attributes2.alpha = 1.0f;
                window2.clearFlags(2);
                window2.setAttributes(attributes2);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20825(C7799 c7799, AbstractActivityC3346 abstractActivityC3346, PopupWindow popupWindow, View view) {
        int id = view.getId();
        int i = c7799.f24097;
        C5242 c5242 = C7094.f21798;
        C11233.m27805(abstractActivityC3346, "activity");
        C22470.f72773 = null;
        if (id == R.id.MT_Protector) {
            popupWindow.dismiss();
            C5242 c5243 = C7094.f21798;
            c5243.mo1669((Object) null);
            c5243.m1667((InterfaceC23586) abstractActivityC3346);
            c5243.m1668(abstractActivityC3346, new C14148());
            C8058 c8058 = C8058.f24861;
            new C14854(abstractActivityC3346, i).m20274();
            return;
        }
        if (id != R.id.MT_Protector) {
            throw new RuntimeException();
        }
        Application applicationM14335 = C4925.m14335();
        C5242 c5244 = C22470.f72770;
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(applicationM14335, C22470.m50420(), true);
        if (!iwxapiCreateWXAPI.isWXAppInstalled() || iwxapiCreateWXAPI.getWXAppSupportAPI() < 570425345) {
            C21374.m48459((CharSequence) "请安装最新版本的微信客户端");
            return;
        }
        popupWindow.dismiss();
        C5242 c5245 = C7094.f21798;
        c5245.mo1669((Object) null);
        c5245.m1667((InterfaceC23586) abstractActivityC3346);
        c5245.m1668(abstractActivityC3346, new C14148());
        C8058 c8059 = C8058.f24861;
        iwxapiCreateWXAPI.registerApp(C22470.m50420());
        new C24027(abstractActivityC3346, i, iwxapiCreateWXAPI).m20274();
    }
}
