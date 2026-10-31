package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7CI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6899 extends AbstractC11817 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int f21301;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public AbstractC8932 f21302;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public int f21303;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public String f21304;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public String f21305;

    public C6899(C20826 c20826) {
        super(c20826);
        this.f21302 = null;
        this.f21303 = -1;
        this.f21305 = l.b;
        this.f21304 = System.getProperty("line.separator");
        this.f29348 = EnumC0970.SIGNATURE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m18673() {
        return this.f21301;
    }

    @Override // l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4066() {
        return !this.f29340;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18671(int i, DataInputStream dataInputStream) {
        if (i != 2) {
            if (this.f29352) {
                this.f35255.m45770().mo32596("{0}: Invalid attribute length #{1}", EnumC4662.f14797.m13647(), Integer.valueOf(i));
            } else {
                throw new C4375(this.f35255.m45770(), "{0}: Invalid attribute length #{1}", EnumC4662.f14797.m13647(), Integer.valueOf(i));
            }
        }
        this.f21301 = dataInputStream.readUnsignedShort();
    }

    public final String toString() {
        return String.format("signature[%d]=%s", Integer.valueOf(this.f21301), this.f35264.m25964(this.f21301));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m18678() {
        if (this.f21302 == null) {
            this.f35255.getClass();
            this.f21302 = new C11049(this.f21301).m27434(this.f35264);
        }
        AbstractC8932 abstractC8932 = this.f21302;
        if (abstractC8932 != null) {
            return abstractC8932.toString().replace('/', '.');
        }
        return this.f35264.m25964(this.f21301);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC8932 m18677() {
        if (this.f21302 == null) {
            this.f35255.getClass();
            this.f21302 = new C11049(this.f21301).m27434(this.f35264);
        }
        return this.f21302;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m18676(int i) {
        this.f21303 = i;
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int mo18675() {
        int i = this.f21303;
        return i == -1 ? super.mo18675() : i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m18680() {
        this.f21304 = "";
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo18674() {
        m24658(m24657(mo18675(), this.f29348.m3427()));
        String strM25964 = this.f35264.m25964(this.f21301);
        if (this.f29326) {
            if (this.f29343) {
                m24654(String.format("#%d%s", Integer.valueOf(this.f21301), this.f21305).concat(this.f21304));
                return;
            } else {
                this.f29325.mo1968(m24657(m24651(), String.format("#%d%s", Integer.valueOf(this.f21301), this.f21305)));
                m24654(" // ".concat(strM25964).concat(this.f21304));
                return;
            }
        }
        m24654(strM25964.concat(this.f21305).concat(this.f21304));
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo18679() {
        m24658(m24657(mo18675(), EnumC0970.SIGNATURE.m3428()));
        String strM25964 = this.f35264.m25964(this.f21301);
        if (this.f29326) {
            if (this.f29343) {
                m24654(String.format("#%d%s", Integer.valueOf(this.f21301), this.f21305).concat(this.f21304));
                return;
            } else {
                this.f29325.mo1968(m24657(m24651(), String.format("#%d%s", Integer.valueOf(this.f21301), this.f21305)));
                m24654(" // ".concat(strM25964).concat(this.f21304));
                return;
            }
        }
        m24654(strM25964.concat(this.f21305).concat(this.f21304));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6491 m18670(Function function) {
        String str;
        if (this.f29347) {
            return new C6491("", "");
        }
        String str2 = String.format(":#%d", Integer.valueOf(this.f21301));
        if (((Boolean) function.apply(Integer.valueOf(this.f21301))).booleanValue()) {
            str = ":" + this.f35264.m25964(this.f21301);
        } else {
            str = String.format(":?%d Invalid constant_pool index", Integer.valueOf(this.f21301));
        }
        return new C6491(str2, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18672(boolean z) {
        this.f21305 = z ? l.b : ",";
    }
}
