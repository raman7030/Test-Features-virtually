package p067l;

/* JADX INFO: renamed from: l.᩶ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7RX */
/* JADX INFO: loaded from: classes5.dex */
public class C21261 extends C5206 implements InterfaceC7217 {

    /* JADX INFO: renamed from: ۖ */
    public boolean f66807;

    /* JADX INFO: renamed from: ۘ */
    public boolean f66808;

    /* JADX INFO: renamed from: ܺ */
    public EnumC2522 f66809;

    @Override // p067l.InterfaceC7217
    public String getText() {
        return null;
    }

    public C21261(EnumC2522 enumC2522, C5876 c5876, char[] cArr, int i) {
        super(c5876, cArr, i);
        this.f66807 = false;
        this.f66808 = false;
        this.f66809 = enumC2522;
    }

    @Override // p067l.InterfaceC7217
    public final EnumC2522 getStyle() {
        return this.f66809;
    }

    @Override // p067l.InterfaceC7217
    public final boolean isDeprecated() {
        if (!this.f66808 && this.f66809 == EnumC2522.JAVADOC) {
            mo48021();
        }
        return this.f66807;
    }

    /* JADX INFO: renamed from: ܺ */
    public void mo48021() {
        try {
            m31649("/**");
            while (m31658()) {
                m31651();
                while (m31647('*')) {
                    if (m31656('/')) {
                        return;
                    }
                }
                m31651();
                if ((this.f66807 || m31649("@deprecated")) && m31658()) {
                    if (Character.isWhitespace(m31645())) {
                        this.f66807 = true;
                    } else if (m31647('*') && m31656('/')) {
                        this.f66807 = true;
                        return;
                    }
                }
                while (m31658()) {
                    char cM31645 = m31645();
                    if (cM31645 == '\n' || cM31645 == '\r') {
                        m31647('\r');
                        m31647('\n');
                        break;
                    } else if (cM31645 != '*') {
                        mo11169();
                    } else {
                        mo11169();
                        if (m31656('/')) {
                            return;
                        }
                    }
                }
            }
        } finally {
            this.f66808 = true;
        }
    }
}
