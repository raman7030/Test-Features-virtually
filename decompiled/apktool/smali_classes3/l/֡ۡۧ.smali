.class public final Ll/֡ۡۧ;
.super Ll/᩺᩷ۧ;
.source "Z8II"


# instance fields
.field public final synthetic ۧ:Ll/ۚۡۧ;

.field public final synthetic ܽ:Ll/ۢۢۧ;


# direct methods
.method public constructor <init>(Ll/ۚۡۧ;Ll/ۢۢۧ;Ll/ۢۢۧ;)V
    .locals 0

    .line 58
    iput-object p1, p0, Ll/֡ۡۧ;->ۧ:Ll/ۚۡۧ;

    iput-object p3, p0, Ll/֡ۡۧ;->ܽ:Ll/ۢۢۧ;

    invoke-direct {p0, p2}, Ll/᩺᩷ۧ;-><init>(Ll/ۢۢۧ;)V

    return-void
.end method


# virtual methods
.method public final ֫(J)Ll/ۜۢۧ;
    .locals 9

    .line 61
    iget-object v0, p0, Ll/֡ۡۧ;->ܽ:Ll/ۢۢۧ;

    invoke-interface {v0, p1, p2}, Ll/ۢۢۧ;->֫(J)Ll/ۜۢۧ;

    move-result-object p1

    .line 62
    new-instance p2, Ll/ۜۢۧ;

    new-instance v0, Ll/ۡۢۧ;

    iget-object v1, p1, Ll/ۜۢۧ;->֫:Ll/ۡۢۧ;

    iget-wide v2, v1, Ll/ۡۢۧ;->ۧ:J

    iget-wide v4, v1, Ll/ۡۢۧ;->֫:J

    iget-object v1, p0, Ll/֡ۡۧ;->ۧ:Ll/ۚۡۧ;

    invoke-static {v1}, Ll/ۚۡۧ;->֫(Ll/ۚۡۧ;)J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-direct {v0, v2, v3, v4, v5}, Ll/ۡۢۧ;-><init>(JJ)V

    new-instance v2, Ll/ۡۢۧ;

    iget-object p1, p1, Ll/ۜۢۧ;->ۧ:Ll/ۡۢۧ;

    iget-wide v3, p1, Ll/ۡۢۧ;->ۧ:J

    iget-wide v5, p1, Ll/ۡۢۧ;->֫:J

    invoke-static {v1}, Ll/ۚۡۧ;->֫(Ll/ۚۡۧ;)J

    move-result-wide v7

    add-long/2addr v5, v7

    invoke-direct {v2, v3, v4, v5, v6}, Ll/ۡۢۧ;-><init>(JJ)V

    invoke-direct {p2, v0, v2}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    return-object p2
.end method
