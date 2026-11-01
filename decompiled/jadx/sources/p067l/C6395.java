package p067l;

import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plugin.api.p002ui.PluginProgressBar;
import bin.p000mt.plugin.api.util.Consumer;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6395 implements InterfaceC4595, InterfaceC21153, InterfaceC3299, InterfaceC10439, InterfaceC1666, Consumer, InterfaceC9969, InterfaceC1583, InterfaceC8453 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f16558;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f16559;

    public /* synthetic */ C6395(int i, Object obj) {
        this.f16558 = i;
        this.f16559 = obj;
    }

    @Override // bin.p000mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept, reason: collision with other method in class */
    public void mo56319accept(Object obj) {
        ((PluginProgressBar) this.f16559).setSecondaryProgress(((Integer) obj).intValue());
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        ActivityC12426.m28631((ActivityC12426) this.f16559, menuItem);
        return true;
    }

    @Override // p067l.InterfaceC10439
    /* JADX INFO: renamed from: ֫ */
    public View mo14636() {
        return ((View) this.f16559).findViewById(R.id.MT_Protector);
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        AbstractC5996 abstractC5996;
        switch (this.f16558) {
            case 1:
                abstractC5996 = (C15386) this.f16559;
                break;
            default:
                abstractC5996 = (C15168) this.f16559;
                break;
        }
        abstractC5996.mo13474(i);
    }

    @Override // p067l.InterfaceC3299
    /* JADX INFO: renamed from: ֫ */
    public void mo5747(int i, int i2, int i3, int i4) {
        C9471.m22000((C9471) this.f16559, i2, i3, i4);
    }

    @Override // p067l.InterfaceC21153
    /* JADX INFO: renamed from: ֫ */
    public void mo6900(Intent intent, int i) {
        switch (this.f16558) {
            case 0:
                ActivityC22429.m50382((ActivityC22429) this.f16559, i, intent);
                break;
            default:
                AbstractActivityC5549.m12248((AbstractActivityC5549) this.f16559, i);
                break;
        }
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public void mo9171(AbstractC7783 abstractC7783) {
        C21294.m48137((C21294) this.f16559, abstractC7783);
    }

    @Override // p067l.InterfaceC10439
    /* JADX INFO: renamed from: ۧ */
    public /* synthetic */ InterfaceC4739 mo14637() {
        return null;
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public /* synthetic */ boolean mo9173() {
        return false;
    }

    @Override // p067l.InterfaceC1666
    public C1914 onApplyWindowInsets(View view, C1914 c1914) {
        ViewGroup viewGroup = (ViewGroup) this.f16559;
        int i = ViewOnClickListenerC2730.f4575;
        C1388 c1388M51163 = c1914.m51163(1);
        C1388 c1388M51164 = c1914.m51163(2);
        C1388 c1388M51165 = c1914.m51163(8);
        viewGroup.setPadding(0, c1388M51163.f36105, 0, 0);
        view.setPadding(0, 0, 0, Math.max(c1388M51164.f36102, c1388M51165.f36102));
        return c1914;
    }

    @Override // p067l.InterfaceC9969
    public List accept(Object obj) {
        C16673 c16673 = (C16673) this.f16559;
        try {
            String strMo7189 = ((InterfaceC3736) obj).mo7189();
            if (strMo7189 == null) {
                return null;
            }
            C13929 c13929 = c16673.get();
            c13929.m56473reset((CharSequence) strMo7189);
            if (!C7974.m18465(c13929)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            do {
                C20699 c20699 = new C20699(0);
                c20699.f63914 = c13929.start();
                int iEnd = c13929.end();
                c20699.f63915 = iEnd;
                c20699.m46762(c20699.f63914, iEnd, (CharSequence) strMo7189);
                arrayList.add(c20699);
                if (!C7974.m18465(c13929)) {
                    break;
                }
            } while (arrayList.size() < 2000);
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }
}
