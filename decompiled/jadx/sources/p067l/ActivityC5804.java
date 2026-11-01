package p067l;

import android.content.Intent;
import android.os.Bundle;
import java.io.PrintStream;

/* JADX INFO: renamed from: l.ۘ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQG */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC5804 extends ActivityC9732 {

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ int f14261 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f14262 = false;

    /* JADX INFO: renamed from: ᩹ */
    public int f14263 = -1;

    @Override // p067l.ActivityC9732, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f14263 = intent.getIntExtra("sessionID", -1);
        try {
            startActivityForResult((Intent) intent.getParcelableExtra("confirmationIntent"), 322);
        } catch (Exception e) {
            C20557.m46483(this.f14263, 3, e.getMessage());
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        PrintStream printStream = System.out;
        StringBuilder sbM49005 = C21720.m49005("onActivityResult ", i, " ", " ", i2);
        sbM49005.append(intent);
        printStream.println(sbM49005.toString());
        if (i == 322) {
            this.f14262 = true;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f14262) {
            return;
        }
        System.out.println("Installation canceled");
        C20557.m46483(this.f14263, 2, null);
    }
}
