.class public final Ll/۠ܰ֡;
.super Ll/ۡ۬֡;
.source "J4NZ"


# instance fields
.field public final ۙ:Ll/۬ۛ֡;

.field public ᩶:I

.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;I)V
    .locals 2

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 57
    iput v0, p0, Ll/۠ܰ֡;->᩶:I

    .line 60
    iput-object p1, p0, Ll/۠ܰ֡;->ۙ:Ll/۬ۛ֡;

    .line 61
    iput p2, p0, Ll/۠ܰ֡;->᩹:I

    const/4 v0, 0x7

    .line 353
    invoke-virtual {p1, v0}, Ll/۬ۛ֡;->ᩳ(I)Ll/֨ܰ֡;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 354
    invoke-virtual {p1}, Ll/֨ܰ֡;->֫()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 357
    invoke-virtual {p1}, Ll/֨ܰ֡;->ۧ()I

    move-result p1

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr p2, p1

    .line 62
    iput p2, p0, Ll/۠ܰ֡;->᩸:I

    return-void

    .line 355
    :cond_0
    new-instance p1, Ll/ۙۛ֡;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const/4 p2, 0x0

    const-string v1, "Call site index out of bounds: %d"

    .line 46
    invoke-direct {p1, p2, v1, v0}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    throw p1
.end method

.method private ֡()Ll/ܺ۟֡;
    .locals 3

    .line 163
    iget v0, p0, Ll/۠ܰ֡;->᩶:I

    iget-object v1, p0, Ll/۠ܰ֡;->ۙ:Ll/۬ۛ֡;

    if-gez v0, :cond_0

    .line 164
    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v2, p0, Ll/۠ܰ֡;->᩸:I

    invoke-virtual {v0, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    iput v0, p0, Ll/۠ܰ֡;->᩶:I

    .line 166
    :cond_0
    iget v0, p0, Ll/۠ܰ֡;->᩶:I

    .line 159
    invoke-static {v1, v0}, Ll/ܺ۟֡;->֫(Ll/۬ۛ֡;I)Ll/ܺ۟֡;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getIndex()I
    .locals 1

    .line 73
    iget v0, p0, Ll/۠ܰ֡;->᩹:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 3

    .line 68
    iget v0, p0, Ll/۠ܰ֡;->᩹:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "call_site_%d"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ljava/util/List;
    .locals 4

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 138
    invoke-direct {p0}, Ll/۠ܰ֡;->֡()Ll/ܺ۟֡;

    move-result-object v1

    .line 139
    invoke-virtual {v1}, Ll/ܺ۟֡;->֫()I

    move-result v2

    const/4 v3, 0x3

    if-lt v2, v3, :cond_2

    .line 142
    invoke-virtual {v1}, Ll/ܺ۟֡;->֫()I

    move-result v2

    if-ne v2, v3, :cond_0

    goto :goto_1

    .line 146
    :cond_0
    invoke-virtual {v1}, Ll/ܺ۟֡;->ᩳ()V

    .line 147
    invoke-virtual {v1}, Ll/ܺ۟֡;->ᩳ()V

    .line 148
    invoke-virtual {v1}, Ll/ܺ۟֡;->ᩳ()V

    .line 150
    invoke-virtual {v1}, Ll/ܺ۟֡;->ۧ()Ll/ۤܽۚ;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_1

    .line 152
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    invoke-virtual {v1}, Ll/ܺ۟֡;->ۧ()Ll/ۤܽۚ;

    move-result-object v2

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0

    .line 140
    :cond_2
    new-instance v0, Ll/ܶ᩵ۚ;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "Invalid call site item: must contain at least 3 entries."

    .line 46
    invoke-direct {v0, v2, v3, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    throw v0
.end method

.method public final ۧ()Ll/֡ܽۚ;
    .locals 6

    .line 116
    invoke-direct {p0}, Ll/۠ܰ֡;->֡()Ll/ܺ۟֡;

    move-result-object v0

    .line 117
    invoke-virtual {v0}, Ll/ܺ۟֡;->֫()I

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-lt v1, v2, :cond_1

    .line 121
    invoke-virtual {v0}, Ll/ܺ۟֡;->ᩳ()V

    .line 122
    invoke-virtual {v0}, Ll/ܺ۟֡;->ᩳ()V

    .line 123
    invoke-virtual {v0}, Ll/ܺ۟֡;->ۧ()Ll/ۤܽۚ;

    move-result-object v0

    .line 125
    invoke-interface {v0}, Ll/ۤܽۚ;->ۖ()I

    move-result v1

    const/16 v2, 0x15

    if-ne v1, v2, :cond_0

    .line 130
    check-cast v0, Ll/ܽᩳۚ;

    invoke-interface {v0}, Ll/ܽᩳۚ;->getValue()Ll/֡ܽۚ;

    move-result-object v0

    return-object v0

    .line 126
    :cond_0
    new-instance v1, Ll/ܶ᩵ۚ;

    .line 128
    invoke-interface {v0}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v2, p0, Ll/۠ܰ֡;->᩹:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v0, v5, v3

    const/4 v0, 0x1

    aput-object v2, v5, v0

    const-string v0, "Invalid encoded value type (%d) for the second item in call site %d"

    .line 46
    invoke-direct {v1, v4, v0, v5}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    throw v1

    .line 118
    :cond_1
    new-instance v0, Ll/ܶ᩵ۚ;

    const-string v1, "Invalid call site item: must contain at least 3 entries."

    new-array v2, v3, [Ljava/lang/Object;

    .line 46
    invoke-direct {v0, v4, v1, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    throw v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 6

    .line 97
    invoke-direct {p0}, Ll/۠ܰ֡;->֡()Ll/ܺ۟֡;

    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ll/ܺ۟֡;->֫()I

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-lt v1, v2, :cond_1

    .line 102
    invoke-virtual {v0}, Ll/ܺ۟֡;->ᩳ()V

    .line 103
    invoke-virtual {v0}, Ll/ܺ۟֡;->ۧ()Ll/ۤܽۚ;

    move-result-object v0

    .line 105
    invoke-interface {v0}, Ll/ۤܽۚ;->ۖ()I

    move-result v1

    const/16 v2, 0x17

    if-ne v1, v2, :cond_0

    .line 110
    check-cast v0, Ll/ܿᩳۚ;

    invoke-interface {v0}, Ll/ܿᩳۚ;->getValue()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 106
    :cond_0
    new-instance v1, Ll/ܶ᩵ۚ;

    .line 108
    invoke-interface {v0}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v2, p0, Ll/۠ܰ֡;->᩹:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v0, v5, v3

    const/4 v0, 0x1

    aput-object v2, v5, v0

    const-string v0, "Invalid encoded value type (%d) for the second item in call site %d"

    .line 46
    invoke-direct {v1, v4, v0, v5}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    throw v1

    .line 99
    :cond_1
    new-instance v0, Ll/ܶ᩵ۚ;

    const-string v1, "Invalid call site item: must contain at least 3 entries."

    new-array v2, v3, [Ljava/lang/Object;

    .line 46
    invoke-direct {v0, v4, v1, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    throw v0
.end method

.method public final ܿ()V
    .locals 4

    .line 171
    iget v0, p0, Ll/۠ܰ֡;->᩹:I

    if-ltz v0, :cond_1

    iget-object v1, p0, Ll/۠ܰ֡;->ۙ:Ll/۬ۛ֡;

    const/4 v2, 0x7

    .line 393
    invoke-virtual {v1, v2}, Ll/۬ۛ֡;->ᩳ(I)Ll/֨ܰ֡;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 397
    :cond_0
    invoke-virtual {v1}, Ll/֨ܰ֡;->֫()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_1

    return-void

    .line 172
    :cond_1
    new-instance v1, Ll/֨ܽۚ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "callsite@"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/֨ܽۚ;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ᩷()Ll/᩵ܽۚ;
    .locals 6

    .line 79
    invoke-direct {p0}, Ll/۠ܰ֡;->֡()Ll/ܺ۟֡;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ll/ܺ۟֡;->֫()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-lt v0, v1, :cond_1

    .line 84
    invoke-direct {p0}, Ll/۠ܰ֡;->֡()Ll/ܺ۟֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺ۟֡;->ۧ()Ll/ۤܽۚ;

    move-result-object v0

    .line 86
    invoke-interface {v0}, Ll/ۤܽۚ;->ۖ()I

    move-result v1

    const/16 v4, 0x16

    if-ne v1, v4, :cond_0

    .line 91
    check-cast v0, Ll/ۧᩳۚ;

    invoke-interface {v0}, Ll/ۧᩳۚ;->getValue()Ll/᩵ܽۚ;

    move-result-object v0

    return-object v0

    .line 87
    :cond_0
    new-instance v1, Ll/ܶ᩵ۚ;

    .line 89
    invoke-interface {v0}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v4, p0, Ll/۠ܰ֡;->᩹:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v0, v5, v2

    const/4 v0, 0x1

    aput-object v4, v5, v0

    const-string v0, "Invalid encoded value type (%d) for the first item in call site %d"

    .line 46
    invoke-direct {v1, v3, v0, v5}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    throw v1

    .line 81
    :cond_1
    new-instance v0, Ll/ܶ᩵ۚ;

    const-string v1, "Invalid call site item: must contain at least 3 entries."

    new-array v2, v2, [Ljava/lang/Object;

    .line 46
    invoke-direct {v0, v3, v1, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    throw v0
.end method
