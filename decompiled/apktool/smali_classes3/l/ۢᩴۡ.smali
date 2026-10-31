.class public final Ll/ۢᩴۡ;
.super Ljava/lang/Object;
.source "D20P"


# static fields
.field private static final ܺ᩷ܶ:[S


# instance fields
.field public ֫:Ljava/util/LinkedList;

.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x28

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۢᩴۡ;->ܺ᩷ܶ:[S

    return-void

    :array_0
    .array-data 2
        0x1fa5s
        0x5444s
        0x5443s
        0x5451s
        0x5456s
        0x547ds
        0x5457s
        0x5450s
        0x544es
        0x5451s
        0x5444s
        0x5443s
        0x5451s
        0x5456s
        0x547ds
        0x5457s
        0x5450s
        0x544es
        0x5451s
        0x547ds
        0x5447s
        0x545as
        0x5452s
        0x544bs
        0x5450s
        0x5447s
        0x5446s
        0x547es
        0x545es
        0x201as
        -0x59c8s
        -0x59c1s
        -0x59d3s
        -0x59d6s
        -0x59ffs
        -0x59d5s
        -0x59d4s
        -0x59ces
        -0x59d3s
        -0x59des
    .end array-data
.end method

.method public constructor <init>()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x2bffad53

    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v5, "\u1a78\u0733"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3dbf

    const v7, 0x2d39c36b

    xor-int/2addr v6, v7

    const v7, 0x2e3c9d06

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0xacd

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    sget v5, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v5, :cond_8

    goto/16 :goto_3

    .line 34
    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v5, :cond_b

    goto/16 :goto_1

    .line 41
    :sswitch_1
    sget v5, Ll/ۗ᩵;->֫۠۟:I

    if-gez v5, :cond_4

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    sget v5, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v5, :cond_9

    goto/16 :goto_1

    .line 26
    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    goto :goto_1

    .line 22
    :sswitch_4
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 67
    :sswitch_5
    iput-object v1, p0, Ll/ۢᩴۡ;->ۧ:Ljava/util/ArrayList;

    .line 68
    new-instance v5, Ljava/util/LinkedList;

    .line 33
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v6

    if-ltz v6, :cond_0

    goto/16 :goto_2

    .line 68
    :cond_0
    invoke-direct {v5}, Ljava/util/LinkedList;-><init>()V

    iput-object v5, p0, Ll/ۢᩴۡ;->֫:Ljava/util/LinkedList;

    return-void

    .line 67
    :sswitch_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    sget v5, Ll/۠;->ܺܺܶ:I

    if-ltz v5, :cond_1

    const-string v5, "\u1a75\u06ec"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x45

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5f7b

    const v7, 0x1b951ce4

    xor-int/2addr v6, v7

    const v7, -0x1884f4f3

    goto :goto_0

    :cond_1
    const-string v5, "\u073d\u06eb"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x39bf

    const v7, -0x60641cc2

    xor-int/2addr v6, v7

    const v7, -0x77adcf00

    goto :goto_0

    .line 66
    :sswitch_7
    iput-object v0, p0, Ll/ۢᩴۡ;->ܽ:Ljava/util/HashMap;

    sget v5, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v5, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v5, "\u06e7\u1a79"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1e21

    const v7, 0x4d634b96    # 2.38336352E8f

    xor-int/2addr v6, v7

    const v7, 0x59cc0f94

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v5

    if-eqz v5, :cond_3

    :goto_1
    const-string v5, "\u05a8\u06e0"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x19d3

    const v7, -0x10fdc0a6

    xor-int/2addr v6, v7

    const v7, -0x5b66b16c

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06dc\u06dc"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5e2d

    const v7, -0x5efa74e3

    xor-int/2addr v6, v7

    const v7, 0x4bc0f7e8    # 2.5292752E7f

    goto/16 :goto_0

    .line 51
    :sswitch_9
    sget v5, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v5, :cond_5

    :cond_4
    const-string v5, "\u1a7a\u06e8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x39ff

    const v7, 0x4e3318f8    # 7.511895E8f

    xor-int/2addr v6, v7

    const v7, 0x6f97509e

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u1a77\u06d7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3af1

    const v7, -0x5472503b

    xor-int/2addr v6, v7

    const v7, -0x414d0a61

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v5

    if-ltz v5, :cond_6

    goto :goto_2

    :cond_6
    const-string v5, "\u0733\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x7d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3efd

    const v7, 0x3650835

    xor-int/2addr v6, v7

    const v7, -0x2b4d836f

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v5, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v5, :cond_7

    goto :goto_2

    :cond_7
    const-string v5, "\u06eb\u05ab"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x376d

    const v7, -0x50133132

    xor-int/2addr v6, v7

    const v7, 0x2dd548ac

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06e1\u06d8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6793

    const v7, 0x5a41d5c2

    xor-int/2addr v6, v7

    const v7, -0x21ad0db8    # -3.80007271E18f

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v5, :cond_a

    :cond_9
    :goto_2
    const-string v5, "\u06db\u073d"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x3

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x218d

    const v7, 0x6c855cd4

    xor-int/2addr v6, v7

    const v7, -0x4c1455f5

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a76\u06db"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x729b

    const v7, 0x5f379d5d

    xor-int/2addr v6, v7

    const v7, -0x546d2267

    goto/16 :goto_0

    .line 66
    :sswitch_d
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    sget v5, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v5, :cond_c

    :cond_b
    :goto_3
    const-string v5, "\u0730\u1a73"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4551

    const v7, 0x1a2923d0

    xor-int/2addr v6, v7

    const v7, 0x166f4238

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u0730\u073f"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2d03

    const v7, 0x66e3d629

    xor-int/2addr v6, v7

    const v7, 0x509fe512

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d22dd59 -> :sswitch_a
        -0x5f879701 -> :sswitch_8
        -0x5cc464de -> :sswitch_9
        -0x4377da66 -> :sswitch_a
        -0x40238669 -> :sswitch_d
        -0x3f6322e5 -> :sswitch_2
        -0x3d162a89 -> :sswitch_6
        -0x37d0df34 -> :sswitch_6
        -0x1b787490 -> :sswitch_1
        -0x1b3765bd -> :sswitch_7
        -0x1283694e -> :sswitch_2
        -0x642a4bd -> :sswitch_3
        -0x1a6fd28 -> :sswitch_4
        -0x684aca -> :sswitch_c
        0xb914e87 -> :sswitch_4
        0x16e6ecee -> :sswitch_3
        0x19b10964 -> :sswitch_5
        0x1d3b0ee9 -> :sswitch_b
        0x1dbbd655 -> :sswitch_5
        0x20cb500d -> :sswitch_7
        0x26164fc6 -> :sswitch_d
        0x2f5211f5 -> :sswitch_8
        0x4025efe2 -> :sswitch_0
        0x4263bfc9 -> :sswitch_c
        0x4bcee776 -> :sswitch_0
        0x4fb1f175 -> :sswitch_b
        0x52db285e -> :sswitch_1
        0x5d9df252 -> :sswitch_9
    .end sparse-switch
.end method

.method public static bridge synthetic ֫(Ll/ۢᩴۡ;)Ljava/util/LinkedList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢᩴۡ;->֫:Ljava/util/LinkedList;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۢᩴۡ;Ljava/util/LinkedList;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۢᩴۡ;->֫:Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 199
    iget-object v1, p0, Ll/ۢᩴۡ;->֫:Ljava/util/LinkedList;

    move-object v0, v1

    .line 200
    monitor-enter v0

    .line 201
    :try_start_0
    iget-object v2, p0, Ll/ۢᩴۡ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/ۘᩴ;->ۤ֡ۖ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-static {v2}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳܶۡ;

    .line 202
    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v4

    invoke-static {}, Ll/ۡᩴۡ;->ۧ()I

    move-result v5

    if-lt v4, v5, :cond_1

    .line 203
    monitor-exit v0

    return-void

    .line 204
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 205
    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 208
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ᩳܶۡ;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x195ddaec

    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    const-string v5, "\u1a77\u06dc"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x676d

    const v7, 0x56f56ea5

    xor-int/2addr v6, v7

    const v7, 0x592156b2

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x44e7

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    return-void

    :sswitch_0
    sget v5, Ll/۟;->ۗۤۛ:I

    if-eqz v5, :cond_4

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget v5, Ll/ۘۛ;->ۖۚ֡:I

    if-lez v5, :cond_0

    goto/16 :goto_5

    .line 75
    :sswitch_2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget v5, Ll/֨᩺;->ۨ֨۬:I

    if-lez v5, :cond_c

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    goto/16 :goto_4

    .line 11
    :sswitch_4
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    return-void

    .line 78
    :sswitch_5
    iget-object v5, p0, Ll/ۢᩴۡ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v5, p1}, Ll/۟;->ᩴۗᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_2

    .line 77
    :sswitch_6
    invoke-static {p1}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5, p1}, Ll/֨۬;->᩶ۧܺ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget v5, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v5, :cond_1

    :cond_0
    :goto_1
    const-string v5, "\u06e7\u06e8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x15af

    const v7, 0x5d7871ef

    xor-int/2addr v6, v7

    const v7, -0x404cea04

    goto :goto_0

    :cond_1
    const-string v5, "\u06d6\u1a77"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x31

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x27f7

    const v7, 0x79af82a1

    xor-int/2addr v6, v7

    const v7, 0x791f9d6c

    goto :goto_0

    .line 76
    :sswitch_7
    iget-object v1, p0, Ll/ۢᩴۡ;->ܽ:Ljava/util/HashMap;

    invoke-static {v1, v0}, Ll/֨۬;->֨᩷ۜ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    const-string v5, "\u0730\u1a7b"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1601

    const v7, -0x5679c97d

    xor-int/2addr v6, v7

    const v7, -0x36a0a933

    goto/16 :goto_0

    :cond_2
    :goto_2
    const-string v5, "\u06e1\u0736"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x11

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6a6b

    const v7, -0x621a87b4

    xor-int/2addr v6, v7

    const v7, -0x1d218e2f

    goto/16 :goto_0

    .line 75
    :sswitch_8
    invoke-static {p1}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 43
    sget v5, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u06e8\u06d7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x6d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x217f

    const v7, -0x6874f91c

    xor-int/2addr v6, v7

    const v7, 0x24856945

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v5, :cond_5

    :cond_4
    const-string v5, "\u1a73\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x30e7

    const v7, -0x709ae0e6

    xor-int/2addr v6, v7

    const v7, 0x3d083752

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u05ab\u1a73"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x57b

    const v7, 0x3da086ee

    xor-int/2addr v6, v7

    const v7, -0x279b340d

    goto/16 :goto_0

    .line 67
    :sswitch_a
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_3

    :cond_6
    const-string v5, "\u05a1\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6401

    const v7, 0x1003fa7a

    xor-int/2addr v6, v7

    const v7, 0x148318bc

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v5, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v5, "\u1a79\u0736"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3e2f

    const v7, 0x7d8af82e

    xor-int/2addr v6, v7

    const v7, 0x5888b68d

    goto/16 :goto_0

    .line 61
    :sswitch_c
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v5

    if-gtz v5, :cond_8

    :goto_3
    const-string v5, "\u06eb\u06e1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x6d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x48af

    const v7, 0x723df1b9

    xor-int/2addr v6, v7

    const v7, 0x591b105f

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u0730\u1a75"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x559

    const v7, -0x35e23f0e    # -2584636.5f

    xor-int/2addr v6, v7

    const v7, 0x3266c132

    goto/16 :goto_0

    .line 45
    :sswitch_d
    sget v5, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v5, :cond_9

    goto :goto_5

    :cond_9
    const-string v5, "\u06e0\u06db"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x11

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7757

    const v7, 0x7ac64fae

    xor-int/2addr v6, v7

    const v7, 0x18551d63

    goto/16 :goto_0

    .line 50
    :sswitch_e
    sget v5, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v5, :cond_a

    goto :goto_4

    :cond_a
    const-string v5, "\u06d9\u06d9"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x63

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x288b

    const v7, -0x3f7656de

    xor-int/2addr v6, v7

    const v7, -0x4e40d231

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v5

    if-nez v5, :cond_b

    :goto_4
    const-string v5, "\u06d9\u06db"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x49

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x56a7

    const v7, 0x6b7af445

    xor-int/2addr v6, v7

    const v7, -0x11bc3a2c

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u1a78\u073a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x61

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x21f

    const v7, -0x402a6ba1

    xor-int/2addr v6, v7

    const v7, 0x402e60e4

    goto/16 :goto_0

    .line 62
    :sswitch_10
    sget v5, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v5, :cond_d

    :cond_c
    :goto_5
    const-string v5, "\u06dc\u06e4"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x3b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4d2f

    const v7, 0x1fcc8df8

    xor-int/2addr v6, v7

    const v7, -0x6ca2b5ad

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u05a1\u1a79"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x35

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6c9b

    const v7, 0x1977b458

    xor-int/2addr v6, v7

    const v7, 0x485079cf

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x74aa1af3 -> :sswitch_0
        -0x56617c41 -> :sswitch_2
        -0x549cb7a1 -> :sswitch_d
        -0x4e0317fc -> :sswitch_d
        -0x4a6c38ce -> :sswitch_4
        -0x3fc0ad5b -> :sswitch_b
        -0x33d6907d -> :sswitch_c
        -0x2f557a78 -> :sswitch_1
        -0x2d0d17f6 -> :sswitch_4
        -0x2924f6f6 -> :sswitch_5
        -0x279a11ef -> :sswitch_5
        -0x2781c353 -> :sswitch_0
        -0x20384e79 -> :sswitch_b
        -0x16156b80 -> :sswitch_e
        -0xd0f2738 -> :sswitch_9
        -0x664af0b -> :sswitch_3
        -0x357ffd0 -> :sswitch_f
        0x109ae683 -> :sswitch_f
        0x11de9efb -> :sswitch_7
        0x18f6d532 -> :sswitch_2
        0x1e58b8d3 -> :sswitch_a
        0x20bc7e3c -> :sswitch_3
        0x24fe2676 -> :sswitch_6
        0x2c718fa7 -> :sswitch_10
        0x35c5882b -> :sswitch_8
        0x3e52c5b5 -> :sswitch_a
        0x3ffb2512 -> :sswitch_10
        0x4405044b -> :sswitch_1
        0x4a8be416 -> :sswitch_e
        0x5280998a -> :sswitch_8
        0x68d92ead -> :sswitch_7
        0x6ccbe25d -> :sswitch_c
        0x6d285cab -> :sswitch_6
        0x725a98ab -> :sswitch_9
    .end sparse-switch
.end method

.method public final declared-synchronized ֫(Z)V
    .locals 12

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 87
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->֡()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 88
    monitor-exit v0

    return-void

    .line 90
    :cond_0
    :try_start_1
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 91
    new-instance v8, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v8}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 93
    invoke-static {}, Ll/ۡᩴۡ;->ۧ()I

    move-result v2

    new-array v9, v2, [Ll/ᩳܶۡ;

    .line 94
    iget-object v2, p0, Ll/ۢᩴۡ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/ۗۗ;->ۢ᩸᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-static {v10}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v10}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ll/ᩳܶۡ;

    .line 95
    new-instance v11, Ll/᩷ᩴۡ;

    move-object v2, v11

    move-object v3, p0

    move-object v5, v8

    move-object v6, v1

    move-object v7, v9

    invoke-direct/range {v2 .. v7}, Ll/᩷ᩴۡ;-><init>(Ll/ۢᩴۡ;Ll/ᩳܶۡ;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;[Ll/ᩳܶۡ;)V

    .line 250
    sget-object v2, Ll/֫ۨۡ;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-interface {v2, v11}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_4

    :cond_2
    const-wide/16 v2, 0xa

    .line 136
    :try_start_2
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 137
    invoke-static {v1}, Ll/ۖ;->֡᩹۫(Ljava/lang/Object;)I

    move-result p1

    const/4 v2, 0x1

    if-lt p1, v2, :cond_3

    goto :goto_1

    .line 139
    :cond_3
    invoke-static {v8}, Ll/֡᩺;->᩺ᩴ᩹(Ljava/lang/Object;)I

    move-result p1

    iget-object v2, p0, Ll/ۢᩴۡ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/ۗ᩵;->ۡᩴۙ(Ljava/lang/Object;)I

    move-result v2
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p1, v2, :cond_2

    .line 146
    :catch_0
    :cond_4
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final ۧ()Ll/ᩳܶۡ;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x63369d06

    sget v2, Ll/֡۬;->۠֡᩶:I

    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    const-string v4, "\u06da\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x32fb

    const v6, -0x2ef8dfc1

    xor-int/2addr v5, v6

    const v6, 0x3312fd11

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x3dff

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 133
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_3

    .line 54
    :sswitch_0
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    sget-boolean v4, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u06e8\u06d6"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7887

    const v6, 0x625192b

    xor-int/2addr v5, v6

    const v6, 0x4c129e97    # 3.843542E7f

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v4, :cond_c

    goto/16 :goto_2

    .line 55
    :sswitch_2
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_6

    goto/16 :goto_4

    .line 29
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    goto/16 :goto_4

    .line 48
    :sswitch_4
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/4 v4, 0x1

    .line 150
    invoke-virtual {p0, v4}, Ll/ۢᩴۡ;->֫(Z)V

    .line 151
    invoke-virtual {p0}, Ll/ۢᩴۡ;->֫()V

    goto :goto_1

    .line 153
    :sswitch_6
    iget-object v0, p0, Ll/ۢᩴۡ;->֫:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳܶۡ;

    return-object v0

    .line 149
    :sswitch_7
    invoke-static {v0}, Ll/ۘۛ;->۫ܳ۫(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "\u06db\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x198b

    const v6, 0x598fa64f

    xor-int/2addr v5, v6

    const v6, 0x43c6e177

    goto :goto_0

    :cond_1
    :goto_1
    const-string v4, "\u05a8\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x553f

    const v6, -0x323c8dc1

    xor-int/2addr v5, v6

    const v6, -0x6b3be447

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06d9\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5281

    const v6, 0x72c9cbef

    xor-int/2addr v5, v6

    const v6, 0x4863e152

    goto/16 :goto_0

    .line 85
    :sswitch_8
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v4

    if-ltz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06d8\u1a77"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2cdd

    const v6, 0x5c4476e1

    xor-int/2addr v5, v6

    const v6, -0x67f61130

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v4, "\u06e2\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x73bb

    const v6, 0x38ebf7a2

    xor-int/2addr v5, v6

    const v6, 0x609631

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06e2\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7bb9

    const v6, -0x2d846d8d

    xor-int/2addr v5, v6

    const v6, 0x5432134d

    goto/16 :goto_0

    .line 71
    :sswitch_b
    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v4, :cond_7

    :cond_6
    :goto_2
    const-string v4, "\u1a7b\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3445

    const v6, -0x67a07a1d

    xor-int/2addr v5, v6

    const v6, -0x31687efa

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e0\u06d9"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x39f

    const v6, -0x1f59c2d9

    xor-int/2addr v5, v6

    const v6, 0x665a4997

    goto/16 :goto_0

    .line 48
    :sswitch_c
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v4

    if-nez v4, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v4, "\u0730\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7465

    const v6, 0x25613edd

    xor-int/2addr v5, v6

    const v6, 0x75d535bf

    goto/16 :goto_0

    .line 15
    :sswitch_d
    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_9

    :goto_3
    const-string v4, "\u06dc\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3823

    const v6, 0x2db3a9a3

    xor-int/2addr v5, v6

    const v6, -0x3d4b7469

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06d6\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xe77

    const v6, 0xf9650f7

    xor-int/2addr v5, v6

    const v6, -0x4ba0ce62

    goto/16 :goto_0

    .line 129
    :sswitch_e
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_5

    :cond_a
    const-string v4, "\u05ab\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x71

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7d3b

    const v6, -0x4071aed2

    xor-int/2addr v5, v6

    const v6, 0x6f93f166

    goto/16 :goto_0

    .line 2
    :sswitch_f
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v4

    if-nez v4, :cond_b

    :goto_4
    const-string v4, "\u06e2\u1a77"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x9c3

    const v6, 0x10ef0b21

    xor-int/2addr v5, v6

    const v6, -0x5729d50d

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u05a8\u1a75"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5051

    const v6, -0x14f6b33a

    xor-int/2addr v5, v6

    const v6, 0x63a4e612

    goto/16 :goto_0

    .line 149
    :sswitch_10
    iget-object v0, p0, Ll/ۢᩴۡ;->֫:Ljava/util/LinkedList;

    sget v4, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v4, :cond_d

    :cond_c
    :goto_5
    const-string v4, "\u06e4\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x24d3

    const v6, -0x57c1532d

    xor-int/2addr v5, v6

    const v6, 0x9ca7e7e

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06d9\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x744d

    const v6, -0x295f9024

    xor-int/2addr v5, v6

    const v6, -0x2969aee2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7627906c -> :sswitch_0
        -0x7483fa85 -> :sswitch_6
        -0x743b4e4f -> :sswitch_8
        -0x6febdf25 -> :sswitch_d
        -0x67f9c945 -> :sswitch_1
        -0x37d833ba -> :sswitch_d
        -0x379d0dae -> :sswitch_5
        -0x29800648 -> :sswitch_3
        -0x25a0d878 -> :sswitch_0
        -0x1e2cb30d -> :sswitch_f
        -0xf5a4e00 -> :sswitch_e
        -0xa53c5ba -> :sswitch_10
        -0x18ee7b9 -> :sswitch_b
        0x4d765e3 -> :sswitch_f
        0x9bb4b49 -> :sswitch_3
        0x9f4e4d6 -> :sswitch_8
        0xddd0d64 -> :sswitch_a
        0x10a9cc29 -> :sswitch_1
        0x1b10491e -> :sswitch_9
        0x1fc79e40 -> :sswitch_c
        0x23720d72 -> :sswitch_4
        0x237a6ffd -> :sswitch_2
        0x2b095391 -> :sswitch_5
        0x2bf950ce -> :sswitch_10
        0x339f0bd3 -> :sswitch_4
        0x34c54818 -> :sswitch_2
        0x38704559 -> :sswitch_b
        0x3ffb230a -> :sswitch_c
        0x40e7ebae -> :sswitch_6
        0x50884c91 -> :sswitch_7
        0x64033f62 -> :sswitch_9
        0x7432f797 -> :sswitch_7
        0x7b4f6cde -> :sswitch_e
        0x7eb1d16f -> :sswitch_a
    .end sparse-switch
.end method

.method public final ܽ()V
    .locals 9

    sget-object v0, Ll/ۢᩴۡ;->ܺ᩷ܶ:[S

    const/4 v1, 0x0

    aget-short v0, v0, v1

    mul-int v1, v0, v0

    const v2, 0x3b84d10

    add-int/2addr v1, v2

    add-int/2addr v1, v1

    add-int/lit16 v0, v0, 0x1edc

    mul-int v0, v0, v0

    sub-int/2addr v0, v1

    if-gtz v0, :cond_0

    const/16 v0, 0x5422

    goto :goto_0

    :cond_0
    const v0, 0xb53e

    .line 170
    :goto_0
    invoke-static {}, Ll/ۡᩴۡ;->֫()Landroid/content/SharedPreferences;

    move-result-object v1

    sget-object v2, Ll/ۢᩴۡ;->ܺ᩷ܶ:[S

    const/4 v3, 0x1

    const/16 v4, 0x9

    invoke-static {v2, v3, v4, v0}, Ll/ۖ۫;->ᩴ۟ۚ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Ll/֨ۡ;->᩷᩵ܿ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 171
    invoke-static {}, Ll/ۡᩴۡ;->֫()Landroid/content/SharedPreferences;

    move-result-object v2

    sget-object v3, Ll/ۢᩴۡ;->ܺ᩷ܶ:[S

    const/16 v4, 0xa

    const/16 v5, 0x11

    invoke-static {v3, v4, v5, v0}, Ll/ۛ;->᩷ۘ᩹([SIII)Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-static {}, Ll/֨ᩴ;->ۖ᩶ۜ()J

    move-result-wide v4

    const/4 v6, 0x0

    const/4 v7, 0x1

    cmp-long v8, v2, v4

    if-gez v8, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v1, :cond_3

    sget-object v3, Ll/ۢᩴۡ;->ܺ᩷ܶ:[S

    const/16 v4, 0x1b

    const/4 v5, 0x2

    invoke-static {v3, v4, v5, v0}, Ll/֨ۡ;->ۤܿۢ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 174
    invoke-static {v1, v0}, Ll/֨ᩴ;->ۡᩴ᩷(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v1

    array-length v3, v1

    const/4 v0, 0x0

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_3

    aget-object v0, v1, v4

    .line 83
    iget-object v5, p0, Ll/ۢᩴۡ;->ܽ:Ljava/util/HashMap;

    invoke-static {v5, v0}, Ll/ۘ᩻;->۬ۖ۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ll/ᩳܶۡ;

    if-eqz v5, :cond_2

    .line 177
    iget-object v0, p0, Ll/ۢᩴۡ;->֫:Ljava/util/LinkedList;

    monitor-enter v0

    .line 178
    :try_start_0
    iget-object v8, p0, Ll/ۢᩴۡ;->֫:Ljava/util/LinkedList;

    invoke-virtual {v8, v5}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 179
    monitor-exit v0

    goto :goto_3

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 189
    :cond_3
    iget-object v0, p0, Ll/ۢᩴۡ;->֫:Ljava/util/LinkedList;

    invoke-static {v0}, Ll/ۘۛ;->۫ܳ۫(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    move v7, v2

    .line 192
    :goto_4
    invoke-virtual {p0}, Ll/ۢᩴۡ;->֫()V

    if-eqz v7, :cond_5

    .line 195
    invoke-virtual {p0, v6}, Ll/ۢᩴۡ;->֫(Z)V

    :cond_5
    return-void
.end method

.method public final ܿ()I
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ۢᩴۡ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/֡ۨ;->᩸ۧۧ(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ᩳ()V
    .locals 8

    sget-object v0, Ll/ۢᩴۡ;->ܺ᩷ܶ:[S

    const/16 v1, 0x1d

    aget-short v0, v0, v1

    mul-int v1, v0, v0

    const v2, 0x4e3aac1

    add-int/2addr v1, v2

    add-int/2addr v1, v1

    add-int/lit16 v0, v0, 0x2361

    mul-int v0, v0, v0

    sub-int/2addr v1, v0

    if-gez v1, :cond_0

    const/16 v0, 0x53ea

    const/16 v1, 0x53ea

    goto :goto_0

    :cond_0
    const v0, 0xa65e

    const v1, 0xa65e

    .line 157
    :goto_0
    iget-object v2, p0, Ll/ۢᩴۡ;->֫:Ljava/util/LinkedList;

    move-object v0, v2

    .line 158
    monitor-enter v0

    .line 159
    :try_start_0
    invoke-static {v2}, Ll/֨۬;->ۗۗۡ(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 160
    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 161
    invoke-static {}, Ll/ۡᩴۡ;->֫()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    sget-object v4, Ll/ۢᩴۡ;->ܺ᩷ܶ:[S

    const/16 v5, 0x1e

    const/16 v6, 0x9

    invoke-static {v4, v5, v6, v1}, Ll/֨ۡ;->ۤܿۢ([SIII)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ll/ۢᩴۡ;->ܺ᩷ܶ:[S

    const/16 v6, 0x27

    const/4 v7, 0x1

    invoke-static {v5, v6, v7, v1}, Ll/ۗ᩶;->᩶ܶۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/ۢܺ֡;->֫(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 166
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
