package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۙ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86KX */
/* JADX INFO: loaded from: classes2.dex */
public final class C6978 {

    /* JADX INFO: renamed from: ֫ */
    public final List f18153;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f18154;

    /* JADX INFO: renamed from: ܽ */
    public final List f18155;

    public C6978(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.f18155 = C21562.unmodifiableList(arrayList);
        this.f18153 = C21562.unmodifiableList(arrayList2);
        this.f18154 = z;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02f3  */
    /* JADX INFO: renamed from: ֫ */
    public static C6978 m15999(Collection collection, ArrayList arrayList) throws C23742 {
        String string;
        ArrayList arrayList2 = arrayList;
        TreeMap treeMap = new TreeMap();
        ArrayList<C10331> arrayList3 = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C23072 c23072 = (C23072) arrayList2.get(i2);
            if (c23072.f72493 == EnumC21731.ADD) {
                for (String str : c23072.f72489.keySet()) {
                    m16002(i2, str);
                    m16003(treeMap, str, i2);
                }
            } else {
                m16002(i2, c23072.f72487);
                m16003(treeMap, c23072.f72487, i2);
                if (c23072.f72487.endsWith("/")) {
                    arrayList3.add(new C10331(c23072.f72487, i2));
                }
                if (c23072.f72493 == EnumC21731.RENAME) {
                    m16002(i2, c23072.f72490);
                    if (c23072.f72487.endsWith("/") != c23072.f72490.endsWith("/")) {
                        throw m16001("ZIP_ENTRY_TYPE_MISMATCH", "Renaming must preserve the trailing slash entry type.", new String[]{c23072.f72487, c23072.f72490}, i2);
                    }
                    m16003(treeMap, c23072.f72490, i2);
                    if (c23072.f72490.endsWith("/")) {
                        arrayList3.add(new C10331(c23072.f72490, i2));
                    }
                } else {
                    continue;
                }
            }
        }
        for (C10331 c10331 : arrayList3) {
            String str2 = c10331.f28611;
            for (Map.Entry entry : treeMap.tailMap(str2).entrySet()) {
                if (!((String) entry.getKey()).startsWith(str2)) {
                    break;
                }
                int iIntValue = ((Integer) entry.getValue()).intValue();
                int i3 = c10331.f28610;
                if (iIntValue != i3) {
                    throw m16000(i3, new String[]{str2, (String) entry.getKey()}, ((Integer) entry.getValue()).intValue());
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C5738 c5738Clone = (C5738) it.next();
            linkedHashMap.put(c5738Clone.getName(), c5738Clone);
            if (c5738Clone.isDirectory()) {
                c5738Clone = c5738Clone.clone();
            }
            arrayList4.add(c5738Clone);
        }
        C24925 c24925 = new C24925(arrayList4);
        TreeMap treeMap2 = new TreeMap(linkedHashMap);
        HashMap map = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        while (i < arrayList.size()) {
            C23072 c23073 = (C23072) arrayList2.get(i);
            if (c23073.f72493 == EnumC21731.ADD) {
                for (Map.Entry entry2 : c23073.f72489.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    if (!str3.endsWith("/")) {
                        C5738 c5738 = (C5738) linkedHashMap.get(str3);
                        if (c5738 != null) {
                            if (!c23073.f72492) {
                                throw m16001("ZIP_ENTRY_ALREADY_EXISTS", "Adding this entry requires overwrite=true.", new String[]{str3}, i);
                            }
                            map.put(str3, new C17035(c5738, null));
                        }
                    } else if (linkedHashMap.containsKey(str3)) {
                    }
                    arrayList5.add(new C3625(i, str3, entry2.getValue()));
                }
            } else {
                String str4 = c23073.f72487;
                boolean zEndsWith = str4.endsWith("/");
                if (!linkedHashMap.containsKey(str4) && (!zEndsWith || (!linkedHashMap.containsKey(str4) && c24925.m7176(str4) == null))) {
                    throw m16001("ZIP_ENTRY_NOT_FOUND", "The source entry does not exist in the original ZIP.", new String[]{str4}, i);
                }
                if (c23073.f72493 != EnumC21731.DELETE) {
                    String str5 = c23073.f72487;
                    String str6 = c23073.f72490;
                    if (str5.equals(str6)) {
                        continue;
                    } else {
                        boolean zEndsWith2 = str5.endsWith("/");
                        if (zEndsWith2 && str6.startsWith(str5)) {
                            throw m16001("ZIP_OPERATION_CONFLICT", "A directory cannot be moved into its own subtree.", new String[]{str5, str6}, i);
                        }
                        if (zEndsWith2 && ((linkedHashMap.containsKey(str6) || c24925.m7176(str6) != null) && !c23073.f72488)) {
                            throw m16001("ZIP_ENTRY_ALREADY_EXISTS", "An existing target directory requires mergeDirectories=true.", new String[]{str5, str6}, i);
                        }
                        for (C5738 c5739 : m15998(str5, treeMap2)) {
                            if (zEndsWith2) {
                                StringBuilder sbM17248 = C7470.m17248(str6);
                                sbM17248.append(c5739.getName().substring(str5.length()));
                                string = sbM17248.toString();
                            } else {
                                string = str6;
                            }
                            if (((C5738) linkedHashMap.get(string)) == null) {
                                map.put(c5739.getName(), new C17035(c5739, string));
                            } else {
                                if (!c5739.isDirectory()) {
                                    throw m16001("ZIP_ENTRY_ALREADY_EXISTS", "The renamed entry collides with an original ZIP entry.", new String[]{c5739.getName(), string}, i);
                                }
                                if (string.startsWith(str5)) {
                                    map.put(c5739.getName(), new C17035(c5739, string));
                                } else {
                                    map.put(c5739.getName(), new C17035(c5739, null));
                                }
                            }
                        }
                    }
                } else {
                    if (zEndsWith && !c23073.f72491 && !c24925.m7180(str4).isEmpty()) {
                        throw m16001("ZIP_DIRECTORY_NOT_EMPTY", "Deleting a nonempty directory requires recursive=true.", new String[]{str4}, i);
                    }
                    for (C5738 c57310 : m15998(str4, treeMap2)) {
                        map.put(c57310.getName(), new C17035(c57310, null));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList6 = new ArrayList(linkedHashMap.size());
        boolean z = !arrayList5.isEmpty();
        for (C5738 c57311 : linkedHashMap.values()) {
            C17035 c17035 = (C17035) map.get(c57311.getName());
            if (c17035 == null) {
                arrayList6.add(new C17035(c57311, c57311.getName()));
            } else {
                String str7 = c17035.f50375;
                z |= !c57311.getName().equals(str7);
                if (str7 != null) {
                    arrayList6.add(c17035);
                }
            }
        }
        return new C6978(arrayList6, arrayList5, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16003(TreeMap treeMap, String str, int i) throws C23742 {
        Integer num = (Integer) treeMap.put(str, Integer.valueOf(i));
        if (num != null && num.intValue() != i) {
            throw m16000(num.intValue(), new String[]{str}, i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16002(int i, String str) throws C23742 {
        if (str == null || str.isEmpty()) {
            if (str == null) {
                str = "";
            }
            throw m16001("ZIP_INVALID_ENTRY_PATH", "An update entry path must not be empty.", new String[]{str}, i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m15998(String str, TreeMap treeMap) {
        if (!str.endsWith("/")) {
            return Collections.singletonList((C5738) treeMap.get(str));
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.tailMap(str).entrySet()) {
            if (!((String) entry.getKey()).startsWith(str)) {
                break;
            }
            arrayList.add((C5738) entry.getValue());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23742 m16001(String str, String str2, String[] strArr, int i) {
        return new C23742(str, str2, Collections.singletonList(Integer.valueOf(i)), Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23742 m16000(int i, String[] strArr, int i2) {
        return new C23742("ZIP_OPERATION_CONFLICT", "Operations touch the same entry or directory range.", Arrays.asList(Integer.valueOf(Math.min(i, i2)), Integer.valueOf(Math.max(i, i2))), Arrays.asList(strArr));
    }
}
