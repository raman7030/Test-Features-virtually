.class public final Ll/ܽ᩻֫;
.super Ljava/lang/Object;
.source "J4LB"

# interfaces
.implements Ll/ܽ᩵;


# instance fields
.field public final synthetic ֫:Ll/ۡ᩻֫;


# direct methods
.method public constructor <init>(Ll/ۡ᩻֫;)V
    .locals 0

    .line 3551
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ᩻֫;->֫:Ll/ۡ᩻֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܶ᩵ܿ;)Ljava/lang/Object;
    .locals 2

    .line 3551
    check-cast p1, Ljava/lang/Void;

    .line 3554
    iget-object p1, p0, Ll/ܽ᩻֫;->֫:Ll/ۡ᩻֫;

    iget-object v0, p1, Ll/ۡ᩻֫;->mHost:Ll/ۙ᩻֫;

    instance-of v1, v0, Ll/֡ᩳ;

    if-eqz v1, :cond_0

    .line 3555
    check-cast v0, Ll/֡ᩳ;

    invoke-interface {v0}, Ll/֡ᩳ;->֫()Ll/᩵ᩳ;

    move-result-object p1

    return-object p1

    .line 3557
    :cond_0
    invoke-virtual {p1}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩻ܽ;->֫()Ll/᩵ᩳ;

    move-result-object p1

    return-object p1
.end method
