.class public final Ll/֫᩷ۧ;
.super Ljava/lang/Object;
.source "88UO"

# interfaces
.implements Ll/ۢۢۧ;


# instance fields
.field public final ֫:J

.field public final ۧ:J

.field public final ܳ:Ll/ᩳ᩷ۧ;

.field public final ܽ:J

.field public final ܿ:J

.field public final ᩳ:J


# direct methods
.method public constructor <init>(Ll/ᩳ᩷ۧ;JJJJJ)V
    .locals 0

    .line 508
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 509
    iput-object p1, p0, Ll/֫᩷ۧ;->ܳ:Ll/ᩳ᩷ۧ;

    .line 510
    iput-wide p2, p0, Ll/֫᩷ۧ;->ᩳ:J

    .line 512
    iput-wide p4, p0, Ll/֫᩷ۧ;->ܽ:J

    .line 513
    iput-wide p6, p0, Ll/֫᩷ۧ;->ܿ:J

    .line 514
    iput-wide p8, p0, Ll/֫᩷ۧ;->ۧ:J

    .line 515
    iput-wide p10, p0, Ll/֫᩷ۧ;->֫:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫᩷ۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/֫᩷ۧ;->֫:J

    return-wide v0
.end method

.method public static bridge synthetic ۧ(Ll/֫᩷ۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/֫᩷ۧ;->ۧ:J

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/֫᩷ۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/֫᩷ۧ;->ܽ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩳ(Ll/֫᩷ۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/֫᩷ۧ;->ܿ:J

    return-wide v0
.end method


# virtual methods
.method public final ֫(J)Ll/ۜۢۧ;
    .locals 13

    .line 525
    iget-object v0, p0, Ll/֫᩷ۧ;->ܳ:Ll/ᩳ᩷ۧ;

    .line 527
    invoke-interface {v0, p1, p2}, Ll/ᩳ᩷ۧ;->֫(J)J

    move-result-wide v1

    iget-wide v9, p0, Ll/֫᩷ۧ;->ۧ:J

    iget-wide v11, p0, Ll/֫᩷ۧ;->֫:J

    const-wide/16 v3, 0x0

    .line 526
    iget-wide v5, p0, Ll/֫᩷ۧ;->ܽ:J

    iget-wide v7, p0, Ll/֫᩷ۧ;->ܿ:J

    invoke-static/range {v1 .. v12}, Ll/ܽ᩷ۧ;->֫(JJJJJJ)J

    move-result-wide v0

    .line 533
    new-instance v2, Ll/ۜۢۧ;

    new-instance v3, Ll/ۡۢۧ;

    invoke-direct {v3, p1, p2, v0, v1}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 83
    invoke-direct {v2, v3, v3}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object v2
.end method

.method public final ۜ()J
    .locals 2

    .line 538
    iget-wide v0, p0, Ll/֫᩷ۧ;->ᩳ:J

    return-wide v0
.end method

.method public final ܽ(J)J
    .locals 1

    .line 545
    iget-object v0, p0, Ll/֫᩷ۧ;->ܳ:Ll/ᩳ᩷ۧ;

    invoke-interface {v0, p1, p2}, Ll/ᩳ᩷ۧ;->֫(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
