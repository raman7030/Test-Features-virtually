.class public final Ll/ۤ᩵֡;
.super Ljava/lang/Object;
.source "18YS"


# instance fields
.field public ֫:I

.field public ۧ:C


# direct methods
.method public constructor <init>(CI)V
    .locals 0

    .line 1069
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1070
    iput-char p1, p0, Ll/ۤ᩵֡;->ۧ:C

    .line 1071
    iput p2, p0, Ll/ۤ᩵֡;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1076
    instance-of v0, p1, Ll/ۤ᩵֡;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 1077
    :cond_0
    check-cast p1, Ll/ۤ᩵֡;

    .line 1078
    iget-char v0, p0, Ll/ۤ᩵֡;->ۧ:C

    iget-char v2, p1, Ll/ۤ᩵֡;->ۧ:C

    if-ne v0, v2, :cond_1

    iget v0, p0, Ll/ۤ᩵֡;->֫:I

    iget p1, p1, Ll/ۤ᩵֡;->֫:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 1083
    iget-char v0, p0, Ll/ۤ᩵֡;->ۧ:C

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    iget v1, p0, Ll/ۤ᩵֡;->֫:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
