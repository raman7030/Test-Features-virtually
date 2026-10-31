.class public final Ll/ܳۛ᩻;
.super Ll/ۨۤ᩻;
.source "56XL"


# static fields
.field public static final synthetic ۠:I

.field public static final ܶ:Ll/ۤۤ᩻;


# instance fields
.field public final ֡:I

.field public final ֨:Ll/᩵᩻ۜ;

.field public final ۚ:Ll/ۚܺۜ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "2025-06-18"

    const-string v1, "2025-03-26"

    .line 32
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۤۤ᩻;->֫([Ljava/lang/String;)Ll/ۤۤ᩻;

    move-result-object v0

    sput-object v0, Ll/ܳۛ᩻;->ܶ:Ll/ۤۤ᩻;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 21

    move-object/from16 v7, p0

    move/from16 v8, p1

    .line 66
    new-instance v6, Ll/᩵᩻ۜ;

    invoke-direct {v6}, Ll/᩵᩻ۜ;-><init>()V

    .line 73
    new-instance v5, Ll/ۚܺۜ;

    new-instance v0, Ll/ᩳۖۜ;

    .line 74
    invoke-static {}, Ll/᩹ۤ᩻;->֫()Ll/᩸ۤ᩻;

    move-result-object v1

    invoke-static {}, Ll/᩹ۤ᩻;->ۧ()Ll/ۛۖۜ;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/ᩳۖۜ;-><init>(Ll/᩸ۤ᩻;Ll/ۛۖۜ;)V

    invoke-direct {v5, v0}, Ll/ۚܺۜ;-><init>(Ll/ᩳۖۜ;)V

    const-string v0, "version"

    const-string v1, "0.2.0"

    const-string v2, "name"

    const-string v3, "MT MCP"

    .line 0
    invoke-static {v2, v3, v0, v1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 84
    new-instance v4, Ll/۫ۛ᩻;

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    .line 62
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0x1e

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    new-instance v2, Ll/۬ܿۜ;

    invoke-direct {v2}, Ll/۬ܿۜ;-><init>()V

    .line 64
    new-instance v11, Ll/ܽܳۜ;

    invoke-direct {v11, v6}, Ll/ܽܳۜ;-><init>(Ll/᩵᩻ۜ;)V

    .line 65
    new-instance v12, Ll/ܿܳۜ;

    invoke-direct {v12, v6}, Ll/ܿܳۜ;-><init>(Ll/᩵᩻ۜ;)V

    .line 66
    new-instance v13, Ll/ۖܳۜ;

    invoke-direct {v13, v6}, Ll/ۖܳۜ;-><init>(Ll/᩵᩻ۜ;)V

    .line 67
    new-instance v14, Ll/ۚܳۜ;

    invoke-direct {v14, v6}, Ll/ۚܳۜ;-><init>(Ll/᩵᩻ۜ;)V

    .line 68
    new-instance v15, Ll/᩺ܳۜ;

    invoke-direct {v15, v6}, Ll/᩺ܳۜ;-><init>(Ll/᩵᩻ۜ;)V

    .line 69
    new-instance v10, Ll/ᩴܳۜ;

    invoke-direct {v10, v6}, Ll/ᩴܳۜ;-><init>(Ll/᩵᩻ۜ;)V

    .line 70
    new-instance v9, Ll/᩻ۧۜ;

    invoke-direct {v9, v6}, Ll/᩻ۧۜ;-><init>(Ll/᩵᩻ۜ;)V

    .line 71
    new-instance v7, Ll/ܶۧۜ;

    invoke-direct {v7, v6}, Ll/ܶۧۜ;-><init>(Ll/᩵᩻ۜ;)V

    move-object/from16 v20, v3

    .line 72
    new-instance v3, Ll/ᩳܳۜ;

    invoke-direct {v3, v6}, Ll/ᩳܳۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    new-instance v3, Ll/ۛܳۜ;

    invoke-direct {v3, v6}, Ll/ۛܳۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    new-instance v3, Ll/ۡܳۜ;

    invoke-direct {v3, v13}, Ll/ۡܳۜ;-><init>(Ll/ۖܳۜ;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    new-instance v3, Ll/᩻ܳۜ;

    invoke-direct {v3, v13}, Ll/᩻ܳۜ;-><init>(Ll/ۖܳۜ;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    new-instance v3, Ll/᩷ܳۜ;

    invoke-direct {v3, v13}, Ll/᩷ܳۜ;-><init>(Ll/ۖܳۜ;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    new-instance v3, Ll/᩻֫ۜ;

    invoke-direct {v3, v6}, Ll/᩻֫ۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    new-instance v3, Ll/֨֫ۜ;

    invoke-direct {v3, v6}, Ll/֨֫ۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    new-instance v3, Ll/ۛ۟᩻;

    invoke-direct {v3, v6}, Ll/ۛ۟᩻;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    new-instance v3, Ll/ᩳ֫ۜ;

    invoke-direct {v3, v6}, Ll/ᩳ֫ۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    new-instance v3, Ll/ۛܿۜ;

    move-object/from16 v18, v9

    move-object v9, v3

    move-object/from16 v16, v10

    move-object v10, v6

    move-object/from16 v17, v2

    move-object/from16 v19, v7

    invoke-direct/range {v9 .. v19}, Ll/ۛܿۜ;-><init>(Ll/᩵᩻ۜ;Ll/ܽܳۜ;Ll/ܿܳۜ;Ll/ۖܳۜ;Ll/ۚܳۜ;Ll/᩺ܳۜ;Ll/ᩴܳۜ;Ll/۬ܿۜ;Ll/᩻ۧۜ;Ll/ܶۧۜ;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    new-instance v2, Ll/ܰܿۜ;

    invoke-direct {v2, v6}, Ll/ܰܿۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    new-instance v2, Ll/ۧܳۜ;

    invoke-direct {v2, v6}, Ll/ۧܳۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    new-instance v2, Ll/ۨܿۜ;

    invoke-direct {v2, v6}, Ll/ۨܿۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    new-instance v2, Ll/֫ܳۜ;

    invoke-direct {v2, v6}, Ll/֫ܳۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    new-instance v2, Ll/᩶ܿۜ;

    invoke-direct {v2, v6}, Ll/᩶ܿۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    new-instance v2, Ll/ܳܳۜ;

    invoke-direct {v2, v6}, Ll/ܳܳۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    new-instance v2, Ll/᩺֫ۜ;

    invoke-direct {v2, v6}, Ll/᩺֫ۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    new-instance v2, Ll/ᩳۧۜ;

    invoke-direct {v2, v6}, Ll/ᩳۧۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    new-instance v2, Ll/᩺ܿۜ;

    invoke-direct {v2, v6}, Ll/᩺ܿۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    new-instance v2, Ll/۫ܿۜ;

    invoke-direct {v2, v6}, Ll/۫ܿۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    new-instance v2, Ll/ۤܿۜ;

    invoke-direct {v2, v6}, Ll/ۤܿۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    new-instance v2, Ll/ۢܳۜ;

    invoke-direct {v2, v6}, Ll/ۢܳۜ;-><init>(Ll/᩵᩻ۜ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 101
    new-instance v1, Ll/ᩳۖۜ;

    invoke-static {}, Ll/᩹ۤ᩻;->֫()Ll/᩸ۤ᩻;

    move-result-object v2

    .line 102
    invoke-static {}, Ll/᩹ۤ᩻;->ۧ()Ll/ۛۖۜ;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll/ᩳۖۜ;-><init>(Ll/᩸ۤ᩻;Ll/ۛۖۜ;)V

    .line 103
    new-instance v2, Ll/۬ۖۜ;

    invoke-direct {v2, v1}, Ll/۬ۖۜ;-><init>(Ll/ᩳۖۜ;)V

    .line 57
    new-instance v3, Ll/᩻ܺۜ;

    invoke-direct {v3, v1}, Ll/᩻ܺۜ;-><init>(Ll/ᩳۖۜ;)V

    .line 58
    new-instance v7, Ll/۬ۡۜ;

    invoke-direct {v7, v1}, Ll/۬ۡۜ;-><init>(Ll/ᩳۖۜ;)V

    .line 59
    new-instance v9, Ll/ܶۡۜ;

    invoke-direct {v9, v1}, Ll/ܶۡۜ;-><init>(Ll/ᩳۖۜ;)V

    .line 60
    new-instance v10, Ll/ۜۡۜ;

    invoke-direct {v10, v1}, Ll/ۜۡۜ;-><init>(Ll/ᩳۖۜ;)V

    .line 62
    new-instance v11, Ll/֡ۡۜ;

    invoke-direct {v11, v1}, Ll/֡ۡۜ;-><init>(Ll/ᩳۖۜ;)V

    .line 64
    new-instance v12, Ljava/util/ArrayList;

    const/16 v13, 0x13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    new-instance v13, Ll/᩹ۘۜ;

    new-instance v14, Ll/ۙܽܽ;

    invoke-direct {v14, v1}, Ll/ۙܽܽ;-><init>(Ljava/lang/Object;)V

    invoke-direct {v13, v14}, Ll/᩹ۘۜ;-><init>(Ll/ۙܽܽ;)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    new-instance v13, Ll/᩷ᩴۜ;

    invoke-direct {v13, v3}, Ll/᩷ᩴۜ;-><init>(Ll/᩻ܺۜ;)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    new-instance v13, Ll/۫ᩴۜ;

    invoke-direct {v13, v3}, Ll/۫ᩴۜ;-><init>(Ll/᩻ܺۜ;)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    new-instance v13, Ll/֨ᩴۜ;

    invoke-direct {v13, v1}, Ll/֨ᩴۜ;-><init>(Ll/ᩳۖۜ;)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    new-instance v13, Ll/᩵ᩴۜ;

    invoke-direct {v13, v1}, Ll/᩵ᩴۜ;-><init>(Ll/ᩳۖۜ;)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    new-instance v13, Ll/᩻ᩴۜ;

    invoke-direct {v13, v2}, Ll/᩻ᩴۜ;-><init>(Ll/۬ۖۜ;)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    new-instance v13, Ll/۟ᩴۜ;

    invoke-direct {v13, v2}, Ll/۟ᩴۜ;-><init>(Ll/۬ۖۜ;)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    new-instance v13, Ll/ۖᩴۜ;

    invoke-direct {v13, v2}, Ll/ۖᩴۜ;-><init>(Ll/۬ۖۜ;)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    new-instance v13, Ll/᩺ۘۜ;

    invoke-direct {v13, v2}, Ll/᩺ۘۜ;-><init>(Ll/۬ۖۜ;)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    new-instance v13, Ll/ۡᩴۜ;

    invoke-direct {v13, v7}, Ll/ۡᩴۜ;-><init>(Ll/۬ۡۜ;)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    new-instance v7, Ll/ᩳᩴۜ;

    invoke-direct {v7, v9}, Ll/ᩳᩴۜ;-><init>(Ll/ܶۡۜ;)V

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    new-instance v7, Ll/۟ۘۜ;

    invoke-direct {v7, v10}, Ll/۟ۘۜ;-><init>(Ll/ۜۡۜ;)V

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    new-instance v7, Ll/ۧᩴۜ;

    invoke-direct {v7, v11}, Ll/ۧᩴۜ;-><init>(Ll/֡ۡۜ;)V

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    new-instance v7, Ll/۬ᩴۜ;

    new-instance v9, Ll/ۖܺۜ;

    invoke-direct {v9, v1, v3}, Ll/ۖܺۜ;-><init>(Ll/ᩳۖۜ;Ll/᩻ܺۜ;)V

    invoke-direct {v7, v9}, Ll/۬ᩴۜ;-><init>(Ll/ۖܺۜ;)V

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    new-instance v3, Ll/᩹ᩴۜ;

    invoke-direct {v3, v2}, Ll/᩹ᩴۜ;-><init>(Ll/۬ۖۜ;)V

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    new-instance v3, Ll/᩺ᩴۜ;

    invoke-direct {v3, v2}, Ll/᩺ᩴۜ;-><init>(Ll/۬ۖۜ;)V

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    new-instance v3, Ll/ۙۘۜ;

    invoke-direct {v3, v2}, Ll/ۙۘۜ;-><init>(Ll/۬ۖۜ;)V

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    new-instance v3, Ll/۫ۘۜ;

    invoke-direct {v3, v2}, Ll/۫ۘۜ;-><init>(Ll/۬ۖۜ;)V

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    new-instance v3, Ll/ۙᩴۜ;

    invoke-direct {v3, v5}, Ll/ۙᩴۜ;-><init>(Ll/ۚܺۜ;)V

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 105
    new-instance v3, Ll/ܶۢۜ;

    new-instance v7, Ll/۫ۢۜ;

    invoke-direct {v7, v2, v6}, Ll/۫ۢۜ;-><init>(Ll/۬ۖۜ;Ll/᩵᩻ۜ;)V

    invoke-direct {v3, v7}, Ll/ܶۢۜ;-><init>(Ll/۫ۢۜ;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    invoke-static {v1, v2}, Ll/᩻֡ۜ;->֫(Ll/ᩳۖۜ;Ll/۬ۖۜ;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 85
    invoke-direct {v4, v0}, Ll/۫ۛ᩻;-><init>(Ljava/util/ArrayList;)V

    new-instance v7, Ll/ܽۛ᩻;

    invoke-direct {v7, v8}, Ll/ܽۛ᩻;-><init>(I)V

    .line 89
    invoke-static {}, Ll/ۚۢۜ;->ܽ()Ll/ۚۢۜ;

    move-result-object v9

    .line 79
    sget-object v2, Ll/ܳۛ᩻;->ܶ:Ll/ۤۤ᩻;

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v3, v20

    move-object v10, v5

    move-object v5, v7

    move-object v7, v6

    move-object v6, v9

    invoke-direct/range {v0 .. v6}, Ll/ۨۤ᩻;-><init>(ILl/ۤۤ᩻;Lbin/mt/json/JSONObject;Ll/۫ۛ᩻;Ll/ܽۛ᩻;Ll/ۚۢۜ;)V

    .line 90
    iput-object v10, v0, Ll/ܳۛ᩻;->ۚ:Ll/ۚܺۜ;

    .line 91
    iput v8, v0, Ll/ܳۛ᩻;->֡:I

    .line 92
    iput-object v7, v0, Ll/ܳۛ᩻;->֨:Ll/᩵᩻ۜ;

    return-void
.end method

.method public static ֫(Ll/ۖۛ᩻;)Ll/᩵᩻ۜ;
    .locals 0

    .line 50
    invoke-static {}, Ll/᩵ۛ᩻;->֫()Ll/ܳۛ᩻;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 51
    :cond_0
    iget-object p0, p0, Ll/ܳۛ᩻;->֨:Ll/᩵᩻ۜ;

    return-object p0
.end method

.method public static ֫(Ll/ۘۛ᩻;)Ll/᩵᩻ۜ;
    .locals 0

    .line 42
    invoke-static {}, Ll/᩵ۛ᩻;->ܽ()Ll/ܳۛ᩻;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 43
    :cond_0
    iget-object p0, p0, Ll/ܳۛ᩻;->֨:Ll/᩵᩻ۜ;

    return-object p0
.end method


# virtual methods
.method public final ۡ()I
    .locals 1

    .line 115
    iget v0, p0, Ll/ܳۛ᩻;->֡:I

    return v0
.end method

.method public final ᩳ()V
    .locals 6

    const-string v0, "MT MCP smali cache shutdown failed"

    .line 123
    iget-object v1, p0, Ll/ܳۛ᩻;->֨:Ll/᩵᩻ۜ;

    iget-object v2, p0, Ll/ܳۛ᩻;->ۚ:Ll/ۚܺۜ;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "MT MCP server stop requested: port="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Ll/ܳۛ᩻;->֡:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", wasStarted="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    invoke-virtual {p0}, Ll/ۙܳܳ;->ܿ()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", alive="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    invoke-virtual {p0}, Ll/ۙܳܳ;->ۧ()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", listeningPort="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    invoke-virtual {p0}, Ll/ۙܳܳ;->֫()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/Throwable;

    const-string v5, "MT MCP server stop trace"

    invoke-direct {v4, v5}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 123
    invoke-static {v3, v4}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 129
    :try_start_0
    invoke-super {p0}, Ll/ۙܳܳ;->ᩳ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    invoke-virtual {v2}, Ll/ۚܺۜ;->close()V

    .line 133
    :try_start_1
    invoke-virtual {v1}, Ll/᩵᩻ۜ;->ܽ()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 135
    invoke-static {v0, v1}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception v3

    .line 131
    invoke-virtual {v2}, Ll/ۚܺۜ;->close()V

    .line 133
    :try_start_2
    invoke-virtual {v1}, Ll/᩵᩻ۜ;->ܽ()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v1

    .line 135
    invoke-static {v0, v1}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 137
    :goto_0
    throw v3
.end method
