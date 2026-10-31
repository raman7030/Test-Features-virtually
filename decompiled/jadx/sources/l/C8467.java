package l;

import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C8467 implements InterfaceC2054 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19554 f25893;

    @Override // l.InterfaceC2054
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ String mo6739() {
        return null;
    }

    @Override // l.InterfaceC2054
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo6742() {
        return false;
    }

    @Override // l.InterfaceC2054
    /* JADX INFO: renamed from: ֫ */
    public final void mo6740(final Main main) {
        C19554 c19554 = this.f25893;
        final String strM44968 = c19554.m44968("ad_title", null);
        String strM44969 = c19554.m44968("ad_msg", null);
        String strM449610 = c19554.m44968("ad_button", null);
        String strM449611 = c19554.m44968("ad_copy_text", null);
        String strM449612 = c19554.m44968("ad_open_url", null);
        C19258 c19258BuildDialog = main.buildDialog();
        c19258BuildDialog.m44436(strM44968);
        c19258BuildDialog.m44424(strM44969);
        c19258BuildDialog.m44441(strM449610, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44437("不再显示", (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44428(false);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        C5088.m14637(dialogInterfaceC0206M44438);
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new ViewOnClickListenerC0705(strM449612, main, strM449611));
        dialogInterfaceC0206M44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ۚ᩹ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19258 c19258BuildDialog2 = main.buildDialog();
                c19258BuildDialog2.m44433(R.string.MT_Protector);
                c19258BuildDialog2.m44424("是否从工具中隐藏「" + strM44968 + "」？");
                final C8467 c8467 = this.f17430;
                final DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M44438;
                c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨᩹ܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ApplicationC20075.f65008.edit().putString("show_ad_in_tools", c8467.f25893.m44968("ad_hide_obj", "")).apply();
                        dialogInterfaceC0206.dismiss();
                        C16870.m39669();
                    }
                });
                c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19258BuildDialog2.m44438();
            }
        });
        dialogInterfaceC0206M44438.m1448().setTextColor(C21943.f70273);
        dialogInterfaceC0206M44438.m1448().setAlpha(0.7f);
        Window windowM1445 = dialogInterfaceC0206M44438.m1445();
        if (windowM1445 != null) {
            View viewFindViewById = windowM1445.findViewById(android.R.id.message);
            if (viewFindViewById instanceof TextView) {
                TextView textView = (TextView) viewFindViewById;
                textView.setTextIsSelectable(true);
                textView.setLineSpacing(0.0f, 1.2f);
            }
        }
    }

    public C8467(C19554 c19554) {
        this.f25893 = c19554;
    }

    @Override // l.InterfaceC2054
    public final String getName() {
        return this.f25893.m44968("ad_title", "");
    }

    @Override // l.InterfaceC2054
    /* JADX INFO: renamed from: ۧ */
    public final C11813 mo6741() {
        return C19883.f64225.f64248;
    }
}
