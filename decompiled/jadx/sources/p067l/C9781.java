package p067l;

import android.app.Application;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import bin.p000mt.plus.R;
import com.tencent.p062mm.opensdk.openapi.IWXAPI;
import com.tencent.p062mm.opensdk.openapi.WXAPIFactory;

/* JADX INFO: renamed from: l.۟᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9781 extends AbstractC17354 {

    /* JADX INFO: renamed from: ۧ */
    public int f27014;

    public C9781(C14677 c14677) {
        super(6);
        this.f27014 = c14677.readInt();
    }

    @Override // p067l.AbstractC17354
    /* JADX INFO: renamed from: ֫ */
    public final void mo7829(AbstractActivityC5549 abstractActivityC5549) {
        if (!C24414.m53856()) {
            C22682.m50793(R.string.MT_Protector);
            new ViewOnClickListenerC2424(abstractActivityC5549);
            return;
        }
        PopupWindow popupWindow = new PopupWindow(abstractActivityC5549);
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        ViewOnClickListenerC13805 viewOnClickListenerC13805 = new ViewOnClickListenerC13805(this, abstractActivityC5549, popupWindow, 0);
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(viewOnClickListenerC13805);
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(viewOnClickListenerC13805);
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        final Window window = abstractActivityC5549.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.7f;
        window.addFlags(2);
        window.setAttributes(attributes);
        popupWindow.setWidth(-1);
        popupWindow.setHeight(-2);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setContentView(viewM12252);
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

    /* JADX INFO: renamed from: ֫ */
    public static void m22806(C9781 c9781, AbstractActivityC5549 abstractActivityC5549, PopupWindow popupWindow, View view) {
        int id = view.getId();
        int i = c9781.f27014;
        C7350 c7350 = C9111.f24679;
        C13045.m29867(abstractActivityC5549, "activity");
        C23724.f75500 = null;
        if (id == R.id.MT_Protector) {
            popupWindow.dismiss();
            C7350 c7351 = C9111.f24679;
            c7351.mo4067((Object) null);
            c7351.m4065((InterfaceC24784) abstractActivityC5549);
            c7351.m4066(abstractActivityC5549, new C15815());
            C10027 c10027 = C10027.f27775;
            new C16486(abstractActivityC5549, i).m22250();
            return;
        }
        if (id != R.id.MT_Protector) {
            throw new RuntimeException();
        }
        Application applicationM16232 = C7050.m16232();
        C7350 c7352 = C23724.f75498;
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(applicationM16232, C23724.m52761(), true);
        if (!iwxapiCreateWXAPI.isWXAppInstalled() || iwxapiCreateWXAPI.getWXAppSupportAPI() < 570425345) {
            C22682.m50795((CharSequence) "请安装最新版本的微信客户端");
            return;
        }
        popupWindow.dismiss();
        C7350 c7353 = C9111.f24679;
        c7353.mo4067((Object) null);
        c7353.m4065((InterfaceC24784) abstractActivityC5549);
        c7353.m4066(abstractActivityC5549, new C15815());
        C10027 c10028 = C10027.f27775;
        iwxapiCreateWXAPI.registerApp(C23724.m52761());
        new C25204(abstractActivityC5549, i, iwxapiCreateWXAPI).m22250();
    }
}
