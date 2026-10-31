.class public final Ll/ܰ۫ۚ;
.super Ll/۫ۨۚ;
.source "FBFP"


# instance fields
.field public ֡:Ll/ܽۨۚ;

.field public ֨:Ljava/util/ArrayList;

.field public ۖ:Ll/ۛ۫ۚ;

.field public ۗ:Ljava/lang/String;

.field public ۘ:Ll/᩹۬ۚ;

.field public ۙ:Ll/ۚ᩺ۚ;

.field public final ۚ:Ll/ۘۨۚ;

.field public ۛ:Ll/֫۟ۚ;

.field public ۠:Ljava/lang/String;

.field public ۤ:Ll/᩺ܰۚ;

.field public ۨ:Ll/ۢ۟ۚ;

.field public ۫:Ll/۠᩺ۚ;

.field public ۬:Ll/᩵۫ۚ;

.field public ܶ:Ll/۟ۛۚ;

.field public ܺ:Ll/۟ۛۚ;

.field public ᩴ:Ll/᩺۫ۚ;

.field public ᩵:Ll/ۨۨۚ;

.field public ᩶:Ljava/util/ArrayList;

.field public ᩸:Ljava/util/ArrayList;

.field public ᩹:Ll/ۙۨۚ;

.field public ᩺:Ll/ۜ۫ۚ;


# direct methods
.method public constructor <init>(Ll/ۘۨۚ;Ll/᩹۬ۚ;)V
    .locals 3

    .line 94
    new-instance v0, Ll/ۗۛۚ;

    invoke-direct {v0, p1}, Ll/ۗۛۚ;-><init>(Ll/ۘۨۚ;)V

    const/4 v1, 0x0

    .line 53
    invoke-direct {p0, v0, p1, v1}, Ll/۫ۨۚ;-><init>(Ll/ۗۛۚ;Ll/᩶ۗۚ;I)V

    const-string v0, ".class"

    .line 61
    iput-object v0, p0, Ll/ܰ۫ۚ;->۠:Ljava/lang/String;

    .line 66
    new-instance v0, Ll/᩺۫ۚ;

    .line 715
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 728
    new-instance v1, Ll/ۜۗۚ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Ll/ۜۗۚ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v1, v0, Ll/᩺۫ۚ;->ܽ:Ll/ۜۗۚ;

    .line 735
    new-instance v1, Ll/ۜۗۚ;

    invoke-direct {v1, v2, v2}, Ll/ۜۗۚ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v1, v0, Ll/᩺۫ۚ;->֫:Ll/ۜۗۚ;

    .line 66
    iput-object v0, p0, Ll/ܰ۫ۚ;->ᩴ:Ll/᩺۫ۚ;

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰ۫ۚ;->֨:Ljava/util/ArrayList;

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰ۫ۚ;->᩶:Ljava/util/ArrayList;

    .line 72
    iput-object v2, p0, Ll/ܰ۫ۚ;->ܶ:Ll/۟ۛۚ;

    .line 73
    iput-object v2, p0, Ll/ܰ۫ۚ;->ܺ:Ll/۟ۛۚ;

    .line 78
    iput-object v2, p0, Ll/ܰ۫ۚ;->ۙ:Ll/ۚ᩺ۚ;

    .line 95
    sget-object v0, Ll/ۗ۬ۚ;->᩶:Ll/ۗ۬ۚ;

    iput-object v0, p0, Ll/۫ۨۚ;->ᩳ:Ll/ۗ۬ۚ;

    .line 96
    iput-object p1, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    .line 97
    new-instance p1, Ll/ۛ۫ۚ;

    invoke-direct {p1}, Ll/ۛ۫ۚ;-><init>()V

    iput-object p1, p0, Ll/ܰ۫ۚ;->ۖ:Ll/ۛ۫ۚ;

    .line 98
    iput-object p2, p0, Ll/ܰ۫ۚ;->ۘ:Ll/᩹۬ۚ;

    return-void
.end method

.method public static ֫(Ljava/util/Collection;Ll/ۢ۫ۚ;)I
    .locals 2

    .line 197
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 198
    new-instance v0, Ll/۠۫ۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, v0}, Ll/ۚ۬ᩴ;->toArray(Ljava/util/Collection;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll/ۢ۫ۚ;

    const/4 v0, 0x0

    .line 199
    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_1

    .line 200
    aget-object v1, p0, v0

    invoke-virtual {p1, v1}, Ll/ۢ۫ۚ;->֫(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method private varargs ֫([Ll/ۜ۫ۚ;)V
    .locals 4

    .line 440
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    if-eqz v2, :cond_1

    .line 442
    instance-of v3, v2, Ll/۟ۛۚ;

    if-eqz v3, :cond_0

    .line 443
    check-cast v2, Ll/۟ۛۚ;

    invoke-virtual {v2}, Ll/۟ۛۚ;->getElements()Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v2}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v3, Ll/۫۫ۚ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 444
    invoke-interface {v2, v3}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v3, Ll/֨۫ۚ;

    invoke-direct {v3, p0}, Ll/֨۫ۚ;-><init>(Ll/ܰ۫ۚ;)V

    invoke-interface {v2, v3}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    goto :goto_1

    .line 446
    :cond_0
    iget-object v3, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    invoke-virtual {v2, v3}, Ll/ۜ۫ۚ;->֫(Ll/ۗۛۚ;)Ll/֫ۨۚ;

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private ܳ()V
    .locals 8

    .line 453
    iget-object v0, p0, Ll/ܰ۫ۚ;->ܶ:Ll/۟ۛۚ;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    if-eqz v0, :cond_1

    .line 455
    invoke-virtual {v0}, Ll/۟ۛۚ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۨۚ;

    .line 456
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, " InnerClass["

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v6, v3, 0x1

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "]: ("

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v4, Ll/᩷ۨۚ;->᩸:I

    sget-object v7, Ll/᩶۬ۚ;->ۤ:Ll/᩶۬ۚ;

    invoke-static {v3, v7}, Ll/ۛ۬ۚ;->ۧ(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "), "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v5}, Ll/᩶ۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Name:  "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v4, Ll/᩷ۨۚ;->᩶:Ll/ܺۤۚ;

    invoke-virtual {v5}, Ll/ܺۤۚ;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v7}, Ll/᩶ۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 458
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "InnerClass_info:  "

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v4, Ll/᩷ۨۚ;->᩹:Ll/ܺۤۚ;

    invoke-virtual {v7}, Ll/ܺۤۚ;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v7}, Ll/᩶ۗۚ;->ܽ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "OuterClass_info:  "

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v4, Ll/᩷ۨۚ;->ۙ:Ll/ܺۤۚ;

    invoke-virtual {v4}, Ll/ܺۤۚ;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    move v3, v6

    goto/16 :goto_0

    :cond_0
    return-void

    :cond_1
    const-string v0, "<< NO INNER CLASSES >>"

    new-array v1, v1, [Ljava/lang/Object;

    .line 462
    invoke-virtual {v2, v0, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫(J)Ll/֫۟ۚ;
    .locals 3

    .line 255
    sget-object v0, Ll/ۙ۬ۚ;->ۖ֫:Ll/ۙ۬ۚ;

    .line 81
    invoke-virtual {p0, v0}, Ll/ܰ۫ۚ;->֫(Ll/ۙ۬ۚ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 255
    iget-object v1, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    const-string v2, "Record attribute repeated"

    invoke-virtual {v1, p1, p2, v2, v0}, Ll/ۘۨۚ;->ۧ(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 256
    :cond_0
    new-instance p1, Ll/֫۟ۚ;

    invoke-direct {p1, p0}, Ll/֫۟ۚ;-><init>(Ll/ܰ۫ۚ;)V

    iput-object p1, p0, Ll/ܰ۫ۚ;->ۛ:Ll/֫۟ۚ;

    return-object p1
.end method

.method public final ֫(ILl/ܺۤۚ;Ll/ܺۤۚ;)Ll/ۨۨۚ;
    .locals 4

    const/4 v0, 0x0

    .line 316
    iput-object v0, p0, Ll/ܰ۫ۚ;->᩵:Ll/ۨۨۚ;

    .line 309
    new-instance v1, Ll/ۚ۫ۚ;

    invoke-direct {v1, p2, p3}, Ll/ۚ۫ۚ;-><init>(Ll/ܺۤۚ;Ll/ܺۤۚ;)V

    iget-object v2, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    invoke-virtual {v2, v1}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    .line 310
    new-instance v1, Ll/ۨۨۚ;

    .line 142
    invoke-virtual {p0}, Ll/۫ۨۚ;->ۧ()Ll/᩶ۗۚ;

    move-result-object v2

    check-cast v2, Ll/ۘۨۚ;

    iget-object v3, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    invoke-direct {v1, v3, v2, p1}, Ll/۫ۨۚ;-><init>(Ll/ۗۛۚ;Ll/᩶ۗۚ;I)V

    .line 135
    iput-object v0, v1, Ll/ۨۨۚ;->ᩴ:Ll/۟ۛۚ;

    .line 136
    iput-object v0, v1, Ll/ۨۨۚ;->᩵:Ll/۟ۛۚ;

    .line 137
    iput-object v0, v1, Ll/ۨۨۚ;->֨:Ll/ۤۨۚ;

    .line 138
    iput-object v0, v1, Ll/ۨۨۚ;->ۚ:Ll/ۤۨۚ;

    .line 139
    iput-object v0, v1, Ll/ۨۨۚ;->ۘ:Ll/ۧۨۚ;

    .line 143
    iput-object p0, v1, Ll/ۨۨۚ;->ܺ:Ll/ܰ۫ۚ;

    .line 144
    sget-object v0, Ll/ۗ۬ۚ;->۬:Ll/ۗ۬ۚ;

    iput-object v0, v1, Ll/۫ۨۚ;->ᩳ:Ll/ۗ۬ۚ;

    .line 146
    iput-object p2, v1, Ll/ۨۨۚ;->֡:Ll/ܺۤۚ;

    .line 147
    iput-object p3, v1, Ll/ۨۨۚ;->۠:Ll/ܺۤۚ;

    .line 149
    invoke-static {p1}, Ll/ۛ۬ۚ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 150
    invoke-virtual {v1}, Ll/۫ۨۚ;->֫()V

    .line 310
    :cond_0
    iput-object v1, p0, Ll/ܰ۫ۚ;->᩵:Ll/ۨۨۚ;

    .line 311
    iget-object p1, p0, Ll/ܰ۫ۚ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    iget-object p1, p0, Ll/ܰ۫ۚ;->᩵:Ll/ۨۨۚ;

    return-object p1
.end method

.method public final ֫(ILl/᩷ۛۚ;)Ll/ܳۨۚ;
    .locals 2

    .line 295
    new-instance v0, Ll/ۗ۫ۚ;

    invoke-direct {v0, p2}, Ll/ۗ۫ۚ;-><init>(Ll/᩷ۛۚ;)V

    iget-object v1, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    invoke-virtual {v1, v0}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    .line 298
    new-instance v0, Ll/ܳۨۚ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܳۨۚ;-><init>(Ll/ܰ۫ۚ;ILl/᩷ۛۚ;)V

    .line 299
    iget-object p1, p0, Ll/ܰ۫ۚ;->֨:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final ֫(ILl/ܺۤۚ;Ll/ܺۤۚ;Ll/ܺۤۚ;)V
    .locals 3

    .line 331
    new-instance v0, Ll/ۙ۫ۚ;

    invoke-direct {v0, p2, p3, p4}, Ll/ۙ۫ۚ;-><init>(Ll/ܺۤۚ;Ll/ܺۤۚ;Ll/ܺۤۚ;)V

    iget-object v1, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    invoke-virtual {v1, v0}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    .line 333
    iget-object v0, p0, Ll/ܰ۫ۚ;->ܶ:Ll/۟ۛۚ;

    if-nez v0, :cond_0

    .line 334
    new-instance v0, Ll/۟ۛۚ;

    iget-object v1, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    sget-object v2, Ll/ۙ۬ۚ;->۟:Ll/ۙ۬ۚ;

    invoke-direct {v0, v1, v2}, Ll/۟ۛۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    iput-object v0, p0, Ll/ܰ۫ۚ;->ܶ:Ll/۟ۛۚ;

    .line 336
    :cond_0
    iget-object v0, p0, Ll/ܰ۫ۚ;->ܶ:Ll/۟ۛۚ;

    new-instance v1, Ll/᩷ۨۚ;

    .line 35
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 36
    iput p1, v1, Ll/᩷ۨۚ;->᩸:I

    .line 37
    iput-object p2, v1, Ll/᩷ۨۚ;->᩶:Ll/ܺۤۚ;

    .line 38
    iput-object p3, v1, Ll/᩷ۨۚ;->᩹:Ll/ܺۤۚ;

    .line 39
    iput-object p4, v1, Ll/᩷ۨۚ;->ۙ:Ll/ܺۤۚ;

    .line 336
    invoke-virtual {v0, v1}, Ll/۟ۛۚ;->֫(Ll/֫ۨۚ;)V

    return-void
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 27

    move-object/from16 v0, p0

    .line 468
    move-object/from16 v1, p1

    check-cast v1, Ll/ۛ۫ۚ;

    const v2, -0x35014542    # -8346975.0f

    invoke-virtual {v1, v2}, Ll/ۛ۫ۚ;->ۧ(I)V

    .line 469
    iget-object v2, v0, Ll/ܰ۫ۚ;->ۘ:Ll/᩹۬ۚ;

    invoke-virtual {v2}, Ll/᩹۬ۚ;->ۜ()I

    move-result v3

    invoke-virtual {v1, v3}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 470
    invoke-virtual {v2}, Ll/᩹۬ۚ;->᩻()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 472
    iget-object v2, v0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    invoke-virtual {v2, v1}, Ll/ۗۛۚ;->֫(Ll/֡۫ۚ;)V

    .line 473
    iget v2, v0, Ll/۫ۨۚ;->֫:I

    invoke-virtual {v1, v2}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 474
    iget-object v2, v0, Ll/ܰ۫ۚ;->ᩴ:Ll/᩺۫ۚ;

    invoke-virtual {v2}, Ll/᩺۫ۚ;->ܽ()Ll/ܺۤۚ;

    move-result-object v3

    iget v3, v3, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {v1, v3}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 475
    invoke-virtual {v2}, Ll/᩺۫ۚ;->ۧ()Ll/ܺۤۚ;

    move-result-object v2

    iget v2, v2, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {v1, v2}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 478
    iget-object v2, v0, Ll/ܰ۫ۚ;->᩸:Ljava/util/ArrayList;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 479
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 480
    iget-object v2, v0, Ll/ܰ۫ۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۜۨۚ;

    .line 481
    iget v4, v4, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {v1, v4}, Ll/ۛ۫ۚ;->ܽ(I)V

    goto :goto_0

    .line 484
    :cond_0
    invoke-virtual {v1, v3}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 488
    :cond_1
    iget-object v2, v0, Ll/ܰ۫ۚ;->֨:Ljava/util/ArrayList;

    if-eqz v2, :cond_2

    .line 489
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v1, v4}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 490
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳۨۚ;

    .line 491
    invoke-virtual {v4, v1}, Ll/ܳۨۚ;->֫(Ll/֡۫ۚ;)V

    goto :goto_1

    .line 494
    :cond_2
    invoke-virtual {v1, v3}, Ll/ۛ۫ۚ;->ܽ(I)V

    :cond_3
    const/4 v2, 0x7

    const/4 v4, 0x3

    const/4 v5, 0x1

    .line 498
    iget-object v6, v0, Ll/ܰ۫ۚ;->᩶:Ljava/util/ArrayList;

    if-eqz v6, :cond_7

    .line 499
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-virtual {v1, v7}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 500
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۨۨۚ;

    .line 234
    iget v8, v7, Ll/۫ۨۚ;->֫:I

    invoke-virtual {v1, v8}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 235
    iget-object v8, v7, Ll/ۨۨۚ;->֡:Ll/ܺۤۚ;

    iget v8, v8, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {v1, v8}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 236
    iget-object v8, v7, Ll/ۨۨۚ;->۠:Ll/ܺۤۚ;

    iget v8, v8, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {v1, v8}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 223
    iget-object v8, v7, Ll/ۨۨۚ;->ᩴ:Ll/۟ۛۚ;

    iget-object v9, v7, Ll/۫ۨۚ;->᩷:Ll/ۜ۫ۚ;

    iget-object v10, v7, Ll/۫ۨۚ;->ܿ:Ll/ۜ۫ۚ;

    iget-object v11, v7, Ll/۫ۨۚ;->ۜ:Ll/᩵۫ۚ;

    iget-object v13, v7, Ll/ۨۨۚ;->᩵:Ll/۟ۛۚ;

    iget-object v15, v7, Ll/ۨۨۚ;->ۖ:Ll/ۡۤۚ;

    const/16 v16, 0x4

    iget-object v12, v7, Ll/ۨۨۚ;->ۘ:Ll/ۧۨۚ;

    const/16 v17, 0x2

    new-array v14, v2, [Ll/ۜ۫ۚ;

    aput-object v8, v14, v3

    aput-object v9, v14, v5

    aput-object v10, v14, v17

    aput-object v11, v14, v4

    aput-object v13, v14, v16

    const/4 v8, 0x5

    aput-object v15, v14, v8

    const/4 v8, 0x6

    aput-object v12, v14, v8

    invoke-virtual {v7, v14}, Ll/۫ۨۚ;->֫([Ll/֫ۨۚ;)Ll/ۛۛۚ;

    move-result-object v8

    .line 224
    iget-object v9, v7, Ll/ۨۨۚ;->֨:Ll/ۤۨۚ;

    if-eqz v9, :cond_4

    .line 225
    invoke-virtual {v8, v9}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    .line 227
    :cond_4
    iget-object v7, v7, Ll/ۨۨۚ;->ۚ:Ll/ۤۨۚ;

    if-eqz v7, :cond_5

    .line 228
    invoke-virtual {v8, v7}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    .line 237
    :cond_5
    invoke-virtual {v8, v1}, Ll/ۛۛۚ;->֫(Ll/֡۫ۚ;)V

    goto :goto_2

    :cond_6
    const/4 v2, 0x6

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x2

    goto :goto_3

    :cond_7
    const/4 v2, 0x6

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x2

    .line 504
    invoke-virtual {v1, v3}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 514
    :goto_3
    iget-object v9, v0, Ll/ܰ۫ۚ;->ۙ:Ll/ۚ᩺ۚ;

    if-eqz v9, :cond_a

    .line 515
    iget-object v2, v0, Ll/۫ۨۚ;->ܽ:Ll/۟ۛۚ;

    iget-object v6, v0, Ll/۫ۨۚ;->ۧ:Ll/۟ۛۚ;

    new-array v7, v4, [Ll/ۜ۫ۚ;

    aput-object v2, v7, v3

    aput-object v6, v7, v5

    aput-object v9, v7, v8

    .line 534
    new-instance v2, Ll/ۛۛۚ;

    invoke-direct {v2}, Ll/ۛۛۚ;-><init>()V

    :goto_4
    if-ge v3, v4, :cond_9

    .line 535
    aget-object v5, v7, v3

    if-eqz v5, :cond_8

    .line 537
    invoke-virtual {v2, v5}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_9
    move-object v0, v1

    goto/16 :goto_6

    .line 517
    :cond_a
    iget-object v3, v0, Ll/ܰ۫ۚ;->᩺:Ll/ۜ۫ۚ;

    iget-object v4, v0, Ll/ܰ۫ۚ;->ۨ:Ll/ۢ۟ۚ;

    iget-object v5, v0, Ll/ܰ۫ۚ;->ۛ:Ll/֫۟ۚ;

    iget-object v9, v0, Ll/ܰ۫ۚ;->ܶ:Ll/۟ۛۚ;

    iget-object v10, v0, Ll/۫ۨۚ;->᩷:Ll/ۜ۫ۚ;

    iget-object v11, v0, Ll/۫ۨۚ;->ܿ:Ll/ۜ۫ۚ;

    iget-object v12, v0, Ll/۫ۨۚ;->ۜ:Ll/᩵۫ۚ;

    iget-object v13, v0, Ll/۫ۨۚ;->ܽ:Ll/۟ۛۚ;

    iget-object v14, v0, Ll/۫ۨۚ;->ۧ:Ll/۟ۛۚ;

    iget-object v15, v0, Ll/۫ۨۚ;->ۡ:Ll/۟ۛۚ;

    const/16 v16, 0x0

    move-object/from16 p1, v1

    iget-object v1, v0, Ll/۫ۨۚ;->ۢ:Ll/۟ۛۚ;

    const/16 v17, 0x7

    move-object/from16 v18, v1

    iget-object v1, v0, Ll/ܰ۫ۚ;->ܺ:Ll/۟ۛۚ;

    const/16 v19, 0x3

    move-object/from16 v20, v1

    iget-object v1, v0, Ll/ܰ۫ۚ;->۬:Ll/᩵۫ۚ;

    const/16 v21, 0x1

    move-object/from16 v22, v1

    iget-object v1, v0, Ll/ܰ۫ۚ;->۫:Ll/۠᩺ۚ;

    move-object/from16 v23, v1

    iget-object v1, v0, Ll/ܰ۫ۚ;->ۤ:Ll/᩺ܰۚ;

    move-object/from16 v24, v1

    iget-object v1, v0, Ll/ܰ۫ۚ;->֡:Ll/ܽۨۚ;

    move-object/from16 v25, v1

    iget-object v1, v0, Ll/ܰ۫ۚ;->᩹:Ll/ۙۨۚ;

    const/16 v0, 0x11

    move-object/from16 v26, v1

    new-array v1, v0, [Ll/ۜ۫ۚ;

    aput-object v3, v1, v16

    aput-object v4, v1, v21

    aput-object v5, v1, v8

    aput-object v9, v1, v19

    aput-object v10, v1, v7

    aput-object v11, v1, v6

    aput-object v12, v1, v2

    aput-object v13, v1, v17

    const/16 v2, 0x8

    aput-object v14, v1, v2

    const/16 v2, 0x9

    aput-object v15, v1, v2

    const/16 v2, 0xa

    aput-object v18, v1, v2

    const/16 v2, 0xb

    aput-object v20, v1, v2

    const/16 v2, 0xc

    aput-object v22, v1, v2

    const/16 v2, 0xd

    aput-object v23, v1, v2

    const/16 v2, 0xe

    aput-object v24, v1, v2

    const/16 v2, 0xf

    aput-object v25, v1, v2

    const/16 v2, 0x10

    aput-object v26, v1, v2

    .line 534
    new-instance v2, Ll/ۛۛۚ;

    invoke-direct {v2}, Ll/ۛۛۚ;-><init>()V

    const/4 v3, 0x0

    :goto_5
    if-ge v3, v0, :cond_c

    .line 535
    aget-object v4, v1, v3

    if-eqz v4, :cond_b

    .line 537
    invoke-virtual {v2, v4}, Ll/ۛۛۚ;->֫(Ll/֫ۨۚ;)V

    :cond_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_c
    move-object/from16 v0, p1

    .line 509
    :goto_6
    invoke-virtual {v2, v0}, Ll/ۛۛۚ;->֫(Ll/֡۫ۚ;)V

    return-void
.end method

.method public final ֫(Ll/֨۬ۚ;)V
    .locals 6

    .line 547
    iget-object v0, p0, Ll/ܰ۫ۚ;->ۖ:Ll/ۛ۫ۚ;

    :try_start_0
    invoke-interface {p1}, Ll/֨۬ۚ;->֫()Ljava/io/DataOutputStream;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 548
    :try_start_1
    invoke-virtual {v0, v1}, Ll/ۛ۫ۚ;->֫(Ljava/io/DataOutputStream;)V

    .line 549
    invoke-virtual {p0, v0}, Ll/ܰ۫ۚ;->֫(Ll/֡۫ۚ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_0

    .line 550
    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_1

    .line 547
    :try_start_3
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    .line 551
    instance-of v1, p1, Ll/ۘ۬ۚ;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string v4, "Cannot write to {0}"

    iget-object v5, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    if-eqz v1, :cond_2

    check-cast p1, Ll/ۘ۬ۚ;

    .line 552
    invoke-virtual {p1}, Ll/ۘ۬ۚ;->ۧ()Ljava/lang/String;

    move-result-object p1

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p1, v1, v2

    invoke-virtual {v5, v4, v1}, Ll/ۘۨۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-array p1, v3, [Ljava/lang/Object;

    const-string v1, "output stream"

    aput-object v1, p1, v2

    .line 554
    invoke-virtual {v5, v4, p1}, Ll/ۘۨۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 556
    :goto_1
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public final ֫(Ll/ۙ۬ۚ;J)V
    .locals 3

    .line 81
    invoke-virtual {p0, p1}, Ll/ܰ۫ۚ;->֫(Ll/ۙ۬ۚ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 585
    :cond_0
    invoke-virtual {p1}, Ll/ۙ۬ۚ;->ۧ()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/۫ۨۚ;->ᩳ:Ll/ۗ۬ۚ;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object v0, v1, p1

    .line 584
    iget-object p1, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    const-string v0, "There may be at most one  \"{0}\" attribute in the attributes table of a \"{1}\" structure."

    invoke-virtual {p1, p2, p3, v0, v1}, Ll/ۘۨۚ;->ܽ(JLjava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫(Ll/ۚ᩺ۚ;)V
    .locals 3

    .line 419
    invoke-virtual {p1}, Ll/ۚ᩺ۚ;->ܿ()V

    iput-object p1, p0, Ll/ܰ۫ۚ;->ۙ:Ll/ۚ᩺ۚ;

    const-string p1, "module-info"

    .line 420
    iput-object p1, p0, Ll/ܰ۫ۚ;->ۗ:Ljava/lang/String;

    .line 421
    iget-object v0, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    sget-object v1, Ll/ۧۤۚ;->᩺:Ll/ۧۤۚ;

    invoke-virtual {v0, p1}, Ll/ۗۛۚ;->֫(Ljava/lang/String;)Ll/ܺۤۚ;

    move-result-object p1

    .line 521
    new-instance v2, Ll/ܿۛۚ;

    .line 738
    invoke-direct {v2, v1, p1}, Ll/ۖۤۚ;-><init>(Ll/ۧۤۚ;Ljava/lang/Object;)V

    .line 521
    invoke-virtual {v0, v2}, Ll/ۗۛۚ;->֫(Ll/ۖۤۚ;)Ll/ܺۤۚ;

    move-result-object p1

    .line 421
    iget-object v1, p0, Ll/ܰ۫ۚ;->ᩴ:Ll/᩺۫ۚ;

    invoke-virtual {v1, p1}, Ll/᩺۫ۚ;->֫(Ll/ܺۤۚ;)V

    .line 422
    invoke-virtual {v0}, Ll/ۗۛۚ;->ܳ()V

    .line 423
    invoke-virtual {v1}, Ll/᩺۫ۚ;->ܽ()Ll/ܺۤۚ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۗۛۚ;->ܽ(Ll/ܺۤۚ;)Ll/ܺۤۚ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/᩺۫ۚ;->֫(Ll/ܺۤۚ;)V

    .line 424
    invoke-virtual {v0}, Ll/ۗۛۚ;->ۧ()V

    .line 426
    iget-object p1, p0, Ll/۫ۨۚ;->ۧ:Ll/۟ۛۚ;

    iget-object v0, p0, Ll/۫ۨۚ;->ܽ:Ll/۟ۛۚ;

    const/4 v1, 0x2

    new-array v1, v1, [Ll/۟ۛۚ;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object v0, v1, p1

    invoke-direct {p0, v1}, Ll/ܰ۫ۚ;->֫([Ll/ۜ۫ۚ;)V

    return-void
.end method

.method public final ֫(Ll/ۢ۫ۚ;)V
    .locals 3

    .line 340
    iget-object v0, p0, Ll/ܰ۫ۚ;->ܺ:Ll/۟ۛۚ;

    if-nez v0, :cond_0

    .line 341
    new-instance v0, Ll/۟ۛۚ;

    iget-object v1, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    sget-object v2, Ll/ۙ۬ۚ;->۫:Ll/ۙ۬ۚ;

    invoke-direct {v0, v1, v2}, Ll/۟ۛۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    iput-object v0, p0, Ll/ܰ۫ۚ;->ܺ:Ll/۟ۛۚ;

    .line 343
    :cond_0
    iget-object v0, p0, Ll/ܰ۫ۚ;->ܺ:Ll/۟ۛۚ;

    invoke-virtual {v0, p1}, Ll/۟ۛۚ;->֫(Ll/֫ۨۚ;)V

    .line 344
    new-instance v0, Ll/᩶۫ۚ;

    invoke-direct {v0, p1}, Ll/᩶۫ۚ;-><init>(Ll/ۢ۫ۚ;)V

    iget-object p1, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    invoke-virtual {p1, v0}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    return-void
.end method

.method public final ֫(Ll/ܺۤۚ;Ll/ܺۤۚ;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 368
    iget-object v1, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    const-string v2, "addEnclosingMethod"

    invoke-virtual {v1, v2, v0}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    new-instance v0, Ll/ܽۨۚ;

    iget-object v1, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    invoke-direct {v0, v1, p1, p2}, Ll/ܽۨۚ;-><init>(Ll/ۗۛۚ;Ll/ܺۤۚ;Ll/ܺۤۚ;)V

    iput-object v0, p0, Ll/ܰ۫ۚ;->֡:Ll/ܽۨۚ;

    return-void
.end method

.method public final ֫(Ll/ۙ۬ۚ;)Z
    .locals 4

    .line 566
    sget-object v0, Ll/ۤ۫ۚ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 576
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 578
    invoke-virtual {p1}, Ll/ۙ۬ۚ;->ۧ()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Ll/۫ۨۚ;->ᩳ:Ll/ۗ۬ۚ;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unexpected attribute: "

    const-string v3, " in "

    .line 0
    invoke-static {v2, p1, v3, v1}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 576
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 575
    :pswitch_0
    iget-object p1, p0, Ll/ܰ۫ۚ;->֡:Ll/ܽۨۚ;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 574
    :pswitch_1
    iget-object p1, p0, Ll/ܰ۫ۚ;->ۛ:Ll/֫۟ۚ;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 573
    :pswitch_2
    iget-object p1, p0, Ll/ܰ۫ۚ;->᩹:Ll/ۙۨۚ;

    if-eqz p1, :cond_0

    .line 70
    iget-object p1, p1, Ll/ᩳ۫ۚ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 572
    :pswitch_3
    iget-object p1, p0, Ll/ܰ۫ۚ;->ۤ:Ll/᩺ܰۚ;

    if-eqz p1, :cond_0

    .line 70
    iget-object p1, p1, Ll/ᩳ۫ۚ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 571
    :pswitch_4
    iget-object p1, p0, Ll/ܰ۫ۚ;->۫:Ll/۠᩺ۚ;

    if-eqz p1, :cond_0

    .line 70
    iget-object p1, p1, Ll/ᩳ۫ۚ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 570
    :pswitch_5
    iget-object p1, p0, Ll/ܰ۫ۚ;->۬:Ll/᩵۫ۚ;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 569
    :pswitch_6
    iget-object p1, p0, Ll/ܰ۫ۚ;->ۨ:Ll/ۢ۟ۚ;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 568
    :pswitch_7
    iget-object p1, p0, Ll/ܰ۫ۚ;->᩺:Ll/ۜ۫ۚ;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 567
    :pswitch_8
    iget-object p1, p0, Ll/۫ۨۚ;->ۜ:Ll/᩵۫ۚ;

    if-eqz p1, :cond_0

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۧ(ILl/ܺۤۚ;Ll/ܺۤۚ;)Ll/ܳۨۚ;
    .locals 3

    .line 269
    new-instance v0, Ll/᩷ۛۚ;

    invoke-direct {v0, p2, p3}, Ll/᩷ۛۚ;-><init>(Ll/ܺۤۚ;Ll/ܺۤۚ;)V

    .line 274
    new-instance p2, Ll/᩹۫ۚ;

    invoke-direct {p2, v0}, Ll/᩹۫ۚ;-><init>(Ll/᩷ۛۚ;)V

    iget-object p3, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    invoke-virtual {p3, p2}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    .line 286
    iget-object p2, p0, Ll/ܰ۫ۚ;->֨:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳۨۚ;

    .line 287
    invoke-virtual {v1}, Ll/ܳۨۚ;->ᩳ()Ll/᩷ۛۚ;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll/ܶۛۚ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v1, " [ClassData.addFieldIfAbsent]:  new field."

    .line 279
    invoke-virtual {p3, v1, p2}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    invoke-virtual {p0, p1, v0}, Ll/ܰ۫ۚ;->֫(ILl/᩷ۛۚ;)Ll/ܳۨۚ;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1
.end method

.method public final ۧ(Ljava/util/ArrayList;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 363
    iget-object v1, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    const-string v2, "addLoadableDescriptors"

    invoke-virtual {v1, v2, v0}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    new-instance v0, Ll/ۙۨۚ;

    iget-object v1, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    .line 41
    sget-object v2, Ll/ۙ۬ۚ;->ۧ֫:Ll/ۙ۬ۚ;

    invoke-direct {v0, v1, v2, p1}, Ll/ᩳ۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;Ljava/util/List;)V

    .line 364
    iput-object v0, p0, Ll/ܰ۫ۚ;->᩹:Ll/ۙۨۚ;

    return-void
.end method

.method public final ۧ(Ll/ܺۤۚ;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 348
    iget-object v1, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    const-string v2, "addNestHost"

    invoke-virtual {v1, v2, v0}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    new-instance v0, Ll/᩵۫ۚ;

    iget-object v1, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    sget-object v2, Ll/ۙ۬ۚ;->ۢ֫:Ll/ۙ۬ۚ;

    invoke-direct {v0, v1, v2, p1}, Ll/᩵۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;Ll/ܺۤۚ;)V

    iput-object v0, p0, Ll/ܰ۫ۚ;->۬:Ll/᩵۫ۚ;

    return-void
.end method

.method public final ܽ()V
    .locals 13

    const-string v0, "--------------------"

    .line 374
    iget-object v1, p0, Ll/ܰ۫ۚ;->ᩴ:Ll/᩺۫ۚ;

    invoke-virtual {v1}, Ll/᩺۫ۚ;->ۧ()Ll/ܺۤۚ;

    move-result-object v2

    iget-object v3, v1, Ll/᩺۫ۚ;->ܽ:Ll/ۜۗۚ;

    iget-object v4, v1, Ll/᩺۫ۚ;->֫:Ll/ۜۗۚ;

    iget-object v5, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    if-nez v2, :cond_1

    .line 375
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    sget-object v2, Ll/ۧۤۚ;->᩺:Ll/ۧۤۚ;

    const-string v6, "java/lang/Object"

    invoke-virtual {v5, v6}, Ll/ۗۛۚ;->֫(Ljava/lang/String;)Ll/ܺۤۚ;

    move-result-object v6

    .line 521
    new-instance v7, Ll/ܿۛۚ;

    .line 738
    invoke-direct {v7, v2, v6}, Ll/ۖۤۚ;-><init>(Ll/ۧۤۚ;Ljava/lang/Object;)V

    .line 521
    invoke-virtual {v5, v7}, Ll/ۗۛۚ;->֫(Ll/ۖۤۚ;)Ll/ܺۤۚ;

    move-result-object v2

    .line 762
    iget-object v6, v4, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    if-eqz v6, :cond_0

    .line 763
    iput-object v2, v4, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    goto :goto_0

    .line 765
    :cond_0
    iput-object v2, v3, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    .line 377
    :cond_1
    :goto_0
    invoke-virtual {v5}, Ll/ۗۛۚ;->ܳ()V

    .line 813
    iget-object v2, v3, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    if-eqz v2, :cond_2

    .line 814
    check-cast v2, Ll/ܺۤۚ;

    invoke-virtual {v5, v2}, Ll/ۗۛۚ;->ܽ(Ll/ܺۤۚ;)Ll/ܺۤۚ;

    move-result-object v2

    iput-object v2, v3, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    .line 815
    :cond_2
    iget-object v2, v3, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    if-eqz v2, :cond_3

    .line 816
    check-cast v2, Ll/ܺۤۚ;

    invoke-virtual {v5, v2}, Ll/ۗۛۚ;->ܽ(Ll/ܺۤۚ;)Ll/ܺۤۚ;

    move-result-object v2

    iput-object v2, v3, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    .line 817
    :cond_3
    iget-object v2, v4, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    if-eqz v2, :cond_4

    .line 818
    check-cast v2, Ll/ܺۤۚ;

    invoke-virtual {v5, v2}, Ll/ۗۛۚ;->ܽ(Ll/ܺۤۚ;)Ll/ܺۤۚ;

    move-result-object v2

    iput-object v2, v4, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    .line 819
    :cond_4
    iget-object v2, v4, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    if-eqz v2, :cond_5

    .line 820
    check-cast v2, Ll/ܺۤۚ;

    invoke-virtual {v5, v2}, Ll/ۗۛۚ;->ܽ(Ll/ܺۤۚ;)Ll/ܺۤۚ;

    move-result-object v2

    iput-object v2, v4, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    .line 379
    :cond_5
    invoke-virtual {v1, v5}, Ll/᩺۫ۚ;->֫(Ll/ۗۛۚ;)V

    .line 380
    invoke-virtual {v5}, Ll/ۗۛۚ;->ۧ()V

    .line 381
    invoke-virtual {v5}, Ll/ۗۛۚ;->ܽ()V

    .line 382
    new-instance v2, Ll/۟ۛۚ;

    sget-object v3, Ll/ۙ۬ۚ;->ۛ:Ll/ۙ۬ۚ;

    invoke-direct {v2, v5, v3}, Ll/۟ۛۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    iget-object v3, p0, Ll/ܰ۫ۚ;->֨:Ljava/util/ArrayList;

    .line 383
    invoke-static {v3}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v3

    new-instance v4, Ll/ܶ۫ۚ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-interface {v3, v4}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/۟ۛۚ;->֫(Ll/ܿ᩺ᩴ;)V

    iget-object v3, p0, Ll/۫ۨۚ;->ۧ:Ll/۟ۛۚ;

    iget-object v4, p0, Ll/۫ۨۚ;->ܽ:Ll/۟ۛۚ;

    const/4 v6, 0x3

    new-array v6, v6, [Ll/۟ۛۚ;

    const/4 v7, 0x0

    aput-object v2, v6, v7

    const/4 v2, 0x1

    aput-object v3, v6, v2

    const/4 v3, 0x2

    aput-object v4, v6, v3

    .line 382
    invoke-direct {p0, v6}, Ll/ܰ۫ۚ;->֫([Ll/ۜ۫ۚ;)V

    .line 214
    iget-object v4, p0, Ll/ܰ۫ۚ;->ܺ:Ll/۟ۛۚ;

    iget-object v6, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    if-eqz v4, :cond_9

    new-array v3, v3, [Ll/ۧۤۚ;

    .line 216
    sget-object v4, Ll/ۧۤۚ;->ۜ֫:Ll/ۧۤۚ;

    aput-object v4, v3, v7

    sget-object v4, Ll/ۧۤۚ;->᩵֫:Ll/ۧۤۚ;

    aput-object v4, v3, v2

    .line 217
    invoke-virtual {v5, v3}, Ll/ۗۛۚ;->֫([Ll/ۧۤۚ;)Ljava/util/ArrayList;

    move-result-object v3

    .line 218
    invoke-static {v3}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v3

    new-instance v4, Ll/ܳ۟ۚ;

    invoke-direct {v4, v2}, Ll/ܳ۟ۚ;-><init>(I)V

    invoke-interface {v3, v4}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v3

    .line 219
    invoke-interface {v3}, Ll/ܿ᩺ᩴ;->toList()Ljava/util/List;

    move-result-object v3

    .line 220
    invoke-static {v3}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v4

    new-instance v8, Ll/۬۫ۚ;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    invoke-interface {v4, v8}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v4

    if-eqz v4, :cond_9

    .line 221
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v8, v2, [Ljava/lang/Object;

    aput-object v4, v8, v7

    const-string v4, "numberBSM: %d items"

    invoke-virtual {v6, v4, v8}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 225
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v10

    if-ge v8, v10, :cond_8

    .line 226
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۢ۫ۚ;

    .line 227
    invoke-static {v4, v10}, Ll/ܰ۫ۚ;->֫(Ljava/util/Collection;Ll/ۢ۫ۚ;)I

    move-result v11

    const/4 v12, -0x1

    if-eq v11, v12, :cond_6

    .line 61
    iput v11, v10, Ll/ۜۨۚ;->᩸:I

    goto :goto_3

    .line 231
    :cond_6
    iget-object v11, p0, Ll/ܰ۫ۚ;->ܺ:Ll/۟ۛۚ;

    invoke-static {v11, v10}, Ll/ܰ۫ۚ;->֫(Ljava/util/Collection;Ll/ۢ۫ۚ;)I

    move-result v11

    if-ne v11, v12, :cond_7

    .line 232
    invoke-virtual {v10}, Ll/ۢ۫ۚ;->toString()Ljava/lang/String;

    move-result-object v11

    new-array v12, v2, [Ljava/lang/Object;

    aput-object v11, v12, v7

    const-string v11, "Invoke dynamic \"{0}\" has undefined method attribute index"

    invoke-virtual {v6, v11, v12}, Ll/ۘۨۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    add-int/lit8 v11, v9, 0x1

    .line 61
    iput v9, v10, Ll/ۜۨۚ;->᩸:I

    move v9, v11

    .line 236
    :goto_2
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 239
    :cond_8
    iget-object v2, p0, Ll/ܰ۫ۚ;->ܺ:Ll/۟ۛۚ;

    invoke-virtual {v2, v4}, Ll/۟ۛۚ;->֫(Ljava/util/ArrayList;)V

    .line 387
    :cond_9
    :try_start_0
    invoke-virtual {v1}, Ll/᩺۫ۚ;->֫()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/ܰ۫ۚ;->ۗ:Ljava/lang/String;

    .line 388
    invoke-virtual {v6}, Ll/᩶ۗۚ;->ۢ()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 389
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClassFileName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ll/ܰ۫ۚ;->ۗ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v6, v2, v3}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "this_class    = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/᩺۫ۚ;->ܽ()Ll/ܺۤۚ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v6, v2, v3}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "super_class   = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/᩺۫ۚ;->ۧ()Ll/ܺۤۚ;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v7, [Ljava/lang/Object;

    invoke-virtual {v6, v1, v2}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "-- Constant Pool ---"

    new-array v2, v7, [Ljava/lang/Object;

    .line 392
    invoke-virtual {v6, v1, v2}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    new-array v1, v7, [Ljava/lang/Object;

    .line 393
    invoke-virtual {v6, v0, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    invoke-virtual {v5}, Ll/ۗۛۚ;->᩻()V

    new-array v1, v7, [Ljava/lang/Object;

    .line 395
    invoke-virtual {v6, v0, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "-- Inner Classes ---"

    new-array v2, v7, [Ljava/lang/Object;

    .line 396
    invoke-virtual {v6, v1, v2}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    new-array v1, v7, [Ljava/lang/Object;

    .line 397
    invoke-virtual {v6, v0, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    invoke-direct {p0}, Ll/ܰ۫ۚ;->ܳ()V

    new-array v1, v7, [Ljava/lang/Object;

    .line 399
    invoke-virtual {v6, v0, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_a
    return-void

    :catchall_0
    move-exception v0

    .line 402
    new-instance v1, Ll/᩸۫ۚ;

    invoke-direct {v1, v0}, Ll/᩸۫ۚ;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v6, v1}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    const-string v0, "Class name isn\'t defined"

    new-array v1, v7, [Ljava/lang/Object;

    .line 403
    invoke-virtual {v6, v0, v1}, Ll/ۘۨۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final ܽ(Ljava/util/ArrayList;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 353
    iget-object v1, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    const-string v2, "addNestMembers"

    invoke-virtual {v1, v2, v0}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    new-instance v0, Ll/۠᩺ۚ;

    iget-object v1, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    .line 41
    sget-object v2, Ll/ۙ۬ۚ;->ۡ֫:Ll/ۙ۬ۚ;

    invoke-direct {v0, v1, v2, p1}, Ll/ᩳ۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;Ljava/util/List;)V

    .line 354
    iput-object v0, p0, Ll/ܰ۫ۚ;->۫:Ll/۠᩺ۚ;

    return-void
.end method

.method public final ܿ()V
    .locals 10

    .line 167
    iget-object v0, p0, Ll/ܰ۫ۚ;->ܺ:Ll/۟ۛۚ;

    if-eqz v0, :cond_5

    const/4 v0, 0x2

    new-array v0, v0, [Ll/ۧۤۚ;

    .line 168
    sget-object v1, Ll/ۧۤۚ;->᩵֫:Ll/ۧۤۚ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۧۤۚ;->ۜ֫:Ll/ۧۤۚ;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    iget-object v1, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    invoke-virtual {v1, v0}, Ll/ۗۛۚ;->ۧ([Ll/ۧۤۚ;)Ljava/util/ArrayList;

    move-result-object v0

    .line 169
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v5, v3, [Ljava/lang/Object;

    aput-object v4, v5, v2

    iget-object v4, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    const-string v6, "relinkBSMs: %d items"

    invoke-virtual {v4, v6, v5}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܺۤۚ;

    .line 171
    iget-object v5, v5, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    check-cast v5, Ll/ᩳۛۚ;

    .line 172
    invoke-virtual {v5}, Ll/ᩳۛۚ;->ܽ()Ll/ۢ۫ۚ;

    move-result-object v6

    .line 173
    invoke-virtual {v5}, Ll/ᩳۛۚ;->ᩳ()Z

    move-result v7

    iget-object v8, v5, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v8, Ll/ܺۤۚ;

    iget-object v9, v8, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    if-nez v9, :cond_1

    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    and-int/2addr v7, v9

    if-eqz v7, :cond_2

    .line 174
    iget v7, v8, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {v1, v7}, Ll/ۗۛۚ;->֫(I)Ll/ܺۤۚ;

    move-result-object v7

    .line 47
    iput-object v7, v5, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    :cond_2
    if-eqz v6, :cond_0

    .line 57
    invoke-virtual {v6}, Ll/ۜۨۚ;->֫()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 65
    iget v7, v6, Ll/ۜۨۚ;->᩸:I

    if-ltz v7, :cond_4

    .line 180
    iget-object v8, p0, Ll/ܰ۫ۚ;->ܺ:Ll/۟ۛۚ;

    invoke-virtual {v8}, Ll/۟ۛۚ;->size()I

    move-result v8

    if-le v7, v8, :cond_3

    goto :goto_2

    .line 186
    :cond_3
    iget-object v6, p0, Ll/ܰ۫ۚ;->ܺ:Ll/۟ۛۚ;

    invoke-virtual {v6, v7}, Ll/۟ۛۚ;->get(I)Ll/֫ۨۚ;

    move-result-object v6

    check-cast v6, Ll/ۢ۫ۚ;

    invoke-virtual {v5, v6, v7}, Ll/ᩳۛۚ;->֫(Ll/ۢ۫ۚ;I)V

    goto :goto_0

    .line 182
    :cond_4
    :goto_2
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-array v8, v3, [Ljava/lang/Object;

    aput-object v5, v8, v2

    const-string v5, "Bad bootstrap method attribute index {0}"

    invoke-virtual {v4, v5, v8}, Ll/ۘۨۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    iput v7, v6, Ll/ۜۨۚ;->᩸:I

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 264
    iput-object v0, p0, Ll/ܰ۫ۚ;->ۛ:Ll/֫۟ۚ;

    return-void
.end method

.method public final ᩳ(Ljava/util/ArrayList;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 358
    iget-object v1, p0, Ll/ܰ۫ۚ;->ۚ:Ll/ۘۨۚ;

    const-string v2, "addPermittedSubclasses"

    invoke-virtual {v1, v2, v0}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    new-instance v0, Ll/᩺ܰۚ;

    iget-object v1, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    .line 41
    sget-object v2, Ll/ۙ۬ۚ;->ܺ֫:Ll/ۙ۬ۚ;

    invoke-direct {v0, v1, v2, p1}, Ll/ᩳ۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;Ljava/util/List;)V

    .line 359
    iput-object v0, p0, Ll/ܰ۫ۚ;->ۤ:Ll/᩺ܰۚ;

    return-void
.end method
