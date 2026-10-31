.class public final Ll/۫ۧܺ;
.super Ll/᩻ܽܺ;
.source "8BG9"


# instance fields
.field public final ۧ:Ll/ۡܽܺ;


# direct methods
.method public constructor <init>(Ll/ۡܽܺ;)V
    .locals 2

    const-string v0, "InnerClasses"

    .line 41
    invoke-direct {p0, v0}, Ll/᩻ܽܺ;-><init>(Ljava/lang/String;)V

    .line 44
    :try_start_0
    invoke-virtual {p1}, Ll/ᩴᩴܺ;->ۧ()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    .line 52
    iput-object p1, p0, Ll/۫ۧܺ;->ۧ:Ll/ۡܽܺ;

    return-void

    .line 45
    :cond_0
    :try_start_1
    new-instance p1, Ll/᩵ᩴܺ;

    const-string v0, "innerClasses.isMutable()"

    const/4 v1, 0x0

    .line 60
    invoke-direct {p1, v0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 45
    throw p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 49
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "innerClasses == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 60
    iget-object v0, p0, Ll/۫ۧܺ;->ۧ:Ll/ۡܽܺ;

    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public final ۧ()Ll/ۡܽܺ;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/۫ۧܺ;->ۧ:Ll/ۡܽܺ;

    return-object v0
.end method
