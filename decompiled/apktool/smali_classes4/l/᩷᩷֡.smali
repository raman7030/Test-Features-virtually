.class public final Ll/᩷᩷֡;
.super Ljava/lang/Object;
.source "367O"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final ᩸:Ljava/lang/Object;

.field public final ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ll/᩷᩷֡;->᩸:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, Ll/᩷᩷֡;->᩹:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 25
    :cond_0
    instance-of v1, p1, Ll/᩷᩷֡;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 29
    :cond_1
    check-cast p1, Ll/᩷᩷֡;

    .line 30
    iget-object v1, p1, Ll/᩷᩷֡;->᩸:Ljava/lang/Object;

    .line 43
    iget-object v3, p0, Ll/᩷᩷֡;->᩸:Ljava/lang/Object;

    if-nez v3, :cond_3

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    goto :goto_0

    .line 47
    :cond_3
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_6

    .line 30
    iget-object p1, p1, Ll/᩷᩷֡;->᩹:Ljava/lang/Object;

    .line 43
    iget-object v1, p0, Ll/᩷᩷֡;->᩹:Ljava/lang/Object;

    if-nez v1, :cond_5

    if-nez p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    goto :goto_1

    .line 47
    :cond_5
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    :goto_1
    if-eqz p1, :cond_6

    return v0

    :cond_6
    return v2
.end method

.method public final hashCode()I
    .locals 2

    const/4 v0, 0x0

    .line 37
    iget-object v1, p0, Ll/᩷᩷֡;->᩸:Ljava/lang/Object;

    invoke-static {v0, v1}, Ll/֫᩸ۡ;->֫(ILjava/lang/Object;)I

    move-result v0

    .line 38
    iget-object v1, p0, Ll/᩷᩷֡;->᩹:Ljava/lang/Object;

    invoke-static {v0, v1}, Ll/֫᩸ۡ;->֫(ILjava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    .line 39
    invoke-static {v0, v1}, Ll/֫᩸ۡ;->֫(II)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 44
    iget-object v2, p0, Ll/᩷᩷֡;->᩸:Ljava/lang/Object;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/᩷᩷֡;->᩹:Ljava/lang/Object;

    aput-object v2, v0, v1

    const-string v1, "(%s, %s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
