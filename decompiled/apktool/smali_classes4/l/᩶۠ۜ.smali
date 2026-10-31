.class public final Ll/᩶۠ۜ;
.super Ljava/lang/Object;
.source "B74J"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/lang/Boolean;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Z

.field public final ᩳ:J


# direct methods
.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Boolean;)V
    .locals 0

    .line 432
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 433
    iput-boolean p1, p0, Ll/᩶۠ۜ;->ܿ:Z

    .line 434
    iput-object p2, p0, Ll/᩶۠ۜ;->֫:Ljava/lang/String;

    .line 435
    iput-object p3, p0, Ll/᩶۠ۜ;->ܽ:Ljava/lang/String;

    .line 436
    iput-wide p4, p0, Ll/᩶۠ۜ;->ᩳ:J

    .line 437
    iput-object p6, p0, Ll/᩶۠ۜ;->ۧ:Ljava/lang/String;

    .line 438
    iput-object p7, p0, Ll/᩶۠ۜ;->ܳ:Ljava/lang/Boolean;

    return-void
.end method

.method public static ֫(Ll/᩻ܶ֫;)Ll/᩶۠ۜ;
    .locals 10

    .line 444
    iget-object v0, p0, Ll/᩻ܶ֫;->ۙ:Ljava/util/Map;

    .line 445
    new-instance v9, Ll/᩶۠ۜ;

    const-string v1, "ETag"

    .line 447
    invoke-static {v1, v0}, Ll/ۗ۠ۜ;->֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "Last-Modified"

    .line 448
    invoke-static {v1, v0}, Ll/ۗ۠ۜ;->֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    .line 450
    iget-object p0, p0, Ll/᩻ܶ֫;->ۗ:Landroid/net/Uri;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ll/ۗ۠ۜ;->֫(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    move-object v7, p0

    const/4 v8, 0x0

    const/4 v2, 0x1

    const-wide/16 v5, -0x1

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Ll/᩶۠ۜ;-><init>(ZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Boolean;)V

    return-object v9
.end method
