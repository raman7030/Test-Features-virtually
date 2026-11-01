package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C10416 implements InterfaceC4321 {

    /* JADX INFO: renamed from: ֫ */
    public final C20953 f28806;

    @Override // p067l.InterfaceC4321
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ String mo8865() {
        return null;
    }

    @Override // p067l.InterfaceC4321
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo8868() {
        return false;
    }

    @Override // p067l.InterfaceC4321
    /* JADX INFO: renamed from: ֫ */
    public final void mo8866(final Main main) {
        C20953 c20953 = this.f28806;
        final String strM47268 = c20953.m47268("ad_title", null);
        String strM47269 = c20953.m47268("ad_msg", null);
        String strM472610 = c20953.m47268("ad_button", null);
        String strM472611 = c20953.m47268("ad_copy_text", null);
        String strM472612 = c20953.m47268("ad_open_url", null);
        C20671 c20671BuildDialog = main.buildDialog();
        c20671BuildDialog.m46730(strM47268);
        c20671BuildDialog.m46718(strM47269);
        c20671BuildDialog.m46735(strM472610, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46731("不再显示", (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46722(false);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        C7204.m16545(dialogInterfaceC2564M46732);
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new ViewOnClickListenerC3039(strM472612, main, strM472611));
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ۚ᩹ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20671 c20671BuildDialog2 = main.buildDialog();
                c20671BuildDialog2.m46727(R.string.MT_Protector);
                c20671BuildDialog2.m46718("是否从工具中隐藏「" + strM47268 + "」？");
                final C10416 c10416 = this.f20276;
                final DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M46732;
                c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨᩹ܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ApplicationC21448.f67649.edit().putString("show_ad_in_tools", c10416.f28806.m47268("ad_hide_obj", "")).apply();
                        dialogInterfaceC2564.dismiss();
                        C18402.m41905();
                    }
                });
                c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog2.m46732();
            }
        });
        dialogInterfaceC2564M46732.m3861().setTextColor(C23223.f72984);
        dialogInterfaceC2564M46732.m3861().setAlpha(0.7f);
        Window windowM3858 = dialogInterfaceC2564M46732.m3858();
        if (windowM3858 != null) {
            View viewFindViewById = windowM3858.findViewById(android.R.id.message);
            if (viewFindViewById instanceof TextView) {
                TextView textView = (TextView) viewFindViewById;
                textView.setTextIsSelectable(true);
                textView.setLineSpacing(0.0f, 1.2f);
            }
        }
    }

    public C10416(C20953 c20953) {
        this.f28806 = c20953;
    }

    @Override // p067l.InterfaceC4321
    public final String getName() {
        return this.f28806.m47268("ad_title", "");
    }

    @Override // p067l.InterfaceC4321
    /* JADX INFO: renamed from: ۧ */
    public final C13596 mo8867() {
        return C21265.f66861.f66884;
    }
}
