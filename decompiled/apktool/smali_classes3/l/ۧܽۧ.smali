.class public final Ll/ۧܽۧ;
.super Ljava/lang/Object;
.source "L8S9"


# instance fields
.field public final ֫:I

.field public final ۧ:Z


# direct methods
.method public constructor <init>(IZ)V
    .locals 0

    .line 1228
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1229
    iput p1, p0, Ll/ۧܽۧ;->֫:I

    .line 1230
    iput-boolean p2, p0, Ll/ۧܽۧ;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    .line 1238
    const-class v0, Ll/ۧܽۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    .line 1241
    :cond_1
    check-cast p1, Ll/ۧܽۧ;

    .line 1242
    iget v0, p0, Ll/ۧܽۧ;->֫:I

    iget v1, p1, Ll/ۧܽۧ;->֫:I

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Ll/ۧܽۧ;->ۧ:Z

    iget-boolean p1, p1, Ll/ۧܽۧ;->ۧ:Z

    if-ne v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1247
    iget v0, p0, Ll/ۧܽۧ;->֫:I

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ll/ۧܽۧ;->ۧ:Z

    add-int/2addr v0, v1

    return v0
.end method
