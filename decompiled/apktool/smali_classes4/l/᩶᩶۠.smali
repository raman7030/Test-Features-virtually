.class public final synthetic Ll/᩶᩶۠;
.super Ljava/lang/Object;
.source "79RF"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/۬᩶۠;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/۬᩶۠;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶᩶۠;->᩸:Ll/۬᩶۠;

    iput p2, p0, Ll/᩶᩶۠;->᩹:I

    iput p3, p0, Ll/᩶᩶۠;->᩶:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 420
    iget-object v0, p0, Ll/᩶᩶۠;->᩸:Ll/۬᩶۠;

    invoke-static {v0}, Ll/۬᩶۠;->֫(Ll/۬᩶۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ᩶۠;

    iget v1, p0, Ll/᩶᩶۠;->᩹:I

    iget v2, p0, Ll/᩶᩶۠;->᩶:I

    invoke-interface {v0, v1, v2}, Ll/ۛ᩶۠;->֫(II)V

    return-void
.end method
