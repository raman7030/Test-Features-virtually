package l;

import android.content.Intent;
import android.os.Bundle;
import java.io.PrintStream;

/* JADX INFO: renamed from: l.ۘ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQG */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC3615 extends ActivityC7747 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f11457 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f11458 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f11459 = -1;

    @Override // l.ActivityC7747, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f11459 = intent.getIntExtra("sessionID", -1);
        try {
            startActivityForResult((Intent) intent.getParcelableExtra("confirmationIntent"), 322);
        } catch (Exception e) {
            C19138.m44189(this.f11459, 3, e.getMessage());
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        PrintStream printStream = System.out;
        StringBuilder sbM46682 = C20361.m46682("onActivityResult ", i, " ", " ", i2);
        sbM46682.append(intent);
        printStream.println(sbM46682.toString());
        if (i == 322) {
            this.f11458 = true;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f11458) {
            return;
        }
        System.out.println("Installation canceled");
        C19138.m44189(this.f11459, 2, null);
    }
}
