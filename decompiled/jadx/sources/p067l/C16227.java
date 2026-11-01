package p067l;

import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܳܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes4.dex */
public final class C16227 {

    /* JADX INFO: renamed from: ֫ */
    public static final LinkedHashMap f47753;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        f47753 = linkedHashMap;
        linkedHashMap.put("<!--", new C12876());
        linkedHashMap.put("<!", new C18239());
        linkedHashMap.put("<?", new C19581());
        linkedHashMap.put("<", new C18910());
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC4158 m36981(StringReader stringReader) throws IOException {
        char[] cArr = new char[10];
        stringReader.mark(10);
        stringReader.read(cArr, 0, 10);
        stringReader.reset();
        String strValueOf = String.valueOf(cArr);
        for (Map.Entry entry : f47753.entrySet()) {
            if (strValueOf.startsWith((String) entry.getKey())) {
                AbstractC4158 abstractC4158 = (AbstractC4158) ((Supplier) entry.getValue()).get();
                abstractC4158.m8430(stringReader);
                return abstractC4158;
            }
        }
        C24945 c24945 = new C24945(0);
        c24945.m8430(stringReader);
        return c24945;
    }
}
