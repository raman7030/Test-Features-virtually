.class public final Ll/ۙۢۧ;
.super Ljava/lang/Object;
.source "U8NM"

# interfaces
.implements Ll/ۢۢۧ;


# instance fields
.field public final ֫:J

.field public final synthetic ۧ:Ll/۬ۢۧ;


# direct methods
.method public constructor <init>(Ll/۬ۢۧ;J)V
    .locals 0

    .line 553
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۢۧ;->ۧ:Ll/۬ۢۧ;

    .line 554
    iput-wide p2, p0, Ll/ۙۢۧ;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫(J)Ll/ۜۢۧ;
    .locals 9

    .line 569
    iget-object v0, p0, Ll/ۙۢۧ;->ۧ:Ll/۬ۢۧ;

    invoke-static {v0}, Ll/۬ۢۧ;->֫(Ll/۬ۢۧ;)[Ll/ۛۢۧ;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v1, p1, p2}, Ll/ۛۢۧ;->֫(J)Ll/ۜۢۧ;

    move-result-object v1

    const/4 v2, 0x1

    .line 570
    :goto_0
    invoke-static {v0}, Ll/۬ۢۧ;->֫(Ll/۬ۢۧ;)[Ll/ۛۢۧ;

    move-result-object v3

    array-length v3, v3

    if-ge v2, v3, :cond_1

    .line 571
    invoke-static {v0}, Ll/۬ۢۧ;->֫(Ll/۬ۢۧ;)[Ll/ۛۢۧ;

    move-result-object v3

    aget-object v3, v3, v2

    invoke-virtual {v3, p1, p2}, Ll/ۛۢۧ;->֫(J)Ll/ۜۢۧ;

    move-result-object v3

    .line 572
    iget-object v4, v3, Ll/ۜۢۧ;->֫:Ll/ۡۢۧ;

    iget-wide v4, v4, Ll/ۡۢۧ;->֫:J

    iget-object v6, v1, Ll/ۜۢۧ;->֫:Ll/ۡۢۧ;

    iget-wide v6, v6, Ll/ۡۢۧ;->֫:J

    cmp-long v8, v4, v6

    if-gez v8, :cond_0

    move-object v1, v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final ۜ()J
    .locals 2

    .line 564
    iget-wide v0, p0, Ll/ۙۢۧ;->֫:J

    return-wide v0
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
