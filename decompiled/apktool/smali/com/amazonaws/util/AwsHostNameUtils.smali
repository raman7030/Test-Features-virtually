.class public Lcom/amazonaws/util/AwsHostNameUtils;
.super Ljava/lang/Object;
.source "AwsHostNameUtils.java"


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "^(?:.+\\.)?s3[.-]([a-z0-9-]+)$"

    .line 34
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/util/AwsHostNameUtils;->֫:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 109
    sget-object v0, Lcom/amazonaws/util/AwsHostNameUtils;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 112
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v0, 0x2e

    .line 115
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    const-string v3, "us-east-1"

    if-ne v0, v1, :cond_1

    return-object v3

    :cond_1
    add-int/2addr v0, v2

    .line 123
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "vpce"

    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v0, "\\."

    .line 125
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 126
    array-length v0, p0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    .line 128
    array-length v0, p0

    sub-int/2addr v0, v1

    aget-object v0, p0, v0

    goto :goto_0

    :cond_2
    return-object v3

    :cond_3
    :goto_0
    const-string p0, "us-gov"

    .line 137
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const-string p0, "us-gov-west-1"

    return-object p0

    :cond_4
    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_6

    .line 150
    invoke-static {}, Lcom/amazonaws/internal/config/InternalConfig$Factory;->֫()Lcom/amazonaws/internal/config/InternalConfig;

    move-result-object v0

    .line 152
    invoke-virtual {v0}, Lcom/amazonaws/internal/config/InternalConfig;->֫()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amazonaws/internal/config/HostRegexToRegionMapping;

    .line 153
    invoke-virtual {v1}, Lcom/amazonaws/internal/config/HostRegexToRegionMapping;->֫()Ljava/lang/String;

    move-result-object v2

    .line 154
    invoke-virtual {p0, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 155
    invoke-virtual {v1}, Lcom/amazonaws/internal/config/HostRegexToRegionMapping;->ۧ()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    const-string v0, ".amazonaws.com"

    .line 68
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const/16 p1, 0xe

    .line 0
    invoke-static {p1, v1, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 70
    invoke-static {p0}, Lcom/amazonaws/util/AwsHostNameUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const-string v0, ".amazonaws.com.cn"

    .line 73
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 p1, 0x11

    .line 0
    invoke-static {p1, v1, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 75
    invoke-static {p0}, Lcom/amazonaws/util/AwsHostNameUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    if-eqz p1, :cond_5

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "^(?:.+\\.)?"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    invoke-static {p1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "[.-]([a-z0-9-]+)\\."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 81
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    .line 87
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 88
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x1

    .line 89
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    const-string p0, "us-east-1"

    return-object p0

    .line 61
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "hostname cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/net/URI;)Ljava/lang/String;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 172
    invoke-virtual {p0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p0

    const-string v0, ".amazonaws.com"

    .line 175
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 183
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, ".s3"

    .line 186
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/amazonaws/util/AwsHostNameUtils;->֫:Ljava/util/regex/Pattern;

    .line 187
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x2e

    .line 196
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    return-object p0

    .line 201
    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    const-string p0, "s3"

    return-object p0

    .line 176
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot parse a service name from an unrecognized endpoint ("

    const-string v2, ")."

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 176
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
