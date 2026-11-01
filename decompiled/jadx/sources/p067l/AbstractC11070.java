package p067l;

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
public abstract class AbstractC11070 extends C16433 {

    /* JADX INFO: renamed from: ۛ */
    public String[] f30648;

    /* JADX INFO: renamed from: ۤ */
    public final File f30649;

    /* JADX INFO: renamed from: ۫ */
    public C11741 f30650;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC11070 mo20485(File file, Uri uri);

    /* JADX INFO: renamed from: ֫ */
    public void mo25089(File file, Uri uri, boolean z) {
    }

    /* JADX INFO: renamed from: ۟ۧ */
    public boolean mo25092() {
        return true;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۤ֫ */
    public final boolean mo25498() {
        return true;
    }

    /* JADX INFO: renamed from: ۨۧ */
    public boolean mo25096() {
        return false;
    }

    /* JADX INFO: renamed from: ᩺ۧ */
    public void mo25102() {
    }

    public AbstractC11070(File file, Uri uri) {
        super(uri);
        this.f30649 = file;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩺ */
    public final AbstractC17043 mo25510() {
        return mo20485(this.f30649.getAbsoluteFile(), mo33652());
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫֫ */
    public final String mo25495() {
        return this.f30649.getAbsolutePath();
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo25496() {
        if (C12799.m29347()) {
            return ((Boolean) C16433.m37330(new Callable() { // from class: l.᩷᩸ܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AbstractC11070 abstractC11070 = this.f70872;
                    return Boolean.valueOf(!abstractC11070.mo25094() && abstractC11070.m25490());
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return !mo25094() && m25490();
    }

    /* JADX INFO: renamed from: ܳܽ */
    private boolean m25490() {
        AbstractC17043 abstractC17043M38694 = m38694();
        if (abstractC17043M38694 != null && abstractC17043M38694.mo33653()) {
            Uri uriMo33652 = abstractC17043M38694.mo33652();
            File file = this.f30649;
            Uri uriM54861 = C24971.m54861(uriMo33652, "*/*", file.getName());
            if (uriM54861 != null) {
                if (C12826.equals(C16253.m37021(uriM54861), file.getName())) {
                    return true;
                }
                if (C12826.equals(C24971.m54868(uriM54861), file.getName())) {
                    mo25088(uriM54861, false);
                    return true;
                }
                C24971.m54867(uriM54861);
            }
        }
        return false;
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo25497() {
        if (C12799.m29347()) {
            return ((Boolean) C16433.m37330(new Callable() { // from class: l.᩻᩸ܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f80480.m25488());
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return m25488();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC12351 mo25509() {
        return new C5035(this);
    }

    /* JADX INFO: renamed from: ۗۧ */
    public AbstractC11070 mo20487() {
        AbstractC17043 abstractC17043M38694 = m38694();
        if (abstractC17043M38694 instanceof AbstractC11070) {
            return (AbstractC11070) abstractC17043M38694;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX INFO: renamed from: ֫ܽ */
    public boolean m25488() {
        Uri uriM37023;
        File file;
        Uri uriM54861;
        if (mo25094()) {
            return mo25087();
        }
        AbstractC17043 abstractC17043M38672 = m38672();
        if (abstractC17043M38672 instanceof AbstractC11070) {
            AbstractC11070 abstractC11070 = (AbstractC11070) abstractC17043M38672;
            if (abstractC11070.m25488()) {
                uriM37023 = abstractC11070.mo33652();
                file = this.f30649;
                uriM54861 = C24971.m54861(uriM37023, "vnd.android.document/directory", file.getName());
                if (uriM54861 != null) {
                    if (C12826.equals(C16253.m37021(uriM54861), file.getName())) {
                        return true;
                    }
                    if (C12826.equals(C24971.m54868(uriM54861), file.getName())) {
                        mo25088(uriM54861, true);
                        return true;
                    }
                    C24971.m54867(uriM54861);
                }
            }
        } else if (abstractC17043M38672.mo25497()) {
            uriM37023 = C16253.m37023(mo33652());
            file = this.f30649;
            uriM54861 = C24971.m54861(uriM37023, "vnd.android.document/directory", file.getName());
            if (uriM54861 != null) {
                if (C12826.equals(C16253.m37021(uriM54861), file.getName())) {
                    return true;
                }
                if (C12826.equals(C24971.m54868(uriM54861), file.getName())) {
                    mo25088(uriM54861, true);
                    return true;
                }
                C24971.m54867(uriM54861);
            }
        }
        return false;
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    public final String getName() {
        return this.f30649.getName();
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ܺ֫ */
    public final String mo25505() {
        return this.f30649.getPath();
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    public final String getParent() {
        return this.f30649.getParent();
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۤ */
    public boolean mo25094() {
        if (this.f30650 != null) {
            return true;
        }
        return super.mo25094();
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۠֫ */
    public boolean mo25093() {
        C11741 c11741 = this.f30650;
        if (c11741 != null) {
            return !c11741.f32786;
        }
        return super.mo25093();
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ֨֫ */
    public boolean mo25087() {
        C11741 c11741 = this.f30650;
        if (c11741 != null) {
            return c11741.f32786;
        }
        return super.mo25087();
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩺֫ */
    public long mo25101() {
        C11741 c11741 = this.f30650;
        if (c11741 != null) {
            return c11741.f32785;
        }
        return super.mo25101();
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۛ֫ */
    public long mo25091() {
        C11741 c11741 = this.f30650;
        if (c11741 != null) {
            return c11741.f32787;
        }
        return super.mo25091();
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo25503() {
        if (C24971.m54867(mo33652())) {
            mo25099();
            return true;
        }
        if (!mo25087()) {
            return false;
        }
        Iterator it = ((ArrayList) mo25500(true)).iterator();
        while (it.hasNext()) {
            if (!((AbstractC11070) ((AbstractC17043) it.next())).m25491()) {
                return false;
            }
        }
        if (!C24971.m54867(mo33652())) {
            return false;
        }
        mo25099();
        return true;
    }

    /* JADX INFO: renamed from: ᩻ܽ */
    private boolean m25491() {
        if (mo25087()) {
            Iterator it = ((ArrayList) mo25500(true)).iterator();
            while (it.hasNext()) {
                if (!((AbstractC11070) ((AbstractC17043) it.next())).m25491()) {
                    return false;
                }
            }
        }
        if (!C24971.m54867(mo33652())) {
            return false;
        }
        mo25099();
        return true;
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo25502(final AbstractC17043 abstractC17043) {
        if (C12799.m29347()) {
            return ((Boolean) C16433.m37330(new Callable() { // from class: l.ۜ᩸ܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f24563.m25507(abstractC17043));
                }
            }, Boolean.FALSE, OpenAuthTask.Duplex)).booleanValue();
        }
        return m25507(abstractC17043);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m25507(AbstractC17043 abstractC17043) {
        Uri uriMoveDocument;
        if (abstractC17043.mo25498()) {
            AbstractC11070 abstractC11070 = (AbstractC11070) abstractC17043;
            File file = abstractC11070.f30649;
            if (C12826.equals(mo20488(), abstractC11070.mo20488()) && (!abstractC11070.mo25094() || abstractC11070.mo25503())) {
                File file2 = this.f30649;
                try {
                    if (C12826.equals(file2.getParent(), file.getParent())) {
                        String name = file.getName();
                        Uri uriRenameDocument = DocumentsContract.renameDocument(C7050.m16233(), mo33652(), name);
                        if (uriRenameDocument != null) {
                            if (C16253.m37021(uriRenameDocument).equals(name)) {
                                mo25099();
                                return true;
                            }
                            if (C12826.equals(C24971.m54868(uriRenameDocument), name)) {
                                mo25099();
                                return true;
                            }
                            DocumentsContract.renameDocument(C7050.m16233(), uriRenameDocument, file2.getName());
                            return false;
                        }
                    } else {
                        AbstractC17043 abstractC17043M38694 = m38694();
                        AbstractC17043 abstractC17043M38695 = abstractC11070.m38694();
                        if (abstractC17043M38694 != null && abstractC17043M38695 != null && (uriMoveDocument = DocumentsContract.moveDocument(C7050.m16233(), mo33652(), abstractC17043M38694.mo33652(), abstractC17043M38695.mo33652())) != null) {
                            if (C16253.m37021(uriMoveDocument).equals(file.getName())) {
                                mo25099();
                                return true;
                            }
                            if (C12826.equals(C24971.m54868(uriMoveDocument), file.getName())) {
                                mo25099();
                                return true;
                            }
                            DocumentsContract.moveDocument(C7050.m16233(), uriMoveDocument, abstractC17043M38695.mo33652(), abstractC17043M38694.mo33652());
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۛۧ */
    public String mo20488() {
        Uri uriMo33652 = mo33652();
        return new Uri.Builder().scheme("content").authority(uriMo33652.getAuthority()).appendPath("tree").appendPath(uriMo33652.getPathSegments().get(1)).build().toString();
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public final List mo25500(boolean z) {
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolverM16233 = C7050.m16233();
        Uri uriM37018 = C16253.m37018(mo33652());
        String[] strArrMo25499 = this.f30648;
        if (strArrMo25499 == null) {
            strArrMo25499 = mo25499();
            this.f30648 = strArrMo25499;
        }
        try {
            Cursor cursorQuery = contentResolverM16233.query(uriM37018, strArrMo25499, null, null, null);
            try {
                if (cursorQuery == null) {
                    mo25102();
                    if (cursorQuery != null) {
                    }
                    return arrayList;
                }
                HashSet hashSet = mo25096() ? new HashSet() : null;
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (z || !string2.startsWith(".")) {
                        if (hashSet == null || hashSet.add(string2)) {
                            File file = new File(this.f30649, string2);
                            Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(mo33652(), string);
                            AbstractC17043 abstractC17043Mo25494 = mo25494(file, uriBuildDocumentUriUsingTree, cursorQuery);
                            mo25089(file, uriBuildDocumentUriUsingTree, abstractC17043Mo25494.mo25087());
                            arrayList.add(abstractC17043Mo25494);
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

    /* JADX INFO: renamed from: ۤۧ */
    public String[] mo25499() {
        return new String[]{"document_id", "_display_name", "mime_type", "_size", "last_modified"};
    }

    /* JADX INFO: renamed from: ۬ۧ */
    public String[] mo25504() {
        return new String[]{"mime_type", "_size", "last_modified"};
    }

    /* JADX INFO: renamed from: ֫ */
    public C14362 mo25492(Cursor cursor) {
        return m25493(cursor, 0, 1, 2);
    }

    /* JADX INFO: renamed from: ۧ */
    public C14362 mo25501(Cursor cursor) {
        return m25493(cursor, 2, 3, 4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14362 m25493(Cursor cursor, int i, int i2, int i3) {
        EnumC5645 enumC5645;
        String string = cursor.isNull(i) ? null : cursor.getString(i);
        if ("vnd.android.document/directory".equals(string)) {
            enumC5645 = EnumC5645.DIRECTORY;
        } else if (string == null || string.isEmpty()) {
            enumC5645 = EnumC5645.OTHER;
        } else {
            enumC5645 = EnumC5645.REGULAR;
        }
        EnumC5645 enumC5646 = enumC5645;
        return new C14362(this, enumC5646, (enumC5646 == EnumC5645.DIRECTORY || cursor.isNull(i2)) ? -1L : cursor.getLong(i2), cursor.isNull(i3) ? -1L : cursor.getLong(i3), null);
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC17043 mo25494(File file, Uri uri, Cursor cursor) {
        AbstractC11070 abstractC11070Mo20485 = mo20485(file, uri);
        C11741 c11741 = new C11741();
        c11741.f32786 = "vnd.android.document/directory".equals(cursor.isNull(2) ? null : cursor.getString(2));
        c11741.f32785 = cursor.isNull(3) ? -1L : cursor.getLong(3);
        c11741.f32787 = cursor.isNull(4) ? -1L : cursor.getLong(4);
        abstractC11070Mo20485.f30650 = c11741;
        return abstractC11070Mo20485;
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ܽ */
    public final OutputStream mo25506(boolean z) throws FileNotFoundException {
        if (mo25094() || m25490()) {
            return C7050.m16233().openOutputStream(mo33652(), z ? "wa" : "wt");
        }
        throw new FileNotFoundException(mo33652().toString());
    }

    @Override // p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC4502 mo25508(String str) throws FileNotFoundException {
        if (!str.equals("r") && !mo25094() && !m25490()) {
            throw new FileNotFoundException(mo33652().toString());
        }
        return C2489.m3599(mo33652(), str);
    }

    @Override // p067l.C16433
    /* JADX INFO: renamed from: ᩶ۧ */
    public void mo25099() {
        super.mo25099();
        this.f30650 = null;
    }
}
