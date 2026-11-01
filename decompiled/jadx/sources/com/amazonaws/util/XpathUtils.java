package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
public class XpathUtils {

    /* JADX INFO: renamed from: ۧ */
    public static Log f2013 = LogFactory.m1468(XpathUtils.class);

    /* JADX INFO: renamed from: ֫ */
    public static DocumentBuilderFactory f2012 = DocumentBuilderFactory.newInstance();

    /* JADX INFO: renamed from: ֫ */
    public static Document m1966(String str) throws SAXException, IOException {
        NamespaceRemovingInputStream namespaceRemovingInputStream = new NamespaceRemovingInputStream(new ByteArrayInputStream(str.getBytes(StringUtils.f2004)));
        Document document = f2012.newDocumentBuilder().parse(namespaceRemovingInputStream);
        namespaceRemovingInputStream.close();
        return document;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m1965(String str, Document document) {
        if (document == null) {
            return null;
        }
        if (".".equals(str) || ((Node) XPathFactory.newInstance().newXPath().evaluate(str, document, XPathConstants.NODE)) != null) {
            return XPathFactory.newInstance().newXPath().evaluate(str, document).trim();
        }
        return null;
    }
}
