.class public final Ll/᩷ۚܺ;
.super Ljava/lang/Object;
.source "SB7W"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ֡֫:Ll/ܽۚܺ;

.field public ֨֫:Ljava/lang/Float;

.field public ֫֫:Ll/ᩳۚܺ;

.field public ۖ֫:Ll/֨ۚܺ;

.field public ۗ:Ll/᩻ۚܺ;

.field public ۗ֫:Ljava/lang/Boolean;

.field public ۘ֫:[Ll/֨֡ܺ;

.field public ۙ:Ll/᩷֡ܺ;

.field public ۙ֫:Ljava/lang/Float;

.field public ۚ֫:Ljava/lang/Float;

.field public ۛ:Ll/۟֡ܺ;

.field public ۜ֫:Ll/֨ۚܺ;

.field public ۟:Ljava/lang/Integer;

.field public ۠֫:Ll/֨֡ܺ;

.field public ۡ֫:Ll/֨ۚܺ;

.field public ۢ֫:J

.field public ۤ:Ljava/lang/Float;

.field public ۧ֫:Ljava/lang/String;

.field public ۨ:Ljava/util/ArrayList;

.field public ۫:Ll/֨ۚܺ;

.field public ۬:Ljava/lang/Boolean;

.field public ܰ:Ll/֫ۚܺ;

.field public ܳ֫:Ljava/lang/Float;

.field public ܶ֫:Ll/ܿۚܺ;

.field public ܺ֫:Ljava/lang/Float;

.field public ܽ֫:Ljava/lang/String;

.field public ܿ֫:Ljava/lang/String;

.field public ᩳ֫:Ljava/lang/String;

.field public ᩴ֫:Ll/֨֡ܺ;

.field public ᩵֫:Ll/ۧۚܺ;

.field public ᩶:Ll/۟֡ܺ;

.field public ᩶֫:Ll/֨ۚܺ;

.field public ᩷֫:Ljava/lang/Float;

.field public ᩸:Ll/ܳ֡ܺ;

.field public ᩸֫:Ll/ܳۚܺ;

.field public ᩹:Ljava/lang/String;

.field public ᩹֫:Ll/ۜۚܺ;

.field public ᩺:Ll/֨֡ܺ;

.field public ᩻֫:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 1140
    iput-wide v0, p0, Ll/᩷ۚܺ;->ۢ֫:J

    return-void
.end method

.method public static ֫()Ll/᩷ۚܺ;
    .locals 8

    .line 1267
    new-instance v0, Ll/᩷ۚܺ;

    invoke-direct {v0}, Ll/᩷ۚܺ;-><init>()V

    const-wide/16 v1, -0x1

    .line 1268
    iput-wide v1, v0, Ll/᩷ۚܺ;->ۢ֫:J

    .line 1270
    sget-object v1, Ll/᩷֡ܺ;->᩹:Ll/᩷֡ܺ;

    iput-object v1, v0, Ll/᩷ۚܺ;->۫:Ll/֨ۚܺ;

    .line 1271
    sget-object v2, Ll/۟֡ܺ;->᩶:Ll/۟֡ܺ;

    iput-object v2, v0, Ll/᩷ۚܺ;->ۛ:Ll/۟֡ܺ;

    const/high16 v3, 0x3f800000    # 1.0f

    .line 1272
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iput-object v4, v0, Ll/᩷ۚܺ;->ۤ:Ljava/lang/Float;

    const/4 v5, 0x0

    .line 1273
    iput-object v5, v0, Ll/᩷ۚܺ;->ۖ֫:Ll/֨ۚܺ;

    .line 1274
    iput-object v4, v0, Ll/᩷ۚܺ;->֨֫:Ljava/lang/Float;

    .line 1275
    new-instance v6, Ll/֨֡ܺ;

    invoke-direct {v6, v3}, Ll/֨֡ܺ;-><init>(F)V

    iput-object v6, v0, Ll/᩷ۚܺ;->۠֫:Ll/֨֡ܺ;

    .line 1276
    sget-object v3, Ll/ۧۚܺ;->᩹:Ll/ۧۚܺ;

    iput-object v3, v0, Ll/᩷ۚܺ;->᩵֫:Ll/ۧۚܺ;

    .line 1277
    sget-object v3, Ll/ܽۚܺ;->᩶:Ll/ܽۚܺ;

    iput-object v3, v0, Ll/᩷ۚܺ;->֡֫:Ll/ܽۚܺ;

    const/high16 v3, 0x40800000    # 4.0f

    .line 1278
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    iput-object v3, v0, Ll/᩷ۚܺ;->ۚ֫:Ljava/lang/Float;

    .line 1279
    iput-object v5, v0, Ll/᩷ۚܺ;->ۘ֫:[Ll/֨֡ܺ;

    .line 1280
    new-instance v3, Ll/֨֡ܺ;

    const/4 v6, 0x0

    invoke-direct {v3, v6}, Ll/֨֡ܺ;-><init>(F)V

    iput-object v3, v0, Ll/᩷ۚܺ;->ᩴ֫:Ll/֨֡ܺ;

    .line 1281
    iput-object v4, v0, Ll/᩷ۚܺ;->ܳ֫:Ljava/lang/Float;

    .line 1282
    iput-object v1, v0, Ll/᩷ۚܺ;->ۙ:Ll/᩷֡ܺ;

    .line 1283
    iput-object v5, v0, Ll/᩷ۚܺ;->ۨ:Ljava/util/ArrayList;

    .line 1284
    new-instance v3, Ll/֨֡ܺ;

    const/high16 v6, 0x41400000    # 12.0f

    sget-object v7, Ll/۟ۚܺ;->ۛ:Ll/۟ۚܺ;

    invoke-direct {v3, v6, v7}, Ll/֨֡ܺ;-><init>(FLl/۟ۚܺ;)V

    iput-object v3, v0, Ll/᩷ۚܺ;->᩺:Ll/֨֡ܺ;

    const/16 v3, 0x190

    .line 1285
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Ll/᩷ۚܺ;->۟:Ljava/lang/Integer;

    .line 1286
    sget-object v3, Ll/֫ۚܺ;->᩶:Ll/֫ۚܺ;

    iput-object v3, v0, Ll/᩷ۚܺ;->ܰ:Ll/֫ۚܺ;

    .line 1287
    sget-object v3, Ll/ܳۚܺ;->ۙ:Ll/ܳۚܺ;

    iput-object v3, v0, Ll/᩷ۚܺ;->᩸֫:Ll/ܳۚܺ;

    .line 1288
    sget-object v3, Ll/᩻ۚܺ;->᩹:Ll/᩻ۚܺ;

    iput-object v3, v0, Ll/᩷ۚܺ;->ۗ:Ll/᩻ۚܺ;

    .line 1289
    sget-object v3, Ll/ܿۚܺ;->ۙ:Ll/ܿۚܺ;

    iput-object v3, v0, Ll/᩷ۚܺ;->ܶ֫:Ll/ܿۚܺ;

    .line 1290
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v3, v0, Ll/᩷ۚܺ;->᩻֫:Ljava/lang/Boolean;

    .line 1291
    iput-object v5, v0, Ll/᩷ۚܺ;->᩸:Ll/ܳ֡ܺ;

    .line 1292
    iput-object v5, v0, Ll/᩷ۚܺ;->ᩳ֫:Ljava/lang/String;

    .line 1293
    iput-object v5, v0, Ll/᩷ۚܺ;->ܽ֫:Ljava/lang/String;

    .line 1294
    iput-object v5, v0, Ll/᩷ۚܺ;->ۧ֫:Ljava/lang/String;

    .line 1295
    iput-object v3, v0, Ll/᩷ۚܺ;->۬:Ljava/lang/Boolean;

    .line 1296
    iput-object v3, v0, Ll/᩷ۚܺ;->ۗ֫:Ljava/lang/Boolean;

    .line 1297
    iput-object v1, v0, Ll/᩷ۚܺ;->ۡ֫:Ll/֨ۚܺ;

    .line 1298
    iput-object v4, v0, Ll/᩷ۚܺ;->ܺ֫:Ljava/lang/Float;

    .line 1299
    iput-object v5, v0, Ll/᩷ۚܺ;->᩹:Ljava/lang/String;

    .line 1300
    iput-object v2, v0, Ll/᩷ۚܺ;->᩶:Ll/۟֡ܺ;

    .line 1301
    iput-object v5, v0, Ll/᩷ۚܺ;->ܿ֫:Ljava/lang/String;

    .line 1302
    iput-object v5, v0, Ll/᩷ۚܺ;->ۜ֫:Ll/֨ۚܺ;

    .line 1303
    iput-object v4, v0, Ll/᩷ۚܺ;->᩷֫:Ljava/lang/Float;

    .line 1304
    iput-object v5, v0, Ll/᩷ۚܺ;->᩶֫:Ll/֨ۚܺ;

    .line 1305
    iput-object v4, v0, Ll/᩷ۚܺ;->ۙ֫:Ljava/lang/Float;

    .line 1306
    sget-object v1, Ll/ۜۚܺ;->᩶:Ll/ۜۚܺ;

    iput-object v1, v0, Ll/᩷ۚܺ;->᩹֫:Ll/ۜۚܺ;

    .line 1307
    sget-object v1, Ll/ᩳۚܺ;->᩹:Ll/ᩳۚܺ;

    iput-object v1, v0, Ll/᩷ۚܺ;->֫֫:Ll/ᩳۚܺ;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1335
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۚܺ;

    .line 1336
    iget-object v1, p0, Ll/᩷ۚܺ;->ۘ֫:[Ll/֨֡ܺ;

    if-eqz v1, :cond_0

    .line 1337
    invoke-virtual {v1}, [Ll/֨֡ܺ;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/֨֡ܺ;

    iput-object v1, v0, Ll/᩷ۚܺ;->ۘ֫:[Ll/֨֡ܺ;

    :cond_0
    return-object v0
.end method
