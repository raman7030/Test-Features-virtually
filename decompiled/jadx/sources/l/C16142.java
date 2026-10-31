package l;

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
import com.umeng.analytics.pro.am;
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
public final class C16142 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f49724;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f49725;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f49726;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String[] f49727;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C5560 f49728;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f49729;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f49730;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f49731;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f49732;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f49733;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f49734;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f49735;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16142 f49736;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16142 m38055(String str) {
        return new C16142(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16142 m38056(String str, long j, long j2, C5560 c5560, String[] strArr, String str2, String str3, C16142 c16142) {
        return new C16142(str, null, j, j2, c5560, strArr, str2, str3, c16142);
    }

    public C16142(String str, String str2, long j, long j2, C5560 c5560, String[] strArr, String str3, String str4, C16142 c16142) {
        this.f49731 = str;
        this.f49725 = str2;
        this.f49732 = str4;
        this.f49728 = c5560;
        this.f49727 = strArr;
        this.f49734 = str2 != null;
        this.f49735 = j;
        this.f49729 = j2;
        str3.getClass();
        this.f49726 = str3;
        this.f49736 = c16142;
        this.f49730 = new HashMap();
        this.f49733 = new HashMap();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38065(long j) {
        long j2 = this.f49729;
        long j3 = this.f49735;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38064(C16142 c16142) {
        if (this.f49724 == null) {
            this.f49724 = new ArrayList();
        }
        this.f49724.add(c16142);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16142 m38063(int i) {
        ArrayList arrayList = this.f49724;
        if (arrayList == null) {
            throw new IndexOutOfBoundsException();
        }
        return (C16142) arrayList.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38061() {
        ArrayList arrayList = this.f49724;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long[] m38066() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m38060(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38060(TreeSet treeSet, boolean z) {
        String str = this.f49731;
        boolean zEquals = am.ax.equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.f49732 != null)) {
            long j = this.f49735;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f49729;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f49724 == null) {
            return;
        }
        for (int i = 0; i < this.f49724.size(); i++) {
            ((C16142) this.f49724.get(i)).m38060(treeSet, z || zEquals);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m38062(long j, Map map, HashMap map2, HashMap map3) {
        ArrayList<Pair> arrayList = new ArrayList();
        m38057(j, this.f49726, arrayList);
        TreeMap treeMap = new TreeMap();
        m38059(j, false, this.f49726, treeMap);
        m38058(j, map, map2, this.f49726, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C19672 c19672 = (C19672) map2.get(pair.first);
                c19672.getClass();
                C21927 c21927 = new C21927();
                c21927.m49387(bitmapDecodeByteArray);
                c21927.m49391(c19672.f63532);
                c21927.m49393(0);
                c21927.m49385(c19672.f63533, 0);
                c21927.m49386(c19672.f63535);
                c21927.m49401(c19672.f63530);
                c21927.m49384(c19672.f63528);
                c21927.m49397(c19672.f63536);
                arrayList2.add(c21927.m49383());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C19672 c19673 = (C19672) map2.get(entry.getKey());
            c19673.getClass();
            C21927 c21928 = (C21927) entry.getValue();
            CharSequence charSequenceM49398 = c21928.m49398();
            charSequenceM49398.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceM49398;
            for (C9794 c9794 : (C9794[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C9794.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c9794), spannableStringBuilder.getSpanEnd(c9794), (CharSequence) "");
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
            c21928.m49385(c19673.f63533, c19673.f63534);
            c21928.m49386(c19673.f63535);
            c21928.m49391(c19673.f63532);
            c21928.m49401(c19673.f63530);
            c21928.m49392(c19673.f63537, c19673.f63529);
            c21928.m49397(c19673.f63536);
            arrayList2.add(c21928.m49383());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38057(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f49726;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m38065(j) && "div".equals(this.f49731) && (str2 = this.f49732) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < m38061(); i++) {
            m38063(i).m38057(j, str, arrayList);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38059(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.f49730;
        map.clear();
        HashMap map2 = this.f49733;
        map2.clear();
        String str2 = this.f49731;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f49726;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f49734 && z) {
            SpannableStringBuilder spannableStringBuilderM38054 = m38054(str4, treeMap);
            String str5 = this.f49725;
            str5.getClass();
            spannableStringBuilderM38054.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            m38054(str4, treeMap).append('\n');
            return;
        }
        if (m38065(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceM49398 = ((C21927) entry.getValue()).m49398();
                charSequenceM49398.getClass();
                map.put(str6, Integer.valueOf(charSequenceM49398.length()));
            }
            boolean zEquals = am.ax.equals(str2);
            for (int i = 0; i < m38061(); i++) {
                m38063(i).m38059(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM38055 = m38054(str4, treeMap);
                int length = spannableStringBuilderM38055.length() - 1;
                while (length >= 0 && spannableStringBuilderM38055.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderM38055.charAt(length) != '\n') {
                    spannableStringBuilderM38055.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceM49399 = ((C21927) entry2.getValue()).m49398();
                charSequenceM49399.getClass();
                map2.put(str7, Integer.valueOf(charSequenceM49399.length()));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m38054(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C21927 c21927 = new C21927();
            c21927.m49389(new SpannableStringBuilder());
            treeMap.put(str, c21927);
        }
        CharSequence charSequenceM49398 = ((C21927) treeMap.get(str)).m49398();
        charSequenceM49398.getClass();
        return (SpannableStringBuilder) charSequenceM49398;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0285  */
    /* JADX WARN: Code duplicated, block: B:139:0x0290  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:145:0x02af  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x02bd A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38058(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        C16142 c16142;
        C5560 c5560M2552;
        float f;
        float f2;
        int i;
        if (m38065(j)) {
            String str2 = this.f49726;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.f49733.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map3 = this.f49730;
                int iIntValue = map3.containsKey(str4) ? ((Integer) map3.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C21927 c21927 = (C21927) treeMap.get(str4);
                    c21927.getClass();
                    C19672 c19672 = (C19672) map2.get(str3);
                    c19672.getClass();
                    int i2 = c19672.f63536;
                    C5560 c5560M2553 = C0620.m2552(this.f49728, this.f49727, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c21927.m49398();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c21927.m49389(spannableStringBuilder);
                    }
                    if (c5560M2553 != null) {
                        if (c5560M2553.m15731() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(c5560M2553.m15731()), iIntValue, iIntValue2, 33);
                        }
                        if (c5560M2553.m15722()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (c5560M2553.m15735()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (c5560M2553.m15733()) {
                            C6322.m17573(spannableStringBuilder, new ForegroundColorSpan(c5560M2553.m15746()), iIntValue, iIntValue2);
                        }
                        if (c5560M2553.m15721()) {
                            C6322.m17573(spannableStringBuilder, new BackgroundColorSpan(c5560M2553.m15723()), iIntValue, iIntValue2);
                        }
                        if (c5560M2553.m15753() != null) {
                            C6322.m17573(spannableStringBuilder, new TypefaceSpan(c5560M2553.m15753()), iIntValue, iIntValue2);
                        }
                        if (c5560M2553.m15758() != null) {
                            C9088 c9088M15758 = c5560M2553.m15758();
                            c9088M15758.getClass();
                            int i3 = c9088M15758.f27546;
                            if (i3 == -1) {
                                i3 = (i2 == 2 || i2 == 1) ? 3 : 1;
                                i = 1;
                            } else {
                                i = c9088M15758.f27545;
                            }
                            int i4 = c9088M15758.f27547;
                            if (i4 == -2) {
                                i4 = 1;
                            }
                            C6322.m17573(spannableStringBuilder, new C5699(i3, i, i4), iIntValue, iIntValue2);
                        }
                        int iM15736 = c5560M2553.m15736();
                        if (iM15736 == 2) {
                            C16142 c16143 = this.f49736;
                            while (true) {
                                if (c16143 == null) {
                                    c16143 = null;
                                    break;
                                }
                                C5560 c5560M2554 = C0620.m2552(c16143.f49728, c16143.f49727, map);
                                if (c5560M2554 != null && c5560M2554.m15736() == 1) {
                                    break;
                                } else {
                                    c16143 = c16143.f49736;
                                }
                            }
                            if (c16143 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c16143);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c16142 = null;
                                        break;
                                    }
                                    c16142 = (C16142) arrayDeque.pop();
                                    C5560 c5560M2555 = C0620.m2552(c16142.f49728, c16142.f49727, map);
                                    if (c5560M2555 != null && c5560M2555.m15736() == 3) {
                                        break;
                                    }
                                    int iM38061 = c16142.m38061();
                                    while (true) {
                                        iM38061--;
                                        if (iM38061 >= 0) {
                                            arrayDeque.push(c16142.m38063(iM38061));
                                        }
                                    }
                                }
                                if (c16142 != null) {
                                    if (c16142.m38061() != 1 || c16142.m38063(0).f49725 == null) {
                                        C19956.m46035("Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = c16142.m38063(0).f49725;
                                        String str6 = C3603.f11424;
                                        C5560 c5560M2556 = C0620.m2552(c16142.f49728, c16142.f49727, map);
                                        int iM15737 = c5560M2556 != null ? c5560M2556.m15737() : -1;
                                        if (iM15737 == -1 && (c5560M2552 = C0620.m2552(c16143.f49728, c16143.f49727, map)) != null) {
                                            iM15737 = c5560M2552.m15737();
                                        }
                                        spannableStringBuilder.setSpan(new C9933(str5, iM15737), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iM15736 == 3 || iM15736 == 4) {
                            spannableStringBuilder.setSpan(new C9794(), iIntValue, iIntValue2, 33);
                        }
                        if (c5560M2553.m15757()) {
                            C6322.m17573(spannableStringBuilder, new C12754(), iIntValue, iIntValue2);
                        }
                        int iM15744 = c5560M2553.m15744();
                        if (iM15744 == 1) {
                            it = it2;
                            C6322.m17573(spannableStringBuilder, new AbsoluteSizeSpan((int) c5560M2553.m15750(), true), iIntValue, iIntValue2);
                        } else if (iM15744 != 2) {
                            if (iM15744 != 3) {
                                f = 100.0f;
                                it = it2;
                            } else {
                                float fM15750 = c5560M2553.m15750() / 100.0f;
                                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                int length = relativeSizeSpanArr.length;
                                int i5 = 0;
                                while (i5 < length) {
                                    RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i5];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        fM15750 = relativeSizeSpan.getSizeChange() * fM15750;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == iIntValue2) {
                                        f2 = fM15750;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    } else {
                                        f2 = fM15750;
                                    }
                                    i5++;
                                    it2 = it3;
                                    fM15750 = f2;
                                }
                                it = it2;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(fM15750), iIntValue, iIntValue2, 33);
                            }
                            if (!am.ax.equals(this.f49731)) {
                                if (c5560M2553.m15745() != Float.MAX_VALUE) {
                                    c21927.m49396((c5560M2553.m15745() * (-90.0f)) / f);
                                }
                                if (c5560M2553.m15732() != null) {
                                    c21927.m49394(c5560M2553.m15732());
                                }
                                if (c5560M2553.m15734() != null) {
                                    c21927.m49388(c5560M2553.m15734());
                                }
                            }
                        } else {
                            it = it2;
                            C6322.m17573(spannableStringBuilder, new RelativeSizeSpan(c5560M2553.m15750()), iIntValue, iIntValue2);
                        }
                        f = 100.0f;
                        if (!am.ax.equals(this.f49731)) {
                            if (c5560M2553.m15745() != Float.MAX_VALUE) {
                                c21927.m49396((c5560M2553.m15745() * (-90.0f)) / f);
                            }
                            if (c5560M2553.m15732() != null) {
                                c21927.m49394(c5560M2553.m15732());
                            }
                            if (c5560M2553.m15734() != null) {
                                c21927.m49388(c5560M2553.m15734());
                            }
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            for (int i6 = 0; i6 < m38061(); i6++) {
                m38063(i6).m38058(j, map, map2, str3, treeMap);
            }
        }
    }
}
