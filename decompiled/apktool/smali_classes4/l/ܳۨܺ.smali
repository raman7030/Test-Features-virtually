.class public final Ll/ܳۨܺ;
.super Ll/ۜۨܺ;
.source "TUG"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ۙ:Ll/֫᩺᩷;

.field public ᩶:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ܶ۫ᩴ;JLl/֫᩺᩷;)V
    .locals 0

    .line 481
    iput-object p4, p0, Ll/ܳۨܺ;->ۙ:Ll/֫᩺᩷;

    .line 482
    invoke-direct {p0, p1, p2, p3}, Ll/ۜۨܺ;-><init>(Ll/ܶ۫ᩴ;J)V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    .line 487
    iput-object p1, p0, Ll/ܳۨܺ;->᩶:Ljava/lang/Object;

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 7

    .line 492
    iget-object v0, p0, Ll/ۜۨܺ;->᩸:Ll/ܶ۫ᩴ;

    invoke-interface {v0, p0}, Ll/ܶ۫ᩴ;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 495
    :try_start_0
    iget-object v1, p0, Ll/ܳۨܺ;->ۙ:Ll/֫᩺᩷;

    iget-object v2, p0, Ll/ܳۨܺ;->᩶:Ljava/lang/Object;

    iget-wide v3, p0, Ll/ۜۨܺ;->᩹:J

    const-wide/16 v5, 0x1

    add-long/2addr v5, v3

    iput-wide v5, p0, Ll/ۜۨܺ;->᩹:J

    iget-object v1, v1, Ll/֫᩺᩷;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۗ֫ۖ;

    .line 1886
    invoke-virtual {v1, v2}, Ll/ۗ֫ۖ;->apply(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v3, -0x1

    :goto_0
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 495
    invoke-interface {p1, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 498
    iput-object v0, p0, Ll/ܳۨܺ;->᩶:Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    iput-object v0, p0, Ll/ܳۨܺ;->᩶:Ljava/lang/Object;

    .line 499
    throw p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
