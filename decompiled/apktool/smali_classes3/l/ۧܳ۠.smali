.class public abstract Ll/ۧܳ۠;
.super Ljava/lang/Object;
.source "K7QT"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 447
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Ljava/lang/String;)Ll/֫᩶۠;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract ֫(Ljava/lang/Iterable;)V
.end method

.method public abstract ֫(Ljava/lang/Iterable;Ljava/lang/String;)V
.end method

.method public abstract ֫(Ll/֡ۖ۠;Ljava/lang/String;)Z
.end method

.method public abstract ֫(Ll/᩷۠ᩴ;)Z
.end method

.method public ۧ(Ll/᩷۠ᩴ;)Ll/֫᩶۠;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public ܳ()Ljava/lang/Iterable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract ܽ()Ljava/util/Collection;
.end method

.method public ܿ()Z
    .locals 1

    .line 458
    invoke-virtual {p0}, Ll/ۧܳ۠;->ܽ()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ᩳ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
