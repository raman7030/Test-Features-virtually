package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
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
public final class C5401 {
    /* JADX INFO: renamed from: ֫ */
    public static HashMap m11855(AbstractC17043 abstractC17043, C21021 c21021, ArrayList arrayList, ArrayList arrayList2) {
        HashSet hashSet = new HashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            hashSet.add(((C15554) it.next()).f44436);
        }
        if (hashSet.isEmpty()) {
            return new HashMap();
        }
        if (c21021 == null) {
            try {
                return m11854(abstractC17043, hashSet);
            } catch (IOException unused) {
                return new HashMap();
            }
        }
        if (!abstractC17043.m38684("entry_resources.jsonl").mo25093()) {
            m11856(abstractC17043, c21021, arrayList);
        }
        try {
            return m11854(abstractC17043, hashSet);
        } catch (C21495 unused2) {
            m11856(abstractC17043, c21021, arrayList);
            try {
                return m11854(abstractC17043, hashSet);
            } catch (C21495 unused3) {
                return new HashMap();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static HashMap m11854(AbstractC17043 abstractC17043, HashSet hashSet) throws IOException {
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hashSet2.add((String) it.next());
        }
        HashMap map = new HashMap();
        if (hashSet2.isEmpty()) {
            return map;
        }
        BufferedReader bufferedReaderM38679 = abstractC17043.m38684("entry_resources.jsonl").m38679();
        while (true) {
            try {
                String line = bufferedReaderM38679.readLine();
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
                                    throw new C21495("Invalid entry resource cache record");
                                }
                                if (hashSet2.contains(string) && !map.containsKey(string)) {
                                    map.put(string, new C6742(string2, string3));
                                    if (map.size() == hashSet2.size()) {
                                        break;
                                    }
                                }
                            } catch (RuntimeException e) {
                                throw new C21495("Invalid entry resource cache record", e);
                            }
                        } catch (RuntimeException e2) {
                            throw new C21495("Invalid entry resource cache record", e2);
                        }
                    } catch (RuntimeException e3) {
                        throw new C21495("Invalid entry resource cache record", e3);
                    }
                } catch (Exception e4) {
                    throw new C21495("Invalid entry resource cache record", e4);
                }
            } catch (Throwable th) {
                try {
                    bufferedReaderM38679.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bufferedReaderM38679.close();
        return map;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11857(AbstractC17043 abstractC17043, C24538 c24538, HashSet hashSet) {
        abstractC17043.m38666();
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(".entry_resources.jsonl.tmp");
        abstractC17043M38684.mo25503();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(abstractC17043M38684.mo25506(false), StandardCharsets.UTF_8));
            try {
                m11858(c24538, hashSet, bufferedWriter);
                bufferedWriter.close();
                AbstractC17043 abstractC17043M38685 = abstractC17043.m38684("entry_resources.jsonl");
                abstractC17043M38685.mo25503();
                if (!abstractC17043M38684.mo25502(abstractC17043M38685)) {
                    throw new IOException("Failed to publish entry resource cache");
                }
                C17548.m39937();
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            abstractC17043M38684.mo25503();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11858(C24538 c24538, HashSet hashSet, BufferedWriter bufferedWriter) throws IOException {
        InterfaceC3751 value;
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        for (InterfaceC6434 interfaceC6434 : c24538.mo23906()) {
            if (hashSet3.add(Integer.valueOf(interfaceC6434.mo14722()))) {
                HashSet hashSet4 = new HashSet();
                for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                    if (hashSet4.add(Integer.valueOf(interfaceC3080.mo5199()))) {
                        String typeName = interfaceC3080.getTypeName();
                        if (!"string".equals(typeName) && !"array".equals(typeName) && !"plurals".equals(typeName) && !"style".equals(typeName) && !"attr".equals(typeName) && !"id".equals(typeName)) {
                            Iterator it = interfaceC3080.mo5201().iterator();
                            while (it.hasNext()) {
                                for (InterfaceC22528 interfaceC22528 : ((InterfaceC9116) it.next()).mo20696()) {
                                    if (!interfaceC22528.mo31474() && (value = interfaceC22528.getValue()) != null && value.mo7247() == 3 && value.mo7251() != null) {
                                        String value2 = value.mo7251().getValue();
                                        if (!value2.endsWith("/") && hashSet.contains(value2) && hashSet2.add(value2)) {
                                            bufferedWriter.write(JSON.object().add(Entry.DEFAULT_NAME, value2).add("resourceId", C10962.m25239(interfaceC22528.mo50214())).add("resourceName", interfaceC3080.getTypeName() + "/" + interfaceC22528.mo31468()).toString());
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

    /* JADX INFO: renamed from: ֫ */
    public static void m11856(AbstractC17043 abstractC17043, C21021 c21021, Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C15554 c15554 = (C15554) it.next();
            if (!c15554.f44436.endsWith("/")) {
                hashSet.add(c15554.f44436);
            }
        }
        try {
            m11857(abstractC17043, c21021.m47386(), hashSet);
        } catch (RuntimeException | C5276 unused) {
            abstractC17043.m38666();
            AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(".entry_resources.jsonl.tmp");
            abstractC17043M38684.mo25503();
            try {
                new BufferedWriter(new OutputStreamWriter(abstractC17043M38684.mo25506(false), StandardCharsets.UTF_8)).close();
                AbstractC17043 abstractC17043M38685 = abstractC17043.m38684("entry_resources.jsonl");
                abstractC17043M38685.mo25503();
                if (!abstractC17043M38684.mo25502(abstractC17043M38685)) {
                    throw new IOException("Failed to publish entry resource cache");
                }
                C17548.m39937();
            } catch (Throwable th) {
                abstractC17043M38684.mo25503();
                throw th;
            }
        }
    }
}
