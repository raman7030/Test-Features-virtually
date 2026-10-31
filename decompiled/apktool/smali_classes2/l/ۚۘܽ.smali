.class public final Ll/ۚۘܽ;
.super Ljava/util/ArrayList;
.source "LAO9"


# static fields
.field public static final synthetic ᩸:I

.field public static ᩹:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "\\s*"

    .line 14
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۚۘܽ;->᩹:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(Ll/۟ۖܽ;Z)Ll/ۚۘܽ;
    .locals 9

    .line 27
    new-instance v0, Ll/ۚۘܽ;

    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    new-instance v2, Ljava/util/Stack;

    invoke-direct {v2}, Ljava/util/Stack;-><init>()V

    .line 29
    sget-object v3, Ll/ۚۘܽ;->᩹:Ljava/util/regex/Pattern;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 31
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ll/۟ۖܽ;->ۖ()I

    move-result v4

    if-eq v4, v1, :cond_8

    const/4 v5, 0x2

    if-eq v4, v5, :cond_5

    const/4 v5, 0x3

    if-eq v4, v5, :cond_4

    const/4 v5, 0x4

    if-eq v4, v5, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 49
    invoke-virtual {p0}, Ll/۟ۖܽ;->ܺ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    .line 52
    :cond_2
    new-instance v4, Ll/֨ۘܽ;

    invoke-direct {v4}, Ll/֨ۘܽ;-><init>()V

    .line 25
    invoke-virtual {p0}, Ll/۟ۖܽ;->ܺ()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    .line 26
    invoke-virtual {p0}, Ll/۟ۖܽ;->᩷()I

    move-result v5

    iput v5, v4, Ll/ۡۘܽ;->ܽ:I

    .line 27
    invoke-virtual {p0}, Ll/۟ۖܽ;->ۜ()I

    move-result v5

    iput v5, v4, Ll/ۡۘܽ;->֫:I

    .line 28
    invoke-virtual {p0}, Ll/۟ۖܽ;->ۢ()I

    move-result v5

    iput v5, v4, Ll/ۡۘܽ;->ᩳ:I

    .line 29
    invoke-virtual {p0}, Ll/۟ۖܽ;->ᩳ()I

    move-result v5

    iput v5, v4, Ll/ۡۘܽ;->ۧ:I

    .line 54
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_3

    .line 57
    invoke-virtual {v2}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩵ۘܽ;

    iget-object v5, v5, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 55
    :cond_3
    new-instance p1, Ll/֫ۘܽ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected text: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    iget-object v1, v4, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/۟ۖܽ;)V

    throw p1

    .line 46
    :cond_4
    invoke-virtual {v2}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩵ۘܽ;

    invoke-virtual {p0}, Ll/۟ۖܽ;->ᩳ()I

    move-result v5

    iput v5, v4, Ll/ۡۘܽ;->ۧ:I

    goto/16 :goto_0

    .line 35
    :cond_5
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 36
    new-instance v4, Ll/᩵ۘܽ;

    invoke-direct {v4}, Ll/᩵ۘܽ;-><init>()V

    .line 37
    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 39
    :cond_6
    new-instance v4, Ll/᩵ۘܽ;

    invoke-direct {v4}, Ll/᩵ۘܽ;-><init>()V

    .line 40
    invoke-virtual {v2}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩵ۘܽ;

    iget-object v5, v5, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    :goto_1
    invoke-virtual {v2, v4}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    invoke-virtual {p0}, Ll/۟ۖܽ;->ۢ()I

    move-result v5

    iput v5, v4, Ll/ۡۘܽ;->ᩳ:I

    .line 193
    invoke-virtual {p0}, Ll/۟ۖܽ;->ᩳ()I

    move-result v5

    iput v5, v4, Ll/ۡۘܽ;->ۧ:I

    .line 194
    invoke-virtual {p0}, Ll/۟ۖܽ;->ܳ()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Ll/᩵ۘܽ;->᩻:Ljava/lang/String;

    .line 195
    invoke-virtual {p0}, Ll/۟ۖܽ;->᩷()I

    move-result v5

    iput v5, v4, Ll/ۡۘܽ;->ܽ:I

    .line 196
    invoke-virtual {p0}, Ll/۟ۖܽ;->ۜ()I

    move-result v5

    iput v5, v4, Ll/ۡۘܽ;->֫:I

    .line 197
    invoke-virtual {p0}, Ll/۟ۖܽ;->֫()I

    move-result v5

    iget-object v4, v4, Ll/᩵ۘܽ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->ensureCapacity(I)V

    const/4 v5, 0x0

    .line 198
    :goto_2
    invoke-virtual {p0}, Ll/۟ۖܽ;->֫()I

    move-result v6

    if-ge v5, v6, :cond_0

    const-string v6, "xmlns"

    .line 199
    invoke-virtual {p0, v5}, Ll/۟ۖܽ;->ᩳ(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    .line 200
    new-instance v6, Ll/ᩴۘܽ;

    invoke-direct {v6}, Ll/ᩴۘܽ;-><init>()V

    .line 201
    invoke-virtual {p0, v5}, Ll/۟ۖܽ;->֫(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Ll/ᩴۘܽ;->֫:Ljava/lang/String;

    .line 202
    invoke-virtual {p0, v5}, Ll/۟ۖܽ;->ܿ(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Ll/ᩴۘܽ;->ܳ:Ljava/lang/String;

    .line 204
    invoke-virtual {p0, v5}, Ll/۟ۖܽ;->ۧ(I)Ll/ܽۘܽ;

    move-result-object v7

    .line 205
    invoke-virtual {v7}, Ll/ܽۘܽ;->ᩳ()I

    move-result v8

    iput v8, v6, Ll/ᩴۘܽ;->ᩳ:I

    .line 206
    invoke-virtual {v7}, Ll/ܽۘܽ;->֫()I

    move-result v8

    iput v8, v6, Ll/ᩴۘܽ;->ۧ:I

    .line 207
    invoke-virtual {v7}, Ll/ܽۘܽ;->ܿ()I

    move-result v8

    iput v8, v6, Ll/ᩴۘܽ;->ܿ:I

    .line 208
    invoke-virtual {v7}, Ll/ܽۘܽ;->ܽ()I

    move-result v7

    iput v7, v6, Ll/ᩴۘܽ;->ܽ:I

    .line 210
    invoke-virtual {p0, v5}, Ll/۟ۖܽ;->ܳ(I)Ll/ܽۘܽ;

    move-result-object v7

    .line 211
    invoke-virtual {v7}, Ll/ܽۘܽ;->ᩳ()I

    move-result v8

    iput v8, v6, Ll/ᩴۘܽ;->᩷:I

    .line 212
    invoke-virtual {v7}, Ll/ܽۘܽ;->֫()I

    move-result v8

    iput v8, v6, Ll/ᩴۘܽ;->᩻:I

    .line 213
    invoke-virtual {v7}, Ll/ܽۘܽ;->ܿ()I

    move-result v8

    iput v8, v6, Ll/ᩴۘܽ;->ۢ:I

    .line 214
    invoke-virtual {v7}, Ll/ܽۘܽ;->ܽ()I

    move-result v7

    iput v7, v6, Ll/ᩴۘܽ;->ۜ:I

    .line 216
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_8
    return-object v0
.end method
