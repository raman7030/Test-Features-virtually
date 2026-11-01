package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6KO */
/* JADX INFO: loaded from: classes2.dex */
public final class C8284 {
    /* JADX INFO: renamed from: ֫ */
    public static void m19077(final C18107 c18107, final InterfaceC19370 interfaceC19370) {
        C20335 c20335M45897;
        String strM45902;
        C11618 c11618;
        final AbstractC18422 abstractC18422M41270 = c18107.m41270();
        final boolean zEquals = "multipart/related".equals(C3590.m6593(interfaceC19370.getName()));
        try {
            c20335M45897 = C20335.m45897(c18107, interfaceC19370);
        } catch (IllegalArgumentException unused) {
            c20335M45897 = null;
        }
        C20671 c20671BuildDialog = c18107.m41282().buildDialog();
        Context contextM46726 = c20671BuildDialog.m46726();
        LinearLayout linearLayout = new LinearLayout(contextM46726);
        linearLayout.setOrientation(1);
        int iM19075 = m19075(contextM46726, 24);
        linearLayout.setPadding(iM19075, m19075(contextM46726, 12), iM19075, 0);
        final C3570 c3570 = new C3570(C7050.f18359);
        if (c20335M45897 == null) {
            strM45902 = null;
        } else {
            strM45902 = zEquals ? c20335M45897.m45902() : c3570.m6567(c20335M45897);
        }
        final boolean[] zArr = {false};
        if (zEquals || c20335M45897 == null) {
            c11618 = null;
        } else {
            m19076(linearLayout, contextM46726.getString(R.string.MT_Protector), 14, false, 0);
            C1567 c1567 = new C1567(contextM46726);
            c1567.setTextSize(14.0f);
            c1567.setTextColor(C23223.f72995);
            c1567.setText("/" + c20335M45897.m45903(strM45902));
            C11618 c11619 = new C11618(contextM46726, c20335M45897, strM45902, new C5602(zArr, c1567, c20335M45897));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = m19075(contextM46726, 10);
            linearLayout.addView(c11619, layoutParams);
            m19076(linearLayout, contextM46726.getString(R.string.MT_Protector), 12, true, 14);
            linearLayout.addView(c1567);
            c20671BuildDialog.m46729(linearLayout);
            c11618 = c11619;
        }
        c20671BuildDialog.m46727(R.string.MT_Protector);
        final C11618 c116110 = c11618;
        final C20335 c20335 = c20335M45897;
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬ᩳܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C18107 c18108 = c18107;
                if (c18108.m41270() == abstractC18422M41270) {
                    C11618 c116111 = c116110;
                    if (c116111 != null) {
                        c3570.m6568(c20335, c116111.m26737(), zArr[0]);
                    }
                    C20966.m47302(c18108, interfaceC19370, ActivityC17874.class);
                }
            }
        });
        final C20335 c20336 = c20335M45897;
        final C11618 c116111 = c11618;
        final String str = strM45902;
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۫ᩳܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C18107 c18108 = c18107;
                if (c18108.m41270() != abstractC18422M41270) {
                    return;
                }
                C20335 c20337 = c20336;
                if (c20337 == null) {
                    C22682.m50793(R.string.MT_Protector);
                    return;
                }
                C11618 c116112 = c116111;
                String strM26737 = c116112 == null ? str : c116112.m26737();
                ActivityC3244.m5613(c18108, interfaceC19370, c20337, strM26737, new RunnableC12308(zEquals, c3570, c20337, strM26737, zArr));
            }
        });
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19076(LinearLayout linearLayout, String str, int i, boolean z, int i2) {
        Context context = linearLayout.getContext();
        C1567 c1567 = new C1567(context);
        c1567.setText(str);
        c1567.setTextSize(i);
        c1567.setTextColor(z ? C23223.f72980 : C23223.f72995);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = m19075(context, i2);
        linearLayout.addView(c1567, layoutParams);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m19075(Context context, int i) {
        return Math.round(i * context.getResources().getDisplayMetrics().density);
    }
}
