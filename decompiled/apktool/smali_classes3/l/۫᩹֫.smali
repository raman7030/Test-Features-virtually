.class public final Ll/۫᩹֫;
.super Ljava/lang/Object;
.source "Y8PU"


# instance fields
.field public ֫:J

.field public ۧ:F

.field public ܽ:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x14

    .line 114
    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/۫᩹֫;->֫:J

    const-wide/16 v0, 0x1f4

    .line 116
    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/۫᩹֫;->ܽ:J

    const v0, 0x3f7fbe77    # 0.999f

    .line 117
    iput v0, p0, Ll/۫᩹֫;->ۧ:F

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۤ᩹֫;
    .locals 7

    .line 246
    new-instance v6, Ll/ۤ᩹֫;

    iget-wide v4, p0, Ll/۫᩹֫;->ܽ:J

    iget v1, p0, Ll/۫᩹֫;->ۧ:F

    iget-wide v2, p0, Ll/۫᩹֫;->֫:J

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۤ᩹֫;-><init>(FJJ)V

    return-object v6
.end method
