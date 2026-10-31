.class public abstract Ll/᩸ۘۢ;
.super Ljava/lang/Object;
.source "94WG"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static ᩹:[Ll/᩺ۖۢ;


# instance fields
.field public ᩸:Ll/᩶ۘۢ;


# direct methods
.method public static constructor <clinit>()V
    .locals 38

    .line 13
    new-instance v0, Ll/᩺ۖۢ;

    const-string v1, "SYST"

    const-class v2, Ll/᩵ۘۢ;

    invoke-direct {v0, v1, v2}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v1, Ll/᩺ۖۢ;

    const-string v2, "USER"

    const-class v3, Ll/ۚۘۢ;

    invoke-direct {v1, v2, v3}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v2, Ll/᩺ۖۢ;

    const-string v3, "PASS"

    const-class v4, Ll/ۧۘۢ;

    invoke-direct {v2, v3, v4}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v3, Ll/᩺ۖۢ;

    const-string v4, "TYPE"

    const-class v5, Ll/֡ۘۢ;

    invoke-direct {v3, v4, v5}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v4, Ll/᩺ۖۢ;

    const-string v5, "CWD"

    const-class v6, Ll/᩸ۖۢ;

    invoke-direct {v4, v5, v6}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v5, Ll/᩺ۖۢ;

    const-string v6, "PWD"

    const-class v7, Ll/ܿۘۢ;

    invoke-direct {v5, v6, v7}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v6, Ll/᩺ۖۢ;

    const-string v8, "LIST"

    const-class v9, Ll/ۗۖۢ;

    invoke-direct {v6, v8, v9}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v8, Ll/᩺ۖۢ;

    const-string v9, "PASV"

    const-class v10, Ll/ܽۘۢ;

    invoke-direct {v8, v9, v10}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v9, Ll/᩺ۖۢ;

    const-string v10, "RETR"

    const-class v11, Ll/᩷ۘۢ;

    invoke-direct {v9, v10, v11}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v10, Ll/᩺ۖۢ;

    const-string v11, "NLST"

    const-class v12, Ll/ܰۖۢ;

    invoke-direct {v10, v11, v12}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v11, Ll/᩺ۖۢ;

    const-string v12, "NOOP"

    const-class v13, Ll/۟ۖۢ;

    invoke-direct {v11, v12, v13}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v12, Ll/᩺ۖۢ;

    const-string v13, "STOR"

    const-class v14, Ll/ᩴۘۢ;

    invoke-direct {v12, v13, v14}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v13, Ll/᩺ۖۢ;

    const-string v14, "DELE"

    const-class v15, Ll/᩹ۖۢ;

    invoke-direct {v13, v14, v15}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v14, Ll/᩺ۖۢ;

    const-string v15, "RNFR"

    move-object/from16 v16, v13

    const-class v13, Ll/ۡۘۢ;

    invoke-direct {v14, v15, v13}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v13, Ll/᩺ۖۢ;

    const-string v15, "RNTO"

    move-object/from16 v17, v14

    const-class v14, Ll/ܺۘۢ;

    invoke-direct {v13, v15, v14}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v14, Ll/᩺ۖۢ;

    const-string v15, "RMD"

    move-object/from16 v18, v13

    const-class v13, Ll/ۢۘۢ;

    invoke-direct {v14, v15, v13}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v15, Ll/᩺ۖۢ;

    move-object/from16 v19, v14

    const-string v14, "MKD"

    move-object/from16 v20, v12

    const-class v12, Ll/ۤۖۢ;

    invoke-direct {v15, v14, v12}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v14, Ll/᩺ۖۢ;

    move-object/from16 v21, v15

    const-string v15, "OPTS"

    move-object/from16 v22, v11

    const-class v11, Ll/֫ۘۢ;

    invoke-direct {v14, v15, v11}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v11, Ll/᩺ۖۢ;

    const-string v15, "PORT"

    move-object/from16 v23, v14

    const-class v14, Ll/ᩳۘۢ;

    invoke-direct {v11, v15, v14}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v14, Ll/᩺ۖۢ;

    const-string v15, "QUIT"

    move-object/from16 v24, v11

    const-class v11, Ll/ܳۘۢ;

    invoke-direct {v14, v15, v11}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v11, Ll/᩺ۖۢ;

    const-string v15, "FEAT"

    move-object/from16 v25, v14

    const-class v14, Ll/᩶ۖۢ;

    invoke-direct {v11, v15, v14}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v14, Ll/᩺ۖۢ;

    const-string v15, "SIZE"

    move-object/from16 v26, v11

    const-class v11, Ll/ۘۘۢ;

    invoke-direct {v14, v15, v11}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v11, Ll/᩺ۖۢ;

    const-string v15, "CDUP"

    move-object/from16 v27, v14

    const-class v14, Ll/ܶۖۢ;

    invoke-direct {v11, v15, v14}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v15, Ll/᩺ۖۢ;

    move-object/from16 v28, v11

    const-string v11, "APPE"

    move-object/from16 v29, v10

    const-class v10, Ll/ۚۖۢ;

    invoke-direct {v15, v11, v10}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v10, Ll/᩺ۖۢ;

    const-string v11, "XCUP"

    invoke-direct {v10, v11, v14}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v11, Ll/᩺ۖۢ;

    const-string v14, "XPWD"

    invoke-direct {v11, v14, v7}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v7, Ll/᩺ۖۢ;

    const-string v14, "XMKD"

    invoke-direct {v7, v14, v12}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v12, Ll/᩺ۖۢ;

    const-string v14, "XRMD"

    invoke-direct {v12, v14, v13}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v13, Ll/᩺ۖۢ;

    const-string v14, "MDTM"

    move-object/from16 v30, v12

    const-class v12, Ll/۬ۖۢ;

    invoke-direct {v13, v14, v12}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v12, Ll/᩺ۖۢ;

    const-string v14, "MFMT"

    move-object/from16 v31, v13

    const-class v13, Ll/۫ۖۢ;

    invoke-direct {v12, v14, v13}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v13, Ll/᩺ۖۢ;

    const-string v14, "REST"

    move-object/from16 v32, v12

    const-class v12, Ll/ۜۘۢ;

    invoke-direct {v13, v14, v12}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v12, Ll/᩺ۖۢ;

    const-string v14, "SITE"

    move-object/from16 v33, v13

    const-class v13, Ll/ۖۘۢ;

    invoke-direct {v12, v14, v13}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v13, Ll/᩺ۖۢ;

    const-string v14, "MLST"

    move-object/from16 v34, v12

    const-class v12, Ll/ۨۖۢ;

    invoke-direct {v13, v14, v12}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v12, Ll/᩺ۖۢ;

    const-string v14, "MLSD"

    move-object/from16 v35, v13

    const-class v13, Ll/ۛۖۢ;

    invoke-direct {v12, v14, v13}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v13, Ll/᩺ۖۢ;

    const-string v14, "HASH"

    move-object/from16 v36, v12

    const-class v12, Ll/ۙۖۢ;

    invoke-direct {v13, v14, v12}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    new-instance v12, Ll/᩺ۖۢ;

    const-string v14, "RANG"

    move-object/from16 v37, v13

    const-class v13, Ll/᩻ۘۢ;

    invoke-direct {v12, v14, v13}, Ll/᩺ۖۢ;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const/16 v13, 0x24

    new-array v13, v13, [Ll/᩺ۖۢ;

    const/4 v14, 0x0

    aput-object v0, v13, v14

    const/4 v0, 0x1

    aput-object v1, v13, v0

    const/4 v0, 0x2

    aput-object v2, v13, v0

    const/4 v0, 0x3

    aput-object v3, v13, v0

    const/4 v0, 0x4

    aput-object v4, v13, v0

    const/4 v0, 0x5

    aput-object v5, v13, v0

    const/4 v0, 0x6

    aput-object v6, v13, v0

    const/4 v0, 0x7

    aput-object v8, v13, v0

    const/16 v0, 0x8

    aput-object v9, v13, v0

    const/16 v0, 0x9

    aput-object v29, v13, v0

    const/16 v0, 0xa

    aput-object v22, v13, v0

    const/16 v0, 0xb

    aput-object v20, v13, v0

    const/16 v0, 0xc

    aput-object v16, v13, v0

    const/16 v0, 0xd

    aput-object v17, v13, v0

    const/16 v0, 0xe

    aput-object v18, v13, v0

    const/16 v0, 0xf

    aput-object v19, v13, v0

    const/16 v0, 0x10

    aput-object v21, v13, v0

    const/16 v0, 0x11

    aput-object v23, v13, v0

    const/16 v0, 0x12

    aput-object v24, v13, v0

    const/16 v0, 0x13

    aput-object v25, v13, v0

    const/16 v0, 0x14

    aput-object v26, v13, v0

    const/16 v0, 0x15

    aput-object v27, v13, v0

    const/16 v0, 0x16

    aput-object v28, v13, v0

    const/16 v0, 0x17

    aput-object v15, v13, v0

    const/16 v0, 0x18

    aput-object v10, v13, v0

    const/16 v0, 0x19

    aput-object v11, v13, v0

    const/16 v0, 0x1a

    aput-object v7, v13, v0

    const/16 v0, 0x1b

    aput-object v30, v13, v0

    const/16 v0, 0x1c

    aput-object v31, v13, v0

    const/16 v0, 0x1d

    aput-object v32, v13, v0

    const/16 v0, 0x1e

    aput-object v33, v13, v0

    const/16 v0, 0x1f

    aput-object v34, v13, v0

    const/16 v0, 0x20

    aput-object v35, v13, v0

    const/16 v0, 0x21

    aput-object v36, v13, v0

    const/16 v0, 0x22

    aput-object v37, v13, v0

    const/16 v0, 0x23

    aput-object v12, v13, v0

    sput-object v13, Ll/᩸ۘۢ;->᩹:[Ll/᩺ۖۢ;

    return-void
.end method

.method public constructor <init>(Ll/᩶ۘۢ;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/16 v1, 0x20

    .line 106
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    return-object v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 110
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string v1, "\\s+$"

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayDeque;)Ljava/lang/String;
    .locals 2

    .line 242
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 243
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 244
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 245
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_0

    const/16 v1, 0x2f

    .line 246
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 248
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 250
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)Ljava/lang/String;
    .locals 6

    .line 175
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩸ۘۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 176
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۘۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 177
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    const-string v0, "/"

    .line 180
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    const/4 v4, 0x0

    .line 181
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v1, 0x1

    const/4 v2, 0x0

    move-object v0, p1

    move-object v3, p0

    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 p0, 0x0

    return-object p0

    .line 184
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 9

    const-string v0, " "

    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 49
    array-length v1, v0

    const-string v2, "502 Command not recognized\r\n"

    const/4 v3, 0x1

    if-ge v1, v3, :cond_0

    .line 50
    invoke-virtual {p0, v2}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 53
    aget-object v0, v0, v1

    .line 54
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v4, v3, :cond_1

    .line 55
    invoke-virtual {p0, v2}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 59
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    const/16 v6, 0x24

    if-ge v5, v6, :cond_3

    .line 61
    sget-object v6, Ll/᩸ۘۢ;->᩹:[Ll/᩺ۖۢ;

    aget-object v6, v6, v5

    .line 22
    iget-object v7, v6, Ll/᩺ۖۢ;->ۧ:Ljava/lang/String;

    .line 62
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 14
    :try_start_0
    iget-object v4, v6, Ll/᩺ۖۢ;->֫:Ljava/lang/Class;

    const/4 v6, 0x2

    new-array v7, v6, [Ljava/lang/Class;

    .line 69
    const-class v8, Ll/᩶ۘۢ;

    aput-object v8, v7, v1

    const-class v8, Ljava/lang/String;

    aput-object v8, v7, v3

    invoke-virtual {v4, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-array v6, v6, [Ljava/lang/Object;

    aput-object p0, v6, v1

    aput-object p1, v6, v3

    .line 74
    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩸ۘۢ;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 76
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    .line 71
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    if-nez v4, :cond_4

    .line 81
    invoke-virtual {p0, v2}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 84
    :cond_4
    invoke-virtual {p0}, Ll/᩶ۘۢ;->ۖ()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 85
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V

    return-void

    .line 86
    :cond_5
    invoke-virtual {p0}, Ll/᩶ۘۢ;->ۡ()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 87
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V

    return-void

    .line 88
    :cond_6
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Ll/ۚۘۢ;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Ll/ۧۘۢ;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 90
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Ll/ܳۘۢ;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_2

    :cond_7
    const-string p1, "530 Login first with USER and PASS, or QUIT\r\n"

    .line 93
    invoke-virtual {p0, p1}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 91
    :cond_8
    :goto_2
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public static ֫(Ljava/util/ArrayDeque;Ljava/lang/String;)Z
    .locals 5

    .line 151
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const-string v0, "/"

    .line 154
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 155
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_5

    aget-object v3, p1, v2

    .line 156
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, ".."

    .line 159
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 160
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    return v1

    .line 163
    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    goto :goto_1

    .line 166
    :cond_3
    invoke-virtual {p0, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    :goto_2
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, "/"

    .line 199
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    .line 200
    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 201
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 202
    array-length v3, p0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_4

    aget-object v5, p0, v4

    .line 203
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_3

    const-string v6, "."

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    const-string v6, ".."

    .line 206
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 207
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1

    .line 208
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    goto :goto_1

    :cond_1
    if-nez v1, :cond_3

    .line 210
    invoke-virtual {v2, v5}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    goto :goto_1

    .line 214
    :cond_2
    invoke-virtual {v2, v5}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 216
    :cond_4
    invoke-static {v2}, Ll/᩸ۘۢ;->֫(Ljava/util/ArrayDeque;)Ljava/lang/String;

    move-result-object p0

    if-eqz v1, :cond_6

    .line 218
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    return-object v0

    :cond_5
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_6
    return-object p0
.end method

.method public static ۧ(Ll/᩶ۘۢ;Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 3

    .line 114
    invoke-virtual {p0}, Ll/᩶ۘۢ;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {p0}, Ll/᩶ۘۢ;->ۢ()Ll/ܶ᩵ܿ;

    move-result-object p0

    if-nez p1, :cond_0

    const-string p1, ""

    .line 124
    :cond_0
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    const-string v2, "/"

    .line 125
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 126
    invoke-static {v0, p0}, Ll/᩸ۘۢ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 127
    invoke-static {v1, p0}, Ll/᩸ۘۢ;->֫(Ljava/util/ArrayDeque;Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_3

    .line 191
    :cond_1
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object p0

    if-eqz p0, :cond_2

    return-object p0

    :cond_2
    return-object v0

    .line 131
    :cond_3
    invoke-static {v1, p1}, Ll/᩸ۘۢ;->֫(Ljava/util/ArrayDeque;Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_5

    .line 191
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object p0

    if-eqz p0, :cond_4

    return-object p0

    :cond_4
    return-object v0

    .line 134
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_6

    return-object v0

    .line 137
    :cond_6
    invoke-static {v1}, Ll/᩸ۘۢ;->֫(Ljava/util/ArrayDeque;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)Z
    .locals 0

    .line 234
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩸ۘۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 235
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۘۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫(Ll/ܶ᩵ܿ;)Z
    .locals 1

    .line 144
    iget-object v0, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    invoke-virtual {v0}, Ll/᩶ۘۢ;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 227
    invoke-static {v0, p1}, Ll/᩸ۘۢ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
