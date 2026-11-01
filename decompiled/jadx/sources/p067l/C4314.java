package p067l;

import com.thegrizzlylabs.sardineandroid.model.Multistatus;
import com.thegrizzlylabs.sardineandroid.model.Response;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֫᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AAS */
/* JADX INFO: loaded from: classes2.dex */
public final class C4314 implements InterfaceC13032 {
    @Override // p067l.InterfaceC13032
    /* JADX INFO: renamed from: ֫ */
    public final Object mo8847(C20066 c20066) throws IOException {
        AbstractC18395.m41869(c20066);
        AbstractC2630 abstractC2630M45436 = c20066.m45436();
        if (abstractC2630M45436 == null) {
            throw new C13762("No entity found in response", c20066.m45443(), c20066.m45437());
        }
        List<Response> response = ((Multistatus) C16383.m37192(Multistatus.class, abstractC2630M45436.m4011())).getResponse();
        ArrayList arrayList = new ArrayList(response.size());
        for (Response response2 : response) {
            try {
                arrayList.add(new C10409(response2));
            } catch (URISyntaxException unused) {
                response2.getHref();
            }
        }
        return arrayList;
    }
}
