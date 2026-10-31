.class public final Ll/ۤܳۘ;
.super Ljava/lang/Object;
.source "21KW"


# instance fields
.field public ֫:I

.field public final ۧ:Ll/ۢ᩵ᩴ;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 32
    iput v0, p0, Ll/ۤܳۘ;->֫:I

    .line 35
    new-instance v0, Ll/ۢ᩵ᩴ;

    .line 111
    invoke-direct {v0, p1}, Ll/ۢ᩵ᩴ;-><init>(I)V

    .line 35
    iput-object v0, p0, Ll/ۤܳۘ;->ۧ:Ll/ۢ᩵ᩴ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    iget-object v1, p0, Ll/ۤܳۘ;->ۧ:Ll/ۢ᩵ᩴ;

    invoke-virtual {v1}, Ll/ۢ᩵ᩴ;->֫֫()Ll/ᩴۚᩴ;

    move-result-object v1

    invoke-interface {v1}, Ll/ᩴۚᩴ;->iterator()Ll/۫֡ᩴ;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗᩴᩴ;

    .line 98
    invoke-interface {v2}, Ll/ۗᩴᩴ;->᩷()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(II[Ljava/lang/Object;)[I
    .locals 6

    .line 48
    array-length v0, p3

    sub-int/2addr v0, p1

    sub-int/2addr v0, p2

    if-nez v0, :cond_0

    .line 59
    sget-object v0, Ll/۫ܳۘ;->֫:[I

    goto :goto_0

    :cond_0
    new-array v0, v0, [I

    :goto_0
    move v1, p1

    .line 49
    :goto_1
    array-length v2, p3

    sub-int/2addr v2, p2

    if-ge v1, v2, :cond_3

    .line 50
    aget-object v2, p3, v1

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_2

    .line 70
    :cond_1
    iget-object v3, p0, Ll/ۤܳۘ;->ۧ:Ll/ۢ᩵ᩴ;

    invoke-virtual {v3, v2}, Ll/ۢ᩵ᩴ;->ۧ(Ljava/lang/Object;)I

    move-result v4

    if-nez v4, :cond_2

    .line 72
    iget v4, p0, Ll/ۤܳۘ;->֫:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Ll/ۤܳۘ;->֫:I

    .line 73
    invoke-virtual {v3, v4, v2}, Ll/ۢ᩵ᩴ;->֫(ILjava/lang/Object;)I

    neg-int v2, v4

    goto :goto_2

    :cond_2
    move v2, v4

    :goto_2
    neg-int v3, v2

    .line 59
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int v3, v1, p1

    .line 52
    aput v2, v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-object v0
.end method
