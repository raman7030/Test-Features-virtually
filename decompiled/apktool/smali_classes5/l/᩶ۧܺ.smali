.class public final Ll/᩶ۧܺ;
.super Ll/᩻ܽܺ;
.source "OBBJ"


# instance fields
.field public final ۧ:Ll/ۛܺܺ;


# direct methods
.method public constructor <init>(Ll/ۛܺܺ;)V
    .locals 1

    const-string v0, "ConstantValue"

    .line 49
    invoke-direct {p0, v0}, Ll/᩻ܽܺ;-><init>(Ljava/lang/String;)V

    .line 51
    instance-of v0, p1, Ll/۬ܺܺ;

    if-nez v0, :cond_1

    instance-of v0, p1, Ll/ۖܺܺ;

    if-nez v0, :cond_1

    instance-of v0, p1, Ll/۠ܺܺ;

    if-nez v0, :cond_1

    instance-of v0, p1, Ll/ܺܺܺ;

    if-nez v0, :cond_1

    instance-of v0, p1, Ll/᩷ܺܺ;

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    .line 57
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "constantValue == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 59
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bad type for constantValue"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 62
    :cond_1
    iput-object p1, p0, Ll/᩶ۧܺ;->ۧ:Ll/ۛܺܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public final ۧ()Ll/ۛܺܺ;
    .locals 1

    .line 82
    iget-object v0, p0, Ll/᩶ۧܺ;->ۧ:Ll/ۛܺܺ;

    return-object v0
.end method
