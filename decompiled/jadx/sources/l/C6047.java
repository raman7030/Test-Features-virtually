package l;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.umeng.analytics.pro.aq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: SB10 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6047 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C4636 f18544 = new C4636(0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17981 m16878(Context context, C11692 c11692) {
        Cursor cursorMo9895;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String strM28585 = c11692.m28585();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM28585, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(C20094.m46315("No package found for authority: ", strM28585));
        }
        if (!providerInfoResolveContentProvider.packageName.equals(c11692.m28587())) {
            StringBuilder sbM9834 = C3200.m9834("Found content provider ", strM28585, ", but package was not ");
            sbM9834.append(c11692.m28587());
            throw new PackageManager.NameNotFoundException(sbM9834.toString());
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C4636 c4636 = f18544;
        Collections.sort(arrayList, c4636);
        List listM28583 = c11692.m28583() != null ? c11692.m28583() : C2252.m7456(resources, 0);
        int i = 0;
        loop1: while (true) {
            cursorMo9895 = null;
            if (i >= listM28583.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listM28583.get(i));
            Collections.sort(arrayList2, c4636);
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
            return new C17981(1, null);
        }
        String str = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        InterfaceC3225 c13102 = Build.VERSION.SDK_INT < 24 ? new C13102(context, uriBuild) : new C10281(context, uriBuild);
        try {
            cursorMo9895 = c13102.mo9895(uriBuild, new String[]{aq.d, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{c11692.m28586()});
            if (cursorMo9895 != null && cursorMo9895.getCount() > 0) {
                int columnIndex = cursorMo9895.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorMo9895.getColumnIndex(aq.d);
                int columnIndex3 = cursorMo9895.getColumnIndex("file_id");
                int columnIndex4 = cursorMo9895.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorMo9895.getColumnIndex("font_weight");
                int columnIndex6 = cursorMo9895.getColumnIndex("font_italic");
                while (cursorMo9895.moveToNext()) {
                    arrayList3.add(new C17275(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorMo9895.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorMo9895.getLong(columnIndex3)), columnIndex4 != -1 ? cursorMo9895.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorMo9895.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorMo9895.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorMo9895.getInt(columnIndex) : 0));
                }
            }
            return new C17981(0, (C17275[]) arrayList3.toArray(new C17275[0]));
        } finally {
            if (cursorMo9895 != null) {
                cursorMo9895.close();
            }
            c13102.close();
        }
    }
}
