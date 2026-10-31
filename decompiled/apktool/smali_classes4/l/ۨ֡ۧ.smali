.class public final Ll/ۨ֡ۧ;
.super Ljava/lang/Object;
.source "38I8"

# interfaces
.implements Ll/ᩳۚۧ;


# instance fields
.field public ֫:Ll/۠ᩴ֫;

.field public ۧ:Ll/᩵ۢۧ;

.field public ܽ:Ll/ۢ֨֫;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    const-string v1, "video/mp2t"

    .line 53
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    .line 54
    invoke-virtual {v0, p1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 55
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ֡ۧ;->֫:Ll/۠ᩴ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢ֨֫;Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 0

    .line 63
    iput-object p1, p0, Ll/ۨ֡ۧ;->ܽ:Ll/ۢ֨֫;

    .line 64
    invoke-virtual {p3}, Ll/᩵ۚۧ;->֫()V

    .line 65
    invoke-virtual {p3}, Ll/᩵ۚۧ;->ܽ()I

    move-result p1

    const/4 p3, 0x5

    invoke-interface {p2, p1, p3}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ֡ۧ;->ۧ:Ll/᩵ۢۧ;

    .line 68
    iget-object p2, p0, Ll/ۨ֡ۧ;->֫:Ll/۠ᩴ֫;

    invoke-interface {p1, p2}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 8

    .line 91
    iget-object v0, p0, Ll/ۨ֡ۧ;->ܽ:Ll/ۢ֨֫;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 92
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 74
    iget-object v0, p0, Ll/ۨ֡ۧ;->ܽ:Ll/ۢ֨֫;

    invoke-virtual {v0}, Ll/ۢ֨֫;->ۧ()J

    move-result-wide v2

    .line 75
    iget-object v0, p0, Ll/ۨ֡ۧ;->ܽ:Ll/ۢ֨֫;

    invoke-virtual {v0}, Ll/ۢ֨֫;->ܽ()J

    move-result-wide v0

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    cmp-long v6, v0, v4

    if-nez v6, :cond_0

    goto :goto_0

    .line 80
    :cond_0
    iget-object v4, p0, Ll/ۨ֡ۧ;->֫:Ll/۠ᩴ֫;

    iget-wide v5, v4, Ll/۠ᩴ֫;->ܳ֫:J

    cmp-long v7, v0, v5

    if-eqz v7, :cond_1

    .line 81
    invoke-virtual {v4}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Ll/֨ᩴ֫;->֫(J)V

    invoke-virtual {v4}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ֡ۧ;->֫:Ll/۠ᩴ֫;

    .line 82
    iget-object v1, p0, Ll/ۨ֡ۧ;->ۧ:Ll/᩵ۢۧ;

    invoke-interface {v1, v0}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 84
    :cond_1
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v5

    .line 85
    iget-object v0, p0, Ll/ۨ֡ۧ;->ۧ:Ll/᩵ۢۧ;

    invoke-interface {v0, v5, p1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 86
    iget-object v1, p0, Ll/ۨ֡ۧ;->ۧ:Ll/᩵ۢۧ;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x1

    invoke-interface/range {v1 .. v7}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    :cond_2
    :goto_0
    return-void
.end method
