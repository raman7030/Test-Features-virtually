.class public Ll/ۗۛ᩷;
.super Ljava/lang/Object;
.source "A1E3"


# direct methods
.method public static ֫(IIILjava/lang/String;)I
    .locals 3

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    :goto_0
    if-ge p1, v1, :cond_1

    if-ne p1, p0, :cond_0

    goto :goto_1

    .line 33
    :cond_0
    invoke-virtual {p3, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v0, v2}, Ll/ܰ᩵ۚ;->֫(Ljava/lang/StringBuilder;C)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    add-int/2addr p0, p2

    return p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ll/۫ۘܽ;ZZLl/᩹ۛ᩷;)Ljava/lang/String;
    .locals 7

    .line 74
    new-instance v6, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v6}, Ll/ۗۛ᩷;->֫(Ljava/lang/String;Ljava/lang/String;Ll/۫ۘܽ;ZZLl/᩹ۛ᩷;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ll/۫ۘܽ;ZZLl/᩹ۛ᩷;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 3

    .line 82
    invoke-virtual {p6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    invoke-virtual {p6}, Ljava/util/ArrayList;->clear()V

    .line 85
    :cond_0
    invoke-virtual {p2, p0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    if-eqz p4, :cond_1

    .line 87
    invoke-virtual {p2}, Ll/۫ۘܽ;->matches()Z

    move-result p4

    if-eqz p4, :cond_2

    .line 88
    invoke-virtual {p2}, Ll/۫ۘܽ;->toSnapshot()Ll/ۤۘܽ;

    move-result-object p2

    invoke-virtual {p6, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 91
    :cond_1
    :goto_0
    invoke-virtual {p2}, Ll/۫ۘܽ;->find()Z

    move-result p4

    if-eqz p4, :cond_2

    .line 92
    invoke-virtual {p2}, Ll/۫ۘܽ;->start()I

    move-result p4

    invoke-virtual {p2}, Ll/۫ۘܽ;->end()I

    move-result v0

    if-eq p4, v0, :cond_1

    .line 93
    invoke-virtual {p2}, Ll/۫ۘܽ;->toSnapshot()Ll/ۤۘܽ;

    move-result-object p4

    invoke-virtual {p6, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 96
    :cond_2
    :goto_1
    invoke-virtual {p6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p0, 0x0

    return-object p0

    :cond_3
    if-eqz p5, :cond_4

    .line 99
    invoke-virtual {p6}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-virtual {p5, p2}, Ll/᩹ۛ᩷;->֫(I)V

    .line 101
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p4

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 103
    invoke-virtual {p6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p4

    const/4 p5, 0x0

    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۘܽ;

    .line 104
    invoke-virtual {v0}, Ll/ۤۘܽ;->start()I

    move-result v1

    .line 105
    invoke-virtual {v0}, Ll/ۤۘܽ;->end()I

    move-result v2

    if-eqz p3, :cond_6

    .line 109
    :try_start_0
    invoke-virtual {v0, p1}, Ll/ۤۘܽ;->expandReplacement(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-object v0, p1

    :goto_3
    if-le v1, p5, :cond_5

    .line 114
    invoke-virtual {p2, p0, p5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 115
    :cond_5
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_6
    if-le v1, p5, :cond_7

    .line 118
    invoke-virtual {p2, p0, p5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 119
    :cond_7
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_4
    move p5, v2

    goto :goto_2

    .line 123
    :cond_8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    if-ge p5, p1, :cond_9

    .line 124
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p2, p0, p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 125
    :cond_9
    invoke-virtual {p6}, Ljava/util/ArrayList;->clear()V

    .line 126
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;ZZ)Ll/ܶۛ᩷;
    .locals 0

    .line 211
    invoke-static {p0, p1, p2}, Ll/ۗۛ᩷;->ۧ(Ljava/lang/String;ZZ)Ll/ۨۘܽ;

    move-result-object p0

    .line 212
    new-instance p1, Ll/ܶۛ᩷;

    invoke-direct {p1, p0}, Ll/ܶۛ᩷;-><init>(Ll/ۨۘܽ;)V

    return-object p1
.end method

.method public static ֫(ILjava/lang/Runnable;)V
    .locals 3

    const/4 v0, 0x1

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    .line 46
    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_1

    .line 48
    new-instance v2, Ljava/lang/Thread;

    invoke-direct {v2, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 49
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 50
    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 52
    :cond_1
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 53
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Thread;

    .line 55
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static ۧ(Ljava/lang/String;ZZ)Ll/ۨۘܽ;
    .locals 0

    if-nez p1, :cond_0

    .line 200
    invoke-static {p0}, Ll/ۘ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_0
    if-eqz p2, :cond_1

    const/16 p1, 0x8

    .line 203
    invoke-static {p1, p0}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 p1, 0x4a

    .line 205
    invoke-static {p1, p0}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object p0

    return-object p0
.end method
