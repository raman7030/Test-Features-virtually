.class public final Ll/ۡۚ֫;
.super Ljava/lang/Object;
.source "B8O3"


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 388
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 389
    iput-object p1, p0, Ll/ۡۚ֫;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(II)Ll/ۡۚ֫;
    .locals 15

    move v11, p0

    const/4 v0, 0x1

    new-array v1, v0, [I

    const v2, 0x8b87

    const/4 v12, 0x0

    .line 352
    invoke-static {p0, v2, v1, v12}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    new-array v7, v0, [I

    .line 356
    aget v13, v1, v12

    new-array v14, v13, [B

    new-array v3, v0, [I

    new-array v5, v0, [I

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move v0, p0

    move/from16 v1, p1

    move v2, v13

    move-object v9, v14

    .line 358
    invoke-static/range {v0 .. v10}, Landroid/opengl/GLES20;->glGetActiveUniform(III[II[II[II[BI)V

    .line 370
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v13, :cond_1

    .line 259
    aget-byte v2, v14, v1

    if-nez v2, :cond_0

    move v13, v1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 370
    :cond_1
    :goto_1
    invoke-direct {v0, v14, v12, v13}, Ljava/lang/String;-><init>([BII)V

    .line 139
    invoke-static {p0, v0}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 373
    new-instance v1, Ll/ۡۚ֫;

    invoke-direct {v1, v0}, Ll/ۡۚ֫;-><init>(Ljava/lang/String;)V

    return-object v1
.end method
