.class public final Ll/ۗ۬ܺ;
.super Ljava/lang/Object;
.source "W3U9"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final ᩸:Ll/ܳ۬ܺ;


# direct methods
.method public constructor <init>(Ll/ܳ۬ܺ;)V
    .locals 0

    .line 865
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 866
    iput-object p1, p0, Ll/ۗ۬ܺ;->᩸:Ll/ܳ۬ܺ;

    return-void
.end method


# virtual methods
.method public readResolve()Ljava/lang/Object;
    .locals 2

    .line 870
    iget-object v0, p0, Ll/ۗ۬ܺ;->᩸:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 871
    invoke-static {}, Ll/۬۬ܺ;->ܽ()Ll/۬۬ܺ;

    move-result-object v0

    return-object v0

    .line 872
    :cond_0
    invoke-static {}, Ll/ܰۤܺ;->ᩳ()Ll/ܰۤܺ;

    move-result-object v1

    invoke-static {v1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳ۬ܺ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 873
    invoke-static {}, Ll/۬۬ܺ;->ۧ()Ll/۬۬ܺ;

    move-result-object v0

    return-object v0

    .line 875
    :cond_1
    new-instance v1, Ll/۬۬ܺ;

    invoke-direct {v1, v0}, Ll/۬۬ܺ;-><init>(Ll/ܳ۬ܺ;)V

    return-object v1
.end method
