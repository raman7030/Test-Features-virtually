.class public final Ll/ܺ᩹ۚ;
.super Ljava/lang/Object;
.source "GBIX"


# static fields
.field public static final ܳ:Ljava/util/regex/Pattern;

.field public static final ܿ:Ljava/util/regex/Pattern;

.field public static final ᩳ:[Ljava/lang/String;

.field public static final ᩻:[Ljava/lang/String;


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ll/ۘ֨ۚ;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const-string v0, "~"

    const-string v1, " "

    const-string v2, ","

    const-string v3, ">"

    const-string v4, "+"

    .line 18
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܺ᩹ۚ;->᩻:[Ljava/lang/String;

    const-string v5, "*="

    const-string v6, "~="

    const-string v1, "="

    const-string v2, "!="

    const-string v3, "^="

    const-string v4, "$="

    .line 19
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܺ᩹ۚ;->ᩳ:[Ljava/lang/String;

    const-string v0, "(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?"

    const/4 v1, 0x2

    .line 317
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܺ᩹ۚ;->ܿ:Ljava/util/regex/Pattern;

    const-string v0, "([+-])?(\\d+)"

    .line 318
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܺ᩹ۚ;->ܳ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܺ᩹ۚ;->֫:Ljava/util/ArrayList;

    .line 30
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 32
    iput-object p1, p0, Ll/ܺ᩹ۚ;->ۧ:Ljava/lang/String;

    .line 33
    new-instance v0, Ll/ۘ֨ۚ;

    invoke-direct {v0, p1}, Ll/ۘ֨ۚ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/ܺ᩹ۚ;->ܽ:Ll/ۘ֨ۚ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/᩷᩹ۚ;
    .locals 1

    .line 44
    :try_start_0
    new-instance v0, Ll/ܺ᩹ۚ;

    invoke-direct {v0, p0}, Ll/ܺ᩹ۚ;-><init>(Ljava/lang/String;)V

    .line 45
    invoke-virtual {v0}, Ll/ܺ᩹ۚ;->֫()Ll/᩷᩹ۚ;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 47
    new-instance v0, Ll/ۖ᩹ۚ;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    .line 170
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    throw v0
.end method

.method private ֫(C)V
    .locals 10

    .line 85
    iget-object v0, p0, Ll/ܺ᩹ۚ;->ܽ:Ll/ۘ֨ۚ;

    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ܿ()Z

    .line 143
    invoke-static {}, Ll/᩷֡ۚ;->֫()Ljava/lang/StringBuilder;

    move-result-object v1

    .line 144
    :goto_0
    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ܳ()Z

    move-result v2

    if-nez v2, :cond_4

    const-string v2, "("

    .line 145
    invoke-virtual {v0, v2}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 146
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x28

    const/16 v3, 0x29

    invoke-virtual {v0, v2, v3}, Ll/ۘ֨ۚ;->֫(CC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v2, "["

    .line 147
    invoke-virtual {v0, v2}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 148
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    const/16 v3, 0x5d

    invoke-virtual {v0, v2, v3}, Ll/ۘ֨ۚ;->֫(CC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 149
    :cond_1
    sget-object v2, Ll/ܺ᩹ۚ;->᩻:[Ljava/lang/String;

    invoke-virtual {v0, v2}, Ll/ۘ֨ۚ;->ۧ([Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 150
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_2

    goto :goto_1

    .line 153
    :cond_2
    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ۧ()C

    goto :goto_0

    .line 155
    :cond_3
    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ۧ()C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 157
    :cond_4
    :goto_1
    invoke-static {v1}, Ll/᩷֡ۚ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 90
    invoke-static {v0}, Ll/ܺ᩹ۚ;->֫(Ljava/lang/String;)Ll/᩷᩹ۚ;

    move-result-object v0

    .line 93
    iget-object v1, p0, Ll/ܺ᩹ۚ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v3, 0x2c

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v5, :cond_6

    .line 94
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷᩹ۚ;

    .line 96
    instance-of v6, v2, Ll/ܰܶۚ;

    if-eqz v6, :cond_7

    if-eq p1, v3, :cond_7

    .line 97
    move-object v6, v2

    check-cast v6, Ll/ܰܶۚ;

    .line 30
    iget v7, v6, Ll/۟ܶۚ;->ۧ:I

    if-lez v7, :cond_5

    iget-object v6, v6, Ll/۟ܶۚ;->֫:Ljava/util/ArrayList;

    sub-int/2addr v7, v5

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩷᩹ۚ;

    goto :goto_2

    :cond_5
    const/4 v6, 0x0

    :goto_2
    const/4 v7, 0x1

    goto :goto_3

    .line 103
    :cond_6
    new-instance v2, Ll/᩺ܶۚ;

    invoke-direct {v2, v1}, Ll/᩺ܶۚ;-><init>(Ljava/util/List;)V

    :cond_7
    const/4 v7, 0x0

    move-object v6, v2

    .line 105
    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    const/16 v8, 0x20

    const/4 v9, 0x2

    if-eq p1, v8, :cond_d

    const/16 v8, 0x3e

    if-eq p1, v8, :cond_c

    const/16 v8, 0x7e

    if-eq p1, v8, :cond_b

    const/16 v8, 0x2b

    if-eq p1, v8, :cond_a

    if-ne p1, v3, :cond_9

    .line 123
    instance-of p1, v6, Ll/ܰܶۚ;

    if-eqz p1, :cond_8

    .line 124
    check-cast v6, Ll/ܰܶۚ;

    goto :goto_4

    .line 126
    :cond_8
    new-instance p1, Ll/ܰܶۚ;

    invoke-direct {p1}, Ll/ܰܶۚ;-><init>()V

    .line 88
    iget-object v3, p1, Ll/۟ܶۚ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    iput v3, p1, Ll/۟ܶۚ;->ۧ:I

    move-object v6, p1

    .line 88
    :goto_4
    iget-object p1, v6, Ll/۟ܶۚ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, v6, Ll/۟ܶۚ;->ۧ:I

    goto :goto_6

    .line 133
    :cond_9
    new-instance v0, Ll/ۖ᩹ۚ;

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    new-array v1, v5, [Ljava/lang/Object;

    aput-object p1, v1, v4

    const-string p1, "Unknown combinator \'%s\'"

    invoke-direct {v0, p1, v1}, Ll/ۖ᩹ۚ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    .line 116
    :cond_a
    new-instance p1, Ll/᩺ܶۚ;

    new-instance v3, Ll/֡᩹ۚ;

    .line 9
    invoke-direct {v3}, Ll/᩷᩹ۚ;-><init>()V

    .line 139
    iput-object v6, v3, Ll/᩸᩹ۚ;->֫:Ll/᩷᩹ۚ;

    new-array v6, v9, [Ll/᩷᩹ۚ;

    aput-object v3, v6, v4

    aput-object v0, v6, v5

    .line 116
    invoke-direct {p1, v6}, Ll/᩺ܶۚ;-><init>([Ll/᩷᩹ۚ;)V

    goto :goto_5

    .line 119
    :cond_b
    new-instance p1, Ll/᩺ܶۚ;

    new-instance v3, Ll/۠᩹ۚ;

    .line 9
    invoke-direct {v3}, Ll/᩷᩹ۚ;-><init>()V

    .line 112
    iput-object v6, v3, Ll/᩸᩹ۚ;->֫:Ll/᩷᩹ۚ;

    new-array v6, v9, [Ll/᩷᩹ۚ;

    aput-object v3, v6, v4

    aput-object v0, v6, v5

    .line 119
    invoke-direct {p1, v6}, Ll/᩺ܶۚ;-><init>([Ll/᩷᩹ۚ;)V

    goto :goto_5

    .line 110
    :cond_c
    new-instance p1, Ll/᩺ܶۚ;

    new-instance v3, Ll/᩵᩹ۚ;

    .line 9
    invoke-direct {v3}, Ll/᩷᩹ۚ;-><init>()V

    .line 92
    iput-object v6, v3, Ll/᩸᩹ۚ;->֫:Ll/᩷᩹ۚ;

    new-array v6, v9, [Ll/᩷᩹ۚ;

    aput-object v3, v6, v4

    aput-object v0, v6, v5

    .line 110
    invoke-direct {p1, v6}, Ll/᩺ܶۚ;-><init>([Ll/᩷᩹ۚ;)V

    goto :goto_5

    .line 113
    :cond_d
    new-instance p1, Ll/᩺ܶۚ;

    new-instance v3, Ll/֨᩹ۚ;

    .line 9
    invoke-direct {v3}, Ll/᩷᩹ۚ;-><init>()V

    .line 65
    iput-object v6, v3, Ll/᩸᩹ۚ;->֫:Ll/᩷᩹ۚ;

    new-array v6, v9, [Ll/᩷᩹ۚ;

    aput-object v3, v6, v4

    aput-object v0, v6, v5

    .line 113
    invoke-direct {p1, v6}, Ll/᩺ܶۚ;-><init>([Ll/᩷᩹ۚ;)V

    :goto_5
    move-object v6, p1

    :goto_6
    if-eqz v7, :cond_e

    .line 137
    move-object p1, v2

    check-cast p1, Ll/ܰܶۚ;

    .line 34
    iget-object v0, p1, Ll/۟ܶۚ;->֫:Ljava/util/ArrayList;

    iget p1, p1, Ll/۟ܶۚ;->ۧ:I

    sub-int/2addr p1, v5

    invoke-virtual {v0, p1, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_e
    move-object v2, v6

    .line 139
    :goto_7
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private ֫(Z)V
    .locals 4

    if-eqz p1, :cond_0

    const-string v0, ":containsOwn"

    goto :goto_0

    :cond_0
    const-string v0, ":contains"

    .line 370
    :goto_0
    iget-object v1, p0, Ll/ܺ᩹ۚ;->ܽ:Ll/ۘ֨ۚ;

    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->֫(Ljava/lang/String;)V

    const/16 v2, 0x28

    const/16 v3, 0x29

    .line 371
    invoke-virtual {v1, v2, v3}, Ll/ۘ֨ۚ;->֫(CC)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۘ֨ۚ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "(text) query must not be empty"

    .line 372
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 374
    new-instance p1, Ll/ۘ᩸ۚ;

    invoke-direct {p1, v1}, Ll/ۘ᩸ۚ;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 375
    :cond_1
    new-instance p1, Ll/ᩴ᩸ۚ;

    invoke-direct {p1, v1}, Ll/ᩴ᩸ۚ;-><init>(Ljava/lang/String;)V

    .line 373
    :goto_1
    iget-object v0, p0, Ll/ܺ᩹ۚ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private ֫(ZZ)V
    .locals 8

    .line 321
    iget-object v0, p0, Ll/ܺ᩹ۚ;->ܽ:Ll/ۘ֨ۚ;

    invoke-virtual {v0}, Ll/ۘ֨ۚ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩻֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 322
    sget-object v1, Ll/ܺ᩹ۚ;->ܿ:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 323
    sget-object v2, Ll/ܺ᩹ۚ;->ܳ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    const-string v3, "odd"

    .line 325
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_0

    goto :goto_2

    :cond_0
    const-string v3, "even"

    .line 328
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v6, 0x0

    if-eqz v3, :cond_1

    const/4 v5, 0x0

    goto :goto_2

    .line 331
    :cond_1
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    const-string v4, ""

    const-string v7, "^\\+"

    if-eqz v3, :cond_4

    const/4 v0, 0x3

    .line 332
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7, v4}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    :goto_0
    const/4 v2, 0x4

    .line 333
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v7, v4}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    move v5, v1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    const/4 v5, 0x0

    :goto_1
    move v4, v0

    goto :goto_2

    .line 334
    :cond_4
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 336
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7, v4}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    const/4 v4, 0x0

    .line 340
    :goto_2
    iget-object v0, p0, Ll/ܺ᩹ۚ;->֫:Ljava/util/ArrayList;

    if-eqz p2, :cond_6

    if-eqz p1, :cond_5

    .line 342
    new-instance p1, Ll/ۨ᩸ۚ;

    .line 550
    invoke-direct {p1, v4, v5}, Ll/ۚ᩸ۚ;-><init>(II)V

    .line 342
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 344
    :cond_5
    new-instance p1, Ll/᩺᩸ۚ;

    .line 526
    invoke-direct {p1, v4, v5}, Ll/ۚ᩸ۚ;-><init>(II)V

    .line 344
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_6
    if-eqz p1, :cond_7

    .line 347
    new-instance p1, Ll/ۛ᩸ۚ;

    .line 504
    invoke-direct {p1, v4, v5}, Ll/ۚ᩸ۚ;-><init>(II)V

    .line 347
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 349
    :cond_7
    new-instance p1, Ll/ۤ᩸ۚ;

    .line 484
    invoke-direct {p1, v4, v5}, Ll/ۚ᩸ۚ;-><init>(II)V

    .line 349
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 338
    :cond_8
    new-instance p1, Ll/ۖ᩹ۚ;

    new-array p2, v5, [Ljava/lang/Object;

    aput-object v0, p2, v6

    const-string v0, "Could not parse nth-index \'%s\': unexpected format"

    invoke-direct {p1, v0, p2}, Ll/ۖ᩹ۚ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method private ۧ()I
    .locals 5

    .line 354
    iget-object v0, p0, Ll/ܺ᩹ۚ;->ܽ:Ll/ۘ֨ۚ;

    invoke-virtual {v0}, Ll/ۘ֨ۚ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 355
    sget v1, Ll/᩷֡ۚ;->֫:I

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 179
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 182
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    .line 184
    invoke-virtual {v0, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isDigit(I)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    :cond_3
    :goto_1
    if-eqz v1, :cond_4

    .line 356
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 91
    :cond_4
    new-instance v0, Ll/ܳ֡ۚ;

    const-string v1, "Index must be numeric"

    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    throw v0
.end method

.method private ۧ(Z)V
    .locals 4

    if-eqz p1, :cond_0

    const-string v0, ":containsWholeOwnText"

    goto :goto_0

    :cond_0
    const-string v0, ":containsWholeText"

    .line 380
    :goto_0
    iget-object v1, p0, Ll/ܺ᩹ۚ;->ܽ:Ll/ۘ֨ۚ;

    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->֫(Ljava/lang/String;)V

    const/16 v2, 0x28

    const/16 v3, 0x29

    .line 381
    invoke-virtual {v1, v2, v3}, Ll/ۘ֨ۚ;->֫(CC)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۘ֨ۚ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "(text) query must not be empty"

    .line 382
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 384
    new-instance p1, Ll/᩵᩸ۚ;

    invoke-direct {p1, v1}, Ll/᩵᩸ۚ;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 385
    :cond_1
    new-instance p1, Ll/֡᩸ۚ;

    invoke-direct {p1, v1}, Ll/֡᩸ۚ;-><init>(Ljava/lang/String;)V

    .line 383
    :goto_1
    iget-object v0, p0, Ll/ܺ᩹ۚ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private ܽ()V
    .locals 10

    const-string v0, "#"

    .line 161
    iget-object v1, p0, Ll/ܺ᩹ۚ;->ܽ:Ll/ۘ֨ۚ;

    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    iget-object v2, p0, Ll/ܺ᩹ۚ;->֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 231
    invoke-virtual {v1}, Ll/ۘ֨ۚ;->ܽ()Ljava/lang/String;

    move-result-object v0

    .line 232
    invoke-static {v0}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 233
    new-instance v1, Ll/֨᩸ۚ;

    invoke-direct {v1, v0}, Ll/֨᩸ۚ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    const-string v0, "."

    .line 163
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 237
    invoke-virtual {v1}, Ll/ۘ֨ۚ;->ܽ()Ljava/lang/String;

    move-result-object v0

    .line 238
    invoke-static {v0}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 239
    new-instance v1, Ll/ܺ᩸ۚ;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ܺ᩸ۚ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 165
    :cond_1
    invoke-virtual {v1}, Ll/ۘ֨ۚ;->᩻()Z

    move-result v0

    const/4 v3, 0x2

    const-string v4, "*|"

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v0, :cond_28

    invoke-virtual {v1, v4}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const-string v0, "["

    .line 167
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    iget-object v4, p0, Ll/ܺ᩹ۚ;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_b

    .line 266
    new-instance v0, Ll/ۘ֨ۚ;

    const/16 v7, 0x5b

    const/16 v8, 0x5d

    invoke-virtual {v1, v7, v8}, Ll/ۘ֨ۚ;->֫(CC)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۘ֨ۚ;-><init>(Ljava/lang/String;)V

    .line 267
    sget-object v1, Ll/ܺ᩹ۚ;->ᩳ:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۘ֨ۚ;->֫([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 268
    invoke-static {v1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 269
    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ܿ()Z

    .line 271
    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ܳ()Z

    move-result v7

    if-eqz v7, :cond_4

    const-string v0, "^"

    .line 272
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 273
    new-instance v0, Ll/ܿ᩸ۚ;

    invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ܿ᩸ۚ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 275
    :cond_3
    new-instance v0, Ll/ܽ᩸ۚ;

    invoke-direct {v0, v1}, Ll/ܽ᩸ۚ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_4
    const-string v7, "="

    .line 277
    invoke-virtual {v0, v7}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 278
    new-instance v3, Ll/ܳ᩸ۚ;

    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ۜ()Ljava/lang/String;

    move-result-object v0

    .line 309
    invoke-direct {v3, v1, v0, v6}, Ll/ᩳ᩸ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 278
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_5
    const-string v7, "!="

    .line 280
    invoke-virtual {v0, v7}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 281
    new-instance v3, Ll/ۢ᩸ۚ;

    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ۜ()Ljava/lang/String;

    move-result-object v0

    .line 309
    invoke-direct {v3, v1, v0, v6}, Ll/ᩳ᩸ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 281
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_6
    const-string v7, "^="

    .line 283
    invoke-virtual {v0, v7}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 284
    new-instance v3, Ll/ۡ᩸ۚ;

    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ۜ()Ljava/lang/String;

    move-result-object v0

    .line 222
    invoke-direct {v3, v1, v0, v5}, Ll/ᩳ᩸ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 284
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_7
    const-string v7, "$="

    .line 286
    invoke-virtual {v0, v7}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 287
    new-instance v3, Ll/ۜ᩸ۚ;

    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ۜ()Ljava/lang/String;

    move-result-object v0

    .line 242
    invoke-direct {v3, v1, v0, v5}, Ll/ᩳ᩸ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 287
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_8
    const-string v7, "*="

    .line 289
    invoke-virtual {v0, v7}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_9

    .line 290
    new-instance v3, Ll/᩻᩸ۚ;

    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ۜ()Ljava/lang/String;

    move-result-object v0

    .line 309
    invoke-direct {v3, v1, v0, v6}, Ll/ᩳ᩸ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 290
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_9
    const-string v7, "~="

    .line 292
    invoke-virtual {v0, v7}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_a

    .line 293
    new-instance v3, Ll/᩷᩸ۚ;

    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ۜ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 284
    invoke-direct {v3}, Ll/᩷᩹ۚ;-><init>()V

    .line 285
    invoke-static {v1}, Ll/᩻֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v3, Ll/᩷᩸ۚ;->֫:Ljava/lang/String;

    .line 286
    iput-object v0, v3, Ll/᩷᩸ۚ;->ۧ:Ljava/util/regex/Pattern;

    .line 293
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 295
    :cond_a
    new-instance v1, Ll/ۖ᩹ۚ;

    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ۜ()Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    aput-object v4, v2, v5

    aput-object v0, v2, v6

    const-string v0, "Could not parse attribute query \'%s\': unexpected token at \'%s\'"

    invoke-direct {v1, v0, v2}, Ll/ۖ᩹ۚ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    :cond_b
    const-string v0, "*"

    .line 169
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 300
    new-instance v0, Ll/ۧ᩸ۚ;

    .line 330
    invoke-direct {v0}, Ll/᩷᩹ۚ;-><init>()V

    .line 300
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_c
    const-string v0, ":lt("

    .line 171
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 305
    new-instance v0, Ll/᩹᩸ۚ;

    invoke-direct {p0}, Ll/ܺ᩹ۚ;->ۧ()I

    move-result v1

    .line 348
    invoke-direct {v0, v1}, Ll/ܶ᩸ۚ;-><init>(I)V

    .line 305
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_d
    const-string v0, ":gt("

    .line 173
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 309
    new-instance v0, Ll/᩸᩸ۚ;

    invoke-direct {p0}, Ll/ܺ᩹ۚ;->ۧ()I

    move-result v1

    .line 368
    invoke-direct {v0, v1}, Ll/ܶ᩸ۚ;-><init>(I)V

    .line 309
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_e
    const-string v0, ":eq("

    .line 175
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 313
    new-instance v0, Ll/۠᩸ۚ;

    invoke-direct {p0}, Ll/ܺ᩹ۚ;->ۧ()I

    move-result v1

    .line 388
    invoke-direct {v0, v1}, Ll/ܶ᩸ۚ;-><init>(I)V

    .line 313
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_f
    const-string v0, ":has("

    .line 177
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    const/16 v7, 0x29

    const/16 v8, 0x28

    if-eqz v0, :cond_10

    const-string v0, ":has"

    .line 361
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->֫(Ljava/lang/String;)V

    .line 362
    invoke-virtual {v1, v8, v7}, Ll/ۘ֨ۚ;->֫(CC)Ljava/lang/String;

    move-result-object v0

    const-string v1, ":has(selector) sub-select must not be empty"

    .line 363
    invoke-static {v0, v1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    new-instance v1, Ll/ᩴ᩹ۚ;

    invoke-static {v0}, Ll/ܺ᩹ۚ;->֫(Ljava/lang/String;)Ll/᩷᩹ۚ;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ᩴ᩹ۚ;-><init>(Ll/᩷᩹ۚ;)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_10
    const-string v0, ":contains("

    .line 179
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 180
    invoke-direct {p0, v5}, Ll/ܺ᩹ۚ;->֫(Z)V

    return-void

    :cond_11
    const-string v0, ":containsOwn("

    .line 181
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 182
    invoke-direct {p0, v6}, Ll/ܺ᩹ۚ;->֫(Z)V

    return-void

    :cond_12
    const-string v0, ":containsWholeText("

    .line 183
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 184
    invoke-direct {p0, v5}, Ll/ܺ᩹ۚ;->ۧ(Z)V

    return-void

    :cond_13
    const-string v0, ":containsWholeOwnText("

    .line 185
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 186
    invoke-direct {p0, v6}, Ll/ܺ᩹ۚ;->ۧ(Z)V

    return-void

    :cond_14
    const-string v0, ":containsData("

    .line 187
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    const-string v0, ":containsData"

    .line 390
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->֫(Ljava/lang/String;)V

    .line 391
    invoke-virtual {v1, v8, v7}, Ll/ۘ֨ۚ;->֫(CC)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۘ֨ۚ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ":containsData(text) query must not be empty"

    .line 392
    invoke-static {v0, v1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    new-instance v1, Ll/ۖ᩸ۚ;

    invoke-direct {v1, v0}, Ll/ۖ᩸ۚ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_15
    const-string v0, ":matches("

    .line 189
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 190
    invoke-direct {p0, v5}, Ll/ܺ᩹ۚ;->ܽ(Z)V

    return-void

    :cond_16
    const-string v0, ":matchesOwn("

    .line 191
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 192
    invoke-direct {p0, v6}, Ll/ܺ᩹ۚ;->ܽ(Z)V

    return-void

    :cond_17
    const-string v0, ":matchesWholeText("

    .line 193
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 194
    invoke-direct {p0, v5}, Ll/ܺ᩹ۚ;->ᩳ(Z)V

    return-void

    :cond_18
    const-string v0, ":matchesWholeOwnText("

    .line 195
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 196
    invoke-direct {p0, v6}, Ll/ܺ᩹ۚ;->ᩳ(Z)V

    return-void

    :cond_19
    const-string v0, ":not("

    .line 197
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1a

    const-string v0, ":not"

    .line 422
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->֫(Ljava/lang/String;)V

    .line 423
    invoke-virtual {v1, v8, v7}, Ll/ۘ֨ۚ;->֫(CC)Ljava/lang/String;

    move-result-object v0

    const-string v1, ":not(selector) subselect must not be empty"

    .line 424
    invoke-static {v0, v1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    new-instance v1, Ll/ۚ᩹ۚ;

    invoke-static {v0}, Ll/ܺ᩹ۚ;->֫(Ljava/lang/String;)Ll/᩷᩹ۚ;

    move-result-object v0

    .line 9
    invoke-direct {v1}, Ll/᩷᩹ۚ;-><init>()V

    .line 49
    iput-object v0, v1, Ll/᩸᩹ۚ;->֫:Ll/᩷᩹ۚ;

    .line 426
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1a
    const-string v0, ":nth-child("

    .line 199
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 200
    invoke-direct {p0, v5, v5}, Ll/ܺ᩹ۚ;->֫(ZZ)V

    return-void

    :cond_1b
    const-string v0, ":nth-last-child("

    .line 201
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 202
    invoke-direct {p0, v6, v5}, Ll/ܺ᩹ۚ;->֫(ZZ)V

    return-void

    :cond_1c
    const-string v0, ":nth-of-type("

    .line 203
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 204
    invoke-direct {p0, v5, v6}, Ll/ܺ᩹ۚ;->֫(ZZ)V

    return-void

    :cond_1d
    const-string v0, ":nth-last-of-type("

    .line 205
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 206
    invoke-direct {p0, v6, v6}, Ll/ܺ᩹ۚ;->֫(ZZ)V

    return-void

    :cond_1e
    const-string v0, ":first-child"

    .line 207
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 208
    new-instance v0, Ll/ۙ᩸ۚ;

    .line 574
    invoke-direct {v0}, Ll/᩷᩹ۚ;-><init>()V

    .line 208
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1f
    const-string v0, ":last-child"

    .line 209
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 210
    new-instance v0, Ll/۬᩸ۚ;

    .line 406
    invoke-direct {v0}, Ll/᩷᩹ۚ;-><init>()V

    .line 210
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_20
    const-string v0, ":first-of-type"

    .line 211
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 212
    new-instance v0, Ll/ۗ᩸ۚ;

    .line 526
    invoke-direct {v0, v5, v6}, Ll/ۚ᩸ۚ;-><init>(II)V

    .line 212
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_21
    const-string v0, ":last-of-type"

    .line 213
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_22

    .line 214
    new-instance v0, Ll/۫᩸ۚ;

    .line 550
    invoke-direct {v0, v5, v6}, Ll/ۚ᩸ۚ;-><init>(II)V

    .line 214
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_22
    const-string v0, ":only-child"

    .line 215
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_23

    .line 216
    new-instance v0, Ll/ܰ᩸ۚ;

    .line 604
    invoke-direct {v0}, Ll/᩷᩹ۚ;-><init>()V

    .line 216
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_23
    const-string v0, ":only-of-type"

    .line 217
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_24

    .line 218
    new-instance v0, Ll/۟᩸ۚ;

    .line 616
    invoke-direct {v0}, Ll/᩷᩹ۚ;-><init>()V

    .line 218
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_24
    const-string v0, ":empty"

    .line 219
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_25

    .line 220
    new-instance v0, Ll/᩶᩸ۚ;

    .line 635
    invoke-direct {v0}, Ll/᩷᩹ۚ;-><init>()V

    .line 220
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_25
    const-string v0, ":root"

    .line 221
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 222
    new-instance v0, Ll/֫᩹ۚ;

    .line 592
    invoke-direct {v0}, Ll/᩷᩹ۚ;-><init>()V

    .line 222
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_26
    const-string v0, ":matchText"

    .line 223
    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_27

    .line 224
    new-instance v0, Ll/ۧ᩹ۚ;

    .line 862
    invoke-direct {v0}, Ll/᩷᩹ۚ;-><init>()V

    .line 224
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 226
    :cond_27
    new-instance v0, Ll/ۖ᩹ۚ;

    invoke-virtual {v1}, Ll/ۘ֨ۚ;->ۜ()Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    aput-object v4, v2, v5

    aput-object v1, v2, v6

    const-string v1, "Could not parse query \'%s\': unexpected token at \'%s\'"

    invoke-direct {v0, v1, v2}, Ll/ۖ᩹ۚ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    .line 246
    :cond_28
    :goto_0
    invoke-virtual {v1}, Ll/ۘ֨ۚ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩻֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 247
    invoke-static {v0}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 250
    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const-string v7, ":"

    if-eqz v1, :cond_2a

    .line 251
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 252
    new-instance v8, Ll/ܰܶۚ;

    new-instance v9, Ll/᩻᩹ۚ;

    invoke-direct {v9, v1}, Ll/᩻᩹ۚ;-><init>(Ljava/lang/String;)V

    new-instance v1, Ll/ۜ᩹ۚ;

    .line 254
    invoke-virtual {v0, v4, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ۜ᩹ۚ;-><init>(Ljava/lang/String;)V

    new-array v0, v3, [Ll/᩷᩹ۚ;

    aput-object v9, v0, v5

    aput-object v1, v0, v6

    .line 81
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 73
    invoke-direct {v8}, Ll/۟ܶۚ;-><init>()V

    .line 74
    iget v1, v8, Ll/۟ܶۚ;->ۧ:I

    iget-object v3, v8, Ll/۟ܶۚ;->֫:Ljava/util/ArrayList;

    if-le v1, v6, :cond_29

    .line 75
    new-instance v1, Ll/᩺ܶۚ;

    invoke-direct {v1, v0}, Ll/᩺ܶۚ;-><init>(Ljava/util/List;)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 77
    :cond_29
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 39
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, v8, Ll/۟ܶۚ;->ۧ:I

    .line 252
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2a
    const-string v1, "|"

    .line 258
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2b

    .line 259
    invoke-virtual {v0, v1, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 261
    :cond_2b
    new-instance v1, Ll/᩻᩹ۚ;

    invoke-direct {v1, v0}, Ll/᩻᩹ۚ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private ܽ(Z)V
    .locals 4

    if-eqz p1, :cond_0

    const-string v0, ":matchesOwn"

    goto :goto_0

    :cond_0
    const-string v0, ":matches"

    .line 399
    :goto_0
    iget-object v1, p0, Ll/ܺ᩹ۚ;->ܽ:Ll/ۘ֨ۚ;

    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->֫(Ljava/lang/String;)V

    const/16 v2, 0x28

    const/16 v3, 0x29

    .line 400
    invoke-virtual {v1, v2, v3}, Ll/ۘ֨ۚ;->֫(CC)Ljava/lang/String;

    move-result-object v1

    const-string v2, "(regex) query must not be empty"

    .line 401
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 404
    new-instance p1, Ll/ᩳ᩹ۚ;

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ᩳ᩹ۚ;-><init>(Ljava/util/regex/Pattern;)V

    goto :goto_1

    .line 405
    :cond_1
    new-instance p1, Ll/ܽ᩹ۚ;

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ܽ᩹ۚ;-><init>(Ljava/util/regex/Pattern;)V

    .line 403
    :goto_1
    iget-object v0, p0, Ll/ܺ᩹ۚ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private ᩳ(Z)V
    .locals 4

    if-eqz p1, :cond_0

    const-string v0, ":matchesWholeOwnText"

    goto :goto_0

    :cond_0
    const-string v0, ":matchesWholeText"

    .line 411
    :goto_0
    iget-object v1, p0, Ll/ܺ᩹ۚ;->ܽ:Ll/ۘ֨ۚ;

    invoke-virtual {v1, v0}, Ll/ۘ֨ۚ;->֫(Ljava/lang/String;)V

    const/16 v2, 0x28

    const/16 v3, 0x29

    .line 412
    invoke-virtual {v1, v2, v3}, Ll/ۘ֨ۚ;->֫(CC)Ljava/lang/String;

    move-result-object v1

    const-string v2, "(regex) query must not be empty"

    .line 413
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 416
    new-instance p1, Ll/ܿ᩹ۚ;

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ܿ᩹ۚ;-><init>(Ljava/util/regex/Pattern;)V

    goto :goto_1

    .line 417
    :cond_1
    new-instance p1, Ll/ܳ᩹ۚ;

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ܳ᩹ۚ;-><init>(Ljava/util/regex/Pattern;)V

    .line 415
    :goto_1
    iget-object v0, p0, Ll/ܺ᩹ۚ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 431
    iget-object v0, p0, Ll/ܺ᩹ۚ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Ll/᩷᩹ۚ;
    .locals 5

    .line 56
    iget-object v0, p0, Ll/ܺ᩹ۚ;->ܽ:Ll/ۘ֨ۚ;

    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ܿ()Z

    .line 58
    sget-object v1, Ll/ܺ᩹ۚ;->᩻:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۘ֨ۚ;->ۧ([Ljava/lang/String;)Z

    move-result v2

    iget-object v3, p0, Ll/ܺ᩹ۚ;->֫:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    .line 59
    new-instance v2, Ll/ܶ᩹ۚ;

    .line 12
    invoke-direct {v2}, Ll/᩷᩹ۚ;-><init>()V

    .line 59
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ۧ()C

    move-result v2

    invoke-direct {p0, v2}, Ll/ܺ᩹ۚ;->֫(C)V

    goto :goto_0

    .line 62
    :cond_0
    invoke-direct {p0}, Ll/ܺ᩹ۚ;->ܽ()V

    .line 65
    :goto_0
    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ܳ()Z

    move-result v2

    if-nez v2, :cond_3

    .line 67
    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ܿ()Z

    move-result v2

    .line 69
    invoke-virtual {v0, v1}, Ll/ۘ֨ۚ;->ۧ([Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 70
    invoke-virtual {v0}, Ll/ۘ֨ۚ;->ۧ()C

    move-result v2

    invoke-direct {p0, v2}, Ll/ܺ᩹ۚ;->֫(C)V

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    const/16 v2, 0x20

    .line 72
    invoke-direct {p0, v2}, Ll/ܺ᩹ۚ;->֫(C)V

    goto :goto_0

    .line 74
    :cond_2
    invoke-direct {p0}, Ll/ܺ᩹ۚ;->ܽ()V

    goto :goto_0

    .line 78
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    .line 79
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷᩹ۚ;

    return-object v0

    .line 81
    :cond_4
    new-instance v0, Ll/᩺ܶۚ;

    invoke-direct {v0, v3}, Ll/᩺ܶۚ;-><init>(Ljava/util/List;)V

    return-object v0
.end method
