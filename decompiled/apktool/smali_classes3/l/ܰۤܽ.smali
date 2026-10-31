.class public final synthetic Ll/ܰۤܽ;
.super Ljava/lang/Object;
.source "44W5"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ֡ۖۧ:[S


# instance fields
.field public final synthetic ۗ:Ll/᩹ܶ֡;

.field public final synthetic ۙ:Ll/۠ۛ֡;

.field public final synthetic ۬:Ll/ۡܰۡ;

.field public final synthetic ᩶:Ljava/lang/ThreadLocal;

.field public final synthetic ᩸:Ll/֫ۛܽ;

.field public final synthetic ᩹:Ll/᩵ۛۡ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܰۤܽ;->֡ۖۧ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0xd6fs
        -0x6169s
        -0x6136s
        -0x612cs
        -0x6128s
        -0x612bs
        -0x6130s
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/֫ۛܽ;Ll/᩵ۛۡ;Ljava/lang/ThreadLocal;Ll/۠ۛ֡;Ll/᩹ܶ֡;Ll/ۡܰۡ;)V
    .locals 6

    const v0, 0x7886ccf7

    sget v1, Ll/֡᩶;->ܳܶ۠:I

    sget v2, Ll/֨ۤ;->ܿۖ᩵:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0733\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6abd

    const v5, -0x279f932d

    xor-int/2addr v4, v5

    const v5, -0x6ee9109d

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3587

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_9

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v3

    if-ltz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u06e7\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x63c9

    const v5, -0x3ed2fbd6

    xor-int/2addr v4, v5

    const v5, -0x5238b1ab

    goto :goto_0

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_8

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p4, p0, Ll/ܰۤܽ;->ۙ:Ll/۠ۛ֡;

    iput-object p5, p0, Ll/ܰۤܽ;->ۗ:Ll/᩹ܶ֡;

    iput-object p6, p0, Ll/ܰۤܽ;->۬:Ll/ۡܰۡ;

    return-void

    :sswitch_6
    iput-object p3, p0, Ll/ܰۤܽ;->᩶:Ljava/lang/ThreadLocal;

    .line 1
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06e0\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2d5

    const v5, -0x6dca5691

    xor-int/2addr v4, v5

    const v5, -0x17a12184

    goto :goto_0

    .line 3
    :sswitch_7
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u06d9\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x22d1

    const v5, 0x5a3a305f

    xor-int/2addr v4, v5

    const v5, -0x2191da4a

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u06d6\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5d47

    const v5, -0x2c0ab8b

    xor-int/2addr v4, v5

    const v5, 0x7da438d6

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u06e8\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x432f

    const v5, -0x32ec7e49

    xor-int/2addr v4, v5

    const v5, -0x1a7ef8e

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06d7\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1e3

    const v5, 0xd450e26

    xor-int/2addr v4, v5

    const v5, -0x7b101899

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_6

    goto :goto_1

    :cond_6
    const-string v3, "\u1a77\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1e85

    const v5, 0x3144fe08

    xor-int/2addr v4, v5

    const v5, -0x618f9bf6

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v3

    if-gtz v3, :cond_7

    :goto_1
    const-string v3, "\u0736\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x55bf

    const v5, -0x2428d200

    xor-int/2addr v4, v5

    const v5, -0x53d0768

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e8\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x671

    const v5, 0x1100f19

    xor-int/2addr v4, v5

    const v5, -0x56fba4d7

    goto/16 :goto_0

    :cond_8
    :goto_2
    const-string v3, "\u0736\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5787

    const v5, -0xba39ce5

    xor-int/2addr v4, v5

    const v5, 0x7179274

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06eb\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2aeb

    const v5, -0x6211af78

    xor-int/2addr v4, v5

    const v5, -0x4206c120

    goto/16 :goto_0

    .line 2
    :sswitch_d
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v3

    if-nez v3, :cond_a

    :goto_3
    const-string v3, "\u06eb\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1cf7

    const v5, -0xd26719d

    xor-int/2addr v4, v5

    const v5, 0x35b0ab38

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e4\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xc53

    const v5, 0x5f80e883

    xor-int/2addr v4, v5

    const v5, -0x77a94f2

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܰۤܽ;->᩸:Ll/֫ۛܽ;

    iput-object p2, p0, Ll/ܰۤܽ;->᩹:Ll/᩵ۛۡ;

    .line 2
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e1\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4437

    const v5, -0x60490407

    xor-int/2addr v4, v5

    const v5, 0x5ca9e03e

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073d\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x561b

    const v5, -0x19ff064

    xor-int/2addr v4, v5

    const v5, 0x6d91a101

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x723d7f45 -> :sswitch_8
        -0x6d04e9ce -> :sswitch_7
        -0x68bfbd95 -> :sswitch_c
        -0x22c06528 -> :sswitch_a
        -0x21a02d3d -> :sswitch_9
        -0x20ad360f -> :sswitch_1
        -0x18b6f3f2 -> :sswitch_c
        -0x184881e6 -> :sswitch_e
        -0x15c954b0 -> :sswitch_8
        -0x13de9f2a -> :sswitch_2
        0x619d304 -> :sswitch_2
        0x130b5a37 -> :sswitch_a
        0x1c6e0c02 -> :sswitch_e
        0x1d6e8d55 -> :sswitch_1
        0x207b885c -> :sswitch_5
        0x22eda190 -> :sswitch_3
        0x2451c571 -> :sswitch_4
        0x247caed0 -> :sswitch_b
        0x325131dc -> :sswitch_9
        0x347a922e -> :sswitch_3
        0x35671678 -> :sswitch_b
        0x358640f3 -> :sswitch_6
        0x3a19fc29 -> :sswitch_d
        0x3cfd0370 -> :sswitch_5
        0x4b6dc9d3 -> :sswitch_d
        0x4de4229e -> :sswitch_7
        0x5e685af2 -> :sswitch_6
        0x6f00b492 -> :sswitch_0
        0x76d9e32a -> :sswitch_0
        0x7bd75f1e -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    sget-object v0, Ll/ܰۤܽ;->֡ۖۧ:[S

    const/4 v1, 0x0

    aget-short v0, v0, v1

    const v1, 0x87a6

    mul-int v1, v1, v0

    mul-int v0, v0, v0

    const v2, 0x11f81fe9

    add-int/2addr v0, v2

    sub-int/2addr v0, v1

    if-ltz v0, :cond_0

    const v0, 0x9eb9

    goto :goto_0

    :cond_0
    const/16 v0, 0x3d25

    .line 2
    :goto_0
    iget-object v1, p0, Ll/ܰۤܽ;->᩸:Ll/֫ۛܽ;

    .line 4
    iget-object v2, p0, Ll/ܰۤܽ;->᩹:Ll/᩵ۛۡ;

    .line 6
    iget-object v3, p0, Ll/ܰۤܽ;->᩶:Ljava/lang/ThreadLocal;

    .line 8
    iget-object v4, p0, Ll/ܰۤܽ;->ۙ:Ll/۠ۛ֡;

    .line 10
    iget-object v5, p0, Ll/ܰۤܽ;->ۗ:Ll/᩹ܶ֡;

    .line 12
    iget-object v6, p0, Ll/ܰۤܽ;->۬:Ll/ۡܰۡ;

    .line 188
    iget-object v7, v1, Ll/֫ۛܽ;->ܳ:Ljava/lang/Exception;

    if-nez v7, :cond_2

    iget-object v7, v1, Ll/֫ۛܽ;->ۜ:Ll/᩺ۤܿ;

    invoke-static {v7}, Ll/֫᩺;->᩸֡۟(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    const/4 v7, 0x1

    .line 41
    invoke-static {v2, v7}, Ll/֫᩵;->۟ۚۘ(Ljava/lang/Object;I)Z

    .line 193
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܺᩴ;

    invoke-static {v2}, Ll/ۗۚ;->ܶۚ᩻(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    invoke-virtual {v2}, Ll/֡ܺᩴ;->֫()V

    .line 195
    new-instance v3, Ll/ܰۖܽ;

    invoke-direct {v3, v2}, Ll/ܰۖܽ;-><init>(Ljava/io/OutputStream;)V

    invoke-static {v3, v4, v5}, Ll/᩸ܶ֡;->֫(Ljava/io/Writer;Ll/ۡ֫ۚ;Ll/᩹ܶ֡;)V

    .line 196
    invoke-static {v4}, Ll/֫֫;->֫ۜۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 197
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v5

    sub-int/2addr v5, v7

    invoke-static {v3, v7, v5}, Ll/֨ۡ;->᩻ۨܳ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v3, Ll/ܰۤܽ;->֡ۖۧ:[S

    const/4 v5, 0x1

    const/4 v7, 0x6

    invoke-static {v3, v5, v7, v0}, Ll/֨ۡ;->ۤܿۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    move-object v0, v6

    .line 198
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 199
    :try_start_1
    invoke-static {v6, v3}, Ll/֡۬;->ᩴۗۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 200
    iget-object v3, v2, Ll/֡ܺᩴ;->᩸:[B

    iget v2, v2, Ll/֡ܺᩴ;->᩹:I

    const/4 v4, 0x0

    invoke-virtual {v6, v3, v4, v2}, Ll/ۡܰۡ;->write([BII)V

    .line 201
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    .line 205
    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    iput-object v2, v1, Ll/֫ۛܽ;->ܳ:Ljava/lang/Exception;

    goto :goto_1

    :catch_0
    move-exception v0

    .line 203
    iput-object v0, v1, Ll/֫ۛܽ;->ܳ:Ljava/lang/Exception;

    :cond_2
    :goto_1
    return-void
.end method
