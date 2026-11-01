package p067l;

import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: K7A5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11469 {

    /* JADX INFO: renamed from: ֫ */
    public final Consumer f31983;

    /* JADX INFO: renamed from: ۧ */
    public final C10371 f31984;

    public C11469() {
        this(new C10371(), new C18844(0));
    }

    public C11469(C10371 c10371, Consumer consumer) {
        this.f31984 = c10371;
        this.f31983 = consumer;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m26466() {
        return m26465();
    }

    /* JADX INFO: renamed from: ۧ */
    private ArrayList m26465() throws Throwable {
        String strM16224;
        String str;
        C22198 c22198M50006;
        C19561 c19561;
        int i;
        ArrayList arrayList = new ArrayList();
        AbstractC17043 abstractC17043M24028 = this.f31984.m24028();
        if (!abstractC17043M24028.mo25087()) {
            return arrayList;
        }
        boolean z = true;
        for (AbstractC17043 abstractC17043 : abstractC17043M24028.mo25500(true)) {
            String name = abstractC17043.getName();
            if (abstractC17043.mo25087() && !abstractC17043.m38691() && !name.startsWith(".tmp-") && !name.equals("xref")) {
                String name2 = abstractC17043.getName();
                LinkedList linkedList = new LinkedList();
                linkedList.add(abstractC17043);
                long jMo25101 = 0;
                while (!linkedList.isEmpty()) {
                    for (AbstractC17043 abstractC17044 : ((AbstractC17043) linkedList.removeFirst()).mo25500(z)) {
                        if (abstractC17044.mo25087()) {
                            if (!abstractC17044.m38691()) {
                                linkedList.addLast(abstractC17044);
                            }
                        } else if (!abstractC17044.m38691()) {
                            jMo25101 = abstractC17044.mo25101() + jMo25101;
                        }
                    }
                }
                long jMo25091 = abstractC17043.mo25091();
                AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("metadata.json");
                if (!abstractC17043M38684.mo25093()) {
                    strM16224 = C7050.m16224(R.string.MT_Protector);
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(abstractC17043M38684.m38664(), StandardCharsets.UTF_8));
                        boolean z2 = jSONObject.getBoolean("temporary", false);
                        long j = jSONObject.getLong("createdAt", -1L);
                        long j2 = jSONObject.getLong("lastAccessedAt", -1L);
                        long j3 = j2 >= 0 ? j2 : j >= 0 ? j : jMo25091;
                        String strSubstring = null;
                        String string = jSONObject.getString("sourcePath", null);
                        if (!name2.equals(jSONObject.getString("workspaceId", null))) {
                            c22198M50006 = C22198.m50006(jMo25101, j3, abstractC17043, name2, string, C7050.m16224(R.string.MT_Protector), z2);
                        } else {
                            AbstractC17043 abstractC17043M38685 = abstractC17043.m38684("original.apk");
                            if (!abstractC17043M38685.mo25093()) {
                                c22198M50006 = C22198.m50006(jMo25101, j3, abstractC17043, name2, string, C7050.m16224(R.string.MT_Protector), z2);
                            } else {
                                try {
                                    C19561 c19562 = new C19561(abstractC17043M38685);
                                    try {
                                        C21527 c21527M11941 = C5433.m11941(c19562);
                                        if (c21527M11941.f67918) {
                                            c19561 = c19562;
                                            str = string;
                                            String str2 = c21527M11941.f67913;
                                            if (str2 == null && (str2 = c21527M11941.f67916) == null) {
                                                str2 = c21527M11941.f67922;
                                            }
                                            if (str2 != null) {
                                                strSubstring = str2;
                                            } else if (str != null && !str.isEmpty()) {
                                                int iLastIndexOf = str.lastIndexOf(47);
                                                strSubstring = (iLastIndexOf < 0 || (i = iLastIndexOf + 1) >= str.length()) ? str : str.substring(i);
                                            }
                                            c22198M50006 = C22198.m50007(jMo25101, j3, abstractC17043, name2, strSubstring == null ? name2 : strSubstring, str, z2);
                                        } else {
                                            c19561 = c19562;
                                            str = string;
                                            try {
                                                c22198M50006 = C22198.m50006(jMo25101, j3, abstractC17043, name2, string, C7050.m16224(R.string.MT_Protector), z2);
                                            } catch (Throwable th) {
                                                th = th;
                                                Throwable th2 = th;
                                                try {
                                                    c19561.close();
                                                } catch (Throwable th3) {
                                                    th2.addSuppressed(th3);
                                                }
                                                throw th2;
                                            }
                                        }
                                        try {
                                            c19561.close();
                                        } catch (Exception unused) {
                                            c22198M50006 = C22198.m50006(jMo25101, j3, abstractC17043, name2, str, C7050.m16224(R.string.MT_Protector), z2);
                                            arrayList.add(c22198M50006);
                                            z = true;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c19561 = c19562;
                                        str = string;
                                    }
                                } catch (Exception unused2) {
                                    str = string;
                                }
                            }
                        }
                    } catch (Exception unused3) {
                        strM16224 = C7050.m16224(R.string.MT_Protector);
                        c22198M50006 = C22198.m50006(jMo25101, jMo25091, abstractC17043, name2, null, strM16224, false);
                    }
                    arrayList.add(c22198M50006);
                }
                c22198M50006 = C22198.m50006(jMo25101, jMo25091, abstractC17043, name2, null, strM16224, false);
                arrayList.add(c22198M50006);
            }
            z = true;
        }
        C8150.sort(arrayList, C16866.reversed(C10162.comparingLong(new C16161())));
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26468(C22198 c22198) {
        this.f31983.m45213n(c22198);
        AbstractC17043 abstractC17043 = c22198.f70206;
        this.f31984.getClass();
        C10371.m24018(abstractC17043);
        C17548.m39937();
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m26467(String str, int i, long j) throws Throwable {
        Set setSingleton = Collections.singleton(str);
        ArrayList arrayList = new ArrayList();
        ArrayList<C22198> arrayListM26465 = m26465();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C22198> arrayList3 = new ArrayList();
        for (C22198 c22198 : arrayListM26465) {
            if (c22198.f70211) {
                arrayList3.add(c22198);
            } else {
                arrayList2.add(c22198);
            }
        }
        m26463(arrayList2, i, setSingleton, arrayList);
        C8150.sort(arrayList3, C10162.comparingLong(new C8786()));
        ArrayList arrayList4 = new ArrayList();
        for (C22198 c22199 : arrayList3) {
            if (setSingleton.contains(c22199.f70207) || j - c22199.f70212 <= 600000 || !m26464(c22199, arrayList)) {
                arrayList4.add(c22199);
            }
        }
        m26463(arrayList4, 2, setSingleton, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26463(ArrayList arrayList, int i, Set set, ArrayList arrayList2) {
        int size = arrayList.size();
        C8150.sort(arrayList, C10162.comparingLong(new C24879()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C22198 c22198 = (C22198) it.next();
            if (size <= i) {
                return;
            }
            if (!set.contains(c22198.f70207) && m26464(c22198, arrayList2)) {
                size--;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m26464(C22198 c22198, ArrayList arrayList) {
        String str = c22198.f70207;
        try {
            this.f31983.m45213n(c22198);
            C10371 c10371 = this.f31984;
            AbstractC17043 abstractC17043 = c22198.f70206;
            c10371.getClass();
            C10371.m24018(abstractC17043);
            arrayList.add(str);
            return true;
        } catch (IOException e) {
            C21306.m48192("MT MCP session delete failed, sessionId=" + str, e);
            return false;
        }
    }
}
