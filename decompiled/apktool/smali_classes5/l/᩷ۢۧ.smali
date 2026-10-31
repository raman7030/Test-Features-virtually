.class public Ll/᩷ۢۧ;
.super Ljava/lang/Object;
.source "E8NG"

# interfaces
.implements Ll/ۢۢۧ;


# instance fields
.field public final ֫:J

.field public final ۧ:Ll/ۜۢۧ;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 40
    invoke-direct {p0, p1, p2, v0, v1}, Ll/᩷ۢۧ;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 2

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-wide p1, p0, Ll/᩷ۢۧ;->֫:J

    .line 50
    new-instance p1, Ll/ۜۢۧ;

    const-wide/16 v0, 0x0

    cmp-long p2, p3, v0

    if-nez p2, :cond_0

    .line 51
    sget-object p2, Ll/ۡۢۧ;->ܽ:Ll/ۡۢۧ;

    goto :goto_0

    :cond_0
    new-instance p2, Ll/ۡۢۧ;

    invoke-direct {p2, v0, v1, p3, p4}, Ll/ۡۢۧ;-><init>(JJ)V

    .line 83
    :goto_0
    invoke-direct {p1, p2, p2}, Ll/ۜۢۧ;-><init>(Ll/ۡۢۧ;Ll/ۡۢۧ;)V

    .line 51
    iput-object p1, p0, Ll/᩷ۢۧ;->ۧ:Ll/ۜۢۧ;

    return-void
.end method


# virtual methods
.method public final ֫(J)Ll/ۜۢۧ;
    .locals 0

    .line 66
    iget-object p1, p0, Ll/᩷ۢۧ;->ۧ:Ll/ۜۢۧ;

    return-object p1
.end method

.method public final ۜ()J
    .locals 2

    .line 61
    iget-wide v0, p0, Ll/᩷ۢۧ;->֫:J

    return-wide v0
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
