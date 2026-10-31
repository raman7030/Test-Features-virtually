.class public final Ll/۬ۖܿ;
.super Ljava/lang/Object;
.source "D6VU"


# instance fields
.field public ֫:Ll/۫ۖܿ;

.field public ۜ:Ll/ۢۖܿ;

.field public ۧ:Ll/ᩳۖܿ;

.field public ܳ:I

.field public final ܽ:Ll/᩸᩷ܿ;

.field public final ܿ:I

.field public ᩳ:I

.field public final synthetic ᩷:Ll/ۛۖܿ;

.field public ᩻:Ll/ܽۖܿ;


# direct methods
.method public constructor <init>(Ll/ۛۖܿ;Ll/ۢۖܿ;Ll/᩸᩷ܿ;I)V
    .locals 0

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ۖܿ;->᩷:Ll/ۛۖܿ;

    const/4 p1, -0x1

    .line 106
    iput p1, p0, Ll/۬ۖܿ;->ᩳ:I

    .line 113
    iput-object p2, p0, Ll/۬ۖܿ;->ۜ:Ll/ۢۖܿ;

    .line 114
    iput-object p3, p0, Ll/۬ۖܿ;->ܽ:Ll/᩸᩷ܿ;

    .line 115
    iput p4, p0, Ll/۬ۖܿ;->ܿ:I

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 9

    .line 119
    iget v0, p0, Ll/۬ۖܿ;->ᩳ:I

    const/4 v1, 0x1

    iget-object v2, p0, Ll/۬ۖܿ;->᩷:Ll/ۛۖܿ;

    const/4 v3, 0x0

    iget v4, p0, Ll/۬ۖܿ;->ܿ:I

    if-gez v0, :cond_2

    .line 121
    invoke-static {v2}, Ll/ۛۖܿ;->ܽ(Ll/ۛۖܿ;)I

    move-result v0

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    sub-int/2addr v0, v4

    .line 122
    invoke-static {v2}, Ll/ۛۖܿ;->֫(Ll/ۛۖܿ;)I

    move-result v5

    sub-int/2addr v5, v4

    iget-object v6, p0, Ll/۬ۖܿ;->ۜ:Ll/ۢۖܿ;

    invoke-virtual {v6}, Ll/ۢۖܿ;->֫()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    if-ge v0, v5, :cond_1

    .line 124
    iget-object v6, p0, Ll/۬ۖܿ;->ۜ:Ll/ۢۖܿ;

    sub-int v7, v5, v0

    invoke-static {v2}, Ll/ۛۖܿ;->ܽ(Ll/ۛۖܿ;)I

    move-result v2

    add-int/2addr v4, v0

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Ll/۬ۖܿ;->ܽ:Ll/᩸᩷ܿ;

    invoke-static {v7, v2, v1}, Ll/ۢۖܿ;->֫(ILl/᩸᩷ܿ;Z)Ll/ۢۖܿ;

    move-result-object v1

    invoke-virtual {v6, v0, v5, v1}, Ll/ۢۖܿ;->֫(IILl/ۢۖܿ;)Ll/ۢۖܿ;

    move-result-object v0

    iput-object v0, p0, Ll/۬ۖܿ;->ۜ:Ll/ۢۖܿ;

    .line 127
    :cond_1
    iput v3, p0, Ll/۬ۖܿ;->ᩳ:I

    return v3

    .line 130
    :cond_2
    iget-object v5, p0, Ll/۬ۖܿ;->֫:Ll/۫ۖܿ;

    const/4 v6, 0x0

    if-nez v5, :cond_6

    .line 131
    invoke-static {v2}, Ll/ۛۖܿ;->ۧ(Ll/ۛۖܿ;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ne v0, v5, :cond_3

    return v1

    .line 132
    :cond_3
    invoke-static {v2}, Ll/ۛۖܿ;->ۧ(Ll/ۛۖܿ;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Ll/۬ۖܿ;->ᩳ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/۬ۖܿ;->ᩳ:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ۖܿ;

    .line 133
    invoke-static {v0}, Ll/۫ۖܿ;->ۧ(Ll/۫ۖܿ;)I

    move-result v1

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    sub-int/2addr v1, v4

    .line 134
    invoke-static {v0}, Ll/۫ۖܿ;->֫(Ll/۫ۖܿ;)I

    move-result v2

    sub-int/2addr v2, v4

    iget-object v4, p0, Ll/۬ۖܿ;->ۜ:Ll/ۢۖܿ;

    invoke-virtual {v4}, Ll/ۢۖܿ;->֫()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-ge v1, v2, :cond_5

    .line 135
    invoke-static {v0}, Ll/۫ۖܿ;->ܽ(Ll/۫ۖܿ;)Ll/᩸᩷ܿ;

    move-result-object v4

    sget-object v5, Ll/᩸᩷ܿ;->ۜ:Ll/᩸᩷ܿ;

    if-ne v4, v5, :cond_4

    goto :goto_1

    .line 139
    :cond_4
    new-instance v4, Ll/۫ۖܿ;

    invoke-static {v0}, Ll/۫ۖܿ;->ܽ(Ll/۫ۖܿ;)Ll/᩸᩷ܿ;

    move-result-object v0

    invoke-direct {v4, v1, v2, v0}, Ll/۫ۖܿ;-><init>(IILl/᩸᩷ܿ;)V

    iput-object v4, p0, Ll/۬ۖܿ;->֫:Ll/۫ۖܿ;

    .line 140
    iget-object v0, p0, Ll/۬ۖܿ;->ۜ:Ll/ۢۖܿ;

    invoke-static {v4}, Ll/۫ۖܿ;->ۧ(Ll/۫ۖܿ;)I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    new-instance v2, Ll/ᩳۖܿ;

    invoke-direct {v2}, Ll/ᩳۖܿ;-><init>()V

    .line 279
    invoke-virtual {v2, v0}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    .line 280
    invoke-virtual {v2, v1}, Ll/ᩳۖܿ;->֫(I)Z

    .line 140
    iput-object v2, p0, Ll/۬ۖܿ;->ۧ:Ll/ᩳۖܿ;

    .line 141
    new-instance v0, Ll/ܽۖܿ;

    invoke-direct {v0}, Ll/ܽۖܿ;-><init>()V

    iput-object v0, p0, Ll/۬ۖܿ;->᩻:Ll/ܽۖܿ;

    .line 142
    iget-object v0, p0, Ll/۬ۖܿ;->֫:Ll/۫ۖܿ;

    invoke-static {v0}, Ll/۫ۖܿ;->ۧ(Ll/۫ۖܿ;)I

    move-result v0

    iput v0, p0, Ll/۬ۖܿ;->ܳ:I

    return v3

    .line 136
    :cond_5
    :goto_1
    iput-object v6, p0, Ll/۬ۖܿ;->֫:Ll/۫ۖܿ;

    return v3

    .line 145
    :cond_6
    invoke-static {v5}, Ll/۫ۖܿ;->֫(Ll/۫ۖܿ;)I

    move-result v0

    iget-object v2, p0, Ll/۬ۖܿ;->ۧ:Ll/ᩳۖܿ;

    invoke-virtual {v2}, Ll/ᩳۖܿ;->֫()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 146
    iget-object v2, p0, Ll/۬ۖܿ;->᩻:Ll/ܽۖܿ;

    iget v4, p0, Ll/۬ۖܿ;->ܳ:I

    sub-int v4, v0, v4

    iget-object v5, p0, Ll/۬ۖܿ;->ۧ:Ll/ᩳۖܿ;

    invoke-virtual {v5}, Ll/ᩳۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v5

    iget-object v7, p0, Ll/۬ۖܿ;->֫:Ll/۫ۖܿ;

    invoke-static {v7}, Ll/۫ۖܿ;->ܽ(Ll/۫ۖܿ;)Ll/᩸᩷ܿ;

    move-result-object v7

    invoke-virtual {v5, v7}, Ll/᩸᩷ܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object v5

    iget-object v7, p0, Ll/۬ۖܿ;->ۧ:Ll/ᩳۖܿ;

    .line 147
    invoke-virtual {v7}, Ll/ᩳۖܿ;->ᩳ()Z

    move-result v7

    if-eqz v7, :cond_7

    iget v7, p0, Ll/۬ۖܿ;->ܳ:I

    iget-object v8, p0, Ll/۬ۖܿ;->ۧ:Ll/ᩳۖܿ;

    invoke-virtual {v8}, Ll/ᩳۖܿ;->ۧ()I

    move-result v8

    if-ne v7, v8, :cond_7

    goto :goto_2

    :cond_7
    const/4 v1, 0x0

    .line 146
    :goto_2
    invoke-virtual {v2, v4, v5, v1}, Ll/ܽۖܿ;->֫(ILl/᩸᩷ܿ;Z)V

    .line 148
    iput v0, p0, Ll/۬ۖܿ;->ܳ:I

    .line 149
    iget-object v1, p0, Ll/۬ۖܿ;->֫:Ll/۫ۖܿ;

    invoke-static {v1}, Ll/۫ۖܿ;->֫(Ll/۫ۖܿ;)I

    move-result v1

    if-ne v0, v1, :cond_8

    .line 150
    iget-object v0, p0, Ll/۬ۖܿ;->ۜ:Ll/ۢۖܿ;

    iget-object v1, p0, Ll/۬ۖܿ;->֫:Ll/۫ۖܿ;

    invoke-static {v1}, Ll/۫ۖܿ;->ۧ(Ll/۫ۖܿ;)I

    move-result v1

    iget-object v2, p0, Ll/۬ۖܿ;->֫:Ll/۫ۖܿ;

    invoke-static {v2}, Ll/۫ۖܿ;->֫(Ll/۫ۖܿ;)I

    move-result v2

    iget-object v4, p0, Ll/۬ۖܿ;->᩻:Ll/ܽۖܿ;

    invoke-virtual {v4}, Ll/ܽۖܿ;->֫()Ll/ۢۖܿ;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v4}, Ll/ۢۖܿ;->֫(IILl/ۢۖܿ;)Ll/ۢۖܿ;

    move-result-object v0

    iput-object v0, p0, Ll/۬ۖܿ;->ۜ:Ll/ۢۖܿ;

    .line 151
    iput-object v6, p0, Ll/۬ۖܿ;->֫:Ll/۫ۖܿ;

    .line 152
    iput-object v6, p0, Ll/۬ۖܿ;->ۧ:Ll/ᩳۖܿ;

    .line 153
    iput-object v6, p0, Ll/۬ۖܿ;->᩻:Ll/ܽۖܿ;

    return v3

    .line 154
    :cond_8
    iget-object v0, p0, Ll/۬ۖܿ;->ۧ:Ll/ᩳۖܿ;

    invoke-virtual {v0}, Ll/ᩳۖܿ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_9

    return v3

    .line 155
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Incomplete syntax style transaction coverage"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ()Ll/ۢۖܿ;
    .locals 1

    .line 161
    iget-object v0, p0, Ll/۬ۖܿ;->ۜ:Ll/ۢۖܿ;

    return-object v0
.end method
