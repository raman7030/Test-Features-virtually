package l;

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
public final class TextureViewSurfaceTextureListenerC22160 extends FrameLayout implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC7379 f71912;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5932 f71913;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f71914;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextureView f71915;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f71916;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22865 f71917;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5227 f71918;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f71919;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f71920;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ImageView f71921;

    /* JADX WARN: Type inference failed for: r6v1, types: [l.ۚ۠ۡ] */
    public TextureViewSurfaceTextureListenerC22160(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71918 = new InterfaceC17236() { // from class: l.ۚ۠ۡ
            @Override // l.InterfaceC17236
            /* JADX INFO: renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
                this.f16373.m49790();
            }
        };
        ImageView imageView = new ImageView(context);
        this.f71921 = imageView;
        imageView.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        setPadding(0, 0, 0, 0);
        TextureView textureView = new TextureView(context);
        this.f71915 = textureView;
        textureView.setOpaque(false);
        textureView.setImportantForAccessibility(2);
        textureView.setSurfaceTextureListener(this);
        this.f71913 = new C5932(textureView, new RunnableC7968(5, this));
        textureView.setOnTouchListener(new View.OnTouchListener() { // from class: l.֨۠ۡ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f3704.f71913.m16657(motionEvent);
            }
        });
        addView(textureView, new FrameLayout.LayoutParams(-1, -1));
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49795(C15518 c15518) {
        this.f71921.setImageDrawable(c15518);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ImageView m49792() {
        return this.f71921;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49794(AbstractActivityC3346 abstractActivityC3346) {
        AbstractC7379 abstractC7379 = this.f71912;
        C5227 c5227 = this.f71918;
        if (abstractC7379 != null) {
            abstractC7379.mo19834(c5227);
        }
        this.f71912 = abstractActivityC3346.getLifecycle();
        if (isAttachedToWindow()) {
            this.f71912.mo19833(c5227);
        }
        m49790();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49796(boolean z) {
        this.f71913.m16656(z);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49797() {
        this.f71913.m16655(420L, true);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49798() {
        this.f71913.m16655(350L, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49781(TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160) {
        C22865 c22865 = textureViewSurfaceTextureListenerC22160.f71917;
        if (c22865 != null) {
            c22865.m50965(textureViewSurfaceTextureListenerC22160.f71913.f18182);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49793(int i) {
        this.f71914 = i;
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.f71916 = fArr[1] != 0.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m49779(int i, int i2) {
        ImageView imageView = this.f71921;
        return Math.min(Math.max(1, (i - imageView.getPaddingLeft()) - imageView.getPaddingRight()), Math.max(1, (i2 - imageView.getPaddingTop()) - imageView.getPaddingBottom())) / Math.max(1, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f71919 = false;
        this.f71920 = false;
        this.f71913.m16658(false);
        this.f71921.setVisibility(0);
        TextureView textureView = this.f71915;
        textureView.setAlpha(1.0f);
        try {
            m49780(surfaceTexture, i, i2);
        } catch (LinkageError | OutOfMemoryError | RuntimeException unused) {
            this.f71917 = null;
            this.f71920 = true;
            textureView.setAlpha(0.0f);
            m49790();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49780(SurfaceTexture surfaceTexture, int i, int i2) {
        C22865 c22865 = new C22865(getContext().getAssets(), surfaceTexture, i, i2, m49779(i, i2), this.f71914, this.f71916, new C21455(this));
        this.f71917 = c22865;
        c22865.m50965(this.f71913.f18182);
        m49790();
        this.f71917.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m49783(C22865 c22865) {
        if (this.f71921.getVisibility() == 0 && this.f71917 == c22865 && c22865 != null && c22865.f73766 && this.f71919 && !this.f71920) {
            this.f71921.setVisibility(4);
            m49790();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C22865 c22865 = this.f71917;
        if (c22865 != null) {
            c22865.m50963(i, m49779(i, i2), i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C22865 c22865 = this.f71917;
        this.f71917 = null;
        this.f71919 = false;
        this.f71921.setVisibility(0);
        this.f71913.m16658(false);
        if (c22865 == null) {
            return true;
        }
        c22865.m50962();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f71919 = true;
        m49783(this.f71917);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m49790();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m49790();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m49790();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC7379 abstractC7379 = this.f71912;
        if (abstractC7379 != null) {
            abstractC7379.mo19833(this.f71918);
        }
        m49790();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC7379 abstractC7379 = this.f71912;
        if (abstractC7379 != null) {
            abstractC7379.mo19834(this.f71918);
        }
        this.f71913.m16658(false);
        C22865 c22865 = this.f71917;
        if (c22865 != null) {
            c22865.m50964(false);
        }
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m49790() {
        C22865 c22865;
        AbstractC7379 abstractC7379;
        boolean z = false;
        boolean z2 = isAttachedToWindow() && getWindowVisibility() == 0 && isShown() && hasWindowFocus() && ((abstractC7379 = this.f71912) == null || abstractC7379.mo19832().m33028(EnumC13728.RESUMED));
        if (this.f71917 != null) {
            AbstractC7379 abstractC73710 = this.f71912;
            if (abstractC73710 == null || abstractC73710.mo19832() != EnumC13728.DESTROYED) {
                this.f71917.m50964(z2 && !this.f71920);
            } else {
                this.f71917.m50966();
            }
        }
        C5932 c5932 = this.f71913;
        if (c5932 != null) {
            if (z2 && !this.f71920 && (c22865 = this.f71917) != null && c22865.f73766 && this.f71919 && this.f71921.getVisibility() == 4) {
                z = true;
            }
            c5932.m16658(z);
        }
    }
}
