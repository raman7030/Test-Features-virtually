package p067l;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51Z1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3413 extends AbstractC3947 {

    /* JADX INFO: renamed from: ۗ */
    public static long f6770;

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(final C4697 c4697) {
        c4697.m9955("local");
        final ArrayList arrayList = new ArrayList();
        Iterator it = c4697.m9957().iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC19370) it.next()).getPath());
        }
        final C11245 c11245M41242 = c4697.m9969().m41242();
        if (arrayList.size() <= 5) {
            C10987.m25364(arrayList, c11245M41242.m26091());
            m6044(c4697.m9965());
            return;
        }
        C20671 c20671BuildDialog = c4697.m9965().buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(C7050.m16203(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚۨܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C10987.m25364(arrayList, c11245M41242.m26091());
                C3413.m6044(c4697.m9965());
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.᩻ܶܳ] */
    /* JADX INFO: renamed from: ֫ */
    public static void m6044(Main main) {
        if (C22287.m50107() && System.currentTimeMillis() - f6770 > 60000) {
            View viewM12252 = main.m12252(R.layout.MT_Protector);
            PopupWindow popupWindow = new PopupWindow(viewM12252, -1, -1, true);
            popupWindow.setBackgroundDrawable(new ColorDrawable(-2013265920));
            popupWindow.showAtLocation(main.findViewById(R.id.MT_Protector), 0, 0, 0);
            final View viewFindViewById = viewM12252.findViewById(R.id.MT_Protector);
            final int iM29939 = C13076.m29939(200.0f);
            final C13151 c13151 = new C13151();
            c13151.mo30118(0.0f, 1.0f);
            c13151.m30117((C24968) new InterfaceC23209() { // from class: l.᩻ܶܳ
                @Override // p067l.InterfaceC23209
                /* JADX INFO: renamed from: ֫ */
                public final Object mo20014(float f, Float f2, Float f3) {
                    float f4 = f * 1.4f;
                    View view = viewFindViewById;
                    if (f4 <= 0.2f) {
                        view.setAlpha(f4 * 5.0f);
                        view.setTranslationY(0.0f);
                    } else {
                        int i = iM29939;
                        if (f4 <= 1.2f) {
                            view.setAlpha(1.0f);
                            view.setTranslationY((-i) * (f4 - 0.2f));
                        } else {
                            view.setAlpha(1.0f - ((f4 - 1.2f) * 5.0f));
                            view.setTranslationY(-i);
                        }
                    }
                    return 0;
                }
            });
            c13151.mo30121(1200L);
            c13151.m30125();
            c13151.m30122();
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.ۜܶܳ
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    c13151.m30113();
                }
            });
            viewM12252.findViewById(R.id.textView3).setOnClickListener(new ViewOnClickListenerC17163(3, popupWindow));
            f6770 = System.currentTimeMillis();
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }
}
