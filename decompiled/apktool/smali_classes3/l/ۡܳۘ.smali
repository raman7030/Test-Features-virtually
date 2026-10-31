.class public final Ll/ۡܳۘ;
.super Ljava/lang/Object;
.source "V1N0"

# interfaces
.implements Ll/۬ܿۘ;


# instance fields
.field public final ֫:Ljava/util/Iterator;

.field public ۧ:Ll/᩹ܳۘ;


# direct methods
.method public constructor <init>(Ljava/util/Collection;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/ۡܳۘ;->֫:Ljava/util/Iterator;

    .line 47
    invoke-virtual {p0}, Ll/ۡܳۘ;->next()V

    return-void
.end method


# virtual methods
.method public final next()V
    .locals 2

    .line 57
    iget-object v0, p0, Ll/ۡܳۘ;->֫:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܳۘ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Ll/ۡܳۘ;->ۧ:Ll/᩹ܳۘ;

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ۡܳۘ;->ۧ:Ll/᩹ܳۘ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۡܳۘ;->ۧ:Ll/᩹ܳۘ;

    iget v0, v0, Ll/᩹ܳۘ;->ۧ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 72
    iget-object v0, p0, Ll/ۡܳۘ;->ۧ:Ll/᩹ܳۘ;

    iget v0, v0, Ll/᩹ܳۘ;->֫:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ۡܳۘ;->ۧ:Ll/᩹ܳۘ;

    iget v0, v0, Ll/᩹ܳۘ;->ᩳ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ۡܳۘ;->ۧ:Ll/᩹ܳۘ;

    iget v0, v0, Ll/᩹ܳۘ;->ܽ:I

    return v0
.end method
