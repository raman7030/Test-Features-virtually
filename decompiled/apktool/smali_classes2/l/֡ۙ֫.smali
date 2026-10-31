.class public final Ll/֡ۙ֫;
.super Ljava/lang/Object;
.source "V8T2"

# interfaces
.implements Ll/۟ۗ֫;


# instance fields
.field public final synthetic ֫:Ll/᩶ۙ֫;


# direct methods
.method public constructor <init>(Ll/᩶ۙ֫;)V
    .locals 0

    .line 3264
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۙ֫;->֫:Ll/᩶ۙ֫;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 3267
    iget-object v0, p0, Ll/֡ۙ֫;->֫:Ll/᩶ۙ֫;

    invoke-static {v0}, Ll/᩶ۙ֫;->ܽ(Ll/᩶ۙ֫;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 3272
    iget-object v0, p0, Ll/֡ۙ֫;->֫:Ll/᩶ۙ֫;

    invoke-static {v0}, Ll/᩶ۙ֫;->ᩳ(Ll/᩶ۙ֫;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/᩶ۙ֫;->ۧ(Ll/᩶ۙ֫;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 3273
    :cond_1
    :goto_0
    invoke-static {v0}, Ll/᩶ۙ֫;->֫(Ll/᩶ۙ֫;)Ll/᩵ۚ֫;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Ll/᩵ۚ֫;->ۧ(I)Z

    return-void
.end method
