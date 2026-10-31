package org.simpleframework.xml.convert;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes2.dex */
public interface Converter {
    Object read(InputNode inputNode);

    void write(OutputNode outputNode, Object obj);
}
