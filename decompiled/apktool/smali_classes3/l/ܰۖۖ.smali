.class public final Ll/ܰۖۖ;
.super Ljava/lang/Object;
.source "B9Q3"


# instance fields
.field public final ֫:Ll/ᩳۖۖ;

.field public final ۧ:I


# direct methods
.method public constructor <init>(Ll/ᩳۖۖ;I)V
    .locals 0

    .line 323
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 324
    iput-object p1, p0, Ll/ܰۖۖ;->֫:Ll/ᩳۖۖ;

    .line 325
    iput p2, p0, Ll/ܰۖۖ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 335
    instance-of v0, p1, Ll/ܰۖۖ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 338
    :cond_0
    check-cast p1, Ll/ܰۖۖ;

    .line 339
    iget-object v0, p0, Ll/ܰۖۖ;->֫:Ll/ᩳۖۖ;

    iget-object v2, p1, Ll/ܰۖۖ;->֫:Ll/ᩳۖۖ;

    if-ne v0, v2, :cond_1

    iget v0, p0, Ll/ܰۖۖ;->ۧ:I

    iget p1, p1, Ll/ܰۖۖ;->ۧ:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 330
    iget-object v0, p0, Ll/ܰۖۖ;->֫:Ll/ᩳۖۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xffff

    mul-int v0, v0, v1

    iget v1, p0, Ll/ܰۖۖ;->ۧ:I

    add-int/2addr v0, v1

    return v0
.end method
