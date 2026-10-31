.class public final Ll/ܳۛۡ;
.super Ljava/lang/Object;
.source "J1PQ"


# static fields
.field public static final ᩳ:Ll/᩺᩺ۡ;


# instance fields
.field public ֫:Ljava/util/Comparator;

.field public ۧ:I

.field public final ܽ:Ljava/util/Collection;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 15
    new-instance v0, Ll/᩺᩺ۡ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ll/᩺᩺ۡ;-><init>(I)V

    sput-object v0, Ll/ܳۛۡ;->ᩳ:Ll/᩺᩺ۡ;

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 21
    iput v0, p0, Ll/ܳۛۡ;->ۧ:I

    .line 22
    sget-object v0, Ll/ܳۛۡ;->ᩳ:Ll/᩺᩺ۡ;

    iput-object v0, p0, Ll/ܳۛۡ;->֫:Ljava/util/Comparator;

    .line 25
    iput-object p1, p0, Ll/ܳۛۡ;->ܽ:Ljava/util/Collection;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x2f

    .line 91
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 94
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/Collection;)Ll/ܳۛۡ;
    .locals 1

    .line 29
    new-instance v0, Ll/ܳۛۡ;

    invoke-direct {v0, p0}, Ll/ܳۛۡ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/HashMap;Z)Ll/ܿۛۡ;
    .locals 4

    .line 71
    invoke-virtual {p1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿۛۡ;

    if-eqz v0, :cond_0

    return-object v0

    .line 74
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_1

    .line 75
    new-instance p2, Ll/ܿۛۡ;

    const/4 v0, 0x0

    invoke-direct {p2, v0, v1, p0}, Ll/ܿۛۡ;-><init>(Ll/ܿۛۡ;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    const/16 v0, 0x2f

    const/4 v2, 0x1

    if-eqz p2, :cond_2

    .line 77
    invoke-static {v1, p1, v2}, Ll/ܳۛۡ;->֫(Ljava/lang/String;Ljava/util/HashMap;Z)Ll/ܿۛۡ;

    move-result-object p2

    .line 78
    new-instance v1, Ll/ܿۛۡ;

    const/16 v2, 0x2e

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p2, v0, p0}, Ll/ܿۛۡ;-><init>(Ll/ܿۛۡ;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-static {p2}, Ll/ܿۛۡ;->֫(Ll/ܿۛۡ;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    move-object p2, v1

    goto :goto_2

    .line 108
    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p2

    const/4 v0, -0x1

    const/4 v3, 0x0

    if-ne p2, v0, :cond_3

    .line 110
    filled-new-array {v1, p0}, [Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    .line 111
    :cond_3
    invoke-virtual {p0, v3, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    add-int/2addr p2, v2

    invoke-virtual {p0, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    filled-new-array {v0, p2}, [Ljava/lang/String;

    move-result-object p2

    .line 82
    :goto_1
    aget-object v0, p2, v3

    invoke-static {v0, p1, v3}, Ll/ܳۛۡ;->֫(Ljava/lang/String;Ljava/util/HashMap;Z)Ll/ܿۛۡ;

    move-result-object v0

    .line 83
    new-instance v1, Ll/ܿۛۡ;

    aget-object p2, p2, v2

    invoke-direct {v1, v0, p2, p0}, Ll/ܿۛۡ;-><init>(Ll/ܿۛۡ;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    invoke-static {v0}, Ll/ܿۛۡ;->֫(Ll/ܿۛۡ;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 86
    :goto_2
    invoke-virtual {p1, p0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public static ֫(Ll/ܿۛۡ;)V
    .locals 3

    .line 115
    invoke-static {p0}, Ll/ܿۛۡ;->ᩳ(Ll/ܿۛۡ;)Ll/ܿۛۡ;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Ll/ܿۛۡ;->֫(Ll/ܿۛۡ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-static {p0}, Ll/ܿۛۡ;->ۧ(Ll/ܿۛۡ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 116
    invoke-static {p0}, Ll/ܿۛۡ;->֫(Ll/ܿۛۡ;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿۛۡ;

    .line 117
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ll/ܿۛۡ;->ܽ(Ll/ܿۛۡ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/ܿۛۡ;->ܽ(Ll/ܿۛۡ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Ll/ܿۛۡ;->֫(Ll/ܿۛۡ;Ljava/lang/String;)V

    .line 118
    invoke-static {v0}, Ll/ܿۛۡ;->ܿ(Ll/ܿۛۡ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Ll/ܿۛۡ;->ۧ(Ll/ܿۛۡ;Ljava/lang/String;)V

    .line 119
    invoke-static {p0}, Ll/ܿۛۡ;->֫(Ll/ܿۛۡ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0}, Ll/ܿۛۡ;->֫(Ll/ܿۛۡ;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 120
    invoke-static {p0}, Ll/ܿۛۡ;->ۧ(Ll/ܿۛۡ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0}, Ll/ܿۛۡ;->ۧ(Ll/ܿۛۡ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 121
    invoke-static {p0}, Ll/ܿۛۡ;->֫(Ll/ܿۛۡ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿۛۡ;

    .line 122
    invoke-static {v1, p0}, Ll/ܿۛۡ;->֫(Ll/ܿۛۡ;Ll/ܿۛۡ;)V

    goto :goto_0

    .line 124
    :cond_0
    invoke-static {p0}, Ll/ܿۛۡ;->ۧ(Ll/ܿۛۡ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧۛۡ;

    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    .line 127
    :cond_1
    invoke-static {p0}, Ll/ܳۛۡ;->֫(Ll/ܿۛۡ;)V

    .line 129
    :cond_2
    invoke-static {p0}, Ll/ܿۛۡ;->֫(Ll/ܿۛۡ;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿۛۡ;

    .line 130
    invoke-static {v0}, Ll/ܳۛۡ;->֫(Ll/ܿۛۡ;)V

    goto :goto_2

    :cond_3
    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x2f

    .line 98
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    const/4 v1, 0x0

    .line 101
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/ܿۛۡ;
    .locals 15

    .line 43
    iget-object v0, p0, Ll/ܳۛۡ;->ܽ:Ljava/util/Collection;

    iget v1, p0, Ll/ܳۛۡ;->ۧ:I

    iget-object v2, p0, Ll/ܳۛۡ;->֫:Ljava/util/Comparator;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v4, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x2

    if-ne v1, v6, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    const/4 v6, 0x0

    :goto_2
    const/4 v7, 0x5

    const-string v8, ""

    if-ge v6, v7, :cond_5

    .line 51
    :try_start_0
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 52
    invoke-static {v8, v7, v1}, Ll/ܳۛۡ;->֫(Ljava/lang/String;Ljava/util/HashMap;Z)Ll/ܿۛۡ;

    move-result-object v9

    .line 53
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const/16 v12, 0x2f

    .line 108
    invoke-virtual {v11, v12}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v12

    const/4 v13, -0x1

    if-ne v12, v13, :cond_2

    .line 110
    filled-new-array {v8, v11}, [Ljava/lang/String;

    move-result-object v12

    goto :goto_4

    .line 111
    :cond_2
    invoke-virtual {v11, v3, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v11, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    filled-new-array {v13, v12}, [Ljava/lang/String;

    move-result-object v12

    .line 55
    :goto_4
    aget-object v13, v12, v3

    invoke-static {v13, v7, v1}, Ll/ܳۛۡ;->֫(Ljava/lang/String;Ljava/util/HashMap;Z)Ll/ܿۛۡ;

    move-result-object v13

    .line 56
    invoke-static {v13}, Ll/ܿۛۡ;->ۧ(Ll/ܿۛۡ;)Ljava/util/ArrayList;

    move-result-object v13

    new-instance v14, Ll/ۧۛۡ;

    aget-object v12, v12, v4

    invoke-direct {v14, v12, v11}, Ll/ۧۛۡ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    if-eqz v5, :cond_4

    .line 59
    invoke-static {v9}, Ll/ܳۛۡ;->֫(Ll/ܿۛۡ;)V

    .line 61
    :cond_4
    invoke-virtual {v9, v2}, Ll/ܿۛۡ;->֫(Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    .line 64
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->yield()V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 67
    :cond_5
    new-instance v9, Ll/ܿۛۡ;

    const/4 v0, 0x0

    invoke-direct {v9, v0, v8, v8}, Ll/ܿۛۡ;-><init>(Ll/ܿۛۡ;Ljava/lang/String;Ljava/lang/String;)V

    :goto_5
    return-object v9
.end method

.method public final ֫(I)V
    .locals 0

    .line 33
    iput p1, p0, Ll/ܳۛۡ;->ۧ:I

    return-void
.end method

.method public final ֫(Ll/ۗᩳܽ;)V
    .locals 0

    .line 38
    iput-object p1, p0, Ll/ܳۛۡ;->֫:Ljava/util/Comparator;

    return-void
.end method
