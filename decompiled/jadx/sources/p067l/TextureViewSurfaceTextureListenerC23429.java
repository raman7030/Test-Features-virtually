package p067l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.᩹۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6VB */
/* JADX INFO: loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC23429 extends FrameLayout implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: ۗ */
    public AbstractC9381 f74634;

    /* JADX INFO: renamed from: ۙ */
    public final C8006 f74635;

    /* JADX INFO: renamed from: ۛ */
    public int f74636;

    /* JADX INFO: renamed from: ۤ */
    public final TextureView f74637;

    /* JADX INFO: renamed from: ۨ */
    public boolean f74638;

    /* JADX INFO: renamed from: ۫ */
    public C24099 f74639;

    /* JADX INFO: renamed from: ۬ */
    public final C7336 f74640;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f74641;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f74642;

    /* JADX INFO: renamed from: ᩹ */
    public final ImageView f74643;

    /* JADX WARN: Type inference failed for: r6v1, types: [l.ۚ۠ۡ] */
    public TextureViewSurfaceTextureListenerC23429(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74640 = new InterfaceC18749() { // from class: l.ۚ۠ۡ
            @Override // p067l.InterfaceC18749
            /* JADX INFO: renamed from: ֫ */
            public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
                this.f19213.m52128();
            }
        };
        ImageView imageView = new ImageView(context);
        this.f74643 = imageView;
        imageView.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        setPadding(0, 0, 0, 0);
        TextureView textureView = new TextureView(context);
        this.f74637 = textureView;
        textureView.setOpaque(false);
        textureView.setImportantForAccessibility(2);
        textureView.setSurfaceTextureListener(this);
        this.f74635 = new C8006(textureView, new RunnableC9941(5, this));
        textureView.setOnTouchListener(new View.OnTouchListener() { // from class: l.֨۠ۡ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f6479.f74635.m18583(motionEvent);
            }
        });
        addView(textureView, new FrameLayout.LayoutParams(-1, -1));
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52133(C17117 c17117) {
        this.f74643.setImageDrawable(c17117);
    }

    /* JADX INFO: renamed from: ֫ */
    public final ImageView m52130() {
        return this.f74643;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52132(AbstractActivityC5549 abstractActivityC5549) {
        AbstractC9381 abstractC9381 = this.f74634;
        C7336 c7336 = this.f74640;
        if (abstractC9381 != null) {
            abstractC9381.mo21807(c7336);
        }
        this.f74634 = abstractActivityC5549.getLifecycle();
        if (isAttachedToWindow()) {
            this.f74634.mo21806(c7336);
        }
        m52128();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52134(boolean z) {
        this.f74635.m18582(z);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52135() {
        this.f74635.m18581(420L, true);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m52136() {
        this.f74635.m18581(350L, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52119(TextureViewSurfaceTextureListenerC23429 textureViewSurfaceTextureListenerC23429) {
        C24099 c24099 = textureViewSurfaceTextureListenerC23429.f74639;
        if (c24099 != null) {
            c24099.m53355(textureViewSurfaceTextureListenerC23429.f74635.f21036);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52131(int i) {
        this.f74636 = i;
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.f74638 = fArr[1] != 0.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    private float m52117(int i, int i2) {
        ImageView imageView = this.f74643;
        return Math.min(Math.max(1, (i - imageView.getPaddingLeft()) - imageView.getPaddingRight()), Math.max(1, (i2 - imageView.getPaddingTop()) - imageView.getPaddingBottom())) / Math.max(1, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f74641 = false;
        this.f74642 = false;
        this.f74635.m18584(false);
        this.f74643.setVisibility(0);
        TextureView textureView = this.f74637;
        textureView.setAlpha(1.0f);
        try {
            m52118(surfaceTexture, i, i2);
        } catch (LinkageError | OutOfMemoryError | RuntimeException unused) {
            this.f74639 = null;
            this.f74642 = true;
            textureView.setAlpha(0.0f);
            m52128();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52118(SurfaceTexture surfaceTexture, int i, int i2) {
        C24099 c24099 = new C24099(getContext().getAssets(), surfaceTexture, i, i2, m52117(i, i2), this.f74636, this.f74638, new C22759(this));
        this.f74639 = c24099;
        c24099.m53355(this.f74635.f21036);
        m52128();
        this.f74639.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m52121(C24099 c24099) {
        if (this.f74643.getVisibility() == 0 && this.f74639 == c24099 && c24099 != null && c24099.f76497 && this.f74641 && !this.f74642) {
            this.f74643.setVisibility(4);
            m52128();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C24099 c24099 = this.f74639;
        if (c24099 != null) {
            c24099.m53353(i, m52117(i, i2), i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C24099 c24099 = this.f74639;
        this.f74639 = null;
        this.f74641 = false;
        this.f74643.setVisibility(0);
        this.f74635.m18584(false);
        if (c24099 == null) {
            return true;
        }
        c24099.m53352();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f74641 = true;
        m52121(this.f74639);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m52128();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m52128();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m52128();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC9381 abstractC9381 = this.f74634;
        if (abstractC9381 != null) {
            abstractC9381.mo21806(this.f74640);
        }
        m52128();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC9381 abstractC9381 = this.f74634;
        if (abstractC9381 != null) {
            abstractC9381.mo21807(this.f74640);
        }
        this.f74635.m18584(false);
        C24099 c24099 = this.f74639;
        if (c24099 != null) {
            c24099.m53354(false);
        }
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m52128() {
        C24099 c24099;
        AbstractC9381 abstractC9381;
        boolean z = false;
        boolean z2 = isAttachedToWindow() && getWindowVisibility() == 0 && isShown() && hasWindowFocus() && ((abstractC9381 = this.f74634) == null || abstractC9381.mo21805().m35142(EnumC15415.RESUMED));
        if (this.f74639 != null) {
            AbstractC9381 abstractC9382 = this.f74634;
            if (abstractC9382 == null || abstractC9382.mo21805() != EnumC15415.DESTROYED) {
                this.f74639.m53354(z2 && !this.f74642);
            } else {
                this.f74639.m53356();
            }
        }
        C8006 c8006 = this.f74635;
        if (c8006 != null) {
            if (z2 && !this.f74642 && (c24099 = this.f74639) != null && c24099.f76497 && this.f74641 && this.f74643.getVisibility() == 4) {
                z = true;
            }
            c8006.m18584(z);
        }
    }
}
