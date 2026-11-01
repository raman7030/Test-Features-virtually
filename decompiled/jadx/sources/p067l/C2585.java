package p067l;

import android.content.DialogInterface;
import android.util.Pair;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B6V */
/* JADX INFO: loaded from: classes2.dex */
public final class C2585 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ List f4267;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ C18107 f4268;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C7280 f4270;

    /* JADX INFO: renamed from: ۢ */
    public boolean f4271;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f4272;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ Runnable f4273;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC17043 f4275;

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f4269 = new ArrayList();

    /* JADX INFO: renamed from: ᩷ */
    public HashSet f4274 = new HashSet();

    public C2585(C7280 c7280, C18107 c18107, List list, Runnable runnable) {
        this.f4270 = c7280;
        this.f4268 = c18107;
        this.f4267 = list;
        this.f4273 = runnable;
        this.f4275 = c7280.f55050.m38684(C6458.m14757(c7280.m41982()));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164(this.f4268.m41282());
        c24164.mo51878((Runnable) null);
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431("...");
        c24164.mo51883();
        this.f4272 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        C7280 c7280;
        AbstractC17043 abstractC17043 = this.f4275;
        if (abstractC17043.mo25093()) {
            abstractC17043.mo25503();
        }
        abstractC17043.m38666();
        List<C12073> list = this.f4267;
        C6634 c6634 = new C6634(list.size());
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c7280 = this.f4270;
            if (!zHasNext) {
                break;
            }
            C12073 c12073 = (C12073) it.next();
            String strM27648 = c12073.m27648();
            String strM27647 = c12073.m27647();
            boolean zM27643 = c12073.m27643();
            C6177 entry = c7280.f19012.getEntry(strM27647.substring(1) + strM27648);
            if (entry == null) {
                entry = zM27643 ? c7280.f19012.getEntry(strM27648) : null;
            }
            if (entry == null) {
                c12073.m27641();
            } else {
                c6634.mo4686(entry.m14000(), Pair.create(c12073, entry));
            }
        }
        C19847.m45088(c6634.keySet(), new C20692(this, c7280, this.f4272, c6634));
        if (this.f4272.m53444()) {
            return;
        }
        for (C12073 c12074 : list) {
            if (c12074.m27649() && c12074.m27644() == null) {
                throw new IOException("Extract file failed: " + c12074.m27648());
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f4272.m53444()) {
            this.f4275.mo25503();
        } else {
            this.f4271 = true;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f4275.mo25503();
        this.f4268.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f4272.m53442();
        C17127.m38756();
        if (!this.f4271) {
            return;
        }
        C7280 c7280 = this.f4270;
        Iterator it = c7280.m41980().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.f4269;
            if (zHasNext) {
                C8049 c8049 = (C8049) it.next();
                if (!this.f4274.contains(c8049.m18696())) {
                    arrayList.add(c8049);
                }
            } else {
                c7280.m41977((List) arrayList);
                try {
                    this.f4273.run();
                    return;
                } catch (Throwable th) {
                    this.f4268.m41282().m12259(th, (DialogInterface.OnDismissListener) null);
                    return;
                }
            }
        }
    }
}
