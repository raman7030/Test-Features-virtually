.class public final Ll/۬۟ᩳ;
.super Ljava/lang/Object;
.source "X4TD"


# instance fields
.field public ֫:I

.field public ۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 6
    new-instance v0, Ll/۬۟ᩳ;

    invoke-direct {v0}, Ll/۬۟ᩳ;-><init>()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
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

    .line 14
    const-class v2, Ll/۬۟ᩳ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 15
    :cond_1
    check-cast p1, Ll/۬۟ᩳ;

    .line 16
    iget v2, p0, Ll/۬۟ᩳ;->ۧ:I

    iget v3, p1, Ll/۬۟ᩳ;->ۧ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/۬۟ᩳ;->֫:I

    iget p1, p1, Ll/۬۟ᩳ;->֫:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 21
    iget v0, p0, Ll/۬۟ᩳ;->ۧ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/۬۟ᩳ;->֫:I

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
