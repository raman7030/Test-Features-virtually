.class public final Ll/ᩳۧۧ;
.super Ljava/lang/Object;
.source "U8U5"

# interfaces
.implements Ll/ۢۧۧ;
.implements Ll/᩷ۧۧ;


# instance fields
.field public ۗ:Ll/ۘۧۧ;

.field public ۙ:Ll/ۢۧۧ;

.field public final ۤ:J

.field public ۫:J

.field public ۬:Z

.field public final ᩶:Ll/ܺۧۧ;

.field public final ᩸:Ll/᩸ܿۧ;

.field public ᩹:Ll/᩷ۧۧ;


# direct methods
.method public constructor <init>(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Ll/ᩳۧۧ;->᩶:Ll/ܺۧۧ;

    .line 80
    iput-object p2, p0, Ll/ᩳۧۧ;->᩸:Ll/᩸ܿۧ;

    .line 81
    iput-wide p3, p0, Ll/ᩳۧۧ;->ۤ:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 82
    iput-wide p1, p0, Ll/ᩳۧۧ;->۫:J

    return-void
.end method


# virtual methods
.method public final ֫(J)J
    .locals 2

    .line 209
    iget-object v0, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {v0, p1, p2}, Ll/ۢۧۧ;->֫(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ֫(JLl/ۢ۬֫;)J
    .locals 2

    .line 214
    iget-object v0, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {v0, p1, p2, p3}, Ll/ۢۧۧ;->֫(JLl/ۢ۬֫;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ֫([Ll/ۢܿۧ;[Z[Ll/ᩴܽۧ;[ZJ)J
    .locals 15

    move-object v0, p0

    .line 184
    iget-wide v1, v0, Ll/ᩳۧۧ;->۫:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v5, v0, Ll/ᩳۧۧ;->ۤ:J

    cmp-long v7, p5, v5

    if-nez v7, :cond_0

    move-wide v13, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v13, p5

    .line 187
    :goto_0
    iput-wide v3, v0, Ll/ᩳۧۧ;->۫:J

    .line 188
    iget-object v8, v0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    .line 189
    invoke-interface/range {v8 .. v14}, Ll/ۢۧۧ;->֫([Ll/ۢܿۧ;[Z[Ll/ᩴܽۧ;[ZJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public final ֫(JZ)V
    .locals 2

    .line 194
    iget-object v0, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {v0, p1, p2, p3}, Ll/ۢۧۧ;->֫(JZ)V

    return-void
.end method

.method public final ֫(Ll/֡ܽۧ;)V
    .locals 1

    .line 40
    check-cast p1, Ll/ۢۧۧ;

    .line 239
    iget-object p1, p0, Ll/ᩳۧۧ;->᩹:Ll/᩷ۧۧ;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {p1, p0}, Ll/᩵ܽۧ;->֫(Ll/֡ܽۧ;)V

    return-void
.end method

.method public final ֫(Ll/ۘۧۧ;)V
    .locals 1

    .line 118
    iget-object v0, p0, Ll/ᩳۧۧ;->ۗ:Ll/ۘۧۧ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 119
    iput-object p1, p0, Ll/ᩳۧۧ;->ۗ:Ll/ۘۧۧ;

    return-void
.end method

.method public final ֫(Ll/ۢۧۧ;)V
    .locals 1

    .line 246
    iget-object p1, p0, Ll/ᩳۧۧ;->᩹:Ll/᩷ۧۧ;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {p1, p0}, Ll/᩷ۧۧ;->֫(Ll/ۢۧۧ;)V

    return-void
.end method

.method public final ֫(Ll/ܺۧۧ;)V
    .locals 5

    .line 253
    iget-wide v0, p0, Ll/ᩳۧۧ;->۫:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Ll/ᩳۧۧ;->ۤ:J

    .line 131
    :goto_0
    iget-object v2, p0, Ll/ᩳۧۧ;->ۗ:Ll/ۘۧۧ;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    iget-object v3, p0, Ll/ᩳۧۧ;->᩸:Ll/᩸ܿۧ;

    invoke-interface {v2, p1, v3, v0, v1}, Ll/ۘۧۧ;->֫(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)Ll/ۢۧۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    .line 132
    iget-object v2, p0, Ll/ᩳۧۧ;->᩹:Ll/᩷ۧۧ;

    if-eqz v2, :cond_1

    .line 133
    invoke-interface {p1, p0, v0, v1}, Ll/ۢۧۧ;->֫(Ll/᩷ۧۧ;J)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/᩷ۧۧ;J)V
    .locals 3

    .line 146
    iput-object p1, p0, Ll/ᩳۧۧ;->᩹:Ll/᩷ۧۧ;

    .line 147
    iget-object p1, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    if-eqz p1, :cond_1

    .line 253
    iget-wide p2, p0, Ll/ᩳۧۧ;->۫:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p2, v0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide p2, p0, Ll/ᩳۧۧ;->ۤ:J

    .line 148
    :goto_0
    invoke-interface {p1, p0, p2, p3}, Ll/ۢۧۧ;->֫(Ll/᩷ۧۧ;J)V

    :cond_1
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 234
    iget-object v0, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/֡ܽۧ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ll/ۨۙ֫;)Z
    .locals 1

    .line 229
    iget-object v0, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ll/֡ܽۧ;->֫(Ll/ۨۙ֫;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۜ()J
    .locals 2

    .line 204
    iget-object v0, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {v0}, Ll/֡ܽۧ;->ۜ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ()J
    .locals 2

    .line 219
    iget-object v0, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {v0}, Ll/֡ܽۧ;->ۧ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(J)V
    .locals 2

    .line 224
    iget-object v0, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {v0, p1, p2}, Ll/֡ܽۧ;->ۧ(J)V

    return-void
.end method

.method public final ܳ()J
    .locals 2

    .line 98
    iget-wide v0, p0, Ll/ᩳۧۧ;->ۤ:J

    return-wide v0
.end method

.method public final ܽ()J
    .locals 2

    .line 199
    iget-object v0, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {v0}, Ll/ۢۧۧ;->ܽ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܽ(J)V
    .locals 0

    .line 108
    iput-wide p1, p0, Ll/ᩳۧۧ;->۫:J

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 156
    :try_start_0
    iget-object v0, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    if-eqz v0, :cond_0

    .line 157
    invoke-interface {v0}, Ll/ۢۧۧ;->ܿ()V

    return-void

    .line 158
    :cond_0
    iget-object v0, p0, Ll/ᩳۧۧ;->ۗ:Ll/ۘۧۧ;

    if-eqz v0, :cond_1

    .line 159
    invoke-interface {v0}, Ll/ۘۧۧ;->ۧ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception v0

    .line 163
    throw v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 113
    iget-wide v0, p0, Ll/ᩳۧۧ;->۫:J

    return-wide v0
.end method

.method public final ᩷()V
    .locals 2

    .line 139
    iget-object v0, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Ll/ᩳۧۧ;->ۗ:Ll/ۘۧۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    iget-object v1, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    invoke-interface {v0, v1}, Ll/ۘۧۧ;->֫(Ll/ۢۧۧ;)V

    :cond_0
    return-void
.end method

.method public final ᩻()Ll/ۛܽۧ;
    .locals 2

    .line 174
    iget-object v0, p0, Ll/ᩳۧۧ;->ۙ:Ll/ۢۧۧ;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {v0}, Ll/ۢۧۧ;->᩻()Ll/ۛܽۧ;

    move-result-object v0

    return-object v0
.end method
