package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.core.Entry;

/* JADX INFO: renamed from: l.ۗۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17A1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3191 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m9810(AbstractC15440 abstractC15440, C19626 c19626, ArrayList arrayList, ArrayList arrayList2) {
        HashSet hashSet = new HashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            hashSet.add(((C13874) it.next()).f41355);
        }
        if (hashSet.isEmpty()) {
            return new HashMap();
        }
        if (c19626 == null) {
            try {
                return m9809(abstractC15440, hashSet);
            } catch (IOException unused) {
                return new HashMap();
            }
        }
        if (!abstractC15440.m36526("entry_resources.jsonl").mo23119()) {
            m9811(abstractC15440, c19626, arrayList);
        }
        try {
            return m9809(abstractC15440, hashSet);
        } catch (C20125 unused2) {
            m9811(abstractC15440, c19626, arrayList);
            try {
                return m9809(abstractC15440, hashSet);
            } catch (C20125 unused3) {
                return new HashMap();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m9809(AbstractC15440 abstractC15440, HashSet hashSet) throws IOException {
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hashSet2.add((String) it.next());
        }
        HashMap map = new HashMap();
        if (hashSet2.isEmpty()) {
            return map;
        }
        BufferedReader bufferedReaderM36521 = abstractC15440.m36526("entry_resources.jsonl").m36521();
        while (true) {
            try {
                String line = bufferedReaderM36521.readLine();
                if (line == null) {
                    break;
                }
                try {
                    JSONObject jSONObject = new JSONObject(line);
                    try {
                        String string = jSONObject.getString(Entry.DEFAULT_NAME, null);
                        try {
                            String string2 = jSONObject.getString("resourceId", null);
                            try {
                                String string3 = jSONObject.getString("resourceName", null);
                                if (string == null || string2 == null || string3 == null) {
                                    throw new C20125("Invalid entry resource cache record");
                                }
                                if (hashSet2.contains(string) && !map.containsKey(string)) {
                                    map.put(string, new C4602(string2, string3));
                                    if (map.size() == hashSet2.size()) {
                                        break;
                                    }
                                }
                            } catch (RuntimeException e) {
                                throw new C20125("Invalid entry resource cache record", e);
                            }
                        } catch (RuntimeException e2) {
                            throw new C20125("Invalid entry resource cache record", e2);
                        }
                    } catch (RuntimeException e3) {
                        throw new C20125("Invalid entry resource cache record", e3);
                    }
                } catch (Exception e4) {
                    throw new C20125("Invalid entry resource cache record", e4);
                }
            } catch (Throwable th) {
                try {
                    bufferedReaderM36521.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bufferedReaderM36521.close();
        return map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9812(AbstractC15440 abstractC15440, C23326 c23326, HashSet hashSet) {
        abstractC15440.m36508();
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(".entry_resources.jsonl.tmp");
        abstractC15440M36526.mo23552();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(abstractC15440M36526.mo23555(false), StandardCharsets.UTF_8));
            try {
                m9813(c23326, hashSet, bufferedWriter);
                bufferedWriter.close();
                AbstractC15440 abstractC15440M36527 = abstractC15440.m36526("entry_resources.jsonl");
                abstractC15440M36527.mo23552();
                if (!abstractC15440M36526.mo23551(abstractC15440M36527)) {
                    throw new IOException("Failed to publish entry resource cache");
                }
                C15972.m37753();
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            abstractC15440M36526.mo23552();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9813(C23326 c23326, HashSet hashSet, BufferedWriter bufferedWriter) throws IOException {
        InterfaceC1454 value;
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        for (InterfaceC4277 interfaceC4277 : c23326.mo21936()) {
            if (hashSet3.add(Integer.valueOf(interfaceC4277.mo12858()))) {
                HashSet hashSet4 = new HashSet();
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (hashSet4.add(Integer.valueOf(interfaceC0748.mo2870()))) {
                        String typeName = interfaceC0748.getTypeName();
                        if (!"string".equals(typeName) && !"array".equals(typeName) && !"plurals".equals(typeName) && !"style".equals(typeName) && !"attr".equals(typeName) && !"id".equals(typeName)) {
                            Iterator it = interfaceC0748.mo2872().iterator();
                            while (it.hasNext()) {
                                for (InterfaceC21211 interfaceC21211 : ((InterfaceC7099) it.next()).mo18746()) {
                                    if (!interfaceC21211.mo29412() && (value = interfaceC21211.getValue()) != null && value.mo5004() == 3 && value.mo5008() != null) {
                                        String value2 = value.mo5008().getValue();
                                        if (!value2.endsWith("/") && hashSet.contains(value2) && hashSet2.add(value2)) {
                                            bufferedWriter.write(JSON.object().add(Entry.DEFAULT_NAME, value2).add("resourceId", C9042.m23294(interfaceC21211.mo47884())).add("resourceName", interfaceC0748.getTypeName() + "/" + interfaceC21211.mo29406()).toString());
                                            bufferedWriter.newLine();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9811(AbstractC15440 abstractC15440, C19626 c19626, Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C13874 c13874 = (C13874) it.next();
            if (!c13874.f41355.endsWith("/")) {
                hashSet.add(c13874.f41355);
            }
        }
        try {
            m9812(abstractC15440, c19626.m45090(), hashSet);
        } catch (RuntimeException | C3059 unused) {
            abstractC15440.m36508();
            AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(".entry_resources.jsonl.tmp");
            abstractC15440M36526.mo23552();
            try {
                new BufferedWriter(new OutputStreamWriter(abstractC15440M36526.mo23555(false), StandardCharsets.UTF_8)).close();
                AbstractC15440 abstractC15440M36527 = abstractC15440.m36526("entry_resources.jsonl");
                abstractC15440M36527.mo23552();
                if (!abstractC15440M36526.mo23551(abstractC15440M36527)) {
                    throw new IOException("Failed to publish entry resource cache");
                }
                C15972.m37753();
            } catch (Throwable th) {
                abstractC15440M36526.mo23552();
                throw th;
            }
        }
    }
}
