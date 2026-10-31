.class public final Ll/ܿ۠;
.super Ljava/lang/Object;
.source "P1JH"


# static fields
.field public static ֡:Z = false

.field public static ᩵:I = 0x3e8


# instance fields
.field public ֫:I

.field public ۖ:Ll/ۧ۠;

.field public ۘ:I

.field public ۜ:I

.field public ۡ:I

.field public ۢ:[Ll/ܺ۠;

.field public ۧ:Z

.field public ܳ:I

.field public ܺ:[Ll/ۧ۠;

.field public ܽ:[Z

.field public ܿ:Ll/ۢ۠;

.field public final ᩳ:Ll/ܽ۠;

.field public ᩴ:Z

.field public ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 48
    iput-boolean v0, p0, Ll/ܿ۠;->ۧ:Z

    .line 53
    iput v0, p0, Ll/ܿ۠;->ۘ:I

    const/16 v1, 0x20

    .line 65
    iput v1, p0, Ll/ܿ۠;->֫:I

    .line 66
    iput v1, p0, Ll/ܿ۠;->ܳ:I

    const/4 v2, 0x0

    .line 67
    iput-object v2, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    .line 71
    iput-boolean v0, p0, Ll/ܿ۠;->ᩴ:Z

    new-array v2, v1, [Z

    .line 74
    iput-object v2, p0, Ll/ܿ۠;->ܽ:[Z

    const/4 v2, 0x1

    .line 76
    iput v2, p0, Ll/ܿ۠;->ۜ:I

    .line 77
    iput v0, p0, Ll/ܿ۠;->᩷:I

    .line 78
    iput v1, p0, Ll/ܿ۠;->᩻:I

    .line 82
    sget v2, Ll/ܿ۠;->᩵:I

    new-array v2, v2, [Ll/ܺ۠;

    iput-object v2, p0, Ll/ܿ۠;->ۢ:[Ll/ܺ۠;

    .line 83
    iput v0, p0, Ll/ܿ۠;->ۡ:I

    new-array v0, v1, [Ll/ۧ۠;

    .line 95
    iput-object v0, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    .line 96
    invoke-direct {p0}, Ll/ܿ۠;->ۜ()V

    .line 97
    new-instance v0, Ll/ܽ۠;

    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v2, Ll/᩻۠;

    invoke-direct {v2}, Ll/᩻۠;-><init>()V

    iput-object v2, v0, Ll/ܽ۠;->֫:Ll/᩻۠;

    .line 24
    new-instance v2, Ll/᩻۠;

    invoke-direct {v2}, Ll/᩻۠;-><init>()V

    iput-object v2, v0, Ll/ܽ۠;->ܽ:Ll/᩻۠;

    new-array v1, v1, [Ll/ܺ۠;

    .line 25
    iput-object v1, v0, Ll/ܽ۠;->ۧ:[Ll/ܺ۠;

    .line 97
    iput-object v0, p0, Ll/ܿ۠;->ᩳ:Ll/ܽ۠;

    .line 98
    new-instance v1, Ll/ۢ۠;

    invoke-direct {v1, v0}, Ll/ۢ۠;-><init>(Ll/ܽ۠;)V

    iput-object v1, p0, Ll/ܿ۠;->ܿ:Ll/ۢ۠;

    .line 102
    new-instance v1, Ll/ۧ۠;

    invoke-direct {v1, v0}, Ll/ۧ۠;-><init>(Ll/ܽ۠;)V

    iput-object v1, p0, Ll/ܿ۠;->ۖ:Ll/ۧ۠;

    return-void
.end method

.method private ֫(Ll/ۡ۠;)Ll/ܺ۠;
    .locals 3

    .line 370
    iget-object v0, p0, Ll/ܿ۠;->ᩳ:Ll/ܽ۠;

    iget-object v0, v0, Ll/ܽ۠;->ܽ:Ll/᩻۠;

    invoke-virtual {v0}, Ll/᩻۠;->֫()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ۠;

    if-nez v0, :cond_0

    .line 372
    new-instance v0, Ll/ܺ۠;

    invoke-direct {v0, p1}, Ll/ܺ۠;-><init>(Ll/ۡ۠;)V

    goto :goto_0

    .line 375
    :cond_0
    invoke-virtual {v0}, Ll/ܺ۠;->֫()V

    .line 292
    :goto_0
    iput-object p1, v0, Ll/ܺ۠;->᩷:Ll/ۡ۠;

    .line 378
    iget p1, p0, Ll/ܿ۠;->ۡ:I

    sget v1, Ll/ܿ۠;->᩵:I

    if-lt p1, v1, :cond_1

    mul-int/lit8 v1, v1, 0x2

    .line 379
    sput v1, Ll/ܿ۠;->᩵:I

    .line 380
    iget-object p1, p0, Ll/ܿ۠;->ۢ:[Ll/ܺ۠;

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/ܺ۠;

    iput-object p1, p0, Ll/ܿ۠;->ۢ:[Ll/ܺ۠;

    .line 382
    :cond_1
    iget-object p1, p0, Ll/ܿ۠;->ۢ:[Ll/ܺ۠;

    iget v1, p0, Ll/ܿ۠;->ۡ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܿ۠;->ۡ:I

    aput-object v0, p1, v1

    return-object v0
.end method

.method private final ֫(Ll/ᩳ۠;)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 721
    :goto_0
    iget v2, p0, Ll/ܿ۠;->ۜ:I

    if-ge v1, v2, :cond_0

    .line 722
    iget-object v2, p0, Ll/ܿ۠;->ܽ:[Z

    aput-boolean v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_1
    :goto_1
    if-nez v0, :cond_b

    const/4 v2, 0x1

    add-int/2addr v1, v2

    .line 742
    iget v3, p0, Ll/ܿ۠;->ۜ:I

    mul-int/lit8 v3, v3, 0x2

    if-lt v1, v3, :cond_2

    goto/16 :goto_4

    .line 749
    :cond_2
    move-object v3, p1

    check-cast v3, Ll/ۧ۠;

    .line 707
    iget-object v3, v3, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    if-eqz v3, :cond_3

    .line 750
    iget-object v4, p0, Ll/ܿ۠;->ܽ:[Z

    iget v3, v3, Ll/ܺ۠;->ᩳ:I

    aput-boolean v2, v4, v3

    .line 752
    :cond_3
    iget-object v3, p0, Ll/ܿ۠;->ܽ:[Z

    invoke-interface {p1, v3}, Ll/ᩳ۠;->֫([Z)Ll/ܺ۠;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 758
    iget-object v4, p0, Ll/ܿ۠;->ܽ:[Z

    iget v5, v3, Ll/ܺ۠;->ᩳ:I

    aget-boolean v6, v4, v5

    if-eqz v6, :cond_4

    goto :goto_4

    .line 764
    :cond_4
    aput-boolean v2, v4, v5

    :cond_5
    if-eqz v3, :cond_a

    const/4 v2, -0x1

    const v4, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v5, 0x0

    const/4 v6, -0x1

    .line 785
    :goto_2
    iget v7, p0, Ll/ܿ۠;->᩷:I

    if-ge v5, v7, :cond_9

    .line 786
    iget-object v7, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    aget-object v7, v7, v5

    .line 787
    iget-object v8, v7, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    .line 788
    iget-object v8, v8, Ll/ܺ۠;->᩷:Ll/ۡ۠;

    sget-object v9, Ll/ۡ۠;->۬:Ll/ۡ۠;

    if-ne v8, v9, :cond_6

    goto :goto_3

    .line 792
    :cond_6
    iget-boolean v8, v7, Ll/ۧ۠;->ۧ:Z

    if-eqz v8, :cond_7

    goto :goto_3

    .line 135
    :cond_7
    iget-object v8, v7, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v8, v3}, Ll/֫۠;->ۧ(Ll/ܺ۠;)Z

    move-result v8

    if-eqz v8, :cond_8

    .line 802
    iget-object v8, v7, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v8, v3}, Ll/֫۠;->֫(Ll/ܺ۠;)F

    move-result v8

    const/4 v9, 0x0

    cmpg-float v9, v8, v9

    if-gez v9, :cond_8

    .line 804
    iget v7, v7, Ll/ۧ۠;->֫:F

    neg-float v7, v7

    div-float/2addr v7, v8

    cmpg-float v8, v7, v4

    if-gez v8, :cond_8

    move v6, v5

    move v4, v7

    :cond_8
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_9
    if-le v6, v2, :cond_1

    .line 819
    iget-object v4, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    aget-object v4, v4, v6

    .line 820
    iget-object v5, v4, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    iput v2, v5, Ll/ܺ۠;->ۧ:I

    .line 824
    invoke-virtual {v4, v3}, Ll/ۧ۠;->ۧ(Ll/ܺ۠;)V

    .line 825
    iget-object v2, v4, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    iput v6, v2, Ll/ܺ۠;->ۧ:I

    .line 826
    invoke-virtual {v2, p0, v4}, Ll/ܺ۠;->֫(Ll/ܿ۠;Ll/ۧ۠;)V

    goto :goto_1

    :cond_a
    const/4 v0, 0x1

    goto/16 :goto_1

    :cond_b
    :goto_4
    return-void
.end method

.method private ۜ()V
    .locals 3

    const/4 v0, 0x0

    .line 166
    :goto_0
    iget v1, p0, Ll/ܿ۠;->᩷:I

    if-ge v0, v1, :cond_1

    .line 167
    iget-object v1, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    .line 169
    iget-object v2, p0, Ll/ܿ۠;->ᩳ:Ll/ܽ۠;

    iget-object v2, v2, Ll/ܽ۠;->֫:Ll/᩻۠;

    invoke-virtual {v2, v1}, Ll/᩻۠;->֫(Ll/ۧ۠;)V

    .line 171
    :cond_0
    iget-object v1, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۧ(Ljava/lang/Object;)I
    .locals 1

    .line 409
    check-cast p0, Ll/ۚ۠;

    .line 415
    invoke-virtual {p0}, Ll/ۚ۠;->ܿ()Ll/ܺ۠;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 417
    iget p0, p0, Ll/ܺ۠;->֫:F

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p0, v0

    float-to-int p0, p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final ۧ(Ll/ۧ۠;)V
    .locals 7

    .line 639
    iget-boolean v0, p1, Ll/ۧ۠;->ۧ:Z

    if-eqz v0, :cond_0

    .line 640
    iget-object v0, p1, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    iget p1, p1, Ll/ۧ۠;->֫:F

    invoke-virtual {v0, p0, p1}, Ll/ܺ۠;->֫(Ll/ܿ۠;F)V

    goto :goto_0

    .line 642
    :cond_0
    iget-object v0, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    iget v1, p0, Ll/ܿ۠;->᩷:I

    aput-object p1, v0, v1

    .line 643
    iget-object v0, p1, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    iput v1, v0, Ll/ܺ۠;->ۧ:I

    add-int/lit8 v1, v1, 0x1

    .line 644
    iput v1, p0, Ll/ܿ۠;->᩷:I

    .line 645
    invoke-virtual {v0, p0, p1}, Ll/ܺ۠;->֫(Ll/ܿ۠;Ll/ۧ۠;)V

    .line 652
    :goto_0
    iget-boolean p1, p0, Ll/ܿ۠;->ۧ:Z

    if-eqz p1, :cond_7

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 654
    :goto_1
    iget v1, p0, Ll/ܿ۠;->᩷:I

    if-ge v0, v1, :cond_6

    .line 655
    iget-object v1, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    aget-object v1, v1, v0

    if-nez v1, :cond_1

    .line 656
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "WTF"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 658
    :cond_1
    iget-object v1, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    aget-object v1, v1, v0

    if-eqz v1, :cond_5

    iget-boolean v2, v1, Ll/ۧ۠;->ۧ:Z

    if-eqz v2, :cond_5

    .line 660
    iget-object v2, v1, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    iget v3, v1, Ll/ۧ۠;->֫:F

    invoke-virtual {v2, p0, v3}, Ll/ܺ۠;->֫(Ll/ܿ۠;F)V

    .line 664
    iget-object v2, p0, Ll/ܿ۠;->ᩳ:Ll/ܽ۠;

    iget-object v2, v2, Ll/ܽ۠;->֫:Ll/᩻۠;

    invoke-virtual {v2, v1}, Ll/᩻۠;->֫(Ll/ۧ۠;)V

    .line 666
    iget-object v1, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v1, v0, 0x1

    move v3, v1

    .line 668
    :goto_2
    iget v4, p0, Ll/ܿ۠;->᩷:I

    if-ge v1, v4, :cond_3

    .line 669
    iget-object v3, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    add-int/lit8 v4, v1, -0x1

    aget-object v5, v3, v1

    aput-object v5, v3, v4

    .line 670
    iget-object v3, v5, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    iget v5, v3, Ll/ܺ۠;->ۧ:I

    if-ne v5, v1, :cond_2

    .line 671
    iput v4, v3, Ll/ܺ۠;->ۧ:I

    :cond_2
    add-int/lit8 v3, v1, 0x1

    move v6, v3

    move v3, v1

    move v1, v6

    goto :goto_2

    :cond_3
    if-ge v3, v4, :cond_4

    .line 676
    iget-object v1, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    aput-object v2, v1, v3

    :cond_4
    add-int/lit8 v4, v4, -0x1

    .line 678
    iput v4, p0, Ll/ܿ۠;->᩷:I

    add-int/lit8 v0, v0, -0x1

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 682
    :cond_6
    iput-boolean p1, p0, Ll/ܿ۠;->ۧ:Z

    :cond_7
    return-void
.end method

.method private ܳ()V
    .locals 3

    const/4 v0, 0x0

    .line 1036
    :goto_0
    iget v1, p0, Ll/ܿ۠;->᩷:I

    if-ge v0, v1, :cond_0

    .line 1037
    iget-object v1, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    aget-object v1, v1, v0

    .line 1038
    iget-object v2, v1, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    iget v1, v1, Ll/ۧ۠;->֫:F

    iput v1, v2, Ll/ܺ۠;->֫:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ᩻()V
    .locals 3

    .line 140
    iget v0, p0, Ll/ܿ۠;->֫:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll/ܿ۠;->֫:I

    .line 141
    iget-object v1, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۧ۠;

    iput-object v0, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    .line 142
    iget-object v0, p0, Ll/ܿ۠;->ᩳ:Ll/ܽ۠;

    iget-object v1, v0, Ll/ܽ۠;->ۧ:[Ll/ܺ۠;

    iget v2, p0, Ll/ܿ۠;->֫:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/ܺ۠;

    iput-object v1, v0, Ll/ܽ۠;->ۧ:[Ll/ܺ۠;

    .line 143
    iget v0, p0, Ll/ܿ۠;->֫:I

    new-array v1, v0, [Z

    iput-object v1, p0, Ll/ܿ۠;->ܽ:[Z

    .line 144
    iput v0, p0, Ll/ܿ۠;->ܳ:I

    .line 145
    iput v0, p0, Ll/ܿ۠;->᩻:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۧ۠;
    .locals 2

    .line 263
    iget-object v0, p0, Ll/ܿ۠;->ᩳ:Ll/ܽ۠;

    iget-object v1, v0, Ll/ܽ۠;->֫:Ll/᩻۠;

    invoke-virtual {v1}, Ll/᩻۠;->֫()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ۠;

    if-nez v1, :cond_0

    .line 265
    new-instance v1, Ll/ۧ۠;

    invoke-direct {v1, v0}, Ll/ۧ۠;-><init>(Ll/ܽ۠;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    .line 128
    iput-object v0, v1, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    .line 129
    iget-object v0, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v0}, Ll/֫۠;->clear()V

    const/4 v0, 0x0

    .line 130
    iput v0, v1, Ll/ۧ۠;->֫:F

    const/4 v0, 0x0

    .line 131
    iput-boolean v0, v1, Ll/ۧ۠;->ۧ:Z

    return-object v1
.end method

.method public final ֫(I)Ll/ܺ۠;
    .locals 3

    .line 351
    iget v0, p0, Ll/ܿ۠;->ۜ:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Ll/ܿ۠;->ܳ:I

    if-lt v0, v1, :cond_0

    .line 352
    invoke-direct {p0}, Ll/ܿ۠;->᩻()V

    .line 354
    :cond_0
    sget-object v0, Ll/ۡ۠;->᩶:Ll/ۡ۠;

    invoke-direct {p0, v0}, Ll/ܿ۠;->֫(Ll/ۡ۠;)Ll/ܺ۠;

    move-result-object v0

    .line 355
    iget v1, p0, Ll/ܿ۠;->ۘ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ܿ۠;->ۘ:I

    .line 356
    iget v2, p0, Ll/ܿ۠;->ۜ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ܿ۠;->ۜ:I

    .line 357
    iput v1, v0, Ll/ܺ۠;->ᩳ:I

    .line 358
    iput p1, v0, Ll/ܺ۠;->ۢ:I

    .line 359
    iget-object p1, p0, Ll/ܿ۠;->ᩳ:Ll/ܽ۠;

    iget-object p1, p1, Ll/ܽ۠;->ۧ:[Ll/ܺ۠;

    aput-object v0, p1, v1

    .line 360
    iget-object p1, p0, Ll/ܿ۠;->ܿ:Ll/ۢ۠;

    invoke-virtual {p1, v0}, Ll/ۢ۠;->ܽ(Ll/ܺ۠;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)Ll/ܺ۠;
    .locals 4

    if-nez p1, :cond_0

    goto :goto_1

    .line 223
    :cond_0
    iget v0, p0, Ll/ܿ۠;->ۜ:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Ll/ܿ۠;->ܳ:I

    if-lt v0, v1, :cond_1

    .line 224
    invoke-direct {p0}, Ll/ܿ۠;->᩻()V

    .line 227
    :cond_1
    instance-of v0, p1, Ll/ۚ۠;

    if-eqz v0, :cond_6

    .line 228
    check-cast p1, Ll/ۚ۠;

    invoke-virtual {p1}, Ll/ۚ۠;->ܿ()Ll/ܺ۠;

    move-result-object v0

    if-nez v0, :cond_2

    .line 230
    invoke-virtual {p1}, Ll/ۚ۠;->ܺ()V

    .line 231
    invoke-virtual {p1}, Ll/ۚ۠;->ܿ()Ll/ܺ۠;

    move-result-object v0

    .line 233
    :cond_2
    iget p1, v0, Ll/ܺ۠;->ᩳ:I

    const/4 v1, -0x1

    iget-object v2, p0, Ll/ܿ۠;->ᩳ:Ll/ܽ۠;

    if-eq p1, v1, :cond_4

    iget v3, p0, Ll/ܿ۠;->ۘ:I

    if-gt p1, v3, :cond_4

    iget-object v3, v2, Ll/ܽ۠;->ۧ:[Ll/ܺ۠;

    aget-object v3, v3, p1

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    :goto_0
    if-eq p1, v1, :cond_5

    .line 237
    invoke-virtual {v0}, Ll/ܺ۠;->֫()V

    .line 239
    :cond_5
    iget p1, p0, Ll/ܿ۠;->ۘ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܿ۠;->ۘ:I

    .line 240
    iget v1, p0, Ll/ܿ۠;->ۜ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ܿ۠;->ۜ:I

    .line 241
    iput p1, v0, Ll/ܺ۠;->ᩳ:I

    .line 242
    sget-object v1, Ll/ۡ۠;->۬:Ll/ۡ۠;

    iput-object v1, v0, Ll/ܺ۠;->᩷:Ll/ۡ۠;

    .line 243
    iget-object v1, v2, Ll/ܽ۠;->ۧ:[Ll/ܺ۠;

    aput-object v0, v1, p1

    return-object v0

    :cond_6
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ۢ۠;)V
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 879
    :goto_0
    iget v2, v0, Ll/ܿ۠;->᩷:I

    if-ge v1, v2, :cond_d

    .line 880
    iget-object v2, v0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    aget-object v2, v2, v1

    iget-object v3, v2, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    .line 881
    iget-object v3, v3, Ll/ܺ۠;->᩷:Ll/ۡ۠;

    sget-object v4, Ll/ۡ۠;->۬:Ll/ۡ۠;

    if-ne v3, v4, :cond_0

    goto/16 :goto_8

    .line 884
    :cond_0
    iget v2, v2, Ll/ۧ۠;->֫:F

    const/4 v3, 0x0

    cmpg-float v2, v2, v3

    if-gez v2, :cond_c

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_1
    if-nez v1, :cond_d

    add-int/lit8 v2, v2, 0x1

    const/4 v4, -0x1

    const v5, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, -0x1

    const/4 v9, 0x0

    .line 914
    :goto_2
    iget v10, v0, Ll/ܿ۠;->᩷:I

    if-ge v6, v10, :cond_9

    .line 915
    iget-object v10, v0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    aget-object v10, v10, v6

    .line 916
    iget-object v11, v10, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    .line 917
    iget-object v11, v11, Ll/ܺ۠;->᩷:Ll/ۡ۠;

    sget-object v12, Ll/ۡ۠;->۬:Ll/ۡ۠;

    if-ne v11, v12, :cond_1

    goto :goto_6

    .line 922
    :cond_1
    iget-boolean v11, v10, Ll/ۧ۠;->ۧ:Z

    if-eqz v11, :cond_2

    goto :goto_6

    .line 925
    :cond_2
    iget v11, v10, Ll/ۧ۠;->֫:F

    cmpg-float v11, v11, v3

    if-gez v11, :cond_8

    .line 931
    iget-object v11, v10, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v11}, Ll/֫۠;->ۧ()I

    move-result v11

    const/4 v12, 0x0

    :goto_3
    if-ge v12, v11, :cond_8

    .line 933
    iget-object v13, v10, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v13, v12}, Ll/֫۠;->֫(I)Ll/ܺ۠;

    move-result-object v13

    .line 934
    iget-object v14, v10, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v14, v13}, Ll/֫۠;->֫(Ll/ܺ۠;)F

    move-result v14

    cmpg-float v3, v14, v3

    if-gtz v3, :cond_3

    goto :goto_5

    :cond_3
    const/4 v3, 0x0

    :goto_4
    const/16 v15, 0x9

    if-ge v3, v15, :cond_7

    .line 942
    iget-object v15, v13, Ll/ܺ۠;->ۡ:[F

    aget v15, v15, v3

    div-float/2addr v15, v14

    cmpg-float v16, v15, v5

    if-gez v16, :cond_4

    if-eq v3, v9, :cond_5

    :cond_4
    if-le v3, v9, :cond_6

    .line 946
    :cond_5
    iget v5, v13, Ll/ܺ۠;->ᩳ:I

    move v9, v3

    move v8, v5

    move v7, v6

    move v5, v15

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_7
    :goto_5
    add-int/lit8 v12, v12, 0x1

    const/4 v3, 0x0

    goto :goto_3

    :cond_8
    :goto_6
    add-int/lit8 v6, v6, 0x1

    const/4 v3, 0x0

    goto :goto_2

    :cond_9
    if-eq v7, v4, :cond_a

    .line 977
    iget-object v3, v0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    aget-object v3, v3, v7

    .line 982
    iget-object v5, v3, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    iput v4, v5, Ll/ܺ۠;->ۧ:I

    .line 986
    iget-object v4, v0, Ll/ܿ۠;->ᩳ:Ll/ܽ۠;

    iget-object v4, v4, Ll/ܽ۠;->ۧ:[Ll/ܺ۠;

    aget-object v4, v4, v8

    invoke-virtual {v3, v4}, Ll/ۧ۠;->ۧ(Ll/ܺ۠;)V

    .line 987
    iget-object v4, v3, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    iput v7, v4, Ll/ܺ۠;->ۧ:I

    .line 988
    invoke-virtual {v4, v0, v3}, Ll/ܺ۠;->֫(Ll/ܿ۠;Ll/ۧ۠;)V

    goto :goto_7

    :cond_a
    const/4 v1, 0x1

    .line 997
    :goto_7
    iget v3, v0, Ll/ܿ۠;->ۜ:I

    div-int/lit8 v3, v3, 0x2

    if-le v2, v3, :cond_b

    const/4 v1, 0x1

    :cond_b
    const/4 v3, 0x0

    goto/16 :goto_1

    :cond_c
    :goto_8
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 514
    :cond_d
    invoke-direct/range {p0 .. p1}, Ll/ܿ۠;->֫(Ll/ᩳ۠;)V

    .line 519
    invoke-direct/range {p0 .. p0}, Ll/ܿ۠;->ܳ()V

    return-void
.end method

.method public final ֫(Ll/ۧ۠;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 562
    iget v2, v0, Ll/ܿ۠;->᩷:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iget v4, v0, Ll/ܿ۠;->᩻:I

    if-ge v2, v4, :cond_0

    iget v2, v0, Ll/ܿ۠;->ۜ:I

    add-int/2addr v2, v3

    iget v4, v0, Ll/ܿ۠;->ܳ:I

    if-lt v2, v4, :cond_1

    .line 563
    :cond_0
    invoke-direct/range {p0 .. p0}, Ll/ܿ۠;->᩻()V

    .line 571
    :cond_1
    iget-boolean v2, v1, Ll/ۧ۠;->ۧ:Z

    if-nez v2, :cond_1e

    .line 712
    iget-object v2, v1, Ll/ۧ۠;->ܿ:Ljava/util/ArrayList;

    iget-object v4, v0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    array-length v4, v4

    const/4 v5, -0x1

    if-nez v4, :cond_2

    goto :goto_5

    :cond_2
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_8

    .line 718
    iget-object v6, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v6}, Ll/֫۠;->ۧ()I

    move-result v6

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_4

    .line 720
    iget-object v8, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v8, v7}, Ll/֫۠;->֫(I)Ll/ܺ۠;

    move-result-object v8

    .line 721
    iget v9, v8, Ll/ܺ۠;->ۧ:I

    if-ne v9, v5, :cond_3

    iget-boolean v9, v8, Ll/ܺ۠;->ܳ:Z

    if-nez v9, :cond_3

    goto :goto_2

    .line 722
    :cond_3
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 725
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_7

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v6, :cond_6

    .line 728
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܺ۠;

    .line 729
    iget-boolean v9, v8, Ll/ܺ۠;->ܳ:Z

    if-eqz v9, :cond_5

    .line 730
    invoke-virtual {v1, v0, v8, v3}, Ll/ۧ۠;->֫(Ll/ܿ۠;Ll/ܺ۠;Z)V

    goto :goto_4

    .line 734
    :cond_5
    iget-object v9, v0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    iget v8, v8, Ll/ܺ۠;->ۧ:I

    aget-object v8, v9, v8

    invoke-virtual {v1, v0, v8, v3}, Ll/ۧ۠;->֫(Ll/ܿ۠;Ll/ۧ۠;Z)V

    :goto_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 737
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    :cond_7
    const/4 v4, 0x1

    goto :goto_0

    .line 742
    :cond_8
    iget-object v2, v1, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    if-eqz v2, :cond_9

    iget-object v2, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    .line 743
    invoke-interface {v2}, Ll/֫۠;->ۧ()I

    move-result v2

    if-nez v2, :cond_9

    .line 744
    iput-boolean v3, v1, Ll/ۧ۠;->ۧ:Z

    .line 745
    iput-boolean v3, v0, Ll/ܿ۠;->ۧ:Z

    .line 575
    :cond_9
    :goto_5
    invoke-virtual/range {p1 .. p1}, Ll/ۧ۠;->֫()Z

    move-result v2

    if-eqz v2, :cond_a

    goto/16 :goto_11

    .line 415
    :cond_a
    iget v2, v1, Ll/ۧ۠;->֫:F

    const/4 v4, 0x0

    cmpg-float v4, v2, v4

    if-gez v4, :cond_b

    const/high16 v4, -0x40800000    # -1.0f

    mul-float v2, v2, v4

    .line 417
    iput v2, v1, Ll/ۧ۠;->֫:F

    .line 418
    iget-object v2, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v2}, Ll/֫۠;->֫()V

    .line 464
    :cond_b
    iget-object v2, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v2}, Ll/֫۠;->ۧ()I

    move-result v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_6
    if-ge v5, v2, :cond_14

    .line 466
    iget-object v12, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v12, v5}, Ll/֫۠;->ۧ(I)F

    move-result v12

    .line 467
    iget-object v13, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v13, v5}, Ll/֫۠;->֫(I)Ll/ܺ۠;

    move-result-object v13

    const/4 v14, 0x0

    .line 468
    iget-object v15, v13, Ll/ܺ۠;->᩷:Ll/ۡ۠;

    sget-object v4, Ll/ۡ۠;->۬:Ll/ۡ۠;

    if-ne v15, v4, :cond_f

    if-nez v10, :cond_c

    .line 532
    iget v4, v13, Ll/ܺ۠;->ܺ:I

    if-gt v4, v3, :cond_d

    goto :goto_7

    :cond_c
    cmpl-float v4, v6, v12

    if-lez v4, :cond_e

    iget v4, v13, Ll/ܺ۠;->ܺ:I

    if-gt v4, v3, :cond_d

    :goto_7
    const/4 v4, 0x1

    goto :goto_8

    :cond_d
    const/4 v4, 0x0

    :goto_8
    move v7, v4

    move v6, v12

    move-object v10, v13

    goto :goto_b

    :cond_e
    if-nez v7, :cond_13

    iget v4, v13, Ll/ܺ۠;->ܺ:I

    if-gt v4, v3, :cond_13

    const/4 v4, 0x1

    move v6, v12

    move-object v10, v13

    const/4 v7, 0x1

    goto :goto_b

    :cond_f
    if-nez v10, :cond_13

    cmpg-float v4, v12, v14

    if-gez v4, :cond_13

    if-nez v11, :cond_10

    iget v4, v13, Ll/ܺ۠;->ܺ:I

    if-gt v4, v3, :cond_11

    goto :goto_9

    :cond_10
    cmpl-float v4, v8, v12

    if-lez v4, :cond_12

    iget v4, v13, Ll/ܺ۠;->ܺ:I

    if-gt v4, v3, :cond_11

    :goto_9
    const/4 v4, 0x1

    goto :goto_a

    :cond_11
    const/4 v4, 0x0

    :goto_a
    move v9, v4

    move v8, v12

    move-object v11, v13

    goto :goto_b

    :cond_12
    if-nez v9, :cond_13

    iget v4, v13, Ll/ܺ۠;->ܺ:I

    if-gt v4, v3, :cond_13

    const/4 v4, 0x1

    move v8, v12

    move-object v11, v13

    const/4 v9, 0x1

    :cond_13
    :goto_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_14
    const/4 v2, 0x0

    if-eqz v10, :cond_15

    goto :goto_c

    :cond_15
    move-object v10, v11

    :goto_c
    if-nez v10, :cond_16

    const/4 v4, 0x1

    goto :goto_d

    .line 437
    :cond_16
    invoke-virtual {v1, v10}, Ll/ۧ۠;->ۧ(Ll/ܺ۠;)V

    const/4 v4, 0x0

    .line 439
    :goto_d
    iget-object v5, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v5}, Ll/֫۠;->ۧ()I

    move-result v5

    if-nez v5, :cond_17

    .line 440
    iput-boolean v3, v1, Ll/ۧ۠;->ۧ:Z

    :cond_17
    if-eqz v4, :cond_1c

    .line 294
    iget v4, v0, Ll/ܿ۠;->ۜ:I

    add-int/2addr v4, v3

    iget v5, v0, Ll/ܿ۠;->ܳ:I

    if-lt v4, v5, :cond_18

    .line 295
    invoke-direct/range {p0 .. p0}, Ll/ܿ۠;->᩻()V

    .line 297
    :cond_18
    sget-object v4, Ll/ۡ۠;->ۙ:Ll/ۡ۠;

    invoke-direct {v0, v4}, Ll/ܿ۠;->֫(Ll/ۡ۠;)Ll/ܺ۠;

    move-result-object v4

    .line 298
    iget v5, v0, Ll/ܿ۠;->ۘ:I

    add-int/2addr v5, v3

    iput v5, v0, Ll/ܿ۠;->ۘ:I

    .line 299
    iget v6, v0, Ll/ܿ۠;->ۜ:I

    add-int/2addr v6, v3

    iput v6, v0, Ll/ܿ۠;->ۜ:I

    .line 300
    iput v5, v4, Ll/ܺ۠;->ᩳ:I

    .line 301
    iget-object v6, v0, Ll/ܿ۠;->ᩳ:Ll/ܽ۠;

    iget-object v7, v6, Ll/ܽ۠;->ۧ:[Ll/ܺ۠;

    aput-object v4, v7, v5

    .line 590
    iput-object v4, v1, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    .line 591
    iget v5, v0, Ll/ܿ۠;->᩷:I

    .line 592
    invoke-direct/range {p0 .. p1}, Ll/ܿ۠;->ۧ(Ll/ۧ۠;)V

    .line 593
    iget v7, v0, Ll/ܿ۠;->᩷:I

    add-int/2addr v5, v3

    if-ne v7, v5, :cond_1c

    .line 595
    iget-object v5, v0, Ll/ܿ۠;->ۖ:Ll/ۧ۠;

    const/4 v7, 0x0

    .line 678
    iput-object v7, v5, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    .line 679
    iget-object v7, v5, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v7}, Ll/֫۠;->clear()V

    const/4 v7, 0x0

    .line 680
    :goto_e
    iget-object v8, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v8}, Ll/֫۠;->ۧ()I

    move-result v8

    if-ge v7, v8, :cond_19

    .line 681
    iget-object v8, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v8, v7}, Ll/֫۠;->֫(I)Ll/ܺ۠;

    move-result-object v8

    .line 682
    iget-object v9, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v9, v7}, Ll/֫۠;->ۧ(I)F

    move-result v9

    .line 683
    iget-object v10, v5, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v10, v8, v9, v3}, Ll/֫۠;->֫(Ll/ܺ۠;FZ)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_e

    .line 596
    :cond_19
    iget-object v5, v0, Ll/ܿ۠;->ۖ:Ll/ۧ۠;

    invoke-direct {v0, v5}, Ll/ܿ۠;->֫(Ll/ᩳ۠;)V

    .line 597
    iget v5, v4, Ll/ܺ۠;->ۧ:I

    const/4 v7, -0x1

    if-ne v5, v7, :cond_1d

    .line 601
    iget-object v5, v1, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    if-ne v5, v4, :cond_1a

    .line 603
    invoke-virtual {v1, v4}, Ll/ۧ۠;->֫(Ll/ܺ۠;)Ll/ܺ۠;

    move-result-object v4

    if-eqz v4, :cond_1a

    .line 608
    invoke-virtual {v1, v4}, Ll/ۧ۠;->ۧ(Ll/ܺ۠;)V

    .line 611
    :cond_1a
    iget-boolean v4, v1, Ll/ۧ۠;->ۧ:Z

    if-nez v4, :cond_1b

    .line 612
    iget-object v4, v1, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    invoke-virtual {v4, v0, v1}, Ll/ܺ۠;->֫(Ll/ܿ۠;Ll/ۧ۠;)V

    .line 617
    :cond_1b
    iget-object v4, v6, Ll/ܽ۠;->֫:Ll/᩻۠;

    invoke-virtual {v4, v1}, Ll/᩻۠;->֫(Ll/ۧ۠;)V

    .line 619
    iget v4, v0, Ll/ܿ۠;->᩷:I

    sub-int/2addr v4, v3

    iput v4, v0, Ll/ܿ۠;->᩷:I

    goto :goto_f

    :cond_1c
    const/4 v3, 0x0

    .line 63
    :cond_1d
    :goto_f
    iget-object v4, v1, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    if-eqz v4, :cond_20

    iget-object v4, v4, Ll/ܺ۠;->᩷:Ll/ۡ۠;

    sget-object v5, Ll/ۡ۠;->۬:Ll/ۡ۠;

    if-eq v4, v5, :cond_1f

    iget v4, v1, Ll/ۧ۠;->֫:F

    cmpg-float v2, v4, v2

    if-ltz v2, :cond_20

    goto :goto_10

    :cond_1e
    const/4 v3, 0x0

    :cond_1f
    :goto_10
    if-nez v3, :cond_20

    .line 634
    invoke-direct/range {p0 .. p1}, Ll/ܿ۠;->ۧ(Ll/ۧ۠;)V

    :cond_20
    :goto_11
    return-void
.end method

.method public final ֫(Ll/ܺ۠;I)V
    .locals 3

    .line 1377
    iget v0, p1, Ll/ܺ۠;->ۧ:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    int-to-float p2, p2

    .line 1381
    invoke-virtual {p1, p0, p2}, Ll/ܺ۠;->֫(Ll/ܿ۠;F)V

    const/4 p1, 0x0

    .line 1382
    :goto_0
    iget p2, p0, Ll/ܿ۠;->ۘ:I

    add-int/2addr p2, v1

    if-ge p1, p2, :cond_0

    .line 1383
    iget-object p2, p0, Ll/ܿ۠;->ᩳ:Ll/ܽ۠;

    iget-object p2, p2, Ll/ܽ۠;->ۧ:[Ll/ܺ۠;

    aget-object p2, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    if-eq v0, v2, :cond_5

    .line 1395
    iget-object v2, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    aget-object v0, v2, v0

    .line 1396
    iget-boolean v2, v0, Ll/ۧ۠;->ۧ:Z

    if-eqz v2, :cond_2

    int-to-float p1, p2

    .line 1397
    iput p1, v0, Ll/ۧ۠;->֫:F

    return-void

    .line 1399
    :cond_2
    iget-object v2, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v2}, Ll/֫۠;->ۧ()I

    move-result v2

    if-nez v2, :cond_3

    .line 1400
    iput-boolean v1, v0, Ll/ۧ۠;->ۧ:Z

    int-to-float p1, p2

    .line 1401
    iput p1, v0, Ll/ۧ۠;->֫:F

    return-void

    .line 1403
    :cond_3
    invoke-virtual {p0}, Ll/ܿ۠;->֫()Ll/ۧ۠;

    move-result-object v0

    if-gez p2, :cond_4

    mul-int/lit8 p2, p2, -0x1

    int-to-float p2, p2

    .line 148
    iput p2, v0, Ll/ۧ۠;->֫:F

    .line 149
    iget-object p2, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-interface {p2, p1, v1}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    goto :goto_1

    :cond_4
    int-to-float p2, p2

    .line 151
    iput p2, v0, Ll/ۧ۠;->֫:F

    .line 152
    iget-object p2, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-interface {p2, p1, v1}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 1405
    :goto_1
    invoke-virtual {p0, v0}, Ll/ܿ۠;->֫(Ll/ۧ۠;)V

    return-void

    .line 1409
    :cond_5
    invoke-virtual {p0}, Ll/ܿ۠;->֫()Ll/ۧ۠;

    move-result-object v0

    .line 139
    iput-object p1, v0, Ll/ۧ۠;->ܽ:Ll/ܺ۠;

    int-to-float p2, p2

    .line 140
    iput p2, p1, Ll/ܺ۠;->֫:F

    .line 141
    iput p2, v0, Ll/ۧ۠;->֫:F

    .line 142
    iput-boolean v1, v0, Ll/ۧ۠;->ۧ:Z

    .line 1411
    invoke-virtual {p0, v0}, Ll/ܿ۠;->֫(Ll/ۧ۠;)V

    return-void
.end method

.method public final ֫(Ll/ܺ۠;Ll/ܺ۠;IFLl/ܺ۠;Ll/ܺ۠;II)V
    .locals 6

    .line 1288
    invoke-virtual {p0}, Ll/ܿ۠;->֫()Ll/ۧ۠;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-ne p2, p5, :cond_0

    .line 307
    iget-object p3, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p3, p1, v1}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 308
    iget-object p1, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p1, p6, v1}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 309
    iget-object p1, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    const/high16 p3, -0x40000000    # -2.0f

    invoke-interface {p1, p2, p3}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    goto/16 :goto_0

    :cond_0
    const/high16 v2, 0x3f000000    # 0.5f

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v2, p4, v2

    if-nez v2, :cond_2

    .line 319
    iget-object p4, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p4, p1, v1}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 320
    iget-object p1, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p1, p2, v3}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 321
    iget-object p1, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p1, p5, v3}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 322
    iget-object p1, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p1, p6, v1}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    if-gtz p3, :cond_1

    if-lez p7, :cond_6

    :cond_1
    neg-int p1, p3

    add-int/2addr p1, p7

    int-to-float p1, p1

    .line 324
    iput p1, v0, Ll/ۧ۠;->֫:F

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    cmpg-float v2, p4, v2

    if-gtz v2, :cond_3

    .line 328
    iget-object p4, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p4, p1, v3}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 329
    iget-object p1, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p1, p2, v1}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    int-to-float p1, p3

    .line 330
    iput p1, v0, Ll/ۧ۠;->֫:F

    goto :goto_0

    :cond_3
    cmpl-float v2, p4, v1

    if-ltz v2, :cond_4

    .line 333
    iget-object p1, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p1, p6, v3}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 334
    iget-object p1, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p1, p5, v1}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    neg-int p1, p7

    int-to-float p1, p1

    .line 335
    iput p1, v0, Ll/ۧ۠;->֫:F

    goto :goto_0

    .line 337
    :cond_4
    iget-object v2, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    sub-float v4, v1, p4

    mul-float v5, v4, v1

    invoke-interface {v2, p1, v5}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 338
    iget-object p1, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    mul-float v2, v4, v3

    invoke-interface {p1, p2, v2}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 339
    iget-object p1, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    mul-float v3, v3, p4

    invoke-interface {p1, p5, v3}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 340
    iget-object p1, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    mul-float v1, v1, p4

    invoke-interface {p1, p6, v1}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    if-gtz p3, :cond_5

    if-lez p7, :cond_6

    :cond_5
    neg-int p1, p3

    int-to-float p1, p1

    mul-float p1, p1, v4

    int-to-float p2, p7

    mul-float p2, p2, p4

    add-float/2addr p2, p1

    .line 342
    iput p2, v0, Ll/ۧ۠;->֫:F

    :cond_6
    :goto_0
    const/16 p1, 0x8

    if-eq p8, p1, :cond_7

    .line 1291
    invoke-virtual {v0, p0, p8}, Ll/ۧ۠;->֫(Ll/ܿ۠;I)V

    .line 1293
    :cond_7
    invoke-virtual {p0, v0}, Ll/ܿ۠;->֫(Ll/ۧ۠;)V

    return-void
.end method

.method public final ֫(Ll/ܺ۠;Ll/ܺ۠;II)V
    .locals 4

    const/16 v0, 0x8

    if-ne p4, v0, :cond_0

    .line 1336
    iget-boolean v1, p2, Ll/ܺ۠;->ܳ:Z

    if-eqz v1, :cond_0

    iget v1, p1, Ll/ܺ۠;->ۧ:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 1340
    iget p2, p2, Ll/ܺ۠;->֫:F

    int-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p0, p2}, Ll/ܺ۠;->֫(Ll/ܿ۠;F)V

    return-void

    .line 1362
    :cond_0
    invoke-virtual {p0}, Ll/ܿ۠;->֫()Ll/ۧ۠;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz p3, :cond_2

    if-gez p3, :cond_1

    mul-int/lit8 p3, p3, -0x1

    const/4 v2, 0x1

    :cond_1
    int-to-float p3, p3

    .line 165
    iput p3, v1, Ll/ۧ۠;->֫:F

    :cond_2
    const/high16 p3, 0x3f800000    # 1.0f

    const/high16 v3, -0x40800000    # -1.0f

    if-nez v2, :cond_3

    .line 168
    iget-object v2, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v2, p1, v3}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 169
    iget-object p1, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p1, p2, p3}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    goto :goto_0

    .line 171
    :cond_3
    iget-object v2, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {v2, p1, p3}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 172
    iget-object p1, v1, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p1, p2, v3}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    :goto_0
    if-eq p4, v0, :cond_4

    .line 1365
    invoke-virtual {v1, p0, p4}, Ll/ۧ۠;->֫(Ll/ܿ۠;I)V

    .line 1367
    :cond_4
    invoke-virtual {p0, v1}, Ll/ܿ۠;->֫(Ll/ۧ۠;)V

    return-void
.end method

.method public final ۧ()Ll/ܺ۠;
    .locals 3

    .line 279
    iget v0, p0, Ll/ܿ۠;->ۜ:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Ll/ܿ۠;->ܳ:I

    if-lt v0, v1, :cond_0

    .line 280
    invoke-direct {p0}, Ll/ܿ۠;->᩻()V

    .line 282
    :cond_0
    sget-object v0, Ll/ۡ۠;->ۙ:Ll/ۡ۠;

    invoke-direct {p0, v0}, Ll/ܿ۠;->֫(Ll/ۡ۠;)Ll/ܺ۠;

    move-result-object v0

    .line 283
    iget v1, p0, Ll/ܿ۠;->ۘ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ܿ۠;->ۘ:I

    .line 284
    iget v2, p0, Ll/ܿ۠;->ۜ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ܿ۠;->ۜ:I

    .line 285
    iput v1, v0, Ll/ܺ۠;->ᩳ:I

    .line 286
    iget-object v2, p0, Ll/ܿ۠;->ᩳ:Ll/ܽ۠;

    iget-object v2, v2, Ll/ܽ۠;->ۧ:[Ll/ܺ۠;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public final ۧ(Ll/ܺ۠;Ll/ܺ۠;II)V
    .locals 3

    .line 1214
    invoke-virtual {p0}, Ll/ܿ۠;->֫()Ll/ۧ۠;

    move-result-object v0

    .line 1215
    invoke-virtual {p0}, Ll/ܿ۠;->ۧ()Ll/ܺ۠;

    move-result-object v1

    const/4 v2, 0x0

    .line 1216
    iput v2, v1, Ll/ܺ۠;->ۢ:I

    .line 1217
    invoke-virtual {v0, p1, p2, v1, p3}, Ll/ۧ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;Ll/ܺ۠;I)V

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    .line 1219
    iget-object p1, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p1, v1}, Ll/֫۠;->֫(Ll/ܺ۠;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    .line 323
    invoke-virtual {p0, p4}, Ll/ܿ۠;->֫(I)Ll/ܺ۠;

    move-result-object p2

    .line 178
    iget-object p3, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    int-to-float p1, p1

    invoke-interface {p3, p2, p1}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 1222
    :cond_0
    invoke-virtual {p0, v0}, Ll/ܿ۠;->֫(Ll/ۧ۠;)V

    return-void
.end method

.method public final ܽ()Ll/ܽ۠;
    .locals 1

    .line 1171
    iget-object v0, p0, Ll/ܿ۠;->ᩳ:Ll/ܽ۠;

    return-object v0
.end method

.method public final ܽ(Ll/ܺ۠;Ll/ܺ۠;II)V
    .locals 3

    .line 1247
    invoke-virtual {p0}, Ll/ܿ۠;->֫()Ll/ۧ۠;

    move-result-object v0

    .line 1248
    invoke-virtual {p0}, Ll/ܿ۠;->ۧ()Ll/ܺ۠;

    move-result-object v1

    const/4 v2, 0x0

    .line 1249
    iput v2, v1, Ll/ܺ۠;->ۢ:I

    .line 1250
    invoke-virtual {v0, p1, p2, v1, p3}, Ll/ۧ۠;->ۧ(Ll/ܺ۠;Ll/ܺ۠;Ll/ܺ۠;I)V

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    .line 1252
    iget-object p1, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    invoke-interface {p1, v1}, Ll/֫۠;->֫(Ll/ܺ۠;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    .line 323
    invoke-virtual {p0, p4}, Ll/ܿ۠;->֫(I)Ll/ܺ۠;

    move-result-object p2

    .line 178
    iget-object p3, v0, Ll/ۧ۠;->ᩳ:Ll/֫۠;

    int-to-float p1, p1

    invoke-interface {p3, p2, p1}, Ll/֫۠;->֫(Ll/ܺ۠;F)V

    .line 1255
    :cond_0
    invoke-virtual {p0, v0}, Ll/ܿ۠;->֫(Ll/ۧ۠;)V

    return-void
.end method

.method public final ܿ()V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 185
    :goto_0
    iget-object v2, p0, Ll/ܿ۠;->ᩳ:Ll/ܽ۠;

    iget-object v3, v2, Ll/ܽ۠;->ۧ:[Ll/ܺ۠;

    array-length v4, v3

    if-ge v1, v4, :cond_1

    .line 186
    aget-object v2, v3, v1

    if-eqz v2, :cond_0

    .line 188
    invoke-virtual {v2}, Ll/ܺ۠;->֫()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 191
    :cond_1
    iget-object v1, v2, Ll/ܽ۠;->ܽ:Ll/᩻۠;

    iget-object v3, p0, Ll/ܿ۠;->ۢ:[Ll/ܺ۠;

    iget v4, p0, Ll/ܿ۠;->ۡ:I

    invoke-virtual {v1, v4, v3}, Ll/᩻۠;->֫(I[Ljava/lang/Object;)V

    .line 192
    iput v0, p0, Ll/ܿ۠;->ۡ:I

    .line 194
    iget-object v1, v2, Ll/ܽ۠;->ۧ:[Ll/ܺ۠;

    const/4 v3, 0x0

    invoke-static {v1, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 198
    iput v0, p0, Ll/ܿ۠;->ۘ:I

    .line 199
    iget-object v1, p0, Ll/ܿ۠;->ܿ:Ll/ۢ۠;

    invoke-virtual {v1}, Ll/ۢ۠;->ۧ()V

    const/4 v1, 0x1

    .line 200
    iput v1, p0, Ll/ܿ۠;->ۜ:I

    const/4 v1, 0x0

    .line 201
    :goto_1
    iget v3, p0, Ll/ܿ۠;->᩷:I

    if-ge v1, v3, :cond_2

    .line 202
    iget-object v3, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    aget-object v3, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 206
    :cond_2
    invoke-direct {p0}, Ll/ܿ۠;->ۜ()V

    .line 207
    iput v0, p0, Ll/ܿ۠;->᩷:I

    .line 211
    new-instance v0, Ll/ۧ۠;

    invoke-direct {v0, v2}, Ll/ۧ۠;-><init>(Ll/ܽ۠;)V

    iput-object v0, p0, Ll/ܿ۠;->ۖ:Ll/ۧ۠;

    return-void
.end method

.method public final ᩳ()V
    .locals 3

    .line 451
    iget-object v0, p0, Ll/ܿ۠;->ܿ:Ll/ۢ۠;

    invoke-virtual {v0}, Ll/ۢ۠;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 455
    invoke-direct {p0}, Ll/ܿ۠;->ܳ()V

    return-void

    .line 461
    :cond_0
    iget-boolean v1, p0, Ll/ܿ۠;->ᩴ:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    .line 466
    :goto_0
    iget v2, p0, Ll/ܿ۠;->᩷:I

    if-ge v1, v2, :cond_2

    .line 467
    iget-object v2, p0, Ll/ܿ۠;->ܺ:[Ll/ۧ۠;

    aget-object v2, v2, v1

    .line 468
    iget-boolean v2, v2, Ll/ۧ۠;->ۧ:Z

    if-nez v2, :cond_1

    .line 474
    invoke-virtual {p0, v0}, Ll/ܿ۠;->֫(Ll/ۢ۠;)V

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 479
    :cond_2
    invoke-direct {p0}, Ll/ܿ۠;->ܳ()V

    return-void

    .line 482
    :cond_3
    invoke-virtual {p0, v0}, Ll/ܿ۠;->֫(Ll/ۢ۠;)V

    return-void
.end method
