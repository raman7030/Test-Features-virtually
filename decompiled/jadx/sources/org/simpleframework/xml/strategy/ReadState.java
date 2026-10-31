package org.simpleframework.xml.strategy;

import org.simpleframework.xml.util.WeakCache;

/* JADX INFO: loaded from: classes2.dex */
public class ReadState extends WeakCache {
    public final Contract contract;
    public final Loader loader = new Loader();

    public ReadState(Contract contract) {
        this.contract = contract;
    }

    public ReadGraph find(Object obj) {
        ReadGraph readGraph = (ReadGraph) fetch(obj);
        return readGraph != null ? readGraph : create(obj);
    }

    private ReadGraph create(Object obj) {
        ReadGraph readGraph = (ReadGraph) fetch(obj);
        if (readGraph != null) {
            return readGraph;
        }
        ReadGraph readGraph2 = new ReadGraph(this.contract, this.loader);
        cache(obj, readGraph2);
        return readGraph2;
    }
}
