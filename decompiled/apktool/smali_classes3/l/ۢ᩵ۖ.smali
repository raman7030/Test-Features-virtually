.class public final Ll/ۢ᩵ۖ;
.super Ljava/lang/Object;
.source "19QT"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    iput-object p1, p0, Ll/ۢ᩵ۖ;->᩸:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 113
    iget-object v0, p0, Ll/ۢ᩵ۖ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 119
    iget-object v0, p0, Ll/ۢ᩵ۖ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 120
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ll/ۡ᩵ۖ;

    if-eqz v1, :cond_0

    .line 121
    new-instance v1, Ll/᩷᩵ۖ;

    invoke-direct {v1, v0}, Ll/᩷᩵ۖ;-><init>(Ljava/util/Map$Entry;)V

    return-object v1

    :cond_0
    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ۢ᩵ۖ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void
.end method
