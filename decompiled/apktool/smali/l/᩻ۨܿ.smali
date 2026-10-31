.class public final Ll/᩻ۨܿ;
.super Ljava/lang/Object;
.source "B55V"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 401
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 409
    const-class v1, Ll/᩻ۨܿ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 411
    :cond_1
    check-cast p1, Ll/᩻ۨܿ;

    .line 413
    iget-object v1, p0, Ll/᩻ۨܿ;->ܽ:Ljava/lang/String;

    iget-object v2, p1, Ll/᩻ۨܿ;->ܽ:Ljava/lang/String;

    invoke-static {v1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    .line 415
    :cond_2
    iget-object v0, p0, Ll/᩻ۨܿ;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/᩻ۨܿ;->֫:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 420
    iget-object v0, p0, Ll/᩻ۨܿ;->ܽ:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 421
    iget-object v2, p0, Ll/᩻ۨܿ;->֫:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method
