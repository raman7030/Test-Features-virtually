package com.amazonaws.regions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegionMetadataParser {
    @Deprecated
    public RegionMetadataParser() {
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m1588(FileInputStream fileInputStream) {
        try {
            try {
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fileInputStream);
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                NodeList elementsByTagName = document.getElementsByTagName("Region");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < elementsByTagName.getLength(); i++) {
                    Node nodeItem = elementsByTagName.item(i);
                    if (nodeItem.getNodeType() == 1) {
                        Element element = (Element) nodeItem;
                        String strM1587 = m1587("Name", element);
                        m1587("Domain", element);
                        Region region = new Region(strM1587);
                        NodeList elementsByTagName2 = element.getElementsByTagName("Endpoint");
                        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
                            Element element2 = (Element) elementsByTagName2.item(i2);
                            String strM1588 = m1587("ServiceName", element2);
                            String strM1589 = m1587("Hostname", element2);
                            String strM15810 = m1587("Http", element2);
                            String strM15811 = m1587("Https", element2);
                            region.m1583().put(strM1588, strM1589);
                            region.m1580().put(strM1588, Boolean.valueOf("true".equals(strM15810)));
                            region.m1581().put(strM1588, Boolean.valueOf("true".equals(strM15811)));
                        }
                        arrayList.add(region);
                    }
                }
                return arrayList;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException("Unable to parse region metadata file: " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m1587(String str, Element element) {
        Node nodeItem = element.getElementsByTagName(str).item(0);
        if (nodeItem == null) {
            return null;
        }
        return nodeItem.getChildNodes().item(0).getNodeValue();
    }
}
