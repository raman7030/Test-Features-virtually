package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܺ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I16G */
/* JADX INFO: loaded from: classes4.dex */
public final class C17812 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f53166 = true;

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m40428() {
        return C17853.m40542().m38684("injectionSchemes");
    }

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m40432() {
        AbstractC17043 abstractC17043M40428 = m40428();
        List<String> listMo29992 = abstractC17043M40428.mo29992();
        ArrayList arrayList = new ArrayList(listMo29992.size());
        for (String str : listMo29992) {
            if (str.toLowerCase().endsWith(".json")) {
                arrayList.add(str.substring(0, str.length() - 5));
            }
        }
        Collections.sort(arrayList);
        if (f53166 && arrayList.isEmpty()) {
            String strM16224 = C7050.m16224(R.string.MT_Protector);
            try {
                abstractC17043M40428.m38684(strM16224 + ".json").m38668("{\"a\":[{\"b\":{\"a\":\"\",\"b\":0,\"c\":1,\"d\":\"\",\"e\":0,\"f\":1,\"g\":\"\",\"h\":0,\"i\":1,\"j\":\"Ljava\\/lang\\/String;\",\"k\":0,\"l\":0,\"m\":0,\"n\":0,\"o\":1},\"c\":0,\"d\":0},{\"b\":{\"a\":\"Ljava\\/lang\\/String;\",\"b\":0,\"c\":0,\"d\":\"<init>\",\"e\":0,\"f\":0,\"g\":\"\",\"h\":0,\"i\":1,\"j\":\"V\",\"k\":0,\"l\":0,\"m\":0,\"n\":1,\"o\":0},\"c\":1,\"d\":1}]}");
                arrayList.add(strM16224);
            } catch (IOException unused) {
            }
        }
        f53166 = false;
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m40434(String str, String str2) {
        AbstractC17043 abstractC17043M38684 = m40428().m38684(str + ".json");
        AbstractC17043 abstractC17043M38685 = m40428().m38684(str2.concat(".json"));
        if (!str.equalsIgnoreCase(str2)) {
            return abstractC17043M38684.mo25502(abstractC17043M38685);
        }
        AbstractC17043 abstractC17043M38678 = abstractC17043M38684.m38678(".tmp");
        return abstractC17043M38684.mo25502(abstractC17043M38678) && abstractC17043M38678.mo25502(abstractC17043M38685);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40430(String str, String str2) throws IOException {
        AbstractC17043 abstractC17043M40428 = m40428();
        abstractC17043M40428.m38684(str + ".json").m38658(abstractC17043M40428.m38684(str2.concat(".json")), (C19056) null, (InterfaceC7717) null);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m40436(String str) {
        return C17073.m38720(5, 0, m40428().m38684(str.concat(".json")).m38650(true).getName());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40429(String str) {
        m40428().m38684(str + ".json").mo25503();
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m40433(String str) {
        return m40428().m38684(str + ".json").mo25094();
    }

    /* JADX INFO: renamed from: ܽ */
    public static C11108 m40435(String str) throws JSONException {
        AbstractC17043 abstractC17043M38684 = m40428().m38684(str + ".json");
        C11108 c11108 = new C11108(str);
        c11108.m25583(new JSONObject(abstractC17043M38684.m38647()));
        return c11108;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40431(C11108 c11108) {
        m40428().m38684(c11108.f30809 + ".json").m38668(c11108.m25585().toString());
    }
}
