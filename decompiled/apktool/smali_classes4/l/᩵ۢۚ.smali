.class public final Ll/᩵ۢۚ;
.super Ljava/lang/Object;
.source "O6BJ"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩸:Ll/ۚۢۚ;

.field public final synthetic ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ll/ۚۢۚ;Ljava/util/Iterator;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۢۚ;->᩸:Ll/ۚۢۚ;

    iput-object p2, p0, Ll/᩵ۢۚ;->᩹:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 57
    iget-object v0, p0, Ll/᩵ۢۚ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 62
    new-instance v0, Ll/֡ۢۚ;

    iget-object v1, p0, Ll/᩵ۢۚ;->᩸:Ll/ۚۢۚ;

    invoke-direct {v0, v1}, Ll/֡ۢۚ;-><init>(Ll/ۚۢۚ;)V

    .line 63
    iget-object v1, p0, Ll/᩵ۢۚ;->᩹:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ll/֡ۢۚ;->֫(Ll/֡ۢۚ;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 69
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
