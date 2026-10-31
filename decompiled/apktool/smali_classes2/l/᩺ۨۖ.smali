.class public final Ll/᩺ۨۖ;
.super Ll/ܽۨۖ;
.source "Z9K8"


# instance fields
.field public ۖ:Ll/᩺۫ۖ;

.field public ۜ:I

.field public ۡ:I

.field public ۢ:Ljava/util/List;

.field public ܳ:Ll/᩹ۛۖ;

.field public ܺ:Ljava/util/UUID;

.field public ܿ:Ljava/util/EnumSet;

.field public ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ll/ܽۨۖ;-><init>()V

    .line 43
    const-class v0, Ll/ۛۛۖ;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ۨۖ;->ܿ:Ljava/util/EnumSet;

    return-void
.end method


# virtual methods
.method public final ۖ()Ljava/util/List;
    .locals 1

    .line 162
    iget-object v0, p0, Ll/᩺ۨۖ;->ۢ:Ljava/util/List;

    return-object v0
.end method

.method public final ۘ()I
    .locals 1

    .line 126
    iget v0, p0, Ll/᩺ۨۖ;->ۡ:I

    return v0
.end method

.method public final ۜ()Ljava/util/Set;
    .locals 1

    .line 138
    iget-object v0, p0, Ll/᩺ۨۖ;->ܿ:Ljava/util/EnumSet;

    return-object v0
.end method

.method public final ۡ()I
    .locals 1

    .line 142
    iget v0, p0, Ll/᩺ۨۖ;->ۜ:I

    return v0
.end method

.method public final ۢ()I
    .locals 1

    .line 146
    iget v0, p0, Ll/᩺ۨۖ;->᩻:I

    return v0
.end method

.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 9

    const/4 v0, 0x2

    .line 54
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 55
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v1

    iput v1, p0, Ll/᩺ۨۖ;->ۡ:I

    .line 56
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v1

    invoke-static {v1}, Ll/᩹ۛۖ;->֫(I)Ll/᩹ۛۖ;

    move-result-object v1

    iput-object v1, p0, Ll/᩺ۨۖ;->ܳ:Ll/᩹ۛۖ;

    .line 113
    sget-object v2, Ll/᩹ۛۖ;->ۤ:Ll/᩹ۛۖ;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    .line 114
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v1

    goto :goto_0

    .line 116
    :cond_0
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    const/4 v1, 0x0

    .line 56
    :goto_0
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v4

    const/16 v6, 0x10

    shl-long/2addr v4, v6

    .line 58
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v7

    int-to-long v7, v7

    or-long/2addr v4, v7

    shl-long/2addr v4, v6

    .line 60
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v6

    int-to-long v6, v6

    or-long/2addr v4, v6

    .line 64
    sget-object v6, Ll/᩺ܰۖ;->֫:Ll/᩺ܰۖ;

    .line 579
    invoke-virtual {v6, p1}, Ll/᩺ܰۖ;->֫(Ll/ۤܰۖ;)J

    move-result-wide v6

    .line 65
    new-instance v8, Ljava/util/UUID;

    invoke-direct {v8, v4, v5, v6, v7}, Ljava/util/UUID;-><init>(JJ)V

    .line 58
    iput-object v8, p0, Ll/᩺ۨۖ;->ܺ:Ljava/util/UUID;

    .line 59
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v4

    const-class v6, Ll/ۛۛۖ;

    invoke-static {v4, v5, v6}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v4

    iput-object v4, p0, Ll/᩺ۨۖ;->ܿ:Ljava/util/EnumSet;

    .line 60
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v4

    iput v4, p0, Ll/᩺ۨۖ;->ۜ:I

    .line 61
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v4

    iput v4, p0, Ll/᩺ۨۖ;->᩻:I

    .line 62
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v4

    iput v4, p0, Ll/᩺ۨۖ;->᩷:I

    .line 63
    invoke-static {p1}, Ll/ܰ۫ۖ;->֫(Ll/ۤܰۖ;)Ll/᩺۫ۖ;

    move-result-object v4

    iput-object v4, p0, Ll/᩺ۨۖ;->ۖ:Ll/᩺۫ۖ;

    .line 64
    invoke-static {p1}, Ll/ܰ۫ۖ;->֫(Ll/ۤܰۖ;)Ll/᩺۫ۖ;

    .line 65
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v4

    .line 66
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v5

    .line 104
    iget-object v6, p0, Ll/᩺ۨۖ;->ܳ:Ll/᩹ۛۖ;

    if-ne v6, v2, :cond_1

    .line 105
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v0

    goto :goto_1

    .line 107
    :cond_1
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    const/4 v0, 0x0

    :goto_1
    if-lez v5, :cond_2

    .line 96
    invoke-virtual {p1, v4}, Ll/ۤܰۖ;->ᩳ(I)V

    .line 97
    invoke-virtual {p1, v5}, Ll/ۤܰۖ;->ܽ(I)[B

    .line 73
    :cond_2
    iget-object v4, p0, Ll/᩺ۨۖ;->ܳ:Ll/᩹ۛۖ;

    if-ne v4, v2, :cond_3

    .line 74
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ᩳ(I)V

    .line 76
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    if-ge v3, v1, :cond_4

    .line 79
    invoke-static {p1}, Ll/֨᩺ۖ;->ܿ(Ll/֡֫ۘ;)Ll/֨᩺ۖ;

    move-result-object v2

    .line 81
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ll/۬ܰۖ; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 86
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown error when parse negotiateContext"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 89
    :cond_3
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 69
    :cond_4
    iput-object v0, p0, Ll/᩺ۨۖ;->ۢ:Ljava/util/List;

    return-void
.end method

.method public final ܺ()I
    .locals 1

    .line 150
    iget v0, p0, Ll/᩺ۨۖ;->᩷:I

    return v0
.end method

.method public final ᩴ()Ljava/util/UUID;
    .locals 1

    .line 134
    iget-object v0, p0, Ll/᩺ۨۖ;->ܺ:Ljava/util/UUID;

    return-object v0
.end method

.method public final ᩵()Ll/᩺۫ۖ;
    .locals 1

    .line 154
    iget-object v0, p0, Ll/᩺ۨۖ;->ۖ:Ll/᩺۫ۖ;

    return-object v0
.end method

.method public final ᩷()Ll/᩹ۛۖ;
    .locals 1

    .line 130
    iget-object v0, p0, Ll/᩺ۨۖ;->ܳ:Ll/᩹ۛۖ;

    return-object v0
.end method
