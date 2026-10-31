package l;

import android.content.DialogInterface;
import android.content.res.Resources;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 8985 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17647 extends AbstractC10128 {
    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ֫ */
    public final void mo5346(final C16560 c16560) {
        final Resources resourcesM14338 = C4925.m14338();
        final CharSequence[] charSequenceArr = {resourcesM14338.getString(R.string.MT_Protector), resourcesM14338.getQuantityString(R.plurals.MT_Protector, 1, 1), resourcesM14338.getQuantityString(R.plurals.MT_Protector, 3, 3), resourcesM14338.getQuantityString(R.plurals.MT_Protector, 7, 7), resourcesM14338.getQuantityString(R.plurals.MT_Protector, 14, 14), resourcesM14338.getQuantityString(R.plurals.MT_Protector, 30, 30), resourcesM14338.getQuantityString(R.plurals.MT_Protector, 60, 60), resourcesM14338.getQuantityString(R.plurals.MT_Protector, 90, 90)};
        C19258 c19258BuildDialog = c16560.m39056().buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44429(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.۟᩸᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C16560 c16561 = c16560;
                C19258 c19258BuildDialog2 = c16561.m39056().buildDialog();
                c19258BuildDialog2.m44433(R.string.MT_Protector);
                c19258BuildDialog2.m44424(resourcesM14338.getString(R.string.MT_Protector, charSequenceArr[i]));
                c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener(this.f23969, i, c16561) { // from class: l.֫᩹᩻

                    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                    public final /* synthetic */ int f7085;

                    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
                    public final /* synthetic */ C16560 f7086;

                    {
                        this.f7085 = i;
                        this.f7086 = c16561;
                    }

                    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i2) {
                        long j;
                        long j2;
                        boolean z;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int i3 = this.f7085;
                        switch (i3) {
                            case 0:
                                j = C13132.FOREVER_NS;
                                Main mainM39056 = this.f7086.m39056();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C18353(mainM39056, j, z).m20274();
                                return;
                            case 1:
                                j2 = 86400000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM39057 = this.f7086.m39056();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C18353(mainM39057, j, z).m20274();
                                return;
                            case 2:
                                j2 = 259200000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM39058 = this.f7086.m39056();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C18353(mainM39058, j, z).m20274();
                                return;
                            case 3:
                                j2 = 604800000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM39059 = this.f7086.m39056();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C18353(mainM39059, j, z).m20274();
                                return;
                            case 4:
                                j2 = 1209600000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM390510 = this.f7086.m39056();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C18353(mainM390510, j, z).m20274();
                                return;
                            case 5:
                                j2 = 2592000000L;
                                j = jCurrentTimeMillis - j2;
                                Main mainM390511 = this.f7086.m39056();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C18353(mainM390511, j, z).m20274();
                                return;
                            case 6:
                                j2 = 5184000000L;
                                j = jCurrentTimeMillis - j2;
                                Main mainM390512 = this.f7086.m39056();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C18353(mainM390512, j, z).m20274();
                                return;
                            case 7:
                                j2 = 7776000000L;
                                j = jCurrentTimeMillis - j2;
                                Main mainM390513 = this.f7086.m39056();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C18353(mainM390513, j, z).m20274();
                                return;
                            default:
                                throw new RuntimeException();
                        }
                    }
                });
                c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19258BuildDialog2.m44438();
            }
        });
        c19258BuildDialog.m44438();
    }
}
