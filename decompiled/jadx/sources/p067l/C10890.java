package p067l;

import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59S0 */
/* JADX INFO: loaded from: classes4.dex */
public class C10890 extends AbstractC11070 {

    /* JADX INFO: renamed from: ۨ */
    public final boolean f30169;

    /* JADX INFO: renamed from: ܰ */
    public final String f30170;

    /* JADX INFO: renamed from: ᩺ */
    public transient C6196 f30171;

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܿ */
    public final C10890 mo25098() {
        return this;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩹֫ */
    public final boolean mo25100() {
        return true;
    }

    public C10890(File file, Uri uri, C6196 c6196) {
        super(file, uri);
        this.f30171 = c6196;
        this.f30170 = c6196.f15598;
        String path = file.getPath();
        this.f30169 = path.length() != 18 ? false : path.equalsIgnoreCase(c6196.m14040());
    }

    @Override // p067l.AbstractC11070
    /* JADX INFO: renamed from: ֫ */
    public C10890 mo20485(File file, Uri uri) {
        return new C10890(file, uri, m25090());
    }

    /* JADX INFO: renamed from: ֫ܽ */
    public final C6196 m25090() {
        C6196 c6196 = this.f30171;
        if (c6196 != null) {
            return c6196;
        }
        C6196 c6196M45797 = C20278.m45797(this.f30170);
        C12826.requireNonNull(c6196M45797);
        this.f30171 = c6196M45797;
        return c6196M45797;
    }

    @Override // p067l.AbstractC11070, p067l.C16433
    /* JADX INFO: renamed from: ᩶ۧ */
    public void mo25099() {
        super.mo25099();
        String str = mo33652().getPathSegments().get(3);
        C6196 c6196M25090 = m25090();
        synchronized (c6196M25090.f15595) {
            Iterator it = c6196M25090.f15595.values().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next())) {
                    it.remove();
                }
            }
        }
        C4081.m8188(new RunnableC18166(2, c6196M25090), c6196M25090, 500L);
    }

    @Override // p067l.AbstractC11070
    /* JADX INFO: renamed from: ᩺ۧ */
    public final void mo25102() {
        Cursor cursorQuery = C7050.m16233().query(m25090().f15594, new String[]{"document_id", "_display_name"}, null, null, null);
        if (cursorQuery == null) {
            try {
                C3513.m6291(this);
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m25095(File file, Uri uri, boolean z) {
        String strSubstring = file.getPath().substring(19);
        boolean z2 = !z && file.getName().equals(C16253.m37021(uri));
        C6196 c6196M25090 = m25090();
        String strM14041 = c6196M25090.m14041(strSubstring, z2);
        String str = uri.getPathSegments().get(3);
        if (strM14041.equals(str)) {
            return;
        }
        c6196M25090.f15595.put(C10965.m25286(new StringBuilder(), c6196M25090.f15593, strSubstring), str);
        C4081.m8188(new RunnableC18166(2, c6196M25090), c6196M25090, 500L);
    }

    @Override // p067l.AbstractC11070
    /* JADX INFO: renamed from: ֫ */
    public void mo25089(File file, Uri uri, boolean z) {
        m25095(file, uri, z);
    }

    @Override // p067l.C16433
    /* JADX INFO: renamed from: ֫ */
    public final void mo25088(Uri uri, boolean z) {
        super.mo25088(uri, z);
        m25095(new File(this.f30649.getPath()), uri, z);
    }

    @Override // p067l.AbstractC11070, p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ֨֫ */
    public final boolean mo25087() {
        if (this.f30169) {
            return true;
        }
        return super.mo25087();
    }

    @Override // p067l.AbstractC11070, p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۛ֫ */
    public final long mo25091() {
        if (this.f30169) {
            return 0L;
        }
        return super.mo25091();
    }

    @Override // p067l.AbstractC11070, p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۠֫ */
    public final boolean mo25093() {
        if (this.f30169) {
            return false;
        }
        return super.mo25093();
    }

    @Override // p067l.AbstractC11070, p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۤ */
    public boolean mo25094() {
        if (this.f30169) {
            return true;
        }
        return super.mo25094();
    }

    /* JADX INFO: renamed from: ܳܽ */
    public final boolean m25097() {
        return this.f30169;
    }

    @Override // p067l.AbstractC11070, p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩺֫ */
    public final long mo25101() {
        if (this.f30169) {
            return -1L;
        }
        return super.mo25101();
    }

    @Override // p067l.AbstractC11070
    /* JADX INFO: renamed from: ۨۧ */
    public final boolean mo25096() {
        return "com.android.mtp.documents".equals(mo33652().getAuthority());
    }

    @Override // p067l.AbstractC11070
    /* JADX INFO: renamed from: ۟ۧ */
    public boolean mo25092() throws IOException {
        if (this.f30169) {
            return true;
        }
        C6196 c6196M25090 = m25090();
        Uri uri = c6196M25090.f15594;
        Uri uriM37020 = C16253.m37020(uri);
        String path = this.f30649.getPath();
        int length = c6196M25090.m14040().length() + 1;
        boolean zEquals = true;
        while (length < path.length()) {
            int iIndexOf = path.indexOf(47, length);
            if (iIndexOf < 0) {
                iIndexOf = path.length();
            }
            String strSubstring = path.substring(length, iIndexOf);
            Cursor cursorQuery = C7050.m16233().query(C16253.m37018(uriM37020), new String[]{"document_id", "_display_name", "mime_type"}, null, null, null);
            if (cursorQuery == null) {
                throw new IOException("Provider directory is unavailable");
            }
            Uri uri2 = null;
            while (cursorQuery.moveToNext()) {
                try {
                    String string = cursorQuery.getString(1);
                    String string2 = cursorQuery.getString(0);
                    if (string == null || string2 == null) {
                        throw new IOException("Provider returned invalid child identity");
                    }
                    if (strSubstring.equals(string)) {
                        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, string2);
                        if (uri2 != null && !uri2.equals(uriBuildDocumentUriUsingTree)) {
                            throw new IOException("Provider path has ambiguous child names");
                        }
                        uri2 = uriBuildDocumentUriUsingTree;
                        zEquals = "vnd.android.document/directory".equals(cursorQuery.getString(2));
                    }
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorQuery.close();
            if (uri2 == null) {
                return false;
            }
            if (iIndexOf < path.length() && !zEquals) {
                throw new IOException("Provider path parent is not a directory");
            }
            length = iIndexOf + 1;
            uriM37020 = uri2;
        }
        if (!uriM37020.equals(mo33652())) {
            mo25088(uriM37020, zEquals);
        }
        return true;
    }
}
