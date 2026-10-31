.class public final Ll/ܺۡۧ;
.super Ljava/lang/Object;
.source "W8N9"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public final ֫:Ll/֨᩷ۧ;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    .line 72
    new-instance p1, Ll/ܺۢۧ;

    const/4 v0, 0x2

    const-string v1, "image/jpeg"

    const v2, 0xffd8

    invoke-direct {p1, v2, v0, v1}, Ll/ܺۢۧ;-><init>(IILjava/lang/String;)V

    iput-object p1, p0, Ll/ܺۡۧ;->֫:Ll/֨᩷ۧ;

    return-void

    .line 76
    :cond_0
    new-instance p1, Ll/ۖۡۧ;

    invoke-direct {p1}, Ll/ۖۡۧ;-><init>()V

    iput-object p1, p0, Ll/ܺۡۧ;->֫:Ll/֨᩷ۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ܺۡۧ;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0, p1, p2}, Ll/֨᩷ۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result p1

    return p1
.end method

.method public final ֫()V
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ܺۡۧ;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0}, Ll/֨᩷ۧ;->֫()V

    return-void
.end method

.method public final ֫(JJ)V
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ܺۡۧ;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0, p1, p2, p3, p4}, Ll/֨᩷ۧ;->֫(JJ)V

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ܺۡۧ;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0, p1}, Ll/֨᩷ۧ;->֫(Ll/᩸᩷ۧ;)V

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 1

    .line 82
    iget-object v0, p0, Ll/ܺۡۧ;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0, p1}, Ll/֨᩷ۧ;->֫(Ll/۠᩷ۧ;)Z

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
