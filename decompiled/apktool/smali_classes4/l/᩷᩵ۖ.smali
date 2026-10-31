.class public final Ll/᩷᩵ۖ;
.super Ljava/lang/Object;
.source "19QT"

# interfaces
.implements Ljava/util/Map$Entry;


# instance fields
.field public ᩸:Ljava/util/Map$Entry;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ljava/util/Map$Entry;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Ll/᩷᩵ۖ;->᩸:Ljava/util/Map$Entry;

    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/᩷᩵ۖ;->᩸:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 82
    iget-object v0, p0, Ll/᩷᩵ۖ;->᩸:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡ᩵ۖ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 86
    :cond_0
    invoke-virtual {v0}, Ll/ۡ᩵ۖ;->ܽ()Ll/ۡ֡ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 95
    instance-of v0, p1, Ll/ۡ֡ۖ;

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Ll/᩷᩵ۖ;->᩸:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡ᩵ۖ;

    check-cast p1, Ll/ۡ֡ۖ;

    invoke-virtual {v0, p1}, Ll/ܺ᩵ۖ;->ۧ(Ll/ۡ֡ۖ;)Ll/ۡ֡ۖ;

    move-result-object p1

    return-object p1

    .line 96
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Ll/ۡ᩵ۖ;
    .locals 1

    .line 90
    iget-object v0, p0, Ll/᩷᩵ۖ;->᩸:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡ᩵ۖ;

    return-object v0
.end method
