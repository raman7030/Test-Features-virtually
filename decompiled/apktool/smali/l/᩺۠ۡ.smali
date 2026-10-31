.class public final Ll/᩺۠ۡ;
.super Ljava/lang/Thread;
.source "G6WH"


# instance fields
.field public ֫֫:Z

.field public volatile ۗ:Z

.field public ۙ:Z

.field public ۛ:Z

.field public final ۟:Z

.field public ۤ:Z

.field public ۧ֫:I

.field public final ۨ:[F

.field public final ۫:Ll/᩸۠ۡ;

.field public ۬:I

.field public final ܰ:I

.field public ᩶:F

.field public final ᩸:Landroid/content/res/AssetManager;

.field public ᩹:Z

.field public final ᩺:Landroid/graphics/SurfaceTexture;


# direct methods
.method public constructor <init>(Landroid/content/res/AssetManager;Landroid/graphics/SurfaceTexture;IIFIZLl/᩸۠ۡ;)V
    .locals 2

    const-string v0, "MT-Logo3D"

    .line 34
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x10

    new-array v0, v0, [F

    .line 28
    iput-object v0, p0, Ll/᩺۠ۡ;->ۨ:[F

    const/4 v1, 0x1

    .line 29
    iput-boolean v1, p0, Ll/᩺۠ۡ;->ۤ:Z

    iput-boolean v1, p0, Ll/᩺۠ۡ;->֫֫:Z

    .line 35
    iput-object p1, p0, Ll/᩺۠ۡ;->᩸:Landroid/content/res/AssetManager;

    .line 36
    iput-object p2, p0, Ll/᩺۠ۡ;->᩺:Landroid/graphics/SurfaceTexture;

    .line 37
    iput p3, p0, Ll/᩺۠ۡ;->ۧ֫:I

    .line 38
    iput p4, p0, Ll/᩺۠ۡ;->۬:I

    .line 39
    iput p5, p0, Ll/᩺۠ۡ;->᩶:F

    .line 40
    iput p6, p0, Ll/᩺۠ۡ;->ܰ:I

    .line 41
    iput-boolean p7, p0, Ll/᩺۠ۡ;->۟:Z

    .line 42
    iput-object p8, p0, Ll/᩺۠ۡ;->۫:Ll/᩸۠ۡ;

    const/4 p1, 0x0

    .line 43
    invoke-static {v0, p1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Z)V
    .locals 2

    if-eqz p1, :cond_0

    return-void

    .line 178
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Logo EGL "

    const-string v1, " failed: "

    .line 0
    invoke-static {v0, p0, v1}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 178
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final run()V
    .locals 20

    move-object/from16 v1, p0

    .line 85
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 86
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 87
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    const/4 v0, 0x1

    const/4 v5, 0x0

    .line 90
    :try_start_0
    invoke-static {v5}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object v2

    const/4 v14, 0x2

    new-array v6, v14, [I

    .line 92
    invoke-static {v2, v6, v5, v6, v0}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    move-result v6

    const-string v7, "initialize"

    invoke-static {v7, v6}, Ll/᩺۠ۡ;->֫(Ljava/lang/String;Z)V

    const/16 v6, 0xf

    new-array v7, v6, [I

    .line 93
    fill-array-data v7, :array_0

    new-array v15, v0, [Landroid/opengl/EGLConfig;

    new-array v0, v0, [I

    const/4 v11, 0x1

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v6, v2

    move-object v9, v15

    move-object v12, v0

    .line 98
    invoke-static/range {v6 .. v13}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    move-result v6

    if-eqz v6, :cond_0

    aget v0, v0, v5

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v6, "choose config"

    invoke-static {v6, v0}, Ll/᩺۠ۡ;->֫(Ljava/lang/String;Z)V

    .line 99
    aget-object v0, v15, v5

    sget-object v6, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    const/16 v7, 0x3098

    const/16 v8, 0x3038

    filled-new-array {v7, v14, v8}, [I

    move-result-object v7

    invoke-static {v2, v0, v6, v7, v5}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    move-result-object v3

    .line 101
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    if-eq v3, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const-string v6, "create context"

    invoke-static {v6, v0}, Ll/᩺۠ۡ;->֫(Ljava/lang/String;Z)V

    .line 102
    new-instance v0, Ll/ܰ۠ۡ;

    invoke-direct {v0}, Ll/ܰ۠ۡ;-><init>()V

    new-array v6, v14, [I

    const/16 v7, 0x10

    new-array v8, v7, [F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_2
    move-object/from16 v16, p0

    .line 110
    :try_start_1
    monitor-enter v16
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 111
    :goto_3
    :try_start_2
    iget-boolean v13, v1, Ll/᩺۠ۡ;->᩹:Z

    if-nez v13, :cond_3

    iget-boolean v14, v1, Ll/᩺۠ۡ;->֫֫:Z

    if-eqz v14, :cond_2

    iget-boolean v14, v1, Ll/᩺۠ۡ;->ۤ:Z

    if-eqz v14, :cond_2

    iget v14, v1, Ll/᩺۠ۡ;->ۧ֫:I

    if-lez v14, :cond_2

    iget v14, v1, Ll/᩺۠ۡ;->۬:I

    if-gtz v14, :cond_3

    :cond_2
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->wait()V

    goto :goto_3

    :cond_3
    const/16 v14, 0x3038

    if-eqz v13, :cond_4

    .line 112
    monitor-exit v16

    goto/16 :goto_6

    .line 113
    :cond_4
    iget v13, v1, Ll/᩺۠ۡ;->ۧ֫:I

    .line 114
    iget v5, v1, Ll/᩺۠ۡ;->۬:I

    .line 115
    iget v7, v1, Ll/᩺۠ۡ;->᩶:F

    move/from16 v18, v7

    .line 116
    iget-object v7, v1, Ll/᩺۠ۡ;->ۨ:[F

    move-object/from16 v17, v0

    move-object/from16 v19, v6

    const/16 v0, 0x10

    const/4 v6, 0x0

    invoke-static {v7, v6, v8, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 117
    iput-boolean v6, v1, Ll/᩺۠ۡ;->ۤ:Z

    .line 118
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 119
    :try_start_3
    sget-object v6, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    if-eq v4, v6, :cond_5

    if-ne v9, v13, :cond_5

    if-eq v10, v5, :cond_8

    :cond_5
    if-eq v4, v6, :cond_6

    .line 121
    sget-object v7, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v2, v6, v6, v7}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 122
    invoke-static {v2, v4}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 123
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 124
    invoke-virtual {v11}, Landroid/view/Surface;->release()V

    const/4 v11, 0x0

    .line 128
    :cond_6
    new-instance v6, Landroid/view/Surface;

    iget-object v7, v1, Ll/᩺۠ۡ;->᩺:Landroid/graphics/SurfaceTexture;

    invoke-direct {v6, v7}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    const/4 v7, 0x0

    .line 129
    :try_start_4
    aget-object v9, v15, v7

    filled-new-array {v14}, [I

    move-result-object v10

    invoke-static {v2, v9, v6, v10, v7}, Landroid/opengl/EGL14;->eglCreateWindowSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Ljava/lang/Object;[II)Landroid/opengl/EGLSurface;

    move-result-object v4

    .line 130
    sget-object v7, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    if-eq v4, v7, :cond_7

    const/4 v7, 0x1

    goto :goto_4

    :cond_7
    const/4 v7, 0x0

    :goto_4
    const-string v9, "create surface"

    invoke-static {v9, v7}, Ll/᩺۠ۡ;->֫(Ljava/lang/String;Z)V

    .line 131
    invoke-static {v2, v4, v4, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result v7

    const-string v9, "make current"

    invoke-static {v9, v7}, Ll/᩺۠ۡ;->֫(Ljava/lang/String;Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/LinkageError; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move v10, v5

    move-object v11, v6

    move v9, v13

    :cond_8
    if-nez v12, :cond_9

    .line 136
    :try_start_5
    iget-object v5, v1, Ll/᩺۠ۡ;->᩸:Landroid/content/res/AssetManager;

    iget v6, v1, Ll/᩺۠ۡ;->ܰ:I

    iget-boolean v7, v1, Ll/᩺۠ۡ;->۟:Z

    move-object/from16 v13, v17

    invoke-virtual {v13, v5, v6, v7}, Ll/ܰ۠ۡ;->֫(Landroid/content/res/AssetManager;IZ)V

    const/4 v5, 0x1

    const/4 v12, 0x1

    goto :goto_5

    :cond_9
    move-object/from16 v13, v17

    :goto_5
    move-object/from16 v16, p0

    .line 140
    monitor-enter v16
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 141
    :try_start_6
    iget-boolean v5, v1, Ll/᩺۠ۡ;->᩹:Z

    if-eqz v5, :cond_f

    monitor-exit v16
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 162
    :goto_6
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    if-eq v2, v0, :cond_c

    .line 163
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v2, v0, v0, v5}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 164
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    if-eq v4, v0, :cond_a

    invoke-static {v2, v4}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 165
    :cond_a
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    if-eq v3, v0, :cond_b

    invoke-static {v2, v3}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 166
    :cond_b
    invoke-static {v2}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    :cond_c
    if-eqz v11, :cond_d

    .line 168
    invoke-virtual {v11}, Landroid/view/Surface;->release()V

    .line 169
    :cond_d
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    move-object/from16 v16, p0

    .line 170
    monitor-enter v16

    const/4 v0, 0x1

    .line 171
    :try_start_7
    iput-boolean v0, v1, Ll/᩺۠ۡ;->ۙ:Z

    .line 172
    iget-boolean v0, v1, Ll/᩺۠ۡ;->ۛ:Z

    if-eqz v0, :cond_e

    iget-object v0, v1, Ll/᩺۠ۡ;->᩺:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 173
    :cond_e
    monitor-exit v16

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v16
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw v0

    .line 142
    :cond_f
    :try_start_8
    iget-boolean v5, v1, Ll/᩺۠ۡ;->֫֫:Z

    if-nez v5, :cond_10

    const/4 v5, 0x1

    .line 143
    iput-boolean v5, v1, Ll/᩺۠ۡ;->ۤ:Z

    .line 144
    monitor-exit v16

    move-object/from16 v7, v19

    const/4 v5, 0x0

    goto :goto_7

    .line 146
    :cond_10
    monitor-exit v16
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    const/16 v5, 0x3057

    move-object/from16 v7, v19

    const/4 v6, 0x0

    .line 148
    :try_start_9
    invoke-static {v2, v4, v5, v7, v6}, Landroid/opengl/EGL14;->eglQuerySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;I[II)Z

    move-result v5

    const-string v6, "query width"

    invoke-static {v6, v5}, Ll/᩺۠ۡ;->֫(Ljava/lang/String;Z)V

    const/16 v5, 0x3056

    const/4 v6, 0x1

    .line 149
    invoke-static {v2, v4, v5, v7, v6}, Landroid/opengl/EGL14;->eglQuerySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;I[II)Z

    move-result v5

    const-string v14, "query height"

    invoke-static {v14, v5}, Ll/᩺۠ۡ;->֫(Ljava/lang/String;Z)V

    const/4 v5, 0x0

    .line 150
    aget v14, v7, v5

    aget v6, v7, v6

    move/from16 v0, v18

    invoke-virtual {v13, v14, v6, v0, v8}, Ll/ܰ۠ۡ;->֫(IIF[F)V

    .line 151
    invoke-static {v2, v4}, Landroid/opengl/EGL14;->eglSwapBuffers(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    move-result v0

    const-string v6, "swap buffers"

    invoke-static {v6, v0}, Ll/᩺۠ۡ;->֫(Ljava/lang/String;Z)V

    .line 152
    iget-boolean v0, v1, Ll/᩺۠ۡ;->ۗ:Z

    if-nez v0, :cond_11

    const/4 v0, 0x1

    .line 153
    iput-boolean v0, v1, Ll/᩺۠ۡ;->ۗ:Z

    .line 154
    iget-object v0, v1, Ll/᩺۠ۡ;->۫:Ll/᩸۠ۡ;

    invoke-virtual {v0, v1}, Ll/᩸۠ۡ;->֫(Ll/᩺۠ۡ;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_9 .. :try_end_9} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :cond_11
    :goto_7
    move-object v6, v7

    move-object v0, v13

    const/16 v7, 0x10

    goto/16 :goto_2

    :catchall_1
    move-exception v0

    .line 146
    :try_start_a
    monitor-exit v16
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :try_start_b
    throw v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_b .. :try_end_b} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :catchall_2
    move-exception v0

    goto :goto_9

    :catchall_3
    move-exception v0

    .line 118
    :try_start_c
    monitor-exit v16
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :try_start_d
    throw v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_d .. :try_end_d} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :catchall_4
    move-exception v0

    move-object v6, v11

    goto :goto_9

    :catch_0
    move-object v6, v11

    goto :goto_8

    :catchall_5
    move-exception v0

    const/4 v6, 0x0

    goto :goto_9

    :catch_1
    const/4 v6, 0x0

    .line 159
    :catch_2
    :goto_8
    :try_start_e
    iget-object v0, v1, Ll/᩺۠ۡ;->۫:Ll/᩸۠ۡ;

    .line 132
    iget-object v5, v0, Ll/᩸۠ۡ;->֫:Ll/᩹۠ۡ;

    new-instance v7, Ll/۠۠ۡ;

    invoke-direct {v7, v0, v1}, Ll/۠۠ۡ;-><init>(Ll/᩸۠ۡ;Ll/᩺۠ۡ;)V

    invoke-virtual {v5, v7}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 162
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    if-eq v2, v0, :cond_14

    .line 163
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v2, v0, v0, v5}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 164
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    if-eq v4, v0, :cond_12

    invoke-static {v2, v4}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 165
    :cond_12
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    if-eq v3, v0, :cond_13

    invoke-static {v2, v3}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 166
    :cond_13
    invoke-static {v2}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    :cond_14
    if-eqz v6, :cond_15

    .line 168
    invoke-virtual {v6}, Landroid/view/Surface;->release()V

    .line 169
    :cond_15
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    move-object/from16 v16, p0

    .line 170
    monitor-enter v16

    const/4 v0, 0x1

    .line 171
    :try_start_f
    iput-boolean v0, v1, Ll/᩺۠ۡ;->ۙ:Z

    .line 172
    iget-boolean v0, v1, Ll/᩺۠ۡ;->ۛ:Z

    if-eqz v0, :cond_16

    iget-object v0, v1, Ll/᩺۠ۡ;->᩺:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 173
    :cond_16
    monitor-exit v16

    return-void

    :catchall_6
    move-exception v0

    monitor-exit v16
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    throw v0

    .line 162
    :goto_9
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    if-eq v2, v5, :cond_19

    .line 163
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    sget-object v7, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v2, v5, v5, v7}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 164
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    if-eq v4, v5, :cond_17

    invoke-static {v2, v4}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 165
    :cond_17
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    if-eq v3, v4, :cond_18

    invoke-static {v2, v3}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 166
    :cond_18
    invoke-static {v2}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    :cond_19
    if-eqz v6, :cond_1a

    .line 168
    invoke-virtual {v6}, Landroid/view/Surface;->release()V

    .line 169
    :cond_1a
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    move-object/from16 v16, p0

    .line 170
    monitor-enter v16

    const/4 v2, 0x1

    .line 171
    :try_start_10
    iput-boolean v2, v1, Ll/᩺۠ۡ;->ۙ:Z

    .line 172
    iget-boolean v2, v1, Ll/᩺۠ۡ;->ۛ:Z

    if-eqz v2, :cond_1b

    iget-object v2, v1, Ll/᩺۠ۡ;->᩺:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->release()V

    .line 173
    :cond_1b
    monitor-exit v16
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 174
    throw v0

    :catchall_7
    move-exception v0

    .line 173
    :try_start_11
    monitor-exit v16
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    throw v0

    nop

    :array_0
    .array-data 4
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x8
        0x3025
        0x10
        0x3033
        0x4
        0x3040
        0x4
        0x3038
    .end array-data
.end method

.method public final declared-synchronized ֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 77
    :try_start_0
    iget-boolean v1, p0, Ll/᩺۠ۡ;->ۛ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 78
    :try_start_1
    iput-boolean v1, p0, Ll/᩺۠ۡ;->ۛ:Z

    .line 79
    invoke-virtual {p0}, Ll/᩺۠ۡ;->ۧ()V

    .line 80
    iget-boolean v1, p0, Ll/᩺۠ۡ;->ۙ:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/᩺۠ۡ;->᩺:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v1}, Landroid/graphics/SurfaceTexture;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(IFI)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 55
    :try_start_0
    iput p1, p0, Ll/᩺۠ۡ;->ۧ֫:I

    .line 56
    iput p3, p0, Ll/᩺۠ۡ;->۬:I

    .line 57
    iput p2, p0, Ll/᩺۠ۡ;->᩶:F

    const/4 p1, 0x1

    .line 58
    iput-boolean p1, p0, Ll/᩺۠ۡ;->ۤ:Z

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Z)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 63
    :try_start_0
    iget-boolean v1, p0, Ll/᩺۠ۡ;->֫֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, p1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    .line 64
    :try_start_1
    iput-boolean v1, p0, Ll/᩺۠ۡ;->ۤ:Z

    .line 65
    :cond_1
    iput-boolean p1, p0, Ll/᩺۠ۡ;->֫֫:Z

    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫([F)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 48
    :try_start_0
    iget-boolean v1, p0, Ll/᩺۠ۡ;->᩹:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 49
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/᩺۠ۡ;->ۨ:[F

    const/16 v2, 0x10

    const/4 v3, 0x0

    invoke-static {p1, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, Ll/᩺۠ۡ;->ۤ:Z

    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x1

    .line 71
    :try_start_0
    iput-boolean v1, p0, Ll/᩺۠ۡ;->᩹:Z

    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
