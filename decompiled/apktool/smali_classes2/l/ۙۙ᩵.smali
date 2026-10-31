.class public final Ll/ۙۙ᩵;
.super Ljava/lang/Object;
.source "DBEE"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final ᩸:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 90
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    const-string v0, "compile(...)"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Ll/ۙۙ᩵;->᩸:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/util/regex/Pattern;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Ll/ۙۙ᩵;->᩸:Ljava/util/regex/Pattern;

    return-void
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 329
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization is supported via proxy only"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 4

    .line 327
    new-instance v0, Ll/᩶ۙ᩵;

    iget-object v1, p0, Ll/ۙۙ᩵;->᩸:Ljava/util/regex/Pattern;

    invoke-virtual {v1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v2

    const-string v3, "pattern(...)"

    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/regex/Pattern;->flags()I

    move-result v1

    invoke-direct {v0, v2, v1}, Ll/᩶ۙ᩵;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 318
    iget-object v0, p0, Ll/ۙۙ᩵;->᩸:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Ljava/util/regex/Pattern;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 180
    iget-object v0, p0, Ll/ۙۙ᩵;->᩸:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    const-string v0, "$1 $2"

    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "replaceAll(...)"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final ֫(Ljava/lang/CharSequence;)Z
    .locals 1

    const-string v0, "input"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    iget-object v0, p0, Ll/ۙۙ᩵;->᩸:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method
