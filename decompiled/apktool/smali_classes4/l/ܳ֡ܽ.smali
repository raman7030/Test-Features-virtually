.class public final synthetic Ll/ܳ֡ܽ;
.super Ljava/lang/Object;
.source "Z6QT"

# interfaces
.implements Ll/ۧۚܽ;


# instance fields
.field public final synthetic ֫:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳ֡ܽ;->֫:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final negate()Ll/۟᩵ܽ;
    .locals 1

    .line 2395
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2374
    invoke-static {p0}, Ll/۟᩵ܽ;->ܽ(Ll/ۧۚܽ;)Ll/۟᩵ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚܽ;->֫(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)Z
    .locals 3

    .line 0
    iget v0, p0, Ll/ܳ֡ܽ;->֫:I

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    const v0, 0xfffe

    and-int v2, p1, v0

    if-eq v2, v0, :cond_1

    const v0, 0xfdd0

    if-lt p1, v0, :cond_0

    const v0, 0xfdef

    if-gt p1, v0, :cond_0

    goto :goto_0

    :pswitch_0
    sget-object p1, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    return v1

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚܽ;->ۧ(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method
