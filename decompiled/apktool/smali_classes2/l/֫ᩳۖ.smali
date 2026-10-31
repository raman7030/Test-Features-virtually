.class public final Ll/֫ᩳۖ;
.super Ll/᩺ܽۖ;
.source "TAZQ"


# instance fields
.field public final ֫:Ll/᩻ܿۖ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 45
    invoke-direct {p0}, Ll/᩺ܽۖ;-><init>()V

    .line 41
    new-instance v0, Ll/᩻ܿۖ;

    const/4 v1, 0x0

    .line 79
    invoke-direct {v0, v1}, Ll/᩻ܿۖ;-><init>(Z)V

    .line 41
    iput-object v0, p0, Ll/֫ᩳۖ;->֫:Ll/᩻ܿۖ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    .line 248
    instance-of v0, p1, Ll/֫ᩳۖ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/֫ᩳۖ;

    iget-object p1, p1, Ll/֫ᩳۖ;->֫:Ll/᩻ܿۖ;

    iget-object v0, p0, Ll/֫ᩳۖ;->֫:Ll/᩻ܿۖ;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 257
    iget-object v0, p0, Ll/֫ᩳۖ;->֫:Ll/᩻ܿۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ᩳᩳۖ;
    .locals 1

    .line 199
    iget-object v0, p0, Ll/֫ᩳۖ;->֫:Ll/᩻ܿۖ;

    invoke-virtual {v0, p1}, Ll/᩻ܿۖ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳᩳۖ;

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ll/᩺ܽۖ;)V
    .locals 1

    if-nez p2, :cond_0

    .line 70
    sget-object p2, Ll/۟ܽۖ;->֫:Ll/۟ܽۖ;

    :cond_0
    iget-object v0, p0, Ll/֫ᩳۖ;->֫:Ll/᩻ܿۖ;

    invoke-virtual {v0, p1, p2}, Ll/᩻ܿۖ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ᩳ()Ljava/util/Set;
    .locals 1

    .line 137
    iget-object v0, p0, Ll/֫ᩳۖ;->֫:Ll/᩻ܿۖ;

    invoke-virtual {v0}, Ll/᩻ܿۖ;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
