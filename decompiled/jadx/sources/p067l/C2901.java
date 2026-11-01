package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9QE */
/* JADX INFO: loaded from: classes3.dex */
public final class C2901 extends AbstractC6275 {

    /* JADX INFO: renamed from: ᩶ */
    public ArrayList f5017;

    public C2901(String str, String str2) {
        super(str, str2);
        this.f5017 = new ArrayList();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4676(int i, C17441 c17441) {
        this.f5017.add(new C7596(i, c17441));
    }

    @Override // p067l.InterfaceC17832
    /* JADX INFO: renamed from: ۠ */
    public final int mo4679() {
        return this.f5017.size();
    }

    @Override // p067l.InterfaceC17832
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC5093 mo4678(int i) {
        return (InterfaceC5093) this.f5017.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4677(InterfaceC6631 interfaceC6631) {
        Iterator it = m14243().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += (((C17441) ((C7596) it.next()).mo10842()).size() * 4) + 16;
        }
        interfaceC6631.mo15111((short) 516);
        interfaceC6631.mo15111((short) 1032);
        interfaceC6631.writeInt(size + 1032);
        interfaceC6631.mo15110(256, getName());
        interfaceC6631.mo15110(256, mo14244());
        for (C7596 c7596 : m14243()) {
            InterfaceC3340 interfaceC3340Mo10842 = c7596.mo10842();
            interfaceC6631.mo15111((short) 517);
            interfaceC6631.mo15111((short) 16);
            C17441 c17441 = (C17441) interfaceC3340Mo10842;
            interfaceC6631.writeInt((c17441.size() * 4) + 16);
            interfaceC6631.writeInt(c7596.mo10843());
            interfaceC6631.writeInt(c17441.size());
            for (int i = 0; i < c17441.size(); i++) {
                interfaceC6631.writeInt(c17441.getInt(i));
            }
        }
    }
}
