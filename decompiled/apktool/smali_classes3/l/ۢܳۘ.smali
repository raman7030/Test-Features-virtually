.class public final Ll/ۢܳۘ;
.super Ljava/lang/Object;
.source "Z1LO"

# interfaces
.implements Ll/֫ܳۘ;


# instance fields
.field public final ֫:Ll/֫ܳۘ;


# direct methods
.method public constructor <init>(Ll/֫ܳۘ;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Ll/ۢܳۘ;->֫:Ll/֫ܳۘ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܰܿۘ;
    .locals 1

    .line 41
    new-instance v0, Ll/ܰܿۘ;

    invoke-direct {v0, p0}, Ll/ܰܿۘ;-><init>(Ll/֫ܳۘ;)V

    return-object v0
.end method

.method public final ۧ()Ljava/lang/Iterable;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ܳ()Ljava/util/Iterator;
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ۢܳۘ;->֫:Ll/֫ܳۘ;

    invoke-interface {v0}, Ll/֫ܳۘ;->ܽ()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/util/Iterator;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/ۢܳۘ;->֫:Ll/֫ܳۘ;

    invoke-interface {v0}, Ll/֫ܳۘ;->ܳ()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ۢܳۘ;->֫:Ll/֫ܳۘ;

    invoke-interface {v0}, Ll/֫ܳۘ;->ܿ()I

    move-result v0

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 39
    iget-object v0, p0, Ll/ۢܳۘ;->֫:Ll/֫ܳۘ;

    invoke-interface {v0}, Ll/֫ܳۘ;->ᩳ()I

    move-result v0

    return v0
.end method
