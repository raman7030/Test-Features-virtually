.class public final Ll/֨֫֡;
.super Ljava/lang/Object;
.source "64F5"


# static fields
.field public static final synthetic ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "\"\\"

    .line 44
    invoke-static {v0}, Ll/ۨܽ֡;->ܿ(Ljava/lang/String;)Ll/ۨܽ֡;

    const-string v0, "\t ,="

    .line 45
    invoke-static {v0}, Ll/ۨܽ֡;->ܿ(Ljava/lang/String;)Ll/ۨܽ֡;

    return-void
.end method

.method public static ֫(ILjava/lang/String;)I
    .locals 3

    .line 378
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p0, v0

    if-lez v2, :cond_0

    const p0, 0x7fffffff

    return p0

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gez v2, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    long-to-int p1, p0

    return p1

    :catch_0
    return p0
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 350
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p0, v0, :cond_1

    .line 351
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return p0
.end method

.method public static ֫(Ll/ᩴ۟᩵;)J
    .locals 2

    .line 51
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->᩻()Ll/ۤܰ᩵;

    move-result-object p0

    const-string v0, "Content-Length"

    .line 55
    invoke-virtual {p0, v0}, Ll/ۤܰ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-wide/16 v0, -0x1

    if-nez p0, :cond_0

    return-wide v0

    .line 61
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-wide v0
.end method

.method public static ֫(Ll/ۤܰ᩵;)Ljava/util/Set;
    .locals 7

    .line 101
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 102
    invoke-virtual {p0}, Ll/ۤܰ᩵;->ۧ()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    const-string v3, "Vary"

    .line 103
    invoke-virtual {p0, v2}, Ll/ۤܰ᩵;->֫(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    .line 105
    :cond_0
    invoke-virtual {p0, v2}, Ll/ۤܰ᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    .line 106
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 107
    new-instance v0, Ljava/util/TreeSet;

    sget-object v4, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v0, v4}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    :cond_1
    const-string v4, ","

    .line 109
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    .line 110
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static ۧ(Ll/ᩴ۟᩵;)Z
    .locals 5

    .line 324
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡ۟᩵;->ܿ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HEAD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 328
    :cond_0
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    const/16 v1, 0x64

    if-lt v0, v1, :cond_1

    const/16 v1, 0xc8

    if-lt v0, v1, :cond_2

    :cond_1
    const/16 v1, 0xcc

    if-eq v0, v1, :cond_2

    const/16 v1, 0x130

    if-eq v0, v1, :cond_2

    goto :goto_1

    .line 337
    :cond_2
    invoke-static {p0}, Ll/֨֫֡;->֫(Ll/ᩴ۟᩵;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_4

    const-string v0, "Transfer-Encoding"

    .line 338
    invoke-virtual {p0, v0}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "chunked"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_4
    :goto_1
    const/4 p0, 0x1

    return p0
.end method
