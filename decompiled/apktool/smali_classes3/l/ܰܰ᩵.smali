.class public final Ll/ܰܰ᩵;
.super Ljava/lang/Object;
.source "R4F7"


# static fields
.field public static final ܿ:Ljava/util/regex/Pattern;

.field public static final ᩳ:Ljava/util/regex/Pattern;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)"

    .line 31
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܰܰ᩵;->ܿ:Ljava/util/regex/Pattern;

    const-string v0, ";\\s*(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)|\"([^\"]*)\"))?"

    .line 32
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܰܰ᩵;->ᩳ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Ll/ܰܰ᩵;->ۧ:Ljava/lang/String;

    .line 42
    iput-object p2, p0, Ll/ܰܰ᩵;->ܽ:Ljava/lang/String;

    .line 44
    iput-object p3, p0, Ll/ܰܰ᩵;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/ܰܰ᩵;
    .locals 10

    .line 53
    sget-object v0, Ll/ܰܰ᩵;->ܿ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v1

    const/16 v2, 0x22

    if-eqz v1, :cond_8

    const/4 v1, 0x1

    .line 57
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x2

    .line 58
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 61
    sget-object v4, Ll/ܰܰ᩵;->ᩳ:Ljava/util/regex/Pattern;

    invoke-virtual {v4, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 62
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v0

    const/4 v6, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v0, v7, :cond_7

    .line 63
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v4, v0, v7}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    .line 64
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v7

    const-string v8, "\" for: \""

    if-eqz v7, :cond_6

    .line 72
    invoke-virtual {v4, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v7, "charset"

    .line 73
    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    .line 75
    :cond_0
    invoke-virtual {v4, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v7, "\'"

    .line 78
    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual {v0, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-le v7, v5, :cond_2

    .line 0
    invoke-static {v1, v1, v0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x3

    .line 83
    invoke-virtual {v4, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    :cond_2
    :goto_1
    if-eqz v6, :cond_4

    .line 85
    invoke-virtual {v0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    .line 86
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Multiple charsets defined: \""

    const-string v4, "\" and: \""

    .line 0
    invoke-static {v3, v6, v4, v0, v8}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 86
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    :goto_2
    move-object v6, v0

    .line 62
    :cond_5
    :goto_3
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->end()I

    move-result v0

    goto :goto_0

    .line 65
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Parameter is not formatted correctly: \""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 97
    :cond_7
    new-instance v0, Ll/ܰܰ᩵;

    invoke-direct {v0, p0, v3, v6}, Ll/ܰܰ᩵;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 55
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "No subtype found for: \""

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 155
    instance-of v0, p1, Ll/ܰܰ᩵;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܰܰ᩵;

    iget-object p1, p1, Ll/ܰܰ᩵;->ۧ:Ljava/lang/String;

    iget-object v0, p0, Ll/ܰܰ᩵;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 159
    iget-object v0, p0, Ll/ܰܰ᩵;->ۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 151
    iget-object v0, p0, Ll/ܰܰ᩵;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Ll/ܰܰ᩵;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;
    .locals 1

    .line 140
    :try_start_0
    iget-object v0, p0, Ll/ܰܰ᩵;->֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object p1
.end method
