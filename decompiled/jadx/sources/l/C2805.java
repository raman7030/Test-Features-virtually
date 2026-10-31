package l;

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
public final class C2805 extends AbstractC10503 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Uri f8771;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC9155 f8772;

    public C2805(AbstractC9155 abstractC9155) {
        super(abstractC9155);
        this.f8772 = abstractC9155;
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC4858 mo8669(EnumC13324 enumC13324) {
        if (m8664(this.f8772) && enumC13324 != EnumC13324.STAT && enumC13324 != EnumC13324.LIST) {
            return EnumC4858.UNSUPPORTED;
        }
        switch (C16209.f49912[enumC13324.ordinal()]) {
            case 1:
            case 2:
                return EnumC4858.SUPPORTED;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return EnumC4858.BEST_EFFORT;
            case 8:
                return EnumC4858.UNSUPPORTED;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo8675() throws C22497 {
        EnumC13324 enumC13324 = EnumC13324.CREATE_FILE_EXCLUSIVE;
        m8666(enumC13324);
        EnumC3447 enumC3447M30885 = mo8672().m30885();
        EnumC3447 enumC3447 = EnumC3447.MISSING;
        AbstractC15440 abstractC15440 = this.f31505;
        if (enumC3447M30885 != enumC3447) {
            throw C22497.m50454(enumC13324, EnumC21792.ALREADY_EXISTS, abstractC15440.mo23554(), (String) null);
        }
        AbstractC9155 abstractC9155 = this.f8772;
        AbstractC9155 abstractC9155Mo18538 = abstractC9155.mo18538();
        File file = abstractC9155.f27709;
        if (abstractC9155Mo18538 == null) {
            throw m26404(enumC13324, (String) null);
        }
        m8662(new C2805(abstractC9155Mo18538).mo8672(), enumC13324);
        try {
            Uri uriCreateDocument = DocumentsContract.createDocument(C4925.m14336(), C14609.m34869(abstractC9155Mo18538.mo31567()), "*/*", file.getName());
            if (uriCreateDocument == null) {
                throw m8660(enumC13324, (String) null, (Exception) null);
            }
            this.f8771 = uriCreateDocument;
            abstractC9155.mo23114(uriCreateDocument, false);
            if (!C11003.equals(file.getName(), C23782.m52459(uriCreateDocument)) && !C11003.equals(file.getName(), C14609.m34870(uriCreateDocument))) {
                if (!DocumentsContract.deleteDocument(C4925.m14336(), uriCreateDocument)) {
                    throw m8660(enumC13324, (String) null, new IOException("Failed to clean up provider-renamed file"));
                }
                this.f8771 = null;
                throw C22497.m50454(enumC13324, EnumC21792.ALREADY_EXISTS, abstractC15440.mo23554(), (String) null);
            }
            this.f8771 = null;
        } catch (SecurityException e) {
            throw m8661(EnumC13324.CREATE_FILE_EXCLUSIVE, (String) null, e);
        } catch (C22497 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m8660(EnumC13324.CREATE_FILE_EXCLUSIVE, (String) null, e3);
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8671() throws C22497 {
        if (this.f8771 == null) {
            return super.mo8671();
        }
        try {
            if (!DocumentsContract.deleteDocument(C4925.m14336(), this.f8771)) {
                return false;
            }
            this.f8771 = null;
            this.f8772.mo23125();
            return true;
        } catch (SecurityException e) {
            throw m8661(EnumC13324.DELETE_FILE_OR_LINK, (String) null, e);
        } catch (Exception e2) {
            throw m8660(EnumC13324.DELETE_FILE_OR_LINK, (String) null, e2);
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12619 mo8672() throws C22497 {
        C12619 c12619Mo23541;
        AbstractC15440 abstractC15440 = this.f31505;
        AbstractC9155 abstractC9155 = this.f8772;
        ContentResolver contentResolverM14336 = C4925.m14336();
        try {
            if (!abstractC9155.mo23118()) {
                return C12619.m30881(abstractC15440);
            }
            Cursor cursorQuery = contentResolverM14336.query(C14609.m34869(abstractC9155.mo31567()), abstractC9155.mo23553(), null, null, null);
            try {
                if (cursorQuery == null) {
                    c12619Mo23541 = m8667();
                    if (cursorQuery != null) {
                    }
                    return c12619Mo23541;
                }
                if (!cursorQuery.moveToFirst()) {
                    c12619Mo23541 = C12619.m30881(abstractC15440);
                } else {
                    c12619Mo23541 = abstractC9155.mo23541(cursorQuery);
                }
                cursorQuery.close();
                return c12619Mo23541;
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
            throw m8661(EnumC13324.STAT, (String) null, e);
        } catch (C22497 e2) {
            throw e2;
        } catch (Exception e3) {
            C22497 c22497M8660 = m8660(EnumC13324.STAT, (String) null, e3);
            if (c22497M8660.m50458() == EnumC21792.NOT_FOUND) {
                return C12619.m30881(abstractC15440);
            }
            throw c22497M8660;
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List mo8668(C12619 c12619) {
        if (c12619.m30882() != this.f8772) {
            throw new IllegalArgumentException("Directory snapshot belongs to another file");
        }
        return m8665(c12619);
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List mo8674() {
        return m8665(mo8672());
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List mo8678() {
        return m8665(mo8672());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private ArrayList m8665(C12619 c12619) throws C22497 {
        AbstractC9155 abstractC9155 = this.f8772;
        EnumC13324 enumC13324 = EnumC13324.LIST;
        m8662(c12619, enumC13324);
        ContentResolver contentResolverM14336 = C4925.m14336();
        ArrayList arrayList = new ArrayList();
        try {
            Uri uriMo31567 = abstractC9155.mo31567();
            File file = abstractC9155.f27709;
            Cursor cursorQuery = contentResolverM14336.query(C14609.m34867(uriMo31567), abstractC9155.mo23548(), null, null, null);
            try {
                if (cursorQuery == null) {
                    throw m8660(enumC13324, (String) null, (Exception) null);
                }
                HashMap map = new HashMap();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string == null || string2 == null) {
                        throw m8660(EnumC13324.LIST, (String) null, (Exception) null);
                    }
                    String str = (String) C13843.putIfAbsent(map, string2, string);
                    if (str != null) {
                        if (!str.equals(string)) {
                            throw m8660(EnumC13324.LIST, (String) null, new IOException("Provider returned ambiguous child names"));
                        }
                    } else {
                        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(abstractC9155.mo31567(), string);
                        C12619 c12619Mo23550 = ((AbstractC9155) abstractC9155.mo23543(new File(file, string2), uriBuildDocumentUriUsingTree, cursorQuery)).mo23550(cursorQuery);
                        abstractC9155.mo23115(new File(file, string2), uriBuildDocumentUriUsingTree, c12619Mo23550.m30885() == EnumC3447.DIRECTORY);
                        arrayList.add(c12619Mo23550);
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
            throw m8661(EnumC13324.LIST, (String) null, e);
        } catch (C22497 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m8660(EnumC13324.LIST, (String) null, e3);
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo8673() throws C22497 {
        EnumC13324 enumC13324 = EnumC13324.CREATE_DIRECTORY_SINGLE;
        m8666(enumC13324);
        EnumC3447 enumC3447M30885 = mo8672().m30885();
        EnumC3447 enumC3447 = EnumC3447.MISSING;
        AbstractC15440 abstractC15440 = this.f31505;
        if (enumC3447M30885 != enumC3447) {
            throw C22497.m50454(enumC13324, EnumC21792.ALREADY_EXISTS, abstractC15440.mo23554(), (String) null);
        }
        AbstractC9155 abstractC9155 = this.f8772;
        AbstractC9155 abstractC9155Mo18538 = abstractC9155.mo18538();
        File file = abstractC9155.f27709;
        if (abstractC9155Mo18538 == null) {
            throw m26404(enumC13324, (String) null);
        }
        m8662(new C2805(abstractC9155Mo18538).mo8672(), enumC13324);
        try {
            Uri uriCreateDocument = DocumentsContract.createDocument(C4925.m14336(), C14609.m34869(abstractC9155Mo18538.mo31567()), "vnd.android.document/directory", file.getName());
            if (uriCreateDocument == null) {
                throw m8660(enumC13324, (String) null, (Exception) null);
            }
            if (!C11003.equals(file.getName(), C23782.m52459(uriCreateDocument)) && !C11003.equals(file.getName(), C14609.m34870(uriCreateDocument))) {
                DocumentsContract.deleteDocument(C4925.m14336(), uriCreateDocument);
                throw C22497.m50454(enumC13324, EnumC21792.ALREADY_EXISTS, abstractC15440.mo23554(), (String) null);
            }
            abstractC9155.mo23114(uriCreateDocument, true);
        } catch (SecurityException e) {
            throw m8661(EnumC13324.CREATE_DIRECTORY_SINGLE, (String) null, e);
        } catch (C22497 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m8660(EnumC13324.CREATE_DIRECTORY_SINGLE, (String) null, e3);
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo8676() throws C22497 {
        AbstractC9155 abstractC9155 = this.f8772;
        EnumC13324 enumC13324 = EnumC13324.DELETE_FILE_OR_LINK;
        m8666(enumC13324);
        C12619 c12619Mo8672 = mo8672();
        EnumC3447 enumC3447M30885 = c12619Mo8672.m30885();
        EnumC3447 enumC3447 = EnumC3447.MISSING;
        AbstractC15440 abstractC15440 = this.f31505;
        if (enumC3447M30885 == enumC3447) {
            throw C22497.m50454(enumC13324, EnumC21792.NOT_FOUND, abstractC15440.mo23554(), (String) null);
        }
        if (c12619Mo8672.m30885() != EnumC3447.REGULAR && c12619Mo8672.m30885() != EnumC3447.LINK) {
            throw C22497.m50454(enumC13324, EnumC21792.NOT_REGULAR_FILE, abstractC15440.mo23554(), (String) null);
        }
        try {
            if (!DocumentsContract.deleteDocument(C4925.m14336(), C14609.m34869(abstractC9155.mo31567()))) {
                throw m8660(enumC13324, (String) null, (Exception) null);
            }
            abstractC9155.mo23125();
        } catch (SecurityException e) {
            throw m8661(EnumC13324.DELETE_FILE_OR_LINK, (String) null, e);
        } catch (C22497 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m8660(EnumC13324.DELETE_FILE_OR_LINK, (String) null, e3);
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo8677() throws C22497 {
        AbstractC9155 abstractC9155 = this.f8772;
        EnumC13324 enumC13324 = EnumC13324.DELETE_EMPTY_DIRECTORY;
        m8666(enumC13324);
        m8662(mo8672(), enumC13324);
        if (!m8665(mo8672()).isEmpty()) {
            throw C22497.m50454(enumC13324, EnumC21792.DIRECTORY_NOT_EMPTY, this.f31505.mo23554(), (String) null);
        }
        try {
            if (!DocumentsContract.deleteDocument(C4925.m14336(), C14609.m34869(abstractC9155.mo31567()))) {
                throw m8660(enumC13324, (String) null, (Exception) null);
            }
            abstractC9155.mo23125();
        } catch (SecurityException e) {
            throw m8661(EnumC13324.DELETE_EMPTY_DIRECTORY, (String) null, e);
        } catch (C22497 e2) {
            throw e2;
        } catch (Exception e3) {
            throw m8660(EnumC13324.DELETE_EMPTY_DIRECTORY, (String) null, e3);
        }
    }

    @Override // l.AbstractC10503
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8670(AbstractC15440 abstractC15440) throws C22497 {
        Uri uriMoveDocument;
        EnumC13324 enumC13324 = EnumC13324.RENAME_NO_REPLACE;
        m8666(enumC13324);
        boolean z = abstractC15440 instanceof AbstractC9155;
        AbstractC15440 abstractC15441 = this.f31505;
        if (z) {
            AbstractC9155 abstractC9155 = (AbstractC9155) abstractC15440;
            File file = abstractC9155.f27709;
            AbstractC9155 abstractC9156 = this.f8772;
            String strMo18539 = abstractC9156.mo18539();
            File file2 = abstractC9156.f27709;
            if (C11003.equals(strMo18539, abstractC9155.mo18539())) {
                if (m8664(abstractC9155)) {
                    throw m26404(enumC13324, file.getPath());
                }
                if (!C11003.equals(file2.getParent(), file.getParent()) && !C11003.equals(file2.getName(), file.getName())) {
                    throw m26404(enumC13324, file.getPath());
                }
                C12619 c12619Mo8672 = mo8672();
                EnumC3447 enumC3447M30885 = c12619Mo8672.m30885();
                EnumC3447 enumC3447 = EnumC3447.MISSING;
                if (enumC3447M30885 == enumC3447) {
                    throw C22497.m50454(enumC13324, EnumC21792.NOT_FOUND, abstractC15441.mo23554(), file.getPath());
                }
                if (new C2805(abstractC9155).mo8672().m30885() != enumC3447) {
                    throw C22497.m50454(enumC13324, EnumC21792.ALREADY_EXISTS, abstractC15441.mo23554(), file.getPath());
                }
                AbstractC9155 abstractC9155Mo18538 = abstractC9156.mo18538();
                AbstractC9155 abstractC9155Mo18539 = abstractC9155.mo18538();
                if (abstractC9155Mo18538 == null || abstractC9155Mo18539 == null || !C11003.equals(abstractC9155Mo18538.mo18539(), abstractC9155Mo18539.mo18539())) {
                    throw C22497.m50454(enumC13324, EnumC21792.CROSS_BACKEND, abstractC15441.mo23554(), file.getPath());
                }
                m8662(new C2805(abstractC9155Mo18539).mo8672(), enumC13324);
                ContentResolver contentResolverM14336 = C4925.m14336();
                Uri uriM34869 = C14609.m34869(abstractC9156.mo31567());
                try {
                    if (C11003.equals(file2.getParent(), file.getParent())) {
                        uriMoveDocument = DocumentsContract.renameDocument(contentResolverM14336, uriM34869, file.getName());
                        m8663(enumC13324, uriMoveDocument, file.getName(), ((AbstractC9155) abstractC15440).f27709.getPath());
                    } else {
                        if (Build.VERSION.SDK_INT < 24) {
                            throw m26404(enumC13324, ((AbstractC9155) abstractC15440).f27709.getPath());
                        }
                        uriMoveDocument = DocumentsContract.moveDocument(contentResolverM14336, uriM34869, C14609.m34869(abstractC9155Mo18538.mo31567()), C14609.m34869(abstractC9155Mo18539.mo31567()));
                        m8663(enumC13324, uriMoveDocument, file.getName(), ((AbstractC9155) abstractC15440).f27709.getPath());
                    }
                    abstractC9156.mo23125();
                    abstractC9155.mo23114(uriMoveDocument, c12619Mo8672.m30885() == EnumC3447.DIRECTORY);
                    return;
                } catch (SecurityException e) {
                    throw m8661(EnumC13324.RENAME_NO_REPLACE, file.getPath(), e);
                } catch (UnsupportedOperationException unused) {
                    throw m26404(EnumC13324.RENAME_NO_REPLACE, file.getPath());
                } catch (C22497 e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw m8660(EnumC13324.RENAME_NO_REPLACE, file.getPath(), e3);
                }
            }
        }
        throw C22497.m50454(enumC13324, EnumC21792.CROSS_BACKEND, abstractC15441.mo23554(), abstractC15440.mo23554());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8663(EnumC13324 enumC13324, Uri uri, String str, String str2) throws C22497 {
        if (uri == null) {
            throw m8660(enumC13324, str2, (Exception) null);
        }
        if (!C11003.equals(str, C23782.m52459(uri)) && !C11003.equals(str, C14609.m34870(uri))) {
            throw m8660(enumC13324, str2, new IOException("Provider returned an unexpected document name"));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C12619 m8667() throws C22497 {
        AbstractC15440 abstractC15440 = this.f31505;
        AbstractC9155 abstractC9155 = this.f8772;
        AbstractC9155 abstractC9155Mo18538 = abstractC9155.mo18538();
        if (abstractC9155Mo18538 == null) {
            throw m8660(EnumC13324.STAT, (String) null, (Exception) null);
        }
        try {
            for (C12619 c12619 : (ArrayList) new C2805(abstractC9155Mo18538).mo8674()) {
                if (abstractC15440.mo23554().equals(c12619.m30882().mo23554())) {
                    abstractC9155.mo23114(((AbstractC9155) c12619.m30882()).mo31567(), c12619.m30885() == EnumC3447.DIRECTORY);
                    return new C12619(this.f31505, c12619.m30885(), c12619.m30884(), c12619.m30883(), c12619.m30886());
                }
            }
            return C12619.m30881(abstractC15440);
        } catch (C22497 e) {
            if (e.m50458() == EnumC21792.NOT_FOUND) {
                return C12619.m30881(abstractC15440);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8664(AbstractC9155 abstractC9155) {
        if (!(abstractC9155 instanceof C13198)) {
            return false;
        }
        C13198 c13198 = (C13198) abstractC9155;
        return c13198.f27235 || c13198.m32034();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m8666(EnumC13324 enumC13324) throws C22497 {
        if (m8664(this.f8772)) {
            throw m26404(enumC13324, (String) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8662(C12619 c12619, EnumC13324 enumC13324) throws C22497 {
        if (c12619.m30885() == EnumC3447.MISSING) {
            throw C22497.m50454(enumC13324, EnumC21792.NOT_FOUND, c12619.m30882().mo23554(), (String) null);
        }
        if (c12619.m30885() != EnumC3447.DIRECTORY) {
            throw C22497.m50454(enumC13324, EnumC21792.NOT_DIRECTORY, c12619.m30882().mo23554(), (String) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C22497 m8661(EnumC13324 enumC13324, String str, SecurityException securityException) {
        EnumC21792 enumC21792 = EnumC21792.PERMISSION_DENIED;
        AbstractC15440 abstractC15440 = this.f31505;
        String strMo23554 = abstractC15440.mo23554();
        StringBuilder sb = new StringBuilder("Checked file operation ");
        sb.append(enumC13324);
        sb.append(" failed for ");
        return new C22497(enumC13324, enumC21792, strMo23554, str, C4153.m12552(abstractC15440, sb), securityException);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C22497 m8660(EnumC13324 enumC13324, String str, Exception exc) {
        StringBuilder sb = new StringBuilder("Checked file operation ");
        sb.append(enumC13324);
        sb.append(" failed for ");
        AbstractC15440 abstractC15440 = this.f31505;
        String strM12552 = C4153.m12552(abstractC15440, sb);
        if (exc == null) {
            return new C22497(enumC13324, EnumC21792.IO_ERROR, abstractC15440.mo23554(), str, strM12552);
        }
        if (!(exc instanceof IOException)) {
            return new C22497(enumC13324, EnumC21792.IO_ERROR, abstractC15440.mo23554(), str, strM12552, exc);
        }
        return C22497.m50453(enumC13324, abstractC15440.mo23554(), str, (IOException) exc);
    }
}
