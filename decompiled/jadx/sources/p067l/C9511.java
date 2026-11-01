package p067l;

import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: l.۟ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N3OT */
/* JADX INFO: loaded from: classes3.dex */
public final class C9511 {

    /* JADX INFO: renamed from: ֫ */
    public final C13598 f26037;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f26038;

    /* JADX INFO: renamed from: ܽ */
    public C15545 f26039;

    /* JADX INFO: renamed from: ֫ */
    public final void m22131(String str, String str2) {
        this.f26038.add(C3972.m7920(str, null, AbstractC4643.m9817((C15545) null, str2)));
    }

    public C9511() {
        String string = UUID.randomUUID().toString();
        this.f26039 = C12690.f35597;
        this.f26038 = new ArrayList();
        this.f26037 = C13598.m30949(string);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22133(C15545 c15545) {
        if (c15545 == null) {
            throw new NullPointerException("type == null");
        }
        if (!c15545.m35337().equals("multipart")) {
            throw new IllegalArgumentException("multipart != " + c15545);
        }
        this.f26039 = c15545;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22132(String str, String str2, AbstractC4643 abstractC4643) {
        this.f26038.add(C3972.m7920(str, str2, abstractC4643));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12690 m22130() {
        ArrayList arrayList = this.f26038;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        return new C12690(this.f26037, this.f26039, arrayList);
    }
}
