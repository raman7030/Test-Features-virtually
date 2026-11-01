package p067l;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.alipay.sdk.p010m.p058y.C0252o;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.۬ܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SV */
/* JADX INFO: loaded from: classes4.dex */
public final class C14912 extends C10890 {

    /* JADX INFO: renamed from: ۟ */
    public C5525 f42530;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖܽ */
    public synchronized boolean m34122() {
        if (this.f42530 != null) {
            return true;
        }
        Cursor cursorQuery = C7050.m16233().query(C16253.m37020(mo33652()), new String[]{"mt_extras"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext() && !cursorQuery.isNull(0)) {
                    this.f42530 = m34127(cursorQuery.getString(0));
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

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֨ۧ */
    public final boolean mo29973() {
        return true;
    }

    @Override // p067l.C10890, p067l.AbstractC11070
    /* JADX INFO: renamed from: ֫ */
    public final void mo25089(File file, Uri uri, boolean z) {
    }

    @Override // p067l.C10890, p067l.AbstractC11070
    /* JADX INFO: renamed from: ۟ۧ */
    public final boolean mo25092() {
        return true;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩻ */
    public final C14912 mo34134() {
        return this;
    }

    @Override // p067l.C10890, p067l.AbstractC11070, p067l.C16433, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo25094() {
        if (this.f42530 != null) {
            return true;
        }
        return super.mo25094();
    }

    @Override // p067l.C10890, p067l.AbstractC11070, p067l.C16433
    /* JADX INFO: renamed from: ᩶ۧ */
    public final void mo25099() {
        super.mo25099();
        this.f42530 = null;
    }

    @Override // p067l.C10890, p067l.AbstractC11070
    /* JADX INFO: renamed from: ֫ */
    public final C10890 mo20485(File file, Uri uri) {
        return new C14912(file, uri, m25090());
    }

    @Override // p067l.C10890, p067l.AbstractC11070
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11070 mo20485(File file, Uri uri) {
        return new C14912(file, uri, m25090());
    }

    @Override // p067l.AbstractC11070
    /* JADX INFO: renamed from: ۤۧ */
    public final String[] mo25499() {
        return new String[]{"document_id", "_display_name", "mime_type", "_size", "last_modified", "mt_extras", "mt_path"};
    }

    @Override // p067l.AbstractC11070
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 mo25494(File file, Uri uri, Cursor cursor) {
        C14912 c14912Mo34134 = super.mo25494(file, uri, cursor).mo34134();
        if (!cursor.isNull(5)) {
            c14912Mo34134.f42530 = m34127(cursor.getString(5));
        }
        return c14912Mo34134;
    }

    @Override // p067l.AbstractC11070
    /* JADX INFO: renamed from: ۬ۧ */
    public final String[] mo25504() {
        return new String[]{"mime_type", "_size", "last_modified", "mt_path", "mt_extras"};
    }

    @Override // p067l.AbstractC11070
    /* JADX INFO: renamed from: ֫ */
    public final C14362 mo25492(Cursor cursor) {
        return m34119(cursor, 0, 1, 2, 4);
    }

    @Override // p067l.AbstractC11070
    /* JADX INFO: renamed from: ۧ */
    public final C14362 mo25501(Cursor cursor) {
        return m34119(cursor, 2, 3, 4, 5);
    }

    /* JADX INFO: renamed from: ֫ */
    private C14362 m34119(Cursor cursor, int i, int i2, int i3, int i4) throws IOException {
        EnumC5645 enumC5645;
        long j = cursor.isNull(i2) ? -1L : cursor.getLong(i2);
        long j2 = cursor.isNull(i3) ? -1L : cursor.getLong(i3);
        if (m34132()) {
            return new C14362(this, EnumC5645.DIRECTORY, -1L, j2, null);
        }
        boolean zIsNull = cursor.isNull(i4);
        File file = this.f30649;
        if (!zIsNull) {
            try {
                C5525 c5525M34127 = m34127(cursor.getString(i4));
                char cM12204 = c5525M34127.m12204();
                if (cM12204 == '-') {
                    enumC5645 = EnumC5645.REGULAR;
                } else if (cM12204 == 'd') {
                    enumC5645 = EnumC5645.DIRECTORY;
                } else if (cM12204 == 'l') {
                    enumC5645 = EnumC5645.LINK;
                } else {
                    enumC5645 = EnumC5645.OTHER;
                }
                EnumC5645 enumC5646 = enumC5645;
                EnumC5645 enumC5647 = EnumC5645.LINK;
                if (enumC5646 == enumC5647 && c5525M34127.m12206() == null) {
                    throw new IOException("Missing MT provider link target: " + file.getPath());
                }
                return new C14362(this, enumC5646, enumC5646 == EnumC5645.DIRECTORY ? -1L : j, j2, enumC5646 == enumC5647 ? c5525M34127.m12206() : null);
            } catch (RuntimeException e) {
                throw new IOException("Invalid MT provider metadata: " + file.getPath(), e);
            }
        }
        if (this.f30169) {
            return m25493(cursor, i, i2, i3);
        }
        throw new IOException("Missing MT provider metadata: " + file.getPath());
    }

    /* JADX INFO: renamed from: ᩴ */
    public static C5525 m34127(String str) {
        String[] strArrSplit = str.split("\\|", 4);
        return new C5525(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), strArrSplit.length == 4 ? strArrSplit[3] : null);
    }

    /* JADX INFO: renamed from: ۢܽ */
    public final boolean m34132() {
        C6196 c6196M25090 = m25090();
        File file = this.f30649;
        String path = file.getParentFile().getPath();
        if (path.length() != 18 ? false : path.equalsIgnoreCase(c6196M25090.m14040())) {
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

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20486(long j) {
        Uri uriMo33652 = mo33652();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", uriMo33652);
        bundle.putLong("time", j);
        Bundle bundleCall = C7050.m16233().call(uriMo33652, "mt:setLastModified", (String) null, bundle);
        if (bundleCall == null) {
            return false;
        }
        if (bundleCall.getBoolean(C0252o.f1208c)) {
            C11741 c11741 = this.f30650;
            if (c11741 == null) {
                return true;
            }
            c11741.f32787 = j;
            return true;
        }
        String string = bundleCall.getString("message");
        if (string == null) {
            return false;
        }
        System.err.println(string);
        return false;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22410 mo29976(InterfaceC8998 interfaceC8998) {
        return new C6866(this, this, interfaceC8998);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m34128(int i) {
        Uri uriMo33652 = mo33652();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", uriMo33652);
        bundle.putInt("permissions", i);
        Bundle bundleCall = C7050.m16233().call(uriMo33652, "mt:setPermissions", (String) null, bundle);
        if (bundleCall == null) {
            return false;
        }
        if (bundleCall.getBoolean(C0252o.f1208c)) {
            C5525 c5525 = this.f42530;
            if (c5525 == null) {
                return true;
            }
            c5525.f13214 = i | (c5525.f13214 & (-4096));
            return true;
        }
        String string = bundleCall.getString("message");
        if (string == null) {
            return false;
        }
        System.err.println(string);
        return false;
    }

    /* JADX INFO: renamed from: ᩻ܽ */
    public final String m34135() {
        if (C12799.m29347()) {
            return (String) C16433.m37330(new Callable() { // from class: l.᩹ܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f75210.m34125();
                }
            }, this.f30649.getPath(), 500);
        }
        return m34125();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺܽ */
    public String m34125() {
        Cursor cursorQuery = C7050.m16233().query(C16253.m37020(mo33652()), new String[]{"mt_path"}, null, null, null);
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
        return this.f30649.getPath();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܿ֫ */
    public final String mo29996() {
        if (m34132()) {
            return m34135();
        }
        m34131();
        C5525 c5525 = this.f42530;
        if (c5525 != null) {
            return c5525.f13216;
        }
        return null;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۜ֫ */
    public final AbstractC17043 mo34130() {
        return C18524.m42109(m34135(), new String[0]).m38672();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۖ֫ */
    public final String mo34129() {
        return m38691() ? m38677() : m34135();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܽ */
    public final void mo29995(final String str) throws IOException {
        if (C12799.m29347()) {
            C16433.m37329(new Callable() { // from class: l.᩶ܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    this.f68142.m34123(str);
                    return null;
                }
            });
        } else {
            m34123(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ */
    public void m34123(String str) throws IOException {
        Uri uriMo33652 = mo33652();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", uriMo33652);
        bundle.putString(MotionUtils.EASING_TYPE_PATH, str);
        Bundle bundleCall = C7050.m16233().call(uriMo33652, "mt:createSymlink", (String) null, bundle);
        if (bundleCall != null) {
            if (bundleCall.getBoolean(C0252o.f1208c)) {
                return;
            }
            String string = bundleCall.getString("message");
            if (string != null) {
                throw new IOException(string);
            }
        }
        throw new IOException("Unable to create link '" + this.f30649.getPath() + "' to '" + str + "'");
    }

    /* JADX INFO: renamed from: ۡܽ */
    public final boolean m34131() {
        if (this.f42530 != null) {
            return true;
        }
        if (C12799.m29347()) {
            return ((Boolean) C16433.m37330(new Callable() { // from class: l.᩸ܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f72226.m34122());
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return m34122();
    }

    /* JADX INFO: renamed from: ᩷ܽ */
    public final C5525 m34133() {
        C5525 c5525 = this.f42530;
        C12826.requireNonNull(c5525);
        return c5525;
    }
}
