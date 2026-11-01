package p067l;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAPP */
/* JADX INFO: loaded from: classes4.dex */
public final class C22151 {
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m49961(ArrayList arrayList, String str, String str2, String str3, boolean z, Map map) {
        SimpleDateFormat simpleDateFormat;
        String strReplace;
        int i;
        boolean zIsEmpty = str2.isEmpty();
        C13929 c13929Matcher = (zIsEmpty || !z) ? null : C13259.m30304(str2).matcher((CharSequence) "");
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        try {
            String string = ApplicationC21448.f67649.getString("rdtp", "yyyy-MM-dd_HH-mm-ss");
            if (string.trim().isEmpty()) {
                string = "yyyy-MM-dd_HH-mm-ss";
            }
            simpleDateFormat = new SimpleDateFormat(string, Locale.ENGLISH);
        } catch (Exception unused) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.ENGLISH);
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        C13259 c13259M30304 = C13259.m30304("\\{([0-9]+)}");
        C13259 c13259M30305 = C13259.m30304("\\{z([0-9]+)}");
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) arrayList.get(i2);
            String name = interfaceC19370.getName();
            long time = interfaceC19370.getTime();
            int size2 = arrayList.size();
            int iLastIndexOf = name.lastIndexOf(46);
            int i3 = size;
            ArrayList arrayList3 = arrayList2;
            if (iLastIndexOf != -1) {
                strReplace = str.contains("{P}") ? str.replace("{P}", name.substring(0, iLastIndexOf)) : str;
                if (strReplace.contains("{S}")) {
                    strReplace = strReplace.replace("{S}", name.substring(iLastIndexOf));
                }
            } else {
                strReplace = str.contains("{P}") ? str.replace("{P}", name) : str;
                if (strReplace.contains("{S}")) {
                    strReplace = strReplace.replace("{S}", "");
                }
            }
            if (strReplace.contains("{T}")) {
                strReplace = strReplace.replace("{T}", simpleDateFormat2.format(Long.valueOf(time)));
            }
            C24832 c24832 = (C24832) map.get(name);
            if (strReplace.contains("{E}")) {
                Long lValueOf = c24832 == null ? null : c24832.f79326;
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(time);
                }
                strReplace = strReplace.replace("{E}", simpleDateFormat2.format(lValueOf));
            }
            C6190 c6190 = c24832 == null ? null : c24832.f79325;
            if (strReplace.contains("{AN}")) {
                strReplace = strReplace.replace("{AN}", c6190 == null ? "NULL" : c6190.m14015());
            }
            if (strReplace.contains("{AP}")) {
                strReplace = strReplace.replace("{AP}", c6190 == null ? "NULL" : c6190.m14014());
            }
            if (strReplace.contains("{AV}")) {
                strReplace = strReplace.replace("{AV}", c6190 == null ? "NULL" : c6190.m14012());
            }
            if (strReplace.contains("{AC}")) {
                strReplace = strReplace.replace("{AC}", c6190 != null ? String.valueOf(c6190.m14018()) : "NULL");
            }
            C13929 c13929Matcher2 = c13259M30304.matcher((CharSequence) "");
            while (true) {
                c13929Matcher2.m56473reset((CharSequence) strReplace);
                i = 1;
                if (!c13929Matcher2.find()) {
                    break;
                }
                String strGroup = c13929Matcher2.group(1);
                C12826.requireNonNull(strGroup);
                strReplace = strReplace.substring(0, c13929Matcher2.start()) + (Integer.parseInt(strGroup) + i2) + strReplace.substring(c13929Matcher2.end());
            }
            C13929 c13929Matcher3 = c13259M30305.matcher((CharSequence) "");
            String strReplace2 = strReplace;
            while (true) {
                c13929Matcher3.m56473reset((CharSequence) strReplace2);
                if (!c13929Matcher3.find()) {
                    break;
                }
                String strGroup2 = c13929Matcher3.group(i);
                C12826.requireNonNull(strGroup2);
                int i4 = Integer.parseInt(strGroup2);
                int length = String.valueOf((i4 + size2) - i).length();
                StringBuilder sb = new StringBuilder();
                SimpleDateFormat simpleDateFormat3 = simpleDateFormat2;
                sb.append(strReplace2.substring(0, c13929Matcher3.start()));
                String strValueOf = String.valueOf(i4 + i2);
                int length2 = length - strValueOf.length();
                if (length2 > 0) {
                    StringBuilder sb2 = new StringBuilder(length);
                    while (length2 > 0) {
                        sb2.append('0');
                        length2--;
                    }
                    sb2.append(strValueOf);
                    strValueOf = sb2.toString();
                }
                sb.append(strValueOf);
                sb.append(strReplace2.substring(c13929Matcher3.end()));
                strReplace2 = sb.toString();
                i = 1;
                simpleDateFormat2 = simpleDateFormat3;
            }
            SimpleDateFormat simpleDateFormat4 = simpleDateFormat2;
            if (!zIsEmpty) {
                if (c13929Matcher != null) {
                    String strM11398 = C5275.m11398(strReplace2, str3, c13929Matcher, true, false, null, new ArrayList(1));
                    if (strM11398 != null) {
                        strReplace2 = strM11398;
                    }
                } else {
                    strReplace2 = strReplace2.replace(str2, str3);
                }
            }
            arrayList3.add(new C8739(name, strReplace2));
            i2++;
            size = i3;
            arrayList2 = arrayList3;
            simpleDateFormat2 = simpleDateFormat4;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m49960(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((C8739) it.next()).f23687.toLowerCase());
        }
        while (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                C8739 c8739 = (C8739) it2.next();
                String lowerCase = c8739.f23687.toLowerCase();
                String lowerCase2 = c8739.f23686.toLowerCase();
                if (!hashSet.contains(lowerCase2) || lowerCase.equals(lowerCase2)) {
                    hashSet.remove(lowerCase);
                    hashSet.remove(lowerCase2);
                    arrayList3.add(c8739);
                    it2.remove();
                    z = true;
                }
            }
            if (!z) {
                arrayList3.addAll(arrayList2);
                break;
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49963(AbstractActivityC5549 abstractActivityC5549, ArrayList arrayList) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM12252.findViewById(R.id.MT_Protector);
        C7040.m16181(listView);
        listView.setAdapter((ListAdapter) new C4338(R.layout.MT_Protector, abstractActivityC5549, arrayList));
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49962(C2703 c2703, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8739 c8739 = (C8739) it.next();
            c8739.f23688 = c2703.m4196(c8739.f23687, c8739.f23686);
        }
    }
}
