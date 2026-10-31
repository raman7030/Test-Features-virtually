.class public final Ll/֨ᩴ᩷;
.super Ll/ۢ۬ۧ;
.source "C2R7"


# instance fields
.field public final synthetic ֫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic ۧ:Ll/ۜۗۧ;

.field public final synthetic ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ᩳ:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicInteger;Ll/ۜۗۧ;)V
    .locals 3

    const v0, 0x12dd8b51

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v2, Ll/֡ܶ;->ᩴܿ᩸:I

    .line 1011
    iput-object p1, p0, Ll/֨ᩴ᩷;->ᩳ:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p2, p0, Ll/֨ᩴ᩷;->ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Ll/֨ᩴ᩷;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p4, p0, Ll/֨ᩴ᩷;->ۧ:Ll/ۜۗۧ;

    invoke-direct {p0}, Ll/ۢ۬ۧ;-><init>()V

    const-string p1, "\u1a76\u05ab"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x5ecb

    const p3, -0x23b34911

    xor-int/2addr p2, p3

    const p3, 0x2fceea51

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, 0x3735

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    return-void

    .line 557
    :sswitch_0
    sget p1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u05ab\u1a73"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5e59

    const p3, -0x86a763e

    xor-int/2addr p2, p3

    const p3, -0x652f1985

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    sget p1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz p1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string p1, "\u1a73\u073a"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x435d

    const p3, -0x3014a4ea

    xor-int/2addr p2, p3

    const p3, 0xf802f50    # 1.2639999E-29f

    goto :goto_0

    .line 121
    :sswitch_2
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget p1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-gez p1, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const-string p1, "\u1a73\u1a79"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0xeb1

    const p3, 0xa7898d8

    xor-int/2addr p2, p3

    const p3, -0x5342eb75

    goto :goto_0

    .line 607
    :sswitch_3
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    :goto_3
    const-string p1, "\u05ab\u06d7"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1735

    const p3, 0x10fa6a95

    xor-int/2addr p2, p3

    const p3, -0x2d3de8cf

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 604
    :sswitch_5
    sget-boolean p1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez p1, :cond_3

    const-string p1, "\u1a77\u073d"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x7e41

    const p3, -0x21a6934c

    xor-int/2addr p2, p3

    const p3, 0x3796905a

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06d9\u06e0"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x4d

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x75b3

    const p3, -0x3a06d88b

    xor-int/2addr p2, p3

    const p3, 0x4e3d8bcd    # 7.9501395E8f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6f679811 -> :sswitch_2
        -0x33994c10 -> :sswitch_3
        -0x2f5fbd8c -> :sswitch_2
        -0x17490201 -> :sswitch_0
        -0xf117a59 -> :sswitch_5
        0x3b6ecc6 -> :sswitch_3
        0x1a2089ba -> :sswitch_1
        0x233e2489 -> :sswitch_5
        0x35d89a78 -> :sswitch_1
        0x5f7fcdb9 -> :sswitch_0
        0x70f1d6f7 -> :sswitch_4
        0x7dca1796 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final onScrollStateChanged(Ll/۬۬ۧ;I)V
    .locals 8

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x13058485

    sget v3, Ll/֨᩺;->ۨ֨۬:I

    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    const-string v5, "\u06dc\u06e2"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1bdb

    const v7, -0x2e0577b3

    xor-int/2addr v6, v7

    const v7, -0x7a54cee1

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0xf8f

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 951
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v5

    if-eqz v5, :cond_b

    goto/16 :goto_5

    .line 968
    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    sget v5, Ll/֨۟;->᩹֫᩷:I

    if-eqz v5, :cond_8

    goto/16 :goto_3

    .line 545
    :sswitch_1
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    sget v5, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v5, :cond_3

    goto/16 :goto_5

    .line 488
    :sswitch_2
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    goto/16 :goto_5

    .line 835
    :sswitch_3
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    return-void

    .line 1017
    :sswitch_4
    invoke-virtual {v1}, Ll/ۜۗۧ;->findFirstVisibleItemPosition()I

    move-result v5

    iget-object v6, p0, Ll/֨ᩴ᩷;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    goto :goto_1

    .line 1016
    :sswitch_5
    iget-object v1, p0, Ll/֨ᩴ᩷;->ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1017
    iget-object v1, p0, Ll/֨ᩴ᩷;->ۧ:Ll/ۜۗۧ;

    .line 635
    sget-boolean v5, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v5, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v5, "\u06ec\u1a78"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5b4f

    const v7, 0x1ceea726

    xor-int/2addr v6, v7

    const v7, 0x5664163d

    goto :goto_0

    :sswitch_6
    if-nez v0, :cond_1

    const-string v5, "\u06e1\u06d6"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x77

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x69d

    const v7, -0x774d77b7

    xor-int/2addr v6, v7

    const v7, 0x25bc2522

    goto :goto_0

    :sswitch_7
    return-void

    :sswitch_8
    xor-int/lit8 v5, v0, 0x1

    .line 1015
    iget-object v6, p0, Ll/֨ᩴ᩷;->ᩳ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v6, v5, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "\u06e7\u073a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5ca3

    const v7, 0x3d7405ff

    xor-int/2addr v6, v7

    const v7, 0x1107674

    goto/16 :goto_0

    :cond_1
    :goto_1
    const-string v5, "\u06df\u06e0"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xaf5

    const v7, -0x4b5f59b6

    xor-int/2addr v6, v7

    const v7, 0x41458be0

    goto/16 :goto_0

    :sswitch_9
    const/4 v0, 0x1

    goto :goto_2

    :sswitch_a
    const/4 v0, 0x0

    :goto_2
    const-string v5, "\u1a7b\u073a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1c05

    const v7, 0x4f745874

    xor-int/2addr v6, v7

    const v7, -0x292ab124

    goto/16 :goto_0

    :sswitch_b
    const/4 p1, 0x1

    if-eqz p2, :cond_2

    const-string v5, "\u073d\u06df"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xeb9

    const v7, 0x4853ef29

    xor-int/2addr v6, v7

    const v7, -0x3c1cbea3

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u06d8\u06ec"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x65

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7fc9

    const v7, 0x40846cea

    xor-int/2addr v6, v7

    const v7, -0x241be33b

    goto/16 :goto_0

    .line 199
    :sswitch_c
    sget v5, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v5, :cond_4

    :cond_3
    :goto_3
    const-string v5, "\u06df\u05a1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x11

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xc2f

    const v7, 0x4d7a8254    # 2.62677824E8f

    xor-int/2addr v6, v7

    const v7, -0x6ed40a53

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u05ab\u1a7a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x47

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x666d

    const v7, 0x4e13ed3d    # 6.204496E8f

    xor-int/2addr v6, v7

    const v7, -0x37d481b6

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v5

    if-gtz v5, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v5, "\u06d8\u1a76"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x18df

    const v7, 0x35288f74

    xor-int/2addr v6, v7

    const v7, -0x4480515

    goto/16 :goto_0

    .line 486
    :sswitch_e
    sget-boolean v5, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    const-string v5, "\u06ec\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2ea5

    const v7, 0xffc8844

    xor-int/2addr v6, v7

    const v7, -0x1948299d

    goto/16 :goto_0

    .line 484
    :sswitch_f
    sget v5, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v5, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v5, "\u05ab\u06d7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2395

    const v7, 0x461b6593

    xor-int/2addr v6, v7

    const v7, 0x5825cdbf

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v5, :cond_9

    :cond_8
    :goto_4
    const-string v5, "\u06e0\u06e1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2c6f

    const v7, -0x32e030a0

    xor-int/2addr v6, v7

    const v7, -0x1a431167

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06e7\u1a78"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x6b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2245

    const v7, 0x36eec0af

    xor-int/2addr v6, v7

    const v7, -0x23ba3110

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_5

    :cond_a
    const-string v5, "\u073a\u06e8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x29

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5895

    const v7, 0x35383a69

    xor-int/2addr v6, v7

    const v7, -0x47493aab

    goto/16 :goto_0

    .line 970
    :sswitch_12
    sget v5, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v5, :cond_c

    :cond_b
    const-string v5, "\u06ec\u06e1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0xf

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x37af

    const v7, -0x5d0103f6

    xor-int/2addr v6, v7

    const v7, 0x39e77efc

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06df\u06e8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x5

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x883

    const v7, -0x5ac44757

    xor-int/2addr v6, v7

    const v7, -0x3f307f74

    goto/16 :goto_0

    .line 876
    :sswitch_13
    sget v5, Ll/֡۬;->۠֡᩶:I

    if-gtz v5, :cond_d

    :goto_5
    const-string v5, "\u073a\u06e1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x63

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x20b7

    const v7, -0x6416df34

    xor-int/2addr v6, v7

    const v7, -0x2caeebc4

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06dc\u05a8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x63

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x360b

    const v7, -0x41eb70e8

    xor-int/2addr v6, v7

    const v7, -0x4a278fde

    goto/16 :goto_0

    :sswitch_14
    sget v5, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v5, :cond_e

    :goto_6
    const-string v5, "\u06eb\u1a78"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x79

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x71eb

    const v7, -0x7f446c8e

    xor-int/2addr v6, v7

    const v7, -0x24add5a7

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u06da\u05a1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x55b

    const v7, -0x7b6e91b5

    xor-int/2addr v6, v7

    const v7, 0x715fcc85

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b8233eb -> :sswitch_13
        -0x76df76af -> :sswitch_f
        -0x731a9d9d -> :sswitch_a
        -0x6ae356a9 -> :sswitch_8
        -0x68d04f51 -> :sswitch_8
        -0x646e36ae -> :sswitch_9
        -0x5e35b89e -> :sswitch_0
        -0x598916f4 -> :sswitch_1
        -0x5802d4e8 -> :sswitch_d
        -0x52f85e5c -> :sswitch_e
        -0x50efdd58 -> :sswitch_b
        -0x4b98756a -> :sswitch_7
        -0x3f9d0db2 -> :sswitch_1
        -0x399ecef3 -> :sswitch_14
        -0x31e655c7 -> :sswitch_10
        -0x30fb3c88 -> :sswitch_9
        -0x1fa54f87 -> :sswitch_14
        -0x1141e139 -> :sswitch_2
        -0x551875f -> :sswitch_b
        0x97d100c -> :sswitch_11
        0x9e0c270 -> :sswitch_f
        0xe95cee2 -> :sswitch_c
        0x107e8054 -> :sswitch_3
        0x10e23055 -> :sswitch_c
        0x15ae3ca5 -> :sswitch_4
        0x1a955557 -> :sswitch_5
        0x1f82c786 -> :sswitch_3
        0x1f924527 -> :sswitch_12
        0x25a16296 -> :sswitch_7
        0x2892dcb0 -> :sswitch_5
        0x31a1a399 -> :sswitch_11
        0x3677f222 -> :sswitch_4
        0x42da70d3 -> :sswitch_6
        0x51c16a1e -> :sswitch_2
        0x526858f2 -> :sswitch_e
        0x564f8040 -> :sswitch_d
        0x5acb07bc -> :sswitch_6
        0x6314e387 -> :sswitch_10
        0x64f0b648 -> :sswitch_0
        0x6cf2b0b2 -> :sswitch_a
        0x6e1fb3ca -> :sswitch_13
        0x7d39f10a -> :sswitch_12
    .end sparse-switch
.end method
