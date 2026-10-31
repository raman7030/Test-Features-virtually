.class public final Ll/ܽ֫ۖ;
.super Ll/ᩳ֫ۖ;
.source "17MV"


# instance fields
.field public final ᩶:Ll/ܶ۟ܺ;


# direct methods
.method public constructor <init>(Ll/ܶ۟ܺ;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ll/ܿۧۖ;-><init>()V

    .line 86
    iput-object p1, p0, Ll/ܽ֫ۖ;->᩶:Ll/ܶ۟ܺ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 101
    instance-of v0, p1, Ll/ܿۧۖ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 102
    check-cast p1, Ll/ܿۧۖ;

    .line 117
    sget-object v0, Ll/ᩳۧۖ;->᩶:Ll/ᩳۧۖ;

    .line 103
    invoke-virtual {p1}, Ll/ܿۧۖ;->ۧ()Ll/ᩳۧۖ;

    move-result-object v2

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Ll/ܽ֫ۖ;->᩶:Ll/ܶ۟ܺ;

    .line 104
    invoke-virtual {p1}, Ll/ܿۧۖ;->ܿ()Ll/ܶ۟ܺ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 112
    iget-object v0, p0, Ll/ܽ֫ۖ;->᩶:Ll/ܶ۟ܺ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AnnotationOrModifier{modifier="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܽ֫ۖ;->᩶:Ll/ܶ۟ܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/ᩳۧۖ;
    .locals 1

    .line 117
    sget-object v0, Ll/ᩳۧۖ;->᩶:Ll/ᩳۧۖ;

    return-object v0
.end method

.method public final ܿ()Ll/ܶ۟ܺ;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ܽ֫ۖ;->᩶:Ll/ܶ۟ܺ;

    return-object v0
.end method
