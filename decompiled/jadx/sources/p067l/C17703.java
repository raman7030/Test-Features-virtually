package p067l;

/* JADX INFO: renamed from: l.ܺ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9OB */
/* JADX INFO: loaded from: classes4.dex */
public class C17703 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC7962 f52875;

    /* JADX INFO: renamed from: ۧ */
    public C19283 f52876;

    /* JADX INFO: renamed from: ܽ */
    public volatile AbstractC7962 f52877;

    /* JADX INFO: renamed from: ᩳ */
    public volatile InterfaceC10467 f52878;

    static {
        C19283.m43977();
    }

    public C17703(AbstractC7962 abstractC7962, C19283 c19283) {
        if (c19283 == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (abstractC7962 != null) {
            this.f52876 = c19283;
            this.f52875 = abstractC7962;
            return;
        }
        throw new NullPointerException("found null ByteString");
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC10467 m40240(InterfaceC10467 interfaceC10467) {
        InterfaceC10467 interfaceC10468 = this.f52878;
        this.f52875 = null;
        this.f52877 = null;
        this.f52878 = interfaceC10467;
        return interfaceC10468;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40237() {
        if (this.f52877 != null) {
            return this.f52877.size();
        }
        AbstractC7962 abstractC7962 = this.f52875;
        if (abstractC7962 != null) {
            return abstractC7962.size();
        }
        if (this.f52878 != null) {
            return this.f52878.getSerializedSize();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7962 m40239() {
        if (this.f52877 != null) {
            return this.f52877;
        }
        AbstractC7962 abstractC7962 = this.f52875;
        if (abstractC7962 != null) {
            return abstractC7962;
        }
        synchronized (this) {
            if (this.f52877 != null) {
                return this.f52877;
            }
            if (this.f52878 == null) {
                this.f52877 = AbstractC7962.f20935;
            } else {
                this.f52877 = this.f52878.toByteString();
            }
            return this.f52877;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10467 m40238(InterfaceC10467 interfaceC10467) {
        if (this.f52878 == null) {
            synchronized (this) {
                if (this.f52878 == null) {
                    try {
                        if (this.f52875 != null) {
                            this.f52878 = (InterfaceC10467) interfaceC10467.getParserForType().parseFrom(this.f52875, this.f52876);
                            this.f52877 = this.f52875;
                        } else {
                            this.f52878 = interfaceC10467;
                            this.f52877 = AbstractC7962.f20935;
                        }
                    } catch (C4293 unused) {
                        this.f52878 = interfaceC10467;
                        this.f52877 = AbstractC7962.f20935;
                    }
                }
            }
        }
        return this.f52878;
    }
}
