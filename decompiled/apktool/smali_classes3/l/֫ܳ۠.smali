.class public final Ll/֫ܳ۠;
.super Ll/۠ܳ۠;
.source "K7QT"


# instance fields
.field public final synthetic ܳ:Ll/᩹ܳ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܳ۠;)V
    .locals 4

    .line 753
    iput-object p1, p0, Ll/֫ܳ۠;->ܳ:Ll/᩹ܳ۠;

    .line 754
    sget-object v0, Ll/᩷᩶۠;->ۗ:Ll/᩷᩶۠;

    const/4 v1, 0x1

    new-array v1, v1, [Ll/֡ۖ۠;

    sget-object v2, Ll/֡ۖ۠;->ܿ֫:Ll/֡ۖ۠;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, p1, v0, v1}, Ll/۠ܳ۠;-><init>(Ll/᩹ܳ۠;Ll/֫᩶۠;[Ll/֡ۖ۠;)V

    return-void
.end method


# virtual methods
.method public final ۜ()Ll/֨ܳ۠;
    .locals 4

    .line 788
    new-instance v0, Ll/֨ܳ۠;

    iget-object v1, p0, Ll/֫ܳ۠;->ܳ:Ll/᩹ܳ۠;

    invoke-direct {v0, v1}, Ll/֨ܳ۠;-><init>(Ll/᩹ܳ۠;)V

    .line 789
    invoke-virtual {v0}, Ll/֨ܳ۠;->ܽ()V

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "."

    .line 790
    invoke-virtual {v1, v3, v2}, Ll/᩹ܳ۠;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֨ܳ۠;->֫(Ll/᩷۠ᩴ;)V

    return-object v0
.end method

.method public final ܽ()Ljava/util/Collection;
    .locals 1

    .line 794
    iget-object v0, p0, Ll/۠ܳ۠;->ᩳ:Ljava/util/Collection;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 795
    invoke-virtual {p0, v0}, Ll/۠ܳ۠;->֫(Ljava/lang/Iterable;)V

    .line 760
    :cond_0
    iget-object v0, p0, Ll/۠ܳ۠;->ᩳ:Ljava/util/Collection;

    return-object v0
.end method

.method public final ᩻()Ll/֨ܳ۠;
    .locals 2

    const-string v0, "env.class.path"

    .line 769
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v1, "application.home"

    .line 774
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v0, "java.class.path"

    .line 775
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    const-string v0, "."

    .line 783
    :cond_1
    invoke-virtual {p0}, Ll/֫ܳ۠;->ۜ()Ll/֨ܳ۠;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/֨ܳ۠;->֫(Ljava/lang/String;)V

    return-object v1
.end method
