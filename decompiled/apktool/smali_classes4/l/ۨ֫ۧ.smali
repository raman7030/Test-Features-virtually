.class public final Ll/ۨ֫ۧ;
.super Ljava/lang/Object;
.source "T8RT"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public final ֫:Ll/۠ᩴ֫;


# direct methods
.method public constructor <init>(Ll/۠ᩴ֫;)V
    .locals 0

    .line 838
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 839
    iput-object p1, p0, Ll/ۨ֫ۧ;->֫:Ll/۠ᩴ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 0

    const p2, 0x7fffffff

    .line 862
    invoke-interface {p1, p2}, Ll/۠᩷ۧ;->ۧ(I)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 849
    invoke-interface {p1, v0, v1}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    .line 850
    new-instance v1, Ll/᩷ۢۧ;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v1, v2, v3}, Ll/᩷ۢۧ;-><init>(J)V

    invoke-interface {p1, v1}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 851
    invoke-interface {p1}, Ll/᩸᩷ۧ;->ܳ()V

    .line 854
    iget-object p1, p0, Ll/ۨ֫ۧ;->֫:Ll/۠ᩴ֫;

    invoke-virtual {p1}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v1

    const-string v2, "text/x-unknown"

    .line 855
    invoke-virtual {v1, v2}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    iget-object p1, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 856
    invoke-virtual {v1, p1}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    .line 857
    invoke-virtual {v1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    .line 852
    invoke-interface {v0, p1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 0

    const/4 p1, 0x1

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
