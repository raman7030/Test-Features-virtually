.class public final Ll/᩶ۘۧ;
.super Ljava/lang/Object;
.source "D8TM"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public final ֫:Ll/ܺۢۧ;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ll/ܺۢۧ;

    const/4 v1, 0x2

    const-string v2, "image/png"

    const v3, 0x8950

    invoke-direct {v0, v3, v1, v2}, Ll/ܺۢۧ;-><init>(IILjava/lang/String;)V

    iput-object v0, p0, Ll/᩶ۘۧ;->֫:Ll/ܺۢۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 1

    .line 57
    iget-object v0, p0, Ll/᩶ۘۧ;->֫:Ll/ܺۢۧ;

    invoke-virtual {v0, p1, p2}, Ll/ܺۢۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result p1

    return p1
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 1

    .line 62
    iget-object v0, p0, Ll/᩶ۘۧ;->֫:Ll/ܺۢۧ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ܺۢۧ;->֫(JJ)V

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 1

    .line 51
    iget-object v0, p0, Ll/᩶ۘۧ;->֫:Ll/ܺۢۧ;

    invoke-virtual {v0, p1}, Ll/ܺۢۧ;->֫(Ll/᩸᩷ۧ;)V

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 1

    .line 46
    iget-object v0, p0, Ll/᩶ۘۧ;->֫:Ll/ܺۢۧ;

    invoke-virtual {v0, p1}, Ll/ܺۢۧ;->֫(Ll/۠᩷ۧ;)Z

    move-result p1

    return p1
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
