.class public final Ll/᩹۬ܺ;
.super Ljava/lang/Object;
.source "V5XH"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩸:Ll/ۢ۬ܺ;


# direct methods
.method public constructor <init>(Ll/ۢ۬ܺ;)V
    .locals 0

    .line 414
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 415
    iput-object p1, p0, Ll/᩹۬ܺ;->᩸:Ll/ۢ۬ܺ;

    return-void
.end method


# virtual methods
.method public readResolve()Ljava/lang/Object;
    .locals 4

    .line 419
    iget-object v0, p0, Ll/᩹۬ܺ;->᩸:Ll/ۢ۬ܺ;

    invoke-virtual {v0}, Ll/ۢ۬ܺ;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 420
    invoke-static {}, Ll/᩶۬ܺ;->ۧ()Ll/᩶۬ܺ;

    move-result-object v0

    return-object v0

    .line 427
    :cond_0
    new-instance v1, Ll/᩸۬ܺ;

    invoke-direct {v1}, Ll/᩸۬ܺ;-><init>()V

    .line 428
    invoke-virtual {v0}, Ll/ۢ۬ܺ;->entrySet()Ll/ۛ۬ܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 429
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۤܺ;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ll/᩸۬ܺ;->֫(Ll/ܰۤܺ;Ljava/lang/Object;)V

    goto :goto_0

    .line 431
    :cond_1
    invoke-virtual {v1}, Ll/᩸۬ܺ;->֫()Ll/᩶۬ܺ;

    move-result-object v0

    return-object v0
.end method
