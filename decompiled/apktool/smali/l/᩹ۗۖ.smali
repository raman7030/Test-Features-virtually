.class public final Ll/᩹ۗۖ;
.super Ljava/lang/Object;
.source "K608"


# static fields
.field public static final ֫:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "C"

    const-string v1, "I"

    const-string v2, "B"

    const-string v3, "S"

    .line 61
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩹ۗۖ;->֫:[Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/ۚ᩹ۖ;)V
    .locals 9

    .line 65
    new-instance v0, Ll/ܶۗۖ;

    invoke-direct {v0, p0}, Ll/ܶۗۖ;-><init>(Ll/ۚ᩹ۖ;)V

    .line 66
    invoke-virtual {v0}, Ll/ܶۗۖ;->֫()Ljava/util/ArrayList;

    move-result-object p0

    .line 68
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸ۗۖ;

    .line 69
    invoke-virtual {v0}, Ll/᩸ۗۖ;->ۧ()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Ll/᩸ۗۖ;->ۡ:Ll/۠᩶ۖ;

    if-nez v1, :cond_0

    .line 72
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_0

    .line 76
    :cond_0
    iget-object v3, v2, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v4, Ll/֨᩶ۖ;->ۛ:Ll/֨᩶ۖ;

    if-ne v3, v4, :cond_8

    .line 77
    move-object v3, v2

    check-cast v3, Ll/ۨ᩹ۖ;

    const/4 v4, 0x0

    .line 78
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x44

    if-eq v5, v6, :cond_7

    const/16 v6, 0x46

    if-eq v5, v6, :cond_6

    const/16 v6, 0x4c

    if-eq v5, v6, :cond_1

    const/16 v6, 0x5b

    if-eq v5, v6, :cond_1

    goto/16 :goto_3

    .line 81
    :cond_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v6, v3, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    invoke-virtual {v5, v6}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 82
    sget-object v5, Ll/ۨ᩹ۖ;->۬:Ljava/lang/Object;

    iput-object v5, v3, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    :cond_2
    const-string v5, "[F"

    .line 84
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v5, v3, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    instance-of v6, v5, [I

    if-eqz v6, :cond_4

    .line 85
    check-cast v5, [I

    .line 86
    array-length v6, v5

    new-array v6, v6, [F

    const/4 v7, 0x0

    .line 87
    :goto_1
    array-length v8, v5

    if-ge v7, v8, :cond_3

    .line 88
    aget v8, v5, v7

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    aput v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 90
    :cond_3
    iput-object v6, v3, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    :cond_4
    const-string v5, "[D"

    .line 92
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v5, v3, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    instance-of v6, v5, [J

    if-eqz v6, :cond_8

    .line 93
    check-cast v5, [J

    .line 94
    array-length v6, v5

    new-array v6, v6, [D

    .line 95
    :goto_2
    array-length v7, v5

    if-ge v4, v7, :cond_5

    .line 96
    aget-wide v7, v5, v4

    invoke-static {v7, v8}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v7

    aput-wide v7, v6, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 98
    :cond_5
    iput-object v6, v3, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    goto :goto_3

    .line 102
    :cond_6
    iget-object v4, v3, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    instance-of v5, v4, Ljava/lang/Float;

    if-nez v5, :cond_8

    .line 103
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iput-object v4, v3, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    goto :goto_3

    .line 107
    :cond_7
    iget-object v4, v3, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    instance-of v5, v4, Ljava/lang/Double;

    if-nez v5, :cond_8

    .line 108
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    iput-object v4, v3, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    .line 115
    :cond_8
    :goto_3
    iput-object v1, v2, Ll/۠᩶ۖ;->᩶:Ljava/lang/String;

    const/4 v1, 0x0

    .line 116
    iput-object v1, v2, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    .line 344
    iput-object v1, v0, Ll/᩸ۗۖ;->ۜ:Ljava/util/Set;

    .line 345
    iput-object v1, v0, Ll/᩸ۗۖ;->ᩳ:Ljava/util/Set;

    .line 346
    iput-object v1, v0, Ll/᩸ۗۖ;->֫:Ljava/util/Set;

    .line 347
    iput-object v1, v0, Ll/᩸ۗۖ;->ܳ:Ljava/util/Set;

    .line 348
    iput-object v1, v0, Ll/᩸ۗۖ;->ۧ:Ljava/util/Set;

    .line 349
    iput-object v1, v0, Ll/᩸ۗۖ;->᩷:Ljava/util/Set;

    goto/16 :goto_0

    :cond_9
    return-void
.end method

.method public static bridge synthetic ֫()[Ljava/lang/String;
    .locals 1

    .line 0
    sget-object v0, Ll/᩹ۗۖ;->֫:[Ljava/lang/String;

    return-object v0
.end method
