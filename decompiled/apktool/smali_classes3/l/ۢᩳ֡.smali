.class public final Ll/ۢᩳ֡;
.super Ljava/lang/Object;
.source "L3AO"


# instance fields
.field public final ֫:Ll/۫ܽ֡;

.field public final ۧ:J

.field public ܳ:Z

.field public final ܽ:Ll/ۚᩳ֡;

.field public final ܿ:Ll/֨ᩳ֡;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(J)V
    .locals 3

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ll/۫ܽ֡;

    invoke-direct {v0}, Ll/۫ܽ֡;-><init>()V

    iput-object v0, p0, Ll/ۢᩳ֡;->֫:Ll/۫ܽ֡;

    .line 41
    new-instance v0, Ll/ۜᩳ֡;

    invoke-direct {v0, p0}, Ll/ۜᩳ֡;-><init>(Ll/ۢᩳ֡;)V

    iput-object v0, p0, Ll/ۢᩳ֡;->ܽ:Ll/ۚᩳ֡;

    .line 42
    new-instance v0, Ll/᩷ᩳ֡;

    invoke-direct {v0, p0}, Ll/᩷ᩳ֡;-><init>(Ll/ۢᩳ֡;)V

    iput-object v0, p0, Ll/ۢᩳ֡;->ܿ:Ll/֨ᩳ֡;

    const-wide/16 v0, 0x1

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 48
    iput-wide p1, p0, Ll/ۢᩳ֡;->ۧ:J

    return-void

    .line 46
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "maxBufferSize < 1: "

    .line 0
    invoke-static {p1, p2, v1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 46
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫()Ll/ۚᩳ֡;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۢᩳ֡;->ܽ:Ll/ۚᩳ֡;

    return-object v0
.end method

.method public final ۧ()Ll/֨ᩳ֡;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ۢᩳ֡;->ܿ:Ll/֨ᩳ֡;

    return-object v0
.end method
