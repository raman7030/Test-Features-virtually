package l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.alipay.sdk.app.OpenAuthTask;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۡ᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O9SL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9155 extends C14798 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String[] f27708;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final File f27709;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C9861 f27710;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC9155 mo18536(File file, Uri uri);

    /* JADX INFO: renamed from: ֫ */
    public void mo23115(File file, Uri uri, boolean z) {
    }

    /* JADX INFO: renamed from: ۟ۧ */
    public boolean mo23118() {
        return true;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo23547() {
        return true;
    }

    /* JADX INFO: renamed from: ۨۧ */
    public boolean mo23122() {
        return false;
    }

    /* JADX INFO: renamed from: ᩺ۧ */
    public void mo23128() {
    }

    public AbstractC9155(File file, Uri uri) {
        super(uri);
        this.f27709 = file;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 mo23559() {
        return mo18536(this.f27709.getAbsoluteFile(), mo31567());
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final String mo23544() {
        return this.f27709.getAbsolutePath();
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean mo23545() {
        if (C10975.m27285()) {
            return ((Boolean) C14798.m35183(new Callable() { // from class: l.᩷᩸ܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AbstractC9155 abstractC9155 = this.f68190;
                    return Boolean.valueOf(!abstractC9155.mo23120() && abstractC9155.m23539());
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return !mo23120() && m23539();
    }

    /* JADX INFO: renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    private boolean m23539() {
        AbstractC15440 abstractC15440M36536 = m36536();
        if (abstractC15440M36536 != null && abstractC15440M36536.mo31568()) {
            Uri uriMo31567 = abstractC15440M36536.mo31567();
            File file = this.f27709;
            Uri uriM52452 = C23782.m52452(uriMo31567, "*/*", file.getName());
            if (uriM52452 != null) {
                if (C11003.equals(C14609.m34870(uriM52452), file.getName())) {
                    return true;
                }
                if (C11003.equals(C23782.m52459(uriM52452), file.getName())) {
                    mo23114(uriM52452, false);
                    return true;
                }
                C23782.m52458(uriM52452);
            }
        }
        return false;
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo23546() {
        if (C10975.m27285()) {
            return ((Boolean) C14798.m35183(new Callable() { // from class: l.᩻᩸ܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f77728.m23537());
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return m23537();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC10503 mo23558() {
        return new C2805(this);
    }

    /* JADX INFO: renamed from: ۗۧ */
    public AbstractC9155 mo18538() {
        AbstractC15440 abstractC15440M36536 = m36536();
        if (abstractC15440M36536 instanceof AbstractC9155) {
            return (AbstractC9155) abstractC15440M36536;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX INFO: renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public boolean m23537() {
        Uri uriM34872;
        File file;
        Uri uriM52452;
        if (mo23120()) {
            return mo23113();
        }
        AbstractC15440 abstractC15440M36514 = m36514();
        if (abstractC15440M36514 instanceof AbstractC9155) {
            AbstractC9155 abstractC9155 = (AbstractC9155) abstractC15440M36514;
            if (abstractC9155.m23537()) {
                uriM34872 = abstractC9155.mo31567();
                file = this.f27709;
                uriM52452 = C23782.m52452(uriM34872, "vnd.android.document/directory", file.getName());
                if (uriM52452 != null) {
                    if (C11003.equals(C14609.m34870(uriM52452), file.getName())) {
                        return true;
                    }
                    if (C11003.equals(C23782.m52459(uriM52452), file.getName())) {
                        mo23114(uriM52452, true);
                        return true;
                    }
                    C23782.m52458(uriM52452);
                }
            }
        } else if (abstractC15440M36514.mo23546()) {
            uriM34872 = C14609.m34872(mo31567());
            file = this.f27709;
            uriM52452 = C23782.m52452(uriM34872, "vnd.android.document/directory", file.getName());
            if (uriM52452 != null) {
                if (C11003.equals(C14609.m34870(uriM52452), file.getName())) {
                    return true;
                }
                if (C11003.equals(C23782.m52459(uriM52452), file.getName())) {
                    mo23114(uriM52452, true);
                    return true;
                }
                C23782.m52458(uriM52452);
            }
        }
        return false;
    }

    @Override // l.C14798, l.AbstractC15440
    public final String getName() {
        return this.f27709.getName();
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final String mo23554() {
        return this.f27709.getPath();
    }

    @Override // l.C14798, l.AbstractC15440
    public final String getParent() {
        return this.f27709.getParent();
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ۤ */
    public boolean mo23120() {
        if (this.f27710 != null) {
            return true;
        }
        return super.mo23120();
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ۠֫ */
    public boolean mo23119() {
        C9861 c9861 = this.f27710;
        if (c9861 != null) {
            return !c9861.f29833;
        }
        return super.mo23119();
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ֨֫ */
    public boolean mo23113() {
        C9861 c9861 = this.f27710;
        if (c9861 != null) {
            return c9861.f29833;
        }
        return super.mo23113();
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ᩺֫ */
    public long mo23127() {
        C9861 c9861 = this.f27710;
        if (c9861 != null) {
            return c9861.f29832;
        }
        return super.mo23127();
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ۛ֫ */
    public long mo23117() {
        C9861 c9861 = this.f27710;
        if (c9861 != null) {
            return c9861.f29834;
        }
        return super.mo23117();
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean mo23552() {
        if (C23782.m52458(mo31567())) {
            mo23125();
            return true;
        }
        if (!mo23113()) {
            return false;
        }
        Iterator it = ((ArrayList) mo23549(true)).iterator();
        while (it.hasNext()) {
            if (!((AbstractC9155) ((AbstractC15440) it.next())).m23540()) {
                return false;
            }
        }
        if (!C23782.m52458(mo31567())) {
            return false;
        }
        mo23125();
        return true;
    }

    /* JADX INFO: renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    private boolean m23540() {
        if (mo23113()) {
            Iterator it = ((ArrayList) mo23549(true)).iterator();
            while (it.hasNext()) {
                if (!((AbstractC9155) ((AbstractC15440) it.next())).m23540()) {
                    return false;
                }
            }
        }
        if (!C23782.m52458(mo31567())) {
            return false;
        }
        mo23125();
        return true;
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo23551(final AbstractC15440 abstractC15440) {
        if (C10975.m27285()) {
            return ((Boolean) C14798.m35183(new Callable() { // from class: l.ۜ᩸ܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f21682.m23556(abstractC15440));
                }
            }, Boolean.FALSE, OpenAuthTask.Duplex)).booleanValue();
        }
        return m23556(abstractC15440);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m23556(AbstractC15440 abstractC15440) {
        Uri uriMoveDocument;
        if (abstractC15440.mo23547()) {
            AbstractC9155 abstractC9155 = (AbstractC9155) abstractC15440;
            File file = abstractC9155.f27709;
            if (C11003.equals(mo18539(), abstractC9155.mo18539()) && (!abstractC9155.mo23120() || abstractC9155.mo23552())) {
                File file2 = this.f27709;
                try {
                    if (C11003.equals(file2.getParent(), file.getParent())) {
                        String name = file.getName();
                        Uri uriRenameDocument = DocumentsContract.renameDocument(C4925.m14336(), mo31567(), name);
                        if (uriRenameDocument != null) {
                            if (C14609.m34870(uriRenameDocument).equals(name)) {
                                mo23125();
                                return true;
                            }
                            if (C11003.equals(C23782.m52459(uriRenameDocument), name)) {
                                mo23125();
                                return true;
                            }
                            DocumentsContract.renameDocument(C4925.m14336(), uriRenameDocument, file2.getName());
                            return false;
                        }
                    } else {
                        AbstractC15440 abstractC15440M36536 = m36536();
                        AbstractC15440 abstractC15440M36537 = abstractC9155.m36536();
                        if (abstractC15440M36536 != null && abstractC15440M36537 != null && (uriMoveDocument = DocumentsContract.moveDocument(C4925.m14336(), mo31567(), abstractC15440M36536.mo31567(), abstractC15440M36537.mo31567())) != null) {
                            if (C14609.m34870(uriMoveDocument).equals(file.getName())) {
                                mo23125();
                                return true;
                            }
                            if (C11003.equals(C23782.m52459(uriMoveDocument), file.getName())) {
                                mo23125();
                                return true;
                            }
                            DocumentsContract.moveDocument(C4925.m14336(), uriMoveDocument, abstractC15440M36537.mo31567(), abstractC15440M36536.mo31567());
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۛۧ */
    public String mo18539() {
        Uri uriMo31567 = mo31567();
        return new Uri.Builder().scheme("content").authority(uriMo31567.getAuthority()).appendPath("tree").appendPath(uriMo31567.getPathSegments().get(1)).build().toString();
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List mo23549(boolean z) {
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolverM14336 = C4925.m14336();
        Uri uriM34867 = C14609.m34867(mo31567());
        String[] strArrMo23548 = this.f27708;
        if (strArrMo23548 == null) {
            strArrMo23548 = mo23548();
            this.f27708 = strArrMo23548;
        }
        try {
            Cursor cursorQuery = contentResolverM14336.query(uriM34867, strArrMo23548, null, null, null);
            try {
                if (cursorQuery == null) {
                    mo23128();
                    if (cursorQuery != null) {
                    }
                    return arrayList;
                }
                HashSet hashSet = mo23122() ? new HashSet() : null;
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (z || !string2.startsWith(".")) {
                        if (hashSet == null || hashSet.add(string2)) {
                            File file = new File(this.f27709, string2);
                            Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(mo31567(), string);
                            AbstractC15440 abstractC15440Mo23543 = mo23543(file, uriBuildDocumentUriUsingTree, cursorQuery);
                            mo23115(file, uriBuildDocumentUriUsingTree, abstractC15440Mo23543.mo23113());
                            arrayList.add(abstractC15440Mo23543);
                        }
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
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public String[] mo23548() {
        return new String[]{"document_id", "_display_name", "mime_type", "_size", "last_modified"};
    }

    /* JADX INFO: renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public String[] mo23553() {
        return new String[]{"mime_type", "_size", "last_modified"};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12619 mo23541(Cursor cursor) {
        return m23542(cursor, 0, 1, 2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12619 mo23550(Cursor cursor) {
        return m23542(cursor, 2, 3, 4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12619 m23542(Cursor cursor, int i, int i2, int i3) {
        EnumC3447 enumC3447;
        String string = cursor.isNull(i) ? null : cursor.getString(i);
        if ("vnd.android.document/directory".equals(string)) {
            enumC3447 = EnumC3447.DIRECTORY;
        } else if (string == null || string.isEmpty()) {
            enumC3447 = EnumC3447.OTHER;
        } else {
            enumC3447 = EnumC3447.REGULAR;
        }
        EnumC3447 enumC3448 = enumC3447;
        return new C12619(this, enumC3448, (enumC3448 == EnumC3447.DIRECTORY || cursor.isNull(i2)) ? -1L : cursor.getLong(i2), cursor.isNull(i3) ? -1L : cursor.getLong(i3), null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 mo23543(File file, Uri uri, Cursor cursor) {
        AbstractC9155 abstractC9155Mo18536 = mo18536(file, uri);
        C9861 c9861 = new C9861();
        c9861.f29833 = "vnd.android.document/directory".equals(cursor.isNull(2) ? null : cursor.getString(2));
        c9861.f29832 = cursor.isNull(3) ? -1L : cursor.getLong(3);
        c9861.f29834 = cursor.isNull(4) ? -1L : cursor.getLong(4);
        abstractC9155Mo18536.f27710 = c9861;
        return abstractC9155Mo18536;
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final OutputStream mo23555(boolean z) throws FileNotFoundException {
        if (mo23120() || m23539()) {
            return C4925.m14336().openOutputStream(mo31567(), z ? "wa" : "wt");
        }
        throw new FileNotFoundException(mo31567().toString());
    }

    @Override // l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC2245 mo23557(String str) throws FileNotFoundException {
        if (!str.equals("r") && !mo23120() && !m23539()) {
            throw new FileNotFoundException(mo31567().toString());
        }
        return C0127.m1198(mo31567(), str);
    }

    @Override // l.C14798
    /* JADX INFO: renamed from: ᩶ۧ */
    public void mo23125() {
        super.mo23125();
        this.f27710 = null;
    }
}
