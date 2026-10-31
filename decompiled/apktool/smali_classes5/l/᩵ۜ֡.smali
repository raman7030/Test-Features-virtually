.class public final Ll/᩵ۜ֡;
.super Ll/ۚۜ֡;
.source "HAT6"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 133
    invoke-direct {p0}, Ll/ۚۜ֡;-><init>()V

    const/4 v0, 0x0

    .line 134
    iput v0, p0, Ll/᩵ۜ֡;->᩸:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 137
    invoke-direct {p0}, Ll/ۚۜ֡;-><init>()V

    .line 138
    iput p1, p0, Ll/᩵ۜ֡;->᩸:I

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 130
    check-cast p1, Ll/᩵ۜ֡;

    .line 158
    iget v0, p0, Ll/᩵ۜ֡;->᩸:I

    iget p1, p1, Ll/᩵ۜ֡;->᩸:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 170
    instance-of v0, p1, Ll/᩵ۜ֡;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    .line 178
    :cond_1
    check-cast p1, Ll/᩵ۜ֡;

    .line 179
    iget v2, p0, Ll/᩵ۜ֡;->᩸:I

    iget p1, p1, Ll/᩵ۜ֡;->᩸:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 164
    iget v0, p0, Ll/᩵ۜ֡;->᩸:I

    add-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩵ۜ֡;->᩸:I

    const-string v2, ">=prec}?"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Z
    .locals 0

    .line 143
    iget p2, p0, Ll/᩵ۜ֡;->᩸:I

    invoke-virtual {p1, p2}, Ll/ᩴܳ֡;->֫(I)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Ll/ۚۜ֡;
    .locals 0

    .line 148
    iget p2, p0, Ll/᩵ۜ֡;->᩸:I

    invoke-virtual {p1, p2}, Ll/ᩴܳ֡;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 149
    sget-object p1, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
