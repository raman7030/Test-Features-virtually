package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩷ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes5.dex */
public final class C22120 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C18107 f69983;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ AbstractC9381 f69985;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ ArrayList f69986;

    /* JADX INFO: renamed from: ܳ */
    public C4125 f69987;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ AbstractC5375 f69988;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C7367 f69989;

    /* JADX INFO: renamed from: ᩻ */
    public ArrayList f69990 = new ArrayList();

    /* JADX INFO: renamed from: ۜ */
    public C6455 f69984 = new C6455(0);

    public C22120(C7367 c7367, C18107 c18107, C22103 c22103, ArrayList arrayList, AbstractC5375 abstractC5375) {
        this.f69989 = c7367;
        this.f69983 = c18107;
        this.f69985 = c22103;
        this.f69986 = arrayList;
        this.f69988 = abstractC5375;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C4125 c4125 = new C4125(this.f69983.m41282());
        c4125.m8356(C7050.m16230(R.string.MT_Protector));
        c4125.m8345((RunnableC3439) null);
        c4125.m8351();
        this.f69987 = c4125;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        ArrayList<C8049> arrayList = new ArrayList();
        long jMo25101 = 0;
        for (C8049 c8049 : this.f69986) {
            if (c8049.m18699()) {
                arrayList.add(c8049);
                jMo25101 += c8049.m18694().mo25101();
            }
        }
        C22209 c22209 = new C22209(arrayList.size(), jMo25101);
        this.f69987.m8348(true);
        C10069 c10069 = new C10069(this.f69988);
        C8708 c8708 = new C8708(this, c22209);
        C6455 c6455 = this.f69984;
        c6455.m14742();
        try {
            for (C8049 c80410 : arrayList) {
                this.f69987.m8354(c80410.m18700());
                c10069.m23503(C4744.f10749, c80410.m18694().mo25505(), c80410.m18696(), C21272.f66912, c8708);
                if (this.f69987.m8358() || this.f69985.mo21805() == EnumC15415.DESTROYED) {
                    return;
                }
                c80410.m18697();
                c22209.m50045();
                this.f69990.add(c80410.m18700());
            }
        } finally {
            c6455.m14743();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C7367 c7367 = this.f69989;
        c7367.f19300 = false;
        if (this.f69987.m8358()) {
            C22682.m50793(R.string.MT_Protector);
            c7367.m17058(this.f69983, this.f69986, C7050.m16224(R.string.MT_Protector), true);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f69989.f19300 = false;
        final C18107 c18107 = this.f69983;
        Main mainM41282 = c18107.m41282();
        final ArrayList arrayList = this.f69986;
        mainM41282.m12259(exc, new DialogInterface.OnDismissListener() { // from class: l.᩻ۡ᩻
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f79261.f69989.m17058(c18107, arrayList, C7050.m16224(R.string.MT_Protector), true);
            }
        });
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f69987.m8349();
        ArrayList arrayList = this.f69990;
        C18107 c18107 = this.f69983;
        c18107.m41226((Collection) arrayList);
        c18107.m41241();
        C17127.m38755(this.f69988.mo11732());
    }
}
