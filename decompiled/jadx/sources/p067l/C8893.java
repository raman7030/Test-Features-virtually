package p067l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ۜܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes2.dex */
public final class C8893 {

    /* JADX INFO: renamed from: ֫ */
    public int f24100;

    /* JADX INFO: renamed from: ۧ */
    public String f24101;

    public C8893(String str) {
        this.f24101 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20500(int i) {
        this.f24100 = i;
        Intent intent = new Intent("bin.mt.protect.ProtectUploadService.ACTION_PROGRESS_CHANGED");
        intent.putExtra("taskID", this.f24101);
        intent.putExtra("progress", i);
        C7050.m16209(intent);
    }
}
