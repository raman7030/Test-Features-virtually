.class public final Ll/ᩳ᩶֫;
.super Ll/ܺ᩵֫;
.source "78M9"


# instance fields
.field public final ۗ:Ll/۠ᩴ֫;

.field public final ۙ:Ll/ܺۧۧ;

.field public final ۛ:I

.field public final ۤ:Ljava/lang/String;

.field public final ۫:I

.field public final ۬:I

.field public final ᩶:Z


# direct methods
.method public constructor <init>(ILjava/lang/Exception;I)V
    .locals 10

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v3, p3

    .line 245
    invoke-direct/range {v0 .. v9}, Ll/ᩳ᩶֫;-><init>(ILjava/lang/Throwable;ILjava/lang/String;ILl/۠ᩴ֫;ILl/ܺۧۧ;Z)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/Throwable;ILjava/lang/String;ILl/۠ᩴ֫;ILl/ܺۧۧ;Z)V
    .locals 13

    move v4, p1

    move/from16 v8, p7

    if-eqz v4, :cond_7

    const/4 v0, 0x3

    const/4 v1, 0x1

    if-eq v4, v1, :cond_1

    if-eq v4, v0, :cond_0

    const-string v0, "Unexpected runtime error"

    goto :goto_0

    :cond_0
    const-string v0, "Remote error"

    :goto_0
    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    goto :goto_2

    .line 398
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v5, p4

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " error, index="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v6, p5

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", format="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v7, p6

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", format_supported="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    if-eqz v8, :cond_6

    if-eq v8, v1, :cond_5

    const/4 v1, 0x2

    if-eq v8, v1, :cond_4

    if-eq v8, v0, :cond_3

    const/4 v0, 0x4

    if-ne v8, v0, :cond_2

    const-string v0, "YES"

    goto :goto_1

    .line 3662
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_3
    const-string v0, "NO_EXCEEDS_CAPABILITIES"

    goto :goto_1

    :cond_4
    const-string v0, "NO_UNSUPPORTED_DRM"

    goto :goto_1

    :cond_5
    const-string v0, "NO_UNSUPPORTED_TYPE"

    goto :goto_1

    :cond_6
    const-string v0, "NO"

    .line 406
    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_7
    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    const-string v0, "Source error"

    :goto_2
    const/4 v1, 0x0

    .line 416
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    const-string v1, ": null"

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_8
    move-object v1, v0

    .line 285
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    move-object v0, p0

    move-object v2, p2

    move/from16 v3, p3

    move v4, p1

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v12, p9

    .line 269
    invoke-direct/range {v0 .. v12}, Ll/ᩳ᩶֫;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILl/۠ᩴ֫;ILl/ܺۧۧ;JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILl/۠ᩴ֫;ILl/ܺۧۧ;JZ)V
    .locals 9

    move-object v6, p0

    move v7, p4

    move/from16 v8, p12

    .line 301
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide/from16 v4, p10

    invoke-direct/range {v0 .. v5}, Ll/ܺ᩵֫;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IJ)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz v8, :cond_1

    if-ne v7, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 302
    :goto_1
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    if-nez p2, :cond_2

    const/4 v1, 0x3

    if-ne v7, v1, :cond_3

    :cond_2
    const/4 v0, 0x1

    .line 303
    :cond_3
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 304
    iput v7, v6, Ll/ᩳ᩶֫;->ۛ:I

    move-object v0, p5

    .line 305
    iput-object v0, v6, Ll/ᩳ᩶֫;->ۤ:Ljava/lang/String;

    move v0, p6

    .line 306
    iput v0, v6, Ll/ᩳ᩶֫;->۫:I

    move-object/from16 v0, p7

    .line 307
    iput-object v0, v6, Ll/ᩳ᩶֫;->ۗ:Ll/۠ᩴ֫;

    move/from16 v0, p8

    .line 308
    iput v0, v6, Ll/ᩳ᩶֫;->۬:I

    move-object/from16 v0, p9

    .line 309
    iput-object v0, v6, Ll/ᩳ᩶֫;->ۙ:Ll/ܺۧۧ;

    .line 310
    iput-boolean v8, v6, Ll/ᩳ᩶֫;->᩶:Z

    return-void
.end method

.method public static ֫(Ljava/io/IOException;I)Ll/ᩳ᩶֫;
    .locals 2

    .line 132
    new-instance v0, Ll/ᩳ᩶֫;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Ll/ᩳ᩶֫;-><init>(ILjava/lang/Exception;I)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/RuntimeException;I)Ll/ᩳ᩶֫;
    .locals 2

    .line 220
    new-instance v0, Ll/ᩳ᩶֫;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Ll/ᩳ᩶֫;-><init>(ILjava/lang/Exception;I)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/Throwable;Ljava/lang/String;ILl/۠ᩴ֫;ILl/ܺۧۧ;ZI)Ll/ᩳ᩶֫;
    .locals 11

    .line 187
    new-instance v10, Ll/ᩳ᩶֫;

    if-nez p3, :cond_0

    const/4 v0, 0x4

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    move v7, p4

    :goto_0
    const/4 v1, 0x1

    move-object v0, v10

    move-object v2, p0

    move/from16 v3, p7

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    move-object/from16 v8, p5

    move/from16 v9, p6

    .line 195
    invoke-direct/range {v0 .. v9}, Ll/ᩳ᩶֫;-><init>(ILjava/lang/Throwable;ILjava/lang/String;ILl/۠ᩴ֫;ILl/ܺۧۧ;Z)V

    return-object v10
.end method


# virtual methods
.method public final ֫(Ll/ܺۧۧ;)Ll/ᩳ᩶֫;
    .locals 14

    .line 371
    new-instance v13, Ll/ᩳ᩶֫;

    .line 372
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 373
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    iget-wide v10, p0, Ll/ܺ᩵֫;->᩹:J

    iget-boolean v12, p0, Ll/ᩳ᩶֫;->᩶:Z

    iget v3, p0, Ll/ܺ᩵֫;->᩸:I

    iget v4, p0, Ll/ᩳ᩶֫;->ۛ:I

    iget-object v5, p0, Ll/ᩳ᩶֫;->ۤ:Ljava/lang/String;

    iget v6, p0, Ll/ᩳ᩶֫;->۫:I

    iget-object v7, p0, Ll/ᩳ᩶֫;->ۗ:Ll/۠ᩴ֫;

    iget v8, p0, Ll/ᩳ᩶֫;->۬:I

    move-object v0, v13

    move-object v9, p1

    invoke-direct/range {v0 .. v12}, Ll/ᩳ᩶֫;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILl/۠ᩴ֫;ILl/ܺۧۧ;JZ)V

    return-object v13
.end method
