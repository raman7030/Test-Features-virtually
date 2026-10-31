.class public final Ll/ᩳᩴ֡;
.super Ll/ۨۘ֡;
.source "F2DJ"


# instance fields
.field public final ۧ:I

.field public final ܽ:Ljava/util/HashMap;

.field public final ܿ:I

.field public final ᩳ:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 7

    .line 53
    invoke-direct {p0}, Ll/ۨۘ֡;-><init>()V

    if-eqz p1, :cond_3

    .line 57
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ᩳᩴ֡;->ܽ:Ljava/util/HashMap;

    .line 58
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ᩳᩴ֡;->ᩳ:Ljava/util/HashSet;

    .line 62
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const v1, 0x7fffffff

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 63
    iget-object v4, p0, Ll/ᩳᩴ֡;->ܽ:Ljava/util/HashMap;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    iget-object v4, p0, Ll/ᩳᩴ֡;->ᩳ:Ljava/util/HashSet;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-interface {v5, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 65
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v3, v1, :cond_1

    move v1, v3

    :cond_1
    if-le v3, v2, :cond_0

    move v2, v3

    goto :goto_0

    .line 73
    :cond_2
    iput v1, p0, Ll/ᩳᩴ֡;->ܿ:I

    .line 74
    iput v2, p0, Ll/ᩳᩴ֡;->ۧ:I

    return-void

    .line 55
    :cond_3
    new-instance p1, Ljava/security/InvalidParameterException;

    const-string v0, "lookupMap cannot be null"

    invoke-direct {p1, v0}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(Ljava/lang/CharSequence;ILjava/io/StringWriter;)I
    .locals 3

    .line 83
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    iget-object v1, p0, Ll/ᩳᩴ֡;->ᩳ:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 85
    iget v0, p0, Ll/ᩳᩴ֡;->ۧ:I

    add-int v1, p2, v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-le v1, v2, :cond_0

    .line 86
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr v0, p2

    .line 89
    :cond_0
    :goto_0
    iget v1, p0, Ll/ᩳᩴ֡;->ܿ:I

    if-lt v0, v1, :cond_2

    add-int v1, p2, v0

    .line 90
    invoke-interface {p1, p2, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    .line 91
    iget-object v2, p0, Ll/ᩳᩴ֡;->ܽ:Ljava/util/HashMap;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 94
    invoke-virtual {p3, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return v0

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
