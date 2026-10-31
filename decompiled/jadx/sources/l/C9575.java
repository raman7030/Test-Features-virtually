package l;

import bin.mt.json.JSONObject;
import bin.mt.plus.R;
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
public final class C9575 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Consumer f29036;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8420 f29037;

    public C9575() {
        this(new C8420(), new C17335(0));
    }

    public C9575(C8420 c8420, Consumer consumer) {
        this.f29037 = c8420;
        this.f29036 = consumer;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m24454() {
        return m24453();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private ArrayList m24453() throws Throwable {
        String strM14327;
        String str;
        C20864 c20864M47677;
        C18090 c18090;
        int i;
        ArrayList arrayList = new ArrayList();
        AbstractC15440 abstractC15440M22058 = this.f29037.m22058();
        if (!abstractC15440M22058.mo23113()) {
            return arrayList;
        }
        boolean z = true;
        for (AbstractC15440 abstractC15440 : abstractC15440M22058.mo23549(true)) {
            String name = abstractC15440.getName();
            if (abstractC15440.mo23113() && !abstractC15440.m36533() && !name.startsWith(".tmp-") && !name.equals("xref")) {
                String name2 = abstractC15440.getName();
                LinkedList linkedList = new LinkedList();
                linkedList.add(abstractC15440);
                long jMo23127 = 0;
                while (!linkedList.isEmpty()) {
                    for (AbstractC15440 abstractC15441 : ((AbstractC15440) linkedList.removeFirst()).mo23549(z)) {
                        if (abstractC15441.mo23113()) {
                            if (!abstractC15441.m36533()) {
                                linkedList.addLast(abstractC15441);
                            }
                        } else if (!abstractC15441.m36533()) {
                            jMo23127 = abstractC15441.mo23127() + jMo23127;
                        }
                    }
                }
                long jMo23117 = abstractC15440.mo23117();
                AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("metadata.json");
                if (!abstractC15440M36526.mo23119()) {
                    strM14327 = C4925.m14327(R.string.MT_Protector);
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(abstractC15440M36526.m36506(), StandardCharsets.UTF_8));
                        boolean z2 = jSONObject.getBoolean("temporary", false);
                        long j = jSONObject.getLong("createdAt", -1L);
                        long j2 = jSONObject.getLong("lastAccessedAt", -1L);
                        long j3 = j2 >= 0 ? j2 : j >= 0 ? j : jMo23117;
                        String strSubstring = null;
                        String string = jSONObject.getString("sourcePath", null);
                        if (!name2.equals(jSONObject.getString("workspaceId", null))) {
                            c20864M47677 = C20864.m47677(jMo23127, j3, abstractC15440, name2, string, C4925.m14327(R.string.MT_Protector), z2);
                        } else {
                            AbstractC15440 abstractC15440M36527 = abstractC15440.m36526("original.apk");
                            if (!abstractC15440M36527.mo23119()) {
                                c20864M47677 = C20864.m47677(jMo23127, j3, abstractC15440, name2, string, C4925.m14327(R.string.MT_Protector), z2);
                            } else {
                                try {
                                    C18090 c18091 = new C18090(abstractC15440M36527);
                                    try {
                                        C20158 c20158M9893 = C3224.m9893(c18091);
                                        if (c20158M9893.f65275) {
                                            c18090 = c18091;
                                            str = string;
                                            String str2 = c20158M9893.f65270;
                                            if (str2 == null && (str2 = c20158M9893.f65273) == null) {
                                                str2 = c20158M9893.f65279;
                                            }
                                            if (str2 != null) {
                                                strSubstring = str2;
                                            } else if (str != null && !str.isEmpty()) {
                                                int iLastIndexOf = str.lastIndexOf(47);
                                                strSubstring = (iLastIndexOf < 0 || (i = iLastIndexOf + 1) >= str.length()) ? str : str.substring(i);
                                            }
                                            c20864M47677 = C20864.m47678(jMo23127, j3, abstractC15440, name2, strSubstring == null ? name2 : strSubstring, str, z2);
                                        } else {
                                            c18090 = c18091;
                                            str = string;
                                            try {
                                                c20864M47677 = C20864.m47677(jMo23127, j3, abstractC15440, name2, string, C4925.m14327(R.string.MT_Protector), z2);
                                            } catch (Throwable th) {
                                                th = th;
                                                Throwable th2 = th;
                                                try {
                                                    c18090.close();
                                                } catch (Throwable th3) {
                                                    th2.addSuppressed(th3);
                                                }
                                                throw th2;
                                            }
                                        }
                                        try {
                                            c18090.close();
                                        } catch (Exception unused) {
                                            c20864M47677 = C20864.m47677(jMo23127, j3, abstractC15440, name2, str, C4925.m14327(R.string.MT_Protector), z2);
                                            arrayList.add(c20864M47677);
                                            z = true;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c18090 = c18091;
                                        str = string;
                                    }
                                } catch (Exception unused2) {
                                    str = string;
                                }
                            }
                        }
                    } catch (Exception unused3) {
                        strM14327 = C4925.m14327(R.string.MT_Protector);
                        c20864M47677 = C20864.m47677(jMo23127, jMo23117, abstractC15440, name2, null, strM14327, false);
                    }
                    arrayList.add(c20864M47677);
                }
                c20864M47677 = C20864.m47677(jMo23127, jMo23117, abstractC15440, name2, null, strM14327, false);
                arrayList.add(c20864M47677);
            }
            z = true;
        }
        C6083.sort(arrayList, C15254.reversed(C8200.comparingLong(new C14512())));
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24456(C20864 c20864) {
        this.f29036.n(c20864);
        AbstractC15440 abstractC15440 = c20864.f67520;
        this.f29037.getClass();
        C8420.m22048(abstractC15440);
        C15972.m37753();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m24455(String str, int i, long j) throws Throwable {
        Set setSingleton = Collections.singleton(str);
        ArrayList arrayList = new ArrayList();
        ArrayList<C20864> arrayListM24453 = m24453();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C20864> arrayList3 = new ArrayList();
        for (C20864 c20864 : arrayListM24453) {
            if (c20864.f67525) {
                arrayList3.add(c20864);
            } else {
                arrayList2.add(c20864);
            }
        }
        m24451(arrayList2, i, setSingleton, arrayList);
        C6083.sort(arrayList3, C8200.comparingLong(new C6752()));
        ArrayList arrayList4 = new ArrayList();
        for (C20864 c20865 : arrayList3) {
            if (setSingleton.contains(c20865.f67521) || j - c20865.f67526 <= 600000 || !m24452(c20865, arrayList)) {
                arrayList4.add(c20865);
            }
        }
        m24451(arrayList4, 2, setSingleton, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24451(ArrayList arrayList, int i, Set set, ArrayList arrayList2) {
        int size = arrayList.size();
        C6083.sort(arrayList, C8200.comparingLong(new C23685()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C20864 c20864 = (C20864) it.next();
            if (size <= i) {
                return;
            }
            if (!set.contains(c20864.f67521) && m24452(c20864, arrayList2)) {
                size--;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m24452(C20864 c20864, ArrayList arrayList) {
        String str = c20864.f67521;
        try {
            this.f29036.n(c20864);
            C8420 c8420 = this.f29037;
            AbstractC15440 abstractC15440 = c20864.f67520;
            c8420.getClass();
            C8420.m22048(abstractC15440);
            arrayList.add(str);
            return true;
        } catch (IOException e) {
            C19926.m45879("MT MCP session delete failed, sessionId=" + str, e);
            return false;
        }
    }
}
