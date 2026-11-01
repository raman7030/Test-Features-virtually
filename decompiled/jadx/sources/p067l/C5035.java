package p067l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6YB */
/* JADX INFO: loaded from: classes2.dex */
public final class C5035 extends AbstractC12351 {

    /* JADX INFO: renamed from: ۧ */
    public Uri f11565;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC11070 f11566;

    public C5035(AbstractC11070 abstractC11070) {
        super(abstractC11070);
        this.f11566 = abstractC11070;
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ֫ */
    public final EnumC6986 mo10729(EnumC15032 enumC15032) {
        if (m10724(this.f11566) && enumC15032 != EnumC15032.STAT && enumC15032 != EnumC15032.LIST) {
            return EnumC6986.UNSUPPORTED;
        }
        switch (C17774.f53078[enumC15032.ordinal()]) {
            case 1:
            case 2:
                return EnumC6986.SUPPORTED;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return EnumC6986.BEST_EFFORT;
            case 8:
                return EnumC6986.UNSUPPORTED;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ܽ */
    public final void mo10735() throws C23750 {
        EnumC15032 enumC15032 = EnumC15032.CREATE_FILE_EXCLUSIVE;
        m10726(enumC15032);
        EnumC5645 enumC5645M32962 = mo10732().m32962();
        EnumC5645 enumC5645 = EnumC5645.MISSING;
        AbstractC17043 abstractC17043 = this.f34467;
        if (enumC5645M32962 != enumC5645) {
            throw C23750.m52795(enumC15032, EnumC23080.ALREADY_EXISTS, abstractC17043.mo25505(), (String) null);
        }
        AbstractC11070 abstractC11070 = this.f11566;
        AbstractC11070 abstractC11070Mo20487 = abstractC11070.mo20487();
        File file = abstractC11070.f30649;
        if (abstractC11070Mo20487 == null) {
            throw m28437(enumC15032, (String) null);
        }
        m10722(new C5035(abstractC11070Mo20487).mo10732(), enumC15032);
        try {
            Uri uriCreateDocument = DocumentsContract.createDocument(C7050.m16233(), C16253.m37020(abstractC11070Mo20487.mo33652()), "*/*", file.getName());
            if (uriCreateDocument == null) {
                throw m10720(enumC15032, (String) null, (Exception) null);
            }
            this.f11565 = uriCreateDocument;
            abstractC11070.mo25088(uriCreateDocument, false);
            if (!C12826.equals(file.getName(), C24971.m54868(uriCreateDocument)) && !C12826.equals(file.getName(), C16253.m37021(uriCreateDocument))) {
                if (!DocumentsContract.deleteDocument(C7050.m16233(), uriCreateDocument)) {
                    throw m10720(enumC15032, (String) null, new IOException("Failed to clean up provider-renamed file"));
                }
                this.f11565 = null;
                throw C23750.m52795(enumC15032, EnumC23080.ALREADY_EXISTS, abstractC17043.mo25505(), (String) null);
            }
            this.f11565 = null;
        } catch (SecurityException e) {
            throw m10721(EnumC15032.CREATE_FILE_EXCLUSIVE, (String) null, e);
        } catch (C23750 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m10720(EnumC15032.CREATE_FILE_EXCLUSIVE, (String) null, e3);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10731() throws C23750 {
        if (this.f11565 == null) {
            return super.mo10731();
        }
        try {
            if (!DocumentsContract.deleteDocument(C7050.m16233(), this.f11565)) {
                return false;
            }
            this.f11565 = null;
            this.f11566.mo25099();
            return true;
        } catch (SecurityException e) {
            throw m10721(EnumC15032.DELETE_FILE_OR_LINK, (String) null, e);
        } catch (Exception e2) {
            throw m10720(EnumC15032.DELETE_FILE_OR_LINK, (String) null, e2);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ۜ */
    public final C14362 mo10732() throws C23750 {
        C14362 c14362Mo25492;
        AbstractC17043 abstractC17043 = this.f34467;
        AbstractC11070 abstractC11070 = this.f11566;
        ContentResolver contentResolverM16233 = C7050.m16233();
        try {
            if (!abstractC11070.mo25092()) {
                return C14362.m32958(abstractC17043);
            }
            Cursor cursorQuery = contentResolverM16233.query(C16253.m37020(abstractC11070.mo33652()), abstractC11070.mo25504(), null, null, null);
            try {
                if (cursorQuery == null) {
                    c14362Mo25492 = m10727();
                    if (cursorQuery != null) {
                    }
                    return c14362Mo25492;
                }
                if (!cursorQuery.moveToFirst()) {
                    c14362Mo25492 = C14362.m32958(abstractC17043);
                } else {
                    c14362Mo25492 = abstractC11070.mo25492(cursorQuery);
                }
                cursorQuery.close();
                return c14362Mo25492;
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
        } catch (SecurityException e) {
            throw m10721(EnumC15032.STAT, (String) null, e);
        } catch (C23750 e2) {
            throw e2;
        } catch (Exception e3) {
            C23750 c23750M10720 = m10720(EnumC15032.STAT, (String) null, e3);
            if (c23750M10720.m52799() == EnumC23080.NOT_FOUND) {
                return C14362.m32958(abstractC17043);
            }
            throw c23750M10720;
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ֫ */
    public final List mo10728(C14362 c14362) {
        if (c14362.m32959() != this.f11566) {
            throw new IllegalArgumentException("Directory snapshot belongs to another file");
        }
        return m10725(c14362);
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ܳ */
    public final List mo10734() {
        return m10725(mo10732());
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ᩻ */
    public final List mo10738() {
        return m10725(mo10732());
    }

    /* JADX INFO: renamed from: ۧ */
    private ArrayList m10725(C14362 c14362) throws C23750 {
        AbstractC11070 abstractC11070 = this.f11566;
        EnumC15032 enumC15032 = EnumC15032.LIST;
        m10722(c14362, enumC15032);
        ContentResolver contentResolverM16233 = C7050.m16233();
        ArrayList arrayList = new ArrayList();
        try {
            Uri uriMo33652 = abstractC11070.mo33652();
            File file = abstractC11070.f30649;
            Cursor cursorQuery = contentResolverM16233.query(C16253.m37018(uriMo33652), abstractC11070.mo25499(), null, null, null);
            try {
                if (cursorQuery == null) {
                    throw m10720(enumC15032, (String) null, (Exception) null);
                }
                HashMap map = new HashMap();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string == null || string2 == null) {
                        throw m10720(EnumC15032.LIST, (String) null, (Exception) null);
                    }
                    String str = (String) C15525.putIfAbsent(map, string2, string);
                    if (str != null) {
                        if (!str.equals(string)) {
                            throw m10720(EnumC15032.LIST, (String) null, new IOException("Provider returned ambiguous child names"));
                        }
                    } else {
                        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(abstractC11070.mo33652(), string);
                        C14362 c14362Mo25501 = ((AbstractC11070) abstractC11070.mo25494(new File(file, string2), uriBuildDocumentUriUsingTree, cursorQuery)).mo25501(cursorQuery);
                        abstractC11070.mo25089(new File(file, string2), uriBuildDocumentUriUsingTree, c14362Mo25501.m32962() == EnumC5645.DIRECTORY);
                        arrayList.add(c14362Mo25501);
                    }
                }
                cursorQuery.close();
                return arrayList;
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
        } catch (SecurityException e) {
            throw m10721(EnumC15032.LIST, (String) null, e);
        } catch (C23750 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m10720(EnumC15032.LIST, (String) null, e3);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ۧ */
    public final void mo10733() throws C23750 {
        EnumC15032 enumC15032 = EnumC15032.CREATE_DIRECTORY_SINGLE;
        m10726(enumC15032);
        EnumC5645 enumC5645M32962 = mo10732().m32962();
        EnumC5645 enumC5645 = EnumC5645.MISSING;
        AbstractC17043 abstractC17043 = this.f34467;
        if (enumC5645M32962 != enumC5645) {
            throw C23750.m52795(enumC15032, EnumC23080.ALREADY_EXISTS, abstractC17043.mo25505(), (String) null);
        }
        AbstractC11070 abstractC11070 = this.f11566;
        AbstractC11070 abstractC11070Mo20487 = abstractC11070.mo20487();
        File file = abstractC11070.f30649;
        if (abstractC11070Mo20487 == null) {
            throw m28437(enumC15032, (String) null);
        }
        m10722(new C5035(abstractC11070Mo20487).mo10732(), enumC15032);
        try {
            Uri uriCreateDocument = DocumentsContract.createDocument(C7050.m16233(), C16253.m37020(abstractC11070Mo20487.mo33652()), "vnd.android.document/directory", file.getName());
            if (uriCreateDocument == null) {
                throw m10720(enumC15032, (String) null, (Exception) null);
            }
            if (!C12826.equals(file.getName(), C24971.m54868(uriCreateDocument)) && !C12826.equals(file.getName(), C16253.m37021(uriCreateDocument))) {
                DocumentsContract.deleteDocument(C7050.m16233(), uriCreateDocument);
                throw C23750.m52795(enumC15032, EnumC23080.ALREADY_EXISTS, abstractC17043.mo25505(), (String) null);
            }
            abstractC11070.mo25088(uriCreateDocument, true);
        } catch (SecurityException e) {
            throw m10721(EnumC15032.CREATE_DIRECTORY_SINGLE, (String) null, e);
        } catch (C23750 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m10720(EnumC15032.CREATE_DIRECTORY_SINGLE, (String) null, e3);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ܿ */
    public final void mo10736() throws C23750 {
        AbstractC11070 abstractC11070 = this.f11566;
        EnumC15032 enumC15032 = EnumC15032.DELETE_FILE_OR_LINK;
        m10726(enumC15032);
        C14362 c14362Mo10732 = mo10732();
        EnumC5645 enumC5645M32962 = c14362Mo10732.m32962();
        EnumC5645 enumC5645 = EnumC5645.MISSING;
        AbstractC17043 abstractC17043 = this.f34467;
        if (enumC5645M32962 == enumC5645) {
            throw C23750.m52795(enumC15032, EnumC23080.NOT_FOUND, abstractC17043.mo25505(), (String) null);
        }
        if (c14362Mo10732.m32962() != EnumC5645.REGULAR && c14362Mo10732.m32962() != EnumC5645.LINK) {
            throw C23750.m52795(enumC15032, EnumC23080.NOT_REGULAR_FILE, abstractC17043.mo25505(), (String) null);
        }
        try {
            if (!DocumentsContract.deleteDocument(C7050.m16233(), C16253.m37020(abstractC11070.mo33652()))) {
                throw m10720(enumC15032, (String) null, (Exception) null);
            }
            abstractC11070.mo25099();
        } catch (SecurityException e) {
            throw m10721(EnumC15032.DELETE_FILE_OR_LINK, (String) null, e);
        } catch (C23750 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m10720(EnumC15032.DELETE_FILE_OR_LINK, (String) null, e3);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10737() throws C23750 {
        AbstractC11070 abstractC11070 = this.f11566;
        EnumC15032 enumC15032 = EnumC15032.DELETE_EMPTY_DIRECTORY;
        m10726(enumC15032);
        m10722(mo10732(), enumC15032);
        if (!m10725(mo10732()).isEmpty()) {
            throw C23750.m52795(enumC15032, EnumC23080.DIRECTORY_NOT_EMPTY, this.f34467.mo25505(), (String) null);
        }
        try {
            if (!DocumentsContract.deleteDocument(C7050.m16233(), C16253.m37020(abstractC11070.mo33652()))) {
                throw m10720(enumC15032, (String) null, (Exception) null);
            }
            abstractC11070.mo25099();
        } catch (SecurityException e) {
            throw m10721(EnumC15032.DELETE_EMPTY_DIRECTORY, (String) null, e);
        } catch (C23750 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m10720(EnumC15032.DELETE_EMPTY_DIRECTORY, (String) null, e3);
        }
    }

    @Override // p067l.AbstractC12351
    /* JADX INFO: renamed from: ֫ */
    public final void mo10730(AbstractC17043 abstractC17043) throws C23750 {
        Uri uriMoveDocument;
        EnumC15032 enumC15032 = EnumC15032.RENAME_NO_REPLACE;
        m10726(enumC15032);
        boolean z = abstractC17043 instanceof AbstractC11070;
        AbstractC17043 abstractC17044 = this.f34467;
        if (z) {
            AbstractC11070 abstractC11070 = (AbstractC11070) abstractC17043;
            File file = abstractC11070.f30649;
            AbstractC11070 abstractC11071 = this.f11566;
            String strMo20488 = abstractC11071.mo20488();
            File file2 = abstractC11071.f30649;
            if (C12826.equals(strMo20488, abstractC11070.mo20488())) {
                if (m10724(abstractC11070)) {
                    throw m28437(enumC15032, file.getPath());
                }
                if (!C12826.equals(file2.getParent(), file.getParent()) && !C12826.equals(file2.getName(), file.getName())) {
                    throw m28437(enumC15032, file.getPath());
                }
                C14362 c14362Mo10732 = mo10732();
                EnumC5645 enumC5645M32962 = c14362Mo10732.m32962();
                EnumC5645 enumC5645 = EnumC5645.MISSING;
                if (enumC5645M32962 == enumC5645) {
                    throw C23750.m52795(enumC15032, EnumC23080.NOT_FOUND, abstractC17044.mo25505(), file.getPath());
                }
                if (new C5035(abstractC11070).mo10732().m32962() != enumC5645) {
                    throw C23750.m52795(enumC15032, EnumC23080.ALREADY_EXISTS, abstractC17044.mo25505(), file.getPath());
                }
                AbstractC11070 abstractC11070Mo20487 = abstractC11071.mo20487();
                AbstractC11070 abstractC11070Mo20488 = abstractC11070.mo20487();
                if (abstractC11070Mo20487 == null || abstractC11070Mo20488 == null || !C12826.equals(abstractC11070Mo20487.mo20488(), abstractC11070Mo20488.mo20488())) {
                    throw C23750.m52795(enumC15032, EnumC23080.CROSS_BACKEND, abstractC17044.mo25505(), file.getPath());
                }
                m10722(new C5035(abstractC11070Mo20488).mo10732(), enumC15032);
                ContentResolver contentResolverM16233 = C7050.m16233();
                Uri uriM37020 = C16253.m37020(abstractC11071.mo33652());
                try {
                    if (C12826.equals(file2.getParent(), file.getParent())) {
                        uriMoveDocument = DocumentsContract.renameDocument(contentResolverM16233, uriM37020, file.getName());
                        m10723(enumC15032, uriMoveDocument, file.getName(), ((AbstractC11070) abstractC17043).f30649.getPath());
                    } else {
                        if (Build.VERSION.SDK_INT < 24) {
                            throw m28437(enumC15032, ((AbstractC11070) abstractC17043).f30649.getPath());
                        }
                        uriMoveDocument = DocumentsContract.moveDocument(contentResolverM16233, uriM37020, C16253.m37020(abstractC11070Mo20487.mo33652()), C16253.m37020(abstractC11070Mo20488.mo33652()));
                        m10723(enumC15032, uriMoveDocument, file.getName(), ((AbstractC11070) abstractC17043).f30649.getPath());
                    }
                    abstractC11071.mo25099();
                    abstractC11070.mo25088(uriMoveDocument, c14362Mo10732.m32962() == EnumC5645.DIRECTORY);
                    return;
                } catch (SecurityException e) {
                    throw m10721(EnumC15032.RENAME_NO_REPLACE, file.getPath(), e);
                } catch (UnsupportedOperationException unused) {
                    throw m28437(EnumC15032.RENAME_NO_REPLACE, file.getPath());
                } catch (C23750 e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw m10720(EnumC15032.RENAME_NO_REPLACE, file.getPath(), e3);
                }
            }
        }
        throw C23750.m52795(enumC15032, EnumC23080.CROSS_BACKEND, abstractC17044.mo25505(), abstractC17043.mo25505());
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10723(EnumC15032 enumC15032, Uri uri, String str, String str2) throws C23750 {
        if (uri == null) {
            throw m10720(enumC15032, str2, (Exception) null);
        }
        if (!C12826.equals(str, C24971.m54868(uri)) && !C12826.equals(str, C16253.m37021(uri))) {
            throw m10720(enumC15032, str2, new IOException("Provider returned an unexpected document name"));
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private C14362 m10727() throws C23750 {
        AbstractC17043 abstractC17043 = this.f34467;
        AbstractC11070 abstractC11070 = this.f11566;
        AbstractC11070 abstractC11070Mo20487 = abstractC11070.mo20487();
        if (abstractC11070Mo20487 == null) {
            throw m10720(EnumC15032.STAT, (String) null, (Exception) null);
        }
        try {
            for (C14362 c14362 : (ArrayList) new C5035(abstractC11070Mo20487).mo10734()) {
                if (abstractC17043.mo25505().equals(c14362.m32959().mo25505())) {
                    abstractC11070.mo25088(((AbstractC11070) c14362.m32959()).mo33652(), c14362.m32962() == EnumC5645.DIRECTORY);
                    return new C14362(this.f34467, c14362.m32962(), c14362.m32961(), c14362.m32960(), c14362.m32963());
                }
            }
            return C14362.m32958(abstractC17043);
        } catch (C23750 e) {
            if (e.m52799() == EnumC23080.NOT_FOUND) {
                return C14362.m32958(abstractC17043);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m10724(AbstractC11070 abstractC11070) {
        if (!(abstractC11070 instanceof C14912)) {
            return false;
        }
        C14912 c14912 = (C14912) abstractC11070;
        return c14912.f30169 || c14912.m34132();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m10726(EnumC15032 enumC15032) throws C23750 {
        if (m10724(this.f11566)) {
            throw m28437(enumC15032, (String) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10722(C14362 c14362, EnumC15032 enumC15032) throws C23750 {
        if (c14362.m32962() == EnumC5645.MISSING) {
            throw C23750.m52795(enumC15032, EnumC23080.NOT_FOUND, c14362.m32959().mo25505(), (String) null);
        }
        if (c14362.m32962() != EnumC5645.DIRECTORY) {
            throw C23750.m52795(enumC15032, EnumC23080.NOT_DIRECTORY, c14362.m32959().mo25505(), (String) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C23750 m10721(EnumC15032 enumC15032, String str, SecurityException securityException) {
        EnumC23080 enumC23080 = EnumC23080.PERMISSION_DENIED;
        AbstractC17043 abstractC17043 = this.f34467;
        String strMo25505 = abstractC17043.mo25505();
        StringBuilder sb = new StringBuilder("Checked file operation ");
        sb.append(enumC15032);
        sb.append(" failed for ");
        return new C23750(enumC15032, enumC23080, strMo25505, str, C6316.m14442(abstractC17043, sb), securityException);
    }

    /* JADX INFO: renamed from: ֫ */
    private C23750 m10720(EnumC15032 enumC15032, String str, Exception exc) {
        StringBuilder sb = new StringBuilder("Checked file operation ");
        sb.append(enumC15032);
        sb.append(" failed for ");
        AbstractC17043 abstractC17043 = this.f34467;
        String strM14442 = C6316.m14442(abstractC17043, sb);
        if (exc == null) {
            return new C23750(enumC15032, EnumC23080.IO_ERROR, abstractC17043.mo25505(), str, strM14442);
        }
        if (!(exc instanceof IOException)) {
            return new C23750(enumC15032, EnumC23080.IO_ERROR, abstractC17043.mo25505(), str, strM14442, exc);
        }
        return C23750.m52794(enumC15032, abstractC17043.mo25505(), str, (IOException) exc);
    }
}
