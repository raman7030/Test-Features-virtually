package p067l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BK7 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC21269 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ᩻ۧ */
    public static final /* synthetic */ int f66906 = 0;

    /* JADX INFO: renamed from: ܳۧ */
    public C11261 f66907;

    /* JADX INFO: renamed from: ܿۧ */
    public int f66908;

    /* JADX INFO: renamed from: ᩳۧ */
    public final int[] f66909;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "VectorPreviewActivity";
    }

    public ActivityC21269() {
        this.f66909 = C23223.m51768() ? new int[]{-16777216, -7829368, -1} : new int[]{-1, -7829368, -16777216};
        this.f66908 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x006a  */
    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C14281 c14281;
        byte[] bArrM13644;
        super.onCreate(bundle);
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        this.f13392 = (C1326) m12277(R.id.MT_Protector);
        this.f66907 = (C11261) m12277(R.id.MT_Protector);
        m12263(this.f13392);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC18084(1, this));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra(AbstractC0213e.f989m);
        final C17117 c17117M38746 = null;
        if (byteArrayExtra == null) {
            try {
                AbstractC17043 abstractC17043M42105 = C18524.m42105(getIntent());
                byte[] bArrM38664 = abstractC17043M42105.m38664();
                String parent = abstractC17043M42105.getParent();
                AbstractC17043 abstractC17043M42109 = parent == null ? null : C18524.m42109(parent, "resources.arsc");
                c14281 = (abstractC17043M42109 == null || !abstractC17043M42109.mo25094()) ? null : new C14281(abstractC17043M42109);
                bArrM13644 = bArrM38664;
            } catch (Exception e) {
                m12260((Throwable) e, true);
                return;
            }
        } else {
            bArrM13644 = C6054.m13644(byteArrayExtra, byteArrayExtra.length);
            String stringExtra = getIntent().getStringExtra("arscPath");
            if (stringExtra != null) {
                AbstractC17043 abstractC17043M421010 = C18524.m42109(stringExtra, new String[0]);
                if (abstractC17043M421010.mo25094()) {
                    try {
                        c14281 = new C14281(abstractC17043M421010);
                    } catch (Throwable unused) {
                        c14281 = null;
                    }
                } else {
                    c14281 = null;
                }
            } else {
                c14281 = null;
            }
        }
        if (c14281 == null) {
            c14281 = new C14281();
        }
        try {
            try {
                c17117M38746 = C17117.m38746(C16820.m38138(bArrM13644).m38154(), c14281, false);
            } catch (Exception unused2) {
            }
            if (c17117M38746 != null) {
                this.f66907.setScaleType(ImageView.ScaleType.CENTER);
                this.f66907.setImageDrawable(c17117M38746);
                this.f66907.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.᩸ۖᩳ
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        ActivityC21269.m48045(this.f71353, c17117M38746);
                    }
                });
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(128, 128, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Rect rectCopyBounds = c17117M38746.copyBounds();
                c17117M38746.setBounds(0, 0, 128, 128);
                c17117M38746.draw(canvas);
                c17117M38746.setBounds(rectCopyBounds);
                int iM21978 = C9464.m21978(bitmapCreateBitmap);
                int[] iArr = this.f66909;
                if (C9464.m21981(iM21978, iArr[0])) {
                    this.f66908 = 1;
                }
                getWindow().getDecorView().setBackgroundColor(iArr[this.f66908]);
            }
        } catch (IOException e2) {
            m12259(e2, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48045(ActivityC21269 activityC21269, C17117 c17117) {
        float[] fArr;
        C11261 c11261 = activityC21269.f66907;
        int intrinsicWidth = c17117.getIntrinsicWidth();
        int intrinsicHeight = c17117.getIntrinsicHeight();
        int i = 0;
        float width = (c11261 == null ? 0 : (c11261.getWidth() - c11261.getPaddingLeft()) - c11261.getPaddingRight()) / intrinsicWidth;
        float height = (c11261 == null ? 0 : (c11261.getHeight() - c11261.getPaddingTop()) - c11261.getPaddingBottom()) / intrinsicHeight;
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
        activityC21269.f66907.m26178(fArr[0], fArr[1]);
        activityC21269.f66907.post(new RunnableC23280(activityC21269, c17117, fArr, i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m48046(ActivityC21269 activityC21269, C17117 c17117, float[] fArr) {
        if (c17117.getIntrinsicWidth() > activityC21269.f66907.getWidth() || c17117.getIntrinsicHeight() > activityC21269.f66907.getHeight()) {
            activityC21269.f66907.m26177(fArr[0]);
        } else {
            activityC21269.f66907.m26177(fArr[1]);
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
        int i = this.f66908 + 1;
        this.f66908 = i;
        int[] iArr = this.f66909;
        if (i == iArr.length) {
            this.f66908 = 0;
        }
        getWindow().getDecorView().setBackgroundColor(iArr[this.f66908]);
        return true;
    }
}
