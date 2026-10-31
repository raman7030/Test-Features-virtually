.class public final Ll/ᩳۖ֡;
.super Ljava/lang/Object;
.source "X564"


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "(\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*\\.)+\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*"

    .line 49
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ᩳۖ֡;->֫:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/ۗܺ֡;)Ll/ۛܺ֡;
    .locals 8

    .line 119
    sget-object v0, Ll/ᩳۖ֡;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 121
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3

    .line 123
    :try_start_1
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛܺ֡;
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 128
    :goto_0
    :try_start_2
    new-instance v2, Ll/ۖۖ֡;

    const-string v3, "Error initializing parser"

    .line 43
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    throw v2

    :catch_2
    move-exception v2

    .line 125
    new-instance v3, Ll/ۖۖ֡;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " does not implement the interface "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v0, Ll/ۛܺ֡;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 43
    invoke-direct {v3, v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    throw v3
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_3

    :catch_3
    :cond_0
    move-object v2, v1

    :goto_1
    if-nez v2, :cond_12

    .line 135
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "UNIX_LTRIM"

    .line 136
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    .line 137
    new-instance v2, Ll/ۘۖ֡;

    invoke-direct {v2, p1, v4}, Ll/ۘۖ֡;-><init>(Ll/ۗܺ֡;Z)V

    goto/16 :goto_6

    :cond_1
    const-string v3, "UNIX"

    .line 139
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    .line 140
    new-instance v2, Ll/ۘۖ֡;

    invoke-direct {v2, p1, v5}, Ll/ۘۖ֡;-><init>(Ll/ۗܺ֡;Z)V

    goto/16 :goto_6

    :cond_2
    const-string v3, "VMS"

    .line 141
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 142
    new-instance v2, Ll/᩵ۖ֡;

    const-string p0, "(.*?;[0-9]+)\\s*(\\d+)(?:/\\d+)?\\s*(\\S+)\\s+(\\S+)\\s+\\[(([0-9$A-Za-z_]+)|([0-9$A-Za-z_]+),([0-9$a-zA-Z_]+))\\]?\\s*\\([a-zA-Z]*,([a-zA-Z]*),([a-zA-Z]*),([a-zA-Z]*)\\)"

    .line 76
    invoke-direct {v2, p0}, Ll/ܽۖ֡;-><init>(Ljava/lang/String;)V

    .line 77
    invoke-virtual {v2, v1}, Ll/ܽۖ֡;->֫(Ll/ۗܺ֡;)V

    .line 74
    invoke-virtual {v2, p1}, Ll/ܽۖ֡;->֫(Ll/ۗܺ֡;)V

    goto/16 :goto_6

    :cond_3
    const-string v3, "WINDOWS"

    .line 143
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    const/4 v7, 0x2

    if-eqz v6, :cond_7

    if-eqz p1, :cond_4

    .line 204
    invoke-virtual {p1}, Ll/ۗܺ֡;->ܽ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 205
    new-instance p0, Ll/᩷ۖ֡;

    invoke-direct {p0, p1}, Ll/᩷ۖ֡;-><init>(Ll/ۗܺ֡;)V

    :goto_2
    move-object v2, p0

    goto/16 :goto_6

    :cond_4
    if-eqz p1, :cond_5

    .line 208
    new-instance v1, Ll/ۗܺ֡;

    invoke-direct {v1, p1}, Ll/ۗܺ֡;-><init>(Ll/ۗܺ֡;)V

    .line 209
    :cond_5
    new-instance p0, Ll/ۧۖ֡;

    new-instance v0, Ll/᩷ۖ֡;

    invoke-direct {v0, p1}, Ll/᩷ۖ֡;-><init>(Ll/ۗܺ֡;)V

    new-instance v3, Ll/ۘۖ֡;

    if-eqz v1, :cond_6

    .line 210
    invoke-virtual {v1}, Ll/ۗܺ֡;->ܽ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, 0x1

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    :goto_3
    invoke-direct {v3, v1, v2}, Ll/ۘۖ֡;-><init>(Ll/ۗܺ֡;Z)V

    new-array v1, v7, [Ll/ۛܺ֡;

    aput-object v0, v1, v5

    aput-object v3, v1, v4

    invoke-direct {p0, v1}, Ll/ۧۖ֡;-><init>([Ll/ۛܺ֡;)V

    goto :goto_2

    :cond_7
    const-string v3, "OS/2"

    .line 145
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 146
    new-instance v2, Ll/ۡۖ֡;

    const-string p0, "\\s*([0-9]+)\\s*(\\s+|[A-Z]+)\\s*(DIR|\\s+)\\s*(\\S+)\\s+(\\S+)\\s+(\\S.*)"

    .line 60
    invoke-direct {v2, p0}, Ll/ܽۖ֡;-><init>(Ljava/lang/String;)V

    .line 61
    invoke-virtual {v2, p1}, Ll/ܽۖ֡;->֫(Ll/ۗܺ֡;)V

    goto/16 :goto_6

    :cond_8
    const-string v3, "OS/400"

    .line 147
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_e

    const-string v6, "AS/400"

    invoke-virtual {v0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_9

    goto :goto_4

    :cond_9
    const-string v1, "MVS"

    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 150
    new-instance v2, Ll/᩻ۖ֡;

    invoke-direct {v2}, Ll/᩻ۖ֡;-><init>()V

    goto/16 :goto_6

    :cond_a
    const-string v1, "NETWARE"

    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 152
    new-instance v2, Ll/ۢۖ֡;

    const-string p0, "(d|-){1}\\s+\\[([-A-Z]+)\\]\\s+(\\S+)\\s+(\\d+)\\s+(\\S+\\s+\\S+\\s+((\\d+:\\d+)|(\\d{4})))\\s+(.*)"

    .line 75
    invoke-direct {v2, p0}, Ll/ܽۖ֡;-><init>(Ljava/lang/String;)V

    .line 76
    invoke-virtual {v2, p1}, Ll/ܽۖ֡;->֫(Ll/ۗܺ֡;)V

    goto :goto_6

    :cond_b
    const-string v1, "MACOS PETER"

    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 154
    new-instance v2, Ll/ۜۖ֡;

    const-string p0, "([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s+((folder\\s+)|((\\d+)\\s+(\\d+)\\s+))(\\d+)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3}))\\s+(\\d+(?::\\d+)?)\\s+(\\S*)(\\s*.*)"

    .line 80
    invoke-direct {v2, p0}, Ll/ܽۖ֡;-><init>(Ljava/lang/String;)V

    .line 81
    invoke-virtual {v2, p1}, Ll/ܽۖ֡;->֫(Ll/ۗܺ֡;)V

    goto :goto_6

    :cond_c
    const-string v1, "TYPE: L8"

    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 158
    new-instance v2, Ll/ۘۖ֡;

    .line 136
    invoke-direct {v2, p1, v5}, Ll/ۘۖ֡;-><init>(Ll/ۗܺ֡;Z)V

    goto :goto_6

    .line 160
    :cond_d
    new-instance p1, Ll/ۖۖ֡;

    const-string v0, "Unknown parser type: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 33
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 160
    throw p1

    :cond_e
    :goto_4
    if-eqz p1, :cond_f

    .line 239
    invoke-virtual {p1}, Ll/ۗܺ֡;->ܽ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_f

    .line 240
    new-instance p0, Ll/ܺۖ֡;

    invoke-direct {p0, p1}, Ll/ܺۖ֡;-><init>(Ll/ۗܺ֡;)V

    goto/16 :goto_2

    :cond_f
    if-eqz p1, :cond_10

    .line 243
    new-instance v1, Ll/ۗܺ֡;

    invoke-direct {v1, p1}, Ll/ۗܺ֡;-><init>(Ll/ۗܺ֡;)V

    .line 244
    :cond_10
    new-instance p0, Ll/ۧۖ֡;

    new-instance v0, Ll/ܺۖ֡;

    invoke-direct {v0, p1}, Ll/ܺۖ֡;-><init>(Ll/ۗܺ֡;)V

    new-instance v3, Ll/ۘۖ֡;

    if-eqz v1, :cond_11

    .line 245
    invoke-virtual {v1}, Ll/ۗܺ֡;->ܽ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    const/4 v2, 0x1

    goto :goto_5

    :cond_11
    const/4 v2, 0x0

    :goto_5
    invoke-direct {v3, v1, v2}, Ll/ۘۖ֡;-><init>(Ll/ۗܺ֡;Z)V

    new-array v1, v7, [Ll/ۛܺ֡;

    aput-object v0, v1, v5

    aput-object v3, v1, v4

    invoke-direct {p0, v1}, Ll/ۧۖ֡;-><init>([Ll/ۛܺ֡;)V

    goto/16 :goto_2

    .line 163
    :cond_12
    :goto_6
    instance-of p0, v2, Ll/֨ܺ֡;

    if-eqz p0, :cond_13

    .line 164
    move-object p0, v2

    check-cast p0, Ll/֨ܺ֡;

    invoke-interface {p0, p1}, Ll/֨ܺ֡;->֫(Ll/ۗܺ֡;)V

    :cond_13
    return-object v2
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ۛܺ֡;
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 112
    invoke-static {p1, v0}, Ll/ᩳۖ֡;->֫(Ljava/lang/String;Ll/ۗܺ֡;)Ll/ۛܺ֡;

    move-result-object p1

    return-object p1

    .line 110
    :cond_0
    new-instance p1, Ll/ۖۖ֡;

    const-string v0, "Parser key cannot be null"

    .line 33
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 110
    throw p1
.end method

.method public final ֫(Ll/ۗܺ֡;)Ll/ۛܺ֡;
    .locals 1

    .line 74
    invoke-virtual {p1}, Ll/ۗܺ֡;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ᩳۖ֡;->֫(Ljava/lang/String;Ll/ۗܺ֡;)Ll/ۛܺ֡;

    move-result-object p1

    return-object p1
.end method
