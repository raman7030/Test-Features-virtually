package l;

import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܳܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes4.dex */
public final class C14582 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final LinkedHashMap f44645;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        f44645 = linkedHashMap;
        linkedHashMap.put("<!--", new C11056());
        linkedHashMap.put("<!", new C16699());
        linkedHashMap.put("<?", new C18111());
        linkedHashMap.put("<", new C17405());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC1883 m34830(StringReader stringReader) throws IOException {
        char[] cArr = new char[10];
        stringReader.mark(10);
        stringReader.read(cArr, 0, 10);
        stringReader.reset();
        String strValueOf = String.valueOf(cArr);
        for (Map.Entry entry : f44645.entrySet()) {
            if (strValueOf.startsWith((String) entry.getKey())) {
                AbstractC1883 abstractC1883 = (AbstractC1883) ((Supplier) entry.getValue()).get();
                abstractC1883.m6228(stringReader);
                return abstractC1883;
            }
        }
        C23755 c23755 = new C23755(0);
        c23755.m6228(stringReader);
        return c23755;
    }
}
