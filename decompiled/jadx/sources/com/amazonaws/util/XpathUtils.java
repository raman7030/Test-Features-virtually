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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Log f853 = LogFactory.m302(XpathUtils.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static DocumentBuilderFactory f852 = DocumentBuilderFactory.newInstance();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Document m801(String str) throws SAXException, IOException {
        NamespaceRemovingInputStream namespaceRemovingInputStream = new NamespaceRemovingInputStream(new ByteArrayInputStream(str.getBytes(StringUtils.f844)));
        Document document = f852.newDocumentBuilder().parse(namespaceRemovingInputStream);
        namespaceRemovingInputStream.close();
        return document;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m800(String str, Document document) {
        if (document == null) {
            return null;
        }
        if (".".equals(str) || ((Node) XPathFactory.newInstance().newXPath().evaluate(str, document, XPathConstants.NODE)) != null) {
            return XPathFactory.newInstance().newXPath().evaluate(str, document).trim();
        }
        return null;
    }
}
