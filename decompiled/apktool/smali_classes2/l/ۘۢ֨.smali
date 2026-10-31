.class public final Ll/ۘۢ֨;
.super Ljava/lang/Thread;
.source "D5IX"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# instance fields
.field public ۙ:[J

.field public final ᩶:Ljava/lang/ref/WeakReference;

.field public final ᩸:Ll/᩺᩷֨;

.field public ᩹:Lpl/droidsonroids/gif/GifInfoHandle;


# direct methods
.method public constructor <init>(Ll/ᩴۢ֨;)V
    .locals 1

    const-string v0, "GifRenderThread"

    .line 166
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 159
    new-instance v0, Ll/᩺᩷֨;

    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 159
    iput-object v0, p0, Ll/ۘۢ֨;->᩸:Ll/᩺᩷֨;

    .line 160
    new-instance v0, Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-direct {v0}, Lpl/droidsonroids/gif/GifInfoHandle;-><init>()V

    iput-object v0, p0, Ll/ۘۢ֨;->᩹:Lpl/droidsonroids/gif/GifInfoHandle;

    .line 167
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۘۢ֨;->᩶:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static synthetic ֫(Ll/ۘۢ֨;)Lpl/droidsonroids/gif/GifInfoHandle;
    .locals 0

    .line 157
    iget-object p0, p0, Ll/ۘۢ֨;->᩹:Lpl/droidsonroids/gif/GifInfoHandle;

    return-object p0
.end method


# virtual methods
.method public final onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    .line 234
    iget-object p1, p0, Ll/ۘۢ֨;->᩶:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩴۢ֨;

    if-eqz p1, :cond_0

    .line 236
    iget-object p2, p0, Ll/ۘۢ֨;->᩹:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-static {p1, p2}, Ll/ᩴۢ֨;->֫(Ll/ᩴۢ֨;Lpl/droidsonroids/gif/GifInfoHandle;)V

    .line 238
    :cond_0
    iget-object p1, p0, Ll/ۘۢ֨;->᩸:Ll/᩺᩷֨;

    invoke-virtual {p1}, Ll/᩺᩷֨;->ܽ()V

    return-void
.end method

.method public final onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 0

    .line 248
    iget-object p1, p0, Ll/ۘۢ֨;->᩸:Ll/᩺᩷֨;

    invoke-virtual {p1}, Ll/᩺᩷֨;->ۧ()V

    .line 249
    iget-object p1, p0, Ll/ۘۢ֨;->᩹:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {p1}, Lpl/droidsonroids/gif/GifInfoHandle;->᩵()V

    .line 250
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    const/4 p1, 0x1

    return p1
.end method

.method public final onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    return-void
.end method

.method public final onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public final run()V
    .locals 4

    .line 173
    :try_start_0
    iget-object v0, p0, Ll/ۘۢ֨;->᩶:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴۢ֨;

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 177
    :cond_0
    invoke-static {v0}, Ll/ᩴۢ֨;->֫(Ll/ᩴۢ֨;)Ll/ۙۢ֨;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۙۢ֨;->֫()Lpl/droidsonroids/gif/GifInfoHandle;

    move-result-object v1

    iput-object v1, p0, Ll/ۘۢ֨;->᩹:Lpl/droidsonroids/gif/GifInfoHandle;

    .line 178
    invoke-virtual {v0}, Landroid/view/View;->isOpaque()Z

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lpl/droidsonroids/gif/GifInfoHandle;->֫(ZC)V

    .line 179
    invoke-static {v0}, Ll/ᩴۢ֨;->ۧ(Ll/ᩴۢ֨;)Ll/֨ۢ֨;

    move-result-object v1

    iget v1, v1, Ll/֨ۢ֨;->ۧ:I

    if-ltz v1, :cond_1

    .line 180
    iget-object v1, p0, Ll/ۘۢ֨;->᩹:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-static {v0}, Ll/ᩴۢ֨;->ۧ(Ll/ᩴۢ֨;)Ll/֨ۢ֨;

    move-result-object v0

    iget v0, v0, Ll/֨ۢ֨;->ۧ:I

    invoke-virtual {v1, v0}, Lpl/droidsonroids/gif/GifInfoHandle;->֫(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 187
    :cond_1
    iget-object v0, p0, Ll/ۘۢ֨;->᩶:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ᩴۢ֨;

    if-nez v1, :cond_2

    .line 189
    iget-object v0, p0, Ll/ۘۢ֨;->᩹:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->֡()V

    return-void

    .line 193
    :cond_2
    invoke-static {v1, p0}, Ll/ᩴۢ֨;->֫(Ll/ᩴۢ֨;Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 194
    invoke-virtual {v1}, Landroid/view/TextureView;->isAvailable()Z

    move-result v2

    .line 195
    iget-object v3, p0, Ll/ۘۢ֨;->᩸:Ll/᩺᩷֨;

    move-object v0, v3

    .line 0
    monitor-enter v0

    if-eqz v2, :cond_3

    .line 24
    :try_start_1
    invoke-virtual {v3}, Ll/᩺᩷֨;->ܽ()V

    goto :goto_0

    .line 26
    :cond_3
    invoke-virtual {v3}, Ll/᩺᩷֨;->ۧ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    :goto_0
    monitor-exit v0

    if-eqz v2, :cond_4

    .line 197
    new-instance v0, Ll/ۖۢ֨;

    invoke-direct {v0, p0, v1}, Ll/ۖۢ֨;-><init>(Ll/ۘۢ֨;Ll/ᩴۢ֨;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 204
    :cond_4
    iget-object v0, p0, Ll/ۘۢ֨;->᩹:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-static {v1}, Ll/ᩴۢ֨;->ܽ(Ll/ᩴۢ֨;)F

    move-result v1

    invoke-virtual {v0, v1}, Lpl/droidsonroids/gif/GifInfoHandle;->֫(F)V

    .line 206
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_7

    .line 208
    :try_start_2
    iget-object v0, p0, Ll/ۘۢ֨;->᩸:Ll/᩺᩷֨;

    invoke-virtual {v0}, Ll/᩺᩷֨;->֫()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 213
    iget-object v0, p0, Ll/ۘۢ֨;->᩶:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴۢ֨;

    if-nez v0, :cond_5

    goto :goto_2

    .line 217
    :cond_5
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_1

    .line 221
    :cond_6
    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 223
    :try_start_3
    iget-object v0, p0, Ll/ۘۢ֨;->᩹:Lpl/droidsonroids/gif/GifInfoHandle;

    iget-object v2, p0, Ll/ۘۢ֨;->ۙ:[J

    invoke-virtual {v0, v1, v2}, Lpl/droidsonroids/gif/GifInfoHandle;->֫(Landroid/view/Surface;[J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 225
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 226
    throw v0

    .line 210
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 228
    :cond_7
    :goto_2
    iget-object v0, p0, Ll/ۘۢ֨;->᩹:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->֡()V

    .line 229
    new-instance v0, Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-direct {v0}, Lpl/droidsonroids/gif/GifInfoHandle;-><init>()V

    iput-object v0, p0, Ll/ۘۢ֨;->᩹:Lpl/droidsonroids/gif/GifInfoHandle;

    return-void

    :catchall_1
    move-exception v1

    .line 28
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1

    :catch_1
    :goto_3
    return-void
.end method

.method public final ֫(Ll/ᩴۢ֨;)V
    .locals 1

    .line 260
    iget-object v0, p0, Ll/ۘۢ֨;->᩸:Ll/᩺᩷֨;

    invoke-virtual {v0}, Ll/᩺᩷֨;->ۧ()V

    const/4 v0, 0x0

    .line 263
    invoke-static {p1, v0}, Ll/ᩴۢ֨;->֫(Ll/ᩴۢ֨;Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 264
    iget-object p1, p0, Ll/ۘۢ֨;->᩹:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {p1}, Lpl/droidsonroids/gif/GifInfoHandle;->᩵()V

    .line 265
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method
