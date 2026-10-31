package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.PartETag;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RequestXmlFactory {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m705(List list) {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.m489("CompleteMultipartUpload");
        if (list != null) {
            Collections.sort(list, new Comparator() { // from class: com.amazonaws.services.s3.model.transform.RequestXmlFactory.1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    PartETag partETag = (PartETag) obj;
                    PartETag partETag2 = (PartETag) obj2;
                    if (partETag.m644() < partETag2.m644()) {
                        return -1;
                    }
                    return partETag.m644() > partETag2.m644() ? 1 : 0;
                }
            });
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PartETag partETag = (PartETag) it.next();
                xmlWriter.m489("Part");
                xmlWriter.m489("PartNumber");
                xmlWriter.m490(Integer.toString(partETag.m644()));
                xmlWriter.m488();
                xmlWriter.m489("ETag");
                xmlWriter.m490(partETag.m643());
                xmlWriter.m488();
                xmlWriter.m488();
            }
        }
        xmlWriter.m488();
        return xmlWriter.m491();
    }
}
