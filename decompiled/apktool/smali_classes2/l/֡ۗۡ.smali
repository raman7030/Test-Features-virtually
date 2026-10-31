.class public final Ll/֡ۗۡ;
.super Ll/ۖ᩹ۢ;
.source "R1V9"

# interfaces
.implements Ll/ۡ۬ۡ;


# instance fields
.field public final ۧ:Ljava/util/HashMap;

.field public final ܳ:Ll/ۚۗۡ;

.field public final ܽ:Ljava/util/HashSet;

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:Ljava/util/TreeSet;


# direct methods
.method public constructor <init>(Ll/᩹ۗۡ;Ll/ۚۗۡ;Ll/۟ۤ;)V
    .locals 10

    const/4 v0, 0x2

    .line 14
    invoke-direct {p0, v0}, Ll/ۖ᩹ۢ;-><init>(I)V

    .line 26
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/֡ۗۡ;->ܽ:Ljava/util/HashSet;

    .line 27
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    iput-object v0, p0, Ll/֡ۗۡ;->ᩳ:Ljava/util/TreeSet;

    .line 29
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/֡ۗۡ;->ܿ:Ljava/util/HashMap;

    .line 30
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/֡ۗۡ;->ۧ:Ljava/util/HashMap;

    .line 33
    iput-object p2, p0, Ll/֡ۗۡ;->ܳ:Ll/ۚۗۡ;

    .line 34
    new-instance v1, Ll/᩵ۗۡ;

    invoke-direct {v1, p0, p3}, Ll/᩵ۗۡ;-><init>(Ll/֡ۗۡ;Ll/۟ۤ;)V

    invoke-virtual {p1, v1}, Ll/᩹ۗۡ;->֫(Ll/ۡ۬ۡ;)V

    .line 36
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/TreeSet;->size()I

    move-result p3

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 38
    new-instance v2, Ll/ᩴۗۡ;

    .line 162
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 159
    iput v1, v2, Ll/ᩴۗۡ;->֫:I

    .line 160
    iput v1, v2, Ll/ᩴۗۡ;->ۧ:I

    .line 163
    iput-object v0, v2, Ll/ᩴۗۡ;->ܽ:Ljava/lang/String;

    .line 164
    iput-object v0, v2, Ll/ᩴۗۡ;->ܳ:Ljava/lang/String;

    .line 38
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    const/4 v0, 0x0

    .line 42
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x1

    if-ge v3, v2, :cond_6

    .line 43
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩴۗۡ;

    .line 168
    iget-object v6, v5, Ll/ᩴۗۡ;->ܳ:Ljava/lang/String;

    if-ltz v0, :cond_5

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_2
    const/16 v9, 0x2f

    if-ge v7, v0, :cond_3

    .line 173
    invoke-virtual {v6, v9, v8}, Ljava/lang/String;->indexOf(II)I

    move-result v8

    add-int/2addr v8, v4

    if-nez v8, :cond_2

    .line 175
    iput v1, v5, Ll/ᩴۗۡ;->ۧ:I

    iput v1, v5, Ll/ᩴۗۡ;->֫:I

    const/4 v4, 0x0

    .line 176
    iput-object v4, v5, Ll/ᩴۗۡ;->ܿ:Ljava/lang/String;

    .line 177
    iput-object v6, v5, Ll/ᩴۗۡ;->ᩳ:Ljava/lang/String;

    goto :goto_3

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v4, v8, 0x1

    .line 181
    invoke-virtual {v6, v9, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    if-ne v4, v1, :cond_4

    .line 183
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v4

    .line 184
    :cond_4
    iput v8, v5, Ll/ᩴۗۡ;->֫:I

    .line 185
    iput v4, v5, Ll/ᩴۗۡ;->ۧ:I

    .line 186
    invoke-virtual {v6, v8, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v5, Ll/ᩴۗۡ;->ܿ:Ljava/lang/String;

    .line 187
    invoke-virtual {v6, p3, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v5, Ll/ᩴۗۡ;->ᩳ:Ljava/lang/String;

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 170
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 204
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 205
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩴۗۡ;

    .line 206
    iget-object v6, v5, Ll/ᩴۗۡ;->ܿ:Ljava/lang/String;

    if-nez v6, :cond_7

    goto :goto_4

    .line 209
    :cond_7
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, v5, Ll/ᩴۗۡ;->ᩳ:Ljava/lang/String;

    .line 0
    invoke-static {v7, v8, v6}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 211
    invoke-virtual {v2, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    if-nez v7, :cond_8

    .line 213
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 214
    invoke-interface {v2, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    :cond_8
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 218
    :cond_9
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    .line 47
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_d

    .line 61
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_b

    .line 62
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴۗۡ;

    .line 63
    iget-object v3, v2, Ll/ᩴۗۡ;->ܳ:Ljava/lang/String;

    invoke-virtual {p2, v3}, Ll/ۚۗۡ;->ܽ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 64
    iput p3, v2, Ll/ᩴۗۡ;->֫:I

    const-string v3, "pkg/"

    .line 65
    invoke-direct {p0, v3}, Ll/֡ۗۡ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, p3}, Ll/ᩴۗۡ;->֫(Ljava/lang/String;Z)V

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 68
    :cond_b
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩴۗۡ;

    .line 69
    iget-object p3, p0, Ll/֡ۗۡ;->ۧ:Ljava/util/HashMap;

    iget-object v0, p2, Ll/ᩴۗۡ;->ܽ:Ljava/lang/String;

    iget-object p2, p2, Ll/ᩴۗۡ;->ܳ:Ljava/lang/String;

    invoke-virtual {p3, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_c
    return-void

    .line 49
    :cond_d
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 50
    invoke-interface {v3, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩴۗۡ;

    .line 51
    iget-object v6, v5, Ll/ᩴۗۡ;->ܿ:Ljava/lang/String;

    .line 52
    invoke-virtual {p2, v6}, Ll/ۚۗۡ;->ܿ(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_e

    .line 53
    iget-object v5, v5, Ll/ᩴۗۡ;->ᩳ:Ljava/lang/String;

    invoke-direct {p0, v5}, Ll/֡ۗۡ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 54
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩴۗۡ;

    .line 55
    invoke-virtual {v6, v5, v4}, Ll/ᩴۗۡ;->֫(Ljava/lang/String;Z)V

    .line 56
    iget-object v7, p0, Ll/֡ۗۡ;->ܽ:Ljava/util/HashSet;

    iget-object v6, v6, Ll/ᩴۗۡ;->ܳ:Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_7
.end method

.method public static bridge synthetic ֫(Ll/֡ۗۡ;)Ljava/util/Set;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ۗۡ;->ܽ:Ljava/util/HashSet;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/֡ۗۡ;)Ljava/util/Set;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ۗۡ;->ᩳ:Ljava/util/TreeSet;

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x2f

    .line 222
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    const/4 v1, 0x0

    .line 223
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/֡ۗۡ;)Ll/ۚۗۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ۗۡ;->ܳ:Ll/ۚۗۡ;

    return-object p0
.end method

.method private ᩳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 128
    iget-object v0, p0, Ll/֡ۗۡ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ۙۡ;

    if-nez v1, :cond_0

    .line 132
    invoke-static {}, Ll/֨ۙۡ;->ᩳ()Ll/֨ۙۡ;

    move-result-object v1

    .line 134
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 0
    :cond_0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 145
    invoke-virtual {v1}, Ll/֨ۙۡ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 146
    iget-object v2, p0, Ll/֡ۗۡ;->ܽ:Ljava/util/HashSet;

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 148
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ۗۗۡ;)V
    .locals 4

    .line 76
    invoke-static {p1}, Ll/۟᩶ۡ;->ܽ(Ll/ۗۗۡ;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const/16 v1, 0x2f

    .line 222
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 223
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 81
    :goto_0
    iget-object v2, p0, Ll/֡ۗۡ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_2

    .line 83
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "/"

    .line 84
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 0
    :cond_1
    invoke-static {v2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 85
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 113
    invoke-virtual {p1, v0}, Ll/᩶ۗۡ;->֫(Ljava/lang/Object;)V

    :cond_2
    return-void

    .line 78
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
