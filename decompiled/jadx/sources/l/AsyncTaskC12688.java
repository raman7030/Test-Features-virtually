package l;

import android.os.AsyncTask;

/* JADX INFO: renamed from: l.۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncTaskC12688 extends AsyncTask {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC11215 f38205;

    public AsyncTaskC12688(AbstractServiceC11215 abstractServiceC11215) {
        this.f38205 = abstractServiceC11215;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        InterfaceC11983 interfaceC11983M33708;
        while (true) {
            AbstractServiceC11215 abstractServiceC11215 = this.f38205;
            JobServiceEngineC14098 jobServiceEngineC14098 = abstractServiceC11215.f33650;
            if (jobServiceEngineC14098 != null) {
                interfaceC11983M33708 = jobServiceEngineC14098.m33708();
            } else {
                synchronized (abstractServiceC11215.f33653) {
                    interfaceC11983M33708 = abstractServiceC11215.f33653.size() > 0 ? (InterfaceC11983) abstractServiceC11215.f33653.remove(0) : null;
                }
            }
            if (interfaceC11983M33708 == null) {
                return null;
            }
            this.f38205.mo23218(interfaceC11983M33708.getIntent());
            interfaceC11983M33708.mo17615();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.f38205.m27784();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.f38205.m27784();
    }
}
