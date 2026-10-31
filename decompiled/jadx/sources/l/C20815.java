package l;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAPP */
/* JADX INFO: loaded from: classes4.dex */
public final class C20815 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m47633(ArrayList arrayList, String str, String str2, String str3, boolean z, Map map) {
        SimpleDateFormat simpleDateFormat;
        String strReplace;
        int i;
        boolean zIsEmpty = str2.isEmpty();
        C12164 c12164Matcher = (zIsEmpty || !z) ? null : C11459.m28260(str2).matcher((CharSequence) "");
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        try {
            String string = ApplicationC20075.f65008.getString("rdtp", "yyyy-MM-dd_HH-mm-ss");
            if (string.trim().isEmpty()) {
                string = "yyyy-MM-dd_HH-mm-ss";
            }
            simpleDateFormat = new SimpleDateFormat(string, Locale.ENGLISH);
        } catch (Exception unused) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.ENGLISH);
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        C11459 c11459M28260 = C11459.m28260("\\{([0-9]+)}");
        C11459 c11459M28261 = C11459.m28260("\\{z([0-9]+)}");
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) arrayList.get(i2);
            String name = interfaceC17889.getName();
            long time = interfaceC17889.getTime();
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
            C23636 c23636 = (C23636) map.get(name);
            if (strReplace.contains("{E}")) {
                Long lValueOf = c23636 == null ? null : c23636.f76582;
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(time);
                }
                strReplace = strReplace.replace("{E}", simpleDateFormat2.format(lValueOf));
            }
            C4021 c4021 = c23636 == null ? null : c23636.f76581;
            if (strReplace.contains("{AN}")) {
                strReplace = strReplace.replace("{AN}", c4021 == null ? "NULL" : c4021.m12095());
            }
            if (strReplace.contains("{AP}")) {
                strReplace = strReplace.replace("{AP}", c4021 == null ? "NULL" : c4021.m12094());
            }
            if (strReplace.contains("{AV}")) {
                strReplace = strReplace.replace("{AV}", c4021 == null ? "NULL" : c4021.m12092());
            }
            if (strReplace.contains("{AC}")) {
                strReplace = strReplace.replace("{AC}", c4021 != null ? String.valueOf(c4021.m12098()) : "NULL");
            }
            C12164 c12164Matcher2 = c11459M28260.matcher((CharSequence) "");
            while (true) {
                c12164Matcher2.m29615reset((CharSequence) strReplace);
                i = 1;
                if (!c12164Matcher2.find()) {
                    break;
                }
                String strGroup = c12164Matcher2.group(1);
                C11003.requireNonNull(strGroup);
                strReplace = strReplace.substring(0, c12164Matcher2.start()) + (Integer.parseInt(strGroup) + i2) + strReplace.substring(c12164Matcher2.end());
            }
            C12164 c12164Matcher3 = c11459M28261.matcher((CharSequence) "");
            String strReplace2 = strReplace;
            while (true) {
                c12164Matcher3.m29615reset((CharSequence) strReplace2);
                if (!c12164Matcher3.find()) {
                    break;
                }
                String strGroup2 = c12164Matcher3.group(i);
                C11003.requireNonNull(strGroup2);
                int i4 = Integer.parseInt(strGroup2);
                int length = String.valueOf((i4 + size2) - i).length();
                StringBuilder sb = new StringBuilder();
                SimpleDateFormat simpleDateFormat3 = simpleDateFormat2;
                sb.append(strReplace2.substring(0, c12164Matcher3.start()));
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
                sb.append(strReplace2.substring(c12164Matcher3.end()));
                strReplace2 = sb.toString();
                i = 1;
                simpleDateFormat2 = simpleDateFormat3;
            }
            SimpleDateFormat simpleDateFormat4 = simpleDateFormat2;
            if (!zIsEmpty) {
                if (c12164Matcher != null) {
                    String strM9356 = C3058.m9356(strReplace2, str3, c12164Matcher, true, false, null, new ArrayList(1));
                    if (strM9356 != null) {
                        strReplace2 = strM9356;
                    }
                } else {
                    strReplace2 = strReplace2.replace(str2, str3);
                }
            }
            arrayList3.add(new C6703(name, strReplace2));
            i2++;
            size = i3;
            arrayList2 = arrayList3;
            simpleDateFormat2 = simpleDateFormat4;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m47632(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((C6703) it.next()).f20812.toLowerCase());
        }
        while (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                C6703 c6703 = (C6703) it2.next();
                String lowerCase = c6703.f20812.toLowerCase();
                String lowerCase2 = c6703.f20811.toLowerCase();
                if (!hashSet.contains(lowerCase2) || lowerCase.equals(lowerCase2)) {
                    hashSet.remove(lowerCase);
                    hashSet.remove(lowerCase2);
                    arrayList3.add(c6703);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47635(AbstractActivityC3346 abstractActivityC3346, ArrayList arrayList) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM10216.findViewById(R.id.MT_Protector);
        C4915.m14284(listView);
        listView.setAdapter((ListAdapter) new C2072(R.layout.MT_Protector, abstractActivityC3346, arrayList));
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47634(C0352 c0352, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6703 c6703 = (C6703) it.next();
            c6703.f20813 = c0352.m1797(c6703.f20812, c6703.f20811);
        }
    }
}
