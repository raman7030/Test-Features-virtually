package p067l;

import android.content.DialogInterface;
import android.content.res.Resources;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܿ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 8985 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19141 extends AbstractC11994 {
    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ֫ */
    public final void mo7575(final C18107 c18107) {
        final Resources resourcesM16235 = C7050.m16235();
        final CharSequence[] charSequenceArr = {resourcesM16235.getString(R.string.MT_Protector), resourcesM16235.getQuantityString(R.plurals.MT_Protector, 1, 1), resourcesM16235.getQuantityString(R.plurals.MT_Protector, 3, 3), resourcesM16235.getQuantityString(R.plurals.MT_Protector, 7, 7), resourcesM16235.getQuantityString(R.plurals.MT_Protector, 14, 14), resourcesM16235.getQuantityString(R.plurals.MT_Protector, 30, 30), resourcesM16235.getQuantityString(R.plurals.MT_Protector, 60, 60), resourcesM16235.getQuantityString(R.plurals.MT_Protector, 90, 90)};
        C20671 c20671BuildDialog = c18107.m41282().buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46723(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.۟᩸᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C18107 c18108 = c18107;
                C20671 c20671BuildDialog2 = c18108.m41282().buildDialog();
                c20671BuildDialog2.m46727(R.string.MT_Protector);
                c20671BuildDialog2.m46718(resourcesM16235.getString(R.string.MT_Protector, charSequenceArr[i]));
                c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener(this.f26883, i, c18108) { // from class: l.֫᩹᩻

                    /* JADX INFO: renamed from: ᩸ */
                    public final /* synthetic */ int f9872;

                    /* JADX INFO: renamed from: ᩹ */
                    public final /* synthetic */ C18107 f9873;

                    {
                        this.f9872 = i;
                        this.f9873 = c18108;
                    }

                    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i2) {
                        long j;
                        long j2;
                        boolean z;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int i3 = this.f9872;
                        switch (i3) {
                            case 0:
                                j = C14849.FOREVER_NS;
                                Main mainM41282 = this.f9873.m41282();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C19812(mainM41282, j, z).m22250();
                                return;
                            case 1:
                                j2 = 86400000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM41283 = this.f9873.m41282();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C19812(mainM41283, j, z).m22250();
                                return;
                            case 2:
                                j2 = 259200000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM41284 = this.f9873.m41282();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C19812(mainM41284, j, z).m22250();
                                return;
                            case 3:
                                j2 = 604800000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM41285 = this.f9873.m41282();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C19812(mainM41285, j, z).m22250();
                                return;
                            case 4:
                                j2 = 1209600000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM41286 = this.f9873.m41282();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C19812(mainM41286, j, z).m22250();
                                return;
                            case 5:
                                j2 = 2592000000L;
                                j = jCurrentTimeMillis - j2;
                                Main mainM41287 = this.f9873.m41282();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C19812(mainM41287, j, z).m22250();
                                return;
                            case 6:
                                j2 = 5184000000L;
                                j = jCurrentTimeMillis - j2;
                                Main mainM41288 = this.f9873.m41282();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C19812(mainM41288, j, z).m22250();
                                return;
                            case 7:
                                j2 = 7776000000L;
                                j = jCurrentTimeMillis - j2;
                                Main mainM41289 = this.f9873.m41282();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C19812(mainM41289, j, z).m22250();
                                return;
                            default:
                                throw new RuntimeException();
                        }
                    }
                });
                c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog2.m46732();
            }
        });
        c20671BuildDialog.m46732();
    }
}
