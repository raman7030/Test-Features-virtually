package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21XP */
/* JADX INFO: loaded from: classes2.dex */
public class C24257 extends AbstractC8202 {

    /* JADX INFO: renamed from: ۘ֫ */
    public static final /* synthetic */ int f76856 = 0;

    /* JADX INFO: renamed from: ۖ֫ */
    public AbstractC17043 f76857;

    /* JADX INFO: renamed from: ܺ֫ */
    public AbstractC17043 f76858;

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79708;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        m13491(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws IOException {
        List<AbstractC17043> list = (List) C23573.stream(m13494("ARG_PATHS")).map(new C18144(1)).collect(C24205.toList());
        C9873 c9873M23150 = C9873.m23150(15);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BufferedInputStream bufferedInputStreamM38676 = ((AbstractC17043) it.next()).m38676();
            try {
                C9873 c9873M23152 = C9873.m23152(C12461.m28690(bufferedInputStreamM38676));
                bufferedInputStreamM38676.close();
                if (c9873M23150.f27379 < c9873M23152.f27379) {
                    c9873M23150 = c9873M23152;
                }
            } catch (Throwable th) {
                try {
                    bufferedInputStreamM38676.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        boolean z = ApplicationC21448.f67649.getBoolean("delete_dex_files_after_merged", false);
        C20765 c20765 = new C20765(c9873M23150);
        for (AbstractC17043 abstractC17043 : list) {
            mo13474(0);
            mo13456(C7050.m16203(R.string.MT_Protector, abstractC17043.getName()));
            InputStream inputStreamMo29987 = abstractC17043.mo29987();
            try {
                C14645 c14645M33466 = C14645.m33466(inputStreamMo29987);
                int iM33494 = c14645M33466.m33494();
                int i = 0;
                for (C9952 c9952 : (AbstractC20050) c14645M33466.mo29500()) {
                    if (mo3924()) {
                        C18736 c18736M42768 = C18736.m42768();
                        inputStreamMo29987.close();
                        return c18736M42768;
                    }
                    mo13474(i / iM33494);
                    c20765.m46900((InterfaceC10509) c9952);
                    i += 100;
                    if (c20765.f71621.getItemCount() > 65536) {
                        throw new C3924(R.string.MT_Protector);
                    }
                    if (c20765.f71622.getItemCount() > 65536) {
                        throw new C3924(R.string.MT_Protector);
                    }
                    if (c20765.f71655.getItemCount() > 65536) {
                        throw new C3924("Merge failed, too many type references in Dex, you can try to merge fewer dex files.");
                    }
                }
                inputStreamMo29987.close();
            } catch (Throwable th3) {
                if (inputStreamMo29987 != null) {
                    try {
                        inputStreamMo29987.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        m13491(R.string.MT_Protector);
        AbstractC17043 abstractC17043M42109 = C18524.m42109(m13492("outputPath"), new String[0]);
        this.f76858 = abstractC17043M42109;
        if (!z || !abstractC17043M42109.mo25094()) {
            c20765.m50871(this.f76858);
            if (z) {
                m53562(list);
            }
        } else {
            AbstractC17043 abstractC17043M38678 = this.f76858.m38678(".tmp");
            this.f76857 = abstractC17043M38678;
            c20765.m50871(abstractC17043M38678);
            m53562(list);
            this.f76857.m38656(this.f76858, (Runnable) null);
        }
        return C18736.m42767();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53562(List list) {
        boolean z = list.size() > 1;
        if (z) {
            m13472(R.string.MT_Protector);
            mo13474(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC17043 abstractC17043 = (AbstractC17043) it.next();
            if (z) {
                mo13456(abstractC17043.getName());
            }
            abstractC17043.mo25503();
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773() && m13478(c18107)) {
            c18107.m41267();
            c18107.m41279(this.f76858.getName());
            c18107.m41241();
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        AbstractC17043 abstractC17043 = this.f76857;
        if (abstractC17043 != null) {
            abstractC17043.mo25503();
        }
        C17127.m38756();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16224(R.string.MT_Protector);
    }
}
