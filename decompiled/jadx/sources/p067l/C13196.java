package p067l;

/* JADX INFO: renamed from: l.ۨ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQ1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13196 {

    /* JADX INFO: renamed from: ܽ */
    public final C14121 f37082;

    /* JADX INFO: renamed from: ۧ */
    public final C13866 f37081 = C13866.m31575();

    /* JADX INFO: renamed from: ᩳ */
    public final ConcurrentMapC12768 f37083 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ֫ */
    public final C7831 f37080 = new C7831(0, this);

    public C13196(C14121 c14121) {
        this.f37082 = c14121;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23924 m30201(String str) {
        if (str.length() <= 2) {
            return null;
        }
        return (C23924) C19473.computeIfAbsent(this.f37083, str, this.f37080);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23924 m30200(C13196 c13196, String str) {
        InterfaceC15206 interfaceC15206M32127 = c13196.f37082.m32127(C17073.m38720(1, 1, str));
        if (interfaceC15206M32127 == null) {
            return c13196.f37081.m31576(str);
        }
        C9952 c9952Mo33762 = ((C14791) interfaceC15206M32127).mo33762();
        if (c9952Mo33762 == null) {
            return null;
        }
        return new C23924(c9952Mo33762);
    }
}
