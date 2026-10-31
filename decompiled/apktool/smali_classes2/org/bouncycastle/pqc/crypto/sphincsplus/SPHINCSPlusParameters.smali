.class public Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;
.super Ljava/lang/Object;


# static fields
.field public static final ID_TO_PARAMS:Ljava/util/Map;

.field public static final haraka_128f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final haraka_128f_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final haraka_128s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final haraka_128s_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final haraka_192f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final haraka_192f_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final haraka_192s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final haraka_192s_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final haraka_256f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final haraka_256f_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final haraka_256s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final haraka_256s_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final sha2_128f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final sha2_128f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final sha2_128s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final sha2_128s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final sha2_192f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final sha2_192f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final sha2_192s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final sha2_192s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final sha2_256f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final sha2_256f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final sha2_256s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final sha2_256s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final shake_128f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final shake_128f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final shake_128s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final shake_128s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final shake_192f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final shake_192f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final shake_192s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final shake_192s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final shake_256f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final shake_256f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final shake_256s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

.field public static final shake_256s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;


# instance fields
.field public final engineProvider:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;

.field public final id:Ljava/lang/Integer;

.field public final name:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 50

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v1, 0x10101

    invoke-static {v1}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v10, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;

    const/16 v8, 0x21

    const/16 v9, 0x42

    const/4 v3, 0x1

    const/16 v4, 0x10

    const/16 v13, 0x10

    const/16 v6, 0x16

    const/4 v7, 0x6

    move-object v2, v10

    move v5, v13

    invoke-direct/range {v2 .. v9}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;-><init>(ZIIIIII)V

    const-string v2, "sha2-128f-robust"

    invoke-direct {v0, v1, v2, v10}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_128f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v1, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v2, 0x10102

    invoke-static {v2}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;

    const/16 v17, 0xe

    const/16 v18, 0x3f

    const/4 v12, 0x1

    const/16 v14, 0x10

    const/4 v15, 0x7

    const/16 v16, 0xc

    move-object v11, v3

    invoke-direct/range {v11 .. v18}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;-><init>(ZIIIIII)V

    const-string v4, "sha2-128s-robust"

    invoke-direct {v1, v2, v4, v3}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v1, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_128s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v2, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v3, 0x10103

    invoke-static {v3}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;

    const/16 v10, 0x21

    const/16 v11, 0x42

    const/4 v5, 0x1

    const/16 v6, 0x18

    const/16 v7, 0x10

    const/16 v8, 0x16

    const/16 v9, 0x8

    move-object v4, v12

    invoke-direct/range {v4 .. v11}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;-><init>(ZIIIIII)V

    const-string v4, "sha2-192f-robust"

    invoke-direct {v2, v3, v4, v12}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v2, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_192f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v3, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v4, 0x10104

    invoke-static {v4}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;

    const/16 v11, 0x11

    const/16 v12, 0x3f

    const/4 v6, 0x1

    const/16 v7, 0x18

    const/16 v8, 0x10

    const/4 v9, 0x7

    const/16 v10, 0xe

    move-object v5, v13

    invoke-direct/range {v5 .. v12}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;-><init>(ZIIIIII)V

    const-string v5, "sha2-192s-robust"

    invoke-direct {v3, v4, v5, v13}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v3, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_192s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v4, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v5, 0x10105

    invoke-static {v5}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v14, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;

    const/16 v12, 0x23

    const/16 v13, 0x44

    const/4 v7, 0x1

    const/16 v8, 0x20

    const/16 v9, 0x10

    const/16 v10, 0x11

    const/16 v11, 0x9

    move-object v6, v14

    invoke-direct/range {v6 .. v13}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;-><init>(ZIIIIII)V

    const-string v6, "sha2-256f-robust"

    invoke-direct {v4, v5, v6, v14}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v4, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_256f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v5, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v6, 0x10106

    invoke-static {v6}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;

    const/16 v13, 0x16

    const/16 v14, 0x40

    const/4 v8, 0x1

    const/16 v9, 0x20

    const/16 v18, 0x10

    const/16 v11, 0x8

    const/16 v12, 0xe

    move-object v7, v15

    move/from16 v10, v18

    invoke-direct/range {v7 .. v14}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;-><init>(ZIIIIII)V

    const-string v7, "sha2-256s-robust"

    invoke-direct {v5, v6, v7, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v5, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_256s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v6, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v7, 0x10201

    invoke-static {v7}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v8, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;

    const/16 v22, 0x21

    const/16 v23, 0x42

    const/16 v17, 0x0

    const/16 v11, 0x10

    const/16 v20, 0x16

    const/16 v21, 0x6

    move-object/from16 v16, v8

    move/from16 v19, v11

    invoke-direct/range {v16 .. v23}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;-><init>(ZIIIIII)V

    const-string v9, "sha2-128f"

    invoke-direct {v6, v7, v9, v8}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v6, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_128f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v7, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v8, 0x10202

    invoke-static {v8}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;

    const/16 v16, 0xe

    const/16 v17, 0x3f

    const/4 v10, 0x0

    const/16 v12, 0x10

    const/4 v13, 0x7

    const/16 v14, 0xc

    move-object v9, v15

    move-object/from16 v24, v15

    move/from16 v15, v16

    move/from16 v16, v17

    invoke-direct/range {v9 .. v16}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;-><init>(ZIIIIII)V

    const-string v9, "sha2-128s"

    move-object/from16 v10, v24

    invoke-direct {v7, v8, v9, v10}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v7, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_128s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v8, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v9, 0x10203

    invoke-static {v9}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;

    const/16 v16, 0x21

    const/16 v17, 0x42

    const/4 v11, 0x0

    const/16 v12, 0x18

    const/16 v13, 0x10

    const/16 v14, 0x16

    const/16 v18, 0x8

    move-object v10, v15

    move-object/from16 v25, v15

    move/from16 v15, v18

    invoke-direct/range {v10 .. v17}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;-><init>(ZIIIIII)V

    const-string v10, "sha2-192f"

    move-object/from16 v11, v25

    invoke-direct {v8, v9, v10, v11}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v8, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_192f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v9, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v10, 0x10204

    invoke-static {v10}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;

    const/16 v17, 0x11

    const/16 v18, 0x3f

    const/4 v12, 0x0

    const/16 v13, 0x18

    const/16 v14, 0x10

    const/16 v16, 0x7

    const/16 v19, 0xe

    move-object v11, v15

    move-object/from16 v26, v15

    move/from16 v15, v16

    move/from16 v16, v19

    invoke-direct/range {v11 .. v18}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;-><init>(ZIIIIII)V

    const-string v11, "sha2-192s"

    move-object/from16 v12, v26

    invoke-direct {v9, v10, v11, v12}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v9, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_192s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v10, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v11, 0x10205

    invoke-static {v11}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;

    const/16 v18, 0x23

    const/16 v19, 0x44

    const/4 v13, 0x0

    const/16 v14, 0x20

    const/16 v16, 0x10

    const/16 v20, 0x9

    move-object v12, v15

    move-object/from16 v27, v15

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v20

    invoke-direct/range {v12 .. v19}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;-><init>(ZIIIIII)V

    const-string v12, "sha2-256f"

    move-object/from16 v13, v27

    invoke-direct {v10, v11, v12, v13}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v10, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_256f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v11, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v12, 0x10206

    invoke-static {v12}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;

    const/16 v19, 0x16

    const/16 v20, 0x40

    const/4 v14, 0x0

    const/16 v16, 0x20

    const/16 v23, 0x10

    const/16 v17, 0x8

    const/16 v18, 0xe

    move-object v13, v15

    move-object/from16 v29, v15

    move/from16 v15, v16

    move/from16 v16, v23

    invoke-direct/range {v13 .. v20}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Sha2EngineProvider;-><init>(ZIIIIII)V

    const-string v13, "sha2-256s"

    move-object/from16 v14, v29

    invoke-direct {v11, v12, v13, v14}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v11, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->sha2_256s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v13, 0x20101

    invoke-static {v13}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    new-instance v14, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;

    const/16 v27, 0x21

    const/16 v28, 0x42

    const/16 v22, 0x1

    const/16 v31, 0x10

    const/16 v25, 0x16

    const/16 v26, 0x6

    move-object/from16 v21, v14

    move/from16 v24, v31

    invoke-direct/range {v21 .. v28}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;-><init>(ZIIIIII)V

    const-string v15, "shake-128f-robust"

    invoke-direct {v12, v13, v15, v14}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_128f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x20102

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;

    const/16 v35, 0xe

    const/16 v36, 0x3f

    const/16 v30, 0x1

    const/16 v32, 0x10

    const/16 v33, 0x7

    const/16 v34, 0xc

    move-object/from16 v29, v15

    invoke-direct/range {v29 .. v36}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v16, v12

    const-string v12, "shake-128s-robust"

    invoke-direct {v13, v14, v12, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_128s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x20103

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;

    const/16 v23, 0x21

    const/16 v24, 0x42

    const/16 v18, 0x1

    const/16 v19, 0x18

    const/16 v20, 0x10

    const/16 v21, 0x16

    const/16 v22, 0x8

    move-object/from16 v17, v15

    invoke-direct/range {v17 .. v24}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v17, v13

    const-string v13, "shake-192f-robust"

    invoke-direct {v12, v14, v13, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_192f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x20104

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;

    const/16 v24, 0x11

    const/16 v25, 0x3f

    const/16 v19, 0x1

    const/16 v20, 0x18

    const/16 v21, 0x10

    const/16 v22, 0x7

    const/16 v23, 0xe

    move-object/from16 v18, v15

    invoke-direct/range {v18 .. v25}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v18, v12

    const-string v12, "shake-192s-robust"

    invoke-direct {v13, v14, v12, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_192s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x20105

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;

    const/16 v25, 0x23

    const/16 v26, 0x44

    const/16 v20, 0x1

    const/16 v21, 0x20

    const/16 v22, 0x10

    const/16 v23, 0x11

    const/16 v24, 0x9

    move-object/from16 v19, v15

    invoke-direct/range {v19 .. v26}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v19, v13

    const-string v13, "shake-256f-robust"

    invoke-direct {v12, v14, v13, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_256f_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x20106

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;

    const/16 v26, 0x16

    const/16 v27, 0x40

    const/16 v21, 0x1

    const/16 v22, 0x20

    const/16 v30, 0x10

    const/16 v24, 0x8

    const/16 v25, 0xe

    move-object/from16 v20, v15

    move/from16 v23, v30

    invoke-direct/range {v20 .. v27}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v20, v12

    const-string v12, "shake-256s-robust"

    invoke-direct {v13, v14, v12, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_256s_robust:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x20201

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;

    const/16 v34, 0x21

    const/16 v35, 0x42

    const/16 v29, 0x0

    const/16 v23, 0x10

    const/16 v32, 0x16

    const/16 v33, 0x6

    move-object/from16 v28, v15

    move/from16 v31, v23

    invoke-direct/range {v28 .. v35}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v29, v13

    const-string v13, "shake-128f"

    invoke-direct {v12, v14, v13, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_128f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x20202

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;

    const/16 v27, 0xe

    const/16 v28, 0x3f

    const/16 v22, 0x0

    const/16 v24, 0x10

    const/16 v25, 0x7

    const/16 v26, 0xc

    move-object/from16 v21, v15

    invoke-direct/range {v21 .. v28}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v21, v12

    const-string v12, "shake-128s"

    invoke-direct {v13, v14, v12, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_128s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x20203

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;

    const/16 v36, 0x21

    const/16 v37, 0x42

    const/16 v31, 0x0

    const/16 v32, 0x18

    const/16 v33, 0x10

    const/16 v34, 0x16

    const/16 v35, 0x8

    move-object/from16 v30, v15

    invoke-direct/range {v30 .. v37}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v22, v13

    const-string v13, "shake-192f"

    invoke-direct {v12, v14, v13, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_192f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x20204

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;

    const/16 v36, 0x11

    const/16 v37, 0x3f

    const/16 v34, 0x7

    const/16 v35, 0xe

    move-object/from16 v30, v15

    invoke-direct/range {v30 .. v37}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v23, v12

    const-string v12, "shake-192s"

    invoke-direct {v13, v14, v12, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_192s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x20205

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;

    const/16 v36, 0x23

    const/16 v37, 0x44

    const/16 v32, 0x20

    const/16 v34, 0x11

    const/16 v35, 0x9

    move-object/from16 v30, v15

    invoke-direct/range {v30 .. v37}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v24, v13

    const-string v13, "shake-256f"

    invoke-direct {v12, v14, v13, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_256f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x20206

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;

    const/16 v36, 0x16

    const/16 v37, 0x40

    const/16 v40, 0x10

    const/16 v34, 0x8

    const/16 v35, 0xe

    move-object/from16 v30, v15

    move/from16 v33, v40

    invoke-direct/range {v30 .. v37}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$Shake256EngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v25, v12

    const-string v12, "shake-256s"

    invoke-direct {v13, v14, v12, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->shake_256s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x30101

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;

    const/16 v44, 0x21

    const/16 v45, 0x42

    const/16 v39, 0x1

    const/16 v32, 0x10

    const/16 v42, 0x16

    const/16 v43, 0x6

    move-object/from16 v38, v15

    move/from16 v41, v32

    invoke-direct/range {v38 .. v45}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v26, v13

    const-string v13, "haraka-128f-robust"

    invoke-direct {v12, v14, v13, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_128f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x30102

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;

    const/16 v36, 0xe

    const/16 v37, 0x3f

    const/16 v31, 0x1

    const/16 v33, 0x10

    const/16 v34, 0x7

    const/16 v35, 0xc

    move-object/from16 v30, v15

    invoke-direct/range {v30 .. v37}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v27, v12

    const-string v12, "haraka-128s-robust"

    invoke-direct {v13, v14, v12, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_128s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x30103

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;

    const/16 v36, 0x21

    const/16 v37, 0x42

    const/16 v32, 0x18

    const/16 v34, 0x16

    const/16 v35, 0x8

    move-object/from16 v30, v15

    invoke-direct/range {v30 .. v37}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v28, v13

    const-string v13, "haraka-192f-robust"

    invoke-direct {v12, v14, v13, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_192f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x30104

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;

    const/16 v36, 0x11

    const/16 v37, 0x3f

    const/16 v34, 0x7

    const/16 v35, 0xe

    move-object/from16 v30, v15

    invoke-direct/range {v30 .. v37}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v30, v12

    const-string v12, "haraka-192s-robust"

    invoke-direct {v13, v14, v12, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_192s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x30105

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;

    const/16 v37, 0x23

    const/16 v38, 0x44

    const/16 v32, 0x1

    const/16 v33, 0x20

    const/16 v34, 0x10

    const/16 v35, 0x11

    const/16 v36, 0x9

    move-object/from16 v31, v15

    invoke-direct/range {v31 .. v38}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v31, v13

    const-string v13, "haraka-256f-robust"

    invoke-direct {v12, v14, v13, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_256f:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x30106

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;

    const/16 v38, 0x16

    const/16 v39, 0x40

    const/16 v33, 0x1

    const/16 v34, 0x20

    const/16 v42, 0x10

    const/16 v36, 0x8

    const/16 v37, 0xe

    move-object/from16 v32, v15

    move/from16 v35, v42

    invoke-direct/range {v32 .. v39}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v32, v12

    const-string v12, "haraka-256s-robust"

    invoke-direct {v13, v14, v12, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_256s:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x30201

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;

    const/16 v46, 0x21

    const/16 v47, 0x42

    const/16 v41, 0x0

    const/16 v35, 0x10

    const/16 v44, 0x16

    const/16 v45, 0x6

    move-object/from16 v40, v15

    move/from16 v43, v35

    invoke-direct/range {v40 .. v47}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v41, v13

    const-string v13, "haraka-128f-simple"

    invoke-direct {v12, v14, v13, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_128f_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x30202

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;

    const/16 v39, 0xe

    const/16 v40, 0x3f

    const/16 v34, 0x0

    const/16 v36, 0x10

    const/16 v37, 0x7

    const/16 v38, 0xc

    move-object/from16 v33, v15

    invoke-direct/range {v33 .. v40}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v33, v12

    const-string v12, "haraka-128s-simple"

    invoke-direct {v13, v14, v12, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_128s_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x30203

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;

    const/16 v48, 0x21

    const/16 v49, 0x42

    const/16 v43, 0x0

    const/16 v44, 0x18

    const/16 v45, 0x10

    const/16 v46, 0x16

    const/16 v47, 0x8

    move-object/from16 v42, v15

    invoke-direct/range {v42 .. v49}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v34, v13

    const-string v13, "haraka-192f-simple"

    invoke-direct {v12, v14, v13, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_192f_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x30204

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;

    const/16 v48, 0x11

    const/16 v49, 0x3f

    const/16 v46, 0x7

    const/16 v47, 0xe

    move-object/from16 v42, v15

    invoke-direct/range {v42 .. v49}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v35, v12

    const-string v12, "haraka-192s-simple"

    invoke-direct {v13, v14, v12, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_192s_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x30205

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;

    const/16 v48, 0x23

    const/16 v49, 0x44

    const/16 v44, 0x20

    const/16 v46, 0x11

    const/16 v47, 0x9

    move-object/from16 v42, v15

    invoke-direct/range {v42 .. v49}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v36, v13

    const-string v13, "haraka-256f-simple"

    invoke-direct {v12, v14, v13, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_256f_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const v14, 0x30206

    invoke-static {v14}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;

    const/16 v48, 0x16

    const/16 v49, 0x40

    const/16 v46, 0x8

    const/16 v47, 0xe

    move-object/from16 v42, v15

    invoke-direct/range {v42 .. v49}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters$HarakaSEngineProvider;-><init>(ZIIIIII)V

    move-object/from16 v37, v12

    const-string v12, "haraka-256s-simple"

    invoke-direct {v13, v14, v12, v15}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V

    sput-object v13, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->haraka_256s_simple:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    sput-object v12, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->ID_TO_PARAMS:Ljava/util/Map;

    const/16 v12, 0x24

    new-array v14, v12, [Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    const/4 v15, 0x0

    aput-object v0, v14, v15

    const/4 v0, 0x1

    aput-object v1, v14, v0

    const/4 v0, 0x2

    aput-object v2, v14, v0

    const/4 v0, 0x3

    aput-object v3, v14, v0

    const/4 v0, 0x4

    aput-object v4, v14, v0

    const/4 v0, 0x5

    aput-object v5, v14, v0

    const/4 v0, 0x6

    aput-object v6, v14, v0

    const/4 v0, 0x7

    aput-object v7, v14, v0

    const/16 v0, 0x8

    aput-object v8, v14, v0

    const/16 v0, 0x9

    aput-object v9, v14, v0

    const/16 v0, 0xa

    aput-object v10, v14, v0

    const/16 v0, 0xb

    aput-object v11, v14, v0

    const/16 v0, 0xc

    aput-object v16, v14, v0

    const/16 v0, 0xd

    aput-object v17, v14, v0

    const/16 v0, 0xe

    aput-object v18, v14, v0

    const/16 v0, 0xf

    aput-object v19, v14, v0

    const/16 v0, 0x10

    aput-object v20, v14, v0

    const/16 v0, 0x11

    aput-object v29, v14, v0

    const/16 v0, 0x12

    aput-object v21, v14, v0

    const/16 v0, 0x13

    aput-object v22, v14, v0

    const/16 v0, 0x14

    aput-object v23, v14, v0

    const/16 v0, 0x15

    aput-object v24, v14, v0

    const/16 v0, 0x16

    aput-object v25, v14, v0

    const/16 v0, 0x17

    aput-object v26, v14, v0

    const/16 v0, 0x18

    aput-object v27, v14, v0

    const/16 v0, 0x19

    aput-object v28, v14, v0

    const/16 v0, 0x1a

    aput-object v30, v14, v0

    const/16 v0, 0x1b

    aput-object v31, v14, v0

    const/16 v0, 0x1c

    aput-object v32, v14, v0

    const/16 v0, 0x1d

    aput-object v41, v14, v0

    const/16 v0, 0x1e

    aput-object v33, v14, v0

    const/16 v0, 0x1f

    aput-object v34, v14, v0

    const/16 v0, 0x20

    aput-object v35, v14, v0

    const/16 v0, 0x21

    aput-object v36, v14, v0

    const/16 v0, 0x22

    aput-object v37, v14, v0

    const/16 v0, 0x23

    aput-object v13, v14, v0

    :goto_0
    if-ge v15, v12, :cond_0

    aget-object v0, v14, v15

    sget-object v1, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->ID_TO_PARAMS:Ljava/util/Map;

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->getID()Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v15, v15, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/String;Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->id:Ljava/lang/Integer;

    iput-object p2, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->name:Ljava/lang/String;

    iput-object p3, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->engineProvider:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;

    return-void
.end method

.method public static getID(Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;)Ljava/lang/Integer;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->getID()Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static getParams(Ljava/lang/Integer;)Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->ID_TO_PARAMS:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;

    return-object p0
.end method


# virtual methods
.method public getEncoded()[B
    .locals 1

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->getID()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lorg/bouncycastle/util/Pack;->intToBigEndian(I)[B

    move-result-object v0

    return-object v0
.end method

.method public getEngine()Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngine;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->engineProvider:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;

    invoke-interface {v0}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;->get()Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngine;

    move-result-object v0

    return-object v0
.end method

.method public getID()Ljava/lang/Integer;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public getN()I
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->engineProvider:Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;

    invoke-interface {v0}, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusEngineProvider;->getN()I

    move-result v0

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/sphincsplus/SPHINCSPlusParameters;->name:Ljava/lang/String;

    return-object v0
.end method
