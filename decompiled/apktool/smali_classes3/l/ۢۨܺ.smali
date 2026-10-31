.class public abstract Ll/ۢۨܺ;
.super Ljava/lang/Object;
.source "Q5IE"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ᩸:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    iput-object p1, p0, Ll/ۢۨܺ;->᩸:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ۢۨܺ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/ۢۨܺ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢۨܺ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۢۨܺ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void
.end method

.method public abstract ֫(Ljava/lang/Object;)Ljava/lang/Object;
.end method
