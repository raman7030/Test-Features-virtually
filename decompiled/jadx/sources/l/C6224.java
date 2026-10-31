package l;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6KO */
/* JADX INFO: loaded from: classes2.dex */
public final class C6224 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17145(final C16560 c16560, final InterfaceC17889 interfaceC17889) {
        C18904 c18904M43631;
        String strM43636;
        C9732 c9732;
        final AbstractC16891 abstractC16891M39044 = c16560.m39044();
        final boolean zEquals = "multipart/related".equals(C1285.m4347(interfaceC17889.getName()));
        try {
            c18904M43631 = C18904.m43631(c16560, interfaceC17889);
        } catch (IllegalArgumentException unused) {
            c18904M43631 = null;
        }
        C19258 c19258BuildDialog = c16560.m39056().buildDialog();
        Context contextM44432 = c19258BuildDialog.m44432();
        LinearLayout linearLayout = new LinearLayout(contextM44432);
        linearLayout.setOrientation(1);
        int iM17143 = m17143(contextM44432, 24);
        linearLayout.setPadding(iM17143, m17143(contextM44432, 12), iM17143, 0);
        final C1264 c1264 = new C1264(C4925.f15527);
        if (c18904M43631 == null) {
            strM43636 = null;
        } else {
            strM43636 = zEquals ? c18904M43631.m43636() : c1264.m4323(c18904M43631);
        }
        final boolean[] zArr = {false};
        if (zEquals || c18904M43631 == null) {
            c9732 = null;
        } else {
            m17144(linearLayout, contextM44432.getString(R.string.MT_Protector), 14, false, 0);
            C14615 c14615 = new C14615(contextM44432);
            c14615.setTextSize(14.0f);
            c14615.setTextColor(C21943.f70284);
            c14615.setText("/" + c18904M43631.m43637(strM43636));
            C9732 c9733 = new C9732(contextM44432, c18904M43631, strM43636, new C3402(zArr, c14615, c18904M43631));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = m17143(contextM44432, 10);
            linearLayout.addView(c9733, layoutParams);
            m17144(linearLayout, contextM44432.getString(R.string.MT_Protector), 12, true, 14);
            linearLayout.addView(c14615);
            c19258BuildDialog.m44435(linearLayout);
            c9732 = c9733;
        }
        c19258BuildDialog.m44433(R.string.MT_Protector);
        final C9732 c9734 = c9732;
        final C18904 c18904 = c18904M43631;
        c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬ᩳܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C16560 c16561 = c16560;
                if (c16561.m39044() == abstractC16891M39044) {
                    C9732 c9735 = c9734;
                    if (c9735 != null) {
                        c1264.m4324(c18904, c9735.m24723(), zArr[0]);
                    }
                    C19568.m45007(c16561, interfaceC17889, ActivityC16315.class);
                }
            }
        });
        final C18904 c18905 = c18904M43631;
        final C9732 c9735 = c9732;
        final String str = strM43636;
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۫ᩳܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C16560 c16561 = c16560;
                if (c16561.m39044() != abstractC16891M39044) {
                    return;
                }
                C18904 c18906 = c18905;
                if (c18906 == null) {
                    C21374.m48457(R.string.MT_Protector);
                    return;
                }
                C9732 c9736 = c9735;
                String strM24723 = c9736 == null ? str : c9736.m24723();
                ActivityC0921.m3294(c16561, interfaceC17889, c18906, strM24723, new RunnableC10458(zEquals, c1264, c18906, strM24723, zArr));
            }
        });
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17144(LinearLayout linearLayout, String str, int i, boolean z, int i2) {
        Context context = linearLayout.getContext();
        C14615 c14615 = new C14615(context);
        c14615.setText(str);
        c14615.setTextSize(i);
        c14615.setTextColor(z ? C21943.f70269 : C21943.f70284);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = m17143(context, i2);
        linearLayout.addView(c14615, layoutParams);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m17143(Context context, int i) {
        return Math.round(i * context.getResources().getDisplayMetrics().density);
    }
}
