.class public final Ll/۫֡֡;
.super Ljava/lang/Object;
.source "N8XS"


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;

.field public static final ۧ:Ljava/util/regex/Pattern;

.field public static final ܽ:Ll/ᩴۘܿ;

.field public static final ᩳ:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "[\\\\&]"

    .line 14
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/۫֡֡;->֫:Ljava/util/regex/Pattern;

    const-string v0, "\\\\[!\"#$%&\'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});"

    const/4 v1, 0x2

    .line 17
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/۫֡֡;->ۧ:Ljava/util/regex/Pattern;

    const-string v0, "(%[a-fA-F0-9]{0,2}|[^:/?#@!$&\'()*+,;=a-zA-Z0-9\\-._~])"

    .line 22
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    const-string v0, "[ \t\r\n]+"

    .line 29
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/۫֡֡;->ᩳ:Ljava/util/regex/Pattern;

    .line 31
    new-instance v0, Ll/ᩴۘܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۫֡֡;->ܽ:Ll/ᩴۘܿ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 65
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_6

    .line 66
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x22

    if-eq v3, v4, :cond_3

    const/16 v4, 0x26

    if-eq v3, v4, :cond_2

    const/16 v4, 0x3c

    if-eq v3, v4, :cond_1

    const/16 v4, 0x3e

    if-eq v3, v4, :cond_0

    if-eqz v0, :cond_5

    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_0
    const-string v3, "&gt;"

    goto :goto_1

    :cond_1
    const-string v3, "&lt;"

    goto :goto_1

    :cond_2
    const-string v3, "&amp;"

    goto :goto_1

    :cond_3
    const-string v3, "&quot;"

    :goto_1
    if-nez v0, :cond_4

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    invoke-virtual {v0, p0, v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 91
    :cond_4
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    if-eqz v0, :cond_7

    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_7
    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 111
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 118
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    .line 120
    sget-object v0, Ll/۫֡֡;->ᩳ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    const-string v0, " "

    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 99
    sget-object v0, Ll/۫֡֡;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 124
    sget-object v0, Ll/۫֡֡;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 126
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 130
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x10

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    .line 133
    :cond_1
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v3

    invoke-virtual {v1, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 134
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ll/۫֡֡;->ܽ:Ll/ᩴۘܿ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x5c

    if-ne v3, v4, :cond_2

    const/4 v3, 0x1

    .line 34
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1, v2, v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 36
    :cond_2
    invoke-static {v2}, Ll/ۤ֡֡;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v2

    .line 136
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-nez v3, :cond_1

    .line 138
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v2, v0, :cond_3

    .line 139
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1, p0, v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 141
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_4
    :goto_1
    return-object p0
.end method
