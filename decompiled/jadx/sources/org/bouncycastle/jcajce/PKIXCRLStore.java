package org.bouncycastle.jcajce;

import java.util.Collection;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

/* JADX INFO: loaded from: classes.dex */
public interface PKIXCRLStore extends Store {
    @Override // org.bouncycastle.util.Store
    Collection getMatches(Selector selector);
}
