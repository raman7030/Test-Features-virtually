.class public final Ll/᩵ᩴ᩻;
.super Ljava/lang/Object;
.source "KAG4"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۜ:I

.field public final ۢ:I

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Z

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:I

.field public final ᩷:Ljava/lang/String;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILl/ܳᩴ᩻;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput p1, p0, Ll/᩵ᩴ᩻;->ۢ:I

    .line 35
    iget-object p1, p2, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/᩵ᩴ᩻;->ۧ:Ljava/lang/String;

    .line 36
    iget p1, p2, Ll/ܳᩴ᩻;->᩷֫:I

    iput p1, p0, Ll/᩵ᩴ᩻;->ۜ:I

    .line 37
    iget-object p1, p2, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/᩵ᩴ᩻;->᩷:Ljava/lang/String;

    .line 38
    iget-boolean p1, p2, Ll/ܳᩴ᩻;->᩻֫:Z

    iput-boolean p1, p0, Ll/᩵ᩴ᩻;->ܳ:Z

    const-string v0, ""

    if-eqz p1, :cond_0

    .line 40
    iget-object p1, p2, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/᩵ᩴ᩻;->᩻:Ljava/lang/String;

    .line 41
    iget-object p1, p2, Ll/ܳᩴ᩻;->ܳ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/᩵ᩴ᩻;->ܿ:Ljava/lang/String;

    goto :goto_0

    .line 43
    :cond_0
    iget-object p1, p2, Ll/ܳᩴ᩻;->ۜ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/᩵ᩴ᩻;->᩻:Ljava/lang/String;

    .line 44
    iput-object v0, p0, Ll/᩵ᩴ᩻;->ܿ:Ljava/lang/String;

    .line 46
    :goto_0
    iget-object p1, p2, Ll/ܳᩴ᩻;->֫֫:Ljava/lang/String;

    iput-object p1, p0, Ll/᩵ᩴ᩻;->֫:Ljava/lang/String;

    .line 47
    iget p1, p2, Ll/ܳᩴ᩻;->ᩳ֫:I

    iput p1, p0, Ll/᩵ᩴ᩻;->ᩳ:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_1

    .line 49
    iget-object p1, p2, Ll/ܳᩴ᩻;->ܽ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/᩵ᩴ᩻;->ܽ:Ljava/lang/String;

    return-void

    .line 51
    :cond_1
    iput-object v0, p0, Ll/᩵ᩴ᩻;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(ILjava/lang/String;)Ll/ۖۘ᩻;
    .locals 2

    .line 67
    invoke-static {p0}, Ll/۫᩻᩻;->ᩳ(I)Ll/ۖۘ᩻;

    move-result-object p0

    if-nez p0, :cond_0

    .line 69
    invoke-static {p1}, Ll/۫᩻᩻;->ۧ(Ljava/lang/String;)Ll/ۖۘ᩻;

    move-result-object p0

    :cond_0
    if-nez p0, :cond_2

    const-string p0, "sshj://"

    .line 73
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x7

    .line 74
    invoke-virtual {p1, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 76
    :cond_1
    new-instance p0, Ll/᩵ۤۡ;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const p1, 0x7f1204c9

    invoke-static {p1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 76
    throw p0

    :cond_2
    return-object p0
.end method

.method public static ֫(ILl/ۗ᩻᩻;)Ll/᩵ᩴ᩻;
    .locals 1

    .line 26
    instance-of v0, p1, Ll/ܳᩴ᩻;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܳᩴ᩻;

    .line 27
    new-instance v0, Ll/᩵ᩴ᩻;

    invoke-direct {v0, p0, p1}, Ll/᩵ᩴ᩻;-><init>(ILl/ܳᩴ᩻;)V

    return-object v0

    .line 29
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 84
    const-class v2, Ll/᩵ᩴ᩻;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 86
    :cond_1
    check-cast p1, Ll/᩵ᩴ᩻;

    .line 87
    iget v2, p0, Ll/᩵ᩴ᩻;->ۢ:I

    iget v3, p1, Ll/᩵ᩴ᩻;->ۢ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/᩵ᩴ᩻;->ۜ:I

    iget v3, p1, Ll/᩵ᩴ᩻;->ۜ:I

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ll/᩵ᩴ᩻;->ܳ:Z

    iget-boolean v3, p1, Ll/᩵ᩴ᩻;->ܳ:Z

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/᩵ᩴ᩻;->ۧ:Ljava/lang/String;

    iget-object v3, p1, Ll/᩵ᩴ᩻;->ۧ:Ljava/lang/String;

    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩵ᩴ᩻;->᩷:Ljava/lang/String;

    iget-object v3, p1, Ll/᩵ᩴ᩻;->᩷:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩵ᩴ᩻;->᩻:Ljava/lang/String;

    iget-object v3, p1, Ll/᩵ᩴ᩻;->᩻:Ljava/lang/String;

    .line 89
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩵ᩴ᩻;->ܿ:Ljava/lang/String;

    iget-object v3, p1, Ll/᩵ᩴ᩻;->ܿ:Ljava/lang/String;

    .line 90
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩵ᩴ᩻;->֫:Ljava/lang/String;

    iget-object v3, p1, Ll/᩵ᩴ᩻;->֫:Ljava/lang/String;

    .line 91
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Ll/᩵ᩴ᩻;->ᩳ:I

    iget v3, p1, Ll/᩵ᩴ᩻;->ᩳ:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/᩵ᩴ᩻;->ܽ:Ljava/lang/String;

    iget-object p1, p1, Ll/᩵ᩴ᩻;->ܽ:Ljava/lang/String;

    .line 93
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 6

    .line 98
    iget v0, p0, Ll/᩵ᩴ᩻;->ۢ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/᩵ᩴ᩻;->ۜ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-boolean v2, p0, Ll/᩵ᩴ᩻;->ܳ:Z

    .line 99
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget v3, p0, Ll/᩵ᩴ᩻;->ᩳ:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v4, 0xa

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    iget-object v5, p0, Ll/᩵ᩴ᩻;->ۧ:Ljava/lang/String;

    aput-object v5, v4, v0

    const/4 v0, 0x2

    aput-object v1, v4, v0

    const/4 v0, 0x3

    iget-object v1, p0, Ll/᩵ᩴ᩻;->᩷:Ljava/lang/String;

    aput-object v1, v4, v0

    const/4 v0, 0x4

    iget-object v1, p0, Ll/᩵ᩴ᩻;->᩻:Ljava/lang/String;

    aput-object v1, v4, v0

    const/4 v0, 0x5

    iget-object v1, p0, Ll/᩵ᩴ᩻;->ܿ:Ljava/lang/String;

    aput-object v1, v4, v0

    const/4 v0, 0x6

    aput-object v2, v4, v0

    const/4 v0, 0x7

    iget-object v1, p0, Ll/᩵ᩴ᩻;->֫:Ljava/lang/String;

    aput-object v1, v4, v0

    const/16 v0, 0x8

    aput-object v3, v4, v0

    const/16 v0, 0x9

    iget-object v1, p0, Ll/᩵ᩴ᩻;->ܽ:Ljava/lang/String;

    aput-object v1, v4, v0

    .line 98
    invoke-static {v4}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
