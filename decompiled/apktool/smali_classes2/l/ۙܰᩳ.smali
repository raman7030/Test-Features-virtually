.class public final Ll/ۙܰᩳ;
.super Ljava/lang/Object;
.source "F6SK"


# instance fields
.field public final ֫:Z

.field public final ۜ:I

.field public final ۡ:Z

.field public final ۢ:F

.field public final ۧ:Z

.field public final ܳ:I

.field public final ܺ:Z

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:F

.field public final ᩳ:Z

.field public final ᩷:I

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(FFIIILjava/lang/String;Ljava/lang/String;ZZZZZ)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p6, p0, Ll/ۙܰᩳ;->᩻:Ljava/lang/String;

    iput p3, p0, Ll/ۙܰᩳ;->᩷:I

    iput p1, p0, Ll/ۙܰᩳ;->ۢ:F

    iput p4, p0, Ll/ۙܰᩳ;->ܳ:I

    .line 20
    iput p2, p0, Ll/ۙܰᩳ;->ܿ:F

    .line 21
    iput-boolean p8, p0, Ll/ۙܰᩳ;->ᩳ:Z

    iput-boolean p9, p0, Ll/ۙܰᩳ;->֫:Z

    iput-boolean p10, p0, Ll/ۙܰᩳ;->ۡ:Z

    .line 22
    iput-boolean p11, p0, Ll/ۙܰᩳ;->ۧ:Z

    iput p5, p0, Ll/ۙܰᩳ;->ۜ:I

    iput-object p7, p0, Ll/ۙܰᩳ;->ܽ:Ljava/lang/String;

    iput-boolean p12, p0, Ll/ۙܰᩳ;->ܺ:Z

    return-void
.end method

.method public static ֫(Ljava/io/ByteArrayInputStream;JI)Ll/ۙܰᩳ;
    .locals 19

    move-wide/from16 v0, p1

    move-object/from16 v2, p0

    move/from16 v3, p3

    .line 27
    invoke-static {v0, v1, v2}, Ll/᩻᩶ᩳ;->֫(JLjava/io/InputStream;)Ll/᩻᩶ᩳ;

    move-result-object v2

    if-ltz v3, :cond_c

    int-to-long v4, v3

    cmp-long v6, v0, v4

    if-gtz v6, :cond_c

    .line 29
    :try_start_0
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v0

    const v1, 0x17272716

    const v4, 0x1727271b

    if-lt v0, v1, :cond_0

    if-gt v0, v4, :cond_0

    move v5, v0

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-nez v5, :cond_1

    .line 31
    invoke-virtual {v2, v0, v3}, Ll/᩻᩶ᩳ;->֫(II)Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object v12, v0

    goto :goto_2

    :cond_1
    invoke-virtual {v2, v3}, Ll/᩻᩶ᩳ;->ܽ(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 32
    :goto_2
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readByte()I

    move-result v9

    .line 49
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    .line 34
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v10

    .line 35
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v14

    const v0, 0x17272717

    if-lt v5, v0, :cond_2

    .line 36
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    const/4 v15, 0x1

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    const/4 v15, 0x0

    .line 37
    :goto_3
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v17

    if-lt v5, v1, :cond_3

    .line 38
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readInt()I

    .line 39
    :cond_3
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v11

    const v0, 0x17272718

    if-lt v5, v0, :cond_4

    .line 40
    invoke-virtual {v2, v3}, Ll/᩻᩶ᩳ;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    :goto_4
    move-object v13, v0

    goto :goto_5

    :cond_4
    const-string v0, ""

    goto :goto_4

    :goto_5
    const v0, 0x17272719

    if-lt v5, v0, :cond_6

    .line 41
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_6

    :cond_5
    const/4 v0, 0x0

    const/16 v18, 0x0

    goto :goto_7

    :cond_6
    :goto_6
    const/4 v0, 0x1

    const/16 v18, 0x1

    :goto_7
    const v0, 0x1727271a

    if-lt v5, v0, :cond_8

    .line 42
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    const/16 v16, 0x0

    goto :goto_9

    :cond_8
    :goto_8
    const/4 v0, 0x1

    const/16 v16, 0x1

    :goto_9
    if-lt v5, v4, :cond_9

    .line 49
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    move v8, v0

    goto :goto_a

    :cond_9
    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    :goto_a
    if-lt v5, v4, :cond_b

    const v0, 0x3f4ccccd    # 0.8f

    cmpl-float v0, v8, v0

    if-ltz v0, :cond_a

    const/high16 v0, 0x40000000    # 2.0f

    cmpg-float v0, v8, v0

    if-gtz v0, :cond_a

    goto :goto_b

    .line 45
    :cond_a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid line spacing"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_b
    :goto_b
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->ᩳ()V

    .line 47
    new-instance v0, Ll/ۙܰᩳ;

    move-object v6, v0

    invoke-direct/range {v6 .. v18}, Ll/ۙܰᩳ;-><init>(FFIIILjava/lang/String;Ljava/lang/String;ZZZZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->close()V

    return-object v0

    .line 28
    :cond_c
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Legacy preferences exceed app state limit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 27
    :try_start_2
    invoke-virtual {v2}, Ll/᩻᩶ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_c

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_c
    throw v1
.end method
