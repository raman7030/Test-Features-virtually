.class public final Ll/ۖ֨ܿ;
.super Ljava/lang/Object;
.source "B13Z"


# static fields
.field public static final ۜ:Ljava/util/HashMap;

.field public static ۡ:J

.field public static final ۢ:Ll/ۨۘܽ;

.field public static final ܳ:Ljava/util/HashMap;

.field public static ܺ:J

.field public static final ᩷:Ll/ۨۘܽ;

.field public static final ᩻:Ljava/util/HashMap;


# instance fields
.field public ֫:Ll/۫֨ܿ;

.field public ۧ:Ll/ۢ֨ܿ;

.field public ܽ:Ll/᩶ۖܳ;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 38
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۖ֨ܿ;->ܳ:Ljava/util/HashMap;

    .line 39
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۖ֨ܿ;->᩻:Ljava/util/HashMap;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۖ֨ܿ;->ۜ:Ljava/util/HashMap;

    const-string v0, "\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})"

    .line 43
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۖ֨ܿ;->᩷:Ll/ۨۘܽ;

    const-string v0, "\\.z(?:0[1-9]|[1-9][0-9]+)"

    .line 44
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۖ֨ܿ;->ۢ:Ll/ۨۘܽ;

    const-string v0, "text/xml"

    .line 470
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, ".xml"

    const/4 v3, 0x1

    invoke-static {v2, v3, v1}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, "text/kml"

    .line 471
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, ".kml"

    invoke-static {v2, v3, v1}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, "application/octet-stream"

    .line 472
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, ".dex"

    const/4 v5, 0x3

    invoke-static {v4, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const/4 v2, 0x2

    .line 473
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, ".arsc"

    invoke-static {v5, v2, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/mt-plugin"

    .line 474
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, ".mtp"

    const/16 v5, 0x8

    invoke-static {v4, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/vnd.android.package-archive"

    .line 475
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, ".apk"

    const/4 v6, 0x4

    invoke-static {v5, v6, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".apk.1"

    .line 476
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v6, v5}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".apex"

    .line 477
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/bks"

    .line 478
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, ".bks"

    const/4 v5, 0x7

    invoke-static {v4, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/jks"

    .line 479
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v4

    const-string v6, ".jks"

    invoke-static {v6, v5, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".keystore"

    .line 480
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/vnd.android.package-archives"

    .line 481
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, ".apks"

    const/4 v6, 0x5

    invoke-static {v5, v6, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".xapk"

    .line 482
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v6, v5}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".apkm"

    .line 483
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/x-sh"

    .line 484
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, ".sh"

    const/16 v5, 0xc

    invoke-static {v4, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/x-rc"

    .line 485
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, ".rc"

    invoke-static {v4, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/zip"

    .line 486
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, ".zip"

    const/4 v6, 0x6

    invoke-static {v5, v6, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".aab"

    .line 487
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v6, v5}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".mtz"

    .line 488
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v6, v5}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".hwt"

    .line 489
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v6, v5}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".bds"

    .line 490
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/java-archive"

    const-string v4, "application/x-java-archive"

    const-string v5, "application/x-jar"

    .line 491
    filled-new-array {v5, v2, v4}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, ".jar"

    const/16 v5, 0x10

    invoke-static {v4, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/x-font-ttf"

    .line 492
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, ".ttf"

    const/16 v5, 0xd

    invoke-static {v4, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/x-font-ttc"

    .line 493
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, ".ttc"

    invoke-static {v4, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/x-font-otf"

    .line 494
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, ".otf"

    invoke-static {v4, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/x-font-woff"

    .line 495
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, ".woff"

    invoke-static {v4, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "text/plist"

    .line 496
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, ".plist"

    invoke-static {v4, v3, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const/16 v2, 0x11

    .line 497
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".class"

    invoke-static {v4, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const/16 v2, 0x12

    .line 498
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v3, ".mtcr"

    invoke-static {v3, v2, v1}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 500
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const-string v1, ".iml"

    const/16 v2, 0x9

    invoke-static {v1, v2, v0}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v0, "text/plain"

    .line 501
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    const-string v3, ".mtd"

    invoke-static {v3, v2, v1}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".mtl"

    .line 502
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".mtsx"

    .line 503
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".m3u"

    .line 504
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".mf"

    .line 505
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".md"

    .line 506
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".sf"

    .line 507
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".txt"

    .line 508
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".log"

    .line 509
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".css"

    .line 510
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".cfg"

    .line 511
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".ini"

    .line 512
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".conf"

    .line 513
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".prop"

    .line 514
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".json"

    .line 515
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v1, ".properties"

    .line 516
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 517
    sget-object v1, Ll/᩶ۖܳ;->ۙ:Ll/᩶ۖܳ;

    const-string v3, "text/html"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, ".htm"

    const/16 v7, 0x15

    invoke-static {v5, v7, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v4, ".html"

    .line 518
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v7, v1, v5}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v4, "application/xhtml+xml"

    .line 519
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, ".xhtml"

    invoke-static {v5, v7, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v4, ".shtml"

    .line 520
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v7, v1, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, "multipart/related"

    .line 521
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, ".mhtml"

    invoke-static {v5, v7, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v4, ".mht"

    .line 522
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v7, v1, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    .line 523
    sget-object v1, Ll/᩶ۖܳ;->᩹֫:Ll/᩶ۖܳ;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".c"

    invoke-static {v4, v2, v1, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, ".h"

    .line 524
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, ".js"

    .line 525
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    .line 526
    sget-object v3, Ll/᩶ۖܳ;->ܺ֫:Ll/᩶ۖܳ;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, ".py"

    invoke-static {v5, v2, v3, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, ".cc"

    .line 527
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, ".go"

    .line 528
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    .line 529
    sget-object v3, Ll/᩶ۖܳ;->᩺:Ll/᩶ۖܳ;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, ".kt"

    invoke-static {v5, v2, v3, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, ".bat"

    .line 530
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    .line 531
    sget-object v3, Ll/᩶ۖܳ;->᩷֫:Ll/᩶ۖܳ;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, ".php"

    invoke-static {v5, v2, v3, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, ".cpp"

    .line 532
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, ".hpp"

    .line 533
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    .line 534
    sget-object v3, Ll/᩶ۖܳ;->֫֫:Ll/᩶ۖܳ;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, ".lua"

    invoke-static {v5, v2, v3, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    .line 535
    sget-object v3, Ll/᩶ۖܳ;->ۤ:Ll/᩶ۖܳ;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, ".java"

    invoke-static {v5, v2, v3, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, ".smali"

    .line 536
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, ".yml"

    .line 537
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, ".yaml"

    .line 538
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, ".rs"

    .line 539
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    .line 540
    sget-object v3, Ll/᩶ۖܳ;->᩵֫:Ll/᩶ۖܳ;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, ".zshrc"

    invoke-static {v5, v2, v3, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v4, ".bashrc"

    .line 541
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v2, v3, v5}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, ".bash_history"

    .line 542
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v2, v1, v0}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    .line 543
    sget-object v0, Ll/᩶ۖܳ;->ۤ֫:Ll/᩶ۖܳ;

    const-string v1, "text/csv"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v3, ".csv"

    invoke-static {v3, v2, v0, v1}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    .line 546
    sget-object v1, Ll/᩶ۖܳ;->᩸֫:Ll/᩶ۖܳ;

    const-string v3, "text/x-ssa"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, ".ass"

    invoke-static {v5, v2, v1, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v4, ".ssa"

    .line 547
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v2, v1, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, "application/x-subrip"

    .line 548
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".srt"

    invoke-static {v4, v2, v1, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, "text/vtt"

    .line 549
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".vtt"

    invoke-static {v4, v2, v1, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v3, "application/ttml+xml"

    .line 550
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".ttml"

    invoke-static {v4, v2, v1, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v2, "image/jpeg"

    .line 552
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".jpeg"

    const/16 v5, 0xa

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, ".jpg"

    .line 553
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "image/bmp"

    .line 554
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".bmp"

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "image/gif"

    .line 555
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".gif"

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "image/x-icon"

    .line 556
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".ico"

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "image/png"

    .line 557
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".png"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "image/webp"

    .line 558
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".webp"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "image/heic"

    .line 559
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".heic"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "image/heif"

    .line 560
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".heif"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "image/svg+xml"

    .line 561
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".svg"

    const/16 v7, 0xf

    invoke-static {v4, v7, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, ".9.png"

    .line 562
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "image/tga"

    .line 563
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".tga"

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "audio/mp4a-latm"

    .line 565
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".m4a"

    const/16 v5, 0xb

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, ".m4b"

    .line 566
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v5, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, ".m4p"

    .line 567
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "audio/x-mpeg"

    .line 568
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".mp2"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, ".mp3"

    .line 569
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "audio/mpeg"

    .line 570
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".mpga"

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "audio/ogg"

    .line 571
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".ogg"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "audio/x-wav"

    .line 572
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".wav"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "audio/x-ms-wma"

    .line 573
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".wma"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "audio/*"

    .line 574
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".flac"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "audio/amr"

    .line 575
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".amr"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "audio/midi"

    .line 576
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v4

    const-string v7, ".mid"

    invoke-static {v7, v5, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".midi"

    .line 577
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, ".oga"

    .line 578
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "audio/aac"

    .line 579
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".aac"

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "audio/vnd.rn-realaudio"

    .line 580
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".rpm"

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "audio/webm"

    .line 581
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".weba"

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "video/3gpp"

    .line 583
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".3gp"

    const/16 v5, 0x14

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "video/x-ms-asf"

    .line 584
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".asf"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "video/x-msvideo"

    .line 585
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".avi"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "video/mp4"

    .line 586
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v4

    const-string v7, ".mp4"

    invoke-static {v7, v5, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, "video/mpeg"

    .line 587
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v7

    const-string v8, ".mpe"

    invoke-static {v8, v5, v7}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v7, ".mpeg"

    .line 588
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v5, v8}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v7, ".mpg"

    .line 589
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v5, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".mpg4"

    .line 590
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "video/vnd.mpegurl"

    .line 591
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v4

    const-string v7, ".m4u"

    invoke-static {v7, v5, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, "application/x-mpegurl"

    const-string v7, "application/vnd.apple.mpegurl"

    .line 592
    filled-new-array {v3, v4, v7}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".m3u8"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "video/x-m4v"

    .line 593
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".m4v"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "video/quicktime"

    .line 594
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".mov"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "video/vnd.rn-realvideo"

    .line 595
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".rmvb"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, "video/x-ms-wmv"

    .line 596
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".wmv"

    invoke-static {v4, v5, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, ".3gpp"

    .line 597
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "video/x-flv"

    .line 598
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".flv"

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "video/ogg"

    .line 599
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".ogv"

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "video/x-matroska"

    .line 600
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".mkv"

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "video/x-dv"

    .line 601
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".dv"

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "video/webm"

    .line 602
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".webm"

    invoke-static {v3, v5, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/x-7z-compressed"

    .line 604
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".7z"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/vnd.debian.binary-package"

    .line 605
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".deb"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/arj"

    .line 606
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".arj"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/vnd.ms-cab-compressed"

    .line 607
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".cab"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/vnd.ms-htmlhelp"

    .line 608
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".chm"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/x-cpio"

    const-string v3, "application/cpio"

    .line 609
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".cpio"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/iso"

    .line 610
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".iso"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/lzh"

    .line 611
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".lzh"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/lzma"

    .line 612
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".lzma"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/x-rar-compressed"

    .line 613
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".rar"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/wim"

    .line 614
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".wim"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/xar"

    .line 615
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".xar"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/ntfs"

    .line 616
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".ntfs"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/udf"

    .line 617
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".udf"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/z"

    .line 618
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".z"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/zlib"

    .line 619
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".zl"

    invoke-static {v4, v6, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, ".zli"

    .line 620
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v6, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, ".zlib"

    .line 621
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/x-tar"

    const-string v3, "application/tar"

    .line 623
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".tar"

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/x-gzip"

    const-string v3, "application/gzip"

    .line 625
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v4

    const-string v7, ".gz"

    invoke-static {v7, v6, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".tar.gz"

    .line 626
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v6, v7}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".tgz"

    .line 627
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v6, v7}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".taz"

    .line 628
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/x-xz"

    const-string v3, "application/xz"

    .line 630
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v4

    const-string v7, ".xz"

    invoke-static {v7, v6, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".tar.xz"

    .line 631
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v6, v7}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".txz"

    .line 632
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/zstd"

    .line 634
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".zst"

    invoke-static {v4, v6, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, ".zstd"

    .line 635
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v6, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, ".tar.zst"

    .line 636
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v6, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v3, ".tar.zstd"

    .line 637
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/x-bzip2"

    const-string v3, "application/bzip2"

    .line 639
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v4

    const-string v7, ".bz2"

    invoke-static {v7, v6, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".tar.bz2"

    .line 640
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v6, v7}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".tbz2"

    .line 641
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v6, v7}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".tbz"

    .line 642
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v2, "application/x-lz4"

    const-string v3, "application/lz4"

    .line 644
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v4

    const-string v7, ".lz4"

    invoke-static {v7, v6, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    const-string v4, ".tar.lz4"

    .line 645
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v6, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 647
    sget-object v2, Ll/᩶ۖܳ;->ۜ֫:Ll/᩶ۖܳ;

    const-string v3, "application/pdf"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ".pdf"

    invoke-static {v4, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;[Ljava/lang/String;)V

    .line 648
    sget-object v2, Ll/᩶ۖܳ;->ۢ֫:Ll/᩶ۖܳ;

    const-string v3, "application/vnd.ms-powerpoint"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v4

    const-string v6, ".ppt"

    invoke-static {v6, v2, v4}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v4, "application/vnd.ms-excel"

    .line 649
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v6

    const-string v7, ".xls"

    invoke-static {v7, v0, v6}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v6, "application/msword"

    .line 650
    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v7

    const-string v8, ".doc"

    invoke-static {v8, v1, v7}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v7, ".pptx"

    .line 651
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, v2, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v2, ".xlsx"

    .line 652
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v0, ".docx"

    .line 653
    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;[Ljava/lang/String;)V

    .line 654
    sget-object v0, Ll/᩶ۖܳ;->ܳ֫:Ll/᩶ۖܳ;

    const-string v1, "application/oat"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, ".odex"

    invoke-static {v3, v0, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v2, ".oat"

    .line 655
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v0, v1}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;[Ljava/lang/String;)V

    .line 656
    sget-object v0, Ll/᩶ۖܳ;->ۚ:Ll/᩶ۖܳ;

    const-string v1, "application/x-bittorrent"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, ".torrent"

    invoke-static {v2, v0, v1}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;[Ljava/lang/String;)V

    const-string v0, "video/MP2T"

    .line 658
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const-string v1, ".ts-movie"

    invoke-static {v1, v5, v0}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;I[Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ۢ֨ܿ;)V
    .locals 1

    .line 266
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 267
    iput-object p1, p0, Ll/ۖ֨ܿ;->ܿ:Ljava/lang/String;

    .line 268
    sget-object v0, Ll/ۖ֨ܿ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖ֨ܿ;

    if-eqz p1, :cond_0

    .line 270
    iget-object v0, p1, Ll/ۖ֨ܿ;->ᩳ:Ljava/util/List;

    iput-object v0, p0, Ll/ۖ֨ܿ;->ᩳ:Ljava/util/List;

    .line 271
    iget-object v0, p1, Ll/ۖ֨ܿ;->ۧ:Ll/ۢ֨ܿ;

    if-ne p2, v0, :cond_1

    .line 272
    iget-object p1, p1, Ll/ۖ֨ܿ;->ܽ:Ll/᩶ۖܳ;

    iput-object p1, p0, Ll/ۖ֨ܿ;->ܽ:Ll/᩶ۖܳ;

    goto :goto_1

    .line 263
    :cond_0
    iget p1, p2, Ll/ۢ֨ܿ;->֫:I

    packed-switch p1, :pswitch_data_0

    .line 300
    new-instance p2, Ljava/lang/RuntimeException;

    const-string v0, "Unknown built-in function type: "

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 300
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    const-string p1, "text/html"

    goto :goto_0

    :pswitch_1
    const-string p1, "video/*"

    goto :goto_0

    :pswitch_2
    const-string p1, "image/png"

    goto :goto_0

    :pswitch_3
    const-string p1, "application/x-jar"

    goto :goto_0

    :pswitch_4
    const-string p1, "image/svg+xml"

    goto :goto_0

    :pswitch_5
    const-string p1, "audio/*"

    goto :goto_0

    :pswitch_6
    const-string p1, "image/*"

    goto :goto_0

    :pswitch_7
    const-string p1, "text/plain"

    goto :goto_0

    :pswitch_8
    const-string p1, "application/jks"

    goto :goto_0

    :pswitch_9
    const-string p1, "application/zip"

    goto :goto_0

    :pswitch_a
    const-string p1, "application/vnd.android.package-archives"

    goto :goto_0

    :pswitch_b
    const-string p1, "application/vnd.android.package-archive"

    goto :goto_0

    :pswitch_c
    const-string p1, "application/octet-stream"

    goto :goto_0

    :pswitch_d
    const-string p1, "text/xml"

    .line 275
    :goto_0
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۖ֨ܿ;->ᩳ:Ljava/util/List;

    .line 277
    :cond_1
    :goto_1
    iput-object p2, p0, Ll/ۖ֨ܿ;->ۧ:Ll/ۢ֨ܿ;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_c
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_c
        :pswitch_c
        :pswitch_4
        :pswitch_3
        :pswitch_c
        :pswitch_c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/lang/String;Ll/۫֨ܿ;)V
    .locals 1

    .line 280
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 281
    iput-object p1, p0, Ll/ۖ֨ܿ;->ܿ:Ljava/lang/String;

    .line 282
    sget-object v0, Ll/ۖ֨ܿ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖ֨ܿ;

    if-eqz p1, :cond_0

    .line 284
    iget-object v0, p1, Ll/ۖ֨ܿ;->ᩳ:Ljava/util/List;

    iput-object v0, p0, Ll/ۖ֨ܿ;->ᩳ:Ljava/util/List;

    .line 285
    invoke-virtual {p1}, Ll/ۖ֨ܿ;->ܿ()Ll/᩶ۖܳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۖ֨ܿ;->ܽ:Ll/᩶ۖܳ;

    goto :goto_0

    :cond_0
    const-string p1, "*/*"

    .line 287
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۖ֨ܿ;->ᩳ:Ljava/util/List;

    .line 289
    :goto_0
    iput-object p2, p0, Ll/ۖ֨ܿ;->֫:Ll/۫֨ܿ;

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;Ll/᩶ۖܳ;Ll/ۢ֨ܿ;[Ljava/lang/String;)V
    .locals 0

    .line 259
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 260
    iput-object p1, p0, Ll/ۖ֨ܿ;->ܿ:Ljava/lang/String;

    .line 261
    iput-object p2, p0, Ll/ۖ֨ܿ;->ܽ:Ll/᩶ۖܳ;

    .line 262
    iput-object p3, p0, Ll/ۖ֨ܿ;->ۧ:Ll/ۢ֨ܿ;

    .line 263
    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۖ֨ܿ;->ᩳ:Ljava/util/List;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "."

    .line 383
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 0
    invoke-static {p1, p0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static synthetic ֫(Ll/ۖ֨ܿ;)Ljava/lang/String;
    .locals 0

    .line 255
    iget-object p0, p0, Ll/ۖ֨ܿ;->ܿ:Ljava/lang/String;

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ۖ֨ܿ;
    .locals 5

    const-string v0, "s"

    .line 425
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "t"

    .line 426
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_2

    .line 428
    new-instance v1, Landroid/content/ComponentName;

    const-string v3, "p"

    invoke-virtual {p0, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "c"

    invoke-virtual {p0, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "f"

    .line 429
    invoke-virtual {p0, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p0

    and-int/lit8 v3, p0, 0x1

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 432
    :goto_1
    new-instance p0, Ll/ۖ֨ܿ;

    new-instance v4, Ll/۫֨ܿ;

    invoke-direct {v4, v1, v3, v2}, Ll/۫֨ܿ;-><init>(Landroid/content/ComponentName;ZZ)V

    invoke-direct {p0, v0, v4}, Ll/ۖ֨ܿ;-><init>(Ljava/lang/String;Ll/۫֨ܿ;)V

    return-object p0

    :cond_2
    if-lt v1, v2, :cond_3

    const/16 p0, 0x15

    if-gt v1, p0, :cond_3

    .line 434
    new-instance p0, Ll/ۖ֨ܿ;

    invoke-static {v1}, Ll/ۢ֨ܿ;->֫(I)Ll/ۢ֨ܿ;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ll/ۖ֨ܿ;-><init>(Ljava/lang/String;Ll/ۢ֨ܿ;)V

    return-object p0

    .line 436
    :cond_3
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Unknown type: "

    .line 0
    invoke-static {v1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 436
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Z)Ll/ۖ֨ܿ;
    .locals 8

    .line 63
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 64
    invoke-static {p0}, Ll/ܶ᩵ܿ;->ܺ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const-string v2, "*/*"

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 66
    new-instance p0, Ll/ۖ֨ܿ;

    const-string p1, ""

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v3, v3, v0}, Ll/ۖ֨ܿ;-><init>(Ljava/lang/String;Ll/᩶ۖܳ;Ll/ۢ֨ܿ;[Ljava/lang/String;)V

    return-object p0

    .line 67
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-wide v6, Ll/ۖ֨ܿ;->ۡ:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x2710

    cmp-long v1, v4, v6

    if-lez v1, :cond_2

    .line 68
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v1

    const-string v4, "openMethod"

    invoke-virtual {v1, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 69
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v4

    .line 70
    sget-wide v6, Ll/ۖ֨ܿ;->ܺ:J

    cmp-long v1, v4, v6

    if-eqz v1, :cond_1

    .line 71
    invoke-static {}, Ll/ۖ֨ܿ;->ۢ()V

    .line 72
    sput-wide v4, Ll/ۖ֨ܿ;->ܺ:J

    .line 74
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Ll/ۖ֨ܿ;->ۡ:J

    :cond_2
    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v0}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v1

    const/16 v4, 0x30

    if-gt v4, v1, :cond_5

    const/16 v4, 0x39

    if-gt v1, v4, :cond_5

    .line 80
    sget-object v1, Ll/ۖ֨ܿ;->᩷:Ll/ۨۘܽ;

    invoke-virtual {v1, v0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۘܽ;->matches()Z

    move-result v1

    const-string v4, ".zip"

    if-eqz v1, :cond_4

    const-string v1, ".7z"

    .line 81
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    move-object v0, v1

    goto :goto_1

    .line 83
    :cond_3
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_5

    goto :goto_0

    .line 86
    :cond_4
    sget-object p0, Ll/ۖ֨ܿ;->ۢ:Ll/ۨۘܽ;

    invoke-virtual {p0, v0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p0

    invoke-virtual {p0}, Ll/۫ۘܽ;->matches()Z

    move-result p0

    if-eqz p0, :cond_5

    :goto_0
    move-object v0, v4

    :cond_5
    :goto_1
    if-eqz p1, :cond_6

    .line 91
    sget-object p0, Ll/ۖ֨ܿ;->᩻:Ljava/util/HashMap;

    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖ֨ܿ;

    goto :goto_2

    :cond_6
    move-object p0, v3

    :goto_2
    if-nez p0, :cond_7

    .line 93
    sget-object p0, Ll/ۖ֨ܿ;->ۜ:Ljava/util/HashMap;

    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖ֨ܿ;

    :cond_7
    if-nez p0, :cond_8

    .line 95
    sget-object p0, Ll/ۖ֨ܿ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖ֨ܿ;

    :cond_8
    if-nez p0, :cond_a

    const-string p0, ".img"

    .line 98
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_9

    .line 99
    sget-object p0, Ll/᩶ۖܳ;->᩹:Ll/᩶ۖܳ;

    goto :goto_3

    :cond_9
    move-object p0, v3

    .line 101
    :goto_3
    new-instance p1, Ll/ۖ֨ܿ;

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, p0, v3, v1}, Ll/ۖ֨ܿ;-><init>(Ljava/lang/String;Ll/᩶ۖܳ;Ll/ۢ֨ܿ;[Ljava/lang/String;)V

    return-object p1

    :cond_a
    return-object p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۖ֨ܿ;
    .locals 4

    .line 390
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩵ۧ()Ll/۬ۜܽ;

    move-result-object p0

    const v0, 0x73627281

    .line 391
    invoke-static {p0, v0}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    .line 392
    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    if-nez v0, :cond_0

    .line 394
    new-instance v0, Landroid/content/ComponentName;

    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 395
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܳ()Z

    move-result v1

    .line 396
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܳ()Z

    move-result p0

    .line 397
    new-instance v2, Ll/ۖ֨ܿ;

    new-instance v3, Ll/۫֨ܿ;

    invoke-direct {v3, v0, v1, p0}, Ll/۫֨ܿ;-><init>(Landroid/content/ComponentName;ZZ)V

    invoke-direct {v2, p1, v3}, Ll/ۖ֨ܿ;-><init>(Ljava/lang/String;Ll/۫֨ܿ;)V

    return-object v2

    :cond_0
    const/4 p0, 0x1

    if-lt v0, p0, :cond_1

    const/16 p0, 0x15

    if-gt v0, p0, :cond_1

    .line 399
    new-instance p0, Ll/ۖ֨ܿ;

    invoke-static {v0}, Ll/ۢ֨ܿ;->֫(I)Ll/ۢ֨ܿ;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ll/ۖ֨ܿ;-><init>(Ljava/lang/String;Ll/ۢ֨ܿ;)V

    return-object p0

    .line 401
    :cond_1
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 5

    .line 674
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 675
    sget-object v0, Ll/ۖ֨ܿ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0x9

    .line 676
    invoke-static {v1}, Ll/ۢ֨ܿ;->֫(I)Ll/ۢ֨ܿ;

    move-result-object v1

    .line 677
    new-instance v2, Ll/ۖ֨ܿ;

    sget-object v3, Ll/᩶ۖܳ;->᩹֫:Ll/᩶ۖܳ;

    const-string v4, "text/plain"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, p0, v3, v1, v4}, Ll/ۖ֨ܿ;-><init>(Ljava/lang/String;Ll/᩶ۖܳ;Ll/ۢ֨ܿ;[Ljava/lang/String;)V

    invoke-virtual {v0, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static varargs ֫(Ljava/lang/String;ILl/᩶ۖܳ;[Ljava/lang/String;)V
    .locals 1

    .line 666
    new-instance v0, Ll/ۖ֨ܿ;

    invoke-static {p1}, Ll/ۢ֨ܿ;->֫(I)Ll/ۢ֨ܿ;

    move-result-object p1

    invoke-direct {v0, p0, p2, p1, p3}, Ll/ۖ֨ܿ;-><init>(Ljava/lang/String;Ll/᩶ۖܳ;Ll/ۢ֨ܿ;[Ljava/lang/String;)V

    sget-object p1, Ll/ۖ֨ܿ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {p1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static varargs ֫(Ljava/lang/String;I[Ljava/lang/String;)V
    .locals 2

    .line 670
    new-instance v0, Ll/ۖ֨ܿ;

    const/4 v1, 0x0

    invoke-static {p1}, Ll/ۢ֨ܿ;->֫(I)Ll/ۢ֨ܿ;

    move-result-object p1

    invoke-direct {v0, p0, v1, p1, p2}, Ll/ۖ֨ܿ;-><init>(Ljava/lang/String;Ll/᩶ۖܳ;Ll/ۢ֨ܿ;[Ljava/lang/String;)V

    sget-object p1, Ll/ۖ֨ܿ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {p1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/ۛ֡ܿ;)V
    .locals 4

    .line 214
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 215
    new-instance v0, Ll/ۖ֨ܿ;

    new-instance v1, Ll/۫֨ܿ;

    invoke-interface {p1}, Ll/ۛ֡ܿ;->ܽ()Landroid/content/ComponentName;

    move-result-object v2

    .line 216
    invoke-interface {p1}, Ll/ۛ֡ܿ;->ۧ()Z

    move-result v3

    invoke-interface {p1}, Ll/ۛ֡ܿ;->֫()Z

    move-result p1

    invoke-direct {v1, v2, v3, p1}, Ll/۫֨ܿ;-><init>(Landroid/content/ComponentName;ZZ)V

    invoke-direct {v0, p0, v1}, Ll/ۖ֨ܿ;-><init>(Ljava/lang/String;Ll/۫֨ܿ;)V

    .line 217
    invoke-direct {v0}, Ll/ۖ֨ܿ;->ܺ()V

    .line 218
    sget-object p1, Ll/ۖ֨ܿ;->᩻:Ljava/util/HashMap;

    invoke-virtual {p1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    invoke-static {}, Ll/ۖ֨ܿ;->ۡ()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/ۢ֨ܿ;)V
    .locals 1

    .line 206
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 207
    new-instance v0, Ll/ۖ֨ܿ;

    invoke-direct {v0, p0, p1}, Ll/ۖ֨ܿ;-><init>(Ljava/lang/String;Ll/ۢ֨ܿ;)V

    .line 208
    invoke-direct {v0}, Ll/ۖ֨ܿ;->ܺ()V

    .line 209
    sget-object p1, Ll/ۖ֨ܿ;->᩻:Ljava/util/HashMap;

    invoke-virtual {p1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    invoke-static {}, Ll/ۖ֨ܿ;->ۡ()V

    return-void
.end method

.method public static varargs ֫(Ljava/lang/String;Ll/᩶ۖܳ;[Ljava/lang/String;)V
    .locals 2

    .line 662
    new-instance v0, Ll/ۖ֨ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1, p2}, Ll/ۖ֨ܿ;-><init>(Ljava/lang/String;Ll/᩶ۖܳ;Ll/ۢ֨ܿ;[Ljava/lang/String;)V

    sget-object p1, Ll/ۖ֨ܿ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {p1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;)V
    .locals 3

    .line 223
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖ֨ܿ;

    .line 224
    invoke-direct {v0}, Ll/ۖ֨ܿ;->ܺ()V

    .line 225
    sget-object v1, Ll/ۖ֨ܿ;->᩻:Ljava/util/HashMap;

    iget-object v2, v0, Ll/ۖ֨ܿ;->ܿ:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 227
    :cond_0
    invoke-static {}, Ll/ۖ֨ܿ;->ۡ()V

    return-void
.end method

.method public static ֫(Z)V
    .locals 6

    .line 174
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    .line 175
    invoke-static {}, Ll/ۢ᩷ܿ;->֫()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶۜܿ;

    .line 176
    invoke-virtual {v2}, Ll/ܶۜܿ;->ܺ()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 197
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    .line 198
    sget-object v4, Ll/ۖ֨ܿ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0, v3}, Ll/ۗ᩵;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    .line 201
    :cond_2
    new-instance v4, Ll/ۖ֨ܿ;

    const/16 v5, 0x9

    invoke-static {v5}, Ll/ۢ֨ܿ;->֫(I)Ll/ۢ֨ܿ;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Ll/ۖ֨ܿ;-><init>(Ljava/lang/String;Ll/ۢ֨ܿ;)V

    invoke-virtual {v0, v3, v4}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 180
    :cond_3
    sget-object v1, Ll/ۖ֨ܿ;->ۜ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 181
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    if-eqz p0, :cond_4

    .line 41
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 43
    invoke-virtual {p0}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 184
    invoke-virtual {p0}, Ll/ۢۘܳ;->ۜ()Ll/ܽۢܳ;

    move-result-object p0

    .line 185
    new-instance v0, Ll/᩷۠᩷;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/᩷۠᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_4
    return-void
.end method

.method public static ۡ()V
    .locals 2

    .line 462
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "openMethod"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 247
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v0

    sput-wide v0, Ll/ۖ֨ܿ;->ܺ:J

    .line 248
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Ll/ۖ֨ܿ;->ۡ:J

    .line 249
    new-instance v0, Ll/ܺ֨ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܺ֨ܿ;-><init>(I)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ۢ()V
    .locals 6

    .line 462
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "openMethod"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 141
    sget-object v1, Ll/ۖ֨ܿ;->᩻:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    const/4 v2, 0x1

    .line 413
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 142
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩵ܿ;

    .line 143
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, ".om"

    .line 144
    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    .line 148
    :cond_0
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x3

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    .line 149
    invoke-static {v2, v3}, Ll/ۖ֨ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۖ֨ܿ;

    move-result-object v2

    .line 150
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 58
    invoke-static {p0, v0}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Z)Ll/ۖ֨ܿ;

    move-result-object p0

    .line 136
    iget-object p0, p0, Ll/ۖ֨ܿ;->ᩳ:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static ۧ(Ljava/util/ArrayList;)V
    .locals 3

    .line 231
    sget-object v0, Ll/ۖ֨ܿ;->᩻:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖ֨ܿ;

    .line 232
    iget-object v2, v2, Ll/ۖ֨ܿ;->ܿ:Ljava/lang/String;

    invoke-static {v2}, Ll/ۖ֨ܿ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_0

    .line 234
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 235
    invoke-static {p0}, Ll/ۖ֨ܿ;->֫(Ljava/util/ArrayList;)V

    return-void
.end method

.method private ܺ()V
    .locals 3

    const v0, 0x73627281

    .line 0
    invoke-static {v0}, Ll/ᩴۘܿ;->֫(I)Ll/ۤۜܽ;

    move-result-object v0

    .line 408
    iget-object v1, p0, Ll/ۖ֨ܿ;->ۧ:Ll/ۢ֨ܿ;

    if-eqz v1, :cond_0

    .line 409
    iget v1, v1, Ll/ۢ֨ܿ;->֫:I

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 411
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 412
    iget-object v1, p0, Ll/ۖ֨ܿ;->֫:Ll/۫֨ܿ;

    invoke-virtual {v1}, Ll/۫֨ܿ;->ܽ()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 413
    invoke-virtual {v1}, Ll/۫֨ܿ;->ܽ()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 414
    invoke-virtual {v1}, Ll/۫֨ܿ;->ۧ()Z

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->֫(Z)V

    .line 415
    invoke-virtual {v1}, Ll/۫֨ܿ;->֫()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->֫(Z)V

    .line 418
    :goto_0
    :try_start_0
    iget-object v1, p0, Ll/ۖ֨ܿ;->ܿ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۖ֨ܿ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 3

    .line 466
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "openMethod/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".om"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Ljava/lang/String;)V
    .locals 1

    .line 239
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 240
    invoke-static {p0}, Ll/ۖ֨ܿ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 241
    sget-object v0, Ll/ۖ֨ܿ;->᩻:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    invoke-static {}, Ll/ۖ֨ܿ;->ۡ()V

    return-void
.end method

.method public static ᩷()Ljava/util/ArrayList;
    .locals 3

    .line 253
    invoke-static {}, Ll/ۖ֨ܿ;->ۢ()V

    .line 254
    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Ll/ۖ֨ܿ;->᩻:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 255
    new-instance v1, Ll/ۡ֨ܿ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۡ֨ܿ;-><init>(I)V

    invoke-static {v1}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V
    .locals 1

    .line 335
    iget-object v0, p0, Ll/ۖ֨ܿ;->ۧ:Ll/ۢ֨ܿ;

    if-eqz v0, :cond_0

    .line 336
    invoke-virtual {v0, p1, p2}, Ll/ۢ֨ܿ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    return-void

    .line 338
    :cond_0
    iget-object v0, p0, Ll/ۖ֨ܿ;->֫:Ll/۫֨ܿ;

    invoke-virtual {v0, p1, p2}, Ll/۫֨ܿ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    return-void
.end method

.method public final ֫()Z
    .locals 11

    const-string v0, "*/*"

    const-string v1, "test"

    .line 343
    iget-object v2, p0, Ll/ۖ֨ܿ;->ۧ:Ll/ۢ֨ܿ;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    return v3

    :cond_0
    const/4 v2, 0x0

    .line 346
    iget-object v4, p0, Ll/ۖ֨ܿ;->֫:Ll/۫֨ܿ;

    if-eqz v4, :cond_4

    .line 348
    :try_start_0
    invoke-virtual {v4}, Ll/۫֨ܿ;->ܽ()Landroid/content/ComponentName;

    move-result-object v4

    .line 349
    invoke-virtual {v4}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 350
    invoke-virtual {v4}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 353
    new-instance v6, Landroid/content/Intent;

    const-string v7, "android.intent.action.VIEW"

    invoke-direct {v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 354
    invoke-virtual {v6, v5}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 355
    sget-object v5, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۖ֨ܿ;->ܿ:Ljava/lang/String;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 356
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 358
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۠ۧ()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v6, v7, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v7, 0x10000

    .line 359
    invoke-virtual {v5, v6, v7}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v8

    .line 360
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/content/pm/ResolveInfo;

    .line 361
    iget-object v9, v9, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 362
    iget-object v10, v9, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    iget-object v9, v9, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-static {v10, v9}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    return v3

    .line 367
    :cond_2
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܶۧ()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v6, v1, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 368
    invoke-virtual {v5, v6, v7}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 369
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 370
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 371
    iget-object v5, v1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-static {v5, v1}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_3

    return v3

    :catch_0
    :cond_4
    return v2
.end method

.method public final varargs ֫([I)Z
    .locals 5

    const/4 v0, 0x0

    .line 309
    iget-object v1, p0, Ll/ۖ֨ܿ;->ۧ:Ll/ۢ֨ܿ;

    if-eqz v1, :cond_2

    iget v1, v1, Ll/ۢ֨ܿ;->֫:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    goto :goto_1

    .line 313
    :cond_0
    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget v4, p1, v3

    if-ne v1, v4, :cond_1

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final ۜ()Lbin/mt/json/JSONObject;
    .locals 4

    .line 441
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v1, "s"

    .line 442
    iget-object v2, p0, Ll/ۖ֨ܿ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "t"

    .line 443
    iget-object v2, p0, Ll/ۖ֨ܿ;->ۧ:Ll/ۢ֨ܿ;

    if-eqz v2, :cond_0

    .line 444
    iget v2, v2, Ll/ۢ֨ܿ;->֫:I

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    return-object v0

    :cond_0
    const/4 v2, 0x0

    .line 446
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 447
    iget-object v1, p0, Ll/ۖ֨ܿ;->֫:Ll/۫֨ܿ;

    invoke-virtual {v1}, Ll/۫֨ܿ;->ܽ()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "p"

    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 448
    invoke-virtual {v1}, Ll/۫֨ܿ;->ܽ()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "c"

    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 450
    invoke-virtual {v1}, Ll/۫֨ܿ;->ۧ()Z

    move-result v2

    .line 453
    invoke-virtual {v1}, Ll/۫֨ܿ;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    or-int/lit8 v2, v2, 0x2

    :cond_1
    const-string v1, "f"

    .line 456
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ۧ()Z
    .locals 2

    .line 305
    iget-object v0, p0, Ll/ۖ֨ܿ;->ۧ:Ll/ۢ֨ܿ;

    if-eqz v0, :cond_0

    iget v0, v0, Ll/ۢ֨ܿ;->֫:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 2

    .line 297
    iget-object v0, p0, Ll/ۖ֨ܿ;->ᩳ:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Ll/۫֨ܿ;
    .locals 1

    .line 323
    iget-object v0, p0, Ll/ۖ֨ܿ;->֫:Ll/۫֨ܿ;

    return-object v0
.end method

.method public final ܿ()Ll/᩶ۖܳ;
    .locals 1

    .line 327
    iget-object v0, p0, Ll/ۖ֨ܿ;->ܽ:Ll/᩶ۖܳ;

    if-eqz v0, :cond_0

    return-object v0

    .line 329
    :cond_0
    iget-object v0, p0, Ll/ۖ֨ܿ;->ۧ:Ll/ۢ֨ܿ;

    if-eqz v0, :cond_1

    .line 330
    invoke-virtual {v0}, Ll/ۢ֨ܿ;->֫()Ll/᩶ۖܳ;

    move-result-object v0

    return-object v0

    .line 331
    :cond_1
    sget-object v0, Ll/᩶ۖܳ;->ۚ:Ll/᩶ۖܳ;

    return-object v0
.end method

.method public final ᩳ()Ll/ۢ֨ܿ;
    .locals 1

    .line 301
    iget-object v0, p0, Ll/ۖ֨ܿ;->ۧ:Ll/ۢ֨ܿ;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 293
    iget-object v0, p0, Ll/ۖ֨ܿ;->ܿ:Ljava/lang/String;

    return-object v0
.end method
