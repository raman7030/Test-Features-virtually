.class public final Ll/᩶֫ۧ;
.super Ljava/lang/Object;
.source "18OR"

# interfaces
.implements Ll/֡ܽۧ;


# instance fields
.field public ᩸:J

.field public final ᩹:Ll/ܳ۬ܺ;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 5

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    sget v0, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v0, Ll/֫۬ܺ;

    invoke-direct {v0}, Ll/֫۬ܺ;-><init>()V

    .line 51
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 52
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_1

    .line 53
    new-instance v1, Ll/᩹֫ۧ;

    .line 54
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܽۧ;

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-direct {v1, v2, v4}, Ll/᩹֫ۧ;-><init>(Ll/֡ܽۧ;Ljava/util/List;)V

    .line 53
    invoke-virtual {v0, v1}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {v0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩶֫ۧ;->᩹:Ll/ܳ۬ܺ;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 57
    iput-wide p1, p0, Ll/᩶֫ۧ;->᩸:J

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 141
    :goto_0
    iget-object v2, p0, Ll/᩶֫ۧ;->᩹:Ll/ܳ۬ܺ;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 142
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹֫ۧ;

    invoke-virtual {v2}, Ll/᩹֫ۧ;->֫()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final ֫(Ll/ۨۙ֫;)Z
    .locals 13

    const/4 v0, 0x0

    .line 121
    :cond_0
    invoke-virtual {p0}, Ll/᩶֫ۧ;->ۧ()J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    return v0

    :cond_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 125
    :goto_0
    iget-object v7, p0, Ll/᩶֫ۧ;->᩹:Ll/ܳ۬ܺ;

    invoke-virtual {v7}, Ljava/util/AbstractCollection;->size()I

    move-result v8

    if-ge v5, v8, :cond_5

    .line 126
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩹֫ۧ;

    invoke-virtual {v8}, Ll/᩹֫ۧ;->ۧ()J

    move-result-wide v8

    cmp-long v10, v8, v3

    if-eqz v10, :cond_2

    .line 127
    iget-wide v10, p1, Ll/ۨۙ֫;->ۧ:J

    cmp-long v12, v8, v10

    if-gtz v12, :cond_2

    const/4 v10, 0x1

    goto :goto_1

    :cond_2
    const/4 v10, 0x0

    :goto_1
    cmp-long v11, v8, v1

    if-eqz v11, :cond_3

    if-eqz v10, :cond_4

    .line 131
    :cond_3
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩹֫ۧ;

    invoke-virtual {v7, p1}, Ll/᩹֫ۧ;->֫(Ll/ۨۙ֫;)Z

    move-result v7

    or-int/2addr v6, v7

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    or-int/2addr v0, v6

    if-nez v6, :cond_0

    return v0
.end method

.method public final ۜ()J
    .locals 14

    const-wide v0, 0x7fffffffffffffffL

    const/4 v2, 0x0

    move-wide v3, v0

    move-wide v5, v3

    .line 64
    :goto_0
    iget-object v7, p0, Ll/᩶֫ۧ;->᩹:Ll/ܳ۬ܺ;

    invoke-virtual {v7}, Ljava/util/AbstractCollection;->size()I

    move-result v8

    const-wide/high16 v9, -0x8000000000000000L

    if-ge v2, v8, :cond_3

    .line 65
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩹֫ۧ;

    .line 66
    invoke-virtual {v7}, Ll/᩹֫ۧ;->ۜ()J

    move-result-wide v11

    .line 68
    invoke-virtual {v7}, Ll/᩹֫ۧ;->ᩳ()Ll/ܳ۬ܺ;

    move-result-object v8

    const/4 v13, 0x1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v8, v13}, Ll/ܳ۬ܺ;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 69
    invoke-virtual {v7}, Ll/᩹֫ۧ;->ᩳ()Ll/ܳ۬ܺ;

    move-result-object v8

    const/4 v13, 0x2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v8, v13}, Ll/ܳ۬ܺ;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 70
    invoke-virtual {v7}, Ll/᩹֫ۧ;->ᩳ()Ll/ܳ۬ܺ;

    move-result-object v7

    const/4 v8, 0x4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8}, Ll/ܳ۬ܺ;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    :cond_0
    cmp-long v7, v11, v9

    if-eqz v7, :cond_1

    .line 73
    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    :cond_1
    cmp-long v7, v11, v9

    if-eqz v7, :cond_2

    .line 77
    invoke-static {v5, v6, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    cmp-long v2, v3, v0

    if-eqz v2, :cond_4

    .line 81
    iput-wide v3, p0, Ll/᩶֫ۧ;->᩸:J

    return-wide v3

    :cond_4
    cmp-long v2, v5, v0

    if-eqz v2, :cond_6

    .line 87
    iget-wide v0, p0, Ll/᩶֫ۧ;->᩸:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_5

    return-wide v0

    :cond_5
    return-wide v5

    :cond_6
    return-wide v9
.end method

.method public final ۧ()J
    .locals 10

    const-wide v0, 0x7fffffffffffffffL

    const/4 v2, 0x0

    move-wide v3, v0

    .line 98
    :goto_0
    iget-object v5, p0, Ll/᩶֫ۧ;->᩹:Ll/ܳ۬ܺ;

    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v6

    const-wide/high16 v7, -0x8000000000000000L

    if-ge v2, v6, :cond_1

    .line 99
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹֫ۧ;

    .line 100
    invoke-virtual {v5}, Ll/᩹֫ۧ;->ۧ()J

    move-result-wide v5

    cmp-long v9, v5, v7

    if-eqz v9, :cond_0

    .line 102
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    cmp-long v2, v3, v0

    if-nez v2, :cond_2

    return-wide v7

    :cond_2
    return-wide v3
.end method

.method public final ۧ(J)V
    .locals 3

    const/4 v0, 0x0

    .line 110
    :goto_0
    iget-object v1, p0, Ll/᩶֫ۧ;->᩹:Ll/ܳ۬ܺ;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 111
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹֫ۧ;

    invoke-virtual {v1, p1, p2}, Ll/᩹֫ۧ;->ۧ(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
