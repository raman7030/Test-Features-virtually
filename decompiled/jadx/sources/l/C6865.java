package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ۜܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes2.dex */
public final class C6865 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f21221;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f21222;

    public C6865(String str) {
        this.f21222 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18551(int i) {
        this.f21221 = i;
        Intent intent = new Intent("bin.mt.protect.ProtectUploadService.ACTION_PROGRESS_CHANGED");
        intent.putExtra("taskID", this.f21222);
        intent.putExtra("progress", i);
        C4925.m14312(intent);
    }
}
