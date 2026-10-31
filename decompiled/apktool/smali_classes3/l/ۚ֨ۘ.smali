.class public final Ll/ۚ֨ۘ;
.super Ll/֡֨ۘ;
.source "R89U"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ۨ:Ljava/util/EnumSet;

.field public static final ܰ:Ljava/util/EnumSet;

.field public static final ᩺:Ljava/util/EnumSet;


# instance fields
.field public final ۗ:Ll/۫ۛۖ;

.field public final ۛ:I

.field public final ۤ:I

.field public final ۫:Ll/ᩳᩳۘ;

.field public final ۬:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 49
    sget-object v0, Ll/۟۫ۖ;->᩹ۧ:Ll/۟۫ۖ;

    sget-object v1, Ll/۟۫ۖ;->۫:Ll/۟۫ۖ;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    sput-object v2, Ll/ۚ֨ۘ;->ۨ:Ljava/util/EnumSet;

    .line 50
    sget-object v2, Ll/۟۫ۖ;->ܿ֫:Ll/۟۫ۖ;

    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    sput-object v1, Ll/ۚ֨ۘ;->᩺:Ljava/util/EnumSet;

    .line 51
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Ll/ۚ֨ۘ;->ܰ:Ljava/util/EnumSet;

    return-void
.end method

.method public constructor <init>(Ll/ܶܽۘ;Ll/ᩳᩳۘ;Ljava/lang/String;)V
    .locals 18

    move-object/from16 v0, p0

    .line 59
    invoke-virtual/range {p2 .. p2}, Ll/ۖᩳۘ;->᩻()Ll/᩵ᩳۘ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩵ᩳۘ;->ۧ()Ll/ۙ֫ۘ;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-direct {v0, v2, v1}, Ll/֡֨ۘ;-><init>(Ll/ܶܽۘ;Ll/ۙ֫ۘ;)V

    move-object/from16 v1, p2

    .line 61
    iput-object v1, v0, Ll/ۚ֨ۘ;->۫:Ll/ᩳᩳۘ;

    .line 64
    sget-object v3, Ll/ۨ۫ۖ;->ܿ֫:Ll/ۨ۫ۖ;

    sget-object v4, Ll/ۨ۫ۖ;->᩷֫:Ll/ۨ۫ۖ;

    invoke-static {v3, v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v12

    .line 65
    new-instance v3, Ll/᩹ۨۖ;

    invoke-virtual/range {p1 .. p1}, Ll/ܶܽۘ;->֫()Ll/᩻ۧۘ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩻ۧۘ;->ۜ()Ll/᩷ۧۘ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩷ۧۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Ll/ܶܽۘ;->ᩳ()J

    move-result-wide v7

    invoke-virtual/range {p2 .. p2}, Ll/ۖᩳۘ;->᩻()Ll/᩵ᩳۘ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩵ᩳۘ;->ܳ()J

    move-result-wide v9

    sget-object v11, Ll/ۨۛۖ;->۬:Ll/ۨۛۖ;

    sget-object v4, Ll/ۜۨۖ;->ۗ:Ll/ۜۨۖ;

    sget-object v5, Ll/ۜۨۖ;->۬:Ll/ۜۨۖ;

    invoke-static {v4, v5}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v14

    sget-object v15, Ll/۠ۛۖ;->ۗ:Ll/۠ۛۖ;

    new-instance v4, Ll/ܽۧۘ;

    invoke-virtual/range {p2 .. p2}, Ll/ۖᩳۘ;->ܳ()Ll/ܽۧۘ;

    move-result-object v5

    move-object/from16 v13, p3

    invoke-direct {v4, v5, v13}, Ll/ܽۧۘ;-><init>(Ll/ܽۧۘ;Ljava/lang/String;)V

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object v5, v3

    move-object/from16 v17, v4

    invoke-direct/range {v5 .. v17}, Ll/᩹ۨۖ;-><init>(Ll/᩹ۛۖ;JJLl/ۨۛۖ;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/Set;Ll/ܽۧۘ;)V

    .line 66
    sget-object v4, Ll/۟۫ۖ;->᩹ۧ:Ll/۟۫ۖ;

    invoke-static {v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ll/֡֨ۘ;->֫(Ll/ܽۨۖ;Ljava/util/EnumSet;)Ll/ܽۨۖ;

    move-result-object v3

    check-cast v3, Ll/᩶ۨۖ;

    .line 68
    invoke-virtual {v3}, Ll/᩶ۨۖ;->᩷()Ll/۫ۛۖ;

    move-result-object v3

    iput-object v3, v0, Ll/ۚ֨ۘ;->ۗ:Ll/۫ۛۖ;

    .line 69
    invoke-virtual/range {p2 .. p2}, Ll/ۖᩳۘ;->᩻()Ll/᩵ᩳۘ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩵ᩳۘ;->ۧ()Ll/ۙ֫ۘ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۙ֫ۘ;->ܺ()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Ll/ܶܽۘ;->֫()Ll/᩻ۧۘ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩻ۧۘ;->ۜ()Ll/᩷ۧۘ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩷ۧۘ;->ܽ()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, v0, Ll/ۚ֨ۘ;->ۤ:I

    .line 70
    invoke-virtual/range {p2 .. p2}, Ll/ۖᩳۘ;->᩻()Ll/᩵ᩳۘ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩵ᩳۘ;->ۧ()Ll/ۙ֫ۘ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۙ֫ۘ;->ܿ()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Ll/ܶܽۘ;->֫()Ll/᩻ۧۘ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩻ۧۘ;->ۜ()Ll/᩷ۧۘ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩷ۧۘ;->ۧ()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, v0, Ll/ۚ֨ۘ;->۬:I

    .line 71
    invoke-virtual/range {p2 .. p2}, Ll/ۖᩳۘ;->᩻()Ll/᩵ᩳۘ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩵ᩳۘ;->ۧ()Ll/ۙ֫ۘ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۙ֫ۘ;->ᩴ()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Ll/ܶܽۘ;->֫()Ll/᩻ۧۘ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩻ۧۘ;->ۜ()Ll/᩷ۧۘ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۧۘ;->ᩳ()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v0, Ll/ۚ֨ۘ;->ۛ:I

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 114
    iget-object v0, p0, Ll/ۚ֨ۘ;->۫:Ll/ᩳᩳۘ;

    iget-object v1, p0, Ll/ۚ֨ۘ;->ۗ:Ll/۫ۛۖ;

    invoke-virtual {v0, v1}, Ll/ᩳᩳۘ;->֫(Ll/۫ۛۖ;)V

    return-void
.end method

.method public final read()[B
    .locals 12

    .line 91
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x1000

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 124
    :cond_0
    new-instance v1, Ll/ܽ᩺ۖ;

    invoke-virtual {p0}, Ll/֡֨ۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v3

    invoke-virtual {p0}, Ll/֡֨ۘ;->ܽ()J

    move-result-wide v5

    iget-object v2, p0, Ll/ۚ֨ۘ;->۫:Ll/ᩳᩳۘ;

    invoke-virtual {v2}, Ll/ۖᩳۘ;->᩻()Ll/᩵ᩳۘ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩵ᩳۘ;->ܳ()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    iget v11, p0, Ll/ۚ֨ۘ;->۬:I

    iget-object v4, p0, Ll/ۚ֨ۘ;->ۗ:Ll/۫ۛۖ;

    move-object v2, v1

    invoke-direct/range {v2 .. v11}, Ll/ܽ᩺ۖ;-><init>(Ll/᩹ۛۖ;Ll/۫ۛۖ;JJJI)V

    .line 125
    sget-object v2, Ll/ۚ֨ۘ;->᩺:Ljava/util/EnumSet;

    invoke-virtual {p0, v1, v2}, Ll/֡֨ۘ;->֫(Ll/ܽۨۖ;Ljava/util/EnumSet;)Ll/ܽۨۖ;

    move-result-object v1

    check-cast v1, Ll/ᩳ᩺ۖ;

    .line 94
    invoke-virtual {v1}, Ll/ᩳ᩺ۖ;->ۜ()[B

    move-result-object v2

    .line 96
    :try_start_0
    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    invoke-virtual {v1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v1

    check-cast v1, Ll/᩻ۨۖ;

    invoke-virtual {v1}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll/۟۫ۖ;->ᩳ(J)Ll/۟۫ۖ;

    move-result-object v1

    .line 101
    sget-object v2, Ll/۟۫ۖ;->۫:Ll/۟۫ۖ;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 105
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    .line 98
    new-instance v1, Ll/ۧۧۘ;

    .line 34
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 98
    throw v1
.end method

.method public final write([B)V
    .locals 12

    .line 130
    new-instance v9, Ll/ۘ᩺ۖ;

    invoke-virtual {p0}, Ll/֡֨ۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v1

    invoke-virtual {p0}, Ll/֡֨ۘ;->ܽ()J

    move-result-wide v3

    iget-object v0, p0, Ll/ۚ֨ۘ;->۫:Ll/ᩳᩳۘ;

    invoke-virtual {v0}, Ll/ۖᩳۘ;->᩻()Ll/᩵ᩳۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵ᩳۘ;->ܳ()J

    move-result-wide v5

    new-instance v7, Ll/᩷ܽۘ;

    array-length v0, p1

    const-wide/16 v10, 0x0

    invoke-direct {v7, v10, v11, v0, p1}, Ll/᩷ܽۘ;-><init>(JI[B)V

    iget v8, p0, Ll/ۚ֨ۘ;->ۛ:I

    iget-object v2, p0, Ll/ۚ֨ۘ;->ۗ:Ll/۫ۛۖ;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Ll/ۘ᩺ۖ;-><init>(Ll/᩹ۛۖ;Ll/۫ۛۖ;JJLl/᩷ܽۘ;I)V

    .line 131
    sget-object p1, Ll/ۚ֨ۘ;->ܰ:Ljava/util/EnumSet;

    invoke-virtual {p0, v9, p1}, Ll/֡֨ۘ;->֫(Ll/ܽۨۖ;Ljava/util/EnumSet;)Ll/ܽۨۖ;

    move-result-object p1

    check-cast p1, Ll/ᩴ᩺ۖ;

    return-void
.end method

.method public final ۧ([B)[B
    .locals 12

    .line 118
    new-instance v11, Ll/۬ۨۖ;

    invoke-virtual {p0}, Ll/֡֨ۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v1

    invoke-virtual {p0}, Ll/֡֨ۘ;->ܽ()J

    move-result-wide v2

    iget-object v0, p0, Ll/ۚ֨ۘ;->۫:Ll/ᩳᩳۘ;

    invoke-virtual {v0}, Ll/ۖᩳۘ;->᩻()Ll/᩵ᩳۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵ᩳۘ;->ܳ()J

    move-result-wide v4

    new-instance v9, Ll/᩷ܽۘ;

    array-length v0, p1

    const-wide/16 v6, 0x0

    invoke-direct {v9, v6, v7, v0, p1}, Ll/᩷ܽۘ;-><init>(JI[B)V

    iget v10, p0, Ll/ۚ֨ۘ;->ۤ:I

    const-wide/32 v6, 0x11c017

    iget-object v8, p0, Ll/ۚ֨ۘ;->ۗ:Ll/۫ۛۖ;

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Ll/۬ۨۖ;-><init>(Ll/᩹ۛۖ;JJJLl/۫ۛۖ;Ll/ۢܽۘ;I)V

    .line 119
    sget-object p1, Ll/ۚ֨ۘ;->ۨ:Ljava/util/EnumSet;

    invoke-virtual {p0, v11, p1}, Ll/֡֨ۘ;->֫(Ll/ܽۨۖ;Ljava/util/EnumSet;)Ll/ܽۨۖ;

    move-result-object p1

    check-cast p1, Ll/۫ۨۖ;

    .line 76
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x1000

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 77
    invoke-virtual {p1}, Ll/۫ۨۖ;->ۜ()[B

    move-result-object v1

    .line 79
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p1

    check-cast p1, Ll/᩻ۨۖ;

    invoke-virtual {p1}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll/۟۫ۖ;->ᩳ(J)Ll/۟۫ۖ;

    move-result-object p1

    .line 84
    sget-object v1, Ll/۟۫ۖ;->۫:Ll/۟۫ۖ;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 85
    invoke-virtual {p0}, Ll/ۚ֨ۘ;->read()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 87
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 81
    new-instance v0, Ll/ۧۧۘ;

    .line 34
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 81
    throw v0
.end method
