.class public final Ll/ۛۡۧ;
.super Ljava/lang/Object;
.source "L8LA"

# interfaces
.implements Ll/ܳ᩵֫;


# instance fields
.field public final ֫:[B

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[BLjava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p2, p0, Ll/ۛۡۧ;->֫:[B

    .line 47
    iput-object p1, p0, Ll/ۛۡۧ;->ۧ:Ljava/lang/String;

    .line 48
    iput-object p3, p0, Ll/ۛۡۧ;->ܽ:Ljava/lang/String;

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

    .line 63
    const-class v0, Ll/ۛۡۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 66
    :cond_1
    check-cast p1, Ll/ۛۡۧ;

    .line 68
    iget-object v0, p0, Ll/ۛۡۧ;->֫:[B

    iget-object p1, p1, Ll/ۛۡۧ;->֫:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 74
    iget-object v0, p0, Ll/ۛۡۧ;->֫:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 79
    iget-object v0, p0, Ll/ۛۡۧ;->֫:[B

    array-length v0, v0

    const-string v1, "\", url=\""

    const-string v2, "\", rawMetadata.length=\""

    const-string v3, "ICY: title=\""

    .line 0
    iget-object v4, p0, Ll/ۛۡۧ;->ۧ:Ljava/lang/String;

    iget-object v5, p0, Ll/ۛۡۧ;->ܽ:Ljava/lang/String;

    invoke-static {v3, v4, v1, v5, v2}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\""

    invoke-static {v0, v2, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫()Ll/۠ᩴ֫;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Ll/ᩳ᩵֫;)V
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ۛۡۧ;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 54
    invoke-virtual {p1, v0}, Ll/ᩳ᩵֫;->᩷(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final synthetic ۧ()[B
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
