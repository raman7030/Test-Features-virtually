.class public final Ll/ᩳܿۖ;
.super Ljava/util/AbstractSet;
.source "1AZL"


# instance fields
.field public final synthetic ᩸:Ll/᩻ܿۖ;


# direct methods
.method public constructor <init>(Ll/᩻ܿۖ;)V
    .locals 0

    .line 641
    iput-object p1, p0, Ll/ᩳܿۖ;->᩸:Ll/᩻ܿۖ;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 669
    iget-object v0, p0, Ll/ᩳܿۖ;->᩸:Ll/᩻ܿۖ;

    invoke-virtual {v0}, Ll/᩻ܿۖ;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 659
    iget-object v0, p0, Ll/ᩳܿۖ;->᩸:Ll/᩻ܿۖ;

    invoke-virtual {v0, p1}, Ll/᩻ܿۖ;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 649
    new-instance v0, Ll/ܽܿۖ;

    iget-object v1, p0, Ll/ᩳܿۖ;->᩸:Ll/᩻ܿۖ;

    invoke-direct {v0, v1}, Ll/ܿܿۖ;-><init>(Ll/᩻ܿۖ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    .line 216
    iget-object v1, p0, Ll/ᩳܿۖ;->᩸:Ll/᩻ܿۖ;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {v1, p1, v0}, Ll/᩻ܿۖ;->֫(Ljava/lang/Object;Z)Ll/ܳܿۖ;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    const/4 p1, 0x1

    if-eqz v2, :cond_1

    .line 307
    invoke-virtual {v1, v2, p1}, Ll/᩻ܿۖ;->֫(Ll/ܳܿۖ;Z)V

    :cond_1
    if-eqz v2, :cond_2

    return p1

    :cond_2
    return v0
.end method

.method public final size()I
    .locals 1

    .line 644
    iget-object v0, p0, Ll/ᩳܿۖ;->᩸:Ll/᩻ܿۖ;

    iget v0, v0, Ll/᩻ܿۖ;->ۤ:I

    return v0
.end method
