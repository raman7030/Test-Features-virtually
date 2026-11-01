package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 07NF */
/* JADX INFO: loaded from: classes5.dex */
public final class C19815 extends C6232 {

    /* JADX INFO: renamed from: ֫֫ */
    public final Map f60266;

    /* JADX INFO: renamed from: ۟ */
    public C21037 f60267;

    public C19815() {
        throw null;
    }

    public C19815(InterfaceC23016 interfaceC23016, InterfaceC6601 interfaceC6601, C16658 c16658, Map map) {
        super(interfaceC23016, interfaceC6601, c16658);
        this.f60266 = map;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45056(C21037 c21037) {
        this.f60267 = c21037;
        m14142();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    @Override // p067l.C6232
    /* JADX INFO: renamed from: ۧ */
    public final C10307 mo14127(C10307 c10307) {
        C21037 c21037;
        C21037 c21038 = this.f60267;
        if (c21038 == null) {
            c21038 = c10307.f28516;
        }
        if (c21038 != null && (c21037 = (C21037) this.f60266.get(c21038.f66009)) != null) {
            c21038 = c21037;
        }
        C25079 c25079 = c10307.f28526;
        if (c25079 == null) {
            c25079 = null;
        } else {
            int iM55048 = c25079.m55048();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= iM55048) {
                    i2 = -1;
                    break;
                }
                InterfaceC16361 interfaceC16361M55049 = c25079.m55049(i2);
                if ((interfaceC16361M55049 instanceof C11577) && "com.apple.streaming.transportStreamTimestamp".equals(((C11577) interfaceC16361M55049).f32250)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (iM55048 == 1) {
                    c25079 = null;
                } else {
                    InterfaceC16361[] interfaceC16361Arr = new InterfaceC16361[iM55048 - 1];
                    while (i < iM55048) {
                        if (i != i2) {
                            interfaceC16361Arr[i < i2 ? i : i - 1] = c25079.m55049(i);
                        }
                        i++;
                    }
                    c25079 = new C25079(interfaceC16361Arr);
                }
            }
        }
        if (c21038 != c10307.f28516 || c25079 != c10307.f28526) {
            C3601 c3601M23918 = c10307.m23918();
            c3601M23918.m6679(c21038);
            c3601M23918.m6681(c25079);
            c10307 = c3601M23918.m6672();
        }
        return super.mo14127(c10307);
    }
}
