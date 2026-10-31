package l;

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
public final class C4850 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f15321;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f15322;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f15323;

    public C4850(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.f15323 = C20195.unmodifiableList(arrayList);
        this.f15321 = C20195.unmodifiableList(arrayList2);
        this.f15322 = z;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02f3  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4850 m14119(Collection collection, ArrayList arrayList) throws C22489 {
        String string;
        ArrayList arrayList2 = arrayList;
        TreeMap treeMap = new TreeMap();
        ArrayList<C8378> arrayList3 = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C21784 c21784 = (C21784) arrayList2.get(i2);
            if (c21784.f69785 == EnumC20373.ADD) {
                for (String str : c21784.f69781.keySet()) {
                    m14122(i2, str);
                    m14123(treeMap, str, i2);
                }
            } else {
                m14122(i2, c21784.f69779);
                m14123(treeMap, c21784.f69779, i2);
                if (c21784.f69779.endsWith("/")) {
                    arrayList3.add(new C8378(c21784.f69779, i2));
                }
                if (c21784.f69785 == EnumC20373.RENAME) {
                    m14122(i2, c21784.f69782);
                    if (c21784.f69779.endsWith("/") != c21784.f69782.endsWith("/")) {
                        throw m14121("ZIP_ENTRY_TYPE_MISMATCH", "Renaming must preserve the trailing slash entry type.", new String[]{c21784.f69779, c21784.f69782}, i2);
                    }
                    m14123(treeMap, c21784.f69782, i2);
                    if (c21784.f69782.endsWith("/")) {
                        arrayList3.add(new C8378(c21784.f69782, i2));
                    }
                } else {
                    continue;
                }
            }
        }
        for (C8378 c8378 : arrayList3) {
            String str2 = c8378.f25698;
            for (Map.Entry entry : treeMap.tailMap(str2).entrySet()) {
                if (!((String) entry.getKey()).startsWith(str2)) {
                    break;
                }
                int iIntValue = ((Integer) entry.getValue()).intValue();
                int i3 = c8378.f25697;
                if (iIntValue != i3) {
                    throw m14120(i3, new String[]{str2, (String) entry.getKey()}, ((Integer) entry.getValue()).intValue());
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C3545 c3545Clone = (C3545) it.next();
            linkedHashMap.put(c3545Clone.getName(), c3545Clone);
            if (c3545Clone.isDirectory()) {
                c3545Clone = c3545Clone.clone();
            }
            arrayList4.add(c3545Clone);
        }
        C23734 c23734 = new C23734(arrayList4);
        TreeMap treeMap2 = new TreeMap(linkedHashMap);
        HashMap map = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        while (i < arrayList.size()) {
            C21784 c21785 = (C21784) arrayList2.get(i);
            if (c21785.f69785 == EnumC20373.ADD) {
                for (Map.Entry entry2 : c21785.f69781.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    if (!str3.endsWith("/")) {
                        C3545 c3545 = (C3545) linkedHashMap.get(str3);
                        if (c3545 != null) {
                            if (!c21785.f69784) {
                                throw m14121("ZIP_ENTRY_ALREADY_EXISTS", "Adding this entry requires overwrite=true.", new String[]{str3}, i);
                            }
                            map.put(str3, new C15432(c3545, null));
                        }
                    } else if (linkedHashMap.containsKey(str3)) {
                    }
                    arrayList5.add(new C1322(i, str3, entry2.getValue()));
                }
            } else {
                String str4 = c21785.f69779;
                boolean zEndsWith = str4.endsWith("/");
                if (!linkedHashMap.containsKey(str4) && (!zEndsWith || (!linkedHashMap.containsKey(str4) && c23734.m4933(str4) == null))) {
                    throw m14121("ZIP_ENTRY_NOT_FOUND", "The source entry does not exist in the original ZIP.", new String[]{str4}, i);
                }
                if (c21785.f69785 != EnumC20373.DELETE) {
                    String str5 = c21785.f69779;
                    String str6 = c21785.f69782;
                    if (str5.equals(str6)) {
                        continue;
                    } else {
                        boolean zEndsWith2 = str5.endsWith("/");
                        if (zEndsWith2 && str6.startsWith(str5)) {
                            throw m14121("ZIP_OPERATION_CONFLICT", "A directory cannot be moved into its own subtree.", new String[]{str5, str6}, i);
                        }
                        if (zEndsWith2 && ((linkedHashMap.containsKey(str6) || c23734.m4933(str6) != null) && !c21785.f69780)) {
                            throw m14121("ZIP_ENTRY_ALREADY_EXISTS", "An existing target directory requires mergeDirectories=true.", new String[]{str5, str6}, i);
                        }
                        for (C3545 c3546 : m14118(str5, treeMap2)) {
                            if (zEndsWith2) {
                                StringBuilder sbM15339 = C5368.m15339(str6);
                                sbM15339.append(c3546.getName().substring(str5.length()));
                                string = sbM15339.toString();
                            } else {
                                string = str6;
                            }
                            if (((C3545) linkedHashMap.get(string)) == null) {
                                map.put(c3546.getName(), new C15432(c3546, string));
                            } else {
                                if (!c3546.isDirectory()) {
                                    throw m14121("ZIP_ENTRY_ALREADY_EXISTS", "The renamed entry collides with an original ZIP entry.", new String[]{c3546.getName(), string}, i);
                                }
                                if (string.startsWith(str5)) {
                                    map.put(c3546.getName(), new C15432(c3546, string));
                                } else {
                                    map.put(c3546.getName(), new C15432(c3546, null));
                                }
                            }
                        }
                    }
                } else {
                    if (zEndsWith && !c21785.f69783 && !c23734.m4937(str4).isEmpty()) {
                        throw m14121("ZIP_DIRECTORY_NOT_EMPTY", "Deleting a nonempty directory requires recursive=true.", new String[]{str4}, i);
                    }
                    for (C3545 c3547 : m14118(str4, treeMap2)) {
                        map.put(c3547.getName(), new C15432(c3547, null));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList6 = new ArrayList(linkedHashMap.size());
        boolean z = !arrayList5.isEmpty();
        for (C3545 c3548 : linkedHashMap.values()) {
            C15432 c15432 = (C15432) map.get(c3548.getName());
            if (c15432 == null) {
                arrayList6.add(new C15432(c3548, c3548.getName()));
            } else {
                String str7 = c15432.f47246;
                z |= !c3548.getName().equals(str7);
                if (str7 != null) {
                    arrayList6.add(c15432);
                }
            }
        }
        return new C4850(arrayList6, arrayList5, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14123(TreeMap treeMap, String str, int i) throws C22489 {
        Integer num = (Integer) treeMap.put(str, Integer.valueOf(i));
        if (num != null && num.intValue() != i) {
            throw m14120(num.intValue(), new String[]{str}, i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14122(int i, String str) throws C22489 {
        if (str == null || str.isEmpty()) {
            if (str == null) {
                str = "";
            }
            throw m14121("ZIP_INVALID_ENTRY_PATH", "An update entry path must not be empty.", new String[]{str}, i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m14118(String str, TreeMap treeMap) {
        if (!str.endsWith("/")) {
            return Collections.singletonList((C3545) treeMap.get(str));
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.tailMap(str).entrySet()) {
            if (!((String) entry.getKey()).startsWith(str)) {
                break;
            }
            arrayList.add((C3545) entry.getValue());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22489 m14121(String str, String str2, String[] strArr, int i) {
        return new C22489(str, str2, Collections.singletonList(Integer.valueOf(i)), Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22489 m14120(int i, String[] strArr, int i2) {
        return new C22489("ZIP_OPERATION_CONFLICT", "Operations touch the same entry or directory range.", Arrays.asList(Integer.valueOf(Math.min(i, i2)), Integer.valueOf(Math.max(i, i2))), Arrays.asList(strArr));
    }
}
