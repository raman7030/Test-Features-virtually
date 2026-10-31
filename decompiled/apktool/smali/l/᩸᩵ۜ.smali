.class public final Ll/᩸᩵ۜ;
.super Ljava/lang/Object;
.source "86KX"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Z

.field public final ܳ:Ljava/util/Map;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Z

.field public final ᩳ:Z

.field public final ᩻:Ll/᩶᩵ۜ;


# direct methods
.method public constructor <init>(Ll/᩶᩵ۜ;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 0

    .line 254
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 255
    iput-object p1, p0, Ll/᩸᩵ۜ;->᩻:Ll/᩶᩵ۜ;

    .line 256
    iput-object p2, p0, Ll/᩸᩵ۜ;->ܳ:Ljava/util/Map;

    .line 257
    iput-object p3, p0, Ll/᩸᩵ۜ;->֫:Ljava/lang/String;

    .line 258
    iput-object p4, p0, Ll/᩸᩵ۜ;->ܽ:Ljava/lang/String;

    .line 259
    iput-boolean p5, p0, Ll/᩸᩵ۜ;->ᩳ:Z

    .line 260
    iput-boolean p6, p0, Ll/᩸᩵ۜ;->ܿ:Z

    .line 261
    iput-boolean p7, p0, Ll/᩸᩵ۜ;->ۧ:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸᩵ۜ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸᩵ۜ;->֫:Ljava/lang/String;

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Z)Ll/᩸᩵ۜ;
    .locals 9

    .line 274
    new-instance v8, Ll/᩸᩵ۜ;

    sget-object v1, Ll/᩶᩵ۜ;->ۙ:Ll/᩶᩵ۜ;

    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v8

    move-object v3, p0

    move-object v4, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Ll/᩸᩵ۜ;-><init>(Ll/᩶᩵ۜ;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-object v8
.end method

.method public static ֫(Ljava/lang/String;Z)Ll/᩸᩵ۜ;
    .locals 9

    .line 270
    new-instance v8, Ll/᩸᩵ۜ;

    sget-object v1, Ll/᩶᩵ۜ;->᩶:Ll/᩶᩵ۜ;

    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const/4 v5, 0x0

    const/4 v7, 0x0

    const-string v4, ""

    move-object v0, v8

    move-object v3, p0

    move v6, p1

    invoke-direct/range {v0 .. v7}, Ll/᩸᩵ۜ;-><init>(Ll/᩶᩵ۜ;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-object v8
.end method

.method public static ֫(Ljava/util/LinkedHashMap;Z)Ll/᩸᩵ۜ;
    .locals 9

    .line 265
    new-instance v8, Ll/᩸᩵ۜ;

    sget-object v1, Ll/᩶᩵ۜ;->᩹:Ll/᩶᩵ۜ;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v3, ""

    const-string v4, ""

    move-object v0, v8

    move v5, p1

    invoke-direct/range {v0 .. v7}, Ll/᩸᩵ۜ;-><init>(Ll/᩶᩵ۜ;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-object v8
.end method

.method public static bridge synthetic ۧ(Ll/᩸᩵ۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩸᩵ۜ;->ۧ:Z

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/᩸᩵ۜ;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸᩵ۜ;->ܳ:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩸᩵ۜ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸᩵ۜ;->ܽ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/᩸᩵ۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩸᩵ۜ;->ܿ:Z

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩸᩵ۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩸᩵ۜ;->ᩳ:Z

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/᩸᩵ۜ;)Ll/᩶᩵ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸᩵ۜ;->᩻:Ll/᩶᩵ۜ;

    return-object p0
.end method
