package com.amazonaws.services.p061s3.model.transform;

import com.amazonaws.services.p061s3.internal.XmlWriter;
import com.amazonaws.services.p061s3.model.PartETag;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RequestXmlFactory {
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m1870(List list) {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.m1655("CompleteMultipartUpload");
        if (list != null) {
            Collections.sort(list, new Comparator() { // from class: com.amazonaws.services.s3.model.transform.RequestXmlFactory.1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    PartETag partETag = (PartETag) obj;
                    PartETag partETag2 = (PartETag) obj2;
                    if (partETag.m1809() < partETag2.m1809()) {
                        return -1;
                    }
                    return partETag.m1809() > partETag2.m1809() ? 1 : 0;
                }
            });
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PartETag partETag = (PartETag) it.next();
                xmlWriter.m1655("Part");
                xmlWriter.m1655("PartNumber");
                xmlWriter.m1656(Integer.toString(partETag.m1809()));
                xmlWriter.m1654();
                xmlWriter.m1655("ETag");
                xmlWriter.m1656(partETag.m1808());
                xmlWriter.m1654();
                xmlWriter.m1654();
            }
        }
        xmlWriter.m1654();
        return xmlWriter.m1657();
    }
}
