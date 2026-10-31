.class public final Ll/ܺ֡ۜ;
.super Ljava/lang/Object;
.source "H8BL"

# interfaces
.implements Ll/ۚ᩶ۜ;


# instance fields
.field public ۜ:Z

.field public final ۡ:Ll/֡᩶ۜ;

.field public ۢ:Z

.field public ۧ:Ll/ۚ᩶ۜ;

.field public final ܳ:Ll/᩸ܶۜ;

.field public final ܺ:Ll/֡᩶ۜ;

.field public final ܽ:Ll/ܽۚۜ;

.field public final ܿ:Ll/۠֡ۜ;

.field public final ᩳ:Ll/᩵᩶ۜ;

.field public ᩷:Z

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ܰܺܳ;Ll/ᩳۚۜ;Ll/᩵᩶ۜ;)V
    .locals 7

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Ll/ܺ֡ۜ;->᩻:Z

    .line 34
    iput-object p3, p0, Ll/ܺ֡ۜ;->ᩳ:Ll/᩵᩶ۜ;

    .line 50
    new-instance v0, Ll/ܽۚۜ;

    .line 83
    sget-object v5, Ll/ۧۚۜ;->᩶:Ll/ۧۚۜ;

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v1, v0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Ll/ܽۚۜ;-><init>(Ll/ۤۤۜ;Ll/ܰܺܳ;Ll/ᩳۚۜ;Ll/ۧۚۜ;Ll/᩻۬ۜ;)V

    .line 51
    new-instance p2, Ll/ᩴ֡ۜ;

    invoke-direct {p2, p3}, Ll/ᩴ֡ۜ;-><init>(Ll/᩵᩶ۜ;)V

    invoke-virtual {v0, p2}, Ll/ܽۚۜ;->֫(Ll/ۛۢᩴ;)V

    .line 35
    iput-object v0, p0, Ll/ܺ֡ۜ;->ܽ:Ll/ܽۚۜ;

    .line 36
    new-instance p2, Ll/ۢ֡ۜ;

    invoke-direct {p2, p0, p3}, Ll/ۢ֡ۜ;-><init>(Ll/ܺ֡ۜ;Ll/᩵᩶ۜ;)V

    iput-object p2, p0, Ll/ܺ֡ۜ;->ۡ:Ll/֡᩶ۜ;

    .line 77
    new-instance p3, Ll/ۡ֡ۜ;

    invoke-direct {p3, p0}, Ll/ۡ֡ۜ;-><init>(Ll/ܺ֡ۜ;)V

    iput-object p3, p0, Ll/ܺ֡ۜ;->ܺ:Ll/֡᩶ۜ;

    .line 118
    new-instance v1, Ll/۠֡ۜ;

    invoke-direct {v1, p1, v0, p2}, Ll/۠֡ۜ;-><init>(Ll/ܰܺܳ;Ll/ܽۚۜ;Ll/᩵᩶ۜ;)V

    iput-object v1, p0, Ll/ܺ֡ۜ;->ܿ:Ll/۠֡ۜ;

    .line 119
    new-instance p1, Ll/᩸ܶۜ;

    invoke-direct {p1, v0, p3}, Ll/᩸ܶۜ;-><init>(Ll/ܽۚۜ;Ll/᩵᩶ۜ;)V

    iput-object p1, p0, Ll/ܺ֡ۜ;->ܳ:Ll/᩸ܶۜ;

    .line 120
    iput-object v1, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺ֡ۜ;)Ll/۠֡ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺ֡ۜ;->ܿ:Ll/۠֡ۜ;

    return-object p0
.end method

.method public static ֫(Ll/ܺ֡ۜ;Ll/ۧ᩵֫;Ll/ۚ᩶ۜ;Ll/֡᩶ۜ;Ll/֡᩶ۜ;)V
    .locals 1

    .line 163
    iget-object v0, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    invoke-interface {v0}, Ll/ۚ᩶ۜ;->reset()V

    .line 164
    iput-object p2, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    .line 165
    sget-object p2, Ll/ۚ᩶ۜ;->֫:Ll/᩵᩶ۜ;

    invoke-virtual {p3, p2}, Ll/֡᩶ۜ;->֫(Ll/᩵᩶ۜ;)V

    .line 166
    iget-object p2, p0, Ll/ܺ֡ۜ;->ᩳ:Ll/᩵᩶ۜ;

    invoke-virtual {p4, p2}, Ll/֡᩶ۜ;->֫(Ll/᩵᩶ۜ;)V

    const/4 p2, 0x0

    .line 167
    iput-boolean p2, p0, Ll/ܺ֡ۜ;->ۜ:Z

    const/4 p2, 0x1

    .line 168
    iput-boolean p2, p0, Ll/ܺ֡ۜ;->᩷:Z

    .line 172
    iget-object p0, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    invoke-interface {p0, p1}, Ll/ۚ᩶ۜ;->֫(Ll/ۧ᩵֫;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺ֡ۜ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ܺ֡ۜ;->ۜ:Z

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܺ֡ۜ;)Ll/᩸ܶۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺ֡ۜ;->ܳ:Ll/᩸ܶۜ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ܺ֡ۜ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/ܺ֡ۜ;->᩷:Z

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ܺ֡ۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܺ֡ۜ;->᩻:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ܺ֡ۜ;)Ll/֡᩶ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺ֡ۜ;->ܺ:Ll/֡᩶ۜ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܺ֡ۜ;)Ll/֡᩶ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺ֡ۜ;->ۡ:Ll/֡᩶ۜ;

    return-object p0
.end method


# virtual methods
.method public final getCurrentPosition()I
    .locals 1

    .line 205
    iget-object v0, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    invoke-interface {v0}, Ll/ۚ᩶ۜ;->getCurrentPosition()I

    move-result v0

    return v0
.end method

.method public final isPlaying()Z
    .locals 1

    .line 251
    iget-object v0, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    invoke-interface {v0}, Ll/ۚ᩶ۜ;->isPlaying()Z

    move-result v0

    return v0
.end method

.method public final pause()V
    .locals 2

    .line 235
    iget-boolean v0, p0, Ll/ܺ֡ۜ;->᩷:Z

    if-eqz v0, :cond_0

    return-void

    .line 240
    :cond_0
    iget-boolean v0, p0, Ll/ܺ֡ۜ;->ۜ:Z

    if-eqz v0, :cond_1

    .line 190
    iget-object v0, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    invoke-interface {v0}, Ll/ۚ᩶ۜ;->pause()V

    return-void

    .line 245
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MusicPlayer is not prepared"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final reset()V
    .locals 1

    .line 195
    iget-object v0, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    invoke-interface {v0}, Ll/ۚ᩶ۜ;->reset()V

    return-void
.end method

.method public final start()V
    .locals 2

    .line 235
    iget-boolean v0, p0, Ll/ܺ֡ۜ;->᩷:Z

    if-eqz v0, :cond_0

    return-void

    .line 240
    :cond_0
    iget-boolean v0, p0, Ll/ܺ֡ۜ;->ۜ:Z

    if-eqz v0, :cond_1

    .line 181
    iget-object v0, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    invoke-interface {v0}, Ll/ۚ᩶ۜ;->start()V

    return-void

    .line 245
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MusicPlayer is not prepared"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫()V
    .locals 1

    .line 220
    iget-object v0, p0, Ll/ܺ֡ۜ;->ܿ:Ll/۠֡ۜ;

    invoke-virtual {v0}, Ll/۠֡ۜ;->֫()V

    .line 221
    iget-object v0, p0, Ll/ܺ֡ۜ;->ܳ:Ll/᩸ܶۜ;

    invoke-virtual {v0}, Ll/᩸ܶۜ;->֫()V

    .line 692
    iget-object v0, p0, Ll/ܺ֡ۜ;->ܽ:Ll/ܽۚۜ;

    invoke-virtual {v0}, Ll/ܽۚۜ;->ܿ()V

    .line 693
    invoke-virtual {v0}, Ll/ܽۚۜ;->ܽ()V

    const/4 v0, 0x1

    .line 223
    iput-boolean v0, p0, Ll/ܺ֡ۜ;->ۢ:Z

    return-void
.end method

.method public final ֫(F)V
    .locals 1

    .line 240
    iget-boolean v0, p0, Ll/ܺ֡ۜ;->ۜ:Z

    if-eqz v0, :cond_0

    .line 229
    iget-object v0, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    invoke-interface {v0, p1}, Ll/ۚ᩶ۜ;->֫(F)V

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܽ᩶ۜ;)V
    .locals 1

    .line 200
    iget-object v0, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    invoke-interface {v0, p1, p2}, Ll/ۚ᩶ۜ;->֫(ILl/ܽ᩶ۜ;)V

    return-void
.end method

.method public final ֫(Ll/ۧ᩵֫;)V
    .locals 7

    .line 235
    iget-boolean v0, p0, Ll/ܺ֡ۜ;->᩷:Z

    if-nez v0, :cond_4

    .line 256
    iget-boolean v0, p0, Ll/ܺ֡ۜ;->ۢ:Z

    if-nez v0, :cond_4

    .line 129
    iget-object v0, p1, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ۨᩴ֫;->ܳ:Ljava/lang/Object;

    instance-of v3, v0, Ll/ᩳۜܳ;

    if-eqz v3, :cond_0

    check-cast v0, Ll/ᩳۜܳ;

    .line 130
    invoke-interface {v0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v3, ".wav"

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 134
    :goto_0
    iput-boolean v0, p0, Ll/ܺ֡ۜ;->᩻:Z

    if-eqz v0, :cond_1

    .line 135
    iget-object v3, p0, Ll/ܺ֡ۜ;->ܿ:Ll/۠֡ۜ;

    goto :goto_1

    :cond_1
    iget-object v3, p0, Ll/ܺ֡ۜ;->ܳ:Ll/᩸ܶۜ;

    .line 136
    :goto_1
    iget-object v4, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    if-eq v4, v3, :cond_3

    .line 137
    invoke-interface {v4}, Ll/ۚ᩶ۜ;->reset()V

    .line 138
    iput-object v3, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    .line 139
    iget-object v3, p0, Ll/ܺ֡ۜ;->ᩳ:Ll/᩵᩶ۜ;

    iget-object v4, p0, Ll/ܺ֡ۜ;->ۡ:Ll/֡᩶ۜ;

    sget-object v5, Ll/ۚ᩶ۜ;->֫:Ll/᩵᩶ۜ;

    iget-object v6, p0, Ll/ܺ֡ۜ;->ܺ:Ll/֡᩶ۜ;

    if-eqz v0, :cond_2

    .line 140
    invoke-virtual {v6, v5}, Ll/֡᩶ۜ;->֫(Ll/᩵᩶ۜ;)V

    .line 141
    invoke-virtual {v4, v3}, Ll/֡᩶ۜ;->֫(Ll/᩵᩶ۜ;)V

    goto :goto_2

    .line 146
    :cond_2
    invoke-virtual {v4, v5}, Ll/֡᩶ۜ;->֫(Ll/᩵᩶ۜ;)V

    .line 147
    invoke-virtual {v6, v3}, Ll/֡᩶ۜ;->֫(Ll/᩵᩶ۜ;)V

    .line 153
    :cond_3
    :goto_2
    iput-boolean v1, p0, Ll/ܺ֡ۜ;->ۜ:Z

    .line 154
    iput-boolean v2, p0, Ll/ܺ֡ۜ;->᩷:Z

    .line 155
    iget-object v0, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    invoke-interface {v0, p1}, Ll/ۚ᩶ۜ;->֫(Ll/ۧ᩵֫;)V

    return-void

    .line 126
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ۧ()V
    .locals 1

    .line 210
    iget-object v0, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    invoke-interface {v0}, Ll/ۚ᩶ۜ;->ۧ()V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 240
    iget-boolean v0, p0, Ll/ܺ֡ۜ;->ۜ:Z

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 235
    iget-boolean v0, p0, Ll/ܺ֡ۜ;->᩷:Z

    return v0
.end method

.method public final ᩳ()V
    .locals 1

    .line 215
    iget-object v0, p0, Ll/ܺ֡ۜ;->ۧ:Ll/ۚ᩶ۜ;

    invoke-interface {v0}, Ll/ۚ᩶ۜ;->ᩳ()V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 256
    iget-boolean v0, p0, Ll/ܺ֡ۜ;->ۢ:Z

    return v0
.end method
