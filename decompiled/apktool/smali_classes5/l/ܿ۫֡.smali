.class public Ll/ܿ۫֡;
.super Ll/ᩳ۫֡;
.source "U58U"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ll/ᩳ۫֡;-><init>()V

    return-void
.end method


# virtual methods
.method public final ܳ()Ll/ܺ۫֡;
    .locals 2

    .line 51
    iget-object v0, p0, Ll/ᩳ۫֡;->᩸:Ll/ܺ۫֡;

    if-eqz v0, :cond_0

    return-object v0

    .line 52
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot get the location of a label that hasn\'t been placed yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 46
    invoke-virtual {p0}, Ll/ܿ۫֡;->ܳ()Ll/ܺ۫֡;

    move-result-object v0

    .line 80
    iget v0, v0, Ll/ܺ۫֡;->֫:I

    return v0
.end method
