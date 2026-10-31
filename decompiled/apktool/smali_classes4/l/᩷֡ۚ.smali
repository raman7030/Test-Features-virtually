.class public final Ll/᩷֡ۚ;
.super Ljava/lang/Object;
.source "IC6V"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/util/regex/Pattern;

.field public static final ܳ:Ljava/util/regex/Pattern;

.field public static final ܽ:Ljava/util/regex/Pattern;

.field public static final ܿ:Ljava/lang/ThreadLocal;

.field public static final ᩳ:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 21

    const-string v19, "                   "

    const-string v20, "                    "

    const-string v0, ""

    const-string v1, " "

    const-string v2, "  "

    const-string v3, "   "

    const-string v4, "    "

    const-string v5, "     "

    const-string v6, "      "

    const-string v7, "       "

    const-string v8, "        "

    const-string v9, "         "

    const-string v10, "          "

    const-string v11, "           "

    const-string v12, "            "

    const-string v13, "             "

    const-string v14, "              "

    const-string v15, "               "

    const-string v16, "                "

    const-string v17, "                 "

    const-string v18, "                  "

    .line 20
    filled-new-array/range {v0 .. v20}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩷֡ۚ;->ᩳ:[Ljava/lang/String;

    const-string v0, "^/((\\.{1,2}/)+)"

    .line 284
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩷֡ۚ;->ܽ:Ljava/util/regex/Pattern;

    const-string v0, "^[a-zA-Z][a-zA-Z0-9+-.]*:"

    .line 331
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩷֡ۚ;->ܳ:Ljava/util/regex/Pattern;

    const-string v0, "[\\x00-\\x1f]*"

    .line 333
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩷֡ۚ;->ۧ:Ljava/util/regex/Pattern;

    .line 338
    new-instance v0, Ll/ۜ֡ۚ;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/᩷֡ۚ;->ܿ:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public static ֫(II)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_5

    const/4 v2, -0x1

    if-lt p1, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 134
    :goto_1
    invoke-static {v1}, Ll/ܿ֡ۚ;->֫(Z)V

    if-eq p1, v2, :cond_2

    .line 136
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    :cond_2
    const/16 p1, 0x15

    if-ge p0, p1, :cond_3

    .line 138
    sget-object p1, Ll/᩷֡ۚ;->ᩳ:[Ljava/lang/String;

    aget-object p0, p1, p0

    return-object p0

    .line 139
    :cond_3
    new-array p1, p0, [C

    :goto_2
    if-ge v0, p0, :cond_4

    const/16 v1, 0x20

    .line 141
    aput-char v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 142
    :cond_4
    invoke-static {p1}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 91
    :cond_5
    new-instance p0, Ll/ܳ֡ۚ;

    const-string p1, "width must be >= 0"

    .line 14
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 335
    sget-object v0, Ll/᩷֡ۚ;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    const-string v1, ""

    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 318
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 324
    :try_start_1
    invoke-static {v0, p1}, Ll/᩷֡ۚ;->֫(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object p0

    invoke-virtual {p0}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 321
    :catch_0
    new-instance p0, Ljava/net/URL;

    invoke-direct {p0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 322
    invoke-virtual {p0}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    .line 328
    :catch_1
    sget-object p0, Ll/᩷֡ۚ;->ܳ:Ljava/util/regex/Pattern;

    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p0

    if-eqz p0, :cond_0

    move-object v1, p1

    :cond_0
    return-object v1
.end method

.method public static ֫(Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 3

    .line 366
    invoke-static {p0}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 367
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 369
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/16 v2, 0x2000

    if-le v1, v2, :cond_0

    .line 370
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 372
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 374
    :goto_0
    sget-object v1, Ll/᩷֡ۚ;->ܿ:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Stack;

    .line 375
    invoke-virtual {v1, p0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    :goto_1
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result p0

    const/16 v2, 0x8

    if-le p0, v2, :cond_1

    .line 378
    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public static ֫(Ljava/util/AbstractCollection;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 31
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p0, ""

    return-object p0

    .line 44
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    .line 71
    :cond_1
    invoke-static {}, Ll/᩷֡ۚ;->֫()Ljava/lang/StringBuilder;

    move-result-object v1

    .line 89
    invoke-static {v1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 92
    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 51
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 91
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 110
    :cond_2
    invoke-static {v1}, Ll/᩷֡ۚ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫()Ljava/lang/StringBuilder;
    .locals 2

    .line 353
    sget-object v0, Ll/᩷֡ۚ;->ܿ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Stack;

    .line 354
    invoke-virtual {v0}, Ljava/util/Stack;->empty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 355
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x2000

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    return-object v0

    .line 356
    :cond_0
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public static ֫(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;
    .locals 3

    .line 335
    sget-object v0, Ll/᩷֡ۚ;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "?"

    .line 295
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 296
    invoke-virtual {p0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 0
    invoke-static {v0, p1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 298
    :cond_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0, p1}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 299
    sget-object p0, Ll/᩷֡ۚ;->ܽ:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Ljava/net/URL;->getFile()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    const-string p1, "/"

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 300
    invoke-virtual {v0}, Ljava/net/URL;->getRef()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 301
    invoke-virtual {v0}, Ljava/net/URL;->getRef()Ljava/lang/String;

    move-result-object p1

    const-string v1, "#"

    .line 0
    invoke-static {p0, v1, p1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 303
    :cond_1
    new-instance p1, Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/net/URL;->getPort()I

    move-result v0

    invoke-direct {p1, v1, v2, v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    return-object p1
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/StringBuilder;Z)V
    .locals 7

    .line 237
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v1, v0, :cond_6

    .line 240
    invoke-virtual {p0, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v4

    const/16 v5, 0x20

    if-eq v4, v5, :cond_2

    const/16 v6, 0x9

    if-eq v4, v6, :cond_2

    const/16 v6, 0xa

    if-eq v4, v6, :cond_2

    const/16 v6, 0xc

    if-eq v4, v6, :cond_2

    const/16 v6, 0xd

    if-eq v4, v6, :cond_2

    const/16 v6, 0xa0

    if-ne v4, v6, :cond_0

    goto :goto_1

    :cond_0
    const/16 v5, 0x200b

    if-eq v4, v5, :cond_5

    const/16 v5, 0xad

    if-ne v4, v5, :cond_1

    goto :goto_2

    .line 248
    :cond_1
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    if-eqz p2, :cond_3

    if-eqz v2, :cond_5

    :cond_3
    if-eqz v3, :cond_4

    goto :goto_2

    .line 244
    :cond_4
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    .line 239
    :cond_5
    :goto_2
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    move-result v4

    add-int/2addr v1, v4

    goto :goto_0

    :cond_6
    return-void
.end method

.method public static ֫(I)Z
    .locals 1

    const/16 v0, 0x20

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/16 v0, 0xc

    if-eq p0, v0, :cond_1

    const/16 v0, 0xd

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x1

    if-eqz p0, :cond_2

    .line 151
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 154
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    .line 156
    invoke-virtual {p0, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v4

    invoke-static {v4}, Ll/᩷֡ۚ;->֫(I)Z

    move-result v4

    if-nez v4, :cond_1

    return v2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v0
.end method

.method public static ֫(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 0

    .line 265
    invoke-static {p1, p0}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
