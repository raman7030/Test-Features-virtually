package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BK7 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC19887 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f64270 = 0;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C9357 f64271;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public int f64272;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final int[] f64273;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "VectorPreviewActivity";
    }

    public ActivityC19887() {
        this.f64273 = C21943.m49431() ? new int[]{-16777216, -7829368, -1} : new int[]{-1, -7829368, -16777216};
        this.f64272 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x006a  */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C12534 c12534;
        byte[] bArrM11708;
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector);
        m10241(R.string.MT_Protector);
        this.f10584 = (C9762) m10241(R.id.MT_Protector);
        this.f64271 = (C9357) m10241(R.id.MT_Protector);
        m10227(this.f10584);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC16536(1, this));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra(e.m);
        final C15518 c15518M36587 = null;
        if (byteArrayExtra == null) {
            try {
                AbstractC15440 abstractC15440M39862 = C16999.m39862(getIntent());
                byte[] bArrM36506 = abstractC15440M39862.m36506();
                String parent = abstractC15440M39862.getParent();
                AbstractC15440 abstractC15440M39866 = parent == null ? null : C16999.m39866(parent, "resources.arsc");
                c12534 = (abstractC15440M39866 == null || !abstractC15440M39866.mo23120()) ? null : new C12534(abstractC15440M39866);
                bArrM11708 = bArrM36506;
            } catch (Exception e) {
                m10224((Throwable) e, true);
                return;
            }
        } else {
            bArrM11708 = C3878.m11708(byteArrayExtra, byteArrayExtra.length);
            String stringExtra = getIntent().getStringExtra("arscPath");
            if (stringExtra != null) {
                AbstractC15440 abstractC15440M39867 = C16999.m39866(stringExtra, new String[0]);
                if (abstractC15440M39867.mo23120()) {
                    try {
                        c12534 = new C12534(abstractC15440M39867);
                    } catch (Throwable unused) {
                        c12534 = null;
                    }
                } else {
                    c12534 = null;
                }
            } else {
                c12534 = null;
            }
        }
        if (c12534 == null) {
            c12534 = new C12534();
        }
        try {
            try {
                c15518M36587 = C15518.m36587(C15206.m35978(bArrM11708).m35994(), c12534, false);
            } catch (Exception unused2) {
            }
            if (c15518M36587 != null) {
                this.f64271.setScaleType(ImageView.ScaleType.CENTER);
                this.f64271.setImageDrawable(c15518M36587);
                this.f64271.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.᩸ۖᩳ
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        ActivityC19887.m45734(this.f68662, c15518M36587);
                    }
                });
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(128, 128, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Rect rectCopyBounds = c15518M36587.copyBounds();
                c15518M36587.setBounds(0, 0, 128, 128);
                c15518M36587.draw(canvas);
                c15518M36587.setBounds(rectCopyBounds);
                int iM20003 = C7466.m20003(bitmapCreateBitmap);
                int[] iArr = this.f64273;
                if (C7466.m20006(iM20003, iArr[0])) {
                    this.f64272 = 1;
                }
                getWindow().getDecorView().setBackgroundColor(iArr[this.f64272]);
            }
        } catch (IOException e2) {
            m10223(e2, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45734(ActivityC19887 activityC19887, C15518 c15518) {
        float[] fArr;
        C9357 c9357 = activityC19887.f64271;
        int intrinsicWidth = c15518.getIntrinsicWidth();
        int intrinsicHeight = c15518.getIntrinsicHeight();
        int i = 0;
        float width = (c9357 == null ? 0 : (c9357.getWidth() - c9357.getPaddingLeft()) - c9357.getPaddingRight()) / intrinsicWidth;
        float height = (c9357 == null ? 0 : (c9357.getHeight() - c9357.getPaddingTop()) - c9357.getPaddingBottom()) / intrinsicHeight;
        float fMin = Math.min(width, height);
        float fMax = Math.max(width, height);
        if (fMin >= fMax) {
            fMax = fMin * 1.5f;
        }
        if (fMin >= 1.0f) {
            fArr = fMin >= 1.5f ? new float[]{1.0f, fMin, fMin} : new float[]{fMin, 2.0f * fMin, fMin};
        } else {
            fArr = new float[]{fMin, Math.max(2.0f * fMin, Math.min(3.0f, fMax)), fMin};
        }
        activityC19887.f64271.m24168(fArr[0], fArr[1]);
        activityC19887.f64271.post(new RunnableC22003(activityC19887, c15518, fArr, i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45735(ActivityC19887 activityC19887, C15518 c15518, float[] fArr) {
        if (c15518.getIntrinsicWidth() > activityC19887.f64271.getWidth() || c15518.getIntrinsicHeight() > activityC19887.f64271.getHeight()) {
            activityC19887.f64271.m24167(fArr[0]);
        } else {
            activityC19887.f64271.m24167(fArr[1]);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setShowAsAction(2);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.string.MT_Protector) {
            return false;
        }
        int i = this.f64272 + 1;
        this.f64272 = i;
        int[] iArr = this.f64273;
        if (i == iArr.length) {
            this.f64272 = 0;
        }
        getWindow().getDecorView().setBackgroundColor(iArr[this.f64272]);
        return true;
    }
}
