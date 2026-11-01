package p067l;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.umeng.analytics.pro.C0659aq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ۫ */
/* JADX INFO: compiled from: SB10 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1142 {

    /* JADX INFO: renamed from: ֫ */
    public static final C1072 f21400 = new C1072(0);

    /* JADX INFO: renamed from: ֫ */
    public static C1734 m18806(Context context, C1422 c1422) {
        Cursor cursorMo11943;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String strM30633 = c1422.m30633();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM30633, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(C21466.m48631("No package found for authority: ", strM30633));
        }
        if (!providerInfoResolveContentProvider.packageName.equals(c1422.m30635())) {
            StringBuilder sbM11879 = C5410.m11879("Found content provider ", strM30633, ", but package was not ");
            sbM11879.append(c1422.m30635());
            throw new PackageManager.NameNotFoundException(sbM11879.toString());
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C1072 c1072 = f21400;
        Collections.sort(arrayList, c1072);
        List listM30631 = c1422.m30631() != null ? c1422.m30631() : C0954.m9538(resources, 0);
        int i = 0;
        loop1: while (true) {
            cursorMo11943 = null;
            if (i >= listM30631.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listM30631.get(i));
            Collections.sort(arrayList2, c1072);
            if (arrayList.size() == arrayList2.size()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break loop1;
                    }
                    if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new C1734(1, null);
        }
        String str = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        InterfaceC1002 c1492 = Build.VERSION.SDK_INT < 24 ? new C1492(context, uriBuild) : new C1352(context, uriBuild);
        try {
            cursorMo11943 = c1492.mo11943(uriBuild, new String[]{C0659aq.f2425d, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{c1422.m30634()});
            if (cursorMo11943 != null && cursorMo11943.getCount() > 0) {
                int columnIndex = cursorMo11943.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorMo11943.getColumnIndex(C0659aq.f2425d);
                int columnIndex3 = cursorMo11943.getColumnIndex("file_id");
                int columnIndex4 = cursorMo11943.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorMo11943.getColumnIndex("font_weight");
                int columnIndex6 = cursorMo11943.getColumnIndex("font_italic");
                while (cursorMo11943.moveToNext()) {
                    arrayList3.add(new C1699(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorMo11943.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorMo11943.getLong(columnIndex3)), columnIndex4 != -1 ? cursorMo11943.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorMo11943.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorMo11943.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorMo11943.getInt(columnIndex) : 0));
                }
            }
            return new C1734(0, (C1699[]) arrayList3.toArray(new C1699[0]));
        } finally {
            if (cursorMo11943 != null) {
                cursorMo11943.close();
            }
            c1492.close();
        }
    }
}
