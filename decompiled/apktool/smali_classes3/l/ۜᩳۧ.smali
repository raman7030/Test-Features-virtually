.class public final Ll/ۜᩳۧ;
.super Ljava/lang/Object;
.source "C8UT"

# interfaces
.implements Ll/ܿᩳۧ;


# instance fields
.field public final ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜᩳۧ;->֫:Ljava/util/ArrayList;

    return-void
.end method

.method private ܿ(J)I
    .locals 4

    const/4 v0, 0x0

    .line 156
    :goto_0
    iget-object v1, p0, Ll/ۜᩳۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 157
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۘۧ;

    iget-wide v1, v1, Ll/۬ۘۧ;->ᩳ:J

    cmp-long v3, p1, v1

    if-gez v3, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 161
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    return p1
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 146
    iget-object v0, p0, Ll/ۜᩳۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ֫(J)Ll/ܳ۬ܺ;
    .locals 6

    .line 69
    invoke-direct {p0, p1, p2}, Ll/ۜᩳۧ;->ܿ(J)I

    move-result v0

    if-nez v0, :cond_0

    .line 72
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 74
    iget-object v1, p0, Ll/ۜᩳۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ۘۧ;

    .line 75
    iget-wide v1, v0, Ll/۬ۘۧ;->ܽ:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    cmp-long v3, p1, v1

    if-gez v3, :cond_1

    goto :goto_0

    .line 77
    :cond_1
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    return-object p1

    .line 76
    :cond_2
    :goto_0
    iget-object p1, v0, Ll/۬ۘۧ;->֫:Ll/ܳ۬ܺ;

    return-object p1
.end method

.method public final ֫(Ll/۬ۘۧ;J)Z
    .locals 9

    .line 49
    iget-wide v0, p1, Ll/۬ۘۧ;->ᩳ:J

    const/4 v2, 0x0

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-static {v5}, Ll/᩺֡֫;->֫(Z)V

    cmp-long v5, v0, p2

    if-gtz v5, :cond_2

    .line 50
    iget-wide v5, p1, Ll/۬ۘۧ;->ܽ:J

    cmp-long v7, v5, v3

    if-eqz v7, :cond_1

    cmp-long v3, p2, v5

    if-gez v3, :cond_2

    :cond_1
    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 53
    :goto_1
    iget-object v4, p0, Ll/ۜᩳۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    :goto_2
    if-ltz v5, :cond_5

    .line 54
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۬ۘۧ;

    iget-wide v6, v6, Ll/۬ۘۧ;->ᩳ:J

    cmp-long v8, v0, v6

    if-ltz v8, :cond_3

    add-int/lit8 v5, v5, 0x1

    .line 55
    invoke-virtual {v4, v5, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return v3

    .line 57
    :cond_3
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۬ۘۧ;

    iget-wide v6, v6, Ll/۬ۘۧ;->ᩳ:J

    cmp-long v8, v6, p2

    if-gtz v8, :cond_4

    const/4 v3, 0x0

    :cond_4
    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    .line 63
    :cond_5
    invoke-virtual {v4, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return v3
.end method

.method public final ۧ(J)J
    .locals 7

    .line 96
    iget-object v0, p0, Ll/ۜᩳۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v1, :cond_7

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۘۧ;

    iget-wide v4, v1, Ll/۬ۘۧ;->ᩳ:J

    cmp-long v1, p1, v4

    if-gez v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x1

    .line 100
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_4

    .line 101
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬ۘۧ;

    iget-wide v4, v4, Ll/۬ۘۧ;->ᩳ:J

    cmp-long v6, p1, v4

    if-nez v6, :cond_1

    return-wide v4

    :cond_1
    if-gez v6, :cond_3

    add-int/lit8 v1, v1, -0x1

    .line 106
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ۘۧ;

    .line 107
    iget-wide v4, v0, Ll/۬ۘۧ;->ܽ:J

    cmp-long v1, v4, v2

    if-eqz v1, :cond_2

    cmp-long v1, v4, p1

    if-gtz v1, :cond_2

    return-wide v4

    .line 109
    :cond_2
    iget-wide p1, v0, Ll/۬ۘۧ;->ᩳ:J

    return-wide p1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 112
    :cond_4
    invoke-static {v0}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ۘۧ;

    .line 113
    iget-wide v4, v0, Ll/۬ۘۧ;->ܽ:J

    cmp-long v1, v4, v2

    if-eqz v1, :cond_6

    cmp-long v1, p1, v4

    if-gez v1, :cond_5

    goto :goto_1

    :cond_5
    return-wide v4

    .line 114
    :cond_6
    :goto_1
    iget-wide p1, v0, Ll/۬ۘۧ;->ᩳ:J

    return-wide p1

    :cond_7
    :goto_2
    return-wide v2
.end method

.method public final ܽ(J)J
    .locals 11

    .line 120
    iget-object v0, p0, Ll/ۜᩳۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const-wide/high16 v2, -0x8000000000000000L

    if-eqz v1, :cond_0

    return-wide v2

    :cond_0
    const/4 v1, 0x0

    .line 123
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬ۘۧ;

    iget-wide v4, v4, Ll/۬ۘۧ;->ᩳ:J

    cmp-long v6, p1, v4

    if-gez v6, :cond_1

    .line 124
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ۘۧ;

    iget-wide p1, p1, Ll/۬ۘۧ;->ᩳ:J

    return-wide p1

    :cond_1
    const/4 v1, 0x1

    .line 127
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v1, v4, :cond_4

    .line 128
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬ۘۧ;

    .line 129
    iget-wide v7, v4, Ll/۬ۘۧ;->ᩳ:J

    iget-wide v9, v4, Ll/۬ۘۧ;->ᩳ:J

    cmp-long v4, p1, v7

    if-gez v4, :cond_3

    add-int/lit8 v1, v1, -0x1

    .line 130
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ۘۧ;

    .line 133
    iget-wide v0, v0, Ll/۬ۘۧ;->ܽ:J

    cmp-long v2, v0, v5

    if-eqz v2, :cond_2

    cmp-long v2, v0, p1

    if-lez v2, :cond_2

    cmp-long p1, v0, v9

    if-gez p1, :cond_2

    return-wide v0

    :cond_2
    return-wide v9

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 138
    :cond_4
    invoke-static {v0}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ۘۧ;

    .line 139
    iget-wide v0, v0, Ll/۬ۘۧ;->ܽ:J

    cmp-long v4, v0, v5

    if-eqz v4, :cond_5

    cmp-long v4, p1, v0

    if-gez v4, :cond_5

    return-wide v0

    :cond_5
    return-wide v2
.end method

.method public final ᩳ(J)V
    .locals 7

    .line 82
    invoke-direct {p0, p1, p2}, Ll/ۜᩳۧ;->ܿ(J)I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    add-int/lit8 v1, v0, -0x1

    .line 87
    iget-object v2, p0, Ll/ۜᩳۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۘۧ;

    .line 88
    iget-wide v3, v1, Ll/۬ۘۧ;->ܽ:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v3, v5

    if-eqz v1, :cond_1

    cmp-long v1, v3, p1

    if-ltz v1, :cond_2

    :cond_1
    add-int/lit8 v0, v0, -0x1

    :cond_2
    const/4 p1, 0x0

    .line 91
    invoke-virtual {v2, p1, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method
