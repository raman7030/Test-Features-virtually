package p067l;

import android.os.AsyncTask;

/* JADX INFO: renamed from: l.۫᩹ */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncTaskC1471 extends AsyncTask {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractServiceC1398 f41233;

    public AsyncTaskC1471(AbstractServiceC1398 abstractServiceC1398) {
        this.f41233 = abstractServiceC1398;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        InterfaceC1436 interfaceC1436M35834;
        while (true) {
            AbstractServiceC1398 abstractServiceC1398 = this.f41233;
            JobServiceEngineC1541 jobServiceEngineC1541 = abstractServiceC1398.f36649;
            if (jobServiceEngineC1541 != null) {
                interfaceC1436M35834 = jobServiceEngineC1541.m35834();
            } else {
                synchronized (abstractServiceC1398.f36652) {
                    interfaceC1436M35834 = abstractServiceC1398.f36652.size() > 0 ? (InterfaceC1436) abstractServiceC1398.f36652.remove(0) : null;
                }
            }
            if (interfaceC1436M35834 == null) {
                return null;
            }
            this.f41233.mo25162(interfaceC1436M35834.getIntent());
            interfaceC1436M35834.mo19555();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.f41233.m29846();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.f41233.m29846();
    }
}
