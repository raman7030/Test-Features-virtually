.class public final Ll/۟᩵ۧ;
.super Ljava/lang/Object;
.source "S8SM"


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "^NOTE([ \t].*)?$"

    .line 30
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/۟᩵ۧ;->֫:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)F
    .locals 2

    const-string v0, "%"

    .line 94
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p0, v0

    return p0

    .line 95
    :cond_0
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string v0, "Percentages must end with %"

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ᩳ֨֫;)Ljava/util/regex/Matcher;
    .locals 2

    .line 588
    :cond_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 112
    sget-object v1, Ll/۟᩵ۧ;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 588
    :goto_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 114
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 116
    :cond_1
    sget-object v1, Ll/᩺᩵ۧ;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 117
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)J
    .locals 9

    .line 69
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-string v0, "\\."

    const/4 v1, 0x2

    .line 1105
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    .line 70
    aget-object v2, p0, v0

    const-string v3, ":"

    const/4 v4, -0x1

    .line 1090
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    .line 71
    array-length v3, v2

    const-wide/16 v4, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v6, v2, v0

    const-wide/16 v7, 0x3c

    mul-long v4, v4, v7

    .line 72
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    add-long/2addr v4, v6

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x3e8

    mul-long v4, v4, v2

    .line 75
    array-length v0, p0

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    .line 76
    aget-object p0, p0, v0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 77
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 78
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    add-long/2addr v4, v0

    goto :goto_1

    .line 80
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Expected 3 decimal places, got: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    mul-long v4, v4, v2

    return-wide v4
.end method

.method public static ۧ(Ll/ᩳ֨֫;)Z
    .locals 1

    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "WEBVTT"

    .line 57
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܽ(Ll/ᩳ֨֫;)V
    .locals 2

    .line 42
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v0

    .line 43
    invoke-static {p0}, Ll/۟᩵ۧ;->ۧ(Ll/ᩳ֨֫;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 44
    :cond_0
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Expected WEBVTT. Got "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 588
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    .line 45
    invoke-static {p0, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p0

    throw p0
.end method
