.class public final Ll/᩸ۤ᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ll/ۛۛ᩷;


# instance fields
.field public final synthetic ᩸:Ll/᩹ۤ᩷;


# direct methods
.method public constructor <init>(Ll/᩹ۤ᩷;)V
    .locals 0

    .line 680
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۤ᩷;->᩸:Ll/᩹ۤ᩷;

    return-void
.end method


# virtual methods
.method public final ֡()V
    .locals 0

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    return-void
.end method

.method public final ۢ(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final ܰ()V
    .locals 0

    return-void
.end method

.method public final ᩻()Z
    .locals 2

    .line 703
    iget-object v0, p0, Ll/᩸ۤ᩷;->᩸:Ll/᩹ۤ᩷;

    iget-object v1, v0, Ll/᩹ۤ᩷;->ܳ:Ll/ܿۛ᩷;

    invoke-static {v1}, Ll/ܿۛ᩷;->֡(Ll/ܿۛ᩷;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, v0, Ll/᩹ۤ᩷;->᩻:Ll/۟ۢ֫;

    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v1, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
