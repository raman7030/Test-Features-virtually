.class public final Ll/ᩳ֫ۧ;
.super Ljava/lang/Object;
.source "88LY"


# instance fields
.field public ֫:Ll/ܿ֫ۧ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public final ֫(Ll/ܿ֫ۧ;)V
    .locals 1

    .line 972
    iget-object v0, p0, Ll/ᩳ֫ۧ;->֫:Ll/ܿ֫ۧ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 973
    iput-object p1, p0, Ll/ᩳ֫ۧ;->֫:Ll/ܿ֫ۧ;

    const/4 p1, 0x0

    .line 974
    throw p1
.end method

.method public final ۧ(Ll/ܿ֫ۧ;)V
    .locals 1

    .line 987
    iget-object v0, p0, Ll/ᩳ֫ۧ;->֫:Ll/ܿ֫ۧ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Z)V

    const/4 p1, 0x0

    .line 988
    iput-object p1, p0, Ll/ᩳ֫ۧ;->֫:Ll/ܿ֫ۧ;

    return-void
.end method
