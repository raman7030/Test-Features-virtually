.class public final Ll/᩵ܽۘ;
.super Ljava/lang/Object;
.source "19FV"

# interfaces
.implements Ll/ۘܽۘ;


# instance fields
.field public ֫:Ll/ᩴᩳۘ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ll/ᩴܽۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/᩵ܽۘ;->֫:Ll/ᩴᩳۘ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܶܽۘ;Ll/ܽۧۘ;Ll/ۖܽۘ;)Ljava/lang/Object;
    .locals 0

    .line 32
    invoke-interface {p3, p2}, Ll/ۖܽۘ;->֫(Ll/ܽۧۘ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܶܽۘ;Ll/ܽۨۖ;Ll/ܽۧۘ;Ll/ۖܽۘ;)Ljava/lang/Object;
    .locals 8

    .line 48
    invoke-virtual {p2}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p1

    check-cast p1, Ll/᩻ۨۖ;

    invoke-virtual {p1}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v0

    sget-object p1, Ll/۟۫ۖ;->᩸ۧ:Ll/۟۫ۖ;

    invoke-virtual {p1}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_c

    .line 49
    invoke-virtual {p2}, Ll/ܽۨۖ;->ᩳ()Ll/۬ۛۖ;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 73
    invoke-virtual {p1}, Ll/۬ۛۖ;->֫()Ljava/util/ArrayList;

    move-result-object p1

    .line 74
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙۛۖ;

    .line 75
    instance-of v1, v0, Ll/ۗۛۖ;

    if-eqz v1, :cond_0

    .line 76
    check-cast v0, Ll/ۗۛۖ;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_b

    .line 53
    invoke-virtual {p3}, Ll/ܽۧۘ;->ۧ()Ljava/lang/String;

    move-result-object p1

    .line 84
    invoke-virtual {v0}, Ll/ۗۛۖ;->ۧ()I

    move-result p2

    .line 113
    invoke-static {p1}, Ll/ۤۛۖ;->֫(Ljava/lang/String;)[B

    move-result-object v1

    .line 114
    new-instance v2, Ljava/lang/String;

    array-length v3, v1

    sub-int/2addr v3, p2

    sget-object v4, Ll/۠ܰۖ;->ᩳ:Ljava/nio/charset/Charset;

    invoke-direct {v2, v1, v3, p2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 86
    invoke-virtual {v0}, Ll/ۗۛۖ;->֫()Ljava/lang/String;

    move-result-object v1

    .line 89
    invoke-virtual {v0}, Ll/ۗۛۖ;->ܽ()Z

    move-result v0

    const/16 v3, 0x5c

    const/4 v5, -0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_2

    .line 0
    invoke-static {v1, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 108
    :cond_2
    invoke-static {p1}, Ll/ۤۛۖ;->֫(Ljava/lang/String;)[B

    move-result-object p1

    .line 109
    new-instance v0, Ljava/lang/String;

    array-length v7, p1

    sub-int/2addr v7, p2

    invoke-direct {v0, p1, v6, v7, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 93
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "\\"

    .line 94
    invoke-virtual {v0, p2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result p2

    if-eq p2, v5, :cond_3

    .line 96
    invoke-virtual {p1, v0, v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 97
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 0
    :cond_3
    invoke-static {p1, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 33
    :goto_1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    .line 36
    :goto_2
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    if-eq v1, v5, :cond_4

    .line 37
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    goto :goto_2

    .line 40
    :cond_4
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 120
    :goto_3
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_8

    .line 121
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "."

    .line 122
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 123
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_3

    :cond_5
    const-string v1, ".."

    .line 124
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    if-lez p1, :cond_6

    add-int/lit8 v0, p1, -0x1

    .line 126
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move p1, v0

    .line 128
    :cond_6
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_3

    :cond_7
    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    .line 52
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    :goto_4
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_a

    if-lez v6, :cond_9

    .line 55
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    :cond_9
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 59
    :cond_a
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 54
    new-instance p2, Ll/ܽۧۘ;

    invoke-virtual {p3}, Ll/ܽۧۘ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Ll/ܽۧۘ;->ܽ()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, v0, p3, p1}, Ll/ܽۧۘ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p4, p2}, Ll/ۖܽۘ;->֫(Ll/ܽۧۘ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 51
    :cond_b
    new-instance p1, Ll/ܺܽۘ;

    invoke-virtual {p2}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p2

    check-cast p2, Ll/᩻ۨۖ;

    invoke-virtual {p2}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v0

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "Create failed for "

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ": missing symlink data"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, v0, v1, p2}, Ll/ܺܽۘ;-><init>(JLjava/lang/String;)V

    throw p1

    .line 27
    :cond_c
    invoke-interface {p4, p3}, Ll/ۖܽۘ;->֫(Ll/ܽۧۘ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ᩴᩳۘ;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/᩵ܽۘ;->֫:Ll/ᩴᩳۘ;

    return-object v0
.end method
