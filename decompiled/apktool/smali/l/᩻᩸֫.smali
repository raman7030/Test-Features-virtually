.class public final Ll/᩻᩸֫;
.super Ljava/lang/Object;
.source "X72G"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩻᩸֫;->֫:Ljava/util/HashMap;

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩻᩸֫;->ۧ:Ljava/util/ArrayList;

    return-void
.end method

.method private ֫(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    iget-object v0, p0, Ll/᩻᩸֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    iget-object p1, p0, Ll/᩻᩸֫;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ֫(Ll/᩻᩸֫;J)V
    .locals 1

    const-string v0, "exo_len"

    .line 99
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Ll/᩻᩸֫;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/᩻᩸֫;Landroid/net/Uri;)V
    .locals 1

    const-string v0, "exo_redir"

    if-nez p1, :cond_0

    .line 63
    invoke-virtual {p0, v0}, Ll/᩻᩸֫;->֫(Ljava/lang/String;)V

    return-void

    .line 65
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    .line 87
    invoke-direct {p0, p1, v0}, Ll/᩻᩸֫;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/Map;
    .locals 5

    .line 134
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Ll/᩻᩸֫;->֫:Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 135
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 136
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 137
    instance-of v4, v3, [B

    if-eqz v4, :cond_0

    .line 138
    check-cast v3, [B

    .line 139
    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 142
    :cond_1
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(JLjava/lang/String;)V
    .locals 0

    .line 99
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Ll/᩻᩸֫;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 122
    iget-object v0, p0, Ll/᩻᩸֫;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    iget-object v0, p0, Ll/᩻᩸֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 87
    invoke-direct {p0, p2, p1}, Ll/᩻᩸֫;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ()Ljava/util/List;
    .locals 2

    .line 129
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩻᩸֫;->ۧ:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
