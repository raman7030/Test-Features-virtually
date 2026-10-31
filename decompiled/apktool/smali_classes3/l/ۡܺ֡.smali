.class public final Ll/ۡܺ֡;
.super Ljava/lang/Number;
.source "IPI"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final serialVersionUID:J = 0x77401786b8L


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Number;-><init>()V

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 29
    check-cast p1, Ll/ۡܺ֡;

    .line 368
    iget v0, p0, Ll/ۡܺ֡;->᩸:I

    iget p1, p1, Ll/ۡܺ֡;->᩸:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-ge v0, p1, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final doubleValue()D
    .locals 2

    .line 319
    iget v0, p0, Ll/ۡܺ֡;->᩸:I

    int-to-double v0, v0

    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 343
    instance-of v0, p1, Ll/ۡܺ֡;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 344
    iget v0, p0, Ll/ۡܺ֡;->᩸:I

    check-cast p1, Ll/ۡܺ֡;

    .line 289
    iget p1, p1, Ll/ۡܺ֡;->᩸:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final floatValue()F
    .locals 1

    .line 309
    iget v0, p0, Ll/ۡܺ֡;->᩸:I

    int-to-float v0, v0

    return v0
.end method

.method public final getValue()Ljava/lang/Integer;
    .locals 1

    .line 89
    iget v0, p0, Ll/ۡܺ֡;->᩸:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 356
    iget v0, p0, Ll/ۡܺ֡;->᩸:I

    return v0
.end method

.method public final intValue()I
    .locals 1

    .line 289
    iget v0, p0, Ll/ۡܺ֡;->᩸:I

    return v0
.end method

.method public final longValue()J
    .locals 2

    .line 299
    iget v0, p0, Ll/ۡܺ֡;->᩸:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 379
    iget v0, p0, Ll/ۡܺ֡;->᩸:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 98
    iput p1, p0, Ll/ۡܺ֡;->᩸:I

    return-void
.end method
