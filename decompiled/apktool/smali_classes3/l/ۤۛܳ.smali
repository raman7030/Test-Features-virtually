.class public final Ll/ۤۛܳ;
.super Ljava/lang/Object;
.source "J8EC"


# instance fields
.field public final ֫:Ll/ܳ۠ܳ;

.field public final ۧ:Ll/ܽۢܳ;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Ll/ۤۛܳ;->ۧ:Ll/ܽۢܳ;

    .line 16
    new-instance v0, Ll/ܳ۠ܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ܳ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    .line 17
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->᩻()V

    .line 18
    invoke-virtual {v0}, Ll/ܳ۠ܳ;->ܿ()V

    iput-object v0, p0, Ll/ۤۛܳ;->֫:Ll/ܳ۠ܳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ۛܳ;)V
    .locals 6

    .line 22
    invoke-virtual {p1}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۤۛܳ;->֫:Ll/ܳ۠ܳ;

    invoke-virtual {v2, v0, v1}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Ll/ۤ֨ܳ;)V

    .line 23
    invoke-virtual {p1}, Ll/۫ۛܳ;->ᩳ()Ll/ܺۨܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺۨܳ;->getName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1201e1

    invoke-virtual {v2, v1, v0}, Ll/ܳ۠ܳ;->֫(ILjava/lang/String;)Ll/۟֨ܳ;

    .line 24
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v0

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    .line 25
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Ll/۟֨ܳ;->֫(I)V

    .line 27
    :cond_0
    invoke-virtual {p1}, Ll/۫ۛܳ;->ܽ()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Ll/ܳ۠ܳ;->֫(J)Ll/۟֨ܳ;

    .line 28
    invoke-virtual {v2}, Ll/ܳ۠ܳ;->ۜ()V

    .line 29
    invoke-virtual {v2}, Ll/ܳ۠ܳ;->ۧ()Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Ll/ۤۛܳ;->ۧ:Ll/ܽۢܳ;

    invoke-static {v0, v1, p1}, Ll/ۛ۫ܳ;->ۧ(Landroid/widget/Button;Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    return-void
.end method
