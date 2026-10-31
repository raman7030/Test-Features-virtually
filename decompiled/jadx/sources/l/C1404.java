package l;

import com.thegrizzlylabs.sardineandroid.model.Propstat;
import com.thegrizzlylabs.sardineandroid.model.Resourcetype;
import com.thegrizzlylabs.sardineandroid.model.Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: l.֨᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: SA89 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1404 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Long f5055;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f5056;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Date f5057;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f5058;

    public C1404(C8460 c8460, Response response) {
        String creationdate;
        String getlastmodified;
        List list;
        Resourcetype resourcetype;
        List propstat = response.getPropstat();
        String getcontenttype = null;
        if (propstat.isEmpty()) {
            creationdate = null;
            break;
        }
        Iterator it = propstat.iterator();
        while (true) {
            if (!it.hasNext()) {
                creationdate = null;
                break;
            }
            Propstat propstat2 = (Propstat) it.next();
            if (propstat2.getProp() != null) {
                creationdate = propstat2.getProp().getCreationdate();
                break;
            }
        }
        C14746.m35047(creationdate);
        List propstat3 = response.getPropstat();
        if (propstat3.isEmpty()) {
            getlastmodified = null;
            break;
        }
        Iterator it2 = propstat3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                getlastmodified = null;
                break;
            }
            Propstat propstat4 = (Propstat) it2.next();
            if (propstat4.getProp() != null) {
                getlastmodified = propstat4.getProp().getGetlastmodified();
                break;
            }
        }
        this.f5057 = C14746.m35047(getlastmodified);
        List propstat5 = response.getPropstat();
        if (!propstat5.isEmpty()) {
            Iterator it3 = propstat5.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    getcontenttype = "application/octet-stream";
                    break;
                }
                Propstat propstat6 = (Propstat) it3.next();
                if (propstat6.getProp() != null) {
                    Resourcetype resourcetype2 = propstat6.getProp().getResourcetype();
                    if (resourcetype2 != null && resourcetype2.getCollection() != null) {
                        getcontenttype = "httpd/unix-directory";
                        break;
                    } else if (propstat6.getProp().getGetcontenttype() != null) {
                        getcontenttype = propstat6.getProp().getGetcontenttype();
                        break;
                    }
                }
            }
        }
        this.f5056 = getcontenttype;
        this.f5055 = Long.valueOf(C8460.m22141(c8460, response));
        List<Propstat> propstat7 = response.getPropstat();
        if (!propstat7.isEmpty()) {
            for (Propstat propstat8 : propstat7) {
                if (propstat8.getProp() != null) {
                    propstat8.getProp().getGetetag();
                    break;
                }
            }
        }
        List<Propstat> propstat9 = response.getPropstat();
        if (!propstat9.isEmpty()) {
            for (Propstat propstat10 : propstat9) {
                if (propstat10.getProp() != null) {
                    propstat10.getProp().getDisplayname();
                    break;
                }
            }
        }
        List<Propstat> propstat11 = response.getPropstat();
        if (propstat11.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Propstat propstat12 : propstat11) {
                if (propstat12.getProp() != null && (resourcetype = propstat12.getProp().getResourcetype()) != null) {
                    if (resourcetype.getCollection() != null) {
                        arrayList.add(new QName("DAV:", "collection", "D"));
                    }
                    if (resourcetype.getPrincipal() != null) {
                        arrayList.add(new QName("DAV:", "principal", "D"));
                    }
                    Iterator it4 = resourcetype.getAny().iterator();
                    while (it4.hasNext()) {
                        arrayList.add(C14746.m35048((Element) it4.next()));
                    }
                }
            }
            list = arrayList;
        }
        this.f5058 = list;
        List<Propstat> propstat13 = response.getPropstat();
        if (!propstat13.isEmpty()) {
            for (Propstat propstat14 : propstat13) {
                if (propstat14.getProp() != null) {
                    Resourcetype resourcetype3 = propstat14.getProp().getResourcetype();
                    if (resourcetype3 != null && resourcetype3.getCollection() != null) {
                        break;
                    }
                    propstat14.getProp().getGetcontentlanguage();
                    break;
                }
            }
        }
        List<Propstat> propstat15 = response.getPropstat();
        if (!propstat15.isEmpty()) {
            HashMap map = new HashMap();
            for (Propstat propstat16 : propstat15) {
                if (propstat16.getProp() != null) {
                    for (Element element : propstat16.getProp().getAny()) {
                        map.put(C14746.m35048(element), element.getTextContent());
                    }
                }
            }
        }
        List<Propstat> propstat17 = response.getPropstat();
        if (!propstat17.isEmpty()) {
            for (Propstat propstat18 : propstat17) {
                if (propstat18.getProp() != null) {
                    propstat18.getProp().getLockdiscovery();
                    break;
                }
            }
        }
        List<Propstat> propstat19 = response.getPropstat();
        if (propstat19.isEmpty()) {
            return;
        }
        for (Propstat propstat20 : propstat19) {
            if (propstat20.getProp() != null) {
                propstat20.getProp().getSupportedlock();
                return;
            }
        }
    }
}
