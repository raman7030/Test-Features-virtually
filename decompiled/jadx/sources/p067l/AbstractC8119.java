package p067l;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89IN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8119 extends AbstractC7468 implements Iterable {

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f21407;

    public AbstractC8119(AbstractC13503 abstractC13503, byte[] bArr) {
        super(abstractC13503);
        this.f21407 = bArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.f19547.m30657() == EnumC2773.CONSTRUCTED) {
            AbstractC13503 abstractC13503 = AbstractC13503.f37964;
            return ((C4096) abstractC13503.mo6110(new C15322()).mo4315(abstractC13503, this.f21407)).iterator();
        }
        return Collections.singletonList(this).iterator();
    }
}
