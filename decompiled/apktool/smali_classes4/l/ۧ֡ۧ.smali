.class public final Ll/ۧ֡ۧ;
.super Ljava/lang/Object;
.source "L8NY"

# interfaces
.implements Ll/ܰۘۧ;


# instance fields
.field public final ᩶:[J

.field public final ᩸:Ljava/util/List;

.field public final ᩹:[J


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 6

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۧ֡ۧ;->᩸:Ljava/util/List;

    .line 38
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [J

    iput-object v0, p0, Ll/ۧ֡ۧ;->᩹:[J

    const/4 v0, 0x0

    .line 39
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 40
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩵ۧ;

    mul-int/lit8 v2, v0, 0x2

    .line 42
    iget-object v3, p0, Ll/ۧ֡ۧ;->᩹:[J

    iget-wide v4, v1, Ll/ۗ᩵ۧ;->ܽ:J

    aput-wide v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    .line 43
    iget-wide v4, v1, Ll/ۗ᩵ۧ;->ۧ:J

    aput-wide v4, v3, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 45
    :cond_0
    iget-object p1, p0, Ll/ۧ֡ۧ;->᩹:[J

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iput-object p1, p0, Ll/ۧ֡ۧ;->᩶:[J

    .line 46
    invoke-static {p1}, Ljava/util/Arrays;->sort([J)V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ۧ֡ۧ;->᩶:[J

    array-length v0, v0

    return v0
.end method

.method public final ֫(J)I
    .locals 2

    const/4 v0, 0x0

    .line 51
    iget-object v1, p0, Ll/ۧ֡ۧ;->᩶:[J

    invoke-static {v1, p1, p2, v0}, Ll/ۘ֨֫;->֫([JJZ)I

    move-result p1

    .line 52
    array-length p2, v1

    if-ge p1, p2, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(I)J
    .locals 3

    const/4 v0, 0x0

    if-ltz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 62
    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 63
    iget-object v1, p0, Ll/ۧ֡ۧ;->᩶:[J

    array-length v2, v1

    if-ge p1, v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 64
    aget-wide v0, v1, p1

    return-wide v0
.end method

.method public final ܽ(J)Ljava/util/List;
    .locals 10

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 71
    :goto_0
    iget-object v4, p0, Ll/ۧ֡ۧ;->᩸:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_2

    mul-int/lit8 v5, v3, 0x2

    .line 72
    iget-object v6, p0, Ll/ۧ֡ۧ;->᩹:[J

    aget-wide v7, v6, v5

    cmp-long v9, v7, p1

    if-gtz v9, :cond_1

    add-int/lit8 v5, v5, 0x1

    aget-wide v5, v6, v5

    cmp-long v7, p1, v5

    if-gez v7, :cond_1

    .line 73
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗ᩵ۧ;

    .line 74
    iget-object v5, v4, Ll/ۗ᩵ۧ;->֫:Ll/᩶֡֫;

    iget v6, v5, Ll/᩶֡֫;->ܽ:F

    const v7, -0x800001

    cmpl-float v6, v6, v7

    if-nez v6, :cond_0

    .line 75
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 77
    :cond_0
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 83
    :cond_2
    new-instance p1, Ll/֫֡ۧ;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/֫֡ۧ;-><init>(I)V

    invoke-static {v1, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 84
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v2, p1, :cond_3

    .line 85
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗ᩵ۧ;

    iget-object p1, p1, Ll/ۗ᩵ۧ;->֫:Ll/᩶֡֫;

    .line 86
    invoke-virtual {p1}, Ll/᩶֡֫;->֫()Ll/᩹֡֫;

    move-result-object p1

    rsub-int/lit8 p2, v2, -0x1

    int-to-float p2, p2

    const/4 v3, 0x1

    invoke-virtual {p1, p2, v3}, Ll/᩹֡֫;->֫(FI)V

    invoke-virtual {p1}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    return-object v0
.end method
