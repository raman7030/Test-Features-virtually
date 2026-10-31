.class public final Ll/ᩳ֫ᩳ;
.super Ljava/lang/Object;
.source "R9RN"


# instance fields
.field public ֫:Ljava/util/HashMap;

.field public ۧ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/᩺᩻ܽ;)V
    .locals 9

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-virtual {p1}, Ll/ۡᩳܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ᩻ܽ;

    .line 30
    invoke-interface {v1}, Ll/ۘ᩻ܽ;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "bin.mt.plus.TranslationData"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_8

    const-string p1, "a"

    .line 35
    invoke-interface {v0, p1}, Ll/ۘ᩻ܽ;->getType(Ljava/lang/String;)Ll/֡᩻ܽ;

    move-result-object p1

    const-string v1, "b"

    .line 36
    invoke-interface {v0, v1}, Ll/ۘ᩻ܽ;->getType(Ljava/lang/String;)Ll/֡᩻ܽ;

    move-result-object v1

    const-string v2, "c"

    .line 37
    invoke-interface {v0, v2}, Ll/ۘ᩻ܽ;->getType(Ljava/lang/String;)Ll/֡᩻ܽ;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    .line 39
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ᩳ֫ᩳ;->֫:Ljava/util/HashMap;

    .line 40
    invoke-interface {v0}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜ᩻ܽ;

    .line 41
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 42
    iget-object v3, p0, Ll/ᩳ֫ᩳ;->֫:Ljava/util/HashMap;

    invoke-interface {v0}, Ll/ۜ᩻ܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸ܽܽ;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x0

    .line 43
    :goto_1
    invoke-interface {v0}, Ll/ۜ᩻ܽ;->֨()I

    move-result v4

    if-gt v3, v4, :cond_2

    .line 44
    invoke-interface {v0, v3}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 46
    :try_start_0
    invoke-interface {v0, v3}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v4

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    new-instance v5, Ll/ۧ֫ᩳ;

    invoke-interface {v4}, Ll/᩷᩻ܽ;->getParent()I

    move-result v6

    invoke-interface {v4}, Ll/᩷᩻ܽ;->getValue()Ll/֨᩻ܽ;

    move-result-object v7

    invoke-interface {v7}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v7

    invoke-direct {v5, v6, v7}, Ll/ۧ֫ᩳ;-><init>(II)V

    .line 48
    new-instance v6, Ll/ܽ֫ᩳ;

    .line 49
    invoke-interface {v4, v2}, Ll/᩷᩻ܽ;->getValue(I)Ll/֨᩻ܽ;

    move-result-object v7

    invoke-interface {v7}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v7

    const/4 v8, 0x1

    .line 50
    invoke-interface {v4, v8}, Ll/᩷᩻ܽ;->getValue(I)Ll/֨᩻ܽ;

    move-result-object v4

    invoke-interface {v4}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v4

    invoke-direct {v6, v7, v4}, Ll/ܽ֫ᩳ;-><init>(Ll/ۗ᩻ܽ;Ll/ۗ᩻ܽ;)V

    .line 52
    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    if-eqz p1, :cond_8

    if-eqz v1, :cond_8

    .line 59
    invoke-interface {p1}, Ll/֡᩻ܽ;->ۜ֫()I

    move-result v0

    invoke-interface {v1}, Ll/֡᩻ܽ;->ۜ֫()I

    move-result v2

    if-ne v0, v2, :cond_8

    .line 60
    invoke-interface {p1}, Ll/֡᩻ܽ;->᩷()I

    move-result v0

    invoke-interface {v1}, Ll/֡᩻ܽ;->᩷()I

    move-result v2

    if-ne v0, v2, :cond_8

    .line 61
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ᩳ֫ᩳ;->ۧ:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 62
    :goto_2
    invoke-interface {p1}, Ll/֡᩻ܽ;->ۜ֫()I

    move-result v2

    if-ge v0, v2, :cond_8

    .line 63
    invoke-interface {p1, v0}, Ll/֡᩻ܽ;->ܿ(I)Ll/ۜ᩻ܽ;

    move-result-object v2

    .line 64
    invoke-interface {v1, v0}, Ll/֡᩻ܽ;->ܿ(I)Ll/ۜ᩻ܽ;

    move-result-object v3

    .line 65
    invoke-interface {v2}, Ll/ۜ᩻ܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸ܽܽ;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3}, Ll/ۜ᩻ܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩸ܽܽ;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_4

    .line 68
    :cond_5
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 69
    iget-object v5, p0, Ll/ᩳ֫ᩳ;->ۧ:Ljava/util/HashMap;

    invoke-interface {v2}, Ll/ۜ᩻ܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v6

    invoke-virtual {v6}, Ll/᩸ܽܽ;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x0

    .line 70
    :goto_3
    invoke-interface {v2}, Ll/ۜ᩻ܽ;->֨()I

    move-result v6

    if-gt v5, v6, :cond_7

    .line 71
    invoke-interface {v2, v5}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v3, v5}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 74
    :try_start_1
    invoke-interface {v2, v5}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v6

    invoke-interface {v6}, Ll/᩷᩻ܽ;->getValue()Ll/֨᩻ܽ;

    move-result-object v6

    invoke-interface {v6}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v6

    .line 76
    invoke-interface {v3, v5}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v7

    invoke-interface {v7}, Ll/᩷᩻ܽ;->getValue()Ll/֨᩻ܽ;

    move-result-object v7

    invoke-interface {v7}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v7

    .line 77
    invoke-virtual {v4, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_8
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/֫֫ᩳ;
    .locals 2

    .line 180
    new-instance v0, Ll/֫֫ᩳ;

    .line 189
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 190
    iput-object v1, v0, Ll/֫֫ᩳ;->֫:Ljava/util/Map;

    .line 191
    iput-object v1, v0, Ll/֫֫ᩳ;->ۧ:Ljava/util/Map;

    .line 181
    iget-object v1, p0, Ll/ᩳ֫ᩳ;->֫:Ljava/util/HashMap;

    if-eqz v1, :cond_0

    .line 182
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    iput-object p1, v0, Ll/֫֫ᩳ;->֫:Ljava/util/Map;

    return-object v0

    .line 183
    :cond_0
    iget-object v1, p0, Ll/ᩳ֫ᩳ;->ۧ:Ljava/util/HashMap;

    if-eqz v1, :cond_1

    .line 184
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    iput-object p1, v0, Ll/֫֫ᩳ;->ۧ:Ljava/util/Map;

    :cond_1
    return-object v0
.end method
