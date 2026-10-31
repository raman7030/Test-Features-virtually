.class public final Ll/֨ۜۧ;
.super Ljava/lang/Object;
.source "J8I9"


# static fields
.field public static final ۡ:[F

.field public static final ۢ:[F

.field public static final ᩷:[F


# instance fields
.field public ֫:Ll/ۚۜۧ;

.field public ۜ:I

.field public ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:Ll/ܺۚ֫;

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x9

    new-array v1, v0, [F

    .line 75
    fill-array-data v1, :array_0

    sput-object v1, Ll/֨ۜۧ;->ۡ:[F

    new-array v1, v0, [F

    .line 78
    fill-array-data v1, :array_1

    sput-object v1, Ll/֨ۜۧ;->ۢ:[F

    new-array v0, v0, [F

    .line 84
    fill-array-data v0, :array_2

    sput-object v0, Ll/֨ۜۧ;->᩷:[F

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x41000000    # -0.5f
        0x0
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f000000    # 0.5f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static ۧ(Ll/᩵ۜۧ;)Z
    .locals 3

    .line 41
    iget-object v0, p0, Ll/᩵ۜۧ;->֫:Ll/ۘۜۧ;

    .line 42
    iget-object p0, p0, Ll/᩵ۜۧ;->ۧ:Ll/ۘۜۧ;

    .line 43
    invoke-virtual {v0}, Ll/ۘۜۧ;->ۧ()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 44
    invoke-virtual {v0}, Ll/ۘۜۧ;->֫()Ll/ᩴۜۧ;

    move-result-object v0

    iget v0, v0, Ll/ᩴۜۧ;->ܽ:I

    if-nez v0, :cond_0

    .line 45
    invoke-virtual {p0}, Ll/ۘۜۧ;->ۧ()I

    move-result v0

    if-ne v0, v2, :cond_0

    .line 46
    invoke-virtual {p0}, Ll/ۘۜۧ;->֫()Ll/ᩴۜۧ;

    move-result-object p0

    iget p0, p0, Ll/ᩴۜۧ;->ܽ:I

    if-nez p0, :cond_0

    return v2

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 122
    :try_start_0
    new-instance v0, Ll/ܺۚ֫;

    const-string v1, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n"

    const-string v2, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n"

    invoke-direct {v0, v1, v2}, Ll/ܺۚ֫;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Ll/֨ۜۧ;->ᩳ:Ll/ܺۚ֫;

    const-string v1, "uMvpMatrix"

    .line 123
    invoke-virtual {v0, v1}, Ll/ܺۚ֫;->ۧ(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/֨ۜۧ;->ۧ:I

    .line 124
    iget-object v0, p0, Ll/֨ۜۧ;->ᩳ:Ll/ܺۚ֫;

    const-string v1, "uTexMatrix"

    invoke-virtual {v0, v1}, Ll/ܺۚ֫;->ۧ(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/֨ۜۧ;->ۜ:I

    .line 125
    iget-object v0, p0, Ll/֨ۜۧ;->ᩳ:Ll/ܺۚ֫;

    const-string v1, "aPosition"

    invoke-virtual {v0, v1}, Ll/ܺۚ֫;->֫(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/֨ۜۧ;->ܽ:I

    .line 126
    iget-object v0, p0, Ll/֨ۜۧ;->ᩳ:Ll/ܺۚ֫;

    const-string v1, "aTexCoords"

    invoke-virtual {v0, v1}, Ll/ܺۚ֫;->֫(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/֨ۜۧ;->ܳ:I

    .line 127
    iget-object v0, p0, Ll/֨ۜۧ;->ᩳ:Ll/ܺۚ֫;

    const-string v1, "uTexture"

    invoke-virtual {v0, v1}, Ll/ܺۚ֫;->ۧ(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/֨ۜۧ;->᩻:I
    :try_end_0
    .catch Ll/ۖۚ֫; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final ֫(I[F)V
    .locals 18

    move-object/from16 v0, p0

    .line 143
    iget-object v1, v0, Ll/֨ۜۧ;->֫:Ll/ۚۜۧ;

    if-nez v1, :cond_0

    goto :goto_1

    .line 150
    :cond_0
    iget v2, v0, Ll/֨ۜۧ;->ܿ:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 151
    sget-object v2, Ll/֨ۜۧ;->ۢ:[F

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    if-ne v2, v4, :cond_2

    .line 153
    sget-object v2, Ll/֨ۜۧ;->᩷:[F

    goto :goto_0

    .line 155
    :cond_2
    sget-object v2, Ll/֨ۜۧ;->ۡ:[F

    .line 157
    :goto_0
    iget v4, v0, Ll/֨ۜۧ;->ۜ:I

    const/4 v5, 0x0

    invoke-static {v4, v3, v5, v2, v5}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    .line 160
    iget v2, v0, Ll/֨ۜۧ;->ۧ:I

    move-object/from16 v4, p2

    invoke-static {v2, v3, v5, v4, v5}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    const v2, 0x84c0

    .line 161
    invoke-static {v2}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    const v2, 0x8d65

    move/from16 v3, p1

    .line 162
    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 163
    iget v2, v0, Ll/֨ۜۧ;->᩻:I

    invoke-static {v2, v5}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 165
    :try_start_0
    invoke-static {}, Ll/ۘۚ֫;->֫()V
    :try_end_0
    .catch Ll/ۖۚ֫; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    :catch_0
    iget v6, v0, Ll/֨ۜۧ;->ܽ:I

    const/16 v10, 0xc

    invoke-static {v1}, Ll/ۚۜۧ;->ܽ(Ll/ۚۜۧ;)Ljava/nio/FloatBuffer;

    move-result-object v11

    const/4 v7, 0x3

    const/16 v8, 0x1406

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 179
    :try_start_1
    invoke-static {}, Ll/ۘۚ֫;->֫()V
    :try_end_1
    .catch Ll/ۖۚ֫; {:try_start_1 .. :try_end_1} :catch_1

    .line 185
    :catch_1
    iget v12, v0, Ll/֨ۜۧ;->ܳ:I

    const/16 v16, 0x8

    invoke-static {v1}, Ll/ۚۜۧ;->ۧ(Ll/ۚۜۧ;)Ljava/nio/FloatBuffer;

    move-result-object v17

    const/4 v13, 0x2

    const/16 v14, 0x1406

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 193
    :try_start_2
    invoke-static {}, Ll/ۘۚ֫;->֫()V
    :try_end_2
    .catch Ll/ۖۚ֫; {:try_start_2 .. :try_end_2} :catch_2

    .line 199
    :catch_2
    invoke-static {v1}, Ll/ۚۜۧ;->֫(Ll/ۚۜۧ;)I

    move-result v2

    invoke-static {v1}, Ll/ۚۜۧ;->ᩳ(Ll/ۚۜۧ;)I

    move-result v1

    invoke-static {v2, v5, v1}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 201
    :try_start_3
    invoke-static {}, Ll/ۘۚ֫;->֫()V
    :try_end_3
    .catch Ll/ۖۚ֫; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :goto_1
    return-void
.end method

.method public final ֫(Ll/᩵ۜۧ;)V
    .locals 2

    .line 110
    invoke-static {p1}, Ll/֨ۜۧ;->ۧ(Ll/᩵ۜۧ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 113
    :cond_0
    iget v0, p1, Ll/᩵ۜۧ;->ᩳ:I

    iput v0, p0, Ll/֨ۜۧ;->ܿ:I

    .line 114
    new-instance v0, Ll/ۚۜۧ;

    iget-object v1, p1, Ll/᩵ۜۧ;->֫:Ll/ۘۜۧ;

    invoke-virtual {v1}, Ll/ۘۜۧ;->֫()Ll/ᩴۜۧ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۚۜۧ;-><init>(Ll/ᩴۜۧ;)V

    iput-object v0, p0, Ll/֨ۜۧ;->֫:Ll/ۚۜۧ;

    .line 116
    iget-boolean v0, p1, Ll/᩵ۜۧ;->ܽ:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ll/ۚۜۧ;

    iget-object p1, p1, Ll/᩵ۜۧ;->ۧ:Ll/ۘۜۧ;

    invoke-virtual {p1}, Ll/ۘۜۧ;->֫()Ll/ᩴۜۧ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۚۜۧ;-><init>(Ll/ᩴۜۧ;)V

    :goto_0
    return-void
.end method
