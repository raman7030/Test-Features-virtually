package p067l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20251 extends AbstractC15635 {

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC22097 f62597;

    /* JADX INFO: renamed from: ܿ */
    public C6169 f62598;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f62599;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C23603 f62600;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20251(C23603 c23603, InterfaceC4317 interfaceC4317, EnumC2483... enumC2483Arr) {
        super(interfaceC4317, enumC2483Arr);
        this.f62600 = c23603;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22380(EnumC2483 enumC2483, String str) {
        if (!this.f44742.contains(enumC2483)) {
            return false;
        }
        this.f44740 = true;
        this.f62597 = str == null ? null : this.f62600.m52425(str, new String[0]);
        return true;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ܽ */
    public final Collection mo8427() {
        InterfaceC22097 interfaceC22097 = this.f62597;
        if (interfaceC22097 == null) {
            return null;
        }
        return Collections.singleton(interfaceC22097);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final void mo22379(Iterable iterable) {
        if (iterable == null) {
            this.f62597 = null;
        } else {
            this.f44740 = true;
            this.f62597 = AbstractC15635.m35524(iterable);
        }
        this.f62598 = null;
        this.f62599 = false;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4317 mo25022(String str) {
        if (this.f62598 == null) {
            this.f62598 = new C6169(this.f62600);
        }
        C18238 c18238M13966 = this.f62598.m13966(str);
        if (c18238M13966 != null) {
            return c18238M13966;
        }
        C18238 c18238 = new C18238(this.f62600, this, this.f44741.getName() + "[" + str + "]", str, Collections.singletonList(this.f62597.resolve(str)), true);
        this.f62598.m13968(c18238);
        return c18238;
    }

    @Override // p067l.AbstractC15635, p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final void mo25023(Iterable iterable, String str) {
        InterfaceC22097 interfaceC22097M35524 = AbstractC15635.m35524(iterable);
        if (this.f62598 == null) {
            this.f62598 = new C6169(this.f62600);
        }
        C18238 c18238M13966 = this.f62598.m13966(str);
        if (c18238M13966 == null) {
            this.f62598.m13968(new C18238(this.f62600, this, this.f44741.getName() + "[" + str + "]", str, Collections.singletonList(interfaceC22097M35524), true));
        } else {
            c18238M13966.f54448 = Collections.singletonList(interfaceC22097M35524);
            this.f62598.m13972(c18238M13966);
        }
        this.f44740 = true;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4317 mo25025(InterfaceC22097 interfaceC22097) {
        C6169 c6169 = this.f62598;
        if (c6169 == null) {
            return null;
        }
        return c6169.m13971(interfaceC22097);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ܳ */
    public final Iterable mo25026() throws IOException {
        InterfaceC22097 interfaceC22097;
        if (!this.f62599 && (interfaceC22097 = this.f62597) != null) {
            DirectoryStream directoryStreamNewDirectoryStream = C18743.newDirectoryStream(interfaceC22097);
            try {
                Iterator it = directoryStreamNewDirectoryStream.iterator();
                while (it.hasNext()) {
                    mo25022(((InterfaceC22097) it.next()).getFileName().toString());
                }
                directoryStreamNewDirectoryStream.close();
                this.f62599 = true;
            } catch (Throwable th) {
                if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        C6169 c6169 = this.f62598;
        if (c6169 == null || c6169.m13973()) {
            return Collections.EMPTY_SET;
        }
        return Collections.singleton(this.f62598.m13974());
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22381(InterfaceC22097 interfaceC22097) {
        C6169 c6169 = this.f62598;
        if (c6169 != null) {
            return c6169.m13969(interfaceC22097);
        }
        return this.f62597 != null && C23603.m52416(interfaceC22097).startsWith(C23603.m52416(this.f62597));
    }
}
