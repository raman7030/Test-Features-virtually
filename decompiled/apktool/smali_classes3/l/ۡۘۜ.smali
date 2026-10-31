.class public final Ll/ۡۘۜ;
.super Ljava/lang/Object;
.source "X6VB"


# instance fields
.field public final ֫:Ll/ۨۘܽ;

.field public final ۧ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ۨۘܽ;Ljava/lang/String;Z)V
    .locals 11

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/ۡۘۜ;->֫:Ll/ۨۘܽ;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eqz p3, :cond_13

    .line 63
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 64
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    .line 65
    invoke-virtual {p1, v4}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v4

    invoke-virtual {v4}, Ll/۫ۘܽ;->groupCount()I

    move-result v4

    .line 66
    invoke-virtual {p1}, Ll/ۨۘܽ;->ᩳ()Ljava/util/Map;

    move-result-object p1

    const/4 v5, 0x0

    .line 67
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v5, v6, :cond_12

    .line 68
    invoke-virtual {p2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x24

    const/16 v8, 0x5c

    if-ne v6, v8, :cond_6

    add-int/lit8 v5, v5, 0x1

    .line 70
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v6

    if-eq v5, v6, :cond_5

    .line 71
    invoke-virtual {p2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-eq v6, v7, :cond_4

    if-eq v6, v8, :cond_3

    const/16 v7, 0x6e

    if-eq v6, v7, :cond_2

    const/16 v7, 0x72

    if-eq v6, v7, :cond_1

    const/16 v7, 0x74

    if-ne v6, v7, :cond_0

    const/16 v7, 0x9

    goto :goto_1

    .line 77
    :cond_0
    invoke-static {}, Ll/ۡۘۜ;->ۧ()Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_1
    const/16 v7, 0xd

    goto :goto_1

    :cond_2
    const/16 v7, 0xa

    goto :goto_1

    :cond_3
    const/16 v7, 0x5c

    .line 71
    :cond_4
    :goto_1
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    .line 70
    :cond_5
    invoke-static {}, Ll/ۡۘۜ;->ۧ()Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_6
    if-ne v6, v7, :cond_11

    add-int/lit8 v6, v5, 0x1

    .line 80
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v7

    if-eq v6, v7, :cond_10

    .line 82
    invoke-virtual {p2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x7b

    const/16 v9, 0x39

    const/16 v10, 0x30

    if-ne v7, v8, :cond_c

    add-int/lit8 v5, v5, 0x2

    const/16 v6, 0x7d

    .line 84
    invoke-virtual {p2, v6, v5}, Ljava/lang/String;->indexOf(II)I

    move-result v6

    if-ltz v6, :cond_b

    if-eq v6, v5, :cond_b

    .line 86
    invoke-virtual {p2, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 87
    invoke-virtual {v5, v0}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v10, :cond_9

    invoke-virtual {v5, v0}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-gt v7, v9, :cond_9

    const/4 v7, 0x0

    .line 88
    :goto_2
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v7, v8, :cond_8

    .line 89
    invoke-virtual {v5, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v10, :cond_7

    invoke-virtual {v5, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-gt v8, v9, :cond_7

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_7
    invoke-static {}, Ll/ۡۘۜ;->ۧ()Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    .line 92
    :cond_8
    :try_start_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 94
    :catch_0
    invoke-static {}, Ll/ۡۘۜ;->ۧ()Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    .line 97
    :cond_9
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_a

    .line 99
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_3

    .line 98
    :cond_a
    invoke-static {}, Ll/ۡۘۜ;->ۧ()Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    .line 85
    :cond_b
    invoke-static {}, Ll/ۡۘۜ;->ۧ()Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_c
    if-lt v7, v10, :cond_f

    if-gt v7, v9, :cond_f

    add-int/lit8 v5, v7, -0x30

    :goto_3
    if-gt v5, v4, :cond_e

    .line 108
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    if-eqz v7, :cond_d

    .line 109
    new-instance v7, Ll/ۜۘۜ;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8, v2}, Ll/ۜۘۜ;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 112
    :cond_d
    new-instance v7, Ll/ۜۘۜ;

    const/4 v8, 0x0

    invoke-direct {v7, v8, v5}, Ll/ۜۘۜ;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v5, v6

    goto :goto_4

    .line 107
    :cond_e
    invoke-static {}, Ll/ۡۘۜ;->ۧ()Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    .line 105
    :cond_f
    invoke-static {}, Ll/ۡۘۜ;->ۧ()Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    .line 80
    :cond_10
    invoke-static {}, Ll/ۡۘۜ;->ۧ()Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    .line 114
    :cond_11
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_4
    add-int/2addr v5, v1

    goto/16 :goto_0

    .line 117
    :cond_12
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    if-eqz p1, :cond_14

    new-instance p1, Ll/ۜۘۜ;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v2}, Ll/ۜۘۜ;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 18
    :cond_13
    new-instance p1, Ll/ۜۘۜ;

    invoke-direct {p1, p2, v2}, Ll/ۜۘۜ;-><init>(Ljava/lang/String;I)V

    new-array p2, v1, [Ljava/lang/Object;

    aput-object p1, p2, v0

    .line 0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    aget-object p2, p2, v0

    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    .line 18
    :cond_14
    :goto_5
    iput-object p3, p0, Ll/ۡۘۜ;->ۧ:Ljava/util/List;

    return-void
.end method

.method public static ֫()V
    .locals 2

    .line 127
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ll/᩻ۘۜ;

    sget-object v1, Ll/᩷ۘۜ;->᩹:Ll/᩷ۘۜ;

    invoke-direct {v0, v1}, Ll/᩻ۘۜ;-><init>(Ll/᩷ۘۜ;)V

    throw v0
.end method

.method public static ֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 5

    .line 58
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    int-to-long v0, v0

    int-to-long v2, p1

    add-long/2addr v0, v2

    int-to-long v2, p0

    sub-long/2addr v0, v2

    const/high16 v2, 0x1400000

    int-to-long v2, v2

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    .line 59
    invoke-virtual {p3, p2, p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    return-void

    .line 58
    :cond_0
    new-instance p0, Ll/᩻ۘۜ;

    sget-object p1, Ll/᩷ۘۜ;->ۙ:Ll/᩷ۘۜ;

    invoke-direct {p0, p1}, Ll/᩻ۘۜ;-><init>(Ll/᩷ۘۜ;)V

    throw p0
.end method

.method public static ۧ()Ljava/lang/IllegalArgumentException;
    .locals 2

    .line 122
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid replacement template or unknown capture group."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Z)Ll/ۢۘۜ;
    .locals 7

    .line 23
    invoke-static {}, Ll/ۡۘۜ;->֫()V

    .line 24
    iget-object v0, p0, Ll/ۡۘۜ;->֫:Ll/ۨۘܽ;

    invoke-virtual {v0, p1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/high16 v3, 0x1400000

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 29
    :cond_0
    invoke-virtual {v0}, Ll/۫ۘܽ;->find()Z

    move-result v5

    .line 30
    invoke-static {}, Ll/ۡۘۜ;->֫()V

    .line 32
    invoke-virtual {v0}, Ll/۫ۘܽ;->ۜ()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v0}, Ll/۫ۘܽ;->᩻()Z

    move-result v6

    if-nez v6, :cond_5

    if-nez v5, :cond_1

    goto :goto_1

    .line 36
    :cond_1
    invoke-virtual {v0}, Ll/۫ۘܽ;->start()I

    move-result v5

    invoke-static {v3, v5, p1, v1}, Ll/ۡۘۜ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 37
    iget-object v3, p0, Ll/ۡۘۜ;->ۧ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۜۘۜ;

    .line 38
    invoke-static {}, Ll/ۡۘۜ;->֫()V

    .line 39
    invoke-static {v5}, Ll/ۜۘۜ;->֫(Ll/ۜۘۜ;)I

    move-result v6

    if-gez v6, :cond_3

    .line 40
    invoke-static {v5}, Ll/ۜۘۜ;->ۧ(Ll/ۜۘۜ;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5}, Ll/ۜۘۜ;->ۧ(Ll/ۜۘۜ;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v2, v5, v6, v1}, Ll/ۡۘۜ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    goto :goto_0

    .line 42
    :cond_3
    invoke-static {v5}, Ll/ۜۘۜ;->֫(Ll/ۜۘۜ;)I

    move-result v6

    invoke-virtual {v0, v6}, Ll/۫ۘܽ;->start(I)I

    move-result v6

    if-ltz v6, :cond_2

    .line 43
    invoke-static {v5}, Ll/ۜۘۜ;->֫(Ll/ۜۘۜ;)I

    move-result v5

    invoke-virtual {v0, v5}, Ll/۫ۘܽ;->end(I)I

    move-result v5

    invoke-static {v6, v5, p1, v1}, Ll/ۡۘۜ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    goto :goto_0

    .line 46
    :cond_4
    invoke-virtual {v0}, Ll/۫ۘܽ;->end()I

    move-result v3

    add-int/lit8 v4, v4, 0x1

    if-eqz p2, :cond_0

    .line 50
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {v3, p2, p1, v1}, Ll/ۡۘۜ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 51
    invoke-static {}, Ll/ۡۘۜ;->֫()V

    .line 52
    new-instance p1, Ll/ۢۘۜ;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v4}, Ll/ۢۘۜ;-><init>(Ljava/lang/String;I)V

    return-object p1

    .line 33
    :cond_5
    new-instance p1, Ll/᩻ۘۜ;

    sget-object p2, Ll/᩷ۘۜ;->᩶:Ll/᩷ۘۜ;

    invoke-direct {p1, p2}, Ll/᩻ۘۜ;-><init>(Ll/᩷ۘۜ;)V

    throw p1
.end method
