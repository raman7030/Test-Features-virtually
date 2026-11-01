package p067l;

import android.graphics.Typeface;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.Features;
import bin.p000mt.plus.R;
import com.umeng.commonsdk.statistics.AnalyticsConstants;

/* JADX INFO: renamed from: l.᩵ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77HY */
/* JADX INFO: loaded from: classes4.dex */
public final class C20849 {
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX INFO: renamed from: ֫ */
    public static String m47079(C14342 c14342) throws ErrnoException {
        String strM29225;
        String strM54;
        String strM55;
        String str;
        AbstractC17043 abstractC17043M32940 = c14342.m32940();
        String str2 = "unknown";
        if (abstractC17043M32940 instanceof C14717) {
            if (C11164.m25771()) {
                try {
                    C19136 c19136M49047 = C21759.m49047(abstractC17043M32940.mo25505());
                    strM29225 = C12710.m29225(c19136M49047.m43535());
                    try {
                        strM54 = Features.m54(c19136M49047.m43529());
                        try {
                            strM55 = Features.m54(c19136M49047.m43527());
                            str2 = strM55;
                        } catch (ErrnoException | Exception unused) {
                        }
                    } catch (ErrnoException | Exception unused2) {
                        strM54 = "unknown";
                    }
                } catch (ErrnoException | Exception unused3) {
                    strM29225 = "unknown";
                    strM54 = strM29225;
                }
                str = str2;
                str2 = strM29225;
            } else {
                str = "unknown";
                strM54 = str;
            }
        } else if (abstractC17043M32940 instanceof C13672) {
            StructStat structStatLstat = Os.lstat(((C13672) abstractC17043M32940).m31070());
            strM29225 = C12710.m29225(structStatLstat.st_mode);
            strM54 = Features.m54(structStatLstat.st_uid);
            strM55 = Features.m54(structStatLstat.st_gid);
            str2 = strM55;
            str = str2;
            str2 = strM29225;
        } else {
            str = "unknown";
            strM54 = str;
        }
        StringBuilder sb = new StringBuilder("AndroidDataFileUnreadableException///");
        sb.append(abstractC17043M32940.mo25505());
        sb.append("///");
        sb.append(str2);
        sb.append("///");
        return C24420.m53894(sb, strM54, "///", str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47080(AbstractActivityC5549 abstractActivityC5549, String str) {
        String[] strArrSplit = str.split("///");
        if (strArrSplit.length == 5) {
            m47081(abstractActivityC5549, strArrSplit[1], strArrSplit[2], strArrSplit[3], strArrSplit[4]);
        } else {
            abstractActivityC5549.m12257(str, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47081(AbstractActivityC5549 abstractActivityC5549, String str, String str2, String str3, String str4) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        int iIndexOf = str.indexOf(AnalyticsConstants.SDK_TYPE);
        if (iIndexOf != -1) {
            str = str.substring(iIndexOf);
        }
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView4 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView5 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC16447.m37364(textView, C11419.m26414(str));
        ViewOnClickListenerC16447.m37364(textView2, C11419.m26416(str));
        ViewOnClickListenerC16447.m37364(textView3, str2);
        ViewOnClickListenerC16447.m37364(textView4, str3);
        ViewOnClickListenerC16447.m37364(textView5, str4);
        if ("unknown".equals(str2)) {
            textView3.setTypeface(Typeface.DEFAULT);
        }
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC21623(3, abstractActivityC5549));
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46732();
    }
}
