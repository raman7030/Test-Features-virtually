.class public final Ll/֡ܰܿ;
.super Ll/۟ܶۡ;
.source "C5GL"


# instance fields
.field public final synthetic ۜ:Ll/ۚܰܿ;

.field public final ܳ:Ll/ᩳܽܳ;

.field public final ᩻:Ll/۠ܰܿ;


# direct methods
.method public constructor <init>(Ll/ۚܰܿ;Ll/ᩳܽܳ;Ll/۠ܰܿ;)V
    .locals 0

    .line 1112
    iput-object p1, p0, Ll/֡ܰܿ;->ۜ:Ll/ۚܰܿ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 1113
    iput-object p2, p0, Ll/֡ܰܿ;->ܳ:Ll/ᩳܽܳ;

    .line 1114
    iput-object p3, p0, Ll/֡ܰܿ;->᩻:Ll/۠ܰܿ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 4

    .line 1153
    iget-object v0, p0, Ll/֡ܰܿ;->ۜ:Ll/ۚܰܿ;

    invoke-static {v0}, Ll/ۚܰܿ;->ܽ(Ll/ۚܰܿ;)Ll/֡ܰܿ;

    move-result-object v1

    if-ne v1, p0, :cond_1

    invoke-static {v0}, Ll/ۚܰܿ;->ᩳ(Ll/ۚܰܿ;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/ۚܰܿ;->᩷(Ll/ۚܰܿ;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1154
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    if-eqz v1, :cond_1

    .line 290
    iget-object v1, v1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v1

    .line 1155
    iget-object v2, p0, Ll/֡ܰܿ;->ܳ:Ll/ᩳܽܳ;

    if-ne v1, v2, :cond_1

    invoke-static {v0}, Ll/ۚܰܿ;->ۡ(Ll/ۚܰܿ;)Ll/۠ܰܿ;

    move-result-object v1

    iget-object v3, p0, Ll/֡ܰܿ;->᩻:Ll/۠ܰܿ;

    if-ne v1, v3, :cond_1

    invoke-static {v0}, Ll/ۚܰܿ;->ۧ(Ll/ۚܰܿ;)Ll/ᩴܰܿ;

    move-result-object v1

    .line 1156
    invoke-virtual {v1, v2}, Ll/ᩴܰܿ;->֫(Ll/ᩳܽܳ;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1135
    instance-of p1, p1, Ll/ۚᩳܳ;

    if-eqz p1, :cond_0

    .line 1136
    invoke-virtual {v0}, Ll/ۚܰܿ;->ܽ֫()V

    return-void

    :cond_0
    const p1, 0x7f1207da

    .line 1140
    invoke-virtual {v0, p1}, Ll/ۗܺ᩷;->ۧ(I)V

    :cond_1
    return-void
.end method

.method public final ۧ()V
    .locals 0

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 1123
    iget-object v0, p0, Ll/֡ܰܿ;->᩻:Ll/۠ܰܿ;

    invoke-virtual {v0}, Ll/۠ܰܿ;->ܳ()V

    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 1146
    iget-object v0, p0, Ll/֡ܰܿ;->ۜ:Ll/ۚܰܿ;

    invoke-static {v0}, Ll/ۚܰܿ;->ܽ(Ll/ۚܰܿ;)Ll/֡ܰܿ;

    move-result-object v1

    if-ne v1, p0, :cond_0

    .line 1147
    invoke-static {v0}, Ll/ۚܰܿ;->ܺ(Ll/ۚܰܿ;)V

    :cond_0
    return-void
.end method
