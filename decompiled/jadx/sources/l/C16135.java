package l;

/* JADX INFO: renamed from: l.ܺ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9OB */
/* JADX INFO: loaded from: classes4.dex */
public class C16135 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5886 f49709;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C17798 f49710;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile AbstractC5886 f49711;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC8522 f49712;

    static {
        C17798.m41731();
    }

    public C16135(AbstractC5886 abstractC5886, C17798 c17798) {
        if (c17798 == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (abstractC5886 != null) {
            this.f49710 = c17798;
            this.f49709 = abstractC5886;
            return;
        }
        throw new NullPointerException("found null ByteString");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8522 m38048(InterfaceC8522 interfaceC8522) {
        InterfaceC8522 interfaceC8523 = this.f49712;
        this.f49709 = null;
        this.f49711 = null;
        this.f49712 = interfaceC8522;
        return interfaceC8523;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38045() {
        if (this.f49711 != null) {
            return this.f49711.size();
        }
        AbstractC5886 abstractC5886 = this.f49709;
        if (abstractC5886 != null) {
            return abstractC5886.size();
        }
        if (this.f49712 != null) {
            return this.f49712.getSerializedSize();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5886 m38047() {
        if (this.f49711 != null) {
            return this.f49711;
        }
        AbstractC5886 abstractC5886 = this.f49709;
        if (abstractC5886 != null) {
            return abstractC5886;
        }
        synchronized (this) {
            if (this.f49711 != null) {
                return this.f49711;
            }
            if (this.f49712 == null) {
                this.f49711 = AbstractC5886.f18080;
            } else {
                this.f49711 = this.f49712.toByteString();
            }
            return this.f49711;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8522 m38046(InterfaceC8522 interfaceC8522) {
        if (this.f49712 == null) {
            synchronized (this) {
                if (this.f49712 == null) {
                    try {
                        if (this.f49709 != null) {
                            this.f49712 = (InterfaceC8522) interfaceC8522.getParserForType().parseFrom(this.f49709, this.f49710);
                            this.f49711 = this.f49709;
                        } else {
                            this.f49712 = interfaceC8522;
                            this.f49711 = AbstractC5886.f18080;
                        }
                    } catch (C2025 unused) {
                        this.f49712 = interfaceC8522;
                        this.f49711 = AbstractC5886.f18080;
                    }
                }
            }
        }
        return this.f49712;
    }
}
