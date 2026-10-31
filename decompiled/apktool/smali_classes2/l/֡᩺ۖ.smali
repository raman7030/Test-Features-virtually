.class public final Ll/֡᩺ۖ;
.super Ll/֨᩺ۖ;
.source "09JC"


# instance fields
.field public ۧ:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    sget-object v0, Ll/۠᩺ۖ;->ۙ:Ll/۠᩺ۖ;

    invoke-direct {p0, v0}, Ll/֨᩺ۖ;-><init>(Ll/۠᩺ۖ;)V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡᩺ۖ;->ۧ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 39
    sget-object v0, Ll/۠᩺ۖ;->ۙ:Ll/۠᩺ۖ;

    invoke-direct {p0, v0}, Ll/֨᩺ۖ;-><init>(Ll/۠᩺ۖ;)V

    .line 40
    iput-object p1, p0, Ll/֡᩺ۖ;->ۧ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/֡᩺ۖ;->ۧ:Ljava/util/List;

    return-object v0
.end method

.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 6

    .line 60
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 62
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v2

    int-to-long v2, v2

    const-class v4, Ll/֡ۨۖ;

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;Ll/۟۫ۖ;)Ll/᩸ܰۖ;

    move-result-object v2

    check-cast v2, Ll/֡ۨۖ;

    iget-object v3, p0, Ll/֡᩺ۖ;->ۧ:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩳ(Ll/֡֫ۘ;)I
    .locals 4

    .line 45
    iget-object v0, p0, Ll/֡᩺ۖ;->ۧ:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 49
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ۧ(I)V

    .line 51
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ۨۖ;

    .line 52
    invoke-virtual {v2}, Ll/֡ۨۖ;->getValue()J

    move-result-wide v2

    long-to-int v3, v2

    invoke-virtual {p1, v3}, Ll/ۤܰۖ;->ۧ(I)V

    goto :goto_0

    .line 54
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x2

    return p1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot serialize an empty or null cipherList"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
