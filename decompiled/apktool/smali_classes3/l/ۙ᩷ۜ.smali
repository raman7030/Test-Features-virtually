.class public final Ll/ۙ᩷ۜ;
.super Ljava/lang/Object;
.source "1799"

# interfaces
.implements Ll/ۡۢۜ;


# instance fields
.field public final ֫:Z

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 625
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 626
    iput-object p1, p0, Ll/ۙ᩷ۜ;->ۧ:Ljava/lang/String;

    .line 627
    iput-object p2, p0, Ll/ۙ᩷ۜ;->ܽ:Ljava/lang/String;

    .line 628
    iput-boolean p3, p0, Ll/ۙ᩷ۜ;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢۢۜ;
    .locals 0

    .line 703
    sget-object p1, Ll/ۢۢۜ;->ۗ:Ll/ۢۢۜ;

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 678
    iget-boolean v0, p0, Ll/ۙ᩷ۜ;->֫:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۙ᩷ۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۙ᩷ۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
