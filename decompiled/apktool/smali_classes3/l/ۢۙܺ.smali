.class public abstract Ll/ۢۙܺ;
.super Ll/᩶ۨܺ;
.source "V52N"


# instance fields
.field public ᩸:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ll/᩶ۨܺ;-><init>()V

    .line 51
    iput-object p1, p0, Ll/ۢۙܺ;->᩸:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ۢۙܺ;->᩸:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 68
    iget-object v0, p0, Ll/ۢۙܺ;->᩸:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 72
    invoke-virtual {p0, v0}, Ll/ۢۙܺ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ll/ۢۙܺ;->᩸:Ljava/lang/Object;

    return-object v0

    .line 69
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public abstract ֫(Ljava/lang/Object;)Ljava/lang/Object;
.end method
