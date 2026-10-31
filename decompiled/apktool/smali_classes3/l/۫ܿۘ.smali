.class public final Ll/۫ܿۘ;
.super Ljava/lang/Object;
.source "K1MJ"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ᩸:Ll/۬ܿۘ;


# direct methods
.method public constructor <init>(Ll/۬ܿۘ;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Ll/۫ܿۘ;->᩸:Ll/۬ܿۘ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 82
    iget-object v0, p0, Ll/۫ܿۘ;->᩸:Ll/۬ܿۘ;

    invoke-interface {v0}, Ll/۬ܿۘ;->֫()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 6

    .line 87
    new-instance v0, Ll/᩹ܳۘ;

    iget-object v1, p0, Ll/۫ܿۘ;->᩸:Ll/۬ܿۘ;

    invoke-interface {v1}, Ll/۬ܿۘ;->ᩳ()I

    move-result v2

    invoke-interface {v1}, Ll/۬ܿۘ;->ܽ()I

    move-result v3

    invoke-interface {v1}, Ll/۬ܿۘ;->ܿ()I

    move-result v4

    invoke-interface {v1}, Ll/۬ܿۘ;->ۧ()I

    move-result v5

    invoke-direct {v0, v2, v3, v4, v5}, Ll/᩹ܳۘ;-><init>(IIII)V

    .line 88
    invoke-interface {v1}, Ll/۬ܿۘ;->next()V

    return-object v0
.end method
