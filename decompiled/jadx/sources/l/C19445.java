package l;

import android.graphics.Typeface;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Features;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.AnalyticsConstants;

/* JADX INFO: renamed from: l.᩵ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77HY */
/* JADX INFO: loaded from: classes4.dex */
public final class C19445 {
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44784(C12598 c12598) throws ErrnoException {
        String strM27180;
        String strM56;
        String strM57;
        String str;
        AbstractC15440 abstractC15440M30863 = c12598.m30863();
        String str2 = "unknown";
        if (abstractC15440M30863 instanceof C12993) {
            if (C9255.m23770()) {
                try {
                    C17642 c17642M46724 = C20402.m46724(abstractC15440M30863.mo23554());
                    strM27180 = C10881.m27180(c17642M46724.m41289());
                    try {
                        strM56 = Features.m56(c17642M46724.m41283());
                        try {
                            strM57 = Features.m56(c17642M46724.m41281());
                            str2 = strM57;
                        } catch (ErrnoException | Exception unused) {
                        }
                    } catch (ErrnoException | Exception unused2) {
                        strM56 = "unknown";
                    }
                } catch (ErrnoException | Exception unused3) {
                    strM27180 = "unknown";
                    strM56 = strM27180;
                }
                str = str2;
                str2 = strM27180;
            } else {
                str = "unknown";
                strM56 = str;
            }
        } else if (abstractC15440M30863 instanceof C11893) {
            StructStat structStatLstat = Os.lstat(((C11893) abstractC15440M30863).m29018());
            strM27180 = C10881.m27180(structStatLstat.st_mode);
            strM56 = Features.m56(structStatLstat.st_uid);
            strM57 = Features.m56(structStatLstat.st_gid);
            str2 = strM57;
            str = str2;
            str2 = strM27180;
        } else {
            str = "unknown";
            strM56 = str;
        }
        StringBuilder sb = new StringBuilder("AndroidDataFileUnreadableException///");
        sb.append(abstractC15440M30863.mo23554());
        sb.append("///");
        sb.append(str2);
        sb.append("///");
        return C23202.m51498(sb, strM56, "///", str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44785(AbstractActivityC3346 abstractActivityC3346, String str) {
        String[] strArrSplit = str.split("///");
        if (strArrSplit.length == 5) {
            m44786(abstractActivityC3346, strArrSplit[1], strArrSplit[2], strArrSplit[3], strArrSplit[4]);
        } else {
            abstractActivityC3346.m10221(str, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44786(AbstractActivityC3346 abstractActivityC3346, String str, String str2, String str3, String str4) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        int iIndexOf = str.indexOf(AnalyticsConstants.SDK_TYPE);
        if (iIndexOf != -1) {
            str = str.substring(iIndexOf);
        }
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView4 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView5 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        ViewOnClickListenerC14813.m35216(textView, C9523.m24404(str));
        ViewOnClickListenerC14813.m35216(textView2, C9523.m24406(str));
        ViewOnClickListenerC14813.m35216(textView3, str2);
        ViewOnClickListenerC14813.m35216(textView4, str3);
        ViewOnClickListenerC14813.m35216(textView5, str4);
        if ("unknown".equals(str2)) {
            textView3.setTypeface(Typeface.DEFAULT);
        }
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC20259(3, abstractActivityC3346));
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44438();
    }
}
