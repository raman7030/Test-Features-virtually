.class public final Ll/ۘۚ֫;
.super Ljava/lang/Object;
.source "78NV"


# direct methods
.method public static ֫([F)Ljava/nio/FloatBuffer;
    .locals 2

    .line 643
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x4

    .line 652
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 653
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    .line 643
    invoke-virtual {v0, p0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/FloatBuffer;->flip()Ljava/nio/Buffer;

    move-result-object p0

    check-cast p0, Ljava/nio/FloatBuffer;

    return-object p0
.end method

.method public static ֫()V
    .locals 4

    .line 527
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 530
    :goto_0
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v1, :cond_0

    const/16 v1, 0xa

    .line 532
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 534
    :cond_0
    invoke-static {v2}, Landroid/opengl/GLU;->gluErrorString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    .line 536
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "error code: 0x"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v1, v2}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v1

    :cond_1
    const-string v2, "glError: "

    .line 538
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    return-void

    .line 542
    :cond_3
    new-instance v1, Ll/ۖۚ֫;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 61
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 542
    throw v1
.end method

.method public static ֫(II)V
    .locals 1

    .line 789
    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 790
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    const/16 p1, 0x2800

    const/16 v0, 0x2601

    .line 791
    invoke-static {p0, p1, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 792
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    const/16 p1, 0x2801

    .line 793
    invoke-static {p0, p1, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 794
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    const/16 p1, 0x2802

    const v0, 0x812f

    .line 795
    invoke-static {p0, p1, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 796
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    const/16 p1, 0x2803

    .line 797
    invoke-static {p0, p1, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 798
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Z)V
    .locals 0

    if-eqz p1, :cond_0

    return-void

    .line 1064
    :cond_0
    new-instance p1, Ll/ۖۚ֫;

    .line 61
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1064
    throw p1
.end method

.method public static ֫(I)Z
    .locals 1

    const/4 v0, 0x6

    if-ne p0, v0, :cond_0

    .line 248
    invoke-static {}, Ll/ۘۚ֫;->ۧ()Z

    move-result p0

    return p0

    :cond_0
    const/4 v0, 0x7

    if-ne p0, v0, :cond_1

    const-string p0, "EGL_EXT_gl_colorspace_bt2020_hlg"

    .line 264
    invoke-static {p0}, Ll/ۘۚ֫;->֫(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Landroid/content/Context;)Z
    .locals 5

    .line 186
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    const/16 v1, 0x1a

    if-ge v0, v1, :cond_2

    const-string v3, "samsung"

    .line 189
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "XT1650"

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    return v2

    :cond_2
    if-ge v0, v1, :cond_3

    .line 198
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v0, "android.hardware.vr.high_performance"

    .line 199
    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_3

    return v2

    :cond_3
    const-string p0, "EGL_EXT_protected_content"

    .line 204
    invoke-static {p0}, Ll/ۘۚ֫;->֫(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

    .line 269
    invoke-static {v0}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object v1

    .line 270
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    invoke-virtual {v1, v2}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    const-string v4, "No EGL display."

    invoke-static {v4, v2}, Ll/ۘۚ֫;->֫(Ljava/lang/String;Z)V

    new-array v2, v3, [I

    new-array v4, v3, [I

    .line 272
    invoke-static {v1, v2, v0, v4, v0}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    move-result v2

    const-string v4, "Error in eglInitialize."

    .line 271
    invoke-static {v4, v2}, Ll/ۘۚ֫;->֫(Ljava/lang/String;Z)V

    .line 279
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    const/16 v2, 0x3055

    .line 1087
    invoke-static {v1, v2}, Landroid/opengl/EGL14;->eglQueryString(Landroid/opengl/EGLDisplay;I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1088
    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    return v3

    :cond_0
    return v0
.end method

.method public static ۧ()Z
    .locals 2

    .line 259
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    const-string v0, "EGL_EXT_gl_colorspace_bt2020_pq"

    invoke-static {v0}, Ll/ۘۚ֫;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ܽ()Z
    .locals 1

    const-string v0, "EGL_KHR_surfaceless_context"

    .line 215
    invoke-static {v0}, Ll/ۘۚ֫;->֫(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
