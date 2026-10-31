.class public final Ll/᩻ᩳۧ;
.super Ljava/lang/Object;
.source "X8HS"

# interfaces
.implements Ll/ܿᩳۧ;


# static fields
.field public static final ۧ:Ll/ۤۤܺ;


# instance fields
.field public final ֫:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 50
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v0

    new-instance v1, Ll/ܰۗ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 51
    invoke-virtual {v0, v1}, Ll/ۤۤܺ;->֫(Ll/ܽܶܺ;)Ll/ۤۤܺ;

    move-result-object v0

    .line 53
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۤۤܺ;->֫()Ll/ۤۤܺ;

    move-result-object v1

    new-instance v2, Ll/ۘ᩺ۘ;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Ll/ۘ᩺ۘ;-><init>(I)V

    invoke-virtual {v1, v2}, Ll/ۤۤܺ;->֫(Ll/ܽܶܺ;)Ll/ۤۤܺ;

    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Ll/ۤۤܺ;->֫(Ljava/util/Comparator;)Ll/ۤۤܺ;

    move-result-object v0

    sput-object v0, Ll/᩻ᩳۧ;->ۧ:Ll/ۤۤܺ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩻ᩳۧ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 156
    iget-object v0, p0, Ll/᩻ᩳۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ֫(J)Ll/ܳ۬ܺ;
    .locals 8

    .line 80
    iget-object v0, p0, Ll/᩻ᩳۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ۘۧ;

    iget-wide v2, v2, Ll/۬ۘۧ;->ᩳ:J

    cmp-long v4, p1, v2

    if-gez v4, :cond_0

    goto :goto_3

    .line 84
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    .line 85
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 86
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬ۘۧ;

    .line 87
    iget-wide v5, v4, Ll/۬ۘۧ;->ᩳ:J

    cmp-long v7, p1, v5

    if-ltz v7, :cond_1

    iget-wide v5, v4, Ll/۬ۘۧ;->ܽ:J

    cmp-long v7, p1, v5

    if-gez v7, :cond_1

    .line 88
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    :cond_1
    iget-wide v4, v4, Ll/۬ۘۧ;->ᩳ:J

    cmp-long v6, p1, v4

    if-gez v6, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 94
    :cond_3
    :goto_1
    sget-object p1, Ll/᩻ᩳۧ;->ۧ:Ll/ۤۤܺ;

    .line 95
    invoke-static {p1, v2}, Ll/ܳ۬ܺ;->֫(Ljava/util/Comparator;Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p1

    .line 726
    new-instance p2, Ll/֫۬ܺ;

    invoke-direct {p2}, Ll/֫۬ܺ;-><init>()V

    .line 97
    :goto_2
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 98
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ۘۧ;

    iget-object v0, v0, Ll/۬ۘۧ;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {p2, v0}, Ll/ۛۗܺ;->֫(Ljava/util/List;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 100
    :cond_4
    invoke-virtual {p2}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p1

    return-object p1

    .line 81
    :cond_5
    :goto_3
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/۬ۘۧ;J)Z
    .locals 8

    .line 64
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

    .line 65
    iget-wide v5, p1, Ll/۬ۘۧ;->ۧ:J

    cmp-long v7, v5, v3

    if-eqz v7, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-static {v3}, Ll/᩺֡֫;->֫(Z)V

    cmp-long v3, v0, p2

    if-gtz v3, :cond_2

    .line 66
    iget-wide v3, p1, Ll/۬ۘۧ;->ܽ:J

    cmp-long v5, p2, v3

    if-gez v5, :cond_2

    const/4 p2, 0x1

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    .line 68
    :goto_2
    iget-object p3, p0, Ll/᩻ᩳۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    :goto_3
    if-ltz v3, :cond_4

    .line 69
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬ۘۧ;

    iget-wide v4, v4, Ll/۬ۘۧ;->ᩳ:J

    cmp-long v6, v0, v4

    if-ltz v6, :cond_3

    add-int/lit8 v3, v3, 0x1

    .line 70
    invoke-virtual {p3, v3, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return p2

    :cond_3
    add-int/lit8 v3, v3, -0x1

    goto :goto_3

    .line 74
    :cond_4
    invoke-virtual {p3, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return p2
.end method

.method public final ۧ(J)J
    .locals 9

    .line 120
    iget-object v0, p0, Ll/᩻ᩳۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ۘۧ;

    iget-wide v2, v2, Ll/۬ۘۧ;->ᩳ:J

    cmp-long v4, p1, v2

    if-gez v4, :cond_0

    goto :goto_2

    .line 123
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ۘۧ;

    iget-wide v2, v2, Ll/۬ۘۧ;->ᩳ:J

    .line 124
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_2

    .line 125
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬ۘۧ;

    iget-wide v4, v4, Ll/۬ۘۧ;->ᩳ:J

    .line 126
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۬ۘۧ;

    iget-wide v6, v6, Ll/۬ۘۧ;->ܽ:J

    cmp-long v8, v6, p1

    if-gtz v8, :cond_1

    .line 128
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    goto :goto_1

    :cond_1
    cmp-long v6, v4, p1

    if-gtz v6, :cond_2

    .line 130
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-wide v2

    :cond_3
    :goto_2
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p1
.end method

.method public final ܽ(J)J
    .locals 10

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v2, 0x0

    move-wide v3, v0

    .line 141
    :goto_0
    iget-object v5, p0, Ll/᩻ᩳۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v2, v6, :cond_4

    .line 142
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۬ۘۧ;

    iget-wide v6, v6, Ll/۬ۘۧ;->ᩳ:J

    .line 143
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۬ۘۧ;

    iget-wide v8, v5, Ll/۬ۘۧ;->ܽ:J

    cmp-long v5, p1, v6

    if-gez v5, :cond_1

    cmp-long p1, v3, v0

    if-nez p1, :cond_0

    move-wide v3, v6

    goto :goto_2

    .line 145
    :cond_0
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    goto :goto_2

    :cond_1
    cmp-long v5, p1, v8

    if-gez v5, :cond_3

    cmp-long v5, v3, v0

    if-nez v5, :cond_2

    move-wide v3, v8

    goto :goto_1

    .line 148
    :cond_2
    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    cmp-long p1, v3, v0

    if-eqz p1, :cond_5

    return-wide v3

    :cond_5
    const-wide/high16 p1, -0x8000000000000000L

    return-wide p1
.end method

.method public final ᩳ(J)V
    .locals 6

    const/4 v0, 0x0

    .line 105
    :goto_0
    iget-object v1, p0, Ll/᩻ᩳۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 106
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ۘۧ;

    iget-wide v2, v2, Ll/۬ۘۧ;->ᩳ:J

    cmp-long v4, p1, v2

    if-lez v4, :cond_0

    .line 107
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ۘۧ;

    iget-wide v2, v2, Ll/۬ۘۧ;->ܽ:J

    cmp-long v5, p1, v2

    if-lez v5, :cond_0

    .line 110
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_0
    if-gez v4, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method
