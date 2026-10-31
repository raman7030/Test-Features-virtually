package l;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89IN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6051 extends AbstractC5366 implements Iterable {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f18551;

    public AbstractC6051(AbstractC11716 abstractC11716, byte[] bArr) {
        super(abstractC11716);
        this.f18551 = bArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.f16709.m28609() == EnumC0426.CONSTRUCTED) {
            AbstractC11716 abstractC11716 = AbstractC11716.f34964;
            return ((C1818) abstractC11716.mo3869(new C13630()).mo1923(abstractC11716, this.f18551)).iterator();
        }
        return Collections.singletonList(this).iterator();
    }
}
