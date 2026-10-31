.class public final Ll/᩷ۚ֫;
.super Ljava/lang/Object;
.source "I8LX"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;
.implements Ljava/lang/Runnable;


# static fields
.field public static final ۫:[I


# instance fields
.field public ۗ:Landroid/graphics/SurfaceTexture;

.field public ۙ:Landroid/opengl/EGLSurface;

.field public final ۬:[I

.field public final ᩶:Landroid/os/Handler;

.field public ᩸:Landroid/opengl/EGLContext;

.field public ᩹:Landroid/opengl/EGLDisplay;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x11

    new-array v0, v0, [I

    .line 67
    fill-array-data v0, :array_0

    sput-object v0, Ll/᩷ۚ֫;->۫:[I

    return-void

    :array_0
    .array-data 4
        0x3040
        0x4
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x8
        0x3025
        0x0
        0x3027
        0x3038
        0x3033
        0x4
        0x3038
    .end array-data
.end method

.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    iput-object p1, p0, Ll/᩷ۚ֫;->᩶:Landroid/os/Handler;

    const/4 p1, 0x1

    new-array p1, p1, [I

    .line 113
    iput-object p1, p0, Ll/᩷ۚ֫;->۬:[I

    return-void
.end method


# virtual methods
.method public final onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    .line 175
    iget-object p1, p0, Ll/᩷ۚ֫;->᩶:Landroid/os/Handler;

    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final run()V
    .locals 1

    .line 184
    iget-object v0, p0, Ll/᩷ۚ֫;->ۗ:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_0

    .line 186
    :try_start_0
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final ֫()Landroid/graphics/SurfaceTexture;
    .locals 1

    .line 168
    iget-object v0, p0, Ll/᩷ۚ֫;->ۗ:Landroid/graphics/SurfaceTexture;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 13

    const/4 v0, 0x0

    .line 200
    invoke-static {v0}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object v1

    const/4 v9, 0x1

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "eglGetDisplay failed"

    .line 201
    invoke-static {v3, v2}, Ll/ۘۚ֫;->֫(Ljava/lang/String;Z)V

    const/4 v10, 0x2

    new-array v2, v10, [I

    .line 205
    invoke-static {v1, v2, v0, v2, v9}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    move-result v2

    const-string v3, "eglInitialize failed"

    .line 206
    invoke-static {v3, v2}, Ll/ۘۚ֫;->֫(Ljava/lang/String;Z)V

    .line 122
    iput-object v1, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    new-array v11, v9, [Landroid/opengl/EGLConfig;

    new-array v12, v9, [I

    const/4 v6, 0x1

    const/4 v8, 0x0

    .line 214
    sget-object v2, Ll/᩷ۚ֫;->۫:[I

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v4, v11

    move-object v7, v12

    invoke-static/range {v1 .. v8}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 223
    aget v2, v12, v0

    if-lez v2, :cond_1

    aget-object v2, v11, v0

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 227
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aget v3, v12, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aget-object v4, v11, v0

    const/4 v5, 0x3

    new-array v6, v5, [Ljava/lang/Object;

    aput-object v1, v6, v0

    aput-object v3, v6, v9

    aput-object v4, v6, v10

    .line 225
    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1126
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s"

    invoke-static {v1, v3, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 223
    invoke-static {v1, v2}, Ll/ۘۚ֫;->֫(Ljava/lang/String;Z)V

    .line 229
    aget-object v1, v11, v0

    .line 124
    iget-object v2, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    const/4 v3, 0x4

    const/16 v4, 0x32c0

    const/4 v6, 0x5

    const/16 v7, 0x3038

    const/16 v8, 0x3098

    if-nez p1, :cond_2

    new-array v11, v5, [I

    aput v8, v11, v0

    aput v10, v11, v9

    aput v7, v11, v10

    goto :goto_2

    :cond_2
    new-array v11, v6, [I

    aput v8, v11, v0

    aput v10, v11, v9

    aput v4, v11, v10

    aput v9, v11, v5

    aput v7, v11, v3

    .line 247
    :goto_2
    sget-object v8, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 248
    invoke-static {v2, v1, v8, v11, v0}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    move-result-object v2

    if-eqz v2, :cond_3

    const/4 v8, 0x1

    goto :goto_3

    :cond_3
    const/4 v8, 0x0

    :goto_3
    const-string v11, "eglCreateContext failed"

    .line 250
    invoke-static {v11, v8}, Ll/ۘۚ֫;->֫(Ljava/lang/String;Z)V

    .line 124
    iput-object v2, p0, Ll/᩷ۚ֫;->᩸:Landroid/opengl/EGLContext;

    .line 125
    iget-object v8, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    if-ne p1, v9, :cond_4

    .line 259
    sget-object p1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    goto :goto_6

    :cond_4
    const/16 v11, 0x3056

    const/16 v12, 0x3057

    if-ne p1, v10, :cond_5

    const/4 p1, 0x7

    new-array p1, p1, [I

    aput v12, p1, v0

    aput v9, p1, v9

    aput v11, p1, v10

    aput v9, p1, v5

    aput v4, p1, v3

    aput v9, p1, v6

    const/4 v3, 0x6

    aput v7, p1, v3

    goto :goto_4

    :cond_5
    new-array p1, v6, [I

    aput v12, p1, v0

    aput v9, p1, v9

    aput v11, p1, v10

    aput v9, p1, v5

    aput v7, p1, v3

    .line 283
    :goto_4
    invoke-static {v8, v1, p1, v0}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    move-result-object p1

    if-eqz p1, :cond_6

    const/4 v1, 0x1

    goto :goto_5

    :cond_6
    const/4 v1, 0x0

    :goto_5
    const-string v3, "eglCreatePbufferSurface failed"

    .line 284
    invoke-static {v3, v1}, Ll/ۘۚ֫;->֫(Ljava/lang/String;Z)V

    .line 288
    :goto_6
    invoke-static {v8, p1, p1, v2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result v1

    const-string v2, "eglMakeCurrent failed"

    .line 289
    invoke-static {v2, v1}, Ll/ۘۚ֫;->֫(Ljava/lang/String;Z)V

    .line 125
    iput-object p1, p0, Ll/᩷ۚ֫;->ۙ:Landroid/opengl/EGLSurface;

    .line 294
    iget-object p1, p0, Ll/᩷ۚ֫;->۬:[I

    invoke-static {v9, p1, v0}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 295
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    .line 127
    new-instance v1, Landroid/graphics/SurfaceTexture;

    aget p1, p1, v0

    invoke-direct {v1, p1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object v1, p0, Ll/᩷ۚ֫;->ۗ:Landroid/graphics/SurfaceTexture;

    .line 128
    invoke-virtual {v1, p0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 5

    .line 134
    iget-object v0, p0, Ll/᩷ۚ֫;->᩶:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 136
    :try_start_0
    iget-object v1, p0, Ll/᩷ۚ֫;->ۗ:Landroid/graphics/SurfaceTexture;

    if-eqz v1, :cond_0

    .line 137
    invoke-virtual {v1}, Landroid/graphics/SurfaceTexture;->release()V

    .line 138
    iget-object v1, p0, Ll/᩷ۚ֫;->۬:[I

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v3, v1, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    :cond_0
    iget-object v1, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    if-eqz v1, :cond_1

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    invoke-virtual {v1, v2}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 142
    iget-object v1, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v1, v2, v2, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 145
    :cond_1
    iget-object v1, p0, Ll/᩷ۚ֫;->ۙ:Landroid/opengl/EGLSurface;

    if-eqz v1, :cond_2

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    invoke-virtual {v1, v2}, Landroid/opengl/EGLSurface;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 146
    iget-object v1, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Ll/᩷ۚ֫;->ۙ:Landroid/opengl/EGLSurface;

    invoke-static {v1, v2}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 148
    :cond_2
    iget-object v1, p0, Ll/᩷ۚ֫;->᩸:Landroid/opengl/EGLContext;

    if-eqz v1, :cond_3

    .line 149
    iget-object v2, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    invoke-static {v2, v1}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 151
    :cond_3
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 152
    iget-object v1, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    if-eqz v1, :cond_4

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    invoke-virtual {v1, v2}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 155
    iget-object v1, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    invoke-static {v1}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 157
    :cond_4
    iput-object v0, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    .line 158
    iput-object v0, p0, Ll/᩷ۚ֫;->᩸:Landroid/opengl/EGLContext;

    .line 159
    iput-object v0, p0, Ll/᩷ۚ֫;->ۙ:Landroid/opengl/EGLSurface;

    .line 160
    iput-object v0, p0, Ll/᩷ۚ֫;->ۗ:Landroid/graphics/SurfaceTexture;

    return-void

    :catchall_0
    move-exception v1

    .line 141
    iget-object v2, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    if-eqz v2, :cond_5

    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    invoke-virtual {v2, v3}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 142
    iget-object v2, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v2, v3, v3, v4}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 145
    :cond_5
    iget-object v2, p0, Ll/᩷ۚ֫;->ۙ:Landroid/opengl/EGLSurface;

    if-eqz v2, :cond_6

    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    invoke-virtual {v2, v3}, Landroid/opengl/EGLSurface;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 146
    iget-object v2, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    iget-object v3, p0, Ll/᩷ۚ֫;->ۙ:Landroid/opengl/EGLSurface;

    invoke-static {v2, v3}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 148
    :cond_6
    iget-object v2, p0, Ll/᩷ۚ֫;->᩸:Landroid/opengl/EGLContext;

    if-eqz v2, :cond_7

    .line 149
    iget-object v3, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    invoke-static {v3, v2}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 151
    :cond_7
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 152
    iget-object v2, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    if-eqz v2, :cond_8

    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    invoke-virtual {v2, v3}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 155
    iget-object v2, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    invoke-static {v2}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 157
    :cond_8
    iput-object v0, p0, Ll/᩷ۚ֫;->᩹:Landroid/opengl/EGLDisplay;

    .line 158
    iput-object v0, p0, Ll/᩷ۚ֫;->᩸:Landroid/opengl/EGLContext;

    .line 159
    iput-object v0, p0, Ll/᩷ۚ֫;->ۙ:Landroid/opengl/EGLSurface;

    .line 160
    iput-object v0, p0, Ll/᩷ۚ֫;->ۗ:Landroid/graphics/SurfaceTexture;

    .line 161
    throw v1
.end method
