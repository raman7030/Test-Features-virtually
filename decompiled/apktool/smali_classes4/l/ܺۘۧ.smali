.class public final Ll/ܺۘۧ;
.super Ljava/lang/Object;
.source "C8R0"

# interfaces
.implements Ll/֡ۘۧ;


# instance fields
.field public ֫:J

.field public ۧ:J

.field public ܽ:Ll/ۤ᩷ۧ;

.field public ᩳ:Ll/ۛ᩷ۧ;


# direct methods
.method public constructor <init>(Ll/ۛ᩷ۧ;Ll/ۤ᩷ۧ;)V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-object p1, p0, Ll/ܺۘۧ;->ᩳ:Ll/ۛ᩷ۧ;

    .line 130
    iput-object p2, p0, Ll/ܺۘۧ;->ܽ:Ll/ۤ᩷ۧ;

    const-wide/16 p1, -0x1

    .line 131
    iput-wide p1, p0, Ll/ܺۘۧ;->֫:J

    .line 132
    iput-wide p1, p0, Ll/ܺۘۧ;->ۧ:J

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;)J
    .locals 6

    .line 141
    iget-wide v0, p0, Ll/ܺۘۧ;->ۧ:J

    const-wide/16 v2, 0x0

    const-wide/16 v4, -0x1

    cmp-long p1, v0, v2

    if-ltz p1, :cond_0

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    neg-long v0, v0

    .line 143
    iput-wide v4, p0, Ll/ܺۘۧ;->ۧ:J

    return-wide v0

    :cond_0
    return-wide v4
.end method

.method public final ֫()Ll/ۢۢۧ;
    .locals 5

    .line 160
    iget-wide v0, p0, Ll/ܺۘۧ;->֫:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 161
    new-instance v0, Ll/۫᩷ۧ;

    iget-object v1, p0, Ll/ܺۘۧ;->ᩳ:Ll/ۛ᩷ۧ;

    iget-wide v2, p0, Ll/ܺۘۧ;->֫:J

    invoke-direct {v0, v1, v2, v3}, Ll/۫᩷ۧ;-><init>(Ll/ۛ᩷ۧ;J)V

    return-object v0
.end method

.method public final ֫(J)V
    .locals 2

    .line 151
    iget-object v0, p0, Ll/ܺۘۧ;->ܽ:Ll/ۤ᩷ۧ;

    iget-object v0, v0, Ll/ۤ᩷ۧ;->ۧ:[J

    const/4 v1, 0x1

    .line 153
    invoke-static {v0, p1, p2, v1}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result p1

    .line 155
    aget-wide p1, v0, p1

    iput-wide p1, p0, Ll/ܺۘۧ;->ۧ:J

    return-void
.end method

.method public final ۧ(J)V
    .locals 0

    .line 136
    iput-wide p1, p0, Ll/ܺۘۧ;->֫:J

    return-void
.end method
