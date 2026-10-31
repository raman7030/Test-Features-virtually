package org.simpleframework.xml.strategy;

import org.simpleframework.xml.util.WeakCache;

/* JADX INFO: loaded from: classes2.dex */
public class WriteState extends WeakCache {
    public Contract contract;

    public WriteState(Contract contract) {
        this.contract = contract;
    }

    public WriteGraph find(Object obj) {
        WriteGraph writeGraph = (WriteGraph) fetch(obj);
        if (writeGraph != null) {
            return writeGraph;
        }
        WriteGraph writeGraph2 = new WriteGraph(this.contract);
        cache(obj, writeGraph2);
        return writeGraph2;
    }
}
