.class public final Ll/᩻ۘܳ;
.super Ljava/lang/Object;
.source "J26J"

# interfaces
.implements Ll/ܿۡۡ;


# instance fields
.field public final synthetic ֫:Ll/ۢۘܳ;


# direct methods
.method public constructor <init>(Ll/ۢۘܳ;)V
    .locals 0

    .line 969
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۘܳ;->֫:Ll/ۢۘܳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 972
    iget-object v0, p0, Ll/᩻ۘܳ;->֫:Ll/ۢۘܳ;

    invoke-virtual {v0}, Ll/ۢۘܳ;->ۜ()Ll/ܽۢܳ;

    move-result-object v0

    iget-object v0, v0, Ll/ܽۢܳ;->ۤ:Ll/ۢۢܳ;

    .line 973
    invoke-virtual {v0}, Ll/ۢۢܳ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 974
    invoke-virtual {v0, p1}, Ll/ۢۢܳ;->֫(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܳۡۡ;)V
    .locals 1

    .line 980
    invoke-virtual {p1}, Ll/ܳۡۡ;->ۧ()Z

    move-result p1

    if-nez p1, :cond_0

    .line 981
    iget-object p1, p0, Ll/᩻ۘܳ;->֫:Ll/ۢۘܳ;

    invoke-virtual {p1}, Ll/ۢۘܳ;->ۜ()Ll/ܽۢܳ;

    move-result-object p1

    iget-object p1, p1, Ll/ܽۢܳ;->ۤ:Ll/ۢۢܳ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۢۢܳ;->֫(Z)V

    :cond_0
    return-void
.end method

.method public final synthetic ۧ(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
