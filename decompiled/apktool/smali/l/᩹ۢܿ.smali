.class public final Ll/᩹ۢܿ;
.super Ljava/lang/Object;
.source "V702"


# instance fields
.field public final ֫:Ll/ܶۘܿ;

.field public final ۖ:Ll/ۢۖܿ;

.field public ۘ:Ll/ܽۢܿ;

.field public final ۜ:I

.field public ۡ:Z

.field public ۢ:I

.field public final ۧ:Ll/ᩳۢܿ;

.field public final ܳ:I

.field public final ܺ:Ll/ܽۢܿ;

.field public final ܽ:Ll/۫ۘܿ;

.field public final ܿ:I

.field public ᩳ:I

.field public ᩴ:Z

.field public final ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ۢۖܿ;Ll/۫ۘܿ;Ll/ܶۘܿ;IIIIIILl/ᩳۢܿ;Z)V
    .locals 8

    move-object v0, p0

    move-object/from16 v2, p10

    .line 1229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 1230
    iput-object v1, v0, Ll/᩹ۢܿ;->ۖ:Ll/ۢۖܿ;

    move-object v1, p2

    .line 1231
    iput-object v1, v0, Ll/᩹ۢܿ;->ܽ:Ll/۫ۘܿ;

    move-object v3, p3

    .line 1232
    iput-object v3, v0, Ll/᩹ۢܿ;->֫:Ll/ܶۘܿ;

    move v4, p4

    .line 1233
    iput v4, v0, Ll/᩹ۢܿ;->᩷:I

    move v5, p5

    .line 1234
    iput v5, v0, Ll/᩹ۢܿ;->ܳ:I

    move v1, p6

    .line 1235
    iput v1, v0, Ll/᩹ۢܿ;->ۜ:I

    move v1, p7

    .line 1236
    iput v1, v0, Ll/᩹ۢܿ;->ܿ:I

    move/from16 v1, p8

    .line 1237
    iput v1, v0, Ll/᩹ۢܿ;->ۢ:I

    move/from16 v1, p9

    .line 1238
    iput v1, v0, Ll/᩹ۢܿ;->᩻:I

    .line 1239
    iput-object v2, v0, Ll/᩹ۢܿ;->ۧ:Ll/ᩳۢܿ;

    if-eqz v2, :cond_1

    if-nez p11, :cond_0

    goto :goto_0

    .line 99
    :cond_0
    new-instance v7, Ll/ܽۢܿ;

    const/4 v6, 0x0

    move-object v1, v7

    move-object/from16 v2, p10

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v1 .. v6}, Ll/ܽۢܿ;-><init>(Ll/ᩳۢܿ;Ll/ܶۘܿ;IIZ)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v7, 0x0

    .line 1241
    :goto_1
    iput-object v7, v0, Ll/᩹ۢܿ;->ܺ:Ll/ܽۢܿ;

    return-void
.end method
