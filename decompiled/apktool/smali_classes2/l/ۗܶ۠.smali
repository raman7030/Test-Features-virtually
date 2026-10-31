.class public final Ll/ۗܶ۠;
.super Ljava/lang/Object;
.source "07LO"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, ".*"

    .line 41
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۗܶ۠;->ۧ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/util/regex/Pattern;
    .locals 1

    .line 92
    invoke-static {p0}, Ll/ۗܶ۠;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, ".*"

    if-ne p0, v0, :cond_0

    .line 95
    sget-object p0, Ll/ۗܶ۠;->ۧ:Ljava/util/regex/Pattern;

    return-object p0

    .line 97
    :cond_0
    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "*"

    .line 78
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p0, ".*"

    return-object p0

    :cond_0
    const-string v1, "."

    const-string v2, "\\."

    .line 81
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 83
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".+"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
.end method
