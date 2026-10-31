.class public final Ll/ܳܽܽ;
.super Ljava/lang/Object;
.source "PAML"


# instance fields
.field public final ֫:Ll/ۚ֫ܽ;


# direct methods
.method public constructor <init>(Landroid/graphics/Rect;)V
    .locals 1

    .line 39
    new-instance v0, Ll/ۚ֫ܽ;

    invoke-direct {v0, p1}, Ll/ۚ֫ܽ;-><init>(Landroid/graphics/Rect;)V

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ܳܽܽ;->֫:Ll/ۚ֫ܽ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 61
    const-class v0, Ll/ܳܽܽ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 62
    :cond_1
    check-cast p1, Ll/ܳܽܽ;

    .line 63
    iget-object v0, p0, Ll/ܳܽܽ;->֫:Ll/ۚ֫ܽ;

    iget-object p1, p1, Ll/ܳܽܽ;->֫:Ll/ۚ֫ܽ;

    invoke-static {v0, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ܳܽܽ;->֫:Ll/ۚ֫ܽ;

    invoke-virtual {v0}, Ll/ۚ֫ܽ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "WindowMetrics { bounds: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    iget-object v1, p0, Ll/ܳܽܽ;->֫:Ll/ۚ֫ܽ;

    invoke-virtual {v1}, Ll/ۚ֫ܽ;->ܿ()Landroid/graphics/Rect;

    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Landroid/graphics/Rect;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ܳܽܽ;->֫:Ll/ۚ֫ܽ;

    invoke-virtual {v0}, Ll/ۚ֫ܽ;->ܿ()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method
