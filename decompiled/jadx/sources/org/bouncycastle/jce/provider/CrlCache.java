package org.bouncycastle.jce.provider;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URLConnection;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Iterable;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;
import p067l.C21562;

/* JADX INFO: loaded from: classes.dex */
public class CrlCache {
    public static final int DEFAULT_TIMEOUT = 15000;
    public static Map cache = C21562.synchronizedMap(new WeakHashMap());

    /* JADX INFO: loaded from: classes2.dex */
    public class LocalCRLStore implements PKIXCRLStore, Iterable {
        public Collection _local;

        public LocalCRLStore(Store store) {
            this._local = new ArrayList(store.getMatches(null));
        }

        @Override // org.bouncycastle.jcajce.PKIXCRLStore, org.bouncycastle.util.Store
        public Collection getMatches(Selector selector) {
            if (selector == null) {
                return new ArrayList(this._local);
            }
            ArrayList arrayList = new ArrayList();
            for (CRL crl : this._local) {
                if (selector.match(crl)) {
                    arrayList.add(crl);
                }
            }
            return arrayList;
        }

        @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
        public Iterator iterator() {
            return getMatches(null).iterator();
        }
    }

    public static synchronized PKIXCRLStore getCrl(CertificateFactory certificateFactory, Date date, URI uri) {
        WeakReference weakReference = (WeakReference) cache.get(uri);
        PKIXCRLStore pKIXCRLStore = weakReference != null ? (PKIXCRLStore) weakReference.get() : null;
        if (pKIXCRLStore != null) {
            Iterator it = pKIXCRLStore.getMatches(null).iterator();
            while (true) {
                if (!it.hasNext()) {
                    return pKIXCRLStore;
                }
                Date nextUpdate = ((X509CRL) it.next()).getNextUpdate();
                if (nextUpdate != null && nextUpdate.before(date)) {
                    break;
                }
            }
        }
        LocalCRLStore localCRLStore = new LocalCRLStore(new CollectionStore(uri.getScheme().equals("ldap") ? getCrlsFromLDAP(certificateFactory, uri) : getCrls(certificateFactory, uri)));
        cache.put(uri, new WeakReference(localCRLStore));
        return localCRLStore;
    }

    public static Collection getCrls(CertificateFactory certificateFactory, URI uri) throws IOException, CRLException {
        URLConnection uRLConnectionOpenConnection = uri.toURL().openConnection();
        uRLConnectionOpenConnection.setConnectTimeout(15000);
        uRLConnectionOpenConnection.setReadTimeout(15000);
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        Collection<? extends CRL> collectionGenerateCRLs = certificateFactory.generateCRLs(inputStream);
        inputStream.close();
        return collectionGenerateCRLs;
    }

    public static Collection getCrlsFromLDAP(CertificateFactory certificateFactory, URI uri) throws CRLException {
        Hashtable hashtable = new Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        hashtable.put("java.naming.provider.url", uri.toString());
        try {
            byte[] bArr = (byte[]) new InitialDirContext(hashtable).getAttributes("").get("certificateRevocationList;binary").get();
            if (bArr != null && bArr.length != 0) {
                return certificateFactory.generateCRLs(new ByteArrayInputStream(bArr));
            }
            throw new CRLException("no CRL returned from: " + uri);
        } catch (NamingException e) {
            throw new CRLException("issue connecting to: " + uri.toString(), e);
        }
    }
}
