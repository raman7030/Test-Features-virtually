.class public final Ll/ۙۧۖ;
.super Ljava/lang/Object;
.source "S7O7"


# instance fields
.field public final ֫:Ll/ܰۤܺ;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܰۤܺ;Ljava/lang/String;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ll/ۙۧۖ;->֫:Ll/ܰۤܺ;

    const-string p1, "Null replacementString"

    .line 43
    invoke-static {p2, p1}, Ll/ۘܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ll/ۙۧۖ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(IILjava/lang/String;)Ll/ۙۧۖ;
    .locals 3

    const/4 v0, 0x0

    if-ltz p0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "startPosition must be non-negative"

    .line 33
    invoke-static {v2, v1}, Ll/ۘܶܺ;->֫(Ljava/lang/String;Z)V

    if-gt p0, p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    const-string v1, "startPosition cannot be after endPosition"

    .line 34
    invoke-static {v1, v0}, Ll/ۘܶܺ;->֫(Ljava/lang/String;Z)V

    .line 35
    new-instance v0, Ll/ۙۧۖ;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object p0

    invoke-direct {v0, p0, p2}, Ll/ۙۧۖ;-><init>(Ll/ܰۤܺ;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 65
    :cond_0
    instance-of v1, p1, Ll/ۙۧۖ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 66
    check-cast p1, Ll/ۙۧۖ;

    .line 67
    iget-object v1, p0, Ll/ۙۧۖ;->֫:Ll/ܰۤܺ;

    .line 50
    iget-object v3, p1, Ll/ۙۧۖ;->֫:Ll/ܰۤܺ;

    .line 67
    invoke-virtual {v1, v3}, Ll/ܰۤܺ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ۙۧۖ;->ۧ:Ljava/lang/String;

    .line 57
    iget-object p1, p1, Ll/ۙۧۖ;->ۧ:Ljava/lang/String;

    .line 68
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 75
    iget-object v2, p0, Ll/ۙۧۖ;->֫:Ll/ܰۤܺ;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ۙۧۖ;->ۧ:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ֫()Ll/ܰۤܺ;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ۙۧۖ;->֫:Ll/ܰۤܺ;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ۙۧۖ;->ۧ:Ljava/lang/String;

    return-object v0
.end method
