.class public final Ll/ܰۢۜ;
.super Ljava/lang/Object;
.source "A6ZJ"


# instance fields
.field public final ֫:Ll/ۛۢۜ;

.field public final ۧ:Z

.field public final ܽ:Ljava/lang/String;

.field public final ᩳ:Ll/ۜܺۜ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۜܺۜ;Ll/ۛۢۜ;Z)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "path"

    .line 21
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    const-string p1, "targetType"

    .line 22
    invoke-static {p2, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p2, p0, Ll/ܰۢۜ;->ᩳ:Ll/ۜܺۜ;

    const-string p1, "access"

    .line 23
    invoke-static {p3, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p3, p0, Ll/ܰۢۜ;->֫:Ll/ۛۢۜ;

    .line 24
    iput-boolean p4, p0, Ll/ܰۢۜ;->ۧ:Z

    return-void
.end method

.method public static ֫(Ljava/util/List;)V
    .locals 6

    .line 38
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 39
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x0

    .line 40
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 41
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۢۜ;

    .line 42
    iget-object v3, v2, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 43
    invoke-virtual {v2}, Ll/ܰۢۜ;->֫()Z

    move-result v3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    if-ne v1, v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    if-ne v3, v5, :cond_2

    .line 44
    invoke-virtual {v2}, Ll/ܰۢۜ;->֫()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v2, v2, Ll/ܰۢۜ;->ᩳ:Ll/ۜܺۜ;

    sget-object v3, Ll/ۜܺۜ;->᩶:Ll/ۜܺۜ;

    if-ne v2, v3, :cond_2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 45
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Root directory rule must be last"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 42
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Duplicate file access rule path"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    return-void

    .line 38
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Root rule is required"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ֫()Z
    .locals 2

    .line 33
    iget-object v0, p0, Ll/ܰۢۜ;->ܽ:Ljava/lang/String;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
