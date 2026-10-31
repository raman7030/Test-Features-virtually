.class public final Ll/ۛۙۜ;
.super Ljava/lang/Object;
.source "Z74U"

# interfaces
.implements Ll/ۢ۬ۜ;


# instance fields
.field public final ᩸:Ll/ۧ᩵֫;


# direct methods
.method public constructor <init>(Ll/ۤۙۜ;Ljava/lang/String;)V
    .locals 2

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ll/᩹ᩴ֫;

    invoke-direct {v0}, Ll/᩹ᩴ֫;-><init>()V

    .line 19
    invoke-virtual {p1}, Ll/ۤۙۜ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩹ᩴ֫;->ۧ(Ljava/lang/String;)V

    .line 20
    invoke-virtual {p1, p2}, Ll/ۤۙۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ll/᩹ᩴ֫;->֫(Ljava/lang/String;)V

    .line 21
    invoke-virtual {p1}, Ll/ۤۙۜ;->ܽ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ll/᩹ᩴ֫;->֫(Ljava/lang/Object;)V

    .line 22
    invoke-virtual {p1}, Ll/ۤۙۜ;->֫()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 23
    invoke-virtual {v0}, Ll/᩹ᩴ֫;->ۧ()V

    .line 25
    :cond_0
    invoke-virtual {v0}, Ll/᩹ᩴ֫;->֫()Ll/ۧ᩵֫;

    move-result-object p1

    iput-object p1, p0, Ll/ۛۙۜ;->᩸:Ll/ۧ᩵֫;

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۜ()V
    .locals 0

    return-void
.end method

.method public final ܳ()Ll/ۧ᩵֫;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ۛۙۜ;->᩸:Ll/ۧ᩵֫;

    return-object v0
.end method

.method public final ܽ()Ll/ᩳۜܳ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()V
    .locals 0

    return-void
.end method
