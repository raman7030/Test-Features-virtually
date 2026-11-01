package p067l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import com.umeng.analytics.pro.C0655am;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ܺ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8K2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17710 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f52890;

    /* JADX INFO: renamed from: ۖ */
    public final String f52891;

    /* JADX INFO: renamed from: ۜ */
    public final String f52892;

    /* JADX INFO: renamed from: ۡ */
    public final String[] f52893;

    /* JADX INFO: renamed from: ۢ */
    public final C7653 f52894;

    /* JADX INFO: renamed from: ۧ */
    public final long f52895;

    /* JADX INFO: renamed from: ܳ */
    public final HashMap f52896;

    /* JADX INFO: renamed from: ܺ */
    public final String f52897;

    /* JADX INFO: renamed from: ܽ */
    public final String f52898;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f52899;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f52900;

    /* JADX INFO: renamed from: ᩷ */
    public final long f52901;

    /* JADX INFO: renamed from: ᩻ */
    public final C17710 f52902;

    /* JADX INFO: renamed from: ֫ */
    public static C17710 m40247(String str) {
        return new C17710(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17710 m40248(String str, long j, long j2, C7653 c7653, String[] strArr, String str2, String str3, C17710 c17710) {
        return new C17710(str, null, j, j2, c7653, strArr, str2, str3, c17710);
    }

    public C17710(String str, String str2, long j, long j2, C7653 c7653, String[] strArr, String str3, String str4, C17710 c17710) {
        this.f52897 = str;
        this.f52891 = str2;
        this.f52898 = str4;
        this.f52894 = c7653;
        this.f52893 = strArr;
        this.f52900 = str2 != null;
        this.f52901 = j;
        this.f52895 = j2;
        str3.getClass();
        this.f52892 = str3;
        this.f52902 = c17710;
        this.f52896 = new HashMap();
        this.f52899 = new HashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m40257(long j) {
        long j2 = this.f52895;
        long j3 = this.f52901;
        if (j3 == -9223372036854775807L && j2 == -9223372036854775807L) {
            return true;
        }
        if (j3 <= j && j2 == -9223372036854775807L) {
            return true;
        }
        if (j3 != -9223372036854775807L || j >= j2) {
            return j3 <= j && j < j2;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40256(C17710 c17710) {
        if (this.f52890 == null) {
            this.f52890 = new ArrayList();
        }
        this.f52890.add(c17710);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17710 m40255(int i) {
        ArrayList arrayList = this.f52890;
        if (arrayList == null) {
            throw new IndexOutOfBoundsException();
        }
        return (C17710) arrayList.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40253() {
        ArrayList arrayList = this.f52890;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: ۧ */
    public final long[] m40258() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m40252(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40252(TreeSet treeSet, boolean z) {
        String str = this.f52897;
        boolean zEquals = C0655am.f2322ax.equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.f52898 != null)) {
            long j = this.f52901;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f52895;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f52890 == null) {
            return;
        }
        for (int i = 0; i < this.f52890.size(); i++) {
            ((C17710) this.f52890.get(i)).m40252(treeSet, z || zEquals);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m40254(long j, Map map, HashMap map2, HashMap map3) {
        ArrayList<Pair> arrayList = new ArrayList();
        m40249(j, this.f52892, arrayList);
        TreeMap treeMap = new TreeMap();
        m40251(j, false, this.f52892, treeMap);
        m40250(j, map, map2, this.f52892, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C21065 c21065 = (C21065) map2.get(pair.first);
                c21065.getClass();
                C23207 c23207 = new C23207();
                c23207.m51724(bitmapDecodeByteArray);
                c23207.m51728(c21065.f66153);
                c23207.m51730(0);
                c23207.m51722(c21065.f66154, 0);
                c23207.m51723(c21065.f66156);
                c23207.m51738(c21065.f66151);
                c23207.m51721(c21065.f66149);
                c23207.m51734(c21065.f66157);
                arrayList2.add(c23207.m51720());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C21065 c21066 = (C21065) map2.get(entry.getKey());
            c21066.getClass();
            C23207 c23208 = (C23207) entry.getValue();
            CharSequence charSequenceM51735 = c23208.m51735();
            charSequenceM51735.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceM51735;
            for (C11677 c11677 : (C11677[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C11677.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c11677), spannableStringBuilder.getSpanEnd(c11677), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c23208.m51722(c21066.f66154, c21066.f66155);
            c23208.m51723(c21066.f66156);
            c23208.m51728(c21066.f66153);
            c23208.m51738(c21066.f66151);
            c23208.m51729(c21066.f66158, c21066.f66150);
            c23208.m51734(c21066.f66157);
            arrayList2.add(c23208.m51720());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40249(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f52892;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m40257(j) && "div".equals(this.f52897) && (str2 = this.f52898) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < m40253(); i++) {
            m40255(i).m40249(j, str, arrayList);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40251(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.f52896;
        map.clear();
        HashMap map2 = this.f52899;
        map2.clear();
        String str2 = this.f52897;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f52892;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f52900 && z) {
            SpannableStringBuilder spannableStringBuilderM40246 = m40246(str4, treeMap);
            String str5 = this.f52891;
            str5.getClass();
            spannableStringBuilderM40246.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            m40246(str4, treeMap).append('\n');
            return;
        }
        if (m40257(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceM51735 = ((C23207) entry.getValue()).m51735();
                charSequenceM51735.getClass();
                map.put(str6, Integer.valueOf(charSequenceM51735.length()));
            }
            boolean zEquals = C0655am.f2322ax.equals(str2);
            for (int i = 0; i < m40253(); i++) {
                m40255(i).m40251(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM40247 = m40246(str4, treeMap);
                int length = spannableStringBuilderM40247.length() - 1;
                while (length >= 0 && spannableStringBuilderM40247.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderM40247.charAt(length) != '\n') {
                    spannableStringBuilderM40247.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceM51736 = ((C23207) entry2.getValue()).m51735();
                charSequenceM51736.getClass();
                map2.put(str7, Integer.valueOf(charSequenceM51736.length()));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static SpannableStringBuilder m40246(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C23207 c23207 = new C23207();
            c23207.m51726(new SpannableStringBuilder());
            treeMap.put(str, c23207);
        }
        CharSequence charSequenceM51735 = ((C23207) treeMap.get(str)).m51735();
        charSequenceM51735.getClass();
        return (SpannableStringBuilder) charSequenceM51735;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0285  */
    /* JADX WARN: Code duplicated, block: B:139:0x0290  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:145:0x02af  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x02bd A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    private void m40250(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        C17710 c17710;
        C7653 c7653M4908;
        float f;
        float f2;
        int i;
        if (m40257(j)) {
            String str2 = this.f52892;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.f52899.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map3 = this.f52896;
                int iIntValue = map3.containsKey(str4) ? ((Integer) map3.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C23207 c23207 = (C23207) treeMap.get(str4);
                    c23207.getClass();
                    C21065 c21065 = (C21065) map2.get(str3);
                    c21065.getClass();
                    int i2 = c21065.f66157;
                    C7653 c7653M4909 = C2958.m4908(this.f52894, this.f52893, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c23207.m51735();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c23207.m51726(spannableStringBuilder);
                    }
                    if (c7653M4909 != null) {
                        if (c7653M4909.m17646() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(c7653M4909.m17646()), iIntValue, iIntValue2, 33);
                        }
                        if (c7653M4909.m17637()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (c7653M4909.m17650()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (c7653M4909.m17648()) {
                            C8377.m19513(spannableStringBuilder, new ForegroundColorSpan(c7653M4909.m17661()), iIntValue, iIntValue2);
                        }
                        if (c7653M4909.m17636()) {
                            C8377.m19513(spannableStringBuilder, new BackgroundColorSpan(c7653M4909.m17638()), iIntValue, iIntValue2);
                        }
                        if (c7653M4909.m17668() != null) {
                            C8377.m19513(spannableStringBuilder, new TypefaceSpan(c7653M4909.m17668()), iIntValue, iIntValue2);
                        }
                        if (c7653M4909.m17673() != null) {
                            C11006 c11006M17673 = c7653M4909.m17673();
                            c11006M17673.getClass();
                            int i3 = c11006M17673.f30483;
                            if (i3 == -1) {
                                i3 = (i2 == 2 || i2 == 1) ? 3 : 1;
                                i = 1;
                            } else {
                                i = c11006M17673.f30482;
                            }
                            int i4 = c11006M17673.f30484;
                            if (i4 == -2) {
                                i4 = 1;
                            }
                            C8377.m19513(spannableStringBuilder, new C7784(i3, i, i4), iIntValue, iIntValue2);
                        }
                        int iM17651 = c7653M4909.m17651();
                        if (iM17651 == 2) {
                            C17710 c17711 = this.f52902;
                            while (true) {
                                if (c17711 == null) {
                                    c17711 = null;
                                    break;
                                }
                                C7653 c7653M49010 = C2958.m4908(c17711.f52894, c17711.f52893, map);
                                if (c7653M49010 != null && c7653M49010.m17651() == 1) {
                                    break;
                                } else {
                                    c17711 = c17711.f52902;
                                }
                            }
                            if (c17711 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c17711);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c17710 = null;
                                        break;
                                    }
                                    c17710 = (C17710) arrayDeque.pop();
                                    C7653 c7653M49011 = C2958.m4908(c17710.f52894, c17710.f52893, map);
                                    if (c7653M49011 != null && c7653M49011.m17651() == 3) {
                                        break;
                                    }
                                    int iM40253 = c17710.m40253();
                                    while (true) {
                                        iM40253--;
                                        if (iM40253 >= 0) {
                                            arrayDeque.push(c17710.m40255(iM40253));
                                        }
                                    }
                                }
                                if (c17710 != null) {
                                    if (c17710.m40253() != 1 || c17710.m40255(0).f52891 == null) {
                                        C21334.m48349("Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = c17710.m40255(0).f52891;
                                        String str6 = C5792.f14228;
                                        C7653 c7653M49012 = C2958.m4908(c17710.f52894, c17710.f52893, map);
                                        int iM17652 = c7653M49012 != null ? c7653M49012.m17652() : -1;
                                        if (iM17652 == -1 && (c7653M4908 = C2958.m4908(c17711.f52894, c17711.f52893, map)) != null) {
                                            iM17652 = c7653M4908.m17652();
                                        }
                                        spannableStringBuilder.setSpan(new C11808(str5, iM17652), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iM17651 == 3 || iM17651 == 4) {
                            spannableStringBuilder.setSpan(new C11677(), iIntValue, iIntValue2, 33);
                        }
                        if (c7653M4909.m17672()) {
                            C8377.m19513(spannableStringBuilder, new C14489(), iIntValue, iIntValue2);
                        }
                        int iM17659 = c7653M4909.m17659();
                        if (iM17659 == 1) {
                            it = it2;
                            C8377.m19513(spannableStringBuilder, new AbsoluteSizeSpan((int) c7653M4909.m17665(), true), iIntValue, iIntValue2);
                        } else if (iM17659 != 2) {
                            if (iM17659 != 3) {
                                f = 100.0f;
                                it = it2;
                            } else {
                                float fM17665 = c7653M4909.m17665() / 100.0f;
                                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                int length = relativeSizeSpanArr.length;
                                int i5 = 0;
                                while (i5 < length) {
                                    RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i5];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        fM17665 = relativeSizeSpan.getSizeChange() * fM17665;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == iIntValue2) {
                                        f2 = fM17665;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    } else {
                                        f2 = fM17665;
                                    }
                                    i5++;
                                    it2 = it3;
                                    fM17665 = f2;
                                }
                                it = it2;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(fM17665), iIntValue, iIntValue2, 33);
                            }
                            if (!C0655am.f2322ax.equals(this.f52897)) {
                                if (c7653M4909.m17660() != Float.MAX_VALUE) {
                                    c23207.m51733((c7653M4909.m17660() * (-90.0f)) / f);
                                }
                                if (c7653M4909.m17647() != null) {
                                    c23207.m51731(c7653M4909.m17647());
                                }
                                if (c7653M4909.m17649() != null) {
                                    c23207.m51725(c7653M4909.m17649());
                                }
                            }
                        } else {
                            it = it2;
                            C8377.m19513(spannableStringBuilder, new RelativeSizeSpan(c7653M4909.m17665()), iIntValue, iIntValue2);
                        }
                        f = 100.0f;
                        if (!C0655am.f2322ax.equals(this.f52897)) {
                            if (c7653M4909.m17660() != Float.MAX_VALUE) {
                                c23207.m51733((c7653M4909.m17660() * (-90.0f)) / f);
                            }
                            if (c7653M4909.m17647() != null) {
                                c23207.m51731(c7653M4909.m17647());
                            }
                            if (c7653M4909.m17649() != null) {
                                c23207.m51725(c7653M4909.m17649());
                            }
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            for (int i6 = 0; i6 < m40253(); i6++) {
                m40255(i6).m40250(j, map, map2, str3, treeMap);
            }
        }
    }
}
