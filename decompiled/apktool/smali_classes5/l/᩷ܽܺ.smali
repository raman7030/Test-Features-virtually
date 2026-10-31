.class public abstract Ll/᩷ܽܺ;
.super Ll/᩻ܽܺ;
.source "RBH6"


# instance fields
.field public final ۧ:I

.field public final ܽ:Ll/ܰۢܺ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ܰۢܺ;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Ll/᩻ܽܺ;-><init>(Ljava/lang/String;)V

    .line 50
    :try_start_0
    invoke-virtual {p2}, Ll/ᩴᩴܺ;->ۧ()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    .line 59
    iput-object p2, p0, Ll/᩷ܽܺ;->ܽ:Ll/ܰۢܺ;

    .line 60
    iput p3, p0, Ll/᩷ܽܺ;->ۧ:I

    return-void

    .line 51
    :cond_0
    :try_start_1
    new-instance p1, Ll/᩵ᩴܺ;

    const-string p2, "parameterAnnotations.isMutable()"

    const/4 p3, 0x0

    .line 60
    invoke-direct {p1, p2, p3}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 51
    throw p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 56
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "parameterAnnotations == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 69
    iget v0, p0, Ll/᩷ܽܺ;->ۧ:I

    add-int/lit8 v0, v0, 0x6

    return v0
.end method

.method public final ۧ()Ll/ܰۢܺ;
    .locals 1

    .line 78
    iget-object v0, p0, Ll/᩷ܽܺ;->ܽ:Ll/ܰۢܺ;

    return-object v0
.end method
