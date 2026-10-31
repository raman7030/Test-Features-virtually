.class public final Ll/۠᩶᩵;
.super Ll/ۚ᩶᩵;
.source "JAJQ"


# static fields
.field public static final synthetic ᩶:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 47
    new-instance v0, Ll/۠᩶᩵;

    .line 15
    invoke-direct {v0}, Ll/ۚ᩶᩵;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 37
    instance-of v0, p1, Ll/۠᩶᩵;

    if-eqz v0, :cond_4

    .line 34
    invoke-virtual {p0}, Ll/ۚ᩶᩵;->getLast()C

    move-result v0

    const/4 v1, 0x1

    if-ge v1, v0, :cond_0

    goto :goto_0

    :cond_0
    if-ne v1, v0, :cond_1

    goto :goto_0

    .line 37
    :cond_1
    move-object v0, p1

    check-cast v0, Ll/۠᩶᩵;

    .line 34
    invoke-virtual {v0}, Ll/ۚ᩶᩵;->getLast()C

    move-result v0

    if-ge v1, v0, :cond_2

    goto :goto_0

    :cond_2
    if-ne v1, v0, :cond_3

    .line 38
    :goto_0
    check-cast p1, Ll/۠᩶᩵;

    invoke-virtual {p0}, Ll/ۚ᩶᩵;->getLast()C

    move-result v0

    invoke-virtual {p1}, Ll/ۚ᩶᩵;->getLast()C

    move-result p1

    if-ne v0, p1, :cond_4

    :cond_3
    return v1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 34
    invoke-virtual {p0}, Ll/ۚ᩶᩵;->getLast()C

    move-result v0

    const/4 v1, 0x1

    if-ge v1, v0, :cond_0

    goto :goto_0

    :cond_0
    if-ne v1, v0, :cond_1

    .line 41
    :goto_0
    invoke-virtual {p0}, Ll/ۚ᩶᩵;->getLast()C

    move-result v0

    add-int/lit8 v0, v0, 0x1f

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u0001.."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۚ᩶᩵;->getLast()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
