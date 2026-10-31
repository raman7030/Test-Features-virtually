.class public final Ll/᩵ۖ֡;
.super Ll/ᩴۖ֡;
.source "Q5JO"


# static fields
.field public static final ܿ:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "(.*?);([0-9]{1,20})\\s{0,80}.{0,80}"

    .line 53
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩵ۖ֡;->ܿ:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/LinkedList;)Ljava/util/List;
    .locals 7

    .line 91
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 92
    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v1

    .line 93
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x1

    sget-object v5, Ll/᩵ۖ֡;->ܿ:Ljava/util/regex/Pattern;

    if-eqz v2, :cond_2

    .line 94
    invoke-interface {v1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 96
    invoke-virtual {v5, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 97
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 98
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->toMatchResult()Ljava/util/regex/MatchResult;

    move-result-object v2

    .line 99
    invoke-interface {v2, v4}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    move-result-object v4

    .line 100
    invoke-interface {v2, v3}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 101
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    .line 102
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_1

    .line 103
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ge v5, v3, :cond_1

    .line 104
    invoke-interface {v1}, Ljava/util/ListIterator;->remove()V

    goto :goto_0

    .line 107
    :cond_1
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 115
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 116
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 118
    invoke-virtual {v5, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 119
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 120
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->toMatchResult()Ljava/util/regex/MatchResult;

    move-result-object v2

    .line 121
    invoke-interface {v2, v4}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    move-result-object v6

    .line 122
    invoke-interface {v2, v3}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 123
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 124
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    if-eqz v6, :cond_2

    .line 125
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ge v2, v6, :cond_2

    .line 126
    invoke-interface {v1}, Ljava/util/ListIterator;->remove()V

    goto :goto_1

    :cond_3
    return-object p1
.end method
