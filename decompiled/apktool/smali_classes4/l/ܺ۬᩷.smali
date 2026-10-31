.class public final synthetic Ll/ܺ۬᩷;
.super Ljava/lang/Object;
.source "VB8B"

# interfaces
.implements Ll/᩺᩵᩷;


# instance fields
.field public final synthetic ᩸:Ll/ܳۛ᩷;

.field public final synthetic ᩹:Ll/ۘ۬᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ܳۛ᩷;Ll/ۘ۬᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ۬᩷;->᩸:Ll/ܳۛ᩷;

    iput-object p2, p0, Ll/ܺ۬᩷;->᩹:Ll/ۘ۬᩷;

    return-void
.end method


# virtual methods
.method public final synthetic onCanceled()V
    .locals 0

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 229
    iget-object v0, p0, Ll/ܺ۬᩷;->᩸:Ll/ܳۛ᩷;

    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    check-cast v0, Ll/ܿۛ᩷;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    .line 17
    invoke-static {p1, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 18
    new-instance v1, Ll/ۖ۬᩷;

    iget-object v2, p0, Ll/ܺ۬᩷;->᩹:Ll/ۘ۬᩷;

    invoke-direct {v1, v0, p1, v2}, Ll/ۖ۬᩷;-><init>(Ll/ܿۛ᩷;Ll/ܶ᩵ܿ;Ll/ۘ۬᩷;)V

    .line 44
    invoke-virtual {v1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
