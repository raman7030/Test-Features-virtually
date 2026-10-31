package l;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.alipay.sdk.m.y.o;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.۬ܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13198 extends C8966 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C3321 f39466;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public synchronized boolean m32024() {
        if (this.f39466 != null) {
            return true;
        }
        Cursor cursorQuery = C4925.m14336().query(C14609.m34869(mo31567()), new String[]{"mt_extras"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext() && !cursorQuery.isNull(0)) {
                    this.f39466 = m32029(cursorQuery.getString(0));
                    cursorQuery.close();
                    return true;
                }
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֨ۧ */
    public final boolean mo27912() {
        return true;
    }

    @Override // l.C8966, l.AbstractC9155
    /* JADX INFO: renamed from: ֫ */
    public final void mo23115(File file, Uri uri, boolean z) {
    }

    @Override // l.C8966, l.AbstractC9155
    /* JADX INFO: renamed from: ۟ۧ */
    public final boolean mo23118() {
        return true;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13198 mo32036() {
        return this;
    }

    @Override // l.C8966, l.AbstractC9155, l.C14798, l.AbstractC15440
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo23120() {
        if (this.f39466 != null) {
            return true;
        }
        return super.mo23120();
    }

    @Override // l.C8966, l.AbstractC9155, l.C14798
    /* JADX INFO: renamed from: ᩶ۧ */
    public final void mo23125() {
        super.mo23125();
        this.f39466 = null;
    }

    @Override // l.C8966, l.AbstractC9155
    /* JADX INFO: renamed from: ֫ */
    public final C8966 mo18536(File file, Uri uri) {
        return new C13198(file, uri, m23116());
    }

    @Override // l.C8966, l.AbstractC9155
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9155 mo18536(File file, Uri uri) {
        return new C13198(file, uri, m23116());
    }

    @Override // l.AbstractC9155
    /* JADX INFO: renamed from: ۤۧ */
    public final String[] mo23548() {
        return new String[]{"document_id", "_display_name", "mime_type", "_size", "last_modified", "mt_extras", "mt_path"};
    }

    @Override // l.AbstractC9155
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15440 mo23543(File file, Uri uri, Cursor cursor) {
        C13198 c13198Mo32036 = super.mo23543(file, uri, cursor).mo32036();
        if (!cursor.isNull(5)) {
            c13198Mo32036.f39466 = m32029(cursor.getString(5));
        }
        return c13198Mo32036;
    }

    @Override // l.AbstractC9155
    /* JADX INFO: renamed from: ۬ۧ */
    public final String[] mo23553() {
        return new String[]{"mime_type", "_size", "last_modified", "mt_path", "mt_extras"};
    }

    @Override // l.AbstractC9155
    /* JADX INFO: renamed from: ֫ */
    public final C12619 mo23541(Cursor cursor) {
        return m32021(cursor, 0, 1, 2, 4);
    }

    @Override // l.AbstractC9155
    /* JADX INFO: renamed from: ۧ */
    public final C12619 mo23550(Cursor cursor) {
        return m32021(cursor, 2, 3, 4, 5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12619 m32021(Cursor cursor, int i, int i2, int i3, int i4) throws IOException {
        EnumC3447 enumC3447;
        long j = cursor.isNull(i2) ? -1L : cursor.getLong(i2);
        long j2 = cursor.isNull(i3) ? -1L : cursor.getLong(i3);
        if (m32034()) {
            return new C12619(this, EnumC3447.DIRECTORY, -1L, j2, null);
        }
        boolean zIsNull = cursor.isNull(i4);
        File file = this.f27709;
        if (!zIsNull) {
            try {
                C3321 c3321M32029 = m32029(cursor.getString(i4));
                char cM10168 = c3321M32029.m10168();
                if (cM10168 == '-') {
                    enumC3447 = EnumC3447.REGULAR;
                } else if (cM10168 == 'd') {
                    enumC3447 = EnumC3447.DIRECTORY;
                } else if (cM10168 == 'l') {
                    enumC3447 = EnumC3447.LINK;
                } else {
                    enumC3447 = EnumC3447.OTHER;
                }
                EnumC3447 enumC3448 = enumC3447;
                EnumC3447 enumC3449 = EnumC3447.LINK;
                if (enumC3448 == enumC3449 && c3321M32029.m10170() == null) {
                    throw new IOException("Missing MT provider link target: " + file.getPath());
                }
                return new C12619(this, enumC3448, enumC3448 == EnumC3447.DIRECTORY ? -1L : j, j2, enumC3448 == enumC3449 ? c3321M32029.m10170() : null);
            } catch (RuntimeException e) {
                throw new IOException("Invalid MT provider metadata: " + file.getPath(), e);
            }
        }
        if (this.f27235) {
            return m23542(cursor, i, i2, i3);
        }
        throw new IOException("Missing MT provider metadata: " + file.getPath());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C3321 m32029(String str) {
        String[] strArrSplit = str.split("\\|", 4);
        return new C3321(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), strArrSplit.length == 4 ? strArrSplit[3] : null);
    }

    /* JADX INFO: renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public final boolean m32034() {
        C4027 c4027M23116 = m23116();
        File file = this.f27709;
        String path = file.getParentFile().getPath();
        if (path.length() != 18 ? false : path.equalsIgnoreCase(c4027M23116.m12120())) {
            String name = file.getName();
            name.getClass();
            switch (name) {
                case "user_de_data":
                case "android_data":
                case "data":
                case "android_obb":
                    return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18537(long j) {
        Uri uriMo31567 = mo31567();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", uriMo31567);
        bundle.putLong("time", j);
        Bundle bundleCall = C4925.m14336().call(uriMo31567, "mt:setLastModified", (String) null, bundle);
        if (bundleCall == null) {
            return false;
        }
        if (bundleCall.getBoolean(o.c)) {
            C9861 c9861 = this.f27710;
            if (c9861 == null) {
                return true;
            }
            c9861.f29834 = j;
            return true;
        }
        String string = bundleCall.getString("message");
        if (string == null) {
            return false;
        }
        System.err.println(string);
        return false;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21087 mo27915(InterfaceC6975 interfaceC6975) {
        return new C4732(this, this, interfaceC6975);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32030(int i) {
        Uri uriMo31567 = mo31567();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", uriMo31567);
        bundle.putInt("permissions", i);
        Bundle bundleCall = C4925.m14336().call(uriMo31567, "mt:setPermissions", (String) null, bundle);
        if (bundleCall == null) {
            return false;
        }
        if (bundleCall.getBoolean(o.c)) {
            C3321 c3321 = this.f39466;
            if (c3321 == null) {
                return true;
            }
            c3321.f10405 = i | (c3321.f10405 & (-4096));
            return true;
        }
        String string = bundleCall.getString("message");
        if (string == null) {
            return false;
        }
        System.err.println(string);
        return false;
    }

    /* JADX INFO: renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public final String m32037() {
        if (C10975.m27285()) {
            return (String) C14798.m35183(new Callable() { // from class: l.᩹ܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f72484.m32027();
                }
            }, this.f27709.getPath(), 500);
        }
        return m32027();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public String m32027() {
        Cursor cursorQuery = C4925.m14336().query(C14609.m34869(mo31567()), new String[]{"mt_path"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext() && !cursorQuery.isNull(0)) {
                    String string = cursorQuery.getString(0);
                    cursorQuery.close();
                    return string;
                }
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return this.f27709.getPath();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܿ֫ */
    public final String mo27935() {
        if (m32034()) {
            return m32037();
        }
        m32033();
        C3321 c3321 = this.f39466;
        if (c3321 != null) {
            return c3321.f10407;
        }
        return null;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 mo32032() {
        return C16999.m39866(m32037(), new String[0]).m36514();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final String mo32031() {
        return m36533() ? m36519() : m32037();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܽ */
    public final void mo27934(final String str) throws IOException {
        if (C10975.m27285()) {
            C14798.m35182(new Callable() { // from class: l.᩶ܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    this.f65493.m32025(str);
                    return null;
                }
            });
        } else {
            m32025(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m32025(String str) throws IOException {
        Uri uriMo31567 = mo31567();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", uriMo31567);
        bundle.putString(MotionUtils.EASING_TYPE_PATH, str);
        Bundle bundleCall = C4925.m14336().call(uriMo31567, "mt:createSymlink", (String) null, bundle);
        if (bundleCall != null) {
            if (bundleCall.getBoolean(o.c)) {
                return;
            }
            String string = bundleCall.getString("message");
            if (string != null) {
                throw new IOException(string);
            }
        }
        throw new IOException("Unable to create link '" + this.f27709.getPath() + "' to '" + str + "'");
    }

    /* JADX INFO: renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public final boolean m32033() {
        if (this.f39466 != null) {
            return true;
        }
        if (C10975.m27285()) {
            return ((Boolean) C14798.m35183(new Callable() { // from class: l.᩸ܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f69522.m32024());
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return m32024();
    }

    /* JADX INFO: renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public final C3321 m32035() {
        C3321 c3321 = this.f39466;
        C11003.requireNonNull(c3321);
        return c3321;
    }
}
