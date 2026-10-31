.class public final Ll/۠᩹ۘ;
.super Ljava/lang/Object;
.source "SA89"


# static fields
.field public static final ܽ:Ljava/util/logging/Logger;


# instance fields
.field public final ֫:Ljava/net/URI;

.field public final ۧ:Ll/֨᩹ۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    const-class v0, Ll/۠᩹ۘ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/۠᩹ۘ;->ܽ:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lcom/thegrizzlylabs/sardineandroid/model/Response;)V
    .locals 4

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getHref()Ljava/lang/String;

    move-result-object v0

    .line 149
    :try_start_0
    new-instance v1, Ljava/net/URI;

    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 152
    :catch_0
    new-instance v1, Ljava/net/URI;

    const-string v2, "+"

    const-string v3, "%2B"

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v0, v2}, Ll/ۗ֨ᩴ;->decode(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, v0, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    :goto_0
    iput-object v1, p0, Ll/۠᩹ۘ;->֫:Ljava/net/URI;

    .line 167
    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getStatus()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 168
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 172
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩹֫֡;->֫(Ljava/lang/String;)Ll/᩹֫֡;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const-string v1, "Failed to parse status line: "

    .line 174
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/۠᩹ۘ;->ܽ:Ljava/util/logging/Logger;

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 156
    :cond_1
    :goto_1
    new-instance v0, Ll/֨᩹ۘ;

    invoke-direct {v0, p0, p1}, Ll/֨᩹ۘ;-><init>(Ll/۠᩹ۘ;Lcom/thegrizzlylabs/sardineandroid/model/Response;)V

    iput-object v0, p0, Ll/۠᩹ۘ;->ۧ:Ll/֨᩹ۘ;

    return-void
.end method

.method public static ֫(Ll/۠᩹ۘ;Lcom/thegrizzlylabs/sardineandroid/model/Response;)J
    .locals 3

    .line 259
    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Response;->getPropstat()Ljava/util/List;

    move-result-object p0

    .line 260
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const-wide/16 v0, -0x1

    if-eqz p1, :cond_0

    return-wide v0

    .line 263
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;

    .line 264
    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 265
    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Propstat;->getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    move-result-object p1

    invoke-virtual {p1}, Lcom/thegrizzlylabs/sardineandroid/model/Prop;->getGetcontentlength()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 268
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v2, "Failed to parse content length "

    .line 270
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v2, Ll/۠᩹ۘ;->ܽ:Ljava/util/logging/Logger;

    invoke-virtual {v2, p1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-wide v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 599
    iget-object v0, p0, Ll/۠᩹ۘ;->֫:Ljava/net/URI;

    invoke-virtual {v0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/Long;
    .locals 1

    .line 493
    iget-object v0, p0, Ll/۠᩹ۘ;->ۧ:Ll/֨᩹ۘ;

    iget-object v0, v0, Ll/֨᩹ۘ;->֫:Ljava/lang/Long;

    return-object v0
.end method

.method public final ۧ()Ljava/util/Date;
    .locals 1

    .line 479
    iget-object v0, p0, Ll/۠᩹ۘ;->ۧ:Ll/֨᩹ۘ;

    iget-object v0, v0, Ll/֨᩹ۘ;->ܽ:Ljava/util/Date;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 3

    .line 582
    iget-object v0, p0, Ll/۠᩹ۘ;->֫:Ljava/net/URI;

    invoke-virtual {v0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    const-string v1, "/"

    .line 584
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 585
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_0
    const/16 v1, 0x2f

    .line 587
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 589
    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to parse name from path "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/۠᩹ۘ;->ܽ:Ljava/util/logging/Logger;

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 2

    .line 538
    iget-object v0, p0, Ll/۠᩹ۘ;->ۧ:Ll/֨᩹ۘ;

    iget-object v0, v0, Ll/֨᩹ۘ;->ۧ:Ljava/lang/String;

    const-string v1, "httpd/unix-directory"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
