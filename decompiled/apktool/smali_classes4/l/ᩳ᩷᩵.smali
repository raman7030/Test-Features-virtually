.class public abstract Ll/ᩳ᩷᩵;
.super Ljava/lang/Object;
.source "S9US"


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۧ:Ljava/util/List;

.field public ܳ:Z

.field public final ܽ:Ljava/util/List;

.field public ܿ:I

.field public ᩳ:I

.field public final ᩻:Ljava/util/List;


# direct methods
.method public constructor <init>(IIZ)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput p1, p0, Ll/ᩳ᩷᩵;->ᩳ:I

    .line 58
    iput p2, p0, Ll/ᩳ᩷᩵;->ܿ:I

    .line 59
    iput-boolean p3, p0, Ll/ᩳ᩷᩵;->ܳ:Z

    .line 60
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    invoke-static {p1}, Ll/᩶۬ᩴ;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳ᩷᩵;->᩻:Ljava/util/List;

    .line 61
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    invoke-static {p1}, Ll/᩶۬ᩴ;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    .line 62
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    invoke-static {p1}, Ll/᩶۬ᩴ;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳ᩷᩵;->ܽ:Ljava/util/List;

    .line 63
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    invoke-static {p1}, Ll/᩶۬ᩴ;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳ᩷᩵;->֫:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 6

    .line 133
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, p0, Ll/ᩳ᩷᩵;->ܽ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    add-int/2addr v4, v2

    iget-object v2, p0, Ll/ᩳ᩷᩵;->֫:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    add-int/2addr v5, v4

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 134
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 135
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 136
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 108
    iput p1, p0, Ll/ᩳ᩷᩵;->ᩳ:I

    return-void
.end method

.method public final ۖ()Z
    .locals 1

    .line 189
    iget v0, p0, Ll/ᩳ᩷᩵;->ᩳ:I

    and-int/lit8 v0, v0, 0xf

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Z
    .locals 2

    .line 122
    iget-object v0, p0, Ll/ᩳ᩷᩵;->᩻:Ljava/util/List;

    .line 129
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    .line 144
    iget-object v1, p0, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    .line 151
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    .line 158
    iget-object v0, p0, Ll/ᩳ᩷᩵;->ܽ:Ljava/util/List;

    .line 165
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    add-int/2addr v0, v1

    .line 172
    iget-object v1, p0, Ll/ᩳ᩷᩵;->֫:Ljava/util/List;

    .line 179
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    if-nez v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ()Z
    .locals 2

    .line 234
    iget v0, p0, Ll/ᩳ᩷᩵;->ᩳ:I

    const v1, 0x8000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Z
    .locals 2

    .line 225
    iget v0, p0, Ll/ᩳ᩷᩵;->ᩳ:I

    const v1, 0x8000

    and-int/2addr v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 144
    iget-object v0, p0, Ll/ᩳ᩷᩵;->ۧ:Ljava/util/List;

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 94
    iput p1, p0, Ll/ᩳ᩷᩵;->ܿ:I

    return-void
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 122
    iget-object v0, p0, Ll/ᩳ᩷᩵;->᩻:Ljava/util/List;

    return-object v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 207
    iget v0, p0, Ll/ᩳ᩷᩵;->ᩳ:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 101
    iget v0, p0, Ll/ᩳ᩷᩵;->ᩳ:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 198
    iget v0, p0, Ll/ᩳ᩷᩵;->ᩳ:I

    and-int/lit16 v0, v0, 0x7800

    shr-int/lit8 v0, v0, 0xb

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 87
    iget-boolean v0, p0, Ll/ᩳ᩷᩵;->ܳ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Ll/ᩳ᩷᩵;->ܿ:I

    return v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Ll/ᩳ᩷᩵;->ܳ:Z

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 216
    iget v0, p0, Ll/ᩳ᩷᩵;->ᩳ:I

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
