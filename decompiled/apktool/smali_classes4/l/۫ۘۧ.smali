.class public final Ll/۫ۘۧ;
.super Ljava/lang/Object;
.source "I8HK"

# interfaces
.implements Ll/ܰۘۧ;


# static fields
.field public static final ᩶:Ll/ۤۤܺ;


# instance fields
.field public final ᩸:Ll/ܳ۬ܺ;

.field public final ᩹:[J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 45
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v0

    new-instance v1, Ll/ۘ᩺ۘ;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Ll/ۘ᩺ۘ;-><init>(I)V

    invoke-virtual {v0, v1}, Ll/ۤۤܺ;->֫(Ll/ܽܶܺ;)Ll/ۤۤܺ;

    move-result-object v0

    sput-object v0, Ll/۫ۘۧ;->᩶:Ll/ۤۤܺ;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 18

    move-object/from16 v0, p0

    .line 47
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v6, 0x1

    if-ne v1, v6, :cond_2

    .line 49
    invoke-static/range {p1 .. p1}, Ll/ۡ۫ܺ;->֫(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۘۧ;

    .line 50
    iget-wide v7, v1, Ll/۬ۘۧ;->ᩳ:J

    iget-object v9, v1, Ll/۬ۘۧ;->֫:Ll/ܳ۬ܺ;

    iget-wide v10, v1, Ll/۬ۘۧ;->ۧ:J

    cmp-long v1, v7, v4

    if-nez v1, :cond_0

    const-wide/16 v7, 0x0

    :cond_0
    cmp-long v1, v10, v4

    if-nez v1, :cond_1

    .line 52
    invoke-static {v9}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v1

    iput-object v1, v0, Ll/۫ۘۧ;->᩸:Ll/ܳ۬ܺ;

    new-array v1, v6, [J

    aput-wide v7, v1, v3

    .line 53
    iput-object v1, v0, Ll/۫ۘۧ;->᩹:[J

    return-void

    .line 55
    :cond_1
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-static {v9, v1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v1

    iput-object v1, v0, Ll/۫ۘۧ;->᩸:Ll/ܳ۬ܺ;

    add-long/2addr v10, v7

    new-array v1, v2, [J

    aput-wide v7, v1, v3

    aput-wide v10, v1, v6

    .line 56
    iput-object v1, v0, Ll/۫ۘۧ;->᩹:[J

    return-void

    .line 61
    :cond_2
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [J

    iput-object v1, v0, Ll/۫ۘۧ;->᩹:[J

    const-wide v6, 0x7fffffffffffffffL

    .line 64
    invoke-static {v1, v6, v7}, Ljava/util/Arrays;->fill([JJ)V

    .line 65
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 66
    sget-object v2, Ll/۫ۘۧ;->᩶:Ll/ۤۤܺ;

    move-object/from16 v6, p1

    .line 67
    invoke-static {v2, v6}, Ll/ܳ۬ܺ;->֫(Ljava/util/Comparator;Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v2

    const/4 v6, 0x0

    .line 69
    :goto_0
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v7

    if-ge v3, v7, :cond_8

    .line 70
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۬ۘۧ;

    .line 72
    iget-wide v8, v7, Ll/۬ۘۧ;->ᩳ:J

    iget-wide v10, v7, Ll/۬ۘۧ;->ۧ:J

    iget-object v7, v7, Ll/۬ۘۧ;->֫:Ll/ܳ۬ܺ;

    cmp-long v12, v8, v4

    if-nez v12, :cond_3

    const-wide/16 v8, 0x0

    :cond_3
    add-long v12, v8, v10

    if-eqz v6, :cond_6

    .line 74
    iget-object v14, v0, Ll/۫ۘۧ;->᩹:[J

    add-int/lit8 v15, v6, -0x1

    aget-wide v16, v14, v15

    cmp-long v14, v16, v8

    if-gez v14, :cond_4

    goto :goto_1

    :cond_4
    if-nez v14, :cond_5

    .line 78
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ܳ۬ܺ;

    invoke-virtual {v14}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_5

    .line 81
    invoke-virtual {v1, v15, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    const-string v14, "Truncating unsupported overlapping cues."

    .line 83
    invoke-static {v14}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 86
    iget-object v14, v0, Ll/۫ۘۧ;->᩹:[J

    aput-wide v8, v14, v15

    .line 87
    invoke-virtual {v1, v15, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 75
    :cond_6
    :goto_1
    iget-object v14, v0, Ll/۫ۘۧ;->᩹:[J

    add-int/lit8 v15, v6, 0x1

    aput-wide v8, v14, v6

    .line 76
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v6, v15

    :goto_2
    cmp-long v7, v10, v4

    if-eqz v7, :cond_7

    .line 90
    iget-object v7, v0, Ll/۫ۘۧ;->᩹:[J

    add-int/lit8 v8, v6, 0x1

    aput-wide v12, v7, v6

    .line 91
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v6, v8

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 94
    :cond_8
    invoke-static {v1}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v1

    iput-object v1, v0, Ll/۫ۘۧ;->᩸:Ll/ܳ۬ܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 107
    iget-object v0, p0, Ll/۫ۘۧ;->᩸:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(J)I
    .locals 2

    .line 99
    iget-object v0, p0, Ll/۫ۘۧ;->᩹:[J

    const/4 v1, 0x0

    .line 100
    invoke-static {v0, p1, p2, v1}, Ll/ۘ֨֫;->֫([JJZ)I

    move-result p1

    .line 102
    iget-object p2, p0, Ll/۫ۘۧ;->᩸:Ll/ܳ۬ܺ;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    if-ge p1, p2, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(I)J
    .locals 3

    .line 112
    iget-object v0, p0, Ll/۫ۘۧ;->᩸:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 113
    iget-object v0, p0, Ll/۫ۘۧ;->᩹:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public final ܽ(J)Ljava/util/List;
    .locals 2

    .line 118
    iget-object v0, p0, Ll/۫ۘۧ;->᩹:[J

    const/4 v1, 0x0

    .line 119
    invoke-static {v0, p1, p2, v1}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    .line 121
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p2, p0, Ll/۫ۘۧ;->᩸:Ll/ܳ۬ܺ;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳ۬ܺ;

    return-object p1
.end method
